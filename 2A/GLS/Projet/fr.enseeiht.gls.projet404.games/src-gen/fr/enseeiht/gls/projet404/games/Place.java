/**
 * generated by Xtext 2.10.0
 */
package fr.enseeiht.gls.projet404.games;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gls.projet404.games.Place#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.Place#getKnowledges <em>Knowledges</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.Place#getPeople <em>People</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.Place#getPaths <em>Paths</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.Place#getObjects <em>Objects</em>}</li>
 * </ul>
 *
 * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends EObject
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
   * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPlace_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.enseeiht.gls.projet404.games.Place#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Knowledges</b></em>' reference list.
   * The list contents are of type {@link fr.enseeiht.gls.projet404.games.Knowledge}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Knowledges</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Knowledges</em>' reference list.
   * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPlace_Knowledges()
   * @model
   * @generated
   */
  EList<Knowledge> getKnowledges();

  /**
   * Returns the value of the '<em><b>People</b></em>' reference list.
   * The list contents are of type {@link fr.enseeiht.gls.projet404.games.People}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>People</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>People</em>' reference list.
   * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPlace_People()
   * @model
   * @generated
   */
  EList<People> getPeople();

  /**
   * Returns the value of the '<em><b>Paths</b></em>' reference list.
   * The list contents are of type {@link fr.enseeiht.gls.projet404.games.Path}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Paths</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Paths</em>' reference list.
   * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPlace_Paths()
   * @model
   * @generated
   */
  EList<Path> getPaths();

  /**
   * Returns the value of the '<em><b>Objects</b></em>' containment reference list.
   * The list contents are of type {@link fr.enseeiht.gls.projet404.games.ItemInSomething}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Objects</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objects</em>' containment reference list.
   * @see fr.enseeiht.gls.projet404.games.GamesPackage#getPlace_Objects()
   * @model containment="true"
   * @generated
   */
  EList<ItemInSomething> getObjects();

} // Place
