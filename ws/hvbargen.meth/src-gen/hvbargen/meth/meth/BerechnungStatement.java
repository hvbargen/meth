/**
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.meth;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Berechnung Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hvbargen.meth.meth.BerechnungStatement#getBerechnungname <em>Berechnungname</em>}</li>
 *   <li>{@link hvbargen.meth.meth.BerechnungStatement#getFormel <em>Formel</em>}</li>
 *   <li>{@link hvbargen.meth.meth.BerechnungStatement#getBezeichnung <em>Bezeichnung</em>}</li>
 * </ul>
 *
 * @see hvbargen.meth.meth.MethPackage#getBerechnungStatement()
 * @model
 * @generated
 */
public interface BerechnungStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>Berechnungname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Berechnungname</em>' attribute.
   * @see #setBerechnungname(String)
   * @see hvbargen.meth.meth.MethPackage#getBerechnungStatement_Berechnungname()
   * @model
   * @generated
   */
  String getBerechnungname();

  /**
   * Sets the value of the '{@link hvbargen.meth.meth.BerechnungStatement#getBerechnungname <em>Berechnungname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Berechnungname</em>' attribute.
   * @see #getBerechnungname()
   * @generated
   */
  void setBerechnungname(String value);

  /**
   * Returns the value of the '<em><b>Formel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Formel</em>' containment reference.
   * @see #setFormel(Formel)
   * @see hvbargen.meth.meth.MethPackage#getBerechnungStatement_Formel()
   * @model containment="true"
   * @generated
   */
  Formel getFormel();

  /**
   * Sets the value of the '{@link hvbargen.meth.meth.BerechnungStatement#getFormel <em>Formel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Formel</em>' containment reference.
   * @see #getFormel()
   * @generated
   */
  void setFormel(Formel value);

  /**
   * Returns the value of the '<em><b>Bezeichnung</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bezeichnung</em>' attribute.
   * @see #setBezeichnung(String)
   * @see hvbargen.meth.meth.MethPackage#getBerechnungStatement_Bezeichnung()
   * @model
   * @generated
   */
  String getBezeichnung();

  /**
   * Sets the value of the '{@link hvbargen.meth.meth.BerechnungStatement#getBezeichnung <em>Bezeichnung</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bezeichnung</em>' attribute.
   * @see #getBezeichnung()
   * @generated
   */
  void setBezeichnung(String value);

} // BerechnungStatement
