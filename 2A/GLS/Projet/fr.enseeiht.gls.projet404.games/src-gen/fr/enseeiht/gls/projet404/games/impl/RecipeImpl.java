/**
 * generated by Xtext 2.10.0
 */
package fr.enseeiht.gls.projet404.games.impl;

import fr.enseeiht.gls.projet404.games.Condition;
import fr.enseeiht.gls.projet404.games.GamesPackage;
import fr.enseeiht.gls.projet404.games.ItemInSomething;
import fr.enseeiht.gls.projet404.games.Recipe;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recipe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.RecipeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.RecipeImpl#getObjectsUsed <em>Objects Used</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.RecipeImpl#getConditions <em>Conditions</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.RecipeImpl#getItemsMade <em>Items Made</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecipeImpl extends MinimalEObjectImpl.Container implements Recipe
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
   * The cached value of the '{@link #getObjectsUsed() <em>Objects Used</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjectsUsed()
   * @generated
   * @ordered
   */
  protected EList<ItemInSomething> objectsUsed;

  /**
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
  protected EList<Condition> conditions;

  /**
   * The cached value of the '{@link #getItemsMade() <em>Items Made</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemsMade()
   * @generated
   * @ordered
   */
  protected EList<ItemInSomething> itemsMade;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RecipeImpl()
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
    return GamesPackage.Literals.RECIPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.RECIPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemInSomething> getObjectsUsed()
  {
    if (objectsUsed == null)
    {
      objectsUsed = new EObjectContainmentEList<ItemInSomething>(ItemInSomething.class, this, GamesPackage.RECIPE__OBJECTS_USED);
    }
    return objectsUsed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getConditions()
  {
    if (conditions == null)
    {
      conditions = new EObjectContainmentEList<Condition>(Condition.class, this, GamesPackage.RECIPE__CONDITIONS);
    }
    return conditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemInSomething> getItemsMade()
  {
    if (itemsMade == null)
    {
      itemsMade = new EObjectContainmentEList<ItemInSomething>(ItemInSomething.class, this, GamesPackage.RECIPE__ITEMS_MADE);
    }
    return itemsMade;
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
      case GamesPackage.RECIPE__OBJECTS_USED:
        return ((InternalEList<?>)getObjectsUsed()).basicRemove(otherEnd, msgs);
      case GamesPackage.RECIPE__CONDITIONS:
        return ((InternalEList<?>)getConditions()).basicRemove(otherEnd, msgs);
      case GamesPackage.RECIPE__ITEMS_MADE:
        return ((InternalEList<?>)getItemsMade()).basicRemove(otherEnd, msgs);
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
      case GamesPackage.RECIPE__NAME:
        return getName();
      case GamesPackage.RECIPE__OBJECTS_USED:
        return getObjectsUsed();
      case GamesPackage.RECIPE__CONDITIONS:
        return getConditions();
      case GamesPackage.RECIPE__ITEMS_MADE:
        return getItemsMade();
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
      case GamesPackage.RECIPE__NAME:
        setName((String)newValue);
        return;
      case GamesPackage.RECIPE__OBJECTS_USED:
        getObjectsUsed().clear();
        getObjectsUsed().addAll((Collection<? extends ItemInSomething>)newValue);
        return;
      case GamesPackage.RECIPE__CONDITIONS:
        getConditions().clear();
        getConditions().addAll((Collection<? extends Condition>)newValue);
        return;
      case GamesPackage.RECIPE__ITEMS_MADE:
        getItemsMade().clear();
        getItemsMade().addAll((Collection<? extends ItemInSomething>)newValue);
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
      case GamesPackage.RECIPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GamesPackage.RECIPE__OBJECTS_USED:
        getObjectsUsed().clear();
        return;
      case GamesPackage.RECIPE__CONDITIONS:
        getConditions().clear();
        return;
      case GamesPackage.RECIPE__ITEMS_MADE:
        getItemsMade().clear();
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
      case GamesPackage.RECIPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GamesPackage.RECIPE__OBJECTS_USED:
        return objectsUsed != null && !objectsUsed.isEmpty();
      case GamesPackage.RECIPE__CONDITIONS:
        return conditions != null && !conditions.isEmpty();
      case GamesPackage.RECIPE__ITEMS_MADE:
        return itemsMade != null && !itemsMade.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //RecipeImpl