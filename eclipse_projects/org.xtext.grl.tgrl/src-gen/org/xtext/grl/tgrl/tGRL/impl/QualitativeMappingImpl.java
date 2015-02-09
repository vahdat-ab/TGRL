/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.grl.tgrl.tGRL.QualitativeLabel;
import org.xtext.grl.tgrl.tGRL.QualitativeMapping;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualitative Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingImpl#getRealWorldLabel <em>Real World Label</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingImpl#getEvaluation <em>Evaluation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingImpl#getQualitativeEvaluation <em>Qualitative Evaluation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.QualitativeMappingImpl#getExceeds <em>Exceeds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QualitativeMappingImpl extends MinimalEObjectImpl.Container implements QualitativeMapping
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
   * The default value of the '{@link #getRealWorldLabel() <em>Real World Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealWorldLabel()
   * @generated
   * @ordered
   */
  protected static final String REAL_WORLD_LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRealWorldLabel() <em>Real World Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRealWorldLabel()
   * @generated
   * @ordered
   */
  protected String realWorldLabel = REAL_WORLD_LABEL_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected QualitativeMappingImpl()
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
    return TGRLPackage.Literals.QUALITATIVE_MAPPING;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.QUALITATIVE_MAPPING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRealWorldLabel()
  {
    return realWorldLabel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRealWorldLabel(String newRealWorldLabel)
  {
    String oldRealWorldLabel = realWorldLabel;
    realWorldLabel = newRealWorldLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.QUALITATIVE_MAPPING__REAL_WORLD_LABEL, oldRealWorldLabel, realWorldLabel));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.QUALITATIVE_MAPPING__EVALUATION, oldEvaluation, evaluation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.QUALITATIVE_MAPPING__QUALITATIVE_EVALUATION, oldQualitativeEvaluation, qualitativeEvaluation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.QUALITATIVE_MAPPING__EXCEEDS, oldExceeds, exceeds));
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
      case TGRLPackage.QUALITATIVE_MAPPING__NAME:
        return getName();
      case TGRLPackage.QUALITATIVE_MAPPING__REAL_WORLD_LABEL:
        return getRealWorldLabel();
      case TGRLPackage.QUALITATIVE_MAPPING__EVALUATION:
        return getEvaluation();
      case TGRLPackage.QUALITATIVE_MAPPING__QUALITATIVE_EVALUATION:
        return getQualitativeEvaluation();
      case TGRLPackage.QUALITATIVE_MAPPING__EXCEEDS:
        return getExceeds();
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
      case TGRLPackage.QUALITATIVE_MAPPING__NAME:
        setName((String)newValue);
        return;
      case TGRLPackage.QUALITATIVE_MAPPING__REAL_WORLD_LABEL:
        setRealWorldLabel((String)newValue);
        return;
      case TGRLPackage.QUALITATIVE_MAPPING__EVALUATION:
        setEvaluation((Integer)newValue);
        return;
      case TGRLPackage.QUALITATIVE_MAPPING__QUALITATIVE_EVALUATION:
        setQualitativeEvaluation((QualitativeLabel)newValue);
        return;
      case TGRLPackage.QUALITATIVE_MAPPING__EXCEEDS:
        setExceeds((String)newValue);
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
      case TGRLPackage.QUALITATIVE_MAPPING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TGRLPackage.QUALITATIVE_MAPPING__REAL_WORLD_LABEL:
        setRealWorldLabel(REAL_WORLD_LABEL_EDEFAULT);
        return;
      case TGRLPackage.QUALITATIVE_MAPPING__EVALUATION:
        setEvaluation(EVALUATION_EDEFAULT);
        return;
      case TGRLPackage.QUALITATIVE_MAPPING__QUALITATIVE_EVALUATION:
        setQualitativeEvaluation(QUALITATIVE_EVALUATION_EDEFAULT);
        return;
      case TGRLPackage.QUALITATIVE_MAPPING__EXCEEDS:
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
      case TGRLPackage.QUALITATIVE_MAPPING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TGRLPackage.QUALITATIVE_MAPPING__REAL_WORLD_LABEL:
        return REAL_WORLD_LABEL_EDEFAULT == null ? realWorldLabel != null : !REAL_WORLD_LABEL_EDEFAULT.equals(realWorldLabel);
      case TGRLPackage.QUALITATIVE_MAPPING__EVALUATION:
        return evaluation != EVALUATION_EDEFAULT;
      case TGRLPackage.QUALITATIVE_MAPPING__QUALITATIVE_EVALUATION:
        return qualitativeEvaluation != QUALITATIVE_EVALUATION_EDEFAULT;
      case TGRLPackage.QUALITATIVE_MAPPING__EXCEEDS:
        return EXCEEDS_EDEFAULT == null ? exceeds != null : !EXCEEDS_EDEFAULT.equals(exceeds);
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
    result.append(", realWorldLabel: ");
    result.append(realWorldLabel);
    result.append(", evaluation: ");
    result.append(evaluation);
    result.append(", qualitativeEvaluation: ");
    result.append(qualitativeEvaluation);
    result.append(", exceeds: ");
    result.append(exceeds);
    result.append(')');
    return result.toString();
  }

} //QualitativeMappingImpl
