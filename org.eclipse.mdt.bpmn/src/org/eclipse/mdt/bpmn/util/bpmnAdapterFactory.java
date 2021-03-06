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
package org.eclipse.mdt.bpmn.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdt.bpmn.Activity;
import org.eclipse.mdt.bpmn.ActivityResource;
import org.eclipse.mdt.bpmn.AdHocSubProcess;
import org.eclipse.mdt.bpmn.Artifact;
import org.eclipse.mdt.bpmn.Assignment;
import org.eclipse.mdt.bpmn.Association;
import org.eclipse.mdt.bpmn.Auditing;
import org.eclipse.mdt.bpmn.BaseElement;
import org.eclipse.mdt.bpmn.BaseElementWithMixedContent;
import org.eclipse.mdt.bpmn.BoundaryEvent;
import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.BusinessRuleTask;
import org.eclipse.mdt.bpmn.CallActivity;
import org.eclipse.mdt.bpmn.CallChoreographyActivity;
import org.eclipse.mdt.bpmn.CallConversation;
import org.eclipse.mdt.bpmn.CallableElement;
import org.eclipse.mdt.bpmn.CancelEventDefinition;
import org.eclipse.mdt.bpmn.CatchEvent;
import org.eclipse.mdt.bpmn.Category;
import org.eclipse.mdt.bpmn.CategoryValue;
import org.eclipse.mdt.bpmn.Choreography;
import org.eclipse.mdt.bpmn.ChoreographyActivity;
import org.eclipse.mdt.bpmn.ChoreographySubProcess;
import org.eclipse.mdt.bpmn.ChoreographyTask;
import org.eclipse.mdt.bpmn.Collaboration;
import org.eclipse.mdt.bpmn.Communication;
import org.eclipse.mdt.bpmn.CompensateEventDefinition;
import org.eclipse.mdt.bpmn.ComplexBehaviorDefinition;
import org.eclipse.mdt.bpmn.ComplexGateway;
import org.eclipse.mdt.bpmn.ConditionalEventDefinition;
import org.eclipse.mdt.bpmn.Conversation;
import org.eclipse.mdt.bpmn.ConversationAssociation;
import org.eclipse.mdt.bpmn.ConversationNode;
import org.eclipse.mdt.bpmn.CorrelationKey;
import org.eclipse.mdt.bpmn.CorrelationProperty;
import org.eclipse.mdt.bpmn.CorrelationPropertyBinding;
import org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression;
import org.eclipse.mdt.bpmn.CorrelationSubscription;
import org.eclipse.mdt.bpmn.DataAssociation;
import org.eclipse.mdt.bpmn.DataInput;
import org.eclipse.mdt.bpmn.DataInputAssociation;
import org.eclipse.mdt.bpmn.DataObject;
import org.eclipse.mdt.bpmn.DataOutput;
import org.eclipse.mdt.bpmn.DataOutputAssociation;
import org.eclipse.mdt.bpmn.DataState;
import org.eclipse.mdt.bpmn.DataStore;
import org.eclipse.mdt.bpmn.DataStoreReference;
import org.eclipse.mdt.bpmn.Definitions;
import org.eclipse.mdt.bpmn.DocumentRoot;
import org.eclipse.mdt.bpmn.Documentation;
import org.eclipse.mdt.bpmn.EndEvent;
import org.eclipse.mdt.bpmn.EndPoint;
import org.eclipse.mdt.bpmn.ErrorEventDefinition;
import org.eclipse.mdt.bpmn.Escalation;
import org.eclipse.mdt.bpmn.EscalationEventDefinition;
import org.eclipse.mdt.bpmn.Event;
import org.eclipse.mdt.bpmn.EventBasedGateway;
import org.eclipse.mdt.bpmn.EventDefinition;
import org.eclipse.mdt.bpmn.ExclusiveGateway;
import org.eclipse.mdt.bpmn.Expression;
import org.eclipse.mdt.bpmn.Extension;
import org.eclipse.mdt.bpmn.FlowElement;
import org.eclipse.mdt.bpmn.FlowNode;
import org.eclipse.mdt.bpmn.FormalExpression;
import org.eclipse.mdt.bpmn.Gateway;
import org.eclipse.mdt.bpmn.GlobalBusinessRuleTask;
import org.eclipse.mdt.bpmn.GlobalChoreographyTask;
import org.eclipse.mdt.bpmn.GlobalCommunication;
import org.eclipse.mdt.bpmn.GlobalManualTask;
import org.eclipse.mdt.bpmn.GlobalScriptTask;
import org.eclipse.mdt.bpmn.GlobalTask;
import org.eclipse.mdt.bpmn.GlobalUserTask;
import org.eclipse.mdt.bpmn.Group;
import org.eclipse.mdt.bpmn.HumanPerformer;
import org.eclipse.mdt.bpmn.ImplicitThrowEvent;
import org.eclipse.mdt.bpmn.Import;
import org.eclipse.mdt.bpmn.InclusiveGateway;
import org.eclipse.mdt.bpmn.InputOutputBinding;
import org.eclipse.mdt.bpmn.InputOutputSpecification;
import org.eclipse.mdt.bpmn.InputSet;
import org.eclipse.mdt.bpmn.Interface;
import org.eclipse.mdt.bpmn.IntermediateCatchEvent;
import org.eclipse.mdt.bpmn.IntermediateThrowEvent;
import org.eclipse.mdt.bpmn.ItemDefinition;
import org.eclipse.mdt.bpmn.Lane;
import org.eclipse.mdt.bpmn.LaneSet;
import org.eclipse.mdt.bpmn.LinkEventDefinition;
import org.eclipse.mdt.bpmn.LoopCharacteristics;
import org.eclipse.mdt.bpmn.ManualTask;
import org.eclipse.mdt.bpmn.Message;
import org.eclipse.mdt.bpmn.MessageEventDefinition;
import org.eclipse.mdt.bpmn.MessageFlow;
import org.eclipse.mdt.bpmn.MessageFlowAssociation;
import org.eclipse.mdt.bpmn.Monitoring;
import org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics;
import org.eclipse.mdt.bpmn.Operation;
import org.eclipse.mdt.bpmn.OutputSet;
import org.eclipse.mdt.bpmn.ParallelGateway;
import org.eclipse.mdt.bpmn.Participant;
import org.eclipse.mdt.bpmn.ParticipantAssociation;
import org.eclipse.mdt.bpmn.ParticipantMultiplicity;
import org.eclipse.mdt.bpmn.PartnerEntity;
import org.eclipse.mdt.bpmn.PartnerRole;
import org.eclipse.mdt.bpmn.Performer;
import org.eclipse.mdt.bpmn.PotentialOwner;
import org.eclipse.mdt.bpmn.Property;
import org.eclipse.mdt.bpmn.ReceiveTask;
import org.eclipse.mdt.bpmn.Relationship;
import org.eclipse.mdt.bpmn.Rendering;
import org.eclipse.mdt.bpmn.Resource;
import org.eclipse.mdt.bpmn.ResourceAssignmentExpression;
import org.eclipse.mdt.bpmn.ResourceParameter;
import org.eclipse.mdt.bpmn.ResourceParameterBinding;
import org.eclipse.mdt.bpmn.RootElement;
import org.eclipse.mdt.bpmn.Script;
import org.eclipse.mdt.bpmn.ScriptTask;
import org.eclipse.mdt.bpmn.SendTask;
import org.eclipse.mdt.bpmn.SequenceFlow;
import org.eclipse.mdt.bpmn.ServiceTask;
import org.eclipse.mdt.bpmn.Signal;
import org.eclipse.mdt.bpmn.SignalEventDefinition;
import org.eclipse.mdt.bpmn.StandardLoopCharacteristics;
import org.eclipse.mdt.bpmn.StartEvent;
import org.eclipse.mdt.bpmn.SubConversation;
import org.eclipse.mdt.bpmn.SubProcess;
import org.eclipse.mdt.bpmn.Task;
import org.eclipse.mdt.bpmn.TerminateEventDefinition;
import org.eclipse.mdt.bpmn.Text;
import org.eclipse.mdt.bpmn.TextAnnotation;
import org.eclipse.mdt.bpmn.ThrowEvent;
import org.eclipse.mdt.bpmn.TimerEventDefinition;
import org.eclipse.mdt.bpmn.Transaction;
import org.eclipse.mdt.bpmn.UserTask;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.mdt.bpmn.BpmnPackage
 * @generated
 */
public class BpmnAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static BpmnPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BpmnAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = BpmnPackage.eINSTANCE;
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
    protected BpmnSwitch<Adapter> modelSwitch = new BpmnSwitch<Adapter>() {
        @Override
        public Adapter caseDocumentRoot(DocumentRoot object) {
            return createDocumentRootAdapter();
        }

        @Override
        public Adapter caseActivity(Activity object) {
            return createActivityAdapter();
        }

        @Override
        public Adapter caseActivityResource(ActivityResource object) {
            return createActivityResourceAdapter();
        }

        @Override
        public Adapter caseAdHocSubProcess(AdHocSubProcess object) {
            return createAdHocSubProcessAdapter();
        }

        @Override
        public Adapter caseArtifact(Artifact object) {
            return createArtifactAdapter();
        }

        @Override
        public Adapter caseAssignment(Assignment object) {
            return createAssignmentAdapter();
        }

        @Override
        public Adapter caseAssociation(Association object) {
            return createAssociationAdapter();
        }

        @Override
        public Adapter caseAuditing(Auditing object) {
            return createAuditingAdapter();
        }

        @Override
        public Adapter caseBaseElement(BaseElement object) {
            return createBaseElementAdapter();
        }

        @Override
        public Adapter caseBaseElementWithMixedContent(
                BaseElementWithMixedContent object) {
            return createBaseElementWithMixedContentAdapter();
        }

        @Override
        public Adapter caseBoundaryEvent(BoundaryEvent object) {
            return createBoundaryEventAdapter();
        }

        @Override
        public Adapter caseBusinessRuleTask(BusinessRuleTask object) {
            return createBusinessRuleTaskAdapter();
        }

        @Override
        public Adapter caseCallableElement(CallableElement object) {
            return createCallableElementAdapter();
        }

        @Override
        public Adapter caseCallActivity(CallActivity object) {
            return createCallActivityAdapter();
        }

        @Override
        public Adapter caseCallChoreographyActivity(
                CallChoreographyActivity object) {
            return createCallChoreographyActivityAdapter();
        }

        @Override
        public Adapter caseCallConversation(CallConversation object) {
            return createCallConversationAdapter();
        }

        @Override
        public Adapter caseCancelEventDefinition(CancelEventDefinition object) {
            return createCancelEventDefinitionAdapter();
        }

        @Override
        public Adapter caseCatchEvent(CatchEvent object) {
            return createCatchEventAdapter();
        }

        @Override
        public Adapter caseCategory(Category object) {
            return createCategoryAdapter();
        }

        @Override
        public Adapter caseCategoryValue(CategoryValue object) {
            return createCategoryValueAdapter();
        }

        @Override
        public Adapter caseChoreography(Choreography object) {
            return createChoreographyAdapter();
        }

        @Override
        public Adapter caseChoreographyActivity(ChoreographyActivity object) {
            return createChoreographyActivityAdapter();
        }

        @Override
        public Adapter caseChoreographySubProcess(ChoreographySubProcess object) {
            return createChoreographySubProcessAdapter();
        }

        @Override
        public Adapter caseChoreographyTask(ChoreographyTask object) {
            return createChoreographyTaskAdapter();
        }

        @Override
        public Adapter caseCollaboration(Collaboration object) {
            return createCollaborationAdapter();
        }

        @Override
        public Adapter caseCommunication(Communication object) {
            return createCommunicationAdapter();
        }

        @Override
        public Adapter caseCompensateEventDefinition(
                CompensateEventDefinition object) {
            return createCompensateEventDefinitionAdapter();
        }

        @Override
        public Adapter caseComplexBehaviorDefinition(
                ComplexBehaviorDefinition object) {
            return createComplexBehaviorDefinitionAdapter();
        }

        @Override
        public Adapter caseComplexGateway(ComplexGateway object) {
            return createComplexGatewayAdapter();
        }

        @Override
        public Adapter caseConditionalEventDefinition(
                ConditionalEventDefinition object) {
            return createConditionalEventDefinitionAdapter();
        }

        @Override
        public Adapter caseConversation(Conversation object) {
            return createConversationAdapter();
        }

        @Override
        public Adapter caseConversationAssociation(
                ConversationAssociation object) {
            return createConversationAssociationAdapter();
        }

        @Override
        public Adapter caseConversationNode(ConversationNode object) {
            return createConversationNodeAdapter();
        }

        @Override
        public Adapter caseCorrelationKey(CorrelationKey object) {
            return createCorrelationKeyAdapter();
        }

        @Override
        public Adapter caseCorrelationProperty(CorrelationProperty object) {
            return createCorrelationPropertyAdapter();
        }

        @Override
        public Adapter caseCorrelationPropertyBinding(
                CorrelationPropertyBinding object) {
            return createCorrelationPropertyBindingAdapter();
        }

        @Override
        public Adapter caseCorrelationPropertyRetrievalExpression(
                CorrelationPropertyRetrievalExpression object) {
            return createCorrelationPropertyRetrievalExpressionAdapter();
        }

        @Override
        public Adapter caseCorrelationSubscription(
                CorrelationSubscription object) {
            return createCorrelationSubscriptionAdapter();
        }

        @Override
        public Adapter caseDataAssociation(DataAssociation object) {
            return createDataAssociationAdapter();
        }

        @Override
        public Adapter caseDataInput(DataInput object) {
            return createDataInputAdapter();
        }

        @Override
        public Adapter caseDataInputAssociation(DataInputAssociation object) {
            return createDataInputAssociationAdapter();
        }

        @Override
        public Adapter caseDataObject(DataObject object) {
            return createDataObjectAdapter();
        }

        @Override
        public Adapter caseDataOutput(DataOutput object) {
            return createDataOutputAdapter();
        }

        @Override
        public Adapter caseDataOutputAssociation(DataOutputAssociation object) {
            return createDataOutputAssociationAdapter();
        }

        @Override
        public Adapter caseDataState(DataState object) {
            return createDataStateAdapter();
        }

        @Override
        public Adapter caseDataStore(DataStore object) {
            return createDataStoreAdapter();
        }

        @Override
        public Adapter caseDataStoreReference(DataStoreReference object) {
            return createDataStoreReferenceAdapter();
        }

        @Override
        public Adapter caseDefinitions(Definitions object) {
            return createDefinitionsAdapter();
        }

        @Override
        public Adapter caseDocumentation(Documentation object) {
            return createDocumentationAdapter();
        }

        @Override
        public Adapter caseEndEvent(EndEvent object) {
            return createEndEventAdapter();
        }

        @Override
        public Adapter caseEndPoint(EndPoint object) {
            return createEndPointAdapter();
        }

        @Override
        public Adapter caseError(org.eclipse.mdt.bpmn.Error object) {
            return createErrorAdapter();
        }

        @Override
        public Adapter caseErrorEventDefinition(ErrorEventDefinition object) {
            return createErrorEventDefinitionAdapter();
        }

        @Override
        public Adapter caseEscalation(Escalation object) {
            return createEscalationAdapter();
        }

        @Override
        public Adapter caseEscalationEventDefinition(
                EscalationEventDefinition object) {
            return createEscalationEventDefinitionAdapter();
        }

        @Override
        public Adapter caseEvent(Event object) {
            return createEventAdapter();
        }

        @Override
        public Adapter caseEventBasedGateway(EventBasedGateway object) {
            return createEventBasedGatewayAdapter();
        }

        @Override
        public Adapter caseEventDefinition(EventDefinition object) {
            return createEventDefinitionAdapter();
        }

        @Override
        public Adapter caseExclusiveGateway(ExclusiveGateway object) {
            return createExclusiveGatewayAdapter();
        }

        @Override
        public Adapter caseExpression(Expression object) {
            return createExpressionAdapter();
        }

        @Override
        public Adapter caseExtension(Extension object) {
            return createExtensionAdapter();
        }

        @Override
        public Adapter caseFlowElement(FlowElement object) {
            return createFlowElementAdapter();
        }

        @Override
        public Adapter caseFlowNode(FlowNode object) {
            return createFlowNodeAdapter();
        }

        @Override
        public Adapter caseFormalExpression(FormalExpression object) {
            return createFormalExpressionAdapter();
        }

        @Override
        public Adapter caseGateway(Gateway object) {
            return createGatewayAdapter();
        }

        @Override
        public Adapter caseGlobalBusinessRuleTask(GlobalBusinessRuleTask object) {
            return createGlobalBusinessRuleTaskAdapter();
        }

        @Override
        public Adapter caseGlobalChoreographyTask(GlobalChoreographyTask object) {
            return createGlobalChoreographyTaskAdapter();
        }

        @Override
        public Adapter caseGlobalCommunication(GlobalCommunication object) {
            return createGlobalCommunicationAdapter();
        }

        @Override
        public Adapter caseGlobalManualTask(GlobalManualTask object) {
            return createGlobalManualTaskAdapter();
        }

        @Override
        public Adapter caseGlobalScriptTask(GlobalScriptTask object) {
            return createGlobalScriptTaskAdapter();
        }

        @Override
        public Adapter caseGlobalTask(GlobalTask object) {
            return createGlobalTaskAdapter();
        }

        @Override
        public Adapter caseGlobalUserTask(GlobalUserTask object) {
            return createGlobalUserTaskAdapter();
        }

        @Override
        public Adapter caseGroup(Group object) {
            return createGroupAdapter();
        }

        @Override
        public Adapter caseHumanPerformer(HumanPerformer object) {
            return createHumanPerformerAdapter();
        }

        @Override
        public Adapter caseImplicitThrowEvent(ImplicitThrowEvent object) {
            return createImplicitThrowEventAdapter();
        }

        @Override
        public Adapter caseImport(Import object) {
            return createImportAdapter();
        }

        @Override
        public Adapter caseInclusiveGateway(InclusiveGateway object) {
            return createInclusiveGatewayAdapter();
        }

        @Override
        public Adapter caseInputOutputBinding(InputOutputBinding object) {
            return createInputOutputBindingAdapter();
        }

        @Override
        public Adapter caseInputOutputSpecification(
                InputOutputSpecification object) {
            return createInputOutputSpecificationAdapter();
        }

        @Override
        public Adapter caseInputSet(InputSet object) {
            return createInputSetAdapter();
        }

        @Override
        public Adapter caseInterface(Interface object) {
            return createInterfaceAdapter();
        }

        @Override
        public Adapter caseIntermediateCatchEvent(IntermediateCatchEvent object) {
            return createIntermediateCatchEventAdapter();
        }

        @Override
        public Adapter caseIntermediateThrowEvent(IntermediateThrowEvent object) {
            return createIntermediateThrowEventAdapter();
        }

        @Override
        public Adapter caseItemDefinition(ItemDefinition object) {
            return createItemDefinitionAdapter();
        }

        @Override
        public Adapter caseLane(Lane object) {
            return createLaneAdapter();
        }

        @Override
        public Adapter caseLaneSet(LaneSet object) {
            return createLaneSetAdapter();
        }

        @Override
        public Adapter caseLinkEventDefinition(LinkEventDefinition object) {
            return createLinkEventDefinitionAdapter();
        }

        @Override
        public Adapter caseLoopCharacteristics(LoopCharacteristics object) {
            return createLoopCharacteristicsAdapter();
        }

        @Override
        public Adapter caseManualTask(ManualTask object) {
            return createManualTaskAdapter();
        }

        @Override
        public Adapter caseMessage(Message object) {
            return createMessageAdapter();
        }

        @Override
        public Adapter caseMessageEventDefinition(MessageEventDefinition object) {
            return createMessageEventDefinitionAdapter();
        }

        @Override
        public Adapter caseMessageFlow(MessageFlow object) {
            return createMessageFlowAdapter();
        }

        @Override
        public Adapter caseMessageFlowAssociation(MessageFlowAssociation object) {
            return createMessageFlowAssociationAdapter();
        }

        @Override
        public Adapter caseMonitoring(Monitoring object) {
            return createMonitoringAdapter();
        }

        @Override
        public Adapter caseMultiInstanceLoopCharacteristics(
                MultiInstanceLoopCharacteristics object) {
            return createMultiInstanceLoopCharacteristicsAdapter();
        }

        @Override
        public Adapter caseOperation(Operation object) {
            return createOperationAdapter();
        }

        @Override
        public Adapter caseOutputSet(OutputSet object) {
            return createOutputSetAdapter();
        }

        @Override
        public Adapter caseParallelGateway(ParallelGateway object) {
            return createParallelGatewayAdapter();
        }

        @Override
        public Adapter caseParticipant(Participant object) {
            return createParticipantAdapter();
        }

        @Override
        public Adapter caseParticipantAssociation(ParticipantAssociation object) {
            return createParticipantAssociationAdapter();
        }

        @Override
        public Adapter caseParticipantMultiplicity(
                ParticipantMultiplicity object) {
            return createParticipantMultiplicityAdapter();
        }

        @Override
        public Adapter casePartnerEntity(PartnerEntity object) {
            return createPartnerEntityAdapter();
        }

        @Override
        public Adapter casePartnerRole(PartnerRole object) {
            return createPartnerRoleAdapter();
        }

        @Override
        public Adapter casePerformer(Performer object) {
            return createPerformerAdapter();
        }

        @Override
        public Adapter casePotentialOwner(PotentialOwner object) {
            return createPotentialOwnerAdapter();
        }

        @Override
        public Adapter caseProcess(org.eclipse.mdt.bpmn.Process object) {
            return createProcessAdapter();
        }

        @Override
        public Adapter caseProperty(Property object) {
            return createPropertyAdapter();
        }

        @Override
        public Adapter caseReceiveTask(ReceiveTask object) {
            return createReceiveTaskAdapter();
        }

        @Override
        public Adapter caseRelationship(Relationship object) {
            return createRelationshipAdapter();
        }

        @Override
        public Adapter caseRendering(Rendering object) {
            return createRenderingAdapter();
        }

        @Override
        public Adapter caseResource(Resource object) {
            return createResourceAdapter();
        }

        @Override
        public Adapter caseResourceAssignmentExpression(
                ResourceAssignmentExpression object) {
            return createResourceAssignmentExpressionAdapter();
        }

        @Override
        public Adapter caseResourceParameter(ResourceParameter object) {
            return createResourceParameterAdapter();
        }

        @Override
        public Adapter caseResourceParameterBinding(
                ResourceParameterBinding object) {
            return createResourceParameterBindingAdapter();
        }

        @Override
        public Adapter caseRootElement(RootElement object) {
            return createRootElementAdapter();
        }

        @Override
        public Adapter caseScript(Script object) {
            return createScriptAdapter();
        }

        @Override
        public Adapter caseScriptTask(ScriptTask object) {
            return createScriptTaskAdapter();
        }

        @Override
        public Adapter caseSendTask(SendTask object) {
            return createSendTaskAdapter();
        }

        @Override
        public Adapter caseSequenceFlow(SequenceFlow object) {
            return createSequenceFlowAdapter();
        }

        @Override
        public Adapter caseServiceTask(ServiceTask object) {
            return createServiceTaskAdapter();
        }

        @Override
        public Adapter caseSignal(Signal object) {
            return createSignalAdapter();
        }

        @Override
        public Adapter caseSignalEventDefinition(SignalEventDefinition object) {
            return createSignalEventDefinitionAdapter();
        }

        @Override
        public Adapter caseStandardLoopCharacteristics(
                StandardLoopCharacteristics object) {
            return createStandardLoopCharacteristicsAdapter();
        }

        @Override
        public Adapter caseStartEvent(StartEvent object) {
            return createStartEventAdapter();
        }

        @Override
        public Adapter caseSubConversation(SubConversation object) {
            return createSubConversationAdapter();
        }

        @Override
        public Adapter caseSubProcess(SubProcess object) {
            return createSubProcessAdapter();
        }

        @Override
        public Adapter caseTask(Task object) {
            return createTaskAdapter();
        }

        @Override
        public Adapter caseTerminateEventDefinition(
                TerminateEventDefinition object) {
            return createTerminateEventDefinitionAdapter();
        }

        @Override
        public Adapter caseText(Text object) {
            return createTextAdapter();
        }

        @Override
        public Adapter caseTextAnnotation(TextAnnotation object) {
            return createTextAnnotationAdapter();
        }

        @Override
        public Adapter caseThrowEvent(ThrowEvent object) {
            return createThrowEventAdapter();
        }

        @Override
        public Adapter caseTimerEventDefinition(TimerEventDefinition object) {
            return createTimerEventDefinitionAdapter();
        }

        @Override
        public Adapter caseTransaction(Transaction object) {
            return createTransactionAdapter();
        }

        @Override
        public Adapter caseUserTask(UserTask object) {
            return createUserTaskAdapter();
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
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.DocumentRoot <em>Document Root</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.DocumentRoot
     * @generated
     */
    public Adapter createDocumentRootAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Activity <em>Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Activity
     * @generated
     */
    public Adapter createActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ActivityResource <em>Activity Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ActivityResource
     * @generated
     */
    public Adapter createActivityResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.AdHocSubProcess <em>Ad Hoc Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.AdHocSubProcess
     * @generated
     */
    public Adapter createAdHocSubProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Artifact <em>Artifact</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Artifact
     * @generated
     */
    public Adapter createArtifactAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Assignment <em>Assignment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Assignment
     * @generated
     */
    public Adapter createAssignmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Association <em>Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Association
     * @generated
     */
    public Adapter createAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Auditing <em>Auditing</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Auditing
     * @generated
     */
    public Adapter createAuditingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.BaseElement <em>Base Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.BaseElement
     * @generated
     */
    public Adapter createBaseElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.BaseElementWithMixedContent <em>Base Element With Mixed Content</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.BaseElementWithMixedContent
     * @generated
     */
    public Adapter createBaseElementWithMixedContentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.BoundaryEvent <em>Boundary Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.BoundaryEvent
     * @generated
     */
    public Adapter createBoundaryEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.BusinessRuleTask <em>Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.BusinessRuleTask
     * @generated
     */
    public Adapter createBusinessRuleTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.CallableElement <em>Callable Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.CallableElement
     * @generated
     */
    public Adapter createCallableElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.CallActivity <em>Call Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.CallActivity
     * @generated
     */
    public Adapter createCallActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.CallChoreographyActivity <em>Call Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.CallChoreographyActivity
     * @generated
     */
    public Adapter createCallChoreographyActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.CallConversation <em>Call Conversation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.CallConversation
     * @generated
     */
    public Adapter createCallConversationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.CancelEventDefinition <em>Cancel Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.CancelEventDefinition
     * @generated
     */
    public Adapter createCancelEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.CatchEvent <em>Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.CatchEvent
     * @generated
     */
    public Adapter createCatchEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Category <em>Category</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Category
     * @generated
     */
    public Adapter createCategoryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.CategoryValue <em>Category Value</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.CategoryValue
     * @generated
     */
    public Adapter createCategoryValueAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Choreography <em>Choreography</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Choreography
     * @generated
     */
    public Adapter createChoreographyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ChoreographyActivity <em>Choreography Activity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ChoreographyActivity
     * @generated
     */
    public Adapter createChoreographyActivityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ChoreographySubProcess <em>Choreography Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ChoreographySubProcess
     * @generated
     */
    public Adapter createChoreographySubProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ChoreographyTask <em>Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ChoreographyTask
     * @generated
     */
    public Adapter createChoreographyTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Collaboration <em>Collaboration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Collaboration
     * @generated
     */
    public Adapter createCollaborationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Communication <em>Communication</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Communication
     * @generated
     */
    public Adapter createCommunicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.CompensateEventDefinition <em>Compensate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.CompensateEventDefinition
     * @generated
     */
    public Adapter createCompensateEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ComplexBehaviorDefinition <em>Complex Behavior Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ComplexBehaviorDefinition
     * @generated
     */
    public Adapter createComplexBehaviorDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ComplexGateway <em>Complex Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ComplexGateway
     * @generated
     */
    public Adapter createComplexGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ConditionalEventDefinition <em>Conditional Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ConditionalEventDefinition
     * @generated
     */
    public Adapter createConditionalEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Conversation <em>Conversation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Conversation
     * @generated
     */
    public Adapter createConversationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ConversationAssociation <em>Conversation Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ConversationAssociation
     * @generated
     */
    public Adapter createConversationAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ConversationNode <em>Conversation Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ConversationNode
     * @generated
     */
    public Adapter createConversationNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.CorrelationKey <em>Correlation Key</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.CorrelationKey
     * @generated
     */
    public Adapter createCorrelationKeyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.CorrelationProperty <em>Correlation Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.CorrelationProperty
     * @generated
     */
    public Adapter createCorrelationPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.CorrelationPropertyBinding <em>Correlation Property Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.CorrelationPropertyBinding
     * @generated
     */
    public Adapter createCorrelationPropertyBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression <em>Correlation Property Retrieval Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.CorrelationPropertyRetrievalExpression
     * @generated
     */
    public Adapter createCorrelationPropertyRetrievalExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.CorrelationSubscription <em>Correlation Subscription</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.CorrelationSubscription
     * @generated
     */
    public Adapter createCorrelationSubscriptionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.DataAssociation <em>Data Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.DataAssociation
     * @generated
     */
    public Adapter createDataAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.DataInput <em>Data Input</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.DataInput
     * @generated
     */
    public Adapter createDataInputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.DataInputAssociation <em>Data Input Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.DataInputAssociation
     * @generated
     */
    public Adapter createDataInputAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.DataObject <em>Data Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.DataObject
     * @generated
     */
    public Adapter createDataObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.DataOutput <em>Data Output</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.DataOutput
     * @generated
     */
    public Adapter createDataOutputAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.DataOutputAssociation <em>Data Output Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.DataOutputAssociation
     * @generated
     */
    public Adapter createDataOutputAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.DataState <em>Data State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.DataState
     * @generated
     */
    public Adapter createDataStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.DataStore <em>Data Store</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.DataStore
     * @generated
     */
    public Adapter createDataStoreAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.DataStoreReference <em>Data Store Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.DataStoreReference
     * @generated
     */
    public Adapter createDataStoreReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Definitions <em>Definitions</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Definitions
     * @generated
     */
    public Adapter createDefinitionsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Documentation <em>Documentation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Documentation
     * @generated
     */
    public Adapter createDocumentationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.EndEvent <em>End Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.EndEvent
     * @generated
     */
    public Adapter createEndEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.EndPoint <em>End Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.EndPoint
     * @generated
     */
    public Adapter createEndPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Error <em>Error</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Error
     * @generated
     */
    public Adapter createErrorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ErrorEventDefinition <em>Error Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ErrorEventDefinition
     * @generated
     */
    public Adapter createErrorEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Escalation <em>Escalation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Escalation
     * @generated
     */
    public Adapter createEscalationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.EscalationEventDefinition <em>Escalation Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.EscalationEventDefinition
     * @generated
     */
    public Adapter createEscalationEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Event <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Event
     * @generated
     */
    public Adapter createEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.EventBasedGateway <em>Event Based Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.EventBasedGateway
     * @generated
     */
    public Adapter createEventBasedGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.EventDefinition <em>Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.EventDefinition
     * @generated
     */
    public Adapter createEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ExclusiveGateway <em>Exclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ExclusiveGateway
     * @generated
     */
    public Adapter createExclusiveGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Expression <em>Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Expression
     * @generated
     */
    public Adapter createExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Extension <em>Extension</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Extension
     * @generated
     */
    public Adapter createExtensionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.FlowElement <em>Flow Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.FlowElement
     * @generated
     */
    public Adapter createFlowElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.FlowNode <em>Flow Node</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.FlowNode
     * @generated
     */
    public Adapter createFlowNodeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.FormalExpression <em>Formal Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.FormalExpression
     * @generated
     */
    public Adapter createFormalExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Gateway <em>Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Gateway
     * @generated
     */
    public Adapter createGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.GlobalBusinessRuleTask <em>Global Business Rule Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.GlobalBusinessRuleTask
     * @generated
     */
    public Adapter createGlobalBusinessRuleTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.GlobalChoreographyTask <em>Global Choreography Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.GlobalChoreographyTask
     * @generated
     */
    public Adapter createGlobalChoreographyTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.GlobalCommunication <em>Global Communication</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.GlobalCommunication
     * @generated
     */
    public Adapter createGlobalCommunicationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.GlobalManualTask <em>Global Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.GlobalManualTask
     * @generated
     */
    public Adapter createGlobalManualTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.GlobalScriptTask <em>Global Script Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.GlobalScriptTask
     * @generated
     */
    public Adapter createGlobalScriptTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.GlobalTask <em>Global Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.GlobalTask
     * @generated
     */
    public Adapter createGlobalTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.GlobalUserTask <em>Global User Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.GlobalUserTask
     * @generated
     */
    public Adapter createGlobalUserTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Group <em>Group</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Group
     * @generated
     */
    public Adapter createGroupAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.HumanPerformer <em>Human Performer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.HumanPerformer
     * @generated
     */
    public Adapter createHumanPerformerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ImplicitThrowEvent <em>Implicit Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ImplicitThrowEvent
     * @generated
     */
    public Adapter createImplicitThrowEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Import <em>Import</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Import
     * @generated
     */
    public Adapter createImportAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.InclusiveGateway <em>Inclusive Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.InclusiveGateway
     * @generated
     */
    public Adapter createInclusiveGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.InputOutputBinding <em>Input Output Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.InputOutputBinding
     * @generated
     */
    public Adapter createInputOutputBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.InputOutputSpecification <em>Input Output Specification</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.InputOutputSpecification
     * @generated
     */
    public Adapter createInputOutputSpecificationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.InputSet <em>Input Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.InputSet
     * @generated
     */
    public Adapter createInputSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Interface <em>Interface</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Interface
     * @generated
     */
    public Adapter createInterfaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.IntermediateCatchEvent <em>Intermediate Catch Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.IntermediateCatchEvent
     * @generated
     */
    public Adapter createIntermediateCatchEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.IntermediateThrowEvent <em>Intermediate Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.IntermediateThrowEvent
     * @generated
     */
    public Adapter createIntermediateThrowEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ItemDefinition <em>Item Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ItemDefinition
     * @generated
     */
    public Adapter createItemDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Lane <em>Lane</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Lane
     * @generated
     */
    public Adapter createLaneAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.LaneSet <em>Lane Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.LaneSet
     * @generated
     */
    public Adapter createLaneSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.LinkEventDefinition <em>Link Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.LinkEventDefinition
     * @generated
     */
    public Adapter createLinkEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.LoopCharacteristics <em>Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.LoopCharacteristics
     * @generated
     */
    public Adapter createLoopCharacteristicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ManualTask <em>Manual Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ManualTask
     * @generated
     */
    public Adapter createManualTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Message <em>Message</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Message
     * @generated
     */
    public Adapter createMessageAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.MessageEventDefinition <em>Message Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.MessageEventDefinition
     * @generated
     */
    public Adapter createMessageEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.MessageFlow <em>Message Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.MessageFlow
     * @generated
     */
    public Adapter createMessageFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.MessageFlowAssociation <em>Message Flow Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.MessageFlowAssociation
     * @generated
     */
    public Adapter createMessageFlowAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Monitoring <em>Monitoring</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Monitoring
     * @generated
     */
    public Adapter createMonitoringAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics <em>Multi Instance Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.MultiInstanceLoopCharacteristics
     * @generated
     */
    public Adapter createMultiInstanceLoopCharacteristicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Operation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Operation
     * @generated
     */
    public Adapter createOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.OutputSet <em>Output Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.OutputSet
     * @generated
     */
    public Adapter createOutputSetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ParallelGateway <em>Parallel Gateway</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ParallelGateway
     * @generated
     */
    public Adapter createParallelGatewayAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Participant <em>Participant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Participant
     * @generated
     */
    public Adapter createParticipantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ParticipantAssociation <em>Participant Association</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ParticipantAssociation
     * @generated
     */
    public Adapter createParticipantAssociationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ParticipantMultiplicity <em>Participant Multiplicity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ParticipantMultiplicity
     * @generated
     */
    public Adapter createParticipantMultiplicityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.PartnerEntity <em>Partner Entity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.PartnerEntity
     * @generated
     */
    public Adapter createPartnerEntityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.PartnerRole <em>Partner Role</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.PartnerRole
     * @generated
     */
    public Adapter createPartnerRoleAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Performer <em>Performer</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Performer
     * @generated
     */
    public Adapter createPerformerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.PotentialOwner <em>Potential Owner</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.PotentialOwner
     * @generated
     */
    public Adapter createPotentialOwnerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Process <em>Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Process
     * @generated
     */
    public Adapter createProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ReceiveTask <em>Receive Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ReceiveTask
     * @generated
     */
    public Adapter createReceiveTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Relationship <em>Relationship</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Relationship
     * @generated
     */
    public Adapter createRelationshipAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Rendering <em>Rendering</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Rendering
     * @generated
     */
    public Adapter createRenderingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Resource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Resource
     * @generated
     */
    public Adapter createResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ResourceAssignmentExpression <em>Resource Assignment Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ResourceAssignmentExpression
     * @generated
     */
    public Adapter createResourceAssignmentExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ResourceParameter <em>Resource Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ResourceParameter
     * @generated
     */
    public Adapter createResourceParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ResourceParameterBinding <em>Resource Parameter Binding</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ResourceParameterBinding
     * @generated
     */
    public Adapter createResourceParameterBindingAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.RootElement <em>Root Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.RootElement
     * @generated
     */
    public Adapter createRootElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Script <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Script
     * @generated
     */
    public Adapter createScriptAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ScriptTask <em>Script Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ScriptTask
     * @generated
     */
    public Adapter createScriptTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.SendTask <em>Send Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.SendTask
     * @generated
     */
    public Adapter createSendTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.SequenceFlow <em>Sequence Flow</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.SequenceFlow
     * @generated
     */
    public Adapter createSequenceFlowAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ServiceTask <em>Service Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ServiceTask
     * @generated
     */
    public Adapter createServiceTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Signal <em>Signal</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Signal
     * @generated
     */
    public Adapter createSignalAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.SignalEventDefinition <em>Signal Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.SignalEventDefinition
     * @generated
     */
    public Adapter createSignalEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.StandardLoopCharacteristics <em>Standard Loop Characteristics</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.StandardLoopCharacteristics
     * @generated
     */
    public Adapter createStandardLoopCharacteristicsAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.StartEvent <em>Start Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.StartEvent
     * @generated
     */
    public Adapter createStartEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.SubConversation <em>Sub Conversation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.SubConversation
     * @generated
     */
    public Adapter createSubConversationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.SubProcess <em>Sub Process</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.SubProcess
     * @generated
     */
    public Adapter createSubProcessAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Task <em>Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Task
     * @generated
     */
    public Adapter createTaskAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.TerminateEventDefinition <em>Terminate Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.TerminateEventDefinition
     * @generated
     */
    public Adapter createTerminateEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Text <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Text
     * @generated
     */
    public Adapter createTextAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.TextAnnotation <em>Text Annotation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.TextAnnotation
     * @generated
     */
    public Adapter createTextAnnotationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.ThrowEvent <em>Throw Event</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.ThrowEvent
     * @generated
     */
    public Adapter createThrowEventAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.TimerEventDefinition <em>Timer Event Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.TimerEventDefinition
     * @generated
     */
    public Adapter createTimerEventDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.Transaction <em>Transaction</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.Transaction
     * @generated
     */
    public Adapter createTransactionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.mdt.bpmn.UserTask <em>User Task</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.mdt.bpmn.UserTask
     * @generated
     */
    public Adapter createUserTaskAdapter() {
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

} //BpmnAdapterFactory
