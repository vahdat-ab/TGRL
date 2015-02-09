/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionContextImpl#getIncludedContexts <em>Included Contexts</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ContributionContextImpl#getChanges <em>Changes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContributionContextImpl extends GRLModelElementImpl implements ContributionContext
{
  /**
   * The cached value of the '{@link #getIncludedContexts() <em>Included Contexts</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedContexts()
   * @generated
   * @ordered
   */
  protected EList<ContributionContext> includedContexts;

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
  public EList<ContributionContext> getIncludedContexts()
  {
    if (includedContexts == null)
    {
      includedContexts = new EObjectResolvingEList<ContributionContext>(ContributionContext.class, this, TGRLPackage.CONTRIBUTION_CONTEXT__INCLUDED_CONTEXTS);
    }
    return includedContexts;
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
      case TGRLPackage.CONTRIBUTION_CONTEXT__INCLUDED_CONTEXTS:
        return getIncludedContexts();
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
      case TGRLPackage.CONTRIBUTION_CONTEXT__INCLUDED_CONTEXTS:
        getIncludedContexts().clear();
        getIncludedContexts().addAll((Collection<? extends ContributionContext>)newValue);
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
      case TGRLPackage.CONTRIBUTION_CONTEXT__INCLUDED_CONTEXTS:
        getIncludedContexts().clear();
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
      case TGRLPackage.CONTRIBUTION_CONTEXT__INCLUDED_CONTEXTS:
        return includedContexts != null && !includedContexts.isEmpty();
      case TGRLPackage.CONTRIBUTION_CONTEXT__CHANGES:
        return changes != null && !changes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ContributionContextImpl
