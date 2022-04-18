/*
 * generated by Xtext 2.26.0
 */
package hvbargen.meth.parser.antlr;

import com.google.inject.Inject;
import hvbargen.meth.parser.antlr.internal.InternalMethParser;
import hvbargen.meth.services.MethGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MethParser extends AbstractAntlrParser {

	@Inject
	private MethGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMethParser createParser(XtextTokenStream stream) {
		return new InternalMethParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MethGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MethGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}