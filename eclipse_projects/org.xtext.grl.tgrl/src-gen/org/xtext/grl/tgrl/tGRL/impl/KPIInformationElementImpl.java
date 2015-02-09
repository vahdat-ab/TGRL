/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.xtext.grl.tgrl.tGRL.KPIInformationElement;
import org.xtext.grl.tgrl.tGRL.KPIInformationElementRef;
import org.xtext.grl.tgrl.tGRL.KPIModelLink;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>KPI Information Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementImpl#getKpiModelLinksSrc <em>Kpi Model Links Src</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.KPIInformationElementImpl#getRefs <em>Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class KPIInformationElementImpl extends GRLModelElementImpl implements KPIInformationElement
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
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getKpiModelLinksSrc() <em>Kpi Model Links Src</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKpiModelLinksSrc()
   * @generated
   * @ordered
   */
  protected EList<KPIModelLink> kpiModelLinksSrc;

  /**
   * The cached value of the '{@link #getRefs() <em>Refs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefs()
   * @generated
   * @ordered
   */
  protected EList<KPIInformationElementRef> refs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KPIInformationElementImpl()
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
    return TGRLPackage.Literals.KPI_INFORMATION_ELEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.KPI_INFORMATION_ELEMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.KPI_INFORMATION_ELEMENT__LABEL, oldLabel, label));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.KPI_INFORMATION_ELEMENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KPIModelLink> getKpiModelLinksSrc()
  {
    if (kpiModelLinksSrc == null)
    {
      kpiModelLinksSrc = new EObjectResolvingEList<KPIModelLink>(KPIModelLink.class, this, TGRLPackage.KPI_INFORMATION_ELEMENT__KPI_MODEL_LINKS_SRC);
    }
    return kpiModelLinksSrc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<KPIInformationElementRef> getRefs()
  {
    if (refs == null)
    {
      refs = new EObjectResolvingEList<KPIInformationElementRef>(KPIInformationElementRef.class, this, TGRLPackage.KPI_INFORMATION_ELEMENT__REFS);
    }
    return refs;
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
      case TGRLPackage.KPI_INFORMATION_ELEMENT__NAME:
        return getName();
      case TGRLPackage.KPI_INFORMATION_ELEMENT__LABEL:
        return getLabel();
      case TGRLPackage.KPI_INFORMATION_ELEMENT__DESCRIPTION:
        return getDescription();
      case TGRLPackage.KPI_INFORMATION_ELEMENT__KPI_MODEL_LINKS_SRC:
        return getKpiModelLinksSrc();
      case TGRLPackage.KPI_INFORMATION_ELEMENT__REFS:
        return getRefs();
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
      case TGRLPackage.KPI_INFORMATION_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case TGRLPackage.KPI_INFORMATION_ELEMENT__LABEL:
        setLabel((String)newValue);
        return;
      case TGRLPackage.KPI_INFORMATION_ELEMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case TGRLPackage.KPI_INFORMATION_ELEMENT__KPI_MODEL_LINKS_SRC:
        getKpiModelLinksSrc().clear();
        getKpiModelLinksSrc().addAll((Collection<? extends KPIModelLink>)newValue);
        return;
      case TGRLPackage.KPI_INFORMATION_ELEMENT__REFS:
        getRefs().clear();
        getRefs().addAll((Collection<? extends KPIInformationElementRef>)newValue);
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
      case TGRLPackage.KPI_INFORMATION_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TGRLPackage.KPI_INFORMATION_ELEMENT__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case TGRLPackage.KPI_INFORMATION_ELEMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case TGRLPackage.KPI_INFORMATION_ELEMENT__KPI_MODEL_LINKS_SRC:
        getKpiModelLinksSrc().clear();
        return;
      case TGRLPackage.KPI_INFORMATION_ELEMENT__REFS:
        getRefs().clear();
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
      case TGRLPackage.KPI_INFORMATION_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TGRLPackage.KPI_INFORMATION_ELEMENT__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case TGRLPackage.KPI_INFORMATION_ELEMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case TGRLPackage.KPI_INFORMATION_ELEMENT__KPI_MODEL_LINKS_SRC:
        return kpiModelLinksSrc != null && !kpiModelLinksSrc.isEmpty();
      case TGRLPackage.KPI_INFORMATION_ELEMENT__REFS:
        return refs != null && !refs.isEmpty();
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
    result.append(", label: ");
    result.append(label);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //KPIInformationElementImpl
