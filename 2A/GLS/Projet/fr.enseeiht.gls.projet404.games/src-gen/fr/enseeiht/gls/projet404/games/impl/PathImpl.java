/**
 * generated by Xtext 2.10.0
 */
package fr.enseeiht.gls.projet404.games.impl;

import fr.enseeiht.gls.projet404.games.Condition;
import fr.enseeiht.gls.projet404.games.GamesPackage;
import fr.enseeiht.gls.projet404.games.ItemInSomething;
import fr.enseeiht.gls.projet404.games.Knowledge;
import fr.enseeiht.gls.projet404.games.Path;
import fr.enseeiht.gls.projet404.games.Place;

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
 * An implementation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PathImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PathImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PathImpl#getVisible <em>Visible</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PathImpl#getConditionVisible <em>Condition Visible</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PathImpl#getEndPlace <em>End Place</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PathImpl#getIsOpen <em>Is Open</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PathImpl#getConditionsOpening <em>Conditions Opening</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PathImpl#getIsMandatory <em>Is Mandatory</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PathImpl#getKnowledgeGiven <em>Knowledge Given</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PathImpl#getItemsGiven <em>Items Given</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.PathImpl#getItemsConsumed <em>Items Consumed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathImpl extends MinimalEObjectImpl.Container implements Path
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
   * The cached value of the '{@link #getConditionVisible() <em>Condition Visible</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionVisible()
   * @generated
   * @ordered
   */
  protected EList<Condition> conditionVisible;

  /**
   * The cached value of the '{@link #getEndPlace() <em>End Place</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndPlace()
   * @generated
   * @ordered
   */
  protected Place endPlace;

  /**
   * The default value of the '{@link #getIsOpen() <em>Is Open</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsOpen()
   * @generated
   * @ordered
   */
  protected static final int IS_OPEN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIsOpen() <em>Is Open</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsOpen()
   * @generated
   * @ordered
   */
  protected int isOpen = IS_OPEN_EDEFAULT;

  /**
   * The cached value of the '{@link #getConditionsOpening() <em>Conditions Opening</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionsOpening()
   * @generated
   * @ordered
   */
  protected EList<Condition> conditionsOpening;

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
   * The cached value of the '{@link #getKnowledgeGiven() <em>Knowledge Given</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKnowledgeGiven()
   * @generated
   * @ordered
   */
  protected EList<Knowledge> knowledgeGiven;

  /**
   * The cached value of the '{@link #getItemsGiven() <em>Items Given</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemsGiven()
   * @generated
   * @ordered
   */
  protected EList<ItemInSomething> itemsGiven;

  /**
   * The cached value of the '{@link #getItemsConsumed() <em>Items Consumed</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItemsConsumed()
   * @generated
   * @ordered
   */
  protected EList<ItemInSomething> itemsConsumed;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PathImpl()
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
    return GamesPackage.Literals.PATH;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.PATH__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.PATH__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.PATH__VISIBLE, oldVisible, visible));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getConditionVisible()
  {
    if (conditionVisible == null)
    {
      conditionVisible = new EObjectContainmentEList<Condition>(Condition.class, this, GamesPackage.PATH__CONDITION_VISIBLE);
    }
    return conditionVisible;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Place getEndPlace()
  {
    if (endPlace != null && endPlace.eIsProxy())
    {
      InternalEObject oldEndPlace = (InternalEObject)endPlace;
      endPlace = (Place)eResolveProxy(oldEndPlace);
      if (endPlace != oldEndPlace)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamesPackage.PATH__END_PLACE, oldEndPlace, endPlace));
      }
    }
    return endPlace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Place basicGetEndPlace()
  {
    return endPlace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndPlace(Place newEndPlace)
  {
    Place oldEndPlace = endPlace;
    endPlace = newEndPlace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.PATH__END_PLACE, oldEndPlace, endPlace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIsOpen()
  {
    return isOpen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsOpen(int newIsOpen)
  {
    int oldIsOpen = isOpen;
    isOpen = newIsOpen;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.PATH__IS_OPEN, oldIsOpen, isOpen));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getConditionsOpening()
  {
    if (conditionsOpening == null)
    {
      conditionsOpening = new EObjectContainmentEList<Condition>(Condition.class, this, GamesPackage.PATH__CONDITIONS_OPENING);
    }
    return conditionsOpening;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.PATH__IS_MANDATORY, oldIsMandatory, isMandatory));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Knowledge> getKnowledgeGiven()
  {
    if (knowledgeGiven == null)
    {
      knowledgeGiven = new EObjectResolvingEList<Knowledge>(Knowledge.class, this, GamesPackage.PATH__KNOWLEDGE_GIVEN);
    }
    return knowledgeGiven;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemInSomething> getItemsGiven()
  {
    if (itemsGiven == null)
    {
      itemsGiven = new EObjectContainmentEList<ItemInSomething>(ItemInSomething.class, this, GamesPackage.PATH__ITEMS_GIVEN);
    }
    return itemsGiven;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ItemInSomething> getItemsConsumed()
  {
    if (itemsConsumed == null)
    {
      itemsConsumed = new EObjectContainmentEList<ItemInSomething>(ItemInSomething.class, this, GamesPackage.PATH__ITEMS_CONSUMED);
    }
    return itemsConsumed;
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
      case GamesPackage.PATH__CONDITION_VISIBLE:
        return ((InternalEList<?>)getConditionVisible()).basicRemove(otherEnd, msgs);
      case GamesPackage.PATH__CONDITIONS_OPENING:
        return ((InternalEList<?>)getConditionsOpening()).basicRemove(otherEnd, msgs);
      case GamesPackage.PATH__ITEMS_GIVEN:
        return ((InternalEList<?>)getItemsGiven()).basicRemove(otherEnd, msgs);
      case GamesPackage.PATH__ITEMS_CONSUMED:
        return ((InternalEList<?>)getItemsConsumed()).basicRemove(otherEnd, msgs);
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
      case GamesPackage.PATH__NAME:
        return getName();
      case GamesPackage.PATH__DESCRIPTION:
        return getDescription();
      case GamesPackage.PATH__VISIBLE:
        return getVisible();
      case GamesPackage.PATH__CONDITION_VISIBLE:
        return getConditionVisible();
      case GamesPackage.PATH__END_PLACE:
        if (resolve) return getEndPlace();
        return basicGetEndPlace();
      case GamesPackage.PATH__IS_OPEN:
        return getIsOpen();
      case GamesPackage.PATH__CONDITIONS_OPENING:
        return getConditionsOpening();
      case GamesPackage.PATH__IS_MANDATORY:
        return getIsMandatory();
      case GamesPackage.PATH__KNOWLEDGE_GIVEN:
        return getKnowledgeGiven();
      case GamesPackage.PATH__ITEMS_GIVEN:
        return getItemsGiven();
      case GamesPackage.PATH__ITEMS_CONSUMED:
        return getItemsConsumed();
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
      case GamesPackage.PATH__NAME:
        setName((String)newValue);
        return;
      case GamesPackage.PATH__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case GamesPackage.PATH__VISIBLE:
        setVisible((Integer)newValue);
        return;
      case GamesPackage.PATH__CONDITION_VISIBLE:
        getConditionVisible().clear();
        getConditionVisible().addAll((Collection<? extends Condition>)newValue);
        return;
      case GamesPackage.PATH__END_PLACE:
        setEndPlace((Place)newValue);
        return;
      case GamesPackage.PATH__IS_OPEN:
        setIsOpen((Integer)newValue);
        return;
      case GamesPackage.PATH__CONDITIONS_OPENING:
        getConditionsOpening().clear();
        getConditionsOpening().addAll((Collection<? extends Condition>)newValue);
        return;
      case GamesPackage.PATH__IS_MANDATORY:
        setIsMandatory((Integer)newValue);
        return;
      case GamesPackage.PATH__KNOWLEDGE_GIVEN:
        getKnowledgeGiven().clear();
        getKnowledgeGiven().addAll((Collection<? extends Knowledge>)newValue);
        return;
      case GamesPackage.PATH__ITEMS_GIVEN:
        getItemsGiven().clear();
        getItemsGiven().addAll((Collection<? extends ItemInSomething>)newValue);
        return;
      case GamesPackage.PATH__ITEMS_CONSUMED:
        getItemsConsumed().clear();
        getItemsConsumed().addAll((Collection<? extends ItemInSomething>)newValue);
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
      case GamesPackage.PATH__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GamesPackage.PATH__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case GamesPackage.PATH__VISIBLE:
        setVisible(VISIBLE_EDEFAULT);
        return;
      case GamesPackage.PATH__CONDITION_VISIBLE:
        getConditionVisible().clear();
        return;
      case GamesPackage.PATH__END_PLACE:
        setEndPlace((Place)null);
        return;
      case GamesPackage.PATH__IS_OPEN:
        setIsOpen(IS_OPEN_EDEFAULT);
        return;
      case GamesPackage.PATH__CONDITIONS_OPENING:
        getConditionsOpening().clear();
        return;
      case GamesPackage.PATH__IS_MANDATORY:
        setIsMandatory(IS_MANDATORY_EDEFAULT);
        return;
      case GamesPackage.PATH__KNOWLEDGE_GIVEN:
        getKnowledgeGiven().clear();
        return;
      case GamesPackage.PATH__ITEMS_GIVEN:
        getItemsGiven().clear();
        return;
      case GamesPackage.PATH__ITEMS_CONSUMED:
        getItemsConsumed().clear();
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
      case GamesPackage.PATH__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GamesPackage.PATH__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case GamesPackage.PATH__VISIBLE:
        return visible != VISIBLE_EDEFAULT;
      case GamesPackage.PATH__CONDITION_VISIBLE:
        return conditionVisible != null && !conditionVisible.isEmpty();
      case GamesPackage.PATH__END_PLACE:
        return endPlace != null;
      case GamesPackage.PATH__IS_OPEN:
        return isOpen != IS_OPEN_EDEFAULT;
      case GamesPackage.PATH__CONDITIONS_OPENING:
        return conditionsOpening != null && !conditionsOpening.isEmpty();
      case GamesPackage.PATH__IS_MANDATORY:
        return isMandatory != IS_MANDATORY_EDEFAULT;
      case GamesPackage.PATH__KNOWLEDGE_GIVEN:
        return knowledgeGiven != null && !knowledgeGiven.isEmpty();
      case GamesPackage.PATH__ITEMS_GIVEN:
        return itemsGiven != null && !itemsGiven.isEmpty();
      case GamesPackage.PATH__ITEMS_CONSUMED:
        return itemsConsumed != null && !itemsConsumed.isEmpty();
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
    result.append(", isOpen: ");
    result.append(isOpen);
    result.append(", isMandatory: ");
    result.append(isMandatory);
    result.append(')');
    return result.toString();
  }

} //PathImpl