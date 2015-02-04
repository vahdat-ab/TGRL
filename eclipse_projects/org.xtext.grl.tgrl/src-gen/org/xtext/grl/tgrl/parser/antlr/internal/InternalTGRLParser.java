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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'urnspec'", "'{'", "'}'", "'URNdefinition'", "'asdspec'", "'grl'", "'decomposition'", "'->'", "';'", "'id'", "'='", "'description'", "'contribution'", "'quantitativeContribution'", "'correlation'", "'dependency'", "'actor'", "'importance'", "'importanceQuantitative'", "'lineColor'", "'fillColor'", "'filled'", "'includingActor'", "','", "'collapsedRefs'", "'intentionalElement'", "'type'", "'decompositionType'", "'ref'", "'impactModel'", "'strategiesGroup'", "'contributionContext'", "'contributionContextGroup'", "'softGoal'", "'goal'", "'Task'", "'resource'", "'indicator'", "'none'", "'high'", "'medium'", "'low'", "'and'", "'or'", "'xor'", "'help'", "'make'", "'somePositive'", "'unknown'", "'someNegative'", "'hurt'", "'break'"
    };
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:260:1: ruleGRLspec returns [EObject current=null] : (otherlv_0= 'grl' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) ;
    public final EObject ruleGRLspec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_10=null;
        EObject lv_links_3_0 = null;

        EObject lv_actors_4_0 = null;

        EObject lv_intElements_5_0 = null;

        EObject lv_impactModel_6_0 = null;

        EObject lv_groups_7_0 = null;

        EObject lv_contributionContexts_8_0 = null;

        EObject lv_contributionGroups_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:263:28: ( (otherlv_0= 'grl' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:264:1: (otherlv_0= 'grl' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:264:1: (otherlv_0= 'grl' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:264:3: otherlv_0= 'grl' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleGRLspec547); 

                	newLeafNode(otherlv_0, grammarAccess.getGRLspecAccess().getGrlKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleGRLspec559); 

                	newLeafNode(otherlv_1, grammarAccess.getGRLspecAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:272:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:274:1: ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:274:1: ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:275:2: ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGRLspecAccess().getUnorderedGroup_2());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:278:2: ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:279:3: ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:279:3: ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )*
            loop8:
            do {
                int alt8=8;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18||LA8_0==24||LA8_0==27) && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 1) ) {
                    alt8=2;
                }
                else if ( LA8_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 2) ) {
                    alt8=3;
                }
                else if ( LA8_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 3) ) {
                    alt8=4;
                }
                else if ( LA8_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 4) ) {
                    alt8=5;
                }
                else if ( LA8_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 5) ) {
                    alt8=6;
                }
                else if ( LA8_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 6) ) {
                    alt8=7;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:281:4: ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:281:4: ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:282:5: {...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:282:104: ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:283:6: ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:286:6: ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        switch ( input.LA(1) ) {
            	        case 18:
            	            {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;
            	        case 24:
            	            {
            	            int LA2_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;
            	        case 27:
            	            {
            	            int LA2_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:286:7: {...}? => ( (lv_links_3_0= ruleElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:286:16: ( (lv_links_3_0= ruleElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:287:1: (lv_links_3_0= ruleElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:287:1: (lv_links_3_0= ruleElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:288:3: lv_links_3_0= ruleElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getLinksElementLinkParserRuleCall_2_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleElementLink_in_ruleGRLspec625);
            	    	    lv_links_3_0=ruleElementLink();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"links",
            	    	            		lv_links_3_0, 
            	    	            		"ElementLink");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGRLspecAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:311:4: ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:311:4: ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:312:5: {...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:312:104: ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:313:6: ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:316:6: ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==28) ) {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:316:7: {...}? => ( (lv_actors_4_0= ruleActor ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:316:16: ( (lv_actors_4_0= ruleActor ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:317:1: (lv_actors_4_0= ruleActor )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:317:1: (lv_actors_4_0= ruleActor )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:318:3: lv_actors_4_0= ruleActor
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getActorsActorParserRuleCall_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleActor_in_ruleGRLspec701);
            	    	    lv_actors_4_0=ruleActor();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"actors",
            	    	            		lv_actors_4_0, 
            	    	            		"Actor");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	                EarlyExitException eee =
            	                    new EarlyExitException(3, input);
            	                throw eee;
            	        }
            	        cnt3++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGRLspecAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:341:4: ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:341:4: ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:342:5: {...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:342:104: ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:343:6: ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:346:6: ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==37) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:346:7: {...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:346:16: ( (lv_intElements_5_0= ruleIntentionalElement ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:347:1: (lv_intElements_5_0= ruleIntentionalElement )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:347:1: (lv_intElements_5_0= ruleIntentionalElement )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:348:3: lv_intElements_5_0= ruleIntentionalElement
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getIntElementsIntentionalElementParserRuleCall_2_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleIntentionalElement_in_ruleGRLspec777);
            	    	    lv_intElements_5_0=ruleIntentionalElement();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"intElements",
            	    	            		lv_intElements_5_0, 
            	    	            		"IntentionalElement");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGRLspecAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:371:4: ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:371:4: ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:372:5: {...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:372:104: ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:373:6: ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:376:6: ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:376:7: {...}? => ( (lv_impactModel_6_0= ruleImpactModel ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:376:16: ( (lv_impactModel_6_0= ruleImpactModel ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:377:1: (lv_impactModel_6_0= ruleImpactModel )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:377:1: (lv_impactModel_6_0= ruleImpactModel )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:378:3: lv_impactModel_6_0= ruleImpactModel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getImpactModelImpactModelParserRuleCall_2_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImpactModel_in_ruleGRLspec853);
            	    lv_impactModel_6_0=ruleImpactModel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"impactModel",
            	            		lv_impactModel_6_0, 
            	            		"ImpactModel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGRLspecAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:401:4: ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:401:4: ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:402:5: {...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:402:104: ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:403:6: ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:406:6: ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==42) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:406:7: {...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:406:16: ( (lv_groups_7_0= ruleStrategiesGroup ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:407:1: (lv_groups_7_0= ruleStrategiesGroup )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:407:1: (lv_groups_7_0= ruleStrategiesGroup )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:408:3: lv_groups_7_0= ruleStrategiesGroup
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getGroupsStrategiesGroupParserRuleCall_2_4_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleStrategiesGroup_in_ruleGRLspec928);
            	    	    lv_groups_7_0=ruleStrategiesGroup();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"groups",
            	    	            		lv_groups_7_0, 
            	    	            		"StrategiesGroup");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGRLspecAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:431:4: ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:431:4: ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:432:5: {...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:432:104: ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:433:6: ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:436:6: ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==43) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:436:7: {...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:436:16: ( (lv_contributionContexts_8_0= ruleContributionContext ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:437:1: (lv_contributionContexts_8_0= ruleContributionContext )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:437:1: (lv_contributionContexts_8_0= ruleContributionContext )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:438:3: lv_contributionContexts_8_0= ruleContributionContext
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getContributionContextsContributionContextParserRuleCall_2_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleContributionContext_in_ruleGRLspec1004);
            	    	    lv_contributionContexts_8_0=ruleContributionContext();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"contributionContexts",
            	    	            		lv_contributionContexts_8_0, 
            	    	            		"ContributionContext");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGRLspecAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:461:4: ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:461:4: ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:462:5: {...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:462:104: ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:463:6: ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:466:6: ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==44) ) {
            	            int LA7_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt7=1;
            	            }


            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:466:7: {...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:466:16: ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:467:1: (lv_contributionGroups_9_0= ruleContributionContextGroup )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:467:1: (lv_contributionGroups_9_0= ruleContributionContextGroup )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:468:3: lv_contributionGroups_9_0= ruleContributionContextGroup
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getContributionGroupsContributionContextGroupParserRuleCall_2_6_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleContributionContextGroup_in_ruleGRLspec1080);
            	    	    lv_contributionGroups_9_0=ruleContributionContextGroup();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getGRLspecRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"contributionGroups",
            	    	            		lv_contributionGroups_9_0, 
            	    	            		"ContributionContextGroup");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt7 >= 1 ) break loop7;
            	                EarlyExitException eee =
            	                    new EarlyExitException(7, input);
            	                throw eee;
            	        }
            	        cnt7++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGRLspecAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGRLspecAccess().getUnorderedGroup_2());
            	

            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleGRLspec1133); 

                	newLeafNode(otherlv_10, grammarAccess.getGRLspecAccess().getRightCurlyBracketKeyword_3());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:510:1: entryRuleElementLink returns [EObject current=null] : iv_ruleElementLink= ruleElementLink EOF ;
    public final EObject entryRuleElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:511:2: (iv_ruleElementLink= ruleElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:512:2: iv_ruleElementLink= ruleElementLink EOF
            {
             newCompositeNode(grammarAccess.getElementLinkRule()); 
            pushFollow(FOLLOW_ruleElementLink_in_entryRuleElementLink1169);
            iv_ruleElementLink=ruleElementLink();

            state._fsp--;

             current =iv_ruleElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLink1179); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:519:1: ruleElementLink returns [EObject current=null] : (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency ) ;
    public final EObject ruleElementLink() throws RecognitionException {
        EObject current = null;

        EObject this_Decomposition_0 = null;

        EObject this_Contribution_1 = null;

        EObject this_Dependency_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:522:28: ( (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:523:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:523:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 24:
                {
                alt9=2;
                }
                break;
            case 27:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:524:5: this_Decomposition_0= ruleDecomposition
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDecompositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecomposition_in_ruleElementLink1226);
                    this_Decomposition_0=ruleDecomposition();

                    state._fsp--;

                     
                            current = this_Decomposition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:534:5: this_Contribution_1= ruleContribution
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getContributionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContribution_in_ruleElementLink1253);
                    this_Contribution_1=ruleContribution();

                    state._fsp--;

                     
                            current = this_Contribution_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:544:5: this_Dependency_2= ruleDependency
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDependencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDependency_in_ruleElementLink1280);
                    this_Dependency_2=ruleDependency();

                    state._fsp--;

                     
                            current = this_Dependency_2; 
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
    // $ANTLR end "ruleElementLink"


    // $ANTLR start "entryRuleDecomposition"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:560:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:561:2: (iv_ruleDecomposition= ruleDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:562:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             newCompositeNode(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition1315);
            iv_ruleDecomposition=ruleDecomposition();

            state._fsp--;

             current =iv_ruleDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition1325); 

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
    // $ANTLR end "entryRuleDecomposition"


    // $ANTLR start "ruleDecomposition"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:569:1: ruleDecomposition returns [EObject current=null] : (otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_id_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_description_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:572:28: ( (otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:573:1: (otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:573:1: (otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:573:3: otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleDecomposition1362); 

                	newLeafNode(otherlv_0, grammarAccess.getDecompositionAccess().getDecompositionKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:577:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:578:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:578:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:579:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposition1379); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDecompositionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDecomposition1396); 

                	newLeafNode(otherlv_2, grammarAccess.getDecompositionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:599:1: ( ( ( ( ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:601:1: ( ( ( ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:601:1: ( ( ( ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:602:2: ( ( ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDecompositionAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:605:2: ( ( ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:606:3: ( ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:606:3: ( ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:608:4: ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:608:4: ({...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:609:5: {...}? => ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDecomposition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:609:110: ( ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:610:6: ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:6: ({...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:7: {...}? => ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDecomposition", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:16: ( ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )? )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:17: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )?
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:17: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:18: ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:18: ( (otherlv_4= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:614:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:614:1: (otherlv_4= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:615:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDecompositionRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposition1463); 

            	    		newLeafNode(otherlv_4, grammarAccess.getDecompositionAccess().getSrcGRLLinkableElementCrossReference_3_0_0_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDecomposition1475); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDecompositionAccess().getHyphenMinusGreaterThanSignKeyword_3_0_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:630:1: ( (otherlv_6= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:631:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:631:1: (otherlv_6= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:632:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDecompositionRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposition1495); 

            	    		newLeafNode(otherlv_6, grammarAccess.getDecompositionAccess().getDestGRLLinkableElementCrossReference_3_0_0_2_0()); 
            	    	

            	    }


            	    }

            	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleDecomposition1507); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDecompositionAccess().getSemicolonKeyword_3_0_0_3());
            	        

            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:647:2: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==21) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:647:4: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';'
            	            {
            	            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleDecomposition1521); 

            	                	newLeafNode(otherlv_8, grammarAccess.getDecompositionAccess().getIdKeyword_3_0_1_0());
            	                
            	            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleDecomposition1533); 

            	                	newLeafNode(otherlv_9, grammarAccess.getDecompositionAccess().getEqualsSignKeyword_3_0_1_1());
            	                
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:655:1: ( (lv_id_10_0= RULE_STRING ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:656:1: (lv_id_10_0= RULE_STRING )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:656:1: (lv_id_10_0= RULE_STRING )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:657:3: lv_id_10_0= RULE_STRING
            	            {
            	            lv_id_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecomposition1550); 

            	            			newLeafNode(lv_id_10_0, grammarAccess.getDecompositionAccess().getIdSTRINGTerminalRuleCall_3_0_1_2_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getDecompositionRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"id",
            	                    		lv_id_10_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }

            	            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleDecomposition1567); 

            	                	newLeafNode(otherlv_11, grammarAccess.getDecompositionAccess().getSemicolonKeyword_3_0_1_3());
            	                

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDecompositionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:684:4: ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:684:4: ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:685:5: {...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDecomposition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:685:110: ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:686:6: ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:689:6: ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:689:7: {...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDecomposition", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:689:16: (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:689:18: otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleDecomposition1637); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDecompositionAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleDecomposition1649); 

            	        	newLeafNode(otherlv_13, grammarAccess.getDecompositionAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:697:1: ( (lv_description_14_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:698:1: (lv_description_14_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:698:1: (lv_description_14_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:699:3: lv_description_14_0= RULE_STRING
            	    {
            	    lv_description_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecomposition1666); 

            	    			newLeafNode(lv_description_14_0, grammarAccess.getDecompositionAccess().getDescriptionSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDecompositionRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_14_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleDecomposition1683); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDecompositionAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDecompositionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDecompositionAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleDecomposition", "getUnorderedGroupHelper().canLeave(grammarAccess.getDecompositionAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDecompositionAccess().getUnorderedGroup_3());
            	

            }

            otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleDecomposition1742); 

                	newLeafNode(otherlv_16, grammarAccess.getDecompositionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleDecomposition"


    // $ANTLR start "entryRuleContribution"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:746:1: entryRuleContribution returns [EObject current=null] : iv_ruleContribution= ruleContribution EOF ;
    public final EObject entryRuleContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:747:2: (iv_ruleContribution= ruleContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:748:2: iv_ruleContribution= ruleContribution EOF
            {
             newCompositeNode(grammarAccess.getContributionRule()); 
            pushFollow(FOLLOW_ruleContribution_in_entryRuleContribution1778);
            iv_ruleContribution=ruleContribution();

            state._fsp--;

             current =iv_ruleContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContribution1788); 

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
    // $ANTLR end "entryRuleContribution"


    // $ANTLR start "ruleContribution"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:755:1: ruleContribution returns [EObject current=null] : (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) ) )+ {...}?) ) ) otherlv_28= '}' ) ;
    public final EObject ruleContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_quantitativeContribution_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_correlation_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_id_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_description_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Enumerator lv_contribution_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:758:28: ( (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) ) )+ {...}?) ) ) otherlv_28= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:759:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) ) )+ {...}?) ) ) otherlv_28= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:759:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) ) )+ {...}?) ) ) otherlv_28= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:759:3: otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) ) )+ {...}?) ) ) otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleContribution1825); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionAccess().getContributionKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:763:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:764:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:764:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:765:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContribution1842); 

            			newLeafNode(lv_name_1_0, grammarAccess.getContributionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleContribution1859); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:785:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:787:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:787:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:788:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:791:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:792:3: ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:792:3: ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=7;
                int LA12_0 = input.LA(1);

                if ( LA12_0 ==24 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 3) ) {
                    alt12=4;
                }
                else if ( LA12_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 4) ) {
                    alt12=5;
                }
                else if ( LA12_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 5) ) {
                    alt12=6;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:794:4: ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:794:4: ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:795:5: {...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:795:109: ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:796:6: ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:799:6: ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:799:7: {...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:799:16: (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:799:18: otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleContribution1917); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionAccess().getContributionKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleContribution1929); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContributionAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:807:1: ( (lv_contribution_6_0= ruleContributionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:808:1: (lv_contribution_6_0= ruleContributionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:808:1: (lv_contribution_6_0= ruleContributionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:809:3: lv_contribution_6_0= ruleContributionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionAccess().getContributionContributionTypeEnumRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionType_in_ruleContribution1950);
            	    lv_contribution_6_0=ruleContributionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContributionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"contribution",
            	            		lv_contribution_6_0, 
            	            		"ContributionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleContribution1962); 

            	        	newLeafNode(otherlv_7, grammarAccess.getContributionAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:836:4: ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:836:4: ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:837:5: {...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:837:109: ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:838:6: ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:841:6: ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:841:7: {...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:841:16: (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:841:18: otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleContribution2030); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionAccess().getQuantitativeContributionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleContribution2042); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContributionAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:849:1: ( (lv_quantitativeContribution_10_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:850:1: (lv_quantitativeContribution_10_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:850:1: (lv_quantitativeContribution_10_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:851:3: lv_quantitativeContribution_10_0= RULE_INT
            	    {
            	    lv_quantitativeContribution_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContribution2059); 

            	    			newLeafNode(lv_quantitativeContribution_10_0, grammarAccess.getContributionAccess().getQuantitativeContributionINTTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"quantitativeContribution",
            	            		lv_quantitativeContribution_10_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleContribution2076); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContributionAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:878:4: ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:878:4: ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:879:5: {...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:879:109: ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:880:6: ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:883:6: ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:883:7: {...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:883:16: (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:883:18: otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleContribution2144); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContributionAccess().getCorrelationKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleContribution2156); 

            	        	newLeafNode(otherlv_13, grammarAccess.getContributionAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:891:1: ( (lv_correlation_14_0= RULE_BOOLEAN ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:892:1: (lv_correlation_14_0= RULE_BOOLEAN )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:892:1: (lv_correlation_14_0= RULE_BOOLEAN )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:893:3: lv_correlation_14_0= RULE_BOOLEAN
            	    {
            	    lv_correlation_14_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleContribution2173); 

            	    			newLeafNode(lv_correlation_14_0, grammarAccess.getContributionAccess().getCorrelationBOOLEANTerminalRuleCall_3_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"correlation",
            	            		lv_correlation_14_0, 
            	            		"BOOLEAN");
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleContribution2190); 

            	        	newLeafNode(otherlv_15, grammarAccess.getContributionAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:920:4: ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:920:4: ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:921:5: {...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:921:109: ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:922:6: ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:925:6: ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:925:7: {...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:925:16: (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:925:18: otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleContribution2258); 

            	        	newLeafNode(otherlv_16, grammarAccess.getContributionAccess().getIdKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,22,FOLLOW_22_in_ruleContribution2270); 

            	        	newLeafNode(otherlv_17, grammarAccess.getContributionAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:933:1: ( (lv_id_18_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:934:1: (lv_id_18_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:934:1: (lv_id_18_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:935:3: lv_id_18_0= RULE_STRING
            	    {
            	    lv_id_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContribution2287); 

            	    			newLeafNode(lv_id_18_0, grammarAccess.getContributionAccess().getIdSTRINGTerminalRuleCall_3_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"id",
            	            		lv_id_18_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleContribution2304); 

            	        	newLeafNode(otherlv_19, grammarAccess.getContributionAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:962:4: ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:962:4: ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:963:5: {...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:963:109: ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:964:6: ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:967:6: ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:967:7: {...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:967:16: (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:967:18: otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,23,FOLLOW_23_in_ruleContribution2372); 

            	        	newLeafNode(otherlv_20, grammarAccess.getContributionAccess().getDescriptionKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,22,FOLLOW_22_in_ruleContribution2384); 

            	        	newLeafNode(otherlv_21, grammarAccess.getContributionAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:975:1: ( (lv_description_22_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:976:1: (lv_description_22_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:976:1: (lv_description_22_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:977:3: lv_description_22_0= RULE_STRING
            	    {
            	    lv_description_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContribution2401); 

            	    			newLeafNode(lv_description_22_0, grammarAccess.getContributionAccess().getDescriptionSTRINGTerminalRuleCall_3_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_22_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,20,FOLLOW_20_in_ruleContribution2418); 

            	        	newLeafNode(otherlv_23, grammarAccess.getContributionAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1004:4: ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1004:4: ({...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1005:5: {...}? => ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1005:109: ( ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1006:6: ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1009:6: ({...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1009:7: {...}? => ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1009:16: ( ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1009:17: ( (otherlv_24= RULE_ID ) ) otherlv_25= '->' ( (otherlv_26= RULE_ID ) ) otherlv_27= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1009:17: ( (otherlv_24= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1010:1: (otherlv_24= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1010:1: (otherlv_24= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1011:3: otherlv_24= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRule());
            	    	        }
            	            
            	    otherlv_24=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContribution2494); 

            	    		newLeafNode(otherlv_24, grammarAccess.getContributionAccess().getSrcGRLLinkableElementCrossReference_3_5_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_25=(Token)match(input,19,FOLLOW_19_in_ruleContribution2506); 

            	        	newLeafNode(otherlv_25, grammarAccess.getContributionAccess().getHyphenMinusGreaterThanSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1026:1: ( (otherlv_26= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1027:1: (otherlv_26= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1027:1: (otherlv_26= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1028:3: otherlv_26= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRule());
            	    	        }
            	            
            	    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContribution2526); 

            	    		newLeafNode(otherlv_26, grammarAccess.getContributionAccess().getDestGRLLinkableElementCrossReference_3_5_2_0()); 
            	    	

            	    }


            	    }

            	    otherlv_27=(Token)match(input,20,FOLLOW_20_in_ruleContribution2538); 

            	        	newLeafNode(otherlv_27, grammarAccess.getContributionAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getContributionAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canLeave(grammarAccess.getContributionAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	

            }

            otherlv_28=(Token)match(input,14,FOLLOW_14_in_ruleContribution2597); 

                	newLeafNode(otherlv_28, grammarAccess.getContributionAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleContribution"


    // $ANTLR start "entryRuleDependency"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1070:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1071:2: (iv_ruleDependency= ruleDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1072:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency2633);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency2643); 

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
    // $ANTLR end "entryRuleDependency"


    // $ANTLR start "ruleDependency"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1079:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_id_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_description_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1082:28: ( (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1083:1: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1083:1: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1083:3: otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleDependency2680); 

                	newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDependencyKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1087:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1088:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1088:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1089:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency2697); 

            			newLeafNode(lv_name_1_0, grammarAccess.getDependencyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDependency2714); 

                	newLeafNode(otherlv_2, grammarAccess.getDependencyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1109:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1111:1: ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1111:1: ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1112:2: ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDependencyAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1115:2: ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1116:3: ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1116:3: ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=4;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 2) ) {
                    alt13=3;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1118:4: ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1118:4: ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1119:5: {...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1119:107: ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1120:6: ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1123:6: ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1123:7: {...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1123:16: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1123:17: ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1123:17: ( (otherlv_4= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1124:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1124:1: (otherlv_4= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1125:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependencyRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency2780); 

            	    		newLeafNode(otherlv_4, grammarAccess.getDependencyAccess().getSrcGRLLinkableElementCrossReference_3_0_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDependency2792); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDependencyAccess().getHyphenMinusGreaterThanSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1140:1: ( (otherlv_6= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1141:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1141:1: (otherlv_6= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1142:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependencyRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency2812); 

            	    		newLeafNode(otherlv_6, grammarAccess.getDependencyAccess().getDestGRLLinkableElementCrossReference_3_0_2_0()); 
            	    	

            	    }


            	    }

            	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleDependency2824); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDependencyAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDependencyAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1164:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1164:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1165:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1165:107: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1166:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1169:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1169:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1169:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1169:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleDependency2892); 

            	        	newLeafNode(otherlv_8, grammarAccess.getDependencyAccess().getIdKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleDependency2904); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDependencyAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1177:1: ( (lv_id_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1178:1: (lv_id_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1178:1: (lv_id_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1179:3: lv_id_10_0= RULE_STRING
            	    {
            	    lv_id_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependency2921); 

            	    			newLeafNode(lv_id_10_0, grammarAccess.getDependencyAccess().getIdSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependencyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"id",
            	            		lv_id_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleDependency2938); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDependencyAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDependencyAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1206:4: ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1206:4: ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1207:5: {...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1207:107: ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1208:6: ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1211:6: ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1211:7: {...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1211:16: (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1211:18: otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleDependency3006); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDependencyAccess().getDescriptionKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleDependency3018); 

            	        	newLeafNode(otherlv_13, grammarAccess.getDependencyAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1219:1: ( (lv_description_14_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1220:1: (lv_description_14_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1220:1: (lv_description_14_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1221:3: lv_description_14_0= RULE_STRING
            	    {
            	    lv_description_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependency3035); 

            	    			newLeafNode(lv_description_14_0, grammarAccess.getDependencyAccess().getDescriptionSTRINGTerminalRuleCall_3_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependencyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_14_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleDependency3052); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDependencyAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDependencyAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDependencyAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleDependency", "getUnorderedGroupHelper().canLeave(grammarAccess.getDependencyAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDependencyAccess().getUnorderedGroup_3());
            	

            }

            otherlv_16=(Token)match(input,14,FOLLOW_14_in_ruleDependency3111); 

                	newLeafNode(otherlv_16, grammarAccess.getDependencyAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleDependency"


    // $ANTLR start "entryRuleActor"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1268:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1269:2: (iv_ruleActor= ruleActor EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1270:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor3147);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor3157); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1277:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) )* ) ) ) otherlv_44= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_importanceQuantitative_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_lineColor_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_fillColor_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_filled_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_id_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token lv_description_30_0=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Enumerator lv_importance_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1280:28: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) )* ) ) ) otherlv_44= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1281:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) )* ) ) ) otherlv_44= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1281:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) )* ) ) ) otherlv_44= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1281:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) )* ) ) ) otherlv_44= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleActor3194); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1285:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1286:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1286:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1287:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor3211); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleActor3228); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1307:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1309:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1309:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1310:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1313:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1314:3: ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1314:3: ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) )*
            loop16:
            do {
                int alt16=10;
                alt16 = dfa16.predict(input);
                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1316:4: ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1316:4: ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1317:5: {...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1317:102: ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1318:6: ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1321:6: ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1321:7: {...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1321:16: (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1321:18: otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleActor3286); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActorAccess().getImportanceKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleActor3298); 

            	        	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1329:1: ( (lv_importance_6_0= ruleImportanceType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1330:1: (lv_importance_6_0= ruleImportanceType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1330:1: (lv_importance_6_0= ruleImportanceType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1331:3: lv_importance_6_0= ruleImportanceType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActorAccess().getImportanceImportanceTypeEnumRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportanceType_in_ruleActor3319);
            	    lv_importance_6_0=ruleImportanceType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"importance",
            	            		lv_importance_6_0, 
            	            		"ImportanceType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleActor3331); 

            	        	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1358:4: ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1358:4: ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1359:5: {...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1359:102: ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1360:6: ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1363:6: ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1363:7: {...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1363:16: (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1363:18: otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleActor3399); 

            	        	newLeafNode(otherlv_8, grammarAccess.getActorAccess().getImportanceQuantitativeKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleActor3411); 

            	        	newLeafNode(otherlv_9, grammarAccess.getActorAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1371:1: ( (lv_importanceQuantitative_10_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1372:1: (lv_importanceQuantitative_10_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1372:1: (lv_importanceQuantitative_10_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1373:3: lv_importanceQuantitative_10_0= RULE_INT
            	    {
            	    lv_importanceQuantitative_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActor3428); 

            	    			newLeafNode(lv_importanceQuantitative_10_0, grammarAccess.getActorAccess().getImportanceQuantitativeINTTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"importanceQuantitative",
            	            		lv_importanceQuantitative_10_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleActor3445); 

            	        	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1400:4: ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1400:4: ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1401:5: {...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1401:102: ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1402:6: ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1405:6: ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1405:7: {...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1405:16: (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1405:18: otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleActor3513); 

            	        	newLeafNode(otherlv_12, grammarAccess.getActorAccess().getLineColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleActor3525); 

            	        	newLeafNode(otherlv_13, grammarAccess.getActorAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1413:1: ( (lv_lineColor_14_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1414:1: (lv_lineColor_14_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1414:1: (lv_lineColor_14_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1415:3: lv_lineColor_14_0= RULE_STRING
            	    {
            	    lv_lineColor_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor3542); 

            	    			newLeafNode(lv_lineColor_14_0, grammarAccess.getActorAccess().getLineColorSTRINGTerminalRuleCall_3_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"lineColor",
            	            		lv_lineColor_14_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleActor3559); 

            	        	newLeafNode(otherlv_15, grammarAccess.getActorAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1442:4: ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1442:4: ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1443:5: {...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1443:102: ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1444:6: ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1447:6: ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1447:7: {...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1447:16: (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1447:18: otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,32,FOLLOW_32_in_ruleActor3627); 

            	        	newLeafNode(otherlv_16, grammarAccess.getActorAccess().getFillColorKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,22,FOLLOW_22_in_ruleActor3639); 

            	        	newLeafNode(otherlv_17, grammarAccess.getActorAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1455:1: ( (lv_fillColor_18_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1456:1: (lv_fillColor_18_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1456:1: (lv_fillColor_18_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1457:3: lv_fillColor_18_0= RULE_STRING
            	    {
            	    lv_fillColor_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor3656); 

            	    			newLeafNode(lv_fillColor_18_0, grammarAccess.getActorAccess().getFillColorSTRINGTerminalRuleCall_3_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"fillColor",
            	            		lv_fillColor_18_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleActor3673); 

            	        	newLeafNode(otherlv_19, grammarAccess.getActorAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1484:4: ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1484:4: ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1485:5: {...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1485:102: ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1486:6: ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1489:6: ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1489:7: {...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1489:16: (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1489:18: otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,33,FOLLOW_33_in_ruleActor3741); 

            	        	newLeafNode(otherlv_20, grammarAccess.getActorAccess().getFilledKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,22,FOLLOW_22_in_ruleActor3753); 

            	        	newLeafNode(otherlv_21, grammarAccess.getActorAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1497:1: ( (lv_filled_22_0= RULE_BOOLEAN ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1498:1: (lv_filled_22_0= RULE_BOOLEAN )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1498:1: (lv_filled_22_0= RULE_BOOLEAN )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1499:3: lv_filled_22_0= RULE_BOOLEAN
            	    {
            	    lv_filled_22_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleActor3770); 

            	    			newLeafNode(lv_filled_22_0, grammarAccess.getActorAccess().getFilledBOOLEANTerminalRuleCall_3_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"filled",
            	            		lv_filled_22_0, 
            	            		"BOOLEAN");
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,20,FOLLOW_20_in_ruleActor3787); 

            	        	newLeafNode(otherlv_23, grammarAccess.getActorAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1526:4: ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1526:4: ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1527:5: {...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1527:102: ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1528:6: ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1531:6: ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1531:7: {...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1531:16: (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1531:18: otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,21,FOLLOW_21_in_ruleActor3855); 

            	        	newLeafNode(otherlv_24, grammarAccess.getActorAccess().getIdKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,22,FOLLOW_22_in_ruleActor3867); 

            	        	newLeafNode(otherlv_25, grammarAccess.getActorAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1539:1: ( (lv_id_26_0= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1540:1: (lv_id_26_0= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1540:1: (lv_id_26_0= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1541:3: lv_id_26_0= RULE_ID
            	    {
            	    lv_id_26_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor3884); 

            	    			newLeafNode(lv_id_26_0, grammarAccess.getActorAccess().getIdIDTerminalRuleCall_3_5_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"id",
            	            		lv_id_26_0, 
            	            		"ID");
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,20,FOLLOW_20_in_ruleActor3901); 

            	        	newLeafNode(otherlv_27, grammarAccess.getActorAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1568:4: ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1568:4: ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1569:5: {...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1569:102: ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1570:6: ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1573:6: ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1573:7: {...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1573:16: (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1573:18: otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';'
            	    {
            	    otherlv_28=(Token)match(input,23,FOLLOW_23_in_ruleActor3969); 

            	        	newLeafNode(otherlv_28, grammarAccess.getActorAccess().getDescriptionKeyword_3_6_0());
            	        
            	    otherlv_29=(Token)match(input,22,FOLLOW_22_in_ruleActor3981); 

            	        	newLeafNode(otherlv_29, grammarAccess.getActorAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1581:1: ( (lv_description_30_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1582:1: (lv_description_30_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1582:1: (lv_description_30_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1583:3: lv_description_30_0= RULE_STRING
            	    {
            	    lv_description_30_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor3998); 

            	    			newLeafNode(lv_description_30_0, grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_3_6_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_30_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_31=(Token)match(input,20,FOLLOW_20_in_ruleActor4015); 

            	        	newLeafNode(otherlv_31, grammarAccess.getActorAccess().getSemicolonKeyword_3_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1610:4: ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1610:4: ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1611:5: {...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1611:102: ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1612:6: ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1615:6: ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1615:7: {...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1615:16: (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1615:18: otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';'
            	    {
            	    otherlv_32=(Token)match(input,34,FOLLOW_34_in_ruleActor4083); 

            	        	newLeafNode(otherlv_32, grammarAccess.getActorAccess().getIncludingActorKeyword_3_7_0());
            	        
            	    otherlv_33=(Token)match(input,22,FOLLOW_22_in_ruleActor4095); 

            	        	newLeafNode(otherlv_33, grammarAccess.getActorAccess().getEqualsSignKeyword_3_7_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1623:1: ( (otherlv_34= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1624:1: (otherlv_34= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1624:1: (otherlv_34= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1625:3: otherlv_34= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	            
            	    otherlv_34=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor4115); 

            	    		newLeafNode(otherlv_34, grammarAccess.getActorAccess().getIncludedActorsActorCrossReference_3_7_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1636:2: (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==35) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1636:4: otherlv_35= ',' ( (otherlv_36= RULE_ID ) )
            	    	    {
            	    	    otherlv_35=(Token)match(input,35,FOLLOW_35_in_ruleActor4128); 

            	    	        	newLeafNode(otherlv_35, grammarAccess.getActorAccess().getCommaKeyword_3_7_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1640:1: ( (otherlv_36= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1641:1: (otherlv_36= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1641:1: (otherlv_36= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1642:3: otherlv_36= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	    	        }
            	    	            
            	    	    otherlv_36=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor4148); 

            	    	    		newLeafNode(otherlv_36, grammarAccess.getActorAccess().getIncludedActorsActorCrossReference_3_7_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);

            	    otherlv_37=(Token)match(input,20,FOLLOW_20_in_ruleActor4162); 

            	        	newLeafNode(otherlv_37, grammarAccess.getActorAccess().getSemicolonKeyword_3_7_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1664:4: ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1664:4: ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1665:5: {...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1665:102: ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1666:6: ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1669:6: ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1669:7: {...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1669:16: (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1669:18: otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';'
            	    {
            	    otherlv_38=(Token)match(input,36,FOLLOW_36_in_ruleActor4230); 

            	        	newLeafNode(otherlv_38, grammarAccess.getActorAccess().getCollapsedRefsKeyword_3_8_0());
            	        
            	    otherlv_39=(Token)match(input,22,FOLLOW_22_in_ruleActor4242); 

            	        	newLeafNode(otherlv_39, grammarAccess.getActorAccess().getEqualsSignKeyword_3_8_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1677:1: ( (otherlv_40= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1678:1: (otherlv_40= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1678:1: (otherlv_40= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1679:3: otherlv_40= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	            
            	    otherlv_40=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor4262); 

            	    		newLeafNode(otherlv_40, grammarAccess.getActorAccess().getCollapsedRefsCollapsedActorRefCrossReference_3_8_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1690:2: (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==35) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1690:4: otherlv_41= ',' ( (otherlv_42= RULE_ID ) )
            	    	    {
            	    	    otherlv_41=(Token)match(input,35,FOLLOW_35_in_ruleActor4275); 

            	    	        	newLeafNode(otherlv_41, grammarAccess.getActorAccess().getCommaKeyword_3_8_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1694:1: ( (otherlv_42= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1695:1: (otherlv_42= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1695:1: (otherlv_42= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1696:3: otherlv_42= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	    	        }
            	    	            
            	    	    otherlv_42=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor4295); 

            	    	    		newLeafNode(otherlv_42, grammarAccess.getActorAccess().getCollapsedRefsCollapsedActorRefCrossReference_3_8_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);

            	    otherlv_43=(Token)match(input,20,FOLLOW_20_in_ruleActor4309); 

            	        	newLeafNode(otherlv_43, grammarAccess.getActorAccess().getSemicolonKeyword_3_8_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	

            }

            otherlv_44=(Token)match(input,14,FOLLOW_14_in_ruleActor4362); 

                	newLeafNode(otherlv_44, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1743:1: entryRuleIntentionalElement returns [EObject current=null] : iv_ruleIntentionalElement= ruleIntentionalElement EOF ;
    public final EObject entryRuleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentionalElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1744:2: (iv_ruleIntentionalElement= ruleIntentionalElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1745:2: iv_ruleIntentionalElement= ruleIntentionalElement EOF
            {
             newCompositeNode(grammarAccess.getIntentionalElementRule()); 
            pushFollow(FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement4404);
            iv_ruleIntentionalElement=ruleIntentionalElement();

            state._fsp--;

             current =iv_ruleIntentionalElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntentionalElement4414); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1752:1: ruleIntentionalElement returns [EObject current=null] : (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';' )? (otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';' )? (otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';' )? (otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';' )? (otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_ID ) ) otherlv_34= ';' )? (otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';' )? otherlv_45= '}' ) ;
    public final EObject ruleIntentionalElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_importanceQuantitative_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token lv_lineColor_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token lv_fillColor_25_0=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token lv_filled_29_0=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token lv_id_33_0=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token lv_description_37_0=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Enumerator lv_type_5_0 = null;

        Enumerator lv_decompositionType_9_0 = null;

        Enumerator lv_importance_13_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1755:28: ( (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';' )? (otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';' )? (otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';' )? (otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';' )? (otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_ID ) ) otherlv_34= ';' )? (otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';' )? otherlv_45= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1756:1: (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';' )? (otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';' )? (otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';' )? (otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';' )? (otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_ID ) ) otherlv_34= ';' )? (otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';' )? otherlv_45= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1756:1: (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';' )? (otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';' )? (otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';' )? (otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';' )? (otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_ID ) ) otherlv_34= ';' )? (otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';' )? otherlv_45= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1756:3: otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';' )? (otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';' )? (otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';' )? (otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';' )? (otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_ID ) ) otherlv_34= ';' )? (otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';' )? otherlv_45= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleIntentionalElement4451); 

                	newLeafNode(otherlv_0, grammarAccess.getIntentionalElementAccess().getIntentionalElementKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1760:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1761:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1761:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1762:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntentionalElement4468); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleIntentionalElement4485); 

                	newLeafNode(otherlv_2, grammarAccess.getIntentionalElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1782:1: (otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1782:3: otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleIntentionalElement4498); 

                        	newLeafNode(otherlv_3, grammarAccess.getIntentionalElementAccess().getTypeKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement4510); 

                        	newLeafNode(otherlv_4, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1790:1: ( (lv_type_5_0= ruleIntentionalElementType ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1791:1: (lv_type_5_0= ruleIntentionalElementType )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1791:1: (lv_type_5_0= ruleIntentionalElementType )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1792:3: lv_type_5_0= ruleIntentionalElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntentionalElementAccess().getTypeIntentionalElementTypeEnumRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntentionalElementType_in_ruleIntentionalElement4531);
                    lv_type_5_0=ruleIntentionalElementType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntentionalElementRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"IntentionalElementType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleIntentionalElement4543); 

                        	newLeafNode(otherlv_6, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1812:3: (otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1812:5: otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,39,FOLLOW_39_in_ruleIntentionalElement4558); 

                        	newLeafNode(otherlv_7, grammarAccess.getIntentionalElementAccess().getDecompositionTypeKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement4570); 

                        	newLeafNode(otherlv_8, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_4_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1820:1: ( (lv_decompositionType_9_0= ruleDecompositionType ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1821:1: (lv_decompositionType_9_0= ruleDecompositionType )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1821:1: (lv_decompositionType_9_0= ruleDecompositionType )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1822:3: lv_decompositionType_9_0= ruleDecompositionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntentionalElementAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDecompositionType_in_ruleIntentionalElement4591);
                    lv_decompositionType_9_0=ruleDecompositionType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntentionalElementRule());
                    	        }
                           		set(
                           			current, 
                           			"decompositionType",
                            		lv_decompositionType_9_0, 
                            		"DecompositionType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleIntentionalElement4603); 

                        	newLeafNode(otherlv_10, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_4_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1842:3: (otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1842:5: otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleIntentionalElement4618); 

                        	newLeafNode(otherlv_11, grammarAccess.getIntentionalElementAccess().getImportanceKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement4630); 

                        	newLeafNode(otherlv_12, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_5_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1850:1: ( (lv_importance_13_0= ruleImportanceType ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1851:1: (lv_importance_13_0= ruleImportanceType )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1851:1: (lv_importance_13_0= ruleImportanceType )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1852:3: lv_importance_13_0= ruleImportanceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntentionalElementAccess().getImportanceImportanceTypeEnumRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImportanceType_in_ruleIntentionalElement4651);
                    lv_importance_13_0=ruleImportanceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIntentionalElementRule());
                    	        }
                           		set(
                           			current, 
                           			"importance",
                            		lv_importance_13_0, 
                            		"ImportanceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleIntentionalElement4663); 

                        	newLeafNode(otherlv_14, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_5_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1872:3: (otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1872:5: otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,30,FOLLOW_30_in_ruleIntentionalElement4678); 

                        	newLeafNode(otherlv_15, grammarAccess.getIntentionalElementAccess().getImportanceQuantitativeKeyword_6_0());
                        
                    otherlv_16=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement4690); 

                        	newLeafNode(otherlv_16, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_6_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1880:1: ( (lv_importanceQuantitative_17_0= RULE_INT ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1881:1: (lv_importanceQuantitative_17_0= RULE_INT )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1881:1: (lv_importanceQuantitative_17_0= RULE_INT )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1882:3: lv_importanceQuantitative_17_0= RULE_INT
                    {
                    lv_importanceQuantitative_17_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntentionalElement4707); 

                    			newLeafNode(lv_importanceQuantitative_17_0, grammarAccess.getIntentionalElementAccess().getImportanceQuantitativeINTTerminalRuleCall_6_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentionalElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"importanceQuantitative",
                            		lv_importanceQuantitative_17_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,20,FOLLOW_20_in_ruleIntentionalElement4724); 

                        	newLeafNode(otherlv_18, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_6_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1902:3: (otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1902:5: otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';'
                    {
                    otherlv_19=(Token)match(input,31,FOLLOW_31_in_ruleIntentionalElement4739); 

                        	newLeafNode(otherlv_19, grammarAccess.getIntentionalElementAccess().getLineColorKeyword_7_0());
                        
                    otherlv_20=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement4751); 

                        	newLeafNode(otherlv_20, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_7_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1910:1: ( (lv_lineColor_21_0= RULE_STRING ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1911:1: (lv_lineColor_21_0= RULE_STRING )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1911:1: (lv_lineColor_21_0= RULE_STRING )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1912:3: lv_lineColor_21_0= RULE_STRING
                    {
                    lv_lineColor_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntentionalElement4768); 

                    			newLeafNode(lv_lineColor_21_0, grammarAccess.getIntentionalElementAccess().getLineColorSTRINGTerminalRuleCall_7_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentionalElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"lineColor",
                            		lv_lineColor_21_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_22=(Token)match(input,20,FOLLOW_20_in_ruleIntentionalElement4785); 

                        	newLeafNode(otherlv_22, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_7_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1932:3: (otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1932:5: otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';'
                    {
                    otherlv_23=(Token)match(input,32,FOLLOW_32_in_ruleIntentionalElement4800); 

                        	newLeafNode(otherlv_23, grammarAccess.getIntentionalElementAccess().getFillColorKeyword_8_0());
                        
                    otherlv_24=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement4812); 

                        	newLeafNode(otherlv_24, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_8_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1940:1: ( (lv_fillColor_25_0= RULE_STRING ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1941:1: (lv_fillColor_25_0= RULE_STRING )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1941:1: (lv_fillColor_25_0= RULE_STRING )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1942:3: lv_fillColor_25_0= RULE_STRING
                    {
                    lv_fillColor_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntentionalElement4829); 

                    			newLeafNode(lv_fillColor_25_0, grammarAccess.getIntentionalElementAccess().getFillColorSTRINGTerminalRuleCall_8_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentionalElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"fillColor",
                            		lv_fillColor_25_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_26=(Token)match(input,20,FOLLOW_20_in_ruleIntentionalElement4846); 

                        	newLeafNode(otherlv_26, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_8_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1962:3: (otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1962:5: otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';'
                    {
                    otherlv_27=(Token)match(input,33,FOLLOW_33_in_ruleIntentionalElement4861); 

                        	newLeafNode(otherlv_27, grammarAccess.getIntentionalElementAccess().getFilledKeyword_9_0());
                        
                    otherlv_28=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement4873); 

                        	newLeafNode(otherlv_28, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_9_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1970:1: ( (lv_filled_29_0= RULE_BOOLEAN ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1971:1: (lv_filled_29_0= RULE_BOOLEAN )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1971:1: (lv_filled_29_0= RULE_BOOLEAN )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1972:3: lv_filled_29_0= RULE_BOOLEAN
                    {
                    lv_filled_29_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleIntentionalElement4890); 

                    			newLeafNode(lv_filled_29_0, grammarAccess.getIntentionalElementAccess().getFilledBOOLEANTerminalRuleCall_9_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentionalElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"filled",
                            		lv_filled_29_0, 
                            		"BOOLEAN");
                    	    

                    }


                    }

                    otherlv_30=(Token)match(input,20,FOLLOW_20_in_ruleIntentionalElement4907); 

                        	newLeafNode(otherlv_30, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_9_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1992:3: (otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_ID ) ) otherlv_34= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==21) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1992:5: otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_ID ) ) otherlv_34= ';'
                    {
                    otherlv_31=(Token)match(input,21,FOLLOW_21_in_ruleIntentionalElement4922); 

                        	newLeafNode(otherlv_31, grammarAccess.getIntentionalElementAccess().getIdKeyword_10_0());
                        
                    otherlv_32=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement4934); 

                        	newLeafNode(otherlv_32, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_10_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2000:1: ( (lv_id_33_0= RULE_ID ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2001:1: (lv_id_33_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2001:1: (lv_id_33_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2002:3: lv_id_33_0= RULE_ID
                    {
                    lv_id_33_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntentionalElement4951); 

                    			newLeafNode(lv_id_33_0, grammarAccess.getIntentionalElementAccess().getIdIDTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentionalElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_33_0, 
                            		"ID");
                    	    

                    }


                    }

                    otherlv_34=(Token)match(input,20,FOLLOW_20_in_ruleIntentionalElement4968); 

                        	newLeafNode(otherlv_34, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_10_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2022:3: (otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==23) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2022:5: otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';'
                    {
                    otherlv_35=(Token)match(input,23,FOLLOW_23_in_ruleIntentionalElement4983); 

                        	newLeafNode(otherlv_35, grammarAccess.getIntentionalElementAccess().getDescriptionKeyword_11_0());
                        
                    otherlv_36=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement4995); 

                        	newLeafNode(otherlv_36, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_11_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2030:1: ( (lv_description_37_0= RULE_STRING ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2031:1: (lv_description_37_0= RULE_STRING )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2031:1: (lv_description_37_0= RULE_STRING )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2032:3: lv_description_37_0= RULE_STRING
                    {
                    lv_description_37_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntentionalElement5012); 

                    			newLeafNode(lv_description_37_0, grammarAccess.getIntentionalElementAccess().getDescriptionSTRINGTerminalRuleCall_11_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentionalElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"description",
                            		lv_description_37_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_38=(Token)match(input,20,FOLLOW_20_in_ruleIntentionalElement5029); 

                        	newLeafNode(otherlv_38, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_11_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2052:3: (otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2052:5: otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';'
                    {
                    otherlv_39=(Token)match(input,40,FOLLOW_40_in_ruleIntentionalElement5044); 

                        	newLeafNode(otherlv_39, grammarAccess.getIntentionalElementAccess().getRefKeyword_12_0());
                        
                    otherlv_40=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement5056); 

                        	newLeafNode(otherlv_40, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_12_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2060:1: ( (otherlv_41= RULE_ID ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2061:1: (otherlv_41= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2061:1: (otherlv_41= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2062:3: otherlv_41= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentionalElementRule());
                    	        }
                            
                    otherlv_41=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntentionalElement5076); 

                    		newLeafNode(otherlv_41, grammarAccess.getIntentionalElementAccess().getRefsIntentionalElementRefCrossReference_12_2_0()); 
                    	

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2073:2: (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==35) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2073:4: otherlv_42= ',' ( (otherlv_43= RULE_ID ) )
                    	    {
                    	    otherlv_42=(Token)match(input,35,FOLLOW_35_in_ruleIntentionalElement5089); 

                    	        	newLeafNode(otherlv_42, grammarAccess.getIntentionalElementAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2077:1: ( (otherlv_43= RULE_ID ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2078:1: (otherlv_43= RULE_ID )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2078:1: (otherlv_43= RULE_ID )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2079:3: otherlv_43= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getIntentionalElementRule());
                    	    	        }
                    	            
                    	    otherlv_43=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntentionalElement5109); 

                    	    		newLeafNode(otherlv_43, grammarAccess.getIntentionalElementAccess().getRefsIntentionalElementRefCrossReference_12_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_44=(Token)match(input,20,FOLLOW_20_in_ruleIntentionalElement5123); 

                        	newLeafNode(otherlv_44, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_12_4());
                        

                    }
                    break;

            }

            otherlv_45=(Token)match(input,14,FOLLOW_14_in_ruleIntentionalElement5137); 

                	newLeafNode(otherlv_45, grammarAccess.getIntentionalElementAccess().getRightCurlyBracketKeyword_13());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2106:1: entryRuleImpactModel returns [EObject current=null] : iv_ruleImpactModel= ruleImpactModel EOF ;
    public final EObject entryRuleImpactModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpactModel = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2107:2: (iv_ruleImpactModel= ruleImpactModel EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2108:2: iv_ruleImpactModel= ruleImpactModel EOF
            {
             newCompositeNode(grammarAccess.getImpactModelRule()); 
            pushFollow(FOLLOW_ruleImpactModel_in_entryRuleImpactModel5173);
            iv_ruleImpactModel=ruleImpactModel();

            state._fsp--;

             current =iv_ruleImpactModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpactModel5183); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2115:1: ruleImpactModel returns [EObject current=null] : (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleImpactModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2118:28: ( (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2119:1: (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2119:1: (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2119:3: otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleImpactModel5220); 

                	newLeafNode(otherlv_0, grammarAccess.getImpactModelAccess().getImpactModelKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2124:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImpactModel5237); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleImpactModel5254); 

                	newLeafNode(otherlv_2, grammarAccess.getImpactModelAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleImpactModel5266); 

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


    // $ANTLR start "entryRuleStrategiesGroup"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2157:1: entryRuleStrategiesGroup returns [EObject current=null] : iv_ruleStrategiesGroup= ruleStrategiesGroup EOF ;
    public final EObject entryRuleStrategiesGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategiesGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2158:2: (iv_ruleStrategiesGroup= ruleStrategiesGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2159:2: iv_ruleStrategiesGroup= ruleStrategiesGroup EOF
            {
             newCompositeNode(grammarAccess.getStrategiesGroupRule()); 
            pushFollow(FOLLOW_ruleStrategiesGroup_in_entryRuleStrategiesGroup5302);
            iv_ruleStrategiesGroup=ruleStrategiesGroup();

            state._fsp--;

             current =iv_ruleStrategiesGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrategiesGroup5312); 

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
    // $ANTLR end "entryRuleStrategiesGroup"


    // $ANTLR start "ruleStrategiesGroup"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2166:1: ruleStrategiesGroup returns [EObject current=null] : (otherlv_0= 'strategiesGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleStrategiesGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2169:28: ( (otherlv_0= 'strategiesGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2170:1: (otherlv_0= 'strategiesGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2170:1: (otherlv_0= 'strategiesGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2170:3: otherlv_0= 'strategiesGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleStrategiesGroup5349); 

                	newLeafNode(otherlv_0, grammarAccess.getStrategiesGroupAccess().getStrategiesGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2174:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2175:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2175:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2176:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStrategiesGroup5366); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStrategiesGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStrategiesGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStrategiesGroup5383); 

                	newLeafNode(otherlv_2, grammarAccess.getStrategiesGroupAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleStrategiesGroup5395); 

                	newLeafNode(otherlv_3, grammarAccess.getStrategiesGroupAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleStrategiesGroup"


    // $ANTLR start "entryRuleContributionContext"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2208:1: entryRuleContributionContext returns [EObject current=null] : iv_ruleContributionContext= ruleContributionContext EOF ;
    public final EObject entryRuleContributionContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionContext = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2209:2: (iv_ruleContributionContext= ruleContributionContext EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2210:2: iv_ruleContributionContext= ruleContributionContext EOF
            {
             newCompositeNode(grammarAccess.getContributionContextRule()); 
            pushFollow(FOLLOW_ruleContributionContext_in_entryRuleContributionContext5431);
            iv_ruleContributionContext=ruleContributionContext();

            state._fsp--;

             current =iv_ruleContributionContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionContext5441); 

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
    // $ANTLR end "entryRuleContributionContext"


    // $ANTLR start "ruleContributionContext"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2217:1: ruleContributionContext returns [EObject current=null] : (otherlv_0= 'contributionContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleContributionContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2220:28: ( (otherlv_0= 'contributionContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2221:1: (otherlv_0= 'contributionContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2221:1: (otherlv_0= 'contributionContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2221:3: otherlv_0= 'contributionContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleContributionContext5478); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionContextAccess().getContributionContextKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2225:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2226:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2226:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2227:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionContext5495); 

            			newLeafNode(lv_name_1_0, grammarAccess.getContributionContextAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionContextRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleContributionContext5512); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionContextAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleContributionContext5524); 

                	newLeafNode(otherlv_3, grammarAccess.getContributionContextAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleContributionContext"


    // $ANTLR start "entryRuleContributionContextGroup"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2259:1: entryRuleContributionContextGroup returns [EObject current=null] : iv_ruleContributionContextGroup= ruleContributionContextGroup EOF ;
    public final EObject entryRuleContributionContextGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionContextGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2260:2: (iv_ruleContributionContextGroup= ruleContributionContextGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2261:2: iv_ruleContributionContextGroup= ruleContributionContextGroup EOF
            {
             newCompositeNode(grammarAccess.getContributionContextGroupRule()); 
            pushFollow(FOLLOW_ruleContributionContextGroup_in_entryRuleContributionContextGroup5560);
            iv_ruleContributionContextGroup=ruleContributionContextGroup();

            state._fsp--;

             current =iv_ruleContributionContextGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionContextGroup5570); 

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
    // $ANTLR end "entryRuleContributionContextGroup"


    // $ANTLR start "ruleContributionContextGroup"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2268:1: ruleContributionContextGroup returns [EObject current=null] : (otherlv_0= 'contributionContextGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleContributionContextGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2271:28: ( (otherlv_0= 'contributionContextGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2272:1: (otherlv_0= 'contributionContextGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2272:1: (otherlv_0= 'contributionContextGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2272:3: otherlv_0= 'contributionContextGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleContributionContextGroup5607); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionContextGroupAccess().getContributionContextGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2276:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2277:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2277:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2278:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionContextGroup5624); 

            			newLeafNode(lv_name_1_0, grammarAccess.getContributionContextGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionContextGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleContributionContextGroup5641); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionContextGroupAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleContributionContextGroup5653); 

                	newLeafNode(otherlv_3, grammarAccess.getContributionContextGroupAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleContributionContextGroup"


    // $ANTLR start "ruleIntentionalElementType"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2312:1: ruleIntentionalElementType returns [Enumerator current=null] : ( (enumLiteral_0= 'softGoal' ) | (enumLiteral_1= 'goal' ) | (enumLiteral_2= 'Task' ) | (enumLiteral_3= 'resource' ) | (enumLiteral_4= 'indicator' ) ) ;
    public final Enumerator ruleIntentionalElementType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2314:28: ( ( (enumLiteral_0= 'softGoal' ) | (enumLiteral_1= 'goal' ) | (enumLiteral_2= 'Task' ) | (enumLiteral_3= 'resource' ) | (enumLiteral_4= 'indicator' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2315:1: ( (enumLiteral_0= 'softGoal' ) | (enumLiteral_1= 'goal' ) | (enumLiteral_2= 'Task' ) | (enumLiteral_3= 'resource' ) | (enumLiteral_4= 'indicator' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2315:1: ( (enumLiteral_0= 'softGoal' ) | (enumLiteral_1= 'goal' ) | (enumLiteral_2= 'Task' ) | (enumLiteral_3= 'resource' ) | (enumLiteral_4= 'indicator' ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt28=1;
                }
                break;
            case 46:
                {
                alt28=2;
                }
                break;
            case 47:
                {
                alt28=3;
                }
                break;
            case 48:
                {
                alt28=4;
                }
                break;
            case 49:
                {
                alt28=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2315:2: (enumLiteral_0= 'softGoal' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2315:2: (enumLiteral_0= 'softGoal' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2315:4: enumLiteral_0= 'softGoal'
                    {
                    enumLiteral_0=(Token)match(input,45,FOLLOW_45_in_ruleIntentionalElementType5705); 

                            current = grammarAccess.getIntentionalElementTypeAccess().getSoftgoalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIntentionalElementTypeAccess().getSoftgoalEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2321:6: (enumLiteral_1= 'goal' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2321:6: (enumLiteral_1= 'goal' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2321:8: enumLiteral_1= 'goal'
                    {
                    enumLiteral_1=(Token)match(input,46,FOLLOW_46_in_ruleIntentionalElementType5722); 

                            current = grammarAccess.getIntentionalElementTypeAccess().getGoalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIntentionalElementTypeAccess().getGoalEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2327:6: (enumLiteral_2= 'Task' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2327:6: (enumLiteral_2= 'Task' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2327:8: enumLiteral_2= 'Task'
                    {
                    enumLiteral_2=(Token)match(input,47,FOLLOW_47_in_ruleIntentionalElementType5739); 

                            current = grammarAccess.getIntentionalElementTypeAccess().getTaskEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getIntentionalElementTypeAccess().getTaskEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2333:6: (enumLiteral_3= 'resource' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2333:6: (enumLiteral_3= 'resource' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2333:8: enumLiteral_3= 'resource'
                    {
                    enumLiteral_3=(Token)match(input,48,FOLLOW_48_in_ruleIntentionalElementType5756); 

                            current = grammarAccess.getIntentionalElementTypeAccess().getRessourceEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getIntentionalElementTypeAccess().getRessourceEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2339:6: (enumLiteral_4= 'indicator' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2339:6: (enumLiteral_4= 'indicator' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2339:8: enumLiteral_4= 'indicator'
                    {
                    enumLiteral_4=(Token)match(input,49,FOLLOW_49_in_ruleIntentionalElementType5773); 

                            current = grammarAccess.getIntentionalElementTypeAccess().getIndicatorEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getIntentionalElementTypeAccess().getIndicatorEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "ruleIntentionalElementType"


    // $ANTLR start "ruleImportanceType"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2349:1: ruleImportanceType returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) ;
    public final Enumerator ruleImportanceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2351:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2352:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2352:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt29=1;
                }
                break;
            case 51:
                {
                alt29=2;
                }
                break;
            case 52:
                {
                alt29=3;
                }
                break;
            case 53:
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2352:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2352:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2352:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleImportanceType5818); 

                            current = grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2358:6: (enumLiteral_1= 'high' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2358:6: (enumLiteral_1= 'high' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2358:8: enumLiteral_1= 'high'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleImportanceType5835); 

                            current = grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2364:6: (enumLiteral_2= 'medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2364:6: (enumLiteral_2= 'medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2364:8: enumLiteral_2= 'medium'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_52_in_ruleImportanceType5852); 

                            current = grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2370:6: (enumLiteral_3= 'low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2370:6: (enumLiteral_3= 'low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2370:8: enumLiteral_3= 'low'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_53_in_ruleImportanceType5869); 

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


    // $ANTLR start "ruleDecompositionType"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2380:1: ruleDecompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) ;
    public final Enumerator ruleDecompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2382:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2383:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2383:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt30=1;
                }
                break;
            case 55:
                {
                alt30=2;
                }
                break;
            case 56:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2383:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2383:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2383:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_54_in_ruleDecompositionType5914); 

                            current = grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2389:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2389:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2389:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_55_in_ruleDecompositionType5931); 

                            current = grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2395:6: (enumLiteral_2= 'xor' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2395:6: (enumLiteral_2= 'xor' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2395:8: enumLiteral_2= 'xor'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_56_in_ruleDecompositionType5948); 

                            current = grammarAccess.getDecompositionTypeAccess().getXorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDecompositionTypeAccess().getXorEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleDecompositionType"


    // $ANTLR start "ruleContributionType"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2405:1: ruleContributionType returns [Enumerator current=null] : ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) ;
    public final Enumerator ruleContributionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2407:28: ( ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2408:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2408:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            int alt31=7;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt31=1;
                }
                break;
            case 58:
                {
                alt31=2;
                }
                break;
            case 59:
                {
                alt31=3;
                }
                break;
            case 60:
                {
                alt31=4;
                }
                break;
            case 61:
                {
                alt31=5;
                }
                break;
            case 62:
                {
                alt31=6;
                }
                break;
            case 63:
                {
                alt31=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2408:2: (enumLiteral_0= 'help' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2408:2: (enumLiteral_0= 'help' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2408:4: enumLiteral_0= 'help'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_57_in_ruleContributionType5993); 

                            current = grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2414:6: (enumLiteral_1= 'make' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2414:6: (enumLiteral_1= 'make' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2414:8: enumLiteral_1= 'make'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_58_in_ruleContributionType6010); 

                            current = grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2420:6: (enumLiteral_2= 'somePositive' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2420:6: (enumLiteral_2= 'somePositive' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2420:8: enumLiteral_2= 'somePositive'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_59_in_ruleContributionType6027); 

                            current = grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2426:6: (enumLiteral_3= 'unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2426:6: (enumLiteral_3= 'unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2426:8: enumLiteral_3= 'unknown'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_60_in_ruleContributionType6044); 

                            current = grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2432:6: (enumLiteral_4= 'someNegative' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2432:6: (enumLiteral_4= 'someNegative' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2432:8: enumLiteral_4= 'someNegative'
                    {
                    enumLiteral_4=(Token)match(input,61,FOLLOW_61_in_ruleContributionType6061); 

                            current = grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2438:6: (enumLiteral_5= 'hurt' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2438:6: (enumLiteral_5= 'hurt' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2438:8: enumLiteral_5= 'hurt'
                    {
                    enumLiteral_5=(Token)match(input,62,FOLLOW_62_in_ruleContributionType6078); 

                            current = grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2444:6: (enumLiteral_6= 'break' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2444:6: (enumLiteral_6= 'break' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2444:8: enumLiteral_6= 'break'
                    {
                    enumLiteral_6=(Token)match(input,63,FOLLOW_63_in_ruleContributionType6095); 

                            current = grammarAccess.getContributionTypeAccess().getBreakEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getContributionTypeAccess().getBreakEnumLiteralDeclaration_6()); 
                        

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
    // $ANTLR end "ruleContributionType"


    // $ANTLR start "ruleCriticality"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2454:1: ruleCriticality returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) ;
    public final Enumerator ruleCriticality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2456:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2457:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2457:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt32=1;
                }
                break;
            case 51:
                {
                alt32=2;
                }
                break;
            case 52:
                {
                alt32=3;
                }
                break;
            case 53:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2457:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2457:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2457:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_ruleCriticality6140); 

                            current = grammarAccess.getCriticalityAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCriticalityAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2463:6: (enumLiteral_1= 'high' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2463:6: (enumLiteral_1= 'high' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2463:8: enumLiteral_1= 'high'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_ruleCriticality6157); 

                            current = grammarAccess.getCriticalityAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCriticalityAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2469:6: (enumLiteral_2= 'medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2469:6: (enumLiteral_2= 'medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2469:8: enumLiteral_2= 'medium'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_52_in_ruleCriticality6174); 

                            current = grammarAccess.getCriticalityAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCriticalityAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2475:6: (enumLiteral_3= 'low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2475:6: (enumLiteral_3= 'low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2475:8: enumLiteral_3= 'low'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_53_in_ruleCriticality6191); 

                            current = grammarAccess.getCriticalityAccess().getLowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCriticalityAccess().getLowEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleCriticality"


    // $ANTLR start "rulePriority"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2485:1: rulePriority returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) ;
    public final Enumerator rulePriority() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2487:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2488:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2488:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt33=1;
                }
                break;
            case 51:
                {
                alt33=2;
                }
                break;
            case 52:
                {
                alt33=3;
                }
                break;
            case 53:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2488:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2488:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2488:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_50_in_rulePriority6236); 

                            current = grammarAccess.getPriorityAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPriorityAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2494:6: (enumLiteral_1= 'high' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2494:6: (enumLiteral_1= 'high' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2494:8: enumLiteral_1= 'high'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_51_in_rulePriority6253); 

                            current = grammarAccess.getPriorityAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPriorityAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2500:6: (enumLiteral_2= 'medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2500:6: (enumLiteral_2= 'medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2500:8: enumLiteral_2= 'medium'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_52_in_rulePriority6270); 

                            current = grammarAccess.getPriorityAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPriorityAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:6: (enumLiteral_3= 'low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:6: (enumLiteral_3= 'low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:8: enumLiteral_3= 'low'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_53_in_rulePriority6287); 

                            current = grammarAccess.getPriorityAccess().getLowEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPriorityAccess().getLowEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "rulePriority"

    // Delegated rules


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\13\uffff";
    static final String DFA16_eofS =
        "\13\uffff";
    static final String DFA16_minS =
        "\1\16\12\uffff";
    static final String DFA16_maxS =
        "\1\44\12\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA16_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1\6\uffff\1\7\1\uffff\1\10\5\uffff\1\2\1\3\1\4\1\5\1\6\1"+
            "\11\1\uffff\1\12",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "()* loopback of 1314:3: ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_ID ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includingActor' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_0 = input.LA(1);

                         
                        int index16_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA16_0==14) ) {s = 1;}

                        else if ( LA16_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA16_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA16_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA16_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA16_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA16_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA16_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA16_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA16_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                         
                        input.seek(index16_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

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
    public static final BitSet FOLLOW_13_in_ruleGRLspec559 = new BitSet(new long[]{0x00001E2019044000L});
    public static final BitSet FOLLOW_ruleElementLink_in_ruleGRLspec625 = new BitSet(new long[]{0x00001E2019044000L});
    public static final BitSet FOLLOW_ruleActor_in_ruleGRLspec701 = new BitSet(new long[]{0x00001E2019044000L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleGRLspec777 = new BitSet(new long[]{0x00001E2019044000L});
    public static final BitSet FOLLOW_ruleImpactModel_in_ruleGRLspec853 = new BitSet(new long[]{0x00001E2019044000L});
    public static final BitSet FOLLOW_ruleStrategiesGroup_in_ruleGRLspec928 = new BitSet(new long[]{0x00001E2019044000L});
    public static final BitSet FOLLOW_ruleContributionContext_in_ruleGRLspec1004 = new BitSet(new long[]{0x00001E2019044000L});
    public static final BitSet FOLLOW_ruleContributionContextGroup_in_ruleGRLspec1080 = new BitSet(new long[]{0x00001E2019044000L});
    public static final BitSet FOLLOW_14_in_ruleGRLspec1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLink_in_entryRuleElementLink1169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLink1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_ruleElementLink1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_ruleElementLink1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleElementLink1280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition1315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleDecomposition1362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposition1379 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDecomposition1396 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposition1463 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDecomposition1475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposition1495 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDecomposition1507 = new BitSet(new long[]{0x0000000000A04010L});
    public static final BitSet FOLLOW_21_in_ruleDecomposition1521 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDecomposition1533 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecomposition1550 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDecomposition1567 = new BitSet(new long[]{0x0000000000804010L});
    public static final BitSet FOLLOW_23_in_ruleDecomposition1637 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDecomposition1649 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecomposition1666 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDecomposition1683 = new BitSet(new long[]{0x0000000000804010L});
    public static final BitSet FOLLOW_14_in_ruleDecomposition1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution1778 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContribution1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleContribution1825 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContribution1842 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContribution1859 = new BitSet(new long[]{0x0000000007A00010L});
    public static final BitSet FOLLOW_24_in_ruleContribution1917 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContribution1929 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContribution1950 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleContribution1962 = new BitSet(new long[]{0x0000000007A04010L});
    public static final BitSet FOLLOW_25_in_ruleContribution2030 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContribution2042 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContribution2059 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleContribution2076 = new BitSet(new long[]{0x0000000007A04010L});
    public static final BitSet FOLLOW_26_in_ruleContribution2144 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContribution2156 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleContribution2173 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleContribution2190 = new BitSet(new long[]{0x0000000007A04010L});
    public static final BitSet FOLLOW_21_in_ruleContribution2258 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContribution2270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContribution2287 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleContribution2304 = new BitSet(new long[]{0x0000000007A04010L});
    public static final BitSet FOLLOW_23_in_ruleContribution2372 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContribution2384 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContribution2401 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleContribution2418 = new BitSet(new long[]{0x0000000007A04010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContribution2494 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContribution2506 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContribution2526 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleContribution2538 = new BitSet(new long[]{0x0000000007A04010L});
    public static final BitSet FOLLOW_14_in_ruleContribution2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency2633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleDependency2680 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency2697 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDependency2714 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency2780 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDependency2792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency2812 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDependency2824 = new BitSet(new long[]{0x0000000000A04010L});
    public static final BitSet FOLLOW_21_in_ruleDependency2892 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDependency2904 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependency2921 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDependency2938 = new BitSet(new long[]{0x0000000000A04010L});
    public static final BitSet FOLLOW_23_in_ruleDependency3006 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDependency3018 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependency3035 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleDependency3052 = new BitSet(new long[]{0x0000000000A04010L});
    public static final BitSet FOLLOW_14_in_ruleDependency3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor3147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor3157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleActor3194 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor3211 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActor3228 = new BitSet(new long[]{0x00000017E0A04000L});
    public static final BitSet FOLLOW_29_in_ruleActor3286 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor3298 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleActor3319 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActor3331 = new BitSet(new long[]{0x00000017E0A04000L});
    public static final BitSet FOLLOW_30_in_ruleActor3399 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor3411 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActor3428 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActor3445 = new BitSet(new long[]{0x00000017E0A04000L});
    public static final BitSet FOLLOW_31_in_ruleActor3513 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor3525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor3542 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActor3559 = new BitSet(new long[]{0x00000017E0A04000L});
    public static final BitSet FOLLOW_32_in_ruleActor3627 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor3639 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor3656 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActor3673 = new BitSet(new long[]{0x00000017E0A04000L});
    public static final BitSet FOLLOW_33_in_ruleActor3741 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor3753 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleActor3770 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActor3787 = new BitSet(new long[]{0x00000017E0A04000L});
    public static final BitSet FOLLOW_21_in_ruleActor3855 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor3867 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor3884 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActor3901 = new BitSet(new long[]{0x00000017E0A04000L});
    public static final BitSet FOLLOW_23_in_ruleActor3969 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor3981 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor3998 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleActor4015 = new BitSet(new long[]{0x00000017E0A04000L});
    public static final BitSet FOLLOW_34_in_ruleActor4083 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor4095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor4115 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_35_in_ruleActor4128 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor4148 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_20_in_ruleActor4162 = new BitSet(new long[]{0x00000017E0A04000L});
    public static final BitSet FOLLOW_36_in_ruleActor4230 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor4242 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor4262 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_35_in_ruleActor4275 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor4295 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_20_in_ruleActor4309 = new BitSet(new long[]{0x00000017E0A04000L});
    public static final BitSet FOLLOW_14_in_ruleActor4362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement4404 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntentionalElement4414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleIntentionalElement4451 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntentionalElement4468 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIntentionalElement4485 = new BitSet(new long[]{0x000001C3E0A04000L});
    public static final BitSet FOLLOW_38_in_ruleIntentionalElement4498 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement4510 = new BitSet(new long[]{0x0003E00000000000L});
    public static final BitSet FOLLOW_ruleIntentionalElementType_in_ruleIntentionalElement4531 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIntentionalElement4543 = new BitSet(new long[]{0x00000183E0A04000L});
    public static final BitSet FOLLOW_39_in_ruleIntentionalElement4558 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement4570 = new BitSet(new long[]{0x01C0000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleIntentionalElement4591 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIntentionalElement4603 = new BitSet(new long[]{0x00000103E0A04000L});
    public static final BitSet FOLLOW_29_in_ruleIntentionalElement4618 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement4630 = new BitSet(new long[]{0x003C000000000000L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleIntentionalElement4651 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIntentionalElement4663 = new BitSet(new long[]{0x00000103C0A04000L});
    public static final BitSet FOLLOW_30_in_ruleIntentionalElement4678 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement4690 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntentionalElement4707 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIntentionalElement4724 = new BitSet(new long[]{0x0000010380A04000L});
    public static final BitSet FOLLOW_31_in_ruleIntentionalElement4739 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement4751 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntentionalElement4768 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIntentionalElement4785 = new BitSet(new long[]{0x0000010300A04000L});
    public static final BitSet FOLLOW_32_in_ruleIntentionalElement4800 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement4812 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntentionalElement4829 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIntentionalElement4846 = new BitSet(new long[]{0x0000010200A04000L});
    public static final BitSet FOLLOW_33_in_ruleIntentionalElement4861 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement4873 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleIntentionalElement4890 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIntentionalElement4907 = new BitSet(new long[]{0x0000010000A04000L});
    public static final BitSet FOLLOW_21_in_ruleIntentionalElement4922 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement4934 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntentionalElement4951 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIntentionalElement4968 = new BitSet(new long[]{0x0000010000804000L});
    public static final BitSet FOLLOW_23_in_ruleIntentionalElement4983 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement4995 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntentionalElement5012 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleIntentionalElement5029 = new BitSet(new long[]{0x0000010000004000L});
    public static final BitSet FOLLOW_40_in_ruleIntentionalElement5044 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement5056 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntentionalElement5076 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_35_in_ruleIntentionalElement5089 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntentionalElement5109 = new BitSet(new long[]{0x0000000800100000L});
    public static final BitSet FOLLOW_20_in_ruleIntentionalElement5123 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIntentionalElement5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpactModel_in_entryRuleImpactModel5173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpactModel5183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleImpactModel5220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImpactModel5237 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImpactModel5254 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImpactModel5266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategiesGroup_in_entryRuleStrategiesGroup5302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrategiesGroup5312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleStrategiesGroup5349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStrategiesGroup5366 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStrategiesGroup5383 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStrategiesGroup5395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionContext_in_entryRuleContributionContext5431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionContext5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleContributionContext5478 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionContext5495 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContributionContext5512 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionContext5524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionContextGroup_in_entryRuleContributionContextGroup5560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionContextGroup5570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleContributionContextGroup5607 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionContextGroup5624 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContributionContextGroup5641 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionContextGroup5653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleIntentionalElementType5705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleIntentionalElementType5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleIntentionalElementType5739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleIntentionalElementType5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleIntentionalElementType5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleImportanceType5818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleImportanceType5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleImportanceType5852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleImportanceType5869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleDecompositionType5914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleDecompositionType5931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleDecompositionType5948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleContributionType5993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleContributionType6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleContributionType6027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleContributionType6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleContributionType6061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleContributionType6078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleContributionType6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleCriticality6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCriticality6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleCriticality6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleCriticality6191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rulePriority6236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rulePriority6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rulePriority6270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rulePriority6287 = new BitSet(new long[]{0x0000000000000002L});

}
