/**
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.meth.util;

import hvbargen.meth.meth.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hvbargen.meth.meth.MethPackage
 * @generated
 */
public class MethAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MethPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = MethPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MethSwitch<Adapter> modelSwitch =
    new MethSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseEinheitensystem(Einheitensystem object)
      {
        return createEinheitensystemAdapter();
      }
      @Override
      public Adapter caseDeklaration(Deklaration object)
      {
        return createDeklarationAdapter();
      }
      @Override
      public Adapter caseDimension(Dimension object)
      {
        return createDimensionAdapter();
      }
      @Override
      public Adapter caseDimensionExpr(DimensionExpr object)
      {
        return createDimensionExprAdapter();
      }
      @Override
      public Adapter caseEinheit(Einheit object)
      {
        return createEinheitAdapter();
      }
      @Override
      public Adapter caseUmrechnung(Umrechnung object)
      {
        return createUmrechnungAdapter();
      }
      @Override
      public Adapter caseKonstante(Konstante object)
      {
        return createKonstanteAdapter();
      }
      @Override
      public Adapter caseZahl(Zahl object)
      {
        return createZahlAdapter();
      }
      @Override
      public Adapter caseGanzzahl(Ganzzahl object)
      {
        return createGanzzahlAdapter();
      }
      @Override
      public Adapter caseDezimalzahl(Dezimalzahl object)
      {
        return createDezimalzahlAdapter();
      }
      @Override
      public Adapter caseEinheitExpr(EinheitExpr object)
      {
        return createEinheitExprAdapter();
      }
      @Override
      public Adapter caseMethode(Methode object)
      {
        return createMethodeAdapter();
      }
      @Override
      public Adapter caseGegeben(Gegeben object)
      {
        return createGegebenAdapter();
      }
      @Override
      public Adapter caseEingabe(Eingabe object)
      {
        return createEingabeAdapter();
      }
      @Override
      public Adapter caseBerechnung(Berechnung object)
      {
        return createBerechnungAdapter();
      }
      @Override
      public Adapter caseAusgabe(Ausgabe object)
      {
        return createAusgabeAdapter();
      }
      @Override
      public Adapter caseGegebenStatement(GegebenStatement object)
      {
        return createGegebenStatementAdapter();
      }
      @Override
      public Adapter caseEingabeStatement(EingabeStatement object)
      {
        return createEingabeStatementAdapter();
      }
      @Override
      public Adapter caseBerechnungStatement(BerechnungStatement object)
      {
        return createBerechnungStatementAdapter();
      }
      @Override
      public Adapter caseAusgabeStatement(AusgabeStatement object)
      {
        return createAusgabeStatementAdapter();
      }
      @Override
      public Adapter caseFormel(Formel object)
      {
        return createFormelAdapter();
      }
      @Override
      public Adapter caseTextFormel(TextFormel object)
      {
        return createTextFormelAdapter();
      }
      @Override
      public Adapter caseNumFormel(NumFormel object)
      {
        return createNumFormelAdapter();
      }
      @Override
      public Adapter caseDimensionMultiplikation(DimensionMultiplikation object)
      {
        return createDimensionMultiplikationAdapter();
      }
      @Override
      public Adapter caseEinheitAddition(EinheitAddition object)
      {
        return createEinheitAdditionAdapter();
      }
      @Override
      public Adapter caseEinheitMultiplikation(EinheitMultiplikation object)
      {
        return createEinheitMultiplikationAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Einheitensystem <em>Einheitensystem</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Einheitensystem
   * @generated
   */
  public Adapter createEinheitensystemAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Deklaration <em>Deklaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Deklaration
   * @generated
   */
  public Adapter createDeklarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Dimension <em>Dimension</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Dimension
   * @generated
   */
  public Adapter createDimensionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.DimensionExpr <em>Dimension Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.DimensionExpr
   * @generated
   */
  public Adapter createDimensionExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Einheit <em>Einheit</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Einheit
   * @generated
   */
  public Adapter createEinheitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Umrechnung <em>Umrechnung</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Umrechnung
   * @generated
   */
  public Adapter createUmrechnungAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Konstante <em>Konstante</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Konstante
   * @generated
   */
  public Adapter createKonstanteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Zahl <em>Zahl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Zahl
   * @generated
   */
  public Adapter createZahlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Ganzzahl <em>Ganzzahl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Ganzzahl
   * @generated
   */
  public Adapter createGanzzahlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Dezimalzahl <em>Dezimalzahl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Dezimalzahl
   * @generated
   */
  public Adapter createDezimalzahlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.EinheitExpr <em>Einheit Expr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.EinheitExpr
   * @generated
   */
  public Adapter createEinheitExprAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Methode <em>Methode</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Methode
   * @generated
   */
  public Adapter createMethodeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Gegeben <em>Gegeben</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Gegeben
   * @generated
   */
  public Adapter createGegebenAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Eingabe <em>Eingabe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Eingabe
   * @generated
   */
  public Adapter createEingabeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Berechnung <em>Berechnung</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Berechnung
   * @generated
   */
  public Adapter createBerechnungAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Ausgabe <em>Ausgabe</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Ausgabe
   * @generated
   */
  public Adapter createAusgabeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.GegebenStatement <em>Gegeben Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.GegebenStatement
   * @generated
   */
  public Adapter createGegebenStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.EingabeStatement <em>Eingabe Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.EingabeStatement
   * @generated
   */
  public Adapter createEingabeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.BerechnungStatement <em>Berechnung Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.BerechnungStatement
   * @generated
   */
  public Adapter createBerechnungStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.AusgabeStatement <em>Ausgabe Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.AusgabeStatement
   * @generated
   */
  public Adapter createAusgabeStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.Formel <em>Formel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.Formel
   * @generated
   */
  public Adapter createFormelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.TextFormel <em>Text Formel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.TextFormel
   * @generated
   */
  public Adapter createTextFormelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.NumFormel <em>Num Formel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.NumFormel
   * @generated
   */
  public Adapter createNumFormelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.DimensionMultiplikation <em>Dimension Multiplikation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.DimensionMultiplikation
   * @generated
   */
  public Adapter createDimensionMultiplikationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.EinheitAddition <em>Einheit Addition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.EinheitAddition
   * @generated
   */
  public Adapter createEinheitAdditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link hvbargen.meth.meth.EinheitMultiplikation <em>Einheit Multiplikation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see hvbargen.meth.meth.EinheitMultiplikation
   * @generated
   */
  public Adapter createEinheitMultiplikationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //MethAdapterFactory
