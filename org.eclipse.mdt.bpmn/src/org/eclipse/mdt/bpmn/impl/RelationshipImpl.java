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

import java.util.Collection;

import javax.xml.namespace.QName;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.eclipse.mdt.bpmn.BpmnPackage;
import org.eclipse.mdt.bpmn.Relationship;
import org.eclipse.mdt.bpmn.RelationshipDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.RelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.RelationshipImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.eclipse.mdt.bpmn.impl.RelationshipImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends BaseElementImpl implements Relationship {
    /**
     * The cached value of the '{@link #getSource() <em>Source</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSource()
     * @generated
     * @ordered
     */
    protected EList<QName> source;

    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected EList<QName> target;

    /**
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final RelationshipDirection DIRECTION_EDEFAULT = RelationshipDirection.NONE;

    /**
     * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected RelationshipDirection direction = DIRECTION_EDEFAULT;

    /**
     * This is true if the Direction attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean directionESet;

    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RelationshipImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return BpmnPackage.eINSTANCE.getRelationship();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getSource() {
        if (source == null) {
            source = new EDataTypeEList<QName>(QName.class, this,
                    BpmnPackage.RELATIONSHIP__SOURCE);
        }
        return source;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<QName> getTarget() {
        if (target == null) {
            target = new EDataTypeEList<QName>(QName.class, this,
                    BpmnPackage.RELATIONSHIP__TARGET);
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RelationshipDirection getDirection() {
        return direction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDirection(RelationshipDirection newDirection) {
        RelationshipDirection oldDirection = direction;
        direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
        boolean oldDirectionESet = directionESet;
        directionESet = true;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.RELATIONSHIP__DIRECTION, oldDirection,
                    direction, !oldDirectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void unsetDirection() {
        RelationshipDirection oldDirection = direction;
        boolean oldDirectionESet = directionESet;
        direction = DIRECTION_EDEFAULT;
        directionESet = false;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.UNSET,
                    BpmnPackage.RELATIONSHIP__DIRECTION, oldDirection,
                    DIRECTION_EDEFAULT, oldDirectionESet));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isSetDirection() {
        return directionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET,
                    BpmnPackage.RELATIONSHIP__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
        case BpmnPackage.RELATIONSHIP__SOURCE:
            return getSource();
        case BpmnPackage.RELATIONSHIP__TARGET:
            return getTarget();
        case BpmnPackage.RELATIONSHIP__DIRECTION:
            return getDirection();
        case BpmnPackage.RELATIONSHIP__TYPE:
            return getType();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
        case BpmnPackage.RELATIONSHIP__SOURCE:
            getSource().clear();
            getSource().addAll((Collection<? extends QName>) newValue);
            return;
        case BpmnPackage.RELATIONSHIP__TARGET:
            getTarget().clear();
            getTarget().addAll((Collection<? extends QName>) newValue);
            return;
        case BpmnPackage.RELATIONSHIP__DIRECTION:
            setDirection((RelationshipDirection) newValue);
            return;
        case BpmnPackage.RELATIONSHIP__TYPE:
            setType((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
        case BpmnPackage.RELATIONSHIP__SOURCE:
            getSource().clear();
            return;
        case BpmnPackage.RELATIONSHIP__TARGET:
            getTarget().clear();
            return;
        case BpmnPackage.RELATIONSHIP__DIRECTION:
            unsetDirection();
            return;
        case BpmnPackage.RELATIONSHIP__TYPE:
            setType(TYPE_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
        case BpmnPackage.RELATIONSHIP__SOURCE:
            return source != null && !source.isEmpty();
        case BpmnPackage.RELATIONSHIP__TARGET:
            return target != null && !target.isEmpty();
        case BpmnPackage.RELATIONSHIP__DIRECTION:
            return isSetDirection();
        case BpmnPackage.RELATIONSHIP__TYPE:
            return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
                    .equals(type);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy())
            return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (source: "); //$NON-NLS-1$
        result.append(source);
        result.append(", target: "); //$NON-NLS-1$
        result.append(target);
        result.append(", direction: "); //$NON-NLS-1$
        if (directionESet)
            result.append(direction);
        else
            result.append("<unset>"); //$NON-NLS-1$
        result.append(", type: "); //$NON-NLS-1$
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //RelationshipImpl
