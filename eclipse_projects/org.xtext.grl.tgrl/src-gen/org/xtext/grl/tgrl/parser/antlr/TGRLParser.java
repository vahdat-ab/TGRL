/*
* generated by Xtext
*/
package org.xtext.grl.tgrl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.grl.tgrl.services.TGRLGrammarAccess;

public class TGRLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private TGRLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.grl.tgrl.parser.antlr.internal.InternalTGRLParser createParser(XtextTokenStream stream) {
		return new org.xtext.grl.tgrl.parser.antlr.internal.InternalTGRLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public TGRLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(TGRLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}