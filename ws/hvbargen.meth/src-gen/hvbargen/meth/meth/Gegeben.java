/**
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.meth;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gegeben</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hvbargen.meth.meth.Gegeben#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see hvbargen.meth.meth.MethPackage#getGegeben()
 * @model
 * @generated
 */
public interface Gegeben extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link hvbargen.meth.meth.GegebenStatement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see hvbargen.meth.meth.MethPackage#getGegeben_Statements()
   * @model containment="true"
   * @generated
   */
  EList<GegebenStatement> getStatements();

} // Gegeben
