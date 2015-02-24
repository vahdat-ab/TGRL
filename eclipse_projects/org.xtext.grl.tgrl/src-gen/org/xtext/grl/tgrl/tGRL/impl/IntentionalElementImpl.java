/**
 */
package org.xtext.grl.tgrl.tGRL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.grl.tgrl.tGRL.Color;
import org.xtext.grl.tgrl.tGRL.DecompositionType;
import org.xtext.grl.tgrl.tGRL.ImportanceType;
import org.xtext.grl.tgrl.tGRL.InLineElementLink;
import org.xtext.grl.tgrl.tGRL.IntentionalElement;
import org.xtext.grl.tgrl.tGRL.TGRLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intentional Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl#getFillColor <em>Fill Color</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl#getDecompositionType <em>Decomposition Type</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl#getImportance <em>Importance</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl#getImportanceQuantitative <em>Importance Quantitative</em>}</li>
 *   <li>{@link org.xtext.grl.tgrl.tGRL.impl.IntentionalElementImpl#getElementLinks <em>Element Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntentionalElementImpl extends GRLElementImpl implements IntentionalElement
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
   * The default value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFillColor()
   * @generated
   * @ordered
   */
  protected static final Color FILL_COLOR_EDEFAULT = Color.WHITE;

  /**
   * The cached value of the '{@link #getFillColor() <em>Fill Color</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFillColor()
   * @generated
   * @ordered
   */
  protected Color fillColor = FILL_COLOR_EDEFAULT;

  /**
   * The default value of the '{@link #getDecompositionType() <em>Decomposition Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecompositionType()
   * @generated
   * @ordered
   */
  protected static final DecompositionType DECOMPOSITION_TYPE_EDEFAULT = DecompositionType.AND;

  /**
   * The cached value of the '{@link #getDecompositionType() <em>Decomposition Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecompositionType()
   * @generated
   * @ordered
   */
  protected DecompositionType decompositionType = DECOMPOSITION_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getImportance() <em>Importance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportance()
   * @generated
   * @ordered
   */
  protected static final ImportanceType IMPORTANCE_EDEFAULT = ImportanceType.NONE;

  /**
   * The cached value of the '{@link #getImportance() <em>Importance</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportance()
   * @generated
   * @ordered
   */
  protected ImportanceType importance = IMPORTANCE_EDEFAULT;

  /**
   * The default value of the '{@link #getImportanceQuantitative() <em>Importance Quantitative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportanceQuantitative()
   * @generated
   * @ordered
   */
  protected static final int IMPORTANCE_QUANTITATIVE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getImportanceQuantitative() <em>Importance Quantitative</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportanceQuantitative()
   * @generated
   * @ordered
   */
  protected int importanceQuantitative = IMPORTANCE_QUANTITATIVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getElementLinks() <em>Element Links</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementLinks()
   * @generated
   * @ordered
   */
  protected EList<InLineElementLink> elementLinks;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IntentionalElementImpl()
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
    return TGRLPackage.Literals.INTENTIONAL_ELEMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INTENTIONAL_ELEMENT__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INTENTIONAL_ELEMENT__LABEL, oldLabel, label));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INTENTIONAL_ELEMENT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getFillColor()
  {
    return fillColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFillColor(Color newFillColor)
  {
    Color oldFillColor = fillColor;
    fillColor = newFillColor == null ? FILL_COLOR_EDEFAULT : newFillColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INTENTIONAL_ELEMENT__FILL_COLOR, oldFillColor, fillColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DecompositionType getDecompositionType()
  {
    return decompositionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecompositionType(DecompositionType newDecompositionType)
  {
    DecompositionType oldDecompositionType = decompositionType;
    decompositionType = newDecompositionType == null ? DECOMPOSITION_TYPE_EDEFAULT : newDecompositionType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE, oldDecompositionType, decompositionType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportanceType getImportance()
  {
    return importance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportance(ImportanceType newImportance)
  {
    ImportanceType oldImportance = importance;
    importance = newImportance == null ? IMPORTANCE_EDEFAULT : newImportance;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INTENTIONAL_ELEMENT__IMPORTANCE, oldImportance, importance));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getImportanceQuantitative()
  {
    return importanceQuantitative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportanceQuantitative(int newImportanceQuantitative)
  {
    int oldImportanceQuantitative = importanceQuantitative;
    importanceQuantitative = newImportanceQuantitative;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TGRLPackage.INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE, oldImportanceQuantitative, importanceQuantitative));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<InLineElementLink> getElementLinks()
  {
    if (elementLinks == null)
    {
      elementLinks = new EObjectContainmentEList<InLineElementLink>(InLineElementLink.class, this, TGRLPackage.INTENTIONAL_ELEMENT__ELEMENT_LINKS);
    }
    return elementLinks;
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
      case TGRLPackage.INTENTIONAL_ELEMENT__ELEMENT_LINKS:
        return ((InternalEList<?>)getElementLinks()).basicRemove(otherEnd, msgs);
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
      case TGRLPackage.INTENTIONAL_ELEMENT__NAME:
        return getName();
      case TGRLPackage.INTENTIONAL_ELEMENT__LABEL:
        return getLabel();
      case TGRLPackage.INTENTIONAL_ELEMENT__DESCRIPTION:
        return getDescription();
      case TGRLPackage.INTENTIONAL_ELEMENT__FILL_COLOR:
        return getFillColor();
      case TGRLPackage.INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE:
        return getDecompositionType();
      case TGRLPackage.INTENTIONAL_ELEMENT__IMPORTANCE:
        return getImportance();
      case TGRLPackage.INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE:
        return getImportanceQuantitative();
      case TGRLPackage.INTENTIONAL_ELEMENT__ELEMENT_LINKS:
        return getElementLinks();
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
      case TGRLPackage.INTENTIONAL_ELEMENT__NAME:
        setName((String)newValue);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__LABEL:
        setLabel((String)newValue);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__FILL_COLOR:
        setFillColor((Color)newValue);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE:
        setDecompositionType((DecompositionType)newValue);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__IMPORTANCE:
        setImportance((ImportanceType)newValue);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE:
        setImportanceQuantitative((Integer)newValue);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__ELEMENT_LINKS:
        getElementLinks().clear();
        getElementLinks().addAll((Collection<? extends InLineElementLink>)newValue);
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
      case TGRLPackage.INTENTIONAL_ELEMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__LABEL:
        setLabel(LABEL_EDEFAULT);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__FILL_COLOR:
        setFillColor(FILL_COLOR_EDEFAULT);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE:
        setDecompositionType(DECOMPOSITION_TYPE_EDEFAULT);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__IMPORTANCE:
        setImportance(IMPORTANCE_EDEFAULT);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE:
        setImportanceQuantitative(IMPORTANCE_QUANTITATIVE_EDEFAULT);
        return;
      case TGRLPackage.INTENTIONAL_ELEMENT__ELEMENT_LINKS:
        getElementLinks().clear();
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
      case TGRLPackage.INTENTIONAL_ELEMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TGRLPackage.INTENTIONAL_ELEMENT__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
      case TGRLPackage.INTENTIONAL_ELEMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case TGRLPackage.INTENTIONAL_ELEMENT__FILL_COLOR:
        return fillColor != FILL_COLOR_EDEFAULT;
      case TGRLPackage.INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE:
        return decompositionType != DECOMPOSITION_TYPE_EDEFAULT;
      case TGRLPackage.INTENTIONAL_ELEMENT__IMPORTANCE:
        return importance != IMPORTANCE_EDEFAULT;
      case TGRLPackage.INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE:
        return importanceQuantitative != IMPORTANCE_QUANTITATIVE_EDEFAULT;
      case TGRLPackage.INTENTIONAL_ELEMENT__ELEMENT_LINKS:
        return elementLinks != null && !elementLinks.isEmpty();
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
    result.append(", fillColor: ");
    result.append(fillColor);
    result.append(", decompositionType: ");
    result.append(decompositionType);
    result.append(", importance: ");
    result.append(importance);
    result.append(", importanceQuantitative: ");
    result.append(importanceQuantitative);
    result.append(')');
    return result.toString();
  }

} //IntentionalElementImpl
