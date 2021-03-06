/**
 * generated by Xtext 2.10.0
 */
package fr.enseeiht.gls.projet404.games;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Actions</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see fr.enseeiht.gls.projet404.games.GamesPackage#getActions()
 * @model
 * @generated
 */
public enum Actions implements Enumerator
{
  /**
   * The '<em><b>PRENDRE CHEMIN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRENDRE_CHEMIN_VALUE
   * @generated
   * @ordered
   */
  PRENDRE_CHEMIN(0, "PRENDRE_CHEMIN", "TAKE_PATH"),

  /**
   * The '<em><b>PRENDRE OBJET</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PRENDRE_OBJET_VALUE
   * @generated
   * @ordered
   */
  PRENDRE_OBJET(1, "PRENDRE_OBJET", "TAKE_ITEM"),

  /**
   * The '<em><b>APPRENDRE CONNAISSANCE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #APPRENDRE_CONNAISSANCE_VALUE
   * @generated
   * @ordered
   */
  APPRENDRE_CONNAISSANCE(2, "APPRENDRE_CONNAISSANCE", "LEARN_KNOWLEDGE"),

  /**
   * The '<em><b>QUITTER</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #QUITTER_VALUE
   * @generated
   * @ordered
   */
  QUITTER(3, "QUITTER", "QUIT"),

  /**
   * The '<em><b>CONSOMMER OBJET</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CONSOMMER_OBJET_VALUE
   * @generated
   * @ordered
   */
  CONSOMMER_OBJET(4, "CONSOMMER_OBJET", "CONSUME_ITEM");

  /**
   * The '<em><b>PRENDRE CHEMIN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PRENDRE CHEMIN</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRENDRE_CHEMIN
   * @model literal="TAKE_PATH"
   * @generated
   * @ordered
   */
  public static final int PRENDRE_CHEMIN_VALUE = 0;

  /**
   * The '<em><b>PRENDRE OBJET</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>PRENDRE OBJET</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PRENDRE_OBJET
   * @model literal="TAKE_ITEM"
   * @generated
   * @ordered
   */
  public static final int PRENDRE_OBJET_VALUE = 1;

  /**
   * The '<em><b>APPRENDRE CONNAISSANCE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>APPRENDRE CONNAISSANCE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #APPRENDRE_CONNAISSANCE
   * @model literal="LEARN_KNOWLEDGE"
   * @generated
   * @ordered
   */
  public static final int APPRENDRE_CONNAISSANCE_VALUE = 2;

  /**
   * The '<em><b>QUITTER</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>QUITTER</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #QUITTER
   * @model literal="QUIT"
   * @generated
   * @ordered
   */
  public static final int QUITTER_VALUE = 3;

  /**
   * The '<em><b>CONSOMMER OBJET</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CONSOMMER OBJET</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CONSOMMER_OBJET
   * @model literal="CONSUME_ITEM"
   * @generated
   * @ordered
   */
  public static final int CONSOMMER_OBJET_VALUE = 4;

  /**
   * An array of all the '<em><b>Actions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Actions[] VALUES_ARRAY =
    new Actions[]
    {
      PRENDRE_CHEMIN,
      PRENDRE_OBJET,
      APPRENDRE_CONNAISSANCE,
      QUITTER,
      CONSOMMER_OBJET,
    };

  /**
   * A public read-only list of all the '<em><b>Actions</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Actions> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Actions</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Actions get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Actions result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Actions</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Actions getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Actions result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Actions</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Actions get(int value)
  {
    switch (value)
    {
      case PRENDRE_CHEMIN_VALUE: return PRENDRE_CHEMIN;
      case PRENDRE_OBJET_VALUE: return PRENDRE_OBJET;
      case APPRENDRE_CONNAISSANCE_VALUE: return APPRENDRE_CONNAISSANCE;
      case QUITTER_VALUE: return QUITTER;
      case CONSOMMER_OBJET_VALUE: return CONSOMMER_OBJET;
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
  private Actions(int value, String name, String literal)
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
  
} //Actions
