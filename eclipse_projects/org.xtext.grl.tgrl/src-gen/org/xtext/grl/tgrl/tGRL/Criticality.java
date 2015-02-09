/**
 */
package org.xtext.grl.tgrl.tGRL;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Criticality</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.grl.tgrl.tGRL.TGRLPackage#getCriticality()
 * @model
 * @generated
 */
public enum Criticality implements Enumerator
{
  /**
   * The '<em><b>None</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #NONE_VALUE
   * @generated
   * @ordered
   */
  NONE(0, "None", "none"),

  /**
   * The '<em><b>High</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HIGH_VALUE
   * @generated
   * @ordered
   */
  HIGH(1, "High", "high"),

  /**
   * The '<em><b>Medium</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MEDIUM_VALUE
   * @generated
   * @ordered
   */
  MEDIUM(2, "Medium", "medium"),

  /**
   * The '<em><b>Low</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #LOW_VALUE
   * @generated
   * @ordered
   */
  LOW(3, "Low", "low");

  /**
   * The '<em><b>None</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #NONE
   * @model name="None" literal="none"
   * @generated
   * @ordered
   */
  public static final int NONE_VALUE = 0;

  /**
   * The '<em><b>High</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>High</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #HIGH
   * @model name="High" literal="high"
   * @generated
   * @ordered
   */
  public static final int HIGH_VALUE = 1;

  /**
   * The '<em><b>Medium</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Medium</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MEDIUM
   * @model name="Medium" literal="medium"
   * @generated
   * @ordered
   */
  public static final int MEDIUM_VALUE = 2;

  /**
   * The '<em><b>Low</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Low</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #LOW
   * @model name="Low" literal="low"
   * @generated
   * @ordered
   */
  public static final int LOW_VALUE = 3;

  /**
   * An array of all the '<em><b>Criticality</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Criticality[] VALUES_ARRAY =
    new Criticality[]
    {
      NONE,
      HIGH,
      MEDIUM,
      LOW,
    };

  /**
   * A public read-only list of all the '<em><b>Criticality</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Criticality> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Criticality</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Criticality get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Criticality result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Criticality</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Criticality getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Criticality result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Criticality</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Criticality get(int value)
  {
    switch (value)
    {
      case NONE_VALUE: return NONE;
      case HIGH_VALUE: return HIGH;
      case MEDIUM_VALUE: return MEDIUM;
      case LOW_VALUE: return LOW;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Criticality(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Criticality
