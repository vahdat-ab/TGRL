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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grl'", "'{'", "'}'", "'actor'", "';'", "'name'", "'='", "'description'", "'color'", "'softGoal'", "'decompositionType'", "'goal'", "'Task'", "'resource'", "'indicator'", "'belief'", "'decomposedBy'", "','", "'contributeTo'", "'dependOn'", "'strategyGroup'", "'includes'", "'strategy'", "'extends'", "'exceeds'", "'start'", "'end'", "'step'", "'target'", "'threshold'", "'worst'", "'eval'", "'unit'", "'qualeval'", "'qualitativeMapping'", "'contributionGroup'", "'contribution'", "':'", "'metadata'", "'comment'", "'link'", "'indicatorGroup'", "'.'", "'none'", "'high'", "'medium'", "'low'", "'and'", "'or'", "'xor'", "'help'", "'make'", "'somePositive'", "'unknown'", "'someNegative'", "'hurt'", "'break'", "'denied'", "'weaklyDenied'", "'weaklySatisfied'", "'satisfied'", "'conflict'", "'white'", "'black'", "'blue'", "'green'", "'cyan'", "'red'", "'purple'", "'yellow'", "'gray'", "'lightGray'", "'lightBlue'", "'lightGreen'", "'lightCray'", "'lightRed'", "'lightPurple'", "'lightYellow'"
    };
    public static final int T__50=50;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
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
    public static final int RULE_ML_COMMENT=9;
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
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=7;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

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
        	return "Model";	
       	}
       	
       	@Override
       	protected TGRLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:68:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:69:2: (iv_ruleModel= ruleModel EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:70:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:77:1: ruleModel returns [EObject current=null] : ( (lv_gRLspecifications_0_0= ruleGRLSpecification ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_gRLspecifications_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:80:28: ( ( (lv_gRLspecifications_0_0= ruleGRLSpecification ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:81:1: ( (lv_gRLspecifications_0_0= ruleGRLSpecification ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:81:1: ( (lv_gRLspecifications_0_0= ruleGRLSpecification ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:82:1: (lv_gRLspecifications_0_0= ruleGRLSpecification )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:82:1: (lv_gRLspecifications_0_0= ruleGRLSpecification )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:83:3: lv_gRLspecifications_0_0= ruleGRLSpecification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGRLspecificationsGRLSpecificationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGRLSpecification_in_ruleModel130);
            	    lv_gRLspecifications_0_0=ruleGRLSpecification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"gRLspecifications",
            	            		lv_gRLspecifications_0_0, 
            	            		"GRLSpecification");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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


    // $ANTLR start "entryRuleGRLBaseElement"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:109:1: entryRuleGRLBaseElement returns [EObject current=null] : iv_ruleGRLBaseElement= ruleGRLBaseElement EOF ;
    public final EObject entryRuleGRLBaseElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRLBaseElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:110:2: (iv_ruleGRLBaseElement= ruleGRLBaseElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:111:2: iv_ruleGRLBaseElement= ruleGRLBaseElement EOF
            {
             newCompositeNode(grammarAccess.getGRLBaseElementRule()); 
            pushFollow(FOLLOW_ruleGRLBaseElement_in_entryRuleGRLBaseElement168);
            iv_ruleGRLBaseElement=ruleGRLBaseElement();

            state._fsp--;

             current =iv_ruleGRLBaseElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRLBaseElement178); 

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
    // $ANTLR end "entryRuleGRLBaseElement"


    // $ANTLR start "ruleGRLBaseElement"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:118:1: ruleGRLBaseElement returns [EObject current=null] : (this_GRLElement_0= ruleGRLElement | this_InLineElementLink_1= ruleInLineElementLink | this_Mapping_2= ruleMapping ) ;
    public final EObject ruleGRLBaseElement() throws RecognitionException {
        EObject current = null;

        EObject this_GRLElement_0 = null;

        EObject this_InLineElementLink_1 = null;

        EObject this_Mapping_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:121:28: ( (this_GRLElement_0= ruleGRLElement | this_InLineElementLink_1= ruleInLineElementLink | this_Mapping_2= ruleMapping ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:122:1: (this_GRLElement_0= ruleGRLElement | this_InLineElementLink_1= ruleInLineElementLink | this_Mapping_2= ruleMapping )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:122:1: (this_GRLElement_0= ruleGRLElement | this_InLineElementLink_1= ruleInLineElementLink | this_Mapping_2= ruleMapping )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:123:5: this_GRLElement_0= ruleGRLElement
                    {
                     
                            newCompositeNode(grammarAccess.getGRLBaseElementAccess().getGRLElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleGRLElement_in_ruleGRLBaseElement225);
                    this_GRLElement_0=ruleGRLElement();

                    state._fsp--;

                     
                            current = this_GRLElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:133:5: this_InLineElementLink_1= ruleInLineElementLink
                    {
                     
                            newCompositeNode(grammarAccess.getGRLBaseElementAccess().getInLineElementLinkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleGRLBaseElement252);
                    this_InLineElementLink_1=ruleInLineElementLink();

                    state._fsp--;

                     
                            current = this_InLineElementLink_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:143:5: this_Mapping_2= ruleMapping
                    {
                     
                            newCompositeNode(grammarAccess.getGRLBaseElementAccess().getMappingParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleMapping_in_ruleGRLBaseElement279);
                    this_Mapping_2=ruleMapping();

                    state._fsp--;

                     
                            current = this_Mapping_2; 
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
    // $ANTLR end "ruleGRLBaseElement"


    // $ANTLR start "entryRuleGRLElement"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:159:1: entryRuleGRLElement returns [EObject current=null] : iv_ruleGRLElement= ruleGRLElement EOF ;
    public final EObject entryRuleGRLElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRLElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:160:2: (iv_ruleGRLElement= ruleGRLElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:161:2: iv_ruleGRLElement= ruleGRLElement EOF
            {
             newCompositeNode(grammarAccess.getGRLElementRule()); 
            pushFollow(FOLLOW_ruleGRLElement_in_entryRuleGRLElement314);
            iv_ruleGRLElement=ruleGRLElement();

            state._fsp--;

             current =iv_ruleGRLElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRLElement324); 

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
    // $ANTLR end "entryRuleGRLElement"


    // $ANTLR start "ruleGRLElement"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:168:1: ruleGRLElement returns [EObject current=null] : (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_IndicatorGroup_4= ruleIndicatorGroup | this_EvaluationStrategy_5= ruleEvaluationStrategy | this_Evaluation_6= ruleEvaluation | this_ContributionGroup_7= ruleContributionGroup | this_ContributionContext_8= ruleContributionContext | this_QualitativeMapping_9= ruleQualitativeMapping | this_Metadata_10= ruleMetadata | this_Comment_11= ruleComment | this_LinkType_12= ruleLinkType ) ;
    public final EObject ruleGRLElement() throws RecognitionException {
        EObject current = null;

        EObject this_IntentionalElement_0 = null;

        EObject this_ElementLink_1 = null;

        EObject this_Actor_2 = null;

        EObject this_StrategyGroup_3 = null;

        EObject this_IndicatorGroup_4 = null;

        EObject this_EvaluationStrategy_5 = null;

        EObject this_Evaluation_6 = null;

        EObject this_ContributionGroup_7 = null;

        EObject this_ContributionContext_8 = null;

        EObject this_QualitativeMapping_9 = null;

        EObject this_Metadata_10 = null;

        EObject this_Comment_11 = null;

        EObject this_LinkType_12 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:171:28: ( (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_IndicatorGroup_4= ruleIndicatorGroup | this_EvaluationStrategy_5= ruleEvaluationStrategy | this_Evaluation_6= ruleEvaluation | this_ContributionGroup_7= ruleContributionGroup | this_ContributionContext_8= ruleContributionContext | this_QualitativeMapping_9= ruleQualitativeMapping | this_Metadata_10= ruleMetadata | this_Comment_11= ruleComment | this_LinkType_12= ruleLinkType ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:172:1: (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_IndicatorGroup_4= ruleIndicatorGroup | this_EvaluationStrategy_5= ruleEvaluationStrategy | this_Evaluation_6= ruleEvaluation | this_ContributionGroup_7= ruleContributionGroup | this_ContributionContext_8= ruleContributionContext | this_QualitativeMapping_9= ruleQualitativeMapping | this_Metadata_10= ruleMetadata | this_Comment_11= ruleComment | this_LinkType_12= ruleLinkType )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:172:1: (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_IndicatorGroup_4= ruleIndicatorGroup | this_EvaluationStrategy_5= ruleEvaluationStrategy | this_Evaluation_6= ruleEvaluation | this_ContributionGroup_7= ruleContributionGroup | this_ContributionContext_8= ruleContributionContext | this_QualitativeMapping_9= ruleQualitativeMapping | this_Metadata_10= ruleMetadata | this_Comment_11= ruleComment | this_LinkType_12= ruleLinkType )
            int alt3=13;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:173:5: this_IntentionalElement_0= ruleIntentionalElement
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getIntentionalElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntentionalElement_in_ruleGRLElement371);
                    this_IntentionalElement_0=ruleIntentionalElement();

                    state._fsp--;

                     
                            current = this_IntentionalElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:183:5: this_ElementLink_1= ruleElementLink
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getElementLinkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElementLink_in_ruleGRLElement398);
                    this_ElementLink_1=ruleElementLink();

                    state._fsp--;

                     
                            current = this_ElementLink_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:193:5: this_Actor_2= ruleActor
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getActorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleGRLElement425);
                    this_Actor_2=ruleActor();

                    state._fsp--;

                     
                            current = this_Actor_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:203:5: this_StrategyGroup_3= ruleStrategyGroup
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getStrategyGroupParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleStrategyGroup_in_ruleGRLElement452);
                    this_StrategyGroup_3=ruleStrategyGroup();

                    state._fsp--;

                     
                            current = this_StrategyGroup_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:213:5: this_IndicatorGroup_4= ruleIndicatorGroup
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getIndicatorGroupParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIndicatorGroup_in_ruleGRLElement479);
                    this_IndicatorGroup_4=ruleIndicatorGroup();

                    state._fsp--;

                     
                            current = this_IndicatorGroup_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:223:5: this_EvaluationStrategy_5= ruleEvaluationStrategy
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getEvaluationStrategyParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEvaluationStrategy_in_ruleGRLElement506);
                    this_EvaluationStrategy_5=ruleEvaluationStrategy();

                    state._fsp--;

                     
                            current = this_EvaluationStrategy_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:233:5: this_Evaluation_6= ruleEvaluation
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getEvaluationParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleEvaluation_in_ruleGRLElement533);
                    this_Evaluation_6=ruleEvaluation();

                    state._fsp--;

                     
                            current = this_Evaluation_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:243:5: this_ContributionGroup_7= ruleContributionGroup
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getContributionGroupParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleContributionGroup_in_ruleGRLElement560);
                    this_ContributionGroup_7=ruleContributionGroup();

                    state._fsp--;

                     
                            current = this_ContributionGroup_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:253:5: this_ContributionContext_8= ruleContributionContext
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getContributionContextParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleContributionContext_in_ruleGRLElement587);
                    this_ContributionContext_8=ruleContributionContext();

                    state._fsp--;

                     
                            current = this_ContributionContext_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:263:5: this_QualitativeMapping_9= ruleQualitativeMapping
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getQualitativeMappingParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleQualitativeMapping_in_ruleGRLElement614);
                    this_QualitativeMapping_9=ruleQualitativeMapping();

                    state._fsp--;

                     
                            current = this_QualitativeMapping_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:273:5: this_Metadata_10= ruleMetadata
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getMetadataParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleMetadata_in_ruleGRLElement641);
                    this_Metadata_10=ruleMetadata();

                    state._fsp--;

                     
                            current = this_Metadata_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:283:5: this_Comment_11= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getCommentParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleGRLElement668);
                    this_Comment_11=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:293:5: this_LinkType_12= ruleLinkType
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getLinkTypeParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleLinkType_in_ruleGRLElement695);
                    this_LinkType_12=ruleLinkType();

                    state._fsp--;

                     
                            current = this_LinkType_12; 
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
    // $ANTLR end "ruleGRLElement"


    // $ANTLR start "entryRuleIntentionalElement"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:309:1: entryRuleIntentionalElement returns [EObject current=null] : iv_ruleIntentionalElement= ruleIntentionalElement EOF ;
    public final EObject entryRuleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentionalElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:310:2: (iv_ruleIntentionalElement= ruleIntentionalElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:311:2: iv_ruleIntentionalElement= ruleIntentionalElement EOF
            {
             newCompositeNode(grammarAccess.getIntentionalElementRule()); 
            pushFollow(FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement730);
            iv_ruleIntentionalElement=ruleIntentionalElement();

            state._fsp--;

             current =iv_ruleIntentionalElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntentionalElement740); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:318:1: ruleIntentionalElement returns [EObject current=null] : (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief ) ;
    public final EObject ruleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Softgoal_0 = null;

        EObject this_Goal_1 = null;

        EObject this_Task_2 = null;

        EObject this_Resource_3 = null;

        EObject this_Indicator_4 = null;

        EObject this_Belief_5 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:321:28: ( (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:322:1: (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:322:1: (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief )
            int alt4=6;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 25:
                {
                alt4=3;
                }
                break;
            case 26:
                {
                alt4=4;
                }
                break;
            case 27:
                {
                alt4=5;
                }
                break;
            case 28:
                {
                alt4=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:323:5: this_Softgoal_0= ruleSoftgoal
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getSoftgoalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSoftgoal_in_ruleIntentionalElement787);
                    this_Softgoal_0=ruleSoftgoal();

                    state._fsp--;

                     
                            current = this_Softgoal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:333:5: this_Goal_1= ruleGoal
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getGoalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGoal_in_ruleIntentionalElement814);
                    this_Goal_1=ruleGoal();

                    state._fsp--;

                     
                            current = this_Goal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:343:5: this_Task_2= ruleTask
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getTaskParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTask_in_ruleIntentionalElement841);
                    this_Task_2=ruleTask();

                    state._fsp--;

                     
                            current = this_Task_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:353:5: this_Resource_3= ruleResource
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getResourceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleIntentionalElement868);
                    this_Resource_3=ruleResource();

                    state._fsp--;

                     
                            current = this_Resource_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:363:5: this_Indicator_4= ruleIndicator
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getIndicatorParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIndicator_in_ruleIntentionalElement895);
                    this_Indicator_4=ruleIndicator();

                    state._fsp--;

                     
                            current = this_Indicator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:373:5: this_Belief_5= ruleBelief
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getBeliefParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleBelief_in_ruleIntentionalElement922);
                    this_Belief_5=ruleBelief();

                    state._fsp--;

                     
                            current = this_Belief_5; 
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
    // $ANTLR end "ruleIntentionalElement"


    // $ANTLR start "entryRuleElementLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:389:1: entryRuleElementLink returns [EObject current=null] : iv_ruleElementLink= ruleElementLink EOF ;
    public final EObject entryRuleElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:390:2: (iv_ruleElementLink= ruleElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:391:2: iv_ruleElementLink= ruleElementLink EOF
            {
             newCompositeNode(grammarAccess.getElementLinkRule()); 
            pushFollow(FOLLOW_ruleElementLink_in_entryRuleElementLink957);
            iv_ruleElementLink=ruleElementLink();

            state._fsp--;

             current =iv_ruleElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLink967); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:398:1: ruleElementLink returns [EObject current=null] : (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency | this_Link_3= ruleLink ) ;
    public final EObject ruleElementLink() throws RecognitionException {
        EObject current = null;

        EObject this_Decomposition_0 = null;

        EObject this_Contribution_1 = null;

        EObject this_Dependency_2 = null;

        EObject this_Link_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:401:28: ( (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency | this_Link_3= ruleLink ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:402:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency | this_Link_3= ruleLink )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:402:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency | this_Link_3= ruleLink )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:403:5: this_Decomposition_0= ruleDecomposition
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDecompositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecomposition_in_ruleElementLink1014);
                    this_Decomposition_0=ruleDecomposition();

                    state._fsp--;

                     
                            current = this_Decomposition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:413:5: this_Contribution_1= ruleContribution
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getContributionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContribution_in_ruleElementLink1041);
                    this_Contribution_1=ruleContribution();

                    state._fsp--;

                     
                            current = this_Contribution_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:423:5: this_Dependency_2= ruleDependency
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDependencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDependency_in_ruleElementLink1068);
                    this_Dependency_2=ruleDependency();

                    state._fsp--;

                     
                            current = this_Dependency_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:433:5: this_Link_3= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getLinkParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleElementLink1095);
                    this_Link_3=ruleLink();

                    state._fsp--;

                     
                            current = this_Link_3; 
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


    // $ANTLR start "entryRuleInLineElementLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:449:1: entryRuleInLineElementLink returns [EObject current=null] : iv_ruleInLineElementLink= ruleInLineElementLink EOF ;
    public final EObject entryRuleInLineElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:450:2: (iv_ruleInLineElementLink= ruleInLineElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:451:2: iv_ruleInLineElementLink= ruleInLineElementLink EOF
            {
             newCompositeNode(grammarAccess.getInLineElementLinkRule()); 
            pushFollow(FOLLOW_ruleInLineElementLink_in_entryRuleInLineElementLink1130);
            iv_ruleInLineElementLink=ruleInLineElementLink();

            state._fsp--;

             current =iv_ruleInLineElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineElementLink1140); 

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
    // $ANTLR end "entryRuleInLineElementLink"


    // $ANTLR start "ruleInLineElementLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:458:1: ruleInLineElementLink returns [EObject current=null] : (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency | this_inLineLink_3= ruleinLineLink ) ;
    public final EObject ruleInLineElementLink() throws RecognitionException {
        EObject current = null;

        EObject this_InLineDecomposition_0 = null;

        EObject this_InLineContribution_1 = null;

        EObject this_InLineDependency_2 = null;

        EObject this_inLineLink_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:461:28: ( (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency | this_inLineLink_3= ruleinLineLink ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:462:1: (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency | this_inLineLink_3= ruleinLineLink )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:462:1: (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency | this_inLineLink_3= ruleinLineLink )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt6=1;
                }
                break;
            case 31:
                {
                alt6=2;
                }
                break;
            case 32:
                {
                alt6=3;
                }
                break;
            case RULE_ID:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:463:5: this_InLineDecomposition_0= ruleInLineDecomposition
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineDecompositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInLineDecomposition_in_ruleInLineElementLink1187);
                    this_InLineDecomposition_0=ruleInLineDecomposition();

                    state._fsp--;

                     
                            current = this_InLineDecomposition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:473:5: this_InLineContribution_1= ruleInLineContribution
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineContributionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInLineContribution_in_ruleInLineElementLink1214);
                    this_InLineContribution_1=ruleInLineContribution();

                    state._fsp--;

                     
                            current = this_InLineContribution_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:483:5: this_InLineDependency_2= ruleInLineDependency
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineDependencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInLineDependency_in_ruleInLineElementLink1241);
                    this_InLineDependency_2=ruleInLineDependency();

                    state._fsp--;

                     
                            current = this_InLineDependency_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:493:5: this_inLineLink_3= ruleinLineLink
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineLinkParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleinLineLink_in_ruleInLineElementLink1268);
                    this_inLineLink_3=ruleinLineLink();

                    state._fsp--;

                     
                            current = this_inLineLink_3; 
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
    // $ANTLR end "ruleInLineElementLink"


    // $ANTLR start "entryRuleGRLSpecification"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:509:1: entryRuleGRLSpecification returns [EObject current=null] : iv_ruleGRLSpecification= ruleGRLSpecification EOF ;
    public final EObject entryRuleGRLSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRLSpecification = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:510:2: (iv_ruleGRLSpecification= ruleGRLSpecification EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:511:2: iv_ruleGRLSpecification= ruleGRLSpecification EOF
            {
             newCompositeNode(grammarAccess.getGRLSpecificationRule()); 
            pushFollow(FOLLOW_ruleGRLSpecification_in_entryRuleGRLSpecification1303);
            iv_ruleGRLSpecification=ruleGRLSpecification();

            state._fsp--;

             current =iv_ruleGRLSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRLSpecification1313); 

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
    // $ANTLR end "entryRuleGRLSpecification"


    // $ANTLR start "ruleGRLSpecification"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:518:1: ruleGRLSpecification returns [EObject current=null] : (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleGRLSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_grlElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:521:28: ( (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:522:1: (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:522:1: (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:522:3: otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGRLSpecification1350); 

                	newLeafNode(otherlv_0, grammarAccess.getGRLSpecificationAccess().getGrlKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:526:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:527:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:527:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:528:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGRLSpecification1367); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getGRLSpecificationAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGRLSpecificationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGRLSpecification1385); 

                	newLeafNode(otherlv_2, grammarAccess.getGRLSpecificationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:548:1: ( (lv_grlElements_3_0= ruleGRLElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==16||LA8_0==22||(LA8_0>=24 && LA8_0<=28)||LA8_0==33||LA8_0==35||(LA8_0>=47 && LA8_0<=49)||(LA8_0>=51 && LA8_0<=54)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:549:1: (lv_grlElements_3_0= ruleGRLElement )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:549:1: (lv_grlElements_3_0= ruleGRLElement )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:550:3: lv_grlElements_3_0= ruleGRLElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLSpecificationAccess().getGrlElementsGRLElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGRLElement_in_ruleGRLSpecification1406);
            	    lv_grlElements_3_0=ruleGRLElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGRLSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"grlElements",
            	            		lv_grlElements_3_0, 
            	            		"GRLElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleGRLSpecification1419); 

                	newLeafNode(otherlv_4, grammarAccess.getGRLSpecificationAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleGRLSpecification"


    // $ANTLR start "entryRuleActor"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:578:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:579:2: (iv_ruleActor= ruleActor EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:580:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor1455);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor1465); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:587:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_23= '}' ) ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token lv_importanceQuantitative_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_description_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_23=null;
        Enumerator lv_importance_9_0 = null;

        Enumerator lv_fillColor_18_0 = null;

        EObject lv_metaData_20_0 = null;

        EObject lv_elemets_21_0 = null;

        EObject lv_elemets_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:590:28: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_23= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:591:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_23= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:591:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_23= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:591:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_23= '}' ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleActor1502); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:595:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:596:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:596:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:597:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1519); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_23= '}' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            else if ( (LA14_0==14) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleActor1537); 

                        	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:618:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_23= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:618:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_23= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:618:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_23= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleActor1556); 

                        	newLeafNode(otherlv_3, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:622:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:624:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:624:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:625:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:628:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:629:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:629:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) ) )*
                    loop13:
                    do {
                        int alt13=7;
                        int LA13_0 = input.LA(1);

                        if ( LA13_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt13=1;
                        }
                        else if ( (LA13_0==RULE_INT|| LA13_0 >=56 && LA13_0<=59) && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt13=2;
                        }
                        else if ( LA13_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt13=3;
                        }
                        else if ( LA13_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 3) ) {
                            alt13=4;
                        }
                        else if ( LA13_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 4) ) {
                            alt13=5;
                        }
                        else if ( (LA13_0==RULE_ID||LA13_0==22|| LA13_0 >=24 && LA13_0<=28) && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 5) ) {
                            alt13=6;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:631:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:631:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:632:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:632:106: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:633:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:636:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:636:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:636:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:636:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleActor1614); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleActor1626); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getActorAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:644:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:645:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:645:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:646:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1643); 

                    	    			newLeafNode(lv_label_7_0, grammarAccess.getActorAccess().getLabelSTRINGTerminalRuleCall_2_1_1_0_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActorRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"label",
                    	            		lv_label_7_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleActor1660); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getActorAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:673:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:673:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:674:5: {...}? => ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:674:106: ( ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:675:6: ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:678:6: ({...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:678:7: {...}? => ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:678:16: ( ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:678:17: ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) ) otherlv_11= ';'
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:678:17: ( ( (lv_importance_9_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_10_0= RULE_INT ) ) )
                    	    int alt9=2;
                    	    int LA9_0 = input.LA(1);

                    	    if ( ((LA9_0>=56 && LA9_0<=59)) ) {
                    	        alt9=1;
                    	    }
                    	    else if ( (LA9_0==RULE_INT) ) {
                    	        alt9=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 9, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt9) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:678:18: ( (lv_importance_9_0= ruleImportanceType ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:678:18: ( (lv_importance_9_0= ruleImportanceType ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:679:1: (lv_importance_9_0= ruleImportanceType )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:679:1: (lv_importance_9_0= ruleImportanceType )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:680:3: lv_importance_9_0= ruleImportanceType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getActorAccess().getImportanceImportanceTypeEnumRuleCall_2_1_1_1_0_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImportanceType_in_ruleActor1738);
                    	            lv_importance_9_0=ruleImportanceType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getActorRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"importance",
                    	                    		lv_importance_9_0, 
                    	                    		"ImportanceType");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:697:6: ( (lv_importanceQuantitative_10_0= RULE_INT ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:697:6: ( (lv_importanceQuantitative_10_0= RULE_INT ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:698:1: (lv_importanceQuantitative_10_0= RULE_INT )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:698:1: (lv_importanceQuantitative_10_0= RULE_INT )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:699:3: lv_importanceQuantitative_10_0= RULE_INT
                    	            {
                    	            lv_importanceQuantitative_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActor1761); 

                    	            			newLeafNode(lv_importanceQuantitative_10_0, grammarAccess.getActorAccess().getImportanceQuantitativeINTTerminalRuleCall_2_1_1_1_0_1_0()); 
                    	            		

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


                    	            }
                    	            break;

                    	    }

                    	    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleActor1779); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getSemicolonKeyword_2_1_1_1_1());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:726:4: ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:726:4: ({...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:727:5: {...}? => ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:727:106: ( ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:728:6: ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:731:6: ({...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:731:7: {...}? => (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:731:16: (otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:731:18: otherlv_12= 'description' otherlv_13= '=' ( (lv_description_14_0= RULE_STRING ) ) otherlv_15= ';'
                    	    {
                    	    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleActor1847); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getActorAccess().getDescriptionKeyword_2_1_1_2_0());
                    	        
                    	    otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleActor1859); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getActorAccess().getEqualsSignKeyword_2_1_1_2_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:739:1: ( (lv_description_14_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:740:1: (lv_description_14_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:740:1: (lv_description_14_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:741:3: lv_description_14_0= RULE_STRING
                    	    {
                    	    lv_description_14_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1876); 

                    	    			newLeafNode(lv_description_14_0, grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_2_1_1_2_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActorRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"description",
                    	            		lv_description_14_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_15=(Token)match(input,17,FOLLOW_17_in_ruleActor1893); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getActorAccess().getSemicolonKeyword_2_1_1_2_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:768:4: ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:768:4: ({...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:769:5: {...}? => ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 3)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:769:106: ( ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:770:6: ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 3);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:773:6: ({...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:773:7: {...}? => (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:773:16: (otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:773:18: otherlv_16= 'color' otherlv_17= '=' ( (lv_fillColor_18_0= ruleColor ) ) otherlv_19= ';'
                    	    {
                    	    otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleActor1961); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getActorAccess().getColorKeyword_2_1_1_3_0());
                    	        
                    	    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleActor1973); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getActorAccess().getEqualsSignKeyword_2_1_1_3_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:781:1: ( (lv_fillColor_18_0= ruleColor ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:782:1: (lv_fillColor_18_0= ruleColor )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:782:1: (lv_fillColor_18_0= ruleColor )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:783:3: lv_fillColor_18_0= ruleColor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getActorAccess().getFillColorColorEnumRuleCall_2_1_1_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleColor_in_ruleActor1994);
                    	    lv_fillColor_18_0=ruleColor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getActorRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"fillColor",
                    	            		lv_fillColor_18_0, 
                    	            		"Color");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_19=(Token)match(input,17,FOLLOW_17_in_ruleActor2006); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getActorAccess().getSemicolonKeyword_2_1_1_3_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:810:4: ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:810:4: ({...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:811:5: {...}? => ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 4)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:811:106: ( ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:812:6: ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 4);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:815:6: ({...}? => ( (lv_metaData_20_0= ruleMetadata ) ) )+
                    	    int cnt10=0;
                    	    loop10:
                    	    do {
                    	        int alt10=2;
                    	        int LA10_0 = input.LA(1);

                    	        if ( (LA10_0==51) ) {
                    	            int LA10_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt10=1;
                    	            }


                    	        }


                    	        switch (alt10) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:815:7: {...}? => ( (lv_metaData_20_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleActor", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:815:16: ( (lv_metaData_20_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:816:1: (lv_metaData_20_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:816:1: (lv_metaData_20_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:817:3: lv_metaData_20_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getActorAccess().getMetaDataMetadataParserRuleCall_2_1_1_4_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleActor2082);
                    	    	    lv_metaData_20_0=ruleMetadata();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getActorRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"metaData",
                    	    	            		lv_metaData_20_0, 
                    	    	            		"Metadata");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt10 >= 1 ) break loop10;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(10, input);
                    	                throw eee;
                    	        }
                    	        cnt10++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:840:4: ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:840:4: ({...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:841:5: {...}? => ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 5)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:841:106: ( ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:842:6: ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 5);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:845:6: ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+
                    	    int cnt12=0;
                    	    loop12:
                    	    do {
                    	        int alt12=2;
                    	        alt12 = dfa12.predict(input);
                    	        switch (alt12) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:845:7: {...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleActor", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:845:16: ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) )
                    	    	    int alt11=2;
                    	    	    int LA11_0 = input.LA(1);

                    	    	    if ( (LA11_0==22||(LA11_0>=24 && LA11_0<=28)) ) {
                    	    	        alt11=1;
                    	    	    }
                    	    	    else if ( (LA11_0==RULE_ID) ) {
                    	    	        alt11=2;
                    	    	    }
                    	    	    else {
                    	    	        NoViableAltException nvae =
                    	    	            new NoViableAltException("", 11, 0, input);

                    	    	        throw nvae;
                    	    	    }
                    	    	    switch (alt11) {
                    	    	        case 1 :
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:845:17: ( (lv_elemets_21_0= ruleIntentionalElement ) )
                    	    	            {
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:845:17: ( (lv_elemets_21_0= ruleIntentionalElement ) )
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:846:1: (lv_elemets_21_0= ruleIntentionalElement )
                    	    	            {
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:846:1: (lv_elemets_21_0= ruleIntentionalElement )
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:847:3: lv_elemets_21_0= ruleIntentionalElement
                    	    	            {
                    	    	             
                    	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsIntentionalElementParserRuleCall_2_1_1_5_0_0()); 
                    	    	            	    
                    	    	            pushFollow(FOLLOW_ruleIntentionalElement_in_ruleActor2159);
                    	    	            lv_elemets_21_0=ruleIntentionalElement();

                    	    	            state._fsp--;


                    	    	            	        if (current==null) {
                    	    	            	            current = createModelElementForParent(grammarAccess.getActorRule());
                    	    	            	        }
                    	    	                   		add(
                    	    	                   			current, 
                    	    	                   			"elemets",
                    	    	                    		lv_elemets_21_0, 
                    	    	                    		"IntentionalElement");
                    	    	            	        afterParserOrEnumRuleCall();
                    	    	            	    

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;
                    	    	        case 2 :
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:864:6: ( (lv_elemets_22_0= ruleElementLink ) )
                    	    	            {
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:864:6: ( (lv_elemets_22_0= ruleElementLink ) )
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:865:1: (lv_elemets_22_0= ruleElementLink )
                    	    	            {
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:865:1: (lv_elemets_22_0= ruleElementLink )
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:866:3: lv_elemets_22_0= ruleElementLink
                    	    	            {
                    	    	             
                    	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsElementLinkParserRuleCall_2_1_1_5_1_0()); 
                    	    	            	    
                    	    	            pushFollow(FOLLOW_ruleElementLink_in_ruleActor2186);
                    	    	            lv_elemets_22_0=ruleElementLink();

                    	    	            state._fsp--;


                    	    	            	        if (current==null) {
                    	    	            	            current = createModelElementForParent(grammarAccess.getActorRule());
                    	    	            	        }
                    	    	                   		add(
                    	    	                   			current, 
                    	    	                   			"elemets",
                    	    	                    		lv_elemets_22_0, 
                    	    	                    		"ElementLink");
                    	    	            	        afterParserOrEnumRuleCall();
                    	    	            	    

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;

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

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_23=(Token)match(input,15,FOLLOW_15_in_ruleActor2240); 

                        	newLeafNode(otherlv_23, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleSoftgoal"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:908:1: entryRuleSoftgoal returns [EObject current=null] : iv_ruleSoftgoal= ruleSoftgoal EOF ;
    public final EObject entryRuleSoftgoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftgoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:909:2: (iv_ruleSoftgoal= ruleSoftgoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:910:2: iv_ruleSoftgoal= ruleSoftgoal EOF
            {
             newCompositeNode(grammarAccess.getSoftgoalRule()); 
            pushFollow(FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal2278);
            iv_ruleSoftgoal=ruleSoftgoal();

            state._fsp--;

             current =iv_ruleSoftgoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftgoal2288); 

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
    // $ANTLR end "entryRuleSoftgoal"


    // $ANTLR start "ruleSoftgoal"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:917:1: ruleSoftgoal returns [EObject current=null] : (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) ) ;
    public final EObject ruleSoftgoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_importanceQuantitative_22_0=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Enumerator lv_fillColor_15_0 = null;

        Enumerator lv_decompositionType_19_0 = null;

        Enumerator lv_importance_21_0 = null;

        EObject lv_metaData_24_0 = null;

        EObject lv_elementLinks_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:920:28: ( (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:921:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:921:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:921:3: otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleSoftgoal2325); 

                	newLeafNode(otherlv_0, grammarAccess.getSoftgoalAccess().getSoftGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:925:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:926:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:926:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:927:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftgoal2342); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSoftgoalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSoftgoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:943:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            else if ( (LA19_0==14) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:943:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2360); 

                        	newLeafNode(otherlv_2, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:948:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:948:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:948:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleSoftgoal2379); 

                        	newLeafNode(otherlv_3, grammarAccess.getSoftgoalAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:952:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:954:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:954:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:955:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:958:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:959:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:959:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )*
                    loop18:
                    do {
                        int alt18=8;
                        int LA18_0 = input.LA(1);

                        if ( LA18_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt18=1;
                        }
                        else if ( LA18_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt18=2;
                        }
                        else if ( LA18_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt18=3;
                        }
                        else if ( LA18_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 3) ) {
                            alt18=4;
                        }
                        else if ( (LA18_0==RULE_INT|| LA18_0 >=56 && LA18_0<=59) && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 4) ) {
                            alt18=5;
                        }
                        else if ( LA18_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 5) ) {
                            alt18=6;
                        }
                        else if ( (LA18_0==RULE_ID||LA18_0==29|| LA18_0 >=31 && LA18_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 6) ) {
                            alt18=7;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:961:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:961:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:962:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:962:109: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:963:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:966:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:966:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:966:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:966:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2437); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSoftgoalAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2449); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:974:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:975:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:975:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:976:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal2466); 

                    	    			newLeafNode(lv_label_7_0, grammarAccess.getSoftgoalAccess().getLabelSTRINGTerminalRuleCall_2_1_1_0_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSoftgoalRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"label",
                    	            		lv_label_7_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2483); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1003:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1003:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1004:5: {...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1004:109: ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1005:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1008:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1008:7: {...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1008:16: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1008:18: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';'
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleSoftgoal2551); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSoftgoalAccess().getDescriptionKeyword_2_1_1_1_0());
                    	        
                    	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2563); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_2_1_1_1_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1016:1: ( (lv_description_11_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1017:1: (lv_description_11_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1017:1: (lv_description_11_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1018:3: lv_description_11_0= RULE_STRING
                    	    {
                    	    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal2580); 

                    	    			newLeafNode(lv_description_11_0, grammarAccess.getSoftgoalAccess().getDescriptionSTRINGTerminalRuleCall_2_1_1_1_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getSoftgoalRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"description",
                    	            		lv_description_11_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2597); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_2_1_1_1_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1045:4: ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1045:4: ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1046:5: {...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1046:109: ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1047:6: ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1050:6: ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1050:7: {...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1050:16: (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1050:18: otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';'
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleSoftgoal2665); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getSoftgoalAccess().getColorKeyword_2_1_1_2_0());
                    	        
                    	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2677); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_2_1_1_2_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1058:1: ( (lv_fillColor_15_0= ruleColor ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1059:1: (lv_fillColor_15_0= ruleColor )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1059:1: (lv_fillColor_15_0= ruleColor )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1060:3: lv_fillColor_15_0= ruleColor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getFillColorColorEnumRuleCall_2_1_1_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleColor_in_ruleSoftgoal2698);
                    	    lv_fillColor_15_0=ruleColor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"fillColor",
                    	            		lv_fillColor_15_0, 
                    	            		"Color");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2710); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_2_1_1_2_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1087:4: ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1087:4: ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1088:5: {...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 3)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1088:109: ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1089:6: ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 3);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1092:6: ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1092:7: {...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1092:16: (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1092:18: otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';'
                    	    {
                    	    otherlv_17=(Token)match(input,23,FOLLOW_23_in_ruleSoftgoal2778); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getSoftgoalAccess().getDecompositionTypeKeyword_2_1_1_3_0());
                    	        
                    	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2790); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_2_1_1_3_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1100:1: ( (lv_decompositionType_19_0= ruleDecompositionType ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1101:1: (lv_decompositionType_19_0= ruleDecompositionType )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1101:1: (lv_decompositionType_19_0= ruleDecompositionType )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1102:3: lv_decompositionType_19_0= ruleDecompositionType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_1_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleSoftgoal2811);
                    	    lv_decompositionType_19_0=ruleDecompositionType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"decompositionType",
                    	            		lv_decompositionType_19_0, 
                    	            		"DecompositionType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2823); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_2_1_1_3_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1129:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1129:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1130:5: {...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 4)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1130:109: ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1131:6: ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 4);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1134:6: ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1134:7: {...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1134:16: ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1134:17: ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';'
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1134:17: ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) )
                    	    int alt15=2;
                    	    int LA15_0 = input.LA(1);

                    	    if ( ((LA15_0>=56 && LA15_0<=59)) ) {
                    	        alt15=1;
                    	    }
                    	    else if ( (LA15_0==RULE_INT) ) {
                    	        alt15=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 15, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt15) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1134:18: ( (lv_importance_21_0= ruleImportanceType ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1134:18: ( (lv_importance_21_0= ruleImportanceType ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1135:1: (lv_importance_21_0= ruleImportanceType )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1135:1: (lv_importance_21_0= ruleImportanceType )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1136:3: lv_importance_21_0= ruleImportanceType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getSoftgoalAccess().getImportanceImportanceTypeEnumRuleCall_2_1_1_4_0_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImportanceType_in_ruleSoftgoal2901);
                    	            lv_importance_21_0=ruleImportanceType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"importance",
                    	                    		lv_importance_21_0, 
                    	                    		"ImportanceType");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1153:6: ( (lv_importanceQuantitative_22_0= RULE_INT ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1153:6: ( (lv_importanceQuantitative_22_0= RULE_INT ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1154:1: (lv_importanceQuantitative_22_0= RULE_INT )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1154:1: (lv_importanceQuantitative_22_0= RULE_INT )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1155:3: lv_importanceQuantitative_22_0= RULE_INT
                    	            {
                    	            lv_importanceQuantitative_22_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSoftgoal2924); 

                    	            			newLeafNode(lv_importanceQuantitative_22_0, grammarAccess.getSoftgoalAccess().getImportanceQuantitativeINTTerminalRuleCall_2_1_1_4_0_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getSoftgoalRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"importanceQuantitative",
                    	                    		lv_importanceQuantitative_22_0, 
                    	                    		"INT");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_23=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2942); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_2_1_1_4_1());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1182:4: ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1182:4: ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1183:5: {...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 5)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1183:109: ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1184:6: ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 5);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1187:6: ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+
                    	    int cnt16=0;
                    	    loop16:
                    	    do {
                    	        int alt16=2;
                    	        int LA16_0 = input.LA(1);

                    	        if ( (LA16_0==51) ) {
                    	            int LA16_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt16=1;
                    	            }


                    	        }


                    	        switch (alt16) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1187:7: {...}? => ( (lv_metaData_24_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1187:16: ( (lv_metaData_24_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1188:1: (lv_metaData_24_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1188:1: (lv_metaData_24_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1189:3: lv_metaData_24_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getMetaDataMetadataParserRuleCall_2_1_1_5_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleSoftgoal3018);
                    	    	    lv_metaData_24_0=ruleMetadata();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"metaData",
                    	    	            		lv_metaData_24_0, 
                    	    	            		"Metadata");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt16 >= 1 ) break loop16;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(16, input);
                    	                throw eee;
                    	        }
                    	        cnt16++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1212:4: ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1212:4: ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1213:5: {...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 6)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1213:109: ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1214:6: ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 6);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1217:6: ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+
                    	    int cnt17=0;
                    	    loop17:
                    	    do {
                    	        int alt17=2;
                    	        switch ( input.LA(1) ) {
                    	        case 29:
                    	            {
                    	            int LA17_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt17=1;
                    	            }


                    	            }
                    	            break;
                    	        case 31:
                    	            {
                    	            int LA17_3 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt17=1;
                    	            }


                    	            }
                    	            break;
                    	        case 32:
                    	            {
                    	            int LA17_4 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt17=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ID:
                    	            {
                    	            int LA17_5 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt17=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt17) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1217:7: {...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1217:16: ( (lv_elementLinks_25_0= ruleInLineElementLink ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1218:1: (lv_elementLinks_25_0= ruleInLineElementLink )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1218:1: (lv_elementLinks_25_0= ruleInLineElementLink )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1219:3: lv_elementLinks_25_0= ruleInLineElementLink
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getElementLinksInLineElementLinkParserRuleCall_2_1_1_6_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleSoftgoal3094);
                    	    	    lv_elementLinks_25_0=ruleInLineElementLink();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"elementLinks",
                    	    	            		lv_elementLinks_25_0, 
                    	    	            		"InLineElementLink");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

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

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleSoftgoal3147); 

                        	newLeafNode(otherlv_26, grammarAccess.getSoftgoalAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // $ANTLR end "ruleSoftgoal"


    // $ANTLR start "entryRuleGoal"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1261:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1262:2: (iv_ruleGoal= ruleGoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1263:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal3185);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal3195); 

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
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1270:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_importanceQuantitative_22_0=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Enumerator lv_fillColor_15_0 = null;

        Enumerator lv_decompositionType_19_0 = null;

        Enumerator lv_importance_21_0 = null;

        EObject lv_metaData_24_0 = null;

        EObject lv_elementLinks_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1273:28: ( (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1274:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1274:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1274:3: otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGoal3232); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1278:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1279:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1279:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1280:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal3249); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1296:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==17) ) {
                alt24=1;
            }
            else if ( (LA24_0==14) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1296:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleGoal3267); 

                        	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1301:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1301:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1301:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleGoal3286); 

                        	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1305:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1307:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1307:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1308:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1311:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1312:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1312:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )*
                    loop23:
                    do {
                        int alt23=8;
                        int LA23_0 = input.LA(1);

                        if ( LA23_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt23=1;
                        }
                        else if ( LA23_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt23=2;
                        }
                        else if ( LA23_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt23=3;
                        }
                        else if ( LA23_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 3) ) {
                            alt23=4;
                        }
                        else if ( (LA23_0==RULE_INT|| LA23_0 >=56 && LA23_0<=59) && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 4) ) {
                            alt23=5;
                        }
                        else if ( LA23_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 5) ) {
                            alt23=6;
                        }
                        else if ( (LA23_0==RULE_ID||LA23_0==29|| LA23_0 >=31 && LA23_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 6) ) {
                            alt23=7;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1314:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1314:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1315:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1315:105: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1316:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1319:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1319:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1319:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1319:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleGoal3344); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleGoal3356); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getGoalAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1327:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1328:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1328:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1329:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3373); 

                    	    			newLeafNode(lv_label_7_0, grammarAccess.getGoalAccess().getLabelSTRINGTerminalRuleCall_2_1_1_0_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getGoalRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"label",
                    	            		lv_label_7_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleGoal3390); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1356:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1356:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1357:5: {...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1357:105: ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1358:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1361:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1361:7: {...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1361:16: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1361:18: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';'
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleGoal3458); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getDescriptionKeyword_2_1_1_1_0());
                    	        
                    	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleGoal3470); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getGoalAccess().getEqualsSignKeyword_2_1_1_1_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1369:1: ( (lv_description_11_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1370:1: (lv_description_11_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1370:1: (lv_description_11_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1371:3: lv_description_11_0= RULE_STRING
                    	    {
                    	    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3487); 

                    	    			newLeafNode(lv_description_11_0, grammarAccess.getGoalAccess().getDescriptionSTRINGTerminalRuleCall_2_1_1_1_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getGoalRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"description",
                    	            		lv_description_11_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleGoal3504); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getGoalAccess().getSemicolonKeyword_2_1_1_1_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1398:4: ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1398:4: ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1399:5: {...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1399:105: ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1400:6: ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1403:6: ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1403:7: {...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1403:16: (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1403:18: otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';'
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleGoal3572); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getColorKeyword_2_1_1_2_0());
                    	        
                    	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleGoal3584); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getGoalAccess().getEqualsSignKeyword_2_1_1_2_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1411:1: ( (lv_fillColor_15_0= ruleColor ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1412:1: (lv_fillColor_15_0= ruleColor )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1412:1: (lv_fillColor_15_0= ruleColor )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1413:3: lv_fillColor_15_0= ruleColor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGoalAccess().getFillColorColorEnumRuleCall_2_1_1_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleColor_in_ruleGoal3605);
                    	    lv_fillColor_15_0=ruleColor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"fillColor",
                    	            		lv_fillColor_15_0, 
                    	            		"Color");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleGoal3617); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getGoalAccess().getSemicolonKeyword_2_1_1_2_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1440:4: ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1440:4: ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1441:5: {...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 3)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1441:105: ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1442:6: ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 3);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1445:6: ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1445:7: {...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1445:16: (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1445:18: otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';'
                    	    {
                    	    otherlv_17=(Token)match(input,23,FOLLOW_23_in_ruleGoal3685); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getDecompositionTypeKeyword_2_1_1_3_0());
                    	        
                    	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleGoal3697); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getGoalAccess().getEqualsSignKeyword_2_1_1_3_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1453:1: ( (lv_decompositionType_19_0= ruleDecompositionType ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1454:1: (lv_decompositionType_19_0= ruleDecompositionType )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1454:1: (lv_decompositionType_19_0= ruleDecompositionType )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1455:3: lv_decompositionType_19_0= ruleDecompositionType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_1_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleGoal3718);
                    	    lv_decompositionType_19_0=ruleDecompositionType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"decompositionType",
                    	            		lv_decompositionType_19_0, 
                    	            		"DecompositionType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleGoal3730); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getGoalAccess().getSemicolonKeyword_2_1_1_3_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1482:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1482:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1483:5: {...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 4)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1483:105: ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1484:6: ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 4);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1487:6: ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1487:7: {...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1487:16: ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1487:17: ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';'
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1487:17: ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) )
                    	    int alt20=2;
                    	    int LA20_0 = input.LA(1);

                    	    if ( ((LA20_0>=56 && LA20_0<=59)) ) {
                    	        alt20=1;
                    	    }
                    	    else if ( (LA20_0==RULE_INT) ) {
                    	        alt20=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 20, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt20) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1487:18: ( (lv_importance_21_0= ruleImportanceType ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1487:18: ( (lv_importance_21_0= ruleImportanceType ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1488:1: (lv_importance_21_0= ruleImportanceType )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1488:1: (lv_importance_21_0= ruleImportanceType )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1489:3: lv_importance_21_0= ruleImportanceType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getGoalAccess().getImportanceImportanceTypeEnumRuleCall_2_1_1_4_0_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImportanceType_in_ruleGoal3808);
                    	            lv_importance_21_0=ruleImportanceType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"importance",
                    	                    		lv_importance_21_0, 
                    	                    		"ImportanceType");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1506:6: ( (lv_importanceQuantitative_22_0= RULE_INT ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1506:6: ( (lv_importanceQuantitative_22_0= RULE_INT ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1507:1: (lv_importanceQuantitative_22_0= RULE_INT )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1507:1: (lv_importanceQuantitative_22_0= RULE_INT )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1508:3: lv_importanceQuantitative_22_0= RULE_INT
                    	            {
                    	            lv_importanceQuantitative_22_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGoal3831); 

                    	            			newLeafNode(lv_importanceQuantitative_22_0, grammarAccess.getGoalAccess().getImportanceQuantitativeINTTerminalRuleCall_2_1_1_4_0_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getGoalRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"importanceQuantitative",
                    	                    		lv_importanceQuantitative_22_0, 
                    	                    		"INT");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_23=(Token)match(input,17,FOLLOW_17_in_ruleGoal3849); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getGoalAccess().getSemicolonKeyword_2_1_1_4_1());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1535:4: ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1535:4: ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1536:5: {...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 5)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1536:105: ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1537:6: ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 5);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1540:6: ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+
                    	    int cnt21=0;
                    	    loop21:
                    	    do {
                    	        int alt21=2;
                    	        int LA21_0 = input.LA(1);

                    	        if ( (LA21_0==51) ) {
                    	            int LA21_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt21=1;
                    	            }


                    	        }


                    	        switch (alt21) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1540:7: {...}? => ( (lv_metaData_24_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleGoal", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1540:16: ( (lv_metaData_24_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1541:1: (lv_metaData_24_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1541:1: (lv_metaData_24_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1542:3: lv_metaData_24_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getMetaDataMetadataParserRuleCall_2_1_1_5_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleGoal3925);
                    	    	    lv_metaData_24_0=ruleMetadata();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"metaData",
                    	    	            		lv_metaData_24_0, 
                    	    	            		"Metadata");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt21 >= 1 ) break loop21;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(21, input);
                    	                throw eee;
                    	        }
                    	        cnt21++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1565:4: ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1565:4: ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1566:5: {...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 6)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1566:105: ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1567:6: ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 6);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1570:6: ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+
                    	    int cnt22=0;
                    	    loop22:
                    	    do {
                    	        int alt22=2;
                    	        switch ( input.LA(1) ) {
                    	        case 29:
                    	            {
                    	            int LA22_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt22=1;
                    	            }


                    	            }
                    	            break;
                    	        case 31:
                    	            {
                    	            int LA22_3 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt22=1;
                    	            }


                    	            }
                    	            break;
                    	        case 32:
                    	            {
                    	            int LA22_4 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt22=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ID:
                    	            {
                    	            int LA22_5 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt22=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt22) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1570:7: {...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleGoal", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1570:16: ( (lv_elementLinks_25_0= ruleInLineElementLink ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1571:1: (lv_elementLinks_25_0= ruleInLineElementLink )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1571:1: (lv_elementLinks_25_0= ruleInLineElementLink )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1572:3: lv_elementLinks_25_0= ruleInLineElementLink
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getElementLinksInLineElementLinkParserRuleCall_2_1_1_6_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleGoal4001);
                    	    	    lv_elementLinks_25_0=ruleInLineElementLink();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"elementLinks",
                    	    	            		lv_elementLinks_25_0, 
                    	    	            		"InLineElementLink");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt22 >= 1 ) break loop22;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(22, input);
                    	                throw eee;
                    	        }
                    	        cnt22++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleGoal4054); 

                        	newLeafNode(otherlv_26, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleTask"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1614:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1615:2: (iv_ruleTask= ruleTask EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1616:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask4092);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask4102); 

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
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1623:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_importanceQuantitative_22_0=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Enumerator lv_fillColor_15_0 = null;

        Enumerator lv_decompositionType_19_0 = null;

        Enumerator lv_importance_21_0 = null;

        EObject lv_metaData_24_0 = null;

        EObject lv_elementLinks_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1626:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1627:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1627:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1627:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTask4139); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1631:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1632:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1632:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1633:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask4156); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTaskRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1649:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==17) ) {
                alt29=1;
            }
            else if ( (LA29_0==14) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1649:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleTask4174); 

                        	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1654:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1654:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1654:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleTask4193); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1658:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1660:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1660:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1661:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1664:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1665:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1665:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )*
                    loop28:
                    do {
                        int alt28=8;
                        int LA28_0 = input.LA(1);

                        if ( LA28_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt28=1;
                        }
                        else if ( LA28_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt28=2;
                        }
                        else if ( LA28_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt28=3;
                        }
                        else if ( LA28_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 3) ) {
                            alt28=4;
                        }
                        else if ( (LA28_0==RULE_INT|| LA28_0 >=56 && LA28_0<=59) && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 4) ) {
                            alt28=5;
                        }
                        else if ( LA28_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 5) ) {
                            alt28=6;
                        }
                        else if ( (LA28_0==RULE_ID||LA28_0==29|| LA28_0 >=31 && LA28_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 6) ) {
                            alt28=7;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1667:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1667:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1668:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1668:105: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1669:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1672:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1672:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1672:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1672:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleTask4251); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleTask4263); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1680:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1681:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1681:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1682:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask4280); 

                    	    			newLeafNode(lv_label_7_0, grammarAccess.getTaskAccess().getLabelSTRINGTerminalRuleCall_2_1_1_0_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"label",
                    	            		lv_label_7_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleTask4297); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1709:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1709:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1710:5: {...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1710:105: ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1711:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1714:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1714:7: {...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1714:16: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1714:18: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';'
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleTask4365); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getDescriptionKeyword_2_1_1_1_0());
                    	        
                    	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleTask4377); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getEqualsSignKeyword_2_1_1_1_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1722:1: ( (lv_description_11_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1723:1: (lv_description_11_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1723:1: (lv_description_11_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1724:3: lv_description_11_0= RULE_STRING
                    	    {
                    	    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask4394); 

                    	    			newLeafNode(lv_description_11_0, grammarAccess.getTaskAccess().getDescriptionSTRINGTerminalRuleCall_2_1_1_1_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTaskRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"description",
                    	            		lv_description_11_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleTask4411); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_1_1_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1751:4: ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1751:4: ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1752:5: {...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1752:105: ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1753:6: ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1756:6: ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1756:7: {...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1756:16: (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1756:18: otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';'
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleTask4479); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getColorKeyword_2_1_1_2_0());
                    	        
                    	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleTask4491); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getTaskAccess().getEqualsSignKeyword_2_1_1_2_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1764:1: ( (lv_fillColor_15_0= ruleColor ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1765:1: (lv_fillColor_15_0= ruleColor )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1765:1: (lv_fillColor_15_0= ruleColor )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1766:3: lv_fillColor_15_0= ruleColor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getFillColorColorEnumRuleCall_2_1_1_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleColor_in_ruleTask4512);
                    	    lv_fillColor_15_0=ruleColor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"fillColor",
                    	            		lv_fillColor_15_0, 
                    	            		"Color");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleTask4524); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_1_2_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1793:4: ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1793:4: ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1794:5: {...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 3)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1794:105: ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1795:6: ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 3);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1798:6: ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1798:7: {...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1798:16: (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1798:18: otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';'
                    	    {
                    	    otherlv_17=(Token)match(input,23,FOLLOW_23_in_ruleTask4592); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getTaskAccess().getDecompositionTypeKeyword_2_1_1_3_0());
                    	        
                    	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleTask4604); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getTaskAccess().getEqualsSignKeyword_2_1_1_3_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1806:1: ( (lv_decompositionType_19_0= ruleDecompositionType ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1807:1: (lv_decompositionType_19_0= ruleDecompositionType )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1807:1: (lv_decompositionType_19_0= ruleDecompositionType )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1808:3: lv_decompositionType_19_0= ruleDecompositionType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_1_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleTask4625);
                    	    lv_decompositionType_19_0=ruleDecompositionType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"decompositionType",
                    	            		lv_decompositionType_19_0, 
                    	            		"DecompositionType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleTask4637); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_1_3_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1835:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1835:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1836:5: {...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 4)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1836:105: ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1837:6: ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 4);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1840:6: ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1840:7: {...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1840:16: ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1840:17: ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';'
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1840:17: ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) )
                    	    int alt25=2;
                    	    int LA25_0 = input.LA(1);

                    	    if ( ((LA25_0>=56 && LA25_0<=59)) ) {
                    	        alt25=1;
                    	    }
                    	    else if ( (LA25_0==RULE_INT) ) {
                    	        alt25=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 25, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt25) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1840:18: ( (lv_importance_21_0= ruleImportanceType ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1840:18: ( (lv_importance_21_0= ruleImportanceType ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1841:1: (lv_importance_21_0= ruleImportanceType )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1841:1: (lv_importance_21_0= ruleImportanceType )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1842:3: lv_importance_21_0= ruleImportanceType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getTaskAccess().getImportanceImportanceTypeEnumRuleCall_2_1_1_4_0_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImportanceType_in_ruleTask4715);
                    	            lv_importance_21_0=ruleImportanceType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"importance",
                    	                    		lv_importance_21_0, 
                    	                    		"ImportanceType");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1859:6: ( (lv_importanceQuantitative_22_0= RULE_INT ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1859:6: ( (lv_importanceQuantitative_22_0= RULE_INT ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1860:1: (lv_importanceQuantitative_22_0= RULE_INT )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1860:1: (lv_importanceQuantitative_22_0= RULE_INT )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1861:3: lv_importanceQuantitative_22_0= RULE_INT
                    	            {
                    	            lv_importanceQuantitative_22_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTask4738); 

                    	            			newLeafNode(lv_importanceQuantitative_22_0, grammarAccess.getTaskAccess().getImportanceQuantitativeINTTerminalRuleCall_2_1_1_4_0_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getTaskRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"importanceQuantitative",
                    	                    		lv_importanceQuantitative_22_0, 
                    	                    		"INT");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_23=(Token)match(input,17,FOLLOW_17_in_ruleTask4756); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_1_4_1());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1888:4: ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1888:4: ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1889:5: {...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 5)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1889:105: ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1890:6: ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 5);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1893:6: ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+
                    	    int cnt26=0;
                    	    loop26:
                    	    do {
                    	        int alt26=2;
                    	        int LA26_0 = input.LA(1);

                    	        if ( (LA26_0==51) ) {
                    	            int LA26_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt26=1;
                    	            }


                    	        }


                    	        switch (alt26) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1893:7: {...}? => ( (lv_metaData_24_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleTask", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1893:16: ( (lv_metaData_24_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1894:1: (lv_metaData_24_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1894:1: (lv_metaData_24_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1895:3: lv_metaData_24_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getTaskAccess().getMetaDataMetadataParserRuleCall_2_1_1_5_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleTask4832);
                    	    	    lv_metaData_24_0=ruleMetadata();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"metaData",
                    	    	            		lv_metaData_24_0, 
                    	    	            		"Metadata");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt26 >= 1 ) break loop26;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(26, input);
                    	                throw eee;
                    	        }
                    	        cnt26++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1918:4: ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1918:4: ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1919:5: {...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 6)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1919:105: ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1920:6: ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 6);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1923:6: ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+
                    	    int cnt27=0;
                    	    loop27:
                    	    do {
                    	        int alt27=2;
                    	        switch ( input.LA(1) ) {
                    	        case 29:
                    	            {
                    	            int LA27_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt27=1;
                    	            }


                    	            }
                    	            break;
                    	        case 31:
                    	            {
                    	            int LA27_3 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt27=1;
                    	            }


                    	            }
                    	            break;
                    	        case 32:
                    	            {
                    	            int LA27_4 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt27=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ID:
                    	            {
                    	            int LA27_5 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt27=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt27) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1923:7: {...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleTask", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1923:16: ( (lv_elementLinks_25_0= ruleInLineElementLink ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1924:1: (lv_elementLinks_25_0= ruleInLineElementLink )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1924:1: (lv_elementLinks_25_0= ruleInLineElementLink )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1925:3: lv_elementLinks_25_0= ruleInLineElementLink
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getTaskAccess().getElementLinksInLineElementLinkParserRuleCall_2_1_1_6_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleTask4908);
                    	    	    lv_elementLinks_25_0=ruleInLineElementLink();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"elementLinks",
                    	    	            		lv_elementLinks_25_0, 
                    	    	            		"InLineElementLink");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt27 >= 1 ) break loop27;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(27, input);
                    	                throw eee;
                    	        }
                    	        cnt27++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleTask4961); 

                        	newLeafNode(otherlv_26, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleResource"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1967:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1968:2: (iv_ruleResource= ruleResource EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1969:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource4999);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource5009); 

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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1976:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_importanceQuantitative_22_0=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Enumerator lv_fillColor_15_0 = null;

        Enumerator lv_decompositionType_19_0 = null;

        Enumerator lv_importance_21_0 = null;

        EObject lv_metaData_24_0 = null;

        EObject lv_elementLinks_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1979:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1980:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1980:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1980:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleResource5046); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1984:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1985:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1985:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1986:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource5063); 

            			newLeafNode(lv_name_1_0, grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getResourceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2002:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==17) ) {
                alt34=1;
            }
            else if ( (LA34_0==14) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2002:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleResource5081); 

                        	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2007:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2007:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2007:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleResource5100); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2011:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2013:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2013:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2014:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2017:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2018:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2018:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )*
                    loop33:
                    do {
                        int alt33=8;
                        int LA33_0 = input.LA(1);

                        if ( LA33_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt33=1;
                        }
                        else if ( LA33_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt33=2;
                        }
                        else if ( LA33_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt33=3;
                        }
                        else if ( LA33_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 3) ) {
                            alt33=4;
                        }
                        else if ( (LA33_0==RULE_INT|| LA33_0 >=56 && LA33_0<=59) && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 4) ) {
                            alt33=5;
                        }
                        else if ( LA33_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 5) ) {
                            alt33=6;
                        }
                        else if ( (LA33_0==RULE_ID||LA33_0==29|| LA33_0 >=31 && LA33_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 6) ) {
                            alt33=7;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2020:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2020:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2021:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2021:109: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2022:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2025:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2025:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2025:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2025:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleResource5158); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleResource5170); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2033:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2034:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2034:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2035:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource5187); 

                    	    			newLeafNode(lv_label_7_0, grammarAccess.getResourceAccess().getLabelSTRINGTerminalRuleCall_2_1_1_0_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getResourceRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"label",
                    	            		lv_label_7_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleResource5204); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2062:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2062:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2063:5: {...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2063:109: ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2064:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2067:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2067:7: {...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2067:16: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2067:18: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';'
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleResource5272); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getResourceAccess().getDescriptionKeyword_2_1_1_1_0());
                    	        
                    	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleResource5284); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getResourceAccess().getEqualsSignKeyword_2_1_1_1_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2075:1: ( (lv_description_11_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2076:1: (lv_description_11_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2076:1: (lv_description_11_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2077:3: lv_description_11_0= RULE_STRING
                    	    {
                    	    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource5301); 

                    	    			newLeafNode(lv_description_11_0, grammarAccess.getResourceAccess().getDescriptionSTRINGTerminalRuleCall_2_1_1_1_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getResourceRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"description",
                    	            		lv_description_11_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleResource5318); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getResourceAccess().getSemicolonKeyword_2_1_1_1_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2104:4: ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2104:4: ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2105:5: {...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2105:109: ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2106:6: ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2109:6: ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2109:7: {...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2109:16: (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2109:18: otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';'
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleResource5386); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getResourceAccess().getColorKeyword_2_1_1_2_0());
                    	        
                    	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleResource5398); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getResourceAccess().getEqualsSignKeyword_2_1_1_2_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2117:1: ( (lv_fillColor_15_0= ruleColor ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2118:1: (lv_fillColor_15_0= ruleColor )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2118:1: (lv_fillColor_15_0= ruleColor )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2119:3: lv_fillColor_15_0= ruleColor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getResourceAccess().getFillColorColorEnumRuleCall_2_1_1_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleColor_in_ruleResource5419);
                    	    lv_fillColor_15_0=ruleColor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"fillColor",
                    	            		lv_fillColor_15_0, 
                    	            		"Color");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleResource5431); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getResourceAccess().getSemicolonKeyword_2_1_1_2_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2146:4: ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2146:4: ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2147:5: {...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 3)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2147:109: ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2148:6: ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 3);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2151:6: ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2151:7: {...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2151:16: (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2151:18: otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';'
                    	    {
                    	    otherlv_17=(Token)match(input,23,FOLLOW_23_in_ruleResource5499); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getResourceAccess().getDecompositionTypeKeyword_2_1_1_3_0());
                    	        
                    	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleResource5511); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getResourceAccess().getEqualsSignKeyword_2_1_1_3_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2159:1: ( (lv_decompositionType_19_0= ruleDecompositionType ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2160:1: (lv_decompositionType_19_0= ruleDecompositionType )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2160:1: (lv_decompositionType_19_0= ruleDecompositionType )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2161:3: lv_decompositionType_19_0= ruleDecompositionType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getResourceAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_1_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleResource5532);
                    	    lv_decompositionType_19_0=ruleDecompositionType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"decompositionType",
                    	            		lv_decompositionType_19_0, 
                    	            		"DecompositionType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleResource5544); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getResourceAccess().getSemicolonKeyword_2_1_1_3_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2188:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2188:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2189:5: {...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 4)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2189:109: ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2190:6: ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 4);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2193:6: ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2193:7: {...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2193:16: ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2193:17: ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';'
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2193:17: ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) )
                    	    int alt30=2;
                    	    int LA30_0 = input.LA(1);

                    	    if ( ((LA30_0>=56 && LA30_0<=59)) ) {
                    	        alt30=1;
                    	    }
                    	    else if ( (LA30_0==RULE_INT) ) {
                    	        alt30=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 30, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt30) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2193:18: ( (lv_importance_21_0= ruleImportanceType ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2193:18: ( (lv_importance_21_0= ruleImportanceType ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2194:1: (lv_importance_21_0= ruleImportanceType )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2194:1: (lv_importance_21_0= ruleImportanceType )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2195:3: lv_importance_21_0= ruleImportanceType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getResourceAccess().getImportanceImportanceTypeEnumRuleCall_2_1_1_4_0_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImportanceType_in_ruleResource5622);
                    	            lv_importance_21_0=ruleImportanceType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getResourceRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"importance",
                    	                    		lv_importance_21_0, 
                    	                    		"ImportanceType");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2212:6: ( (lv_importanceQuantitative_22_0= RULE_INT ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2212:6: ( (lv_importanceQuantitative_22_0= RULE_INT ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2213:1: (lv_importanceQuantitative_22_0= RULE_INT )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2213:1: (lv_importanceQuantitative_22_0= RULE_INT )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2214:3: lv_importanceQuantitative_22_0= RULE_INT
                    	            {
                    	            lv_importanceQuantitative_22_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResource5645); 

                    	            			newLeafNode(lv_importanceQuantitative_22_0, grammarAccess.getResourceAccess().getImportanceQuantitativeINTTerminalRuleCall_2_1_1_4_0_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getResourceRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"importanceQuantitative",
                    	                    		lv_importanceQuantitative_22_0, 
                    	                    		"INT");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_23=(Token)match(input,17,FOLLOW_17_in_ruleResource5663); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getResourceAccess().getSemicolonKeyword_2_1_1_4_1());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2241:4: ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2241:4: ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2242:5: {...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 5)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2242:109: ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2243:6: ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 5);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2246:6: ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+
                    	    int cnt31=0;
                    	    loop31:
                    	    do {
                    	        int alt31=2;
                    	        int LA31_0 = input.LA(1);

                    	        if ( (LA31_0==51) ) {
                    	            int LA31_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt31=1;
                    	            }


                    	        }


                    	        switch (alt31) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2246:7: {...}? => ( (lv_metaData_24_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleResource", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2246:16: ( (lv_metaData_24_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2247:1: (lv_metaData_24_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2247:1: (lv_metaData_24_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2248:3: lv_metaData_24_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getResourceAccess().getMetaDataMetadataParserRuleCall_2_1_1_5_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleResource5739);
                    	    	    lv_metaData_24_0=ruleMetadata();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"metaData",
                    	    	            		lv_metaData_24_0, 
                    	    	            		"Metadata");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt31 >= 1 ) break loop31;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(31, input);
                    	                throw eee;
                    	        }
                    	        cnt31++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2271:4: ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2271:4: ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2272:5: {...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 6)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2272:109: ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2273:6: ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 6);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2276:6: ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+
                    	    int cnt32=0;
                    	    loop32:
                    	    do {
                    	        int alt32=2;
                    	        switch ( input.LA(1) ) {
                    	        case 29:
                    	            {
                    	            int LA32_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt32=1;
                    	            }


                    	            }
                    	            break;
                    	        case 31:
                    	            {
                    	            int LA32_3 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt32=1;
                    	            }


                    	            }
                    	            break;
                    	        case 32:
                    	            {
                    	            int LA32_4 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt32=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ID:
                    	            {
                    	            int LA32_5 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt32=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt32) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2276:7: {...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleResource", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2276:16: ( (lv_elementLinks_25_0= ruleInLineElementLink ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2277:1: (lv_elementLinks_25_0= ruleInLineElementLink )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2277:1: (lv_elementLinks_25_0= ruleInLineElementLink )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2278:3: lv_elementLinks_25_0= ruleInLineElementLink
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getResourceAccess().getElementLinksInLineElementLinkParserRuleCall_2_1_1_6_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleResource5815);
                    	    	    lv_elementLinks_25_0=ruleInLineElementLink();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"elementLinks",
                    	    	            		lv_elementLinks_25_0, 
                    	    	            		"InLineElementLink");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt32 >= 1 ) break loop32;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(32, input);
                    	                throw eee;
                    	        }
                    	        cnt32++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleResource5868); 

                        	newLeafNode(otherlv_26, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "entryRuleIndicator"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2320:1: entryRuleIndicator returns [EObject current=null] : iv_ruleIndicator= ruleIndicator EOF ;
    public final EObject entryRuleIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicator = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2321:2: (iv_ruleIndicator= ruleIndicator EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2322:2: iv_ruleIndicator= ruleIndicator EOF
            {
             newCompositeNode(grammarAccess.getIndicatorRule()); 
            pushFollow(FOLLOW_ruleIndicator_in_entryRuleIndicator5906);
            iv_ruleIndicator=ruleIndicator();

            state._fsp--;

             current =iv_ruleIndicator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndicator5916); 

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
    // $ANTLR end "entryRuleIndicator"


    // $ANTLR start "ruleIndicator"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2329:1: ruleIndicator returns [EObject current=null] : (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) ) ;
    public final EObject ruleIndicator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token lv_importanceQuantitative_22_0=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Enumerator lv_fillColor_15_0 = null;

        Enumerator lv_decompositionType_19_0 = null;

        Enumerator lv_importance_21_0 = null;

        EObject lv_metaData_24_0 = null;

        EObject lv_elementLinks_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2332:28: ( (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2333:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2333:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2333:3: otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleIndicator5953); 

                	newLeafNode(otherlv_0, grammarAccess.getIndicatorAccess().getIndicatorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2337:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2338:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2338:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2339:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator5970); 

            			newLeafNode(lv_name_1_0, grammarAccess.getIndicatorAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIndicatorRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2355:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==17) ) {
                alt39=1;
            }
            else if ( (LA39_0==14) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2355:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleIndicator5988); 

                        	newLeafNode(otherlv_2, grammarAccess.getIndicatorAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2360:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2360:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2360:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_26= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleIndicator6007); 

                        	newLeafNode(otherlv_3, grammarAccess.getIndicatorAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2364:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2366:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2366:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2367:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2370:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2371:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2371:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) ) )*
                    loop38:
                    do {
                        int alt38=8;
                        int LA38_0 = input.LA(1);

                        if ( LA38_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt38=1;
                        }
                        else if ( LA38_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt38=2;
                        }
                        else if ( LA38_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt38=3;
                        }
                        else if ( LA38_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 3) ) {
                            alt38=4;
                        }
                        else if ( (LA38_0==RULE_INT|| LA38_0 >=56 && LA38_0<=59) && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 4) ) {
                            alt38=5;
                        }
                        else if ( LA38_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 5) ) {
                            alt38=6;
                        }
                        else if ( (LA38_0==RULE_ID||LA38_0==29|| LA38_0 >=31 && LA38_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 6) ) {
                            alt38=7;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2373:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2373:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2374:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2374:110: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2375:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2378:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2378:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2378:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2378:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleIndicator6065); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getIndicatorAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6077); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2386:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2387:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2387:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2388:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator6094); 

                    	    			newLeafNode(lv_label_7_0, grammarAccess.getIndicatorAccess().getLabelSTRINGTerminalRuleCall_2_1_1_0_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getIndicatorRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"label",
                    	            		lv_label_7_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleIndicator6111); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getIndicatorAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2415:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2415:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2416:5: {...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2416:110: ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2417:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2420:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2420:7: {...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2420:16: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2420:18: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';'
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleIndicator6179); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getIndicatorAccess().getDescriptionKeyword_2_1_1_1_0());
                    	        
                    	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6191); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_2_1_1_1_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2428:1: ( (lv_description_11_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2429:1: (lv_description_11_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2429:1: (lv_description_11_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2430:3: lv_description_11_0= RULE_STRING
                    	    {
                    	    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator6208); 

                    	    			newLeafNode(lv_description_11_0, grammarAccess.getIndicatorAccess().getDescriptionSTRINGTerminalRuleCall_2_1_1_1_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getIndicatorRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"description",
                    	            		lv_description_11_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleIndicator6225); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getIndicatorAccess().getSemicolonKeyword_2_1_1_1_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2457:4: ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2457:4: ({...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2458:5: {...}? => ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2458:110: ( ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2459:6: ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2462:6: ({...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2462:7: {...}? => (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2462:16: (otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2462:18: otherlv_13= 'color' otherlv_14= '=' ( (lv_fillColor_15_0= ruleColor ) ) otherlv_16= ';'
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleIndicator6293); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getIndicatorAccess().getColorKeyword_2_1_1_2_0());
                    	        
                    	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6305); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_2_1_1_2_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2470:1: ( (lv_fillColor_15_0= ruleColor ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2471:1: (lv_fillColor_15_0= ruleColor )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2471:1: (lv_fillColor_15_0= ruleColor )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2472:3: lv_fillColor_15_0= ruleColor
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getFillColorColorEnumRuleCall_2_1_1_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleColor_in_ruleIndicator6326);
                    	    lv_fillColor_15_0=ruleColor();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"fillColor",
                    	            		lv_fillColor_15_0, 
                    	            		"Color");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleIndicator6338); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getIndicatorAccess().getSemicolonKeyword_2_1_1_2_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2499:4: ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2499:4: ({...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2500:5: {...}? => ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 3)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2500:110: ( ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2501:6: ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 3);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2504:6: ({...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2504:7: {...}? => (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2504:16: (otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2504:18: otherlv_17= 'decompositionType' otherlv_18= '=' ( (lv_decompositionType_19_0= ruleDecompositionType ) ) otherlv_20= ';'
                    	    {
                    	    otherlv_17=(Token)match(input,23,FOLLOW_23_in_ruleIndicator6406); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getIndicatorAccess().getDecompositionTypeKeyword_2_1_1_3_0());
                    	        
                    	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6418); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_2_1_1_3_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2512:1: ( (lv_decompositionType_19_0= ruleDecompositionType ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2513:1: (lv_decompositionType_19_0= ruleDecompositionType )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2513:1: (lv_decompositionType_19_0= ruleDecompositionType )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2514:3: lv_decompositionType_19_0= ruleDecompositionType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_1_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleIndicator6439);
                    	    lv_decompositionType_19_0=ruleDecompositionType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"decompositionType",
                    	            		lv_decompositionType_19_0, 
                    	            		"DecompositionType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleIndicator6451); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getIndicatorAccess().getSemicolonKeyword_2_1_1_3_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2541:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2541:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2542:5: {...}? => ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 4)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2542:110: ( ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2543:6: ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 4);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2546:6: ({...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2546:7: {...}? => ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2546:16: ( ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2546:17: ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) ) otherlv_23= ';'
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2546:17: ( ( (lv_importance_21_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_22_0= RULE_INT ) ) )
                    	    int alt35=2;
                    	    int LA35_0 = input.LA(1);

                    	    if ( ((LA35_0>=56 && LA35_0<=59)) ) {
                    	        alt35=1;
                    	    }
                    	    else if ( (LA35_0==RULE_INT) ) {
                    	        alt35=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 35, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt35) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2546:18: ( (lv_importance_21_0= ruleImportanceType ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2546:18: ( (lv_importance_21_0= ruleImportanceType ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2547:1: (lv_importance_21_0= ruleImportanceType )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2547:1: (lv_importance_21_0= ruleImportanceType )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2548:3: lv_importance_21_0= ruleImportanceType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getIndicatorAccess().getImportanceImportanceTypeEnumRuleCall_2_1_1_4_0_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImportanceType_in_ruleIndicator6529);
                    	            lv_importance_21_0=ruleImportanceType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"importance",
                    	                    		lv_importance_21_0, 
                    	                    		"ImportanceType");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2565:6: ( (lv_importanceQuantitative_22_0= RULE_INT ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2565:6: ( (lv_importanceQuantitative_22_0= RULE_INT ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2566:1: (lv_importanceQuantitative_22_0= RULE_INT )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2566:1: (lv_importanceQuantitative_22_0= RULE_INT )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2567:3: lv_importanceQuantitative_22_0= RULE_INT
                    	            {
                    	            lv_importanceQuantitative_22_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIndicator6552); 

                    	            			newLeafNode(lv_importanceQuantitative_22_0, grammarAccess.getIndicatorAccess().getImportanceQuantitativeINTTerminalRuleCall_2_1_1_4_0_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getIndicatorRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"importanceQuantitative",
                    	                    		lv_importanceQuantitative_22_0, 
                    	                    		"INT");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_23=(Token)match(input,17,FOLLOW_17_in_ruleIndicator6570); 

                    	        	newLeafNode(otherlv_23, grammarAccess.getIndicatorAccess().getSemicolonKeyword_2_1_1_4_1());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2594:4: ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2594:4: ({...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2595:5: {...}? => ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 5)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2595:110: ( ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2596:6: ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 5);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2599:6: ({...}? => ( (lv_metaData_24_0= ruleMetadata ) ) )+
                    	    int cnt36=0;
                    	    loop36:
                    	    do {
                    	        int alt36=2;
                    	        int LA36_0 = input.LA(1);

                    	        if ( (LA36_0==51) ) {
                    	            int LA36_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt36=1;
                    	            }


                    	        }


                    	        switch (alt36) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2599:7: {...}? => ( (lv_metaData_24_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2599:16: ( (lv_metaData_24_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2600:1: (lv_metaData_24_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2600:1: (lv_metaData_24_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2601:3: lv_metaData_24_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getMetaDataMetadataParserRuleCall_2_1_1_5_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleIndicator6646);
                    	    	    lv_metaData_24_0=ruleMetadata();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"metaData",
                    	    	            		lv_metaData_24_0, 
                    	    	            		"Metadata");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt36 >= 1 ) break loop36;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(36, input);
                    	                throw eee;
                    	        }
                    	        cnt36++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 7 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2624:4: ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2624:4: ({...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2625:5: {...}? => ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 6) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 6)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2625:110: ( ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2626:6: ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 6);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2629:6: ({...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) ) )+
                    	    int cnt37=0;
                    	    loop37:
                    	    do {
                    	        int alt37=2;
                    	        switch ( input.LA(1) ) {
                    	        case 29:
                    	            {
                    	            int LA37_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt37=1;
                    	            }


                    	            }
                    	            break;
                    	        case 31:
                    	            {
                    	            int LA37_3 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt37=1;
                    	            }


                    	            }
                    	            break;
                    	        case 32:
                    	            {
                    	            int LA37_4 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt37=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ID:
                    	            {
                    	            int LA37_5 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt37=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt37) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2629:7: {...}? => ( (lv_elementLinks_25_0= ruleInLineElementLink ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2629:16: ( (lv_elementLinks_25_0= ruleInLineElementLink ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2630:1: (lv_elementLinks_25_0= ruleInLineElementLink )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2630:1: (lv_elementLinks_25_0= ruleInLineElementLink )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2631:3: lv_elementLinks_25_0= ruleInLineElementLink
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getElementLinksInLineElementLinkParserRuleCall_2_1_1_6_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleIndicator6722);
                    	    	    lv_elementLinks_25_0=ruleInLineElementLink();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"elementLinks",
                    	    	            		lv_elementLinks_25_0, 
                    	    	            		"InLineElementLink");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt37 >= 1 ) break loop37;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(37, input);
                    	                throw eee;
                    	        }
                    	        cnt37++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop38;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleIndicator6775); 

                        	newLeafNode(otherlv_26, grammarAccess.getIndicatorAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // $ANTLR end "ruleIndicator"


    // $ANTLR start "entryRuleBelief"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2673:1: entryRuleBelief returns [EObject current=null] : iv_ruleBelief= ruleBelief EOF ;
    public final EObject entryRuleBelief() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelief = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2674:2: (iv_ruleBelief= ruleBelief EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2675:2: iv_ruleBelief= ruleBelief EOF
            {
             newCompositeNode(grammarAccess.getBeliefRule()); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief6813);
            iv_ruleBelief=ruleBelief();

            state._fsp--;

             current =iv_ruleBelief; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief6823); 

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
    // $ANTLR end "entryRuleBelief"


    // $ANTLR start "ruleBelief"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2682:1: ruleBelief returns [EObject current=null] : (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* ) ) ) otherlv_13= '}' ) ) ) ;
    public final EObject ruleBelief() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_label_7_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_description_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject lv_metaData_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2685:28: ( (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* ) ) ) otherlv_13= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2686:1: (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* ) ) ) otherlv_13= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2686:1: (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* ) ) ) otherlv_13= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2686:3: otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* ) ) ) otherlv_13= '}' ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleBelief6860); 

                	newLeafNode(otherlv_0, grammarAccess.getBeliefAccess().getBeliefKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2690:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2691:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2691:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2692:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBelief6877); 

            			newLeafNode(lv_name_1_0, grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBeliefRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2708:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* ) ) ) otherlv_13= '}' ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==17) ) {
                alt42=1;
            }
            else if ( (LA42_0==14) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2708:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleBelief6895); 

                        	newLeafNode(otherlv_2, grammarAccess.getBeliefAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2713:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* ) ) ) otherlv_13= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2713:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* ) ) ) otherlv_13= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2713:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* ) ) ) otherlv_13= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleBelief6914); 

                        	newLeafNode(otherlv_3, grammarAccess.getBeliefAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2717:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2719:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2719:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2720:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2723:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2724:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2724:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) )*
                    loop41:
                    do {
                        int alt41=4;
                        int LA41_0 = input.LA(1);

                        if ( LA41_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt41=1;
                        }
                        else if ( LA41_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt41=2;
                        }
                        else if ( LA41_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt41=3;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2726:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2726:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2727:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2727:107: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2728:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2731:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2731:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleBelief", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2731:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2731:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleBelief6972); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getBeliefAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleBelief6984); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getBeliefAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2739:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2740:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2740:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2741:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelief7001); 

                    	    			newLeafNode(lv_label_7_0, grammarAccess.getBeliefAccess().getLabelSTRINGTerminalRuleCall_2_1_1_0_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getBeliefRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"label",
                    	            		lv_label_7_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleBelief7018); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getBeliefAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2768:4: ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2768:4: ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2769:5: {...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2769:107: ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2770:6: ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2773:6: ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+
                    	    int cnt40=0;
                    	    loop40:
                    	    do {
                    	        int alt40=2;
                    	        int LA40_0 = input.LA(1);

                    	        if ( (LA40_0==51) ) {
                    	            int LA40_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt40=1;
                    	            }


                    	        }


                    	        switch (alt40) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2773:7: {...}? => ( (lv_metaData_9_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleBelief", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2773:16: ( (lv_metaData_9_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2774:1: (lv_metaData_9_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2774:1: (lv_metaData_9_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2775:3: lv_metaData_9_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getBeliefAccess().getMetaDataMetadataParserRuleCall_2_1_1_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleBelief7094);
                    	    	    lv_metaData_9_0=ruleMetadata();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getBeliefRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"metaData",
                    	    	            		lv_metaData_9_0, 
                    	    	            		"Metadata");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt40 >= 1 ) break loop40;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(40, input);
                    	                throw eee;
                    	        }
                    	        cnt40++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2798:4: ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2798:4: ({...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2799:5: {...}? => ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2799:107: ( ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2800:6: ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2803:6: ({...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2803:7: {...}? => (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleBelief", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2803:16: (otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2803:18: otherlv_10= 'description' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';'
                    	    {
                    	    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleBelief7162); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getBeliefAccess().getDescriptionKeyword_2_1_1_2_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2807:1: ( (lv_description_11_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2808:1: (lv_description_11_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2808:1: (lv_description_11_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2809:3: lv_description_11_0= RULE_STRING
                    	    {
                    	    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelief7179); 

                    	    			newLeafNode(lv_description_11_0, grammarAccess.getBeliefAccess().getDescriptionSTRINGTerminalRuleCall_2_1_1_2_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getBeliefRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"description",
                    	            		lv_description_11_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleBelief7196); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getBeliefAccess().getSemicolonKeyword_2_1_1_2_2());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_13=(Token)match(input,15,FOLLOW_15_in_ruleBelief7249); 

                        	newLeafNode(otherlv_13, grammarAccess.getBeliefAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // $ANTLR end "ruleBelief"


    // $ANTLR start "entryRuleDecomposition"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2855:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2856:2: (iv_ruleDecomposition= ruleDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2857:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             newCompositeNode(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition7287);
            iv_ruleDecomposition=ruleDecomposition();

            state._fsp--;

             current =iv_ruleDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition7297); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2864:1: ruleDecomposition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2867:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2868:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2868:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2868:2: ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2868:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2869:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2869:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2870:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecompositionAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecomposition7345);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleDecomposition7357); 

                	newLeafNode(otherlv_1, grammarAccess.getDecompositionAccess().getDecomposedByKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2887:1: ( (lv_dest_2_0= ruleDecompositionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2888:1: (lv_dest_2_0= ruleDecompositionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2888:1: (lv_dest_2_0= ruleDecompositionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2889:3: lv_dest_2_0= ruleDecompositionEnd
            {
             
            	        newCompositeNode(grammarAccess.getDecompositionAccess().getDestDecompositionEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleDecomposition7378);
            lv_dest_2_0=ruleDecompositionEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDecompositionRule());
            	        }
                   		add(
                   			current, 
                   			"dest",
                    		lv_dest_2_0, 
                    		"DecompositionEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2905:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==30) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2905:4: otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDecomposition7391); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDecompositionAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2909:1: ( (lv_dest_4_0= ruleDecompositionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2910:1: (lv_dest_4_0= ruleDecompositionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2910:1: (lv_dest_4_0= ruleDecompositionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2911:3: lv_dest_4_0= ruleDecompositionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDecompositionAccess().getDestDecompositionEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleDecomposition7412);
            	    lv_dest_4_0=ruleDecompositionEnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDecompositionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dest",
            	            		lv_dest_4_0, 
            	            		"DecompositionEnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleDecomposition7426); 

                	newLeafNode(otherlv_5, grammarAccess.getDecompositionAccess().getSemicolonKeyword_4());
                

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


    // $ANTLR start "entryRuleInLineDecomposition"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2939:1: entryRuleInLineDecomposition returns [EObject current=null] : iv_ruleInLineDecomposition= ruleInLineDecomposition EOF ;
    public final EObject entryRuleInLineDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2940:2: (iv_ruleInLineDecomposition= ruleInLineDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2941:2: iv_ruleInLineDecomposition= ruleInLineDecomposition EOF
            {
             newCompositeNode(grammarAccess.getInLineDecompositionRule()); 
            pushFollow(FOLLOW_ruleInLineDecomposition_in_entryRuleInLineDecomposition7462);
            iv_ruleInLineDecomposition=ruleInLineDecomposition();

            state._fsp--;

             current =iv_ruleInLineDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineDecomposition7472); 

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
    // $ANTLR end "entryRuleInLineDecomposition"


    // $ANTLR start "ruleInLineDecomposition"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2948:1: ruleInLineDecomposition returns [EObject current=null] : (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2951:28: ( (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2952:1: (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2952:1: (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2952:3: otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleInLineDecomposition7509); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineDecompositionAccess().getDecomposedByKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2956:1: ( (lv_dest_1_0= ruleDecompositionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2957:1: (lv_dest_1_0= ruleDecompositionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2957:1: (lv_dest_1_0= ruleDecompositionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2958:3: lv_dest_1_0= ruleDecompositionEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineDecompositionAccess().getDestDecompositionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition7530);
            lv_dest_1_0=ruleDecompositionEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInLineDecompositionRule());
            	        }
                   		add(
                   			current, 
                   			"dest",
                    		lv_dest_1_0, 
                    		"DecompositionEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2974:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==30) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2974:4: otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleInLineDecomposition7543); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineDecompositionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2978:1: ( (lv_dest_3_0= ruleDecompositionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2979:1: (lv_dest_3_0= ruleDecompositionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2979:1: (lv_dest_3_0= ruleDecompositionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2980:3: lv_dest_3_0= ruleDecompositionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineDecompositionAccess().getDestDecompositionEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition7564);
            	    lv_dest_3_0=ruleDecompositionEnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInLineDecompositionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dest",
            	            		lv_dest_3_0, 
            	            		"DecompositionEnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleInLineDecomposition7578); 

                	newLeafNode(otherlv_4, grammarAccess.getInLineDecompositionAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleInLineDecomposition"


    // $ANTLR start "entryRuleDecompositionEnd"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3008:1: entryRuleDecompositionEnd returns [EObject current=null] : iv_ruleDecompositionEnd= ruleDecompositionEnd EOF ;
    public final EObject entryRuleDecompositionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecompositionEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3009:2: (iv_ruleDecompositionEnd= ruleDecompositionEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3010:2: iv_ruleDecompositionEnd= ruleDecompositionEnd EOF
            {
             newCompositeNode(grammarAccess.getDecompositionEndRule()); 
            pushFollow(FOLLOW_ruleDecompositionEnd_in_entryRuleDecompositionEnd7614);
            iv_ruleDecompositionEnd=ruleDecompositionEnd();

            state._fsp--;

             current =iv_ruleDecompositionEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecompositionEnd7624); 

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
    // $ANTLR end "entryRuleDecompositionEnd"


    // $ANTLR start "ruleDecompositionEnd"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3017:1: ruleDecompositionEnd returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) ;
    public final EObject ruleDecompositionEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3020:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3021:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3021:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3021:2: ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3021:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3022:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3022:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3023:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecompositionEndAccess().getNameIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecompositionEnd7672);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3036:2: (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==14) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3036:4: otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDecompositionEnd7685); 

                        	newLeafNode(otherlv_1, grammarAccess.getDecompositionEndAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3040:1: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==RULE_STRING) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3041:1: (lv_description_2_0= RULE_STRING )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3041:1: (lv_description_2_0= RULE_STRING )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3042:3: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecompositionEnd7702); 

                            			newLeafNode(lv_description_2_0, grammarAccess.getDecompositionEndAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDecompositionEndRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_2_0, 
                                    		"STRING");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDecompositionEnd7720); 

                        	newLeafNode(otherlv_3, grammarAccess.getDecompositionEndAccess().getRightCurlyBracketKeyword_1_2());
                        

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
    // $ANTLR end "ruleDecompositionEnd"


    // $ANTLR start "entryRuleContribution"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3070:1: entryRuleContribution returns [EObject current=null] : iv_ruleContribution= ruleContribution EOF ;
    public final EObject entryRuleContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3071:2: (iv_ruleContribution= ruleContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3072:2: iv_ruleContribution= ruleContribution EOF
            {
             newCompositeNode(grammarAccess.getContributionRule()); 
            pushFollow(FOLLOW_ruleContribution_in_entryRuleContribution7758);
            iv_ruleContribution=ruleContribution();

            state._fsp--;

             current =iv_ruleContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContribution7768); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3079:1: ruleContribution returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3082:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3083:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3083:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3083:2: ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3083:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3084:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3084:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3085:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContribution7816);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleContribution7828); 

                	newLeafNode(otherlv_1, grammarAccess.getContributionAccess().getContributeToKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3102:1: ( (lv_dest_2_0= ruleContributionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3103:1: (lv_dest_2_0= ruleContributionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3103:1: (lv_dest_2_0= ruleContributionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3104:3: lv_dest_2_0= ruleContributionEnd
            {
             
            	        newCompositeNode(grammarAccess.getContributionAccess().getDestContributionEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleContributionEnd_in_ruleContribution7849);
            lv_dest_2_0=ruleContributionEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContributionRule());
            	        }
                   		add(
                   			current, 
                   			"dest",
                    		lv_dest_2_0, 
                    		"ContributionEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3120:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==30) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3120:4: otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleContribution7862); 

            	        	newLeafNode(otherlv_3, grammarAccess.getContributionAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3124:1: ( (lv_dest_4_0= ruleContributionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3125:1: (lv_dest_4_0= ruleContributionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3125:1: (lv_dest_4_0= ruleContributionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3126:3: lv_dest_4_0= ruleContributionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionAccess().getDestContributionEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionEnd_in_ruleContribution7883);
            	    lv_dest_4_0=ruleContributionEnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContributionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dest",
            	            		lv_dest_4_0, 
            	            		"ContributionEnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleContribution7897); 

                	newLeafNode(otherlv_5, grammarAccess.getContributionAccess().getSemicolonKeyword_4());
                

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


    // $ANTLR start "entryRuleInLineContribution"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3154:1: entryRuleInLineContribution returns [EObject current=null] : iv_ruleInLineContribution= ruleInLineContribution EOF ;
    public final EObject entryRuleInLineContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3155:2: (iv_ruleInLineContribution= ruleInLineContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3156:2: iv_ruleInLineContribution= ruleInLineContribution EOF
            {
             newCompositeNode(grammarAccess.getInLineContributionRule()); 
            pushFollow(FOLLOW_ruleInLineContribution_in_entryRuleInLineContribution7933);
            iv_ruleInLineContribution=ruleInLineContribution();

            state._fsp--;

             current =iv_ruleInLineContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineContribution7943); 

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
    // $ANTLR end "entryRuleInLineContribution"


    // $ANTLR start "ruleInLineContribution"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3163:1: ruleInLineContribution returns [EObject current=null] : (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3166:28: ( (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3167:1: (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3167:1: (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3167:3: otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleInLineContribution7980); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineContributionAccess().getContributeToKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3171:1: ( (lv_dest_1_0= ruleContributionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3172:1: (lv_dest_1_0= ruleContributionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3172:1: (lv_dest_1_0= ruleContributionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3173:3: lv_dest_1_0= ruleContributionEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineContributionAccess().getDestContributionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleContributionEnd_in_ruleInLineContribution8001);
            lv_dest_1_0=ruleContributionEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInLineContributionRule());
            	        }
                   		add(
                   			current, 
                   			"dest",
                    		lv_dest_1_0, 
                    		"ContributionEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3189:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==30) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3189:4: otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleInLineContribution8014); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineContributionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3193:1: ( (lv_dest_3_0= ruleContributionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3194:1: (lv_dest_3_0= ruleContributionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3194:1: (lv_dest_3_0= ruleContributionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3195:3: lv_dest_3_0= ruleContributionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineContributionAccess().getDestContributionEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionEnd_in_ruleInLineContribution8035);
            	    lv_dest_3_0=ruleContributionEnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInLineContributionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dest",
            	            		lv_dest_3_0, 
            	            		"ContributionEnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleInLineContribution8049); 

                	newLeafNode(otherlv_4, grammarAccess.getInLineContributionAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleInLineContribution"


    // $ANTLR start "entryRuleContributionEnd"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3223:1: entryRuleContributionEnd returns [EObject current=null] : iv_ruleContributionEnd= ruleContributionEnd EOF ;
    public final EObject entryRuleContributionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3224:2: (iv_ruleContributionEnd= ruleContributionEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3225:2: iv_ruleContributionEnd= ruleContributionEnd EOF
            {
             newCompositeNode(grammarAccess.getContributionEndRule()); 
            pushFollow(FOLLOW_ruleContributionEnd_in_entryRuleContributionEnd8085);
            iv_ruleContributionEnd=ruleContributionEnd();

            state._fsp--;

             current =iv_ruleContributionEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionEnd8095); 

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
    // $ANTLR end "entryRuleContributionEnd"


    // $ANTLR start "ruleContributionEnd"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3232:1: ruleContributionEnd returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ) ;
    public final EObject ruleContributionEnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_quantitativeContribution_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_contribution_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3235:28: ( ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3236:1: ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3236:1: ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3236:2: ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3236:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==RULE_ID) ) {
                int LA49_1 = input.LA(2);

                if ( (LA49_1==RULE_ID) ) {
                    alt49=1;
                }
            }
            switch (alt49) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3237:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3237:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3238:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionEnd8137); 

                    			newLeafNode(lv_name_0_0, grammarAccess.getContributionEndAccess().getNameIDTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContributionEndRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_0_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3254:3: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3255:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3255:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3256:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionEndAccess().getDesnameIntentionalElementCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionEnd8166);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3269:2: (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==14) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3269:4: otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContributionEnd8179); 

                        	newLeafNode(otherlv_2, grammarAccess.getContributionEndAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3273:1: ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )?
                    int alt50=3;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=63 && LA50_0<=69)) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==RULE_INT) ) {
                        alt50=2;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3273:2: ( (lv_contribution_3_0= ruleContributionType ) )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3273:2: ( (lv_contribution_3_0= ruleContributionType ) )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3274:1: (lv_contribution_3_0= ruleContributionType )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3274:1: (lv_contribution_3_0= ruleContributionType )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3275:3: lv_contribution_3_0= ruleContributionType
                            {
                             
                            	        newCompositeNode(grammarAccess.getContributionEndAccess().getContributionContributionTypeEnumRuleCall_2_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContributionType_in_ruleContributionEnd8201);
                            lv_contribution_3_0=ruleContributionType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getContributionEndRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"contribution",
                                    		lv_contribution_3_0, 
                                    		"ContributionType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3292:6: ( (lv_quantitativeContribution_4_0= RULE_INT ) )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3292:6: ( (lv_quantitativeContribution_4_0= RULE_INT ) )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3293:1: (lv_quantitativeContribution_4_0= RULE_INT )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3293:1: (lv_quantitativeContribution_4_0= RULE_INT )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3294:3: lv_quantitativeContribution_4_0= RULE_INT
                            {
                            lv_quantitativeContribution_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionEnd8224); 

                            			newLeafNode(lv_quantitativeContribution_4_0, grammarAccess.getContributionEndAccess().getQuantitativeContributionINTTerminalRuleCall_2_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getContributionEndRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"quantitativeContribution",
                                    		lv_quantitativeContribution_4_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleContributionEnd8243); 

                        	newLeafNode(otherlv_5, grammarAccess.getContributionEndAccess().getRightCurlyBracketKeyword_2_2());
                        

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
    // $ANTLR end "ruleContributionEnd"


    // $ANTLR start "entryRuleDependency"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3322:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3323:2: (iv_ruleDependency= ruleDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3324:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency8281);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency8291); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3331:1: ruleDependency returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3334:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3335:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3335:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3335:2: ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3335:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3336:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3336:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3337:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependency8339);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleDependency8351); 

                	newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getDependOnKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3354:1: ( (lv_dest_2_0= ruleDependencyEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3355:1: (lv_dest_2_0= ruleDependencyEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3355:1: (lv_dest_2_0= ruleDependencyEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3356:3: lv_dest_2_0= ruleDependencyEnd
            {
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getDestDependencyEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyEnd_in_ruleDependency8372);
            lv_dest_2_0=ruleDependencyEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDependencyRule());
            	        }
                   		add(
                   			current, 
                   			"dest",
                    		lv_dest_2_0, 
                    		"DependencyEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3372:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==30) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3372:4: otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDependency8385); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3376:1: ( (lv_dest_4_0= ruleDependencyEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3377:1: (lv_dest_4_0= ruleDependencyEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3377:1: (lv_dest_4_0= ruleDependencyEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3378:3: lv_dest_4_0= ruleDependencyEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependencyAccess().getDestDependencyEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyEnd_in_ruleDependency8406);
            	    lv_dest_4_0=ruleDependencyEnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDependencyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dest",
            	            		lv_dest_4_0, 
            	            		"DependencyEnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleDependency8420); 

                	newLeafNode(otherlv_5, grammarAccess.getDependencyAccess().getSemicolonKeyword_4());
                

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


    // $ANTLR start "entryRuleInLineDependency"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3406:1: entryRuleInLineDependency returns [EObject current=null] : iv_ruleInLineDependency= ruleInLineDependency EOF ;
    public final EObject entryRuleInLineDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3407:2: (iv_ruleInLineDependency= ruleInLineDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3408:2: iv_ruleInLineDependency= ruleInLineDependency EOF
            {
             newCompositeNode(grammarAccess.getInLineDependencyRule()); 
            pushFollow(FOLLOW_ruleInLineDependency_in_entryRuleInLineDependency8456);
            iv_ruleInLineDependency=ruleInLineDependency();

            state._fsp--;

             current =iv_ruleInLineDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineDependency8466); 

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
    // $ANTLR end "entryRuleInLineDependency"


    // $ANTLR start "ruleInLineDependency"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3415:1: ruleInLineDependency returns [EObject current=null] : (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3418:28: ( (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3419:1: (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3419:1: (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3419:3: otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleInLineDependency8503); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineDependencyAccess().getDependOnKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3423:1: ( (lv_dest_1_0= ruleDependencyEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3424:1: (lv_dest_1_0= ruleDependencyEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3424:1: (lv_dest_1_0= ruleDependencyEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3425:3: lv_dest_1_0= ruleDependencyEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineDependencyAccess().getDestDependencyEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyEnd_in_ruleInLineDependency8524);
            lv_dest_1_0=ruleDependencyEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInLineDependencyRule());
            	        }
                   		add(
                   			current, 
                   			"dest",
                    		lv_dest_1_0, 
                    		"DependencyEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3441:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==30) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3441:4: otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleInLineDependency8537); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineDependencyAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3445:1: ( (lv_dest_3_0= ruleDependencyEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3446:1: (lv_dest_3_0= ruleDependencyEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3446:1: (lv_dest_3_0= ruleDependencyEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3447:3: lv_dest_3_0= ruleDependencyEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineDependencyAccess().getDestDependencyEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyEnd_in_ruleInLineDependency8558);
            	    lv_dest_3_0=ruleDependencyEnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInLineDependencyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"dest",
            	            		lv_dest_3_0, 
            	            		"DependencyEnd");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleInLineDependency8572); 

                	newLeafNode(otherlv_4, grammarAccess.getInLineDependencyAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleInLineDependency"


    // $ANTLR start "entryRuleDependencyEnd"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3475:1: entryRuleDependencyEnd returns [EObject current=null] : iv_ruleDependencyEnd= ruleDependencyEnd EOF ;
    public final EObject entryRuleDependencyEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3476:2: (iv_ruleDependencyEnd= ruleDependencyEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3477:2: iv_ruleDependencyEnd= ruleDependencyEnd EOF
            {
             newCompositeNode(grammarAccess.getDependencyEndRule()); 
            pushFollow(FOLLOW_ruleDependencyEnd_in_entryRuleDependencyEnd8608);
            iv_ruleDependencyEnd=ruleDependencyEnd();

            state._fsp--;

             current =iv_ruleDependencyEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyEnd8618); 

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
    // $ANTLR end "entryRuleDependencyEnd"


    // $ANTLR start "ruleDependencyEnd"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3484:1: ruleDependencyEnd returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) ;
    public final EObject ruleDependencyEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3487:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3488:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3488:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3488:2: ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3488:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3489:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3489:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3490:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyEndAccess().getNameIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependencyEnd8666);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3503:2: (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==14) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3503:4: otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDependencyEnd8679); 

                        	newLeafNode(otherlv_1, grammarAccess.getDependencyEndAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3507:1: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==RULE_STRING) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3508:1: (lv_description_2_0= RULE_STRING )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3508:1: (lv_description_2_0= RULE_STRING )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3509:3: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependencyEnd8696); 

                            			newLeafNode(lv_description_2_0, grammarAccess.getDependencyEndAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDependencyEndRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_2_0, 
                                    		"STRING");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDependencyEnd8714); 

                        	newLeafNode(otherlv_3, grammarAccess.getDependencyEndAccess().getRightCurlyBracketKeyword_1_2());
                        

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
    // $ANTLR end "ruleDependencyEnd"


    // $ANTLR start "entryRuleStrategyGroup"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3537:1: entryRuleStrategyGroup returns [EObject current=null] : iv_ruleStrategyGroup= ruleStrategyGroup EOF ;
    public final EObject entryRuleStrategyGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategyGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3538:2: (iv_ruleStrategyGroup= ruleStrategyGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3539:2: iv_ruleStrategyGroup= ruleStrategyGroup EOF
            {
             newCompositeNode(grammarAccess.getStrategyGroupRule()); 
            pushFollow(FOLLOW_ruleStrategyGroup_in_entryRuleStrategyGroup8752);
            iv_ruleStrategyGroup=ruleStrategyGroup();

            state._fsp--;

             current =iv_ruleStrategyGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrategyGroup8762); 

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
    // $ANTLR end "entryRuleStrategyGroup"


    // $ANTLR start "ruleStrategyGroup"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3546:1: ruleStrategyGroup returns [EObject current=null] : (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleStrategyGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3549:28: ( (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3550:1: (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3550:1: (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3550:3: otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleStrategyGroup8799); 

                	newLeafNode(otherlv_0, grammarAccess.getStrategyGroupAccess().getStrategyGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3554:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3555:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3555:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3556:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStrategyGroup8816); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStrategyGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStrategyGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleStrategyGroup8833); 

                	newLeafNode(otherlv_2, grammarAccess.getStrategyGroupAccess().getIncludesKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3576:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3577:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3577:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3578:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStrategyGroupRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStrategyGroupAccess().getStrategiesEvaluationStrategyCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8856);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3591:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==30) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3591:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleStrategyGroup8869); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStrategyGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3595:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3596:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3596:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3597:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStrategyGroupRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getStrategyGroupAccess().getStrategiesEvaluationStrategyCrossReference_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8892);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleStrategyGroup8906); 

                	newLeafNode(otherlv_6, grammarAccess.getStrategyGroupAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleStrategyGroup"


    // $ANTLR start "entryRuleEvaluationStrategy"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3622:1: entryRuleEvaluationStrategy returns [EObject current=null] : iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF ;
    public final EObject entryRuleEvaluationStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationStrategy = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3623:2: (iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3624:2: iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF
            {
             newCompositeNode(grammarAccess.getEvaluationStrategyRule()); 
            pushFollow(FOLLOW_ruleEvaluationStrategy_in_entryRuleEvaluationStrategy8942);
            iv_ruleEvaluationStrategy=ruleEvaluationStrategy();

            state._fsp--;

             current =iv_ruleEvaluationStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationStrategy8952); 

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
    // $ANTLR end "entryRuleEvaluationStrategy"


    // $ANTLR start "ruleEvaluationStrategy"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3631:1: ruleEvaluationStrategy returns [EObject current=null] : (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) ;
    public final EObject ruleEvaluationStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_metaData_8_0 = null;

        EObject lv_evaluations_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3634:28: ( (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3635:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3635:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3635:3: otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleEvaluationStrategy8989); 

                	newLeafNode(otherlv_0, grammarAccess.getEvaluationStrategyAccess().getStrategyKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3639:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3640:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3640:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3641:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvaluationStrategy9006); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEvaluationStrategyAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3657:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==36) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3657:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleEvaluationStrategy9024); 

                        	newLeafNode(otherlv_2, grammarAccess.getEvaluationStrategyAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3661:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3662:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3662:1: ( ruleQualifiedName )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3663:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getSuperStrategiesEvaluationStrategyCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy9047);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3676:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==30) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3676:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleEvaluationStrategy9060); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getEvaluationStrategyAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3680:1: ( ( ruleQualifiedName ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3681:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3681:1: ( ruleQualifiedName )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3682:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getSuperStrategiesEvaluationStrategyCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy9083);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEvaluationStrategy9099); 

                	newLeafNode(otherlv_6, grammarAccess.getEvaluationStrategyAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3699:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3701:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3701:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3702:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3705:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3706:3: ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3706:3: ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )*
            loop61:
            do {
                int alt61=3;
                int LA61_0 = input.LA(1);

                if ( LA61_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 0) ) {
                    alt61=1;
                }
                else if ( LA61_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 1) ) {
                    alt61=2;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3708:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3708:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3709:5: {...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationStrategy", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3709:115: ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3710:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3713:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
            	    int cnt59=0;
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==51) ) {
            	            int LA59_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt59=1;
            	            }


            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3713:7: {...}? => ( (lv_metaData_8_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleEvaluationStrategy", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3713:16: ( (lv_metaData_8_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3714:1: (lv_metaData_8_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3714:1: (lv_metaData_8_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3715:3: lv_metaData_8_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getMetaDataMetadataParserRuleCall_4_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleEvaluationStrategy9165);
            	    	    lv_metaData_8_0=ruleMetadata();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getEvaluationStrategyRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"metaData",
            	    	            		lv_metaData_8_0, 
            	    	            		"Metadata");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt59 >= 1 ) break loop59;
            	                EarlyExitException eee =
            	                    new EarlyExitException(59, input);
            	                throw eee;
            	        }
            	        cnt59++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3738:4: ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3738:4: ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3739:5: {...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationStrategy", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3739:115: ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3740:6: ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3743:6: ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+
            	    int cnt60=0;
            	    loop60:
            	    do {
            	        int alt60=2;
            	        int LA60_0 = input.LA(1);

            	        if ( (LA60_0==RULE_ID) ) {
            	            int LA60_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt60=1;
            	            }


            	        }


            	        switch (alt60) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3743:7: {...}? => ( (lv_evaluations_9_0= ruleEvaluation ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleEvaluationStrategy", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3743:16: ( (lv_evaluations_9_0= ruleEvaluation ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3744:1: (lv_evaluations_9_0= ruleEvaluation )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3744:1: (lv_evaluations_9_0= ruleEvaluation )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3745:3: lv_evaluations_9_0= ruleEvaluation
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getEvaluationsEvaluationParserRuleCall_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleEvaluation_in_ruleEvaluationStrategy9241);
            	    	    lv_evaluations_9_0=ruleEvaluation();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getEvaluationStrategyRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"evaluations",
            	    	            		lv_evaluations_9_0, 
            	    	            		"Evaluation");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt60 >= 1 ) break loop60;
            	                EarlyExitException eee =
            	                    new EarlyExitException(60, input);
            	                throw eee;
            	        }
            	        cnt60++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4());
            	

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEvaluationStrategy9294); 

                	newLeafNode(otherlv_10, grammarAccess.getEvaluationStrategyAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleEvaluationStrategy"


    // $ANTLR start "entryRuleEvaluation"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3787:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3788:2: (iv_ruleEvaluation= ruleEvaluation EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3789:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation9330);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation9340); 

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
    // $ANTLR end "entryRuleEvaluation"


    // $ANTLR start "ruleEvaluation"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3796:1: ruleEvaluation returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) ) ;
    public final EObject ruleEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_evaluation_3_0=null;
        Token otherlv_5=null;
        Token lv_exceeds_6_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_qualitativeEvaluation_2_0 = null;

        EObject lv_evalRange_8_0 = null;

        EObject lv_kpiEvalValueSet_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3799:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3800:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3800:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3800:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3800:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3801:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3801:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3802:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEvaluationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEvaluationAccess().getIntentionalElementIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluation9388);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation9400); 

                	newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3819:1: ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==56||LA62_0==66||(LA62_0>=70 && LA62_0<=74)) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_INT) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3819:2: ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3819:2: ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3820:1: (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3820:1: (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3821:3: lv_qualitativeEvaluation_2_0= ruleQualitativeLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvaluationAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleEvaluation9422);
                    lv_qualitativeEvaluation_2_0=ruleQualitativeLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getEvaluationRule());
                    	        }
                           		set(
                           			current, 
                           			"qualitativeEvaluation",
                            		lv_qualitativeEvaluation_2_0, 
                            		"QualitativeLabel");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3838:6: ( (lv_evaluation_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3838:6: ( (lv_evaluation_3_0= RULE_INT ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3839:1: (lv_evaluation_3_0= RULE_INT )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3839:1: (lv_evaluation_3_0= RULE_INT )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3840:3: lv_evaluation_3_0= RULE_INT
                    {
                    lv_evaluation_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluation9445); 

                    			newLeafNode(lv_evaluation_3_0, grammarAccess.getEvaluationAccess().getEvaluationINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvaluationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"evaluation",
                            		lv_evaluation_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3856:3: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=14 && LA66_0<=15)||(LA66_0>=38 && LA66_0<=46)) ) {
                alt66=1;
            }
            else if ( (LA66_0==17) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3856:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3856:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3858:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3858:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3859:2: ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?)
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3862:2: ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?)
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3863:3: ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3863:3: ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+
                    int cnt65=0;
                    loop65:
                    do {
                        int alt65=4;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==15) ) {
                            int LA65_2 = input.LA(2);

                            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2) ) {
                                alt65=3;
                            }


                        }
                        else if ( LA65_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0) ) {
                            alt65=1;
                        }
                        else if ( LA65_0 >=38 && LA65_0<=40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1) ) {
                            alt65=2;
                        }
                        else if ( LA65_0 >=41 && LA65_0<=46 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2) ) {
                            alt65=3;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3865:4: ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3865:4: ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3866:5: {...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3866:109: ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3867:6: ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3870:6: ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3870:7: {...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3870:16: (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3870:18: otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )?
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEvaluation9510); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3_0_0_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3874:1: ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )?
                    	    int alt63=2;
                    	    int LA63_0 = input.LA(1);

                    	    if ( (LA63_0==37) ) {
                    	        alt63=1;
                    	    }
                    	    switch (alt63) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3874:2: ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';'
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3874:2: ( (lv_exceeds_6_0= 'exceeds' ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3875:1: (lv_exceeds_6_0= 'exceeds' )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3875:1: (lv_exceeds_6_0= 'exceeds' )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3876:3: lv_exceeds_6_0= 'exceeds'
                    	            {
                    	            lv_exceeds_6_0=(Token)match(input,37,FOLLOW_37_in_ruleEvaluation9529); 

                    	                    newLeafNode(lv_exceeds_6_0, grammarAccess.getEvaluationAccess().getExceedsExceedsKeyword_3_0_0_1_0_0());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getEvaluationRule());
                    	            	        }
                    	                   		setWithLastConsumed(current, "exceeds", true, "exceeds");
                    	            	    

                    	            }


                    	            }

                    	            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleEvaluation9554); 

                    	                	newLeafNode(otherlv_7, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_0_0_1_1());
                    	                

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3900:4: ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3900:4: ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3901:5: {...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3901:109: ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3902:6: ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3905:6: ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3905:7: {...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3905:16: ( (lv_evalRange_8_0= ruleEvaluationRange ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3906:1: (lv_evalRange_8_0= ruleEvaluationRange )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3906:1: (lv_evalRange_8_0= ruleEvaluationRange )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3907:3: lv_evalRange_8_0= ruleEvaluationRange
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getEvalRangeEvaluationRangeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvaluationRange_in_ruleEvaluation9632);
                    	    lv_evalRange_8_0=ruleEvaluationRange();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getEvaluationRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"evalRange",
                    	            		lv_evalRange_8_0, 
                    	            		"EvaluationRange");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3930:4: ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3930:4: ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3931:5: {...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3931:109: ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3932:6: ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3935:6: ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3935:7: {...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3935:16: ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3935:17: ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}'
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3935:17: ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )?
                    	    int alt64=2;
                    	    int LA64_0 = input.LA(1);

                    	    if ( ((LA64_0>=41 && LA64_0<=46)) ) {
                    	        alt64=1;
                    	    }
                    	    switch (alt64) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3936:1: (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3936:1: (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3937:3: lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getEvaluationAccess().getKpiEvalValueSetKPIEvalValueSetParserRuleCall_3_0_2_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation9708);
                    	            lv_kpiEvalValueSet_9_0=ruleKPIEvalValueSet();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getEvaluationRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"kpiEvalValueSet",
                    	                    		lv_kpiEvalValueSet_9_0, 
                    	                    		"KPIEvalValueSet");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEvaluation9721); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_3_0_2_1());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt65 >= 1 ) break loop65;
                                EarlyExitException eee =
                                    new EarlyExitException(65, input);
                                throw eee;
                        }
                        cnt65++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0()) ) {
                        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canLeave(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0())");
                    }

                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0());
                    	

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3973:7: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleEvaluation9786); 

                        	newLeafNode(otherlv_11, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_1());
                        

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
    // $ANTLR end "ruleEvaluation"


    // $ANTLR start "entryRuleEvaluationRange"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3985:1: entryRuleEvaluationRange returns [EObject current=null] : iv_ruleEvaluationRange= ruleEvaluationRange EOF ;
    public final EObject entryRuleEvaluationRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3986:2: (iv_ruleEvaluationRange= ruleEvaluationRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3987:2: iv_ruleEvaluationRange= ruleEvaluationRange EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRangeRule()); 
            pushFollow(FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange9823);
            iv_ruleEvaluationRange=ruleEvaluationRange();

            state._fsp--;

             current =iv_ruleEvaluationRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationRange9833); 

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
    // $ANTLR end "entryRuleEvaluationRange"


    // $ANTLR start "ruleEvaluationRange"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3994:1: ruleEvaluationRange returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEvaluationRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_start_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_end_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_step_11_0=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3997:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3998:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3998:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4000:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4000:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4001:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4004:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4005:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4005:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+
            int cnt67=0;
            loop67:
            do {
                int alt67=4;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA67_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0) ) {
                        alt67=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA67_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1) ) {
                        alt67=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA67_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2) ) {
                        alt67=3;
                    }


                    }
                    break;

                }

                switch (alt67) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4007:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4007:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4008:5: {...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4008:110: ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4009:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4012:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4012:7: {...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4012:16: (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4012:18: otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleEvaluationRange9915); 

            	        	newLeafNode(otherlv_1, grammarAccess.getEvaluationRangeAccess().getStartKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange9927); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4020:1: ( (lv_start_3_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4021:1: (lv_start_3_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4021:1: (lv_start_3_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4022:3: lv_start_3_0= RULE_INT
            	    {
            	    lv_start_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange9944); 

            	    			newLeafNode(lv_start_3_0, grammarAccess.getEvaluationRangeAccess().getStartINTTerminalRuleCall_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEvaluationRangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"start",
            	            		lv_start_3_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleEvaluationRange9961); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4049:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4049:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4050:5: {...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4050:110: ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4051:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4054:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4054:7: {...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4054:16: (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4054:18: otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleEvaluationRange10029); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEvaluationRangeAccess().getEndKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange10041); 

            	        	newLeafNode(otherlv_6, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4062:1: ( (lv_end_7_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4063:1: (lv_end_7_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4063:1: (lv_end_7_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4064:3: lv_end_7_0= RULE_INT
            	    {
            	    lv_end_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange10058); 

            	    			newLeafNode(lv_end_7_0, grammarAccess.getEvaluationRangeAccess().getEndINTTerminalRuleCall_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEvaluationRangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"end",
            	            		lv_end_7_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleEvaluationRange10075); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4091:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4091:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4092:5: {...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4092:110: ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4093:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4096:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4096:7: {...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4096:16: (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4096:18: otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleEvaluationRange10143); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEvaluationRangeAccess().getStepKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange10155); 

            	        	newLeafNode(otherlv_10, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4104:1: ( (lv_step_11_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4105:1: (lv_step_11_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4105:1: (lv_step_11_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4106:3: lv_step_11_0= RULE_INT
            	    {
            	    lv_step_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange10172); 

            	    			newLeafNode(lv_step_11_0, grammarAccess.getEvaluationRangeAccess().getStepINTTerminalRuleCall_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEvaluationRangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"step",
            	            		lv_step_11_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleEvaluationRange10189); 

            	        	newLeafNode(otherlv_12, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt67 >= 1 ) break loop67;
                        EarlyExitException eee =
                            new EarlyExitException(67, input);
                        throw eee;
                }
                cnt67++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canLeave(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	

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
    // $ANTLR end "ruleEvaluationRange"


    // $ANTLR start "entryRuleKPIEvalValueSet"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4149:1: entryRuleKPIEvalValueSet returns [EObject current=null] : iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF ;
    public final EObject entryRuleKPIEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4150:2: (iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4151:2: iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet10271);
            iv_ruleKPIEvalValueSet=ruleKPIEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIEvalValueSet10281); 

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
    // $ANTLR end "entryRuleKPIEvalValueSet"


    // $ANTLR start "ruleKPIEvalValueSet"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4158:1: ruleKPIEvalValueSet returns [EObject current=null] : (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet ) ;
    public final EObject ruleKPIEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject this_KPIQuantitativeEvalValueSet_0 = null;

        EObject this_KPIQualitativeEvalValueSet_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4161:28: ( (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4162:1: (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4162:1: (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=41 && LA68_0<=45)) ) {
                alt68=1;
            }
            else if ( (LA68_0==46) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4163:5: this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet
                    {
                     
                            newCompositeNode(grammarAccess.getKPIEvalValueSetAccess().getKPIQuantitativeEvalValueSetParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleKPIQuantitativeEvalValueSet_in_ruleKPIEvalValueSet10328);
                    this_KPIQuantitativeEvalValueSet_0=ruleKPIQuantitativeEvalValueSet();

                    state._fsp--;

                     
                            current = this_KPIQuantitativeEvalValueSet_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4173:5: this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet
                    {
                     
                            newCompositeNode(grammarAccess.getKPIEvalValueSetAccess().getKPIQualitativeEvalValueSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleKPIQualitativeEvalValueSet_in_ruleKPIEvalValueSet10355);
                    this_KPIQualitativeEvalValueSet_1=ruleKPIQualitativeEvalValueSet();

                    state._fsp--;

                     
                            current = this_KPIQualitativeEvalValueSet_1; 
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
    // $ANTLR end "ruleKPIEvalValueSet"


    // $ANTLR start "entryRuleKPIQuantitativeEvalValueSet"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4189:1: entryRuleKPIQuantitativeEvalValueSet returns [EObject current=null] : iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF ;
    public final EObject entryRuleKPIQuantitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIQuantitativeEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4190:2: (iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4191:2: iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIQuantitativeEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIQuantitativeEvalValueSet_in_entryRuleKPIQuantitativeEvalValueSet10390);
            iv_ruleKPIQuantitativeEvalValueSet=ruleKPIQuantitativeEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIQuantitativeEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIQuantitativeEvalValueSet10400); 

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
    // $ANTLR end "entryRuleKPIQuantitativeEvalValueSet"


    // $ANTLR start "ruleKPIQuantitativeEvalValueSet"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4198:1: ruleKPIQuantitativeEvalValueSet returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleKPIQuantitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_targetValue_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_thresholdValue_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_worstValue_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_evaluationValue_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_unit_19_0=null;
        Token otherlv_20=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4201:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4202:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4202:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4204:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4204:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4205:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4208:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4209:3: ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4209:3: ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+
            int cnt69=0;
            loop69:
            do {
                int alt69=6;
                int LA69_0 = input.LA(1);

                if ( LA69_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0) ) {
                    alt69=1;
                }
                else if ( LA69_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1) ) {
                    alt69=2;
                }
                else if ( LA69_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2) ) {
                    alt69=3;
                }
                else if ( LA69_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3) ) {
                    alt69=4;
                }
                else if ( LA69_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4) ) {
                    alt69=5;
                }


                switch (alt69) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4211:4: ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4211:4: ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4212:5: {...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4212:122: ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4213:6: ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4216:6: ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4216:7: {...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4216:16: (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4216:18: otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleKPIQuantitativeEvalValueSet10482); 

            	        	newLeafNode(otherlv_1, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getTargetKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10494); 

            	        	newLeafNode(otherlv_2, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4224:1: ( (lv_targetValue_3_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4225:1: (lv_targetValue_3_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4225:1: (lv_targetValue_3_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4226:3: lv_targetValue_3_0= RULE_DOUBLE
            	    {
            	    lv_targetValue_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10511); 

            	    			newLeafNode(lv_targetValue_3_0, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getTargetValueDOUBLETerminalRuleCall_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIQuantitativeEvalValueSetRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"targetValue",
            	            		lv_targetValue_3_0, 
            	            		"DOUBLE");
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10528); 

            	        	newLeafNode(otherlv_4, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4253:4: ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4253:4: ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4254:5: {...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4254:122: ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4255:6: ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4258:6: ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4258:7: {...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4258:16: (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4258:18: otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleKPIQuantitativeEvalValueSet10596); 

            	        	newLeafNode(otherlv_5, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getThresholdKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10608); 

            	        	newLeafNode(otherlv_6, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4266:1: ( (lv_thresholdValue_7_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4267:1: (lv_thresholdValue_7_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4267:1: (lv_thresholdValue_7_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4268:3: lv_thresholdValue_7_0= RULE_DOUBLE
            	    {
            	    lv_thresholdValue_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10625); 

            	    			newLeafNode(lv_thresholdValue_7_0, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getThresholdValueDOUBLETerminalRuleCall_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIQuantitativeEvalValueSetRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"thresholdValue",
            	            		lv_thresholdValue_7_0, 
            	            		"DOUBLE");
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10642); 

            	        	newLeafNode(otherlv_8, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4295:4: ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4295:4: ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4296:5: {...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4296:122: ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4297:6: ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4300:6: ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4300:7: {...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4300:16: (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4300:18: otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,43,FOLLOW_43_in_ruleKPIQuantitativeEvalValueSet10710); 

            	        	newLeafNode(otherlv_9, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getWorstKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10722); 

            	        	newLeafNode(otherlv_10, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4308:1: ( (lv_worstValue_11_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4309:1: (lv_worstValue_11_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4309:1: (lv_worstValue_11_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4310:3: lv_worstValue_11_0= RULE_DOUBLE
            	    {
            	    lv_worstValue_11_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10739); 

            	    			newLeafNode(lv_worstValue_11_0, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getWorstValueDOUBLETerminalRuleCall_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIQuantitativeEvalValueSetRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"worstValue",
            	            		lv_worstValue_11_0, 
            	            		"DOUBLE");
            	    	    

            	    }


            	    }

            	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10756); 

            	        	newLeafNode(otherlv_12, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4337:4: ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4337:4: ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4338:5: {...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4338:122: ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4339:6: ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4342:6: ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4342:7: {...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4342:16: (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4342:18: otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';'
            	    {
            	    otherlv_13=(Token)match(input,44,FOLLOW_44_in_ruleKPIQuantitativeEvalValueSet10824); 

            	        	newLeafNode(otherlv_13, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEvalKeyword_3_0());
            	        
            	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10836); 

            	        	newLeafNode(otherlv_14, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4350:1: ( (lv_evaluationValue_15_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4351:1: (lv_evaluationValue_15_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4351:1: (lv_evaluationValue_15_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4352:3: lv_evaluationValue_15_0= RULE_DOUBLE
            	    {
            	    lv_evaluationValue_15_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10853); 

            	    			newLeafNode(lv_evaluationValue_15_0, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEvaluationValueDOUBLETerminalRuleCall_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIQuantitativeEvalValueSetRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"evaluationValue",
            	            		lv_evaluationValue_15_0, 
            	            		"DOUBLE");
            	    	    

            	    }


            	    }

            	    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10870); 

            	        	newLeafNode(otherlv_16, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4379:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4379:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4380:5: {...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4380:122: ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4381:6: ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4384:6: ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4384:7: {...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4384:16: (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4384:18: otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';'
            	    {
            	    otherlv_17=(Token)match(input,45,FOLLOW_45_in_ruleKPIQuantitativeEvalValueSet10938); 

            	        	newLeafNode(otherlv_17, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnitKeyword_4_0());
            	        
            	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10950); 

            	        	newLeafNode(otherlv_18, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4392:1: ( (lv_unit_19_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4393:1: (lv_unit_19_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4393:1: (lv_unit_19_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4394:3: lv_unit_19_0= RULE_STRING
            	    {
            	    lv_unit_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKPIQuantitativeEvalValueSet10967); 

            	    			newLeafNode(lv_unit_19_0, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnitSTRINGTerminalRuleCall_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIQuantitativeEvalValueSetRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"unit",
            	            		lv_unit_19_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10984); 

            	        	newLeafNode(otherlv_20, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canLeave(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	

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
    // $ANTLR end "ruleKPIQuantitativeEvalValueSet"


    // $ANTLR start "entryRuleKPIQualitativeEvalValueSet"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4437:1: entryRuleKPIQualitativeEvalValueSet returns [EObject current=null] : iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF ;
    public final EObject entryRuleKPIQualitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIQualitativeEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4438:2: (iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4439:2: iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIQualitativeEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIQualitativeEvalValueSet_in_entryRuleKPIQualitativeEvalValueSet11066);
            iv_ruleKPIQualitativeEvalValueSet=ruleKPIQualitativeEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIQualitativeEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIQualitativeEvalValueSet11076); 

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
    // $ANTLR end "entryRuleKPIQualitativeEvalValueSet"


    // $ANTLR start "ruleKPIQualitativeEvalValueSet"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4446:1: ruleKPIQualitativeEvalValueSet returns [EObject current=null] : (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleKPIQualitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4449:28: ( (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4450:1: (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4450:1: (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4450:3: otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleKPIQualitativeEvalValueSet11113); 

                	newLeafNode(otherlv_0, grammarAccess.getKPIQualitativeEvalValueSetAccess().getQualevalKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleKPIQualitativeEvalValueSet11125); 

                	newLeafNode(otherlv_1, grammarAccess.getKPIQualitativeEvalValueSetAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4458:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4459:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4459:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4460:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getKPIQualitativeEvalValueSetRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getKPIQualitativeEvalValueSetAccess().getQualitativeEvaluationValueMappingCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleKPIQualitativeEvalValueSet11148);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleKPIQualitativeEvalValueSet11160); 

                	newLeafNode(otherlv_3, grammarAccess.getKPIQualitativeEvalValueSetAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleKPIQualitativeEvalValueSet"


    // $ANTLR start "entryRuleQualitativeMapping"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4485:1: entryRuleQualitativeMapping returns [EObject current=null] : iv_ruleQualitativeMapping= ruleQualitativeMapping EOF ;
    public final EObject entryRuleQualitativeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeMapping = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4486:2: (iv_ruleQualitativeMapping= ruleQualitativeMapping EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4487:2: iv_ruleQualitativeMapping= ruleQualitativeMapping EOF
            {
             newCompositeNode(grammarAccess.getQualitativeMappingRule()); 
            pushFollow(FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping11196);
            iv_ruleQualitativeMapping=ruleQualitativeMapping();

            state._fsp--;

             current =iv_ruleQualitativeMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitativeMapping11206); 

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
    // $ANTLR end "entryRuleQualitativeMapping"


    // $ANTLR start "ruleQualitativeMapping"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4494:1: ruleQualitativeMapping returns [EObject current=null] : (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}' ) ;
    public final EObject ruleQualitativeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_metaData_4_0 = null;

        EObject lv_mappin_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4497:28: ( (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4498:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4498:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4498:3: otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleQualitativeMapping11243); 

                	newLeafNode(otherlv_0, grammarAccess.getQualitativeMappingAccess().getQualitativeMappingKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4502:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4503:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4503:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4504:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeMapping11260); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQualitativeMappingAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQualitativeMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleQualitativeMapping11277); 

                	newLeafNode(otherlv_2, grammarAccess.getQualitativeMappingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4524:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4526:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4526:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4527:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4530:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4531:3: ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4531:3: ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )*
            loop72:
            do {
                int alt72=3;
                int LA72_0 = input.LA(1);

                if ( LA72_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0) ) {
                    alt72=1;
                }
                else if ( LA72_0 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1) ) {
                    alt72=2;
                }


                switch (alt72) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4533:4: ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4533:4: ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4534:5: {...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4534:115: ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4535:6: ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4538:6: ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+
            	    int cnt70=0;
            	    loop70:
            	    do {
            	        int alt70=2;
            	        int LA70_0 = input.LA(1);

            	        if ( (LA70_0==51) ) {
            	            int LA70_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt70=1;
            	            }


            	        }


            	        switch (alt70) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4538:7: {...}? => ( (lv_metaData_4_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4538:16: ( (lv_metaData_4_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4539:1: (lv_metaData_4_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4539:1: (lv_metaData_4_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4540:3: lv_metaData_4_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getQualitativeMappingAccess().getMetaDataMetadataParserRuleCall_3_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleQualitativeMapping11343);
            	    	    lv_metaData_4_0=ruleMetadata();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getQualitativeMappingRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"metaData",
            	    	            		lv_metaData_4_0, 
            	    	            		"Metadata");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt70 >= 1 ) break loop70;
            	                EarlyExitException eee =
            	                    new EarlyExitException(70, input);
            	                throw eee;
            	        }
            	        cnt70++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4563:4: ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4563:4: ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4564:5: {...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4564:115: ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4565:6: ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4568:6: ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+
            	    int cnt71=0;
            	    loop71:
            	    do {
            	        int alt71=2;
            	        int LA71_0 = input.LA(1);

            	        if ( (LA71_0==RULE_STRING) ) {
            	            int LA71_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt71=1;
            	            }


            	        }


            	        switch (alt71) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4568:7: {...}? => ( (lv_mappin_5_0= ruleMapping ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4568:16: ( (lv_mappin_5_0= ruleMapping ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4569:1: (lv_mappin_5_0= ruleMapping )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4569:1: (lv_mappin_5_0= ruleMapping )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4570:3: lv_mappin_5_0= ruleMapping
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getQualitativeMappingAccess().getMappinMappingParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMapping_in_ruleQualitativeMapping11419);
            	    	    lv_mappin_5_0=ruleMapping();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getQualitativeMappingRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"mappin",
            	    	            		lv_mappin_5_0, 
            	    	            		"Mapping");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt71 >= 1 ) break loop71;
            	                EarlyExitException eee =
            	                    new EarlyExitException(71, input);
            	                throw eee;
            	        }
            	        cnt71++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleQualitativeMapping11472); 

                	newLeafNode(otherlv_6, grammarAccess.getQualitativeMappingAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleQualitativeMapping"


    // $ANTLR start "entryRuleMapping"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4612:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4613:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4614:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping11508);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping11518); 

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
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4621:1: ruleMapping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_valuation_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_exceeds_6_0=null;
        Token otherlv_7=null;
        Enumerator lv_qualitativeEvaluation_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4624:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4625:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4625:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4625:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4625:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4626:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4626:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4627:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMapping11560); 

            			newLeafNode(lv_name_0_0, grammarAccess.getMappingAccess().getNameSTRINGTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMapping11577); 

                	newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getCommaKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4647:1: ( (lv_valuation_2_0= RULE_INT ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4648:1: (lv_valuation_2_0= RULE_INT )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4648:1: (lv_valuation_2_0= RULE_INT )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4649:3: lv_valuation_2_0= RULE_INT
            {
            lv_valuation_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMapping11594); 

            			newLeafNode(lv_valuation_2_0, grammarAccess.getMappingAccess().getValuationINTTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"valuation",
                    		lv_valuation_2_0, 
                    		"INT");
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleMapping11611); 

                	newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getCommaKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4669:1: ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4670:1: (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4670:1: (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4671:3: lv_qualitativeEvaluation_4_0= ruleQualitativeLabel
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleMapping11632);
            lv_qualitativeEvaluation_4_0=ruleQualitativeLabel();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMappingRule());
            	        }
                   		set(
                   			current, 
                   			"qualitativeEvaluation",
                    		lv_qualitativeEvaluation_4_0, 
                    		"QualitativeLabel");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleMapping11644); 

                	newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getCommaKeyword_5());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4691:1: ( (lv_exceeds_6_0= RULE_BOOLEAN ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4692:1: (lv_exceeds_6_0= RULE_BOOLEAN )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4692:1: (lv_exceeds_6_0= RULE_BOOLEAN )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4693:3: lv_exceeds_6_0= RULE_BOOLEAN
            {
            lv_exceeds_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleMapping11661); 

            			newLeafNode(lv_exceeds_6_0, grammarAccess.getMappingAccess().getExceedsBOOLEANTerminalRuleCall_6_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"exceeds",
                    		lv_exceeds_6_0, 
                    		"BOOLEAN");
            	    

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleMapping11678); 

                	newLeafNode(otherlv_7, grammarAccess.getMappingAccess().getSemicolonKeyword_7());
                

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
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleContributionGroup"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4721:1: entryRuleContributionGroup returns [EObject current=null] : iv_ruleContributionGroup= ruleContributionGroup EOF ;
    public final EObject entryRuleContributionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4722:2: (iv_ruleContributionGroup= ruleContributionGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4723:2: iv_ruleContributionGroup= ruleContributionGroup EOF
            {
             newCompositeNode(grammarAccess.getContributionGroupRule()); 
            pushFollow(FOLLOW_ruleContributionGroup_in_entryRuleContributionGroup11714);
            iv_ruleContributionGroup=ruleContributionGroup();

            state._fsp--;

             current =iv_ruleContributionGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionGroup11724); 

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
    // $ANTLR end "entryRuleContributionGroup"


    // $ANTLR start "ruleContributionGroup"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4730:1: ruleContributionGroup returns [EObject current=null] : (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleContributionGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4733:28: ( (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4734:1: (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4734:1: (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4734:3: otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleContributionGroup11761); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionGroupAccess().getContributionGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4738:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4739:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4739:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4740:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup11778); 

            			newLeafNode(lv_name_1_0, grammarAccess.getContributionGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleContributionGroup11795); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionGroupAccess().getIncludesKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4760:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4761:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4761:1: (otherlv_3= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4762:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionGroupRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup11815); 

            		newLeafNode(otherlv_3, grammarAccess.getContributionGroupAccess().getContribsContributionContextCrossReference_3_0()); 
            	

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4773:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==30) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4773:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleContributionGroup11828); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4777:1: ( (otherlv_5= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4778:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4778:1: (otherlv_5= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4779:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionGroupRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup11848); 

            	    		newLeafNode(otherlv_5, grammarAccess.getContributionGroupAccess().getContribsContributionContextCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleContributionGroup11862); 

                	newLeafNode(otherlv_6, grammarAccess.getContributionGroupAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleContributionGroup"


    // $ANTLR start "entryRuleContributionContext"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4802:1: entryRuleContributionContext returns [EObject current=null] : iv_ruleContributionContext= ruleContributionContext EOF ;
    public final EObject entryRuleContributionContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionContext = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4803:2: (iv_ruleContributionContext= ruleContributionContext EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4804:2: iv_ruleContributionContext= ruleContributionContext EOF
            {
             newCompositeNode(grammarAccess.getContributionContextRule()); 
            pushFollow(FOLLOW_ruleContributionContext_in_entryRuleContributionContext11898);
            iv_ruleContributionContext=ruleContributionContext();

            state._fsp--;

             current =iv_ruleContributionContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionContext11908); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4811:1: ruleContributionContext returns [EObject current=null] : (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) ;
    public final EObject ruleContributionContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        EObject lv_metaData_8_0 = null;

        EObject lv_changes_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4814:28: ( (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4815:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4815:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4815:3: otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleContributionContext11945); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionContextAccess().getContributionKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4819:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4820:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4820:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4821:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionContext11962); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4837:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==36) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4837:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleContributionContext11980); 

                        	newLeafNode(otherlv_2, grammarAccess.getContributionContextAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4841:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4842:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4842:1: ( ruleQualifiedName )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4843:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContributionContextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContributionContextAccess().getSuperContributionContextsContributionContextCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionContext12003);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4856:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==30) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4856:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleContributionContext12016); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getContributionContextAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4860:1: ( ( ruleQualifiedName ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4861:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4861:1: ( ruleQualifiedName )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4862:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getContributionContextRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getContributionContextAccess().getSuperContributionContextsContributionContextCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionContext12039);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleContributionContext12055); 

                	newLeafNode(otherlv_6, grammarAccess.getContributionContextAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4879:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4881:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4881:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4882:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionContextAccess().getUnorderedGroup_4());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4885:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4886:3: ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4886:3: ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )*
            loop78:
            do {
                int alt78=3;
                int LA78_0 = input.LA(1);

                if ( LA78_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 0) ) {
                    alt78=1;
                }
                else if ( LA78_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 1) ) {
                    alt78=2;
                }


                switch (alt78) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4888:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4888:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4889:5: {...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContributionContext", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4889:116: ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4890:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4893:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
            	    int cnt76=0;
            	    loop76:
            	    do {
            	        int alt76=2;
            	        int LA76_0 = input.LA(1);

            	        if ( (LA76_0==51) ) {
            	            int LA76_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt76=1;
            	            }


            	        }


            	        switch (alt76) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4893:7: {...}? => ( (lv_metaData_8_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleContributionContext", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4893:16: ( (lv_metaData_8_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4894:1: (lv_metaData_8_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4894:1: (lv_metaData_8_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4895:3: lv_metaData_8_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContributionContextAccess().getMetaDataMetadataParserRuleCall_4_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleContributionContext12121);
            	    	    lv_metaData_8_0=ruleMetadata();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContributionContextRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"metaData",
            	    	            		lv_metaData_8_0, 
            	    	            		"Metadata");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt76 >= 1 ) break loop76;
            	                EarlyExitException eee =
            	                    new EarlyExitException(76, input);
            	                throw eee;
            	        }
            	        cnt76++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionContextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4918:4: ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4918:4: ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4919:5: {...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContributionContext", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4919:116: ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4920:6: ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4923:6: ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+
            	    int cnt77=0;
            	    loop77:
            	    do {
            	        int alt77=2;
            	        int LA77_0 = input.LA(1);

            	        if ( (LA77_0==RULE_ID) ) {
            	            int LA77_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt77=1;
            	            }


            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4923:7: {...}? => ( (lv_changes_9_0= ruleContributionChange ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleContributionContext", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4923:16: ( (lv_changes_9_0= ruleContributionChange ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4924:1: (lv_changes_9_0= ruleContributionChange )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4924:1: (lv_changes_9_0= ruleContributionChange )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4925:3: lv_changes_9_0= ruleContributionChange
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContributionContextAccess().getChangesContributionChangeParserRuleCall_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleContributionChange_in_ruleContributionContext12197);
            	    	    lv_changes_9_0=ruleContributionChange();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContributionContextRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"changes",
            	    	            		lv_changes_9_0, 
            	    	            		"ContributionChange");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt77 >= 1 ) break loop77;
            	                EarlyExitException eee =
            	                    new EarlyExitException(77, input);
            	                throw eee;
            	        }
            	        cnt77++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionContextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContributionContextAccess().getUnorderedGroup_4());
            	

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleContributionContext12250); 

                	newLeafNode(otherlv_10, grammarAccess.getContributionContextAccess().getRightCurlyBracketKeyword_5());
                

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


    // $ANTLR start "entryRuleContributionChange"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4967:1: entryRuleContributionChange returns [EObject current=null] : iv_ruleContributionChange= ruleContributionChange EOF ;
    public final EObject entryRuleContributionChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionChange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4968:2: (iv_ruleContributionChange= ruleContributionChange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4969:2: iv_ruleContributionChange= ruleContributionChange EOF
            {
             newCompositeNode(grammarAccess.getContributionChangeRule()); 
            pushFollow(FOLLOW_ruleContributionChange_in_entryRuleContributionChange12286);
            iv_ruleContributionChange=ruleContributionChange();

            state._fsp--;

             current =iv_ruleContributionChange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionChange12296); 

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
    // $ANTLR end "entryRuleContributionChange"


    // $ANTLR start "ruleContributionChange"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4976:1: ruleContributionChange returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) ) ;
    public final EObject ruleContributionChange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_newQuantitativeContribution_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_newContribution_2_0 = null;

        EObject lv_contribRange_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4979:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4980:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4980:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4980:2: ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4980:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4981:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4981:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4982:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionChangeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionChangeAccess().getContributionContributionEndCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionChange12344);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleContributionChange12356); 

                	newLeafNode(otherlv_1, grammarAccess.getContributionChangeAccess().getColonKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4999:1: ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=63 && LA79_0<=69)) ) {
                alt79=1;
            }
            else if ( (LA79_0==RULE_INT) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4999:2: ( (lv_newContribution_2_0= ruleContributionType ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4999:2: ( (lv_newContribution_2_0= ruleContributionType ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5000:1: (lv_newContribution_2_0= ruleContributionType )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5000:1: (lv_newContribution_2_0= ruleContributionType )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5001:3: lv_newContribution_2_0= ruleContributionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getNewContributionContributionTypeEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContributionType_in_ruleContributionChange12378);
                    lv_newContribution_2_0=ruleContributionType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContributionChangeRule());
                    	        }
                           		set(
                           			current, 
                           			"newContribution",
                            		lv_newContribution_2_0, 
                            		"ContributionType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5018:6: ( (lv_newQuantitativeContribution_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5018:6: ( (lv_newQuantitativeContribution_3_0= RULE_INT ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5019:1: (lv_newQuantitativeContribution_3_0= RULE_INT )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5019:1: (lv_newQuantitativeContribution_3_0= RULE_INT )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5020:3: lv_newQuantitativeContribution_3_0= RULE_INT
                    {
                    lv_newQuantitativeContribution_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionChange12401); 

                    			newLeafNode(lv_newQuantitativeContribution_3_0, grammarAccess.getContributionChangeAccess().getNewQuantitativeContributionINTTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContributionChangeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"newQuantitativeContribution",
                            		lv_newQuantitativeContribution_3_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5036:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) )
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==17) ) {
                alt80=1;
            }
            else if ( (LA80_0==14) ) {
                alt80=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }
            switch (alt80) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5036:5: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleContributionChange12420); 

                        	newLeafNode(otherlv_4, grammarAccess.getContributionChangeAccess().getSemicolonKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5041:6: (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5041:6: (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5041:8: otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleContributionChange12439); 

                        	newLeafNode(otherlv_5, grammarAccess.getContributionChangeAccess().getLeftCurlyBracketKeyword_3_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5045:1: ( (lv_contribRange_6_0= ruleContributionRange ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5046:1: (lv_contribRange_6_0= ruleContributionRange )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5046:1: (lv_contribRange_6_0= ruleContributionRange )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5047:3: lv_contribRange_6_0= ruleContributionRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getContribRangeContributionRangeParserRuleCall_3_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContributionRange_in_ruleContributionChange12460);
                    lv_contribRange_6_0=ruleContributionRange();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContributionChangeRule());
                    	        }
                           		set(
                           			current, 
                           			"contribRange",
                            		lv_contribRange_6_0, 
                            		"ContributionRange");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleContributionChange12472); 

                        	newLeafNode(otherlv_7, grammarAccess.getContributionChangeAccess().getRightCurlyBracketKeyword_3_1_2());
                        

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
    // $ANTLR end "ruleContributionChange"


    // $ANTLR start "entryRuleContributionRange"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5075:1: entryRuleContributionRange returns [EObject current=null] : iv_ruleContributionRange= ruleContributionRange EOF ;
    public final EObject entryRuleContributionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5076:2: (iv_ruleContributionRange= ruleContributionRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5077:2: iv_ruleContributionRange= ruleContributionRange EOF
            {
             newCompositeNode(grammarAccess.getContributionRangeRule()); 
            pushFollow(FOLLOW_ruleContributionRange_in_entryRuleContributionRange12510);
            iv_ruleContributionRange=ruleContributionRange();

            state._fsp--;

             current =iv_ruleContributionRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionRange12520); 

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
    // $ANTLR end "entryRuleContributionRange"


    // $ANTLR start "ruleContributionRange"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5084:1: ruleContributionRange returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleContributionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_start_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_end_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_step_11_0=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5087:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5088:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5088:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5090:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5090:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5091:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5094:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5095:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5095:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+
            int cnt81=0;
            loop81:
            do {
                int alt81=4;
                int LA81_0 = input.LA(1);

                if ( LA81_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0) ) {
                    alt81=1;
                }
                else if ( LA81_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1) ) {
                    alt81=2;
                }
                else if ( LA81_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2) ) {
                    alt81=3;
                }


                switch (alt81) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5097:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5097:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5098:5: {...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5098:112: ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5099:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5102:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5102:7: {...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5102:16: (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5102:18: otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleContributionRange12602); 

            	        	newLeafNode(otherlv_1, grammarAccess.getContributionRangeAccess().getStartKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange12614); 

            	        	newLeafNode(otherlv_2, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5110:1: ( (lv_start_3_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5111:1: (lv_start_3_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5111:1: (lv_start_3_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5112:3: lv_start_3_0= RULE_INT
            	    {
            	    lv_start_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange12631); 

            	    			newLeafNode(lv_start_3_0, grammarAccess.getContributionRangeAccess().getStartINTTerminalRuleCall_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"start",
            	            		lv_start_3_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleContributionRange12648); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5139:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5139:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5140:5: {...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5140:112: ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5141:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5144:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5144:7: {...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5144:16: (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5144:18: otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleContributionRange12716); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContributionRangeAccess().getEndKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange12728); 

            	        	newLeafNode(otherlv_6, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5152:1: ( (lv_end_7_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5153:1: (lv_end_7_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5153:1: (lv_end_7_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5154:3: lv_end_7_0= RULE_INT
            	    {
            	    lv_end_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange12745); 

            	    			newLeafNode(lv_end_7_0, grammarAccess.getContributionRangeAccess().getEndINTTerminalRuleCall_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"end",
            	            		lv_end_7_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleContributionRange12762); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5181:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5181:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5182:5: {...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5182:112: ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5183:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5186:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5186:7: {...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5186:16: (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5186:18: otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleContributionRange12830); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContributionRangeAccess().getStepKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange12842); 

            	        	newLeafNode(otherlv_10, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5194:1: ( (lv_step_11_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5195:1: (lv_step_11_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5195:1: (lv_step_11_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5196:3: lv_step_11_0= RULE_INT
            	    {
            	    lv_step_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange12859); 

            	    			newLeafNode(lv_step_11_0, grammarAccess.getContributionRangeAccess().getStepINTTerminalRuleCall_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"step",
            	            		lv_step_11_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleContributionRange12876); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt81 >= 1 ) break loop81;
                        EarlyExitException eee =
                            new EarlyExitException(81, input);
                        throw eee;
                }
                cnt81++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getContributionRangeAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canLeave(grammarAccess.getContributionRangeAccess().getUnorderedGroup())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	

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
    // $ANTLR end "ruleContributionRange"


    // $ANTLR start "entryRuleMetadata"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5239:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5240:2: (iv_ruleMetadata= ruleMetadata EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5241:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_ruleMetadata_in_entryRuleMetadata12958);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadata12968); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5248:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5251:28: ( (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5252:1: (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5252:1: (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5252:3: otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleMetadata13005); 

                	newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getMetadataKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5256:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5257:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5257:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5258:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetadata13022); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleMetadata13039); 

                	newLeafNode(otherlv_2, grammarAccess.getMetadataAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5278:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5279:1: (lv_value_3_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5279:1: (lv_value_3_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5280:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata13056); 

            			newLeafNode(lv_value_3_0, grammarAccess.getMetadataAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleMetadata13073); 

                	newLeafNode(otherlv_4, grammarAccess.getMetadataAccess().getSemicolonKeyword_4());
                

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


    // $ANTLR start "entryRuleComment"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5308:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5309:2: (iv_ruleComment= ruleComment EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5310:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment13109);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment13119); 

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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5317:1: ruleComment returns [EObject current=null] : (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5320:28: ( (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5321:1: (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5321:1: (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5321:3: otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleComment13156); 

                	newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getCommentKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5325:1: ( (lv_content_1_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5326:1: (lv_content_1_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5326:1: (lv_content_1_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5327:3: lv_content_1_0= RULE_STRING
            {
            lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComment13173); 

            			newLeafNode(lv_content_1_0, grammarAccess.getCommentAccess().getContentSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCommentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"content",
                    		lv_content_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleComment13190); 

                	newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleLinkType"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5355:1: entryRuleLinkType returns [EObject current=null] : iv_ruleLinkType= ruleLinkType EOF ;
    public final EObject entryRuleLinkType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkType = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5356:2: (iv_ruleLinkType= ruleLinkType EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5357:2: iv_ruleLinkType= ruleLinkType EOF
            {
             newCompositeNode(grammarAccess.getLinkTypeRule()); 
            pushFollow(FOLLOW_ruleLinkType_in_entryRuleLinkType13226);
            iv_ruleLinkType=ruleLinkType();

            state._fsp--;

             current =iv_ruleLinkType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkType13236); 

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
    // $ANTLR end "entryRuleLinkType"


    // $ANTLR start "ruleLinkType"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5364:1: ruleLinkType returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleLinkType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5367:28: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5368:1: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5368:1: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5368:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleLinkType13273); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkTypeAccess().getLinkKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5372:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5373:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5373:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5374:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkType13290); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLinkTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleLinkType13307); 

                	newLeafNode(otherlv_2, grammarAccess.getLinkTypeAccess().getSemicolonKeyword_2());
                

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
    // $ANTLR end "ruleLinkType"


    // $ANTLR start "entryRuleLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5402:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5403:2: (iv_ruleLink= ruleLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5404:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink13343);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink13353); 

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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5411:1: ruleLink returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5414:28: ( ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5415:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5415:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5415:2: ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5415:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5416:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5416:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5417:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getSrcGRLElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink13401);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5430:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5431:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5431:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5432:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getTypeLinkTypeCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink13424);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5445:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5446:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5446:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5447:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getDesGRLElementCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink13447);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5460:2: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==30) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5460:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleLink13460); 

            	        	newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5464:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5465:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5465:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5466:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLinkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getDesGRLElementCrossReference_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink13483);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleLink13497); 

                	newLeafNode(otherlv_5, grammarAccess.getLinkAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleinLineLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5491:1: entryRuleinLineLink returns [EObject current=null] : iv_ruleinLineLink= ruleinLineLink EOF ;
    public final EObject entryRuleinLineLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinLineLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5492:2: (iv_ruleinLineLink= ruleinLineLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5493:2: iv_ruleinLineLink= ruleinLineLink EOF
            {
             newCompositeNode(grammarAccess.getInLineLinkRule()); 
            pushFollow(FOLLOW_ruleinLineLink_in_entryRuleinLineLink13533);
            iv_ruleinLineLink=ruleinLineLink();

            state._fsp--;

             current =iv_ruleinLineLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinLineLink13543); 

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
    // $ANTLR end "entryRuleinLineLink"


    // $ANTLR start "ruleinLineLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5500:1: ruleinLineLink returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleinLineLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5503:28: ( ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5504:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5504:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5504:2: ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5504:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5505:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5505:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5506:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInLineLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInLineLinkAccess().getTypeLinkTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleinLineLink13591);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5519:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5520:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5520:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5521:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInLineLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInLineLinkAccess().getDesGRLElementCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleinLineLink13614);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5534:2: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==30) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5534:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleinLineLink13627); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineLinkAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5538:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5539:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5539:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5540:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInLineLinkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getInLineLinkAccess().getDesGRLElementCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleinLineLink13650);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop83;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleinLineLink13664); 

                	newLeafNode(otherlv_4, grammarAccess.getInLineLinkAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleinLineLink"


    // $ANTLR start "entryRuleIndicatorGroup"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5565:1: entryRuleIndicatorGroup returns [EObject current=null] : iv_ruleIndicatorGroup= ruleIndicatorGroup EOF ;
    public final EObject entryRuleIndicatorGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicatorGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5566:2: (iv_ruleIndicatorGroup= ruleIndicatorGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5567:2: iv_ruleIndicatorGroup= ruleIndicatorGroup EOF
            {
             newCompositeNode(grammarAccess.getIndicatorGroupRule()); 
            pushFollow(FOLLOW_ruleIndicatorGroup_in_entryRuleIndicatorGroup13700);
            iv_ruleIndicatorGroup=ruleIndicatorGroup();

            state._fsp--;

             current =iv_ruleIndicatorGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndicatorGroup13710); 

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
    // $ANTLR end "entryRuleIndicatorGroup"


    // $ANTLR start "ruleIndicatorGroup"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5574:1: ruleIndicatorGroup returns [EObject current=null] : (otherlv_0= 'indicatorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleIndicatorGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5577:28: ( (otherlv_0= 'indicatorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5578:1: (otherlv_0= 'indicatorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5578:1: (otherlv_0= 'indicatorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5578:3: otherlv_0= 'indicatorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleIndicatorGroup13747); 

                	newLeafNode(otherlv_0, grammarAccess.getIndicatorGroupAccess().getIndicatorGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5582:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5583:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5583:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5584:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicatorGroup13764); 

            			newLeafNode(lv_name_1_0, grammarAccess.getIndicatorGroupAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIndicatorGroupRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleIndicatorGroup13781); 

                	newLeafNode(otherlv_2, grammarAccess.getIndicatorGroupAccess().getIncludesKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5604:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5605:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5605:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5606:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIndicatorGroupRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIndicatorGroupAccess().getIndicatorsIndicatorCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleIndicatorGroup13804);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5619:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==30) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5619:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleIndicatorGroup13817); 

            	        	newLeafNode(otherlv_4, grammarAccess.getIndicatorGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5623:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5624:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5624:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5625:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorGroupRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getIndicatorGroupAccess().getIndicatorsIndicatorCrossReference_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleIndicatorGroup13840);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleIndicatorGroup13854); 

                	newLeafNode(otherlv_6, grammarAccess.getIndicatorGroupAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleIndicatorGroup"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5650:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5651:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5652:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13891);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName13902); 

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5659:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5662:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5663:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5663:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5663:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13942); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5670:1: (kw= '.' this_ID_2= RULE_ID )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==55) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5671:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,55,FOLLOW_55_in_ruleQualifiedName13961); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13976); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop85;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleImportanceType"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5691:1: ruleImportanceType returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) ;
    public final Enumerator ruleImportanceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5693:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5694:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5694:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            int alt86=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt86=1;
                }
                break;
            case 57:
                {
                alt86=2;
                }
                break;
            case 58:
                {
                alt86=3;
                }
                break;
            case 59:
                {
                alt86=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5694:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5694:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5694:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleImportanceType14037); 

                            current = grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5700:6: (enumLiteral_1= 'high' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5700:6: (enumLiteral_1= 'high' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5700:8: enumLiteral_1= 'high'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleImportanceType14054); 

                            current = grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5706:6: (enumLiteral_2= 'medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5706:6: (enumLiteral_2= 'medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5706:8: enumLiteral_2= 'medium'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleImportanceType14071); 

                            current = grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5712:6: (enumLiteral_3= 'low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5712:6: (enumLiteral_3= 'low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5712:8: enumLiteral_3= 'low'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_59_in_ruleImportanceType14088); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5722:1: ruleDecompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) ;
    public final Enumerator ruleDecompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5724:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5725:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5725:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            int alt87=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt87=1;
                }
                break;
            case 61:
                {
                alt87=2;
                }
                break;
            case 62:
                {
                alt87=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5725:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5725:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5725:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleDecompositionType14133); 

                            current = grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5731:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5731:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5731:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleDecompositionType14150); 

                            current = grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5737:6: (enumLiteral_2= 'xor' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5737:6: (enumLiteral_2= 'xor' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5737:8: enumLiteral_2= 'xor'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_ruleDecompositionType14167); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5747:1: ruleContributionType returns [Enumerator current=null] : ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5749:28: ( ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5750:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5750:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            int alt88=7;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt88=1;
                }
                break;
            case 64:
                {
                alt88=2;
                }
                break;
            case 65:
                {
                alt88=3;
                }
                break;
            case 66:
                {
                alt88=4;
                }
                break;
            case 67:
                {
                alt88=5;
                }
                break;
            case 68:
                {
                alt88=6;
                }
                break;
            case 69:
                {
                alt88=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5750:2: (enumLiteral_0= 'help' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5750:2: (enumLiteral_0= 'help' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5750:4: enumLiteral_0= 'help'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_63_in_ruleContributionType14212); 

                            current = grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5756:6: (enumLiteral_1= 'make' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5756:6: (enumLiteral_1= 'make' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5756:8: enumLiteral_1= 'make'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleContributionType14229); 

                            current = grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5762:6: (enumLiteral_2= 'somePositive' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5762:6: (enumLiteral_2= 'somePositive' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5762:8: enumLiteral_2= 'somePositive'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_65_in_ruleContributionType14246); 

                            current = grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5768:6: (enumLiteral_3= 'unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5768:6: (enumLiteral_3= 'unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5768:8: enumLiteral_3= 'unknown'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_66_in_ruleContributionType14263); 

                            current = grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5774:6: (enumLiteral_4= 'someNegative' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5774:6: (enumLiteral_4= 'someNegative' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5774:8: enumLiteral_4= 'someNegative'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_67_in_ruleContributionType14280); 

                            current = grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5780:6: (enumLiteral_5= 'hurt' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5780:6: (enumLiteral_5= 'hurt' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5780:8: enumLiteral_5= 'hurt'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_68_in_ruleContributionType14297); 

                            current = grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5786:6: (enumLiteral_6= 'break' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5786:6: (enumLiteral_6= 'break' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5786:8: enumLiteral_6= 'break'
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_69_in_ruleContributionType14314); 

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


    // $ANTLR start "ruleQualitativeLabel"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5796:1: ruleQualitativeLabel returns [Enumerator current=null] : ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) ) ;
    public final Enumerator ruleQualitativeLabel() throws RecognitionException {
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5798:28: ( ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5799:1: ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5799:1: ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) )
            int alt89=7;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt89=1;
                }
                break;
            case 71:
                {
                alt89=2;
                }
                break;
            case 72:
                {
                alt89=3;
                }
                break;
            case 73:
                {
                alt89=4;
                }
                break;
            case 74:
                {
                alt89=5;
                }
                break;
            case 66:
                {
                alt89=6;
                }
                break;
            case 56:
                {
                alt89=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5799:2: (enumLiteral_0= 'denied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5799:2: (enumLiteral_0= 'denied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5799:4: enumLiteral_0= 'denied'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_70_in_ruleQualitativeLabel14359); 

                            current = grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5805:6: (enumLiteral_1= 'weaklyDenied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5805:6: (enumLiteral_1= 'weaklyDenied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5805:8: enumLiteral_1= 'weaklyDenied'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_71_in_ruleQualitativeLabel14376); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5811:6: (enumLiteral_2= 'weaklySatisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5811:6: (enumLiteral_2= 'weaklySatisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5811:8: enumLiteral_2= 'weaklySatisfied'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_72_in_ruleQualitativeLabel14393); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5817:6: (enumLiteral_3= 'satisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5817:6: (enumLiteral_3= 'satisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5817:8: enumLiteral_3= 'satisfied'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_73_in_ruleQualitativeLabel14410); 

                            current = grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5823:6: (enumLiteral_4= 'conflict' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5823:6: (enumLiteral_4= 'conflict' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5823:8: enumLiteral_4= 'conflict'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_74_in_ruleQualitativeLabel14427); 

                            current = grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5829:6: (enumLiteral_5= 'unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5829:6: (enumLiteral_5= 'unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5829:8: enumLiteral_5= 'unknown'
                    {
                    enumLiteral_5=(Token)match(input,66,FOLLOW_66_in_ruleQualitativeLabel14444); 

                            current = grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5835:6: (enumLiteral_6= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5835:6: (enumLiteral_6= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5835:8: enumLiteral_6= 'none'
                    {
                    enumLiteral_6=(Token)match(input,56,FOLLOW_56_in_ruleQualitativeLabel14461); 

                            current = grammarAccess.getQualitativeLabelAccess().getNoneEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getQualitativeLabelAccess().getNoneEnumLiteralDeclaration_6()); 
                        

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
    // $ANTLR end "ruleQualitativeLabel"


    // $ANTLR start "ruleColor"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5845:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) ) ;
    public final Enumerator ruleColor() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;
        Token enumLiteral_12=null;
        Token enumLiteral_13=null;
        Token enumLiteral_14=null;
        Token enumLiteral_15=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5847:28: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5848:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5848:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) )
            int alt90=16;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt90=1;
                }
                break;
            case 76:
                {
                alt90=2;
                }
                break;
            case 77:
                {
                alt90=3;
                }
                break;
            case 78:
                {
                alt90=4;
                }
                break;
            case 79:
                {
                alt90=5;
                }
                break;
            case 80:
                {
                alt90=6;
                }
                break;
            case 81:
                {
                alt90=7;
                }
                break;
            case 82:
                {
                alt90=8;
                }
                break;
            case 83:
                {
                alt90=9;
                }
                break;
            case 84:
                {
                alt90=10;
                }
                break;
            case 85:
                {
                alt90=11;
                }
                break;
            case 86:
                {
                alt90=12;
                }
                break;
            case 87:
                {
                alt90=13;
                }
                break;
            case 88:
                {
                alt90=14;
                }
                break;
            case 89:
                {
                alt90=15;
                }
                break;
            case 90:
                {
                alt90=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5848:2: (enumLiteral_0= 'white' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5848:2: (enumLiteral_0= 'white' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5848:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_75_in_ruleColor14506); 

                            current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5854:6: (enumLiteral_1= 'black' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5854:6: (enumLiteral_1= 'black' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5854:8: enumLiteral_1= 'black'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleColor14523); 

                            current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5860:6: (enumLiteral_2= 'blue' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5860:6: (enumLiteral_2= 'blue' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5860:8: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_77_in_ruleColor14540); 

                            current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5866:6: (enumLiteral_3= 'green' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5866:6: (enumLiteral_3= 'green' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5866:8: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_78_in_ruleColor14557); 

                            current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5872:6: (enumLiteral_4= 'cyan' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5872:6: (enumLiteral_4= 'cyan' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5872:8: enumLiteral_4= 'cyan'
                    {
                    enumLiteral_4=(Token)match(input,79,FOLLOW_79_in_ruleColor14574); 

                            current = grammarAccess.getColorAccess().getCyanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getCyanEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5878:6: (enumLiteral_5= 'red' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5878:6: (enumLiteral_5= 'red' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5878:8: enumLiteral_5= 'red'
                    {
                    enumLiteral_5=(Token)match(input,80,FOLLOW_80_in_ruleColor14591); 

                            current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5884:6: (enumLiteral_6= 'purple' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5884:6: (enumLiteral_6= 'purple' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5884:8: enumLiteral_6= 'purple'
                    {
                    enumLiteral_6=(Token)match(input,81,FOLLOW_81_in_ruleColor14608); 

                            current = grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5890:6: (enumLiteral_7= 'yellow' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5890:6: (enumLiteral_7= 'yellow' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5890:8: enumLiteral_7= 'yellow'
                    {
                    enumLiteral_7=(Token)match(input,82,FOLLOW_82_in_ruleColor14625); 

                            current = grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5896:6: (enumLiteral_8= 'gray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5896:6: (enumLiteral_8= 'gray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5896:8: enumLiteral_8= 'gray'
                    {
                    enumLiteral_8=(Token)match(input,83,FOLLOW_83_in_ruleColor14642); 

                            current = grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5902:6: (enumLiteral_9= 'lightGray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5902:6: (enumLiteral_9= 'lightGray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5902:8: enumLiteral_9= 'lightGray'
                    {
                    enumLiteral_9=(Token)match(input,84,FOLLOW_84_in_ruleColor14659); 

                            current = grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5908:6: (enumLiteral_10= 'lightBlue' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5908:6: (enumLiteral_10= 'lightBlue' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5908:8: enumLiteral_10= 'lightBlue'
                    {
                    enumLiteral_10=(Token)match(input,85,FOLLOW_85_in_ruleColor14676); 

                            current = grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5914:6: (enumLiteral_11= 'lightGreen' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5914:6: (enumLiteral_11= 'lightGreen' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5914:8: enumLiteral_11= 'lightGreen'
                    {
                    enumLiteral_11=(Token)match(input,86,FOLLOW_86_in_ruleColor14693); 

                            current = grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5920:6: (enumLiteral_12= 'lightCray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5920:6: (enumLiteral_12= 'lightCray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5920:8: enumLiteral_12= 'lightCray'
                    {
                    enumLiteral_12=(Token)match(input,87,FOLLOW_87_in_ruleColor14710); 

                            current = grammarAccess.getColorAccess().getLightCrayEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getColorAccess().getLightCrayEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5926:6: (enumLiteral_13= 'lightRed' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5926:6: (enumLiteral_13= 'lightRed' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5926:8: enumLiteral_13= 'lightRed'
                    {
                    enumLiteral_13=(Token)match(input,88,FOLLOW_88_in_ruleColor14727); 

                            current = grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5932:6: (enumLiteral_14= 'lightPurple' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5932:6: (enumLiteral_14= 'lightPurple' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5932:8: enumLiteral_14= 'lightPurple'
                    {
                    enumLiteral_14=(Token)match(input,89,FOLLOW_89_in_ruleColor14744); 

                            current = grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5938:6: (enumLiteral_15= 'lightYellow' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5938:6: (enumLiteral_15= 'lightYellow' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5938:8: enumLiteral_15= 'lightYellow'
                    {
                    enumLiteral_15=(Token)match(input,90,FOLLOW_90_in_ruleColor14761); 

                            current = grammarAccess.getColorAccess().getLightYellowEnumLiteralDeclaration_15().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_15, grammarAccess.getColorAccess().getLightYellowEnumLiteralDeclaration_15()); 
                        

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
    // $ANTLR end "ruleColor"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA2_eotS =
        "\12\uffff";
    static final String DFA2_eofS =
        "\12\uffff";
    static final String DFA2_minS =
        "\1\4\1\uffff\1\4\2\uffff\5\4";
    static final String DFA2_maxS =
        "\1\66\1\uffff\1\67\2\uffff\1\4\2\67\1\4\1\67";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\5\uffff";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\4\12\uffff\1\1\5\uffff\1\1\1\uffff\5\1\1\3\1\uffff\2"+
            "\3\1\1\1\uffff\1\1\13\uffff\3\1\1\uffff\4\1",
            "",
            "\1\6\16\uffff\1\1\11\uffff\1\1\1\uffff\2\1\26\uffff\1\5",
            "",
            "",
            "\1\7",
            "\1\1\14\uffff\1\3\14\uffff\1\3\30\uffff\1\10",
            "\1\6\16\uffff\1\1\11\uffff\1\1\1\uffff\2\1\26\uffff\1\5",
            "\1\11",
            "\1\1\14\uffff\1\3\14\uffff\1\3\30\uffff\1\10"
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "122:1: (this_GRLElement_0= ruleGRLElement | this_InLineElementLink_1= ruleInLineElementLink | this_Mapping_2= ruleMapping )";
        }
    }
    static final String DFA3_eotS =
        "\21\uffff";
    static final String DFA3_eofS =
        "\21\uffff";
    static final String DFA3_minS =
        "\1\4\1\uffff\1\4\12\uffff\1\4\2\uffff\1\4";
    static final String DFA3_maxS =
        "\1\66\1\uffff\1\67\12\uffff\1\4\2\uffff\1\67";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\uffff\1\2\1\7\1\uffff";
    static final String DFA3_specialS =
        "\21\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\13\uffff\1\3\5\uffff\1\1\1\uffff\5\1\4\uffff\1\4\1\uffff"+
            "\1\6\13\uffff\1\11\1\7\1\10\1\uffff\1\12\1\13\1\14\1\5",
            "",
            "\1\16\16\uffff\1\17\11\uffff\1\16\1\uffff\2\16\26\uffff\1"+
            "\15",
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
            "\1\20",
            "",
            "",
            "\1\16\16\uffff\1\17\11\uffff\1\16\1\uffff\2\16\26\uffff\1"+
            "\15"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "172:1: (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_IndicatorGroup_4= ruleIndicatorGroup | this_EvaluationStrategy_5= ruleEvaluationStrategy | this_Evaluation_6= ruleEvaluation | this_ContributionGroup_7= ruleContributionGroup | this_ContributionContext_8= ruleContributionContext | this_QualitativeMapping_9= ruleQualitativeMapping | this_Metadata_10= ruleMetadata | this_Comment_11= ruleComment | this_LinkType_12= ruleLinkType )";
        }
    }
    static final String DFA5_eotS =
        "\10\uffff";
    static final String DFA5_eofS =
        "\10\uffff";
    static final String DFA5_minS =
        "\3\4\4\uffff\1\4";
    static final String DFA5_maxS =
        "\1\4\1\67\1\4\4\uffff\1\67";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\3\1\2\1\4\1\uffff";
    static final String DFA5_specialS =
        "\10\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\6\30\uffff\1\3\1\uffff\1\5\1\4\26\uffff\1\2",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\6\30\uffff\1\3\1\uffff\1\5\1\4\26\uffff\1\2"
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "402:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency | this_Link_3= ruleLink )";
        }
    }
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\12\uffff";
    static final String DFA12_minS =
        "\1\4\1\uffff\7\0\1\uffff";
    static final String DFA12_maxS =
        "\1\73\1\uffff\7\0\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA12_specialS =
        "\2\uffff\1\6\1\1\1\2\1\3\1\4\1\5\1\0\1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\10\1\uffff\1\1\10\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\2"+
            "\1\uffff\1\3\1\4\1\5\1\6\1\7\26\uffff\1\1\4\uffff\4\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()+ loopback of 845:6: ({...}? => ( ( (lv_elemets_21_0= ruleIntentionalElement ) ) | ( (lv_elemets_22_0= ruleElementLink ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_7);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRLSpecification_in_ruleModel130 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_ruleGRLBaseElement_in_entryRuleGRLBaseElement168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRLBaseElement178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRLElement_in_ruleGRLBaseElement225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleGRLBaseElement252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleGRLBaseElement279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRLElement_in_entryRuleGRLElement314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRLElement324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleGRLElement371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLink_in_ruleGRLElement398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleGRLElement425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategyGroup_in_ruleGRLElement452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicatorGroup_in_ruleGRLElement479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationStrategy_in_ruleGRLElement506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleGRLElement533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionGroup_in_ruleGRLElement560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionContext_in_ruleGRLElement587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeMapping_in_ruleGRLElement614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleGRLElement641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleGRLElement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_ruleGRLElement695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntentionalElement740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_ruleIntentionalElement787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleIntentionalElement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleIntentionalElement841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleIntentionalElement868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicator_in_ruleIntentionalElement895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_ruleIntentionalElement922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLink_in_entryRuleElementLink957 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLink967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_ruleElementLink1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_ruleElementLink1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleElementLink1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleElementLink1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_entryRuleInLineElementLink1130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineElementLink1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDecomposition_in_ruleInLineElementLink1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineContribution_in_ruleInLineElementLink1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDependency_in_ruleInLineElementLink1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinLineLink_in_ruleInLineElementLink1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRLSpecification_in_entryRuleGRLSpecification1303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRLSpecification1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGRLSpecification1350 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGRLSpecification1367 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGRLSpecification1385 = new BitSet(new long[]{0x007B800A1F418010L});
    public static final BitSet FOLLOW_ruleGRLElement_in_ruleGRLSpecification1406 = new BitSet(new long[]{0x007B800A1F418010L});
    public static final BitSet FOLLOW_15_in_ruleGRLSpecification1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor1455 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleActor1502 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor1519 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleActor1537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleActor1556 = new BitSet(new long[]{0x0F0800001F748050L});
    public static final BitSet FOLLOW_18_in_ruleActor1614 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1626 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1643 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleActor1660 = new BitSet(new long[]{0x0F0800001F748050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleActor1738 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActor1761 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleActor1779 = new BitSet(new long[]{0x0F0800001F748050L});
    public static final BitSet FOLLOW_20_in_ruleActor1847 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1859 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1876 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleActor1893 = new BitSet(new long[]{0x0F0800001F748050L});
    public static final BitSet FOLLOW_21_in_ruleActor1961 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1973 = new BitSet(new long[]{0x0000000000000000L,0x0000000007FFF800L});
    public static final BitSet FOLLOW_ruleColor_in_ruleActor1994 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleActor2006 = new BitSet(new long[]{0x0F0800001F748050L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleActor2082 = new BitSet(new long[]{0x0F0800001F748050L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleActor2159 = new BitSet(new long[]{0x0F0800001F748050L});
    public static final BitSet FOLLOW_ruleElementLink_in_ruleActor2186 = new BitSet(new long[]{0x0F0800001F748050L});
    public static final BitSet FOLLOW_15_in_ruleActor2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal2278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal2288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSoftgoal2325 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftgoal2342 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSoftgoal2379 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2437 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2449 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal2466 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2483 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_20_in_ruleSoftgoal2551 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2563 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal2580 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2597 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_21_in_ruleSoftgoal2665 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2677 = new BitSet(new long[]{0x0000000000000000L,0x0000000007FFF800L});
    public static final BitSet FOLLOW_ruleColor_in_ruleSoftgoal2698 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2710 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_23_in_ruleSoftgoal2778 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2790 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleSoftgoal2811 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2823 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleSoftgoal2901 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSoftgoal2924 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2942 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleSoftgoal3018 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleSoftgoal3094 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_15_in_ruleSoftgoal3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal3185 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal3195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGoal3232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal3249 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleGoal3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGoal3286 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_18_in_ruleGoal3344 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3356 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3373 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGoal3390 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_20_in_ruleGoal3458 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3470 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3487 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGoal3504 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_21_in_ruleGoal3572 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3584 = new BitSet(new long[]{0x0000000000000000L,0x0000000007FFF800L});
    public static final BitSet FOLLOW_ruleColor_in_ruleGoal3605 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGoal3617 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_23_in_ruleGoal3685 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3697 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleGoal3718 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGoal3730 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleGoal3808 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGoal3831 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGoal3849 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleGoal3925 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleGoal4001 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_15_in_ruleGoal4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask4092 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask4102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTask4139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask4156 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleTask4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTask4193 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_18_in_ruleTask4251 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4263 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask4280 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTask4297 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_20_in_ruleTask4365 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4377 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask4394 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTask4411 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_21_in_ruleTask4479 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4491 = new BitSet(new long[]{0x0000000000000000L,0x0000000007FFF800L});
    public static final BitSet FOLLOW_ruleColor_in_ruleTask4512 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTask4524 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_23_in_ruleTask4592 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4604 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleTask4625 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTask4637 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleTask4715 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTask4738 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTask4756 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleTask4832 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleTask4908 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_15_in_ruleTask4961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource4999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleResource5046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource5063 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleResource5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleResource5100 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_18_in_ruleResource5158 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource5170 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource5187 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource5204 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_20_in_ruleResource5272 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource5284 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource5301 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource5318 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_21_in_ruleResource5386 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource5398 = new BitSet(new long[]{0x0000000000000000L,0x0000000007FFF800L});
    public static final BitSet FOLLOW_ruleColor_in_ruleResource5419 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource5431 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_23_in_ruleResource5499 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource5511 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleResource5532 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource5544 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleResource5622 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResource5645 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource5663 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleResource5739 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleResource5815 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_15_in_ruleResource5868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicator_in_entryRuleIndicator5906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndicator5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleIndicator5953 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator5970 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleIndicator5988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleIndicator6007 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_18_in_ruleIndicator6065 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator6094 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIndicator6111 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_20_in_ruleIndicator6179 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6191 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator6208 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIndicator6225 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_21_in_ruleIndicator6293 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6305 = new BitSet(new long[]{0x0000000000000000L,0x0000000007FFF800L});
    public static final BitSet FOLLOW_ruleColor_in_ruleIndicator6326 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIndicator6338 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_23_in_ruleIndicator6406 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6418 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleIndicator6439 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIndicator6451 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleIndicator6529 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIndicator6552 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIndicator6570 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleIndicator6646 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleIndicator6722 = new BitSet(new long[]{0x0F080001A0B48050L});
    public static final BitSet FOLLOW_15_in_ruleIndicator6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief6813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief6823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBelief6860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBelief6877 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleBelief6895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBelief6914 = new BitSet(new long[]{0x0008000000148000L});
    public static final BitSet FOLLOW_18_in_ruleBelief6972 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBelief6984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelief7001 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBelief7018 = new BitSet(new long[]{0x0008000000148000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleBelief7094 = new BitSet(new long[]{0x0008000000148000L});
    public static final BitSet FOLLOW_20_in_ruleBelief7162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelief7179 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBelief7196 = new BitSet(new long[]{0x0008000000148000L});
    public static final BitSet FOLLOW_15_in_ruleBelief7249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition7287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition7297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecomposition7345 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDecomposition7357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleDecomposition7378 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleDecomposition7391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleDecomposition7412 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleDecomposition7426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDecomposition_in_entryRuleInLineDecomposition7462 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineDecomposition7472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleInLineDecomposition7509 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition7530 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleInLineDecomposition7543 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition7564 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleInLineDecomposition7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_entryRuleDecompositionEnd7614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecompositionEnd7624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecompositionEnd7672 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDecompositionEnd7685 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecompositionEnd7702 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDecompositionEnd7720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution7758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContribution7768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContribution7816 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleContribution7828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleContribution7849 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleContribution7862 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleContribution7883 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleContribution7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineContribution_in_entryRuleInLineContribution7933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineContribution7943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInLineContribution7980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleInLineContribution8001 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleInLineContribution8014 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleInLineContribution8035 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleInLineContribution8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_entryRuleContributionEnd8085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionEnd8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionEnd8137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionEnd8166 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleContributionEnd8179 = new BitSet(new long[]{0x8000000000008040L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionEnd8201 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionEnd8224 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionEnd8243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency8281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency8291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependency8339 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDependency8351 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleDependency8372 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleDependency8385 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleDependency8406 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleDependency8420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDependency_in_entryRuleInLineDependency8456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineDependency8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInLineDependency8503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleInLineDependency8524 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleInLineDependency8537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleInLineDependency8558 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleInLineDependency8572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_entryRuleDependencyEnd8608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyEnd8618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependencyEnd8666 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDependencyEnd8679 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependencyEnd8696 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDependencyEnd8714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategyGroup_in_entryRuleStrategyGroup8752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrategyGroup8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStrategyGroup8799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStrategyGroup8816 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleStrategyGroup8833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8856 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleStrategyGroup8869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8892 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleStrategyGroup8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationStrategy_in_entryRuleEvaluationStrategy8942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationStrategy8952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEvaluationStrategy8989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvaluationStrategy9006 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_36_in_ruleEvaluationStrategy9024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy9047 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_ruleEvaluationStrategy9060 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy9083 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluationStrategy9099 = new BitSet(new long[]{0x0008000000008010L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleEvaluationStrategy9165 = new BitSet(new long[]{0x0008000000008010L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleEvaluationStrategy9241 = new BitSet(new long[]{0x0008000000008010L});
    public static final BitSet FOLLOW_15_in_ruleEvaluationStrategy9294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation9330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation9340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluation9388 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation9400 = new BitSet(new long[]{0x0100000000000040L,0x00000000000007C4L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleEvaluation9422 = new BitSet(new long[]{0x00007FC00002C000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluation9445 = new BitSet(new long[]{0x00007FC00002C000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluation9510 = new BitSet(new long[]{0x00007FE00000C002L});
    public static final BitSet FOLLOW_37_in_ruleEvaluation9529 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEvaluation9554 = new BitSet(new long[]{0x00007FC00000C002L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_ruleEvaluation9632 = new BitSet(new long[]{0x00007FC00000C002L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation9708 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvaluation9721 = new BitSet(new long[]{0x00007FC00000C002L});
    public static final BitSet FOLLOW_17_in_ruleEvaluation9786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange9823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationRange9833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEvaluationRange9915 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange9927 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange9944 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEvaluationRange9961 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_39_in_ruleEvaluationRange10029 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange10041 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange10058 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEvaluationRange10075 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_40_in_ruleEvaluationRange10143 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange10155 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange10172 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEvaluationRange10189 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet10271 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIEvalValueSet10281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQuantitativeEvalValueSet_in_ruleKPIEvalValueSet10328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQualitativeEvalValueSet_in_ruleKPIEvalValueSet10355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQuantitativeEvalValueSet_in_entryRuleKPIQuantitativeEvalValueSet10390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIQuantitativeEvalValueSet10400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleKPIQuantitativeEvalValueSet10482 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10494 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10511 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10528 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_42_in_ruleKPIQuantitativeEvalValueSet10596 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10608 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10625 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10642 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_43_in_ruleKPIQuantitativeEvalValueSet10710 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10722 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10739 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10756 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_44_in_ruleKPIQuantitativeEvalValueSet10824 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10836 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10853 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10870 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_45_in_ruleKPIQuantitativeEvalValueSet10938 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKPIQuantitativeEvalValueSet10967 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10984 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_ruleKPIQualitativeEvalValueSet_in_entryRuleKPIQualitativeEvalValueSet11066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIQualitativeEvalValueSet11076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleKPIQualitativeEvalValueSet11113 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQualitativeEvalValueSet11125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleKPIQualitativeEvalValueSet11148 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKPIQualitativeEvalValueSet11160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping11196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitativeMapping11206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleQualitativeMapping11243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeMapping11260 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualitativeMapping11277 = new BitSet(new long[]{0x0008000000008020L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleQualitativeMapping11343 = new BitSet(new long[]{0x0008000000008020L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleQualitativeMapping11419 = new BitSet(new long[]{0x0008000000008020L});
    public static final BitSet FOLLOW_15_in_ruleQualitativeMapping11472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping11508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping11518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMapping11560 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMapping11577 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMapping11594 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMapping11611 = new BitSet(new long[]{0x0100000000000000L,0x00000000000007C4L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleMapping11632 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMapping11644 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleMapping11661 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMapping11678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionGroup_in_entryRuleContributionGroup11714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionGroup11724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleContributionGroup11761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup11778 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleContributionGroup11795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup11815 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleContributionGroup11828 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup11848 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleContributionGroup11862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionContext_in_entryRuleContributionContext11898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionContext11908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleContributionContext11945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionContext11962 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_36_in_ruleContributionContext11980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionContext12003 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_ruleContributionContext12016 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionContext12039 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionContext12055 = new BitSet(new long[]{0x0008000000008010L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleContributionContext12121 = new BitSet(new long[]{0x0008000000008010L});
    public static final BitSet FOLLOW_ruleContributionChange_in_ruleContributionContext12197 = new BitSet(new long[]{0x0008000000008010L});
    public static final BitSet FOLLOW_15_in_ruleContributionContext12250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionChange_in_entryRuleContributionChange12286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionChange12296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionChange12344 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleContributionChange12356 = new BitSet(new long[]{0x8000000000000040L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionChange12378 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionChange12401 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleContributionChange12420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleContributionChange12439 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_ruleContributionRange_in_ruleContributionChange12460 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionChange12472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionRange_in_entryRuleContributionRange12510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionRange12520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleContributionRange12602 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange12614 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange12631 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleContributionRange12648 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_39_in_ruleContributionRange12716 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange12728 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange12745 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleContributionRange12762 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_40_in_ruleContributionRange12830 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange12842 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange12859 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleContributionRange12876 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_entryRuleMetadata12958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadata12968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleMetadata13005 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetadata13022 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMetadata13039 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata13056 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMetadata13073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment13109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment13119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleComment13156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComment13173 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleComment13190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_entryRuleLinkType13226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkType13236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLinkType13273 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkType13290 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLinkType13307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink13343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink13353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink13401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink13424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink13447 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleLink13460 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink13483 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleLink13497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinLineLink_in_entryRuleinLineLink13533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinLineLink13543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleinLineLink13591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleinLineLink13614 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleinLineLink13627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleinLineLink13650 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleinLineLink13664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicatorGroup_in_entryRuleIndicatorGroup13700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndicatorGroup13710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleIndicatorGroup13747 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicatorGroup13764 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleIndicatorGroup13781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleIndicatorGroup13804 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_30_in_ruleIndicatorGroup13817 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleIndicatorGroup13840 = new BitSet(new long[]{0x0000000040020000L});
    public static final BitSet FOLLOW_17_in_ruleIndicatorGroup13854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName13902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13942 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleQualifiedName13961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13976 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_56_in_ruleImportanceType14037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleImportanceType14054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleImportanceType14071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleImportanceType14088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDecompositionType14133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDecompositionType14150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDecompositionType14167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleContributionType14212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleContributionType14229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleContributionType14246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleContributionType14263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleContributionType14280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleContributionType14297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleContributionType14314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleQualitativeLabel14359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleQualitativeLabel14376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleQualitativeLabel14393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleQualitativeLabel14410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleQualitativeLabel14427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleQualitativeLabel14444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleQualitativeLabel14461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleColor14506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleColor14523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleColor14540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleColor14557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleColor14574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleColor14591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleColor14608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleColor14625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleColor14642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleColor14659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleColor14676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleColor14693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleColor14710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleColor14727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleColor14744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleColor14761 = new BitSet(new long[]{0x0000000000000002L});

}
