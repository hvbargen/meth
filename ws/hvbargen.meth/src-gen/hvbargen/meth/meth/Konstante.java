/**
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.meth;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Konstante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hvbargen.meth.meth.Konstante#getName <em>Name</em>}</li>
 *   <li>{@link hvbargen.meth.meth.Konstante#getAusdruck <em>Ausdruck</em>}</li>
 * </ul>
 *
 * @see hvbargen.meth.meth.MethPackage#getKonstante()
 * @model
 * @generated
 */
public interface Konstante extends Deklaration
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see hvbargen.meth.meth.MethPackage#getKonstante_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link hvbargen.meth.meth.Konstante#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Ausdruck</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ausdruck</em>' containment reference.
   * @see #setAusdruck(EinheitExpr)
   * @see hvbargen.meth.meth.MethPackage#getKonstante_Ausdruck()
   * @model containment="true"
   * @generated
   */
  EinheitExpr getAusdruck();

  /**
   * Sets the value of the '{@link hvbargen.meth.meth.Konstante#getAusdruck <em>Ausdruck</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ausdruck</em>' containment reference.
   * @see #getAusdruck()
   * @generated
   */
  void setAusdruck(EinheitExpr value);

} // Konstante