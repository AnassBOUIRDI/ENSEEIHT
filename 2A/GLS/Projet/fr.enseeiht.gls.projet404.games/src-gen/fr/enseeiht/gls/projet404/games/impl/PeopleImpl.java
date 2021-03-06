/**
 * generated by Xtext 2.10.0
 */
package fr.enseeiht.gls.projet404.games.impl;

import fr.enseeiht.gls.projet404.games.Condition;
import fr.enseeiht.gls.projet404.games.GamesPackage;
import fr.enseeiht.gls.projet404.games.Interaction;
import fr.enseeiht.gls.projet404.games.People;

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
 * An implementation of the model object '<em><b>People</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PeopleImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PeopleImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PeopleImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PeopleImpl#getConditionsVisible <em>Conditions Visible</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PeopleImpl#getActive <em>Active</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PeopleImpl#getConditionsActive <em>Conditions Active</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PeopleImpl#getIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PeopleImpl#getInteraction <em>Interaction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PeopleImpl extends MinimalEObjectImpl.Container implements People
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
   * The default value of the '{@link #getIsMandatory() <em>Is Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsMandatory()
   * @generated
   * @ordered
   */
  protected static final int IS_MANDATORY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIsMandatory() <em>Is Mandatory</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsMandatory()
   * @generated
   * @ordered
   */
  protected int isMandatory = IS_MANDATORY_EDEFAULT;

  /**
   * The cached value of the '{@link #getInteraction() <em>Interaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteraction()
   * @generated
   * @ordered
   */
  protected Interaction interaction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PeopleImpl()
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
    return GamesPackage.Literals.PEOPLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.PEOPLE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.PEOPLE__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.PEOPLE__VISIBLE, oldVisible, visible));
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
      conditionsVisible = new EObjectContainmentEList<Condition>(Condition.class, this, GamesPackage.PEOPLE__CONDITIONS_VISIBLE);
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
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.PEOPLE__ACTIVE, oldActive, active));
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
      conditionsActive = new EObjectContainmentEList<Condition>(Condition.class, this, GamesPackage.PEOPLE__CONDITIONS_ACTIVE);
    }
    return conditionsActive;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIsMandatory()
  {
    return isMandatory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsMandatory(int newIsMandatory)
  {
    int oldIsMandatory = isMandatory;
    isMandatory = newIsMandatory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.PEOPLE__IS_MANDATORY, oldIsMandatory, isMandatory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interaction getInteraction()
  {
    return interaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInteraction(Interaction newInteraction, NotificationChain msgs)
  {
    Interaction oldInteraction = interaction;
    interaction = newInteraction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamesPackage.PEOPLE__INTERACTION, oldInteraction, newInteraction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteraction(Interaction newInteraction)
  {
    if (newInteraction != interaction)
    {
      NotificationChain msgs = null;
      if (interaction != null)
        msgs = ((InternalEObject)interaction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamesPackage.PEOPLE__INTERACTION, null, msgs);
      if (newInteraction != null)
        msgs = ((InternalEObject)newInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamesPackage.PEOPLE__INTERACTION, null, msgs);
      msgs = basicSetInteraction(newInteraction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.PEOPLE__INTERACTION, newInteraction, newInteraction));
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
      case GamesPackage.PEOPLE__CONDITIONS_VISIBLE:
        return ((InternalEList<?>)getConditionsVisible()).basicRemove(otherEnd, msgs);
      case GamesPackage.PEOPLE__CONDITIONS_ACTIVE:
        return ((InternalEList<?>)getConditionsActive()).basicRemove(otherEnd, msgs);
      case GamesPackage.PEOPLE__INTERACTION:
        return basicSetInteraction(null, msgs);
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
      case GamesPackage.PEOPLE__NAME:
        return getName();
      case GamesPackage.PEOPLE__DESCRIPTION:
        return getDescription();
      case GamesPackage.PEOPLE__VISIBLE:
        return getVisible();
      case GamesPackage.PEOPLE__CONDITIONS_VISIBLE:
        return getConditionsVisible();
      case GamesPackage.PEOPLE__ACTIVE:
        return getActive();
      case GamesPackage.PEOPLE__CONDITIONS_ACTIVE:
        return getConditionsActive();
      case GamesPackage.PEOPLE__IS_MANDATORY:
        return getIsMandatory();
      case GamesPackage.PEOPLE__INTERACTION:
        return getInteraction();
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
      case GamesPackage.PEOPLE__NAME:
        setName((String)newValue);
        return;
      case GamesPackage.PEOPLE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case GamesPackage.PEOPLE__VISIBLE:
        setVisible((Integer)newValue);
        return;
      case GamesPackage.PEOPLE__CONDITIONS_VISIBLE:
        getConditionsVisible().clear();
        getConditionsVisible().addAll((Collection<? extends Condition>)newValue);
        return;
      case GamesPackage.PEOPLE__ACTIVE:
        setActive((Integer)newValue);
        return;
      case GamesPackage.PEOPLE__CONDITIONS_ACTIVE:
        getConditionsActive().clear();
        getConditionsActive().addAll((Collection<? extends Condition>)newValue);
        return;
      case GamesPackage.PEOPLE__IS_MANDATORY:
        setIsMandatory((Integer)newValue);
        return;
      case GamesPackage.PEOPLE__INTERACTION:
        setInteraction((Interaction)newValue);
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
      case GamesPackage.PEOPLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GamesPackage.PEOPLE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case GamesPackage.PEOPLE__VISIBLE:
        setVisible(VISIBLE_EDEFAULT);
        return;
      case GamesPackage.PEOPLE__CONDITIONS_VISIBLE:
        getConditionsVisible().clear();
        return;
      case GamesPackage.PEOPLE__ACTIVE:
        setActive(ACTIVE_EDEFAULT);
        return;
      case GamesPackage.PEOPLE__CONDITIONS_ACTIVE:
        getConditionsActive().clear();
        return;
      case GamesPackage.PEOPLE__IS_MANDATORY:
        setIsMandatory(IS_MANDATORY_EDEFAULT);
        return;
      case GamesPackage.PEOPLE__INTERACTION:
        setInteraction((Interaction)null);
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
      case GamesPackage.PEOPLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GamesPackage.PEOPLE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case GamesPackage.PEOPLE__VISIBLE:
        return visible != VISIBLE_EDEFAULT;
      case GamesPackage.PEOPLE__CONDITIONS_VISIBLE:
        return conditionsVisible != null && !conditionsVisible.isEmpty();
      case GamesPackage.PEOPLE__ACTIVE:
        return active != ACTIVE_EDEFAULT;
      case GamesPackage.PEOPLE__CONDITIONS_ACTIVE:
        return conditionsActive != null && !conditionsActive.isEmpty();
      case GamesPackage.PEOPLE__IS_MANDATORY:
        return isMandatory != IS_MANDATORY_EDEFAULT;
      case GamesPackage.PEOPLE__INTERACTION:
        return interaction != null;
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
    result.append(", isMandatory: ");
    result.append(isMandatory);
    result.append(')');
    return result.toString();
  }

} //PeopleImpl
