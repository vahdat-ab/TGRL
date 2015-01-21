package org.xtext.grl.tgrl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.grl.tgrl.services.TGRLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTGRLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'urnspec'", "'{'", "'}'", "'URNdefinition'", "'asdspec'", "'elementtLink'", "'actor'", "'intentionalElement'", "'impactModel'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;

    // delegates
    // delegators


        public InternalTGRLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTGRLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTGRLParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g"; }



     	private TGRLGrammarAccess grammarAccess;
     	
        public InternalTGRLParser(TokenStream input, TGRLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "URNspec";	
       	}
       	
       	@Override
       	protected TGRLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleURNspec"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:67:1: entryRuleURNspec returns [EObject current=null] : iv_ruleURNspec= ruleURNspec EOF ;
    public final EObject entryRuleURNspec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURNspec = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:68:2: (iv_ruleURNspec= ruleURNspec EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:69:2: iv_ruleURNspec= ruleURNspec EOF
            {
             newCompositeNode(grammarAccess.getURNspecRule()); 
            pushFollow(FOLLOW_ruleURNspec_in_entryRuleURNspec75);
            iv_ruleURNspec=ruleURNspec();

            state._fsp--;

             current =iv_ruleURNspec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURNspec85); 

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
    // $ANTLR end "entryRuleURNspec"


    // $ANTLR start "ruleURNspec"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:76:1: ruleURNspec returns [EObject current=null] : (otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_urndef_3_0= ruleURNdefinition ) ) ( (lv_asdspec_4_0= ruleASDspec ) ) ( (lv_grlspec_5_0= ruleGRLspec ) ) otherlv_6= '}' ) ;
    public final EObject ruleURNspec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_urndef_3_0 = null;

        EObject lv_asdspec_4_0 = null;

        EObject lv_grlspec_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:79:28: ( (otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_urndef_3_0= ruleURNdefinition ) ) ( (lv_asdspec_4_0= ruleASDspec ) ) ( (lv_grlspec_5_0= ruleGRLspec ) ) otherlv_6= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:80:1: (otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_urndef_3_0= ruleURNdefinition ) ) ( (lv_asdspec_4_0= ruleASDspec ) ) ( (lv_grlspec_5_0= ruleGRLspec ) ) otherlv_6= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:80:1: (otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_urndef_3_0= ruleURNdefinition ) ) ( (lv_asdspec_4_0= ruleASDspec ) ) ( (lv_grlspec_5_0= ruleGRLspec ) ) otherlv_6= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:80:3: otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_urndef_3_0= ruleURNdefinition ) ) ( (lv_asdspec_4_0= ruleASDspec ) ) ( (lv_grlspec_5_0= ruleGRLspec ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleURNspec122); 

                	newLeafNode(otherlv_0, grammarAccess.getURNspecAccess().getUrnspecKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:84:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:85:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:85:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:86:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleURNspec139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getURNspecAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getURNspecRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleURNspec156); 

                	newLeafNode(otherlv_2, grammarAccess.getURNspecAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:106:1: ( (lv_urndef_3_0= ruleURNdefinition ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:107:1: (lv_urndef_3_0= ruleURNdefinition )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:107:1: (lv_urndef_3_0= ruleURNdefinition )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:108:3: lv_urndef_3_0= ruleURNdefinition
            {
             
            	        newCompositeNode(grammarAccess.getURNspecAccess().getUrndefURNdefinitionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleURNdefinition_in_ruleURNspec177);
            lv_urndef_3_0=ruleURNdefinition();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getURNspecRule());
            	        }
                   		set(
                   			current, 
                   			"urndef",
                    		lv_urndef_3_0, 
                    		"URNdefinition");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:124:2: ( (lv_asdspec_4_0= ruleASDspec ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:125:1: (lv_asdspec_4_0= ruleASDspec )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:125:1: (lv_asdspec_4_0= ruleASDspec )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:126:3: lv_asdspec_4_0= ruleASDspec
            {
             
            	        newCompositeNode(grammarAccess.getURNspecAccess().getAsdspecASDspecParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleASDspec_in_ruleURNspec198);
            lv_asdspec_4_0=ruleASDspec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getURNspecRule());
            	        }
                   		set(
                   			current, 
                   			"asdspec",
                    		lv_asdspec_4_0, 
                    		"ASDspec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:142:2: ( (lv_grlspec_5_0= ruleGRLspec ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:143:1: (lv_grlspec_5_0= ruleGRLspec )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:143:1: (lv_grlspec_5_0= ruleGRLspec )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:144:3: lv_grlspec_5_0= ruleGRLspec
            {
             
            	        newCompositeNode(grammarAccess.getURNspecAccess().getGrlspecGRLspecParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleGRLspec_in_ruleURNspec219);
            lv_grlspec_5_0=ruleGRLspec();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getURNspecRule());
            	        }
                   		set(
                   			current, 
                   			"grlspec",
                    		lv_grlspec_5_0, 
                    		"GRLspec");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleURNspec231); 

                	newLeafNode(otherlv_6, grammarAccess.getURNspecAccess().getRightCurlyBracketKeyword_6());
                

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
    // $ANTLR end "ruleURNspec"


    // $ANTLR start "entryRuleURNdefinition"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:172:1: entryRuleURNdefinition returns [EObject current=null] : iv_ruleURNdefinition= ruleURNdefinition EOF ;
    public final EObject entryRuleURNdefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURNdefinition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:173:2: (iv_ruleURNdefinition= ruleURNdefinition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:174:2: iv_ruleURNdefinition= ruleURNdefinition EOF
            {
             newCompositeNode(grammarAccess.getURNdefinitionRule()); 
            pushFollow(FOLLOW_ruleURNdefinition_in_entryRuleURNdefinition267);
            iv_ruleURNdefinition=ruleURNdefinition();

            state._fsp--;

             current =iv_ruleURNdefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURNdefinition277); 

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
    // $ANTLR end "entryRuleURNdefinition"


    // $ANTLR start "ruleURNdefinition"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:181:1: ruleURNdefinition returns [EObject current=null] : otherlv_0= 'URNdefinition' ;
    public final EObject ruleURNdefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:184:28: (otherlv_0= 'URNdefinition' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:185:2: otherlv_0= 'URNdefinition'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleURNdefinition313); 

                	newLeafNode(otherlv_0, grammarAccess.getURNdefinitionAccess().getURNdefinitionKeyword());
                

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
    // $ANTLR end "ruleURNdefinition"


    // $ANTLR start "entryRuleASDspec"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:197:1: entryRuleASDspec returns [EObject current=null] : iv_ruleASDspec= ruleASDspec EOF ;
    public final EObject entryRuleASDspec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASDspec = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:198:2: (iv_ruleASDspec= ruleASDspec EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:199:2: iv_ruleASDspec= ruleASDspec EOF
            {
             newCompositeNode(grammarAccess.getASDspecRule()); 
            pushFollow(FOLLOW_ruleASDspec_in_entryRuleASDspec348);
            iv_ruleASDspec=ruleASDspec();

            state._fsp--;

             current =iv_ruleASDspec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleASDspec358); 

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
    // $ANTLR end "entryRuleASDspec"


    // $ANTLR start "ruleASDspec"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:206:1: ruleASDspec returns [EObject current=null] : otherlv_0= 'asdspec' ;
    public final EObject ruleASDspec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:209:28: (otherlv_0= 'asdspec' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:210:2: otherlv_0= 'asdspec'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleASDspec394); 

                	newLeafNode(otherlv_0, grammarAccess.getASDspecAccess().getAsdspecKeyword());
                

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
    // $ANTLR end "ruleASDspec"


    // $ANTLR start "entryRuleGRLspec"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:222:1: entryRuleGRLspec returns [EObject current=null] : iv_ruleGRLspec= ruleGRLspec EOF ;
    public final EObject entryRuleGRLspec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRLspec = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:223:2: (iv_ruleGRLspec= ruleGRLspec EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:224:2: iv_ruleGRLspec= ruleGRLspec EOF
            {
             newCompositeNode(grammarAccess.getGRLspecRule()); 
            pushFollow(FOLLOW_ruleGRLspec_in_entryRuleGRLspec429);
            iv_ruleGRLspec=ruleGRLspec();

            state._fsp--;

             current =iv_ruleGRLspec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRLspec439); 

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
    // $ANTLR end "entryRuleGRLspec"


    // $ANTLR start "ruleGRLspec"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:231:1: ruleGRLspec returns [EObject current=null] : ( ( (lv_links_0_0= ruleElementLink ) )* ( (lv_actors_1_0= ruleActor ) )* ( (lv_intElements_2_0= ruleIntentionalElement ) )* ( (lv_impactModel_3_0= ruleImpactModel ) )? ) ;
    public final EObject ruleGRLspec() throws RecognitionException {
        EObject current = null;

        EObject lv_links_0_0 = null;

        EObject lv_actors_1_0 = null;

        EObject lv_intElements_2_0 = null;

        EObject lv_impactModel_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:234:28: ( ( ( (lv_links_0_0= ruleElementLink ) )* ( (lv_actors_1_0= ruleActor ) )* ( (lv_intElements_2_0= ruleIntentionalElement ) )* ( (lv_impactModel_3_0= ruleImpactModel ) )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:235:1: ( ( (lv_links_0_0= ruleElementLink ) )* ( (lv_actors_1_0= ruleActor ) )* ( (lv_intElements_2_0= ruleIntentionalElement ) )* ( (lv_impactModel_3_0= ruleImpactModel ) )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:235:1: ( ( (lv_links_0_0= ruleElementLink ) )* ( (lv_actors_1_0= ruleActor ) )* ( (lv_intElements_2_0= ruleIntentionalElement ) )* ( (lv_impactModel_3_0= ruleImpactModel ) )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:235:2: ( (lv_links_0_0= ruleElementLink ) )* ( (lv_actors_1_0= ruleActor ) )* ( (lv_intElements_2_0= ruleIntentionalElement ) )* ( (lv_impactModel_3_0= ruleImpactModel ) )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:235:2: ( (lv_links_0_0= ruleElementLink ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:236:1: (lv_links_0_0= ruleElementLink )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:236:1: (lv_links_0_0= ruleElementLink )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:237:3: lv_links_0_0= ruleElementLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getLinksElementLinkParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementLink_in_ruleGRLspec485);
            	    lv_links_0_0=ruleElementLink();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"links",
            	            		lv_links_0_0, 
            	            		"ElementLink");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:253:3: ( (lv_actors_1_0= ruleActor ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==17) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:254:1: (lv_actors_1_0= ruleActor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:254:1: (lv_actors_1_0= ruleActor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:255:3: lv_actors_1_0= ruleActor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getActorsActorParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActor_in_ruleGRLspec507);
            	    lv_actors_1_0=ruleActor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actors",
            	            		lv_actors_1_0, 
            	            		"Actor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:271:3: ( (lv_intElements_2_0= ruleIntentionalElement ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:272:1: (lv_intElements_2_0= ruleIntentionalElement )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:272:1: (lv_intElements_2_0= ruleIntentionalElement )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:273:3: lv_intElements_2_0= ruleIntentionalElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getIntElementsIntentionalElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntentionalElement_in_ruleGRLspec529);
            	    lv_intElements_2_0=ruleIntentionalElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"intElements",
            	            		lv_intElements_2_0, 
            	            		"IntentionalElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:289:3: ( (lv_impactModel_3_0= ruleImpactModel ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:290:1: (lv_impactModel_3_0= ruleImpactModel )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:290:1: (lv_impactModel_3_0= ruleImpactModel )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:291:3: lv_impactModel_3_0= ruleImpactModel
                    {
                     
                    	        newCompositeNode(grammarAccess.getGRLspecAccess().getImpactModelImpactModelParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImpactModel_in_ruleGRLspec551);
                    lv_impactModel_3_0=ruleImpactModel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
                    	        }
                           		set(
                           			current, 
                           			"impactModel",
                            		lv_impactModel_3_0, 
                            		"ImpactModel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

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
    // $ANTLR end "ruleGRLspec"


    // $ANTLR start "entryRuleElementLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:315:1: entryRuleElementLink returns [EObject current=null] : iv_ruleElementLink= ruleElementLink EOF ;
    public final EObject entryRuleElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:316:2: (iv_ruleElementLink= ruleElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:317:2: iv_ruleElementLink= ruleElementLink EOF
            {
             newCompositeNode(grammarAccess.getElementLinkRule()); 
            pushFollow(FOLLOW_ruleElementLink_in_entryRuleElementLink588);
            iv_ruleElementLink=ruleElementLink();

            state._fsp--;

             current =iv_ruleElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLink598); 

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
    // $ANTLR end "entryRuleElementLink"


    // $ANTLR start "ruleElementLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:324:1: ruleElementLink returns [EObject current=null] : (otherlv_0= 'elementtLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleElementLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:327:28: ( (otherlv_0= 'elementtLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:328:1: (otherlv_0= 'elementtLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:328:1: (otherlv_0= 'elementtLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:328:3: otherlv_0= 'elementtLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleElementLink635); 

                	newLeafNode(otherlv_0, grammarAccess.getElementLinkAccess().getElementtLinkKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:332:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:333:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:333:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:334:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementLink652); 

            			newLeafNode(lv_name_1_0, grammarAccess.getElementLinkAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementLinkRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleElementLink669); 

                	newLeafNode(otherlv_2, grammarAccess.getElementLinkAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleElementLink681); 

                	newLeafNode(otherlv_3, grammarAccess.getElementLinkAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleElementLink"


    // $ANTLR start "entryRuleActor"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:366:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:367:2: (iv_ruleActor= ruleActor EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:368:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor717);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor727); 

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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:375:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:378:28: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:379:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:379:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:379:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleActor764); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:383:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:384:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:384:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:385:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor781); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleActor798); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleActor810); 

                	newLeafNode(otherlv_3, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleIntentionalElement"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:417:1: entryRuleIntentionalElement returns [EObject current=null] : iv_ruleIntentionalElement= ruleIntentionalElement EOF ;
    public final EObject entryRuleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentionalElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:418:2: (iv_ruleIntentionalElement= ruleIntentionalElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:419:2: iv_ruleIntentionalElement= ruleIntentionalElement EOF
            {
             newCompositeNode(grammarAccess.getIntentionalElementRule()); 
            pushFollow(FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement846);
            iv_ruleIntentionalElement=ruleIntentionalElement();

            state._fsp--;

             current =iv_ruleIntentionalElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntentionalElement856); 

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
    // $ANTLR end "entryRuleIntentionalElement"


    // $ANTLR start "ruleIntentionalElement"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:426:1: ruleIntentionalElement returns [EObject current=null] : (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleIntentionalElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:429:28: ( (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:430:1: (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:430:1: (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:430:3: otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleIntentionalElement893); 

                	newLeafNode(otherlv_0, grammarAccess.getIntentionalElementAccess().getIntentionalElementKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:434:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:435:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:435:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:436:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntentionalElement910); 

            			newLeafNode(lv_name_1_0, grammarAccess.getIntentionalElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIntentionalElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleIntentionalElement927); 

                	newLeafNode(otherlv_2, grammarAccess.getIntentionalElementAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleIntentionalElement939); 

                	newLeafNode(otherlv_3, grammarAccess.getIntentionalElementAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleIntentionalElement"


    // $ANTLR start "entryRuleImpactModel"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:468:1: entryRuleImpactModel returns [EObject current=null] : iv_ruleImpactModel= ruleImpactModel EOF ;
    public final EObject entryRuleImpactModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpactModel = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:469:2: (iv_ruleImpactModel= ruleImpactModel EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:470:2: iv_ruleImpactModel= ruleImpactModel EOF
            {
             newCompositeNode(grammarAccess.getImpactModelRule()); 
            pushFollow(FOLLOW_ruleImpactModel_in_entryRuleImpactModel975);
            iv_ruleImpactModel=ruleImpactModel();

            state._fsp--;

             current =iv_ruleImpactModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpactModel985); 

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
    // $ANTLR end "entryRuleImpactModel"


    // $ANTLR start "ruleImpactModel"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:477:1: ruleImpactModel returns [EObject current=null] : (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleImpactModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:480:28: ( (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:481:1: (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:481:1: (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:481:3: otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleImpactModel1022); 

                	newLeafNode(otherlv_0, grammarAccess.getImpactModelAccess().getImpactModelKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:485:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:486:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:486:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:487:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImpactModel1039); 

            			newLeafNode(lv_name_1_0, grammarAccess.getImpactModelAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getImpactModelRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleImpactModel1056); 

                	newLeafNode(otherlv_2, grammarAccess.getImpactModelAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleImpactModel1068); 

                	newLeafNode(otherlv_3, grammarAccess.getImpactModelAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleImpactModel"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleURNspec_in_entryRuleURNspec75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURNspec85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleURNspec122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURNspec139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleURNspec156 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleURNdefinition_in_ruleURNspec177 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleASDspec_in_ruleURNspec198 = new BitSet(new long[]{0x00000000000F2000L});
    public static final BitSet FOLLOW_ruleGRLspec_in_ruleURNspec219 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleURNspec231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURNdefinition_in_entryRuleURNdefinition267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURNdefinition277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleURNdefinition313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleASDspec_in_entryRuleASDspec348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleASDspec358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleASDspec394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRLspec_in_entryRuleGRLspec429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRLspec439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLink_in_ruleGRLspec485 = new BitSet(new long[]{0x00000000000F0002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleGRLspec507 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleGRLspec529 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_ruleImpactModel_in_ruleGRLspec551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLink_in_entryRuleElementLink588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLink598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleElementLink635 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementLink652 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleElementLink669 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleElementLink681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleActor764 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor781 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleActor798 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActor810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement846 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntentionalElement856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleIntentionalElement893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntentionalElement910 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleIntentionalElement927 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIntentionalElement939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpactModel_in_entryRuleImpactModel975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpactModel985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleImpactModel1022 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImpactModel1039 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleImpactModel1056 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImpactModel1068 = new BitSet(new long[]{0x0000000000000002L});

}