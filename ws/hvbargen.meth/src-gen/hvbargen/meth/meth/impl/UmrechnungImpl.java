/**
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.meth.impl;

import hvbargen.meth.meth.Einheit;
import hvbargen.meth.meth.EinheitExpr;
import hvbargen.meth.meth.MethPackage;
import hvbargen.meth.meth.Umrechnung;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Umrechnung</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hvbargen.meth.meth.impl.UmrechnungImpl#getVarname <em>Varname</em>}</li>
 *   <li>{@link hvbargen.meth.meth.impl.UmrechnungImpl#getVonEinheit <em>Von Einheit</em>}</li>
 *   <li>{@link hvbargen.meth.meth.impl.UmrechnungImpl#getAusdruck <em>Ausdruck</em>}</li>
 *   <li>{@link hvbargen.meth.meth.impl.UmrechnungImpl#getNachEinheit <em>Nach Einheit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UmrechnungImpl extends DeklarationImpl implements Umrechnung
{
  /**
   * The default value of the '{@link #getVarname() <em>Varname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarname()
   * @generated
   * @ordered
   */
  protected static final String VARNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVarname() <em>Varname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarname()
   * @generated
   * @ordered
   */
  protected String varname = VARNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getVonEinheit() <em>Von Einheit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVonEinheit()
   * @generated
   * @ordered
   */
  protected Einheit vonEinheit;

  /**
   * The cached value of the '{@link #getAusdruck() <em>Ausdruck</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAusdruck()
   * @generated
   * @ordered
   */
  protected EinheitExpr ausdruck;

  /**
   * The cached value of the '{@link #getNachEinheit() <em>Nach Einheit</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNachEinheit()
   * @generated
   * @ordered
   */
  protected Einheit nachEinheit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UmrechnungImpl()
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
    return MethPackage.Literals.UMRECHNUNG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getVarname()
  {
    return varname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVarname(String newVarname)
  {
    String oldVarname = varname;
    varname = newVarname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MethPackage.UMRECHNUNG__VARNAME, oldVarname, varname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Einheit getVonEinheit()
  {
    if (vonEinheit != null && vonEinheit.eIsProxy())
    {
      InternalEObject oldVonEinheit = (InternalEObject)vonEinheit;
      vonEinheit = (Einheit)eResolveProxy(oldVonEinheit);
      if (vonEinheit != oldVonEinheit)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MethPackage.UMRECHNUNG__VON_EINHEIT, oldVonEinheit, vonEinheit));
      }
    }
    return vonEinheit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Einheit basicGetVonEinheit()
  {
    return vonEinheit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVonEinheit(Einheit newVonEinheit)
  {
    Einheit oldVonEinheit = vonEinheit;
    vonEinheit = newVonEinheit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MethPackage.UMRECHNUNG__VON_EINHEIT, oldVonEinheit, vonEinheit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EinheitExpr getAusdruck()
  {
    return ausdruck;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAusdruck(EinheitExpr newAusdruck, NotificationChain msgs)
  {
    EinheitExpr oldAusdruck = ausdruck;
    ausdruck = newAusdruck;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MethPackage.UMRECHNUNG__AUSDRUCK, oldAusdruck, newAusdruck);
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
  public void setAusdruck(EinheitExpr newAusdruck)
  {
    if (newAusdruck != ausdruck)
    {
      NotificationChain msgs = null;
      if (ausdruck != null)
        msgs = ((InternalEObject)ausdruck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MethPackage.UMRECHNUNG__AUSDRUCK, null, msgs);
      if (newAusdruck != null)
        msgs = ((InternalEObject)newAusdruck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MethPackage.UMRECHNUNG__AUSDRUCK, null, msgs);
      msgs = basicSetAusdruck(newAusdruck, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MethPackage.UMRECHNUNG__AUSDRUCK, newAusdruck, newAusdruck));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Einheit getNachEinheit()
  {
    if (nachEinheit != null && nachEinheit.eIsProxy())
    {
      InternalEObject oldNachEinheit = (InternalEObject)nachEinheit;
      nachEinheit = (Einheit)eResolveProxy(oldNachEinheit);
      if (nachEinheit != oldNachEinheit)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MethPackage.UMRECHNUNG__NACH_EINHEIT, oldNachEinheit, nachEinheit));
      }
    }
    return nachEinheit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Einheit basicGetNachEinheit()
  {
    return nachEinheit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNachEinheit(Einheit newNachEinheit)
  {
    Einheit oldNachEinheit = nachEinheit;
    nachEinheit = newNachEinheit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MethPackage.UMRECHNUNG__NACH_EINHEIT, oldNachEinheit, nachEinheit));
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
      case MethPackage.UMRECHNUNG__AUSDRUCK:
        return basicSetAusdruck(null, msgs);
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
      case MethPackage.UMRECHNUNG__VARNAME:
        return getVarname();
      case MethPackage.UMRECHNUNG__VON_EINHEIT:
        if (resolve) return getVonEinheit();
        return basicGetVonEinheit();
      case MethPackage.UMRECHNUNG__AUSDRUCK:
        return getAusdruck();
      case MethPackage.UMRECHNUNG__NACH_EINHEIT:
        if (resolve) return getNachEinheit();
        return basicGetNachEinheit();
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
      case MethPackage.UMRECHNUNG__VARNAME:
        setVarname((String)newValue);
        return;
      case MethPackage.UMRECHNUNG__VON_EINHEIT:
        setVonEinheit((Einheit)newValue);
        return;
      case MethPackage.UMRECHNUNG__AUSDRUCK:
        setAusdruck((EinheitExpr)newValue);
        return;
      case MethPackage.UMRECHNUNG__NACH_EINHEIT:
        setNachEinheit((Einheit)newValue);
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
      case MethPackage.UMRECHNUNG__VARNAME:
        setVarname(VARNAME_EDEFAULT);
        return;
      case MethPackage.UMRECHNUNG__VON_EINHEIT:
        setVonEinheit((Einheit)null);
        return;
      case MethPackage.UMRECHNUNG__AUSDRUCK:
        setAusdruck((EinheitExpr)null);
        return;
      case MethPackage.UMRECHNUNG__NACH_EINHEIT:
        setNachEinheit((Einheit)null);
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
      case MethPackage.UMRECHNUNG__VARNAME:
        return VARNAME_EDEFAULT == null ? varname != null : !VARNAME_EDEFAULT.equals(varname);
      case MethPackage.UMRECHNUNG__VON_EINHEIT:
        return vonEinheit != null;
      case MethPackage.UMRECHNUNG__AUSDRUCK:
        return ausdruck != null;
      case MethPackage.UMRECHNUNG__NACH_EINHEIT:
        return nachEinheit != null;
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
    result.append(" (varname: ");
    result.append(varname);
    result.append(')');
    return result.toString();
  }

} //UmrechnungImpl
