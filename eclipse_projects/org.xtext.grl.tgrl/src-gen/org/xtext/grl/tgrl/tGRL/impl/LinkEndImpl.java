/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.grl.tgrl.tGRL.LinkEnd;
import org.xtext.grl.tgrl.tGRL.SuperIntentionalElement;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.LinkEndImpl#getDestName <em>Dest Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndImpl extends MinimalEObjectImpl.Container implements LinkEnd
{
  /**
   * The cached value of the '{@link #getDestName() <em>Dest Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestName()
   * @generated
   * @ordered
   */
  protected SuperIntentionalElement destName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkEndImpl()
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
    return TGRLPackage.Literals.LINK_END;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperIntentionalElement getDestName()
  {
    if (destName != null && destName.eIsProxy())
    {
      InternalEObject oldDestName = (InternalEObject)destName;
      destName = (SuperIntentionalElement)eResolveProxy(oldDestName);
      if (destName != oldDestName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TGRLPackage.LINK_END__DEST_NAME, oldDestName, destName));
      }
    }
    return destName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SuperIntentionalElement basicGetDestName()
  {
    return destName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestName(SuperIntentionalElement newDestName)
  {
    SuperIntentionalElement oldDestName = destName;
    destName = newDestName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.LINK_END__DEST_NAME, oldDestName, destName));
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
      case TGRLPackage.LINK_END__DEST_NAME:
        if (resolve) return getDestName();
        return basicGetDestName();
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
      case TGRLPackage.LINK_END__DEST_NAME:
        setDestName((SuperIntentionalElement)newValue);
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
      case TGRLPackage.LINK_END__DEST_NAME:
        setDestName((SuperIntentionalElement)null);
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
      case TGRLPackage.LINK_END__DEST_NAME:
        return destName != null;
    }
    return super.eIsSet(featureID);
  }

} //LinkEndImpl
