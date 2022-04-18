package hvbargen.meth.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import hvbargen.meth.services.MethGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMethParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_GANZ", "RULE_DEZIMAL", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'/'", "'+'", "'-'", "'Einheitensystem'", "'{'", "'}'", "'Dimension'", "';'", "'='", "'('", "')'", "'Einheit'", "'in'", "'Umrechnung'", "'Konstante'", "'Methode'", "'als'", "'Gegeben'", "'Eingabe'", "'Berechnung'", "'Ausgabe'", "'aus'", "'['", "']'", "'TODO'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_DEZIMAL=6;
    public static final int RULE_GANZ=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMethParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMethParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMethParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMeth.g"; }


    	private MethGrammarAccess grammarAccess;

    	public void setGrammarAccess(MethGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalMeth.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMeth.g:54:1: ( ruleModel EOF )
            // InternalMeth.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMeth.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMeth.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMeth.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMeth.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMeth.g:69:3: ( rule__Model__Group__0 )
            // InternalMeth.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEinheitensystem"
    // InternalMeth.g:78:1: entryRuleEinheitensystem : ruleEinheitensystem EOF ;
    public final void entryRuleEinheitensystem() throws RecognitionException {
        try {
            // InternalMeth.g:79:1: ( ruleEinheitensystem EOF )
            // InternalMeth.g:80:1: ruleEinheitensystem EOF
            {
             before(grammarAccess.getEinheitensystemRule()); 
            pushFollow(FOLLOW_1);
            ruleEinheitensystem();

            state._fsp--;

             after(grammarAccess.getEinheitensystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEinheitensystem"


    // $ANTLR start "ruleEinheitensystem"
    // InternalMeth.g:87:1: ruleEinheitensystem : ( ( rule__Einheitensystem__Group__0 ) ) ;
    public final void ruleEinheitensystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:91:2: ( ( ( rule__Einheitensystem__Group__0 ) ) )
            // InternalMeth.g:92:2: ( ( rule__Einheitensystem__Group__0 ) )
            {
            // InternalMeth.g:92:2: ( ( rule__Einheitensystem__Group__0 ) )
            // InternalMeth.g:93:3: ( rule__Einheitensystem__Group__0 )
            {
             before(grammarAccess.getEinheitensystemAccess().getGroup()); 
            // InternalMeth.g:94:3: ( rule__Einheitensystem__Group__0 )
            // InternalMeth.g:94:4: rule__Einheitensystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Einheitensystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEinheitensystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEinheitensystem"


    // $ANTLR start "entryRuleDeklaration"
    // InternalMeth.g:103:1: entryRuleDeklaration : ruleDeklaration EOF ;
    public final void entryRuleDeklaration() throws RecognitionException {
        try {
            // InternalMeth.g:104:1: ( ruleDeklaration EOF )
            // InternalMeth.g:105:1: ruleDeklaration EOF
            {
             before(grammarAccess.getDeklarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeklaration();

            state._fsp--;

             after(grammarAccess.getDeklarationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeklaration"


    // $ANTLR start "ruleDeklaration"
    // InternalMeth.g:112:1: ruleDeklaration : ( ( rule__Deklaration__Alternatives ) ) ;
    public final void ruleDeklaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:116:2: ( ( ( rule__Deklaration__Alternatives ) ) )
            // InternalMeth.g:117:2: ( ( rule__Deklaration__Alternatives ) )
            {
            // InternalMeth.g:117:2: ( ( rule__Deklaration__Alternatives ) )
            // InternalMeth.g:118:3: ( rule__Deklaration__Alternatives )
            {
             before(grammarAccess.getDeklarationAccess().getAlternatives()); 
            // InternalMeth.g:119:3: ( rule__Deklaration__Alternatives )
            // InternalMeth.g:119:4: rule__Deklaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Deklaration__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDeklarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeklaration"


    // $ANTLR start "entryRuleDimension"
    // InternalMeth.g:128:1: entryRuleDimension : ruleDimension EOF ;
    public final void entryRuleDimension() throws RecognitionException {
        try {
            // InternalMeth.g:129:1: ( ruleDimension EOF )
            // InternalMeth.g:130:1: ruleDimension EOF
            {
             before(grammarAccess.getDimensionRule()); 
            pushFollow(FOLLOW_1);
            ruleDimension();

            state._fsp--;

             after(grammarAccess.getDimensionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // InternalMeth.g:137:1: ruleDimension : ( ( rule__Dimension__Group__0 ) ) ;
    public final void ruleDimension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:141:2: ( ( ( rule__Dimension__Group__0 ) ) )
            // InternalMeth.g:142:2: ( ( rule__Dimension__Group__0 ) )
            {
            // InternalMeth.g:142:2: ( ( rule__Dimension__Group__0 ) )
            // InternalMeth.g:143:3: ( rule__Dimension__Group__0 )
            {
             before(grammarAccess.getDimensionAccess().getGroup()); 
            // InternalMeth.g:144:3: ( rule__Dimension__Group__0 )
            // InternalMeth.g:144:4: rule__Dimension__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleDimensionMultiplikation"
    // InternalMeth.g:153:1: entryRuleDimensionMultiplikation : ruleDimensionMultiplikation EOF ;
    public final void entryRuleDimensionMultiplikation() throws RecognitionException {
        try {
            // InternalMeth.g:154:1: ( ruleDimensionMultiplikation EOF )
            // InternalMeth.g:155:1: ruleDimensionMultiplikation EOF
            {
             before(grammarAccess.getDimensionMultiplikationRule()); 
            pushFollow(FOLLOW_1);
            ruleDimensionMultiplikation();

            state._fsp--;

             after(grammarAccess.getDimensionMultiplikationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDimensionMultiplikation"


    // $ANTLR start "ruleDimensionMultiplikation"
    // InternalMeth.g:162:1: ruleDimensionMultiplikation : ( ( rule__DimensionMultiplikation__Group__0 ) ) ;
    public final void ruleDimensionMultiplikation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:166:2: ( ( ( rule__DimensionMultiplikation__Group__0 ) ) )
            // InternalMeth.g:167:2: ( ( rule__DimensionMultiplikation__Group__0 ) )
            {
            // InternalMeth.g:167:2: ( ( rule__DimensionMultiplikation__Group__0 ) )
            // InternalMeth.g:168:3: ( rule__DimensionMultiplikation__Group__0 )
            {
             before(grammarAccess.getDimensionMultiplikationAccess().getGroup()); 
            // InternalMeth.g:169:3: ( rule__DimensionMultiplikation__Group__0 )
            // InternalMeth.g:169:4: rule__DimensionMultiplikation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DimensionMultiplikation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDimensionMultiplikationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimensionMultiplikation"


    // $ANTLR start "entryRuleDimensionPrimary"
    // InternalMeth.g:178:1: entryRuleDimensionPrimary : ruleDimensionPrimary EOF ;
    public final void entryRuleDimensionPrimary() throws RecognitionException {
        try {
            // InternalMeth.g:179:1: ( ruleDimensionPrimary EOF )
            // InternalMeth.g:180:1: ruleDimensionPrimary EOF
            {
             before(grammarAccess.getDimensionPrimaryRule()); 
            pushFollow(FOLLOW_1);
            ruleDimensionPrimary();

            state._fsp--;

             after(grammarAccess.getDimensionPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDimensionPrimary"


    // $ANTLR start "ruleDimensionPrimary"
    // InternalMeth.g:187:1: ruleDimensionPrimary : ( ( rule__DimensionPrimary__Alternatives ) ) ;
    public final void ruleDimensionPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:191:2: ( ( ( rule__DimensionPrimary__Alternatives ) ) )
            // InternalMeth.g:192:2: ( ( rule__DimensionPrimary__Alternatives ) )
            {
            // InternalMeth.g:192:2: ( ( rule__DimensionPrimary__Alternatives ) )
            // InternalMeth.g:193:3: ( rule__DimensionPrimary__Alternatives )
            {
             before(grammarAccess.getDimensionPrimaryAccess().getAlternatives()); 
            // InternalMeth.g:194:3: ( rule__DimensionPrimary__Alternatives )
            // InternalMeth.g:194:4: rule__DimensionPrimary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DimensionPrimary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDimensionPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDimensionPrimary"


    // $ANTLR start "entryRuleEinheit"
    // InternalMeth.g:203:1: entryRuleEinheit : ruleEinheit EOF ;
    public final void entryRuleEinheit() throws RecognitionException {
        try {
            // InternalMeth.g:204:1: ( ruleEinheit EOF )
            // InternalMeth.g:205:1: ruleEinheit EOF
            {
             before(grammarAccess.getEinheitRule()); 
            pushFollow(FOLLOW_1);
            ruleEinheit();

            state._fsp--;

             after(grammarAccess.getEinheitRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEinheit"


    // $ANTLR start "ruleEinheit"
    // InternalMeth.g:212:1: ruleEinheit : ( ( rule__Einheit__Group__0 ) ) ;
    public final void ruleEinheit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:216:2: ( ( ( rule__Einheit__Group__0 ) ) )
            // InternalMeth.g:217:2: ( ( rule__Einheit__Group__0 ) )
            {
            // InternalMeth.g:217:2: ( ( rule__Einheit__Group__0 ) )
            // InternalMeth.g:218:3: ( rule__Einheit__Group__0 )
            {
             before(grammarAccess.getEinheitAccess().getGroup()); 
            // InternalMeth.g:219:3: ( rule__Einheit__Group__0 )
            // InternalMeth.g:219:4: rule__Einheit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Einheit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEinheitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEinheit"


    // $ANTLR start "entryRuleUmrechnung"
    // InternalMeth.g:228:1: entryRuleUmrechnung : ruleUmrechnung EOF ;
    public final void entryRuleUmrechnung() throws RecognitionException {
        try {
            // InternalMeth.g:229:1: ( ruleUmrechnung EOF )
            // InternalMeth.g:230:1: ruleUmrechnung EOF
            {
             before(grammarAccess.getUmrechnungRule()); 
            pushFollow(FOLLOW_1);
            ruleUmrechnung();

            state._fsp--;

             after(grammarAccess.getUmrechnungRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUmrechnung"


    // $ANTLR start "ruleUmrechnung"
    // InternalMeth.g:237:1: ruleUmrechnung : ( ( rule__Umrechnung__Group__0 ) ) ;
    public final void ruleUmrechnung() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:241:2: ( ( ( rule__Umrechnung__Group__0 ) ) )
            // InternalMeth.g:242:2: ( ( rule__Umrechnung__Group__0 ) )
            {
            // InternalMeth.g:242:2: ( ( rule__Umrechnung__Group__0 ) )
            // InternalMeth.g:243:3: ( rule__Umrechnung__Group__0 )
            {
             before(grammarAccess.getUmrechnungAccess().getGroup()); 
            // InternalMeth.g:244:3: ( rule__Umrechnung__Group__0 )
            // InternalMeth.g:244:4: rule__Umrechnung__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Umrechnung__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUmrechnungAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUmrechnung"


    // $ANTLR start "entryRuleKonstante"
    // InternalMeth.g:253:1: entryRuleKonstante : ruleKonstante EOF ;
    public final void entryRuleKonstante() throws RecognitionException {
        try {
            // InternalMeth.g:254:1: ( ruleKonstante EOF )
            // InternalMeth.g:255:1: ruleKonstante EOF
            {
             before(grammarAccess.getKonstanteRule()); 
            pushFollow(FOLLOW_1);
            ruleKonstante();

            state._fsp--;

             after(grammarAccess.getKonstanteRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKonstante"


    // $ANTLR start "ruleKonstante"
    // InternalMeth.g:262:1: ruleKonstante : ( ( rule__Konstante__Group__0 ) ) ;
    public final void ruleKonstante() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:266:2: ( ( ( rule__Konstante__Group__0 ) ) )
            // InternalMeth.g:267:2: ( ( rule__Konstante__Group__0 ) )
            {
            // InternalMeth.g:267:2: ( ( rule__Konstante__Group__0 ) )
            // InternalMeth.g:268:3: ( rule__Konstante__Group__0 )
            {
             before(grammarAccess.getKonstanteAccess().getGroup()); 
            // InternalMeth.g:269:3: ( rule__Konstante__Group__0 )
            // InternalMeth.g:269:4: rule__Konstante__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Konstante__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKonstanteAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKonstante"


    // $ANTLR start "entryRuleZahl"
    // InternalMeth.g:278:1: entryRuleZahl : ruleZahl EOF ;
    public final void entryRuleZahl() throws RecognitionException {
        try {
            // InternalMeth.g:279:1: ( ruleZahl EOF )
            // InternalMeth.g:280:1: ruleZahl EOF
            {
             before(grammarAccess.getZahlRule()); 
            pushFollow(FOLLOW_1);
            ruleZahl();

            state._fsp--;

             after(grammarAccess.getZahlRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleZahl"


    // $ANTLR start "ruleZahl"
    // InternalMeth.g:287:1: ruleZahl : ( ( rule__Zahl__Alternatives ) ) ;
    public final void ruleZahl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:291:2: ( ( ( rule__Zahl__Alternatives ) ) )
            // InternalMeth.g:292:2: ( ( rule__Zahl__Alternatives ) )
            {
            // InternalMeth.g:292:2: ( ( rule__Zahl__Alternatives ) )
            // InternalMeth.g:293:3: ( rule__Zahl__Alternatives )
            {
             before(grammarAccess.getZahlAccess().getAlternatives()); 
            // InternalMeth.g:294:3: ( rule__Zahl__Alternatives )
            // InternalMeth.g:294:4: rule__Zahl__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Zahl__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getZahlAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleZahl"


    // $ANTLR start "entryRuleGanzzahl"
    // InternalMeth.g:303:1: entryRuleGanzzahl : ruleGanzzahl EOF ;
    public final void entryRuleGanzzahl() throws RecognitionException {
        try {
            // InternalMeth.g:304:1: ( ruleGanzzahl EOF )
            // InternalMeth.g:305:1: ruleGanzzahl EOF
            {
             before(grammarAccess.getGanzzahlRule()); 
            pushFollow(FOLLOW_1);
            ruleGanzzahl();

            state._fsp--;

             after(grammarAccess.getGanzzahlRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGanzzahl"


    // $ANTLR start "ruleGanzzahl"
    // InternalMeth.g:312:1: ruleGanzzahl : ( ( rule__Ganzzahl__IwertAssignment ) ) ;
    public final void ruleGanzzahl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:316:2: ( ( ( rule__Ganzzahl__IwertAssignment ) ) )
            // InternalMeth.g:317:2: ( ( rule__Ganzzahl__IwertAssignment ) )
            {
            // InternalMeth.g:317:2: ( ( rule__Ganzzahl__IwertAssignment ) )
            // InternalMeth.g:318:3: ( rule__Ganzzahl__IwertAssignment )
            {
             before(grammarAccess.getGanzzahlAccess().getIwertAssignment()); 
            // InternalMeth.g:319:3: ( rule__Ganzzahl__IwertAssignment )
            // InternalMeth.g:319:4: rule__Ganzzahl__IwertAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Ganzzahl__IwertAssignment();

            state._fsp--;


            }

             after(grammarAccess.getGanzzahlAccess().getIwertAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGanzzahl"


    // $ANTLR start "entryRuleDezimalzahl"
    // InternalMeth.g:328:1: entryRuleDezimalzahl : ruleDezimalzahl EOF ;
    public final void entryRuleDezimalzahl() throws RecognitionException {
        try {
            // InternalMeth.g:329:1: ( ruleDezimalzahl EOF )
            // InternalMeth.g:330:1: ruleDezimalzahl EOF
            {
             before(grammarAccess.getDezimalzahlRule()); 
            pushFollow(FOLLOW_1);
            ruleDezimalzahl();

            state._fsp--;

             after(grammarAccess.getDezimalzahlRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDezimalzahl"


    // $ANTLR start "ruleDezimalzahl"
    // InternalMeth.g:337:1: ruleDezimalzahl : ( ( rule__Dezimalzahl__FwertAssignment ) ) ;
    public final void ruleDezimalzahl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:341:2: ( ( ( rule__Dezimalzahl__FwertAssignment ) ) )
            // InternalMeth.g:342:2: ( ( rule__Dezimalzahl__FwertAssignment ) )
            {
            // InternalMeth.g:342:2: ( ( rule__Dezimalzahl__FwertAssignment ) )
            // InternalMeth.g:343:3: ( rule__Dezimalzahl__FwertAssignment )
            {
             before(grammarAccess.getDezimalzahlAccess().getFwertAssignment()); 
            // InternalMeth.g:344:3: ( rule__Dezimalzahl__FwertAssignment )
            // InternalMeth.g:344:4: rule__Dezimalzahl__FwertAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Dezimalzahl__FwertAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDezimalzahlAccess().getFwertAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDezimalzahl"


    // $ANTLR start "entryRuleEinheitAddition"
    // InternalMeth.g:353:1: entryRuleEinheitAddition : ruleEinheitAddition EOF ;
    public final void entryRuleEinheitAddition() throws RecognitionException {
        try {
            // InternalMeth.g:354:1: ( ruleEinheitAddition EOF )
            // InternalMeth.g:355:1: ruleEinheitAddition EOF
            {
             before(grammarAccess.getEinheitAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleEinheitAddition();

            state._fsp--;

             after(grammarAccess.getEinheitAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEinheitAddition"


    // $ANTLR start "ruleEinheitAddition"
    // InternalMeth.g:362:1: ruleEinheitAddition : ( ( rule__EinheitAddition__Group__0 ) ) ;
    public final void ruleEinheitAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:366:2: ( ( ( rule__EinheitAddition__Group__0 ) ) )
            // InternalMeth.g:367:2: ( ( rule__EinheitAddition__Group__0 ) )
            {
            // InternalMeth.g:367:2: ( ( rule__EinheitAddition__Group__0 ) )
            // InternalMeth.g:368:3: ( rule__EinheitAddition__Group__0 )
            {
             before(grammarAccess.getEinheitAdditionAccess().getGroup()); 
            // InternalMeth.g:369:3: ( rule__EinheitAddition__Group__0 )
            // InternalMeth.g:369:4: rule__EinheitAddition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EinheitAddition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEinheitAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEinheitAddition"


    // $ANTLR start "entryRuleEinheitMultiplikation"
    // InternalMeth.g:378:1: entryRuleEinheitMultiplikation : ruleEinheitMultiplikation EOF ;
    public final void entryRuleEinheitMultiplikation() throws RecognitionException {
        try {
            // InternalMeth.g:379:1: ( ruleEinheitMultiplikation EOF )
            // InternalMeth.g:380:1: ruleEinheitMultiplikation EOF
            {
             before(grammarAccess.getEinheitMultiplikationRule()); 
            pushFollow(FOLLOW_1);
            ruleEinheitMultiplikation();

            state._fsp--;

             after(grammarAccess.getEinheitMultiplikationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEinheitMultiplikation"


    // $ANTLR start "ruleEinheitMultiplikation"
    // InternalMeth.g:387:1: ruleEinheitMultiplikation : ( ( rule__EinheitMultiplikation__Group__0 ) ) ;
    public final void ruleEinheitMultiplikation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:391:2: ( ( ( rule__EinheitMultiplikation__Group__0 ) ) )
            // InternalMeth.g:392:2: ( ( rule__EinheitMultiplikation__Group__0 ) )
            {
            // InternalMeth.g:392:2: ( ( rule__EinheitMultiplikation__Group__0 ) )
            // InternalMeth.g:393:3: ( rule__EinheitMultiplikation__Group__0 )
            {
             before(grammarAccess.getEinheitMultiplikationAccess().getGroup()); 
            // InternalMeth.g:394:3: ( rule__EinheitMultiplikation__Group__0 )
            // InternalMeth.g:394:4: rule__EinheitMultiplikation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EinheitMultiplikation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEinheitMultiplikationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEinheitMultiplikation"


    // $ANTLR start "entryRuleEinheitPrimary"
    // InternalMeth.g:403:1: entryRuleEinheitPrimary : ruleEinheitPrimary EOF ;
    public final void entryRuleEinheitPrimary() throws RecognitionException {
        try {
            // InternalMeth.g:404:1: ( ruleEinheitPrimary EOF )
            // InternalMeth.g:405:1: ruleEinheitPrimary EOF
            {
             before(grammarAccess.getEinheitPrimaryRule()); 
            pushFollow(FOLLOW_1);
            ruleEinheitPrimary();

            state._fsp--;

             after(grammarAccess.getEinheitPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEinheitPrimary"


    // $ANTLR start "ruleEinheitPrimary"
    // InternalMeth.g:412:1: ruleEinheitPrimary : ( ( rule__EinheitPrimary__Alternatives ) ) ;
    public final void ruleEinheitPrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:416:2: ( ( ( rule__EinheitPrimary__Alternatives ) ) )
            // InternalMeth.g:417:2: ( ( rule__EinheitPrimary__Alternatives ) )
            {
            // InternalMeth.g:417:2: ( ( rule__EinheitPrimary__Alternatives ) )
            // InternalMeth.g:418:3: ( rule__EinheitPrimary__Alternatives )
            {
             before(grammarAccess.getEinheitPrimaryAccess().getAlternatives()); 
            // InternalMeth.g:419:3: ( rule__EinheitPrimary__Alternatives )
            // InternalMeth.g:419:4: rule__EinheitPrimary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EinheitPrimary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEinheitPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEinheitPrimary"


    // $ANTLR start "entryRuleMethode"
    // InternalMeth.g:428:1: entryRuleMethode : ruleMethode EOF ;
    public final void entryRuleMethode() throws RecognitionException {
        try {
            // InternalMeth.g:429:1: ( ruleMethode EOF )
            // InternalMeth.g:430:1: ruleMethode EOF
            {
             before(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_1);
            ruleMethode();

            state._fsp--;

             after(grammarAccess.getMethodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMethode"


    // $ANTLR start "ruleMethode"
    // InternalMeth.g:437:1: ruleMethode : ( ( rule__Methode__Group__0 ) ) ;
    public final void ruleMethode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:441:2: ( ( ( rule__Methode__Group__0 ) ) )
            // InternalMeth.g:442:2: ( ( rule__Methode__Group__0 ) )
            {
            // InternalMeth.g:442:2: ( ( rule__Methode__Group__0 ) )
            // InternalMeth.g:443:3: ( rule__Methode__Group__0 )
            {
             before(grammarAccess.getMethodeAccess().getGroup()); 
            // InternalMeth.g:444:3: ( rule__Methode__Group__0 )
            // InternalMeth.g:444:4: rule__Methode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Methode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethode"


    // $ANTLR start "entryRuleGegeben"
    // InternalMeth.g:453:1: entryRuleGegeben : ruleGegeben EOF ;
    public final void entryRuleGegeben() throws RecognitionException {
        try {
            // InternalMeth.g:454:1: ( ruleGegeben EOF )
            // InternalMeth.g:455:1: ruleGegeben EOF
            {
             before(grammarAccess.getGegebenRule()); 
            pushFollow(FOLLOW_1);
            ruleGegeben();

            state._fsp--;

             after(grammarAccess.getGegebenRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGegeben"


    // $ANTLR start "ruleGegeben"
    // InternalMeth.g:462:1: ruleGegeben : ( ( rule__Gegeben__Group__0 ) ) ;
    public final void ruleGegeben() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:466:2: ( ( ( rule__Gegeben__Group__0 ) ) )
            // InternalMeth.g:467:2: ( ( rule__Gegeben__Group__0 ) )
            {
            // InternalMeth.g:467:2: ( ( rule__Gegeben__Group__0 ) )
            // InternalMeth.g:468:3: ( rule__Gegeben__Group__0 )
            {
             before(grammarAccess.getGegebenAccess().getGroup()); 
            // InternalMeth.g:469:3: ( rule__Gegeben__Group__0 )
            // InternalMeth.g:469:4: rule__Gegeben__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Gegeben__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGegebenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGegeben"


    // $ANTLR start "entryRuleEingabe"
    // InternalMeth.g:478:1: entryRuleEingabe : ruleEingabe EOF ;
    public final void entryRuleEingabe() throws RecognitionException {
        try {
            // InternalMeth.g:479:1: ( ruleEingabe EOF )
            // InternalMeth.g:480:1: ruleEingabe EOF
            {
             before(grammarAccess.getEingabeRule()); 
            pushFollow(FOLLOW_1);
            ruleEingabe();

            state._fsp--;

             after(grammarAccess.getEingabeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEingabe"


    // $ANTLR start "ruleEingabe"
    // InternalMeth.g:487:1: ruleEingabe : ( ( rule__Eingabe__Group__0 ) ) ;
    public final void ruleEingabe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:491:2: ( ( ( rule__Eingabe__Group__0 ) ) )
            // InternalMeth.g:492:2: ( ( rule__Eingabe__Group__0 ) )
            {
            // InternalMeth.g:492:2: ( ( rule__Eingabe__Group__0 ) )
            // InternalMeth.g:493:3: ( rule__Eingabe__Group__0 )
            {
             before(grammarAccess.getEingabeAccess().getGroup()); 
            // InternalMeth.g:494:3: ( rule__Eingabe__Group__0 )
            // InternalMeth.g:494:4: rule__Eingabe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Eingabe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEingabeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEingabe"


    // $ANTLR start "entryRuleBerechnung"
    // InternalMeth.g:503:1: entryRuleBerechnung : ruleBerechnung EOF ;
    public final void entryRuleBerechnung() throws RecognitionException {
        try {
            // InternalMeth.g:504:1: ( ruleBerechnung EOF )
            // InternalMeth.g:505:1: ruleBerechnung EOF
            {
             before(grammarAccess.getBerechnungRule()); 
            pushFollow(FOLLOW_1);
            ruleBerechnung();

            state._fsp--;

             after(grammarAccess.getBerechnungRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBerechnung"


    // $ANTLR start "ruleBerechnung"
    // InternalMeth.g:512:1: ruleBerechnung : ( ( rule__Berechnung__Group__0 ) ) ;
    public final void ruleBerechnung() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:516:2: ( ( ( rule__Berechnung__Group__0 ) ) )
            // InternalMeth.g:517:2: ( ( rule__Berechnung__Group__0 ) )
            {
            // InternalMeth.g:517:2: ( ( rule__Berechnung__Group__0 ) )
            // InternalMeth.g:518:3: ( rule__Berechnung__Group__0 )
            {
             before(grammarAccess.getBerechnungAccess().getGroup()); 
            // InternalMeth.g:519:3: ( rule__Berechnung__Group__0 )
            // InternalMeth.g:519:4: rule__Berechnung__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Berechnung__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBerechnungAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBerechnung"


    // $ANTLR start "entryRuleAusgabe"
    // InternalMeth.g:528:1: entryRuleAusgabe : ruleAusgabe EOF ;
    public final void entryRuleAusgabe() throws RecognitionException {
        try {
            // InternalMeth.g:529:1: ( ruleAusgabe EOF )
            // InternalMeth.g:530:1: ruleAusgabe EOF
            {
             before(grammarAccess.getAusgabeRule()); 
            pushFollow(FOLLOW_1);
            ruleAusgabe();

            state._fsp--;

             after(grammarAccess.getAusgabeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAusgabe"


    // $ANTLR start "ruleAusgabe"
    // InternalMeth.g:537:1: ruleAusgabe : ( ( rule__Ausgabe__Group__0 ) ) ;
    public final void ruleAusgabe() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:541:2: ( ( ( rule__Ausgabe__Group__0 ) ) )
            // InternalMeth.g:542:2: ( ( rule__Ausgabe__Group__0 ) )
            {
            // InternalMeth.g:542:2: ( ( rule__Ausgabe__Group__0 ) )
            // InternalMeth.g:543:3: ( rule__Ausgabe__Group__0 )
            {
             before(grammarAccess.getAusgabeAccess().getGroup()); 
            // InternalMeth.g:544:3: ( rule__Ausgabe__Group__0 )
            // InternalMeth.g:544:4: rule__Ausgabe__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ausgabe__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAusgabeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAusgabe"


    // $ANTLR start "entryRuleGegebenStatement"
    // InternalMeth.g:553:1: entryRuleGegebenStatement : ruleGegebenStatement EOF ;
    public final void entryRuleGegebenStatement() throws RecognitionException {
        try {
            // InternalMeth.g:554:1: ( ruleGegebenStatement EOF )
            // InternalMeth.g:555:1: ruleGegebenStatement EOF
            {
             before(grammarAccess.getGegebenStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleGegebenStatement();

            state._fsp--;

             after(grammarAccess.getGegebenStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGegebenStatement"


    // $ANTLR start "ruleGegebenStatement"
    // InternalMeth.g:562:1: ruleGegebenStatement : ( ( rule__GegebenStatement__Group__0 ) ) ;
    public final void ruleGegebenStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:566:2: ( ( ( rule__GegebenStatement__Group__0 ) ) )
            // InternalMeth.g:567:2: ( ( rule__GegebenStatement__Group__0 ) )
            {
            // InternalMeth.g:567:2: ( ( rule__GegebenStatement__Group__0 ) )
            // InternalMeth.g:568:3: ( rule__GegebenStatement__Group__0 )
            {
             before(grammarAccess.getGegebenStatementAccess().getGroup()); 
            // InternalMeth.g:569:3: ( rule__GegebenStatement__Group__0 )
            // InternalMeth.g:569:4: rule__GegebenStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GegebenStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGegebenStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGegebenStatement"


    // $ANTLR start "entryRuleEingabeStatement"
    // InternalMeth.g:578:1: entryRuleEingabeStatement : ruleEingabeStatement EOF ;
    public final void entryRuleEingabeStatement() throws RecognitionException {
        try {
            // InternalMeth.g:579:1: ( ruleEingabeStatement EOF )
            // InternalMeth.g:580:1: ruleEingabeStatement EOF
            {
             before(grammarAccess.getEingabeStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleEingabeStatement();

            state._fsp--;

             after(grammarAccess.getEingabeStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEingabeStatement"


    // $ANTLR start "ruleEingabeStatement"
    // InternalMeth.g:587:1: ruleEingabeStatement : ( ( rule__EingabeStatement__Group__0 ) ) ;
    public final void ruleEingabeStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:591:2: ( ( ( rule__EingabeStatement__Group__0 ) ) )
            // InternalMeth.g:592:2: ( ( rule__EingabeStatement__Group__0 ) )
            {
            // InternalMeth.g:592:2: ( ( rule__EingabeStatement__Group__0 ) )
            // InternalMeth.g:593:3: ( rule__EingabeStatement__Group__0 )
            {
             before(grammarAccess.getEingabeStatementAccess().getGroup()); 
            // InternalMeth.g:594:3: ( rule__EingabeStatement__Group__0 )
            // InternalMeth.g:594:4: rule__EingabeStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EingabeStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEingabeStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEingabeStatement"


    // $ANTLR start "entryRuleBerechnungStatement"
    // InternalMeth.g:603:1: entryRuleBerechnungStatement : ruleBerechnungStatement EOF ;
    public final void entryRuleBerechnungStatement() throws RecognitionException {
        try {
            // InternalMeth.g:604:1: ( ruleBerechnungStatement EOF )
            // InternalMeth.g:605:1: ruleBerechnungStatement EOF
            {
             before(grammarAccess.getBerechnungStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleBerechnungStatement();

            state._fsp--;

             after(grammarAccess.getBerechnungStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBerechnungStatement"


    // $ANTLR start "ruleBerechnungStatement"
    // InternalMeth.g:612:1: ruleBerechnungStatement : ( ( rule__BerechnungStatement__Group__0 ) ) ;
    public final void ruleBerechnungStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:616:2: ( ( ( rule__BerechnungStatement__Group__0 ) ) )
            // InternalMeth.g:617:2: ( ( rule__BerechnungStatement__Group__0 ) )
            {
            // InternalMeth.g:617:2: ( ( rule__BerechnungStatement__Group__0 ) )
            // InternalMeth.g:618:3: ( rule__BerechnungStatement__Group__0 )
            {
             before(grammarAccess.getBerechnungStatementAccess().getGroup()); 
            // InternalMeth.g:619:3: ( rule__BerechnungStatement__Group__0 )
            // InternalMeth.g:619:4: rule__BerechnungStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BerechnungStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBerechnungStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBerechnungStatement"


    // $ANTLR start "entryRuleAusgabeStatement"
    // InternalMeth.g:628:1: entryRuleAusgabeStatement : ruleAusgabeStatement EOF ;
    public final void entryRuleAusgabeStatement() throws RecognitionException {
        try {
            // InternalMeth.g:629:1: ( ruleAusgabeStatement EOF )
            // InternalMeth.g:630:1: ruleAusgabeStatement EOF
            {
             before(grammarAccess.getAusgabeStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleAusgabeStatement();

            state._fsp--;

             after(grammarAccess.getAusgabeStatementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAusgabeStatement"


    // $ANTLR start "ruleAusgabeStatement"
    // InternalMeth.g:637:1: ruleAusgabeStatement : ( ( rule__AusgabeStatement__Group__0 ) ) ;
    public final void ruleAusgabeStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:641:2: ( ( ( rule__AusgabeStatement__Group__0 ) ) )
            // InternalMeth.g:642:2: ( ( rule__AusgabeStatement__Group__0 ) )
            {
            // InternalMeth.g:642:2: ( ( rule__AusgabeStatement__Group__0 ) )
            // InternalMeth.g:643:3: ( rule__AusgabeStatement__Group__0 )
            {
             before(grammarAccess.getAusgabeStatementAccess().getGroup()); 
            // InternalMeth.g:644:3: ( rule__AusgabeStatement__Group__0 )
            // InternalMeth.g:644:4: rule__AusgabeStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AusgabeStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAusgabeStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAusgabeStatement"


    // $ANTLR start "entryRuleFormel"
    // InternalMeth.g:653:1: entryRuleFormel : ruleFormel EOF ;
    public final void entryRuleFormel() throws RecognitionException {
        try {
            // InternalMeth.g:654:1: ( ruleFormel EOF )
            // InternalMeth.g:655:1: ruleFormel EOF
            {
             before(grammarAccess.getFormelRule()); 
            pushFollow(FOLLOW_1);
            ruleFormel();

            state._fsp--;

             after(grammarAccess.getFormelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormel"


    // $ANTLR start "ruleFormel"
    // InternalMeth.g:662:1: ruleFormel : ( ( rule__Formel__Alternatives ) ) ;
    public final void ruleFormel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:666:2: ( ( ( rule__Formel__Alternatives ) ) )
            // InternalMeth.g:667:2: ( ( rule__Formel__Alternatives ) )
            {
            // InternalMeth.g:667:2: ( ( rule__Formel__Alternatives ) )
            // InternalMeth.g:668:3: ( rule__Formel__Alternatives )
            {
             before(grammarAccess.getFormelAccess().getAlternatives()); 
            // InternalMeth.g:669:3: ( rule__Formel__Alternatives )
            // InternalMeth.g:669:4: rule__Formel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Formel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormel"


    // $ANTLR start "entryRuleTextFormel"
    // InternalMeth.g:678:1: entryRuleTextFormel : ruleTextFormel EOF ;
    public final void entryRuleTextFormel() throws RecognitionException {
        try {
            // InternalMeth.g:679:1: ( ruleTextFormel EOF )
            // InternalMeth.g:680:1: ruleTextFormel EOF
            {
             before(grammarAccess.getTextFormelRule()); 
            pushFollow(FOLLOW_1);
            ruleTextFormel();

            state._fsp--;

             after(grammarAccess.getTextFormelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextFormel"


    // $ANTLR start "ruleTextFormel"
    // InternalMeth.g:687:1: ruleTextFormel : ( ( rule__TextFormel__TformelAssignment ) ) ;
    public final void ruleTextFormel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:691:2: ( ( ( rule__TextFormel__TformelAssignment ) ) )
            // InternalMeth.g:692:2: ( ( rule__TextFormel__TformelAssignment ) )
            {
            // InternalMeth.g:692:2: ( ( rule__TextFormel__TformelAssignment ) )
            // InternalMeth.g:693:3: ( rule__TextFormel__TformelAssignment )
            {
             before(grammarAccess.getTextFormelAccess().getTformelAssignment()); 
            // InternalMeth.g:694:3: ( rule__TextFormel__TformelAssignment )
            // InternalMeth.g:694:4: rule__TextFormel__TformelAssignment
            {
            pushFollow(FOLLOW_2);
            rule__TextFormel__TformelAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextFormelAccess().getTformelAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextFormel"


    // $ANTLR start "entryRuleNumFormel"
    // InternalMeth.g:703:1: entryRuleNumFormel : ruleNumFormel EOF ;
    public final void entryRuleNumFormel() throws RecognitionException {
        try {
            // InternalMeth.g:704:1: ( ruleNumFormel EOF )
            // InternalMeth.g:705:1: ruleNumFormel EOF
            {
             before(grammarAccess.getNumFormelRule()); 
            pushFollow(FOLLOW_1);
            ruleNumFormel();

            state._fsp--;

             after(grammarAccess.getNumFormelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumFormel"


    // $ANTLR start "ruleNumFormel"
    // InternalMeth.g:712:1: ruleNumFormel : ( ( rule__NumFormel__NformelAssignment ) ) ;
    public final void ruleNumFormel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:716:2: ( ( ( rule__NumFormel__NformelAssignment ) ) )
            // InternalMeth.g:717:2: ( ( rule__NumFormel__NformelAssignment ) )
            {
            // InternalMeth.g:717:2: ( ( rule__NumFormel__NformelAssignment ) )
            // InternalMeth.g:718:3: ( rule__NumFormel__NformelAssignment )
            {
             before(grammarAccess.getNumFormelAccess().getNformelAssignment()); 
            // InternalMeth.g:719:3: ( rule__NumFormel__NformelAssignment )
            // InternalMeth.g:719:4: rule__NumFormel__NformelAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumFormel__NformelAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumFormelAccess().getNformelAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumFormel"


    // $ANTLR start "rule__Deklaration__Alternatives"
    // InternalMeth.g:727:1: rule__Deklaration__Alternatives : ( ( ruleDimension ) | ( ruleEinheit ) | ( ruleUmrechnung ) | ( ruleKonstante ) );
    public final void rule__Deklaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:731:1: ( ( ruleDimension ) | ( ruleEinheit ) | ( ruleUmrechnung ) | ( ruleKonstante ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 25:
                {
                alt1=2;
                }
                break;
            case 27:
                {
                alt1=3;
                }
                break;
            case 28:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMeth.g:732:2: ( ruleDimension )
                    {
                    // InternalMeth.g:732:2: ( ruleDimension )
                    // InternalMeth.g:733:3: ruleDimension
                    {
                     before(grammarAccess.getDeklarationAccess().getDimensionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDimension();

                    state._fsp--;

                     after(grammarAccess.getDeklarationAccess().getDimensionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMeth.g:738:2: ( ruleEinheit )
                    {
                    // InternalMeth.g:738:2: ( ruleEinheit )
                    // InternalMeth.g:739:3: ruleEinheit
                    {
                     before(grammarAccess.getDeklarationAccess().getEinheitParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEinheit();

                    state._fsp--;

                     after(grammarAccess.getDeklarationAccess().getEinheitParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMeth.g:744:2: ( ruleUmrechnung )
                    {
                    // InternalMeth.g:744:2: ( ruleUmrechnung )
                    // InternalMeth.g:745:3: ruleUmrechnung
                    {
                     before(grammarAccess.getDeklarationAccess().getUmrechnungParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUmrechnung();

                    state._fsp--;

                     after(grammarAccess.getDeklarationAccess().getUmrechnungParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMeth.g:750:2: ( ruleKonstante )
                    {
                    // InternalMeth.g:750:2: ( ruleKonstante )
                    // InternalMeth.g:751:3: ruleKonstante
                    {
                     before(grammarAccess.getDeklarationAccess().getKonstanteParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleKonstante();

                    state._fsp--;

                     after(grammarAccess.getDeklarationAccess().getKonstanteParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Deklaration__Alternatives"


    // $ANTLR start "rule__DimensionMultiplikation__OperatorAlternatives_1_1_0"
    // InternalMeth.g:760:1: rule__DimensionMultiplikation__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__DimensionMultiplikation__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:764:1: ( ( '*' ) | ( '/' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMeth.g:765:2: ( '*' )
                    {
                    // InternalMeth.g:765:2: ( '*' )
                    // InternalMeth.g:766:3: '*'
                    {
                     before(grammarAccess.getDimensionMultiplikationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getDimensionMultiplikationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMeth.g:771:2: ( '/' )
                    {
                    // InternalMeth.g:771:2: ( '/' )
                    // InternalMeth.g:772:3: '/'
                    {
                     before(grammarAccess.getDimensionMultiplikationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getDimensionMultiplikationAccess().getOperatorSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionMultiplikation__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__DimensionPrimary__Alternatives"
    // InternalMeth.g:781:1: rule__DimensionPrimary__Alternatives : ( ( ( rule__DimensionPrimary__Group_0__0 ) ) | ( ( rule__DimensionPrimary__RefAssignment_1 ) ) );
    public final void rule__DimensionPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:785:1: ( ( ( rule__DimensionPrimary__Group_0__0 ) ) | ( ( rule__DimensionPrimary__RefAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMeth.g:786:2: ( ( rule__DimensionPrimary__Group_0__0 ) )
                    {
                    // InternalMeth.g:786:2: ( ( rule__DimensionPrimary__Group_0__0 ) )
                    // InternalMeth.g:787:3: ( rule__DimensionPrimary__Group_0__0 )
                    {
                     before(grammarAccess.getDimensionPrimaryAccess().getGroup_0()); 
                    // InternalMeth.g:788:3: ( rule__DimensionPrimary__Group_0__0 )
                    // InternalMeth.g:788:4: rule__DimensionPrimary__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DimensionPrimary__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDimensionPrimaryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMeth.g:792:2: ( ( rule__DimensionPrimary__RefAssignment_1 ) )
                    {
                    // InternalMeth.g:792:2: ( ( rule__DimensionPrimary__RefAssignment_1 ) )
                    // InternalMeth.g:793:3: ( rule__DimensionPrimary__RefAssignment_1 )
                    {
                     before(grammarAccess.getDimensionPrimaryAccess().getRefAssignment_1()); 
                    // InternalMeth.g:794:3: ( rule__DimensionPrimary__RefAssignment_1 )
                    // InternalMeth.g:794:4: rule__DimensionPrimary__RefAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DimensionPrimary__RefAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDimensionPrimaryAccess().getRefAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionPrimary__Alternatives"


    // $ANTLR start "rule__Einheit__Alternatives_2"
    // InternalMeth.g:802:1: rule__Einheit__Alternatives_2 : ( ( ( rule__Einheit__Group_2_0__0 ) ) | ( ( rule__Einheit__Group_2_1__0 ) ) );
    public final void rule__Einheit__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:806:1: ( ( ( rule__Einheit__Group_2_0__0 ) ) | ( ( rule__Einheit__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==22) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMeth.g:807:2: ( ( rule__Einheit__Group_2_0__0 ) )
                    {
                    // InternalMeth.g:807:2: ( ( rule__Einheit__Group_2_0__0 ) )
                    // InternalMeth.g:808:3: ( rule__Einheit__Group_2_0__0 )
                    {
                     before(grammarAccess.getEinheitAccess().getGroup_2_0()); 
                    // InternalMeth.g:809:3: ( rule__Einheit__Group_2_0__0 )
                    // InternalMeth.g:809:4: rule__Einheit__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Einheit__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEinheitAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMeth.g:813:2: ( ( rule__Einheit__Group_2_1__0 ) )
                    {
                    // InternalMeth.g:813:2: ( ( rule__Einheit__Group_2_1__0 ) )
                    // InternalMeth.g:814:3: ( rule__Einheit__Group_2_1__0 )
                    {
                     before(grammarAccess.getEinheitAccess().getGroup_2_1()); 
                    // InternalMeth.g:815:3: ( rule__Einheit__Group_2_1__0 )
                    // InternalMeth.g:815:4: rule__Einheit__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Einheit__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEinheitAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Alternatives_2"


    // $ANTLR start "rule__Zahl__Alternatives"
    // InternalMeth.g:823:1: rule__Zahl__Alternatives : ( ( ruleGanzzahl ) | ( ruleDezimalzahl ) );
    public final void rule__Zahl__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:827:1: ( ( ruleGanzzahl ) | ( ruleDezimalzahl ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_GANZ) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_DEZIMAL) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMeth.g:828:2: ( ruleGanzzahl )
                    {
                    // InternalMeth.g:828:2: ( ruleGanzzahl )
                    // InternalMeth.g:829:3: ruleGanzzahl
                    {
                     before(grammarAccess.getZahlAccess().getGanzzahlParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGanzzahl();

                    state._fsp--;

                     after(grammarAccess.getZahlAccess().getGanzzahlParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMeth.g:834:2: ( ruleDezimalzahl )
                    {
                    // InternalMeth.g:834:2: ( ruleDezimalzahl )
                    // InternalMeth.g:835:3: ruleDezimalzahl
                    {
                     before(grammarAccess.getZahlAccess().getDezimalzahlParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDezimalzahl();

                    state._fsp--;

                     after(grammarAccess.getZahlAccess().getDezimalzahlParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Zahl__Alternatives"


    // $ANTLR start "rule__EinheitAddition__OperatorAlternatives_1_1_0"
    // InternalMeth.g:844:1: rule__EinheitAddition__OperatorAlternatives_1_1_0 : ( ( '+' ) | ( '-' ) );
    public final void rule__EinheitAddition__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:848:1: ( ( '+' ) | ( '-' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==15) ) {
                alt6=1;
            }
            else if ( (LA6_0==16) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMeth.g:849:2: ( '+' )
                    {
                    // InternalMeth.g:849:2: ( '+' )
                    // InternalMeth.g:850:3: '+'
                    {
                     before(grammarAccess.getEinheitAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getEinheitAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMeth.g:855:2: ( '-' )
                    {
                    // InternalMeth.g:855:2: ( '-' )
                    // InternalMeth.g:856:3: '-'
                    {
                     before(grammarAccess.getEinheitAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEinheitAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitAddition__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__EinheitMultiplikation__OperatorAlternatives_1_1_0"
    // InternalMeth.g:865:1: rule__EinheitMultiplikation__OperatorAlternatives_1_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__EinheitMultiplikation__OperatorAlternatives_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:869:1: ( ( '*' ) | ( '/' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                alt7=1;
            }
            else if ( (LA7_0==14) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMeth.g:870:2: ( '*' )
                    {
                    // InternalMeth.g:870:2: ( '*' )
                    // InternalMeth.g:871:3: '*'
                    {
                     before(grammarAccess.getEinheitMultiplikationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEinheitMultiplikationAccess().getOperatorAsteriskKeyword_1_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMeth.g:876:2: ( '/' )
                    {
                    // InternalMeth.g:876:2: ( '/' )
                    // InternalMeth.g:877:3: '/'
                    {
                     before(grammarAccess.getEinheitMultiplikationAccess().getOperatorSolidusKeyword_1_1_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEinheitMultiplikationAccess().getOperatorSolidusKeyword_1_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitMultiplikation__OperatorAlternatives_1_1_0"


    // $ANTLR start "rule__EinheitPrimary__Alternatives"
    // InternalMeth.g:886:1: rule__EinheitPrimary__Alternatives : ( ( ruleZahl ) | ( ( rule__EinheitPrimary__VarrefAssignment_1 ) ) | ( ( rule__EinheitPrimary__Group_2__0 ) ) );
    public final void rule__EinheitPrimary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:890:1: ( ( ruleZahl ) | ( ( rule__EinheitPrimary__VarrefAssignment_1 ) ) | ( ( rule__EinheitPrimary__Group_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_GANZ:
            case RULE_DEZIMAL:
                {
                alt8=1;
                }
                break;
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMeth.g:891:2: ( ruleZahl )
                    {
                    // InternalMeth.g:891:2: ( ruleZahl )
                    // InternalMeth.g:892:3: ruleZahl
                    {
                     before(grammarAccess.getEinheitPrimaryAccess().getZahlParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleZahl();

                    state._fsp--;

                     after(grammarAccess.getEinheitPrimaryAccess().getZahlParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMeth.g:897:2: ( ( rule__EinheitPrimary__VarrefAssignment_1 ) )
                    {
                    // InternalMeth.g:897:2: ( ( rule__EinheitPrimary__VarrefAssignment_1 ) )
                    // InternalMeth.g:898:3: ( rule__EinheitPrimary__VarrefAssignment_1 )
                    {
                     before(grammarAccess.getEinheitPrimaryAccess().getVarrefAssignment_1()); 
                    // InternalMeth.g:899:3: ( rule__EinheitPrimary__VarrefAssignment_1 )
                    // InternalMeth.g:899:4: rule__EinheitPrimary__VarrefAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EinheitPrimary__VarrefAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getEinheitPrimaryAccess().getVarrefAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMeth.g:903:2: ( ( rule__EinheitPrimary__Group_2__0 ) )
                    {
                    // InternalMeth.g:903:2: ( ( rule__EinheitPrimary__Group_2__0 ) )
                    // InternalMeth.g:904:3: ( rule__EinheitPrimary__Group_2__0 )
                    {
                     before(grammarAccess.getEinheitPrimaryAccess().getGroup_2()); 
                    // InternalMeth.g:905:3: ( rule__EinheitPrimary__Group_2__0 )
                    // InternalMeth.g:905:4: rule__EinheitPrimary__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EinheitPrimary__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEinheitPrimaryAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitPrimary__Alternatives"


    // $ANTLR start "rule__Methode__AblaufAlternatives_5_0"
    // InternalMeth.g:913:1: rule__Methode__AblaufAlternatives_5_0 : ( ( ruleGegeben ) | ( ruleEingabe ) | ( ruleBerechnung ) | ( ruleAusgabe ) );
    public final void rule__Methode__AblaufAlternatives_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:917:1: ( ( ruleGegeben ) | ( ruleEingabe ) | ( ruleBerechnung ) | ( ruleAusgabe ) )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt9=1;
                }
                break;
            case 32:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            case 34:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalMeth.g:918:2: ( ruleGegeben )
                    {
                    // InternalMeth.g:918:2: ( ruleGegeben )
                    // InternalMeth.g:919:3: ruleGegeben
                    {
                     before(grammarAccess.getMethodeAccess().getAblaufGegebenParserRuleCall_5_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleGegeben();

                    state._fsp--;

                     after(grammarAccess.getMethodeAccess().getAblaufGegebenParserRuleCall_5_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMeth.g:924:2: ( ruleEingabe )
                    {
                    // InternalMeth.g:924:2: ( ruleEingabe )
                    // InternalMeth.g:925:3: ruleEingabe
                    {
                     before(grammarAccess.getMethodeAccess().getAblaufEingabeParserRuleCall_5_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEingabe();

                    state._fsp--;

                     after(grammarAccess.getMethodeAccess().getAblaufEingabeParserRuleCall_5_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMeth.g:930:2: ( ruleBerechnung )
                    {
                    // InternalMeth.g:930:2: ( ruleBerechnung )
                    // InternalMeth.g:931:3: ruleBerechnung
                    {
                     before(grammarAccess.getMethodeAccess().getAblaufBerechnungParserRuleCall_5_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBerechnung();

                    state._fsp--;

                     after(grammarAccess.getMethodeAccess().getAblaufBerechnungParserRuleCall_5_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMeth.g:936:2: ( ruleAusgabe )
                    {
                    // InternalMeth.g:936:2: ( ruleAusgabe )
                    // InternalMeth.g:937:3: ruleAusgabe
                    {
                     before(grammarAccess.getMethodeAccess().getAblaufAusgabeParserRuleCall_5_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleAusgabe();

                    state._fsp--;

                     after(grammarAccess.getMethodeAccess().getAblaufAusgabeParserRuleCall_5_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__AblaufAlternatives_5_0"


    // $ANTLR start "rule__Formel__Alternatives"
    // InternalMeth.g:946:1: rule__Formel__Alternatives : ( ( ruleTextFormel ) | ( ruleNumFormel ) );
    public final void rule__Formel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:950:1: ( ( ruleTextFormel ) | ( ruleNumFormel ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==38) ) {
                alt10=1;
            }
            else if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_DEZIMAL)||LA10_0==23) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMeth.g:951:2: ( ruleTextFormel )
                    {
                    // InternalMeth.g:951:2: ( ruleTextFormel )
                    // InternalMeth.g:952:3: ruleTextFormel
                    {
                     before(grammarAccess.getFormelAccess().getTextFormelParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTextFormel();

                    state._fsp--;

                     after(grammarAccess.getFormelAccess().getTextFormelParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMeth.g:957:2: ( ruleNumFormel )
                    {
                    // InternalMeth.g:957:2: ( ruleNumFormel )
                    // InternalMeth.g:958:3: ruleNumFormel
                    {
                     before(grammarAccess.getFormelAccess().getNumFormelParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumFormel();

                    state._fsp--;

                     after(grammarAccess.getFormelAccess().getNumFormelParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Formel__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMeth.g:967:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:971:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMeth.g:972:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMeth.g:979:1: rule__Model__Group__0__Impl : ( ( rule__Model__EinheitensystemAssignment_0 ) ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:983:1: ( ( ( rule__Model__EinheitensystemAssignment_0 ) ) )
            // InternalMeth.g:984:1: ( ( rule__Model__EinheitensystemAssignment_0 ) )
            {
            // InternalMeth.g:984:1: ( ( rule__Model__EinheitensystemAssignment_0 ) )
            // InternalMeth.g:985:2: ( rule__Model__EinheitensystemAssignment_0 )
            {
             before(grammarAccess.getModelAccess().getEinheitensystemAssignment_0()); 
            // InternalMeth.g:986:2: ( rule__Model__EinheitensystemAssignment_0 )
            // InternalMeth.g:986:3: rule__Model__EinheitensystemAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__EinheitensystemAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getEinheitensystemAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMeth.g:994:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:998:1: ( rule__Model__Group__1__Impl )
            // InternalMeth.g:999:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMeth.g:1005:1: rule__Model__Group__1__Impl : ( ( rule__Model__MethodenAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1009:1: ( ( ( rule__Model__MethodenAssignment_1 )* ) )
            // InternalMeth.g:1010:1: ( ( rule__Model__MethodenAssignment_1 )* )
            {
            // InternalMeth.g:1010:1: ( ( rule__Model__MethodenAssignment_1 )* )
            // InternalMeth.g:1011:2: ( rule__Model__MethodenAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getMethodenAssignment_1()); 
            // InternalMeth.g:1012:2: ( rule__Model__MethodenAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==29) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMeth.g:1012:3: rule__Model__MethodenAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__MethodenAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMethodenAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Einheitensystem__Group__0"
    // InternalMeth.g:1021:1: rule__Einheitensystem__Group__0 : rule__Einheitensystem__Group__0__Impl rule__Einheitensystem__Group__1 ;
    public final void rule__Einheitensystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1025:1: ( rule__Einheitensystem__Group__0__Impl rule__Einheitensystem__Group__1 )
            // InternalMeth.g:1026:2: rule__Einheitensystem__Group__0__Impl rule__Einheitensystem__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Einheitensystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Einheitensystem__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheitensystem__Group__0"


    // $ANTLR start "rule__Einheitensystem__Group__0__Impl"
    // InternalMeth.g:1033:1: rule__Einheitensystem__Group__0__Impl : ( () ) ;
    public final void rule__Einheitensystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1037:1: ( ( () ) )
            // InternalMeth.g:1038:1: ( () )
            {
            // InternalMeth.g:1038:1: ( () )
            // InternalMeth.g:1039:2: ()
            {
             before(grammarAccess.getEinheitensystemAccess().getEinheitensystemAction_0()); 
            // InternalMeth.g:1040:2: ()
            // InternalMeth.g:1040:3: 
            {
            }

             after(grammarAccess.getEinheitensystemAccess().getEinheitensystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheitensystem__Group__0__Impl"


    // $ANTLR start "rule__Einheitensystem__Group__1"
    // InternalMeth.g:1048:1: rule__Einheitensystem__Group__1 : rule__Einheitensystem__Group__1__Impl rule__Einheitensystem__Group__2 ;
    public final void rule__Einheitensystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1052:1: ( rule__Einheitensystem__Group__1__Impl rule__Einheitensystem__Group__2 )
            // InternalMeth.g:1053:2: rule__Einheitensystem__Group__1__Impl rule__Einheitensystem__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Einheitensystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Einheitensystem__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheitensystem__Group__1"


    // $ANTLR start "rule__Einheitensystem__Group__1__Impl"
    // InternalMeth.g:1060:1: rule__Einheitensystem__Group__1__Impl : ( 'Einheitensystem' ) ;
    public final void rule__Einheitensystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1064:1: ( ( 'Einheitensystem' ) )
            // InternalMeth.g:1065:1: ( 'Einheitensystem' )
            {
            // InternalMeth.g:1065:1: ( 'Einheitensystem' )
            // InternalMeth.g:1066:2: 'Einheitensystem'
            {
             before(grammarAccess.getEinheitensystemAccess().getEinheitensystemKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEinheitensystemAccess().getEinheitensystemKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheitensystem__Group__1__Impl"


    // $ANTLR start "rule__Einheitensystem__Group__2"
    // InternalMeth.g:1075:1: rule__Einheitensystem__Group__2 : rule__Einheitensystem__Group__2__Impl rule__Einheitensystem__Group__3 ;
    public final void rule__Einheitensystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1079:1: ( rule__Einheitensystem__Group__2__Impl rule__Einheitensystem__Group__3 )
            // InternalMeth.g:1080:2: rule__Einheitensystem__Group__2__Impl rule__Einheitensystem__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Einheitensystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Einheitensystem__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheitensystem__Group__2"


    // $ANTLR start "rule__Einheitensystem__Group__2__Impl"
    // InternalMeth.g:1087:1: rule__Einheitensystem__Group__2__Impl : ( '{' ) ;
    public final void rule__Einheitensystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1091:1: ( ( '{' ) )
            // InternalMeth.g:1092:1: ( '{' )
            {
            // InternalMeth.g:1092:1: ( '{' )
            // InternalMeth.g:1093:2: '{'
            {
             before(grammarAccess.getEinheitensystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEinheitensystemAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheitensystem__Group__2__Impl"


    // $ANTLR start "rule__Einheitensystem__Group__3"
    // InternalMeth.g:1102:1: rule__Einheitensystem__Group__3 : rule__Einheitensystem__Group__3__Impl rule__Einheitensystem__Group__4 ;
    public final void rule__Einheitensystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1106:1: ( rule__Einheitensystem__Group__3__Impl rule__Einheitensystem__Group__4 )
            // InternalMeth.g:1107:2: rule__Einheitensystem__Group__3__Impl rule__Einheitensystem__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Einheitensystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Einheitensystem__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheitensystem__Group__3"


    // $ANTLR start "rule__Einheitensystem__Group__3__Impl"
    // InternalMeth.g:1114:1: rule__Einheitensystem__Group__3__Impl : ( ( rule__Einheitensystem__DeklarationenAssignment_3 )* ) ;
    public final void rule__Einheitensystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1118:1: ( ( ( rule__Einheitensystem__DeklarationenAssignment_3 )* ) )
            // InternalMeth.g:1119:1: ( ( rule__Einheitensystem__DeklarationenAssignment_3 )* )
            {
            // InternalMeth.g:1119:1: ( ( rule__Einheitensystem__DeklarationenAssignment_3 )* )
            // InternalMeth.g:1120:2: ( rule__Einheitensystem__DeklarationenAssignment_3 )*
            {
             before(grammarAccess.getEinheitensystemAccess().getDeklarationenAssignment_3()); 
            // InternalMeth.g:1121:2: ( rule__Einheitensystem__DeklarationenAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==20||LA12_0==25||(LA12_0>=27 && LA12_0<=28)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMeth.g:1121:3: rule__Einheitensystem__DeklarationenAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Einheitensystem__DeklarationenAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getEinheitensystemAccess().getDeklarationenAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheitensystem__Group__3__Impl"


    // $ANTLR start "rule__Einheitensystem__Group__4"
    // InternalMeth.g:1129:1: rule__Einheitensystem__Group__4 : rule__Einheitensystem__Group__4__Impl ;
    public final void rule__Einheitensystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1133:1: ( rule__Einheitensystem__Group__4__Impl )
            // InternalMeth.g:1134:2: rule__Einheitensystem__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Einheitensystem__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheitensystem__Group__4"


    // $ANTLR start "rule__Einheitensystem__Group__4__Impl"
    // InternalMeth.g:1140:1: rule__Einheitensystem__Group__4__Impl : ( '}' ) ;
    public final void rule__Einheitensystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1144:1: ( ( '}' ) )
            // InternalMeth.g:1145:1: ( '}' )
            {
            // InternalMeth.g:1145:1: ( '}' )
            // InternalMeth.g:1146:2: '}'
            {
             before(grammarAccess.getEinheitensystemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEinheitensystemAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheitensystem__Group__4__Impl"


    // $ANTLR start "rule__Dimension__Group__0"
    // InternalMeth.g:1156:1: rule__Dimension__Group__0 : rule__Dimension__Group__0__Impl rule__Dimension__Group__1 ;
    public final void rule__Dimension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1160:1: ( rule__Dimension__Group__0__Impl rule__Dimension__Group__1 )
            // InternalMeth.g:1161:2: rule__Dimension__Group__0__Impl rule__Dimension__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Dimension__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimension__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__0"


    // $ANTLR start "rule__Dimension__Group__0__Impl"
    // InternalMeth.g:1168:1: rule__Dimension__Group__0__Impl : ( 'Dimension' ) ;
    public final void rule__Dimension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1172:1: ( ( 'Dimension' ) )
            // InternalMeth.g:1173:1: ( 'Dimension' )
            {
            // InternalMeth.g:1173:1: ( 'Dimension' )
            // InternalMeth.g:1174:2: 'Dimension'
            {
             before(grammarAccess.getDimensionAccess().getDimensionKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getDimensionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__0__Impl"


    // $ANTLR start "rule__Dimension__Group__1"
    // InternalMeth.g:1183:1: rule__Dimension__Group__1 : rule__Dimension__Group__1__Impl rule__Dimension__Group__2 ;
    public final void rule__Dimension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1187:1: ( rule__Dimension__Group__1__Impl rule__Dimension__Group__2 )
            // InternalMeth.g:1188:2: rule__Dimension__Group__1__Impl rule__Dimension__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Dimension__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimension__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__1"


    // $ANTLR start "rule__Dimension__Group__1__Impl"
    // InternalMeth.g:1195:1: rule__Dimension__Group__1__Impl : ( ( rule__Dimension__NameAssignment_1 ) ) ;
    public final void rule__Dimension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1199:1: ( ( ( rule__Dimension__NameAssignment_1 ) ) )
            // InternalMeth.g:1200:1: ( ( rule__Dimension__NameAssignment_1 ) )
            {
            // InternalMeth.g:1200:1: ( ( rule__Dimension__NameAssignment_1 ) )
            // InternalMeth.g:1201:2: ( rule__Dimension__NameAssignment_1 )
            {
             before(grammarAccess.getDimensionAccess().getNameAssignment_1()); 
            // InternalMeth.g:1202:2: ( rule__Dimension__NameAssignment_1 )
            // InternalMeth.g:1202:3: rule__Dimension__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__1__Impl"


    // $ANTLR start "rule__Dimension__Group__2"
    // InternalMeth.g:1210:1: rule__Dimension__Group__2 : rule__Dimension__Group__2__Impl rule__Dimension__Group__3 ;
    public final void rule__Dimension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1214:1: ( rule__Dimension__Group__2__Impl rule__Dimension__Group__3 )
            // InternalMeth.g:1215:2: rule__Dimension__Group__2__Impl rule__Dimension__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Dimension__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimension__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__2"


    // $ANTLR start "rule__Dimension__Group__2__Impl"
    // InternalMeth.g:1222:1: rule__Dimension__Group__2__Impl : ( ( rule__Dimension__Group_2__0 )? ) ;
    public final void rule__Dimension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1226:1: ( ( ( rule__Dimension__Group_2__0 )? ) )
            // InternalMeth.g:1227:1: ( ( rule__Dimension__Group_2__0 )? )
            {
            // InternalMeth.g:1227:1: ( ( rule__Dimension__Group_2__0 )? )
            // InternalMeth.g:1228:2: ( rule__Dimension__Group_2__0 )?
            {
             before(grammarAccess.getDimensionAccess().getGroup_2()); 
            // InternalMeth.g:1229:2: ( rule__Dimension__Group_2__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMeth.g:1229:3: rule__Dimension__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Dimension__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDimensionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__2__Impl"


    // $ANTLR start "rule__Dimension__Group__3"
    // InternalMeth.g:1237:1: rule__Dimension__Group__3 : rule__Dimension__Group__3__Impl ;
    public final void rule__Dimension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1241:1: ( rule__Dimension__Group__3__Impl )
            // InternalMeth.g:1242:2: rule__Dimension__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__3"


    // $ANTLR start "rule__Dimension__Group__3__Impl"
    // InternalMeth.g:1248:1: rule__Dimension__Group__3__Impl : ( ';' ) ;
    public final void rule__Dimension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1252:1: ( ( ';' ) )
            // InternalMeth.g:1253:1: ( ';' )
            {
            // InternalMeth.g:1253:1: ( ';' )
            // InternalMeth.g:1254:2: ';'
            {
             before(grammarAccess.getDimensionAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group__3__Impl"


    // $ANTLR start "rule__Dimension__Group_2__0"
    // InternalMeth.g:1264:1: rule__Dimension__Group_2__0 : rule__Dimension__Group_2__0__Impl rule__Dimension__Group_2__1 ;
    public final void rule__Dimension__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1268:1: ( rule__Dimension__Group_2__0__Impl rule__Dimension__Group_2__1 )
            // InternalMeth.g:1269:2: rule__Dimension__Group_2__0__Impl rule__Dimension__Group_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Dimension__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Dimension__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_2__0"


    // $ANTLR start "rule__Dimension__Group_2__0__Impl"
    // InternalMeth.g:1276:1: rule__Dimension__Group_2__0__Impl : ( '=' ) ;
    public final void rule__Dimension__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1280:1: ( ( '=' ) )
            // InternalMeth.g:1281:1: ( '=' )
            {
            // InternalMeth.g:1281:1: ( '=' )
            // InternalMeth.g:1282:2: '='
            {
             before(grammarAccess.getDimensionAccess().getEqualsSignKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_2__0__Impl"


    // $ANTLR start "rule__Dimension__Group_2__1"
    // InternalMeth.g:1291:1: rule__Dimension__Group_2__1 : rule__Dimension__Group_2__1__Impl ;
    public final void rule__Dimension__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1295:1: ( rule__Dimension__Group_2__1__Impl )
            // InternalMeth.g:1296:2: rule__Dimension__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_2__1"


    // $ANTLR start "rule__Dimension__Group_2__1__Impl"
    // InternalMeth.g:1302:1: rule__Dimension__Group_2__1__Impl : ( ( rule__Dimension__BasisAssignment_2_1 ) ) ;
    public final void rule__Dimension__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1306:1: ( ( ( rule__Dimension__BasisAssignment_2_1 ) ) )
            // InternalMeth.g:1307:1: ( ( rule__Dimension__BasisAssignment_2_1 ) )
            {
            // InternalMeth.g:1307:1: ( ( rule__Dimension__BasisAssignment_2_1 ) )
            // InternalMeth.g:1308:2: ( rule__Dimension__BasisAssignment_2_1 )
            {
             before(grammarAccess.getDimensionAccess().getBasisAssignment_2_1()); 
            // InternalMeth.g:1309:2: ( rule__Dimension__BasisAssignment_2_1 )
            // InternalMeth.g:1309:3: rule__Dimension__BasisAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Dimension__BasisAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensionAccess().getBasisAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__Group_2__1__Impl"


    // $ANTLR start "rule__DimensionMultiplikation__Group__0"
    // InternalMeth.g:1318:1: rule__DimensionMultiplikation__Group__0 : rule__DimensionMultiplikation__Group__0__Impl rule__DimensionMultiplikation__Group__1 ;
    public final void rule__DimensionMultiplikation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1322:1: ( rule__DimensionMultiplikation__Group__0__Impl rule__DimensionMultiplikation__Group__1 )
            // InternalMeth.g:1323:2: rule__DimensionMultiplikation__Group__0__Impl rule__DimensionMultiplikation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__DimensionMultiplikation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionMultiplikation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionMultiplikation__Group__0"


    // $ANTLR start "rule__DimensionMultiplikation__Group__0__Impl"
    // InternalMeth.g:1330:1: rule__DimensionMultiplikation__Group__0__Impl : ( ruleDimensionPrimary ) ;
    public final void rule__DimensionMultiplikation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1334:1: ( ( ruleDimensionPrimary ) )
            // InternalMeth.g:1335:1: ( ruleDimensionPrimary )
            {
            // InternalMeth.g:1335:1: ( ruleDimensionPrimary )
            // InternalMeth.g:1336:2: ruleDimensionPrimary
            {
             before(grammarAccess.getDimensionMultiplikationAccess().getDimensionPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDimensionPrimary();

            state._fsp--;

             after(grammarAccess.getDimensionMultiplikationAccess().getDimensionPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionMultiplikation__Group__0__Impl"


    // $ANTLR start "rule__DimensionMultiplikation__Group__1"
    // InternalMeth.g:1345:1: rule__DimensionMultiplikation__Group__1 : rule__DimensionMultiplikation__Group__1__Impl ;
    public final void rule__DimensionMultiplikation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1349:1: ( rule__DimensionMultiplikation__Group__1__Impl )
            // InternalMeth.g:1350:2: rule__DimensionMultiplikation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DimensionMultiplikation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionMultiplikation__Group__1"


    // $ANTLR start "rule__DimensionMultiplikation__Group__1__Impl"
    // InternalMeth.g:1356:1: rule__DimensionMultiplikation__Group__1__Impl : ( ( rule__DimensionMultiplikation__Group_1__0 )* ) ;
    public final void rule__DimensionMultiplikation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1360:1: ( ( ( rule__DimensionMultiplikation__Group_1__0 )* ) )
            // InternalMeth.g:1361:1: ( ( rule__DimensionMultiplikation__Group_1__0 )* )
            {
            // InternalMeth.g:1361:1: ( ( rule__DimensionMultiplikation__Group_1__0 )* )
            // InternalMeth.g:1362:2: ( rule__DimensionMultiplikation__Group_1__0 )*
            {
             before(grammarAccess.getDimensionMultiplikationAccess().getGroup_1()); 
            // InternalMeth.g:1363:2: ( rule__DimensionMultiplikation__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=13 && LA14_0<=14)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMeth.g:1363:3: rule__DimensionMultiplikation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__DimensionMultiplikation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getDimensionMultiplikationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionMultiplikation__Group__1__Impl"


    // $ANTLR start "rule__DimensionMultiplikation__Group_1__0"
    // InternalMeth.g:1372:1: rule__DimensionMultiplikation__Group_1__0 : rule__DimensionMultiplikation__Group_1__0__Impl rule__DimensionMultiplikation__Group_1__1 ;
    public final void rule__DimensionMultiplikation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1376:1: ( rule__DimensionMultiplikation__Group_1__0__Impl rule__DimensionMultiplikation__Group_1__1 )
            // InternalMeth.g:1377:2: rule__DimensionMultiplikation__Group_1__0__Impl rule__DimensionMultiplikation__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__DimensionMultiplikation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionMultiplikation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionMultiplikation__Group_1__0"


    // $ANTLR start "rule__DimensionMultiplikation__Group_1__0__Impl"
    // InternalMeth.g:1384:1: rule__DimensionMultiplikation__Group_1__0__Impl : ( () ) ;
    public final void rule__DimensionMultiplikation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1388:1: ( ( () ) )
            // InternalMeth.g:1389:1: ( () )
            {
            // InternalMeth.g:1389:1: ( () )
            // InternalMeth.g:1390:2: ()
            {
             before(grammarAccess.getDimensionMultiplikationAccess().getDimensionMultiplikationLinksAction_1_0()); 
            // InternalMeth.g:1391:2: ()
            // InternalMeth.g:1391:3: 
            {
            }

             after(grammarAccess.getDimensionMultiplikationAccess().getDimensionMultiplikationLinksAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionMultiplikation__Group_1__0__Impl"


    // $ANTLR start "rule__DimensionMultiplikation__Group_1__1"
    // InternalMeth.g:1399:1: rule__DimensionMultiplikation__Group_1__1 : rule__DimensionMultiplikation__Group_1__1__Impl rule__DimensionMultiplikation__Group_1__2 ;
    public final void rule__DimensionMultiplikation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1403:1: ( rule__DimensionMultiplikation__Group_1__1__Impl rule__DimensionMultiplikation__Group_1__2 )
            // InternalMeth.g:1404:2: rule__DimensionMultiplikation__Group_1__1__Impl rule__DimensionMultiplikation__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__DimensionMultiplikation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionMultiplikation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionMultiplikation__Group_1__1"


    // $ANTLR start "rule__DimensionMultiplikation__Group_1__1__Impl"
    // InternalMeth.g:1411:1: rule__DimensionMultiplikation__Group_1__1__Impl : ( ( rule__DimensionMultiplikation__OperatorAssignment_1_1 ) ) ;
    public final void rule__DimensionMultiplikation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1415:1: ( ( ( rule__DimensionMultiplikation__OperatorAssignment_1_1 ) ) )
            // InternalMeth.g:1416:1: ( ( rule__DimensionMultiplikation__OperatorAssignment_1_1 ) )
            {
            // InternalMeth.g:1416:1: ( ( rule__DimensionMultiplikation__OperatorAssignment_1_1 ) )
            // InternalMeth.g:1417:2: ( rule__DimensionMultiplikation__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getDimensionMultiplikationAccess().getOperatorAssignment_1_1()); 
            // InternalMeth.g:1418:2: ( rule__DimensionMultiplikation__OperatorAssignment_1_1 )
            // InternalMeth.g:1418:3: rule__DimensionMultiplikation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DimensionMultiplikation__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDimensionMultiplikationAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionMultiplikation__Group_1__1__Impl"


    // $ANTLR start "rule__DimensionMultiplikation__Group_1__2"
    // InternalMeth.g:1426:1: rule__DimensionMultiplikation__Group_1__2 : rule__DimensionMultiplikation__Group_1__2__Impl ;
    public final void rule__DimensionMultiplikation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1430:1: ( rule__DimensionMultiplikation__Group_1__2__Impl )
            // InternalMeth.g:1431:2: rule__DimensionMultiplikation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DimensionMultiplikation__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionMultiplikation__Group_1__2"


    // $ANTLR start "rule__DimensionMultiplikation__Group_1__2__Impl"
    // InternalMeth.g:1437:1: rule__DimensionMultiplikation__Group_1__2__Impl : ( ( rule__DimensionMultiplikation__RechtsAssignment_1_2 ) ) ;
    public final void rule__DimensionMultiplikation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1441:1: ( ( ( rule__DimensionMultiplikation__RechtsAssignment_1_2 ) ) )
            // InternalMeth.g:1442:1: ( ( rule__DimensionMultiplikation__RechtsAssignment_1_2 ) )
            {
            // InternalMeth.g:1442:1: ( ( rule__DimensionMultiplikation__RechtsAssignment_1_2 ) )
            // InternalMeth.g:1443:2: ( rule__DimensionMultiplikation__RechtsAssignment_1_2 )
            {
             before(grammarAccess.getDimensionMultiplikationAccess().getRechtsAssignment_1_2()); 
            // InternalMeth.g:1444:2: ( rule__DimensionMultiplikation__RechtsAssignment_1_2 )
            // InternalMeth.g:1444:3: rule__DimensionMultiplikation__RechtsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DimensionMultiplikation__RechtsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getDimensionMultiplikationAccess().getRechtsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionMultiplikation__Group_1__2__Impl"


    // $ANTLR start "rule__DimensionPrimary__Group_0__0"
    // InternalMeth.g:1453:1: rule__DimensionPrimary__Group_0__0 : rule__DimensionPrimary__Group_0__0__Impl rule__DimensionPrimary__Group_0__1 ;
    public final void rule__DimensionPrimary__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1457:1: ( rule__DimensionPrimary__Group_0__0__Impl rule__DimensionPrimary__Group_0__1 )
            // InternalMeth.g:1458:2: rule__DimensionPrimary__Group_0__0__Impl rule__DimensionPrimary__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__DimensionPrimary__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionPrimary__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionPrimary__Group_0__0"


    // $ANTLR start "rule__DimensionPrimary__Group_0__0__Impl"
    // InternalMeth.g:1465:1: rule__DimensionPrimary__Group_0__0__Impl : ( '(' ) ;
    public final void rule__DimensionPrimary__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1469:1: ( ( '(' ) )
            // InternalMeth.g:1470:1: ( '(' )
            {
            // InternalMeth.g:1470:1: ( '(' )
            // InternalMeth.g:1471:2: '('
            {
             before(grammarAccess.getDimensionPrimaryAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDimensionPrimaryAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionPrimary__Group_0__0__Impl"


    // $ANTLR start "rule__DimensionPrimary__Group_0__1"
    // InternalMeth.g:1480:1: rule__DimensionPrimary__Group_0__1 : rule__DimensionPrimary__Group_0__1__Impl rule__DimensionPrimary__Group_0__2 ;
    public final void rule__DimensionPrimary__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1484:1: ( rule__DimensionPrimary__Group_0__1__Impl rule__DimensionPrimary__Group_0__2 )
            // InternalMeth.g:1485:2: rule__DimensionPrimary__Group_0__1__Impl rule__DimensionPrimary__Group_0__2
            {
            pushFollow(FOLLOW_14);
            rule__DimensionPrimary__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DimensionPrimary__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionPrimary__Group_0__1"


    // $ANTLR start "rule__DimensionPrimary__Group_0__1__Impl"
    // InternalMeth.g:1492:1: rule__DimensionPrimary__Group_0__1__Impl : ( ruleDimensionMultiplikation ) ;
    public final void rule__DimensionPrimary__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1496:1: ( ( ruleDimensionMultiplikation ) )
            // InternalMeth.g:1497:1: ( ruleDimensionMultiplikation )
            {
            // InternalMeth.g:1497:1: ( ruleDimensionMultiplikation )
            // InternalMeth.g:1498:2: ruleDimensionMultiplikation
            {
             before(grammarAccess.getDimensionPrimaryAccess().getDimensionMultiplikationParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleDimensionMultiplikation();

            state._fsp--;

             after(grammarAccess.getDimensionPrimaryAccess().getDimensionMultiplikationParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionPrimary__Group_0__1__Impl"


    // $ANTLR start "rule__DimensionPrimary__Group_0__2"
    // InternalMeth.g:1507:1: rule__DimensionPrimary__Group_0__2 : rule__DimensionPrimary__Group_0__2__Impl ;
    public final void rule__DimensionPrimary__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1511:1: ( rule__DimensionPrimary__Group_0__2__Impl )
            // InternalMeth.g:1512:2: rule__DimensionPrimary__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DimensionPrimary__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionPrimary__Group_0__2"


    // $ANTLR start "rule__DimensionPrimary__Group_0__2__Impl"
    // InternalMeth.g:1518:1: rule__DimensionPrimary__Group_0__2__Impl : ( ')' ) ;
    public final void rule__DimensionPrimary__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1522:1: ( ( ')' ) )
            // InternalMeth.g:1523:1: ( ')' )
            {
            // InternalMeth.g:1523:1: ( ')' )
            // InternalMeth.g:1524:2: ')'
            {
             before(grammarAccess.getDimensionPrimaryAccess().getRightParenthesisKeyword_0_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDimensionPrimaryAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionPrimary__Group_0__2__Impl"


    // $ANTLR start "rule__Einheit__Group__0"
    // InternalMeth.g:1534:1: rule__Einheit__Group__0 : rule__Einheit__Group__0__Impl rule__Einheit__Group__1 ;
    public final void rule__Einheit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1538:1: ( rule__Einheit__Group__0__Impl rule__Einheit__Group__1 )
            // InternalMeth.g:1539:2: rule__Einheit__Group__0__Impl rule__Einheit__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Einheit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Einheit__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group__0"


    // $ANTLR start "rule__Einheit__Group__0__Impl"
    // InternalMeth.g:1546:1: rule__Einheit__Group__0__Impl : ( 'Einheit' ) ;
    public final void rule__Einheit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1550:1: ( ( 'Einheit' ) )
            // InternalMeth.g:1551:1: ( 'Einheit' )
            {
            // InternalMeth.g:1551:1: ( 'Einheit' )
            // InternalMeth.g:1552:2: 'Einheit'
            {
             before(grammarAccess.getEinheitAccess().getEinheitKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEinheitAccess().getEinheitKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group__0__Impl"


    // $ANTLR start "rule__Einheit__Group__1"
    // InternalMeth.g:1561:1: rule__Einheit__Group__1 : rule__Einheit__Group__1__Impl rule__Einheit__Group__2 ;
    public final void rule__Einheit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1565:1: ( rule__Einheit__Group__1__Impl rule__Einheit__Group__2 )
            // InternalMeth.g:1566:2: rule__Einheit__Group__1__Impl rule__Einheit__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Einheit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Einheit__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group__1"


    // $ANTLR start "rule__Einheit__Group__1__Impl"
    // InternalMeth.g:1573:1: rule__Einheit__Group__1__Impl : ( ( rule__Einheit__NameAssignment_1 ) ) ;
    public final void rule__Einheit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1577:1: ( ( ( rule__Einheit__NameAssignment_1 ) ) )
            // InternalMeth.g:1578:1: ( ( rule__Einheit__NameAssignment_1 ) )
            {
            // InternalMeth.g:1578:1: ( ( rule__Einheit__NameAssignment_1 ) )
            // InternalMeth.g:1579:2: ( rule__Einheit__NameAssignment_1 )
            {
             before(grammarAccess.getEinheitAccess().getNameAssignment_1()); 
            // InternalMeth.g:1580:2: ( rule__Einheit__NameAssignment_1 )
            // InternalMeth.g:1580:3: rule__Einheit__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Einheit__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEinheitAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group__1__Impl"


    // $ANTLR start "rule__Einheit__Group__2"
    // InternalMeth.g:1588:1: rule__Einheit__Group__2 : rule__Einheit__Group__2__Impl rule__Einheit__Group__3 ;
    public final void rule__Einheit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1592:1: ( rule__Einheit__Group__2__Impl rule__Einheit__Group__3 )
            // InternalMeth.g:1593:2: rule__Einheit__Group__2__Impl rule__Einheit__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Einheit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Einheit__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group__2"


    // $ANTLR start "rule__Einheit__Group__2__Impl"
    // InternalMeth.g:1600:1: rule__Einheit__Group__2__Impl : ( ( rule__Einheit__Alternatives_2 ) ) ;
    public final void rule__Einheit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1604:1: ( ( ( rule__Einheit__Alternatives_2 ) ) )
            // InternalMeth.g:1605:1: ( ( rule__Einheit__Alternatives_2 ) )
            {
            // InternalMeth.g:1605:1: ( ( rule__Einheit__Alternatives_2 ) )
            // InternalMeth.g:1606:2: ( rule__Einheit__Alternatives_2 )
            {
             before(grammarAccess.getEinheitAccess().getAlternatives_2()); 
            // InternalMeth.g:1607:2: ( rule__Einheit__Alternatives_2 )
            // InternalMeth.g:1607:3: rule__Einheit__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Einheit__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getEinheitAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group__2__Impl"


    // $ANTLR start "rule__Einheit__Group__3"
    // InternalMeth.g:1615:1: rule__Einheit__Group__3 : rule__Einheit__Group__3__Impl ;
    public final void rule__Einheit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1619:1: ( rule__Einheit__Group__3__Impl )
            // InternalMeth.g:1620:2: rule__Einheit__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Einheit__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group__3"


    // $ANTLR start "rule__Einheit__Group__3__Impl"
    // InternalMeth.g:1626:1: rule__Einheit__Group__3__Impl : ( ';' ) ;
    public final void rule__Einheit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1630:1: ( ( ';' ) )
            // InternalMeth.g:1631:1: ( ';' )
            {
            // InternalMeth.g:1631:1: ( ';' )
            // InternalMeth.g:1632:2: ';'
            {
             before(grammarAccess.getEinheitAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEinheitAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group__3__Impl"


    // $ANTLR start "rule__Einheit__Group_2_0__0"
    // InternalMeth.g:1642:1: rule__Einheit__Group_2_0__0 : rule__Einheit__Group_2_0__0__Impl rule__Einheit__Group_2_0__1 ;
    public final void rule__Einheit__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1646:1: ( rule__Einheit__Group_2_0__0__Impl rule__Einheit__Group_2_0__1 )
            // InternalMeth.g:1647:2: rule__Einheit__Group_2_0__0__Impl rule__Einheit__Group_2_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Einheit__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Einheit__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group_2_0__0"


    // $ANTLR start "rule__Einheit__Group_2_0__0__Impl"
    // InternalMeth.g:1654:1: rule__Einheit__Group_2_0__0__Impl : ( 'in' ) ;
    public final void rule__Einheit__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1658:1: ( ( 'in' ) )
            // InternalMeth.g:1659:1: ( 'in' )
            {
            // InternalMeth.g:1659:1: ( 'in' )
            // InternalMeth.g:1660:2: 'in'
            {
             before(grammarAccess.getEinheitAccess().getInKeyword_2_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getEinheitAccess().getInKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group_2_0__0__Impl"


    // $ANTLR start "rule__Einheit__Group_2_0__1"
    // InternalMeth.g:1669:1: rule__Einheit__Group_2_0__1 : rule__Einheit__Group_2_0__1__Impl ;
    public final void rule__Einheit__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1673:1: ( rule__Einheit__Group_2_0__1__Impl )
            // InternalMeth.g:1674:2: rule__Einheit__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Einheit__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group_2_0__1"


    // $ANTLR start "rule__Einheit__Group_2_0__1__Impl"
    // InternalMeth.g:1680:1: rule__Einheit__Group_2_0__1__Impl : ( ( rule__Einheit__RefAssignment_2_0_1 ) ) ;
    public final void rule__Einheit__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1684:1: ( ( ( rule__Einheit__RefAssignment_2_0_1 ) ) )
            // InternalMeth.g:1685:1: ( ( rule__Einheit__RefAssignment_2_0_1 ) )
            {
            // InternalMeth.g:1685:1: ( ( rule__Einheit__RefAssignment_2_0_1 ) )
            // InternalMeth.g:1686:2: ( rule__Einheit__RefAssignment_2_0_1 )
            {
             before(grammarAccess.getEinheitAccess().getRefAssignment_2_0_1()); 
            // InternalMeth.g:1687:2: ( rule__Einheit__RefAssignment_2_0_1 )
            // InternalMeth.g:1687:3: rule__Einheit__RefAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Einheit__RefAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getEinheitAccess().getRefAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group_2_0__1__Impl"


    // $ANTLR start "rule__Einheit__Group_2_1__0"
    // InternalMeth.g:1696:1: rule__Einheit__Group_2_1__0 : rule__Einheit__Group_2_1__0__Impl rule__Einheit__Group_2_1__1 ;
    public final void rule__Einheit__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1700:1: ( rule__Einheit__Group_2_1__0__Impl rule__Einheit__Group_2_1__1 )
            // InternalMeth.g:1701:2: rule__Einheit__Group_2_1__0__Impl rule__Einheit__Group_2_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Einheit__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Einheit__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group_2_1__0"


    // $ANTLR start "rule__Einheit__Group_2_1__0__Impl"
    // InternalMeth.g:1708:1: rule__Einheit__Group_2_1__0__Impl : ( '=' ) ;
    public final void rule__Einheit__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1712:1: ( ( '=' ) )
            // InternalMeth.g:1713:1: ( '=' )
            {
            // InternalMeth.g:1713:1: ( '=' )
            // InternalMeth.g:1714:2: '='
            {
             before(grammarAccess.getEinheitAccess().getEqualsSignKeyword_2_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEinheitAccess().getEqualsSignKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group_2_1__0__Impl"


    // $ANTLR start "rule__Einheit__Group_2_1__1"
    // InternalMeth.g:1723:1: rule__Einheit__Group_2_1__1 : rule__Einheit__Group_2_1__1__Impl rule__Einheit__Group_2_1__2 ;
    public final void rule__Einheit__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1727:1: ( rule__Einheit__Group_2_1__1__Impl rule__Einheit__Group_2_1__2 )
            // InternalMeth.g:1728:2: rule__Einheit__Group_2_1__1__Impl rule__Einheit__Group_2_1__2
            {
            pushFollow(FOLLOW_9);
            rule__Einheit__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Einheit__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group_2_1__1"


    // $ANTLR start "rule__Einheit__Group_2_1__1__Impl"
    // InternalMeth.g:1735:1: rule__Einheit__Group_2_1__1__Impl : ( ( rule__Einheit__FaktorAssignment_2_1_1 ) ) ;
    public final void rule__Einheit__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1739:1: ( ( ( rule__Einheit__FaktorAssignment_2_1_1 ) ) )
            // InternalMeth.g:1740:1: ( ( rule__Einheit__FaktorAssignment_2_1_1 ) )
            {
            // InternalMeth.g:1740:1: ( ( rule__Einheit__FaktorAssignment_2_1_1 ) )
            // InternalMeth.g:1741:2: ( rule__Einheit__FaktorAssignment_2_1_1 )
            {
             before(grammarAccess.getEinheitAccess().getFaktorAssignment_2_1_1()); 
            // InternalMeth.g:1742:2: ( rule__Einheit__FaktorAssignment_2_1_1 )
            // InternalMeth.g:1742:3: rule__Einheit__FaktorAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Einheit__FaktorAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEinheitAccess().getFaktorAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group_2_1__1__Impl"


    // $ANTLR start "rule__Einheit__Group_2_1__2"
    // InternalMeth.g:1750:1: rule__Einheit__Group_2_1__2 : rule__Einheit__Group_2_1__2__Impl ;
    public final void rule__Einheit__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1754:1: ( rule__Einheit__Group_2_1__2__Impl )
            // InternalMeth.g:1755:2: rule__Einheit__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Einheit__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group_2_1__2"


    // $ANTLR start "rule__Einheit__Group_2_1__2__Impl"
    // InternalMeth.g:1761:1: rule__Einheit__Group_2_1__2__Impl : ( ( rule__Einheit__BasiseinheitAssignment_2_1_2 )? ) ;
    public final void rule__Einheit__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1765:1: ( ( ( rule__Einheit__BasiseinheitAssignment_2_1_2 )? ) )
            // InternalMeth.g:1766:1: ( ( rule__Einheit__BasiseinheitAssignment_2_1_2 )? )
            {
            // InternalMeth.g:1766:1: ( ( rule__Einheit__BasiseinheitAssignment_2_1_2 )? )
            // InternalMeth.g:1767:2: ( rule__Einheit__BasiseinheitAssignment_2_1_2 )?
            {
             before(grammarAccess.getEinheitAccess().getBasiseinheitAssignment_2_1_2()); 
            // InternalMeth.g:1768:2: ( rule__Einheit__BasiseinheitAssignment_2_1_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMeth.g:1768:3: rule__Einheit__BasiseinheitAssignment_2_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Einheit__BasiseinheitAssignment_2_1_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEinheitAccess().getBasiseinheitAssignment_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__Group_2_1__2__Impl"


    // $ANTLR start "rule__Umrechnung__Group__0"
    // InternalMeth.g:1777:1: rule__Umrechnung__Group__0 : rule__Umrechnung__Group__0__Impl rule__Umrechnung__Group__1 ;
    public final void rule__Umrechnung__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1781:1: ( rule__Umrechnung__Group__0__Impl rule__Umrechnung__Group__1 )
            // InternalMeth.g:1782:2: rule__Umrechnung__Group__0__Impl rule__Umrechnung__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Umrechnung__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Umrechnung__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__0"


    // $ANTLR start "rule__Umrechnung__Group__0__Impl"
    // InternalMeth.g:1789:1: rule__Umrechnung__Group__0__Impl : ( 'Umrechnung' ) ;
    public final void rule__Umrechnung__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1793:1: ( ( 'Umrechnung' ) )
            // InternalMeth.g:1794:1: ( 'Umrechnung' )
            {
            // InternalMeth.g:1794:1: ( 'Umrechnung' )
            // InternalMeth.g:1795:2: 'Umrechnung'
            {
             before(grammarAccess.getUmrechnungAccess().getUmrechnungKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getUmrechnungAccess().getUmrechnungKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__0__Impl"


    // $ANTLR start "rule__Umrechnung__Group__1"
    // InternalMeth.g:1804:1: rule__Umrechnung__Group__1 : rule__Umrechnung__Group__1__Impl rule__Umrechnung__Group__2 ;
    public final void rule__Umrechnung__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1808:1: ( rule__Umrechnung__Group__1__Impl rule__Umrechnung__Group__2 )
            // InternalMeth.g:1809:2: rule__Umrechnung__Group__1__Impl rule__Umrechnung__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Umrechnung__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Umrechnung__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__1"


    // $ANTLR start "rule__Umrechnung__Group__1__Impl"
    // InternalMeth.g:1816:1: rule__Umrechnung__Group__1__Impl : ( ( rule__Umrechnung__VarnameAssignment_1 ) ) ;
    public final void rule__Umrechnung__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1820:1: ( ( ( rule__Umrechnung__VarnameAssignment_1 ) ) )
            // InternalMeth.g:1821:1: ( ( rule__Umrechnung__VarnameAssignment_1 ) )
            {
            // InternalMeth.g:1821:1: ( ( rule__Umrechnung__VarnameAssignment_1 ) )
            // InternalMeth.g:1822:2: ( rule__Umrechnung__VarnameAssignment_1 )
            {
             before(grammarAccess.getUmrechnungAccess().getVarnameAssignment_1()); 
            // InternalMeth.g:1823:2: ( rule__Umrechnung__VarnameAssignment_1 )
            // InternalMeth.g:1823:3: rule__Umrechnung__VarnameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Umrechnung__VarnameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUmrechnungAccess().getVarnameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__1__Impl"


    // $ANTLR start "rule__Umrechnung__Group__2"
    // InternalMeth.g:1831:1: rule__Umrechnung__Group__2 : rule__Umrechnung__Group__2__Impl rule__Umrechnung__Group__3 ;
    public final void rule__Umrechnung__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1835:1: ( rule__Umrechnung__Group__2__Impl rule__Umrechnung__Group__3 )
            // InternalMeth.g:1836:2: rule__Umrechnung__Group__2__Impl rule__Umrechnung__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Umrechnung__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Umrechnung__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__2"


    // $ANTLR start "rule__Umrechnung__Group__2__Impl"
    // InternalMeth.g:1843:1: rule__Umrechnung__Group__2__Impl : ( ( rule__Umrechnung__VonEinheitAssignment_2 ) ) ;
    public final void rule__Umrechnung__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1847:1: ( ( ( rule__Umrechnung__VonEinheitAssignment_2 ) ) )
            // InternalMeth.g:1848:1: ( ( rule__Umrechnung__VonEinheitAssignment_2 ) )
            {
            // InternalMeth.g:1848:1: ( ( rule__Umrechnung__VonEinheitAssignment_2 ) )
            // InternalMeth.g:1849:2: ( rule__Umrechnung__VonEinheitAssignment_2 )
            {
             before(grammarAccess.getUmrechnungAccess().getVonEinheitAssignment_2()); 
            // InternalMeth.g:1850:2: ( rule__Umrechnung__VonEinheitAssignment_2 )
            // InternalMeth.g:1850:3: rule__Umrechnung__VonEinheitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Umrechnung__VonEinheitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getUmrechnungAccess().getVonEinheitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__2__Impl"


    // $ANTLR start "rule__Umrechnung__Group__3"
    // InternalMeth.g:1858:1: rule__Umrechnung__Group__3 : rule__Umrechnung__Group__3__Impl rule__Umrechnung__Group__4 ;
    public final void rule__Umrechnung__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1862:1: ( rule__Umrechnung__Group__3__Impl rule__Umrechnung__Group__4 )
            // InternalMeth.g:1863:2: rule__Umrechnung__Group__3__Impl rule__Umrechnung__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Umrechnung__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Umrechnung__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__3"


    // $ANTLR start "rule__Umrechnung__Group__3__Impl"
    // InternalMeth.g:1870:1: rule__Umrechnung__Group__3__Impl : ( '=' ) ;
    public final void rule__Umrechnung__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1874:1: ( ( '=' ) )
            // InternalMeth.g:1875:1: ( '=' )
            {
            // InternalMeth.g:1875:1: ( '=' )
            // InternalMeth.g:1876:2: '='
            {
             before(grammarAccess.getUmrechnungAccess().getEqualsSignKeyword_3()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getUmrechnungAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__3__Impl"


    // $ANTLR start "rule__Umrechnung__Group__4"
    // InternalMeth.g:1885:1: rule__Umrechnung__Group__4 : rule__Umrechnung__Group__4__Impl rule__Umrechnung__Group__5 ;
    public final void rule__Umrechnung__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1889:1: ( rule__Umrechnung__Group__4__Impl rule__Umrechnung__Group__5 )
            // InternalMeth.g:1890:2: rule__Umrechnung__Group__4__Impl rule__Umrechnung__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Umrechnung__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Umrechnung__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__4"


    // $ANTLR start "rule__Umrechnung__Group__4__Impl"
    // InternalMeth.g:1897:1: rule__Umrechnung__Group__4__Impl : ( ( rule__Umrechnung__AusdruckAssignment_4 ) ) ;
    public final void rule__Umrechnung__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1901:1: ( ( ( rule__Umrechnung__AusdruckAssignment_4 ) ) )
            // InternalMeth.g:1902:1: ( ( rule__Umrechnung__AusdruckAssignment_4 ) )
            {
            // InternalMeth.g:1902:1: ( ( rule__Umrechnung__AusdruckAssignment_4 ) )
            // InternalMeth.g:1903:2: ( rule__Umrechnung__AusdruckAssignment_4 )
            {
             before(grammarAccess.getUmrechnungAccess().getAusdruckAssignment_4()); 
            // InternalMeth.g:1904:2: ( rule__Umrechnung__AusdruckAssignment_4 )
            // InternalMeth.g:1904:3: rule__Umrechnung__AusdruckAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Umrechnung__AusdruckAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getUmrechnungAccess().getAusdruckAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__4__Impl"


    // $ANTLR start "rule__Umrechnung__Group__5"
    // InternalMeth.g:1912:1: rule__Umrechnung__Group__5 : rule__Umrechnung__Group__5__Impl rule__Umrechnung__Group__6 ;
    public final void rule__Umrechnung__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1916:1: ( rule__Umrechnung__Group__5__Impl rule__Umrechnung__Group__6 )
            // InternalMeth.g:1917:2: rule__Umrechnung__Group__5__Impl rule__Umrechnung__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Umrechnung__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Umrechnung__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__5"


    // $ANTLR start "rule__Umrechnung__Group__5__Impl"
    // InternalMeth.g:1924:1: rule__Umrechnung__Group__5__Impl : ( ( rule__Umrechnung__NachEinheitAssignment_5 ) ) ;
    public final void rule__Umrechnung__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1928:1: ( ( ( rule__Umrechnung__NachEinheitAssignment_5 ) ) )
            // InternalMeth.g:1929:1: ( ( rule__Umrechnung__NachEinheitAssignment_5 ) )
            {
            // InternalMeth.g:1929:1: ( ( rule__Umrechnung__NachEinheitAssignment_5 ) )
            // InternalMeth.g:1930:2: ( rule__Umrechnung__NachEinheitAssignment_5 )
            {
             before(grammarAccess.getUmrechnungAccess().getNachEinheitAssignment_5()); 
            // InternalMeth.g:1931:2: ( rule__Umrechnung__NachEinheitAssignment_5 )
            // InternalMeth.g:1931:3: rule__Umrechnung__NachEinheitAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Umrechnung__NachEinheitAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getUmrechnungAccess().getNachEinheitAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__5__Impl"


    // $ANTLR start "rule__Umrechnung__Group__6"
    // InternalMeth.g:1939:1: rule__Umrechnung__Group__6 : rule__Umrechnung__Group__6__Impl ;
    public final void rule__Umrechnung__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1943:1: ( rule__Umrechnung__Group__6__Impl )
            // InternalMeth.g:1944:2: rule__Umrechnung__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Umrechnung__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__6"


    // $ANTLR start "rule__Umrechnung__Group__6__Impl"
    // InternalMeth.g:1950:1: rule__Umrechnung__Group__6__Impl : ( ';' ) ;
    public final void rule__Umrechnung__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1954:1: ( ( ';' ) )
            // InternalMeth.g:1955:1: ( ';' )
            {
            // InternalMeth.g:1955:1: ( ';' )
            // InternalMeth.g:1956:2: ';'
            {
             before(grammarAccess.getUmrechnungAccess().getSemicolonKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getUmrechnungAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__Group__6__Impl"


    // $ANTLR start "rule__Konstante__Group__0"
    // InternalMeth.g:1966:1: rule__Konstante__Group__0 : rule__Konstante__Group__0__Impl rule__Konstante__Group__1 ;
    public final void rule__Konstante__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1970:1: ( rule__Konstante__Group__0__Impl rule__Konstante__Group__1 )
            // InternalMeth.g:1971:2: rule__Konstante__Group__0__Impl rule__Konstante__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Konstante__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Konstante__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Konstante__Group__0"


    // $ANTLR start "rule__Konstante__Group__0__Impl"
    // InternalMeth.g:1978:1: rule__Konstante__Group__0__Impl : ( 'Konstante' ) ;
    public final void rule__Konstante__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1982:1: ( ( 'Konstante' ) )
            // InternalMeth.g:1983:1: ( 'Konstante' )
            {
            // InternalMeth.g:1983:1: ( 'Konstante' )
            // InternalMeth.g:1984:2: 'Konstante'
            {
             before(grammarAccess.getKonstanteAccess().getKonstanteKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getKonstanteAccess().getKonstanteKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Konstante__Group__0__Impl"


    // $ANTLR start "rule__Konstante__Group__1"
    // InternalMeth.g:1993:1: rule__Konstante__Group__1 : rule__Konstante__Group__1__Impl rule__Konstante__Group__2 ;
    public final void rule__Konstante__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:1997:1: ( rule__Konstante__Group__1__Impl rule__Konstante__Group__2 )
            // InternalMeth.g:1998:2: rule__Konstante__Group__1__Impl rule__Konstante__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Konstante__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Konstante__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Konstante__Group__1"


    // $ANTLR start "rule__Konstante__Group__1__Impl"
    // InternalMeth.g:2005:1: rule__Konstante__Group__1__Impl : ( ( rule__Konstante__NameAssignment_1 ) ) ;
    public final void rule__Konstante__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2009:1: ( ( ( rule__Konstante__NameAssignment_1 ) ) )
            // InternalMeth.g:2010:1: ( ( rule__Konstante__NameAssignment_1 ) )
            {
            // InternalMeth.g:2010:1: ( ( rule__Konstante__NameAssignment_1 ) )
            // InternalMeth.g:2011:2: ( rule__Konstante__NameAssignment_1 )
            {
             before(grammarAccess.getKonstanteAccess().getNameAssignment_1()); 
            // InternalMeth.g:2012:2: ( rule__Konstante__NameAssignment_1 )
            // InternalMeth.g:2012:3: rule__Konstante__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Konstante__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKonstanteAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Konstante__Group__1__Impl"


    // $ANTLR start "rule__Konstante__Group__2"
    // InternalMeth.g:2020:1: rule__Konstante__Group__2 : rule__Konstante__Group__2__Impl rule__Konstante__Group__3 ;
    public final void rule__Konstante__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2024:1: ( rule__Konstante__Group__2__Impl rule__Konstante__Group__3 )
            // InternalMeth.g:2025:2: rule__Konstante__Group__2__Impl rule__Konstante__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Konstante__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Konstante__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Konstante__Group__2"


    // $ANTLR start "rule__Konstante__Group__2__Impl"
    // InternalMeth.g:2032:1: rule__Konstante__Group__2__Impl : ( '=' ) ;
    public final void rule__Konstante__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2036:1: ( ( '=' ) )
            // InternalMeth.g:2037:1: ( '=' )
            {
            // InternalMeth.g:2037:1: ( '=' )
            // InternalMeth.g:2038:2: '='
            {
             before(grammarAccess.getKonstanteAccess().getEqualsSignKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getKonstanteAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Konstante__Group__2__Impl"


    // $ANTLR start "rule__Konstante__Group__3"
    // InternalMeth.g:2047:1: rule__Konstante__Group__3 : rule__Konstante__Group__3__Impl rule__Konstante__Group__4 ;
    public final void rule__Konstante__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2051:1: ( rule__Konstante__Group__3__Impl rule__Konstante__Group__4 )
            // InternalMeth.g:2052:2: rule__Konstante__Group__3__Impl rule__Konstante__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Konstante__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Konstante__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Konstante__Group__3"


    // $ANTLR start "rule__Konstante__Group__3__Impl"
    // InternalMeth.g:2059:1: rule__Konstante__Group__3__Impl : ( ( rule__Konstante__AusdruckAssignment_3 ) ) ;
    public final void rule__Konstante__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2063:1: ( ( ( rule__Konstante__AusdruckAssignment_3 ) ) )
            // InternalMeth.g:2064:1: ( ( rule__Konstante__AusdruckAssignment_3 ) )
            {
            // InternalMeth.g:2064:1: ( ( rule__Konstante__AusdruckAssignment_3 ) )
            // InternalMeth.g:2065:2: ( rule__Konstante__AusdruckAssignment_3 )
            {
             before(grammarAccess.getKonstanteAccess().getAusdruckAssignment_3()); 
            // InternalMeth.g:2066:2: ( rule__Konstante__AusdruckAssignment_3 )
            // InternalMeth.g:2066:3: rule__Konstante__AusdruckAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Konstante__AusdruckAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getKonstanteAccess().getAusdruckAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Konstante__Group__3__Impl"


    // $ANTLR start "rule__Konstante__Group__4"
    // InternalMeth.g:2074:1: rule__Konstante__Group__4 : rule__Konstante__Group__4__Impl ;
    public final void rule__Konstante__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2078:1: ( rule__Konstante__Group__4__Impl )
            // InternalMeth.g:2079:2: rule__Konstante__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Konstante__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Konstante__Group__4"


    // $ANTLR start "rule__Konstante__Group__4__Impl"
    // InternalMeth.g:2085:1: rule__Konstante__Group__4__Impl : ( ';' ) ;
    public final void rule__Konstante__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2089:1: ( ( ';' ) )
            // InternalMeth.g:2090:1: ( ';' )
            {
            // InternalMeth.g:2090:1: ( ';' )
            // InternalMeth.g:2091:2: ';'
            {
             before(grammarAccess.getKonstanteAccess().getSemicolonKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getKonstanteAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Konstante__Group__4__Impl"


    // $ANTLR start "rule__EinheitAddition__Group__0"
    // InternalMeth.g:2101:1: rule__EinheitAddition__Group__0 : rule__EinheitAddition__Group__0__Impl rule__EinheitAddition__Group__1 ;
    public final void rule__EinheitAddition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2105:1: ( rule__EinheitAddition__Group__0__Impl rule__EinheitAddition__Group__1 )
            // InternalMeth.g:2106:2: rule__EinheitAddition__Group__0__Impl rule__EinheitAddition__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__EinheitAddition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EinheitAddition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitAddition__Group__0"


    // $ANTLR start "rule__EinheitAddition__Group__0__Impl"
    // InternalMeth.g:2113:1: rule__EinheitAddition__Group__0__Impl : ( ruleEinheitMultiplikation ) ;
    public final void rule__EinheitAddition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2117:1: ( ( ruleEinheitMultiplikation ) )
            // InternalMeth.g:2118:1: ( ruleEinheitMultiplikation )
            {
            // InternalMeth.g:2118:1: ( ruleEinheitMultiplikation )
            // InternalMeth.g:2119:2: ruleEinheitMultiplikation
            {
             before(grammarAccess.getEinheitAdditionAccess().getEinheitMultiplikationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEinheitMultiplikation();

            state._fsp--;

             after(grammarAccess.getEinheitAdditionAccess().getEinheitMultiplikationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitAddition__Group__0__Impl"


    // $ANTLR start "rule__EinheitAddition__Group__1"
    // InternalMeth.g:2128:1: rule__EinheitAddition__Group__1 : rule__EinheitAddition__Group__1__Impl ;
    public final void rule__EinheitAddition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2132:1: ( rule__EinheitAddition__Group__1__Impl )
            // InternalMeth.g:2133:2: rule__EinheitAddition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EinheitAddition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitAddition__Group__1"


    // $ANTLR start "rule__EinheitAddition__Group__1__Impl"
    // InternalMeth.g:2139:1: rule__EinheitAddition__Group__1__Impl : ( ( rule__EinheitAddition__Group_1__0 )* ) ;
    public final void rule__EinheitAddition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2143:1: ( ( ( rule__EinheitAddition__Group_1__0 )* ) )
            // InternalMeth.g:2144:1: ( ( rule__EinheitAddition__Group_1__0 )* )
            {
            // InternalMeth.g:2144:1: ( ( rule__EinheitAddition__Group_1__0 )* )
            // InternalMeth.g:2145:2: ( rule__EinheitAddition__Group_1__0 )*
            {
             before(grammarAccess.getEinheitAdditionAccess().getGroup_1()); 
            // InternalMeth.g:2146:2: ( rule__EinheitAddition__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=15 && LA16_0<=16)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMeth.g:2146:3: rule__EinheitAddition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__EinheitAddition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getEinheitAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitAddition__Group__1__Impl"


    // $ANTLR start "rule__EinheitAddition__Group_1__0"
    // InternalMeth.g:2155:1: rule__EinheitAddition__Group_1__0 : rule__EinheitAddition__Group_1__0__Impl rule__EinheitAddition__Group_1__1 ;
    public final void rule__EinheitAddition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2159:1: ( rule__EinheitAddition__Group_1__0__Impl rule__EinheitAddition__Group_1__1 )
            // InternalMeth.g:2160:2: rule__EinheitAddition__Group_1__0__Impl rule__EinheitAddition__Group_1__1
            {
            pushFollow(FOLLOW_19);
            rule__EinheitAddition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EinheitAddition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitAddition__Group_1__0"


    // $ANTLR start "rule__EinheitAddition__Group_1__0__Impl"
    // InternalMeth.g:2167:1: rule__EinheitAddition__Group_1__0__Impl : ( () ) ;
    public final void rule__EinheitAddition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2171:1: ( ( () ) )
            // InternalMeth.g:2172:1: ( () )
            {
            // InternalMeth.g:2172:1: ( () )
            // InternalMeth.g:2173:2: ()
            {
             before(grammarAccess.getEinheitAdditionAccess().getEinheitAdditionLinksAction_1_0()); 
            // InternalMeth.g:2174:2: ()
            // InternalMeth.g:2174:3: 
            {
            }

             after(grammarAccess.getEinheitAdditionAccess().getEinheitAdditionLinksAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitAddition__Group_1__0__Impl"


    // $ANTLR start "rule__EinheitAddition__Group_1__1"
    // InternalMeth.g:2182:1: rule__EinheitAddition__Group_1__1 : rule__EinheitAddition__Group_1__1__Impl rule__EinheitAddition__Group_1__2 ;
    public final void rule__EinheitAddition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2186:1: ( rule__EinheitAddition__Group_1__1__Impl rule__EinheitAddition__Group_1__2 )
            // InternalMeth.g:2187:2: rule__EinheitAddition__Group_1__1__Impl rule__EinheitAddition__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__EinheitAddition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EinheitAddition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitAddition__Group_1__1"


    // $ANTLR start "rule__EinheitAddition__Group_1__1__Impl"
    // InternalMeth.g:2194:1: rule__EinheitAddition__Group_1__1__Impl : ( ( rule__EinheitAddition__OperatorAssignment_1_1 ) ) ;
    public final void rule__EinheitAddition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2198:1: ( ( ( rule__EinheitAddition__OperatorAssignment_1_1 ) ) )
            // InternalMeth.g:2199:1: ( ( rule__EinheitAddition__OperatorAssignment_1_1 ) )
            {
            // InternalMeth.g:2199:1: ( ( rule__EinheitAddition__OperatorAssignment_1_1 ) )
            // InternalMeth.g:2200:2: ( rule__EinheitAddition__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEinheitAdditionAccess().getOperatorAssignment_1_1()); 
            // InternalMeth.g:2201:2: ( rule__EinheitAddition__OperatorAssignment_1_1 )
            // InternalMeth.g:2201:3: rule__EinheitAddition__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EinheitAddition__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEinheitAdditionAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitAddition__Group_1__1__Impl"


    // $ANTLR start "rule__EinheitAddition__Group_1__2"
    // InternalMeth.g:2209:1: rule__EinheitAddition__Group_1__2 : rule__EinheitAddition__Group_1__2__Impl ;
    public final void rule__EinheitAddition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2213:1: ( rule__EinheitAddition__Group_1__2__Impl )
            // InternalMeth.g:2214:2: rule__EinheitAddition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EinheitAddition__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitAddition__Group_1__2"


    // $ANTLR start "rule__EinheitAddition__Group_1__2__Impl"
    // InternalMeth.g:2220:1: rule__EinheitAddition__Group_1__2__Impl : ( ( rule__EinheitAddition__RechtsAssignment_1_2 ) ) ;
    public final void rule__EinheitAddition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2224:1: ( ( ( rule__EinheitAddition__RechtsAssignment_1_2 ) ) )
            // InternalMeth.g:2225:1: ( ( rule__EinheitAddition__RechtsAssignment_1_2 ) )
            {
            // InternalMeth.g:2225:1: ( ( rule__EinheitAddition__RechtsAssignment_1_2 ) )
            // InternalMeth.g:2226:2: ( rule__EinheitAddition__RechtsAssignment_1_2 )
            {
             before(grammarAccess.getEinheitAdditionAccess().getRechtsAssignment_1_2()); 
            // InternalMeth.g:2227:2: ( rule__EinheitAddition__RechtsAssignment_1_2 )
            // InternalMeth.g:2227:3: rule__EinheitAddition__RechtsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EinheitAddition__RechtsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEinheitAdditionAccess().getRechtsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitAddition__Group_1__2__Impl"


    // $ANTLR start "rule__EinheitMultiplikation__Group__0"
    // InternalMeth.g:2236:1: rule__EinheitMultiplikation__Group__0 : rule__EinheitMultiplikation__Group__0__Impl rule__EinheitMultiplikation__Group__1 ;
    public final void rule__EinheitMultiplikation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2240:1: ( rule__EinheitMultiplikation__Group__0__Impl rule__EinheitMultiplikation__Group__1 )
            // InternalMeth.g:2241:2: rule__EinheitMultiplikation__Group__0__Impl rule__EinheitMultiplikation__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__EinheitMultiplikation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EinheitMultiplikation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitMultiplikation__Group__0"


    // $ANTLR start "rule__EinheitMultiplikation__Group__0__Impl"
    // InternalMeth.g:2248:1: rule__EinheitMultiplikation__Group__0__Impl : ( ruleEinheitPrimary ) ;
    public final void rule__EinheitMultiplikation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2252:1: ( ( ruleEinheitPrimary ) )
            // InternalMeth.g:2253:1: ( ruleEinheitPrimary )
            {
            // InternalMeth.g:2253:1: ( ruleEinheitPrimary )
            // InternalMeth.g:2254:2: ruleEinheitPrimary
            {
             before(grammarAccess.getEinheitMultiplikationAccess().getEinheitPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEinheitPrimary();

            state._fsp--;

             after(grammarAccess.getEinheitMultiplikationAccess().getEinheitPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitMultiplikation__Group__0__Impl"


    // $ANTLR start "rule__EinheitMultiplikation__Group__1"
    // InternalMeth.g:2263:1: rule__EinheitMultiplikation__Group__1 : rule__EinheitMultiplikation__Group__1__Impl ;
    public final void rule__EinheitMultiplikation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2267:1: ( rule__EinheitMultiplikation__Group__1__Impl )
            // InternalMeth.g:2268:2: rule__EinheitMultiplikation__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EinheitMultiplikation__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitMultiplikation__Group__1"


    // $ANTLR start "rule__EinheitMultiplikation__Group__1__Impl"
    // InternalMeth.g:2274:1: rule__EinheitMultiplikation__Group__1__Impl : ( ( rule__EinheitMultiplikation__Group_1__0 )* ) ;
    public final void rule__EinheitMultiplikation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2278:1: ( ( ( rule__EinheitMultiplikation__Group_1__0 )* ) )
            // InternalMeth.g:2279:1: ( ( rule__EinheitMultiplikation__Group_1__0 )* )
            {
            // InternalMeth.g:2279:1: ( ( rule__EinheitMultiplikation__Group_1__0 )* )
            // InternalMeth.g:2280:2: ( rule__EinheitMultiplikation__Group_1__0 )*
            {
             before(grammarAccess.getEinheitMultiplikationAccess().getGroup_1()); 
            // InternalMeth.g:2281:2: ( rule__EinheitMultiplikation__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=13 && LA17_0<=14)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMeth.g:2281:3: rule__EinheitMultiplikation__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__EinheitMultiplikation__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getEinheitMultiplikationAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitMultiplikation__Group__1__Impl"


    // $ANTLR start "rule__EinheitMultiplikation__Group_1__0"
    // InternalMeth.g:2290:1: rule__EinheitMultiplikation__Group_1__0 : rule__EinheitMultiplikation__Group_1__0__Impl rule__EinheitMultiplikation__Group_1__1 ;
    public final void rule__EinheitMultiplikation__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2294:1: ( rule__EinheitMultiplikation__Group_1__0__Impl rule__EinheitMultiplikation__Group_1__1 )
            // InternalMeth.g:2295:2: rule__EinheitMultiplikation__Group_1__0__Impl rule__EinheitMultiplikation__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__EinheitMultiplikation__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EinheitMultiplikation__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitMultiplikation__Group_1__0"


    // $ANTLR start "rule__EinheitMultiplikation__Group_1__0__Impl"
    // InternalMeth.g:2302:1: rule__EinheitMultiplikation__Group_1__0__Impl : ( () ) ;
    public final void rule__EinheitMultiplikation__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2306:1: ( ( () ) )
            // InternalMeth.g:2307:1: ( () )
            {
            // InternalMeth.g:2307:1: ( () )
            // InternalMeth.g:2308:2: ()
            {
             before(grammarAccess.getEinheitMultiplikationAccess().getEinheitMultiplikationLinksAction_1_0()); 
            // InternalMeth.g:2309:2: ()
            // InternalMeth.g:2309:3: 
            {
            }

             after(grammarAccess.getEinheitMultiplikationAccess().getEinheitMultiplikationLinksAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitMultiplikation__Group_1__0__Impl"


    // $ANTLR start "rule__EinheitMultiplikation__Group_1__1"
    // InternalMeth.g:2317:1: rule__EinheitMultiplikation__Group_1__1 : rule__EinheitMultiplikation__Group_1__1__Impl rule__EinheitMultiplikation__Group_1__2 ;
    public final void rule__EinheitMultiplikation__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2321:1: ( rule__EinheitMultiplikation__Group_1__1__Impl rule__EinheitMultiplikation__Group_1__2 )
            // InternalMeth.g:2322:2: rule__EinheitMultiplikation__Group_1__1__Impl rule__EinheitMultiplikation__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__EinheitMultiplikation__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EinheitMultiplikation__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitMultiplikation__Group_1__1"


    // $ANTLR start "rule__EinheitMultiplikation__Group_1__1__Impl"
    // InternalMeth.g:2329:1: rule__EinheitMultiplikation__Group_1__1__Impl : ( ( rule__EinheitMultiplikation__OperatorAssignment_1_1 ) ) ;
    public final void rule__EinheitMultiplikation__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2333:1: ( ( ( rule__EinheitMultiplikation__OperatorAssignment_1_1 ) ) )
            // InternalMeth.g:2334:1: ( ( rule__EinheitMultiplikation__OperatorAssignment_1_1 ) )
            {
            // InternalMeth.g:2334:1: ( ( rule__EinheitMultiplikation__OperatorAssignment_1_1 ) )
            // InternalMeth.g:2335:2: ( rule__EinheitMultiplikation__OperatorAssignment_1_1 )
            {
             before(grammarAccess.getEinheitMultiplikationAccess().getOperatorAssignment_1_1()); 
            // InternalMeth.g:2336:2: ( rule__EinheitMultiplikation__OperatorAssignment_1_1 )
            // InternalMeth.g:2336:3: rule__EinheitMultiplikation__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EinheitMultiplikation__OperatorAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEinheitMultiplikationAccess().getOperatorAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitMultiplikation__Group_1__1__Impl"


    // $ANTLR start "rule__EinheitMultiplikation__Group_1__2"
    // InternalMeth.g:2344:1: rule__EinheitMultiplikation__Group_1__2 : rule__EinheitMultiplikation__Group_1__2__Impl ;
    public final void rule__EinheitMultiplikation__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2348:1: ( rule__EinheitMultiplikation__Group_1__2__Impl )
            // InternalMeth.g:2349:2: rule__EinheitMultiplikation__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EinheitMultiplikation__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitMultiplikation__Group_1__2"


    // $ANTLR start "rule__EinheitMultiplikation__Group_1__2__Impl"
    // InternalMeth.g:2355:1: rule__EinheitMultiplikation__Group_1__2__Impl : ( ( rule__EinheitMultiplikation__RechtsAssignment_1_2 ) ) ;
    public final void rule__EinheitMultiplikation__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2359:1: ( ( ( rule__EinheitMultiplikation__RechtsAssignment_1_2 ) ) )
            // InternalMeth.g:2360:1: ( ( rule__EinheitMultiplikation__RechtsAssignment_1_2 ) )
            {
            // InternalMeth.g:2360:1: ( ( rule__EinheitMultiplikation__RechtsAssignment_1_2 ) )
            // InternalMeth.g:2361:2: ( rule__EinheitMultiplikation__RechtsAssignment_1_2 )
            {
             before(grammarAccess.getEinheitMultiplikationAccess().getRechtsAssignment_1_2()); 
            // InternalMeth.g:2362:2: ( rule__EinheitMultiplikation__RechtsAssignment_1_2 )
            // InternalMeth.g:2362:3: rule__EinheitMultiplikation__RechtsAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EinheitMultiplikation__RechtsAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEinheitMultiplikationAccess().getRechtsAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitMultiplikation__Group_1__2__Impl"


    // $ANTLR start "rule__EinheitPrimary__Group_2__0"
    // InternalMeth.g:2371:1: rule__EinheitPrimary__Group_2__0 : rule__EinheitPrimary__Group_2__0__Impl rule__EinheitPrimary__Group_2__1 ;
    public final void rule__EinheitPrimary__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2375:1: ( rule__EinheitPrimary__Group_2__0__Impl rule__EinheitPrimary__Group_2__1 )
            // InternalMeth.g:2376:2: rule__EinheitPrimary__Group_2__0__Impl rule__EinheitPrimary__Group_2__1
            {
            pushFollow(FOLLOW_17);
            rule__EinheitPrimary__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EinheitPrimary__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitPrimary__Group_2__0"


    // $ANTLR start "rule__EinheitPrimary__Group_2__0__Impl"
    // InternalMeth.g:2383:1: rule__EinheitPrimary__Group_2__0__Impl : ( '(' ) ;
    public final void rule__EinheitPrimary__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2387:1: ( ( '(' ) )
            // InternalMeth.g:2388:1: ( '(' )
            {
            // InternalMeth.g:2388:1: ( '(' )
            // InternalMeth.g:2389:2: '('
            {
             before(grammarAccess.getEinheitPrimaryAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEinheitPrimaryAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitPrimary__Group_2__0__Impl"


    // $ANTLR start "rule__EinheitPrimary__Group_2__1"
    // InternalMeth.g:2398:1: rule__EinheitPrimary__Group_2__1 : rule__EinheitPrimary__Group_2__1__Impl rule__EinheitPrimary__Group_2__2 ;
    public final void rule__EinheitPrimary__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2402:1: ( rule__EinheitPrimary__Group_2__1__Impl rule__EinheitPrimary__Group_2__2 )
            // InternalMeth.g:2403:2: rule__EinheitPrimary__Group_2__1__Impl rule__EinheitPrimary__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__EinheitPrimary__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EinheitPrimary__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitPrimary__Group_2__1"


    // $ANTLR start "rule__EinheitPrimary__Group_2__1__Impl"
    // InternalMeth.g:2410:1: rule__EinheitPrimary__Group_2__1__Impl : ( ruleEinheitAddition ) ;
    public final void rule__EinheitPrimary__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2414:1: ( ( ruleEinheitAddition ) )
            // InternalMeth.g:2415:1: ( ruleEinheitAddition )
            {
            // InternalMeth.g:2415:1: ( ruleEinheitAddition )
            // InternalMeth.g:2416:2: ruleEinheitAddition
            {
             before(grammarAccess.getEinheitPrimaryAccess().getEinheitAdditionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleEinheitAddition();

            state._fsp--;

             after(grammarAccess.getEinheitPrimaryAccess().getEinheitAdditionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitPrimary__Group_2__1__Impl"


    // $ANTLR start "rule__EinheitPrimary__Group_2__2"
    // InternalMeth.g:2425:1: rule__EinheitPrimary__Group_2__2 : rule__EinheitPrimary__Group_2__2__Impl ;
    public final void rule__EinheitPrimary__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2429:1: ( rule__EinheitPrimary__Group_2__2__Impl )
            // InternalMeth.g:2430:2: rule__EinheitPrimary__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EinheitPrimary__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitPrimary__Group_2__2"


    // $ANTLR start "rule__EinheitPrimary__Group_2__2__Impl"
    // InternalMeth.g:2436:1: rule__EinheitPrimary__Group_2__2__Impl : ( ')' ) ;
    public final void rule__EinheitPrimary__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2440:1: ( ( ')' ) )
            // InternalMeth.g:2441:1: ( ')' )
            {
            // InternalMeth.g:2441:1: ( ')' )
            // InternalMeth.g:2442:2: ')'
            {
             before(grammarAccess.getEinheitPrimaryAccess().getRightParenthesisKeyword_2_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEinheitPrimaryAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitPrimary__Group_2__2__Impl"


    // $ANTLR start "rule__Methode__Group__0"
    // InternalMeth.g:2452:1: rule__Methode__Group__0 : rule__Methode__Group__0__Impl rule__Methode__Group__1 ;
    public final void rule__Methode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2456:1: ( rule__Methode__Group__0__Impl rule__Methode__Group__1 )
            // InternalMeth.g:2457:2: rule__Methode__Group__0__Impl rule__Methode__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Methode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__0"


    // $ANTLR start "rule__Methode__Group__0__Impl"
    // InternalMeth.g:2464:1: rule__Methode__Group__0__Impl : ( 'Methode' ) ;
    public final void rule__Methode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2468:1: ( ( 'Methode' ) )
            // InternalMeth.g:2469:1: ( 'Methode' )
            {
            // InternalMeth.g:2469:1: ( 'Methode' )
            // InternalMeth.g:2470:2: 'Methode'
            {
             before(grammarAccess.getMethodeAccess().getMethodeKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getMethodeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__0__Impl"


    // $ANTLR start "rule__Methode__Group__1"
    // InternalMeth.g:2479:1: rule__Methode__Group__1 : rule__Methode__Group__1__Impl rule__Methode__Group__2 ;
    public final void rule__Methode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2483:1: ( rule__Methode__Group__1__Impl rule__Methode__Group__2 )
            // InternalMeth.g:2484:2: rule__Methode__Group__1__Impl rule__Methode__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Methode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__1"


    // $ANTLR start "rule__Methode__Group__1__Impl"
    // InternalMeth.g:2491:1: rule__Methode__Group__1__Impl : ( ( rule__Methode__NameAssignment_1 ) ) ;
    public final void rule__Methode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2495:1: ( ( ( rule__Methode__NameAssignment_1 ) ) )
            // InternalMeth.g:2496:1: ( ( rule__Methode__NameAssignment_1 ) )
            {
            // InternalMeth.g:2496:1: ( ( rule__Methode__NameAssignment_1 ) )
            // InternalMeth.g:2497:2: ( rule__Methode__NameAssignment_1 )
            {
             before(grammarAccess.getMethodeAccess().getNameAssignment_1()); 
            // InternalMeth.g:2498:2: ( rule__Methode__NameAssignment_1 )
            // InternalMeth.g:2498:3: rule__Methode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Methode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__1__Impl"


    // $ANTLR start "rule__Methode__Group__2"
    // InternalMeth.g:2506:1: rule__Methode__Group__2 : rule__Methode__Group__2__Impl rule__Methode__Group__3 ;
    public final void rule__Methode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2510:1: ( rule__Methode__Group__2__Impl rule__Methode__Group__3 )
            // InternalMeth.g:2511:2: rule__Methode__Group__2__Impl rule__Methode__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Methode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__2"


    // $ANTLR start "rule__Methode__Group__2__Impl"
    // InternalMeth.g:2518:1: rule__Methode__Group__2__Impl : ( 'als' ) ;
    public final void rule__Methode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2522:1: ( ( 'als' ) )
            // InternalMeth.g:2523:1: ( 'als' )
            {
            // InternalMeth.g:2523:1: ( 'als' )
            // InternalMeth.g:2524:2: 'als'
            {
             before(grammarAccess.getMethodeAccess().getAlsKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getAlsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__2__Impl"


    // $ANTLR start "rule__Methode__Group__3"
    // InternalMeth.g:2533:1: rule__Methode__Group__3 : rule__Methode__Group__3__Impl rule__Methode__Group__4 ;
    public final void rule__Methode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2537:1: ( rule__Methode__Group__3__Impl rule__Methode__Group__4 )
            // InternalMeth.g:2538:2: rule__Methode__Group__3__Impl rule__Methode__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Methode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__3"


    // $ANTLR start "rule__Methode__Group__3__Impl"
    // InternalMeth.g:2545:1: rule__Methode__Group__3__Impl : ( ( rule__Methode__BezeichnungAssignment_3 ) ) ;
    public final void rule__Methode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2549:1: ( ( ( rule__Methode__BezeichnungAssignment_3 ) ) )
            // InternalMeth.g:2550:1: ( ( rule__Methode__BezeichnungAssignment_3 ) )
            {
            // InternalMeth.g:2550:1: ( ( rule__Methode__BezeichnungAssignment_3 ) )
            // InternalMeth.g:2551:2: ( rule__Methode__BezeichnungAssignment_3 )
            {
             before(grammarAccess.getMethodeAccess().getBezeichnungAssignment_3()); 
            // InternalMeth.g:2552:2: ( rule__Methode__BezeichnungAssignment_3 )
            // InternalMeth.g:2552:3: rule__Methode__BezeichnungAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Methode__BezeichnungAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getBezeichnungAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__3__Impl"


    // $ANTLR start "rule__Methode__Group__4"
    // InternalMeth.g:2560:1: rule__Methode__Group__4 : rule__Methode__Group__4__Impl rule__Methode__Group__5 ;
    public final void rule__Methode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2564:1: ( rule__Methode__Group__4__Impl rule__Methode__Group__5 )
            // InternalMeth.g:2565:2: rule__Methode__Group__4__Impl rule__Methode__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Methode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__4"


    // $ANTLR start "rule__Methode__Group__4__Impl"
    // InternalMeth.g:2572:1: rule__Methode__Group__4__Impl : ( '{' ) ;
    public final void rule__Methode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2576:1: ( ( '{' ) )
            // InternalMeth.g:2577:1: ( '{' )
            {
            // InternalMeth.g:2577:1: ( '{' )
            // InternalMeth.g:2578:2: '{'
            {
             before(grammarAccess.getMethodeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__4__Impl"


    // $ANTLR start "rule__Methode__Group__5"
    // InternalMeth.g:2587:1: rule__Methode__Group__5 : rule__Methode__Group__5__Impl rule__Methode__Group__6 ;
    public final void rule__Methode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2591:1: ( rule__Methode__Group__5__Impl rule__Methode__Group__6 )
            // InternalMeth.g:2592:2: rule__Methode__Group__5__Impl rule__Methode__Group__6
            {
            pushFollow(FOLLOW_24);
            rule__Methode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Methode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__5"


    // $ANTLR start "rule__Methode__Group__5__Impl"
    // InternalMeth.g:2599:1: rule__Methode__Group__5__Impl : ( ( ( rule__Methode__AblaufAssignment_5 ) ) ( ( rule__Methode__AblaufAssignment_5 )* ) ) ;
    public final void rule__Methode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2603:1: ( ( ( ( rule__Methode__AblaufAssignment_5 ) ) ( ( rule__Methode__AblaufAssignment_5 )* ) ) )
            // InternalMeth.g:2604:1: ( ( ( rule__Methode__AblaufAssignment_5 ) ) ( ( rule__Methode__AblaufAssignment_5 )* ) )
            {
            // InternalMeth.g:2604:1: ( ( ( rule__Methode__AblaufAssignment_5 ) ) ( ( rule__Methode__AblaufAssignment_5 )* ) )
            // InternalMeth.g:2605:2: ( ( rule__Methode__AblaufAssignment_5 ) ) ( ( rule__Methode__AblaufAssignment_5 )* )
            {
            // InternalMeth.g:2605:2: ( ( rule__Methode__AblaufAssignment_5 ) )
            // InternalMeth.g:2606:3: ( rule__Methode__AblaufAssignment_5 )
            {
             before(grammarAccess.getMethodeAccess().getAblaufAssignment_5()); 
            // InternalMeth.g:2607:3: ( rule__Methode__AblaufAssignment_5 )
            // InternalMeth.g:2607:4: rule__Methode__AblaufAssignment_5
            {
            pushFollow(FOLLOW_25);
            rule__Methode__AblaufAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getAblaufAssignment_5()); 

            }

            // InternalMeth.g:2610:2: ( ( rule__Methode__AblaufAssignment_5 )* )
            // InternalMeth.g:2611:3: ( rule__Methode__AblaufAssignment_5 )*
            {
             before(grammarAccess.getMethodeAccess().getAblaufAssignment_5()); 
            // InternalMeth.g:2612:3: ( rule__Methode__AblaufAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=31 && LA18_0<=34)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMeth.g:2612:4: rule__Methode__AblaufAssignment_5
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Methode__AblaufAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getMethodeAccess().getAblaufAssignment_5()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__5__Impl"


    // $ANTLR start "rule__Methode__Group__6"
    // InternalMeth.g:2621:1: rule__Methode__Group__6 : rule__Methode__Group__6__Impl ;
    public final void rule__Methode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2625:1: ( rule__Methode__Group__6__Impl )
            // InternalMeth.g:2626:2: rule__Methode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Methode__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__6"


    // $ANTLR start "rule__Methode__Group__6__Impl"
    // InternalMeth.g:2632:1: rule__Methode__Group__6__Impl : ( '}' ) ;
    public final void rule__Methode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2636:1: ( ( '}' ) )
            // InternalMeth.g:2637:1: ( '}' )
            {
            // InternalMeth.g:2637:1: ( '}' )
            // InternalMeth.g:2638:2: '}'
            {
             before(grammarAccess.getMethodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__Group__6__Impl"


    // $ANTLR start "rule__Gegeben__Group__0"
    // InternalMeth.g:2648:1: rule__Gegeben__Group__0 : rule__Gegeben__Group__0__Impl rule__Gegeben__Group__1 ;
    public final void rule__Gegeben__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2652:1: ( rule__Gegeben__Group__0__Impl rule__Gegeben__Group__1 )
            // InternalMeth.g:2653:2: rule__Gegeben__Group__0__Impl rule__Gegeben__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Gegeben__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gegeben__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gegeben__Group__0"


    // $ANTLR start "rule__Gegeben__Group__0__Impl"
    // InternalMeth.g:2660:1: rule__Gegeben__Group__0__Impl : ( 'Gegeben' ) ;
    public final void rule__Gegeben__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2664:1: ( ( 'Gegeben' ) )
            // InternalMeth.g:2665:1: ( 'Gegeben' )
            {
            // InternalMeth.g:2665:1: ( 'Gegeben' )
            // InternalMeth.g:2666:2: 'Gegeben'
            {
             before(grammarAccess.getGegebenAccess().getGegebenKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getGegebenAccess().getGegebenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gegeben__Group__0__Impl"


    // $ANTLR start "rule__Gegeben__Group__1"
    // InternalMeth.g:2675:1: rule__Gegeben__Group__1 : rule__Gegeben__Group__1__Impl rule__Gegeben__Group__2 ;
    public final void rule__Gegeben__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2679:1: ( rule__Gegeben__Group__1__Impl rule__Gegeben__Group__2 )
            // InternalMeth.g:2680:2: rule__Gegeben__Group__1__Impl rule__Gegeben__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Gegeben__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gegeben__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gegeben__Group__1"


    // $ANTLR start "rule__Gegeben__Group__1__Impl"
    // InternalMeth.g:2687:1: rule__Gegeben__Group__1__Impl : ( '{' ) ;
    public final void rule__Gegeben__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2691:1: ( ( '{' ) )
            // InternalMeth.g:2692:1: ( '{' )
            {
            // InternalMeth.g:2692:1: ( '{' )
            // InternalMeth.g:2693:2: '{'
            {
             before(grammarAccess.getGegebenAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getGegebenAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gegeben__Group__1__Impl"


    // $ANTLR start "rule__Gegeben__Group__2"
    // InternalMeth.g:2702:1: rule__Gegeben__Group__2 : rule__Gegeben__Group__2__Impl rule__Gegeben__Group__3 ;
    public final void rule__Gegeben__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2706:1: ( rule__Gegeben__Group__2__Impl rule__Gegeben__Group__3 )
            // InternalMeth.g:2707:2: rule__Gegeben__Group__2__Impl rule__Gegeben__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Gegeben__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Gegeben__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gegeben__Group__2"


    // $ANTLR start "rule__Gegeben__Group__2__Impl"
    // InternalMeth.g:2714:1: rule__Gegeben__Group__2__Impl : ( ( rule__Gegeben__StatementsAssignment_2 )* ) ;
    public final void rule__Gegeben__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2718:1: ( ( ( rule__Gegeben__StatementsAssignment_2 )* ) )
            // InternalMeth.g:2719:1: ( ( rule__Gegeben__StatementsAssignment_2 )* )
            {
            // InternalMeth.g:2719:1: ( ( rule__Gegeben__StatementsAssignment_2 )* )
            // InternalMeth.g:2720:2: ( rule__Gegeben__StatementsAssignment_2 )*
            {
             before(grammarAccess.getGegebenAccess().getStatementsAssignment_2()); 
            // InternalMeth.g:2721:2: ( rule__Gegeben__StatementsAssignment_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMeth.g:2721:3: rule__Gegeben__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Gegeben__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getGegebenAccess().getStatementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gegeben__Group__2__Impl"


    // $ANTLR start "rule__Gegeben__Group__3"
    // InternalMeth.g:2729:1: rule__Gegeben__Group__3 : rule__Gegeben__Group__3__Impl ;
    public final void rule__Gegeben__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2733:1: ( rule__Gegeben__Group__3__Impl )
            // InternalMeth.g:2734:2: rule__Gegeben__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Gegeben__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gegeben__Group__3"


    // $ANTLR start "rule__Gegeben__Group__3__Impl"
    // InternalMeth.g:2740:1: rule__Gegeben__Group__3__Impl : ( '}' ) ;
    public final void rule__Gegeben__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2744:1: ( ( '}' ) )
            // InternalMeth.g:2745:1: ( '}' )
            {
            // InternalMeth.g:2745:1: ( '}' )
            // InternalMeth.g:2746:2: '}'
            {
             before(grammarAccess.getGegebenAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGegebenAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gegeben__Group__3__Impl"


    // $ANTLR start "rule__Eingabe__Group__0"
    // InternalMeth.g:2756:1: rule__Eingabe__Group__0 : rule__Eingabe__Group__0__Impl rule__Eingabe__Group__1 ;
    public final void rule__Eingabe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2760:1: ( rule__Eingabe__Group__0__Impl rule__Eingabe__Group__1 )
            // InternalMeth.g:2761:2: rule__Eingabe__Group__0__Impl rule__Eingabe__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Eingabe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eingabe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eingabe__Group__0"


    // $ANTLR start "rule__Eingabe__Group__0__Impl"
    // InternalMeth.g:2768:1: rule__Eingabe__Group__0__Impl : ( 'Eingabe' ) ;
    public final void rule__Eingabe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2772:1: ( ( 'Eingabe' ) )
            // InternalMeth.g:2773:1: ( 'Eingabe' )
            {
            // InternalMeth.g:2773:1: ( 'Eingabe' )
            // InternalMeth.g:2774:2: 'Eingabe'
            {
             before(grammarAccess.getEingabeAccess().getEingabeKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getEingabeAccess().getEingabeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eingabe__Group__0__Impl"


    // $ANTLR start "rule__Eingabe__Group__1"
    // InternalMeth.g:2783:1: rule__Eingabe__Group__1 : rule__Eingabe__Group__1__Impl rule__Eingabe__Group__2 ;
    public final void rule__Eingabe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2787:1: ( rule__Eingabe__Group__1__Impl rule__Eingabe__Group__2 )
            // InternalMeth.g:2788:2: rule__Eingabe__Group__1__Impl rule__Eingabe__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Eingabe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eingabe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eingabe__Group__1"


    // $ANTLR start "rule__Eingabe__Group__1__Impl"
    // InternalMeth.g:2795:1: rule__Eingabe__Group__1__Impl : ( '{' ) ;
    public final void rule__Eingabe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2799:1: ( ( '{' ) )
            // InternalMeth.g:2800:1: ( '{' )
            {
            // InternalMeth.g:2800:1: ( '{' )
            // InternalMeth.g:2801:2: '{'
            {
             before(grammarAccess.getEingabeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEingabeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eingabe__Group__1__Impl"


    // $ANTLR start "rule__Eingabe__Group__2"
    // InternalMeth.g:2810:1: rule__Eingabe__Group__2 : rule__Eingabe__Group__2__Impl rule__Eingabe__Group__3 ;
    public final void rule__Eingabe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2814:1: ( rule__Eingabe__Group__2__Impl rule__Eingabe__Group__3 )
            // InternalMeth.g:2815:2: rule__Eingabe__Group__2__Impl rule__Eingabe__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Eingabe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Eingabe__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eingabe__Group__2"


    // $ANTLR start "rule__Eingabe__Group__2__Impl"
    // InternalMeth.g:2822:1: rule__Eingabe__Group__2__Impl : ( ( rule__Eingabe__StatementsAssignment_2 )* ) ;
    public final void rule__Eingabe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2826:1: ( ( ( rule__Eingabe__StatementsAssignment_2 )* ) )
            // InternalMeth.g:2827:1: ( ( rule__Eingabe__StatementsAssignment_2 )* )
            {
            // InternalMeth.g:2827:1: ( ( rule__Eingabe__StatementsAssignment_2 )* )
            // InternalMeth.g:2828:2: ( rule__Eingabe__StatementsAssignment_2 )*
            {
             before(grammarAccess.getEingabeAccess().getStatementsAssignment_2()); 
            // InternalMeth.g:2829:2: ( rule__Eingabe__StatementsAssignment_2 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMeth.g:2829:3: rule__Eingabe__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Eingabe__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getEingabeAccess().getStatementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eingabe__Group__2__Impl"


    // $ANTLR start "rule__Eingabe__Group__3"
    // InternalMeth.g:2837:1: rule__Eingabe__Group__3 : rule__Eingabe__Group__3__Impl ;
    public final void rule__Eingabe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2841:1: ( rule__Eingabe__Group__3__Impl )
            // InternalMeth.g:2842:2: rule__Eingabe__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Eingabe__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eingabe__Group__3"


    // $ANTLR start "rule__Eingabe__Group__3__Impl"
    // InternalMeth.g:2848:1: rule__Eingabe__Group__3__Impl : ( '}' ) ;
    public final void rule__Eingabe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2852:1: ( ( '}' ) )
            // InternalMeth.g:2853:1: ( '}' )
            {
            // InternalMeth.g:2853:1: ( '}' )
            // InternalMeth.g:2854:2: '}'
            {
             before(grammarAccess.getEingabeAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEingabeAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eingabe__Group__3__Impl"


    // $ANTLR start "rule__Berechnung__Group__0"
    // InternalMeth.g:2864:1: rule__Berechnung__Group__0 : rule__Berechnung__Group__0__Impl rule__Berechnung__Group__1 ;
    public final void rule__Berechnung__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2868:1: ( rule__Berechnung__Group__0__Impl rule__Berechnung__Group__1 )
            // InternalMeth.g:2869:2: rule__Berechnung__Group__0__Impl rule__Berechnung__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Berechnung__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Berechnung__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Berechnung__Group__0"


    // $ANTLR start "rule__Berechnung__Group__0__Impl"
    // InternalMeth.g:2876:1: rule__Berechnung__Group__0__Impl : ( 'Berechnung' ) ;
    public final void rule__Berechnung__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2880:1: ( ( 'Berechnung' ) )
            // InternalMeth.g:2881:1: ( 'Berechnung' )
            {
            // InternalMeth.g:2881:1: ( 'Berechnung' )
            // InternalMeth.g:2882:2: 'Berechnung'
            {
             before(grammarAccess.getBerechnungAccess().getBerechnungKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBerechnungAccess().getBerechnungKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Berechnung__Group__0__Impl"


    // $ANTLR start "rule__Berechnung__Group__1"
    // InternalMeth.g:2891:1: rule__Berechnung__Group__1 : rule__Berechnung__Group__1__Impl rule__Berechnung__Group__2 ;
    public final void rule__Berechnung__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2895:1: ( rule__Berechnung__Group__1__Impl rule__Berechnung__Group__2 )
            // InternalMeth.g:2896:2: rule__Berechnung__Group__1__Impl rule__Berechnung__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Berechnung__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Berechnung__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Berechnung__Group__1"


    // $ANTLR start "rule__Berechnung__Group__1__Impl"
    // InternalMeth.g:2903:1: rule__Berechnung__Group__1__Impl : ( '{' ) ;
    public final void rule__Berechnung__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2907:1: ( ( '{' ) )
            // InternalMeth.g:2908:1: ( '{' )
            {
            // InternalMeth.g:2908:1: ( '{' )
            // InternalMeth.g:2909:2: '{'
            {
             before(grammarAccess.getBerechnungAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBerechnungAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Berechnung__Group__1__Impl"


    // $ANTLR start "rule__Berechnung__Group__2"
    // InternalMeth.g:2918:1: rule__Berechnung__Group__2 : rule__Berechnung__Group__2__Impl rule__Berechnung__Group__3 ;
    public final void rule__Berechnung__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2922:1: ( rule__Berechnung__Group__2__Impl rule__Berechnung__Group__3 )
            // InternalMeth.g:2923:2: rule__Berechnung__Group__2__Impl rule__Berechnung__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Berechnung__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Berechnung__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Berechnung__Group__2"


    // $ANTLR start "rule__Berechnung__Group__2__Impl"
    // InternalMeth.g:2930:1: rule__Berechnung__Group__2__Impl : ( ( rule__Berechnung__StatementsAssignment_2 )* ) ;
    public final void rule__Berechnung__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2934:1: ( ( ( rule__Berechnung__StatementsAssignment_2 )* ) )
            // InternalMeth.g:2935:1: ( ( rule__Berechnung__StatementsAssignment_2 )* )
            {
            // InternalMeth.g:2935:1: ( ( rule__Berechnung__StatementsAssignment_2 )* )
            // InternalMeth.g:2936:2: ( rule__Berechnung__StatementsAssignment_2 )*
            {
             before(grammarAccess.getBerechnungAccess().getStatementsAssignment_2()); 
            // InternalMeth.g:2937:2: ( rule__Berechnung__StatementsAssignment_2 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMeth.g:2937:3: rule__Berechnung__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Berechnung__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getBerechnungAccess().getStatementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Berechnung__Group__2__Impl"


    // $ANTLR start "rule__Berechnung__Group__3"
    // InternalMeth.g:2945:1: rule__Berechnung__Group__3 : rule__Berechnung__Group__3__Impl ;
    public final void rule__Berechnung__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2949:1: ( rule__Berechnung__Group__3__Impl )
            // InternalMeth.g:2950:2: rule__Berechnung__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Berechnung__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Berechnung__Group__3"


    // $ANTLR start "rule__Berechnung__Group__3__Impl"
    // InternalMeth.g:2956:1: rule__Berechnung__Group__3__Impl : ( '}' ) ;
    public final void rule__Berechnung__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2960:1: ( ( '}' ) )
            // InternalMeth.g:2961:1: ( '}' )
            {
            // InternalMeth.g:2961:1: ( '}' )
            // InternalMeth.g:2962:2: '}'
            {
             before(grammarAccess.getBerechnungAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getBerechnungAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Berechnung__Group__3__Impl"


    // $ANTLR start "rule__Ausgabe__Group__0"
    // InternalMeth.g:2972:1: rule__Ausgabe__Group__0 : rule__Ausgabe__Group__0__Impl rule__Ausgabe__Group__1 ;
    public final void rule__Ausgabe__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2976:1: ( rule__Ausgabe__Group__0__Impl rule__Ausgabe__Group__1 )
            // InternalMeth.g:2977:2: rule__Ausgabe__Group__0__Impl rule__Ausgabe__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Ausgabe__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ausgabe__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ausgabe__Group__0"


    // $ANTLR start "rule__Ausgabe__Group__0__Impl"
    // InternalMeth.g:2984:1: rule__Ausgabe__Group__0__Impl : ( 'Ausgabe' ) ;
    public final void rule__Ausgabe__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:2988:1: ( ( 'Ausgabe' ) )
            // InternalMeth.g:2989:1: ( 'Ausgabe' )
            {
            // InternalMeth.g:2989:1: ( 'Ausgabe' )
            // InternalMeth.g:2990:2: 'Ausgabe'
            {
             before(grammarAccess.getAusgabeAccess().getAusgabeKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAusgabeAccess().getAusgabeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ausgabe__Group__0__Impl"


    // $ANTLR start "rule__Ausgabe__Group__1"
    // InternalMeth.g:2999:1: rule__Ausgabe__Group__1 : rule__Ausgabe__Group__1__Impl rule__Ausgabe__Group__2 ;
    public final void rule__Ausgabe__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3003:1: ( rule__Ausgabe__Group__1__Impl rule__Ausgabe__Group__2 )
            // InternalMeth.g:3004:2: rule__Ausgabe__Group__1__Impl rule__Ausgabe__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Ausgabe__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ausgabe__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ausgabe__Group__1"


    // $ANTLR start "rule__Ausgabe__Group__1__Impl"
    // InternalMeth.g:3011:1: rule__Ausgabe__Group__1__Impl : ( '{' ) ;
    public final void rule__Ausgabe__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3015:1: ( ( '{' ) )
            // InternalMeth.g:3016:1: ( '{' )
            {
            // InternalMeth.g:3016:1: ( '{' )
            // InternalMeth.g:3017:2: '{'
            {
             before(grammarAccess.getAusgabeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAusgabeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ausgabe__Group__1__Impl"


    // $ANTLR start "rule__Ausgabe__Group__2"
    // InternalMeth.g:3026:1: rule__Ausgabe__Group__2 : rule__Ausgabe__Group__2__Impl rule__Ausgabe__Group__3 ;
    public final void rule__Ausgabe__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3030:1: ( rule__Ausgabe__Group__2__Impl rule__Ausgabe__Group__3 )
            // InternalMeth.g:3031:2: rule__Ausgabe__Group__2__Impl rule__Ausgabe__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__Ausgabe__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ausgabe__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ausgabe__Group__2"


    // $ANTLR start "rule__Ausgabe__Group__2__Impl"
    // InternalMeth.g:3038:1: rule__Ausgabe__Group__2__Impl : ( ( rule__Ausgabe__StatementsAssignment_2 )* ) ;
    public final void rule__Ausgabe__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3042:1: ( ( ( rule__Ausgabe__StatementsAssignment_2 )* ) )
            // InternalMeth.g:3043:1: ( ( rule__Ausgabe__StatementsAssignment_2 )* )
            {
            // InternalMeth.g:3043:1: ( ( rule__Ausgabe__StatementsAssignment_2 )* )
            // InternalMeth.g:3044:2: ( rule__Ausgabe__StatementsAssignment_2 )*
            {
             before(grammarAccess.getAusgabeAccess().getStatementsAssignment_2()); 
            // InternalMeth.g:3045:2: ( rule__Ausgabe__StatementsAssignment_2 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMeth.g:3045:3: rule__Ausgabe__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Ausgabe__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAusgabeAccess().getStatementsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ausgabe__Group__2__Impl"


    // $ANTLR start "rule__Ausgabe__Group__3"
    // InternalMeth.g:3053:1: rule__Ausgabe__Group__3 : rule__Ausgabe__Group__3__Impl ;
    public final void rule__Ausgabe__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3057:1: ( rule__Ausgabe__Group__3__Impl )
            // InternalMeth.g:3058:2: rule__Ausgabe__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ausgabe__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ausgabe__Group__3"


    // $ANTLR start "rule__Ausgabe__Group__3__Impl"
    // InternalMeth.g:3064:1: rule__Ausgabe__Group__3__Impl : ( '}' ) ;
    public final void rule__Ausgabe__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3068:1: ( ( '}' ) )
            // InternalMeth.g:3069:1: ( '}' )
            {
            // InternalMeth.g:3069:1: ( '}' )
            // InternalMeth.g:3070:2: '}'
            {
             before(grammarAccess.getAusgabeAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAusgabeAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ausgabe__Group__3__Impl"


    // $ANTLR start "rule__GegebenStatement__Group__0"
    // InternalMeth.g:3080:1: rule__GegebenStatement__Group__0 : rule__GegebenStatement__Group__0__Impl rule__GegebenStatement__Group__1 ;
    public final void rule__GegebenStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3084:1: ( rule__GegebenStatement__Group__0__Impl rule__GegebenStatement__Group__1 )
            // InternalMeth.g:3085:2: rule__GegebenStatement__Group__0__Impl rule__GegebenStatement__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__GegebenStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GegebenStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__0"


    // $ANTLR start "rule__GegebenStatement__Group__0__Impl"
    // InternalMeth.g:3092:1: rule__GegebenStatement__Group__0__Impl : ( ( rule__GegebenStatement__EingabenameAssignment_0 ) ) ;
    public final void rule__GegebenStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3096:1: ( ( ( rule__GegebenStatement__EingabenameAssignment_0 ) ) )
            // InternalMeth.g:3097:1: ( ( rule__GegebenStatement__EingabenameAssignment_0 ) )
            {
            // InternalMeth.g:3097:1: ( ( rule__GegebenStatement__EingabenameAssignment_0 ) )
            // InternalMeth.g:3098:2: ( rule__GegebenStatement__EingabenameAssignment_0 )
            {
             before(grammarAccess.getGegebenStatementAccess().getEingabenameAssignment_0()); 
            // InternalMeth.g:3099:2: ( rule__GegebenStatement__EingabenameAssignment_0 )
            // InternalMeth.g:3099:3: rule__GegebenStatement__EingabenameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__GegebenStatement__EingabenameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getGegebenStatementAccess().getEingabenameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__0__Impl"


    // $ANTLR start "rule__GegebenStatement__Group__1"
    // InternalMeth.g:3107:1: rule__GegebenStatement__Group__1 : rule__GegebenStatement__Group__1__Impl rule__GegebenStatement__Group__2 ;
    public final void rule__GegebenStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3111:1: ( rule__GegebenStatement__Group__1__Impl rule__GegebenStatement__Group__2 )
            // InternalMeth.g:3112:2: rule__GegebenStatement__Group__1__Impl rule__GegebenStatement__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__GegebenStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GegebenStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__1"


    // $ANTLR start "rule__GegebenStatement__Group__1__Impl"
    // InternalMeth.g:3119:1: rule__GegebenStatement__Group__1__Impl : ( ( rule__GegebenStatement__Group_1__0 )? ) ;
    public final void rule__GegebenStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3123:1: ( ( ( rule__GegebenStatement__Group_1__0 )? ) )
            // InternalMeth.g:3124:1: ( ( rule__GegebenStatement__Group_1__0 )? )
            {
            // InternalMeth.g:3124:1: ( ( rule__GegebenStatement__Group_1__0 )? )
            // InternalMeth.g:3125:2: ( rule__GegebenStatement__Group_1__0 )?
            {
             before(grammarAccess.getGegebenStatementAccess().getGroup_1()); 
            // InternalMeth.g:3126:2: ( rule__GegebenStatement__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMeth.g:3126:3: rule__GegebenStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__GegebenStatement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGegebenStatementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__1__Impl"


    // $ANTLR start "rule__GegebenStatement__Group__2"
    // InternalMeth.g:3134:1: rule__GegebenStatement__Group__2 : rule__GegebenStatement__Group__2__Impl rule__GegebenStatement__Group__3 ;
    public final void rule__GegebenStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3138:1: ( rule__GegebenStatement__Group__2__Impl rule__GegebenStatement__Group__3 )
            // InternalMeth.g:3139:2: rule__GegebenStatement__Group__2__Impl rule__GegebenStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__GegebenStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GegebenStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__2"


    // $ANTLR start "rule__GegebenStatement__Group__2__Impl"
    // InternalMeth.g:3146:1: rule__GegebenStatement__Group__2__Impl : ( 'aus' ) ;
    public final void rule__GegebenStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3150:1: ( ( 'aus' ) )
            // InternalMeth.g:3151:1: ( 'aus' )
            {
            // InternalMeth.g:3151:1: ( 'aus' )
            // InternalMeth.g:3152:2: 'aus'
            {
             before(grammarAccess.getGegebenStatementAccess().getAusKeyword_2()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getGegebenStatementAccess().getAusKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__2__Impl"


    // $ANTLR start "rule__GegebenStatement__Group__3"
    // InternalMeth.g:3161:1: rule__GegebenStatement__Group__3 : rule__GegebenStatement__Group__3__Impl rule__GegebenStatement__Group__4 ;
    public final void rule__GegebenStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3165:1: ( rule__GegebenStatement__Group__3__Impl rule__GegebenStatement__Group__4 )
            // InternalMeth.g:3166:2: rule__GegebenStatement__Group__3__Impl rule__GegebenStatement__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__GegebenStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GegebenStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__3"


    // $ANTLR start "rule__GegebenStatement__Group__3__Impl"
    // InternalMeth.g:3173:1: rule__GegebenStatement__Group__3__Impl : ( ( rule__GegebenStatement__RefMethodeAssignment_3 ) ) ;
    public final void rule__GegebenStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3177:1: ( ( ( rule__GegebenStatement__RefMethodeAssignment_3 ) ) )
            // InternalMeth.g:3178:1: ( ( rule__GegebenStatement__RefMethodeAssignment_3 ) )
            {
            // InternalMeth.g:3178:1: ( ( rule__GegebenStatement__RefMethodeAssignment_3 ) )
            // InternalMeth.g:3179:2: ( rule__GegebenStatement__RefMethodeAssignment_3 )
            {
             before(grammarAccess.getGegebenStatementAccess().getRefMethodeAssignment_3()); 
            // InternalMeth.g:3180:2: ( rule__GegebenStatement__RefMethodeAssignment_3 )
            // InternalMeth.g:3180:3: rule__GegebenStatement__RefMethodeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GegebenStatement__RefMethodeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGegebenStatementAccess().getRefMethodeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__3__Impl"


    // $ANTLR start "rule__GegebenStatement__Group__4"
    // InternalMeth.g:3188:1: rule__GegebenStatement__Group__4 : rule__GegebenStatement__Group__4__Impl rule__GegebenStatement__Group__5 ;
    public final void rule__GegebenStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3192:1: ( rule__GegebenStatement__Group__4__Impl rule__GegebenStatement__Group__5 )
            // InternalMeth.g:3193:2: rule__GegebenStatement__Group__4__Impl rule__GegebenStatement__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__GegebenStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GegebenStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__4"


    // $ANTLR start "rule__GegebenStatement__Group__4__Impl"
    // InternalMeth.g:3200:1: rule__GegebenStatement__Group__4__Impl : ( 'als' ) ;
    public final void rule__GegebenStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3204:1: ( ( 'als' ) )
            // InternalMeth.g:3205:1: ( 'als' )
            {
            // InternalMeth.g:3205:1: ( 'als' )
            // InternalMeth.g:3206:2: 'als'
            {
             before(grammarAccess.getGegebenStatementAccess().getAlsKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getGegebenStatementAccess().getAlsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__4__Impl"


    // $ANTLR start "rule__GegebenStatement__Group__5"
    // InternalMeth.g:3215:1: rule__GegebenStatement__Group__5 : rule__GegebenStatement__Group__5__Impl rule__GegebenStatement__Group__6 ;
    public final void rule__GegebenStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3219:1: ( rule__GegebenStatement__Group__5__Impl rule__GegebenStatement__Group__6 )
            // InternalMeth.g:3220:2: rule__GegebenStatement__Group__5__Impl rule__GegebenStatement__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__GegebenStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GegebenStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__5"


    // $ANTLR start "rule__GegebenStatement__Group__5__Impl"
    // InternalMeth.g:3227:1: rule__GegebenStatement__Group__5__Impl : ( ( rule__GegebenStatement__BezeichnungAssignment_5 ) ) ;
    public final void rule__GegebenStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3231:1: ( ( ( rule__GegebenStatement__BezeichnungAssignment_5 ) ) )
            // InternalMeth.g:3232:1: ( ( rule__GegebenStatement__BezeichnungAssignment_5 ) )
            {
            // InternalMeth.g:3232:1: ( ( rule__GegebenStatement__BezeichnungAssignment_5 ) )
            // InternalMeth.g:3233:2: ( rule__GegebenStatement__BezeichnungAssignment_5 )
            {
             before(grammarAccess.getGegebenStatementAccess().getBezeichnungAssignment_5()); 
            // InternalMeth.g:3234:2: ( rule__GegebenStatement__BezeichnungAssignment_5 )
            // InternalMeth.g:3234:3: rule__GegebenStatement__BezeichnungAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__GegebenStatement__BezeichnungAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getGegebenStatementAccess().getBezeichnungAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__5__Impl"


    // $ANTLR start "rule__GegebenStatement__Group__6"
    // InternalMeth.g:3242:1: rule__GegebenStatement__Group__6 : rule__GegebenStatement__Group__6__Impl ;
    public final void rule__GegebenStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3246:1: ( rule__GegebenStatement__Group__6__Impl )
            // InternalMeth.g:3247:2: rule__GegebenStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GegebenStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__6"


    // $ANTLR start "rule__GegebenStatement__Group__6__Impl"
    // InternalMeth.g:3253:1: rule__GegebenStatement__Group__6__Impl : ( ';' ) ;
    public final void rule__GegebenStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3257:1: ( ( ';' ) )
            // InternalMeth.g:3258:1: ( ';' )
            {
            // InternalMeth.g:3258:1: ( ';' )
            // InternalMeth.g:3259:2: ';'
            {
             before(grammarAccess.getGegebenStatementAccess().getSemicolonKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getGegebenStatementAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group__6__Impl"


    // $ANTLR start "rule__GegebenStatement__Group_1__0"
    // InternalMeth.g:3269:1: rule__GegebenStatement__Group_1__0 : rule__GegebenStatement__Group_1__0__Impl rule__GegebenStatement__Group_1__1 ;
    public final void rule__GegebenStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3273:1: ( rule__GegebenStatement__Group_1__0__Impl rule__GegebenStatement__Group_1__1 )
            // InternalMeth.g:3274:2: rule__GegebenStatement__Group_1__0__Impl rule__GegebenStatement__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__GegebenStatement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GegebenStatement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group_1__0"


    // $ANTLR start "rule__GegebenStatement__Group_1__0__Impl"
    // InternalMeth.g:3281:1: rule__GegebenStatement__Group_1__0__Impl : ( '[' ) ;
    public final void rule__GegebenStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3285:1: ( ( '[' ) )
            // InternalMeth.g:3286:1: ( '[' )
            {
            // InternalMeth.g:3286:1: ( '[' )
            // InternalMeth.g:3287:2: '['
            {
             before(grammarAccess.getGegebenStatementAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getGegebenStatementAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group_1__0__Impl"


    // $ANTLR start "rule__GegebenStatement__Group_1__1"
    // InternalMeth.g:3296:1: rule__GegebenStatement__Group_1__1 : rule__GegebenStatement__Group_1__1__Impl rule__GegebenStatement__Group_1__2 ;
    public final void rule__GegebenStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3300:1: ( rule__GegebenStatement__Group_1__1__Impl rule__GegebenStatement__Group_1__2 )
            // InternalMeth.g:3301:2: rule__GegebenStatement__Group_1__1__Impl rule__GegebenStatement__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__GegebenStatement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GegebenStatement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group_1__1"


    // $ANTLR start "rule__GegebenStatement__Group_1__1__Impl"
    // InternalMeth.g:3308:1: rule__GegebenStatement__Group_1__1__Impl : ( ( rule__GegebenStatement__EinheitAssignment_1_1 ) ) ;
    public final void rule__GegebenStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3312:1: ( ( ( rule__GegebenStatement__EinheitAssignment_1_1 ) ) )
            // InternalMeth.g:3313:1: ( ( rule__GegebenStatement__EinheitAssignment_1_1 ) )
            {
            // InternalMeth.g:3313:1: ( ( rule__GegebenStatement__EinheitAssignment_1_1 ) )
            // InternalMeth.g:3314:2: ( rule__GegebenStatement__EinheitAssignment_1_1 )
            {
             before(grammarAccess.getGegebenStatementAccess().getEinheitAssignment_1_1()); 
            // InternalMeth.g:3315:2: ( rule__GegebenStatement__EinheitAssignment_1_1 )
            // InternalMeth.g:3315:3: rule__GegebenStatement__EinheitAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__GegebenStatement__EinheitAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getGegebenStatementAccess().getEinheitAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group_1__1__Impl"


    // $ANTLR start "rule__GegebenStatement__Group_1__2"
    // InternalMeth.g:3323:1: rule__GegebenStatement__Group_1__2 : rule__GegebenStatement__Group_1__2__Impl ;
    public final void rule__GegebenStatement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3327:1: ( rule__GegebenStatement__Group_1__2__Impl )
            // InternalMeth.g:3328:2: rule__GegebenStatement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GegebenStatement__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group_1__2"


    // $ANTLR start "rule__GegebenStatement__Group_1__2__Impl"
    // InternalMeth.g:3334:1: rule__GegebenStatement__Group_1__2__Impl : ( ']' ) ;
    public final void rule__GegebenStatement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3338:1: ( ( ']' ) )
            // InternalMeth.g:3339:1: ( ']' )
            {
            // InternalMeth.g:3339:1: ( ']' )
            // InternalMeth.g:3340:2: ']'
            {
             before(grammarAccess.getGegebenStatementAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getGegebenStatementAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__Group_1__2__Impl"


    // $ANTLR start "rule__EingabeStatement__Group__0"
    // InternalMeth.g:3350:1: rule__EingabeStatement__Group__0 : rule__EingabeStatement__Group__0__Impl rule__EingabeStatement__Group__1 ;
    public final void rule__EingabeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3354:1: ( rule__EingabeStatement__Group__0__Impl rule__EingabeStatement__Group__1 )
            // InternalMeth.g:3355:2: rule__EingabeStatement__Group__0__Impl rule__EingabeStatement__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__EingabeStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EingabeStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__0"


    // $ANTLR start "rule__EingabeStatement__Group__0__Impl"
    // InternalMeth.g:3362:1: rule__EingabeStatement__Group__0__Impl : ( ( rule__EingabeStatement__EingabenameAssignment_0 ) ) ;
    public final void rule__EingabeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3366:1: ( ( ( rule__EingabeStatement__EingabenameAssignment_0 ) ) )
            // InternalMeth.g:3367:1: ( ( rule__EingabeStatement__EingabenameAssignment_0 ) )
            {
            // InternalMeth.g:3367:1: ( ( rule__EingabeStatement__EingabenameAssignment_0 ) )
            // InternalMeth.g:3368:2: ( rule__EingabeStatement__EingabenameAssignment_0 )
            {
             before(grammarAccess.getEingabeStatementAccess().getEingabenameAssignment_0()); 
            // InternalMeth.g:3369:2: ( rule__EingabeStatement__EingabenameAssignment_0 )
            // InternalMeth.g:3369:3: rule__EingabeStatement__EingabenameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EingabeStatement__EingabenameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEingabeStatementAccess().getEingabenameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__0__Impl"


    // $ANTLR start "rule__EingabeStatement__Group__1"
    // InternalMeth.g:3377:1: rule__EingabeStatement__Group__1 : rule__EingabeStatement__Group__1__Impl rule__EingabeStatement__Group__2 ;
    public final void rule__EingabeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3381:1: ( rule__EingabeStatement__Group__1__Impl rule__EingabeStatement__Group__2 )
            // InternalMeth.g:3382:2: rule__EingabeStatement__Group__1__Impl rule__EingabeStatement__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EingabeStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EingabeStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__1"


    // $ANTLR start "rule__EingabeStatement__Group__1__Impl"
    // InternalMeth.g:3389:1: rule__EingabeStatement__Group__1__Impl : ( '[' ) ;
    public final void rule__EingabeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3393:1: ( ( '[' ) )
            // InternalMeth.g:3394:1: ( '[' )
            {
            // InternalMeth.g:3394:1: ( '[' )
            // InternalMeth.g:3395:2: '['
            {
             before(grammarAccess.getEingabeStatementAccess().getLeftSquareBracketKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getEingabeStatementAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__1__Impl"


    // $ANTLR start "rule__EingabeStatement__Group__2"
    // InternalMeth.g:3404:1: rule__EingabeStatement__Group__2 : rule__EingabeStatement__Group__2__Impl rule__EingabeStatement__Group__3 ;
    public final void rule__EingabeStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3408:1: ( rule__EingabeStatement__Group__2__Impl rule__EingabeStatement__Group__3 )
            // InternalMeth.g:3409:2: rule__EingabeStatement__Group__2__Impl rule__EingabeStatement__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__EingabeStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EingabeStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__2"


    // $ANTLR start "rule__EingabeStatement__Group__2__Impl"
    // InternalMeth.g:3416:1: rule__EingabeStatement__Group__2__Impl : ( ( rule__EingabeStatement__EinheitAssignment_2 ) ) ;
    public final void rule__EingabeStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3420:1: ( ( ( rule__EingabeStatement__EinheitAssignment_2 ) ) )
            // InternalMeth.g:3421:1: ( ( rule__EingabeStatement__EinheitAssignment_2 ) )
            {
            // InternalMeth.g:3421:1: ( ( rule__EingabeStatement__EinheitAssignment_2 ) )
            // InternalMeth.g:3422:2: ( rule__EingabeStatement__EinheitAssignment_2 )
            {
             before(grammarAccess.getEingabeStatementAccess().getEinheitAssignment_2()); 
            // InternalMeth.g:3423:2: ( rule__EingabeStatement__EinheitAssignment_2 )
            // InternalMeth.g:3423:3: rule__EingabeStatement__EinheitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__EingabeStatement__EinheitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEingabeStatementAccess().getEinheitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__2__Impl"


    // $ANTLR start "rule__EingabeStatement__Group__3"
    // InternalMeth.g:3431:1: rule__EingabeStatement__Group__3 : rule__EingabeStatement__Group__3__Impl rule__EingabeStatement__Group__4 ;
    public final void rule__EingabeStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3435:1: ( rule__EingabeStatement__Group__3__Impl rule__EingabeStatement__Group__4 )
            // InternalMeth.g:3436:2: rule__EingabeStatement__Group__3__Impl rule__EingabeStatement__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__EingabeStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EingabeStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__3"


    // $ANTLR start "rule__EingabeStatement__Group__3__Impl"
    // InternalMeth.g:3443:1: rule__EingabeStatement__Group__3__Impl : ( ']' ) ;
    public final void rule__EingabeStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3447:1: ( ( ']' ) )
            // InternalMeth.g:3448:1: ( ']' )
            {
            // InternalMeth.g:3448:1: ( ']' )
            // InternalMeth.g:3449:2: ']'
            {
             before(grammarAccess.getEingabeStatementAccess().getRightSquareBracketKeyword_3()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEingabeStatementAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__3__Impl"


    // $ANTLR start "rule__EingabeStatement__Group__4"
    // InternalMeth.g:3458:1: rule__EingabeStatement__Group__4 : rule__EingabeStatement__Group__4__Impl rule__EingabeStatement__Group__5 ;
    public final void rule__EingabeStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3462:1: ( rule__EingabeStatement__Group__4__Impl rule__EingabeStatement__Group__5 )
            // InternalMeth.g:3463:2: rule__EingabeStatement__Group__4__Impl rule__EingabeStatement__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__EingabeStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EingabeStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__4"


    // $ANTLR start "rule__EingabeStatement__Group__4__Impl"
    // InternalMeth.g:3470:1: rule__EingabeStatement__Group__4__Impl : ( 'als' ) ;
    public final void rule__EingabeStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3474:1: ( ( 'als' ) )
            // InternalMeth.g:3475:1: ( 'als' )
            {
            // InternalMeth.g:3475:1: ( 'als' )
            // InternalMeth.g:3476:2: 'als'
            {
             before(grammarAccess.getEingabeStatementAccess().getAlsKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEingabeStatementAccess().getAlsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__4__Impl"


    // $ANTLR start "rule__EingabeStatement__Group__5"
    // InternalMeth.g:3485:1: rule__EingabeStatement__Group__5 : rule__EingabeStatement__Group__5__Impl rule__EingabeStatement__Group__6 ;
    public final void rule__EingabeStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3489:1: ( rule__EingabeStatement__Group__5__Impl rule__EingabeStatement__Group__6 )
            // InternalMeth.g:3490:2: rule__EingabeStatement__Group__5__Impl rule__EingabeStatement__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__EingabeStatement__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EingabeStatement__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__5"


    // $ANTLR start "rule__EingabeStatement__Group__5__Impl"
    // InternalMeth.g:3497:1: rule__EingabeStatement__Group__5__Impl : ( ( rule__EingabeStatement__BezeichnungAssignment_5 ) ) ;
    public final void rule__EingabeStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3501:1: ( ( ( rule__EingabeStatement__BezeichnungAssignment_5 ) ) )
            // InternalMeth.g:3502:1: ( ( rule__EingabeStatement__BezeichnungAssignment_5 ) )
            {
            // InternalMeth.g:3502:1: ( ( rule__EingabeStatement__BezeichnungAssignment_5 ) )
            // InternalMeth.g:3503:2: ( rule__EingabeStatement__BezeichnungAssignment_5 )
            {
             before(grammarAccess.getEingabeStatementAccess().getBezeichnungAssignment_5()); 
            // InternalMeth.g:3504:2: ( rule__EingabeStatement__BezeichnungAssignment_5 )
            // InternalMeth.g:3504:3: rule__EingabeStatement__BezeichnungAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__EingabeStatement__BezeichnungAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getEingabeStatementAccess().getBezeichnungAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__5__Impl"


    // $ANTLR start "rule__EingabeStatement__Group__6"
    // InternalMeth.g:3512:1: rule__EingabeStatement__Group__6 : rule__EingabeStatement__Group__6__Impl ;
    public final void rule__EingabeStatement__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3516:1: ( rule__EingabeStatement__Group__6__Impl )
            // InternalMeth.g:3517:2: rule__EingabeStatement__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EingabeStatement__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__6"


    // $ANTLR start "rule__EingabeStatement__Group__6__Impl"
    // InternalMeth.g:3523:1: rule__EingabeStatement__Group__6__Impl : ( ';' ) ;
    public final void rule__EingabeStatement__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3527:1: ( ( ';' ) )
            // InternalMeth.g:3528:1: ( ';' )
            {
            // InternalMeth.g:3528:1: ( ';' )
            // InternalMeth.g:3529:2: ';'
            {
             before(grammarAccess.getEingabeStatementAccess().getSemicolonKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEingabeStatementAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__Group__6__Impl"


    // $ANTLR start "rule__BerechnungStatement__Group__0"
    // InternalMeth.g:3539:1: rule__BerechnungStatement__Group__0 : rule__BerechnungStatement__Group__0__Impl rule__BerechnungStatement__Group__1 ;
    public final void rule__BerechnungStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3543:1: ( rule__BerechnungStatement__Group__0__Impl rule__BerechnungStatement__Group__1 )
            // InternalMeth.g:3544:2: rule__BerechnungStatement__Group__0__Impl rule__BerechnungStatement__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__BerechnungStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BerechnungStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__Group__0"


    // $ANTLR start "rule__BerechnungStatement__Group__0__Impl"
    // InternalMeth.g:3551:1: rule__BerechnungStatement__Group__0__Impl : ( ( rule__BerechnungStatement__BerechnungnameAssignment_0 ) ) ;
    public final void rule__BerechnungStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3555:1: ( ( ( rule__BerechnungStatement__BerechnungnameAssignment_0 ) ) )
            // InternalMeth.g:3556:1: ( ( rule__BerechnungStatement__BerechnungnameAssignment_0 ) )
            {
            // InternalMeth.g:3556:1: ( ( rule__BerechnungStatement__BerechnungnameAssignment_0 ) )
            // InternalMeth.g:3557:2: ( rule__BerechnungStatement__BerechnungnameAssignment_0 )
            {
             before(grammarAccess.getBerechnungStatementAccess().getBerechnungnameAssignment_0()); 
            // InternalMeth.g:3558:2: ( rule__BerechnungStatement__BerechnungnameAssignment_0 )
            // InternalMeth.g:3558:3: rule__BerechnungStatement__BerechnungnameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BerechnungStatement__BerechnungnameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBerechnungStatementAccess().getBerechnungnameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__Group__0__Impl"


    // $ANTLR start "rule__BerechnungStatement__Group__1"
    // InternalMeth.g:3566:1: rule__BerechnungStatement__Group__1 : rule__BerechnungStatement__Group__1__Impl rule__BerechnungStatement__Group__2 ;
    public final void rule__BerechnungStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3570:1: ( rule__BerechnungStatement__Group__1__Impl rule__BerechnungStatement__Group__2 )
            // InternalMeth.g:3571:2: rule__BerechnungStatement__Group__1__Impl rule__BerechnungStatement__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__BerechnungStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BerechnungStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__Group__1"


    // $ANTLR start "rule__BerechnungStatement__Group__1__Impl"
    // InternalMeth.g:3578:1: rule__BerechnungStatement__Group__1__Impl : ( '=' ) ;
    public final void rule__BerechnungStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3582:1: ( ( '=' ) )
            // InternalMeth.g:3583:1: ( '=' )
            {
            // InternalMeth.g:3583:1: ( '=' )
            // InternalMeth.g:3584:2: '='
            {
             before(grammarAccess.getBerechnungStatementAccess().getEqualsSignKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBerechnungStatementAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__Group__1__Impl"


    // $ANTLR start "rule__BerechnungStatement__Group__2"
    // InternalMeth.g:3593:1: rule__BerechnungStatement__Group__2 : rule__BerechnungStatement__Group__2__Impl rule__BerechnungStatement__Group__3 ;
    public final void rule__BerechnungStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3597:1: ( rule__BerechnungStatement__Group__2__Impl rule__BerechnungStatement__Group__3 )
            // InternalMeth.g:3598:2: rule__BerechnungStatement__Group__2__Impl rule__BerechnungStatement__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__BerechnungStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BerechnungStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__Group__2"


    // $ANTLR start "rule__BerechnungStatement__Group__2__Impl"
    // InternalMeth.g:3605:1: rule__BerechnungStatement__Group__2__Impl : ( ( rule__BerechnungStatement__FormelAssignment_2 ) ) ;
    public final void rule__BerechnungStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3609:1: ( ( ( rule__BerechnungStatement__FormelAssignment_2 ) ) )
            // InternalMeth.g:3610:1: ( ( rule__BerechnungStatement__FormelAssignment_2 ) )
            {
            // InternalMeth.g:3610:1: ( ( rule__BerechnungStatement__FormelAssignment_2 ) )
            // InternalMeth.g:3611:2: ( rule__BerechnungStatement__FormelAssignment_2 )
            {
             before(grammarAccess.getBerechnungStatementAccess().getFormelAssignment_2()); 
            // InternalMeth.g:3612:2: ( rule__BerechnungStatement__FormelAssignment_2 )
            // InternalMeth.g:3612:3: rule__BerechnungStatement__FormelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__BerechnungStatement__FormelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getBerechnungStatementAccess().getFormelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__Group__2__Impl"


    // $ANTLR start "rule__BerechnungStatement__Group__3"
    // InternalMeth.g:3620:1: rule__BerechnungStatement__Group__3 : rule__BerechnungStatement__Group__3__Impl rule__BerechnungStatement__Group__4 ;
    public final void rule__BerechnungStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3624:1: ( rule__BerechnungStatement__Group__3__Impl rule__BerechnungStatement__Group__4 )
            // InternalMeth.g:3625:2: rule__BerechnungStatement__Group__3__Impl rule__BerechnungStatement__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__BerechnungStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BerechnungStatement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__Group__3"


    // $ANTLR start "rule__BerechnungStatement__Group__3__Impl"
    // InternalMeth.g:3632:1: rule__BerechnungStatement__Group__3__Impl : ( 'als' ) ;
    public final void rule__BerechnungStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3636:1: ( ( 'als' ) )
            // InternalMeth.g:3637:1: ( 'als' )
            {
            // InternalMeth.g:3637:1: ( 'als' )
            // InternalMeth.g:3638:2: 'als'
            {
             before(grammarAccess.getBerechnungStatementAccess().getAlsKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getBerechnungStatementAccess().getAlsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__Group__3__Impl"


    // $ANTLR start "rule__BerechnungStatement__Group__4"
    // InternalMeth.g:3647:1: rule__BerechnungStatement__Group__4 : rule__BerechnungStatement__Group__4__Impl rule__BerechnungStatement__Group__5 ;
    public final void rule__BerechnungStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3651:1: ( rule__BerechnungStatement__Group__4__Impl rule__BerechnungStatement__Group__5 )
            // InternalMeth.g:3652:2: rule__BerechnungStatement__Group__4__Impl rule__BerechnungStatement__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__BerechnungStatement__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BerechnungStatement__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__Group__4"


    // $ANTLR start "rule__BerechnungStatement__Group__4__Impl"
    // InternalMeth.g:3659:1: rule__BerechnungStatement__Group__4__Impl : ( ( rule__BerechnungStatement__BezeichnungAssignment_4 ) ) ;
    public final void rule__BerechnungStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3663:1: ( ( ( rule__BerechnungStatement__BezeichnungAssignment_4 ) ) )
            // InternalMeth.g:3664:1: ( ( rule__BerechnungStatement__BezeichnungAssignment_4 ) )
            {
            // InternalMeth.g:3664:1: ( ( rule__BerechnungStatement__BezeichnungAssignment_4 ) )
            // InternalMeth.g:3665:2: ( rule__BerechnungStatement__BezeichnungAssignment_4 )
            {
             before(grammarAccess.getBerechnungStatementAccess().getBezeichnungAssignment_4()); 
            // InternalMeth.g:3666:2: ( rule__BerechnungStatement__BezeichnungAssignment_4 )
            // InternalMeth.g:3666:3: rule__BerechnungStatement__BezeichnungAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__BerechnungStatement__BezeichnungAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getBerechnungStatementAccess().getBezeichnungAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__Group__4__Impl"


    // $ANTLR start "rule__BerechnungStatement__Group__5"
    // InternalMeth.g:3674:1: rule__BerechnungStatement__Group__5 : rule__BerechnungStatement__Group__5__Impl ;
    public final void rule__BerechnungStatement__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3678:1: ( rule__BerechnungStatement__Group__5__Impl )
            // InternalMeth.g:3679:2: rule__BerechnungStatement__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BerechnungStatement__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__Group__5"


    // $ANTLR start "rule__BerechnungStatement__Group__5__Impl"
    // InternalMeth.g:3685:1: rule__BerechnungStatement__Group__5__Impl : ( ';' ) ;
    public final void rule__BerechnungStatement__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3689:1: ( ( ';' ) )
            // InternalMeth.g:3690:1: ( ';' )
            {
            // InternalMeth.g:3690:1: ( ';' )
            // InternalMeth.g:3691:2: ';'
            {
             before(grammarAccess.getBerechnungStatementAccess().getSemicolonKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getBerechnungStatementAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__Group__5__Impl"


    // $ANTLR start "rule__AusgabeStatement__Group__0"
    // InternalMeth.g:3701:1: rule__AusgabeStatement__Group__0 : rule__AusgabeStatement__Group__0__Impl rule__AusgabeStatement__Group__1 ;
    public final void rule__AusgabeStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3705:1: ( rule__AusgabeStatement__Group__0__Impl rule__AusgabeStatement__Group__1 )
            // InternalMeth.g:3706:2: rule__AusgabeStatement__Group__0__Impl rule__AusgabeStatement__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__AusgabeStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AusgabeStatement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group__0"


    // $ANTLR start "rule__AusgabeStatement__Group__0__Impl"
    // InternalMeth.g:3713:1: rule__AusgabeStatement__Group__0__Impl : ( ( rule__AusgabeStatement__AusgabenameAssignment_0 ) ) ;
    public final void rule__AusgabeStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3717:1: ( ( ( rule__AusgabeStatement__AusgabenameAssignment_0 ) ) )
            // InternalMeth.g:3718:1: ( ( rule__AusgabeStatement__AusgabenameAssignment_0 ) )
            {
            // InternalMeth.g:3718:1: ( ( rule__AusgabeStatement__AusgabenameAssignment_0 ) )
            // InternalMeth.g:3719:2: ( rule__AusgabeStatement__AusgabenameAssignment_0 )
            {
             before(grammarAccess.getAusgabeStatementAccess().getAusgabenameAssignment_0()); 
            // InternalMeth.g:3720:2: ( rule__AusgabeStatement__AusgabenameAssignment_0 )
            // InternalMeth.g:3720:3: rule__AusgabeStatement__AusgabenameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AusgabeStatement__AusgabenameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAusgabeStatementAccess().getAusgabenameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group__0__Impl"


    // $ANTLR start "rule__AusgabeStatement__Group__1"
    // InternalMeth.g:3728:1: rule__AusgabeStatement__Group__1 : rule__AusgabeStatement__Group__1__Impl rule__AusgabeStatement__Group__2 ;
    public final void rule__AusgabeStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3732:1: ( rule__AusgabeStatement__Group__1__Impl rule__AusgabeStatement__Group__2 )
            // InternalMeth.g:3733:2: rule__AusgabeStatement__Group__1__Impl rule__AusgabeStatement__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__AusgabeStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AusgabeStatement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group__1"


    // $ANTLR start "rule__AusgabeStatement__Group__1__Impl"
    // InternalMeth.g:3740:1: rule__AusgabeStatement__Group__1__Impl : ( ( rule__AusgabeStatement__Group_1__0 )? ) ;
    public final void rule__AusgabeStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3744:1: ( ( ( rule__AusgabeStatement__Group_1__0 )? ) )
            // InternalMeth.g:3745:1: ( ( rule__AusgabeStatement__Group_1__0 )? )
            {
            // InternalMeth.g:3745:1: ( ( rule__AusgabeStatement__Group_1__0 )? )
            // InternalMeth.g:3746:2: ( rule__AusgabeStatement__Group_1__0 )?
            {
             before(grammarAccess.getAusgabeStatementAccess().getGroup_1()); 
            // InternalMeth.g:3747:2: ( rule__AusgabeStatement__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMeth.g:3747:3: rule__AusgabeStatement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AusgabeStatement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAusgabeStatementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group__1__Impl"


    // $ANTLR start "rule__AusgabeStatement__Group__2"
    // InternalMeth.g:3755:1: rule__AusgabeStatement__Group__2 : rule__AusgabeStatement__Group__2__Impl rule__AusgabeStatement__Group__3 ;
    public final void rule__AusgabeStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3759:1: ( rule__AusgabeStatement__Group__2__Impl rule__AusgabeStatement__Group__3 )
            // InternalMeth.g:3760:2: rule__AusgabeStatement__Group__2__Impl rule__AusgabeStatement__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__AusgabeStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AusgabeStatement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group__2"


    // $ANTLR start "rule__AusgabeStatement__Group__2__Impl"
    // InternalMeth.g:3767:1: rule__AusgabeStatement__Group__2__Impl : ( ( rule__AusgabeStatement__Group_2__0 )? ) ;
    public final void rule__AusgabeStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3771:1: ( ( ( rule__AusgabeStatement__Group_2__0 )? ) )
            // InternalMeth.g:3772:1: ( ( rule__AusgabeStatement__Group_2__0 )? )
            {
            // InternalMeth.g:3772:1: ( ( rule__AusgabeStatement__Group_2__0 )? )
            // InternalMeth.g:3773:2: ( rule__AusgabeStatement__Group_2__0 )?
            {
             before(grammarAccess.getAusgabeStatementAccess().getGroup_2()); 
            // InternalMeth.g:3774:2: ( rule__AusgabeStatement__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMeth.g:3774:3: rule__AusgabeStatement__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AusgabeStatement__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAusgabeStatementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group__2__Impl"


    // $ANTLR start "rule__AusgabeStatement__Group__3"
    // InternalMeth.g:3782:1: rule__AusgabeStatement__Group__3 : rule__AusgabeStatement__Group__3__Impl ;
    public final void rule__AusgabeStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3786:1: ( rule__AusgabeStatement__Group__3__Impl )
            // InternalMeth.g:3787:2: rule__AusgabeStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AusgabeStatement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group__3"


    // $ANTLR start "rule__AusgabeStatement__Group__3__Impl"
    // InternalMeth.g:3793:1: rule__AusgabeStatement__Group__3__Impl : ( ';' ) ;
    public final void rule__AusgabeStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3797:1: ( ( ';' ) )
            // InternalMeth.g:3798:1: ( ';' )
            {
            // InternalMeth.g:3798:1: ( ';' )
            // InternalMeth.g:3799:2: ';'
            {
             before(grammarAccess.getAusgabeStatementAccess().getSemicolonKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAusgabeStatementAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group__3__Impl"


    // $ANTLR start "rule__AusgabeStatement__Group_1__0"
    // InternalMeth.g:3809:1: rule__AusgabeStatement__Group_1__0 : rule__AusgabeStatement__Group_1__0__Impl rule__AusgabeStatement__Group_1__1 ;
    public final void rule__AusgabeStatement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3813:1: ( rule__AusgabeStatement__Group_1__0__Impl rule__AusgabeStatement__Group_1__1 )
            // InternalMeth.g:3814:2: rule__AusgabeStatement__Group_1__0__Impl rule__AusgabeStatement__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__AusgabeStatement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AusgabeStatement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group_1__0"


    // $ANTLR start "rule__AusgabeStatement__Group_1__0__Impl"
    // InternalMeth.g:3821:1: rule__AusgabeStatement__Group_1__0__Impl : ( '[' ) ;
    public final void rule__AusgabeStatement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3825:1: ( ( '[' ) )
            // InternalMeth.g:3826:1: ( '[' )
            {
            // InternalMeth.g:3826:1: ( '[' )
            // InternalMeth.g:3827:2: '['
            {
             before(grammarAccess.getAusgabeStatementAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAusgabeStatementAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group_1__0__Impl"


    // $ANTLR start "rule__AusgabeStatement__Group_1__1"
    // InternalMeth.g:3836:1: rule__AusgabeStatement__Group_1__1 : rule__AusgabeStatement__Group_1__1__Impl rule__AusgabeStatement__Group_1__2 ;
    public final void rule__AusgabeStatement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3840:1: ( rule__AusgabeStatement__Group_1__1__Impl rule__AusgabeStatement__Group_1__2 )
            // InternalMeth.g:3841:2: rule__AusgabeStatement__Group_1__1__Impl rule__AusgabeStatement__Group_1__2
            {
            pushFollow(FOLLOW_29);
            rule__AusgabeStatement__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AusgabeStatement__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group_1__1"


    // $ANTLR start "rule__AusgabeStatement__Group_1__1__Impl"
    // InternalMeth.g:3848:1: rule__AusgabeStatement__Group_1__1__Impl : ( ( rule__AusgabeStatement__EinheitAssignment_1_1 ) ) ;
    public final void rule__AusgabeStatement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3852:1: ( ( ( rule__AusgabeStatement__EinheitAssignment_1_1 ) ) )
            // InternalMeth.g:3853:1: ( ( rule__AusgabeStatement__EinheitAssignment_1_1 ) )
            {
            // InternalMeth.g:3853:1: ( ( rule__AusgabeStatement__EinheitAssignment_1_1 ) )
            // InternalMeth.g:3854:2: ( rule__AusgabeStatement__EinheitAssignment_1_1 )
            {
             before(grammarAccess.getAusgabeStatementAccess().getEinheitAssignment_1_1()); 
            // InternalMeth.g:3855:2: ( rule__AusgabeStatement__EinheitAssignment_1_1 )
            // InternalMeth.g:3855:3: rule__AusgabeStatement__EinheitAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AusgabeStatement__EinheitAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAusgabeStatementAccess().getEinheitAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group_1__1__Impl"


    // $ANTLR start "rule__AusgabeStatement__Group_1__2"
    // InternalMeth.g:3863:1: rule__AusgabeStatement__Group_1__2 : rule__AusgabeStatement__Group_1__2__Impl ;
    public final void rule__AusgabeStatement__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3867:1: ( rule__AusgabeStatement__Group_1__2__Impl )
            // InternalMeth.g:3868:2: rule__AusgabeStatement__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AusgabeStatement__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group_1__2"


    // $ANTLR start "rule__AusgabeStatement__Group_1__2__Impl"
    // InternalMeth.g:3874:1: rule__AusgabeStatement__Group_1__2__Impl : ( ']' ) ;
    public final void rule__AusgabeStatement__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3878:1: ( ( ']' ) )
            // InternalMeth.g:3879:1: ( ']' )
            {
            // InternalMeth.g:3879:1: ( ']' )
            // InternalMeth.g:3880:2: ']'
            {
             before(grammarAccess.getAusgabeStatementAccess().getRightSquareBracketKeyword_1_2()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAusgabeStatementAccess().getRightSquareBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group_1__2__Impl"


    // $ANTLR start "rule__AusgabeStatement__Group_2__0"
    // InternalMeth.g:3890:1: rule__AusgabeStatement__Group_2__0 : rule__AusgabeStatement__Group_2__0__Impl rule__AusgabeStatement__Group_2__1 ;
    public final void rule__AusgabeStatement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3894:1: ( rule__AusgabeStatement__Group_2__0__Impl rule__AusgabeStatement__Group_2__1 )
            // InternalMeth.g:3895:2: rule__AusgabeStatement__Group_2__0__Impl rule__AusgabeStatement__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__AusgabeStatement__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AusgabeStatement__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group_2__0"


    // $ANTLR start "rule__AusgabeStatement__Group_2__0__Impl"
    // InternalMeth.g:3902:1: rule__AusgabeStatement__Group_2__0__Impl : ( 'als' ) ;
    public final void rule__AusgabeStatement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3906:1: ( ( 'als' ) )
            // InternalMeth.g:3907:1: ( 'als' )
            {
            // InternalMeth.g:3907:1: ( 'als' )
            // InternalMeth.g:3908:2: 'als'
            {
             before(grammarAccess.getAusgabeStatementAccess().getAlsKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getAusgabeStatementAccess().getAlsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group_2__0__Impl"


    // $ANTLR start "rule__AusgabeStatement__Group_2__1"
    // InternalMeth.g:3917:1: rule__AusgabeStatement__Group_2__1 : rule__AusgabeStatement__Group_2__1__Impl ;
    public final void rule__AusgabeStatement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3921:1: ( rule__AusgabeStatement__Group_2__1__Impl )
            // InternalMeth.g:3922:2: rule__AusgabeStatement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AusgabeStatement__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group_2__1"


    // $ANTLR start "rule__AusgabeStatement__Group_2__1__Impl"
    // InternalMeth.g:3928:1: rule__AusgabeStatement__Group_2__1__Impl : ( ( rule__AusgabeStatement__BezeichnungAssignment_2_1 ) ) ;
    public final void rule__AusgabeStatement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3932:1: ( ( ( rule__AusgabeStatement__BezeichnungAssignment_2_1 ) ) )
            // InternalMeth.g:3933:1: ( ( rule__AusgabeStatement__BezeichnungAssignment_2_1 ) )
            {
            // InternalMeth.g:3933:1: ( ( rule__AusgabeStatement__BezeichnungAssignment_2_1 ) )
            // InternalMeth.g:3934:2: ( rule__AusgabeStatement__BezeichnungAssignment_2_1 )
            {
             before(grammarAccess.getAusgabeStatementAccess().getBezeichnungAssignment_2_1()); 
            // InternalMeth.g:3935:2: ( rule__AusgabeStatement__BezeichnungAssignment_2_1 )
            // InternalMeth.g:3935:3: rule__AusgabeStatement__BezeichnungAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AusgabeStatement__BezeichnungAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAusgabeStatementAccess().getBezeichnungAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__Group_2__1__Impl"


    // $ANTLR start "rule__Model__EinheitensystemAssignment_0"
    // InternalMeth.g:3944:1: rule__Model__EinheitensystemAssignment_0 : ( ruleEinheitensystem ) ;
    public final void rule__Model__EinheitensystemAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3948:1: ( ( ruleEinheitensystem ) )
            // InternalMeth.g:3949:2: ( ruleEinheitensystem )
            {
            // InternalMeth.g:3949:2: ( ruleEinheitensystem )
            // InternalMeth.g:3950:3: ruleEinheitensystem
            {
             before(grammarAccess.getModelAccess().getEinheitensystemEinheitensystemParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEinheitensystem();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEinheitensystemEinheitensystemParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EinheitensystemAssignment_0"


    // $ANTLR start "rule__Model__MethodenAssignment_1"
    // InternalMeth.g:3959:1: rule__Model__MethodenAssignment_1 : ( ruleMethode ) ;
    public final void rule__Model__MethodenAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3963:1: ( ( ruleMethode ) )
            // InternalMeth.g:3964:2: ( ruleMethode )
            {
            // InternalMeth.g:3964:2: ( ruleMethode )
            // InternalMeth.g:3965:3: ruleMethode
            {
             before(grammarAccess.getModelAccess().getMethodenMethodeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMethode();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMethodenMethodeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MethodenAssignment_1"


    // $ANTLR start "rule__Einheitensystem__DeklarationenAssignment_3"
    // InternalMeth.g:3974:1: rule__Einheitensystem__DeklarationenAssignment_3 : ( ruleDeklaration ) ;
    public final void rule__Einheitensystem__DeklarationenAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3978:1: ( ( ruleDeklaration ) )
            // InternalMeth.g:3979:2: ( ruleDeklaration )
            {
            // InternalMeth.g:3979:2: ( ruleDeklaration )
            // InternalMeth.g:3980:3: ruleDeklaration
            {
             before(grammarAccess.getEinheitensystemAccess().getDeklarationenDeklarationParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDeklaration();

            state._fsp--;

             after(grammarAccess.getEinheitensystemAccess().getDeklarationenDeklarationParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheitensystem__DeklarationenAssignment_3"


    // $ANTLR start "rule__Dimension__NameAssignment_1"
    // InternalMeth.g:3989:1: rule__Dimension__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Dimension__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:3993:1: ( ( RULE_ID ) )
            // InternalMeth.g:3994:2: ( RULE_ID )
            {
            // InternalMeth.g:3994:2: ( RULE_ID )
            // InternalMeth.g:3995:3: RULE_ID
            {
             before(grammarAccess.getDimensionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDimensionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__NameAssignment_1"


    // $ANTLR start "rule__Dimension__BasisAssignment_2_1"
    // InternalMeth.g:4004:1: rule__Dimension__BasisAssignment_2_1 : ( ruleDimensionMultiplikation ) ;
    public final void rule__Dimension__BasisAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4008:1: ( ( ruleDimensionMultiplikation ) )
            // InternalMeth.g:4009:2: ( ruleDimensionMultiplikation )
            {
            // InternalMeth.g:4009:2: ( ruleDimensionMultiplikation )
            // InternalMeth.g:4010:3: ruleDimensionMultiplikation
            {
             before(grammarAccess.getDimensionAccess().getBasisDimensionMultiplikationParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDimensionMultiplikation();

            state._fsp--;

             after(grammarAccess.getDimensionAccess().getBasisDimensionMultiplikationParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dimension__BasisAssignment_2_1"


    // $ANTLR start "rule__DimensionMultiplikation__OperatorAssignment_1_1"
    // InternalMeth.g:4019:1: rule__DimensionMultiplikation__OperatorAssignment_1_1 : ( ( rule__DimensionMultiplikation__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__DimensionMultiplikation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4023:1: ( ( ( rule__DimensionMultiplikation__OperatorAlternatives_1_1_0 ) ) )
            // InternalMeth.g:4024:2: ( ( rule__DimensionMultiplikation__OperatorAlternatives_1_1_0 ) )
            {
            // InternalMeth.g:4024:2: ( ( rule__DimensionMultiplikation__OperatorAlternatives_1_1_0 ) )
            // InternalMeth.g:4025:3: ( rule__DimensionMultiplikation__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getDimensionMultiplikationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalMeth.g:4026:3: ( rule__DimensionMultiplikation__OperatorAlternatives_1_1_0 )
            // InternalMeth.g:4026:4: rule__DimensionMultiplikation__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DimensionMultiplikation__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDimensionMultiplikationAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionMultiplikation__OperatorAssignment_1_1"


    // $ANTLR start "rule__DimensionMultiplikation__RechtsAssignment_1_2"
    // InternalMeth.g:4034:1: rule__DimensionMultiplikation__RechtsAssignment_1_2 : ( ruleDimensionPrimary ) ;
    public final void rule__DimensionMultiplikation__RechtsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4038:1: ( ( ruleDimensionPrimary ) )
            // InternalMeth.g:4039:2: ( ruleDimensionPrimary )
            {
            // InternalMeth.g:4039:2: ( ruleDimensionPrimary )
            // InternalMeth.g:4040:3: ruleDimensionPrimary
            {
             before(grammarAccess.getDimensionMultiplikationAccess().getRechtsDimensionPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDimensionPrimary();

            state._fsp--;

             after(grammarAccess.getDimensionMultiplikationAccess().getRechtsDimensionPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionMultiplikation__RechtsAssignment_1_2"


    // $ANTLR start "rule__DimensionPrimary__RefAssignment_1"
    // InternalMeth.g:4049:1: rule__DimensionPrimary__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DimensionPrimary__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4053:1: ( ( ( RULE_ID ) ) )
            // InternalMeth.g:4054:2: ( ( RULE_ID ) )
            {
            // InternalMeth.g:4054:2: ( ( RULE_ID ) )
            // InternalMeth.g:4055:3: ( RULE_ID )
            {
             before(grammarAccess.getDimensionPrimaryAccess().getRefDimensionCrossReference_1_0()); 
            // InternalMeth.g:4056:3: ( RULE_ID )
            // InternalMeth.g:4057:4: RULE_ID
            {
             before(grammarAccess.getDimensionPrimaryAccess().getRefDimensionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDimensionPrimaryAccess().getRefDimensionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDimensionPrimaryAccess().getRefDimensionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DimensionPrimary__RefAssignment_1"


    // $ANTLR start "rule__Einheit__NameAssignment_1"
    // InternalMeth.g:4068:1: rule__Einheit__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Einheit__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4072:1: ( ( RULE_ID ) )
            // InternalMeth.g:4073:2: ( RULE_ID )
            {
            // InternalMeth.g:4073:2: ( RULE_ID )
            // InternalMeth.g:4074:3: RULE_ID
            {
             before(grammarAccess.getEinheitAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEinheitAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__NameAssignment_1"


    // $ANTLR start "rule__Einheit__RefAssignment_2_0_1"
    // InternalMeth.g:4083:1: rule__Einheit__RefAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__Einheit__RefAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4087:1: ( ( ( RULE_ID ) ) )
            // InternalMeth.g:4088:2: ( ( RULE_ID ) )
            {
            // InternalMeth.g:4088:2: ( ( RULE_ID ) )
            // InternalMeth.g:4089:3: ( RULE_ID )
            {
             before(grammarAccess.getEinheitAccess().getRefDimensionCrossReference_2_0_1_0()); 
            // InternalMeth.g:4090:3: ( RULE_ID )
            // InternalMeth.g:4091:4: RULE_ID
            {
             before(grammarAccess.getEinheitAccess().getRefDimensionIDTerminalRuleCall_2_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEinheitAccess().getRefDimensionIDTerminalRuleCall_2_0_1_0_1()); 

            }

             after(grammarAccess.getEinheitAccess().getRefDimensionCrossReference_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__RefAssignment_2_0_1"


    // $ANTLR start "rule__Einheit__FaktorAssignment_2_1_1"
    // InternalMeth.g:4102:1: rule__Einheit__FaktorAssignment_2_1_1 : ( ruleEinheitMultiplikation ) ;
    public final void rule__Einheit__FaktorAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4106:1: ( ( ruleEinheitMultiplikation ) )
            // InternalMeth.g:4107:2: ( ruleEinheitMultiplikation )
            {
            // InternalMeth.g:4107:2: ( ruleEinheitMultiplikation )
            // InternalMeth.g:4108:3: ruleEinheitMultiplikation
            {
             before(grammarAccess.getEinheitAccess().getFaktorEinheitMultiplikationParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEinheitMultiplikation();

            state._fsp--;

             after(grammarAccess.getEinheitAccess().getFaktorEinheitMultiplikationParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__FaktorAssignment_2_1_1"


    // $ANTLR start "rule__Einheit__BasiseinheitAssignment_2_1_2"
    // InternalMeth.g:4117:1: rule__Einheit__BasiseinheitAssignment_2_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Einheit__BasiseinheitAssignment_2_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4121:1: ( ( ( RULE_ID ) ) )
            // InternalMeth.g:4122:2: ( ( RULE_ID ) )
            {
            // InternalMeth.g:4122:2: ( ( RULE_ID ) )
            // InternalMeth.g:4123:3: ( RULE_ID )
            {
             before(grammarAccess.getEinheitAccess().getBasiseinheitEinheitCrossReference_2_1_2_0()); 
            // InternalMeth.g:4124:3: ( RULE_ID )
            // InternalMeth.g:4125:4: RULE_ID
            {
             before(grammarAccess.getEinheitAccess().getBasiseinheitEinheitIDTerminalRuleCall_2_1_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEinheitAccess().getBasiseinheitEinheitIDTerminalRuleCall_2_1_2_0_1()); 

            }

             after(grammarAccess.getEinheitAccess().getBasiseinheitEinheitCrossReference_2_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Einheit__BasiseinheitAssignment_2_1_2"


    // $ANTLR start "rule__Umrechnung__VarnameAssignment_1"
    // InternalMeth.g:4136:1: rule__Umrechnung__VarnameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Umrechnung__VarnameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4140:1: ( ( RULE_ID ) )
            // InternalMeth.g:4141:2: ( RULE_ID )
            {
            // InternalMeth.g:4141:2: ( RULE_ID )
            // InternalMeth.g:4142:3: RULE_ID
            {
             before(grammarAccess.getUmrechnungAccess().getVarnameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUmrechnungAccess().getVarnameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__VarnameAssignment_1"


    // $ANTLR start "rule__Umrechnung__VonEinheitAssignment_2"
    // InternalMeth.g:4151:1: rule__Umrechnung__VonEinheitAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Umrechnung__VonEinheitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4155:1: ( ( ( RULE_ID ) ) )
            // InternalMeth.g:4156:2: ( ( RULE_ID ) )
            {
            // InternalMeth.g:4156:2: ( ( RULE_ID ) )
            // InternalMeth.g:4157:3: ( RULE_ID )
            {
             before(grammarAccess.getUmrechnungAccess().getVonEinheitEinheitCrossReference_2_0()); 
            // InternalMeth.g:4158:3: ( RULE_ID )
            // InternalMeth.g:4159:4: RULE_ID
            {
             before(grammarAccess.getUmrechnungAccess().getVonEinheitEinheitIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUmrechnungAccess().getVonEinheitEinheitIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getUmrechnungAccess().getVonEinheitEinheitCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__VonEinheitAssignment_2"


    // $ANTLR start "rule__Umrechnung__AusdruckAssignment_4"
    // InternalMeth.g:4170:1: rule__Umrechnung__AusdruckAssignment_4 : ( ruleEinheitAddition ) ;
    public final void rule__Umrechnung__AusdruckAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4174:1: ( ( ruleEinheitAddition ) )
            // InternalMeth.g:4175:2: ( ruleEinheitAddition )
            {
            // InternalMeth.g:4175:2: ( ruleEinheitAddition )
            // InternalMeth.g:4176:3: ruleEinheitAddition
            {
             before(grammarAccess.getUmrechnungAccess().getAusdruckEinheitAdditionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEinheitAddition();

            state._fsp--;

             after(grammarAccess.getUmrechnungAccess().getAusdruckEinheitAdditionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__AusdruckAssignment_4"


    // $ANTLR start "rule__Umrechnung__NachEinheitAssignment_5"
    // InternalMeth.g:4185:1: rule__Umrechnung__NachEinheitAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Umrechnung__NachEinheitAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4189:1: ( ( ( RULE_ID ) ) )
            // InternalMeth.g:4190:2: ( ( RULE_ID ) )
            {
            // InternalMeth.g:4190:2: ( ( RULE_ID ) )
            // InternalMeth.g:4191:3: ( RULE_ID )
            {
             before(grammarAccess.getUmrechnungAccess().getNachEinheitEinheitCrossReference_5_0()); 
            // InternalMeth.g:4192:3: ( RULE_ID )
            // InternalMeth.g:4193:4: RULE_ID
            {
             before(grammarAccess.getUmrechnungAccess().getNachEinheitEinheitIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getUmrechnungAccess().getNachEinheitEinheitIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getUmrechnungAccess().getNachEinheitEinheitCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Umrechnung__NachEinheitAssignment_5"


    // $ANTLR start "rule__Konstante__NameAssignment_1"
    // InternalMeth.g:4204:1: rule__Konstante__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Konstante__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4208:1: ( ( RULE_ID ) )
            // InternalMeth.g:4209:2: ( RULE_ID )
            {
            // InternalMeth.g:4209:2: ( RULE_ID )
            // InternalMeth.g:4210:3: RULE_ID
            {
             before(grammarAccess.getKonstanteAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getKonstanteAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Konstante__NameAssignment_1"


    // $ANTLR start "rule__Konstante__AusdruckAssignment_3"
    // InternalMeth.g:4219:1: rule__Konstante__AusdruckAssignment_3 : ( ruleEinheitAddition ) ;
    public final void rule__Konstante__AusdruckAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4223:1: ( ( ruleEinheitAddition ) )
            // InternalMeth.g:4224:2: ( ruleEinheitAddition )
            {
            // InternalMeth.g:4224:2: ( ruleEinheitAddition )
            // InternalMeth.g:4225:3: ruleEinheitAddition
            {
             before(grammarAccess.getKonstanteAccess().getAusdruckEinheitAdditionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEinheitAddition();

            state._fsp--;

             after(grammarAccess.getKonstanteAccess().getAusdruckEinheitAdditionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Konstante__AusdruckAssignment_3"


    // $ANTLR start "rule__Ganzzahl__IwertAssignment"
    // InternalMeth.g:4234:1: rule__Ganzzahl__IwertAssignment : ( RULE_GANZ ) ;
    public final void rule__Ganzzahl__IwertAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4238:1: ( ( RULE_GANZ ) )
            // InternalMeth.g:4239:2: ( RULE_GANZ )
            {
            // InternalMeth.g:4239:2: ( RULE_GANZ )
            // InternalMeth.g:4240:3: RULE_GANZ
            {
             before(grammarAccess.getGanzzahlAccess().getIwertGANZTerminalRuleCall_0()); 
            match(input,RULE_GANZ,FOLLOW_2); 
             after(grammarAccess.getGanzzahlAccess().getIwertGANZTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ganzzahl__IwertAssignment"


    // $ANTLR start "rule__Dezimalzahl__FwertAssignment"
    // InternalMeth.g:4249:1: rule__Dezimalzahl__FwertAssignment : ( RULE_DEZIMAL ) ;
    public final void rule__Dezimalzahl__FwertAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4253:1: ( ( RULE_DEZIMAL ) )
            // InternalMeth.g:4254:2: ( RULE_DEZIMAL )
            {
            // InternalMeth.g:4254:2: ( RULE_DEZIMAL )
            // InternalMeth.g:4255:3: RULE_DEZIMAL
            {
             before(grammarAccess.getDezimalzahlAccess().getFwertDEZIMALTerminalRuleCall_0()); 
            match(input,RULE_DEZIMAL,FOLLOW_2); 
             after(grammarAccess.getDezimalzahlAccess().getFwertDEZIMALTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Dezimalzahl__FwertAssignment"


    // $ANTLR start "rule__EinheitAddition__OperatorAssignment_1_1"
    // InternalMeth.g:4264:1: rule__EinheitAddition__OperatorAssignment_1_1 : ( ( rule__EinheitAddition__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__EinheitAddition__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4268:1: ( ( ( rule__EinheitAddition__OperatorAlternatives_1_1_0 ) ) )
            // InternalMeth.g:4269:2: ( ( rule__EinheitAddition__OperatorAlternatives_1_1_0 ) )
            {
            // InternalMeth.g:4269:2: ( ( rule__EinheitAddition__OperatorAlternatives_1_1_0 ) )
            // InternalMeth.g:4270:3: ( rule__EinheitAddition__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getEinheitAdditionAccess().getOperatorAlternatives_1_1_0()); 
            // InternalMeth.g:4271:3: ( rule__EinheitAddition__OperatorAlternatives_1_1_0 )
            // InternalMeth.g:4271:4: rule__EinheitAddition__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EinheitAddition__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEinheitAdditionAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitAddition__OperatorAssignment_1_1"


    // $ANTLR start "rule__EinheitAddition__RechtsAssignment_1_2"
    // InternalMeth.g:4279:1: rule__EinheitAddition__RechtsAssignment_1_2 : ( ruleEinheitMultiplikation ) ;
    public final void rule__EinheitAddition__RechtsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4283:1: ( ( ruleEinheitMultiplikation ) )
            // InternalMeth.g:4284:2: ( ruleEinheitMultiplikation )
            {
            // InternalMeth.g:4284:2: ( ruleEinheitMultiplikation )
            // InternalMeth.g:4285:3: ruleEinheitMultiplikation
            {
             before(grammarAccess.getEinheitAdditionAccess().getRechtsEinheitMultiplikationParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEinheitMultiplikation();

            state._fsp--;

             after(grammarAccess.getEinheitAdditionAccess().getRechtsEinheitMultiplikationParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitAddition__RechtsAssignment_1_2"


    // $ANTLR start "rule__EinheitMultiplikation__OperatorAssignment_1_1"
    // InternalMeth.g:4294:1: rule__EinheitMultiplikation__OperatorAssignment_1_1 : ( ( rule__EinheitMultiplikation__OperatorAlternatives_1_1_0 ) ) ;
    public final void rule__EinheitMultiplikation__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4298:1: ( ( ( rule__EinheitMultiplikation__OperatorAlternatives_1_1_0 ) ) )
            // InternalMeth.g:4299:2: ( ( rule__EinheitMultiplikation__OperatorAlternatives_1_1_0 ) )
            {
            // InternalMeth.g:4299:2: ( ( rule__EinheitMultiplikation__OperatorAlternatives_1_1_0 ) )
            // InternalMeth.g:4300:3: ( rule__EinheitMultiplikation__OperatorAlternatives_1_1_0 )
            {
             before(grammarAccess.getEinheitMultiplikationAccess().getOperatorAlternatives_1_1_0()); 
            // InternalMeth.g:4301:3: ( rule__EinheitMultiplikation__OperatorAlternatives_1_1_0 )
            // InternalMeth.g:4301:4: rule__EinheitMultiplikation__OperatorAlternatives_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__EinheitMultiplikation__OperatorAlternatives_1_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEinheitMultiplikationAccess().getOperatorAlternatives_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitMultiplikation__OperatorAssignment_1_1"


    // $ANTLR start "rule__EinheitMultiplikation__RechtsAssignment_1_2"
    // InternalMeth.g:4309:1: rule__EinheitMultiplikation__RechtsAssignment_1_2 : ( ruleEinheitPrimary ) ;
    public final void rule__EinheitMultiplikation__RechtsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4313:1: ( ( ruleEinheitPrimary ) )
            // InternalMeth.g:4314:2: ( ruleEinheitPrimary )
            {
            // InternalMeth.g:4314:2: ( ruleEinheitPrimary )
            // InternalMeth.g:4315:3: ruleEinheitPrimary
            {
             before(grammarAccess.getEinheitMultiplikationAccess().getRechtsEinheitPrimaryParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEinheitPrimary();

            state._fsp--;

             after(grammarAccess.getEinheitMultiplikationAccess().getRechtsEinheitPrimaryParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitMultiplikation__RechtsAssignment_1_2"


    // $ANTLR start "rule__EinheitPrimary__VarrefAssignment_1"
    // InternalMeth.g:4324:1: rule__EinheitPrimary__VarrefAssignment_1 : ( RULE_ID ) ;
    public final void rule__EinheitPrimary__VarrefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4328:1: ( ( RULE_ID ) )
            // InternalMeth.g:4329:2: ( RULE_ID )
            {
            // InternalMeth.g:4329:2: ( RULE_ID )
            // InternalMeth.g:4330:3: RULE_ID
            {
             before(grammarAccess.getEinheitPrimaryAccess().getVarrefIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEinheitPrimaryAccess().getVarrefIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EinheitPrimary__VarrefAssignment_1"


    // $ANTLR start "rule__Methode__NameAssignment_1"
    // InternalMeth.g:4339:1: rule__Methode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Methode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4343:1: ( ( RULE_ID ) )
            // InternalMeth.g:4344:2: ( RULE_ID )
            {
            // InternalMeth.g:4344:2: ( RULE_ID )
            // InternalMeth.g:4345:3: RULE_ID
            {
             before(grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__NameAssignment_1"


    // $ANTLR start "rule__Methode__BezeichnungAssignment_3"
    // InternalMeth.g:4354:1: rule__Methode__BezeichnungAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Methode__BezeichnungAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4358:1: ( ( RULE_STRING ) )
            // InternalMeth.g:4359:2: ( RULE_STRING )
            {
            // InternalMeth.g:4359:2: ( RULE_STRING )
            // InternalMeth.g:4360:3: RULE_STRING
            {
             before(grammarAccess.getMethodeAccess().getBezeichnungSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMethodeAccess().getBezeichnungSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__BezeichnungAssignment_3"


    // $ANTLR start "rule__Methode__AblaufAssignment_5"
    // InternalMeth.g:4369:1: rule__Methode__AblaufAssignment_5 : ( ( rule__Methode__AblaufAlternatives_5_0 ) ) ;
    public final void rule__Methode__AblaufAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4373:1: ( ( ( rule__Methode__AblaufAlternatives_5_0 ) ) )
            // InternalMeth.g:4374:2: ( ( rule__Methode__AblaufAlternatives_5_0 ) )
            {
            // InternalMeth.g:4374:2: ( ( rule__Methode__AblaufAlternatives_5_0 ) )
            // InternalMeth.g:4375:3: ( rule__Methode__AblaufAlternatives_5_0 )
            {
             before(grammarAccess.getMethodeAccess().getAblaufAlternatives_5_0()); 
            // InternalMeth.g:4376:3: ( rule__Methode__AblaufAlternatives_5_0 )
            // InternalMeth.g:4376:4: rule__Methode__AblaufAlternatives_5_0
            {
            pushFollow(FOLLOW_2);
            rule__Methode__AblaufAlternatives_5_0();

            state._fsp--;


            }

             after(grammarAccess.getMethodeAccess().getAblaufAlternatives_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Methode__AblaufAssignment_5"


    // $ANTLR start "rule__Gegeben__StatementsAssignment_2"
    // InternalMeth.g:4384:1: rule__Gegeben__StatementsAssignment_2 : ( ruleGegebenStatement ) ;
    public final void rule__Gegeben__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4388:1: ( ( ruleGegebenStatement ) )
            // InternalMeth.g:4389:2: ( ruleGegebenStatement )
            {
            // InternalMeth.g:4389:2: ( ruleGegebenStatement )
            // InternalMeth.g:4390:3: ruleGegebenStatement
            {
             before(grammarAccess.getGegebenAccess().getStatementsGegebenStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleGegebenStatement();

            state._fsp--;

             after(grammarAccess.getGegebenAccess().getStatementsGegebenStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Gegeben__StatementsAssignment_2"


    // $ANTLR start "rule__Eingabe__StatementsAssignment_2"
    // InternalMeth.g:4399:1: rule__Eingabe__StatementsAssignment_2 : ( ruleEingabeStatement ) ;
    public final void rule__Eingabe__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4403:1: ( ( ruleEingabeStatement ) )
            // InternalMeth.g:4404:2: ( ruleEingabeStatement )
            {
            // InternalMeth.g:4404:2: ( ruleEingabeStatement )
            // InternalMeth.g:4405:3: ruleEingabeStatement
            {
             before(grammarAccess.getEingabeAccess().getStatementsEingabeStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEingabeStatement();

            state._fsp--;

             after(grammarAccess.getEingabeAccess().getStatementsEingabeStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Eingabe__StatementsAssignment_2"


    // $ANTLR start "rule__Berechnung__StatementsAssignment_2"
    // InternalMeth.g:4414:1: rule__Berechnung__StatementsAssignment_2 : ( ruleBerechnungStatement ) ;
    public final void rule__Berechnung__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4418:1: ( ( ruleBerechnungStatement ) )
            // InternalMeth.g:4419:2: ( ruleBerechnungStatement )
            {
            // InternalMeth.g:4419:2: ( ruleBerechnungStatement )
            // InternalMeth.g:4420:3: ruleBerechnungStatement
            {
             before(grammarAccess.getBerechnungAccess().getStatementsBerechnungStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBerechnungStatement();

            state._fsp--;

             after(grammarAccess.getBerechnungAccess().getStatementsBerechnungStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Berechnung__StatementsAssignment_2"


    // $ANTLR start "rule__Ausgabe__StatementsAssignment_2"
    // InternalMeth.g:4429:1: rule__Ausgabe__StatementsAssignment_2 : ( ruleAusgabeStatement ) ;
    public final void rule__Ausgabe__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4433:1: ( ( ruleAusgabeStatement ) )
            // InternalMeth.g:4434:2: ( ruleAusgabeStatement )
            {
            // InternalMeth.g:4434:2: ( ruleAusgabeStatement )
            // InternalMeth.g:4435:3: ruleAusgabeStatement
            {
             before(grammarAccess.getAusgabeAccess().getStatementsAusgabeStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAusgabeStatement();

            state._fsp--;

             after(grammarAccess.getAusgabeAccess().getStatementsAusgabeStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ausgabe__StatementsAssignment_2"


    // $ANTLR start "rule__GegebenStatement__EingabenameAssignment_0"
    // InternalMeth.g:4444:1: rule__GegebenStatement__EingabenameAssignment_0 : ( RULE_ID ) ;
    public final void rule__GegebenStatement__EingabenameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4448:1: ( ( RULE_ID ) )
            // InternalMeth.g:4449:2: ( RULE_ID )
            {
            // InternalMeth.g:4449:2: ( RULE_ID )
            // InternalMeth.g:4450:3: RULE_ID
            {
             before(grammarAccess.getGegebenStatementAccess().getEingabenameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGegebenStatementAccess().getEingabenameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__EingabenameAssignment_0"


    // $ANTLR start "rule__GegebenStatement__EinheitAssignment_1_1"
    // InternalMeth.g:4459:1: rule__GegebenStatement__EinheitAssignment_1_1 : ( ruleEinheitMultiplikation ) ;
    public final void rule__GegebenStatement__EinheitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4463:1: ( ( ruleEinheitMultiplikation ) )
            // InternalMeth.g:4464:2: ( ruleEinheitMultiplikation )
            {
            // InternalMeth.g:4464:2: ( ruleEinheitMultiplikation )
            // InternalMeth.g:4465:3: ruleEinheitMultiplikation
            {
             before(grammarAccess.getGegebenStatementAccess().getEinheitEinheitMultiplikationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEinheitMultiplikation();

            state._fsp--;

             after(grammarAccess.getGegebenStatementAccess().getEinheitEinheitMultiplikationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__EinheitAssignment_1_1"


    // $ANTLR start "rule__GegebenStatement__RefMethodeAssignment_3"
    // InternalMeth.g:4474:1: rule__GegebenStatement__RefMethodeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__GegebenStatement__RefMethodeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4478:1: ( ( ( RULE_ID ) ) )
            // InternalMeth.g:4479:2: ( ( RULE_ID ) )
            {
            // InternalMeth.g:4479:2: ( ( RULE_ID ) )
            // InternalMeth.g:4480:3: ( RULE_ID )
            {
             before(grammarAccess.getGegebenStatementAccess().getRefMethodeMethodeCrossReference_3_0()); 
            // InternalMeth.g:4481:3: ( RULE_ID )
            // InternalMeth.g:4482:4: RULE_ID
            {
             before(grammarAccess.getGegebenStatementAccess().getRefMethodeMethodeIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGegebenStatementAccess().getRefMethodeMethodeIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getGegebenStatementAccess().getRefMethodeMethodeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__RefMethodeAssignment_3"


    // $ANTLR start "rule__GegebenStatement__BezeichnungAssignment_5"
    // InternalMeth.g:4493:1: rule__GegebenStatement__BezeichnungAssignment_5 : ( RULE_STRING ) ;
    public final void rule__GegebenStatement__BezeichnungAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4497:1: ( ( RULE_STRING ) )
            // InternalMeth.g:4498:2: ( RULE_STRING )
            {
            // InternalMeth.g:4498:2: ( RULE_STRING )
            // InternalMeth.g:4499:3: RULE_STRING
            {
             before(grammarAccess.getGegebenStatementAccess().getBezeichnungSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getGegebenStatementAccess().getBezeichnungSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GegebenStatement__BezeichnungAssignment_5"


    // $ANTLR start "rule__EingabeStatement__EingabenameAssignment_0"
    // InternalMeth.g:4508:1: rule__EingabeStatement__EingabenameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EingabeStatement__EingabenameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4512:1: ( ( RULE_ID ) )
            // InternalMeth.g:4513:2: ( RULE_ID )
            {
            // InternalMeth.g:4513:2: ( RULE_ID )
            // InternalMeth.g:4514:3: RULE_ID
            {
             before(grammarAccess.getEingabeStatementAccess().getEingabenameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEingabeStatementAccess().getEingabenameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__EingabenameAssignment_0"


    // $ANTLR start "rule__EingabeStatement__EinheitAssignment_2"
    // InternalMeth.g:4523:1: rule__EingabeStatement__EinheitAssignment_2 : ( ruleEinheitMultiplikation ) ;
    public final void rule__EingabeStatement__EinheitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4527:1: ( ( ruleEinheitMultiplikation ) )
            // InternalMeth.g:4528:2: ( ruleEinheitMultiplikation )
            {
            // InternalMeth.g:4528:2: ( ruleEinheitMultiplikation )
            // InternalMeth.g:4529:3: ruleEinheitMultiplikation
            {
             before(grammarAccess.getEingabeStatementAccess().getEinheitEinheitMultiplikationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEinheitMultiplikation();

            state._fsp--;

             after(grammarAccess.getEingabeStatementAccess().getEinheitEinheitMultiplikationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__EinheitAssignment_2"


    // $ANTLR start "rule__EingabeStatement__BezeichnungAssignment_5"
    // InternalMeth.g:4538:1: rule__EingabeStatement__BezeichnungAssignment_5 : ( RULE_STRING ) ;
    public final void rule__EingabeStatement__BezeichnungAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4542:1: ( ( RULE_STRING ) )
            // InternalMeth.g:4543:2: ( RULE_STRING )
            {
            // InternalMeth.g:4543:2: ( RULE_STRING )
            // InternalMeth.g:4544:3: RULE_STRING
            {
             before(grammarAccess.getEingabeStatementAccess().getBezeichnungSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getEingabeStatementAccess().getBezeichnungSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EingabeStatement__BezeichnungAssignment_5"


    // $ANTLR start "rule__BerechnungStatement__BerechnungnameAssignment_0"
    // InternalMeth.g:4553:1: rule__BerechnungStatement__BerechnungnameAssignment_0 : ( RULE_ID ) ;
    public final void rule__BerechnungStatement__BerechnungnameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4557:1: ( ( RULE_ID ) )
            // InternalMeth.g:4558:2: ( RULE_ID )
            {
            // InternalMeth.g:4558:2: ( RULE_ID )
            // InternalMeth.g:4559:3: RULE_ID
            {
             before(grammarAccess.getBerechnungStatementAccess().getBerechnungnameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getBerechnungStatementAccess().getBerechnungnameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__BerechnungnameAssignment_0"


    // $ANTLR start "rule__BerechnungStatement__FormelAssignment_2"
    // InternalMeth.g:4568:1: rule__BerechnungStatement__FormelAssignment_2 : ( ruleFormel ) ;
    public final void rule__BerechnungStatement__FormelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4572:1: ( ( ruleFormel ) )
            // InternalMeth.g:4573:2: ( ruleFormel )
            {
            // InternalMeth.g:4573:2: ( ruleFormel )
            // InternalMeth.g:4574:3: ruleFormel
            {
             before(grammarAccess.getBerechnungStatementAccess().getFormelFormelParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFormel();

            state._fsp--;

             after(grammarAccess.getBerechnungStatementAccess().getFormelFormelParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__FormelAssignment_2"


    // $ANTLR start "rule__BerechnungStatement__BezeichnungAssignment_4"
    // InternalMeth.g:4583:1: rule__BerechnungStatement__BezeichnungAssignment_4 : ( RULE_STRING ) ;
    public final void rule__BerechnungStatement__BezeichnungAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4587:1: ( ( RULE_STRING ) )
            // InternalMeth.g:4588:2: ( RULE_STRING )
            {
            // InternalMeth.g:4588:2: ( RULE_STRING )
            // InternalMeth.g:4589:3: RULE_STRING
            {
             before(grammarAccess.getBerechnungStatementAccess().getBezeichnungSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getBerechnungStatementAccess().getBezeichnungSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BerechnungStatement__BezeichnungAssignment_4"


    // $ANTLR start "rule__AusgabeStatement__AusgabenameAssignment_0"
    // InternalMeth.g:4598:1: rule__AusgabeStatement__AusgabenameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AusgabeStatement__AusgabenameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4602:1: ( ( RULE_ID ) )
            // InternalMeth.g:4603:2: ( RULE_ID )
            {
            // InternalMeth.g:4603:2: ( RULE_ID )
            // InternalMeth.g:4604:3: RULE_ID
            {
             before(grammarAccess.getAusgabeStatementAccess().getAusgabenameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAusgabeStatementAccess().getAusgabenameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__AusgabenameAssignment_0"


    // $ANTLR start "rule__AusgabeStatement__EinheitAssignment_1_1"
    // InternalMeth.g:4613:1: rule__AusgabeStatement__EinheitAssignment_1_1 : ( ruleEinheitMultiplikation ) ;
    public final void rule__AusgabeStatement__EinheitAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4617:1: ( ( ruleEinheitMultiplikation ) )
            // InternalMeth.g:4618:2: ( ruleEinheitMultiplikation )
            {
            // InternalMeth.g:4618:2: ( ruleEinheitMultiplikation )
            // InternalMeth.g:4619:3: ruleEinheitMultiplikation
            {
             before(grammarAccess.getAusgabeStatementAccess().getEinheitEinheitMultiplikationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEinheitMultiplikation();

            state._fsp--;

             after(grammarAccess.getAusgabeStatementAccess().getEinheitEinheitMultiplikationParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__EinheitAssignment_1_1"


    // $ANTLR start "rule__AusgabeStatement__BezeichnungAssignment_2_1"
    // InternalMeth.g:4628:1: rule__AusgabeStatement__BezeichnungAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__AusgabeStatement__BezeichnungAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4632:1: ( ( RULE_STRING ) )
            // InternalMeth.g:4633:2: ( RULE_STRING )
            {
            // InternalMeth.g:4633:2: ( RULE_STRING )
            // InternalMeth.g:4634:3: RULE_STRING
            {
             before(grammarAccess.getAusgabeStatementAccess().getBezeichnungSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAusgabeStatementAccess().getBezeichnungSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AusgabeStatement__BezeichnungAssignment_2_1"


    // $ANTLR start "rule__TextFormel__TformelAssignment"
    // InternalMeth.g:4643:1: rule__TextFormel__TformelAssignment : ( ( 'TODO' ) ) ;
    public final void rule__TextFormel__TformelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4647:1: ( ( ( 'TODO' ) ) )
            // InternalMeth.g:4648:2: ( ( 'TODO' ) )
            {
            // InternalMeth.g:4648:2: ( ( 'TODO' ) )
            // InternalMeth.g:4649:3: ( 'TODO' )
            {
             before(grammarAccess.getTextFormelAccess().getTformelTODOKeyword_0()); 
            // InternalMeth.g:4650:3: ( 'TODO' )
            // InternalMeth.g:4651:4: 'TODO'
            {
             before(grammarAccess.getTextFormelAccess().getTformelTODOKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTextFormelAccess().getTformelTODOKeyword_0()); 

            }

             after(grammarAccess.getTextFormelAccess().getTformelTODOKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextFormel__TformelAssignment"


    // $ANTLR start "rule__NumFormel__NformelAssignment"
    // InternalMeth.g:4662:1: rule__NumFormel__NformelAssignment : ( ruleEinheitAddition ) ;
    public final void rule__NumFormel__NformelAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMeth.g:4666:1: ( ( ruleEinheitAddition ) )
            // InternalMeth.g:4667:2: ( ruleEinheitAddition )
            {
            // InternalMeth.g:4667:2: ( ruleEinheitAddition )
            // InternalMeth.g:4668:3: ruleEinheitAddition
            {
             before(grammarAccess.getNumFormelAccess().getNformelEinheitAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEinheitAddition();

            state._fsp--;

             after(grammarAccess.getNumFormelAccess().getNformelEinheitAdditionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumFormel__NformelAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000001A180000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000001A100002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000800070L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001040200000L});

}