/**
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.meth.impl;

import hvbargen.meth.meth.Einheitensystem;
import hvbargen.meth.meth.MethPackage;
import hvbargen.meth.meth.Methode;
import hvbargen.meth.meth.Model;

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
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hvbargen.meth.meth.impl.ModelImpl#getEinheitensystem <em>Einheitensystem</em>}</li>
 *   <li>{@link hvbargen.meth.meth.impl.ModelImpl#getMethoden <em>Methoden</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getEinheitensystem() <em>Einheitensystem</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEinheitensystem()
   * @generated
   * @ordered
   */
  protected Einheitensystem einheitensystem;

  /**
   * The cached value of the '{@link #getMethoden() <em>Methoden</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethoden()
   * @generated
   * @ordered
   */
  protected EList<Methode> methoden;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return MethPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Einheitensystem getEinheitensystem()
  {
    return einheitensystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEinheitensystem(Einheitensystem newEinheitensystem, NotificationChain msgs)
  {
    Einheitensystem oldEinheitensystem = einheitensystem;
    einheitensystem = newEinheitensystem;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MethPackage.MODEL__EINHEITENSYSTEM, oldEinheitensystem, newEinheitensystem);
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
  public void setEinheitensystem(Einheitensystem newEinheitensystem)
  {
    if (newEinheitensystem != einheitensystem)
    {
      NotificationChain msgs = null;
      if (einheitensystem != null)
        msgs = ((InternalEObject)einheitensystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MethPackage.MODEL__EINHEITENSYSTEM, null, msgs);
      if (newEinheitensystem != null)
        msgs = ((InternalEObject)newEinheitensystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MethPackage.MODEL__EINHEITENSYSTEM, null, msgs);
      msgs = basicSetEinheitensystem(newEinheitensystem, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MethPackage.MODEL__EINHEITENSYSTEM, newEinheitensystem, newEinheitensystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Methode> getMethoden()
  {
    if (methoden == null)
    {
      methoden = new EObjectContainmentEList<Methode>(Methode.class, this, MethPackage.MODEL__METHODEN);
    }
    return methoden;
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
      case MethPackage.MODEL__EINHEITENSYSTEM:
        return basicSetEinheitensystem(null, msgs);
      case MethPackage.MODEL__METHODEN:
        return ((InternalEList<?>)getMethoden()).basicRemove(otherEnd, msgs);
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
      case MethPackage.MODEL__EINHEITENSYSTEM:
        return getEinheitensystem();
      case MethPackage.MODEL__METHODEN:
        return getMethoden();
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
      case MethPackage.MODEL__EINHEITENSYSTEM:
        setEinheitensystem((Einheitensystem)newValue);
        return;
      case MethPackage.MODEL__METHODEN:
        getMethoden().clear();
        getMethoden().addAll((Collection<? extends Methode>)newValue);
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
      case MethPackage.MODEL__EINHEITENSYSTEM:
        setEinheitensystem((Einheitensystem)null);
        return;
      case MethPackage.MODEL__METHODEN:
        getMethoden().clear();
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
      case MethPackage.MODEL__EINHEITENSYSTEM:
        return einheitensystem != null;
      case MethPackage.MODEL__METHODEN:
        return methoden != null && !methoden.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
