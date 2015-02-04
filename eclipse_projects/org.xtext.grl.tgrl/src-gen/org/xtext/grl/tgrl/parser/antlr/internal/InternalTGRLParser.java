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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'urnspec'", "'{'", "'}'", "'URNdefinition'", "'asdspec'", "'urnLink'", "'ucmSpec'", "'grl'", "'decomposition'", "'->'", "';'", "'id'", "'='", "'description'", "'refs'", "','", "'contribution'", "'quantitativeContribution'", "'correlation'", "'dependency'", "'actor'", "'importance'", "'importanceQuantitative'", "'lineColor'", "'fillColor'", "'filled'", "'includedActors'", "'collapsedRefs'", "'contRefs'", "'intentionalElement'", "'type'", "'decompositionType'", "'ref'", "'impactModel'", "'strategiesGroup'", "'contributionContext'", "'contributionContextGroup'", "'metaData'", "'value'", "'softGoal'", "'goal'", "'Task'", "'resource'", "'indicator'", "'none'", "'high'", "'medium'", "'low'", "'and'", "'or'", "'xor'", "'help'", "'make'", "'somePositive'", "'unknown'", "'someNegative'", "'hurt'", "'break'"
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
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:77:1: ruleURNspec returns [EObject current=null] : (otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) ;
    public final EObject ruleURNspec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_10=null;
        EObject lv_urndef_4_0 = null;

        EObject lv_grlspec_5_0 = null;

        EObject lv_metadata_6_0 = null;

        EObject lv_ucmspec_7_0 = null;

        EObject lv_urnLinks_8_0 = null;

        EObject lv_asdspec_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:80:28: ( (otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:81:1: (otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:81:1: (otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:81:3: otherlv_0= 'urnspec' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) ) )+ {...}?) ) ) otherlv_10= '}'
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
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:107:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:109:1: ( ( ( ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:109:1: ( ( ( ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:110:2: ( ( ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getURNspecAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:113:2: ( ( ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:114:3: ( ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:114:3: ( ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=7;
                int LA3_0 = input.LA(1);

                if ( LA3_0 ==15 && getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 ==19 && getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 3) ) {
                    alt3=4;
                }
                else if ( LA3_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 4) ) {
                    alt3=5;
                }
                else if ( LA3_0 ==16 && getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 5) ) {
                    alt3=6;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:116:4: ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:116:4: ({...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:117:5: {...}? => ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleURNspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:117:104: ( ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:118:6: ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:121:6: ({...}? => ( (lv_urndef_4_0= ruleURNdefinition ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:121:7: {...}? => ( (lv_urndef_4_0= ruleURNdefinition ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleURNspec", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:121:16: ( (lv_urndef_4_0= ruleURNdefinition ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:122:1: (lv_urndef_4_0= ruleURNdefinition )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:122:1: (lv_urndef_4_0= ruleURNdefinition )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:123:3: lv_urndef_4_0= ruleURNdefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getURNspecAccess().getUrndefURNdefinitionParserRuleCall_3_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleURNdefinition_in_ruleURNspec222);
            	    lv_urndef_4_0=ruleURNdefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getURNspecRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"urndef",
            	            		lv_urndef_4_0, 
            	            		"URNdefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getURNspecAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:146:4: ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:146:4: ({...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:147:5: {...}? => ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleURNspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:147:104: ( ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:148:6: ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:151:6: ({...}? => ( (lv_grlspec_5_0= ruleGRLspec ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:151:7: {...}? => ( (lv_grlspec_5_0= ruleGRLspec ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleURNspec", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:151:16: ( (lv_grlspec_5_0= ruleGRLspec ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:152:1: (lv_grlspec_5_0= ruleGRLspec )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:152:1: (lv_grlspec_5_0= ruleGRLspec )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:153:3: lv_grlspec_5_0= ruleGRLspec
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getURNspecAccess().getGrlspecGRLspecParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGRLspec_in_ruleURNspec297);
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


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getURNspecAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:176:4: ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:176:4: ({...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:177:5: {...}? => ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleURNspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:177:104: ( ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:178:6: ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:181:6: ({...}? => ( (lv_metadata_6_0= ruleMetadata ) ) )+
            	    int cnt1=0;
            	    loop1:
            	    do {
            	        int alt1=2;
            	        int LA1_0 = input.LA(1);

            	        if ( (LA1_0==49) ) {
            	            int LA1_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt1=1;
            	            }


            	        }


            	        switch (alt1) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:181:7: {...}? => ( (lv_metadata_6_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleURNspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:181:16: ( (lv_metadata_6_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:182:1: (lv_metadata_6_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:182:1: (lv_metadata_6_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:183:3: lv_metadata_6_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getURNspecAccess().getMetadataMetadataParserRuleCall_3_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleURNspec372);
            	    	    lv_metadata_6_0=ruleMetadata();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getURNspecRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"metadata",
            	    	            		lv_metadata_6_0, 
            	    	            		"Metadata");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt1 >= 1 ) break loop1;
            	                EarlyExitException eee =
            	                    new EarlyExitException(1, input);
            	                throw eee;
            	        }
            	        cnt1++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getURNspecAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:206:4: ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:206:4: ({...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:207:5: {...}? => ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleURNspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:207:104: ( ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:208:6: ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:211:6: ({...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:211:7: {...}? => ( (lv_ucmspec_7_0= ruleUCMspec ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleURNspec", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:211:16: ( (lv_ucmspec_7_0= ruleUCMspec ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:212:1: (lv_ucmspec_7_0= ruleUCMspec )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:212:1: (lv_ucmspec_7_0= ruleUCMspec )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:213:3: lv_ucmspec_7_0= ruleUCMspec
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getURNspecAccess().getUcmspecUCMspecParserRuleCall_3_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUCMspec_in_ruleURNspec448);
            	    lv_ucmspec_7_0=ruleUCMspec();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getURNspecRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"ucmspec",
            	            		lv_ucmspec_7_0, 
            	            		"UCMspec");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getURNspecAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:236:4: ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:236:4: ({...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:237:5: {...}? => ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleURNspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:237:104: ( ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:238:6: ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:241:6: ({...}? => ( (lv_urnLinks_8_0= ruleURNlink ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==17) ) {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:241:7: {...}? => ( (lv_urnLinks_8_0= ruleURNlink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleURNspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:241:16: ( (lv_urnLinks_8_0= ruleURNlink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:242:1: (lv_urnLinks_8_0= ruleURNlink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:242:1: (lv_urnLinks_8_0= ruleURNlink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:243:3: lv_urnLinks_8_0= ruleURNlink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getURNspecAccess().getUrnLinksURNlinkParserRuleCall_3_4_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleURNlink_in_ruleURNspec523);
            	    	    lv_urnLinks_8_0=ruleURNlink();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getURNspecRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"urnLinks",
            	    	            		lv_urnLinks_8_0, 
            	    	            		"URNlink");
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getURNspecAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:266:4: ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:266:4: ({...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:267:5: {...}? => ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleURNspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:267:104: ( ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:268:6: ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getURNspecAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:271:6: ({...}? => ( (lv_asdspec_9_0= ruleASDspec ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:271:7: {...}? => ( (lv_asdspec_9_0= ruleASDspec ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleURNspec", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:271:16: ( (lv_asdspec_9_0= ruleASDspec ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:272:1: (lv_asdspec_9_0= ruleASDspec )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:272:1: (lv_asdspec_9_0= ruleASDspec )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:273:3: lv_asdspec_9_0= ruleASDspec
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getURNspecAccess().getAsdspecASDspecParserRuleCall_3_5_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleASDspec_in_ruleURNspec599);
            	    lv_asdspec_9_0=ruleASDspec();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getURNspecRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"asdspec",
            	            		lv_asdspec_9_0, 
            	            		"ASDspec");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getURNspecAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getURNspecAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleURNspec", "getUnorderedGroupHelper().canLeave(grammarAccess.getURNspecAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getURNspecAccess().getUnorderedGroup_3());
            	

            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleURNspec657); 

                	newLeafNode(otherlv_10, grammarAccess.getURNspecAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:316:1: entryRuleURNdefinition returns [EObject current=null] : iv_ruleURNdefinition= ruleURNdefinition EOF ;
    public final EObject entryRuleURNdefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURNdefinition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:317:2: (iv_ruleURNdefinition= ruleURNdefinition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:318:2: iv_ruleURNdefinition= ruleURNdefinition EOF
            {
             newCompositeNode(grammarAccess.getURNdefinitionRule()); 
            pushFollow(FOLLOW_ruleURNdefinition_in_entryRuleURNdefinition693);
            iv_ruleURNdefinition=ruleURNdefinition();

            state._fsp--;

             current =iv_ruleURNdefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURNdefinition703); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:325:1: ruleURNdefinition returns [EObject current=null] : (otherlv_0= 'URNdefinition' otherlv_1= '{' () otherlv_3= '}' ) ;
    public final EObject ruleURNdefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:328:28: ( (otherlv_0= 'URNdefinition' otherlv_1= '{' () otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:329:1: (otherlv_0= 'URNdefinition' otherlv_1= '{' () otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:329:1: (otherlv_0= 'URNdefinition' otherlv_1= '{' () otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:329:3: otherlv_0= 'URNdefinition' otherlv_1= '{' () otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleURNdefinition740); 

                	newLeafNode(otherlv_0, grammarAccess.getURNdefinitionAccess().getURNdefinitionKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleURNdefinition752); 

                	newLeafNode(otherlv_1, grammarAccess.getURNdefinitionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:337:1: ()
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:338:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getURNdefinitionAccess().getURNdefinitionAction_2(),
                        current);
                

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleURNdefinition773); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:355:1: entryRuleASDspec returns [EObject current=null] : iv_ruleASDspec= ruleASDspec EOF ;
    public final EObject entryRuleASDspec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASDspec = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:356:2: (iv_ruleASDspec= ruleASDspec EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:357:2: iv_ruleASDspec= ruleASDspec EOF
            {
             newCompositeNode(grammarAccess.getASDspecRule()); 
            pushFollow(FOLLOW_ruleASDspec_in_entryRuleASDspec809);
            iv_ruleASDspec=ruleASDspec();

            state._fsp--;

             current =iv_ruleASDspec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleASDspec819); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:364:1: ruleASDspec returns [EObject current=null] : (otherlv_0= 'asdspec' otherlv_1= '{' () otherlv_3= '}' ) ;
    public final EObject ruleASDspec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:367:28: ( (otherlv_0= 'asdspec' otherlv_1= '{' () otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:368:1: (otherlv_0= 'asdspec' otherlv_1= '{' () otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:368:1: (otherlv_0= 'asdspec' otherlv_1= '{' () otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:368:3: otherlv_0= 'asdspec' otherlv_1= '{' () otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleASDspec856); 

                	newLeafNode(otherlv_0, grammarAccess.getASDspecAccess().getAsdspecKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleASDspec868); 

                	newLeafNode(otherlv_1, grammarAccess.getASDspecAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:376:1: ()
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:377:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getASDspecAccess().getASDspecAction_2(),
                        current);
                

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleASDspec889); 

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


    // $ANTLR start "entryRuleURNlink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:394:1: entryRuleURNlink returns [EObject current=null] : iv_ruleURNlink= ruleURNlink EOF ;
    public final EObject entryRuleURNlink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleURNlink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:395:2: (iv_ruleURNlink= ruleURNlink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:396:2: iv_ruleURNlink= ruleURNlink EOF
            {
             newCompositeNode(grammarAccess.getURNlinkRule()); 
            pushFollow(FOLLOW_ruleURNlink_in_entryRuleURNlink925);
            iv_ruleURNlink=ruleURNlink();

            state._fsp--;

             current =iv_ruleURNlink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleURNlink935); 

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
    // $ANTLR end "entryRuleURNlink"


    // $ANTLR start "ruleURNlink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:403:1: ruleURNlink returns [EObject current=null] : (otherlv_0= 'urnLink' otherlv_1= '{' otherlv_2= '}' ) ;
    public final EObject ruleURNlink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:406:28: ( (otherlv_0= 'urnLink' otherlv_1= '{' otherlv_2= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:407:1: (otherlv_0= 'urnLink' otherlv_1= '{' otherlv_2= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:407:1: (otherlv_0= 'urnLink' otherlv_1= '{' otherlv_2= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:407:3: otherlv_0= 'urnLink' otherlv_1= '{' otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleURNlink972); 

                	newLeafNode(otherlv_0, grammarAccess.getURNlinkAccess().getUrnLinkKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleURNlink984); 

                	newLeafNode(otherlv_1, grammarAccess.getURNlinkAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleURNlink996); 

                	newLeafNode(otherlv_2, grammarAccess.getURNlinkAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleURNlink"


    // $ANTLR start "entryRuleUCMspec"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:427:1: entryRuleUCMspec returns [EObject current=null] : iv_ruleUCMspec= ruleUCMspec EOF ;
    public final EObject entryRuleUCMspec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUCMspec = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:428:2: (iv_ruleUCMspec= ruleUCMspec EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:429:2: iv_ruleUCMspec= ruleUCMspec EOF
            {
             newCompositeNode(grammarAccess.getUCMspecRule()); 
            pushFollow(FOLLOW_ruleUCMspec_in_entryRuleUCMspec1032);
            iv_ruleUCMspec=ruleUCMspec();

            state._fsp--;

             current =iv_ruleUCMspec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUCMspec1042); 

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
    // $ANTLR end "entryRuleUCMspec"


    // $ANTLR start "ruleUCMspec"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:436:1: ruleUCMspec returns [EObject current=null] : (otherlv_0= 'ucmSpec' otherlv_1= '{' otherlv_2= '}' ) ;
    public final EObject ruleUCMspec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:439:28: ( (otherlv_0= 'ucmSpec' otherlv_1= '{' otherlv_2= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:440:1: (otherlv_0= 'ucmSpec' otherlv_1= '{' otherlv_2= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:440:1: (otherlv_0= 'ucmSpec' otherlv_1= '{' otherlv_2= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:440:3: otherlv_0= 'ucmSpec' otherlv_1= '{' otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleUCMspec1079); 

                	newLeafNode(otherlv_0, grammarAccess.getUCMspecAccess().getUcmSpecKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleUCMspec1091); 

                	newLeafNode(otherlv_1, grammarAccess.getUCMspecAccess().getLeftCurlyBracketKeyword_1());
                
            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleUCMspec1103); 

                	newLeafNode(otherlv_2, grammarAccess.getUCMspecAccess().getRightCurlyBracketKeyword_2());
                

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
    // $ANTLR end "ruleUCMspec"


    // $ANTLR start "entryRuleGRLspec"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:460:1: entryRuleGRLspec returns [EObject current=null] : iv_ruleGRLspec= ruleGRLspec EOF ;
    public final EObject entryRuleGRLspec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRLspec = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:461:2: (iv_ruleGRLspec= ruleGRLspec EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:462:2: iv_ruleGRLspec= ruleGRLspec EOF
            {
             newCompositeNode(grammarAccess.getGRLspecRule()); 
            pushFollow(FOLLOW_ruleGRLspec_in_entryRuleGRLspec1139);
            iv_ruleGRLspec=ruleGRLspec();

            state._fsp--;

             current =iv_ruleGRLspec; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRLspec1149); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:469:1: ruleGRLspec returns [EObject current=null] : (otherlv_0= 'grl' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:472:28: ( (otherlv_0= 'grl' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:473:1: (otherlv_0= 'grl' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:473:1: (otherlv_0= 'grl' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:473:3: otherlv_0= 'grl' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleGRLspec1186); 

                	newLeafNode(otherlv_0, grammarAccess.getGRLspecAccess().getGrlKeyword_0());
                
            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleGRLspec1198); 

                	newLeafNode(otherlv_1, grammarAccess.getGRLspecAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:481:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:483:1: ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:483:1: ( ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:484:2: ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGRLspecAccess().getUnorderedGroup_2());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:487:2: ( ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:488:3: ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:488:3: ( ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) ) )*
            loop10:
            do {
                int alt10=8;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20||LA10_0==28||LA10_0==31) && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 3) ) {
                    alt10=4;
                }
                else if ( LA10_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 4) ) {
                    alt10=5;
                }
                else if ( LA10_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 5) ) {
                    alt10=6;
                }
                else if ( LA10_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 6) ) {
                    alt10=7;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:490:4: ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:490:4: ({...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:491:5: {...}? => ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:491:104: ( ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:492:6: ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:495:6: ({...}? => ( (lv_links_3_0= ruleElementLink ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        switch ( input.LA(1) ) {
            	        case 20:
            	            {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	            }
            	            break;
            	        case 28:
            	            {
            	            int LA4_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	            }
            	            break;
            	        case 31:
            	            {
            	            int LA4_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt4) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:495:7: {...}? => ( (lv_links_3_0= ruleElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:495:16: ( (lv_links_3_0= ruleElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:496:1: (lv_links_3_0= ruleElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:496:1: (lv_links_3_0= ruleElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:497:3: lv_links_3_0= ruleElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getLinksElementLinkParserRuleCall_2_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleElementLink_in_ruleGRLspec1264);
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
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:520:4: ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:520:4: ({...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:521:5: {...}? => ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:521:104: ( ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:522:6: ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:525:6: ({...}? => ( (lv_actors_4_0= ruleActor ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==32) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:525:7: {...}? => ( (lv_actors_4_0= ruleActor ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:525:16: ( (lv_actors_4_0= ruleActor ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:526:1: (lv_actors_4_0= ruleActor )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:526:1: (lv_actors_4_0= ruleActor )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:527:3: lv_actors_4_0= ruleActor
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getActorsActorParserRuleCall_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleActor_in_ruleGRLspec1340);
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
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:550:4: ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:550:4: ({...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:551:5: {...}? => ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:551:104: ( ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:552:6: ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:555:6: ({...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==41) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:555:7: {...}? => ( (lv_intElements_5_0= ruleIntentionalElement ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:555:16: ( (lv_intElements_5_0= ruleIntentionalElement ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:556:1: (lv_intElements_5_0= ruleIntentionalElement )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:556:1: (lv_intElements_5_0= ruleIntentionalElement )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:557:3: lv_intElements_5_0= ruleIntentionalElement
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getIntElementsIntentionalElementParserRuleCall_2_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleIntentionalElement_in_ruleGRLspec1416);
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
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:580:4: ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:580:4: ({...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:581:5: {...}? => ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:581:104: ( ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:582:6: ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:585:6: ({...}? => ( (lv_impactModel_6_0= ruleImpactModel ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:585:7: {...}? => ( (lv_impactModel_6_0= ruleImpactModel ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:585:16: ( (lv_impactModel_6_0= ruleImpactModel ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:586:1: (lv_impactModel_6_0= ruleImpactModel )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:586:1: (lv_impactModel_6_0= ruleImpactModel )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:587:3: lv_impactModel_6_0= ruleImpactModel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getImpactModelImpactModelParserRuleCall_2_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImpactModel_in_ruleGRLspec1492);
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
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:610:4: ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:610:4: ({...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:611:5: {...}? => ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:611:104: ( ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:612:6: ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:615:6: ({...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) ) )+
            	    int cnt7=0;
            	    loop7:
            	    do {
            	        int alt7=2;
            	        int LA7_0 = input.LA(1);

            	        if ( (LA7_0==46) ) {
            	            int LA7_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt7=1;
            	            }


            	        }


            	        switch (alt7) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:615:7: {...}? => ( (lv_groups_7_0= ruleStrategiesGroup ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:615:16: ( (lv_groups_7_0= ruleStrategiesGroup ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:616:1: (lv_groups_7_0= ruleStrategiesGroup )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:616:1: (lv_groups_7_0= ruleStrategiesGroup )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:617:3: lv_groups_7_0= ruleStrategiesGroup
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getGroupsStrategiesGroupParserRuleCall_2_4_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleStrategiesGroup_in_ruleGRLspec1567);
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
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:640:4: ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:640:4: ({...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:641:5: {...}? => ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:641:104: ( ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:642:6: ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:645:6: ({...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) ) )+
            	    int cnt8=0;
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==47) ) {
            	            int LA8_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt8=1;
            	            }


            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:645:7: {...}? => ( (lv_contributionContexts_8_0= ruleContributionContext ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:645:16: ( (lv_contributionContexts_8_0= ruleContributionContext ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:646:1: (lv_contributionContexts_8_0= ruleContributionContext )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:646:1: (lv_contributionContexts_8_0= ruleContributionContext )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:647:3: lv_contributionContexts_8_0= ruleContributionContext
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getContributionContextsContributionContextParserRuleCall_2_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleContributionContext_in_ruleGRLspec1643);
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
            	    	    if ( cnt8 >= 1 ) break loop8;
            	                EarlyExitException eee =
            	                    new EarlyExitException(8, input);
            	                throw eee;
            	        }
            	        cnt8++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGRLspecAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:670:4: ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:670:4: ({...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:671:5: {...}? => ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGRLspec", "getUnorderedGroupHelper().canSelect(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:671:104: ( ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:672:6: ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGRLspecAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:675:6: ({...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==48) ) {
            	            int LA9_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt9=1;
            	            }


            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:675:7: {...}? => ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGRLspec", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:675:16: ( (lv_contributionGroups_9_0= ruleContributionContextGroup ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:676:1: (lv_contributionGroups_9_0= ruleContributionContextGroup )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:676:1: (lv_contributionGroups_9_0= ruleContributionContextGroup )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:677:3: lv_contributionGroups_9_0= ruleContributionContextGroup
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGRLspecAccess().getContributionGroupsContributionContextGroupParserRuleCall_2_6_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleContributionContextGroup_in_ruleGRLspec1719);
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
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGRLspecAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGRLspecAccess().getUnorderedGroup_2());
            	

            }

            otherlv_10=(Token)match(input,14,FOLLOW_14_in_ruleGRLspec1772); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:719:1: entryRuleElementLink returns [EObject current=null] : iv_ruleElementLink= ruleElementLink EOF ;
    public final EObject entryRuleElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:720:2: (iv_ruleElementLink= ruleElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:721:2: iv_ruleElementLink= ruleElementLink EOF
            {
             newCompositeNode(grammarAccess.getElementLinkRule()); 
            pushFollow(FOLLOW_ruleElementLink_in_entryRuleElementLink1808);
            iv_ruleElementLink=ruleElementLink();

            state._fsp--;

             current =iv_ruleElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLink1818); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:728:1: ruleElementLink returns [EObject current=null] : (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency ) ;
    public final EObject ruleElementLink() throws RecognitionException {
        EObject current = null;

        EObject this_Decomposition_0 = null;

        EObject this_Contribution_1 = null;

        EObject this_Dependency_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:731:28: ( (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:732:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:732:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:733:5: this_Decomposition_0= ruleDecomposition
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDecompositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecomposition_in_ruleElementLink1865);
                    this_Decomposition_0=ruleDecomposition();

                    state._fsp--;

                     
                            current = this_Decomposition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:743:5: this_Contribution_1= ruleContribution
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getContributionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContribution_in_ruleElementLink1892);
                    this_Contribution_1=ruleContribution();

                    state._fsp--;

                     
                            current = this_Contribution_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:753:5: this_Dependency_2= ruleDependency
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDependencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDependency_in_ruleElementLink1919);
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:769:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:770:2: (iv_ruleDecomposition= ruleDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:771:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             newCompositeNode(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition1954);
            iv_ruleDecomposition=ruleDecomposition();

            state._fsp--;

             current =iv_ruleDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition1964); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:778:1: ruleDecomposition returns [EObject current=null] : (otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' ) ;
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
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:781:28: ( (otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:782:1: (otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:782:1: (otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:782:3: otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleDecomposition2001); 

                	newLeafNode(otherlv_0, grammarAccess.getDecompositionAccess().getDecompositionKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:786:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:787:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:787:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:788:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposition2018); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDecomposition2035); 

                	newLeafNode(otherlv_2, grammarAccess.getDecompositionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:808:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:810:1: ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:810:1: ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:811:2: ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDecompositionAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:814:2: ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:815:3: ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:815:3: ( ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=5;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 2) ) {
                    alt13=3;
                }
                else if ( LA13_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 3) ) {
                    alt13=4;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:817:4: ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:817:4: ({...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:818:5: {...}? => ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDecomposition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:818:110: ( ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:819:6: ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:822:6: ({...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:822:7: {...}? => ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDecomposition", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:822:16: ( ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:822:17: ( (otherlv_4= RULE_ID ) ) otherlv_5= '->' ( (otherlv_6= RULE_ID ) ) otherlv_7= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:822:17: ( (otherlv_4= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:823:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:823:1: (otherlv_4= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:824:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDecompositionRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposition2101); 

            	    		newLeafNode(otherlv_4, grammarAccess.getDecompositionAccess().getSrcGRLLinkableElementCrossReference_3_0_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleDecomposition2113); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDecompositionAccess().getHyphenMinusGreaterThanSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:839:1: ( (otherlv_6= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:840:1: (otherlv_6= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:840:1: (otherlv_6= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:841:3: otherlv_6= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDecompositionRule());
            	    	        }
            	            
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposition2133); 

            	    		newLeafNode(otherlv_6, grammarAccess.getDecompositionAccess().getDestGRLLinkableElementCrossReference_3_0_2_0()); 
            	    	

            	    }


            	    }

            	    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleDecomposition2145); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDecompositionAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDecompositionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:863:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:863:4: ({...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:864:5: {...}? => ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDecomposition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:864:110: ( ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:865:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:868:6: ({...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:868:7: {...}? => (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDecomposition", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:868:16: (otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:868:18: otherlv_8= 'id' otherlv_9= '=' ( (lv_id_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleDecomposition2213); 

            	        	newLeafNode(otherlv_8, grammarAccess.getDecompositionAccess().getIdKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleDecomposition2225); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDecompositionAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:876:1: ( (lv_id_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:877:1: (lv_id_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:877:1: (lv_id_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:878:3: lv_id_10_0= RULE_STRING
            	    {
            	    lv_id_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecomposition2242); 

            	    			newLeafNode(lv_id_10_0, grammarAccess.getDecompositionAccess().getIdSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

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

            	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleDecomposition2259); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDecompositionAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDecompositionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:905:4: ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:905:4: ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:906:5: {...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDecomposition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:906:110: ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:907:6: ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:910:6: ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:910:7: {...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDecomposition", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:910:16: (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:910:18: otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleDecomposition2327); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDecompositionAccess().getDescriptionKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleDecomposition2339); 

            	        	newLeafNode(otherlv_13, grammarAccess.getDecompositionAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:918:1: ( (lv_description_14_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:919:1: (lv_description_14_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:919:1: (lv_description_14_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:920:3: lv_description_14_0= RULE_STRING
            	    {
            	    lv_description_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecomposition2356); 

            	    			newLeafNode(lv_description_14_0, grammarAccess.getDecompositionAccess().getDescriptionSTRINGTerminalRuleCall_3_2_2_0()); 
            	    		

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

            	    otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleDecomposition2373); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDecompositionAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDecompositionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:947:4: ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:947:4: ({...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:948:5: {...}? => ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDecomposition", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:948:110: ( ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:949:6: ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDecompositionAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:952:6: ({...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:952:7: {...}? => (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDecomposition", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:952:16: (otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:952:18: otherlv_16= 'refs' otherlv_17= '=' ( (otherlv_18= RULE_ID ) ) (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )* otherlv_21= ';'
            	    {
            	    otherlv_16=(Token)match(input,26,FOLLOW_26_in_ruleDecomposition2441); 

            	        	newLeafNode(otherlv_16, grammarAccess.getDecompositionAccess().getRefsKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleDecomposition2453); 

            	        	newLeafNode(otherlv_17, grammarAccess.getDecompositionAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:960:1: ( (otherlv_18= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:961:1: (otherlv_18= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:961:1: (otherlv_18= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:962:3: otherlv_18= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDecompositionRule());
            	    	        }
            	            
            	    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposition2473); 

            	    		newLeafNode(otherlv_18, grammarAccess.getDecompositionAccess().getRefsLinkRefCrossReference_3_3_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:973:2: (otherlv_19= ',' ( (otherlv_20= RULE_ID ) ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==27) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:973:4: otherlv_19= ',' ( (otherlv_20= RULE_ID ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,27,FOLLOW_27_in_ruleDecomposition2486); 

            	    	        	newLeafNode(otherlv_19, grammarAccess.getDecompositionAccess().getCommaKeyword_3_3_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:977:1: ( (otherlv_20= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:978:1: (otherlv_20= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:978:1: (otherlv_20= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:979:3: otherlv_20= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getDecompositionRule());
            	    	    	        }
            	    	            
            	    	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecomposition2506); 

            	    	    		newLeafNode(otherlv_20, grammarAccess.getDecompositionAccess().getRefsLinkRefCrossReference_3_3_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop12;
            	        }
            	    } while (true);

            	    otherlv_21=(Token)match(input,22,FOLLOW_22_in_ruleDecomposition2520); 

            	        	newLeafNode(otherlv_21, grammarAccess.getDecompositionAccess().getSemicolonKeyword_3_3_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDecompositionAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDecompositionAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleDecomposition", "getUnorderedGroupHelper().canLeave(grammarAccess.getDecompositionAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDecompositionAccess().getUnorderedGroup_3());
            	

            }

            otherlv_22=(Token)match(input,14,FOLLOW_14_in_ruleDecomposition2579); 

                	newLeafNode(otherlv_22, grammarAccess.getDecompositionAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1021:1: entryRuleContribution returns [EObject current=null] : iv_ruleContribution= ruleContribution EOF ;
    public final EObject entryRuleContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1022:2: (iv_ruleContribution= ruleContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1023:2: iv_ruleContribution= ruleContribution EOF
            {
             newCompositeNode(grammarAccess.getContributionRule()); 
            pushFollow(FOLLOW_ruleContribution_in_entryRuleContribution2615);
            iv_ruleContribution=ruleContribution();

            state._fsp--;

             current =iv_ruleContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContribution2625); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1030:1: ruleContribution returns [EObject current=null] : (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) ) )+ {...}?) ) ) otherlv_34= '}' ) ;
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
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Enumerator lv_contribution_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1033:28: ( (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) ) )+ {...}?) ) ) otherlv_34= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1034:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) ) )+ {...}?) ) ) otherlv_34= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1034:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) ) )+ {...}?) ) ) otherlv_34= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1034:3: otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) ) )+ {...}?) ) ) otherlv_34= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleContribution2662); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionAccess().getContributionKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1038:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1039:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1039:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1040:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContribution2679); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleContribution2696); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1060:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1062:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1062:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1063:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1066:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1067:3: ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1067:3: ( ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=8;
                int LA15_0 = input.LA(1);

                if ( LA15_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 ==29 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 2) ) {
                    alt15=3;
                }
                else if ( LA15_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 3) ) {
                    alt15=4;
                }
                else if ( LA15_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 4) ) {
                    alt15=5;
                }
                else if ( LA15_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 5) ) {
                    alt15=6;
                }
                else if ( LA15_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 6) ) {
                    alt15=7;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1069:4: ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1069:4: ({...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1070:5: {...}? => ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1070:109: ( ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1071:6: ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1074:6: ({...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1074:7: {...}? => (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1074:16: (otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1074:18: otherlv_4= 'contribution' otherlv_5= '=' ( (lv_contribution_6_0= ruleContributionType ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleContribution2754); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionAccess().getContributionKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleContribution2766); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContributionAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1082:1: ( (lv_contribution_6_0= ruleContributionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1083:1: (lv_contribution_6_0= ruleContributionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1083:1: (lv_contribution_6_0= ruleContributionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1084:3: lv_contribution_6_0= ruleContributionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionAccess().getContributionContributionTypeEnumRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionType_in_ruleContribution2787);
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

            	    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleContribution2799); 

            	        	newLeafNode(otherlv_7, grammarAccess.getContributionAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1111:4: ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1111:4: ({...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1112:5: {...}? => ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1112:109: ( ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1113:6: ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1116:6: ({...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1116:7: {...}? => (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1116:16: (otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1116:18: otherlv_8= 'quantitativeContribution' otherlv_9= '=' ( (lv_quantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,29,FOLLOW_29_in_ruleContribution2867); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionAccess().getQuantitativeContributionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleContribution2879); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContributionAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1124:1: ( (lv_quantitativeContribution_10_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1125:1: (lv_quantitativeContribution_10_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1125:1: (lv_quantitativeContribution_10_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1126:3: lv_quantitativeContribution_10_0= RULE_INT
            	    {
            	    lv_quantitativeContribution_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContribution2896); 

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

            	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleContribution2913); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContributionAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1153:4: ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1153:4: ({...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1154:5: {...}? => ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1154:109: ( ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1155:6: ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1158:6: ({...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1158:7: {...}? => (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1158:16: (otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1158:18: otherlv_12= 'correlation' otherlv_13= '=' ( (lv_correlation_14_0= RULE_BOOLEAN ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleContribution2981); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContributionAccess().getCorrelationKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleContribution2993); 

            	        	newLeafNode(otherlv_13, grammarAccess.getContributionAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1166:1: ( (lv_correlation_14_0= RULE_BOOLEAN ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1167:1: (lv_correlation_14_0= RULE_BOOLEAN )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1167:1: (lv_correlation_14_0= RULE_BOOLEAN )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1168:3: lv_correlation_14_0= RULE_BOOLEAN
            	    {
            	    lv_correlation_14_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleContribution3010); 

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

            	    otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleContribution3027); 

            	        	newLeafNode(otherlv_15, grammarAccess.getContributionAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1195:4: ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1195:4: ({...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1196:5: {...}? => ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1196:109: ( ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1197:6: ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1200:6: ({...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1200:7: {...}? => (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1200:16: (otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1200:18: otherlv_16= 'id' otherlv_17= '=' ( (lv_id_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleContribution3095); 

            	        	newLeafNode(otherlv_16, grammarAccess.getContributionAccess().getIdKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleContribution3107); 

            	        	newLeafNode(otherlv_17, grammarAccess.getContributionAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1208:1: ( (lv_id_18_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1209:1: (lv_id_18_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1209:1: (lv_id_18_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1210:3: lv_id_18_0= RULE_STRING
            	    {
            	    lv_id_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContribution3124); 

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

            	    otherlv_19=(Token)match(input,22,FOLLOW_22_in_ruleContribution3141); 

            	        	newLeafNode(otherlv_19, grammarAccess.getContributionAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1237:4: ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1237:4: ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1238:5: {...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1238:109: ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1239:6: ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1242:6: ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1242:7: {...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1242:16: (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1242:18: otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleContribution3209); 

            	        	newLeafNode(otherlv_20, grammarAccess.getContributionAccess().getDescriptionKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,24,FOLLOW_24_in_ruleContribution3221); 

            	        	newLeafNode(otherlv_21, grammarAccess.getContributionAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1250:1: ( (lv_description_22_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1251:1: (lv_description_22_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1251:1: (lv_description_22_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1252:3: lv_description_22_0= RULE_STRING
            	    {
            	    lv_description_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContribution3238); 

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

            	    otherlv_23=(Token)match(input,22,FOLLOW_22_in_ruleContribution3255); 

            	        	newLeafNode(otherlv_23, grammarAccess.getContributionAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1279:4: ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1279:4: ({...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1280:5: {...}? => ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1280:109: ( ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1281:6: ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1284:6: ({...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1284:7: {...}? => (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1284:16: (otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1284:18: otherlv_24= 'refs' otherlv_25= '=' ( (otherlv_26= RULE_ID ) ) (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )* otherlv_29= ';'
            	    {
            	    otherlv_24=(Token)match(input,26,FOLLOW_26_in_ruleContribution3323); 

            	        	newLeafNode(otherlv_24, grammarAccess.getContributionAccess().getRefsKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,24,FOLLOW_24_in_ruleContribution3335); 

            	        	newLeafNode(otherlv_25, grammarAccess.getContributionAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1292:1: ( (otherlv_26= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1293:1: (otherlv_26= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1293:1: (otherlv_26= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1294:3: otherlv_26= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRule());
            	    	        }
            	            
            	    otherlv_26=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContribution3355); 

            	    		newLeafNode(otherlv_26, grammarAccess.getContributionAccess().getRefsLinkRefCrossReference_3_5_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1305:2: (otherlv_27= ',' ( (otherlv_28= RULE_ID ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==27) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1305:4: otherlv_27= ',' ( (otherlv_28= RULE_ID ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,27,FOLLOW_27_in_ruleContribution3368); 

            	    	        	newLeafNode(otherlv_27, grammarAccess.getContributionAccess().getCommaKeyword_3_5_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1309:1: ( (otherlv_28= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1310:1: (otherlv_28= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1310:1: (otherlv_28= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1311:3: otherlv_28= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContributionRule());
            	    	    	        }
            	    	            
            	    	    otherlv_28=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContribution3388); 

            	    	    		newLeafNode(otherlv_28, grammarAccess.getContributionAccess().getRefsLinkRefCrossReference_3_5_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);

            	    otherlv_29=(Token)match(input,22,FOLLOW_22_in_ruleContribution3402); 

            	        	newLeafNode(otherlv_29, grammarAccess.getContributionAccess().getSemicolonKeyword_3_5_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1333:4: ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1333:4: ({...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1334:5: {...}? => ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1334:109: ( ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1335:6: ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1338:6: ({...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1338:7: {...}? => ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContribution", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1338:16: ( ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1338:17: ( (otherlv_30= RULE_ID ) ) otherlv_31= '->' ( (otherlv_32= RULE_ID ) ) otherlv_33= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1338:17: ( (otherlv_30= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1339:1: (otherlv_30= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1339:1: (otherlv_30= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1340:3: otherlv_30= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRule());
            	    	        }
            	            
            	    otherlv_30=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContribution3478); 

            	    		newLeafNode(otherlv_30, grammarAccess.getContributionAccess().getSrcGRLLinkableElementCrossReference_3_6_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_31=(Token)match(input,21,FOLLOW_21_in_ruleContribution3490); 

            	        	newLeafNode(otherlv_31, grammarAccess.getContributionAccess().getHyphenMinusGreaterThanSignKeyword_3_6_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1355:1: ( (otherlv_32= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1356:1: (otherlv_32= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1356:1: (otherlv_32= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1357:3: otherlv_32= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRule());
            	    	        }
            	            
            	    otherlv_32=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContribution3510); 

            	    		newLeafNode(otherlv_32, grammarAccess.getContributionAccess().getDestGRLLinkableElementCrossReference_3_6_2_0()); 
            	    	

            	    }


            	    }

            	    otherlv_33=(Token)match(input,22,FOLLOW_22_in_ruleContribution3522); 

            	        	newLeafNode(otherlv_33, grammarAccess.getContributionAccess().getSemicolonKeyword_3_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getContributionAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleContribution", "getUnorderedGroupHelper().canLeave(grammarAccess.getContributionAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContributionAccess().getUnorderedGroup_3());
            	

            }

            otherlv_34=(Token)match(input,14,FOLLOW_14_in_ruleContribution3581); 

                	newLeafNode(otherlv_34, grammarAccess.getContributionAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1399:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1400:2: (iv_ruleDependency= ruleDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1401:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency3617);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency3627); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1408:1: ruleDependency returns [EObject current=null] : (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_id_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1411:28: ( (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1412:1: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1412:1: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1412:3: otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) ) ) otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleDependency3664); 

                	newLeafNode(otherlv_0, grammarAccess.getDependencyAccess().getDependencyKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1416:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1417:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1417:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1418:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency3681); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDependency3698); 

                	newLeafNode(otherlv_2, grammarAccess.getDependencyAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1438:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1440:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1440:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1441:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDependencyAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1444:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1445:3: ( ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1445:3: ( ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=5;
                int LA17_0 = input.LA(1);

                if ( LA17_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_0 ==26 && getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 2) ) {
                    alt17=3;
                }
                else if ( LA17_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 3) ) {
                    alt17=4;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1447:4: ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1447:4: ({...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1448:5: {...}? => ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1448:107: ( ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1449:6: ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1452:6: ({...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1452:7: {...}? => (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1452:16: (otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1452:18: otherlv_4= 'id' otherlv_5= '=' ( (lv_id_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleDependency3756); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDependencyAccess().getIdKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleDependency3768); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDependencyAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1460:1: ( (lv_id_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1461:1: (lv_id_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1461:1: (lv_id_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1462:3: lv_id_6_0= RULE_STRING
            	    {
            	    lv_id_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependency3785); 

            	    			newLeafNode(lv_id_6_0, grammarAccess.getDependencyAccess().getIdSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependencyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"id",
            	            		lv_id_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleDependency3802); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDependencyAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDependencyAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1489:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1489:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1490:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1490:107: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1491:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1494:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1494:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1494:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1494:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleDependency3870); 

            	        	newLeafNode(otherlv_8, grammarAccess.getDependencyAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleDependency3882); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDependencyAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1502:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1503:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1503:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1504:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependency3899); 

            	    			newLeafNode(lv_description_10_0, grammarAccess.getDependencyAccess().getDescriptionSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependencyRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleDependency3916); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDependencyAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDependencyAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1531:4: ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1531:4: ({...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1532:5: {...}? => ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1532:107: ( ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1533:6: ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1536:6: ({...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1536:7: {...}? => (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1536:16: (otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1536:18: otherlv_12= 'refs' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= ';'
            	    {
            	    otherlv_12=(Token)match(input,26,FOLLOW_26_in_ruleDependency3984); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDependencyAccess().getRefsKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleDependency3996); 

            	        	newLeafNode(otherlv_13, grammarAccess.getDependencyAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1544:1: ( (otherlv_14= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1545:1: (otherlv_14= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1545:1: (otherlv_14= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1546:3: otherlv_14= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependencyRule());
            	    	        }
            	            
            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency4016); 

            	    		newLeafNode(otherlv_14, grammarAccess.getDependencyAccess().getRefsLinkRefCrossReference_3_2_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1557:2: (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==27) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1557:4: otherlv_15= ',' ( (otherlv_16= RULE_ID ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,27,FOLLOW_27_in_ruleDependency4029); 

            	    	        	newLeafNode(otherlv_15, grammarAccess.getDependencyAccess().getCommaKeyword_3_2_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1561:1: ( (otherlv_16= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1562:1: (otherlv_16= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1562:1: (otherlv_16= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1563:3: otherlv_16= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getDependencyRule());
            	    	    	        }
            	    	            
            	    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency4049); 

            	    	    		newLeafNode(otherlv_16, grammarAccess.getDependencyAccess().getRefsLinkRefCrossReference_3_2_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,22,FOLLOW_22_in_ruleDependency4063); 

            	        	newLeafNode(otherlv_17, grammarAccess.getDependencyAccess().getSemicolonKeyword_3_2_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDependencyAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1585:4: ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1585:4: ({...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1586:5: {...}? => ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1586:107: ( ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1587:6: ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDependencyAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1590:6: ({...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1590:7: {...}? => ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDependency", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1590:16: ( ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1590:17: ( (otherlv_18= RULE_ID ) ) otherlv_19= '->' ( (otherlv_20= RULE_ID ) ) otherlv_21= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1590:17: ( (otherlv_18= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1591:1: (otherlv_18= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1591:1: (otherlv_18= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1592:3: otherlv_18= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependencyRule());
            	    	        }
            	            
            	    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency4139); 

            	    		newLeafNode(otherlv_18, grammarAccess.getDependencyAccess().getSrcGRLLinkableElementCrossReference_3_3_0_0()); 
            	    	

            	    }


            	    }

            	    otherlv_19=(Token)match(input,21,FOLLOW_21_in_ruleDependency4151); 

            	        	newLeafNode(otherlv_19, grammarAccess.getDependencyAccess().getHyphenMinusGreaterThanSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1607:1: ( (otherlv_20= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1608:1: (otherlv_20= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1608:1: (otherlv_20= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1609:3: otherlv_20= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependencyRule());
            	    	        }
            	            
            	    otherlv_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependency4171); 

            	    		newLeafNode(otherlv_20, grammarAccess.getDependencyAccess().getDestGRLLinkableElementCrossReference_3_3_2_0()); 
            	    	

            	    }


            	    }

            	    otherlv_21=(Token)match(input,22,FOLLOW_22_in_ruleDependency4183); 

            	        	newLeafNode(otherlv_21, grammarAccess.getDependencyAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDependencyAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDependencyAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleDependency", "getUnorderedGroupHelper().canLeave(grammarAccess.getDependencyAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDependencyAccess().getUnorderedGroup_3());
            	

            }

            otherlv_22=(Token)match(input,14,FOLLOW_14_in_ruleDependency4242); 

                	newLeafNode(otherlv_22, grammarAccess.getDependencyAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1651:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1652:2: (iv_ruleActor= ruleActor EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1653:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor4278);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor4288); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1660:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) ) )* ) ) ) otherlv_50= '}' ) ;
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
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Enumerator lv_importance_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1663:28: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) ) )* ) ) ) otherlv_50= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1664:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) ) )* ) ) ) otherlv_50= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1664:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) ) )* ) ) ) otherlv_50= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1664:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) ) )* ) ) ) otherlv_50= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleActor4325); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1668:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1669:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1669:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1670:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor4342); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleActor4359); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1690:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1692:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1692:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1693:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1696:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1697:3: ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1697:3: ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) ) )*
            loop21:
            do {
                int alt21=11;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1699:4: ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1699:4: ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1700:5: {...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1700:102: ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1701:6: ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1704:6: ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1704:7: {...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1704:16: (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1704:18: otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleActor4417); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActorAccess().getImportanceKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleActor4429); 

            	        	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1712:1: ( (lv_importance_6_0= ruleImportanceType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1713:1: (lv_importance_6_0= ruleImportanceType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1713:1: (lv_importance_6_0= ruleImportanceType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1714:3: lv_importance_6_0= ruleImportanceType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActorAccess().getImportanceImportanceTypeEnumRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportanceType_in_ruleActor4450);
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

            	    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleActor4462); 

            	        	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1741:4: ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1741:4: ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1742:5: {...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1742:102: ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1743:6: ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1746:6: ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1746:7: {...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1746:16: (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1746:18: otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,34,FOLLOW_34_in_ruleActor4530); 

            	        	newLeafNode(otherlv_8, grammarAccess.getActorAccess().getImportanceQuantitativeKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleActor4542); 

            	        	newLeafNode(otherlv_9, grammarAccess.getActorAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1754:1: ( (lv_importanceQuantitative_10_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1755:1: (lv_importanceQuantitative_10_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1755:1: (lv_importanceQuantitative_10_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1756:3: lv_importanceQuantitative_10_0= RULE_INT
            	    {
            	    lv_importanceQuantitative_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActor4559); 

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

            	    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleActor4576); 

            	        	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1783:4: ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1783:4: ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1784:5: {...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1784:102: ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1785:6: ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1788:6: ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1788:7: {...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1788:16: (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1788:18: otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,35,FOLLOW_35_in_ruleActor4644); 

            	        	newLeafNode(otherlv_12, grammarAccess.getActorAccess().getLineColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleActor4656); 

            	        	newLeafNode(otherlv_13, grammarAccess.getActorAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1796:1: ( (lv_lineColor_14_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1797:1: (lv_lineColor_14_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1797:1: (lv_lineColor_14_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1798:3: lv_lineColor_14_0= RULE_STRING
            	    {
            	    lv_lineColor_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor4673); 

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

            	    otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleActor4690); 

            	        	newLeafNode(otherlv_15, grammarAccess.getActorAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1825:4: ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1825:4: ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1826:5: {...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1826:102: ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1827:6: ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1830:6: ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1830:7: {...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1830:16: (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1830:18: otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,36,FOLLOW_36_in_ruleActor4758); 

            	        	newLeafNode(otherlv_16, grammarAccess.getActorAccess().getFillColorKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleActor4770); 

            	        	newLeafNode(otherlv_17, grammarAccess.getActorAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1838:1: ( (lv_fillColor_18_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1839:1: (lv_fillColor_18_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1839:1: (lv_fillColor_18_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1840:3: lv_fillColor_18_0= RULE_STRING
            	    {
            	    lv_fillColor_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor4787); 

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

            	    otherlv_19=(Token)match(input,22,FOLLOW_22_in_ruleActor4804); 

            	        	newLeafNode(otherlv_19, grammarAccess.getActorAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1867:4: ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1867:4: ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1868:5: {...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1868:102: ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1869:6: ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1872:6: ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1872:7: {...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1872:16: (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1872:18: otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,37,FOLLOW_37_in_ruleActor4872); 

            	        	newLeafNode(otherlv_20, grammarAccess.getActorAccess().getFilledKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,24,FOLLOW_24_in_ruleActor4884); 

            	        	newLeafNode(otherlv_21, grammarAccess.getActorAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1880:1: ( (lv_filled_22_0= RULE_BOOLEAN ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1881:1: (lv_filled_22_0= RULE_BOOLEAN )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1881:1: (lv_filled_22_0= RULE_BOOLEAN )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1882:3: lv_filled_22_0= RULE_BOOLEAN
            	    {
            	    lv_filled_22_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleActor4901); 

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

            	    otherlv_23=(Token)match(input,22,FOLLOW_22_in_ruleActor4918); 

            	        	newLeafNode(otherlv_23, grammarAccess.getActorAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1909:4: ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1909:4: ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1910:5: {...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1910:102: ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1911:6: ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1914:6: ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1914:7: {...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1914:16: (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1914:18: otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,23,FOLLOW_23_in_ruleActor4986); 

            	        	newLeafNode(otherlv_24, grammarAccess.getActorAccess().getIdKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,24,FOLLOW_24_in_ruleActor4998); 

            	        	newLeafNode(otherlv_25, grammarAccess.getActorAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1922:1: ( (lv_id_26_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1923:1: (lv_id_26_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1923:1: (lv_id_26_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1924:3: lv_id_26_0= RULE_STRING
            	    {
            	    lv_id_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor5015); 

            	    			newLeafNode(lv_id_26_0, grammarAccess.getActorAccess().getIdSTRINGTerminalRuleCall_3_5_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"id",
            	            		lv_id_26_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,22,FOLLOW_22_in_ruleActor5032); 

            	        	newLeafNode(otherlv_27, grammarAccess.getActorAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1951:4: ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1951:4: ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1952:5: {...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1952:102: ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1953:6: ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1956:6: ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1956:7: {...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1956:16: (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1956:18: otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';'
            	    {
            	    otherlv_28=(Token)match(input,25,FOLLOW_25_in_ruleActor5100); 

            	        	newLeafNode(otherlv_28, grammarAccess.getActorAccess().getDescriptionKeyword_3_6_0());
            	        
            	    otherlv_29=(Token)match(input,24,FOLLOW_24_in_ruleActor5112); 

            	        	newLeafNode(otherlv_29, grammarAccess.getActorAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1964:1: ( (lv_description_30_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1965:1: (lv_description_30_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1965:1: (lv_description_30_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1966:3: lv_description_30_0= RULE_STRING
            	    {
            	    lv_description_30_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor5129); 

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

            	    otherlv_31=(Token)match(input,22,FOLLOW_22_in_ruleActor5146); 

            	        	newLeafNode(otherlv_31, grammarAccess.getActorAccess().getSemicolonKeyword_3_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1993:4: ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1993:4: ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1994:5: {...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1994:102: ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1995:6: ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1998:6: ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1998:7: {...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1998:16: (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1998:18: otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';'
            	    {
            	    otherlv_32=(Token)match(input,38,FOLLOW_38_in_ruleActor5214); 

            	        	newLeafNode(otherlv_32, grammarAccess.getActorAccess().getIncludedActorsKeyword_3_7_0());
            	        
            	    otherlv_33=(Token)match(input,24,FOLLOW_24_in_ruleActor5226); 

            	        	newLeafNode(otherlv_33, grammarAccess.getActorAccess().getEqualsSignKeyword_3_7_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2006:1: ( (otherlv_34= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2007:1: (otherlv_34= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2007:1: (otherlv_34= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2008:3: otherlv_34= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	            
            	    otherlv_34=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor5246); 

            	    		newLeafNode(otherlv_34, grammarAccess.getActorAccess().getIncludedActorsActorCrossReference_3_7_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2019:2: (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==27) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2019:4: otherlv_35= ',' ( (otherlv_36= RULE_ID ) )
            	    	    {
            	    	    otherlv_35=(Token)match(input,27,FOLLOW_27_in_ruleActor5259); 

            	    	        	newLeafNode(otherlv_35, grammarAccess.getActorAccess().getCommaKeyword_3_7_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2023:1: ( (otherlv_36= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2024:1: (otherlv_36= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2024:1: (otherlv_36= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2025:3: otherlv_36= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	    	        }
            	    	            
            	    	    otherlv_36=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor5279); 

            	    	    		newLeafNode(otherlv_36, grammarAccess.getActorAccess().getIncludedActorsActorCrossReference_3_7_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);

            	    otherlv_37=(Token)match(input,22,FOLLOW_22_in_ruleActor5293); 

            	        	newLeafNode(otherlv_37, grammarAccess.getActorAccess().getSemicolonKeyword_3_7_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2047:4: ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2047:4: ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2048:5: {...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2048:102: ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2049:6: ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2052:6: ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2052:7: {...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2052:16: (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2052:18: otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';'
            	    {
            	    otherlv_38=(Token)match(input,39,FOLLOW_39_in_ruleActor5361); 

            	        	newLeafNode(otherlv_38, grammarAccess.getActorAccess().getCollapsedRefsKeyword_3_8_0());
            	        
            	    otherlv_39=(Token)match(input,24,FOLLOW_24_in_ruleActor5373); 

            	        	newLeafNode(otherlv_39, grammarAccess.getActorAccess().getEqualsSignKeyword_3_8_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2060:1: ( (otherlv_40= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2061:1: (otherlv_40= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2061:1: (otherlv_40= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2062:3: otherlv_40= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	            
            	    otherlv_40=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor5393); 

            	    		newLeafNode(otherlv_40, grammarAccess.getActorAccess().getCollapsedRefsCollapsedActorRefCrossReference_3_8_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2073:2: (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==27) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2073:4: otherlv_41= ',' ( (otherlv_42= RULE_ID ) )
            	    	    {
            	    	    otherlv_41=(Token)match(input,27,FOLLOW_27_in_ruleActor5406); 

            	    	        	newLeafNode(otherlv_41, grammarAccess.getActorAccess().getCommaKeyword_3_8_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2077:1: ( (otherlv_42= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2078:1: (otherlv_42= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2078:1: (otherlv_42= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2079:3: otherlv_42= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	    	        }
            	    	            
            	    	    otherlv_42=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor5426); 

            	    	    		newLeafNode(otherlv_42, grammarAccess.getActorAccess().getCollapsedRefsCollapsedActorRefCrossReference_3_8_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);

            	    otherlv_43=(Token)match(input,22,FOLLOW_22_in_ruleActor5440); 

            	        	newLeafNode(otherlv_43, grammarAccess.getActorAccess().getSemicolonKeyword_3_8_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2101:4: ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2101:4: ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2102:5: {...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 9)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2102:102: ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2103:6: ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 9);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2106:6: ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2106:7: {...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2106:16: (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2106:18: otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';'
            	    {
            	    otherlv_44=(Token)match(input,40,FOLLOW_40_in_ruleActor5508); 

            	        	newLeafNode(otherlv_44, grammarAccess.getActorAccess().getContRefsKeyword_3_9_0());
            	        
            	    otherlv_45=(Token)match(input,24,FOLLOW_24_in_ruleActor5520); 

            	        	newLeafNode(otherlv_45, grammarAccess.getActorAccess().getEqualsSignKeyword_3_9_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2114:1: ( (otherlv_46= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2115:1: (otherlv_46= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2115:1: (otherlv_46= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2116:3: otherlv_46= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	            
            	    otherlv_46=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor5540); 

            	    		newLeafNode(otherlv_46, grammarAccess.getActorAccess().getContRefsIURNContainerRefCrossReference_3_9_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2127:2: (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==27) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2127:4: otherlv_47= ',' ( (otherlv_48= RULE_ID ) )
            	    	    {
            	    	    otherlv_47=(Token)match(input,27,FOLLOW_27_in_ruleActor5553); 

            	    	        	newLeafNode(otherlv_47, grammarAccess.getActorAccess().getCommaKeyword_3_9_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2131:1: ( (otherlv_48= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2132:1: (otherlv_48= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2132:1: (otherlv_48= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2133:3: otherlv_48= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	    	        }
            	    	            
            	    	    otherlv_48=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor5573); 

            	    	    		newLeafNode(otherlv_48, grammarAccess.getActorAccess().getContRefsIURNContainerRefCrossReference_3_9_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);

            	    otherlv_49=(Token)match(input,22,FOLLOW_22_in_ruleActor5587); 

            	        	newLeafNode(otherlv_49, grammarAccess.getActorAccess().getSemicolonKeyword_3_9_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	

            }

            otherlv_50=(Token)match(input,14,FOLLOW_14_in_ruleActor5640); 

                	newLeafNode(otherlv_50, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2180:1: entryRuleIntentionalElement returns [EObject current=null] : iv_ruleIntentionalElement= ruleIntentionalElement EOF ;
    public final EObject entryRuleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentionalElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2181:2: (iv_ruleIntentionalElement= ruleIntentionalElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2182:2: iv_ruleIntentionalElement= ruleIntentionalElement EOF
            {
             newCompositeNode(grammarAccess.getIntentionalElementRule()); 
            pushFollow(FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement5682);
            iv_ruleIntentionalElement=ruleIntentionalElement();

            state._fsp--;

             current =iv_ruleIntentionalElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntentionalElement5692); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2189:1: ruleIntentionalElement returns [EObject current=null] : (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';' )? (otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';' )? (otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';' )? (otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';' )? (otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';' )? otherlv_45= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2192:28: ( (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';' )? (otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';' )? (otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';' )? (otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';' )? (otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';' )? otherlv_45= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2193:1: (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';' )? (otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';' )? (otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';' )? (otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';' )? (otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';' )? otherlv_45= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2193:1: (otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';' )? (otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';' )? (otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';' )? (otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';' )? (otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';' )? otherlv_45= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2193:3: otherlv_0= 'intentionalElement' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';' )? (otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';' )? (otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';' )? (otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';' )? (otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';' )? (otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';' )? (otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';' )? (otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_STRING ) ) otherlv_34= ';' )? (otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';' )? (otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';' )? otherlv_45= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleIntentionalElement5729); 

                	newLeafNode(otherlv_0, grammarAccess.getIntentionalElementAccess().getIntentionalElementKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2197:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2198:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2198:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2199:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntentionalElement5746); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleIntentionalElement5763); 

                	newLeafNode(otherlv_2, grammarAccess.getIntentionalElementAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2219:1: (otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2219:3: otherlv_3= 'type' otherlv_4= '=' ( (lv_type_5_0= ruleIntentionalElementType ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,42,FOLLOW_42_in_ruleIntentionalElement5776); 

                        	newLeafNode(otherlv_3, grammarAccess.getIntentionalElementAccess().getTypeKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleIntentionalElement5788); 

                        	newLeafNode(otherlv_4, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2227:1: ( (lv_type_5_0= ruleIntentionalElementType ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2228:1: (lv_type_5_0= ruleIntentionalElementType )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2228:1: (lv_type_5_0= ruleIntentionalElementType )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2229:3: lv_type_5_0= ruleIntentionalElementType
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntentionalElementAccess().getTypeIntentionalElementTypeEnumRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleIntentionalElementType_in_ruleIntentionalElement5809);
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

                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement5821); 

                        	newLeafNode(otherlv_6, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2249:3: (otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==43) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2249:5: otherlv_7= 'decompositionType' otherlv_8= '=' ( (lv_decompositionType_9_0= ruleDecompositionType ) ) otherlv_10= ';'
                    {
                    otherlv_7=(Token)match(input,43,FOLLOW_43_in_ruleIntentionalElement5836); 

                        	newLeafNode(otherlv_7, grammarAccess.getIntentionalElementAccess().getDecompositionTypeKeyword_4_0());
                        
                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleIntentionalElement5848); 

                        	newLeafNode(otherlv_8, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_4_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2257:1: ( (lv_decompositionType_9_0= ruleDecompositionType ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2258:1: (lv_decompositionType_9_0= ruleDecompositionType )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2258:1: (lv_decompositionType_9_0= ruleDecompositionType )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2259:3: lv_decompositionType_9_0= ruleDecompositionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntentionalElementAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDecompositionType_in_ruleIntentionalElement5869);
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

                    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement5881); 

                        	newLeafNode(otherlv_10, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_4_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2279:3: (otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2279:5: otherlv_11= 'importance' otherlv_12= '=' ( (lv_importance_13_0= ruleImportanceType ) ) otherlv_14= ';'
                    {
                    otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleIntentionalElement5896); 

                        	newLeafNode(otherlv_11, grammarAccess.getIntentionalElementAccess().getImportanceKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleIntentionalElement5908); 

                        	newLeafNode(otherlv_12, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_5_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2287:1: ( (lv_importance_13_0= ruleImportanceType ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2288:1: (lv_importance_13_0= ruleImportanceType )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2288:1: (lv_importance_13_0= ruleImportanceType )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2289:3: lv_importance_13_0= ruleImportanceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getIntentionalElementAccess().getImportanceImportanceTypeEnumRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleImportanceType_in_ruleIntentionalElement5929);
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

                    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement5941); 

                        	newLeafNode(otherlv_14, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_5_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2309:3: (otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2309:5: otherlv_15= 'importanceQuantitative' otherlv_16= '=' ( (lv_importanceQuantitative_17_0= RULE_INT ) ) otherlv_18= ';'
                    {
                    otherlv_15=(Token)match(input,34,FOLLOW_34_in_ruleIntentionalElement5956); 

                        	newLeafNode(otherlv_15, grammarAccess.getIntentionalElementAccess().getImportanceQuantitativeKeyword_6_0());
                        
                    otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleIntentionalElement5968); 

                        	newLeafNode(otherlv_16, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_6_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2317:1: ( (lv_importanceQuantitative_17_0= RULE_INT ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2318:1: (lv_importanceQuantitative_17_0= RULE_INT )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2318:1: (lv_importanceQuantitative_17_0= RULE_INT )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2319:3: lv_importanceQuantitative_17_0= RULE_INT
                    {
                    lv_importanceQuantitative_17_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIntentionalElement5985); 

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

                    otherlv_18=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement6002); 

                        	newLeafNode(otherlv_18, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_6_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2339:3: (otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2339:5: otherlv_19= 'lineColor' otherlv_20= '=' ( (lv_lineColor_21_0= RULE_STRING ) ) otherlv_22= ';'
                    {
                    otherlv_19=(Token)match(input,35,FOLLOW_35_in_ruleIntentionalElement6017); 

                        	newLeafNode(otherlv_19, grammarAccess.getIntentionalElementAccess().getLineColorKeyword_7_0());
                        
                    otherlv_20=(Token)match(input,24,FOLLOW_24_in_ruleIntentionalElement6029); 

                        	newLeafNode(otherlv_20, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_7_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2347:1: ( (lv_lineColor_21_0= RULE_STRING ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2348:1: (lv_lineColor_21_0= RULE_STRING )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2348:1: (lv_lineColor_21_0= RULE_STRING )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2349:3: lv_lineColor_21_0= RULE_STRING
                    {
                    lv_lineColor_21_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntentionalElement6046); 

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

                    otherlv_22=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement6063); 

                        	newLeafNode(otherlv_22, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_7_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2369:3: (otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2369:5: otherlv_23= 'fillColor' otherlv_24= '=' ( (lv_fillColor_25_0= RULE_STRING ) ) otherlv_26= ';'
                    {
                    otherlv_23=(Token)match(input,36,FOLLOW_36_in_ruleIntentionalElement6078); 

                        	newLeafNode(otherlv_23, grammarAccess.getIntentionalElementAccess().getFillColorKeyword_8_0());
                        
                    otherlv_24=(Token)match(input,24,FOLLOW_24_in_ruleIntentionalElement6090); 

                        	newLeafNode(otherlv_24, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_8_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2377:1: ( (lv_fillColor_25_0= RULE_STRING ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2378:1: (lv_fillColor_25_0= RULE_STRING )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2378:1: (lv_fillColor_25_0= RULE_STRING )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2379:3: lv_fillColor_25_0= RULE_STRING
                    {
                    lv_fillColor_25_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntentionalElement6107); 

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

                    otherlv_26=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement6124); 

                        	newLeafNode(otherlv_26, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_8_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2399:3: (otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2399:5: otherlv_27= 'filled' otherlv_28= '=' ( (lv_filled_29_0= RULE_BOOLEAN ) ) otherlv_30= ';'
                    {
                    otherlv_27=(Token)match(input,37,FOLLOW_37_in_ruleIntentionalElement6139); 

                        	newLeafNode(otherlv_27, grammarAccess.getIntentionalElementAccess().getFilledKeyword_9_0());
                        
                    otherlv_28=(Token)match(input,24,FOLLOW_24_in_ruleIntentionalElement6151); 

                        	newLeafNode(otherlv_28, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_9_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2407:1: ( (lv_filled_29_0= RULE_BOOLEAN ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2408:1: (lv_filled_29_0= RULE_BOOLEAN )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2408:1: (lv_filled_29_0= RULE_BOOLEAN )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2409:3: lv_filled_29_0= RULE_BOOLEAN
                    {
                    lv_filled_29_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleIntentionalElement6168); 

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

                    otherlv_30=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement6185); 

                        	newLeafNode(otherlv_30, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_9_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2429:3: (otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_STRING ) ) otherlv_34= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==23) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2429:5: otherlv_31= 'id' otherlv_32= '=' ( (lv_id_33_0= RULE_STRING ) ) otherlv_34= ';'
                    {
                    otherlv_31=(Token)match(input,23,FOLLOW_23_in_ruleIntentionalElement6200); 

                        	newLeafNode(otherlv_31, grammarAccess.getIntentionalElementAccess().getIdKeyword_10_0());
                        
                    otherlv_32=(Token)match(input,24,FOLLOW_24_in_ruleIntentionalElement6212); 

                        	newLeafNode(otherlv_32, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_10_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2437:1: ( (lv_id_33_0= RULE_STRING ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2438:1: (lv_id_33_0= RULE_STRING )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2438:1: (lv_id_33_0= RULE_STRING )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2439:3: lv_id_33_0= RULE_STRING
                    {
                    lv_id_33_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntentionalElement6229); 

                    			newLeafNode(lv_id_33_0, grammarAccess.getIntentionalElementAccess().getIdSTRINGTerminalRuleCall_10_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentionalElementRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"id",
                            		lv_id_33_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_34=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement6246); 

                        	newLeafNode(otherlv_34, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_10_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2459:3: (otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2459:5: otherlv_35= 'description' otherlv_36= '=' ( (lv_description_37_0= RULE_STRING ) ) otherlv_38= ';'
                    {
                    otherlv_35=(Token)match(input,25,FOLLOW_25_in_ruleIntentionalElement6261); 

                        	newLeafNode(otherlv_35, grammarAccess.getIntentionalElementAccess().getDescriptionKeyword_11_0());
                        
                    otherlv_36=(Token)match(input,24,FOLLOW_24_in_ruleIntentionalElement6273); 

                        	newLeafNode(otherlv_36, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_11_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2467:1: ( (lv_description_37_0= RULE_STRING ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2468:1: (lv_description_37_0= RULE_STRING )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2468:1: (lv_description_37_0= RULE_STRING )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2469:3: lv_description_37_0= RULE_STRING
                    {
                    lv_description_37_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIntentionalElement6290); 

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

                    otherlv_38=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement6307); 

                        	newLeafNode(otherlv_38, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_11_3());
                        

                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2489:3: (otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2489:5: otherlv_39= 'ref' otherlv_40= '=' ( (otherlv_41= RULE_ID ) ) (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )* otherlv_44= ';'
                    {
                    otherlv_39=(Token)match(input,44,FOLLOW_44_in_ruleIntentionalElement6322); 

                        	newLeafNode(otherlv_39, grammarAccess.getIntentionalElementAccess().getRefKeyword_12_0());
                        
                    otherlv_40=(Token)match(input,24,FOLLOW_24_in_ruleIntentionalElement6334); 

                        	newLeafNode(otherlv_40, grammarAccess.getIntentionalElementAccess().getEqualsSignKeyword_12_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2497:1: ( (otherlv_41= RULE_ID ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2498:1: (otherlv_41= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2498:1: (otherlv_41= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2499:3: otherlv_41= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getIntentionalElementRule());
                    	        }
                            
                    otherlv_41=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntentionalElement6354); 

                    		newLeafNode(otherlv_41, grammarAccess.getIntentionalElementAccess().getRefsIntentionalElementRefCrossReference_12_2_0()); 
                    	

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2510:2: (otherlv_42= ',' ( (otherlv_43= RULE_ID ) ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==27) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2510:4: otherlv_42= ',' ( (otherlv_43= RULE_ID ) )
                    	    {
                    	    otherlv_42=(Token)match(input,27,FOLLOW_27_in_ruleIntentionalElement6367); 

                    	        	newLeafNode(otherlv_42, grammarAccess.getIntentionalElementAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2514:1: ( (otherlv_43= RULE_ID ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2515:1: (otherlv_43= RULE_ID )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2515:1: (otherlv_43= RULE_ID )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2516:3: otherlv_43= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getIntentionalElementRule());
                    	    	        }
                    	            
                    	    otherlv_43=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIntentionalElement6387); 

                    	    		newLeafNode(otherlv_43, grammarAccess.getIntentionalElementAccess().getRefsIntentionalElementRefCrossReference_12_3_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);

                    otherlv_44=(Token)match(input,22,FOLLOW_22_in_ruleIntentionalElement6401); 

                        	newLeafNode(otherlv_44, grammarAccess.getIntentionalElementAccess().getSemicolonKeyword_12_4());
                        

                    }
                    break;

            }

            otherlv_45=(Token)match(input,14,FOLLOW_14_in_ruleIntentionalElement6415); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2543:1: entryRuleImpactModel returns [EObject current=null] : iv_ruleImpactModel= ruleImpactModel EOF ;
    public final EObject entryRuleImpactModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpactModel = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2544:2: (iv_ruleImpactModel= ruleImpactModel EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2545:2: iv_ruleImpactModel= ruleImpactModel EOF
            {
             newCompositeNode(grammarAccess.getImpactModelRule()); 
            pushFollow(FOLLOW_ruleImpactModel_in_entryRuleImpactModel6451);
            iv_ruleImpactModel=ruleImpactModel();

            state._fsp--;

             current =iv_ruleImpactModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpactModel6461); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2552:1: ruleImpactModel returns [EObject current=null] : (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleImpactModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2555:28: ( (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2556:1: (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2556:1: (otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2556:3: otherlv_0= 'impactModel' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleImpactModel6498); 

                	newLeafNode(otherlv_0, grammarAccess.getImpactModelAccess().getImpactModelKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2560:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2561:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2561:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2562:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleImpactModel6515); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleImpactModel6532); 

                	newLeafNode(otherlv_2, grammarAccess.getImpactModelAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleImpactModel6544); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2594:1: entryRuleStrategiesGroup returns [EObject current=null] : iv_ruleStrategiesGroup= ruleStrategiesGroup EOF ;
    public final EObject entryRuleStrategiesGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategiesGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2595:2: (iv_ruleStrategiesGroup= ruleStrategiesGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2596:2: iv_ruleStrategiesGroup= ruleStrategiesGroup EOF
            {
             newCompositeNode(grammarAccess.getStrategiesGroupRule()); 
            pushFollow(FOLLOW_ruleStrategiesGroup_in_entryRuleStrategiesGroup6580);
            iv_ruleStrategiesGroup=ruleStrategiesGroup();

            state._fsp--;

             current =iv_ruleStrategiesGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrategiesGroup6590); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2603:1: ruleStrategiesGroup returns [EObject current=null] : (otherlv_0= 'strategiesGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleStrategiesGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2606:28: ( (otherlv_0= 'strategiesGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2607:1: (otherlv_0= 'strategiesGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2607:1: (otherlv_0= 'strategiesGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2607:3: otherlv_0= 'strategiesGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleStrategiesGroup6627); 

                	newLeafNode(otherlv_0, grammarAccess.getStrategiesGroupAccess().getStrategiesGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2611:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2612:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2612:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2613:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStrategiesGroup6644); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStrategiesGroup6661); 

                	newLeafNode(otherlv_2, grammarAccess.getStrategiesGroupAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleStrategiesGroup6673); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2645:1: entryRuleContributionContext returns [EObject current=null] : iv_ruleContributionContext= ruleContributionContext EOF ;
    public final EObject entryRuleContributionContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionContext = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2646:2: (iv_ruleContributionContext= ruleContributionContext EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2647:2: iv_ruleContributionContext= ruleContributionContext EOF
            {
             newCompositeNode(grammarAccess.getContributionContextRule()); 
            pushFollow(FOLLOW_ruleContributionContext_in_entryRuleContributionContext6709);
            iv_ruleContributionContext=ruleContributionContext();

            state._fsp--;

             current =iv_ruleContributionContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionContext6719); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2654:1: ruleContributionContext returns [EObject current=null] : (otherlv_0= 'contributionContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleContributionContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2657:28: ( (otherlv_0= 'contributionContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2658:1: (otherlv_0= 'contributionContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2658:1: (otherlv_0= 'contributionContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2658:3: otherlv_0= 'contributionContext' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleContributionContext6756); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionContextAccess().getContributionContextKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2662:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2663:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2663:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2664:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionContext6773); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleContributionContext6790); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionContextAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleContributionContext6802); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2696:1: entryRuleContributionContextGroup returns [EObject current=null] : iv_ruleContributionContextGroup= ruleContributionContextGroup EOF ;
    public final EObject entryRuleContributionContextGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionContextGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2697:2: (iv_ruleContributionContextGroup= ruleContributionContextGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2698:2: iv_ruleContributionContextGroup= ruleContributionContextGroup EOF
            {
             newCompositeNode(grammarAccess.getContributionContextGroupRule()); 
            pushFollow(FOLLOW_ruleContributionContextGroup_in_entryRuleContributionContextGroup6838);
            iv_ruleContributionContextGroup=ruleContributionContextGroup();

            state._fsp--;

             current =iv_ruleContributionContextGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionContextGroup6848); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2705:1: ruleContributionContextGroup returns [EObject current=null] : (otherlv_0= 'contributionContextGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) ;
    public final EObject ruleContributionContextGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2708:28: ( (otherlv_0= 'contributionContextGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2709:1: (otherlv_0= 'contributionContextGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2709:1: (otherlv_0= 'contributionContextGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2709:3: otherlv_0= 'contributionContextGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleContributionContextGroup6885); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionContextGroupAccess().getContributionContextGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2713:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2714:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2714:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2715:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionContextGroup6902); 

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

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleContributionContextGroup6919); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionContextGroupAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleContributionContextGroup6931); 

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


    // $ANTLR start "entryRuleMetadata"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2749:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2750:2: (iv_ruleMetadata= ruleMetadata EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2751:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_ruleMetadata_in_entryRuleMetadata6969);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadata6979); 

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
    // $ANTLR end "entryRuleMetadata"


    // $ANTLR start "ruleMetadata"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2758:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'metaData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' )? otherlv_7= '}' ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2761:28: ( (otherlv_0= 'metaData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' )? otherlv_7= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2762:1: (otherlv_0= 'metaData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' )? otherlv_7= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2762:1: (otherlv_0= 'metaData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' )? otherlv_7= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2762:3: otherlv_0= 'metaData' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'value' otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleMetadata7016); 

                	newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getMetaDataKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2766:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2767:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2767:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2768:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetadata7033); 

            			newLeafNode(lv_name_1_0, grammarAccess.getMetadataAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleMetadata7050); 

                	newLeafNode(otherlv_2, grammarAccess.getMetadataAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2788:1: (otherlv_3= 'value' otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==50) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2788:3: otherlv_3= 'value' otherlv_4= '=' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';'
                    {
                    otherlv_3=(Token)match(input,50,FOLLOW_50_in_ruleMetadata7063); 

                        	newLeafNode(otherlv_3, grammarAccess.getMetadataAccess().getValueKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleMetadata7075); 

                        	newLeafNode(otherlv_4, grammarAccess.getMetadataAccess().getEqualsSignKeyword_3_1());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2796:1: ( (lv_value_5_0= RULE_STRING ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2797:1: (lv_value_5_0= RULE_STRING )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2797:1: (lv_value_5_0= RULE_STRING )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2798:3: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata7092); 

                    			newLeafNode(lv_value_5_0, grammarAccess.getMetadataAccess().getValueSTRINGTerminalRuleCall_3_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMetadataRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_5_0, 
                            		"STRING");
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleMetadata7109); 

                        	newLeafNode(otherlv_6, grammarAccess.getMetadataAccess().getSemicolonKeyword_3_3());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleMetadata7123); 

                	newLeafNode(otherlv_7, grammarAccess.getMetadataAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleMetadata"


    // $ANTLR start "ruleIntentionalElementType"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2830:1: ruleIntentionalElementType returns [Enumerator current=null] : ( (enumLiteral_0= 'softGoal' ) | (enumLiteral_1= 'goal' ) | (enumLiteral_2= 'Task' ) | (enumLiteral_3= 'resource' ) | (enumLiteral_4= 'indicator' ) ) ;
    public final Enumerator ruleIntentionalElementType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2832:28: ( ( (enumLiteral_0= 'softGoal' ) | (enumLiteral_1= 'goal' ) | (enumLiteral_2= 'Task' ) | (enumLiteral_3= 'resource' ) | (enumLiteral_4= 'indicator' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2833:1: ( (enumLiteral_0= 'softGoal' ) | (enumLiteral_1= 'goal' ) | (enumLiteral_2= 'Task' ) | (enumLiteral_3= 'resource' ) | (enumLiteral_4= 'indicator' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2833:1: ( (enumLiteral_0= 'softGoal' ) | (enumLiteral_1= 'goal' ) | (enumLiteral_2= 'Task' ) | (enumLiteral_3= 'resource' ) | (enumLiteral_4= 'indicator' ) )
            int alt34=5;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt34=1;
                }
                break;
            case 52:
                {
                alt34=2;
                }
                break;
            case 53:
                {
                alt34=3;
                }
                break;
            case 54:
                {
                alt34=4;
                }
                break;
            case 55:
                {
                alt34=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2833:2: (enumLiteral_0= 'softGoal' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2833:2: (enumLiteral_0= 'softGoal' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2833:4: enumLiteral_0= 'softGoal'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_51_in_ruleIntentionalElementType7173); 

                            current = grammarAccess.getIntentionalElementTypeAccess().getSoftgoalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getIntentionalElementTypeAccess().getSoftgoalEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2839:6: (enumLiteral_1= 'goal' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2839:6: (enumLiteral_1= 'goal' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2839:8: enumLiteral_1= 'goal'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_52_in_ruleIntentionalElementType7190); 

                            current = grammarAccess.getIntentionalElementTypeAccess().getGoalEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getIntentionalElementTypeAccess().getGoalEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2845:6: (enumLiteral_2= 'Task' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2845:6: (enumLiteral_2= 'Task' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2845:8: enumLiteral_2= 'Task'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_53_in_ruleIntentionalElementType7207); 

                            current = grammarAccess.getIntentionalElementTypeAccess().getTaskEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getIntentionalElementTypeAccess().getTaskEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2851:6: (enumLiteral_3= 'resource' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2851:6: (enumLiteral_3= 'resource' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2851:8: enumLiteral_3= 'resource'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_54_in_ruleIntentionalElementType7224); 

                            current = grammarAccess.getIntentionalElementTypeAccess().getRessourceEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getIntentionalElementTypeAccess().getRessourceEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2857:6: (enumLiteral_4= 'indicator' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2857:6: (enumLiteral_4= 'indicator' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2857:8: enumLiteral_4= 'indicator'
                    {
                    enumLiteral_4=(Token)match(input,55,FOLLOW_55_in_ruleIntentionalElementType7241); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2867:1: ruleImportanceType returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) ;
    public final Enumerator ruleImportanceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2869:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2870:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2870:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt35=1;
                }
                break;
            case 57:
                {
                alt35=2;
                }
                break;
            case 58:
                {
                alt35=3;
                }
                break;
            case 59:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2870:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2870:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2870:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleImportanceType7286); 

                            current = grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2876:6: (enumLiteral_1= 'high' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2876:6: (enumLiteral_1= 'high' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2876:8: enumLiteral_1= 'high'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleImportanceType7303); 

                            current = grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2882:6: (enumLiteral_2= 'medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2882:6: (enumLiteral_2= 'medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2882:8: enumLiteral_2= 'medium'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleImportanceType7320); 

                            current = grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2888:6: (enumLiteral_3= 'low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2888:6: (enumLiteral_3= 'low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2888:8: enumLiteral_3= 'low'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_59_in_ruleImportanceType7337); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2898:1: ruleDecompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) ;
    public final Enumerator ruleDecompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2900:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2901:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2901:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt36=1;
                }
                break;
            case 61:
                {
                alt36=2;
                }
                break;
            case 62:
                {
                alt36=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2901:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2901:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2901:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleDecompositionType7382); 

                            current = grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2907:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2907:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2907:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleDecompositionType7399); 

                            current = grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2913:6: (enumLiteral_2= 'xor' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2913:6: (enumLiteral_2= 'xor' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2913:8: enumLiteral_2= 'xor'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_ruleDecompositionType7416); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2923:1: ruleContributionType returns [Enumerator current=null] : ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2925:28: ( ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2926:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2926:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            int alt37=7;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt37=1;
                }
                break;
            case 64:
                {
                alt37=2;
                }
                break;
            case 65:
                {
                alt37=3;
                }
                break;
            case 66:
                {
                alt37=4;
                }
                break;
            case 67:
                {
                alt37=5;
                }
                break;
            case 68:
                {
                alt37=6;
                }
                break;
            case 69:
                {
                alt37=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2926:2: (enumLiteral_0= 'help' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2926:2: (enumLiteral_0= 'help' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2926:4: enumLiteral_0= 'help'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_63_in_ruleContributionType7461); 

                            current = grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2932:6: (enumLiteral_1= 'make' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2932:6: (enumLiteral_1= 'make' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2932:8: enumLiteral_1= 'make'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleContributionType7478); 

                            current = grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2938:6: (enumLiteral_2= 'somePositive' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2938:6: (enumLiteral_2= 'somePositive' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2938:8: enumLiteral_2= 'somePositive'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_65_in_ruleContributionType7495); 

                            current = grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2944:6: (enumLiteral_3= 'unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2944:6: (enumLiteral_3= 'unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2944:8: enumLiteral_3= 'unknown'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_66_in_ruleContributionType7512); 

                            current = grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2950:6: (enumLiteral_4= 'someNegative' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2950:6: (enumLiteral_4= 'someNegative' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2950:8: enumLiteral_4= 'someNegative'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_67_in_ruleContributionType7529); 

                            current = grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2956:6: (enumLiteral_5= 'hurt' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2956:6: (enumLiteral_5= 'hurt' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2956:8: enumLiteral_5= 'hurt'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_68_in_ruleContributionType7546); 

                            current = grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2962:6: (enumLiteral_6= 'break' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2962:6: (enumLiteral_6= 'break' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2962:8: enumLiteral_6= 'break'
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_69_in_ruleContributionType7563); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2974:1: ruleCriticality returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) ;
    public final Enumerator ruleCriticality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2976:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2977:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2977:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt38=1;
                }
                break;
            case 57:
                {
                alt38=2;
                }
                break;
            case 58:
                {
                alt38=3;
                }
                break;
            case 59:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2977:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2977:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2977:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleCriticality7610); 

                            current = grammarAccess.getCriticalityAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCriticalityAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2983:6: (enumLiteral_1= 'high' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2983:6: (enumLiteral_1= 'high' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2983:8: enumLiteral_1= 'high'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleCriticality7627); 

                            current = grammarAccess.getCriticalityAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCriticalityAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2989:6: (enumLiteral_2= 'medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2989:6: (enumLiteral_2= 'medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2989:8: enumLiteral_2= 'medium'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleCriticality7644); 

                            current = grammarAccess.getCriticalityAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCriticalityAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2995:6: (enumLiteral_3= 'low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2995:6: (enumLiteral_3= 'low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2995:8: enumLiteral_3= 'low'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_59_in_ruleCriticality7661); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3005:1: rulePriority returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) ;
    public final Enumerator rulePriority() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3007:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3008:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3008:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            int alt39=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt39=1;
                }
                break;
            case 57:
                {
                alt39=2;
                }
                break;
            case 58:
                {
                alt39=3;
                }
                break;
            case 59:
                {
                alt39=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3008:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3008:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3008:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_rulePriority7706); 

                            current = grammarAccess.getPriorityAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPriorityAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3014:6: (enumLiteral_1= 'high' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3014:6: (enumLiteral_1= 'high' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3014:8: enumLiteral_1= 'high'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_rulePriority7723); 

                            current = grammarAccess.getPriorityAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPriorityAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3020:6: (enumLiteral_2= 'medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3020:6: (enumLiteral_2= 'medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3020:8: enumLiteral_2= 'medium'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_rulePriority7740); 

                            current = grammarAccess.getPriorityAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPriorityAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3026:6: (enumLiteral_3= 'low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3026:6: (enumLiteral_3= 'low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3026:8: enumLiteral_3= 'low'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_59_in_rulePriority7757); 

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


    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA21_eotS =
        "\14\uffff";
    static final String DFA21_eofS =
        "\14\uffff";
    static final String DFA21_minS =
        "\1\16\13\uffff";
    static final String DFA21_maxS =
        "\1\50\13\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\13\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA21_specialS =
        "\1\0\13\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1\10\uffff\1\7\1\uffff\1\10\7\uffff\1\2\1\3\1\4\1\5\1\6"+
            "\1\11\1\12\1\13",
            "",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 1697:3: ( ({...}? => ( ({...}? => (otherlv_4= 'importance' otherlv_5= '=' ( (lv_importance_6_0= ruleImportanceType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importanceQuantitative' otherlv_9= '=' ( (lv_importanceQuantitative_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'lineColor' otherlv_13= '=' ( (lv_lineColor_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'fillColor' otherlv_17= '=' ( (lv_fillColor_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'filled' otherlv_21= '=' ( (lv_filled_22_0= RULE_BOOLEAN ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'id' otherlv_25= '=' ( (lv_id_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'description' otherlv_29= '=' ( (lv_description_30_0= RULE_STRING ) ) otherlv_31= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_32= 'includedActors' otherlv_33= '=' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ',' ( (otherlv_36= RULE_ID ) ) )* otherlv_37= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_38= 'collapsedRefs' otherlv_39= '=' ( (otherlv_40= RULE_ID ) ) (otherlv_41= ',' ( (otherlv_42= RULE_ID ) ) )* otherlv_43= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_44= 'contRefs' otherlv_45= '=' ( (otherlv_46= RULE_ID ) ) (otherlv_47= ',' ( (otherlv_48= RULE_ID ) ) )* otherlv_49= ';' ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_0 = input.LA(1);

                         
                        int index21_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA21_0==14) ) {s = 1;}

                        else if ( LA21_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA21_0 ==34 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA21_0 ==35 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA21_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA21_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA21_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA21_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA21_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA21_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                        else if ( LA21_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 9) ) {s = 11;}

                         
                        input.seek(index21_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleURNspec_in_entryRuleURNspec75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURNspec85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleURNspec122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleURNspec139 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleURNspec156 = new BitSet(new long[]{0x00020000000F8000L});
    public static final BitSet FOLLOW_ruleURNdefinition_in_ruleURNspec222 = new BitSet(new long[]{0x00020000000FC000L});
    public static final BitSet FOLLOW_ruleGRLspec_in_ruleURNspec297 = new BitSet(new long[]{0x00020000000FC000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleURNspec372 = new BitSet(new long[]{0x00020000000FC000L});
    public static final BitSet FOLLOW_ruleUCMspec_in_ruleURNspec448 = new BitSet(new long[]{0x00020000000FC000L});
    public static final BitSet FOLLOW_ruleURNlink_in_ruleURNspec523 = new BitSet(new long[]{0x00020000000FC000L});
    public static final BitSet FOLLOW_ruleASDspec_in_ruleURNspec599 = new BitSet(new long[]{0x00020000000FC000L});
    public static final BitSet FOLLOW_14_in_ruleURNspec657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURNdefinition_in_entryRuleURNdefinition693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURNdefinition703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleURNdefinition740 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleURNdefinition752 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleURNdefinition773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleASDspec_in_entryRuleASDspec809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleASDspec819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleASDspec856 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleASDspec868 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleASDspec889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleURNlink_in_entryRuleURNlink925 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleURNlink935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleURNlink972 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleURNlink984 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleURNlink996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUCMspec_in_entryRuleUCMspec1032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUCMspec1042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleUCMspec1079 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleUCMspec1091 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleUCMspec1103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRLspec_in_entryRuleGRLspec1139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRLspec1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleGRLspec1186 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleGRLspec1198 = new BitSet(new long[]{0x0001E20190104000L});
    public static final BitSet FOLLOW_ruleElementLink_in_ruleGRLspec1264 = new BitSet(new long[]{0x0001E20190104000L});
    public static final BitSet FOLLOW_ruleActor_in_ruleGRLspec1340 = new BitSet(new long[]{0x0001E20190104000L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleGRLspec1416 = new BitSet(new long[]{0x0001E20190104000L});
    public static final BitSet FOLLOW_ruleImpactModel_in_ruleGRLspec1492 = new BitSet(new long[]{0x0001E20190104000L});
    public static final BitSet FOLLOW_ruleStrategiesGroup_in_ruleGRLspec1567 = new BitSet(new long[]{0x0001E20190104000L});
    public static final BitSet FOLLOW_ruleContributionContext_in_ruleGRLspec1643 = new BitSet(new long[]{0x0001E20190104000L});
    public static final BitSet FOLLOW_ruleContributionContextGroup_in_ruleGRLspec1719 = new BitSet(new long[]{0x0001E20190104000L});
    public static final BitSet FOLLOW_14_in_ruleGRLspec1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLink_in_entryRuleElementLink1808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLink1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_ruleElementLink1865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_ruleElementLink1892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleElementLink1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition1954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleDecomposition2001 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposition2018 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDecomposition2035 = new BitSet(new long[]{0x0000000006800010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposition2101 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDecomposition2113 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposition2133 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDecomposition2145 = new BitSet(new long[]{0x0000000006804010L});
    public static final BitSet FOLLOW_23_in_ruleDecomposition2213 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDecomposition2225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecomposition2242 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDecomposition2259 = new BitSet(new long[]{0x0000000006804010L});
    public static final BitSet FOLLOW_25_in_ruleDecomposition2327 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDecomposition2339 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecomposition2356 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDecomposition2373 = new BitSet(new long[]{0x0000000006804010L});
    public static final BitSet FOLLOW_26_in_ruleDecomposition2441 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDecomposition2453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposition2473 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_ruleDecomposition2486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecomposition2506 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_22_in_ruleDecomposition2520 = new BitSet(new long[]{0x0000000006804010L});
    public static final BitSet FOLLOW_14_in_ruleDecomposition2579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution2615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContribution2625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleContribution2662 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContribution2679 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContribution2696 = new BitSet(new long[]{0x0000000076800010L});
    public static final BitSet FOLLOW_28_in_ruleContribution2754 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleContribution2766 = new BitSet(new long[]{0x8000000000000000L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContribution2787 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContribution2799 = new BitSet(new long[]{0x0000000076804010L});
    public static final BitSet FOLLOW_29_in_ruleContribution2867 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleContribution2879 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContribution2896 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContribution2913 = new BitSet(new long[]{0x0000000076804010L});
    public static final BitSet FOLLOW_30_in_ruleContribution2981 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleContribution2993 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleContribution3010 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContribution3027 = new BitSet(new long[]{0x0000000076804010L});
    public static final BitSet FOLLOW_23_in_ruleContribution3095 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleContribution3107 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContribution3124 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContribution3141 = new BitSet(new long[]{0x0000000076804010L});
    public static final BitSet FOLLOW_25_in_ruleContribution3209 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleContribution3221 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContribution3238 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContribution3255 = new BitSet(new long[]{0x0000000076804010L});
    public static final BitSet FOLLOW_26_in_ruleContribution3323 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleContribution3335 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContribution3355 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_ruleContribution3368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContribution3388 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_22_in_ruleContribution3402 = new BitSet(new long[]{0x0000000076804010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContribution3478 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleContribution3490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContribution3510 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleContribution3522 = new BitSet(new long[]{0x0000000076804010L});
    public static final BitSet FOLLOW_14_in_ruleContribution3581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency3617 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency3627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDependency3664 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency3681 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDependency3698 = new BitSet(new long[]{0x0000000006800010L});
    public static final BitSet FOLLOW_23_in_ruleDependency3756 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDependency3768 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependency3785 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDependency3802 = new BitSet(new long[]{0x0000000006804010L});
    public static final BitSet FOLLOW_25_in_ruleDependency3870 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDependency3882 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependency3899 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDependency3916 = new BitSet(new long[]{0x0000000006804010L});
    public static final BitSet FOLLOW_26_in_ruleDependency3984 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDependency3996 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency4016 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_ruleDependency4029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency4049 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_22_in_ruleDependency4063 = new BitSet(new long[]{0x0000000006804010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency4139 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleDependency4151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependency4171 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleDependency4183 = new BitSet(new long[]{0x0000000006804010L});
    public static final BitSet FOLLOW_14_in_ruleDependency4242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor4278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleActor4325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor4342 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleActor4359 = new BitSet(new long[]{0x000001FE02804000L});
    public static final BitSet FOLLOW_33_in_ruleActor4417 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActor4429 = new BitSet(new long[]{0x0F00000000000000L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleActor4450 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor4462 = new BitSet(new long[]{0x000001FE02804000L});
    public static final BitSet FOLLOW_34_in_ruleActor4530 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActor4542 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActor4559 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor4576 = new BitSet(new long[]{0x000001FE02804000L});
    public static final BitSet FOLLOW_35_in_ruleActor4644 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActor4656 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor4673 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor4690 = new BitSet(new long[]{0x000001FE02804000L});
    public static final BitSet FOLLOW_36_in_ruleActor4758 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActor4770 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor4787 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor4804 = new BitSet(new long[]{0x000001FE02804000L});
    public static final BitSet FOLLOW_37_in_ruleActor4872 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActor4884 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleActor4901 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor4918 = new BitSet(new long[]{0x000001FE02804000L});
    public static final BitSet FOLLOW_23_in_ruleActor4986 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActor4998 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor5015 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor5032 = new BitSet(new long[]{0x000001FE02804000L});
    public static final BitSet FOLLOW_25_in_ruleActor5100 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActor5112 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor5129 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleActor5146 = new BitSet(new long[]{0x000001FE02804000L});
    public static final BitSet FOLLOW_38_in_ruleActor5214 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActor5226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor5246 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_ruleActor5259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor5279 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_22_in_ruleActor5293 = new BitSet(new long[]{0x000001FE02804000L});
    public static final BitSet FOLLOW_39_in_ruleActor5361 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActor5373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor5393 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_ruleActor5406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor5426 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_22_in_ruleActor5440 = new BitSet(new long[]{0x000001FE02804000L});
    public static final BitSet FOLLOW_40_in_ruleActor5508 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleActor5520 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor5540 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_ruleActor5553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor5573 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_22_in_ruleActor5587 = new BitSet(new long[]{0x000001FE02804000L});
    public static final BitSet FOLLOW_14_in_ruleActor5640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement5682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntentionalElement5692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleIntentionalElement5729 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntentionalElement5746 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleIntentionalElement5763 = new BitSet(new long[]{0x00001C3E02804000L});
    public static final BitSet FOLLOW_42_in_ruleIntentionalElement5776 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIntentionalElement5788 = new BitSet(new long[]{0x00F8000000000000L});
    public static final BitSet FOLLOW_ruleIntentionalElementType_in_ruleIntentionalElement5809 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement5821 = new BitSet(new long[]{0x0000183E02804000L});
    public static final BitSet FOLLOW_43_in_ruleIntentionalElement5836 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIntentionalElement5848 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleIntentionalElement5869 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement5881 = new BitSet(new long[]{0x0000103E02804000L});
    public static final BitSet FOLLOW_33_in_ruleIntentionalElement5896 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIntentionalElement5908 = new BitSet(new long[]{0x0F00000000000000L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleIntentionalElement5929 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement5941 = new BitSet(new long[]{0x0000103C02804000L});
    public static final BitSet FOLLOW_34_in_ruleIntentionalElement5956 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIntentionalElement5968 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIntentionalElement5985 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement6002 = new BitSet(new long[]{0x0000103802804000L});
    public static final BitSet FOLLOW_35_in_ruleIntentionalElement6017 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIntentionalElement6029 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntentionalElement6046 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement6063 = new BitSet(new long[]{0x0000103002804000L});
    public static final BitSet FOLLOW_36_in_ruleIntentionalElement6078 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIntentionalElement6090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntentionalElement6107 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement6124 = new BitSet(new long[]{0x0000102002804000L});
    public static final BitSet FOLLOW_37_in_ruleIntentionalElement6139 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIntentionalElement6151 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleIntentionalElement6168 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement6185 = new BitSet(new long[]{0x0000100002804000L});
    public static final BitSet FOLLOW_23_in_ruleIntentionalElement6200 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIntentionalElement6212 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntentionalElement6229 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement6246 = new BitSet(new long[]{0x0000100002004000L});
    public static final BitSet FOLLOW_25_in_ruleIntentionalElement6261 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIntentionalElement6273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIntentionalElement6290 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement6307 = new BitSet(new long[]{0x0000100000004000L});
    public static final BitSet FOLLOW_44_in_ruleIntentionalElement6322 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIntentionalElement6334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntentionalElement6354 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_27_in_ruleIntentionalElement6367 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIntentionalElement6387 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_22_in_ruleIntentionalElement6401 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIntentionalElement6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpactModel_in_entryRuleImpactModel6451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpactModel6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleImpactModel6498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleImpactModel6515 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleImpactModel6532 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleImpactModel6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategiesGroup_in_entryRuleStrategiesGroup6580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrategiesGroup6590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleStrategiesGroup6627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStrategiesGroup6644 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStrategiesGroup6661 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStrategiesGroup6673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionContext_in_entryRuleContributionContext6709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionContext6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleContributionContext6756 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionContext6773 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContributionContext6790 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionContext6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionContextGroup_in_entryRuleContributionContextGroup6838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionContextGroup6848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleContributionContextGroup6885 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionContextGroup6902 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleContributionContextGroup6919 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionContextGroup6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_entryRuleMetadata6969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadata6979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleMetadata7016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetadata7033 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleMetadata7050 = new BitSet(new long[]{0x0004000000004000L});
    public static final BitSet FOLLOW_50_in_ruleMetadata7063 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMetadata7075 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata7092 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMetadata7109 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleMetadata7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleIntentionalElementType7173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleIntentionalElementType7190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleIntentionalElementType7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleIntentionalElementType7224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleIntentionalElementType7241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleImportanceType7286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleImportanceType7303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleImportanceType7320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleImportanceType7337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDecompositionType7382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDecompositionType7399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDecompositionType7416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleContributionType7461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleContributionType7478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleContributionType7495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleContributionType7512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleContributionType7529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleContributionType7546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleContributionType7563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleCriticality7610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleCriticality7627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleCriticality7644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCriticality7661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_rulePriority7706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_rulePriority7723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_rulePriority7740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_rulePriority7757 = new BitSet(new long[]{0x0000000000000002L});

}
