/**
 */
package org.palladiosimulator.metricspec;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Monotonic</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Mathematical property of being monotonic.
 * <!-- end-model-doc -->
 * @see org.palladiosimulator.metricspec.MetricSpecPackage#getMonotonic()
 * @model
 * @generated
 */
public enum Monotonic implements Enumerator {
    /**
     * The '<em><b>No</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NO_VALUE
     * @generated
     * @ordered
     */
    NO(0, "No", "No"),

    /**
     * The '<em><b>Yes</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #YES_VALUE
     * @generated
     * @ordered
     */
    YES(1, "Yes", "Yes"),

    /**
     * The '<em><b>Strong</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #STRONG_VALUE
     * @generated
     * @ordered
     */
    STRONG(2, "Strong", "Strong");

    /**
     * The '<em><b>No</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>No</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #NO
     * @model name="No"
     * @generated
     * @ordered
     */
    public static final int NO_VALUE = 0;

    /**
     * The '<em><b>Yes</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Yes</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #YES
     * @model name="Yes"
     * @generated
     * @ordered
     */
    public static final int YES_VALUE = 1;

    /**
     * The '<em><b>Strong</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Strong</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #STRONG
     * @model name="Strong"
     * @generated
     * @ordered
     */
    public static final int STRONG_VALUE = 2;

    /**
     * An array of all the '<em><b>Monotonic</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final Monotonic[] VALUES_ARRAY =
        new Monotonic[] {
            NO,
            YES,
            STRONG,
        };

    /**
     * A public read-only list of all the '<em><b>Monotonic</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<Monotonic> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Monotonic</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Monotonic get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Monotonic result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Monotonic</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Monotonic getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Monotonic result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Monotonic</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Monotonic get(int value) {
        switch (value) {
            case NO_VALUE: return NO;
            case YES_VALUE: return YES;
            case STRONG_VALUE: return STRONG;
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
    private Monotonic(int value, String name, String literal) {
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
    
} //Monotonic
