/*
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.serializer;

import com.google.inject.Inject;
import hvbargen.meth.meth.Ausgabe;
import hvbargen.meth.meth.AusgabeStatement;
import hvbargen.meth.meth.Berechnung;
import hvbargen.meth.meth.BerechnungStatement;
import hvbargen.meth.meth.Dezimalzahl;
import hvbargen.meth.meth.Dimension;
import hvbargen.meth.meth.DimensionExpr;
import hvbargen.meth.meth.DimensionMultiplikation;
import hvbargen.meth.meth.Eingabe;
import hvbargen.meth.meth.EingabeStatement;
import hvbargen.meth.meth.Einheit;
import hvbargen.meth.meth.EinheitAddition;
import hvbargen.meth.meth.EinheitExpr;
import hvbargen.meth.meth.EinheitMultiplikation;
import hvbargen.meth.meth.Einheitensystem;
import hvbargen.meth.meth.Ganzzahl;
import hvbargen.meth.meth.Gegeben;
import hvbargen.meth.meth.GegebenStatement;
import hvbargen.meth.meth.Konstante;
import hvbargen.meth.meth.MethPackage;
import hvbargen.meth.meth.Methode;
import hvbargen.meth.meth.Model;
import hvbargen.meth.meth.NumFormel;
import hvbargen.meth.meth.TextFormel;
import hvbargen.meth.meth.Umrechnung;
import hvbargen.meth.services.MethGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class MethSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MethGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MethPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MethPackage.AUSGABE:
				sequence_Ausgabe(context, (Ausgabe) semanticObject); 
				return; 
			case MethPackage.AUSGABE_STATEMENT:
				sequence_AusgabeStatement(context, (AusgabeStatement) semanticObject); 
				return; 
			case MethPackage.BERECHNUNG:
				sequence_Berechnung(context, (Berechnung) semanticObject); 
				return; 
			case MethPackage.BERECHNUNG_STATEMENT:
				sequence_BerechnungStatement(context, (BerechnungStatement) semanticObject); 
				return; 
			case MethPackage.DEZIMALZAHL:
				sequence_Dezimalzahl(context, (Dezimalzahl) semanticObject); 
				return; 
			case MethPackage.DIMENSION:
				sequence_Dimension(context, (Dimension) semanticObject); 
				return; 
			case MethPackage.DIMENSION_EXPR:
				sequence_DimensionPrimary(context, (DimensionExpr) semanticObject); 
				return; 
			case MethPackage.DIMENSION_MULTIPLIKATION:
				sequence_DimensionMultiplikation(context, (DimensionMultiplikation) semanticObject); 
				return; 
			case MethPackage.EINGABE:
				sequence_Eingabe(context, (Eingabe) semanticObject); 
				return; 
			case MethPackage.EINGABE_STATEMENT:
				sequence_EingabeStatement(context, (EingabeStatement) semanticObject); 
				return; 
			case MethPackage.EINHEIT:
				sequence_Einheit(context, (Einheit) semanticObject); 
				return; 
			case MethPackage.EINHEIT_ADDITION:
				sequence_EinheitAddition(context, (EinheitAddition) semanticObject); 
				return; 
			case MethPackage.EINHEIT_EXPR:
				sequence_EinheitPrimary(context, (EinheitExpr) semanticObject); 
				return; 
			case MethPackage.EINHEIT_MULTIPLIKATION:
				sequence_EinheitMultiplikation(context, (EinheitMultiplikation) semanticObject); 
				return; 
			case MethPackage.EINHEITENSYSTEM:
				sequence_Einheitensystem(context, (Einheitensystem) semanticObject); 
				return; 
			case MethPackage.GANZZAHL:
				sequence_Ganzzahl(context, (Ganzzahl) semanticObject); 
				return; 
			case MethPackage.GEGEBEN:
				sequence_Gegeben(context, (Gegeben) semanticObject); 
				return; 
			case MethPackage.GEGEBEN_STATEMENT:
				sequence_GegebenStatement(context, (GegebenStatement) semanticObject); 
				return; 
			case MethPackage.KONSTANTE:
				sequence_Konstante(context, (Konstante) semanticObject); 
				return; 
			case MethPackage.METHODE:
				sequence_Methode(context, (Methode) semanticObject); 
				return; 
			case MethPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MethPackage.NUM_FORMEL:
				sequence_NumFormel(context, (NumFormel) semanticObject); 
				return; 
			case MethPackage.TEXT_FORMEL:
				sequence_TextFormel(context, (TextFormel) semanticObject); 
				return; 
			case MethPackage.UMRECHNUNG:
				sequence_Umrechnung(context, (Umrechnung) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     AusgabeStatement returns AusgabeStatement
	 *
	 * Constraint:
	 *     (ausgabename=ID einheit=EinheitMultiplikation? bezeichnung=STRING?)
	 * </pre>
	 */
	protected void sequence_AusgabeStatement(ISerializationContext context, AusgabeStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Ausgabe returns Ausgabe
	 *
	 * Constraint:
	 *     statements+=AusgabeStatement+
	 * </pre>
	 */
	protected void sequence_Ausgabe(ISerializationContext context, Ausgabe semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     BerechnungStatement returns BerechnungStatement
	 *
	 * Constraint:
	 *     (berechnungname=ID formel=Formel bezeichnung=STRING)
	 * </pre>
	 */
	protected void sequence_BerechnungStatement(ISerializationContext context, BerechnungStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.BERECHNUNG_STATEMENT__BERECHNUNGNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.BERECHNUNG_STATEMENT__BERECHNUNGNAME));
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.BERECHNUNG_STATEMENT__FORMEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.BERECHNUNG_STATEMENT__FORMEL));
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.BERECHNUNG_STATEMENT__BEZEICHNUNG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.BERECHNUNG_STATEMENT__BEZEICHNUNG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBerechnungStatementAccess().getBerechnungnameIDTerminalRuleCall_0_0(), semanticObject.getBerechnungname());
		feeder.accept(grammarAccess.getBerechnungStatementAccess().getFormelFormelParserRuleCall_2_0(), semanticObject.getFormel());
		feeder.accept(grammarAccess.getBerechnungStatementAccess().getBezeichnungSTRINGTerminalRuleCall_4_0(), semanticObject.getBezeichnung());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Berechnung returns Berechnung
	 *
	 * Constraint:
	 *     statements+=BerechnungStatement+
	 * </pre>
	 */
	protected void sequence_Berechnung(ISerializationContext context, Berechnung semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Zahl returns Dezimalzahl
	 *     Dezimalzahl returns Dezimalzahl
	 *     EinheitAddition returns Dezimalzahl
	 *     EinheitAddition.EinheitAddition_1_0 returns Dezimalzahl
	 *     EinheitMultiplikation returns Dezimalzahl
	 *     EinheitMultiplikation.EinheitMultiplikation_1_0 returns Dezimalzahl
	 *     EinheitPrimary returns Dezimalzahl
	 *
	 * Constraint:
	 *     fwert=DEZIMAL
	 * </pre>
	 */
	protected void sequence_Dezimalzahl(ISerializationContext context, Dezimalzahl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.DEZIMALZAHL__FWERT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.DEZIMALZAHL__FWERT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDezimalzahlAccess().getFwertDEZIMALTerminalRuleCall_0(), semanticObject.getFwert());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DimensionMultiplikation returns DimensionMultiplikation
	 *     DimensionMultiplikation.DimensionMultiplikation_1_0 returns DimensionMultiplikation
	 *     DimensionPrimary returns DimensionMultiplikation
	 *
	 * Constraint:
	 *     (links=DimensionMultiplikation_DimensionMultiplikation_1_0 (operator='*' | operator='/') rechts=DimensionPrimary)
	 * </pre>
	 */
	protected void sequence_DimensionMultiplikation(ISerializationContext context, DimensionMultiplikation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     DimensionMultiplikation returns DimensionExpr
	 *     DimensionMultiplikation.DimensionMultiplikation_1_0 returns DimensionExpr
	 *     DimensionPrimary returns DimensionExpr
	 *
	 * Constraint:
	 *     ref=[Dimension|ID]
	 * </pre>
	 */
	protected void sequence_DimensionPrimary(ISerializationContext context, DimensionExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.DIMENSION_EXPR__REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.DIMENSION_EXPR__REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDimensionPrimaryAccess().getRefDimensionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(MethPackage.Literals.DIMENSION_EXPR__REF, false));
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Deklaration returns Dimension
	 *     Dimension returns Dimension
	 *
	 * Constraint:
	 *     (name=ID basis=DimensionMultiplikation?)
	 * </pre>
	 */
	protected void sequence_Dimension(ISerializationContext context, Dimension semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EingabeStatement returns EingabeStatement
	 *
	 * Constraint:
	 *     (eingabename=ID einheit=EinheitMultiplikation bezeichnung=STRING)
	 * </pre>
	 */
	protected void sequence_EingabeStatement(ISerializationContext context, EingabeStatement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.EINGABE_STATEMENT__EINGABENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.EINGABE_STATEMENT__EINGABENAME));
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.EINGABE_STATEMENT__EINHEIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.EINGABE_STATEMENT__EINHEIT));
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.EINGABE_STATEMENT__BEZEICHNUNG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.EINGABE_STATEMENT__BEZEICHNUNG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEingabeStatementAccess().getEingabenameIDTerminalRuleCall_0_0(), semanticObject.getEingabename());
		feeder.accept(grammarAccess.getEingabeStatementAccess().getEinheitEinheitMultiplikationParserRuleCall_2_0(), semanticObject.getEinheit());
		feeder.accept(grammarAccess.getEingabeStatementAccess().getBezeichnungSTRINGTerminalRuleCall_5_0(), semanticObject.getBezeichnung());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Eingabe returns Eingabe
	 *
	 * Constraint:
	 *     statements+=EingabeStatement+
	 * </pre>
	 */
	protected void sequence_Eingabe(ISerializationContext context, Eingabe semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EinheitAddition returns EinheitAddition
	 *     EinheitAddition.EinheitAddition_1_0 returns EinheitAddition
	 *     EinheitMultiplikation returns EinheitAddition
	 *     EinheitMultiplikation.EinheitMultiplikation_1_0 returns EinheitAddition
	 *     EinheitPrimary returns EinheitAddition
	 *
	 * Constraint:
	 *     (links=EinheitAddition_EinheitAddition_1_0 (operator='+' | operator='-') rechts=EinheitMultiplikation)
	 * </pre>
	 */
	protected void sequence_EinheitAddition(ISerializationContext context, EinheitAddition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EinheitAddition returns EinheitMultiplikation
	 *     EinheitAddition.EinheitAddition_1_0 returns EinheitMultiplikation
	 *     EinheitMultiplikation returns EinheitMultiplikation
	 *     EinheitMultiplikation.EinheitMultiplikation_1_0 returns EinheitMultiplikation
	 *     EinheitPrimary returns EinheitMultiplikation
	 *
	 * Constraint:
	 *     (links=EinheitMultiplikation_EinheitMultiplikation_1_0 (operator='*' | operator='/') rechts=EinheitPrimary)
	 * </pre>
	 */
	protected void sequence_EinheitMultiplikation(ISerializationContext context, EinheitMultiplikation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     EinheitAddition returns EinheitExpr
	 *     EinheitAddition.EinheitAddition_1_0 returns EinheitExpr
	 *     EinheitMultiplikation returns EinheitExpr
	 *     EinheitMultiplikation.EinheitMultiplikation_1_0 returns EinheitExpr
	 *     EinheitPrimary returns EinheitExpr
	 *
	 * Constraint:
	 *     varref=ID
	 * </pre>
	 */
	protected void sequence_EinheitPrimary(ISerializationContext context, EinheitExpr semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.EINHEIT_EXPR__VARREF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.EINHEIT_EXPR__VARREF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEinheitPrimaryAccess().getVarrefIDTerminalRuleCall_1_0(), semanticObject.getVarref());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Deklaration returns Einheit
	 *     Einheit returns Einheit
	 *
	 * Constraint:
	 *     (name=ID (ref=[Dimension|ID] | (faktor=EinheitMultiplikation basiseinheit=[Einheit|ID]?)))
	 * </pre>
	 */
	protected void sequence_Einheit(ISerializationContext context, Einheit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Einheitensystem returns Einheitensystem
	 *
	 * Constraint:
	 *     deklarationen+=Deklaration*
	 * </pre>
	 */
	protected void sequence_Einheitensystem(ISerializationContext context, Einheitensystem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Zahl returns Ganzzahl
	 *     Ganzzahl returns Ganzzahl
	 *     EinheitAddition returns Ganzzahl
	 *     EinheitAddition.EinheitAddition_1_0 returns Ganzzahl
	 *     EinheitMultiplikation returns Ganzzahl
	 *     EinheitMultiplikation.EinheitMultiplikation_1_0 returns Ganzzahl
	 *     EinheitPrimary returns Ganzzahl
	 *
	 * Constraint:
	 *     iwert=GANZ
	 * </pre>
	 */
	protected void sequence_Ganzzahl(ISerializationContext context, Ganzzahl semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.GANZZAHL__IWERT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.GANZZAHL__IWERT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getGanzzahlAccess().getIwertGANZTerminalRuleCall_0(), semanticObject.getIwert());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     GegebenStatement returns GegebenStatement
	 *
	 * Constraint:
	 *     (eingabename=ID einheit=EinheitMultiplikation? refMethode=[Methode|ID] bezeichnung=STRING)
	 * </pre>
	 */
	protected void sequence_GegebenStatement(ISerializationContext context, GegebenStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Gegeben returns Gegeben
	 *
	 * Constraint:
	 *     statements+=GegebenStatement+
	 * </pre>
	 */
	protected void sequence_Gegeben(ISerializationContext context, Gegeben semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Deklaration returns Konstante
	 *     Konstante returns Konstante
	 *
	 * Constraint:
	 *     (name=ID ausdruck=EinheitAddition)
	 * </pre>
	 */
	protected void sequence_Konstante(ISerializationContext context, Konstante semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.KONSTANTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.KONSTANTE__NAME));
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.KONSTANTE__AUSDRUCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.KONSTANTE__AUSDRUCK));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKonstanteAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getKonstanteAccess().getAusdruckEinheitAdditionParserRuleCall_3_0(), semanticObject.getAusdruck());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Methode returns Methode
	 *
	 * Constraint:
	 *     (name=ID bezeichnung=STRING (ablauf+=Gegeben | ablauf+=Eingabe | ablauf+=Berechnung | ablauf+=Ausgabe)+)
	 * </pre>
	 */
	protected void sequence_Methode(ISerializationContext context, Methode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (einheitensystem=Einheitensystem methoden+=Methode*)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Formel returns NumFormel
	 *     NumFormel returns NumFormel
	 *
	 * Constraint:
	 *     nformel=EinheitAddition
	 * </pre>
	 */
	protected void sequence_NumFormel(ISerializationContext context, NumFormel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.NUM_FORMEL__NFORMEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.NUM_FORMEL__NFORMEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumFormelAccess().getNformelEinheitAdditionParserRuleCall_0(), semanticObject.getNformel());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Formel returns TextFormel
	 *     TextFormel returns TextFormel
	 *
	 * Constraint:
	 *     tformel='TODO'
	 * </pre>
	 */
	protected void sequence_TextFormel(ISerializationContext context, TextFormel semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.TEXT_FORMEL__TFORMEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.TEXT_FORMEL__TFORMEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTextFormelAccess().getTformelTODOKeyword_0(), semanticObject.getTformel());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Deklaration returns Umrechnung
	 *     Umrechnung returns Umrechnung
	 *
	 * Constraint:
	 *     (varname=ID vonEinheit=[Einheit|ID] ausdruck=EinheitAddition nachEinheit=[Einheit|ID])
	 * </pre>
	 */
	protected void sequence_Umrechnung(ISerializationContext context, Umrechnung semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.UMRECHNUNG__VARNAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.UMRECHNUNG__VARNAME));
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.UMRECHNUNG__VON_EINHEIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.UMRECHNUNG__VON_EINHEIT));
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.UMRECHNUNG__AUSDRUCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.UMRECHNUNG__AUSDRUCK));
			if (transientValues.isValueTransient(semanticObject, MethPackage.Literals.UMRECHNUNG__NACH_EINHEIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MethPackage.Literals.UMRECHNUNG__NACH_EINHEIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getUmrechnungAccess().getVarnameIDTerminalRuleCall_1_0(), semanticObject.getVarname());
		feeder.accept(grammarAccess.getUmrechnungAccess().getVonEinheitEinheitIDTerminalRuleCall_2_0_1(), semanticObject.eGet(MethPackage.Literals.UMRECHNUNG__VON_EINHEIT, false));
		feeder.accept(grammarAccess.getUmrechnungAccess().getAusdruckEinheitAdditionParserRuleCall_4_0(), semanticObject.getAusdruck());
		feeder.accept(grammarAccess.getUmrechnungAccess().getNachEinheitEinheitIDTerminalRuleCall_5_0_1(), semanticObject.eGet(MethPackage.Literals.UMRECHNUNG__NACH_EINHEIT, false));
		feeder.finish();
	}
	
	
}