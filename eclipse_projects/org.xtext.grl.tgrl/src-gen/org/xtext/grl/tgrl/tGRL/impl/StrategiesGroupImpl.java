/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.grl.tgrl.tGRL.EvaluationStrategy;
import org.xtext.grl.tgrl.tGRL.StrategiesGroup;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategies Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.StrategiesGroupImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.StrategiesGroupImpl#getStrategies <em>Strategies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrategiesGroupImpl extends MinimalEObjectImpl.Container implements StrategiesGroup
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
   * The cached value of the '{@link #getStrategies() <em>Strategies</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategies()
   * @generated
   * @ordered
   */
  protected EList<EvaluationStrategy> strategies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StrategiesGroupImpl()
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
    return TGRLPackage.Literals.STRATEGIES_GROUP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.STRATEGIES_GROUP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EvaluationStrategy> getStrategies()
  {
    if (strategies == null)
    {
      strategies = new EObjectResolvingEList<EvaluationStrategy>(EvaluationStrategy.class, this, TGRLPackage.STRATEGIES_GROUP__STRATEGIES);
    }
    return strategies;
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
      case TGRLPackage.STRATEGIES_GROUP__NAME:
        return getName();
      case TGRLPackage.STRATEGIES_GROUP__STRATEGIES:
        return getStrategies();
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
      case TGRLPackage.STRATEGIES_GROUP__NAME:
        setName((String)newValue);
        return;
      case TGRLPackage.STRATEGIES_GROUP__STRATEGIES:
        getStrategies().clear();
        getStrategies().addAll((Collection<? extends EvaluationStrategy>)newValue);
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
      case TGRLPackage.STRATEGIES_GROUP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TGRLPackage.STRATEGIES_GROUP__STRATEGIES:
        getStrategies().clear();
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
      case TGRLPackage.STRATEGIES_GROUP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TGRLPackage.STRATEGIES_GROUP__STRATEGIES:
        return strategies != null && !strategies.isEmpty();
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

} //StrategiesGroupImpl
