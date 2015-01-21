/**
 */
package core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>CORE Feature Selection Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see core.CorePackage#getCOREFeatureSelectionStatus()
 * @model
 * @generated
 */
public enum COREFeatureSelectionStatus implements Enumerator {
	/**
	 * The '<em><b>NOT SELECTED NO ACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SELECTED_NO_ACTION_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SELECTED_NO_ACTION(0, "NOT_SELECTED_NO_ACTION", "NOT_SELECTED_NO_ACTION"),

	/**
	 * The '<em><b>USER SELECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #USER_SELECTED_VALUE
	 * @generated
	 * @ordered
	 */
	USER_SELECTED(1, "USER_SELECTED", "USER_SELECTED"),

	/**
	 * The '<em><b>AUTO SELECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_SELECTED_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_SELECTED(2, "AUTO_SELECTED", "AUTO_SELECTED"),

	/**
	 * The '<em><b>NOT SELECTED ACTION REQUIRED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SELECTED_ACTION_REQUIRED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SELECTED_ACTION_REQUIRED(3, "NOT_SELECTED_ACTION_REQUIRED", "NOT_SELECTED_ACTION_REQUIRED"),

	/**
	 * The '<em><b>WARNING USER SELECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING_USER_SELECTED_VALUE
	 * @generated
	 * @ordered
	 */
	WARNING_USER_SELECTED(4, "WARNING_USER_SELECTED", "WARNING_USER_SELECTED"),

	/**
	 * The '<em><b>WARNING AUTO SELECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WARNING_AUTO_SELECTED_VALUE
	 * @generated
	 * @ordered
	 */
	WARNING_AUTO_SELECTED(5, "WARNING_AUTO_SELECTED", ""),

	/**
	 * The '<em><b>REEXPOSE USER SELECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REEXPOSE_USER_SELECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REEXPOSE_USER_SELECTED(6, "REEXPOSE_USER_SELECTED", "REEXPOSE_USER_SELECTED"),

	/**
	 * The '<em><b>REEXPOSE AUTO SELECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REEXPOSE_AUTO_SELECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REEXPOSE_AUTO_SELECTED(7, "REEXPOSE_AUTO_SELECTED", "REEXPOSE_AUTO_SELECTED");

	/**
	 * The '<em><b>NOT SELECTED NO ACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT SELECTED NO ACTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_SELECTED_NO_ACTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SELECTED_NO_ACTION_VALUE = 0;

	/**
	 * The '<em><b>USER SELECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>USER SELECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #USER_SELECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int USER_SELECTED_VALUE = 1;

	/**
	 * The '<em><b>AUTO SELECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTO SELECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO_SELECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_SELECTED_VALUE = 2;

	/**
	 * The '<em><b>NOT SELECTED ACTION REQUIRED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT SELECTED ACTION REQUIRED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_SELECTED_ACTION_REQUIRED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SELECTED_ACTION_REQUIRED_VALUE = 3;

	/**
	 * The '<em><b>WARNING USER SELECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WARNING USER SELECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARNING_USER_SELECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WARNING_USER_SELECTED_VALUE = 4;

	/**
	 * The '<em><b>WARNING AUTO SELECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WARNING AUTO SELECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WARNING_AUTO_SELECTED
	 * @model literal=""
	 * @generated
	 * @ordered
	 */
	public static final int WARNING_AUTO_SELECTED_VALUE = 5;

	/**
	 * The '<em><b>REEXPOSE USER SELECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REEXPOSE USER SELECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REEXPOSE_USER_SELECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REEXPOSE_USER_SELECTED_VALUE = 6;

	/**
	 * The '<em><b>REEXPOSE AUTO SELECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REEXPOSE AUTO SELECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REEXPOSE_AUTO_SELECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REEXPOSE_AUTO_SELECTED_VALUE = 7;

	/**
	 * An array of all the '<em><b>CORE Feature Selection Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final COREFeatureSelectionStatus[] VALUES_ARRAY =
		new COREFeatureSelectionStatus[] {
			NOT_SELECTED_NO_ACTION,
			USER_SELECTED,
			AUTO_SELECTED,
			NOT_SELECTED_ACTION_REQUIRED,
			WARNING_USER_SELECTED,
			WARNING_AUTO_SELECTED,
			REEXPOSE_USER_SELECTED,
			REEXPOSE_AUTO_SELECTED,
		};

	/**
	 * A public read-only list of all the '<em><b>CORE Feature Selection Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<COREFeatureSelectionStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CORE Feature Selection Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static COREFeatureSelectionStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COREFeatureSelectionStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CORE Feature Selection Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static COREFeatureSelectionStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COREFeatureSelectionStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CORE Feature Selection Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static COREFeatureSelectionStatus get(int value) {
		switch (value) {
			case NOT_SELECTED_NO_ACTION_VALUE: return NOT_SELECTED_NO_ACTION;
			case USER_SELECTED_VALUE: return USER_SELECTED;
			case AUTO_SELECTED_VALUE: return AUTO_SELECTED;
			case NOT_SELECTED_ACTION_REQUIRED_VALUE: return NOT_SELECTED_ACTION_REQUIRED;
			case WARNING_USER_SELECTED_VALUE: return WARNING_USER_SELECTED;
			case WARNING_AUTO_SELECTED_VALUE: return WARNING_AUTO_SELECTED;
			case REEXPOSE_USER_SELECTED_VALUE: return REEXPOSE_USER_SELECTED;
			case REEXPOSE_AUTO_SELECTED_VALUE: return REEXPOSE_AUTO_SELECTED;
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
	private COREFeatureSelectionStatus(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //COREFeatureSelectionStatus
