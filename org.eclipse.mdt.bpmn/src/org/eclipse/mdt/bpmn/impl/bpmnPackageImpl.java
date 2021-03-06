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

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.mdt.bpmn.BpmnFactory;
import org.eclipse.mdt.bpmn.BpmnPackage;

import org.eclipse.mdt.bpmn.di.DIPackage;

import org.eclipse.mdt.bpmn.di.impl.DIPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnPackageImpl extends EPackageImpl implements BpmnPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected String packageFilename = "bpmn.ecore"; //$NON-NLS-1$

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
    private EClass activityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass activityResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass adHocSubProcessEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass artifactEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assignmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass associationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass auditingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass baseElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass baseElementWithMixedContentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boundaryEventEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass businessRuleTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass callableElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass callActivityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass callChoreographyActivityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass callConversationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass cancelEventDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass catchEventEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass categoryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass categoryValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass choreographyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass choreographyActivityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass choreographySubProcessEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass choreographyTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass collaborationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass communicationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass compensateEventDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass complexBehaviorDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass complexGatewayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conditionalEventDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conversationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conversationAssociationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass conversationNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass correlationKeyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass correlationPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass correlationPropertyBindingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass correlationPropertyRetrievalExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass correlationSubscriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataAssociationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataInputEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataInputAssociationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataObjectEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataOutputEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataOutputAssociationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataStoreEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass dataStoreReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass definitionsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass documentationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass endEventEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass endPointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass errorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass errorEventDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass escalationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass escalationEventDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventBasedGatewayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eventDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass exclusiveGatewayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass expressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass extensionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass flowNodeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass formalExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass gatewayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass globalBusinessRuleTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass globalChoreographyTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass globalCommunicationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass globalManualTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass globalScriptTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass globalTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass globalUserTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass groupEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass humanPerformerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass implicitThrowEventEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass importEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inclusiveGatewayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputOutputBindingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputOutputSpecificationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass inputSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intermediateCatchEventEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass intermediateThrowEventEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass itemDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass laneEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass laneSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linkEventDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass loopCharacteristicsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass manualTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass messageEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass messageEventDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass messageFlowEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass messageFlowAssociationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass monitoringEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass multiInstanceLoopCharacteristicsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass outputSetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parallelGatewayEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass participantEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass participantAssociationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass participantMultiplicityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass partnerEntityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass partnerRoleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass performerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass potentialOwnerEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass receiveTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relationshipEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass renderingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceAssignmentExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceParameterBindingEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rootElementEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass scriptTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sendTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sequenceFlowEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass signalEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass signalEventDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass standardLoopCharacteristicsEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass startEventEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subConversationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass subProcessEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass taskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass terminateEventDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass textEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass textAnnotationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass throwEventEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass timerEventDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transactionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass userTaskEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum adHocOrderingEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum associationDirectionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eventBasedGatewayTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum gatewayDirectionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum itemKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum multiInstanceFlowConditionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum processTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum relationshipDirectionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum serviceImplementationEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum transactionMethodEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum userTaskImplementationEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType adHocOrderingObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType associationDirectionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType eventBasedGatewayTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType gatewayDirectionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType itemKindObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType multiInstanceFlowConditionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType processTypeObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType relationshipDirectionObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType serviceImplementationObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType transactionMethodObjectEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType userTaskImplementationObjectEDataType = null;

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
     * @see org.eclipse.mdt.bpmn.BpmnPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private BpmnPackageImpl() {
        super(eNS_URI, BpmnFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link BpmnPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @generated
     */
    public static BpmnPackage init() {
        if (isInited)
            return (BpmnPackage) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI);

        // Obtain or create and register package
        BpmnPackageImpl theBpmnPackage = (BpmnPackageImpl) (EPackage.Registry.INSTANCE
                .get(eNS_URI) instanceof BpmnPackageImpl ? EPackage.Registry.INSTANCE
                .get(eNS_URI)
                : new BpmnPackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        DIPackageImpl theDIPackage = (DIPackageImpl) (EPackage.Registry.INSTANCE
                .getEPackage(DIPackage.eNS_URI) instanceof DIPackageImpl ? EPackage.Registry.INSTANCE
                .getEPackage(DIPackage.eNS_URI)
                : DIPackage.eINSTANCE);

        // Load packages
        theBpmnPackage.loadPackage();

        // Create package meta-data objects
        theDIPackage.createPackageContents();

        // Initialize created meta-data
        theDIPackage.initializePackageContents();

        // Fix loaded packages
        theBpmnPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theBpmnPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(BpmnPackage.eNS_URI, theBpmnPackage);
        return theBpmnPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentRoot() {
        if (documentRootEClass == null) {
            documentRootEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(0);
        }
        return documentRootEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute) getDocumentRoot().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Activity() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ActivityResource() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_AdHocSubProcess() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_FlowElement() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Artifact() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Assignment() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Association() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Auditing() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BaseElement() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BaseElementWithMixedContent() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(12);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BoundaryEvent() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(13);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_BusinessRuleTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(14);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CallableElement() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(15);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CallActivity() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(16);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CallChoreographyActivity() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(17);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CallConversation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(18);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ConversationNode() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(19);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CancelEventDefinition() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(20);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EventDefinition() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(21);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_RootElement() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(22);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CatchEvent() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(23);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Category() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(24);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CategoryValue() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(25);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Choreography() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(26);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ChoreographyActivity() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(27);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ChoreographySubProcess() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(28);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ChoreographyTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(29);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Collaboration() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(30);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Communication() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(31);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CompensateEventDefinition() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(32);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ComplexBehaviorDefinition() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(33);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ComplexGateway() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(34);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ConditionalEventDefinition() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(35);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Conversation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(36);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ConversationAssociation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(37);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CorrelationKey() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(38);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CorrelationProperty() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(39);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CorrelationPropertyBinding() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(40);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CorrelationPropertyRetrievalExpression() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(41);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_CorrelationSubscription() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(42);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DataAssociation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(43);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DataInput() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(44);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DataInputAssociation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(45);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DataObject() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(46);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DataOutput() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(47);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DataOutputAssociation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(48);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DataState() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(49);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DataStore() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(50);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_DataStoreReference() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(51);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Definitions() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(52);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Documentation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(53);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EndEvent() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(54);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EndPoint() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(55);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Error() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(56);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ErrorEventDefinition() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(57);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Escalation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(58);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EscalationEventDefinition() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(59);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Event() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(60);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_EventBasedGateway() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(61);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ExclusiveGateway() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(62);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Expression() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(63);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Extension() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(64);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_FlowNode() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(65);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_FormalExpression() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(66);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Gateway() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(67);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_GlobalBusinessRuleTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(68);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_GlobalChoreographyTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(69);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_GlobalCommunication() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(70);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_GlobalManualTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(71);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_GlobalScriptTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(72);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_GlobalTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(73);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_GlobalUserTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(74);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Group() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(75);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_HumanPerformer() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(76);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Performer() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(77);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ImplicitThrowEvent() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(78);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Import() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(79);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_InclusiveGateway() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(80);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_InputSet() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(81);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Interface() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(82);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_IntermediateCatchEvent() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(83);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_IntermediateThrowEvent() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(84);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_IoBinding() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(85);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_IoSpecification() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(86);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ItemDefinition() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(87);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Lane() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(88);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_LaneSet() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(89);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_LinkEventDefinition() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(90);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_LoopCharacteristics() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(91);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ManualTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(92);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Message() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(93);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MessageEventDefinition() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(94);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MessageFlow() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(95);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MessageFlowAssociation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(96);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Monitoring() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(97);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_MultiInstanceLoopCharacteristics() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(98);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Operation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(99);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_OutputSet() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(100);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ParallelGateway() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(101);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Participant() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(102);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ParticipantAssociation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(103);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ParticipantMultiplicity() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(104);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_PartnerEntity() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(105);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_PartnerRole() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(106);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_PotentialOwner() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(107);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Process() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(108);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Property() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(109);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ReceiveTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(110);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Relationship() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(111);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Rendering() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(112);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Resource() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(113);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ResourceAssignmentExpression() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(114);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ResourceParameter() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(115);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ResourceParameterBinding() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(116);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Script() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(117);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ScriptTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(118);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SendTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(119);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SequenceFlow() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(120);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ServiceTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(121);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Signal() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(122);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SignalEventDefinition() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(123);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_StandardLoopCharacteristics() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(124);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_StartEvent() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(125);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SubConversation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(126);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_SubProcess() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(127);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Task() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(128);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TerminateEventDefinition() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(129);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Text() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(130);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TextAnnotation() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(131);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_ThrowEvent() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(132);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_TimerEventDefinition() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(133);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_Transaction() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(134);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDocumentRoot_UserTask() {
        return (EReference) getDocumentRoot().getEStructuralFeatures().get(135);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivity() {
        if (activityEClass == null) {
            activityEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(1);
        }
        return activityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivity_IoSpecification() {
        return (EReference) getActivity().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivity_Properties() {
        return (EReference) getActivity().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivity_DataInputAssociations() {
        return (EReference) getActivity().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivity_DataOutputAssociations() {
        return (EReference) getActivity().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivity_ActivityResourceGroups() {
        return (EAttribute) getActivity().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivity_ActivityResources() {
        return (EReference) getActivity().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivity_LoopCharacteristicsGroup() {
        return (EAttribute) getActivity().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivity_LoopCharacteristics() {
        return (EReference) getActivity().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivity_CompletionQuantity() {
        return (EAttribute) getActivity().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivity_Default() {
        return (EAttribute) getActivity().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivity_IsForCompensation() {
        return (EAttribute) getActivity().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivity_StartQuantity() {
        return (EAttribute) getActivity().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getActivityResource() {
        if (activityResourceEClass == null) {
            activityResourceEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(2);
        }
        return activityResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityResource_ResourceAssignmentExpression() {
        return (EReference) getActivityResource().getEStructuralFeatures().get(
                0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getActivityResource_ResourceParameterBinding() {
        return (EReference) getActivityResource().getEStructuralFeatures().get(
                1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getActivityResource_ResourceRef() {
        return (EAttribute) getActivityResource().getEStructuralFeatures().get(
                2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAdHocSubProcess() {
        if (adHocSubProcessEClass == null) {
            adHocSubProcessEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(5);
        }
        return adHocSubProcessEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAdHocSubProcess_CompletionCondition() {
        return (EReference) getAdHocSubProcess().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAdHocSubProcess_CancelRemainingInstances() {
        return (EAttribute) getAdHocSubProcess().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAdHocSubProcess_Ordering() {
        return (EAttribute) getAdHocSubProcess().getEStructuralFeatures()
                .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getArtifact() {
        if (artifactEClass == null) {
            artifactEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(6);
        }
        return artifactEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssignment() {
        if (assignmentEClass == null) {
            assignmentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(7);
        }
        return assignmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignment_From() {
        return (EReference) getAssignment().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAssignment_To() {
        return (EReference) getAssignment().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssignment_Language() {
        return (EAttribute) getAssignment().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAssociation() {
        if (associationEClass == null) {
            associationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(8);
        }
        return associationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssociation_AssociationDirection() {
        return (EAttribute) getAssociation().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssociation_SourceRef() {
        return (EAttribute) getAssociation().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAssociation_TargetRef() {
        return (EAttribute) getAssociation().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAuditing() {
        if (auditingEClass == null) {
            auditingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(11);
        }
        return auditingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBaseElement() {
        if (baseElementEClass == null) {
            baseElementEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(12);
        }
        return baseElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBaseElement_Documentation() {
        return (EReference) getBaseElement().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBaseElement_Any() {
        return (EAttribute) getBaseElement().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBaseElement_Id() {
        return (EAttribute) getBaseElement().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBaseElement_AnyAttribute() {
        return (EAttribute) getBaseElement().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBaseElementWithMixedContent() {
        if (baseElementWithMixedContentEClass == null) {
            baseElementWithMixedContentEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(13);
        }
        return baseElementWithMixedContentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBaseElementWithMixedContent_Mixed() {
        return (EAttribute) getBaseElementWithMixedContent()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBaseElementWithMixedContent_Documentation() {
        return (EReference) getBaseElementWithMixedContent()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getBaseElementWithMixedContent_Category() {
        return (EReference) getBaseElementWithMixedContent()
                .getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBaseElementWithMixedContent_Any() {
        return (EAttribute) getBaseElementWithMixedContent()
                .getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBaseElementWithMixedContent_Id() {
        return (EAttribute) getBaseElementWithMixedContent()
                .getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBaseElementWithMixedContent_AnyAttribute() {
        return (EAttribute) getBaseElementWithMixedContent()
                .getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBoundaryEvent() {
        if (boundaryEventEClass == null) {
            boundaryEventEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(14);
        }
        return boundaryEventEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBoundaryEvent_AttachedToRef() {
        return (EAttribute) getBoundaryEvent().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBoundaryEvent_CancelActivity() {
        return (EAttribute) getBoundaryEvent().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBusinessRuleTask() {
        if (businessRuleTaskEClass == null) {
            businessRuleTaskEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(15);
        }
        return businessRuleTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCallableElement() {
        if (callableElementEClass == null) {
            callableElementEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(16);
        }
        return callableElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCallableElement_SupportedInterfaceRef() {
        return (EAttribute) getCallableElement().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCallableElement_IoSpecification() {
        return (EReference) getCallableElement().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCallableElement_IoBinding() {
        return (EReference) getCallableElement().getEStructuralFeatures()
                .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCallableElement_Name() {
        return (EAttribute) getCallableElement().getEStructuralFeatures()
                .get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCallActivity() {
        if (callActivityEClass == null) {
            callActivityEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(17);
        }
        return callActivityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCallActivity_CalledElement() {
        return (EAttribute) getCallActivity().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCallChoreographyActivity() {
        if (callChoreographyActivityEClass == null) {
            callChoreographyActivityEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(18);
        }
        return callChoreographyActivityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCallChoreographyActivity_ParticipantAssociation() {
        return (EReference) getCallChoreographyActivity()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCallChoreographyActivity_CalledElement() {
        return (EAttribute) getCallChoreographyActivity()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCallConversation() {
        if (callConversationEClass == null) {
            callConversationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(19);
        }
        return callConversationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCallConversation_ParticipantAssociation() {
        return (EReference) getCallConversation().getEStructuralFeatures().get(
                0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCallConversation_CalledElementRef() {
        return (EAttribute) getCallConversation().getEStructuralFeatures().get(
                1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCancelEventDefinition() {
        if (cancelEventDefinitionEClass == null) {
            cancelEventDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(20);
        }
        return cancelEventDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCatchEvent() {
        if (catchEventEClass == null) {
            catchEventEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(21);
        }
        return catchEventEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCatchEvent_DataOutput() {
        return (EReference) getCatchEvent().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCatchEvent_DataOutputAssociation() {
        return (EReference) getCatchEvent().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCatchEvent_OutputSet() {
        return (EReference) getCatchEvent().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCatchEvent_EventDefinitionGroup() {
        return (EAttribute) getCatchEvent().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCatchEvent_EventDefinition() {
        return (EReference) getCatchEvent().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCatchEvent_EventDefinitionRef() {
        return (EAttribute) getCatchEvent().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCatchEvent_ParallelMultiple() {
        return (EAttribute) getCatchEvent().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCategory() {
        if (categoryEClass == null) {
            categoryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(22);
        }
        return categoryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCategory_CategoryValue() {
        return (EReference) getCategory().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCategoryValue() {
        if (categoryValueEClass == null) {
            categoryValueEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(23);
        }
        return categoryValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCategoryValue_Value() {
        return (EAttribute) getCategoryValue().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getChoreography() {
        if (choreographyEClass == null) {
            choreographyEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(24);
        }
        return choreographyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChoreography_FlowElementGroup() {
        return (EAttribute) getChoreography().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChoreography_FlowElement() {
        return (EReference) getChoreography().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChoreography_ArtifactGroup() {
        return (EAttribute) getChoreography().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChoreography_Artifact() {
        return (EReference) getChoreography().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChoreography_MessageFlow() {
        return (EReference) getChoreography().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChoreography_Participant() {
        return (EReference) getChoreography().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChoreography_Conversation() {
        return (EReference) getChoreography().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChoreography_ConversationAssociation() {
        return (EReference) getChoreography().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChoreography_MessageFlowAssociation() {
        return (EReference) getChoreography().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChoreography_ParticipantAssociation() {
        return (EReference) getChoreography().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChoreography_IsClosed() {
        return (EAttribute) getChoreography().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getChoreographyActivity() {
        if (choreographyActivityEClass == null) {
            choreographyActivityEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(25);
        }
        return choreographyActivityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChoreographyActivity_ParticipantRef() {
        return (EAttribute) getChoreographyActivity().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChoreographyActivity_InitiatingParticipantRef() {
        return (EAttribute) getChoreographyActivity().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getChoreographySubProcess() {
        if (choreographySubProcessEClass == null) {
            choreographySubProcessEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(26);
        }
        return choreographySubProcessEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChoreographySubProcess_FlowElementGroup() {
        return (EAttribute) getChoreographySubProcess()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChoreographySubProcess_FlowElement() {
        return (EReference) getChoreographySubProcess()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChoreographySubProcess_ArtifactGroup() {
        return (EAttribute) getChoreographySubProcess()
                .getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getChoreographySubProcess_Artifact() {
        return (EReference) getChoreographySubProcess()
                .getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getChoreographyTask() {
        if (choreographyTaskEClass == null) {
            choreographyTaskEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(27);
        }
        return choreographyTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getChoreographyTask_MessageFlowRef() {
        return (EAttribute) getChoreographyTask().getEStructuralFeatures().get(
                0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCollaboration() {
        if (collaborationEClass == null) {
            collaborationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(28);
        }
        return collaborationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCollaboration_Participant() {
        return (EReference) getCollaboration().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCollaboration_MessageFlow() {
        return (EReference) getCollaboration().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCollaboration_ArtifactGroup() {
        return (EAttribute) getCollaboration().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCollaboration_Artifact() {
        return (EReference) getCollaboration().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCollaboration_Conversation() {
        return (EReference) getCollaboration().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCollaboration_ConversationAssociation() {
        return (EReference) getCollaboration().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCollaboration_ParticipantAssociation() {
        return (EReference) getCollaboration().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCollaboration_MessageFlowAssociation() {
        return (EReference) getCollaboration().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCollaboration_ChoreographyRef() {
        return (EAttribute) getCollaboration().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCollaboration_IsClosed() {
        return (EAttribute) getCollaboration().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCollaboration_Name() {
        return (EAttribute) getCollaboration().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCommunication() {
        if (communicationEClass == null) {
            communicationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(29);
        }
        return communicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommunication_MessageFlowRef() {
        return (EAttribute) getCommunication().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommunication_CorrelationKeyRef() {
        return (EAttribute) getCommunication().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCompensateEventDefinition() {
        if (compensateEventDefinitionEClass == null) {
            compensateEventDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(30);
        }
        return compensateEventDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCompensateEventDefinition_ActivityRef() {
        return (EAttribute) getCompensateEventDefinition()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCompensateEventDefinition_WaitForCompletion() {
        return (EAttribute) getCompensateEventDefinition()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComplexBehaviorDefinition() {
        if (complexBehaviorDefinitionEClass == null) {
            complexBehaviorDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(31);
        }
        return complexBehaviorDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexBehaviorDefinition_Condition() {
        return (EReference) getComplexBehaviorDefinition()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexBehaviorDefinition_Event() {
        return (EReference) getComplexBehaviorDefinition()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComplexGateway() {
        if (complexGatewayEClass == null) {
            complexGatewayEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(32);
        }
        return complexGatewayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getComplexGateway_ActivationCondition() {
        return (EReference) getComplexGateway().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getComplexGateway_Default() {
        return (EAttribute) getComplexGateway().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConditionalEventDefinition() {
        if (conditionalEventDefinitionEClass == null) {
            conditionalEventDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(33);
        }
        return conditionalEventDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConditionalEventDefinition_Condition() {
        return (EReference) getConditionalEventDefinition()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConversation() {
        if (conversationEClass == null) {
            conversationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(34);
        }
        return conversationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConversation_ConversationNodeGroup() {
        return (EAttribute) getConversation().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConversation_ConversationNode() {
        return (EReference) getConversation().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConversation_Participant() {
        return (EReference) getConversation().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConversation_ArtifactGroup() {
        return (EAttribute) getConversation().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConversation_Artifact() {
        return (EReference) getConversation().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConversation_MessageFlow() {
        return (EReference) getConversation().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConversation_MessageFlowRef() {
        return (EAttribute) getConversation().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getConversation_CorrelationKey() {
        return (EReference) getConversation().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConversationAssociation() {
        if (conversationAssociationEClass == null) {
            conversationAssociationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(35);
        }
        return conversationAssociationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConversationAssociation_MessageFlowRef() {
        return (EAttribute) getConversationAssociation()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConversationAssociation_ConversationRef() {
        return (EAttribute) getConversationAssociation()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConversationAssociation_CorrelationKeyRef() {
        return (EAttribute) getConversationAssociation()
                .getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getConversationNode() {
        if (conversationNodeEClass == null) {
            conversationNodeEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(36);
        }
        return conversationNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConversationNode_ParticipantRef() {
        return (EAttribute) getConversationNode().getEStructuralFeatures().get(
                0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getConversationNode_Name() {
        return (EAttribute) getConversationNode().getEStructuralFeatures().get(
                1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCorrelationKey() {
        if (correlationKeyEClass == null) {
            correlationKeyEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(37);
        }
        return correlationKeyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCorrelationKey_CorrelationPropertyRef() {
        return (EAttribute) getCorrelationKey().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCorrelationProperty() {
        if (correlationPropertyEClass == null) {
            correlationPropertyEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(38);
        }
        return correlationPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCorrelationProperty_CorrelationPropertyRetrievalExpression() {
        return (EReference) getCorrelationProperty().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCorrelationPropertyBinding() {
        if (correlationPropertyBindingEClass == null) {
            correlationPropertyBindingEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(39);
        }
        return correlationPropertyBindingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCorrelationPropertyBinding_DataPath() {
        return (EReference) getCorrelationPropertyBinding()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCorrelationPropertyBinding_CorrelationPropertyRef() {
        return (EAttribute) getCorrelationPropertyBinding()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCorrelationPropertyRetrievalExpression() {
        if (correlationPropertyRetrievalExpressionEClass == null) {
            correlationPropertyRetrievalExpressionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(40);
        }
        return correlationPropertyRetrievalExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCorrelationPropertyRetrievalExpression_MessagePath() {
        return (EReference) getCorrelationPropertyRetrievalExpression()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCorrelationPropertyRetrievalExpression_MessageRef() {
        return (EAttribute) getCorrelationPropertyRetrievalExpression()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCorrelationSubscription() {
        if (correlationSubscriptionEClass == null) {
            correlationSubscriptionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(41);
        }
        return correlationSubscriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCorrelationSubscription_CorrelationPropertyBinding() {
        return (EReference) getCorrelationSubscription()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCorrelationSubscription_CorrelationKeyRef() {
        return (EAttribute) getCorrelationSubscription()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCorrelationSubscription_Process() {
        return (EAttribute) getCorrelationSubscription()
                .getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataAssociation() {
        if (dataAssociationEClass == null) {
            dataAssociationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(42);
        }
        return dataAssociationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataAssociation_Transformation() {
        return (EReference) getDataAssociation().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataAssociation_Assignment() {
        return (EReference) getDataAssociation().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataInput() {
        if (dataInputEClass == null) {
            dataInputEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(43);
        }
        return dataInputEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataInput_DataState() {
        return (EReference) getDataInput().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataInput_IsCollection() {
        return (EAttribute) getDataInput().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataInput_ItemSubjectRef() {
        return (EAttribute) getDataInput().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataInput_Name() {
        return (EAttribute) getDataInput().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataInputAssociation() {
        if (dataInputAssociationEClass == null) {
            dataInputAssociationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(44);
        }
        return dataInputAssociationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataInputAssociation_SourceRef() {
        return (EAttribute) getDataInputAssociation().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataInputAssociation_TargetRef() {
        return (EAttribute) getDataInputAssociation().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataObject() {
        if (dataObjectEClass == null) {
            dataObjectEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(45);
        }
        return dataObjectEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataObject_DataState() {
        return (EReference) getDataObject().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataObject_IsCollection() {
        return (EAttribute) getDataObject().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataObject_ItemSubjectRef() {
        return (EAttribute) getDataObject().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataOutput() {
        if (dataOutputEClass == null) {
            dataOutputEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(46);
        }
        return dataOutputEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataOutput_DataState() {
        return (EReference) getDataOutput().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataOutput_IsCollection() {
        return (EAttribute) getDataOutput().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataOutput_ItemSubjectRef() {
        return (EAttribute) getDataOutput().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataOutput_Name() {
        return (EAttribute) getDataOutput().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataOutputAssociation() {
        if (dataOutputAssociationEClass == null) {
            dataOutputAssociationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(47);
        }
        return dataOutputAssociationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataOutputAssociation_SourceRef() {
        return (EAttribute) getDataOutputAssociation().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataOutputAssociation_TargetRef() {
        return (EAttribute) getDataOutputAssociation().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataState() {
        if (dataStateEClass == null) {
            dataStateEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(48);
        }
        return dataStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataState_Name() {
        return (EAttribute) getDataState().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataStore() {
        if (dataStoreEClass == null) {
            dataStoreEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(49);
        }
        return dataStoreEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataStore_DataState() {
        return (EReference) getDataStore().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataStore_Capacity() {
        return (EAttribute) getDataStore().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataStore_IsUnlimited() {
        return (EAttribute) getDataStore().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataStore_ItemSubjectRef() {
        return (EAttribute) getDataStore().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataStore_Name() {
        return (EAttribute) getDataStore().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDataStoreReference() {
        if (dataStoreReferenceEClass == null) {
            dataStoreReferenceEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(50);
        }
        return dataStoreReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDataStoreReference_DataState() {
        return (EReference) getDataStoreReference().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataStoreReference_DataStoreRef() {
        return (EAttribute) getDataStoreReference().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDataStoreReference_ItemSubjectRef() {
        return (EAttribute) getDataStoreReference().getEStructuralFeatures()
                .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDefinitions() {
        if (definitionsEClass == null) {
            definitionsEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(51);
        }
        return definitionsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefinitions_Import() {
        return (EReference) getDefinitions().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefinitions_Extension() {
        return (EReference) getDefinitions().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefinitions_RootElementGroup() {
        return (EAttribute) getDefinitions().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefinitions_RootElement() {
        return (EReference) getDefinitions().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefinitions_Diagram() {
        return (EReference) getDefinitions().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDefinitions_Relationship() {
        return (EReference) getDefinitions().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefinitions_ExpressionLanguage() {
        return (EAttribute) getDefinitions().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefinitions_Id() {
        return (EAttribute) getDefinitions().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefinitions_TargetNamespace() {
        return (EAttribute) getDefinitions().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefinitions_TypeLanguage() {
        return (EAttribute) getDefinitions().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefinitions_AnyAttribute() {
        return (EAttribute) getDefinitions().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDocumentation() {
        if (documentationEClass == null) {
            documentationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(52);
        }
        return documentationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentation_Mixed() {
        return (EAttribute) getDocumentation().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentation_Any() {
        return (EAttribute) getDocumentation().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDocumentation_Id() {
        return (EAttribute) getDocumentation().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEndEvent() {
        if (endEventEClass == null) {
            endEventEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(53);
        }
        return endEventEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEndPoint() {
        if (endPointEClass == null) {
            endPointEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(54);
        }
        return endPointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getError() {
        if (errorEClass == null) {
            errorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(55);
        }
        return errorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getError_StructureRef() {
        return (EAttribute) getError().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getErrorEventDefinition() {
        if (errorEventDefinitionEClass == null) {
            errorEventDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(56);
        }
        return errorEventDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getErrorEventDefinition_ErrorCode() {
        return (EAttribute) getErrorEventDefinition().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getErrorEventDefinition_ErrorRef() {
        return (EAttribute) getErrorEventDefinition().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEscalation() {
        if (escalationEClass == null) {
            escalationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(57);
        }
        return escalationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEscalation_StructureRef() {
        return (EAttribute) getEscalation().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEscalationEventDefinition() {
        if (escalationEventDefinitionEClass == null) {
            escalationEventDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(58);
        }
        return escalationEventDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEscalationEventDefinition_EscalationCode() {
        return (EAttribute) getEscalationEventDefinition()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEscalationEventDefinition_EscalationRef() {
        return (EAttribute) getEscalationEventDefinition()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEvent() {
        if (eventEClass == null) {
            eventEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(59);
        }
        return eventEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventBasedGateway() {
        if (eventBasedGatewayEClass == null) {
            eventBasedGatewayEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(60);
        }
        return eventBasedGatewayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventBasedGateway_EventGatewayType() {
        return (EAttribute) getEventBasedGateway().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEventBasedGateway_Instantiate() {
        return (EAttribute) getEventBasedGateway().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEventDefinition() {
        if (eventDefinitionEClass == null) {
            eventDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(63);
        }
        return eventDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExclusiveGateway() {
        if (exclusiveGatewayEClass == null) {
            exclusiveGatewayEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(64);
        }
        return exclusiveGatewayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExclusiveGateway_Default() {
        return (EAttribute) getExclusiveGateway().getEStructuralFeatures().get(
                0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExpression() {
        if (expressionEClass == null) {
            expressionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(65);
        }
        return expressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getExtension() {
        if (extensionEClass == null) {
            extensionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(66);
        }
        return extensionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getExtension_Documentation() {
        return (EReference) getExtension().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtension_Definition() {
        return (EAttribute) getExtension().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getExtension_MustUnderstand() {
        return (EAttribute) getExtension().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowElement() {
        if (flowElementEClass == null) {
            flowElementEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(67);
        }
        return flowElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFlowElement_Auditing() {
        return (EReference) getFlowElement().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFlowElement_Monitoring() {
        return (EReference) getFlowElement().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFlowElement_CategoryValueRef() {
        return (EAttribute) getFlowElement().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFlowElement_Name() {
        return (EAttribute) getFlowElement().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFlowNode() {
        if (flowNodeEClass == null) {
            flowNodeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(68);
        }
        return flowNodeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFlowNode_Incoming() {
        return (EAttribute) getFlowNode().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFlowNode_Outgoing() {
        return (EAttribute) getFlowNode().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFormalExpression() {
        if (formalExpressionEClass == null) {
            formalExpressionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(69);
        }
        return formalExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFormalExpression_EvaluatesToTypeRef() {
        return (EAttribute) getFormalExpression().getEStructuralFeatures().get(
                0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFormalExpression_Language() {
        return (EAttribute) getFormalExpression().getEStructuralFeatures().get(
                1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGateway() {
        if (gatewayEClass == null) {
            gatewayEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(70);
        }
        return gatewayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGateway_GatewayDirection() {
        return (EAttribute) getGateway().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGlobalBusinessRuleTask() {
        if (globalBusinessRuleTaskEClass == null) {
            globalBusinessRuleTaskEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(73);
        }
        return globalBusinessRuleTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGlobalChoreographyTask() {
        if (globalChoreographyTaskEClass == null) {
            globalChoreographyTaskEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(74);
        }
        return globalChoreographyTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGlobalChoreographyTask_Participant() {
        return (EReference) getGlobalChoreographyTask()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGlobalChoreographyTask_MessageFlow() {
        return (EReference) getGlobalChoreographyTask()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGlobalChoreographyTask_InitiatingParticipantRef() {
        return (EAttribute) getGlobalChoreographyTask()
                .getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGlobalCommunication() {
        if (globalCommunicationEClass == null) {
            globalCommunicationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(75);
        }
        return globalCommunicationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGlobalCommunication_Participant() {
        return (EReference) getGlobalCommunication().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGlobalCommunication_MessageFlow() {
        return (EReference) getGlobalCommunication().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGlobalCommunication_CorrelationKey() {
        return (EReference) getGlobalCommunication().getEStructuralFeatures()
                .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGlobalManualTask() {
        if (globalManualTaskEClass == null) {
            globalManualTaskEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(76);
        }
        return globalManualTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGlobalScriptTask() {
        if (globalScriptTaskEClass == null) {
            globalScriptTaskEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(77);
        }
        return globalScriptTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGlobalScriptTask_Script() {
        return (EReference) getGlobalScriptTask().getEStructuralFeatures().get(
                0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGlobalScriptTask_ScriptLanguage() {
        return (EAttribute) getGlobalScriptTask().getEStructuralFeatures().get(
                1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGlobalTask() {
        if (globalTaskEClass == null) {
            globalTaskEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(78);
        }
        return globalTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGlobalTask_PerformerGroup() {
        return (EAttribute) getGlobalTask().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGlobalTask_Performer() {
        return (EReference) getGlobalTask().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGlobalUserTask() {
        if (globalUserTaskEClass == null) {
            globalUserTaskEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(79);
        }
        return globalUserTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getGlobalUserTask_Rendering() {
        return (EReference) getGlobalUserTask().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGlobalUserTask_Implementation() {
        return (EAttribute) getGlobalUserTask().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getGroup() {
        if (groupEClass == null) {
            groupEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(80);
        }
        return groupEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getGroup_CategoryRef() {
        return (EAttribute) getGroup().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getHumanPerformer() {
        if (humanPerformerEClass == null) {
            humanPerformerEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(81);
        }
        return humanPerformerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getImplicitThrowEvent() {
        if (implicitThrowEventEClass == null) {
            implicitThrowEventEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(82);
        }
        return implicitThrowEventEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getImport() {
        if (importEClass == null) {
            importEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(83);
        }
        return importEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImport_ImportType() {
        return (EAttribute) getImport().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImport_Location() {
        return (EAttribute) getImport().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getImport_Namespace() {
        return (EAttribute) getImport().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInclusiveGateway() {
        if (inclusiveGatewayEClass == null) {
            inclusiveGatewayEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(84);
        }
        return inclusiveGatewayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInclusiveGateway_Default() {
        return (EAttribute) getInclusiveGateway().getEStructuralFeatures().get(
                0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInputOutputBinding() {
        if (inputOutputBindingEClass == null) {
            inputOutputBindingEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(85);
        }
        return inputOutputBindingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputOutputBinding_InputDataRef() {
        return (EAttribute) getInputOutputBinding().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputOutputBinding_OperationRef() {
        return (EAttribute) getInputOutputBinding().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputOutputBinding_OutputDataRef() {
        return (EAttribute) getInputOutputBinding().getEStructuralFeatures()
                .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInputOutputSpecification() {
        if (inputOutputSpecificationEClass == null) {
            inputOutputSpecificationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(86);
        }
        return inputOutputSpecificationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInputOutputSpecification_DataInput() {
        return (EReference) getInputOutputSpecification()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInputOutputSpecification_DataOutput() {
        return (EReference) getInputOutputSpecification()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInputOutputSpecification_InputSet() {
        return (EReference) getInputOutputSpecification()
                .getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInputOutputSpecification_OutputSet() {
        return (EReference) getInputOutputSpecification()
                .getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInputSet() {
        if (inputSetEClass == null) {
            inputSetEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(87);
        }
        return inputSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputSet_DataInputRefs() {
        return (EAttribute) getInputSet().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputSet_OptionalInputRefs() {
        return (EAttribute) getInputSet().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputSet_WhileExecutingInputRefs() {
        return (EAttribute) getInputSet().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputSet_OutputSetRefs() {
        return (EAttribute) getInputSet().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInputSet_Name() {
        return (EAttribute) getInputSet().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterface() {
        if (interfaceEClass == null) {
            interfaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(88);
        }
        return interfaceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getInterface_Operation() {
        return (EReference) getInterface().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getInterface_Name() {
        return (EAttribute) getInterface().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntermediateCatchEvent() {
        if (intermediateCatchEventEClass == null) {
            intermediateCatchEventEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(89);
        }
        return intermediateCatchEventEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getIntermediateThrowEvent() {
        if (intermediateThrowEventEClass == null) {
            intermediateThrowEventEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(90);
        }
        return intermediateThrowEventEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getItemDefinition() {
        if (itemDefinitionEClass == null) {
            itemDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(91);
        }
        return itemDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItemDefinition_IsCollection() {
        return (EAttribute) getItemDefinition().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItemDefinition_ItemKind() {
        return (EAttribute) getItemDefinition().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getItemDefinition_StructureRef() {
        return (EAttribute) getItemDefinition().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLane() {
        if (laneEClass == null) {
            laneEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(94);
        }
        return laneEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLane_PartitionElement() {
        return (EReference) getLane().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLane_FlowElementRef() {
        return (EAttribute) getLane().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLane_ChildLaneSet() {
        return (EReference) getLane().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLane_Name() {
        return (EAttribute) getLane().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLane_PartitionElementRef() {
        return (EAttribute) getLane().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLaneSet() {
        if (laneSetEClass == null) {
            laneSetEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(95);
        }
        return laneSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLaneSet_Lane() {
        return (EReference) getLaneSet().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinkEventDefinition() {
        if (linkEventDefinitionEClass == null) {
            linkEventDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(96);
        }
        return linkEventDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLinkEventDefinition_Name() {
        return (EAttribute) getLinkEventDefinition().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLoopCharacteristics() {
        if (loopCharacteristicsEClass == null) {
            loopCharacteristicsEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(97);
        }
        return loopCharacteristicsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getManualTask() {
        if (manualTaskEClass == null) {
            manualTaskEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(98);
        }
        return manualTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMessage() {
        if (messageEClass == null) {
            messageEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(99);
        }
        return messageEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMessage_Name() {
        return (EAttribute) getMessage().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMessage_StructureRef() {
        return (EAttribute) getMessage().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMessageEventDefinition() {
        if (messageEventDefinitionEClass == null) {
            messageEventDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(100);
        }
        return messageEventDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMessageEventDefinition_OperationRef() {
        return (EAttribute) getMessageEventDefinition()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMessageEventDefinition_MessageRef() {
        return (EAttribute) getMessageEventDefinition()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMessageFlow() {
        if (messageFlowEClass == null) {
            messageFlowEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(101);
        }
        return messageFlowEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMessageFlow_MessageRef() {
        return (EAttribute) getMessageFlow().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMessageFlow_Name() {
        return (EAttribute) getMessageFlow().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMessageFlow_SourceRef() {
        return (EAttribute) getMessageFlow().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMessageFlow_TargetRef() {
        return (EAttribute) getMessageFlow().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMessageFlowAssociation() {
        if (messageFlowAssociationEClass == null) {
            messageFlowAssociationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(102);
        }
        return messageFlowAssociationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMessageFlowAssociation_InnerMessageFlowRef() {
        return (EAttribute) getMessageFlowAssociation()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMessageFlowAssociation_OuterMessageFlowRef() {
        return (EAttribute) getMessageFlowAssociation()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMonitoring() {
        if (monitoringEClass == null) {
            monitoringEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(103);
        }
        return monitoringEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMultiInstanceLoopCharacteristics() {
        if (multiInstanceLoopCharacteristicsEClass == null) {
            multiInstanceLoopCharacteristicsEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(106);
        }
        return multiInstanceLoopCharacteristicsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMultiInstanceLoopCharacteristics_LoopCardinality() {
        return (EReference) getMultiInstanceLoopCharacteristics()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMultiInstanceLoopCharacteristics_LoopDataInput() {
        return (EReference) getMultiInstanceLoopCharacteristics()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMultiInstanceLoopCharacteristics_LoopDataOutput() {
        return (EReference) getMultiInstanceLoopCharacteristics()
                .getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMultiInstanceLoopCharacteristics_InputDataItem() {
        return (EReference) getMultiInstanceLoopCharacteristics()
                .getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMultiInstanceLoopCharacteristics_OutputDataItem() {
        return (EReference) getMultiInstanceLoopCharacteristics()
                .getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition() {
        return (EReference) getMultiInstanceLoopCharacteristics()
                .getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getMultiInstanceLoopCharacteristics_CompletionCondition() {
        return (EReference) getMultiInstanceLoopCharacteristics()
                .getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiInstanceLoopCharacteristics_Behavior() {
        return (EAttribute) getMultiInstanceLoopCharacteristics()
                .getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiInstanceLoopCharacteristics_IsSequential() {
        return (EAttribute) getMultiInstanceLoopCharacteristics()
                .getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiInstanceLoopCharacteristics_NoneBehaviorEventRef() {
        return (EAttribute) getMultiInstanceLoopCharacteristics()
                .getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiInstanceLoopCharacteristics_OneBehaviorEventRef() {
        return (EAttribute) getMultiInstanceLoopCharacteristics()
                .getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperation() {
        if (operationEClass == null) {
            operationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(107);
        }
        return operationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_InMessageRef() {
        return (EAttribute) getOperation().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_OutMessageRef() {
        return (EAttribute) getOperation().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_ErrorRef() {
        return (EAttribute) getOperation().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOperation_Name() {
        return (EAttribute) getOperation().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOutputSet() {
        if (outputSetEClass == null) {
            outputSetEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(108);
        }
        return outputSetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOutputSet_DataOutputRefs() {
        return (EAttribute) getOutputSet().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOutputSet_OptionalOutputRefs() {
        return (EAttribute) getOutputSet().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOutputSet_WhileExecutingOutputRefs() {
        return (EAttribute) getOutputSet().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOutputSet_InputSetRefs() {
        return (EAttribute) getOutputSet().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getOutputSet_Name() {
        return (EAttribute) getOutputSet().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParallelGateway() {
        if (parallelGatewayEClass == null) {
            parallelGatewayEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(109);
        }
        return parallelGatewayEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParticipant() {
        if (participantEClass == null) {
            participantEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(110);
        }
        return participantEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParticipant_InterfaceRef() {
        return (EAttribute) getParticipant().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParticipant_EndPointRef() {
        return (EAttribute) getParticipant().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getParticipant_ParticipantMultiplicity() {
        return (EReference) getParticipant().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParticipant_Name() {
        return (EAttribute) getParticipant().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParticipant_PartnerEntityRef() {
        return (EAttribute) getParticipant().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParticipant_PartnerRoleRef() {
        return (EAttribute) getParticipant().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParticipant_ProcessRef() {
        return (EAttribute) getParticipant().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParticipantAssociation() {
        if (participantAssociationEClass == null) {
            participantAssociationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(111);
        }
        return participantAssociationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParticipantAssociation_InnerParticipantRef() {
        return (EAttribute) getParticipantAssociation()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParticipantAssociation_OuterParticipantRef() {
        return (EAttribute) getParticipantAssociation()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParticipantMultiplicity() {
        if (participantMultiplicityEClass == null) {
            participantMultiplicityEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(112);
        }
        return participantMultiplicityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParticipantMultiplicity_Maximum() {
        return (EAttribute) getParticipantMultiplicity()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParticipantMultiplicity_Minimum() {
        return (EAttribute) getParticipantMultiplicity()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPartnerEntity() {
        if (partnerEntityEClass == null) {
            partnerEntityEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(113);
        }
        return partnerEntityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartnerEntity_Name() {
        return (EAttribute) getPartnerEntity().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPartnerRole() {
        if (partnerRoleEClass == null) {
            partnerRoleEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(114);
        }
        return partnerRoleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPartnerRole_Name() {
        return (EAttribute) getPartnerRole().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPerformer() {
        if (performerEClass == null) {
            performerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(115);
        }
        return performerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPotentialOwner() {
        if (potentialOwnerEClass == null) {
            potentialOwnerEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(116);
        }
        return potentialOwnerEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcess() {
        if (processEClass == null) {
            processEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(117);
        }
        return processEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcess_Auditing() {
        return (EReference) getProcess().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcess_Monitoring() {
        return (EReference) getProcess().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcess_Property() {
        return (EReference) getProcess().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcess_LaneSet() {
        return (EReference) getProcess().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcess_FlowElementGroup() {
        return (EAttribute) getProcess().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcess_FlowElement() {
        return (EReference) getProcess().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcess_ArtifactGroup() {
        return (EAttribute) getProcess().getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcess_Artifact() {
        return (EReference) getProcess().getEStructuralFeatures().get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcess_Supports() {
        return (EAttribute) getProcess().getEStructuralFeatures().get(8);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcess_DefinitionalCollaborationRef() {
        return (EAttribute) getProcess().getEStructuralFeatures().get(9);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcess_IsClosed() {
        return (EAttribute) getProcess().getEStructuralFeatures().get(10);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcess_ProcessType() {
        return (EAttribute) getProcess().getEStructuralFeatures().get(11);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperty() {
        if (propertyEClass == null) {
            propertyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(120);
        }
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProperty_DataState() {
        return (EReference) getProperty().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_ItemSubjectRef() {
        return (EAttribute) getProperty().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Name() {
        return (EAttribute) getProperty().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReceiveTask() {
        if (receiveTaskEClass == null) {
            receiveTaskEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(121);
        }
        return receiveTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getReceiveTask_Implementation() {
        return (EAttribute) getReceiveTask().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getReceiveTask_Instantiate() {
        return (EAttribute) getReceiveTask().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getReceiveTask_MessageRef() {
        return (EAttribute) getReceiveTask().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getReceiveTask_OperationRef() {
        return (EAttribute) getReceiveTask().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRelationship() {
        if (relationshipEClass == null) {
            relationshipEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(122);
        }
        return relationshipEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationship_Source() {
        return (EAttribute) getRelationship().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationship_Target() {
        return (EAttribute) getRelationship().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationship_Direction() {
        return (EAttribute) getRelationship().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getRelationship_Type() {
        return (EAttribute) getRelationship().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRendering() {
        if (renderingEClass == null) {
            renderingEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(125);
        }
        return renderingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResource() {
        if (resourceEClass == null) {
            resourceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(126);
        }
        return resourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getResource_ResourceParameter() {
        return (EReference) getResource().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResource_Name() {
        return (EAttribute) getResource().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResourceAssignmentExpression() {
        if (resourceAssignmentExpressionEClass == null) {
            resourceAssignmentExpressionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(127);
        }
        return resourceAssignmentExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceAssignmentExpression_ExpressionGroup() {
        return (EAttribute) getResourceAssignmentExpression()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getResourceAssignmentExpression_Expression() {
        return (EReference) getResourceAssignmentExpression()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResourceParameter() {
        if (resourceParameterEClass == null) {
            resourceParameterEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(128);
        }
        return resourceParameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceParameter_IsRequired() {
        return (EAttribute) getResourceParameter().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceParameter_Name() {
        return (EAttribute) getResourceParameter().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceParameter_Type() {
        return (EAttribute) getResourceParameter().getEStructuralFeatures()
                .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResourceParameterBinding() {
        if (resourceParameterBindingEClass == null) {
            resourceParameterBindingEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(129);
        }
        return resourceParameterBindingEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceParameterBinding_ExpressionGroup() {
        return (EAttribute) getResourceParameterBinding()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getResourceParameterBinding_Expression() {
        return (EReference) getResourceParameterBinding()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceParameterBinding_ParameterRef() {
        return (EAttribute) getResourceParameterBinding()
                .getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRootElement() {
        if (rootElementEClass == null) {
            rootElementEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(130);
        }
        return rootElementEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScript() {
        if (scriptEClass == null) {
            scriptEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(131);
        }
        return scriptEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScript_Mixed() {
        return (EAttribute) getScript().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScript_Any() {
        return (EAttribute) getScript().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getScriptTask() {
        if (scriptTaskEClass == null) {
            scriptTaskEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(132);
        }
        return scriptTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getScriptTask_Script() {
        return (EReference) getScriptTask().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getScriptTask_ScriptLanguage() {
        return (EAttribute) getScriptTask().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSendTask() {
        if (sendTaskEClass == null) {
            sendTaskEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(133);
        }
        return sendTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSendTask_Implementation() {
        return (EAttribute) getSendTask().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSendTask_MessageRef() {
        return (EAttribute) getSendTask().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSendTask_OperationRef() {
        return (EAttribute) getSendTask().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSequenceFlow() {
        if (sequenceFlowEClass == null) {
            sequenceFlowEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(134);
        }
        return sequenceFlowEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSequenceFlow_ConditionExpression() {
        return (EReference) getSequenceFlow().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSequenceFlow_IsImmediate() {
        return (EAttribute) getSequenceFlow().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSequenceFlow_SourceRef() {
        return (EAttribute) getSequenceFlow().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSequenceFlow_TargetRef() {
        return (EAttribute) getSequenceFlow().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getServiceTask() {
        if (serviceTaskEClass == null) {
            serviceTaskEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(137);
        }
        return serviceTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getServiceTask_Implementation() {
        return (EAttribute) getServiceTask().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getServiceTask_OperationRef() {
        return (EAttribute) getServiceTask().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSignal() {
        if (signalEClass == null) {
            signalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(138);
        }
        return signalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_Name() {
        return (EAttribute) getSignal().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignal_StructureRef() {
        return (EAttribute) getSignal().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSignalEventDefinition() {
        if (signalEventDefinitionEClass == null) {
            signalEventDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(139);
        }
        return signalEventDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSignalEventDefinition_SignalRef() {
        return (EAttribute) getSignalEventDefinition().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStandardLoopCharacteristics() {
        if (standardLoopCharacteristicsEClass == null) {
            standardLoopCharacteristicsEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(140);
        }
        return standardLoopCharacteristicsEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStandardLoopCharacteristics_LoopCondition() {
        return (EReference) getStandardLoopCharacteristics()
                .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStandardLoopCharacteristics_LoopMaximum() {
        return (EAttribute) getStandardLoopCharacteristics()
                .getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStandardLoopCharacteristics_TestBefore() {
        return (EAttribute) getStandardLoopCharacteristics()
                .getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStartEvent() {
        if (startEventEClass == null) {
            startEventEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(141);
        }
        return startEventEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getStartEvent_IsInterrupting() {
        return (EAttribute) getStartEvent().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSubConversation() {
        if (subConversationEClass == null) {
            subConversationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(142);
        }
        return subConversationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubConversation_ConversationNodeGroup() {
        return (EAttribute) getSubConversation().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubConversation_ConversationNode() {
        return (EReference) getSubConversation().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubConversation_ArtifactGroup() {
        return (EAttribute) getSubConversation().getEStructuralFeatures()
                .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubConversation_Artifact() {
        return (EReference) getSubConversation().getEStructuralFeatures()
                .get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubConversation_CorrelationKeyRef() {
        return (EAttribute) getSubConversation().getEStructuralFeatures()
                .get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSubProcess() {
        if (subProcessEClass == null) {
            subProcessEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(143);
        }
        return subProcessEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubProcess_FlowElementGroup() {
        return (EAttribute) getSubProcess().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubProcess_FlowElements() {
        return (EReference) getSubProcess().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubProcess_ArtifactGroup() {
        return (EAttribute) getSubProcess().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSubProcess_Artifacts() {
        return (EReference) getSubProcess().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSubProcess_TriggeredByEvent() {
        return (EAttribute) getSubProcess().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTask() {
        if (taskEClass == null) {
            taskEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(144);
        }
        return taskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTerminateEventDefinition() {
        if (terminateEventDefinitionEClass == null) {
            terminateEventDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(145);
        }
        return terminateEventDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getText() {
        if (textEClass == null) {
            textEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(146);
        }
        return textEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getText_Mixed() {
        return (EAttribute) getText().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getText_Any() {
        return (EAttribute) getText().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTextAnnotation() {
        if (textAnnotationEClass == null) {
            textAnnotationEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(147);
        }
        return textAnnotationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTextAnnotation_Text() {
        return (EReference) getTextAnnotation().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getThrowEvent() {
        if (throwEventEClass == null) {
            throwEventEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(148);
        }
        return throwEventEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getThrowEvent_DataInput() {
        return (EReference) getThrowEvent().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getThrowEvent_DataInputAssociation() {
        return (EReference) getThrowEvent().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getThrowEvent_InputSet() {
        return (EReference) getThrowEvent().getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getThrowEvent_EventDefinitionGroup() {
        return (EAttribute) getThrowEvent().getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getThrowEvent_EventDefinition() {
        return (EReference) getThrowEvent().getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getThrowEvent_EventDefinitionRef() {
        return (EAttribute) getThrowEvent().getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTimerEventDefinition() {
        if (timerEventDefinitionEClass == null) {
            timerEventDefinitionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(149);
        }
        return timerEventDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimerEventDefinition_TimeDate() {
        return (EReference) getTimerEventDefinition().getEStructuralFeatures()
                .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getTimerEventDefinition_TimeCycle() {
        return (EReference) getTimerEventDefinition().getEStructuralFeatures()
                .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTransaction() {
        if (transactionEClass == null) {
            transactionEClass = (EClass) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(150);
        }
        return transactionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTransaction_Method() {
        return (EAttribute) getTransaction().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUserTask() {
        if (userTaskEClass == null) {
            userTaskEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(153);
        }
        return userTaskEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getUserTask_Rendering() {
        return (EReference) getUserTask().getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUserTask_Implementation() {
        return (EAttribute) getUserTask().getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAdHocOrdering() {
        if (adHocOrderingEEnum == null) {
            adHocOrderingEEnum = (EEnum) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(3);
        }
        return adHocOrderingEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getAssociationDirection() {
        if (associationDirectionEEnum == null) {
            associationDirectionEEnum = (EEnum) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(9);
        }
        return associationDirectionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getEventBasedGatewayType() {
        if (eventBasedGatewayTypeEEnum == null) {
            eventBasedGatewayTypeEEnum = (EEnum) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(61);
        }
        return eventBasedGatewayTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getGatewayDirection() {
        if (gatewayDirectionEEnum == null) {
            gatewayDirectionEEnum = (EEnum) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(71);
        }
        return gatewayDirectionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getItemKind() {
        if (itemKindEEnum == null) {
            itemKindEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(92);
        }
        return itemKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getMultiInstanceFlowCondition() {
        if (multiInstanceFlowConditionEEnum == null) {
            multiInstanceFlowConditionEEnum = (EEnum) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(104);
        }
        return multiInstanceFlowConditionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getProcessType() {
        if (processTypeEEnum == null) {
            processTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(
                    BpmnPackage.eNS_URI).getEClassifiers().get(118);
        }
        return processTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getRelationshipDirection() {
        if (relationshipDirectionEEnum == null) {
            relationshipDirectionEEnum = (EEnum) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(123);
        }
        return relationshipDirectionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getServiceImplementation() {
        if (serviceImplementationEEnum == null) {
            serviceImplementationEEnum = (EEnum) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(135);
        }
        return serviceImplementationEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getTransactionMethod() {
        if (transactionMethodEEnum == null) {
            transactionMethodEEnum = (EEnum) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(151);
        }
        return transactionMethodEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getUserTaskImplementation() {
        if (userTaskImplementationEEnum == null) {
            userTaskImplementationEEnum = (EEnum) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(154);
        }
        return userTaskImplementationEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getAdHocOrderingObject() {
        if (adHocOrderingObjectEDataType == null) {
            adHocOrderingObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(4);
        }
        return adHocOrderingObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getAssociationDirectionObject() {
        if (associationDirectionObjectEDataType == null) {
            associationDirectionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(10);
        }
        return associationDirectionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getEventBasedGatewayTypeObject() {
        if (eventBasedGatewayTypeObjectEDataType == null) {
            eventBasedGatewayTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(62);
        }
        return eventBasedGatewayTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getGatewayDirectionObject() {
        if (gatewayDirectionObjectEDataType == null) {
            gatewayDirectionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(72);
        }
        return gatewayDirectionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getItemKindObject() {
        if (itemKindObjectEDataType == null) {
            itemKindObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers().get(93);
        }
        return itemKindObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getMultiInstanceFlowConditionObject() {
        if (multiInstanceFlowConditionObjectEDataType == null) {
            multiInstanceFlowConditionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(105);
        }
        return multiInstanceFlowConditionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getProcessTypeObject() {
        if (processTypeObjectEDataType == null) {
            processTypeObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(119);
        }
        return processTypeObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getRelationshipDirectionObject() {
        if (relationshipDirectionObjectEDataType == null) {
            relationshipDirectionObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(124);
        }
        return relationshipDirectionObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getServiceImplementationObject() {
        if (serviceImplementationObjectEDataType == null) {
            serviceImplementationObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(136);
        }
        return serviceImplementationObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getTransactionMethodObject() {
        if (transactionMethodObjectEDataType == null) {
            transactionMethodObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(152);
        }
        return transactionMethodObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getUserTaskImplementationObject() {
        if (userTaskImplementationObjectEDataType == null) {
            userTaskImplementationObjectEDataType = (EDataType) EPackage.Registry.INSTANCE
                    .getEPackage(BpmnPackage.eNS_URI).getEClassifiers()
                    .get(155);
        }
        return userTaskImplementationObjectEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BpmnFactory getBpmnFactory() {
        return (BpmnFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isLoaded = false;

    /**
     * Laods the package and any sub-packages from their serialized form.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void loadPackage() {
        if (isLoaded)
            return;
        isLoaded = true;

        URL url = getClass().getResource(packageFilename);
        if (url == null) {
            throw new RuntimeException(
                    "Missing serialized package: " + packageFilename); //$NON-NLS-1$
        }
        URI uri = URI.createURI(url.toString());
        Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
        try {
            resource.load(null);
        } catch (IOException exception) {
            throw new WrappedException(exception);
        }
        initializeFromLoadedEPackage(this, (EPackage) resource.getContents()
                .get(0));
        createResource(eNS_URI);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isFixed = false;

    /**
     * Fixes up the loaded package, to make it appear as if it had been programmatically built.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fixPackageContents() {
        if (isFixed)
            return;
        isFixed = true;
        fixEClassifiers();
    }

    /**
     * Sets the instance class on the given classifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void fixInstanceClass(EClassifier eClassifier) {
        if (eClassifier.getInstanceClassName() == null) {
            eClassifier
                    .setInstanceClassName("org.eclipse.mdt.bpmn." + eClassifier.getName()); //$NON-NLS-1$
            setGeneratedClassName(eClassifier);
        }
    }

} //BpmnPackageImpl
