/**
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.meth;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hvbargen.meth.meth.DimensionExpr#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see hvbargen.meth.meth.MethPackage#getDimensionExpr()
 * @model
 * @generated
 */
public interface DimensionExpr extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Dimension)
   * @see hvbargen.meth.meth.MethPackage#getDimensionExpr_Ref()
   * @model
   * @generated
   */
  Dimension getRef();

  /**
   * Sets the value of the '{@link hvbargen.meth.meth.DimensionExpr#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Dimension value);

} // DimensionExpr
