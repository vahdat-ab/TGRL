/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.grl.tgrl.tGRL.ContributionEnd;
import org.xtext.grl.tgrl.tGRL.ContributionType;
import org.xtext.grl.tgrl.tGRL.IntentionalElement;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionEndImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionEndImpl#getContribution <em>Contribution</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionEndImpl#getQuantitativeContribution <em>Quantitative Contribution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContributionEndImpl extends MinimalEObjectImpl.Container implements ContributionEnd
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected IntentionalElement name;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContributionEndImpl()
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
    return TGRLPackage.Literals.CONTRIBUTION_END;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (IntentionalElement)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TGRLPackage.CONTRIBUTION_END__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(IntentionalElement newName)
  {
    IntentionalElement oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION_END__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION_END__CONTRIBUTION, oldContribution, contribution));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION_END__QUANTITATIVE_CONTRIBUTION, oldQuantitativeContribution, quantitativeContribution));
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
      case TGRLPackage.CONTRIBUTION_END__NAME:
        if (resolve) return getName();
        return basicGetName();
      case TGRLPackage.CONTRIBUTION_END__CONTRIBUTION:
        return getContribution();
      case TGRLPackage.CONTRIBUTION_END__QUANTITATIVE_CONTRIBUTION:
        return getQuantitativeContribution();
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
      case TGRLPackage.CONTRIBUTION_END__NAME:
        setName((IntentionalElement)newValue);
        return;
      case TGRLPackage.CONTRIBUTION_END__CONTRIBUTION:
        setContribution((ContributionType)newValue);
        return;
      case TGRLPackage.CONTRIBUTION_END__QUANTITATIVE_CONTRIBUTION:
        setQuantitativeContribution((Integer)newValue);
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
      case TGRLPackage.CONTRIBUTION_END__NAME:
        setName((IntentionalElement)null);
        return;
      case TGRLPackage.CONTRIBUTION_END__CONTRIBUTION:
        setContribution(CONTRIBUTION_EDEFAULT);
        return;
      case TGRLPackage.CONTRIBUTION_END__QUANTITATIVE_CONTRIBUTION:
        setQuantitativeContribution(QUANTITATIVE_CONTRIBUTION_EDEFAULT);
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
      case TGRLPackage.CONTRIBUTION_END__NAME:
        return name != null;
      case TGRLPackage.CONTRIBUTION_END__CONTRIBUTION:
        return contribution != CONTRIBUTION_EDEFAULT;
      case TGRLPackage.CONTRIBUTION_END__QUANTITATIVE_CONTRIBUTION:
        return quantitativeContribution != QUANTITATIVE_CONTRIBUTION_EDEFAULT;
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
    result.append(')');
    return result.toString();
  }

} //ContributionEndImpl
