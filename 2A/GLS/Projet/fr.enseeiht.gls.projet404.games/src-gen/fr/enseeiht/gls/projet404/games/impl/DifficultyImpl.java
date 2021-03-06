/**
 * generated by Xtext 2.10.0
 */
package fr.enseeiht.gls.projet404.games.impl;

import fr.enseeiht.gls.projet404.games.Difficulty;
import fr.enseeiht.gls.projet404.games.GamesPackage;
import fr.enseeiht.gls.projet404.games.ItemInSomething;
import fr.enseeiht.gls.projet404.games.Knowledge;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Difficulty</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.DifficultyImpl#getLvl <em>Lvl</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.DifficultyImpl#getSizeMax <em>Size Max</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.DifficultyImpl#getItems <em>Items</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.DifficultyImpl#getKnowledges <em>Knowledges</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DifficultyImpl extends MinimalEObjectImpl.Container implements Difficulty
{
  /**
   * The default value of the '{@link #getLvl() <em>Lvl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLvl()
   * @generated
   * @ordered
   */
  protected static final int LVL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLvl() <em>Lvl</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLvl()
   * @generated
   * @ordered
   */
  protected int lvl = LVL_EDEFAULT;

  /**
   * The default value of the '{@link #getSizeMax() <em>Size Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizeMax()
   * @generated
   * @ordered
   */
  protected static final int SIZE_MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSizeMax() <em>Size Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSizeMax()
   * @generated
   * @ordered
   */
  protected int sizeMax = SIZE_MAX_EDEFAULT;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected EList<ItemInSomething> items;

  /**
   * The cached value of the '{@link #getKnowledges() <em>Knowledges</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnowledges()
   * @generated
   * @ordered
   */
  protected EList<Knowledge> knowledges;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DifficultyImpl()
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
    return GamesPackage.Literals.DIFFICULTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLvl()
  {
    return lvl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLvl(int newLvl)
  {
    int oldLvl = lvl;
    lvl = newLvl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.DIFFICULTY__LVL, oldLvl, lvl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSizeMax()
  {
    return sizeMax;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSizeMax(int newSizeMax)
  {
    int oldSizeMax = sizeMax;
    sizeMax = newSizeMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.DIFFICULTY__SIZE_MAX, oldSizeMax, sizeMax));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemInSomething> getItems()
  {
    if (items == null)
    {
      items = new EObjectContainmentEList<ItemInSomething>(ItemInSomething.class, this, GamesPackage.DIFFICULTY__ITEMS);
    }
    return items;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Knowledge> getKnowledges()
  {
    if (knowledges == null)
    {
      knowledges = new EObjectResolvingEList<Knowledge>(Knowledge.class, this, GamesPackage.DIFFICULTY__KNOWLEDGES);
    }
    return knowledges;
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
      case GamesPackage.DIFFICULTY__ITEMS:
        return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
      case GamesPackage.DIFFICULTY__LVL:
        return getLvl();
      case GamesPackage.DIFFICULTY__SIZE_MAX:
        return getSizeMax();
      case GamesPackage.DIFFICULTY__ITEMS:
        return getItems();
      case GamesPackage.DIFFICULTY__KNOWLEDGES:
        return getKnowledges();
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
      case GamesPackage.DIFFICULTY__LVL:
        setLvl((Integer)newValue);
        return;
      case GamesPackage.DIFFICULTY__SIZE_MAX:
        setSizeMax((Integer)newValue);
        return;
      case GamesPackage.DIFFICULTY__ITEMS:
        getItems().clear();
        getItems().addAll((Collection<? extends ItemInSomething>)newValue);
        return;
      case GamesPackage.DIFFICULTY__KNOWLEDGES:
        getKnowledges().clear();
        getKnowledges().addAll((Collection<? extends Knowledge>)newValue);
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
      case GamesPackage.DIFFICULTY__LVL:
        setLvl(LVL_EDEFAULT);
        return;
      case GamesPackage.DIFFICULTY__SIZE_MAX:
        setSizeMax(SIZE_MAX_EDEFAULT);
        return;
      case GamesPackage.DIFFICULTY__ITEMS:
        getItems().clear();
        return;
      case GamesPackage.DIFFICULTY__KNOWLEDGES:
        getKnowledges().clear();
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
      case GamesPackage.DIFFICULTY__LVL:
        return lvl != LVL_EDEFAULT;
      case GamesPackage.DIFFICULTY__SIZE_MAX:
        return sizeMax != SIZE_MAX_EDEFAULT;
      case GamesPackage.DIFFICULTY__ITEMS:
        return items != null && !items.isEmpty();
      case GamesPackage.DIFFICULTY__KNOWLEDGES:
        return knowledges != null && !knowledges.isEmpty();
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
    result.append(" (lvl: ");
    result.append(lvl);
    result.append(", sizeMax: ");
    result.append(sizeMax);
    result.append(')');
    return result.toString();
  }

} //DifficultyImpl
