/**
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.meth;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Einheit Addition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hvbargen.meth.meth.EinheitAddition#getLinks <em>Links</em>}</li>
 *   <li>{@link hvbargen.meth.meth.EinheitAddition#getOperator <em>Operator</em>}</li>
 *   <li>{@link hvbargen.meth.meth.EinheitAddition#getRechts <em>Rechts</em>}</li>
 * </ul>
 *
 * @see hvbargen.meth.meth.MethPackage#getEinheitAddition()
 * @model
 * @generated
 */
public interface EinheitAddition extends EinheitExpr
{
  /**
   * Returns the value of the '<em><b>Links</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Links</em>' containment reference.
   * @see #setLinks(EinheitExpr)
   * @see hvbargen.meth.meth.MethPackage#getEinheitAddition_Links()
   * @model containment="true"
   * @generated
   */
  EinheitExpr getLinks();

  /**
   * Sets the value of the '{@link hvbargen.meth.meth.EinheitAddition#getLinks <em>Links</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Links</em>' containment reference.
   * @see #getLinks()
   * @generated
   */
  void setLinks(EinheitExpr value);

  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see hvbargen.meth.meth.MethPackage#getEinheitAddition_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link hvbargen.meth.meth.EinheitAddition#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Rechts</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rechts</em>' containment reference.
   * @see #setRechts(EinheitExpr)
   * @see hvbargen.meth.meth.MethPackage#getEinheitAddition_Rechts()
   * @model containment="true"
   * @generated
   */
  EinheitExpr getRechts();

  /**
   * Sets the value of the '{@link hvbargen.meth.meth.EinheitAddition#getRechts <em>Rechts</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rechts</em>' containment reference.
   * @see #getRechts()
   * @generated
   */
  void setRechts(EinheitExpr value);

} // EinheitAddition
