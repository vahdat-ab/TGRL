/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.grl.tgrl.tGRL.ContributionChange;
import org.xtext.grl.tgrl.tGRL.ContributionEnds;
import org.xtext.grl.tgrl.tGRL.ContributionLink;
import org.xtext.grl.tgrl.tGRL.ContributionType;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionLinkImpl#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionLinkImpl#getQuantitativeContribution <em>Quantitative Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionLinkImpl#getCorrelation <em>Correlation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionLinkImpl#getChanges <em>Changes</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionLinkImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContributionLinkImpl extends ElementLinkImpl implements ContributionLink
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
   * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConnections()
   * @generated
   * @ordered
   */
  protected EList<ContributionEnds> connections;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContributionLinkImpl()
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
    return TGRLPackage.Literals.CONTRIBUTION_LINK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION_LINK__CONTRIBUTION, oldContribution, contribution));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION_LINK__QUANTITATIVE_CONTRIBUTION, oldQuantitativeContribution, quantitativeContribution));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION_LINK__CORRELATION, oldCorrelation, correlation));
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
      changes = new EObjectResolvingEList<ContributionChange>(ContributionChange.class, this, TGRLPackage.CONTRIBUTION_LINK__CHANGES);
    }
    return changes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContributionEnds> getConnections()
  {
    if (connections == null)
    {
      connections = new EObjectContainmentEList<ContributionEnds>(ContributionEnds.class, this, TGRLPackage.CONTRIBUTION_LINK__CONNECTIONS);
    }
    return connections;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TGRLPackage.CONTRIBUTION_LINK__CONNECTIONS:
        return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case TGRLPackage.CONTRIBUTION_LINK__CONTRIBUTION:
        return getContribution();
      case TGRLPackage.CONTRIBUTION_LINK__QUANTITATIVE_CONTRIBUTION:
        return getQuantitativeContribution();
      case TGRLPackage.CONTRIBUTION_LINK__CORRELATION:
        return getCorrelation();
      case TGRLPackage.CONTRIBUTION_LINK__CHANGES:
        return getChanges();
      case TGRLPackage.CONTRIBUTION_LINK__CONNECTIONS:
        return getConnections();
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
      case TGRLPackage.CONTRIBUTION_LINK__CONTRIBUTION:
        setContribution((ContributionType)newValue);
        return;
      case TGRLPackage.CONTRIBUTION_LINK__QUANTITATIVE_CONTRIBUTION:
        setQuantitativeContribution((Integer)newValue);
        return;
      case TGRLPackage.CONTRIBUTION_LINK__CORRELATION:
        setCorrelation((String)newValue);
        return;
      case TGRLPackage.CONTRIBUTION_LINK__CHANGES:
        getChanges().clear();
        getChanges().addAll((Collection<? extends ContributionChange>)newValue);
        return;
      case TGRLPackage.CONTRIBUTION_LINK__CONNECTIONS:
        getConnections().clear();
        getConnections().addAll((Collection<? extends ContributionEnds>)newValue);
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
      case TGRLPackage.CONTRIBUTION_LINK__CONTRIBUTION:
        setContribution(CONTRIBUTION_EDEFAULT);
        return;
      case TGRLPackage.CONTRIBUTION_LINK__QUANTITATIVE_CONTRIBUTION:
        setQuantitativeContribution(QUANTITATIVE_CONTRIBUTION_EDEFAULT);
        return;
      case TGRLPackage.CONTRIBUTION_LINK__CORRELATION:
        setCorrelation(CORRELATION_EDEFAULT);
        return;
      case TGRLPackage.CONTRIBUTION_LINK__CHANGES:
        getChanges().clear();
        return;
      case TGRLPackage.CONTRIBUTION_LINK__CONNECTIONS:
        getConnections().clear();
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
      case TGRLPackage.CONTRIBUTION_LINK__CONTRIBUTION:
        return contribution != CONTRIBUTION_EDEFAULT;
      case TGRLPackage.CONTRIBUTION_LINK__QUANTITATIVE_CONTRIBUTION:
        return quantitativeContribution != QUANTITATIVE_CONTRIBUTION_EDEFAULT;
      case TGRLPackage.CONTRIBUTION_LINK__CORRELATION:
        return CORRELATION_EDEFAULT == null ? correlation != null : !CORRELATION_EDEFAULT.equals(correlation);
      case TGRLPackage.CONTRIBUTION_LINK__CHANGES:
        return changes != null && !changes.isEmpty();
      case TGRLPackage.CONTRIBUTION_LINK__CONNECTIONS:
        return connections != null && !connections.isEmpty();
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

} //ContributionLinkImpl
