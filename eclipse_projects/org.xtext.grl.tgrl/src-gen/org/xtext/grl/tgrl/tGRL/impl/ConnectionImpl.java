/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.grl.tgrl.tGRL.Connection;
import org.xtext.grl.tgrl.tGRL.IntentionalElement;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ConnectionImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.ConnectionImpl#getDest <em>Dest</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConnectionImpl extends GRLBaseElementImpl implements Connection
{
  /**
   * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSrc()
   * @generated
   * @ordered
   */
  protected IntentionalElement src;

  /**
   * The cached value of the '{@link #getDest() <em>Dest</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDest()
   * @generated
   * @ordered
   */
  protected IntentionalElement dest;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConnectionImpl()
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
    return TGRLPackage.Literals.CONNECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement getSrc()
  {
    if (src != null && src.eIsProxy())
    {
      InternalEObject oldSrc = (InternalEObject)src;
      src = (IntentionalElement)eResolveProxy(oldSrc);
      if (src != oldSrc)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TGRLPackage.CONNECTION__SRC, oldSrc, src));
      }
    }
    return src;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement basicGetSrc()
  {
    return src;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSrc(IntentionalElement newSrc)
  {
    IntentionalElement oldSrc = src;
    src = newSrc;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONNECTION__SRC, oldSrc, src));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement getDest()
  {
    if (dest != null && dest.eIsProxy())
    {
      InternalEObject oldDest = (InternalEObject)dest;
      dest = (IntentionalElement)eResolveProxy(oldDest);
      if (dest != oldDest)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TGRLPackage.CONNECTION__DEST, oldDest, dest));
      }
    }
    return dest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement basicGetDest()
  {
    return dest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDest(IntentionalElement newDest)
  {
    IntentionalElement oldDest = dest;
    dest = newDest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.CONNECTION__DEST, oldDest, dest));
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
      case TGRLPackage.CONNECTION__SRC:
        if (resolve) return getSrc();
        return basicGetSrc();
      case TGRLPackage.CONNECTION__DEST:
        if (resolve) return getDest();
        return basicGetDest();
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
      case TGRLPackage.CONNECTION__SRC:
        setSrc((IntentionalElement)newValue);
        return;
      case TGRLPackage.CONNECTION__DEST:
        setDest((IntentionalElement)newValue);
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
      case TGRLPackage.CONNECTION__SRC:
        setSrc((IntentionalElement)null);
        return;
      case TGRLPackage.CONNECTION__DEST:
        setDest((IntentionalElement)null);
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
      case TGRLPackage.CONNECTION__SRC:
        return src != null;
      case TGRLPackage.CONNECTION__DEST:
        return dest != null;
    }
    return super.eIsSet(featureID);
  }

} //ConnectionImpl
