/**
 */
package org.palladiosimulator.metricspec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.metricspec.Identifier;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Textual Base Metric Description</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.impl.TextualBaseMetricDescriptionImpl#getIdentifiers
 * <em>Identifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextualBaseMetricDescriptionImpl extends BaseMetricDescriptionImpl implements TextualBaseMetricDescription {

    /**
     * The cached value of the '{@link #getIdentifiers() <em>Identifiers</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getIdentifiers()
     * @generated
     * @ordered
     */
    protected EList<Identifier> identifiers;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected TextualBaseMetricDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricSpecPackage.Literals.TEXTUAL_BASE_METRIC_DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Identifier> getIdentifiers() {
        if (this.identifiers == null) {
            this.identifiers = new EObjectContainmentWithInverseEList<Identifier>(Identifier.class, this,
                    MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS,
                    MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION);
        }
        return this.identifiers;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getIdentifiers()).basicAdd(otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS:
            return ((InternalEList<?>) this.getIdentifiers()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS:
            return this.getIdentifiers();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS:
            this.getIdentifiers().clear();
            this.getIdentifiers().addAll((Collection<? extends Identifier>) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS:
            this.getIdentifiers().clear();
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS:
            return this.identifiers != null && !this.identifiers.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // TextualBaseMetricDescriptionImpl
