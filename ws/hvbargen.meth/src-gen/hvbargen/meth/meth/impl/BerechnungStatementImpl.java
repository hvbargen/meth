/**
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.meth.impl;

import hvbargen.meth.meth.BerechnungStatement;
import hvbargen.meth.meth.Formel;
import hvbargen.meth.meth.MethPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Berechnung Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hvbargen.meth.meth.impl.BerechnungStatementImpl#getBerechnungname <em>Berechnungname</em>}</li>
 *   <li>{@link hvbargen.meth.meth.impl.BerechnungStatementImpl#getFormel <em>Formel</em>}</li>
 *   <li>{@link hvbargen.meth.meth.impl.BerechnungStatementImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BerechnungStatementImpl extends MinimalEObjectImpl.Container implements BerechnungStatement
{
  /**
   * The default value of the '{@link #getBerechnungname() <em>Berechnungname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBerechnungname()
   * @generated
   * @ordered
   */
  protected static final String BERECHNUNGNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBerechnungname() <em>Berechnungname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBerechnungname()
   * @generated
   * @ordered
   */
  protected String berechnungname = BERECHNUNGNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFormel() <em>Formel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormel()
   * @generated
   * @ordered
   */
  protected Formel formel;

  /**
   * The default value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBezeichnung()
   * @generated
   * @ordered
   */
  protected static final String BEZEICHNUNG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBezeichnung() <em>Bezeichnung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBezeichnung()
   * @generated
   * @ordered
   */
  protected String bezeichnung = BEZEICHNUNG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BerechnungStatementImpl()
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
    return MethPackage.Literals.BERECHNUNG_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBerechnungname()
  {
    return berechnungname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBerechnungname(String newBerechnungname)
  {
    String oldBerechnungname = berechnungname;
    berechnungname = newBerechnungname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MethPackage.BERECHNUNG_STATEMENT__BERECHNUNGNAME, oldBerechnungname, berechnungname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Formel getFormel()
  {
    return formel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFormel(Formel newFormel, NotificationChain msgs)
  {
    Formel oldFormel = formel;
    formel = newFormel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MethPackage.BERECHNUNG_STATEMENT__FORMEL, oldFormel, newFormel);
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
  public void setFormel(Formel newFormel)
  {
    if (newFormel != formel)
    {
      NotificationChain msgs = null;
      if (formel != null)
        msgs = ((InternalEObject)formel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MethPackage.BERECHNUNG_STATEMENT__FORMEL, null, msgs);
      if (newFormel != null)
        msgs = ((InternalEObject)newFormel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MethPackage.BERECHNUNG_STATEMENT__FORMEL, null, msgs);
      msgs = basicSetFormel(newFormel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MethPackage.BERECHNUNG_STATEMENT__FORMEL, newFormel, newFormel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBezeichnung()
  {
    return bezeichnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBezeichnung(String newBezeichnung)
  {
    String oldBezeichnung = bezeichnung;
    bezeichnung = newBezeichnung;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MethPackage.BERECHNUNG_STATEMENT__BEZEICHNUNG, oldBezeichnung, bezeichnung));
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
      case MethPackage.BERECHNUNG_STATEMENT__FORMEL:
        return basicSetFormel(null, msgs);
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
      case MethPackage.BERECHNUNG_STATEMENT__BERECHNUNGNAME:
        return getBerechnungname();
      case MethPackage.BERECHNUNG_STATEMENT__FORMEL:
        return getFormel();
      case MethPackage.BERECHNUNG_STATEMENT__BEZEICHNUNG:
        return getBezeichnung();
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
      case MethPackage.BERECHNUNG_STATEMENT__BERECHNUNGNAME:
        setBerechnungname((String)newValue);
        return;
      case MethPackage.BERECHNUNG_STATEMENT__FORMEL:
        setFormel((Formel)newValue);
        return;
      case MethPackage.BERECHNUNG_STATEMENT__BEZEICHNUNG:
        setBezeichnung((String)newValue);
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
      case MethPackage.BERECHNUNG_STATEMENT__BERECHNUNGNAME:
        setBerechnungname(BERECHNUNGNAME_EDEFAULT);
        return;
      case MethPackage.BERECHNUNG_STATEMENT__FORMEL:
        setFormel((Formel)null);
        return;
      case MethPackage.BERECHNUNG_STATEMENT__BEZEICHNUNG:
        setBezeichnung(BEZEICHNUNG_EDEFAULT);
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
      case MethPackage.BERECHNUNG_STATEMENT__BERECHNUNGNAME:
        return BERECHNUNGNAME_EDEFAULT == null ? berechnungname != null : !BERECHNUNGNAME_EDEFAULT.equals(berechnungname);
      case MethPackage.BERECHNUNG_STATEMENT__FORMEL:
        return formel != null;
      case MethPackage.BERECHNUNG_STATEMENT__BEZEICHNUNG:
        return BEZEICHNUNG_EDEFAULT == null ? bezeichnung != null : !BEZEICHNUNG_EDEFAULT.equals(bezeichnung);
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
    result.append(" (berechnungname: ");
    result.append(berechnungname);
    result.append(", bezeichnung: ");
    result.append(bezeichnung);
    result.append(')');
    return result.toString();
  }

} //BerechnungStatementImpl