/**
 * generated by Xtext 2.10.0
 */
package fr.enseeiht.gls.projet404.games.impl;

import fr.enseeiht.gls.projet404.games.Action;
import fr.enseeiht.gls.projet404.games.Actions;
import fr.enseeiht.gls.projet404.games.Condition;
import fr.enseeiht.gls.projet404.games.Game;
import fr.enseeiht.gls.projet404.games.GamesPackage;
import fr.enseeiht.gls.projet404.games.Interaction;
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
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.ActionImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.ActionImpl#getVal <em>Val</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.ActionImpl#getInterSuivante <em>Inter Suivante</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.ActionImpl#getKnowledgeGiven <em>Knowledge Given</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.ActionImpl#getItemsGiven <em>Items Given</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.ActionImpl#getItemsConsumed <em>Items Consumed</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.ActionImpl#getConditionsActionsAvailable <em>Conditions Actions Available</em>}</li>
 *   <li>{@link fr.enseeiht.gls.projet404.games.impl.ActionImpl#getGame <em>Game</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action
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
   * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected static final Actions VAL_EDEFAULT = Actions.PRENDRE_CHEMIN;

  /**
   * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal()
   * @generated
   * @ordered
   */
  protected Actions val = VAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getInterSuivante() <em>Inter Suivante</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterSuivante()
   * @generated
   * @ordered
   */
  protected Interaction interSuivante;

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
   * The cached value of the '{@link #getConditionsActionsAvailable() <em>Conditions Actions Available</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditionsActionsAvailable()
   * @generated
   * @ordered
   */
  protected EList<Condition> conditionsActionsAvailable;

  /**
   * The cached value of the '{@link #getGame() <em>Game</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGame()
   * @generated
   * @ordered
   */
  protected Game game;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ActionImpl()
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
    return GamesPackage.Literals.ACTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.ACTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Actions getVal()
  {
    return val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal(Actions newVal)
  {
    Actions oldVal = val;
    val = newVal == null ? VAL_EDEFAULT : newVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.ACTION__VAL, oldVal, val));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Interaction getInterSuivante()
  {
    return interSuivante;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterSuivante(Interaction newInterSuivante, NotificationChain msgs)
  {
    Interaction oldInterSuivante = interSuivante;
    interSuivante = newInterSuivante;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GamesPackage.ACTION__INTER_SUIVANTE, oldInterSuivante, newInterSuivante);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterSuivante(Interaction newInterSuivante)
  {
    if (newInterSuivante != interSuivante)
    {
      NotificationChain msgs = null;
      if (interSuivante != null)
        msgs = ((InternalEObject)interSuivante).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GamesPackage.ACTION__INTER_SUIVANTE, null, msgs);
      if (newInterSuivante != null)
        msgs = ((InternalEObject)newInterSuivante).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GamesPackage.ACTION__INTER_SUIVANTE, null, msgs);
      msgs = basicSetInterSuivante(newInterSuivante, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.ACTION__INTER_SUIVANTE, newInterSuivante, newInterSuivante));
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
      knowledgeGiven = new EObjectResolvingEList<Knowledge>(Knowledge.class, this, GamesPackage.ACTION__KNOWLEDGE_GIVEN);
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
      itemsGiven = new EObjectContainmentEList<ItemInSomething>(ItemInSomething.class, this, GamesPackage.ACTION__ITEMS_GIVEN);
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
      itemsConsumed = new EObjectContainmentEList<ItemInSomething>(ItemInSomething.class, this, GamesPackage.ACTION__ITEMS_CONSUMED);
    }
    return itemsConsumed;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Condition> getConditionsActionsAvailable()
  {
    if (conditionsActionsAvailable == null)
    {
      conditionsActionsAvailable = new EObjectContainmentEList<Condition>(Condition.class, this, GamesPackage.ACTION__CONDITIONS_ACTIONS_AVAILABLE);
    }
    return conditionsActionsAvailable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Game getGame()
  {
    if (game != null && game.eIsProxy())
    {
      InternalEObject oldGame = (InternalEObject)game;
      game = (Game)eResolveProxy(oldGame);
      if (game != oldGame)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GamesPackage.ACTION__GAME, oldGame, game));
      }
    }
    return game;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Game basicGetGame()
  {
    return game;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGame(Game newGame)
  {
    Game oldGame = game;
    game = newGame;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GamesPackage.ACTION__GAME, oldGame, game));
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
      case GamesPackage.ACTION__INTER_SUIVANTE:
        return basicSetInterSuivante(null, msgs);
      case GamesPackage.ACTION__ITEMS_GIVEN:
        return ((InternalEList<?>)getItemsGiven()).basicRemove(otherEnd, msgs);
      case GamesPackage.ACTION__ITEMS_CONSUMED:
        return ((InternalEList<?>)getItemsConsumed()).basicRemove(otherEnd, msgs);
      case GamesPackage.ACTION__CONDITIONS_ACTIONS_AVAILABLE:
        return ((InternalEList<?>)getConditionsActionsAvailable()).basicRemove(otherEnd, msgs);
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
      case GamesPackage.ACTION__NAME:
        return getName();
      case GamesPackage.ACTION__VAL:
        return getVal();
      case GamesPackage.ACTION__INTER_SUIVANTE:
        return getInterSuivante();
      case GamesPackage.ACTION__KNOWLEDGE_GIVEN:
        return getKnowledgeGiven();
      case GamesPackage.ACTION__ITEMS_GIVEN:
        return getItemsGiven();
      case GamesPackage.ACTION__ITEMS_CONSUMED:
        return getItemsConsumed();
      case GamesPackage.ACTION__CONDITIONS_ACTIONS_AVAILABLE:
        return getConditionsActionsAvailable();
      case GamesPackage.ACTION__GAME:
        if (resolve) return getGame();
        return basicGetGame();
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
      case GamesPackage.ACTION__NAME:
        setName((String)newValue);
        return;
      case GamesPackage.ACTION__VAL:
        setVal((Actions)newValue);
        return;
      case GamesPackage.ACTION__INTER_SUIVANTE:
        setInterSuivante((Interaction)newValue);
        return;
      case GamesPackage.ACTION__KNOWLEDGE_GIVEN:
        getKnowledgeGiven().clear();
        getKnowledgeGiven().addAll((Collection<? extends Knowledge>)newValue);
        return;
      case GamesPackage.ACTION__ITEMS_GIVEN:
        getItemsGiven().clear();
        getItemsGiven().addAll((Collection<? extends ItemInSomething>)newValue);
        return;
      case GamesPackage.ACTION__ITEMS_CONSUMED:
        getItemsConsumed().clear();
        getItemsConsumed().addAll((Collection<? extends ItemInSomething>)newValue);
        return;
      case GamesPackage.ACTION__CONDITIONS_ACTIONS_AVAILABLE:
        getConditionsActionsAvailable().clear();
        getConditionsActionsAvailable().addAll((Collection<? extends Condition>)newValue);
        return;
      case GamesPackage.ACTION__GAME:
        setGame((Game)newValue);
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
      case GamesPackage.ACTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case GamesPackage.ACTION__VAL:
        setVal(VAL_EDEFAULT);
        return;
      case GamesPackage.ACTION__INTER_SUIVANTE:
        setInterSuivante((Interaction)null);
        return;
      case GamesPackage.ACTION__KNOWLEDGE_GIVEN:
        getKnowledgeGiven().clear();
        return;
      case GamesPackage.ACTION__ITEMS_GIVEN:
        getItemsGiven().clear();
        return;
      case GamesPackage.ACTION__ITEMS_CONSUMED:
        getItemsConsumed().clear();
        return;
      case GamesPackage.ACTION__CONDITIONS_ACTIONS_AVAILABLE:
        getConditionsActionsAvailable().clear();
        return;
      case GamesPackage.ACTION__GAME:
        setGame((Game)null);
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
      case GamesPackage.ACTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case GamesPackage.ACTION__VAL:
        return val != VAL_EDEFAULT;
      case GamesPackage.ACTION__INTER_SUIVANTE:
        return interSuivante != null;
      case GamesPackage.ACTION__KNOWLEDGE_GIVEN:
        return knowledgeGiven != null && !knowledgeGiven.isEmpty();
      case GamesPackage.ACTION__ITEMS_GIVEN:
        return itemsGiven != null && !itemsGiven.isEmpty();
      case GamesPackage.ACTION__ITEMS_CONSUMED:
        return itemsConsumed != null && !itemsConsumed.isEmpty();
      case GamesPackage.ACTION__CONDITIONS_ACTIONS_AVAILABLE:
        return conditionsActionsAvailable != null && !conditionsActionsAvailable.isEmpty();
      case GamesPackage.ACTION__GAME:
        return game != null;
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
    result.append(", val: ");
    result.append(val);
    result.append(')');
    return result.toString();
  }

} //ActionImpl