/**
 * generated by Xtext 2.10.0
 */
package fr.enseeiht.gls.projet404.games.impl;

import fr.enseeiht.gls.projet404.games.Condition;
import fr.enseeiht.gls.projet404.games.GamesPackage;
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
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Knowledge</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.KnowledgeImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.KnowledgeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.KnowledgeImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.KnowledgeImpl#getConditionsVisible <em>Conditions Visible</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.KnowledgeImpl#getActive <em>Active</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.KnowledgeImpl#getConditionsActive <em>Conditions Active</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.KnowledgeImpl#getConditionsGive <em>Conditions Give</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KnowledgeImpl extends MinimalEObjectImpl.Container implements Knowledge
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
   * The default value of the '{@link #getVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisible()
   * @generated
   * @ordered
   */
  protected static final int VISIBLE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getVisible() <em>Visible</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisible()
   * @generated
   * @ordered
   */
  protected int visible = VISIBLE_EDEFAULT;

  /**
   * The cached value of the '{@link #getConditionsVisible() <em>Conditions Visible</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionsVisible()
   * @generated
   * @ordered
   */
  protected EList<Condition> conditionsVisible;

  /**
   * The default value of the '{@link #getActive() <em>Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActive()
   * @generated
   * @ordered
   */
  protected static final int ACTIVE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getActive() <em>Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActive()
   * @generated
   * @ordered
   */
  protected int active = ACTIVE_EDEFAULT;

  /**
   * The cached value of the '{@link #getConditionsActive() <em>Conditions Active</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionsActive()
   * @generated
   * @ordered
   */
  protected EList<Condition> conditionsActive;

  /**
   * The cached value of the '{@link #getConditionsGive() <em>Conditions Give</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionsGive()
   * @generated
   * @ordered
   */
  protected EList<Condition> conditionsGive;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KnowledgeImpl()
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
    return GamesPackage.Literals.KNOWLEDGE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.KNOWLEDGE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.KNOWLEDGE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getVisible()
  {
    return visible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisible(int newVisible)
  {
    int oldVisible = visible;
    visible = newVisible;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.KNOWLEDGE__VISIBLE, oldVisible, visible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getConditionsVisible()
  {
    if (conditionsVisible == null)
    {
      conditionsVisible = new EObjectContainmentEList<Condition>(Condition.class, this, GamesPackage.KNOWLEDGE__CONDITIONS_VISIBLE);
    }
    return conditionsVisible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getActive()
  {
    return active;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActive(int newActive)
  {
    int oldActive = active;
    active = newActive;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.KNOWLEDGE__ACTIVE, oldActive, active));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getConditionsActive()
  {
    if (conditionsActive == null)
    {
      conditionsActive = new EObjectContainmentEList<Condition>(Condition.class, this, GamesPackage.KNOWLEDGE__CONDITIONS_ACTIVE);
    }
    return conditionsActive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getConditionsGive()
  {
    if (conditionsGive == null)
    {
      conditionsGive = new EObjectContainmentEList<Condition>(Condition.class, this, GamesPackage.KNOWLEDGE__CONDITIONS_GIVE);
    }
    return conditionsGive;
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
      case GamesPackage.KNOWLEDGE__CONDITIONS_VISIBLE:
        return ((InternalEList<?>)getConditionsVisible()).basicRemove(otherEnd, msgs);
      case GamesPackage.KNOWLEDGE__CONDITIONS_ACTIVE:
        return ((InternalEList<?>)getConditionsActive()).basicRemove(otherEnd, msgs);
      case GamesPackage.KNOWLEDGE__CONDITIONS_GIVE:
        return ((InternalEList<?>)getConditionsGive()).basicRemove(otherEnd, msgs);
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
      case GamesPackage.KNOWLEDGE__NAME:
        return getName();
      case GamesPackage.KNOWLEDGE__DESCRIPTION:
        return getDescription();
      case GamesPackage.KNOWLEDGE__VISIBLE:
        return getVisible();
      case GamesPackage.KNOWLEDGE__CONDITIONS_VISIBLE:
        return getConditionsVisible();
      case GamesPackage.KNOWLEDGE__ACTIVE:
        return getActive();
      case GamesPackage.KNOWLEDGE__CONDITIONS_ACTIVE:
        return getConditionsActive();
      case GamesPackage.KNOWLEDGE__CONDITIONS_GIVE:
        return getConditionsGive();
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
      case GamesPackage.KNOWLEDGE__NAME:
        setName((String)newValue);
        return;
      case GamesPackage.KNOWLEDGE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case GamesPackage.KNOWLEDGE__VISIBLE:
        setVisible((Integer)newValue);
        return;
      case GamesPackage.KNOWLEDGE__CONDITIONS_VISIBLE:
        getConditionsVisible().clear();
        getConditionsVisible().addAll((Collection<? extends Condition>)newValue);
        return;
      case GamesPackage.KNOWLEDGE__ACTIVE:
        setActive((Integer)newValue);
        return;
      case GamesPackage.KNOWLEDGE__CONDITIONS_ACTIVE:
        getConditionsActive().clear();
        getConditionsActive().addAll((Collection<? extends Condition>)newValue);
        return;
      case GamesPackage.KNOWLEDGE__CONDITIONS_GIVE:
        getConditionsGive().clear();
        getConditionsGive().addAll((Collection<? extends Condition>)newValue);
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
      case GamesPackage.KNOWLEDGE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GamesPackage.KNOWLEDGE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case GamesPackage.KNOWLEDGE__VISIBLE:
        setVisible(VISIBLE_EDEFAULT);
        return;
      case GamesPackage.KNOWLEDGE__CONDITIONS_VISIBLE:
        getConditionsVisible().clear();
        return;
      case GamesPackage.KNOWLEDGE__ACTIVE:
        setActive(ACTIVE_EDEFAULT);
        return;
      case GamesPackage.KNOWLEDGE__CONDITIONS_ACTIVE:
        getConditionsActive().clear();
        return;
      case GamesPackage.KNOWLEDGE__CONDITIONS_GIVE:
        getConditionsGive().clear();
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
      case GamesPackage.KNOWLEDGE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GamesPackage.KNOWLEDGE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case GamesPackage.KNOWLEDGE__VISIBLE:
        return visible != VISIBLE_EDEFAULT;
      case GamesPackage.KNOWLEDGE__CONDITIONS_VISIBLE:
        return conditionsVisible != null && !conditionsVisible.isEmpty();
      case GamesPackage.KNOWLEDGE__ACTIVE:
        return active != ACTIVE_EDEFAULT;
      case GamesPackage.KNOWLEDGE__CONDITIONS_ACTIVE:
        return conditionsActive != null && !conditionsActive.isEmpty();
      case GamesPackage.KNOWLEDGE__CONDITIONS_GIVE:
        return conditionsGive != null && !conditionsGive.isEmpty();
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
    result.append(", description: ");
    result.append(description);
    result.append(", visible: ");
    result.append(visible);
    result.append(", active: ");
    result.append(active);
    result.append(')');
    return result.toString();
  }

} //KnowledgeImpl
