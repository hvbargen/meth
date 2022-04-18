/**
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.meth.impl;

import hvbargen.meth.meth.EinheitExpr;
import hvbargen.meth.meth.EinheitMultiplikation;
import hvbargen.meth.meth.MethPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Einheit Multiplikation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hvbargen.meth.meth.impl.EinheitMultiplikationImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link hvbargen.meth.meth.impl.EinheitMultiplikationImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link hvbargen.meth.meth.impl.EinheitMultiplikationImpl#getRechts <em>Rechts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EinheitMultiplikationImpl extends EinheitExprImpl implements EinheitMultiplikation
{
  /**
   * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinks()
   * @generated
   * @ordered
   */
  protected EinheitExpr links;

  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getRechts() <em>Rechts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRechts()
   * @generated
   * @ordered
   */
  protected EinheitExpr rechts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EinheitMultiplikationImpl()
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
    return MethPackage.Literals.EINHEIT_MULTIPLIKATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EinheitExpr getLinks()
  {
    return links;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLinks(EinheitExpr newLinks, NotificationChain msgs)
  {
    EinheitExpr oldLinks = links;
    links = newLinks;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MethPackage.EINHEIT_MULTIPLIKATION__LINKS, oldLinks, newLinks);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLinks(EinheitExpr newLinks)
  {
    if (newLinks != links)
    {
      NotificationChain msgs = null;
      if (links != null)
        msgs = ((InternalEObject)links).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MethPackage.EINHEIT_MULTIPLIKATION__LINKS, null, msgs);
      if (newLinks != null)
        msgs = ((InternalEObject)newLinks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MethPackage.EINHEIT_MULTIPLIKATION__LINKS, null, msgs);
      msgs = basicSetLinks(newLinks, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MethPackage.EINHEIT_MULTIPLIKATION__LINKS, newLinks, newLinks));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MethPackage.EINHEIT_MULTIPLIKATION__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EinheitExpr getRechts()
  {
    return rechts;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRechts(EinheitExpr newRechts, NotificationChain msgs)
  {
    EinheitExpr oldRechts = rechts;
    rechts = newRechts;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MethPackage.EINHEIT_MULTIPLIKATION__RECHTS, oldRechts, newRechts);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRechts(EinheitExpr newRechts)
  {
    if (newRechts != rechts)
    {
      NotificationChain msgs = null;
      if (rechts != null)
        msgs = ((InternalEObject)rechts).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MethPackage.EINHEIT_MULTIPLIKATION__RECHTS, null, msgs);
      if (newRechts != null)
        msgs = ((InternalEObject)newRechts).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MethPackage.EINHEIT_MULTIPLIKATION__RECHTS, null, msgs);
      msgs = basicSetRechts(newRechts, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MethPackage.EINHEIT_MULTIPLIKATION__RECHTS, newRechts, newRechts));
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
      case MethPackage.EINHEIT_MULTIPLIKATION__LINKS:
        return basicSetLinks(null, msgs);
      case MethPackage.EINHEIT_MULTIPLIKATION__RECHTS:
        return basicSetRechts(null, msgs);
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
      case MethPackage.EINHEIT_MULTIPLIKATION__LINKS:
        return getLinks();
      case MethPackage.EINHEIT_MULTIPLIKATION__OPERATOR:
        return getOperator();
      case MethPackage.EINHEIT_MULTIPLIKATION__RECHTS:
        return getRechts();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MethPackage.EINHEIT_MULTIPLIKATION__LINKS:
        setLinks((EinheitExpr)newValue);
        return;
      case MethPackage.EINHEIT_MULTIPLIKATION__OPERATOR:
        setOperator((String)newValue);
        return;
      case MethPackage.EINHEIT_MULTIPLIKATION__RECHTS:
        setRechts((EinheitExpr)newValue);
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
      case MethPackage.EINHEIT_MULTIPLIKATION__LINKS:
        setLinks((EinheitExpr)null);
        return;
      case MethPackage.EINHEIT_MULTIPLIKATION__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case MethPackage.EINHEIT_MULTIPLIKATION__RECHTS:
        setRechts((EinheitExpr)null);
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
      case MethPackage.EINHEIT_MULTIPLIKATION__LINKS:
        return links != null;
      case MethPackage.EINHEIT_MULTIPLIKATION__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case MethPackage.EINHEIT_MULTIPLIKATION__RECHTS:
        return rechts != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //EinheitMultiplikationImpl