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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'urnspec'", "'{'", "'}'", "'URNdefinition'", "'asdspec'", "'grl'", "'elementtLink'", "'actor'", "'importance'", "'='", "';'", "'importanceQuantitative'", "'lineColor'", "'fillColor'", "'filled'", "'id'", "'description'", "'includingActor'", "','", "'intentionalElement'", "'impactModel'", "'none'", "'high'", "'medium'", "'low'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__12=12;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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

                if ( (LA4_0==31) ) {
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

            if ( (LA5_0==32) ) {
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:416:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'importance' otherlv_4= '=' ( (lv_importance_5_0= ruleImportanceType ) ) otherlv_6= ';' )? (otherlv_7= 'importanceQuantitative' otherlv_8= '=' ( (lv_importanceQuantitative_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'lineColor' otherlv_12= '=' ( (lv_lineColor_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'fillColor' otherlv_16= '=' ( (lv_fillColor_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'filled' otherlv_20= '=' ( (lv_filled_21_0= RULE_BOOLEAN ) ) otherlv_22= ';' )? (otherlv_23= 'id' otherlv_24= '=' ( (lv_id_25_0= RULE_ID ) ) otherlv_26= ';' )? (otherlv_27= 'description' otherlv_28= '=' ( (lv_description_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'includingActor' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= ';' )? otherlv_37= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_importanceQuantitative_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_lineColor_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_fillColor_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_filled_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_id_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_description_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Enumerator lv_importance_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:419:28: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'importance' otherlv_4= '=' ( (lv_importance_5_0= ruleImportanceType ) ) otherlv_6= ';' )? (otherlv_7= 'importanceQuantitative' otherlv_8= '=' ( (lv_importanceQuantitative_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'lineColor' otherlv_12= '=' ( (lv_lineColor_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'fillColor' otherlv_16= '=' ( (lv_fillColor_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'filled' otherlv_20= '=' ( (lv_filled_21_0= RULE_BOOLEAN ) ) otherlv_22= ';' )? (otherlv_23= 'id' otherlv_24= '=' ( (lv_id_25_0= RULE_ID ) ) otherlv_26= ';' )? (otherlv_27= 'description' otherlv_28= '=' ( (lv_description_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'includingActor' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= ';' )? otherlv_37= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:420:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'importance' otherlv_4= '=' ( (lv_importance_5_0= ruleImportanceType ) ) otherlv_6= ';' )? (otherlv_7= 'importanceQuantitative' otherlv_8= '=' ( (lv_importanceQuantitative_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'lineColor' otherlv_12= '=' ( (lv_lineColor_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'fillColor' otherlv_16= '=' ( (lv_fillColor_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'filled' otherlv_20= '=' ( (lv_filled_21_0= RULE_BOOLEAN ) ) otherlv_22= ';' )? (otherlv_23= 'id' otherlv_24= '=' ( (lv_id_25_0= RULE_ID ) ) otherlv_26= ';' )? (otherlv_27= 'description' otherlv_28= '=' ( (lv_description_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'includingActor' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= ';' )? otherlv_37= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:420:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'importance' otherlv_4= '=' ( (lv_importance_5_0= ruleImportanceType ) ) otherlv_6= ';' )? (otherlv_7= 'importanceQuantitative' otherlv_8= '=' ( (lv_importanceQuantitative_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'lineColor' otherlv_12= '=' ( (lv_lineColor_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'fillColor' otherlv_16= '=' ( (lv_fillColor_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'filled' otherlv_20= '=' ( (lv_filled_21_0= RULE_BOOLEAN ) ) otherlv_22= ';' )? (otherlv_23= 'id' otherlv_24= '=' ( (lv_id_25_0= RULE_ID ) ) otherlv_26= ';' )? (otherlv_27= 'description' otherlv_28= '=' ( (lv_description_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'includingActor' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= ';' )? otherlv_37= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:420:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'importance' otherlv_4= '=' ( (lv_importance_5_0= ruleImportanceType ) ) otherlv_6= ';' )? (otherlv_7= 'importanceQuantitative' otherlv_8= '=' ( (lv_importanceQuantitative_9_0= RULE_INT ) ) otherlv_10= ';' )? (otherlv_11= 'lineColor' otherlv_12= '=' ( (lv_lineColor_13_0= RULE_STRING ) ) otherlv_14= ';' )? (otherlv_15= 'fillColor' otherlv_16= '=' ( (lv_fillColor_17_0= RULE_STRING ) ) otherlv_18= ';' )? (otherlv_19= 'filled' otherlv_20= '=' ( (lv_filled_21_0= RULE_BOOLEAN ) ) otherlv_22= ';' )? (otherlv_23= 'id' otherlv_24= '=' ( (lv_id_25_0= RULE_ID ) ) otherlv_26= ';' )? (otherlv_27= 'description' otherlv_28= '=' ( (lv_description_29_0= RULE_STRING ) ) otherlv_30= ';' )? (otherlv_31= 'includingActor' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= ';' )? otherlv_37= '}'
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
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:446:1: (otherlv_3= 'importance' otherlv_4= '=' ( (lv_importance_5_0= ruleImportanceType ) ) otherlv_6= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:446:3: otherlv_3= 'importance' otherlv_4= '=' ( (lv_importance_5_0= ruleImportanceType ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleActor918); 

                        	newLeafNode(otherlv_3, grammarAccess.getActorAccess().getImportanceKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleActor930); 

                        	newLeafNode(otherlv_4, grammarAccess.getActorAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:454:1: ( (lv_importance_5_0= ruleImportanceType ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:455:1: (lv_importance_5_0= ruleImportanceType )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:455:1: (lv_importance_5_0= ruleImportanceType )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:456:3: lv_importance_5_0= ruleImportanceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getActorAccess().getImportanceImportanceTypeEnumRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImportanceType_in_ruleActor951);
                    lv_importance_5_0=ruleImportanceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getActorRule());
                    	        }
                           		set(
                           			current, 
                           			"importance",
                            		lv_importance_5_0, 
                            		"ImportanceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleActor963); 

                        	newLeafNode(otherlv_6, grammarAccess.getActorAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:476:3: (otherlv_7= 'importanceQuantitative' otherlv_8= '=' ( (lv_importanceQuantitative_9_0= RULE_INT ) ) otherlv_10= ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:476:5: otherlv_7= 'importanceQuantitative' otherlv_8= '=' ( (lv_importanceQuantitative_9_0= RULE_INT ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,23,FOLLOW_23_in_ruleActor978); 

                        	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getImportanceQuantitativeKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleActor990); 

                        	newLeafNode(otherlv_8, grammarAccess.getActorAccess().getEqualsSignKeyword_4_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:484:1: ( (lv_importanceQuantitative_9_0= RULE_INT ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:485:1: (lv_importanceQuantitative_9_0= RULE_INT )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:485:1: (lv_importanceQuantitative_9_0= RULE_INT )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:486:3: lv_importanceQuantitative_9_0= RULE_INT
                    {
                    lv_importanceQuantitative_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActor1007); 

                    			newLeafNode(lv_importanceQuantitative_9_0, grammarAccess.getActorAccess().getImportanceQuantitativeINTTerminalRuleCall_4_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"importanceQuantitative",
                            		lv_importanceQuantitative_9_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleActor1024); 

                        	newLeafNode(otherlv_10, grammarAccess.getActorAccess().getSemicolonKeyword_4_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:506:3: (otherlv_11= 'lineColor' otherlv_12= '=' ( (lv_lineColor_13_0= RULE_STRING ) ) otherlv_14= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:506:5: otherlv_11= 'lineColor' otherlv_12= '=' ( (lv_lineColor_13_0= RULE_STRING ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleActor1039); 

                        	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getLineColorKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleActor1051); 

                        	newLeafNode(otherlv_12, grammarAccess.getActorAccess().getEqualsSignKeyword_5_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:514:1: ( (lv_lineColor_13_0= RULE_STRING ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:515:1: (lv_lineColor_13_0= RULE_STRING )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:515:1: (lv_lineColor_13_0= RULE_STRING )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:516:3: lv_lineColor_13_0= RULE_STRING
                    {
                    lv_lineColor_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1068); 

                    			newLeafNode(lv_lineColor_13_0, grammarAccess.getActorAccess().getLineColorSTRINGTerminalRuleCall_5_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lineColor",
                            		lv_lineColor_13_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleActor1085); 

                        	newLeafNode(otherlv_14, grammarAccess.getActorAccess().getSemicolonKeyword_5_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:536:3: (otherlv_15= 'fillColor' otherlv_16= '=' ( (lv_fillColor_17_0= RULE_STRING ) ) otherlv_18= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:536:5: otherlv_15= 'fillColor' otherlv_16= '=' ( (lv_fillColor_17_0= RULE_STRING ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleActor1100); 

                        	newLeafNode(otherlv_15, grammarAccess.getActorAccess().getFillColorKeyword_6_0());
                        
                    otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleActor1112); 

                        	newLeafNode(otherlv_16, grammarAccess.getActorAccess().getEqualsSignKeyword_6_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:544:1: ( (lv_fillColor_17_0= RULE_STRING ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:545:1: (lv_fillColor_17_0= RULE_STRING )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:545:1: (lv_fillColor_17_0= RULE_STRING )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:546:3: lv_fillColor_17_0= RULE_STRING
                    {
                    lv_fillColor_17_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1129); 

                    			newLeafNode(lv_fillColor_17_0, grammarAccess.getActorAccess().getFillColorSTRINGTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fillColor",
                            		lv_fillColor_17_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,22,FOLLOW_22_in_ruleActor1146); 

                        	newLeafNode(otherlv_18, grammarAccess.getActorAccess().getSemicolonKeyword_6_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:566:3: (otherlv_19= 'filled' otherlv_20= '=' ( (lv_filled_21_0= RULE_BOOLEAN ) ) otherlv_22= ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:566:5: otherlv_19= 'filled' otherlv_20= '=' ( (lv_filled_21_0= RULE_BOOLEAN ) ) otherlv_22= ';'
                    {
                    otherlv_19=(Token)match(input,26,FOLLOW_26_in_ruleActor1161); 

                        	newLeafNode(otherlv_19, grammarAccess.getActorAccess().getFilledKeyword_7_0());
                        
                    otherlv_20=(Token)match(input,21,FOLLOW_21_in_ruleActor1173); 

                        	newLeafNode(otherlv_20, grammarAccess.getActorAccess().getEqualsSignKeyword_7_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:574:1: ( (lv_filled_21_0= RULE_BOOLEAN ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:575:1: (lv_filled_21_0= RULE_BOOLEAN )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:575:1: (lv_filled_21_0= RULE_BOOLEAN )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:576:3: lv_filled_21_0= RULE_BOOLEAN
                    {
                    lv_filled_21_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleActor1190); 

                    			newLeafNode(lv_filled_21_0, grammarAccess.getActorAccess().getFilledBOOLEANTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"filled",
                            		lv_filled_21_0, 
                            		"BOOLEAN");
                    	    

                    }


                    }

                    otherlv_22=(Token)match(input,22,FOLLOW_22_in_ruleActor1207); 

                        	newLeafNode(otherlv_22, grammarAccess.getActorAccess().getSemicolonKeyword_7_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:596:3: (otherlv_23= 'id' otherlv_24= '=' ( (lv_id_25_0= RULE_ID ) ) otherlv_26= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:596:5: otherlv_23= 'id' otherlv_24= '=' ( (lv_id_25_0= RULE_ID ) ) otherlv_26= ';'
                    {
                    otherlv_23=(Token)match(input,27,FOLLOW_27_in_ruleActor1222); 

                        	newLeafNode(otherlv_23, grammarAccess.getActorAccess().getIdKeyword_8_0());
                        
                    otherlv_24=(Token)match(input,21,FOLLOW_21_in_ruleActor1234); 

                        	newLeafNode(otherlv_24, grammarAccess.getActorAccess().getEqualsSignKeyword_8_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:604:1: ( (lv_id_25_0= RULE_ID ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:605:1: (lv_id_25_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:605:1: (lv_id_25_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:606:3: lv_id_25_0= RULE_ID
                    {
                    lv_id_25_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1251); 

                    			newLeafNode(lv_id_25_0, grammarAccess.getActorAccess().getIdIDTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_25_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_26=(Token)match(input,22,FOLLOW_22_in_ruleActor1268); 

                        	newLeafNode(otherlv_26, grammarAccess.getActorAccess().getSemicolonKeyword_8_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:626:3: (otherlv_27= 'description' otherlv_28= '=' ( (lv_description_29_0= RULE_STRING ) ) otherlv_30= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:626:5: otherlv_27= 'description' otherlv_28= '=' ( (lv_description_29_0= RULE_STRING ) ) otherlv_30= ';'
                    {
                    otherlv_27=(Token)match(input,28,FOLLOW_28_in_ruleActor1283); 

                        	newLeafNode(otherlv_27, grammarAccess.getActorAccess().getDescriptionKeyword_9_0());
                        
                    otherlv_28=(Token)match(input,21,FOLLOW_21_in_ruleActor1295); 

                        	newLeafNode(otherlv_28, grammarAccess.getActorAccess().getEqualsSignKeyword_9_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:634:1: ( (lv_description_29_0= RULE_STRING ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:635:1: (lv_description_29_0= RULE_STRING )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:635:1: (lv_description_29_0= RULE_STRING )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:636:3: lv_description_29_0= RULE_STRING
                    {
                    lv_description_29_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1312); 

                    			newLeafNode(lv_description_29_0, grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_29_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_30=(Token)match(input,22,FOLLOW_22_in_ruleActor1329); 

                        	newLeafNode(otherlv_30, grammarAccess.getActorAccess().getSemicolonKeyword_9_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:656:3: (otherlv_31= 'includingActor' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:656:5: otherlv_31= 'includingActor' otherlv_32= '=' ( (otherlv_33= RULE_ID ) ) (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )* otherlv_36= ';'
                    {
                    otherlv_31=(Token)match(input,29,FOLLOW_29_in_ruleActor1344); 

                        	newLeafNode(otherlv_31, grammarAccess.getActorAccess().getIncludingActorKeyword_10_0());
                        
                    otherlv_32=(Token)match(input,21,FOLLOW_21_in_ruleActor1356); 

                        	newLeafNode(otherlv_32, grammarAccess.getActorAccess().getEqualsSignKeyword_10_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:664:1: ( (otherlv_33= RULE_ID ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:665:1: (otherlv_33= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:665:1: (otherlv_33= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:666:3: otherlv_33= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getActorRule());
                    	        }
                            
                    otherlv_33=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1376); 

                    		newLeafNode(otherlv_33, grammarAccess.getActorAccess().getIncludedActorsActorCrossReference_10_2_0()); 
                    	

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:677:2: (otherlv_34= ',' ( (otherlv_35= RULE_ID ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==30) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:677:4: otherlv_34= ',' ( (otherlv_35= RULE_ID ) )
                    	    {
                    	    otherlv_34=(Token)match(input,30,FOLLOW_30_in_ruleActor1389); 

                    	        	newLeafNode(otherlv_34, grammarAccess.getActorAccess().getCommaKeyword_10_3_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:681:1: ( (otherlv_35= RULE_ID ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:682:1: (otherlv_35= RULE_ID )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:682:1: (otherlv_35= RULE_ID )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:683:3: otherlv_35= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActorRule());
                    	    	        }
                    	            
                    	    otherlv_35=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1409); 

                    	    		newLeafNode(otherlv_35, grammarAccess.getActorAccess().getIncludedActorsActorCrossReference_10_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,22,FOLLOW_22_in_ruleActor1423); 

                        	newLeafNode(otherlv_36, grammarAccess.getActorAccess().getSemicolonKeyword_10_4());
                        

                    }
                    break;

            }

            otherlv_37=(Token)match(input,14,FOLLOW_14_in_ruleActor1437); 

                	newLeafNode(otherlv_37, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_11());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:710:1: entryRuleIntentionalElement returns [EObject current=null] : iv_ruleIntentionalElement= ruleIntentionalElement EOF ;
    public final EObject entryRuleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentionalElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:711:2: (iv_ruleIntentionalElement= ruleIntentionalElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:712:2: iv_ruleIntentionalElement= ruleIntentionalElement EOF
            {
             newCompositeNode(grammarAccess.getIntentionalElementRule()); 
            pushFollow(FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement1473);
            iv_ruleIntentionalElement=ruleIntentionalElement();

            state._fsp--;

             current =iv_ruleIntentionalElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntentionalElement1483); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:719:1: ruleIntentionalElement returns [EObject current=null] : (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleIntentionalElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:722:28: ( (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:723:1: (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:723:1: (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:723:3: otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleIntentionalElement1520); 

                	newLeafNode(otherlv_0, grammarAccess.getIntentionalElementAccess().getIntentionalElementKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:727:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:728:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:728:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:729:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntentionalElement1537); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleIntentionalElement1554); 

                	newLeafNode(otherlv_2, grammarAccess.getIntentionalElementAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleIntentionalElement1566); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:761:1: entryRuleImpactModel returns [EObject current=null] : iv_ruleImpactModel= ruleImpactModel EOF ;
    public final EObject entryRuleImpactModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpactModel = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:762:2: (iv_ruleImpactModel= ruleImpactModel EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:763:2: iv_ruleImpactModel= ruleImpactModel EOF
            {
             newCompositeNode(grammarAccess.getImpactModelRule()); 
            pushFollow(FOLLOW_ruleImpactModel_in_entryRuleImpactModel1602);
            iv_ruleImpactModel=ruleImpactModel();

            state._fsp--;

             current =iv_ruleImpactModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpactModel1612); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:770:1: ruleImpactModel returns [EObject current=null] : (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleImpactModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:773:28: ( (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:774:1: (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:774:1: (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:774:3: otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleImpactModel1649); 

                	newLeafNode(otherlv_0, grammarAccess.getImpactModelAccess().getImpactModelKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:778:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:779:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:779:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:780:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImpactModel1666); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleImpactModel1683); 

                	newLeafNode(otherlv_2, grammarAccess.getImpactModelAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleImpactModel1695); 

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


    // $ANTLR start "ruleImportanceType"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:814:1: ruleImportanceType returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) ;
    public final Enumerator ruleImportanceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:816:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:817:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:817:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt15=1;
                }
                break;
            case 34:
                {
                alt15=2;
                }
                break;
            case 35:
                {
                alt15=3;
                }
                break;
            case 36:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:817:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:817:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:817:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleImportanceType1747); 

                            current = grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:823:6: (enumLiteral_1= 'high' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:823:6: (enumLiteral_1= 'high' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:823:8: enumLiteral_1= 'high'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleImportanceType1764); 

                            current = grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:829:6: (enumLiteral_2= 'medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:829:6: (enumLiteral_2= 'medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:829:8: enumLiteral_2= 'medium'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleImportanceType1781); 

                            current = grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:835:6: (enumLiteral_3= 'low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:835:6: (enumLiteral_3= 'low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:835:8: enumLiteral_3= 'low'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_36_in_ruleImportanceType1798); 

                            current = grammarAccess.getImportanceTypeAccess().getLowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getImportanceTypeAccess().getLowEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleImportanceType"

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
    public static final BitSet FOLLOW_13_in_ruleGRLspec559 = new BitSet(new long[]{0x00000001800C4000L});
    public static final BitSet FOLLOW_ruleElementLink_in_ruleGRLspec580 = new BitSet(new long[]{0x00000001800C4000L});
    public static final BitSet FOLLOW_ruleActor_in_ruleGRLspec602 = new BitSet(new long[]{0x0000000180084000L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleGRLspec624 = new BitSet(new long[]{0x0000000180004000L});
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
    public static final BitSet FOLLOW_13_in_ruleActor905 = new BitSet(new long[]{0x000000003F904000L});
    public static final BitSet FOLLOW_20_in_ruleActor918 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActor930 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleActor951 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor963 = new BitSet(new long[]{0x000000003F804000L});
    public static final BitSet FOLLOW_23_in_ruleActor978 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActor990 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActor1007 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor1024 = new BitSet(new long[]{0x000000003F004000L});
    public static final BitSet FOLLOW_24_in_ruleActor1039 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActor1051 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1068 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor1085 = new BitSet(new long[]{0x000000003E004000L});
    public static final BitSet FOLLOW_25_in_ruleActor1100 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActor1112 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1129 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor1146 = new BitSet(new long[]{0x000000003C004000L});
    public static final BitSet FOLLOW_26_in_ruleActor1161 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActor1173 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleActor1190 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor1207 = new BitSet(new long[]{0x0000000038004000L});
    public static final BitSet FOLLOW_27_in_ruleActor1222 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActor1234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor1251 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor1268 = new BitSet(new long[]{0x0000000030004000L});
    public static final BitSet FOLLOW_28_in_ruleActor1283 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActor1295 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1312 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor1329 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_29_in_ruleActor1344 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleActor1356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor1376 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_30_in_ruleActor1389 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor1409 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_22_in_ruleActor1423 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActor1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement1473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntentionalElement1483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleIntentionalElement1520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntentionalElement1537 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIntentionalElement1554 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIntentionalElement1566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpactModel_in_entryRuleImpactModel1602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpactModel1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleImpactModel1649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImpactModel1666 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImpactModel1683 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImpactModel1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleImportanceType1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleImportanceType1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleImportanceType1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleImportanceType1798 = new BitSet(new long[]{0x0000000000000002L});

}