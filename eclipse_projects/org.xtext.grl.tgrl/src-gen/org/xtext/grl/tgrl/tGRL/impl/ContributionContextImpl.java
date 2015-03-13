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
import org.xtext.grl.tgrl.tGRL.ContributionContext;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contribution Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionContextImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionContextImpl#getSuperContributionContexts <em>Super Contribution Contexts</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionContextImpl#getChanges <em>Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContributionContextImpl extends GRLElementImpl implements ContributionContext
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperContributionContexts() <em>Super Contribution Contexts</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperContributionContexts()
   * @generated
   * @ordered
   */
  protected EList<ContributionContext> superContributionContexts;

  /**
   * The cached value of the '{@link #getChanges() <em>Changes</em>}' containment reference list.
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
  protected ContributionContextImpl()
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
    return TGRLPackage.Literals.CONTRIBUTION_CONTEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONTRIBUTION_CONTEXT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContributionContext> getSuperContributionContexts()
  {
    if (superContributionContexts == null)
    {
      superContributionContexts = new EObjectResolvingEList<ContributionContext>(ContributionContext.class, this, TGRLPackage.CONTRIBUTION_CONTEXT__SUPER_CONTRIBUTION_CONTEXTS);
    }
    return superContributionContexts;
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
      changes = new EObjectContainmentEList<ContributionChange>(ContributionChange.class, this, TGRLPackage.CONTRIBUTION_CONTEXT__CHANGES);
    }
    return changes;
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
      case TGRLPackage.CONTRIBUTION_CONTEXT__CHANGES:
        return ((InternalEList<?>)getChanges()).basicRemove(otherEnd, msgs);
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
      case TGRLPackage.CONTRIBUTION_CONTEXT__NAME:
        return getName();
      case TGRLPackage.CONTRIBUTION_CONTEXT__SUPER_CONTRIBUTION_CONTEXTS:
        return getSuperContributionContexts();
      case TGRLPackage.CONTRIBUTION_CONTEXT__CHANGES:
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
      case TGRLPackage.CONTRIBUTION_CONTEXT__NAME:
        setName((String)newValue);
        return;
      case TGRLPackage.CONTRIBUTION_CONTEXT__SUPER_CONTRIBUTION_CONTEXTS:
        getSuperContributionContexts().clear();
        getSuperContributionContexts().addAll((Collection<? extends ContributionContext>)newValue);
        return;
      case TGRLPackage.CONTRIBUTION_CONTEXT__CHANGES:
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
      case TGRLPackage.CONTRIBUTION_CONTEXT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TGRLPackage.CONTRIBUTION_CONTEXT__SUPER_CONTRIBUTION_CONTEXTS:
        getSuperContributionContexts().clear();
        return;
      case TGRLPackage.CONTRIBUTION_CONTEXT__CHANGES:
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
      case TGRLPackage.CONTRIBUTION_CONTEXT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TGRLPackage.CONTRIBUTION_CONTEXT__SUPER_CONTRIBUTION_CONTEXTS:
        return superContributionContexts != null && !superContributionContexts.isEmpty();
      case TGRLPackage.CONTRIBUTION_CONTEXT__CHANGES:
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ContributionContextImpl
