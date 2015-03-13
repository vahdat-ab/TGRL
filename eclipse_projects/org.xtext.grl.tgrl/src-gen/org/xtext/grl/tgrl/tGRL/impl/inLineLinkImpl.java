/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.grl.tgrl.tGRL.GRLElement;
import org.xtext.grl.tgrl.tGRL.LinkType;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;
import org.xtext.grl.tgrl.tGRL.inLineLink;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>in Line Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.inLineLinkImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.inLineLinkImpl#getDes <em>Des</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class inLineLinkImpl extends InLineElementLinkImpl implements inLineLink
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected LinkType type;

  /**
   * The cached value of the '{@link #getDes() <em>Des</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDes()
   * @generated
   * @ordered
   */
  protected EList<GRLElement> des;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected inLineLinkImpl()
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
    return TGRLPackage.Literals.IN_LINE_LINK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (LinkType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TGRLPackage.IN_LINE_LINK__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LinkType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(LinkType newType)
  {
    LinkType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.IN_LINE_LINK__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<GRLElement> getDes()
  {
    if (des == null)
    {
      des = new EObjectResolvingEList<GRLElement>(GRLElement.class, this, TGRLPackage.IN_LINE_LINK__DES);
    }
    return des;
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
      case TGRLPackage.IN_LINE_LINK__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case TGRLPackage.IN_LINE_LINK__DES:
        return getDes();
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
      case TGRLPackage.IN_LINE_LINK__TYPE:
        setType((LinkType)newValue);
        return;
      case TGRLPackage.IN_LINE_LINK__DES:
        getDes().clear();
        getDes().addAll((Collection<? extends GRLElement>)newValue);
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
      case TGRLPackage.IN_LINE_LINK__TYPE:
        setType((LinkType)null);
        return;
      case TGRLPackage.IN_LINE_LINK__DES:
        getDes().clear();
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
      case TGRLPackage.IN_LINE_LINK__TYPE:
        return type != null;
      case TGRLPackage.IN_LINE_LINK__DES:
        return des != null && !des.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //inLineLinkImpl
