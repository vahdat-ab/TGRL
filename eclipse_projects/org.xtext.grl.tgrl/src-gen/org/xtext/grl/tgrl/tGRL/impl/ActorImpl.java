/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.grl.tgrl.tGRL.Actor;
import org.xtext.grl.tgrl.tGRL.CollapsedActorRef;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ActorImpl#getIncludedActors <em>Included Actors</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ActorImpl#getCollapsedRefs <em>Collapsed Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActorImpl extends GRLLinkableElementImpl implements Actor
{
  /**
   * The cached value of the '{@link #getIncludedActors() <em>Included Actors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludedActors()
   * @generated
   * @ordered
   */
  protected EList<Actor> includedActors;

  /**
   * The cached value of the '{@link #getCollapsedRefs() <em>Collapsed Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollapsedRefs()
   * @generated
   * @ordered
   */
  protected EList<CollapsedActorRef> collapsedRefs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActorImpl()
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
    return TGRLPackage.Literals.ACTOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Actor> getIncludedActors()
  {
    if (includedActors == null)
    {
      includedActors = new EObjectResolvingEList<Actor>(Actor.class, this, TGRLPackage.ACTOR__INCLUDED_ACTORS);
    }
    return includedActors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CollapsedActorRef> getCollapsedRefs()
  {
    if (collapsedRefs == null)
    {
      collapsedRefs = new EObjectResolvingEList<CollapsedActorRef>(CollapsedActorRef.class, this, TGRLPackage.ACTOR__COLLAPSED_REFS);
    }
    return collapsedRefs;
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
      case TGRLPackage.ACTOR__INCLUDED_ACTORS:
        return getIncludedActors();
      case TGRLPackage.ACTOR__COLLAPSED_REFS:
        return getCollapsedRefs();
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
      case TGRLPackage.ACTOR__INCLUDED_ACTORS:
        getIncludedActors().clear();
        getIncludedActors().addAll((Collection<? extends Actor>)newValue);
        return;
      case TGRLPackage.ACTOR__COLLAPSED_REFS:
        getCollapsedRefs().clear();
        getCollapsedRefs().addAll((Collection<? extends CollapsedActorRef>)newValue);
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
      case TGRLPackage.ACTOR__INCLUDED_ACTORS:
        getIncludedActors().clear();
        return;
      case TGRLPackage.ACTOR__COLLAPSED_REFS:
        getCollapsedRefs().clear();
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
      case TGRLPackage.ACTOR__INCLUDED_ACTORS:
        return includedActors != null && !includedActors.isEmpty();
      case TGRLPackage.ACTOR__COLLAPSED_REFS:
        return collapsedRefs != null && !collapsedRefs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ActorImpl
