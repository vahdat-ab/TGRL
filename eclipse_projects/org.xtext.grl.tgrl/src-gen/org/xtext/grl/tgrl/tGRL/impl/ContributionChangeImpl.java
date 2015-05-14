/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.grl.tgrl.tGRL.ContributionChange;
import org.xtext.grl.tgrl.tGRL.ContributionEnd;
import org.xtext.grl.tgrl.tGRL.ContributionRange;
import org.xtext.grl.tgrl.tGRL.ContributionType;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution Change</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionChangeImpl#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionChangeImpl#getNewContribution <em>New Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionChangeImpl#getNewQuantitativeContribution <em>New Quantitative Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionChangeImpl#getContribRange <em>Contrib Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContributionChangeImpl extends MinimalEObjectImpl.Container implements ContributionChange
{
  /**
   * The cached value of the '{@link #getContribution() <em>Contribution</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContribution()
   * @generated
   * @ordered
   */
  protected ContributionEnd contribution;

  /**
   * The default value of the '{@link #getNewContribution() <em>New Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewContribution()
   * @generated
   * @ordered
   */
  protected static final ContributionType NEW_CONTRIBUTION_EDEFAULT = ContributionType.HELP;

  /**
   * The cached value of the '{@link #getNewContribution() <em>New Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewContribution()
   * @generated
   * @ordered
   */
  protected ContributionType newContribution = NEW_CONTRIBUTION_EDEFAULT;

  /**
   * The default value of the '{@link #getNewQuantitativeContribution() <em>New Quantitative Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewQuantitativeContribution()
   * @generated
   * @ordered
   */
  protected static final String NEW_QUANTITATIVE_CONTRIBUTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNewQuantitativeContribution() <em>New Quantitative Contribution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNewQuantitativeContribution()
   * @generated
   * @ordered
   */
  protected String newQuantitativeContribution = NEW_QUANTITATIVE_CONTRIBUTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getContribRange() <em>Contrib Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContribRange()
   * @generated
   * @ordered
   */
  protected ContributionRange contribRange;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContributionChangeImpl()
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
    return TGRLPackage.Literals.CONTRIBUTION_CHANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionEnd getContribution()
  {
    if (contribution != null && contribution.eIsProxy())
    {
      InternalEObject oldContribution = (InternalEObject)contribution;
      contribution = (ContributionEnd)eResolveProxy(oldContribution);
      if (contribution != oldContribution)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TGRLPackage.CONTRIBUTION_CHANGE__CONTRIBUTION, oldContribution, contribution));
      }
    }
    return contribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionEnd basicGetContribution()
  {
    return contribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContribution(ContributionEnd newContribution)
  {
    ContributionEnd oldContribution = contribution;
    contribution = newContribution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION_CHANGE__CONTRIBUTION, oldContribution, contribution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionType getNewContribution()
  {
    return newContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewContribution(ContributionType newNewContribution)
  {
    ContributionType oldNewContribution = newContribution;
    newContribution = newNewContribution == null ? NEW_CONTRIBUTION_EDEFAULT : newNewContribution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION_CHANGE__NEW_CONTRIBUTION, oldNewContribution, newContribution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNewQuantitativeContribution()
  {
    return newQuantitativeContribution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNewQuantitativeContribution(String newNewQuantitativeContribution)
  {
    String oldNewQuantitativeContribution = newQuantitativeContribution;
    newQuantitativeContribution = newNewQuantitativeContribution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION_CHANGE__NEW_QUANTITATIVE_CONTRIBUTION, oldNewQuantitativeContribution, newQuantitativeContribution));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContributionRange getContribRange()
  {
    return contribRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetContribRange(ContributionRange newContribRange, NotificationChain msgs)
  {
    ContributionRange oldContribRange = contribRange;
    contribRange = newContribRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION_CHANGE__CONTRIB_RANGE, oldContribRange, newContribRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setContribRange(ContributionRange newContribRange)
  {
    if (newContribRange != contribRange)
    {
      NotificationChain msgs = null;
      if (contribRange != null)
        msgs = ((InternalEObject)contribRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TGRLPackage.CONTRIBUTION_CHANGE__CONTRIB_RANGE, null, msgs);
      if (newContribRange != null)
        msgs = ((InternalEObject)newContribRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TGRLPackage.CONTRIBUTION_CHANGE__CONTRIB_RANGE, null, msgs);
      msgs = basicSetContribRange(newContribRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION_CHANGE__CONTRIB_RANGE, newContribRange, newContribRange));
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
      case TGRLPackage.CONTRIBUTION_CHANGE__CONTRIB_RANGE:
        return basicSetContribRange(null, msgs);
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
      case TGRLPackage.CONTRIBUTION_CHANGE__CONTRIBUTION:
        if (resolve) return getContribution();
        return basicGetContribution();
      case TGRLPackage.CONTRIBUTION_CHANGE__NEW_CONTRIBUTION:
        return getNewContribution();
      case TGRLPackage.CONTRIBUTION_CHANGE__NEW_QUANTITATIVE_CONTRIBUTION:
        return getNewQuantitativeContribution();
      case TGRLPackage.CONTRIBUTION_CHANGE__CONTRIB_RANGE:
        return getContribRange();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TGRLPackage.CONTRIBUTION_CHANGE__CONTRIBUTION:
        setContribution((ContributionEnd)newValue);
        return;
      case TGRLPackage.CONTRIBUTION_CHANGE__NEW_CONTRIBUTION:
        setNewContribution((ContributionType)newValue);
        return;
      case TGRLPackage.CONTRIBUTION_CHANGE__NEW_QUANTITATIVE_CONTRIBUTION:
        setNewQuantitativeContribution((String)newValue);
        return;
      case TGRLPackage.CONTRIBUTION_CHANGE__CONTRIB_RANGE:
        setContribRange((ContributionRange)newValue);
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
      case TGRLPackage.CONTRIBUTION_CHANGE__CONTRIBUTION:
        setContribution((ContributionEnd)null);
        return;
      case TGRLPackage.CONTRIBUTION_CHANGE__NEW_CONTRIBUTION:
        setNewContribution(NEW_CONTRIBUTION_EDEFAULT);
        return;
      case TGRLPackage.CONTRIBUTION_CHANGE__NEW_QUANTITATIVE_CONTRIBUTION:
        setNewQuantitativeContribution(NEW_QUANTITATIVE_CONTRIBUTION_EDEFAULT);
        return;
      case TGRLPackage.CONTRIBUTION_CHANGE__CONTRIB_RANGE:
        setContribRange((ContributionRange)null);
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
      case TGRLPackage.CONTRIBUTION_CHANGE__CONTRIBUTION:
        return contribution != null;
      case TGRLPackage.CONTRIBUTION_CHANGE__NEW_CONTRIBUTION:
        return newContribution != NEW_CONTRIBUTION_EDEFAULT;
      case TGRLPackage.CONTRIBUTION_CHANGE__NEW_QUANTITATIVE_CONTRIBUTION:
        return NEW_QUANTITATIVE_CONTRIBUTION_EDEFAULT == null ? newQuantitativeContribution != null : !NEW_QUANTITATIVE_CONTRIBUTION_EDEFAULT.equals(newQuantitativeContribution);
      case TGRLPackage.CONTRIBUTION_CHANGE__CONTRIB_RANGE:
        return contribRange != null;
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
    result.append(" (newContribution: ");
    result.append(newContribution);
    result.append(", newQuantitativeContribution: ");
    result.append(newQuantitativeContribution);
    result.append(')');
    return result.toString();
  }

} //ContributionChangeImpl
