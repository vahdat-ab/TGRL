/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.grl.tgrl.tGRL.Mapping;
import org.xtext.grl.tgrl.tGRL.QualitativeLabel;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.MappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.MappingImpl#getValuation <em>Valuation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.MappingImpl#getQualitativeEvaluation <em>Qualitative Evaluation</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.MappingImpl#getExceeds <em>Exceeds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingImpl extends GRLBaseElementImpl implements Mapping
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
   * The default value of the '{@link #getValuation() <em>Valuation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuation()
   * @generated
   * @ordered
   */
  protected static final int VALUATION_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValuation() <em>Valuation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuation()
   * @generated
   * @ordered
   */
  protected int valuation = VALUATION_EDEFAULT;

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
  protected MappingImpl()
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
    return TGRLPackage.Literals.MAPPING;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.MAPPING__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValuation()
  {
    return valuation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuation(int newValuation)
  {
    int oldValuation = valuation;
    valuation = newValuation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.MAPPING__VALUATION, oldValuation, valuation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.MAPPING__QUALITATIVE_EVALUATION, oldQualitativeEvaluation, qualitativeEvaluation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.MAPPING__EXCEEDS, oldExceeds, exceeds));
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
      case TGRLPackage.MAPPING__NAME:
        return getName();
      case TGRLPackage.MAPPING__VALUATION:
        return getValuation();
      case TGRLPackage.MAPPING__QUALITATIVE_EVALUATION:
        return getQualitativeEvaluation();
      case TGRLPackage.MAPPING__EXCEEDS:
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
      case TGRLPackage.MAPPING__NAME:
        setName((String)newValue);
        return;
      case TGRLPackage.MAPPING__VALUATION:
        setValuation((Integer)newValue);
        return;
      case TGRLPackage.MAPPING__QUALITATIVE_EVALUATION:
        setQualitativeEvaluation((QualitativeLabel)newValue);
        return;
      case TGRLPackage.MAPPING__EXCEEDS:
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
      case TGRLPackage.MAPPING__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TGRLPackage.MAPPING__VALUATION:
        setValuation(VALUATION_EDEFAULT);
        return;
      case TGRLPackage.MAPPING__QUALITATIVE_EVALUATION:
        setQualitativeEvaluation(QUALITATIVE_EVALUATION_EDEFAULT);
        return;
      case TGRLPackage.MAPPING__EXCEEDS:
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
      case TGRLPackage.MAPPING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TGRLPackage.MAPPING__VALUATION:
        return valuation != VALUATION_EDEFAULT;
      case TGRLPackage.MAPPING__QUALITATIVE_EVALUATION:
        return qualitativeEvaluation != QUALITATIVE_EVALUATION_EDEFAULT;
      case TGRLPackage.MAPPING__EXCEEDS:
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
    result.append(", valuation: ");
    result.append(valuation);
    result.append(", qualitativeEvaluation: ");
    result.append(qualitativeEvaluation);
    result.append(", exceeds: ");
    result.append(exceeds);
    result.append(')');
    return result.toString();
  }

} //MappingImpl
