/**
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.meth.impl;

import hvbargen.meth.meth.MethPackage;
import hvbargen.meth.meth.Methode;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Methode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hvbargen.meth.meth.impl.MethodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link hvbargen.meth.meth.impl.MethodeImpl#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link hvbargen.meth.meth.impl.MethodeImpl#getAblauf <em>Ablauf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodeImpl extends MinimalEObjectImpl.Container implements Methode
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
   * The cached value of the '{@link #getAblauf() <em>Ablauf</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAblauf()
   * @generated
   * @ordered
   */
  protected EList<EObject> ablauf;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethodeImpl()
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
    return MethPackage.Literals.METHODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MethPackage.METHODE__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, MethPackage.METHODE__BEZEICHNUNG, oldBezeichnung, bezeichnung));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EObject> getAblauf()
  {
    if (ablauf == null)
    {
      ablauf = new EObjectContainmentEList<EObject>(EObject.class, this, MethPackage.METHODE__ABLAUF);
    }
    return ablauf;
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
      case MethPackage.METHODE__ABLAUF:
        return ((InternalEList<?>)getAblauf()).basicRemove(otherEnd, msgs);
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
      case MethPackage.METHODE__NAME:
        return getName();
      case MethPackage.METHODE__BEZEICHNUNG:
        return getBezeichnung();
      case MethPackage.METHODE__ABLAUF:
        return getAblauf();
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
      case MethPackage.METHODE__NAME:
        setName((String)newValue);
        return;
      case MethPackage.METHODE__BEZEICHNUNG:
        setBezeichnung((String)newValue);
        return;
      case MethPackage.METHODE__ABLAUF:
        getAblauf().clear();
        getAblauf().addAll((Collection<? extends EObject>)newValue);
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
      case MethPackage.METHODE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case MethPackage.METHODE__BEZEICHNUNG:
        setBezeichnung(BEZEICHNUNG_EDEFAULT);
        return;
      case MethPackage.METHODE__ABLAUF:
        getAblauf().clear();
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
      case MethPackage.METHODE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case MethPackage.METHODE__BEZEICHNUNG:
        return BEZEICHNUNG_EDEFAULT == null ? bezeichnung != null : !BEZEICHNUNG_EDEFAULT.equals(bezeichnung);
      case MethPackage.METHODE__ABLAUF:
        return ablauf != null && !ablauf.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", bezeichnung: ");
    result.append(bezeichnung);
    result.append(')');
    return result.toString();
  }

} //MethodeImpl
