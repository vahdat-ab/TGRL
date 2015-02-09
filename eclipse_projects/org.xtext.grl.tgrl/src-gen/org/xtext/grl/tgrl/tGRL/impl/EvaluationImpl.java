/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.grl.tgrl.tGRL.Evaluation;
import org.xtext.grl.tgrl.tGRL.EvaluationRange;
import org.xtext.grl.tgrl.tGRL.IntentionalElement;
import org.xtext.grl.tgrl.tGRL.KPIEvalValueSet;
import org.xtext.grl.tgrl.tGRL.KPINewEvalValue;
import org.xtext.grl.tgrl.tGRL.QualitativeLabel;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl#getQualitativeEvaluation <em>Qualitative Evaluation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl#getExceeds <em>Exceeds</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl#getEvalRange <em>Eval Range</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl#getKpiEvalValueSet <em>Kpi Eval Value Set</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl#getKpiNewEvalValue <em>Kpi New Eval Value</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl#getInElement <em>In Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluationImpl extends MinimalEObjectImpl.Container implements Evaluation
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
   * The default value of the '{@link #getEvaluation() <em>Evaluation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluation()
   * @generated
   * @ordered
   */
  protected static final int EVALUATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEvaluation() <em>Evaluation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvaluation()
   * @generated
   * @ordered
   */
  protected int evaluation = EVALUATION_EDEFAULT;

  /**
   * The default value of the '{@link #getQualitativeEvaluation() <em>Qualitative Evaluation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualitativeEvaluation()
   * @generated
   * @ordered
   */
  protected static final QualitativeLabel QUALITATIVE_EVALUATION_EDEFAULT = QualitativeLabel.DENIED;

  /**
   * The cached value of the '{@link #getQualitativeEvaluation() <em>Qualitative Evaluation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualitativeEvaluation()
   * @generated
   * @ordered
   */
  protected QualitativeLabel qualitativeEvaluation = QUALITATIVE_EVALUATION_EDEFAULT;

  /**
   * The default value of the '{@link #getExceeds() <em>Exceeds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceeds()
   * @generated
   * @ordered
   */
  protected static final String EXCEEDS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExceeds() <em>Exceeds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExceeds()
   * @generated
   * @ordered
   */
  protected String exceeds = EXCEEDS_EDEFAULT;

  /**
   * The cached value of the '{@link #getEvalRange() <em>Eval Range</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvalRange()
   * @generated
   * @ordered
   */
  protected EvaluationRange evalRange;

  /**
   * The cached value of the '{@link #getKpiEvalValueSet() <em>Kpi Eval Value Set</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKpiEvalValueSet()
   * @generated
   * @ordered
   */
  protected KPIEvalValueSet kpiEvalValueSet;

  /**
   * The cached value of the '{@link #getKpiNewEvalValue() <em>Kpi New Eval Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKpiNewEvalValue()
   * @generated
   * @ordered
   */
  protected KPINewEvalValue kpiNewEvalValue;

  /**
   * The cached value of the '{@link #getInElement() <em>In Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInElement()
   * @generated
   * @ordered
   */
  protected IntentionalElement inElement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EvaluationImpl()
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
    return TGRLPackage.Literals.EVALUATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getEvaluation()
  {
    return evaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvaluation(int newEvaluation)
  {
    int oldEvaluation = evaluation;
    evaluation = newEvaluation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION__EVALUATION, oldEvaluation, evaluation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualitativeLabel getQualitativeEvaluation()
  {
    return qualitativeEvaluation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQualitativeEvaluation(QualitativeLabel newQualitativeEvaluation)
  {
    QualitativeLabel oldQualitativeEvaluation = qualitativeEvaluation;
    qualitativeEvaluation = newQualitativeEvaluation == null ? QUALITATIVE_EVALUATION_EDEFAULT : newQualitativeEvaluation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION__QUALITATIVE_EVALUATION, oldQualitativeEvaluation, qualitativeEvaluation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExceeds()
  {
    return exceeds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExceeds(String newExceeds)
  {
    String oldExceeds = exceeds;
    exceeds = newExceeds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION__EXCEEDS, oldExceeds, exceeds));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EvaluationRange getEvalRange()
  {
    return evalRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvalRange(EvaluationRange newEvalRange, NotificationChain msgs)
  {
    EvaluationRange oldEvalRange = evalRange;
    evalRange = newEvalRange;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION__EVAL_RANGE, oldEvalRange, newEvalRange);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvalRange(EvaluationRange newEvalRange)
  {
    if (newEvalRange != evalRange)
    {
      NotificationChain msgs = null;
      if (evalRange != null)
        msgs = ((InternalEObject)evalRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TGRLPackage.EVALUATION__EVAL_RANGE, null, msgs);
      if (newEvalRange != null)
        msgs = ((InternalEObject)newEvalRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TGRLPackage.EVALUATION__EVAL_RANGE, null, msgs);
      msgs = basicSetEvalRange(newEvalRange, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION__EVAL_RANGE, newEvalRange, newEvalRange));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KPIEvalValueSet getKpiEvalValueSet()
  {
    return kpiEvalValueSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKpiEvalValueSet(KPIEvalValueSet newKpiEvalValueSet, NotificationChain msgs)
  {
    KPIEvalValueSet oldKpiEvalValueSet = kpiEvalValueSet;
    kpiEvalValueSet = newKpiEvalValueSet;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION__KPI_EVAL_VALUE_SET, oldKpiEvalValueSet, newKpiEvalValueSet);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKpiEvalValueSet(KPIEvalValueSet newKpiEvalValueSet)
  {
    if (newKpiEvalValueSet != kpiEvalValueSet)
    {
      NotificationChain msgs = null;
      if (kpiEvalValueSet != null)
        msgs = ((InternalEObject)kpiEvalValueSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TGRLPackage.EVALUATION__KPI_EVAL_VALUE_SET, null, msgs);
      if (newKpiEvalValueSet != null)
        msgs = ((InternalEObject)newKpiEvalValueSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TGRLPackage.EVALUATION__KPI_EVAL_VALUE_SET, null, msgs);
      msgs = basicSetKpiEvalValueSet(newKpiEvalValueSet, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION__KPI_EVAL_VALUE_SET, newKpiEvalValueSet, newKpiEvalValueSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public KPINewEvalValue getKpiNewEvalValue()
  {
    return kpiNewEvalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKpiNewEvalValue(KPINewEvalValue newKpiNewEvalValue, NotificationChain msgs)
  {
    KPINewEvalValue oldKpiNewEvalValue = kpiNewEvalValue;
    kpiNewEvalValue = newKpiNewEvalValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION__KPI_NEW_EVAL_VALUE, oldKpiNewEvalValue, newKpiNewEvalValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKpiNewEvalValue(KPINewEvalValue newKpiNewEvalValue)
  {
    if (newKpiNewEvalValue != kpiNewEvalValue)
    {
      NotificationChain msgs = null;
      if (kpiNewEvalValue != null)
        msgs = ((InternalEObject)kpiNewEvalValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TGRLPackage.EVALUATION__KPI_NEW_EVAL_VALUE, null, msgs);
      if (newKpiNewEvalValue != null)
        msgs = ((InternalEObject)newKpiNewEvalValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TGRLPackage.EVALUATION__KPI_NEW_EVAL_VALUE, null, msgs);
      msgs = basicSetKpiNewEvalValue(newKpiNewEvalValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION__KPI_NEW_EVAL_VALUE, newKpiNewEvalValue, newKpiNewEvalValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement getInElement()
  {
    if (inElement != null && inElement.eIsProxy())
    {
      InternalEObject oldInElement = (InternalEObject)inElement;
      inElement = (IntentionalElement)eResolveProxy(oldInElement);
      if (inElement != oldInElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TGRLPackage.EVALUATION__IN_ELEMENT, oldInElement, inElement));
      }
    }
    return inElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement basicGetInElement()
  {
    return inElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInElement(IntentionalElement newInElement)
  {
    IntentionalElement oldInElement = inElement;
    inElement = newInElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION__IN_ELEMENT, oldInElement, inElement));
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
      case TGRLPackage.EVALUATION__EVAL_RANGE:
        return basicSetEvalRange(null, msgs);
      case TGRLPackage.EVALUATION__KPI_EVAL_VALUE_SET:
        return basicSetKpiEvalValueSet(null, msgs);
      case TGRLPackage.EVALUATION__KPI_NEW_EVAL_VALUE:
        return basicSetKpiNewEvalValue(null, msgs);
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
      case TGRLPackage.EVALUATION__NAME:
        return getName();
      case TGRLPackage.EVALUATION__EVALUATION:
        return getEvaluation();
      case TGRLPackage.EVALUATION__QUALITATIVE_EVALUATION:
        return getQualitativeEvaluation();
      case TGRLPackage.EVALUATION__EXCEEDS:
        return getExceeds();
      case TGRLPackage.EVALUATION__EVAL_RANGE:
        return getEvalRange();
      case TGRLPackage.EVALUATION__KPI_EVAL_VALUE_SET:
        return getKpiEvalValueSet();
      case TGRLPackage.EVALUATION__KPI_NEW_EVAL_VALUE:
        return getKpiNewEvalValue();
      case TGRLPackage.EVALUATION__IN_ELEMENT:
        if (resolve) return getInElement();
        return basicGetInElement();
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
      case TGRLPackage.EVALUATION__NAME:
        setName((String)newValue);
        return;
      case TGRLPackage.EVALUATION__EVALUATION:
        setEvaluation((Integer)newValue);
        return;
      case TGRLPackage.EVALUATION__QUALITATIVE_EVALUATION:
        setQualitativeEvaluation((QualitativeLabel)newValue);
        return;
      case TGRLPackage.EVALUATION__EXCEEDS:
        setExceeds((String)newValue);
        return;
      case TGRLPackage.EVALUATION__EVAL_RANGE:
        setEvalRange((EvaluationRange)newValue);
        return;
      case TGRLPackage.EVALUATION__KPI_EVAL_VALUE_SET:
        setKpiEvalValueSet((KPIEvalValueSet)newValue);
        return;
      case TGRLPackage.EVALUATION__KPI_NEW_EVAL_VALUE:
        setKpiNewEvalValue((KPINewEvalValue)newValue);
        return;
      case TGRLPackage.EVALUATION__IN_ELEMENT:
        setInElement((IntentionalElement)newValue);
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
      case TGRLPackage.EVALUATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TGRLPackage.EVALUATION__EVALUATION:
        setEvaluation(EVALUATION_EDEFAULT);
        return;
      case TGRLPackage.EVALUATION__QUALITATIVE_EVALUATION:
        setQualitativeEvaluation(QUALITATIVE_EVALUATION_EDEFAULT);
        return;
      case TGRLPackage.EVALUATION__EXCEEDS:
        setExceeds(EXCEEDS_EDEFAULT);
        return;
      case TGRLPackage.EVALUATION__EVAL_RANGE:
        setEvalRange((EvaluationRange)null);
        return;
      case TGRLPackage.EVALUATION__KPI_EVAL_VALUE_SET:
        setKpiEvalValueSet((KPIEvalValueSet)null);
        return;
      case TGRLPackage.EVALUATION__KPI_NEW_EVAL_VALUE:
        setKpiNewEvalValue((KPINewEvalValue)null);
        return;
      case TGRLPackage.EVALUATION__IN_ELEMENT:
        setInElement((IntentionalElement)null);
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
      case TGRLPackage.EVALUATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TGRLPackage.EVALUATION__EVALUATION:
        return evaluation != EVALUATION_EDEFAULT;
      case TGRLPackage.EVALUATION__QUALITATIVE_EVALUATION:
        return qualitativeEvaluation != QUALITATIVE_EVALUATION_EDEFAULT;
      case TGRLPackage.EVALUATION__EXCEEDS:
        return EXCEEDS_EDEFAULT == null ? exceeds != null : !EXCEEDS_EDEFAULT.equals(exceeds);
      case TGRLPackage.EVALUATION__EVAL_RANGE:
        return evalRange != null;
      case TGRLPackage.EVALUATION__KPI_EVAL_VALUE_SET:
        return kpiEvalValueSet != null;
      case TGRLPackage.EVALUATION__KPI_NEW_EVAL_VALUE:
        return kpiNewEvalValue != null;
      case TGRLPackage.EVALUATION__IN_ELEMENT:
        return inElement != null;
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
    result.append(", evaluation: ");
    result.append(evaluation);
    result.append(", qualitativeEvaluation: ");
    result.append(qualitativeEvaluation);
    result.append(", exceeds: ");
    result.append(exceeds);
    result.append(')');
    return result.toString();
  }

} //EvaluationImpl
