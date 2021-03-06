/*******************************************************************************
 * Copyright (c) 2013-2016 Jean-Marie Gauthier, University of Franche-Comte, and Samares-Engineering
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Jean-Marie Gauthier, University of Franche-Comte - initial API and implementation
 * Jean-Marie Gauthier, Samares-Engineering - Neon implementation
 *******************************************************************************/
/**
 */
package edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl;

import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ConstrainedByClause;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.ModelicaPart;
import edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.modelicaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constrained By Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConstrainedByClauseImpl#getModification <em>Modification</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConstrainedByClauseImpl#getOwnerInstance <em>Owner Instance</em>}</li>
 *   <li>{@link edu.ufc.femtost.disc.sysml4modelica.modelicametamodel.modelica.impl.ConstrainedByClauseImpl#getInstanceForConstrainedBy <em>Instance For Constrained By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstrainedByClauseImpl extends EObjectImpl implements ConstrainedByClause {
	/**
	 * The default value of the '{@link #getModification() <em>Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModification()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModification() <em>Modification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModification()
	 * @generated
	 * @ordered
	 */
	protected String modification = MODIFICATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstanceForConstrainedBy() <em>Instance For Constrained By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceForConstrainedBy()
	 * @generated
	 * @ordered
	 */
	protected ModelicaPart instanceForConstrainedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstrainedByClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return modelicaPackage.Literals.CONSTRAINED_BY_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModification() {
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModification(String newModification) {
		String oldModification = modification;
		modification = newModification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.CONSTRAINED_BY_CLAUSE__MODIFICATION, oldModification, modification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPart getOwnerInstance() {
		if (eContainerFeatureID() != modelicaPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE) return null;
		return (ModelicaPart)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnerInstance(ModelicaPart newOwnerInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwnerInstance, modelicaPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerInstance(ModelicaPart newOwnerInstance) {
		if (newOwnerInstance != eInternalContainer() || (eContainerFeatureID() != modelicaPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE && newOwnerInstance != null)) {
			if (EcoreUtil.isAncestor(this, newOwnerInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwnerInstance != null)
				msgs = ((InternalEObject)newOwnerInstance).eInverseAdd(this, modelicaPackage.MODELICA_PART__CONSTRAINED_BY, ModelicaPart.class, msgs);
			msgs = basicSetOwnerInstance(newOwnerInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE, newOwnerInstance, newOwnerInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPart getInstanceForConstrainedBy() {
		if (instanceForConstrainedBy != null && instanceForConstrainedBy.eIsProxy()) {
			InternalEObject oldInstanceForConstrainedBy = (InternalEObject)instanceForConstrainedBy;
			instanceForConstrainedBy = (ModelicaPart)eResolveProxy(oldInstanceForConstrainedBy);
			if (instanceForConstrainedBy != oldInstanceForConstrainedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, modelicaPackage.CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY, oldInstanceForConstrainedBy, instanceForConstrainedBy));
			}
		}
		return instanceForConstrainedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelicaPart basicGetInstanceForConstrainedBy() {
		return instanceForConstrainedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceForConstrainedBy(ModelicaPart newInstanceForConstrainedBy) {
		ModelicaPart oldInstanceForConstrainedBy = instanceForConstrainedBy;
		instanceForConstrainedBy = newInstanceForConstrainedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, modelicaPackage.CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY, oldInstanceForConstrainedBy, instanceForConstrainedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwnerInstance((ModelicaPart)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				return basicSetOwnerInstance(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				return eInternalContainer().eInverseRemove(this, modelicaPackage.MODELICA_PART__CONSTRAINED_BY, ModelicaPart.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__MODIFICATION:
				return getModification();
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				return getOwnerInstance();
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY:
				if (resolve) return getInstanceForConstrainedBy();
				return basicGetInstanceForConstrainedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__MODIFICATION:
				setModification((String)newValue);
				return;
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				setOwnerInstance((ModelicaPart)newValue);
				return;
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY:
				setInstanceForConstrainedBy((ModelicaPart)newValue);
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
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__MODIFICATION:
				setModification(MODIFICATION_EDEFAULT);
				return;
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				setOwnerInstance((ModelicaPart)null);
				return;
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY:
				setInstanceForConstrainedBy((ModelicaPart)null);
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
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__MODIFICATION:
				return MODIFICATION_EDEFAULT == null ? modification != null : !MODIFICATION_EDEFAULT.equals(modification);
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__OWNER_INSTANCE:
				return getOwnerInstance() != null;
			case modelicaPackage.CONSTRAINED_BY_CLAUSE__INSTANCE_FOR_CONSTRAINED_BY:
				return instanceForConstrainedBy != null;
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (modification: ");
		result.append(modification);
		result.append(')');
		return result.toString();
	}

} //ConstrainedByClauseImpl
