package hvbargen.meth.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hvbargen.meth.services.MethGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMethParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_GANZ", "RULE_DEZIMAL", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Einheitensystem'", "'{'", "'}'", "'Dimension'", "'='", "';'", "'*'", "'/'", "'('", "')'", "'Einheit'", "'in'", "'Umrechnung'", "'Konstante'", "'+'", "'-'", "'Methode'", "'als'", "'Gegeben'", "'Eingabe'", "'Berechnung'", "'Ausgabe'", "'['", "']'", "'aus'", "'TODO'"
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

        public InternalMethParser(TokenStream input, MethGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MethGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMeth.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMeth.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMeth.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMeth.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_einheitensystem_0_0= ruleEinheitensystem ) ) ( (lv_methoden_1_0= ruleMethode ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_einheitensystem_0_0 = null;

        EObject lv_methoden_1_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:77:2: ( ( ( (lv_einheitensystem_0_0= ruleEinheitensystem ) ) ( (lv_methoden_1_0= ruleMethode ) )* ) )
            // InternalMeth.g:78:2: ( ( (lv_einheitensystem_0_0= ruleEinheitensystem ) ) ( (lv_methoden_1_0= ruleMethode ) )* )
            {
            // InternalMeth.g:78:2: ( ( (lv_einheitensystem_0_0= ruleEinheitensystem ) ) ( (lv_methoden_1_0= ruleMethode ) )* )
            // InternalMeth.g:79:3: ( (lv_einheitensystem_0_0= ruleEinheitensystem ) ) ( (lv_methoden_1_0= ruleMethode ) )*
            {
            // InternalMeth.g:79:3: ( (lv_einheitensystem_0_0= ruleEinheitensystem ) )
            // InternalMeth.g:80:4: (lv_einheitensystem_0_0= ruleEinheitensystem )
            {
            // InternalMeth.g:80:4: (lv_einheitensystem_0_0= ruleEinheitensystem )
            // InternalMeth.g:81:5: lv_einheitensystem_0_0= ruleEinheitensystem
            {

            					newCompositeNode(grammarAccess.getModelAccess().getEinheitensystemEinheitensystemParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_einheitensystem_0_0=ruleEinheitensystem();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					set(
            						current,
            						"einheitensystem",
            						lv_einheitensystem_0_0,
            						"hvbargen.meth.Meth.Einheitensystem");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMeth.g:98:3: ( (lv_methoden_1_0= ruleMethode ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==29) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMeth.g:99:4: (lv_methoden_1_0= ruleMethode )
            	    {
            	    // InternalMeth.g:99:4: (lv_methoden_1_0= ruleMethode )
            	    // InternalMeth.g:100:5: lv_methoden_1_0= ruleMethode
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMethodenMethodeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_methoden_1_0=ruleMethode();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"methoden",
            	    						lv_methoden_1_0,
            	    						"hvbargen.meth.Meth.Methode");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEinheitensystem"
    // InternalMeth.g:121:1: entryRuleEinheitensystem returns [EObject current=null] : iv_ruleEinheitensystem= ruleEinheitensystem EOF ;
    public final EObject entryRuleEinheitensystem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEinheitensystem = null;


        try {
            // InternalMeth.g:121:56: (iv_ruleEinheitensystem= ruleEinheitensystem EOF )
            // InternalMeth.g:122:2: iv_ruleEinheitensystem= ruleEinheitensystem EOF
            {
             newCompositeNode(grammarAccess.getEinheitensystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEinheitensystem=ruleEinheitensystem();

            state._fsp--;

             current =iv_ruleEinheitensystem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEinheitensystem"


    // $ANTLR start "ruleEinheitensystem"
    // InternalMeth.g:128:1: ruleEinheitensystem returns [EObject current=null] : ( () otherlv_1= 'Einheitensystem' otherlv_2= '{' ( (lv_deklarationen_3_0= ruleDeklaration ) )* otherlv_4= '}' ) ;
    public final EObject ruleEinheitensystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_deklarationen_3_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:134:2: ( ( () otherlv_1= 'Einheitensystem' otherlv_2= '{' ( (lv_deklarationen_3_0= ruleDeklaration ) )* otherlv_4= '}' ) )
            // InternalMeth.g:135:2: ( () otherlv_1= 'Einheitensystem' otherlv_2= '{' ( (lv_deklarationen_3_0= ruleDeklaration ) )* otherlv_4= '}' )
            {
            // InternalMeth.g:135:2: ( () otherlv_1= 'Einheitensystem' otherlv_2= '{' ( (lv_deklarationen_3_0= ruleDeklaration ) )* otherlv_4= '}' )
            // InternalMeth.g:136:3: () otherlv_1= 'Einheitensystem' otherlv_2= '{' ( (lv_deklarationen_3_0= ruleDeklaration ) )* otherlv_4= '}'
            {
            // InternalMeth.g:136:3: ()
            // InternalMeth.g:137:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEinheitensystemAccess().getEinheitensystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getEinheitensystemAccess().getEinheitensystemKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getEinheitensystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMeth.g:151:3: ( (lv_deklarationen_3_0= ruleDeklaration ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16||LA2_0==23||(LA2_0>=25 && LA2_0<=26)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMeth.g:152:4: (lv_deklarationen_3_0= ruleDeklaration )
            	    {
            	    // InternalMeth.g:152:4: (lv_deklarationen_3_0= ruleDeklaration )
            	    // InternalMeth.g:153:5: lv_deklarationen_3_0= ruleDeklaration
            	    {

            	    					newCompositeNode(grammarAccess.getEinheitensystemAccess().getDeklarationenDeklarationParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_deklarationen_3_0=ruleDeklaration();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEinheitensystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"deklarationen",
            	    						lv_deklarationen_3_0,
            	    						"hvbargen.meth.Meth.Deklaration");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getEinheitensystemAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEinheitensystem"


    // $ANTLR start "entryRuleDeklaration"
    // InternalMeth.g:178:1: entryRuleDeklaration returns [EObject current=null] : iv_ruleDeklaration= ruleDeklaration EOF ;
    public final EObject entryRuleDeklaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeklaration = null;


        try {
            // InternalMeth.g:178:52: (iv_ruleDeklaration= ruleDeklaration EOF )
            // InternalMeth.g:179:2: iv_ruleDeklaration= ruleDeklaration EOF
            {
             newCompositeNode(grammarAccess.getDeklarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeklaration=ruleDeklaration();

            state._fsp--;

             current =iv_ruleDeklaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeklaration"


    // $ANTLR start "ruleDeklaration"
    // InternalMeth.g:185:1: ruleDeklaration returns [EObject current=null] : (this_Dimension_0= ruleDimension | this_Einheit_1= ruleEinheit | this_Umrechnung_2= ruleUmrechnung | this_Konstante_3= ruleKonstante ) ;
    public final EObject ruleDeklaration() throws RecognitionException {
        EObject current = null;

        EObject this_Dimension_0 = null;

        EObject this_Einheit_1 = null;

        EObject this_Umrechnung_2 = null;

        EObject this_Konstante_3 = null;



        	enterRule();

        try {
            // InternalMeth.g:191:2: ( (this_Dimension_0= ruleDimension | this_Einheit_1= ruleEinheit | this_Umrechnung_2= ruleUmrechnung | this_Konstante_3= ruleKonstante ) )
            // InternalMeth.g:192:2: (this_Dimension_0= ruleDimension | this_Einheit_1= ruleEinheit | this_Umrechnung_2= ruleUmrechnung | this_Konstante_3= ruleKonstante )
            {
            // InternalMeth.g:192:2: (this_Dimension_0= ruleDimension | this_Einheit_1= ruleEinheit | this_Umrechnung_2= ruleUmrechnung | this_Konstante_3= ruleKonstante )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 23:
                {
                alt3=2;
                }
                break;
            case 25:
                {
                alt3=3;
                }
                break;
            case 26:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMeth.g:193:3: this_Dimension_0= ruleDimension
                    {

                    			newCompositeNode(grammarAccess.getDeklarationAccess().getDimensionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dimension_0=ruleDimension();

                    state._fsp--;


                    			current = this_Dimension_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMeth.g:202:3: this_Einheit_1= ruleEinheit
                    {

                    			newCompositeNode(grammarAccess.getDeklarationAccess().getEinheitParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Einheit_1=ruleEinheit();

                    state._fsp--;


                    			current = this_Einheit_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMeth.g:211:3: this_Umrechnung_2= ruleUmrechnung
                    {

                    			newCompositeNode(grammarAccess.getDeklarationAccess().getUmrechnungParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Umrechnung_2=ruleUmrechnung();

                    state._fsp--;


                    			current = this_Umrechnung_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMeth.g:220:3: this_Konstante_3= ruleKonstante
                    {

                    			newCompositeNode(grammarAccess.getDeklarationAccess().getKonstanteParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Konstante_3=ruleKonstante();

                    state._fsp--;


                    			current = this_Konstante_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeklaration"


    // $ANTLR start "entryRuleDimension"
    // InternalMeth.g:232:1: entryRuleDimension returns [EObject current=null] : iv_ruleDimension= ruleDimension EOF ;
    public final EObject entryRuleDimension() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimension = null;


        try {
            // InternalMeth.g:232:50: (iv_ruleDimension= ruleDimension EOF )
            // InternalMeth.g:233:2: iv_ruleDimension= ruleDimension EOF
            {
             newCompositeNode(grammarAccess.getDimensionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimension=ruleDimension();

            state._fsp--;

             current =iv_ruleDimension; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimension"


    // $ANTLR start "ruleDimension"
    // InternalMeth.g:239:1: ruleDimension returns [EObject current=null] : (otherlv_0= 'Dimension' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_basis_3_0= ruleDimensionMultiplikation ) ) )? otherlv_4= ';' ) ;
    public final EObject ruleDimension() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_basis_3_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:245:2: ( (otherlv_0= 'Dimension' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_basis_3_0= ruleDimensionMultiplikation ) ) )? otherlv_4= ';' ) )
            // InternalMeth.g:246:2: (otherlv_0= 'Dimension' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_basis_3_0= ruleDimensionMultiplikation ) ) )? otherlv_4= ';' )
            {
            // InternalMeth.g:246:2: (otherlv_0= 'Dimension' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_basis_3_0= ruleDimensionMultiplikation ) ) )? otherlv_4= ';' )
            // InternalMeth.g:247:3: otherlv_0= 'Dimension' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_basis_3_0= ruleDimensionMultiplikation ) ) )? otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getDimensionAccess().getDimensionKeyword_0());
            		
            // InternalMeth.g:251:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMeth.g:252:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMeth.g:252:4: (lv_name_1_0= RULE_ID )
            // InternalMeth.g:253:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDimensionAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDimensionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"hvbargen.meth.Meth.ID");
            				

            }


            }

            // InternalMeth.g:269:3: (otherlv_2= '=' ( (lv_basis_3_0= ruleDimensionMultiplikation ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMeth.g:270:4: otherlv_2= '=' ( (lv_basis_3_0= ruleDimensionMultiplikation ) )
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getDimensionAccess().getEqualsSignKeyword_2_0());
                    			
                    // InternalMeth.g:274:4: ( (lv_basis_3_0= ruleDimensionMultiplikation ) )
                    // InternalMeth.g:275:5: (lv_basis_3_0= ruleDimensionMultiplikation )
                    {
                    // InternalMeth.g:275:5: (lv_basis_3_0= ruleDimensionMultiplikation )
                    // InternalMeth.g:276:6: lv_basis_3_0= ruleDimensionMultiplikation
                    {

                    						newCompositeNode(grammarAccess.getDimensionAccess().getBasisDimensionMultiplikationParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_basis_3_0=ruleDimensionMultiplikation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDimensionRule());
                    						}
                    						set(
                    							current,
                    							"basis",
                    							lv_basis_3_0,
                    							"hvbargen.meth.Meth.DimensionMultiplikation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getDimensionAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimension"


    // $ANTLR start "entryRuleDimensionMultiplikation"
    // InternalMeth.g:302:1: entryRuleDimensionMultiplikation returns [EObject current=null] : iv_ruleDimensionMultiplikation= ruleDimensionMultiplikation EOF ;
    public final EObject entryRuleDimensionMultiplikation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionMultiplikation = null;


        try {
            // InternalMeth.g:302:64: (iv_ruleDimensionMultiplikation= ruleDimensionMultiplikation EOF )
            // InternalMeth.g:303:2: iv_ruleDimensionMultiplikation= ruleDimensionMultiplikation EOF
            {
             newCompositeNode(grammarAccess.getDimensionMultiplikationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimensionMultiplikation=ruleDimensionMultiplikation();

            state._fsp--;

             current =iv_ruleDimensionMultiplikation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimensionMultiplikation"


    // $ANTLR start "ruleDimensionMultiplikation"
    // InternalMeth.g:309:1: ruleDimensionMultiplikation returns [EObject current=null] : (this_DimensionPrimary_0= ruleDimensionPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleDimensionPrimary ) ) )* ) ;
    public final EObject ruleDimensionMultiplikation() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_DimensionPrimary_0 = null;

        EObject lv_rechts_3_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:315:2: ( (this_DimensionPrimary_0= ruleDimensionPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleDimensionPrimary ) ) )* ) )
            // InternalMeth.g:316:2: (this_DimensionPrimary_0= ruleDimensionPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleDimensionPrimary ) ) )* )
            {
            // InternalMeth.g:316:2: (this_DimensionPrimary_0= ruleDimensionPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleDimensionPrimary ) ) )* )
            // InternalMeth.g:317:3: this_DimensionPrimary_0= ruleDimensionPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleDimensionPrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getDimensionMultiplikationAccess().getDimensionPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_DimensionPrimary_0=ruleDimensionPrimary();

            state._fsp--;


            			current = this_DimensionPrimary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMeth.g:325:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleDimensionPrimary ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=19 && LA6_0<=20)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMeth.g:326:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleDimensionPrimary ) )
            	    {
            	    // InternalMeth.g:326:4: ()
            	    // InternalMeth.g:327:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getDimensionMultiplikationAccess().getDimensionMultiplikationLinksAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMeth.g:333:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalMeth.g:334:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalMeth.g:334:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalMeth.g:335:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalMeth.g:335:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0==19) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==20) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalMeth.g:336:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,19,FOLLOW_8); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getDimensionMultiplikationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getDimensionMultiplikationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMeth.g:347:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,20,FOLLOW_8); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getDimensionMultiplikationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getDimensionMultiplikationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMeth.g:360:4: ( (lv_rechts_3_0= ruleDimensionPrimary ) )
            	    // InternalMeth.g:361:5: (lv_rechts_3_0= ruleDimensionPrimary )
            	    {
            	    // InternalMeth.g:361:5: (lv_rechts_3_0= ruleDimensionPrimary )
            	    // InternalMeth.g:362:6: lv_rechts_3_0= ruleDimensionPrimary
            	    {

            	    						newCompositeNode(grammarAccess.getDimensionMultiplikationAccess().getRechtsDimensionPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_rechts_3_0=ruleDimensionPrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getDimensionMultiplikationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rechts",
            	    							lv_rechts_3_0,
            	    							"hvbargen.meth.Meth.DimensionPrimary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimensionMultiplikation"


    // $ANTLR start "entryRuleDimensionPrimary"
    // InternalMeth.g:384:1: entryRuleDimensionPrimary returns [EObject current=null] : iv_ruleDimensionPrimary= ruleDimensionPrimary EOF ;
    public final EObject entryRuleDimensionPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDimensionPrimary = null;


        try {
            // InternalMeth.g:384:57: (iv_ruleDimensionPrimary= ruleDimensionPrimary EOF )
            // InternalMeth.g:385:2: iv_ruleDimensionPrimary= ruleDimensionPrimary EOF
            {
             newCompositeNode(grammarAccess.getDimensionPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDimensionPrimary=ruleDimensionPrimary();

            state._fsp--;

             current =iv_ruleDimensionPrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDimensionPrimary"


    // $ANTLR start "ruleDimensionPrimary"
    // InternalMeth.g:391:1: ruleDimensionPrimary returns [EObject current=null] : ( (otherlv_0= '(' this_DimensionMultiplikation_1= ruleDimensionMultiplikation otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleDimensionPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_DimensionMultiplikation_1 = null;



        	enterRule();

        try {
            // InternalMeth.g:397:2: ( ( (otherlv_0= '(' this_DimensionMultiplikation_1= ruleDimensionMultiplikation otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMeth.g:398:2: ( (otherlv_0= '(' this_DimensionMultiplikation_1= ruleDimensionMultiplikation otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalMeth.g:398:2: ( (otherlv_0= '(' this_DimensionMultiplikation_1= ruleDimensionMultiplikation otherlv_2= ')' ) | ( (otherlv_3= RULE_ID ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMeth.g:399:3: (otherlv_0= '(' this_DimensionMultiplikation_1= ruleDimensionMultiplikation otherlv_2= ')' )
                    {
                    // InternalMeth.g:399:3: (otherlv_0= '(' this_DimensionMultiplikation_1= ruleDimensionMultiplikation otherlv_2= ')' )
                    // InternalMeth.g:400:4: otherlv_0= '(' this_DimensionMultiplikation_1= ruleDimensionMultiplikation otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_8); 

                    				newLeafNode(otherlv_0, grammarAccess.getDimensionPrimaryAccess().getLeftParenthesisKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getDimensionPrimaryAccess().getDimensionMultiplikationParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_DimensionMultiplikation_1=ruleDimensionMultiplikation();

                    state._fsp--;


                    				current = this_DimensionMultiplikation_1;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_2=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_2, grammarAccess.getDimensionPrimaryAccess().getRightParenthesisKeyword_0_2());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMeth.g:418:3: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMeth.g:418:3: ( (otherlv_3= RULE_ID ) )
                    // InternalMeth.g:419:4: (otherlv_3= RULE_ID )
                    {
                    // InternalMeth.g:419:4: (otherlv_3= RULE_ID )
                    // InternalMeth.g:420:5: otherlv_3= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDimensionPrimaryRule());
                    					}
                    				
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_3, grammarAccess.getDimensionPrimaryAccess().getRefDimensionCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDimensionPrimary"


    // $ANTLR start "entryRuleEinheit"
    // InternalMeth.g:435:1: entryRuleEinheit returns [EObject current=null] : iv_ruleEinheit= ruleEinheit EOF ;
    public final EObject entryRuleEinheit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEinheit = null;


        try {
            // InternalMeth.g:435:48: (iv_ruleEinheit= ruleEinheit EOF )
            // InternalMeth.g:436:2: iv_ruleEinheit= ruleEinheit EOF
            {
             newCompositeNode(grammarAccess.getEinheitRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEinheit=ruleEinheit();

            state._fsp--;

             current =iv_ruleEinheit; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEinheit"


    // $ANTLR start "ruleEinheit"
    // InternalMeth.g:442:1: ruleEinheit returns [EObject current=null] : (otherlv_0= 'Einheit' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '=' ( (lv_faktor_5_0= ruleEinheitMultiplikation ) ) ( (otherlv_6= RULE_ID ) )? ) ) otherlv_7= ';' ) ;
    public final EObject ruleEinheit() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_faktor_5_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:448:2: ( (otherlv_0= 'Einheit' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '=' ( (lv_faktor_5_0= ruleEinheitMultiplikation ) ) ( (otherlv_6= RULE_ID ) )? ) ) otherlv_7= ';' ) )
            // InternalMeth.g:449:2: (otherlv_0= 'Einheit' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '=' ( (lv_faktor_5_0= ruleEinheitMultiplikation ) ) ( (otherlv_6= RULE_ID ) )? ) ) otherlv_7= ';' )
            {
            // InternalMeth.g:449:2: (otherlv_0= 'Einheit' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '=' ( (lv_faktor_5_0= ruleEinheitMultiplikation ) ) ( (otherlv_6= RULE_ID ) )? ) ) otherlv_7= ';' )
            // InternalMeth.g:450:3: otherlv_0= 'Einheit' ( (lv_name_1_0= RULE_ID ) ) ( (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '=' ( (lv_faktor_5_0= ruleEinheitMultiplikation ) ) ( (otherlv_6= RULE_ID ) )? ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getEinheitAccess().getEinheitKeyword_0());
            		
            // InternalMeth.g:454:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMeth.g:455:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMeth.g:455:4: (lv_name_1_0= RULE_ID )
            // InternalMeth.g:456:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEinheitAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEinheitRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"hvbargen.meth.Meth.ID");
            				

            }


            }

            // InternalMeth.g:472:3: ( (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ) | (otherlv_4= '=' ( (lv_faktor_5_0= ruleEinheitMultiplikation ) ) ( (otherlv_6= RULE_ID ) )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==17) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMeth.g:473:4: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )
                    {
                    // InternalMeth.g:473:4: (otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) )
                    // InternalMeth.g:474:5: otherlv_2= 'in' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_6); 

                    					newLeafNode(otherlv_2, grammarAccess.getEinheitAccess().getInKeyword_2_0_0());
                    				
                    // InternalMeth.g:478:5: ( (otherlv_3= RULE_ID ) )
                    // InternalMeth.g:479:6: (otherlv_3= RULE_ID )
                    {
                    // InternalMeth.g:479:6: (otherlv_3= RULE_ID )
                    // InternalMeth.g:480:7: otherlv_3= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEinheitRule());
                    							}
                    						
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); 

                    							newLeafNode(otherlv_3, grammarAccess.getEinheitAccess().getRefDimensionCrossReference_2_0_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMeth.g:493:4: (otherlv_4= '=' ( (lv_faktor_5_0= ruleEinheitMultiplikation ) ) ( (otherlv_6= RULE_ID ) )? )
                    {
                    // InternalMeth.g:493:4: (otherlv_4= '=' ( (lv_faktor_5_0= ruleEinheitMultiplikation ) ) ( (otherlv_6= RULE_ID ) )? )
                    // InternalMeth.g:494:5: otherlv_4= '=' ( (lv_faktor_5_0= ruleEinheitMultiplikation ) ) ( (otherlv_6= RULE_ID ) )?
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_13); 

                    					newLeafNode(otherlv_4, grammarAccess.getEinheitAccess().getEqualsSignKeyword_2_1_0());
                    				
                    // InternalMeth.g:498:5: ( (lv_faktor_5_0= ruleEinheitMultiplikation ) )
                    // InternalMeth.g:499:6: (lv_faktor_5_0= ruleEinheitMultiplikation )
                    {
                    // InternalMeth.g:499:6: (lv_faktor_5_0= ruleEinheitMultiplikation )
                    // InternalMeth.g:500:7: lv_faktor_5_0= ruleEinheitMultiplikation
                    {

                    							newCompositeNode(grammarAccess.getEinheitAccess().getFaktorEinheitMultiplikationParserRuleCall_2_1_1_0());
                    						
                    pushFollow(FOLLOW_14);
                    lv_faktor_5_0=ruleEinheitMultiplikation();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getEinheitRule());
                    							}
                    							set(
                    								current,
                    								"faktor",
                    								lv_faktor_5_0,
                    								"hvbargen.meth.Meth.EinheitMultiplikation");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMeth.g:517:5: ( (otherlv_6= RULE_ID ) )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_ID) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // InternalMeth.g:518:6: (otherlv_6= RULE_ID )
                            {
                            // InternalMeth.g:518:6: (otherlv_6= RULE_ID )
                            // InternalMeth.g:519:7: otherlv_6= RULE_ID
                            {

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEinheitRule());
                            							}
                            						
                            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_9); 

                            							newLeafNode(otherlv_6, grammarAccess.getEinheitAccess().getBasiseinheitEinheitCrossReference_2_1_2_0());
                            						

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEinheitAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEinheit"


    // $ANTLR start "entryRuleUmrechnung"
    // InternalMeth.g:540:1: entryRuleUmrechnung returns [EObject current=null] : iv_ruleUmrechnung= ruleUmrechnung EOF ;
    public final EObject entryRuleUmrechnung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUmrechnung = null;


        try {
            // InternalMeth.g:540:51: (iv_ruleUmrechnung= ruleUmrechnung EOF )
            // InternalMeth.g:541:2: iv_ruleUmrechnung= ruleUmrechnung EOF
            {
             newCompositeNode(grammarAccess.getUmrechnungRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUmrechnung=ruleUmrechnung();

            state._fsp--;

             current =iv_ruleUmrechnung; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUmrechnung"


    // $ANTLR start "ruleUmrechnung"
    // InternalMeth.g:547:1: ruleUmrechnung returns [EObject current=null] : (otherlv_0= 'Umrechnung' ( (lv_varname_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_ausdruck_4_0= ruleEinheitAddition ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) ;
    public final EObject ruleUmrechnung() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_varname_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_ausdruck_4_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:553:2: ( (otherlv_0= 'Umrechnung' ( (lv_varname_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_ausdruck_4_0= ruleEinheitAddition ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) )
            // InternalMeth.g:554:2: (otherlv_0= 'Umrechnung' ( (lv_varname_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_ausdruck_4_0= ruleEinheitAddition ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            {
            // InternalMeth.g:554:2: (otherlv_0= 'Umrechnung' ( (lv_varname_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_ausdruck_4_0= ruleEinheitAddition ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            // InternalMeth.g:555:3: otherlv_0= 'Umrechnung' ( (lv_varname_1_0= RULE_ID ) ) ( (otherlv_2= RULE_ID ) ) otherlv_3= '=' ( (lv_ausdruck_4_0= ruleEinheitAddition ) ) ( (otherlv_5= RULE_ID ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUmrechnungAccess().getUmrechnungKeyword_0());
            		
            // InternalMeth.g:559:3: ( (lv_varname_1_0= RULE_ID ) )
            // InternalMeth.g:560:4: (lv_varname_1_0= RULE_ID )
            {
            // InternalMeth.g:560:4: (lv_varname_1_0= RULE_ID )
            // InternalMeth.g:561:5: lv_varname_1_0= RULE_ID
            {
            lv_varname_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_varname_1_0, grammarAccess.getUmrechnungAccess().getVarnameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUmrechnungRule());
            					}
            					setWithLastConsumed(
            						current,
            						"varname",
            						lv_varname_1_0,
            						"hvbargen.meth.Meth.ID");
            				

            }


            }

            // InternalMeth.g:577:3: ( (otherlv_2= RULE_ID ) )
            // InternalMeth.g:578:4: (otherlv_2= RULE_ID )
            {
            // InternalMeth.g:578:4: (otherlv_2= RULE_ID )
            // InternalMeth.g:579:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUmrechnungRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(otherlv_2, grammarAccess.getUmrechnungAccess().getVonEinheitEinheitCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getUmrechnungAccess().getEqualsSignKeyword_3());
            		
            // InternalMeth.g:594:3: ( (lv_ausdruck_4_0= ruleEinheitAddition ) )
            // InternalMeth.g:595:4: (lv_ausdruck_4_0= ruleEinheitAddition )
            {
            // InternalMeth.g:595:4: (lv_ausdruck_4_0= ruleEinheitAddition )
            // InternalMeth.g:596:5: lv_ausdruck_4_0= ruleEinheitAddition
            {

            					newCompositeNode(grammarAccess.getUmrechnungAccess().getAusdruckEinheitAdditionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_ausdruck_4_0=ruleEinheitAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUmrechnungRule());
            					}
            					set(
            						current,
            						"ausdruck",
            						lv_ausdruck_4_0,
            						"hvbargen.meth.Meth.EinheitAddition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMeth.g:613:3: ( (otherlv_5= RULE_ID ) )
            // InternalMeth.g:614:4: (otherlv_5= RULE_ID )
            {
            // InternalMeth.g:614:4: (otherlv_5= RULE_ID )
            // InternalMeth.g:615:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUmrechnungRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_5, grammarAccess.getUmrechnungAccess().getNachEinheitEinheitCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getUmrechnungAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUmrechnung"


    // $ANTLR start "entryRuleKonstante"
    // InternalMeth.g:634:1: entryRuleKonstante returns [EObject current=null] : iv_ruleKonstante= ruleKonstante EOF ;
    public final EObject entryRuleKonstante() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKonstante = null;


        try {
            // InternalMeth.g:634:50: (iv_ruleKonstante= ruleKonstante EOF )
            // InternalMeth.g:635:2: iv_ruleKonstante= ruleKonstante EOF
            {
             newCompositeNode(grammarAccess.getKonstanteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKonstante=ruleKonstante();

            state._fsp--;

             current =iv_ruleKonstante; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKonstante"


    // $ANTLR start "ruleKonstante"
    // InternalMeth.g:641:1: ruleKonstante returns [EObject current=null] : (otherlv_0= 'Konstante' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_ausdruck_3_0= ruleEinheitAddition ) ) otherlv_4= ';' ) ;
    public final EObject ruleKonstante() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_ausdruck_3_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:647:2: ( (otherlv_0= 'Konstante' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_ausdruck_3_0= ruleEinheitAddition ) ) otherlv_4= ';' ) )
            // InternalMeth.g:648:2: (otherlv_0= 'Konstante' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_ausdruck_3_0= ruleEinheitAddition ) ) otherlv_4= ';' )
            {
            // InternalMeth.g:648:2: (otherlv_0= 'Konstante' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_ausdruck_3_0= ruleEinheitAddition ) ) otherlv_4= ';' )
            // InternalMeth.g:649:3: otherlv_0= 'Konstante' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_ausdruck_3_0= ruleEinheitAddition ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getKonstanteAccess().getKonstanteKeyword_0());
            		
            // InternalMeth.g:653:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMeth.g:654:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMeth.g:654:4: (lv_name_1_0= RULE_ID )
            // InternalMeth.g:655:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getKonstanteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKonstanteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"hvbargen.meth.Meth.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getKonstanteAccess().getEqualsSignKeyword_2());
            		
            // InternalMeth.g:675:3: ( (lv_ausdruck_3_0= ruleEinheitAddition ) )
            // InternalMeth.g:676:4: (lv_ausdruck_3_0= ruleEinheitAddition )
            {
            // InternalMeth.g:676:4: (lv_ausdruck_3_0= ruleEinheitAddition )
            // InternalMeth.g:677:5: lv_ausdruck_3_0= ruleEinheitAddition
            {

            					newCompositeNode(grammarAccess.getKonstanteAccess().getAusdruckEinheitAdditionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_9);
            lv_ausdruck_3_0=ruleEinheitAddition();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKonstanteRule());
            					}
            					set(
            						current,
            						"ausdruck",
            						lv_ausdruck_3_0,
            						"hvbargen.meth.Meth.EinheitAddition");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getKonstanteAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKonstante"


    // $ANTLR start "entryRuleZahl"
    // InternalMeth.g:702:1: entryRuleZahl returns [EObject current=null] : iv_ruleZahl= ruleZahl EOF ;
    public final EObject entryRuleZahl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleZahl = null;


        try {
            // InternalMeth.g:702:45: (iv_ruleZahl= ruleZahl EOF )
            // InternalMeth.g:703:2: iv_ruleZahl= ruleZahl EOF
            {
             newCompositeNode(grammarAccess.getZahlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleZahl=ruleZahl();

            state._fsp--;

             current =iv_ruleZahl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleZahl"


    // $ANTLR start "ruleZahl"
    // InternalMeth.g:709:1: ruleZahl returns [EObject current=null] : (this_Ganzzahl_0= ruleGanzzahl | this_Dezimalzahl_1= ruleDezimalzahl ) ;
    public final EObject ruleZahl() throws RecognitionException {
        EObject current = null;

        EObject this_Ganzzahl_0 = null;

        EObject this_Dezimalzahl_1 = null;



        	enterRule();

        try {
            // InternalMeth.g:715:2: ( (this_Ganzzahl_0= ruleGanzzahl | this_Dezimalzahl_1= ruleDezimalzahl ) )
            // InternalMeth.g:716:2: (this_Ganzzahl_0= ruleGanzzahl | this_Dezimalzahl_1= ruleDezimalzahl )
            {
            // InternalMeth.g:716:2: (this_Ganzzahl_0= ruleGanzzahl | this_Dezimalzahl_1= ruleDezimalzahl )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_GANZ) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_DEZIMAL) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMeth.g:717:3: this_Ganzzahl_0= ruleGanzzahl
                    {

                    			newCompositeNode(grammarAccess.getZahlAccess().getGanzzahlParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Ganzzahl_0=ruleGanzzahl();

                    state._fsp--;


                    			current = this_Ganzzahl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMeth.g:726:3: this_Dezimalzahl_1= ruleDezimalzahl
                    {

                    			newCompositeNode(grammarAccess.getZahlAccess().getDezimalzahlParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Dezimalzahl_1=ruleDezimalzahl();

                    state._fsp--;


                    			current = this_Dezimalzahl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleZahl"


    // $ANTLR start "entryRuleGanzzahl"
    // InternalMeth.g:738:1: entryRuleGanzzahl returns [EObject current=null] : iv_ruleGanzzahl= ruleGanzzahl EOF ;
    public final EObject entryRuleGanzzahl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGanzzahl = null;


        try {
            // InternalMeth.g:738:49: (iv_ruleGanzzahl= ruleGanzzahl EOF )
            // InternalMeth.g:739:2: iv_ruleGanzzahl= ruleGanzzahl EOF
            {
             newCompositeNode(grammarAccess.getGanzzahlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGanzzahl=ruleGanzzahl();

            state._fsp--;

             current =iv_ruleGanzzahl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGanzzahl"


    // $ANTLR start "ruleGanzzahl"
    // InternalMeth.g:745:1: ruleGanzzahl returns [EObject current=null] : ( (lv_iwert_0_0= RULE_GANZ ) ) ;
    public final EObject ruleGanzzahl() throws RecognitionException {
        EObject current = null;

        Token lv_iwert_0_0=null;


        	enterRule();

        try {
            // InternalMeth.g:751:2: ( ( (lv_iwert_0_0= RULE_GANZ ) ) )
            // InternalMeth.g:752:2: ( (lv_iwert_0_0= RULE_GANZ ) )
            {
            // InternalMeth.g:752:2: ( (lv_iwert_0_0= RULE_GANZ ) )
            // InternalMeth.g:753:3: (lv_iwert_0_0= RULE_GANZ )
            {
            // InternalMeth.g:753:3: (lv_iwert_0_0= RULE_GANZ )
            // InternalMeth.g:754:4: lv_iwert_0_0= RULE_GANZ
            {
            lv_iwert_0_0=(Token)match(input,RULE_GANZ,FOLLOW_2); 

            				newLeafNode(lv_iwert_0_0, grammarAccess.getGanzzahlAccess().getIwertGANZTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getGanzzahlRule());
            				}
            				setWithLastConsumed(
            					current,
            					"iwert",
            					lv_iwert_0_0,
            					"hvbargen.meth.Meth.GANZ");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGanzzahl"


    // $ANTLR start "entryRuleDezimalzahl"
    // InternalMeth.g:773:1: entryRuleDezimalzahl returns [EObject current=null] : iv_ruleDezimalzahl= ruleDezimalzahl EOF ;
    public final EObject entryRuleDezimalzahl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDezimalzahl = null;


        try {
            // InternalMeth.g:773:52: (iv_ruleDezimalzahl= ruleDezimalzahl EOF )
            // InternalMeth.g:774:2: iv_ruleDezimalzahl= ruleDezimalzahl EOF
            {
             newCompositeNode(grammarAccess.getDezimalzahlRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDezimalzahl=ruleDezimalzahl();

            state._fsp--;

             current =iv_ruleDezimalzahl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDezimalzahl"


    // $ANTLR start "ruleDezimalzahl"
    // InternalMeth.g:780:1: ruleDezimalzahl returns [EObject current=null] : ( (lv_fwert_0_0= RULE_DEZIMAL ) ) ;
    public final EObject ruleDezimalzahl() throws RecognitionException {
        EObject current = null;

        Token lv_fwert_0_0=null;


        	enterRule();

        try {
            // InternalMeth.g:786:2: ( ( (lv_fwert_0_0= RULE_DEZIMAL ) ) )
            // InternalMeth.g:787:2: ( (lv_fwert_0_0= RULE_DEZIMAL ) )
            {
            // InternalMeth.g:787:2: ( (lv_fwert_0_0= RULE_DEZIMAL ) )
            // InternalMeth.g:788:3: (lv_fwert_0_0= RULE_DEZIMAL )
            {
            // InternalMeth.g:788:3: (lv_fwert_0_0= RULE_DEZIMAL )
            // InternalMeth.g:789:4: lv_fwert_0_0= RULE_DEZIMAL
            {
            lv_fwert_0_0=(Token)match(input,RULE_DEZIMAL,FOLLOW_2); 

            				newLeafNode(lv_fwert_0_0, grammarAccess.getDezimalzahlAccess().getFwertDEZIMALTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDezimalzahlRule());
            				}
            				setWithLastConsumed(
            					current,
            					"fwert",
            					lv_fwert_0_0,
            					"hvbargen.meth.Meth.DEZIMAL");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDezimalzahl"


    // $ANTLR start "entryRuleEinheitAddition"
    // InternalMeth.g:808:1: entryRuleEinheitAddition returns [EObject current=null] : iv_ruleEinheitAddition= ruleEinheitAddition EOF ;
    public final EObject entryRuleEinheitAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEinheitAddition = null;


        try {
            // InternalMeth.g:808:56: (iv_ruleEinheitAddition= ruleEinheitAddition EOF )
            // InternalMeth.g:809:2: iv_ruleEinheitAddition= ruleEinheitAddition EOF
            {
             newCompositeNode(grammarAccess.getEinheitAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEinheitAddition=ruleEinheitAddition();

            state._fsp--;

             current =iv_ruleEinheitAddition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEinheitAddition"


    // $ANTLR start "ruleEinheitAddition"
    // InternalMeth.g:815:1: ruleEinheitAddition returns [EObject current=null] : (this_EinheitMultiplikation_0= ruleEinheitMultiplikation ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_rechts_3_0= ruleEinheitMultiplikation ) ) )* ) ;
    public final EObject ruleEinheitAddition() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_EinheitMultiplikation_0 = null;

        EObject lv_rechts_3_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:821:2: ( (this_EinheitMultiplikation_0= ruleEinheitMultiplikation ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_rechts_3_0= ruleEinheitMultiplikation ) ) )* ) )
            // InternalMeth.g:822:2: (this_EinheitMultiplikation_0= ruleEinheitMultiplikation ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_rechts_3_0= ruleEinheitMultiplikation ) ) )* )
            {
            // InternalMeth.g:822:2: (this_EinheitMultiplikation_0= ruleEinheitMultiplikation ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_rechts_3_0= ruleEinheitMultiplikation ) ) )* )
            // InternalMeth.g:823:3: this_EinheitMultiplikation_0= ruleEinheitMultiplikation ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_rechts_3_0= ruleEinheitMultiplikation ) ) )*
            {

            			newCompositeNode(grammarAccess.getEinheitAdditionAccess().getEinheitMultiplikationParserRuleCall_0());
            		
            pushFollow(FOLLOW_16);
            this_EinheitMultiplikation_0=ruleEinheitMultiplikation();

            state._fsp--;


            			current = this_EinheitMultiplikation_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMeth.g:831:3: ( () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_rechts_3_0= ruleEinheitMultiplikation ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=27 && LA12_0<=28)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMeth.g:832:4: () ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) ) ( (lv_rechts_3_0= ruleEinheitMultiplikation ) )
            	    {
            	    // InternalMeth.g:832:4: ()
            	    // InternalMeth.g:833:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEinheitAdditionAccess().getEinheitAdditionLinksAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMeth.g:839:4: ( ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) ) )
            	    // InternalMeth.g:840:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    {
            	    // InternalMeth.g:840:5: ( (lv_operator_2_1= '+' | lv_operator_2_2= '-' ) )
            	    // InternalMeth.g:841:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    {
            	    // InternalMeth.g:841:6: (lv_operator_2_1= '+' | lv_operator_2_2= '-' )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==27) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==28) ) {
            	        alt11=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalMeth.g:842:7: lv_operator_2_1= '+'
            	            {
            	            lv_operator_2_1=(Token)match(input,27,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getEinheitAdditionAccess().getOperatorPlusSignKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEinheitAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMeth.g:853:7: lv_operator_2_2= '-'
            	            {
            	            lv_operator_2_2=(Token)match(input,28,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getEinheitAdditionAccess().getOperatorHyphenMinusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEinheitAdditionRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMeth.g:866:4: ( (lv_rechts_3_0= ruleEinheitMultiplikation ) )
            	    // InternalMeth.g:867:5: (lv_rechts_3_0= ruleEinheitMultiplikation )
            	    {
            	    // InternalMeth.g:867:5: (lv_rechts_3_0= ruleEinheitMultiplikation )
            	    // InternalMeth.g:868:6: lv_rechts_3_0= ruleEinheitMultiplikation
            	    {

            	    						newCompositeNode(grammarAccess.getEinheitAdditionAccess().getRechtsEinheitMultiplikationParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_rechts_3_0=ruleEinheitMultiplikation();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEinheitAdditionRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rechts",
            	    							lv_rechts_3_0,
            	    							"hvbargen.meth.Meth.EinheitMultiplikation");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEinheitAddition"


    // $ANTLR start "entryRuleEinheitMultiplikation"
    // InternalMeth.g:890:1: entryRuleEinheitMultiplikation returns [EObject current=null] : iv_ruleEinheitMultiplikation= ruleEinheitMultiplikation EOF ;
    public final EObject entryRuleEinheitMultiplikation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEinheitMultiplikation = null;


        try {
            // InternalMeth.g:890:62: (iv_ruleEinheitMultiplikation= ruleEinheitMultiplikation EOF )
            // InternalMeth.g:891:2: iv_ruleEinheitMultiplikation= ruleEinheitMultiplikation EOF
            {
             newCompositeNode(grammarAccess.getEinheitMultiplikationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEinheitMultiplikation=ruleEinheitMultiplikation();

            state._fsp--;

             current =iv_ruleEinheitMultiplikation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEinheitMultiplikation"


    // $ANTLR start "ruleEinheitMultiplikation"
    // InternalMeth.g:897:1: ruleEinheitMultiplikation returns [EObject current=null] : (this_EinheitPrimary_0= ruleEinheitPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleEinheitPrimary ) ) )* ) ;
    public final EObject ruleEinheitMultiplikation() throws RecognitionException {
        EObject current = null;

        Token lv_operator_2_1=null;
        Token lv_operator_2_2=null;
        EObject this_EinheitPrimary_0 = null;

        EObject lv_rechts_3_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:903:2: ( (this_EinheitPrimary_0= ruleEinheitPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleEinheitPrimary ) ) )* ) )
            // InternalMeth.g:904:2: (this_EinheitPrimary_0= ruleEinheitPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleEinheitPrimary ) ) )* )
            {
            // InternalMeth.g:904:2: (this_EinheitPrimary_0= ruleEinheitPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleEinheitPrimary ) ) )* )
            // InternalMeth.g:905:3: this_EinheitPrimary_0= ruleEinheitPrimary ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleEinheitPrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getEinheitMultiplikationAccess().getEinheitPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_EinheitPrimary_0=ruleEinheitPrimary();

            state._fsp--;


            			current = this_EinheitPrimary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMeth.g:913:3: ( () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleEinheitPrimary ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=19 && LA14_0<=20)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMeth.g:914:4: () ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) ) ( (lv_rechts_3_0= ruleEinheitPrimary ) )
            	    {
            	    // InternalMeth.g:914:4: ()
            	    // InternalMeth.g:915:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getEinheitMultiplikationAccess().getEinheitMultiplikationLinksAction_1_0(),
            	    						current);
            	    				

            	    }

            	    // InternalMeth.g:921:4: ( ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) ) )
            	    // InternalMeth.g:922:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    {
            	    // InternalMeth.g:922:5: ( (lv_operator_2_1= '*' | lv_operator_2_2= '/' ) )
            	    // InternalMeth.g:923:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    {
            	    // InternalMeth.g:923:6: (lv_operator_2_1= '*' | lv_operator_2_2= '/' )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==19) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==20) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // InternalMeth.g:924:7: lv_operator_2_1= '*'
            	            {
            	            lv_operator_2_1=(Token)match(input,19,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_1, grammarAccess.getEinheitMultiplikationAccess().getOperatorAsteriskKeyword_1_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEinheitMultiplikationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_1, null);
            	            						

            	            }
            	            break;
            	        case 2 :
            	            // InternalMeth.g:935:7: lv_operator_2_2= '/'
            	            {
            	            lv_operator_2_2=(Token)match(input,20,FOLLOW_13); 

            	            							newLeafNode(lv_operator_2_2, grammarAccess.getEinheitMultiplikationAccess().getOperatorSolidusKeyword_1_1_0_1());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getEinheitMultiplikationRule());
            	            							}
            	            							setWithLastConsumed(current, "operator", lv_operator_2_2, null);
            	            						

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMeth.g:948:4: ( (lv_rechts_3_0= ruleEinheitPrimary ) )
            	    // InternalMeth.g:949:5: (lv_rechts_3_0= ruleEinheitPrimary )
            	    {
            	    // InternalMeth.g:949:5: (lv_rechts_3_0= ruleEinheitPrimary )
            	    // InternalMeth.g:950:6: lv_rechts_3_0= ruleEinheitPrimary
            	    {

            	    						newCompositeNode(grammarAccess.getEinheitMultiplikationAccess().getRechtsEinheitPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_rechts_3_0=ruleEinheitPrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEinheitMultiplikationRule());
            	    						}
            	    						set(
            	    							current,
            	    							"rechts",
            	    							lv_rechts_3_0,
            	    							"hvbargen.meth.Meth.EinheitPrimary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEinheitMultiplikation"


    // $ANTLR start "entryRuleEinheitPrimary"
    // InternalMeth.g:972:1: entryRuleEinheitPrimary returns [EObject current=null] : iv_ruleEinheitPrimary= ruleEinheitPrimary EOF ;
    public final EObject entryRuleEinheitPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEinheitPrimary = null;


        try {
            // InternalMeth.g:972:55: (iv_ruleEinheitPrimary= ruleEinheitPrimary EOF )
            // InternalMeth.g:973:2: iv_ruleEinheitPrimary= ruleEinheitPrimary EOF
            {
             newCompositeNode(grammarAccess.getEinheitPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEinheitPrimary=ruleEinheitPrimary();

            state._fsp--;

             current =iv_ruleEinheitPrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEinheitPrimary"


    // $ANTLR start "ruleEinheitPrimary"
    // InternalMeth.g:979:1: ruleEinheitPrimary returns [EObject current=null] : (this_Zahl_0= ruleZahl | ( (lv_varref_1_0= RULE_ID ) ) | (otherlv_2= '(' this_EinheitAddition_3= ruleEinheitAddition otherlv_4= ')' ) ) ;
    public final EObject ruleEinheitPrimary() throws RecognitionException {
        EObject current = null;

        Token lv_varref_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Zahl_0 = null;

        EObject this_EinheitAddition_3 = null;



        	enterRule();

        try {
            // InternalMeth.g:985:2: ( (this_Zahl_0= ruleZahl | ( (lv_varref_1_0= RULE_ID ) ) | (otherlv_2= '(' this_EinheitAddition_3= ruleEinheitAddition otherlv_4= ')' ) ) )
            // InternalMeth.g:986:2: (this_Zahl_0= ruleZahl | ( (lv_varref_1_0= RULE_ID ) ) | (otherlv_2= '(' this_EinheitAddition_3= ruleEinheitAddition otherlv_4= ')' ) )
            {
            // InternalMeth.g:986:2: (this_Zahl_0= ruleZahl | ( (lv_varref_1_0= RULE_ID ) ) | (otherlv_2= '(' this_EinheitAddition_3= ruleEinheitAddition otherlv_4= ')' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_GANZ:
            case RULE_DEZIMAL:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
                {
                alt15=2;
                }
                break;
            case 21:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMeth.g:987:3: this_Zahl_0= ruleZahl
                    {

                    			newCompositeNode(grammarAccess.getEinheitPrimaryAccess().getZahlParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Zahl_0=ruleZahl();

                    state._fsp--;


                    			current = this_Zahl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMeth.g:996:3: ( (lv_varref_1_0= RULE_ID ) )
                    {
                    // InternalMeth.g:996:3: ( (lv_varref_1_0= RULE_ID ) )
                    // InternalMeth.g:997:4: (lv_varref_1_0= RULE_ID )
                    {
                    // InternalMeth.g:997:4: (lv_varref_1_0= RULE_ID )
                    // InternalMeth.g:998:5: lv_varref_1_0= RULE_ID
                    {
                    lv_varref_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_varref_1_0, grammarAccess.getEinheitPrimaryAccess().getVarrefIDTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getEinheitPrimaryRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"varref",
                    						lv_varref_1_0,
                    						"hvbargen.meth.Meth.ID");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMeth.g:1015:3: (otherlv_2= '(' this_EinheitAddition_3= ruleEinheitAddition otherlv_4= ')' )
                    {
                    // InternalMeth.g:1015:3: (otherlv_2= '(' this_EinheitAddition_3= ruleEinheitAddition otherlv_4= ')' )
                    // InternalMeth.g:1016:4: otherlv_2= '(' this_EinheitAddition_3= ruleEinheitAddition otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getEinheitPrimaryAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getEinheitPrimaryAccess().getEinheitAdditionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_EinheitAddition_3=ruleEinheitAddition();

                    state._fsp--;


                    				current = this_EinheitAddition_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,22,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getEinheitPrimaryAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEinheitPrimary"


    // $ANTLR start "entryRuleMethode"
    // InternalMeth.g:1037:1: entryRuleMethode returns [EObject current=null] : iv_ruleMethode= ruleMethode EOF ;
    public final EObject entryRuleMethode() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMethode = null;


        try {
            // InternalMeth.g:1037:48: (iv_ruleMethode= ruleMethode EOF )
            // InternalMeth.g:1038:2: iv_ruleMethode= ruleMethode EOF
            {
             newCompositeNode(grammarAccess.getMethodeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMethode=ruleMethode();

            state._fsp--;

             current =iv_ruleMethode; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMethode"


    // $ANTLR start "ruleMethode"
    // InternalMeth.g:1044:1: ruleMethode returns [EObject current=null] : (otherlv_0= 'Methode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'als' ( (lv_bezeichnung_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( (lv_ablauf_5_1= ruleGegeben | lv_ablauf_5_2= ruleEingabe | lv_ablauf_5_3= ruleBerechnung | lv_ablauf_5_4= ruleAusgabe ) ) )+ otherlv_6= '}' ) ;
    public final EObject ruleMethode() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_bezeichnung_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_ablauf_5_1 = null;

        EObject lv_ablauf_5_2 = null;

        EObject lv_ablauf_5_3 = null;

        EObject lv_ablauf_5_4 = null;



        	enterRule();

        try {
            // InternalMeth.g:1050:2: ( (otherlv_0= 'Methode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'als' ( (lv_bezeichnung_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( (lv_ablauf_5_1= ruleGegeben | lv_ablauf_5_2= ruleEingabe | lv_ablauf_5_3= ruleBerechnung | lv_ablauf_5_4= ruleAusgabe ) ) )+ otherlv_6= '}' ) )
            // InternalMeth.g:1051:2: (otherlv_0= 'Methode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'als' ( (lv_bezeichnung_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( (lv_ablauf_5_1= ruleGegeben | lv_ablauf_5_2= ruleEingabe | lv_ablauf_5_3= ruleBerechnung | lv_ablauf_5_4= ruleAusgabe ) ) )+ otherlv_6= '}' )
            {
            // InternalMeth.g:1051:2: (otherlv_0= 'Methode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'als' ( (lv_bezeichnung_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( (lv_ablauf_5_1= ruleGegeben | lv_ablauf_5_2= ruleEingabe | lv_ablauf_5_3= ruleBerechnung | lv_ablauf_5_4= ruleAusgabe ) ) )+ otherlv_6= '}' )
            // InternalMeth.g:1052:3: otherlv_0= 'Methode' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'als' ( (lv_bezeichnung_3_0= RULE_STRING ) ) otherlv_4= '{' ( ( (lv_ablauf_5_1= ruleGegeben | lv_ablauf_5_2= ruleEingabe | lv_ablauf_5_3= ruleBerechnung | lv_ablauf_5_4= ruleAusgabe ) ) )+ otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMethodeAccess().getMethodeKeyword_0());
            		
            // InternalMeth.g:1056:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMeth.g:1057:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMeth.g:1057:4: (lv_name_1_0= RULE_ID )
            // InternalMeth.g:1058:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMethodeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"hvbargen.meth.Meth.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getMethodeAccess().getAlsKeyword_2());
            		
            // InternalMeth.g:1078:3: ( (lv_bezeichnung_3_0= RULE_STRING ) )
            // InternalMeth.g:1079:4: (lv_bezeichnung_3_0= RULE_STRING )
            {
            // InternalMeth.g:1079:4: (lv_bezeichnung_3_0= RULE_STRING )
            // InternalMeth.g:1080:5: lv_bezeichnung_3_0= RULE_STRING
            {
            lv_bezeichnung_3_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

            					newLeafNode(lv_bezeichnung_3_0, grammarAccess.getMethodeAccess().getBezeichnungSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMethodeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bezeichnung",
            						lv_bezeichnung_3_0,
            						"hvbargen.meth.Meth.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_4, grammarAccess.getMethodeAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMeth.g:1100:3: ( ( (lv_ablauf_5_1= ruleGegeben | lv_ablauf_5_2= ruleEingabe | lv_ablauf_5_3= ruleBerechnung | lv_ablauf_5_4= ruleAusgabe ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=31 && LA17_0<=34)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMeth.g:1101:4: ( (lv_ablauf_5_1= ruleGegeben | lv_ablauf_5_2= ruleEingabe | lv_ablauf_5_3= ruleBerechnung | lv_ablauf_5_4= ruleAusgabe ) )
            	    {
            	    // InternalMeth.g:1101:4: ( (lv_ablauf_5_1= ruleGegeben | lv_ablauf_5_2= ruleEingabe | lv_ablauf_5_3= ruleBerechnung | lv_ablauf_5_4= ruleAusgabe ) )
            	    // InternalMeth.g:1102:5: (lv_ablauf_5_1= ruleGegeben | lv_ablauf_5_2= ruleEingabe | lv_ablauf_5_3= ruleBerechnung | lv_ablauf_5_4= ruleAusgabe )
            	    {
            	    // InternalMeth.g:1102:5: (lv_ablauf_5_1= ruleGegeben | lv_ablauf_5_2= ruleEingabe | lv_ablauf_5_3= ruleBerechnung | lv_ablauf_5_4= ruleAusgabe )
            	    int alt16=4;
            	    switch ( input.LA(1) ) {
            	    case 31:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 32:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // InternalMeth.g:1103:6: lv_ablauf_5_1= ruleGegeben
            	            {

            	            						newCompositeNode(grammarAccess.getMethodeAccess().getAblaufGegebenParserRuleCall_5_0_0());
            	            					
            	            pushFollow(FOLLOW_20);
            	            lv_ablauf_5_1=ruleGegeben();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMethodeRule());
            	            						}
            	            						add(
            	            							current,
            	            							"ablauf",
            	            							lv_ablauf_5_1,
            	            							"hvbargen.meth.Meth.Gegeben");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 2 :
            	            // InternalMeth.g:1119:6: lv_ablauf_5_2= ruleEingabe
            	            {

            	            						newCompositeNode(grammarAccess.getMethodeAccess().getAblaufEingabeParserRuleCall_5_0_1());
            	            					
            	            pushFollow(FOLLOW_20);
            	            lv_ablauf_5_2=ruleEingabe();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMethodeRule());
            	            						}
            	            						add(
            	            							current,
            	            							"ablauf",
            	            							lv_ablauf_5_2,
            	            							"hvbargen.meth.Meth.Eingabe");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 3 :
            	            // InternalMeth.g:1135:6: lv_ablauf_5_3= ruleBerechnung
            	            {

            	            						newCompositeNode(grammarAccess.getMethodeAccess().getAblaufBerechnungParserRuleCall_5_0_2());
            	            					
            	            pushFollow(FOLLOW_20);
            	            lv_ablauf_5_3=ruleBerechnung();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMethodeRule());
            	            						}
            	            						add(
            	            							current,
            	            							"ablauf",
            	            							lv_ablauf_5_3,
            	            							"hvbargen.meth.Meth.Berechnung");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;
            	        case 4 :
            	            // InternalMeth.g:1151:6: lv_ablauf_5_4= ruleAusgabe
            	            {

            	            						newCompositeNode(grammarAccess.getMethodeAccess().getAblaufAusgabeParserRuleCall_5_0_3());
            	            					
            	            pushFollow(FOLLOW_20);
            	            lv_ablauf_5_4=ruleAusgabe();

            	            state._fsp--;


            	            						if (current==null) {
            	            							current = createModelElementForParent(grammarAccess.getMethodeRule());
            	            						}
            	            						add(
            	            							current,
            	            							"ablauf",
            	            							lv_ablauf_5_4,
            	            							"hvbargen.meth.Meth.Ausgabe");
            	            						afterParserOrEnumRuleCall();
            	            					

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMethodeAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMethode"


    // $ANTLR start "entryRuleGegeben"
    // InternalMeth.g:1177:1: entryRuleGegeben returns [EObject current=null] : iv_ruleGegeben= ruleGegeben EOF ;
    public final EObject entryRuleGegeben() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGegeben = null;


        try {
            // InternalMeth.g:1177:48: (iv_ruleGegeben= ruleGegeben EOF )
            // InternalMeth.g:1178:2: iv_ruleGegeben= ruleGegeben EOF
            {
             newCompositeNode(grammarAccess.getGegebenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGegeben=ruleGegeben();

            state._fsp--;

             current =iv_ruleGegeben; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGegeben"


    // $ANTLR start "ruleGegeben"
    // InternalMeth.g:1184:1: ruleGegeben returns [EObject current=null] : (otherlv_0= 'Gegeben' otherlv_1= '{' ( (lv_statements_2_0= ruleGegebenStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleGegeben() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:1190:2: ( (otherlv_0= 'Gegeben' otherlv_1= '{' ( (lv_statements_2_0= ruleGegebenStatement ) )* otherlv_3= '}' ) )
            // InternalMeth.g:1191:2: (otherlv_0= 'Gegeben' otherlv_1= '{' ( (lv_statements_2_0= ruleGegebenStatement ) )* otherlv_3= '}' )
            {
            // InternalMeth.g:1191:2: (otherlv_0= 'Gegeben' otherlv_1= '{' ( (lv_statements_2_0= ruleGegebenStatement ) )* otherlv_3= '}' )
            // InternalMeth.g:1192:3: otherlv_0= 'Gegeben' otherlv_1= '{' ( (lv_statements_2_0= ruleGegebenStatement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getGegebenAccess().getGegebenKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getGegebenAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMeth.g:1200:3: ( (lv_statements_2_0= ruleGegebenStatement ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMeth.g:1201:4: (lv_statements_2_0= ruleGegebenStatement )
            	    {
            	    // InternalMeth.g:1201:4: (lv_statements_2_0= ruleGegebenStatement )
            	    // InternalMeth.g:1202:5: lv_statements_2_0= ruleGegebenStatement
            	    {

            	    					newCompositeNode(grammarAccess.getGegebenAccess().getStatementsGegebenStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_statements_2_0=ruleGegebenStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGegebenRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"hvbargen.meth.Meth.GegebenStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getGegebenAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGegeben"


    // $ANTLR start "entryRuleEingabe"
    // InternalMeth.g:1227:1: entryRuleEingabe returns [EObject current=null] : iv_ruleEingabe= ruleEingabe EOF ;
    public final EObject entryRuleEingabe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEingabe = null;


        try {
            // InternalMeth.g:1227:48: (iv_ruleEingabe= ruleEingabe EOF )
            // InternalMeth.g:1228:2: iv_ruleEingabe= ruleEingabe EOF
            {
             newCompositeNode(grammarAccess.getEingabeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEingabe=ruleEingabe();

            state._fsp--;

             current =iv_ruleEingabe; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEingabe"


    // $ANTLR start "ruleEingabe"
    // InternalMeth.g:1234:1: ruleEingabe returns [EObject current=null] : (otherlv_0= 'Eingabe' otherlv_1= '{' ( (lv_statements_2_0= ruleEingabeStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleEingabe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:1240:2: ( (otherlv_0= 'Eingabe' otherlv_1= '{' ( (lv_statements_2_0= ruleEingabeStatement ) )* otherlv_3= '}' ) )
            // InternalMeth.g:1241:2: (otherlv_0= 'Eingabe' otherlv_1= '{' ( (lv_statements_2_0= ruleEingabeStatement ) )* otherlv_3= '}' )
            {
            // InternalMeth.g:1241:2: (otherlv_0= 'Eingabe' otherlv_1= '{' ( (lv_statements_2_0= ruleEingabeStatement ) )* otherlv_3= '}' )
            // InternalMeth.g:1242:3: otherlv_0= 'Eingabe' otherlv_1= '{' ( (lv_statements_2_0= ruleEingabeStatement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getEingabeAccess().getEingabeKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getEingabeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMeth.g:1250:3: ( (lv_statements_2_0= ruleEingabeStatement ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMeth.g:1251:4: (lv_statements_2_0= ruleEingabeStatement )
            	    {
            	    // InternalMeth.g:1251:4: (lv_statements_2_0= ruleEingabeStatement )
            	    // InternalMeth.g:1252:5: lv_statements_2_0= ruleEingabeStatement
            	    {

            	    					newCompositeNode(grammarAccess.getEingabeAccess().getStatementsEingabeStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_statements_2_0=ruleEingabeStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEingabeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"hvbargen.meth.Meth.EingabeStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEingabeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEingabe"


    // $ANTLR start "entryRuleBerechnung"
    // InternalMeth.g:1277:1: entryRuleBerechnung returns [EObject current=null] : iv_ruleBerechnung= ruleBerechnung EOF ;
    public final EObject entryRuleBerechnung() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBerechnung = null;


        try {
            // InternalMeth.g:1277:51: (iv_ruleBerechnung= ruleBerechnung EOF )
            // InternalMeth.g:1278:2: iv_ruleBerechnung= ruleBerechnung EOF
            {
             newCompositeNode(grammarAccess.getBerechnungRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBerechnung=ruleBerechnung();

            state._fsp--;

             current =iv_ruleBerechnung; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBerechnung"


    // $ANTLR start "ruleBerechnung"
    // InternalMeth.g:1284:1: ruleBerechnung returns [EObject current=null] : (otherlv_0= 'Berechnung' otherlv_1= '{' ( (lv_statements_2_0= ruleBerechnungStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleBerechnung() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:1290:2: ( (otherlv_0= 'Berechnung' otherlv_1= '{' ( (lv_statements_2_0= ruleBerechnungStatement ) )* otherlv_3= '}' ) )
            // InternalMeth.g:1291:2: (otherlv_0= 'Berechnung' otherlv_1= '{' ( (lv_statements_2_0= ruleBerechnungStatement ) )* otherlv_3= '}' )
            {
            // InternalMeth.g:1291:2: (otherlv_0= 'Berechnung' otherlv_1= '{' ( (lv_statements_2_0= ruleBerechnungStatement ) )* otherlv_3= '}' )
            // InternalMeth.g:1292:3: otherlv_0= 'Berechnung' otherlv_1= '{' ( (lv_statements_2_0= ruleBerechnungStatement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getBerechnungAccess().getBerechnungKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getBerechnungAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMeth.g:1300:3: ( (lv_statements_2_0= ruleBerechnungStatement ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMeth.g:1301:4: (lv_statements_2_0= ruleBerechnungStatement )
            	    {
            	    // InternalMeth.g:1301:4: (lv_statements_2_0= ruleBerechnungStatement )
            	    // InternalMeth.g:1302:5: lv_statements_2_0= ruleBerechnungStatement
            	    {

            	    					newCompositeNode(grammarAccess.getBerechnungAccess().getStatementsBerechnungStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_statements_2_0=ruleBerechnungStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBerechnungRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"hvbargen.meth.Meth.BerechnungStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getBerechnungAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBerechnung"


    // $ANTLR start "entryRuleAusgabe"
    // InternalMeth.g:1327:1: entryRuleAusgabe returns [EObject current=null] : iv_ruleAusgabe= ruleAusgabe EOF ;
    public final EObject entryRuleAusgabe() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAusgabe = null;


        try {
            // InternalMeth.g:1327:48: (iv_ruleAusgabe= ruleAusgabe EOF )
            // InternalMeth.g:1328:2: iv_ruleAusgabe= ruleAusgabe EOF
            {
             newCompositeNode(grammarAccess.getAusgabeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAusgabe=ruleAusgabe();

            state._fsp--;

             current =iv_ruleAusgabe; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAusgabe"


    // $ANTLR start "ruleAusgabe"
    // InternalMeth.g:1334:1: ruleAusgabe returns [EObject current=null] : (otherlv_0= 'Ausgabe' otherlv_1= '{' ( (lv_statements_2_0= ruleAusgabeStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleAusgabe() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:1340:2: ( (otherlv_0= 'Ausgabe' otherlv_1= '{' ( (lv_statements_2_0= ruleAusgabeStatement ) )* otherlv_3= '}' ) )
            // InternalMeth.g:1341:2: (otherlv_0= 'Ausgabe' otherlv_1= '{' ( (lv_statements_2_0= ruleAusgabeStatement ) )* otherlv_3= '}' )
            {
            // InternalMeth.g:1341:2: (otherlv_0= 'Ausgabe' otherlv_1= '{' ( (lv_statements_2_0= ruleAusgabeStatement ) )* otherlv_3= '}' )
            // InternalMeth.g:1342:3: otherlv_0= 'Ausgabe' otherlv_1= '{' ( (lv_statements_2_0= ruleAusgabeStatement ) )* otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getAusgabeAccess().getAusgabeKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getAusgabeAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMeth.g:1350:3: ( (lv_statements_2_0= ruleAusgabeStatement ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMeth.g:1351:4: (lv_statements_2_0= ruleAusgabeStatement )
            	    {
            	    // InternalMeth.g:1351:4: (lv_statements_2_0= ruleAusgabeStatement )
            	    // InternalMeth.g:1352:5: lv_statements_2_0= ruleAusgabeStatement
            	    {

            	    					newCompositeNode(grammarAccess.getAusgabeAccess().getStatementsAusgabeStatementParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_21);
            	    lv_statements_2_0=ruleAusgabeStatement();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getAusgabeRule());
            	    					}
            	    					add(
            	    						current,
            	    						"statements",
            	    						lv_statements_2_0,
            	    						"hvbargen.meth.Meth.AusgabeStatement");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getAusgabeAccess().getRightCurlyBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAusgabe"


    // $ANTLR start "entryRuleGegebenStatement"
    // InternalMeth.g:1377:1: entryRuleGegebenStatement returns [EObject current=null] : iv_ruleGegebenStatement= ruleGegebenStatement EOF ;
    public final EObject entryRuleGegebenStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGegebenStatement = null;


        try {
            // InternalMeth.g:1377:57: (iv_ruleGegebenStatement= ruleGegebenStatement EOF )
            // InternalMeth.g:1378:2: iv_ruleGegebenStatement= ruleGegebenStatement EOF
            {
             newCompositeNode(grammarAccess.getGegebenStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGegebenStatement=ruleGegebenStatement();

            state._fsp--;

             current =iv_ruleGegebenStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGegebenStatement"


    // $ANTLR start "ruleGegebenStatement"
    // InternalMeth.g:1384:1: ruleGegebenStatement returns [EObject current=null] : ( ( (lv_eingabename_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' )? otherlv_4= 'aus' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'als' ( (lv_bezeichnung_7_0= RULE_STRING ) ) otherlv_8= ';' ) ;
    public final EObject ruleGegebenStatement() throws RecognitionException {
        EObject current = null;

        Token lv_eingabename_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_bezeichnung_7_0=null;
        Token otherlv_8=null;
        EObject lv_einheit_2_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:1390:2: ( ( ( (lv_eingabename_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' )? otherlv_4= 'aus' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'als' ( (lv_bezeichnung_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
            // InternalMeth.g:1391:2: ( ( (lv_eingabename_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' )? otherlv_4= 'aus' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'als' ( (lv_bezeichnung_7_0= RULE_STRING ) ) otherlv_8= ';' )
            {
            // InternalMeth.g:1391:2: ( ( (lv_eingabename_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' )? otherlv_4= 'aus' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'als' ( (lv_bezeichnung_7_0= RULE_STRING ) ) otherlv_8= ';' )
            // InternalMeth.g:1392:3: ( (lv_eingabename_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' )? otherlv_4= 'aus' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'als' ( (lv_bezeichnung_7_0= RULE_STRING ) ) otherlv_8= ';'
            {
            // InternalMeth.g:1392:3: ( (lv_eingabename_0_0= RULE_ID ) )
            // InternalMeth.g:1393:4: (lv_eingabename_0_0= RULE_ID )
            {
            // InternalMeth.g:1393:4: (lv_eingabename_0_0= RULE_ID )
            // InternalMeth.g:1394:5: lv_eingabename_0_0= RULE_ID
            {
            lv_eingabename_0_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_eingabename_0_0, grammarAccess.getGegebenStatementAccess().getEingabenameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGegebenStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"eingabename",
            						lv_eingabename_0_0,
            						"hvbargen.meth.Meth.ID");
            				

            }


            }

            // InternalMeth.g:1410:3: (otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMeth.g:1411:4: otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getGegebenStatementAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMeth.g:1415:4: ( (lv_einheit_2_0= ruleEinheitMultiplikation ) )
                    // InternalMeth.g:1416:5: (lv_einheit_2_0= ruleEinheitMultiplikation )
                    {
                    // InternalMeth.g:1416:5: (lv_einheit_2_0= ruleEinheitMultiplikation )
                    // InternalMeth.g:1417:6: lv_einheit_2_0= ruleEinheitMultiplikation
                    {

                    						newCompositeNode(grammarAccess.getGegebenStatementAccess().getEinheitEinheitMultiplikationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_einheit_2_0=ruleEinheitMultiplikation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGegebenStatementRule());
                    						}
                    						set(
                    							current,
                    							"einheit",
                    							lv_einheit_2_0,
                    							"hvbargen.meth.Meth.EinheitMultiplikation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,36,FOLLOW_24); 

                    				newLeafNode(otherlv_3, grammarAccess.getGegebenStatementAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,37,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getGegebenStatementAccess().getAusKeyword_2());
            		
            // InternalMeth.g:1443:3: ( (otherlv_5= RULE_ID ) )
            // InternalMeth.g:1444:4: (otherlv_5= RULE_ID )
            {
            // InternalMeth.g:1444:4: (otherlv_5= RULE_ID )
            // InternalMeth.g:1445:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGegebenStatementRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_5, grammarAccess.getGegebenStatementAccess().getRefMethodeMethodeCrossReference_3_0());
            				

            }


            }

            otherlv_6=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_6, grammarAccess.getGegebenStatementAccess().getAlsKeyword_4());
            		
            // InternalMeth.g:1460:3: ( (lv_bezeichnung_7_0= RULE_STRING ) )
            // InternalMeth.g:1461:4: (lv_bezeichnung_7_0= RULE_STRING )
            {
            // InternalMeth.g:1461:4: (lv_bezeichnung_7_0= RULE_STRING )
            // InternalMeth.g:1462:5: lv_bezeichnung_7_0= RULE_STRING
            {
            lv_bezeichnung_7_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_bezeichnung_7_0, grammarAccess.getGegebenStatementAccess().getBezeichnungSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGegebenStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bezeichnung",
            						lv_bezeichnung_7_0,
            						"hvbargen.meth.Meth.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getGegebenStatementAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGegebenStatement"


    // $ANTLR start "entryRuleEingabeStatement"
    // InternalMeth.g:1486:1: entryRuleEingabeStatement returns [EObject current=null] : iv_ruleEingabeStatement= ruleEingabeStatement EOF ;
    public final EObject entryRuleEingabeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEingabeStatement = null;


        try {
            // InternalMeth.g:1486:57: (iv_ruleEingabeStatement= ruleEingabeStatement EOF )
            // InternalMeth.g:1487:2: iv_ruleEingabeStatement= ruleEingabeStatement EOF
            {
             newCompositeNode(grammarAccess.getEingabeStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEingabeStatement=ruleEingabeStatement();

            state._fsp--;

             current =iv_ruleEingabeStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEingabeStatement"


    // $ANTLR start "ruleEingabeStatement"
    // InternalMeth.g:1493:1: ruleEingabeStatement returns [EObject current=null] : ( ( (lv_eingabename_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' otherlv_4= 'als' ( (lv_bezeichnung_5_0= RULE_STRING ) ) otherlv_6= ';' ) ;
    public final EObject ruleEingabeStatement() throws RecognitionException {
        EObject current = null;

        Token lv_eingabename_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_bezeichnung_5_0=null;
        Token otherlv_6=null;
        EObject lv_einheit_2_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:1499:2: ( ( ( (lv_eingabename_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' otherlv_4= 'als' ( (lv_bezeichnung_5_0= RULE_STRING ) ) otherlv_6= ';' ) )
            // InternalMeth.g:1500:2: ( ( (lv_eingabename_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' otherlv_4= 'als' ( (lv_bezeichnung_5_0= RULE_STRING ) ) otherlv_6= ';' )
            {
            // InternalMeth.g:1500:2: ( ( (lv_eingabename_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' otherlv_4= 'als' ( (lv_bezeichnung_5_0= RULE_STRING ) ) otherlv_6= ';' )
            // InternalMeth.g:1501:3: ( (lv_eingabename_0_0= RULE_ID ) ) otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' otherlv_4= 'als' ( (lv_bezeichnung_5_0= RULE_STRING ) ) otherlv_6= ';'
            {
            // InternalMeth.g:1501:3: ( (lv_eingabename_0_0= RULE_ID ) )
            // InternalMeth.g:1502:4: (lv_eingabename_0_0= RULE_ID )
            {
            // InternalMeth.g:1502:4: (lv_eingabename_0_0= RULE_ID )
            // InternalMeth.g:1503:5: lv_eingabename_0_0= RULE_ID
            {
            lv_eingabename_0_0=(Token)match(input,RULE_ID,FOLLOW_25); 

            					newLeafNode(lv_eingabename_0_0, grammarAccess.getEingabeStatementAccess().getEingabenameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEingabeStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"eingabename",
            						lv_eingabename_0_0,
            						"hvbargen.meth.Meth.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getEingabeStatementAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalMeth.g:1523:3: ( (lv_einheit_2_0= ruleEinheitMultiplikation ) )
            // InternalMeth.g:1524:4: (lv_einheit_2_0= ruleEinheitMultiplikation )
            {
            // InternalMeth.g:1524:4: (lv_einheit_2_0= ruleEinheitMultiplikation )
            // InternalMeth.g:1525:5: lv_einheit_2_0= ruleEinheitMultiplikation
            {

            					newCompositeNode(grammarAccess.getEingabeStatementAccess().getEinheitEinheitMultiplikationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_23);
            lv_einheit_2_0=ruleEinheitMultiplikation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEingabeStatementRule());
            					}
            					set(
            						current,
            						"einheit",
            						lv_einheit_2_0,
            						"hvbargen.meth.Meth.EinheitMultiplikation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,36,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getEingabeStatementAccess().getRightSquareBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_4, grammarAccess.getEingabeStatementAccess().getAlsKeyword_4());
            		
            // InternalMeth.g:1550:3: ( (lv_bezeichnung_5_0= RULE_STRING ) )
            // InternalMeth.g:1551:4: (lv_bezeichnung_5_0= RULE_STRING )
            {
            // InternalMeth.g:1551:4: (lv_bezeichnung_5_0= RULE_STRING )
            // InternalMeth.g:1552:5: lv_bezeichnung_5_0= RULE_STRING
            {
            lv_bezeichnung_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_bezeichnung_5_0, grammarAccess.getEingabeStatementAccess().getBezeichnungSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEingabeStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bezeichnung",
            						lv_bezeichnung_5_0,
            						"hvbargen.meth.Meth.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEingabeStatementAccess().getSemicolonKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEingabeStatement"


    // $ANTLR start "entryRuleBerechnungStatement"
    // InternalMeth.g:1576:1: entryRuleBerechnungStatement returns [EObject current=null] : iv_ruleBerechnungStatement= ruleBerechnungStatement EOF ;
    public final EObject entryRuleBerechnungStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBerechnungStatement = null;


        try {
            // InternalMeth.g:1576:60: (iv_ruleBerechnungStatement= ruleBerechnungStatement EOF )
            // InternalMeth.g:1577:2: iv_ruleBerechnungStatement= ruleBerechnungStatement EOF
            {
             newCompositeNode(grammarAccess.getBerechnungStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBerechnungStatement=ruleBerechnungStatement();

            state._fsp--;

             current =iv_ruleBerechnungStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBerechnungStatement"


    // $ANTLR start "ruleBerechnungStatement"
    // InternalMeth.g:1583:1: ruleBerechnungStatement returns [EObject current=null] : ( ( (lv_berechnungname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formel_2_0= ruleFormel ) ) otherlv_3= 'als' ( (lv_bezeichnung_4_0= RULE_STRING ) ) otherlv_5= ';' ) ;
    public final EObject ruleBerechnungStatement() throws RecognitionException {
        EObject current = null;

        Token lv_berechnungname_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_bezeichnung_4_0=null;
        Token otherlv_5=null;
        EObject lv_formel_2_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:1589:2: ( ( ( (lv_berechnungname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formel_2_0= ruleFormel ) ) otherlv_3= 'als' ( (lv_bezeichnung_4_0= RULE_STRING ) ) otherlv_5= ';' ) )
            // InternalMeth.g:1590:2: ( ( (lv_berechnungname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formel_2_0= ruleFormel ) ) otherlv_3= 'als' ( (lv_bezeichnung_4_0= RULE_STRING ) ) otherlv_5= ';' )
            {
            // InternalMeth.g:1590:2: ( ( (lv_berechnungname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formel_2_0= ruleFormel ) ) otherlv_3= 'als' ( (lv_bezeichnung_4_0= RULE_STRING ) ) otherlv_5= ';' )
            // InternalMeth.g:1591:3: ( (lv_berechnungname_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_formel_2_0= ruleFormel ) ) otherlv_3= 'als' ( (lv_bezeichnung_4_0= RULE_STRING ) ) otherlv_5= ';'
            {
            // InternalMeth.g:1591:3: ( (lv_berechnungname_0_0= RULE_ID ) )
            // InternalMeth.g:1592:4: (lv_berechnungname_0_0= RULE_ID )
            {
            // InternalMeth.g:1592:4: (lv_berechnungname_0_0= RULE_ID )
            // InternalMeth.g:1593:5: lv_berechnungname_0_0= RULE_ID
            {
            lv_berechnungname_0_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_berechnungname_0_0, grammarAccess.getBerechnungStatementAccess().getBerechnungnameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBerechnungStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"berechnungname",
            						lv_berechnungname_0_0,
            						"hvbargen.meth.Meth.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getBerechnungStatementAccess().getEqualsSignKeyword_1());
            		
            // InternalMeth.g:1613:3: ( (lv_formel_2_0= ruleFormel ) )
            // InternalMeth.g:1614:4: (lv_formel_2_0= ruleFormel )
            {
            // InternalMeth.g:1614:4: (lv_formel_2_0= ruleFormel )
            // InternalMeth.g:1615:5: lv_formel_2_0= ruleFormel
            {

            					newCompositeNode(grammarAccess.getBerechnungStatementAccess().getFormelFormelParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_17);
            lv_formel_2_0=ruleFormel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBerechnungStatementRule());
            					}
            					set(
            						current,
            						"formel",
            						lv_formel_2_0,
            						"hvbargen.meth.Meth.Formel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_18); 

            			newLeafNode(otherlv_3, grammarAccess.getBerechnungStatementAccess().getAlsKeyword_3());
            		
            // InternalMeth.g:1636:3: ( (lv_bezeichnung_4_0= RULE_STRING ) )
            // InternalMeth.g:1637:4: (lv_bezeichnung_4_0= RULE_STRING )
            {
            // InternalMeth.g:1637:4: (lv_bezeichnung_4_0= RULE_STRING )
            // InternalMeth.g:1638:5: lv_bezeichnung_4_0= RULE_STRING
            {
            lv_bezeichnung_4_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_bezeichnung_4_0, grammarAccess.getBerechnungStatementAccess().getBezeichnungSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBerechnungStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"bezeichnung",
            						lv_bezeichnung_4_0,
            						"hvbargen.meth.Meth.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getBerechnungStatementAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBerechnungStatement"


    // $ANTLR start "entryRuleAusgabeStatement"
    // InternalMeth.g:1662:1: entryRuleAusgabeStatement returns [EObject current=null] : iv_ruleAusgabeStatement= ruleAusgabeStatement EOF ;
    public final EObject entryRuleAusgabeStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAusgabeStatement = null;


        try {
            // InternalMeth.g:1662:57: (iv_ruleAusgabeStatement= ruleAusgabeStatement EOF )
            // InternalMeth.g:1663:2: iv_ruleAusgabeStatement= ruleAusgabeStatement EOF
            {
             newCompositeNode(grammarAccess.getAusgabeStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAusgabeStatement=ruleAusgabeStatement();

            state._fsp--;

             current =iv_ruleAusgabeStatement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAusgabeStatement"


    // $ANTLR start "ruleAusgabeStatement"
    // InternalMeth.g:1669:1: ruleAusgabeStatement returns [EObject current=null] : ( ( (lv_ausgabename_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' )? (otherlv_4= 'als' ( (lv_bezeichnung_5_0= RULE_STRING ) ) )? otherlv_6= ';' ) ;
    public final EObject ruleAusgabeStatement() throws RecognitionException {
        EObject current = null;

        Token lv_ausgabename_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_bezeichnung_5_0=null;
        Token otherlv_6=null;
        EObject lv_einheit_2_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:1675:2: ( ( ( (lv_ausgabename_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' )? (otherlv_4= 'als' ( (lv_bezeichnung_5_0= RULE_STRING ) ) )? otherlv_6= ';' ) )
            // InternalMeth.g:1676:2: ( ( (lv_ausgabename_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' )? (otherlv_4= 'als' ( (lv_bezeichnung_5_0= RULE_STRING ) ) )? otherlv_6= ';' )
            {
            // InternalMeth.g:1676:2: ( ( (lv_ausgabename_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' )? (otherlv_4= 'als' ( (lv_bezeichnung_5_0= RULE_STRING ) ) )? otherlv_6= ';' )
            // InternalMeth.g:1677:3: ( (lv_ausgabename_0_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' )? (otherlv_4= 'als' ( (lv_bezeichnung_5_0= RULE_STRING ) ) )? otherlv_6= ';'
            {
            // InternalMeth.g:1677:3: ( (lv_ausgabename_0_0= RULE_ID ) )
            // InternalMeth.g:1678:4: (lv_ausgabename_0_0= RULE_ID )
            {
            // InternalMeth.g:1678:4: (lv_ausgabename_0_0= RULE_ID )
            // InternalMeth.g:1679:5: lv_ausgabename_0_0= RULE_ID
            {
            lv_ausgabename_0_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_ausgabename_0_0, grammarAccess.getAusgabeStatementAccess().getAusgabenameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAusgabeStatementRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ausgabename",
            						lv_ausgabename_0_0,
            						"hvbargen.meth.Meth.ID");
            				

            }


            }

            // InternalMeth.g:1695:3: (otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMeth.g:1696:4: otherlv_1= '[' ( (lv_einheit_2_0= ruleEinheitMultiplikation ) ) otherlv_3= ']'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getAusgabeStatementAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMeth.g:1700:4: ( (lv_einheit_2_0= ruleEinheitMultiplikation ) )
                    // InternalMeth.g:1701:5: (lv_einheit_2_0= ruleEinheitMultiplikation )
                    {
                    // InternalMeth.g:1701:5: (lv_einheit_2_0= ruleEinheitMultiplikation )
                    // InternalMeth.g:1702:6: lv_einheit_2_0= ruleEinheitMultiplikation
                    {

                    						newCompositeNode(grammarAccess.getAusgabeStatementAccess().getEinheitEinheitMultiplikationParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_einheit_2_0=ruleEinheitMultiplikation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAusgabeStatementRule());
                    						}
                    						set(
                    							current,
                    							"einheit",
                    							lv_einheit_2_0,
                    							"hvbargen.meth.Meth.EinheitMultiplikation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,36,FOLLOW_28); 

                    				newLeafNode(otherlv_3, grammarAccess.getAusgabeStatementAccess().getRightSquareBracketKeyword_1_2());
                    			

                    }
                    break;

            }

            // InternalMeth.g:1724:3: (otherlv_4= 'als' ( (lv_bezeichnung_5_0= RULE_STRING ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==30) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMeth.g:1725:4: otherlv_4= 'als' ( (lv_bezeichnung_5_0= RULE_STRING ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getAusgabeStatementAccess().getAlsKeyword_2_0());
                    			
                    // InternalMeth.g:1729:4: ( (lv_bezeichnung_5_0= RULE_STRING ) )
                    // InternalMeth.g:1730:5: (lv_bezeichnung_5_0= RULE_STRING )
                    {
                    // InternalMeth.g:1730:5: (lv_bezeichnung_5_0= RULE_STRING )
                    // InternalMeth.g:1731:6: lv_bezeichnung_5_0= RULE_STRING
                    {
                    lv_bezeichnung_5_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

                    						newLeafNode(lv_bezeichnung_5_0, grammarAccess.getAusgabeStatementAccess().getBezeichnungSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAusgabeStatementRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"bezeichnung",
                    							lv_bezeichnung_5_0,
                    							"hvbargen.meth.Meth.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getAusgabeStatementAccess().getSemicolonKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAusgabeStatement"


    // $ANTLR start "entryRuleFormel"
    // InternalMeth.g:1756:1: entryRuleFormel returns [EObject current=null] : iv_ruleFormel= ruleFormel EOF ;
    public final EObject entryRuleFormel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormel = null;


        try {
            // InternalMeth.g:1756:47: (iv_ruleFormel= ruleFormel EOF )
            // InternalMeth.g:1757:2: iv_ruleFormel= ruleFormel EOF
            {
             newCompositeNode(grammarAccess.getFormelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFormel=ruleFormel();

            state._fsp--;

             current =iv_ruleFormel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFormel"


    // $ANTLR start "ruleFormel"
    // InternalMeth.g:1763:1: ruleFormel returns [EObject current=null] : (this_TextFormel_0= ruleTextFormel | this_NumFormel_1= ruleNumFormel ) ;
    public final EObject ruleFormel() throws RecognitionException {
        EObject current = null;

        EObject this_TextFormel_0 = null;

        EObject this_NumFormel_1 = null;



        	enterRule();

        try {
            // InternalMeth.g:1769:2: ( (this_TextFormel_0= ruleTextFormel | this_NumFormel_1= ruleNumFormel ) )
            // InternalMeth.g:1770:2: (this_TextFormel_0= ruleTextFormel | this_NumFormel_1= ruleNumFormel )
            {
            // InternalMeth.g:1770:2: (this_TextFormel_0= ruleTextFormel | this_NumFormel_1= ruleNumFormel )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_DEZIMAL)||LA25_0==21) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalMeth.g:1771:3: this_TextFormel_0= ruleTextFormel
                    {

                    			newCompositeNode(grammarAccess.getFormelAccess().getTextFormelParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_TextFormel_0=ruleTextFormel();

                    state._fsp--;


                    			current = this_TextFormel_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMeth.g:1780:3: this_NumFormel_1= ruleNumFormel
                    {

                    			newCompositeNode(grammarAccess.getFormelAccess().getNumFormelParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumFormel_1=ruleNumFormel();

                    state._fsp--;


                    			current = this_NumFormel_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFormel"


    // $ANTLR start "entryRuleTextFormel"
    // InternalMeth.g:1792:1: entryRuleTextFormel returns [EObject current=null] : iv_ruleTextFormel= ruleTextFormel EOF ;
    public final EObject entryRuleTextFormel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextFormel = null;


        try {
            // InternalMeth.g:1792:51: (iv_ruleTextFormel= ruleTextFormel EOF )
            // InternalMeth.g:1793:2: iv_ruleTextFormel= ruleTextFormel EOF
            {
             newCompositeNode(grammarAccess.getTextFormelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTextFormel=ruleTextFormel();

            state._fsp--;

             current =iv_ruleTextFormel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTextFormel"


    // $ANTLR start "ruleTextFormel"
    // InternalMeth.g:1799:1: ruleTextFormel returns [EObject current=null] : ( (lv_tformel_0_0= 'TODO' ) ) ;
    public final EObject ruleTextFormel() throws RecognitionException {
        EObject current = null;

        Token lv_tformel_0_0=null;


        	enterRule();

        try {
            // InternalMeth.g:1805:2: ( ( (lv_tformel_0_0= 'TODO' ) ) )
            // InternalMeth.g:1806:2: ( (lv_tformel_0_0= 'TODO' ) )
            {
            // InternalMeth.g:1806:2: ( (lv_tformel_0_0= 'TODO' ) )
            // InternalMeth.g:1807:3: (lv_tformel_0_0= 'TODO' )
            {
            // InternalMeth.g:1807:3: (lv_tformel_0_0= 'TODO' )
            // InternalMeth.g:1808:4: lv_tformel_0_0= 'TODO'
            {
            lv_tformel_0_0=(Token)match(input,38,FOLLOW_2); 

            				newLeafNode(lv_tformel_0_0, grammarAccess.getTextFormelAccess().getTformelTODOKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getTextFormelRule());
            				}
            				setWithLastConsumed(current, "tformel", lv_tformel_0_0, "TODO");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTextFormel"


    // $ANTLR start "entryRuleNumFormel"
    // InternalMeth.g:1823:1: entryRuleNumFormel returns [EObject current=null] : iv_ruleNumFormel= ruleNumFormel EOF ;
    public final EObject entryRuleNumFormel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumFormel = null;


        try {
            // InternalMeth.g:1823:50: (iv_ruleNumFormel= ruleNumFormel EOF )
            // InternalMeth.g:1824:2: iv_ruleNumFormel= ruleNumFormel EOF
            {
             newCompositeNode(grammarAccess.getNumFormelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumFormel=ruleNumFormel();

            state._fsp--;

             current =iv_ruleNumFormel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumFormel"


    // $ANTLR start "ruleNumFormel"
    // InternalMeth.g:1830:1: ruleNumFormel returns [EObject current=null] : ( (lv_nformel_0_0= ruleEinheitAddition ) ) ;
    public final EObject ruleNumFormel() throws RecognitionException {
        EObject current = null;

        EObject lv_nformel_0_0 = null;



        	enterRule();

        try {
            // InternalMeth.g:1836:2: ( ( (lv_nformel_0_0= ruleEinheitAddition ) ) )
            // InternalMeth.g:1837:2: ( (lv_nformel_0_0= ruleEinheitAddition ) )
            {
            // InternalMeth.g:1837:2: ( (lv_nformel_0_0= ruleEinheitAddition ) )
            // InternalMeth.g:1838:3: (lv_nformel_0_0= ruleEinheitAddition )
            {
            // InternalMeth.g:1838:3: (lv_nformel_0_0= ruleEinheitAddition )
            // InternalMeth.g:1839:4: lv_nformel_0_0= ruleEinheitAddition
            {

            				newCompositeNode(grammarAccess.getNumFormelAccess().getNformelEinheitAdditionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_nformel_0_0=ruleEinheitAddition();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getNumFormelRule());
            				}
            				set(
            					current,
            					"nformel",
            					lv_nformel_0_0,
            					"hvbargen.meth.Meth.EinheitAddition");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumFormel"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000006818000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200070L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000780008000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000200070L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000840040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000040040000L});

}