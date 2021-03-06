/**
 * generated by Xtext 2.10.0
 */
package fr.enseeiht.gls.projet404.games;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>People</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gls.projet404.games.People#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.People#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.People#getVisible <em>Visible</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.People#getConditionsVisible <em>Conditions Visible</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.People#getActive <em>Active</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.People#getConditionsActive <em>Conditions Active</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.People#getIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.People#getInteraction <em>Interaction</em>}</li>
 * </ul>
 *
 * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPeople()
 * @model
 * @generated
 */
public interface People extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPeople_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.gls.projet404.games.People#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPeople_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link fr.enseeiht.gls.projet404.games.People#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Visible</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visible</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visible</em>' attribute.
   * @see #setVisible(int)
   * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPeople_Visible()
   * @model
   * @generated
   */
  int getVisible();

  /**
   * Sets the value of the '{@link fr.enseeiht.gls.projet404.games.People#getVisible <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visible</em>' attribute.
   * @see #getVisible()
   * @generated
   */
  void setVisible(int value);

  /**
   * Returns the value of the '<em><b>Conditions Visible</b></em>' containment reference list.
   * The list contents are of type {@link fr.enseeiht.gls.projet404.games.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions Visible</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions Visible</em>' containment reference list.
   * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPeople_ConditionsVisible()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getConditionsVisible();

  /**
   * Returns the value of the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active</em>' attribute.
   * @see #setActive(int)
   * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPeople_Active()
   * @model
   * @generated
   */
  int getActive();

  /**
   * Sets the value of the '{@link fr.enseeiht.gls.projet404.games.People#getActive <em>Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Active</em>' attribute.
   * @see #getActive()
   * @generated
   */
  void setActive(int value);

  /**
   * Returns the value of the '<em><b>Conditions Active</b></em>' containment reference list.
   * The list contents are of type {@link fr.enseeiht.gls.projet404.games.Condition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditions Active</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions Active</em>' containment reference list.
   * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPeople_ConditionsActive()
   * @model containment="true"
   * @generated
   */
  EList<Condition> getConditionsActive();

  /**
   * Returns the value of the '<em><b>Is Mandatory</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Mandatory</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Mandatory</em>' attribute.
   * @see #setIsMandatory(int)
   * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPeople_IsMandatory()
   * @model
   * @generated
   */
  int getIsMandatory();

  /**
   * Sets the value of the '{@link fr.enseeiht.gls.projet404.games.People#getIsMandatory <em>Is Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Mandatory</em>' attribute.
   * @see #getIsMandatory()
   * @generated
   */
  void setIsMandatory(int value);

  /**
   * Returns the value of the '<em><b>Interaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interaction</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction</em>' containment reference.
   * @see #setInteraction(Interaction)
   * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPeople_Interaction()
   * @model containment="true"
   * @generated
   */
  Interaction getInteraction();

  /**
   * Sets the value of the '{@link fr.enseeiht.gls.projet404.games.People#getInteraction <em>Interaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interaction</em>' containment reference.
   * @see #getInteraction()
   * @generated
   */
  void setInteraction(Interaction value);

} // People
