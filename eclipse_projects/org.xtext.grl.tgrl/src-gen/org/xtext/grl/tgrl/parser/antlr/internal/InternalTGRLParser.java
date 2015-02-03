package org.xtext.grl.tgrl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOLEAN", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'urnspec'", "'{'", "'}'", "'URNdefinition'", "'asdspec'", "'grl'", "'elementtLink'", "'actor'", "'intentionalElement'", "'impactModel'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:68:1: entryRuleURNspec returns [EObject current=null] : iv_ruleURNspec= ruleURNspec EOF ;
    public final EObject entryRuleURNspec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURNspec = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:69:2: (iv_ruleURNspec= ruleURNspec EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:70:2: iv_ruleURNspec= ruleURNspec EOF
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:77:1: ruleURNspec returns [EObject current=null] : (otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_urndef_3_0= ruleURNdefinition ) ) ( (lv_asdspec_4_0= ruleASDspec ) ) ( (lv_grlspec_5_0= ruleGRLspec ) )? otherlv_6= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:80:28: ( (otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_urndef_3_0= ruleURNdefinition ) ) ( (lv_asdspec_4_0= ruleASDspec ) ) ( (lv_grlspec_5_0= ruleGRLspec ) )? otherlv_6= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:81:1: (otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_urndef_3_0= ruleURNdefinition ) ) ( (lv_asdspec_4_0= ruleASDspec ) ) ( (lv_grlspec_5_0= ruleGRLspec ) )? otherlv_6= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:81:1: (otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_urndef_3_0= ruleURNdefinition ) ) ( (lv_asdspec_4_0= ruleASDspec ) ) ( (lv_grlspec_5_0= ruleGRLspec ) )? otherlv_6= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:81:3: otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_urndef_3_0= ruleURNdefinition ) ) ( (lv_asdspec_4_0= ruleASDspec ) ) ( (lv_grlspec_5_0= ruleGRLspec ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleURNspec122); 

                	newLeafNode(otherlv_0, grammarAccess.getURNspecAccess().getUrnspecKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:86:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:87:3: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleURNspec156); 

                	newLeafNode(otherlv_2, grammarAccess.getURNspecAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:107:1: ( (lv_urndef_3_0= ruleURNdefinition ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:108:1: (lv_urndef_3_0= ruleURNdefinition )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:108:1: (lv_urndef_3_0= ruleURNdefinition )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:109:3: lv_urndef_3_0= ruleURNdefinition
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:125:2: ( (lv_asdspec_4_0= ruleASDspec ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:126:1: (lv_asdspec_4_0= ruleASDspec )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:126:1: (lv_asdspec_4_0= ruleASDspec )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:127:3: lv_asdspec_4_0= ruleASDspec
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:143:2: ( (lv_grlspec_5_0= ruleGRLspec ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:144:1: (lv_grlspec_5_0= ruleGRLspec )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:144:1: (lv_grlspec_5_0= ruleGRLspec )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:145:3: lv_grlspec_5_0= ruleGRLspec
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
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleURNspec232); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:173:1: entryRuleURNdefinition returns [EObject current=null] : iv_ruleURNdefinition= ruleURNdefinition EOF ;
    public final EObject entryRuleURNdefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURNdefinition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:174:2: (iv_ruleURNdefinition= ruleURNdefinition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:175:2: iv_ruleURNdefinition= ruleURNdefinition EOF
            {
             newCompositeNode(grammarAccess.getURNdefinitionRule()); 
            pushFollow(FOLLOW_ruleURNdefinition_in_entryRuleURNdefinition268);
            iv_ruleURNdefinition=ruleURNdefinition();

            state._fsp--;

             current =iv_ruleURNdefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURNdefinition278); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:182:1: ruleURNdefinition returns [EObject current=null] : (otherlv_0= 'URNdefinition' otherlv_1= '{' () otherlv_3= '}' ) ;
    public final EObject ruleURNdefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:185:28: ( (otherlv_0= 'URNdefinition' otherlv_1= '{' () otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:186:1: (otherlv_0= 'URNdefinition' otherlv_1= '{' () otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:186:1: (otherlv_0= 'URNdefinition' otherlv_1= '{' () otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:186:3: otherlv_0= 'URNdefinition' otherlv_1= '{' () otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleURNdefinition315); 

                	newLeafNode(otherlv_0, grammarAccess.getURNdefinitionAccess().getURNdefinitionKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleURNdefinition327); 

                	newLeafNode(otherlv_1, grammarAccess.getURNdefinitionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:194:1: ()
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:195:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getURNdefinitionAccess().getURNdefinitionAction_2(),
                        current);
                

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleURNdefinition348); 

                	newLeafNode(otherlv_3, grammarAccess.getURNdefinitionAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleURNdefinition"


    // $ANTLR start "entryRuleASDspec"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:212:1: entryRuleASDspec returns [EObject current=null] : iv_ruleASDspec= ruleASDspec EOF ;
    public final EObject entryRuleASDspec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASDspec = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:213:2: (iv_ruleASDspec= ruleASDspec EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:214:2: iv_ruleASDspec= ruleASDspec EOF
            {
             newCompositeNode(grammarAccess.getASDspecRule()); 
            pushFollow(FOLLOW_ruleASDspec_in_entryRuleASDspec384);
            iv_ruleASDspec=ruleASDspec();

            state._fsp--;

             current =iv_ruleASDspec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleASDspec394); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:221:1: ruleASDspec returns [EObject current=null] : (otherlv_0= 'asdspec' otherlv_1= '{' () otherlv_3= '}' ) ;
    public final EObject ruleASDspec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:224:28: ( (otherlv_0= 'asdspec' otherlv_1= '{' () otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:225:1: (otherlv_0= 'asdspec' otherlv_1= '{' () otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:225:1: (otherlv_0= 'asdspec' otherlv_1= '{' () otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:225:3: otherlv_0= 'asdspec' otherlv_1= '{' () otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleASDspec431); 

                	newLeafNode(otherlv_0, grammarAccess.getASDspecAccess().getAsdspecKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleASDspec443); 

                	newLeafNode(otherlv_1, grammarAccess.getASDspecAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:233:1: ()
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:234:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getASDspecAccess().getASDspecAction_2(),
                        current);
                

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleASDspec464); 

                	newLeafNode(otherlv_3, grammarAccess.getASDspecAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleASDspec"


    // $ANTLR start "entryRuleGRLspec"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:251:1: entryRuleGRLspec returns [EObject current=null] : iv_ruleGRLspec= ruleGRLspec EOF ;
    public final EObject entryRuleGRLspec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRLspec = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:252:2: (iv_ruleGRLspec= ruleGRLspec EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:253:2: iv_ruleGRLspec= ruleGRLspec EOF
            {
             newCompositeNode(grammarAccess.getGRLspecRule()); 
            pushFollow(FOLLOW_ruleGRLspec_in_entryRuleGRLspec500);
            iv_ruleGRLspec=ruleGRLspec();

            state._fsp--;

             current =iv_ruleGRLspec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRLspec510); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:260:1: ruleGRLspec returns [EObject current=null] : (otherlv_0= 'grl' otherlv_1= '{' ( (lv_links_2_0= ruleElementLink ) )* ( (lv_actors_3_0= ruleActor ) )* ( (lv_intElements_4_0= ruleIntentionalElement ) )* ( (lv_impactModel_5_0= ruleImpactModel ) )? otherlv_6= '}' ) ;
    public final EObject ruleGRLspec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_6=null;
        EObject lv_links_2_0 = null;

        EObject lv_actors_3_0 = null;

        EObject lv_intElements_4_0 = null;

        EObject lv_impactModel_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:263:28: ( (otherlv_0= 'grl' otherlv_1= '{' ( (lv_links_2_0= ruleElementLink ) )* ( (lv_actors_3_0= ruleActor ) )* ( (lv_intElements_4_0= ruleIntentionalElement ) )* ( (lv_impactModel_5_0= ruleImpactModel ) )? otherlv_6= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:264:1: (otherlv_0= 'grl' otherlv_1= '{' ( (lv_links_2_0= ruleElementLink ) )* ( (lv_actors_3_0= ruleActor ) )* ( (lv_intElements_4_0= ruleIntentionalElement ) )* ( (lv_impactModel_5_0= ruleImpactModel ) )? otherlv_6= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:264:1: (otherlv_0= 'grl' otherlv_1= '{' ( (lv_links_2_0= ruleElementLink ) )* ( (lv_actors_3_0= ruleActor ) )* ( (lv_intElements_4_0= ruleIntentionalElement ) )* ( (lv_impactModel_5_0= ruleImpactModel ) )? otherlv_6= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:264:3: otherlv_0= 'grl' otherlv_1= '{' ( (lv_links_2_0= ruleElementLink ) )* ( (lv_actors_3_0= ruleActor ) )* ( (lv_intElements_4_0= ruleIntentionalElement ) )* ( (lv_impactModel_5_0= ruleImpactModel ) )? otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleGRLspec547); 

                	newLeafNode(otherlv_0, grammarAccess.getGRLspecAccess().getGrlKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleGRLspec559); 

                	newLeafNode(otherlv_1, grammarAccess.getGRLspecAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:272:1: ( (lv_links_2_0= ruleElementLink ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:273:1: (lv_links_2_0= ruleElementLink )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:273:1: (lv_links_2_0= ruleElementLink )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:274:3: lv_links_2_0= ruleElementLink
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getLinksElementLinkParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleElementLink_in_ruleGRLspec580);
            	    lv_links_2_0=ruleElementLink();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"links",
            	            		lv_links_2_0, 
            	            		"ElementLink");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:290:3: ( (lv_actors_3_0= ruleActor ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:291:1: (lv_actors_3_0= ruleActor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:291:1: (lv_actors_3_0= ruleActor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:292:3: lv_actors_3_0= ruleActor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getActorsActorParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleActor_in_ruleGRLspec602);
            	    lv_actors_3_0=ruleActor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"actors",
            	            		lv_actors_3_0, 
            	            		"Actor");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:308:3: ( (lv_intElements_4_0= ruleIntentionalElement ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:309:1: (lv_intElements_4_0= ruleIntentionalElement )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:309:1: (lv_intElements_4_0= ruleIntentionalElement )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:310:3: lv_intElements_4_0= ruleIntentionalElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getIntElementsIntentionalElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleIntentionalElement_in_ruleGRLspec624);
            	    lv_intElements_4_0=ruleIntentionalElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"intElements",
            	            		lv_intElements_4_0, 
            	            		"IntentionalElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:326:3: ( (lv_impactModel_5_0= ruleImpactModel ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:327:1: (lv_impactModel_5_0= ruleImpactModel )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:327:1: (lv_impactModel_5_0= ruleImpactModel )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:328:3: lv_impactModel_5_0= ruleImpactModel
                    {
                     
                    	        newCompositeNode(grammarAccess.getGRLspecAccess().getImpactModelImpactModelParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImpactModel_in_ruleGRLspec646);
                    lv_impactModel_5_0=ruleImpactModel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
                    	        }
                           		set(
                           			current, 
                           			"impactModel",
                            		lv_impactModel_5_0, 
                            		"ImpactModel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleGRLspec659); 

                	newLeafNode(otherlv_6, grammarAccess.getGRLspecAccess().getRightCurlyBracketKeyword_6());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:356:1: entryRuleElementLink returns [EObject current=null] : iv_ruleElementLink= ruleElementLink EOF ;
    public final EObject entryRuleElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:357:2: (iv_ruleElementLink= ruleElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:358:2: iv_ruleElementLink= ruleElementLink EOF
            {
             newCompositeNode(grammarAccess.getElementLinkRule()); 
            pushFollow(FOLLOW_ruleElementLink_in_entryRuleElementLink695);
            iv_ruleElementLink=ruleElementLink();

            state._fsp--;

             current =iv_ruleElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLink705); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:365:1: ruleElementLink returns [EObject current=null] : (otherlv_0= 'elementtLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleElementLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:368:28: ( (otherlv_0= 'elementtLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:369:1: (otherlv_0= 'elementtLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:369:1: (otherlv_0= 'elementtLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:369:3: otherlv_0= 'elementtLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleElementLink742); 

                	newLeafNode(otherlv_0, grammarAccess.getElementLinkAccess().getElementtLinkKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:373:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:374:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:374:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:375:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementLink759); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleElementLink776); 

                	newLeafNode(otherlv_2, grammarAccess.getElementLinkAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleElementLink788); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:407:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:408:2: (iv_ruleActor= ruleActor EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:409:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor824);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor834); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:416:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:419:28: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:420:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:420:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:420:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleActor871); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:424:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:425:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:425:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:426:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor888); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleActor905); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleActor917); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:458:1: entryRuleIntentionalElement returns [EObject current=null] : iv_ruleIntentionalElement= ruleIntentionalElement EOF ;
    public final EObject entryRuleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentionalElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:459:2: (iv_ruleIntentionalElement= ruleIntentionalElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:460:2: iv_ruleIntentionalElement= ruleIntentionalElement EOF
            {
             newCompositeNode(grammarAccess.getIntentionalElementRule()); 
            pushFollow(FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement953);
            iv_ruleIntentionalElement=ruleIntentionalElement();

            state._fsp--;

             current =iv_ruleIntentionalElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntentionalElement963); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:467:1: ruleIntentionalElement returns [EObject current=null] : (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleIntentionalElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:470:28: ( (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:471:1: (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:471:1: (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:471:3: otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleIntentionalElement1000); 

                	newLeafNode(otherlv_0, grammarAccess.getIntentionalElementAccess().getIntentionalElementKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:475:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:476:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:476:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:477:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntentionalElement1017); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleIntentionalElement1034); 

                	newLeafNode(otherlv_2, grammarAccess.getIntentionalElementAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleIntentionalElement1046); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:509:1: entryRuleImpactModel returns [EObject current=null] : iv_ruleImpactModel= ruleImpactModel EOF ;
    public final EObject entryRuleImpactModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpactModel = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:510:2: (iv_ruleImpactModel= ruleImpactModel EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:511:2: iv_ruleImpactModel= ruleImpactModel EOF
            {
             newCompositeNode(grammarAccess.getImpactModelRule()); 
            pushFollow(FOLLOW_ruleImpactModel_in_entryRuleImpactModel1082);
            iv_ruleImpactModel=ruleImpactModel();

            state._fsp--;

             current =iv_ruleImpactModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpactModel1092); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:518:1: ruleImpactModel returns [EObject current=null] : (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleImpactModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:521:28: ( (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:522:1: (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:522:1: (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:522:3: otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleImpactModel1129); 

                	newLeafNode(otherlv_0, grammarAccess.getImpactModelAccess().getImpactModelKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:526:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:527:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:527:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:528:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImpactModel1146); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleImpactModel1163); 

                	newLeafNode(otherlv_2, grammarAccess.getImpactModelAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleImpactModel1175); 

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
    public static final BitSet FOLLOW_12_in_ruleURNspec122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURNspec139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleURNspec156 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ruleURNdefinition_in_ruleURNspec177 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ruleASDspec_in_ruleURNspec198 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_ruleGRLspec_in_ruleURNspec219 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleURNspec232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURNdefinition_in_entryRuleURNdefinition268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURNdefinition278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleURNdefinition315 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleURNdefinition327 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleURNdefinition348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleASDspec_in_entryRuleASDspec384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleASDspec394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleASDspec431 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleASDspec443 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleASDspec464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRLspec_in_entryRuleGRLspec500 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRLspec510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleGRLspec547 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGRLspec559 = new BitSet(new long[]{0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleElementLink_in_ruleGRLspec580 = new BitSet(new long[]{0x00000000003C4000L});
    public static final BitSet FOLLOW_ruleActor_in_ruleGRLspec602 = new BitSet(new long[]{0x0000000000384000L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleGRLspec624 = new BitSet(new long[]{0x0000000000304000L});
    public static final BitSet FOLLOW_ruleImpactModel_in_ruleGRLspec646 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGRLspec659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLink_in_entryRuleElementLink695 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLink705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleElementLink742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementLink759 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleElementLink776 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleElementLink788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleActor871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor888 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActor905 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActor917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntentionalElement963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleIntentionalElement1000 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntentionalElement1017 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIntentionalElement1034 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIntentionalElement1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpactModel_in_entryRuleImpactModel1082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpactModel1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleImpactModel1129 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImpactModel1146 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImpactModel1163 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImpactModel1175 = new BitSet(new long[]{0x0000000000000002L});

}