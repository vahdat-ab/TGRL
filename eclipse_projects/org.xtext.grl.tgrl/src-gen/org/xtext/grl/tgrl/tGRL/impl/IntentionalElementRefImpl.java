/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.grl.tgrl.tGRL.Criticality;
import org.xtext.grl.tgrl.tGRL.IntentionalElement;
import org.xtext.grl.tgrl.tGRL.IntentionalElementRef;
import org.xtext.grl.tgrl.tGRL.Priority;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intentional Element Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementRefImpl#getCriticality <em>Criticality</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementRefImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementRefImpl#getDef <em>Def</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentionalElementRefImpl extends GRLNodeImpl implements IntentionalElementRef
{
  /**
   * The default value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriticality()
   * @generated
   * @ordered
   */
  protected static final Criticality CRITICALITY_EDEFAULT = Criticality.NONE;

  /**
   * The cached value of the '{@link #getCriticality() <em>Criticality</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCriticality()
   * @generated
   * @ordered
   */
  protected Criticality criticality = CRITICALITY_EDEFAULT;

  /**
   * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected static final Priority PRIORITY_EDEFAULT = Priority.NONE;

  /**
   * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPriority()
   * @generated
   * @ordered
   */
  protected Priority priority = PRIORITY_EDEFAULT;

  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected IntentionalElement def;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntentionalElementRefImpl()
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
    return TGRLPackage.Literals.INTENTIONAL_ELEMENT_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Criticality getCriticality()
  {
    return criticality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCriticality(Criticality newCriticality)
  {
    Criticality oldCriticality = criticality;
    criticality = newCriticality == null ? CRITICALITY_EDEFAULT : newCriticality;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INTENTIONAL_ELEMENT_REF__CRITICALITY, oldCriticality, criticality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Priority getPriority()
  {
    return priority;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPriority(Priority newPriority)
  {
    Priority oldPriority = priority;
    priority = newPriority == null ? PRIORITY_EDEFAULT : newPriority;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INTENTIONAL_ELEMENT_REF__PRIORITY, oldPriority, priority));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement getDef()
  {
    if (def != null && def.eIsProxy())
    {
      InternalEObject oldDef = (InternalEObject)def;
      def = (IntentionalElement)eResolveProxy(oldDef);
      if (def != oldDef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TGRLPackage.INTENTIONAL_ELEMENT_REF__DEF, oldDef, def));
      }
    }
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement basicGetDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(IntentionalElement newDef)
  {
    IntentionalElement oldDef = def;
    def = newDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INTENTIONAL_ELEMENT_REF__DEF, oldDef, def));
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
      case TGRLPackage.INTENTIONAL_ELEMENT_REF__CRITICALITY:
        return getCriticality();
      case TGRLPackage.INTENTIONAL_ELEMENT_REF__PRIORITY:
        return getPriority();
      case TGRLPackage.INTENTIONAL_ELEMENT_REF__DEF:
        if (resolve) return getDef();
        return basicGetDef();
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
      case TGRLPackage.INTENTIONAL_ELEMENT_REF__CRITICALITY:
        setCriticality((Criticality)newValue);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT_REF__PRIORITY:
        setPriority((Priority)newValue);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT_REF__DEF:
        setDef((IntentionalElement)newValue);
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
      case TGRLPackage.INTENTIONAL_ELEMENT_REF__CRITICALITY:
        setCriticality(CRITICALITY_EDEFAULT);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT_REF__PRIORITY:
        setPriority(PRIORITY_EDEFAULT);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT_REF__DEF:
        setDef((IntentionalElement)null);
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
      case TGRLPackage.INTENTIONAL_ELEMENT_REF__CRITICALITY:
        return criticality != CRITICALITY_EDEFAULT;
      case TGRLPackage.INTENTIONAL_ELEMENT_REF__PRIORITY:
        return priority != PRIORITY_EDEFAULT;
      case TGRLPackage.INTENTIONAL_ELEMENT_REF__DEF:
        return def != null;
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
    result.append(" (criticality: ");
    result.append(criticality);
    result.append(", priority: ");
    result.append(priority);
    result.append(')');
    return result.toString();
  }

} //IntentionalElementRefImpl
