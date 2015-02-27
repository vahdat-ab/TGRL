/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.grl.tgrl.tGRL.Evaluation;
import org.xtext.grl.tgrl.tGRL.IntentionalElement;
import org.xtext.grl.tgrl.tGRL.QualitativeLabel;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl#getIntentionalElement <em>Intentional Element</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl#getQualitativeEvaluation <em>Qualitative Evaluation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.EvaluationImpl#isExceeds <em>Exceeds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EvaluationImpl extends GRLElementImpl implements Evaluation
{
  /**
   * The cached value of the '{@link #getIntentionalElement() <em>Intentional Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntentionalElement()
   * @generated
   * @ordered
   */
  protected IntentionalElement intentionalElement;

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
   * The default value of the '{@link #isExceeds() <em>Exceeds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExceeds()
   * @generated
   * @ordered
   */
  protected static final boolean EXCEEDS_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isExceeds() <em>Exceeds</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isExceeds()
   * @generated
   * @ordered
   */
  protected boolean exceeds = EXCEEDS_EDEFAULT;

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
  public IntentionalElement getIntentionalElement()
  {
    if (intentionalElement != null && intentionalElement.eIsProxy())
    {
      InternalEObject oldIntentionalElement = (InternalEObject)intentionalElement;
      intentionalElement = (IntentionalElement)eResolveProxy(oldIntentionalElement);
      if (intentionalElement != oldIntentionalElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TGRLPackage.EVALUATION__INTENTIONAL_ELEMENT, oldIntentionalElement, intentionalElement));
      }
    }
    return intentionalElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntentionalElement basicGetIntentionalElement()
  {
    return intentionalElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntentionalElement(IntentionalElement newIntentionalElement)
  {
    IntentionalElement oldIntentionalElement = intentionalElement;
    intentionalElement = newIntentionalElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION__INTENTIONAL_ELEMENT, oldIntentionalElement, intentionalElement));
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
  public boolean isExceeds()
  {
    return exceeds;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExceeds(boolean newExceeds)
  {
    boolean oldExceeds = exceeds;
    exceeds = newExceeds;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.EVALUATION__EXCEEDS, oldExceeds, exceeds));
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
      case TGRLPackage.EVALUATION__INTENTIONAL_ELEMENT:
        if (resolve) return getIntentionalElement();
        return basicGetIntentionalElement();
      case TGRLPackage.EVALUATION__QUALITATIVE_EVALUATION:
        return getQualitativeEvaluation();
      case TGRLPackage.EVALUATION__EVALUATION:
        return getEvaluation();
      case TGRLPackage.EVALUATION__EXCEEDS:
        return isExceeds();
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
      case TGRLPackage.EVALUATION__INTENTIONAL_ELEMENT:
        setIntentionalElement((IntentionalElement)newValue);
        return;
      case TGRLPackage.EVALUATION__QUALITATIVE_EVALUATION:
        setQualitativeEvaluation((QualitativeLabel)newValue);
        return;
      case TGRLPackage.EVALUATION__EVALUATION:
        setEvaluation((Integer)newValue);
        return;
      case TGRLPackage.EVALUATION__EXCEEDS:
        setExceeds((Boolean)newValue);
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
      case TGRLPackage.EVALUATION__INTENTIONAL_ELEMENT:
        setIntentionalElement((IntentionalElement)null);
        return;
      case TGRLPackage.EVALUATION__QUALITATIVE_EVALUATION:
        setQualitativeEvaluation(QUALITATIVE_EVALUATION_EDEFAULT);
        return;
      case TGRLPackage.EVALUATION__EVALUATION:
        setEvaluation(EVALUATION_EDEFAULT);
        return;
      case TGRLPackage.EVALUATION__EXCEEDS:
        setExceeds(EXCEEDS_EDEFAULT);
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
      case TGRLPackage.EVALUATION__INTENTIONAL_ELEMENT:
        return intentionalElement != null;
      case TGRLPackage.EVALUATION__QUALITATIVE_EVALUATION:
        return qualitativeEvaluation != QUALITATIVE_EVALUATION_EDEFAULT;
      case TGRLPackage.EVALUATION__EVALUATION:
        return evaluation != EVALUATION_EDEFAULT;
      case TGRLPackage.EVALUATION__EXCEEDS:
        return exceeds != EXCEEDS_EDEFAULT;
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
    result.append(" (qualitativeEvaluation: ");
    result.append(qualitativeEvaluation);
    result.append(", evaluation: ");
    result.append(evaluation);
    result.append(", exceeds: ");
    result.append(exceeds);
    result.append(')');
    return result.toString();
  }

} //EvaluationImpl
