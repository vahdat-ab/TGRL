/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.grl.tgrl.tGRL.EvaluationRange;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationRangeImpl#getVahdat <em>Vahdat</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationRangeImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationRangeImpl#getStep <em>Step</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluationRangeImpl extends MinimalEObjectImpl.Container implements EvaluationRange
{
  /**
   * The default value of the '{@link #getVahdat() <em>Vahdat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVahdat()
   * @generated
   * @ordered
   */
  protected static final String VAHDAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVahdat() <em>Vahdat</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVahdat()
   * @generated
   * @ordered
   */
  protected String vahdat = VAHDAT_EDEFAULT;

  /**
   * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected static final String END_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEnd()
   * @generated
   * @ordered
   */
  protected String end = END_EDEFAULT;

  /**
   * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStep()
   * @generated
   * @ordered
   */
  protected static final String STEP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStep()
   * @generated
   * @ordered
   */
  protected String step = STEP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvaluationRangeImpl()
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
    return TGRLPackage.Literals.EVALUATION_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVahdat()
  {
    return vahdat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVahdat(String newVahdat)
  {
    String oldVahdat = vahdat;
    vahdat = newVahdat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION_RANGE__VAHDAT, oldVahdat, vahdat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEnd()
  {
    return end;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEnd(String newEnd)
  {
    String oldEnd = end;
    end = newEnd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION_RANGE__END, oldEnd, end));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStep()
  {
    return step;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStep(String newStep)
  {
    String oldStep = step;
    step = newStep;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION_RANGE__STEP, oldStep, step));
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
      case TGRLPackage.EVALUATION_RANGE__VAHDAT:
        return getVahdat();
      case TGRLPackage.EVALUATION_RANGE__END:
        return getEnd();
      case TGRLPackage.EVALUATION_RANGE__STEP:
        return getStep();
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
      case TGRLPackage.EVALUATION_RANGE__VAHDAT:
        setVahdat((String)newValue);
        return;
      case TGRLPackage.EVALUATION_RANGE__END:
        setEnd((String)newValue);
        return;
      case TGRLPackage.EVALUATION_RANGE__STEP:
        setStep((String)newValue);
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
      case TGRLPackage.EVALUATION_RANGE__VAHDAT:
        setVahdat(VAHDAT_EDEFAULT);
        return;
      case TGRLPackage.EVALUATION_RANGE__END:
        setEnd(END_EDEFAULT);
        return;
      case TGRLPackage.EVALUATION_RANGE__STEP:
        setStep(STEP_EDEFAULT);
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
      case TGRLPackage.EVALUATION_RANGE__VAHDAT:
        return VAHDAT_EDEFAULT == null ? vahdat != null : !VAHDAT_EDEFAULT.equals(vahdat);
      case TGRLPackage.EVALUATION_RANGE__END:
        return END_EDEFAULT == null ? end != null : !END_EDEFAULT.equals(end);
      case TGRLPackage.EVALUATION_RANGE__STEP:
        return STEP_EDEFAULT == null ? step != null : !STEP_EDEFAULT.equals(step);
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
    result.append(" (vahdat: ");
    result.append(vahdat);
    result.append(", end: ");
    result.append(end);
    result.append(", step: ");
    result.append(step);
    result.append(')');
    return result.toString();
  }

} //EvaluationRangeImpl
