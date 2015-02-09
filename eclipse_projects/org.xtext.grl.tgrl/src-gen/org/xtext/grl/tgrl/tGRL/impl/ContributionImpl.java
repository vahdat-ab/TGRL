/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.grl.tgrl.tGRL.Contribution;
import org.xtext.grl.tgrl.tGRL.ContributionChange;
import org.xtext.grl.tgrl.tGRL.ContributionType;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionImpl#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionImpl#getQuantitativeContribution <em>Quantitative Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionImpl#getCorrelation <em>Correlation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionImpl#getChanges <em>Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContributionImpl extends ElementLinkImpl implements Contribution
{
  /**
   * The default value of the '{@link #getContribution() <em>Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContribution()
   * @generated
   * @ordered
   */
  protected static final ContributionType CONTRIBUTION_EDEFAULT = ContributionType.HELP;

  /**
   * The cached value of the '{@link #getContribution() <em>Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContribution()
   * @generated
   * @ordered
   */
  protected ContributionType contribution = CONTRIBUTION_EDEFAULT;

  /**
   * The default value of the '{@link #getQuantitativeContribution() <em>Quantitative Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantitativeContribution()
   * @generated
   * @ordered
   */
  protected static final int QUANTITATIVE_CONTRIBUTION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getQuantitativeContribution() <em>Quantitative Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuantitativeContribution()
   * @generated
   * @ordered
   */
  protected int quantitativeContribution = QUANTITATIVE_CONTRIBUTION_EDEFAULT;

  /**
   * The default value of the '{@link #getCorrelation() <em>Correlation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorrelation()
   * @generated
   * @ordered
   */
  protected static final String CORRELATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCorrelation() <em>Correlation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCorrelation()
   * @generated
   * @ordered
   */
  protected String correlation = CORRELATION_EDEFAULT;

  /**
   * The cached value of the '{@link #getChanges() <em>Changes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChanges()
   * @generated
   * @ordered
   */
  protected EList<ContributionChange> changes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContributionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TGRLPackage.Literals.CONTRIBUTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionType getContribution()
  {
    return contribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContribution(ContributionType newContribution)
  {
    ContributionType oldContribution = contribution;
    contribution = newContribution == null ? CONTRIBUTION_EDEFAULT : newContribution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION__CONTRIBUTION, oldContribution, contribution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getQuantitativeContribution()
  {
    return quantitativeContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuantitativeContribution(int newQuantitativeContribution)
  {
    int oldQuantitativeContribution = quantitativeContribution;
    quantitativeContribution = newQuantitativeContribution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION__QUANTITATIVE_CONTRIBUTION, oldQuantitativeContribution, quantitativeContribution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCorrelation()
  {
    return correlation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCorrelation(String newCorrelation)
  {
    String oldCorrelation = correlation;
    correlation = newCorrelation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION__CORRELATION, oldCorrelation, correlation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContributionChange> getChanges()
  {
    if (changes == null)
    {
      changes = new EObjectResolvingEList<ContributionChange>(ContributionChange.class, this, TGRLPackage.CONTRIBUTION__CHANGES);
    }
    return changes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TGRLPackage.CONTRIBUTION__CONTRIBUTION:
        return getContribution();
      case TGRLPackage.CONTRIBUTION__QUANTITATIVE_CONTRIBUTION:
        return getQuantitativeContribution();
      case TGRLPackage.CONTRIBUTION__CORRELATION:
        return getCorrelation();
      case TGRLPackage.CONTRIBUTION__CHANGES:
        return getChanges();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TGRLPackage.CONTRIBUTION__CONTRIBUTION:
        setContribution((ContributionType)newValue);
        return;
      case TGRLPackage.CONTRIBUTION__QUANTITATIVE_CONTRIBUTION:
        setQuantitativeContribution((Integer)newValue);
        return;
      case TGRLPackage.CONTRIBUTION__CORRELATION:
        setCorrelation((String)newValue);
        return;
      case TGRLPackage.CONTRIBUTION__CHANGES:
        getChanges().clear();
        getChanges().addAll((Collection<? extends ContributionChange>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TGRLPackage.CONTRIBUTION__CONTRIBUTION:
        setContribution(CONTRIBUTION_EDEFAULT);
        return;
      case TGRLPackage.CONTRIBUTION__QUANTITATIVE_CONTRIBUTION:
        setQuantitativeContribution(QUANTITATIVE_CONTRIBUTION_EDEFAULT);
        return;
      case TGRLPackage.CONTRIBUTION__CORRELATION:
        setCorrelation(CORRELATION_EDEFAULT);
        return;
      case TGRLPackage.CONTRIBUTION__CHANGES:
        getChanges().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TGRLPackage.CONTRIBUTION__CONTRIBUTION:
        return contribution != CONTRIBUTION_EDEFAULT;
      case TGRLPackage.CONTRIBUTION__QUANTITATIVE_CONTRIBUTION:
        return quantitativeContribution != QUANTITATIVE_CONTRIBUTION_EDEFAULT;
      case TGRLPackage.CONTRIBUTION__CORRELATION:
        return CORRELATION_EDEFAULT == null ? correlation != null : !CORRELATION_EDEFAULT.equals(correlation);
      case TGRLPackage.CONTRIBUTION__CHANGES:
        return changes != null && !changes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (contribution: ");
    result.append(contribution);
    result.append(", quantitativeContribution: ");
    result.append(quantitativeContribution);
    result.append(", correlation: ");
    result.append(correlation);
    result.append(')');
    return result.toString();
  }

} //ContributionImpl
