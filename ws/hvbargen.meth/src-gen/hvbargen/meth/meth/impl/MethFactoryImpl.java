/**
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.meth.impl;

import hvbargen.meth.meth.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MethFactoryImpl extends EFactoryImpl implements MethFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MethFactory init()
  {
    try
    {
      MethFactory theMethFactory = (MethFactory)EPackage.Registry.INSTANCE.getEFactory(MethPackage.eNS_URI);
      if (theMethFactory != null)
      {
        return theMethFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MethFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MethFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MethPackage.MODEL: return createModel();
      case MethPackage.EINHEITENSYSTEM: return createEinheitensystem();
      case MethPackage.DEKLARATION: return createDeklaration();
      case MethPackage.DIMENSION: return createDimension();
      case MethPackage.DIMENSION_EXPR: return createDimensionExpr();
      case MethPackage.EINHEIT: return createEinheit();
      case MethPackage.UMRECHNUNG: return createUmrechnung();
      case MethPackage.KONSTANTE: return createKonstante();
      case MethPackage.ZAHL: return createZahl();
      case MethPackage.GANZZAHL: return createGanzzahl();
      case MethPackage.DEZIMALZAHL: return createDezimalzahl();
      case MethPackage.EINHEIT_EXPR: return createEinheitExpr();
      case MethPackage.METHODE: return createMethode();
      case MethPackage.GEGEBEN: return createGegeben();
      case MethPackage.EINGABE: return createEingabe();
      case MethPackage.BERECHNUNG: return createBerechnung();
      case MethPackage.AUSGABE: return createAusgabe();
      case MethPackage.GEGEBEN_STATEMENT: return createGegebenStatement();
      case MethPackage.EINGABE_STATEMENT: return createEingabeStatement();
      case MethPackage.BERECHNUNG_STATEMENT: return createBerechnungStatement();
      case MethPackage.AUSGABE_STATEMENT: return createAusgabeStatement();
      case MethPackage.FORMEL: return createFormel();
      case MethPackage.TEXT_FORMEL: return createTextFormel();
      case MethPackage.NUM_FORMEL: return createNumFormel();
      case MethPackage.DIMENSION_MULTIPLIKATION: return createDimensionMultiplikation();
      case MethPackage.EINHEIT_ADDITION: return createEinheitAddition();
      case MethPackage.EINHEIT_MULTIPLIKATION: return createEinheitMultiplikation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Einheitensystem createEinheitensystem()
  {
    EinheitensystemImpl einheitensystem = new EinheitensystemImpl();
    return einheitensystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Deklaration createDeklaration()
  {
    DeklarationImpl deklaration = new DeklarationImpl();
    return deklaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dimension createDimension()
  {
    DimensionImpl dimension = new DimensionImpl();
    return dimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DimensionExpr createDimensionExpr()
  {
    DimensionExprImpl dimensionExpr = new DimensionExprImpl();
    return dimensionExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Einheit createEinheit()
  {
    EinheitImpl einheit = new EinheitImpl();
    return einheit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Umrechnung createUmrechnung()
  {
    UmrechnungImpl umrechnung = new UmrechnungImpl();
    return umrechnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Konstante createKonstante()
  {
    KonstanteImpl konstante = new KonstanteImpl();
    return konstante;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Zahl createZahl()
  {
    ZahlImpl zahl = new ZahlImpl();
    return zahl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ganzzahl createGanzzahl()
  {
    GanzzahlImpl ganzzahl = new GanzzahlImpl();
    return ganzzahl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dezimalzahl createDezimalzahl()
  {
    DezimalzahlImpl dezimalzahl = new DezimalzahlImpl();
    return dezimalzahl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EinheitExpr createEinheitExpr()
  {
    EinheitExprImpl einheitExpr = new EinheitExprImpl();
    return einheitExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Methode createMethode()
  {
    MethodeImpl methode = new MethodeImpl();
    return methode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Gegeben createGegeben()
  {
    GegebenImpl gegeben = new GegebenImpl();
    return gegeben;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Eingabe createEingabe()
  {
    EingabeImpl eingabe = new EingabeImpl();
    return eingabe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Berechnung createBerechnung()
  {
    BerechnungImpl berechnung = new BerechnungImpl();
    return berechnung;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ausgabe createAusgabe()
  {
    AusgabeImpl ausgabe = new AusgabeImpl();
    return ausgabe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GegebenStatement createGegebenStatement()
  {
    GegebenStatementImpl gegebenStatement = new GegebenStatementImpl();
    return gegebenStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EingabeStatement createEingabeStatement()
  {
    EingabeStatementImpl eingabeStatement = new EingabeStatementImpl();
    return eingabeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BerechnungStatement createBerechnungStatement()
  {
    BerechnungStatementImpl berechnungStatement = new BerechnungStatementImpl();
    return berechnungStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AusgabeStatement createAusgabeStatement()
  {
    AusgabeStatementImpl ausgabeStatement = new AusgabeStatementImpl();
    return ausgabeStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Formel createFormel()
  {
    FormelImpl formel = new FormelImpl();
    return formel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TextFormel createTextFormel()
  {
    TextFormelImpl textFormel = new TextFormelImpl();
    return textFormel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NumFormel createNumFormel()
  {
    NumFormelImpl numFormel = new NumFormelImpl();
    return numFormel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DimensionMultiplikation createDimensionMultiplikation()
  {
    DimensionMultiplikationImpl dimensionMultiplikation = new DimensionMultiplikationImpl();
    return dimensionMultiplikation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EinheitAddition createEinheitAddition()
  {
    EinheitAdditionImpl einheitAddition = new EinheitAdditionImpl();
    return einheitAddition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EinheitMultiplikation createEinheitMultiplikation()
  {
    EinheitMultiplikationImpl einheitMultiplikation = new EinheitMultiplikationImpl();
    return einheitMultiplikation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MethPackage getMethPackage()
  {
    return (MethPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MethPackage getPackage()
  {
    return MethPackage.eINSTANCE;
  }

} //MethFactoryImpl
