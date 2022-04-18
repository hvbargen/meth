package hvbargen.meth.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMethLexer extends Lexer {
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

    public InternalMethLexer() {;} 
    public InternalMethLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMethLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMeth.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:11:7: ( 'Einheitensystem' )
            // InternalMeth.g:11:9: 'Einheitensystem'
            {
            match("Einheitensystem"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:12:7: ( '{' )
            // InternalMeth.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:13:7: ( '}' )
            // InternalMeth.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:14:7: ( 'Dimension' )
            // InternalMeth.g:14:9: 'Dimension'
            {
            match("Dimension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:15:7: ( '=' )
            // InternalMeth.g:15:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:16:7: ( ';' )
            // InternalMeth.g:16:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:17:7: ( '*' )
            // InternalMeth.g:17:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:18:7: ( '/' )
            // InternalMeth.g:18:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:19:7: ( '(' )
            // InternalMeth.g:19:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:20:7: ( ')' )
            // InternalMeth.g:20:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:21:7: ( 'Einheit' )
            // InternalMeth.g:21:9: 'Einheit'
            {
            match("Einheit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:22:7: ( 'in' )
            // InternalMeth.g:22:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:23:7: ( 'Umrechnung' )
            // InternalMeth.g:23:9: 'Umrechnung'
            {
            match("Umrechnung"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:24:7: ( 'Konstante' )
            // InternalMeth.g:24:9: 'Konstante'
            {
            match("Konstante"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:25:7: ( '+' )
            // InternalMeth.g:25:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:26:7: ( '-' )
            // InternalMeth.g:26:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:27:7: ( 'Methode' )
            // InternalMeth.g:27:9: 'Methode'
            {
            match("Methode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:28:7: ( 'als' )
            // InternalMeth.g:28:9: 'als'
            {
            match("als"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:29:7: ( 'Gegeben' )
            // InternalMeth.g:29:9: 'Gegeben'
            {
            match("Gegeben"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:30:7: ( 'Eingabe' )
            // InternalMeth.g:30:9: 'Eingabe'
            {
            match("Eingabe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:31:7: ( 'Berechnung' )
            // InternalMeth.g:31:9: 'Berechnung'
            {
            match("Berechnung"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:32:7: ( 'Ausgabe' )
            // InternalMeth.g:32:9: 'Ausgabe'
            {
            match("Ausgabe"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:33:7: ( '[' )
            // InternalMeth.g:33:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:34:7: ( ']' )
            // InternalMeth.g:34:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:35:7: ( 'aus' )
            // InternalMeth.g:35:9: 'aus'
            {
            match("aus"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:36:7: ( 'TODO' )
            // InternalMeth.g:36:9: 'TODO'
            {
            match("TODO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "RULE_GANZ"
    public final void mRULE_GANZ() throws RecognitionException {
        try {
            int _type = RULE_GANZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:1858:11: ( ( '+' | '-' )? RULE_INT ( '_' RULE_INT )* )
            // InternalMeth.g:1858:13: ( '+' | '-' )? RULE_INT ( '_' RULE_INT )*
            {
            // InternalMeth.g:1858:13: ( '+' | '-' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMeth.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_INT(); 
            // InternalMeth.g:1858:33: ( '_' RULE_INT )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='_') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMeth.g:1858:34: '_' RULE_INT
            	    {
            	    match('_'); 
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GANZ"

    // $ANTLR start "RULE_DEZIMAL"
    public final void mRULE_DEZIMAL() throws RecognitionException {
        try {
            int _type = RULE_DEZIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:1860:14: ( ( '+' | '-' )? RULE_INT ( '_' RULE_INT )* '.' ( RULE_INT ( '_' RULE_INT )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT ( '_' RULE_INT )* )? )
            // InternalMeth.g:1860:16: ( '+' | '-' )? RULE_INT ( '_' RULE_INT )* '.' ( RULE_INT ( '_' RULE_INT )* )? ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT ( '_' RULE_INT )* )?
            {
            // InternalMeth.g:1860:16: ( '+' | '-' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMeth.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_INT(); 
            // InternalMeth.g:1860:36: ( '_' RULE_INT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='_') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMeth.g:1860:37: '_' RULE_INT
            	    {
            	    match('_'); 
            	    mRULE_INT(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match('.'); 
            // InternalMeth.g:1860:56: ( RULE_INT ( '_' RULE_INT )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMeth.g:1860:57: RULE_INT ( '_' RULE_INT )*
                    {
                    mRULE_INT(); 
                    // InternalMeth.g:1860:66: ( '_' RULE_INT )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='_') ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMeth.g:1860:67: '_' RULE_INT
                    	    {
                    	    match('_'); 
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalMeth.g:1860:84: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT ( '_' RULE_INT )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='E'||LA9_0=='e') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMeth.g:1860:85: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT ( '_' RULE_INT )*
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMeth.g:1860:95: ( '+' | '-' )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='+'||LA7_0=='-') ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalMeth.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 
                    // InternalMeth.g:1860:115: ( '_' RULE_INT )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0=='_') ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMeth.g:1860:116: '_' RULE_INT
                    	    {
                    	    match('_'); 
                    	    mRULE_INT(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEZIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:1862:9: ( ( '$' | '\\u20AC' | ( '^' )? ( '\\u00B5' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u00B0' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '\\u00B2' | '\\u00B3' )? ) )
            // InternalMeth.g:1862:11: ( '$' | '\\u20AC' | ( '^' )? ( '\\u00B5' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u00B0' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '\\u00B2' | '\\u00B3' )? )
            {
            // InternalMeth.g:1862:11: ( '$' | '\\u20AC' | ( '^' )? ( '\\u00B5' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u00B0' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '\\u00B2' | '\\u00B3' )? )
            int alt14=3;
            switch ( input.LA(1) ) {
            case '$':
                {
                alt14=1;
                }
                break;
            case '\u20AC':
                {
                alt14=2;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case '^':
            case '_':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
            case '\u00B0':
            case '\u00B5':
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMeth.g:1862:12: '$'
                    {
                    match('$'); 

                    }
                    break;
                case 2 :
                    // InternalMeth.g:1862:16: '\\u20AC'
                    {
                    match('\u20AC'); 

                    }
                    break;
                case 3 :
                    // InternalMeth.g:1862:25: ( '^' )? ( '\\u00B5' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\\u00B0' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '\\u00B2' | '\\u00B3' )?
                    {
                    // InternalMeth.g:1862:25: ( '^' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='^') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalMeth.g:1862:25: '^'
                            {
                            match('^'); 

                            }
                            break;

                    }

                    // InternalMeth.g:1862:30: ( '\\u00B5' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\u00B5') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalMeth.g:1862:30: '\\u00B5'
                            {
                            match('\u00B5'); 

                            }
                            break;

                    }

                    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B0' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalMeth.g:1862:73: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMeth.g:
                    	    {
                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    // InternalMeth.g:1862:107: ( '\\u00B2' | '\\u00B3' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>='\u00B2' && LA13_0<='\u00B3')) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalMeth.g:
                            {
                            if ( (input.LA(1)>='\u00B2' && input.LA(1)<='\u00B3') ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            // InternalMeth.g:1864:19: ( ( '0' .. '9' )+ )
            // InternalMeth.g:1864:21: ( '0' .. '9' )+
            {
            // InternalMeth.g:1864:21: ( '0' .. '9' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMeth.g:1864:22: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:1866:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMeth.g:1866:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMeth.g:1866:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\"') ) {
                alt18=1;
            }
            else if ( (LA18_0=='\'') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMeth.g:1866:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMeth.g:1866:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMeth.g:1866:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMeth.g:1866:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMeth.g:1866:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMeth.g:1866:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMeth.g:1866:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMeth.g:1866:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:1868:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMeth.g:1868:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMeth.g:1868:24: ( options {greedy=false; } : . )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='*') ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1=='/') ) {
                        alt19=2;
                    }
                    else if ( ((LA19_1>='\u0000' && LA19_1<='.')||(LA19_1>='0' && LA19_1<='\uFFFF')) ) {
                        alt19=1;
                    }


                }
                else if ( ((LA19_0>='\u0000' && LA19_0<=')')||(LA19_0>='+' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMeth.g:1868:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:1870:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMeth.g:1870:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMeth.g:1870:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\u0000' && LA20_0<='\t')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMeth.g:1870:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // InternalMeth.g:1870:40: ( ( '\\r' )? '\\n' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\n'||LA22_0=='\r') ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMeth.g:1870:41: ( '\\r' )? '\\n'
                    {
                    // InternalMeth.g:1870:41: ( '\\r' )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0=='\r') ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalMeth.g:1870:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:1872:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMeth.g:1872:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMeth.g:1872:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMeth.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMeth.g:1874:16: ( . )
            // InternalMeth.g:1874:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMeth.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_GANZ | RULE_DEZIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt24=34;
        alt24 = dfa24.predict(input);
        switch (alt24) {
            case 1 :
                // InternalMeth.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalMeth.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalMeth.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalMeth.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalMeth.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalMeth.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalMeth.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalMeth.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalMeth.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalMeth.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalMeth.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalMeth.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalMeth.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalMeth.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalMeth.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalMeth.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalMeth.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalMeth.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalMeth.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalMeth.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalMeth.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalMeth.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalMeth.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalMeth.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalMeth.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalMeth.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalMeth.g:1:166: RULE_GANZ
                {
                mRULE_GANZ(); 

                }
                break;
            case 28 :
                // InternalMeth.g:1:176: RULE_DEZIMAL
                {
                mRULE_DEZIMAL(); 

                }
                break;
            case 29 :
                // InternalMeth.g:1:189: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 30 :
                // InternalMeth.g:1:197: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // InternalMeth.g:1:209: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 32 :
                // InternalMeth.g:1:225: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 33 :
                // InternalMeth.g:1:241: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 34 :
                // InternalMeth.g:1:249: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA24_eotS =
        "\1\uffff\1\43\2\uffff\1\43\3\uffff\1\54\2\uffff\3\43\1\62\1\64\5\43\2\uffff\1\43\1\76\2\uffff\2\41\1\uffff\2\41\2\uffff\1\43\3\uffff\1\43\10\uffff\1\105\2\43\1\uffff\1\76\1\uffff\6\43\2\uffff\1\43\5\uffff\2\43\1\uffff\3\43\1\126\1\127\4\43\1\76\6\43\2\uffff\3\43\1\145\11\43\1\uffff\11\43\1\171\1\172\3\43\1\176\1\177\1\43\1\u0081\1\43\2\uffff\3\43\2\uffff\1\43\1\uffff\1\43\1\u0088\1\43\1\u008a\2\43\1\uffff\1\u008d\1\uffff\1\u008e\1\43\2\uffff\3\43\1\u0093\1\uffff";
    static final String DFA24_eofS =
        "\u0094\uffff";
    static final String DFA24_minS =
        "\1\0\1\151\2\uffff\1\151\3\uffff\1\52\2\uffff\1\156\1\155\1\157\2\60\1\145\1\154\2\145\1\165\2\uffff\1\117\1\56\2\uffff\2\101\1\uffff\2\0\2\uffff\1\156\3\uffff\1\155\10\uffff\1\60\1\162\1\156\1\uffff\1\56\1\uffff\1\164\2\163\1\147\1\162\1\163\2\uffff\1\104\1\uffff\1\60\3\uffff\1\147\1\145\1\uffff\1\145\1\163\1\150\2\60\2\145\1\147\1\117\1\56\1\145\1\141\1\156\1\143\1\164\1\157\2\uffff\1\142\1\143\1\141\1\60\1\151\1\142\1\163\1\150\1\141\1\144\1\145\1\150\1\142\1\uffff\1\164\1\145\1\151\2\156\1\145\2\156\1\145\2\60\1\157\1\165\1\164\2\60\1\165\1\60\1\156\2\uffff\2\156\1\145\2\uffff\1\156\1\uffff\1\163\1\60\1\147\1\60\1\147\1\171\1\uffff\1\60\1\uffff\1\60\1\163\2\uffff\1\164\1\145\1\155\1\60\1\uffff";
    static final String DFA24_maxS =
        "\1\uffff\1\151\2\uffff\1\151\3\uffff\1\57\2\uffff\1\156\1\155\1\157\2\71\1\145\1\165\2\145\1\165\2\uffff\1\117\1\137\2\uffff\1\u00b5\1\u00b0\1\uffff\2\uffff\2\uffff\1\156\3\uffff\1\155\10\uffff\1\u00b3\1\162\1\156\1\uffff\1\137\1\uffff\1\164\2\163\1\147\1\162\1\163\2\uffff\1\104\1\uffff\1\71\3\uffff\1\150\1\145\1\uffff\1\145\1\163\1\150\2\u00b3\2\145\1\147\1\117\1\137\1\145\1\141\1\156\1\143\1\164\1\157\2\uffff\1\142\1\143\1\141\1\u00b3\1\151\1\142\1\163\1\150\1\141\1\144\1\145\1\150\1\142\1\uffff\1\164\1\145\1\151\2\156\1\145\2\156\1\145\2\u00b3\1\157\1\165\1\164\2\u00b3\1\165\1\u00b3\1\156\2\uffff\2\156\1\145\2\uffff\1\156\1\uffff\1\163\1\u00b3\1\147\1\u00b3\1\147\1\171\1\uffff\1\u00b3\1\uffff\1\u00b3\1\163\2\uffff\1\164\1\145\1\155\1\u00b3\1\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\5\1\6\1\7\1\uffff\1\11\1\12\12\uffff\1\27\1\30\2\uffff\2\35\2\uffff\1\35\2\uffff\1\41\1\42\1\uffff\1\35\1\2\1\3\1\uffff\1\5\1\6\1\7\1\37\1\40\1\10\1\11\1\12\3\uffff\1\17\1\uffff\1\20\6\uffff\1\27\1\30\1\uffff\1\33\1\uffff\1\34\1\36\1\41\2\uffff\1\14\20\uffff\1\22\1\31\15\uffff\1\32\23\uffff\1\13\1\24\3\uffff\1\21\1\23\1\uffff\1\26\6\uffff\1\4\1\uffff\1\16\2\uffff\1\15\1\25\4\uffff\1\1";
    static final String DFA24_specialS =
        "\1\2\35\uffff\1\1\1\0\164\uffff}>";
    static final String[] DFA24_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\1\41\1\36\1\41\1\31\2\41\1\37\1\11\1\12\1\7\1\16\1\41\1\17\1\41\1\10\12\30\1\41\1\6\1\41\1\5\3\41\1\24\1\23\1\35\1\4\1\1\1\35\1\22\3\35\1\15\1\35\1\20\6\35\1\27\1\14\5\35\1\25\1\41\1\26\1\33\1\35\1\41\1\21\7\35\1\13\21\35\1\2\1\41\1\3\62\41\1\35\4\41\1\34\u1ff6\41\1\32\udf53\41",
            "\1\42",
            "",
            "",
            "\1\46",
            "",
            "",
            "",
            "\1\52\4\uffff\1\53",
            "",
            "",
            "\1\57",
            "\1\60",
            "\1\61",
            "\12\63",
            "\12\63",
            "\1\65",
            "\1\66\10\uffff\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "",
            "",
            "\1\75",
            "\1\100\1\uffff\12\63\45\uffff\1\77",
            "",
            "",
            "\32\43\4\uffff\1\43\1\uffff\32\43\65\uffff\1\43\4\uffff\1\43",
            "\32\43\4\uffff\1\43\1\uffff\32\43\65\uffff\1\43",
            "",
            "\0\101",
            "\0\101",
            "",
            "",
            "\1\103",
            "",
            "",
            "",
            "\1\104",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\67\uffff\2\43",
            "\1\106",
            "\1\107",
            "",
            "\1\100\1\uffff\12\63\45\uffff\1\77",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "",
            "",
            "\1\116",
            "",
            "\12\117",
            "",
            "",
            "",
            "\1\121\1\120",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\67\uffff\2\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\67\uffff\2\43",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\100\1\uffff\12\117\45\uffff\1\77",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\67\uffff\2\43",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\4\43\1\170\25\43\67\uffff\2\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\67\uffff\2\43",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\67\uffff\2\43",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\67\uffff\2\43",
            "\1\u0080",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\67\uffff\2\43",
            "\1\u0082",
            "",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "",
            "",
            "\1\u0086",
            "",
            "\1\u0087",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\67\uffff\2\43",
            "\1\u0089",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\67\uffff\2\43",
            "\1\u008b",
            "\1\u008c",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\67\uffff\2\43",
            "",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\67\uffff\2\43",
            "\1\u008f",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\12\43\7\uffff\32\43\4\uffff\1\43\1\uffff\32\43\67\uffff\2\43",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | RULE_GANZ | RULE_DEZIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA24_31 = input.LA(1);

                        s = -1;
                        if ( ((LA24_31>='\u0000' && LA24_31<='\uFFFF')) ) {s = 65;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA24_30 = input.LA(1);

                        s = -1;
                        if ( ((LA24_30>='\u0000' && LA24_30<='\uFFFF')) ) {s = 65;}

                        else s = 33;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA24_0 = input.LA(1);

                        s = -1;
                        if ( (LA24_0=='E') ) {s = 1;}

                        else if ( (LA24_0=='{') ) {s = 2;}

                        else if ( (LA24_0=='}') ) {s = 3;}

                        else if ( (LA24_0=='D') ) {s = 4;}

                        else if ( (LA24_0=='=') ) {s = 5;}

                        else if ( (LA24_0==';') ) {s = 6;}

                        else if ( (LA24_0=='*') ) {s = 7;}

                        else if ( (LA24_0=='/') ) {s = 8;}

                        else if ( (LA24_0=='(') ) {s = 9;}

                        else if ( (LA24_0==')') ) {s = 10;}

                        else if ( (LA24_0=='i') ) {s = 11;}

                        else if ( (LA24_0=='U') ) {s = 12;}

                        else if ( (LA24_0=='K') ) {s = 13;}

                        else if ( (LA24_0=='+') ) {s = 14;}

                        else if ( (LA24_0=='-') ) {s = 15;}

                        else if ( (LA24_0=='M') ) {s = 16;}

                        else if ( (LA24_0=='a') ) {s = 17;}

                        else if ( (LA24_0=='G') ) {s = 18;}

                        else if ( (LA24_0=='B') ) {s = 19;}

                        else if ( (LA24_0=='A') ) {s = 20;}

                        else if ( (LA24_0=='[') ) {s = 21;}

                        else if ( (LA24_0==']') ) {s = 22;}

                        else if ( (LA24_0=='T') ) {s = 23;}

                        else if ( ((LA24_0>='0' && LA24_0<='9')) ) {s = 24;}

                        else if ( (LA24_0=='$') ) {s = 25;}

                        else if ( (LA24_0=='\u20AC') ) {s = 26;}

                        else if ( (LA24_0=='^') ) {s = 27;}

                        else if ( (LA24_0=='\u00B5') ) {s = 28;}

                        else if ( (LA24_0=='C'||LA24_0=='F'||(LA24_0>='H' && LA24_0<='J')||LA24_0=='L'||(LA24_0>='N' && LA24_0<='S')||(LA24_0>='V' && LA24_0<='Z')||LA24_0=='_'||(LA24_0>='b' && LA24_0<='h')||(LA24_0>='j' && LA24_0<='z')||LA24_0=='\u00B0') ) {s = 29;}

                        else if ( (LA24_0=='\"') ) {s = 30;}

                        else if ( (LA24_0=='\'') ) {s = 31;}

                        else if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {s = 32;}

                        else if ( ((LA24_0>='\u0000' && LA24_0<='\b')||(LA24_0>='\u000B' && LA24_0<='\f')||(LA24_0>='\u000E' && LA24_0<='\u001F')||LA24_0=='!'||LA24_0=='#'||(LA24_0>='%' && LA24_0<='&')||LA24_0==','||LA24_0=='.'||LA24_0==':'||LA24_0=='<'||(LA24_0>='>' && LA24_0<='@')||LA24_0=='\\'||LA24_0=='`'||LA24_0=='|'||(LA24_0>='~' && LA24_0<='\u00AF')||(LA24_0>='\u00B1' && LA24_0<='\u00B4')||(LA24_0>='\u00B6' && LA24_0<='\u20AB')||(LA24_0>='\u20AD' && LA24_0<='\uFFFF')) ) {s = 33;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 24, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}