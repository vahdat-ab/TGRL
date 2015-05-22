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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALITATIVEVALUE", "RULE_DOUBLE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grl'", "'{'", "'}'", "'actor'", "';'", "'name'", "'='", "'importance'", "'description'", "'softGoal'", "'decompositionType'", "'goal'", "'task'", "'resource'", "'indicator'", "'belief'", "','", "'dependsOn'", "'contributesTo'", "'decomposedBy'", "'link'", "'strategyGroup'", "'includes'", "'strategy'", "'extends'", "'exceeds'", "'start'", "'end'", "'step'", "'target'", "'threshold'", "'worst'", "'eval'", "'unit'", "'qualeval'", "'qualitativeMapping'", "'contributionGroup'", "'contribution'", "':'", "'metadata'", "'comment'", "'indicatorGroup'", "'.'", "'none'", "'high'", "'medium'", "'low'", "'and'", "'or'", "'xor'", "'help'", "'make'", "'somePositive'", "'unknown'", "'someNegative'", "'hurt'", "'break'", "'denied'", "'weaklyDenied'", "'weaklySatisfied'", "'satisfied'", "'conflict'", "'false'", "'true'"
    };
    public static final int T__50=50;
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
    public static final int RULE_INT=8;
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
    public static final int RULE_QUALITATIVEVALUE=6;
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
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:118:1: ruleGRLBaseElement returns [EObject current=null] : (this_GRLElement_0= ruleGRLElement | this_Mapping_1= ruleMapping | this_InLineElementLink_2= ruleInLineElementLink ) ;
    public final EObject ruleGRLBaseElement() throws RecognitionException {
        EObject current = null;

        EObject this_GRLElement_0 = null;

        EObject this_Mapping_1 = null;

        EObject this_InLineElementLink_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:121:28: ( (this_GRLElement_0= ruleGRLElement | this_Mapping_1= ruleMapping | this_InLineElementLink_2= ruleInLineElementLink ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:122:1: (this_GRLElement_0= ruleGRLElement | this_Mapping_1= ruleMapping | this_InLineElementLink_2= ruleInLineElementLink )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:122:1: (this_GRLElement_0= ruleGRLElement | this_Mapping_1= ruleMapping | this_InLineElementLink_2= ruleInLineElementLink )
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:133:5: this_Mapping_1= ruleMapping
                    {
                     
                            newCompositeNode(grammarAccess.getGRLBaseElementAccess().getMappingParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleMapping_in_ruleGRLBaseElement252);
                    this_Mapping_1=ruleMapping();

                    state._fsp--;

                     
                            current = this_Mapping_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:143:5: this_InLineElementLink_2= ruleInLineElementLink
                    {
                     
                            newCompositeNode(grammarAccess.getGRLBaseElementAccess().getInLineElementLinkParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleGRLBaseElement279);
                    this_InLineElementLink_2=ruleInLineElementLink();

                    state._fsp--;

                     
                            current = this_InLineElementLink_2; 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:168:1: ruleGRLElement returns [EObject current=null] : (this_SuperIntentionalElement_0= ruleSuperIntentionalElement | this_NormalElementLink_1= ruleNormalElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_IndicatorGroup_4= ruleIndicatorGroup | this_EvaluationStrategy_5= ruleEvaluationStrategy | this_Evaluation_6= ruleEvaluation | this_ContributionGroup_7= ruleContributionGroup | this_ContributionContext_8= ruleContributionContext | this_QualitativeMapping_9= ruleQualitativeMapping | this_Metadata_10= ruleMetadata | this_Comment_11= ruleComment | this_LinkType_12= ruleLinkType ) ;
    public final EObject ruleGRLElement() throws RecognitionException {
        EObject current = null;

        EObject this_SuperIntentionalElement_0 = null;

        EObject this_NormalElementLink_1 = null;

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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:171:28: ( (this_SuperIntentionalElement_0= ruleSuperIntentionalElement | this_NormalElementLink_1= ruleNormalElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_IndicatorGroup_4= ruleIndicatorGroup | this_EvaluationStrategy_5= ruleEvaluationStrategy | this_Evaluation_6= ruleEvaluation | this_ContributionGroup_7= ruleContributionGroup | this_ContributionContext_8= ruleContributionContext | this_QualitativeMapping_9= ruleQualitativeMapping | this_Metadata_10= ruleMetadata | this_Comment_11= ruleComment | this_LinkType_12= ruleLinkType ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:172:1: (this_SuperIntentionalElement_0= ruleSuperIntentionalElement | this_NormalElementLink_1= ruleNormalElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_IndicatorGroup_4= ruleIndicatorGroup | this_EvaluationStrategy_5= ruleEvaluationStrategy | this_Evaluation_6= ruleEvaluation | this_ContributionGroup_7= ruleContributionGroup | this_ContributionContext_8= ruleContributionContext | this_QualitativeMapping_9= ruleQualitativeMapping | this_Metadata_10= ruleMetadata | this_Comment_11= ruleComment | this_LinkType_12= ruleLinkType )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:172:1: (this_SuperIntentionalElement_0= ruleSuperIntentionalElement | this_NormalElementLink_1= ruleNormalElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_IndicatorGroup_4= ruleIndicatorGroup | this_EvaluationStrategy_5= ruleEvaluationStrategy | this_Evaluation_6= ruleEvaluation | this_ContributionGroup_7= ruleContributionGroup | this_ContributionContext_8= ruleContributionContext | this_QualitativeMapping_9= ruleQualitativeMapping | this_Metadata_10= ruleMetadata | this_Comment_11= ruleComment | this_LinkType_12= ruleLinkType )
            int alt3=13;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:173:5: this_SuperIntentionalElement_0= ruleSuperIntentionalElement
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getSuperIntentionalElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSuperIntentionalElement_in_ruleGRLElement371);
                    this_SuperIntentionalElement_0=ruleSuperIntentionalElement();

                    state._fsp--;

                     
                            current = this_SuperIntentionalElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:183:5: this_NormalElementLink_1= ruleNormalElementLink
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getNormalElementLinkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNormalElementLink_in_ruleGRLElement398);
                    this_NormalElementLink_1=ruleNormalElementLink();

                    state._fsp--;

                     
                            current = this_NormalElementLink_1; 
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


    // $ANTLR start "entryRuleSuperIntentionalElement"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:309:1: entryRuleSuperIntentionalElement returns [EObject current=null] : iv_ruleSuperIntentionalElement= ruleSuperIntentionalElement EOF ;
    public final EObject entryRuleSuperIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperIntentionalElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:310:2: (iv_ruleSuperIntentionalElement= ruleSuperIntentionalElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:311:2: iv_ruleSuperIntentionalElement= ruleSuperIntentionalElement EOF
            {
             newCompositeNode(grammarAccess.getSuperIntentionalElementRule()); 
            pushFollow(FOLLOW_ruleSuperIntentionalElement_in_entryRuleSuperIntentionalElement730);
            iv_ruleSuperIntentionalElement=ruleSuperIntentionalElement();

            state._fsp--;

             current =iv_ruleSuperIntentionalElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSuperIntentionalElement740); 

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
    // $ANTLR end "entryRuleSuperIntentionalElement"


    // $ANTLR start "ruleSuperIntentionalElement"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:318:1: ruleSuperIntentionalElement returns [EObject current=null] : (this_IntentionalElement_0= ruleIntentionalElement | this_Belief_1= ruleBelief ) ;
    public final EObject ruleSuperIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_IntentionalElement_0 = null;

        EObject this_Belief_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:321:28: ( (this_IntentionalElement_0= ruleIntentionalElement | this_Belief_1= ruleBelief ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:322:1: (this_IntentionalElement_0= ruleIntentionalElement | this_Belief_1= ruleBelief )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:322:1: (this_IntentionalElement_0= ruleIntentionalElement | this_Belief_1= ruleBelief )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22||(LA4_0>=24 && LA4_0<=27)) ) {
                alt4=1;
            }
            else if ( (LA4_0==28) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:323:5: this_IntentionalElement_0= ruleIntentionalElement
                    {
                     
                            newCompositeNode(grammarAccess.getSuperIntentionalElementAccess().getIntentionalElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntentionalElement_in_ruleSuperIntentionalElement787);
                    this_IntentionalElement_0=ruleIntentionalElement();

                    state._fsp--;

                     
                            current = this_IntentionalElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:333:5: this_Belief_1= ruleBelief
                    {
                     
                            newCompositeNode(grammarAccess.getSuperIntentionalElementAccess().getBeliefParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBelief_in_ruleSuperIntentionalElement814);
                    this_Belief_1=ruleBelief();

                    state._fsp--;

                     
                            current = this_Belief_1; 
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
    // $ANTLR end "ruleSuperIntentionalElement"


    // $ANTLR start "entryRuleIntentionalElement"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:349:1: entryRuleIntentionalElement returns [EObject current=null] : iv_ruleIntentionalElement= ruleIntentionalElement EOF ;
    public final EObject entryRuleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentionalElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:350:2: (iv_ruleIntentionalElement= ruleIntentionalElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:351:2: iv_ruleIntentionalElement= ruleIntentionalElement EOF
            {
             newCompositeNode(grammarAccess.getIntentionalElementRule()); 
            pushFollow(FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement849);
            iv_ruleIntentionalElement=ruleIntentionalElement();

            state._fsp--;

             current =iv_ruleIntentionalElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntentionalElement859); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:358:1: ruleIntentionalElement returns [EObject current=null] : (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator ) ;
    public final EObject ruleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Softgoal_0 = null;

        EObject this_Goal_1 = null;

        EObject this_Task_2 = null;

        EObject this_Resource_3 = null;

        EObject this_Indicator_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:361:28: ( (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:362:1: (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:362:1: (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 24:
                {
                alt5=2;
                }
                break;
            case 25:
                {
                alt5=3;
                }
                break;
            case 26:
                {
                alt5=4;
                }
                break;
            case 27:
                {
                alt5=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:363:5: this_Softgoal_0= ruleSoftgoal
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getSoftgoalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSoftgoal_in_ruleIntentionalElement906);
                    this_Softgoal_0=ruleSoftgoal();

                    state._fsp--;

                     
                            current = this_Softgoal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:373:5: this_Goal_1= ruleGoal
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getGoalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGoal_in_ruleIntentionalElement933);
                    this_Goal_1=ruleGoal();

                    state._fsp--;

                     
                            current = this_Goal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:383:5: this_Task_2= ruleTask
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getTaskParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTask_in_ruleIntentionalElement960);
                    this_Task_2=ruleTask();

                    state._fsp--;

                     
                            current = this_Task_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:393:5: this_Resource_3= ruleResource
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getResourceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleIntentionalElement987);
                    this_Resource_3=ruleResource();

                    state._fsp--;

                     
                            current = this_Resource_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:403:5: this_Indicator_4= ruleIndicator
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getIndicatorParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIndicator_in_ruleIntentionalElement1014);
                    this_Indicator_4=ruleIndicator();

                    state._fsp--;

                     
                            current = this_Indicator_4; 
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


    // $ANTLR start "entryRuleGRLSpecification"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:419:1: entryRuleGRLSpecification returns [EObject current=null] : iv_ruleGRLSpecification= ruleGRLSpecification EOF ;
    public final EObject entryRuleGRLSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRLSpecification = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:420:2: (iv_ruleGRLSpecification= ruleGRLSpecification EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:421:2: iv_ruleGRLSpecification= ruleGRLSpecification EOF
            {
             newCompositeNode(grammarAccess.getGRLSpecificationRule()); 
            pushFollow(FOLLOW_ruleGRLSpecification_in_entryRuleGRLSpecification1049);
            iv_ruleGRLSpecification=ruleGRLSpecification();

            state._fsp--;

             current =iv_ruleGRLSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRLSpecification1059); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:428:1: ruleGRLSpecification returns [EObject current=null] : ( () otherlv_1= 'grl' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_grlElements_4_0= ruleGRLElement ) )* otherlv_5= '}' ) ;
    public final EObject ruleGRLSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_grlElements_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:431:28: ( ( () otherlv_1= 'grl' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_grlElements_4_0= ruleGRLElement ) )* otherlv_5= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:432:1: ( () otherlv_1= 'grl' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_grlElements_4_0= ruleGRLElement ) )* otherlv_5= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:432:1: ( () otherlv_1= 'grl' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_grlElements_4_0= ruleGRLElement ) )* otherlv_5= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:432:2: () otherlv_1= 'grl' ( (lv_name_2_0= RULE_ID ) )? otherlv_3= '{' ( (lv_grlElements_4_0= ruleGRLElement ) )* otherlv_5= '}'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:432:2: ()
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:433:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGRLSpecificationAccess().getGRLSpecificationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleGRLSpecification1105); 

                	newLeafNode(otherlv_1, grammarAccess.getGRLSpecificationAccess().getGrlKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:442:1: ( (lv_name_2_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:443:1: (lv_name_2_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:443:1: (lv_name_2_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:444:3: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGRLSpecification1122); 

                    			newLeafNode(lv_name_2_0, grammarAccess.getGRLSpecificationAccess().getNameIDTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGRLSpecificationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_2_0, 
                            		"ID");
                    	    

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleGRLSpecification1140); 

                	newLeafNode(otherlv_3, grammarAccess.getGRLSpecificationAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:464:1: ( (lv_grlElements_4_0= ruleGRLElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||LA7_0==16||LA7_0==22||(LA7_0>=24 && LA7_0<=28)||(LA7_0>=33 && LA7_0<=34)||LA7_0==36||(LA7_0>=48 && LA7_0<=50)||(LA7_0>=52 && LA7_0<=54)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:465:1: (lv_grlElements_4_0= ruleGRLElement )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:465:1: (lv_grlElements_4_0= ruleGRLElement )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:466:3: lv_grlElements_4_0= ruleGRLElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLSpecificationAccess().getGrlElementsGRLElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGRLElement_in_ruleGRLSpecification1161);
            	    lv_grlElements_4_0=ruleGRLElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGRLSpecificationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"grlElements",
            	            		lv_grlElements_4_0, 
            	            		"GRLElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleGRLSpecification1174); 

                	newLeafNode(otherlv_5, grammarAccess.getGRLSpecificationAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:494:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:495:2: (iv_ruleActor= ruleActor EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:496:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor1210);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor1220); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:503:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) ) ) ;
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
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_importanceQuantitative_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_description_16_0=null;
        Token otherlv_17=null;
        Token otherlv_21=null;
        Enumerator lv_importance_11_0 = null;

        EObject lv_metaData_18_0 = null;

        EObject lv_elemets_19_0 = null;

        EObject lv_elemets_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:506:28: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:507:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:507:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:507:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleActor1257); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:511:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:512:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:512:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:513:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1274); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:529:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            else if ( (LA13_0==14) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:529:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleActor1292); 

                        	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:534:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:534:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:534:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleActor1311); 

                        	newLeafNode(otherlv_3, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:538:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:540:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:540:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:541:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:544:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:545:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:545:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) ) )*
                    loop12:
                    do {
                        int alt12=6;
                        int LA12_0 = input.LA(1);

                        if ( LA12_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt12=1;
                        }
                        else if ( LA12_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt12=2;
                        }
                        else if ( LA12_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt12=3;
                        }
                        else if ( LA12_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 3) ) {
                            alt12=4;
                        }
                        else if ( (LA12_0==RULE_ID||LA12_0==22|| LA12_0 >=24 && LA12_0<=28) && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 4) ) {
                            alt12=5;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:547:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:547:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:548:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:548:106: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:549:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:552:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:552:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:552:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:552:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleActor1369); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleActor1381); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getActorAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:560:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:561:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:561:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:562:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1398); 

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

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleActor1415); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getActorAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:589:4: ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:589:4: ({...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:590:5: {...}? => ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:590:106: ( ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:591:6: ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:594:6: ({...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:594:7: {...}? => (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:594:16: (otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:594:18: otherlv_9= 'importance' otherlv_10= '=' ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_13= ';'
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleActor1483); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getActorAccess().getImportanceKeyword_2_1_1_1_0());
                    	        
                    	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleActor1495); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getActorAccess().getEqualsSignKeyword_2_1_1_1_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:602:1: ( ( (lv_importance_11_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) ) )
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( ((LA8_0>=56 && LA8_0<=59)) ) {
                    	        alt8=1;
                    	    }
                    	    else if ( (LA8_0==RULE_QUALITATIVEVALUE) ) {
                    	        alt8=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 8, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:602:2: ( (lv_importance_11_0= ruleImportanceType ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:602:2: ( (lv_importance_11_0= ruleImportanceType ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:603:1: (lv_importance_11_0= ruleImportanceType )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:603:1: (lv_importance_11_0= ruleImportanceType )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:604:3: lv_importance_11_0= ruleImportanceType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getActorAccess().getImportanceImportanceTypeEnumRuleCall_2_1_1_1_2_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImportanceType_in_ruleActor1517);
                    	            lv_importance_11_0=ruleImportanceType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getActorRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"importance",
                    	                    		lv_importance_11_0, 
                    	                    		"ImportanceType");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:621:6: ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:621:6: ( (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:622:1: (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:622:1: (lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:623:3: lv_importanceQuantitative_12_0= RULE_QUALITATIVEVALUE
                    	            {
                    	            lv_importanceQuantitative_12_0=(Token)match(input,RULE_QUALITATIVEVALUE,FOLLOW_RULE_QUALITATIVEVALUE_in_ruleActor1540); 

                    	            			newLeafNode(lv_importanceQuantitative_12_0, grammarAccess.getActorAccess().getImportanceQuantitativeQUALITATIVEVALUETerminalRuleCall_2_1_1_1_2_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getActorRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"importanceQuantitative",
                    	                    		lv_importanceQuantitative_12_0, 
                    	                    		"QUALITATIVEVALUE");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleActor1558); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getActorAccess().getSemicolonKeyword_2_1_1_1_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:650:4: ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:650:4: ({...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:651:5: {...}? => ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:651:106: ( ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:652:6: ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:655:6: ({...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:655:7: {...}? => (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:655:16: (otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:655:18: otherlv_14= 'description' otherlv_15= '=' ( (lv_description_16_0= RULE_STRING ) ) otherlv_17= ';'
                    	    {
                    	    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleActor1626); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getActorAccess().getDescriptionKeyword_2_1_1_2_0());
                    	        
                    	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleActor1638); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getActorAccess().getEqualsSignKeyword_2_1_1_2_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:663:1: ( (lv_description_16_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:664:1: (lv_description_16_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:664:1: (lv_description_16_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:665:3: lv_description_16_0= RULE_STRING
                    	    {
                    	    lv_description_16_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1655); 

                    	    			newLeafNode(lv_description_16_0, grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_2_1_1_2_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getActorRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"description",
                    	            		lv_description_16_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_17=(Token)match(input,17,FOLLOW_17_in_ruleActor1672); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getActorAccess().getSemicolonKeyword_2_1_1_2_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:692:4: ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:692:4: ({...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:693:5: {...}? => ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 3)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:693:106: ( ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:694:6: ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 3);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:697:6: ({...}? => ( (lv_metaData_18_0= ruleMetadata ) ) )+
                    	    int cnt9=0;
                    	    loop9:
                    	    do {
                    	        int alt9=2;
                    	        int LA9_0 = input.LA(1);

                    	        if ( (LA9_0==52) ) {
                    	            int LA9_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt9=1;
                    	            }


                    	        }


                    	        switch (alt9) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:697:7: {...}? => ( (lv_metaData_18_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleActor", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:697:16: ( (lv_metaData_18_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:698:1: (lv_metaData_18_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:698:1: (lv_metaData_18_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:699:3: lv_metaData_18_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getActorAccess().getMetaDataMetadataParserRuleCall_2_1_1_3_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleActor1748);
                    	    	    lv_metaData_18_0=ruleMetadata();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getActorRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"metaData",
                    	    	            		lv_metaData_18_0, 
                    	    	            		"Metadata");
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

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:722:4: ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:722:4: ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:723:5: {...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 4)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:723:106: ( ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:724:6: ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1(), 4);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:727:6: ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+
                    	    int cnt11=0;
                    	    loop11:
                    	    do {
                    	        int alt11=2;
                    	        alt11 = dfa11.predict(input);
                    	        switch (alt11) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:727:7: {...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleActor", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:727:16: ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) )
                    	    	    int alt10=2;
                    	    	    int LA10_0 = input.LA(1);

                    	    	    if ( (LA10_0==22||(LA10_0>=24 && LA10_0<=28)) ) {
                    	    	        alt10=1;
                    	    	    }
                    	    	    else if ( (LA10_0==RULE_ID) ) {
                    	    	        alt10=2;
                    	    	    }
                    	    	    else {
                    	    	        NoViableAltException nvae =
                    	    	            new NoViableAltException("", 10, 0, input);

                    	    	        throw nvae;
                    	    	    }
                    	    	    switch (alt10) {
                    	    	        case 1 :
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:727:17: ( (lv_elemets_19_0= ruleSuperIntentionalElement ) )
                    	    	            {
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:727:17: ( (lv_elemets_19_0= ruleSuperIntentionalElement ) )
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:728:1: (lv_elemets_19_0= ruleSuperIntentionalElement )
                    	    	            {
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:728:1: (lv_elemets_19_0= ruleSuperIntentionalElement )
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:729:3: lv_elemets_19_0= ruleSuperIntentionalElement
                    	    	            {
                    	    	             
                    	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsSuperIntentionalElementParserRuleCall_2_1_1_4_0_0()); 
                    	    	            	    
                    	    	            pushFollow(FOLLOW_ruleSuperIntentionalElement_in_ruleActor1825);
                    	    	            lv_elemets_19_0=ruleSuperIntentionalElement();

                    	    	            state._fsp--;


                    	    	            	        if (current==null) {
                    	    	            	            current = createModelElementForParent(grammarAccess.getActorRule());
                    	    	            	        }
                    	    	                   		add(
                    	    	                   			current, 
                    	    	                   			"elemets",
                    	    	                    		lv_elemets_19_0, 
                    	    	                    		"SuperIntentionalElement");
                    	    	            	        afterParserOrEnumRuleCall();
                    	    	            	    

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;
                    	    	        case 2 :
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:746:6: ( (lv_elemets_20_0= ruleNormalElementLink ) )
                    	    	            {
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:746:6: ( (lv_elemets_20_0= ruleNormalElementLink ) )
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:747:1: (lv_elemets_20_0= ruleNormalElementLink )
                    	    	            {
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:747:1: (lv_elemets_20_0= ruleNormalElementLink )
                    	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:748:3: lv_elemets_20_0= ruleNormalElementLink
                    	    	            {
                    	    	             
                    	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsNormalElementLinkParserRuleCall_2_1_1_4_1_0()); 
                    	    	            	    
                    	    	            pushFollow(FOLLOW_ruleNormalElementLink_in_ruleActor1852);
                    	    	            lv_elemets_20_0=ruleNormalElementLink();

                    	    	            state._fsp--;


                    	    	            	        if (current==null) {
                    	    	            	            current = createModelElementForParent(grammarAccess.getActorRule());
                    	    	            	        }
                    	    	                   		add(
                    	    	                   			current, 
                    	    	                   			"elemets",
                    	    	                    		lv_elemets_20_0, 
                    	    	                    		"NormalElementLink");
                    	    	            	        afterParserOrEnumRuleCall();
                    	    	            	    

                    	    	            }


                    	    	            }


                    	    	            }
                    	    	            break;

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

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

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

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getActorAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleActor1906); 

                        	newLeafNode(otherlv_21, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:790:1: entryRuleSoftgoal returns [EObject current=null] : iv_ruleSoftgoal= ruleSoftgoal EOF ;
    public final EObject entryRuleSoftgoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftgoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:791:2: (iv_ruleSoftgoal= ruleSoftgoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:792:2: iv_ruleSoftgoal= ruleSoftgoal EOF
            {
             newCompositeNode(grammarAccess.getSoftgoalRule()); 
            pushFollow(FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal1944);
            iv_ruleSoftgoal=ruleSoftgoal();

            state._fsp--;

             current =iv_ruleSoftgoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftgoal1954); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:799:1: ruleSoftgoal returns [EObject current=null] : (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) ) ;
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
        Token lv_importanceQuantitative_20_0=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Enumerator lv_decompositionType_15_0 = null;

        Enumerator lv_importance_19_0 = null;

        EObject lv_metaData_22_0 = null;

        EObject lv_elementLinks_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:802:28: ( (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:803:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:803:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:803:3: otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleSoftgoal1991); 

                	newLeafNode(otherlv_0, grammarAccess.getSoftgoalAccess().getSoftGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:807:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:808:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:808:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:809:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftgoal2008); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:825:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            else if ( (LA18_0==14) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:825:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2026); 

                        	newLeafNode(otherlv_2, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:830:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:830:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:830:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleSoftgoal2045); 

                        	newLeafNode(otherlv_3, grammarAccess.getSoftgoalAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:834:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:836:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:836:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:837:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:840:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:841:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:841:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
                    loop17:
                    do {
                        int alt17=7;
                        int LA17_0 = input.LA(1);

                        if ( LA17_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt17=1;
                        }
                        else if ( LA17_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt17=2;
                        }
                        else if ( LA17_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt17=3;
                        }
                        else if ( LA17_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 3) ) {
                            alt17=4;
                        }
                        else if ( LA17_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 4) ) {
                            alt17=5;
                        }
                        else if ( (LA17_0==RULE_ID|| LA17_0 >=30 && LA17_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 5) ) {
                            alt17=6;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:843:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:843:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:844:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:844:109: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:845:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:848:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:848:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:848:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:848:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2103); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getSoftgoalAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2115); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:856:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:857:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:857:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:858:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal2132); 

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

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2149); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:885:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:885:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:886:5: {...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:886:109: ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:887:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:890:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:890:7: {...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:890:16: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:890:18: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';'
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleSoftgoal2217); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSoftgoalAccess().getDescriptionKeyword_2_1_1_1_0());
                    	        
                    	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2229); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_2_1_1_1_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:898:1: ( (lv_description_11_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:899:1: (lv_description_11_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:899:1: (lv_description_11_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:900:3: lv_description_11_0= RULE_STRING
                    	    {
                    	    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal2246); 

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

                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2263); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_2_1_1_1_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:927:4: ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:927:4: ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:928:5: {...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:928:109: ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:929:6: ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:932:6: ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:932:7: {...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:932:16: (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:932:18: otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';'
                    	    {
                    	    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleSoftgoal2331); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getSoftgoalAccess().getDecompositionTypeKeyword_2_1_1_2_0());
                    	        
                    	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2343); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_2_1_1_2_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:940:1: ( (lv_decompositionType_15_0= ruleDecompositionType ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:941:1: (lv_decompositionType_15_0= ruleDecompositionType )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:941:1: (lv_decompositionType_15_0= ruleDecompositionType )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:942:3: lv_decompositionType_15_0= ruleDecompositionType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_1_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleSoftgoal2364);
                    	    lv_decompositionType_15_0=ruleDecompositionType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"decompositionType",
                    	            		lv_decompositionType_15_0, 
                    	            		"DecompositionType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2376); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_2_1_1_2_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:969:4: ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:969:4: ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:970:5: {...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 3)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:970:109: ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:971:6: ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 3);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:974:6: ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:974:7: {...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:974:16: (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:974:18: otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';'
                    	    {
                    	    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleSoftgoal2444); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getSoftgoalAccess().getImportanceKeyword_2_1_1_3_0());
                    	        
                    	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2456); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_2_1_1_3_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:982:1: ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) )
                    	    int alt14=2;
                    	    int LA14_0 = input.LA(1);

                    	    if ( ((LA14_0>=56 && LA14_0<=59)) ) {
                    	        alt14=1;
                    	    }
                    	    else if ( (LA14_0==RULE_QUALITATIVEVALUE) ) {
                    	        alt14=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 14, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt14) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:982:2: ( (lv_importance_19_0= ruleImportanceType ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:982:2: ( (lv_importance_19_0= ruleImportanceType ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:983:1: (lv_importance_19_0= ruleImportanceType )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:983:1: (lv_importance_19_0= ruleImportanceType )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:984:3: lv_importance_19_0= ruleImportanceType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getSoftgoalAccess().getImportanceImportanceTypeEnumRuleCall_2_1_1_3_2_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImportanceType_in_ruleSoftgoal2478);
                    	            lv_importance_19_0=ruleImportanceType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"importance",
                    	                    		lv_importance_19_0, 
                    	                    		"ImportanceType");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1001:6: ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1001:6: ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1002:1: (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1002:1: (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1003:3: lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE
                    	            {
                    	            lv_importanceQuantitative_20_0=(Token)match(input,RULE_QUALITATIVEVALUE,FOLLOW_RULE_QUALITATIVEVALUE_in_ruleSoftgoal2501); 

                    	            			newLeafNode(lv_importanceQuantitative_20_0, grammarAccess.getSoftgoalAccess().getImportanceQuantitativeQUALITATIVEVALUETerminalRuleCall_2_1_1_3_2_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getSoftgoalRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"importanceQuantitative",
                    	                    		lv_importanceQuantitative_20_0, 
                    	                    		"QUALITATIVEVALUE");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2519); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_2_1_1_3_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1030:4: ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1030:4: ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1031:5: {...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 4)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1031:109: ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1032:6: ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 4);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1035:6: ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+
                    	    int cnt15=0;
                    	    loop15:
                    	    do {
                    	        int alt15=2;
                    	        int LA15_0 = input.LA(1);

                    	        if ( (LA15_0==52) ) {
                    	            int LA15_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt15=1;
                    	            }


                    	        }


                    	        switch (alt15) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1035:7: {...}? => ( (lv_metaData_22_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1035:16: ( (lv_metaData_22_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1036:1: (lv_metaData_22_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1036:1: (lv_metaData_22_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1037:3: lv_metaData_22_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getMetaDataMetadataParserRuleCall_2_1_1_4_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleSoftgoal2595);
                    	    	    lv_metaData_22_0=ruleMetadata();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"metaData",
                    	    	            		lv_metaData_22_0, 
                    	    	            		"Metadata");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

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

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1060:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1060:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1061:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 5)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1061:109: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1062:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1(), 5);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1065:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
                    	    int cnt16=0;
                    	    loop16:
                    	    do {
                    	        int alt16=2;
                    	        switch ( input.LA(1) ) {
                    	        case 32:
                    	            {
                    	            int LA16_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt16=1;
                    	            }


                    	            }
                    	            break;
                    	        case 31:
                    	            {
                    	            int LA16_3 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt16=1;
                    	            }


                    	            }
                    	            break;
                    	        case 30:
                    	            {
                    	            int LA16_4 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt16=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ID:
                    	            {
                    	            int LA16_5 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt16=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt16) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1065:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1065:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1066:1: (lv_elementLinks_23_0= ruleInLineElementLink )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1066:1: (lv_elementLinks_23_0= ruleInLineElementLink )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1067:3: lv_elementLinks_23_0= ruleInLineElementLink
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getElementLinksInLineElementLinkParserRuleCall_2_1_1_5_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleSoftgoal2671);
                    	    	    lv_elementLinks_23_0=ruleInLineElementLink();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"elementLinks",
                    	    	            		lv_elementLinks_23_0, 
                    	    	            		"InLineElementLink");
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

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getSoftgoalAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleSoftgoal2724); 

                        	newLeafNode(otherlv_24, grammarAccess.getSoftgoalAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1109:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1110:2: (iv_ruleGoal= ruleGoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1111:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal2762);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal2772); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1118:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) ) ;
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
        Token lv_importanceQuantitative_20_0=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Enumerator lv_decompositionType_15_0 = null;

        Enumerator lv_importance_19_0 = null;

        EObject lv_metaData_22_0 = null;

        EObject lv_elementLinks_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1121:28: ( (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1122:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1122:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1122:3: otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGoal2809); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1126:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1127:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1127:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1128:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal2826); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1144:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==17) ) {
                alt23=1;
            }
            else if ( (LA23_0==14) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1144:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleGoal2844); 

                        	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1149:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1149:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1149:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleGoal2863); 

                        	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1153:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1155:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1155:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1156:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1159:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1160:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1160:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
                    loop22:
                    do {
                        int alt22=7;
                        int LA22_0 = input.LA(1);

                        if ( LA22_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt22=1;
                        }
                        else if ( LA22_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt22=2;
                        }
                        else if ( LA22_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt22=3;
                        }
                        else if ( LA22_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 3) ) {
                            alt22=4;
                        }
                        else if ( LA22_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 4) ) {
                            alt22=5;
                        }
                        else if ( (LA22_0==RULE_ID|| LA22_0 >=30 && LA22_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 5) ) {
                            alt22=6;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1162:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1162:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1163:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1163:105: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1164:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1167:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1167:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1167:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1167:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleGoal2921); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleGoal2933); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getGoalAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1175:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1176:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1176:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1177:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal2950); 

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

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleGoal2967); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1204:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1204:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1205:5: {...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1205:105: ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1206:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1209:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1209:7: {...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1209:16: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1209:18: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';'
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleGoal3035); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getDescriptionKeyword_2_1_1_1_0());
                    	        
                    	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleGoal3047); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getGoalAccess().getEqualsSignKeyword_2_1_1_1_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1217:1: ( (lv_description_11_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1218:1: (lv_description_11_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1218:1: (lv_description_11_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1219:3: lv_description_11_0= RULE_STRING
                    	    {
                    	    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3064); 

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

                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleGoal3081); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getGoalAccess().getSemicolonKeyword_2_1_1_1_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1246:4: ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1246:4: ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1247:5: {...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1247:105: ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1248:6: ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1251:6: ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1251:7: {...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1251:16: (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1251:18: otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';'
                    	    {
                    	    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleGoal3149); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getDecompositionTypeKeyword_2_1_1_2_0());
                    	        
                    	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleGoal3161); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getGoalAccess().getEqualsSignKeyword_2_1_1_2_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1259:1: ( (lv_decompositionType_15_0= ruleDecompositionType ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1260:1: (lv_decompositionType_15_0= ruleDecompositionType )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1260:1: (lv_decompositionType_15_0= ruleDecompositionType )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1261:3: lv_decompositionType_15_0= ruleDecompositionType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getGoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_1_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleGoal3182);
                    	    lv_decompositionType_15_0=ruleDecompositionType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"decompositionType",
                    	            		lv_decompositionType_15_0, 
                    	            		"DecompositionType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleGoal3194); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getGoalAccess().getSemicolonKeyword_2_1_1_2_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1288:4: ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1288:4: ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1289:5: {...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 3)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1289:105: ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1290:6: ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 3);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1293:6: ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1293:7: {...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1293:16: (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1293:18: otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';'
                    	    {
                    	    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleGoal3262); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getImportanceKeyword_2_1_1_3_0());
                    	        
                    	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleGoal3274); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getGoalAccess().getEqualsSignKeyword_2_1_1_3_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1301:1: ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) )
                    	    int alt19=2;
                    	    int LA19_0 = input.LA(1);

                    	    if ( ((LA19_0>=56 && LA19_0<=59)) ) {
                    	        alt19=1;
                    	    }
                    	    else if ( (LA19_0==RULE_QUALITATIVEVALUE) ) {
                    	        alt19=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 19, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt19) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1301:2: ( (lv_importance_19_0= ruleImportanceType ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1301:2: ( (lv_importance_19_0= ruleImportanceType ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1302:1: (lv_importance_19_0= ruleImportanceType )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1302:1: (lv_importance_19_0= ruleImportanceType )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1303:3: lv_importance_19_0= ruleImportanceType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getGoalAccess().getImportanceImportanceTypeEnumRuleCall_2_1_1_3_2_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImportanceType_in_ruleGoal3296);
                    	            lv_importance_19_0=ruleImportanceType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"importance",
                    	                    		lv_importance_19_0, 
                    	                    		"ImportanceType");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1320:6: ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1320:6: ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1321:1: (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1321:1: (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1322:3: lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE
                    	            {
                    	            lv_importanceQuantitative_20_0=(Token)match(input,RULE_QUALITATIVEVALUE,FOLLOW_RULE_QUALITATIVEVALUE_in_ruleGoal3319); 

                    	            			newLeafNode(lv_importanceQuantitative_20_0, grammarAccess.getGoalAccess().getImportanceQuantitativeQUALITATIVEVALUETerminalRuleCall_2_1_1_3_2_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getGoalRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"importanceQuantitative",
                    	                    		lv_importanceQuantitative_20_0, 
                    	                    		"QUALITATIVEVALUE");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleGoal3337); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getGoalAccess().getSemicolonKeyword_2_1_1_3_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1349:4: ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1349:4: ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1350:5: {...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 4)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1350:105: ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1351:6: ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 4);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1354:6: ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+
                    	    int cnt20=0;
                    	    loop20:
                    	    do {
                    	        int alt20=2;
                    	        int LA20_0 = input.LA(1);

                    	        if ( (LA20_0==52) ) {
                    	            int LA20_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt20=1;
                    	            }


                    	        }


                    	        switch (alt20) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1354:7: {...}? => ( (lv_metaData_22_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleGoal", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1354:16: ( (lv_metaData_22_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1355:1: (lv_metaData_22_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1355:1: (lv_metaData_22_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1356:3: lv_metaData_22_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getMetaDataMetadataParserRuleCall_2_1_1_4_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleGoal3413);
                    	    	    lv_metaData_22_0=ruleMetadata();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"metaData",
                    	    	            		lv_metaData_22_0, 
                    	    	            		"Metadata");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt20 >= 1 ) break loop20;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(20, input);
                    	                throw eee;
                    	        }
                    	        cnt20++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1379:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1379:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1380:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 5)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1380:105: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1381:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1(), 5);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1384:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
                    	    int cnt21=0;
                    	    loop21:
                    	    do {
                    	        int alt21=2;
                    	        switch ( input.LA(1) ) {
                    	        case 32:
                    	            {
                    	            int LA21_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt21=1;
                    	            }


                    	            }
                    	            break;
                    	        case 31:
                    	            {
                    	            int LA21_3 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt21=1;
                    	            }


                    	            }
                    	            break;
                    	        case 30:
                    	            {
                    	            int LA21_4 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt21=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ID:
                    	            {
                    	            int LA21_5 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt21=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt21) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1384:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleGoal", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1384:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1385:1: (lv_elementLinks_23_0= ruleInLineElementLink )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1385:1: (lv_elementLinks_23_0= ruleInLineElementLink )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1386:3: lv_elementLinks_23_0= ruleInLineElementLink
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getElementLinksInLineElementLinkParserRuleCall_2_1_1_5_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleGoal3489);
                    	    	    lv_elementLinks_23_0=ruleInLineElementLink();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"elementLinks",
                    	    	            		lv_elementLinks_23_0, 
                    	    	            		"InLineElementLink");
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

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getGoalAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleGoal3542); 

                        	newLeafNode(otherlv_24, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1428:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1429:2: (iv_ruleTask= ruleTask EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1430:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask3580);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask3590); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1437:1: ruleTask returns [EObject current=null] : (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) ) ;
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
        Token lv_importanceQuantitative_20_0=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Enumerator lv_decompositionType_15_0 = null;

        Enumerator lv_importance_19_0 = null;

        EObject lv_metaData_22_0 = null;

        EObject lv_elementLinks_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1440:28: ( (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1441:1: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1441:1: (otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1441:3: otherlv_0= 'task' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTask3627); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1445:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1446:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1446:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1447:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask3644); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1463:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            else if ( (LA28_0==14) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1463:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleTask3662); 

                        	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1468:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1468:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1468:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleTask3681); 

                        	newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1472:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1474:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1474:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1475:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1478:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1479:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1479:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
                    loop27:
                    do {
                        int alt27=7;
                        int LA27_0 = input.LA(1);

                        if ( LA27_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt27=1;
                        }
                        else if ( LA27_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt27=2;
                        }
                        else if ( LA27_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt27=3;
                        }
                        else if ( LA27_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 3) ) {
                            alt27=4;
                        }
                        else if ( LA27_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 4) ) {
                            alt27=5;
                        }
                        else if ( (LA27_0==RULE_ID|| LA27_0 >=30 && LA27_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 5) ) {
                            alt27=6;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1481:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1481:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1482:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1482:105: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1483:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1486:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1486:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1486:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1486:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleTask3739); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleTask3751); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1494:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1495:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1495:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1496:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask3768); 

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

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleTask3785); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1523:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1523:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1524:5: {...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1524:105: ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1525:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1528:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1528:7: {...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1528:16: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1528:18: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';'
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleTask3853); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getDescriptionKeyword_2_1_1_1_0());
                    	        
                    	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleTask3865); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getTaskAccess().getEqualsSignKeyword_2_1_1_1_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1536:1: ( (lv_description_11_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1537:1: (lv_description_11_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1537:1: (lv_description_11_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1538:3: lv_description_11_0= RULE_STRING
                    	    {
                    	    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask3882); 

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

                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleTask3899); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_1_1_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1565:4: ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1565:4: ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1566:5: {...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1566:105: ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1567:6: ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1570:6: ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1570:7: {...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1570:16: (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1570:18: otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';'
                    	    {
                    	    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleTask3967); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getDecompositionTypeKeyword_2_1_1_2_0());
                    	        
                    	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleTask3979); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getTaskAccess().getEqualsSignKeyword_2_1_1_2_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1578:1: ( (lv_decompositionType_15_0= ruleDecompositionType ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1579:1: (lv_decompositionType_15_0= ruleDecompositionType )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1579:1: (lv_decompositionType_15_0= ruleDecompositionType )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1580:3: lv_decompositionType_15_0= ruleDecompositionType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTaskAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_1_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleTask4000);
                    	    lv_decompositionType_15_0=ruleDecompositionType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"decompositionType",
                    	            		lv_decompositionType_15_0, 
                    	            		"DecompositionType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleTask4012); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_1_2_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1607:4: ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1607:4: ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1608:5: {...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 3)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1608:105: ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1609:6: ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 3);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1612:6: ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1612:7: {...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1612:16: (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1612:18: otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';'
                    	    {
                    	    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleTask4080); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getTaskAccess().getImportanceKeyword_2_1_1_3_0());
                    	        
                    	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleTask4092); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getTaskAccess().getEqualsSignKeyword_2_1_1_3_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1620:1: ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) )
                    	    int alt24=2;
                    	    int LA24_0 = input.LA(1);

                    	    if ( ((LA24_0>=56 && LA24_0<=59)) ) {
                    	        alt24=1;
                    	    }
                    	    else if ( (LA24_0==RULE_QUALITATIVEVALUE) ) {
                    	        alt24=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 24, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt24) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1620:2: ( (lv_importance_19_0= ruleImportanceType ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1620:2: ( (lv_importance_19_0= ruleImportanceType ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1621:1: (lv_importance_19_0= ruleImportanceType )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1621:1: (lv_importance_19_0= ruleImportanceType )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1622:3: lv_importance_19_0= ruleImportanceType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getTaskAccess().getImportanceImportanceTypeEnumRuleCall_2_1_1_3_2_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImportanceType_in_ruleTask4114);
                    	            lv_importance_19_0=ruleImportanceType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"importance",
                    	                    		lv_importance_19_0, 
                    	                    		"ImportanceType");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1639:6: ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1639:6: ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1640:1: (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1640:1: (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1641:3: lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE
                    	            {
                    	            lv_importanceQuantitative_20_0=(Token)match(input,RULE_QUALITATIVEVALUE,FOLLOW_RULE_QUALITATIVEVALUE_in_ruleTask4137); 

                    	            			newLeafNode(lv_importanceQuantitative_20_0, grammarAccess.getTaskAccess().getImportanceQuantitativeQUALITATIVEVALUETerminalRuleCall_2_1_1_3_2_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getTaskRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"importanceQuantitative",
                    	                    		lv_importanceQuantitative_20_0, 
                    	                    		"QUALITATIVEVALUE");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleTask4155); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getTaskAccess().getSemicolonKeyword_2_1_1_3_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1668:4: ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1668:4: ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1669:5: {...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 4)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1669:105: ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1670:6: ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 4);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1673:6: ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+
                    	    int cnt25=0;
                    	    loop25:
                    	    do {
                    	        int alt25=2;
                    	        int LA25_0 = input.LA(1);

                    	        if ( (LA25_0==52) ) {
                    	            int LA25_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt25=1;
                    	            }


                    	        }


                    	        switch (alt25) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1673:7: {...}? => ( (lv_metaData_22_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleTask", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1673:16: ( (lv_metaData_22_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1674:1: (lv_metaData_22_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1674:1: (lv_metaData_22_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1675:3: lv_metaData_22_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getTaskAccess().getMetaDataMetadataParserRuleCall_2_1_1_4_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleTask4231);
                    	    	    lv_metaData_22_0=ruleMetadata();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"metaData",
                    	    	            		lv_metaData_22_0, 
                    	    	            		"Metadata");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt25 >= 1 ) break loop25;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(25, input);
                    	                throw eee;
                    	        }
                    	        cnt25++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1698:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1698:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1699:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 5)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1699:105: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1700:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1(), 5);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1703:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
                    	    int cnt26=0;
                    	    loop26:
                    	    do {
                    	        int alt26=2;
                    	        switch ( input.LA(1) ) {
                    	        case 32:
                    	            {
                    	            int LA26_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt26=1;
                    	            }


                    	            }
                    	            break;
                    	        case 31:
                    	            {
                    	            int LA26_3 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt26=1;
                    	            }


                    	            }
                    	            break;
                    	        case 30:
                    	            {
                    	            int LA26_4 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt26=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ID:
                    	            {
                    	            int LA26_5 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt26=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt26) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1703:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleTask", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1703:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1704:1: (lv_elementLinks_23_0= ruleInLineElementLink )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1704:1: (lv_elementLinks_23_0= ruleInLineElementLink )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1705:3: lv_elementLinks_23_0= ruleInLineElementLink
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getTaskAccess().getElementLinksInLineElementLinkParserRuleCall_2_1_1_5_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleTask4307);
                    	    	    lv_elementLinks_23_0=ruleInLineElementLink();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"elementLinks",
                    	    	            		lv_elementLinks_23_0, 
                    	    	            		"InLineElementLink");
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

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getTaskAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleTask4360); 

                        	newLeafNode(otherlv_24, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1747:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1748:2: (iv_ruleResource= ruleResource EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1749:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource4398);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource4408); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1756:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) ) ;
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
        Token lv_importanceQuantitative_20_0=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Enumerator lv_decompositionType_15_0 = null;

        Enumerator lv_importance_19_0 = null;

        EObject lv_metaData_22_0 = null;

        EObject lv_elementLinks_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1759:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1760:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1760:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1760:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleResource4445); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1764:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1765:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1765:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1766:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource4462); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1782:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==17) ) {
                alt33=1;
            }
            else if ( (LA33_0==14) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1782:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleResource4480); 

                        	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1787:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1787:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1787:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleResource4499); 

                        	newLeafNode(otherlv_3, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1791:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1793:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1793:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1794:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1797:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1798:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1798:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
                    loop32:
                    do {
                        int alt32=7;
                        int LA32_0 = input.LA(1);

                        if ( LA32_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt32=1;
                        }
                        else if ( LA32_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt32=2;
                        }
                        else if ( LA32_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt32=3;
                        }
                        else if ( LA32_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 3) ) {
                            alt32=4;
                        }
                        else if ( LA32_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 4) ) {
                            alt32=5;
                        }
                        else if ( (LA32_0==RULE_ID|| LA32_0 >=30 && LA32_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 5) ) {
                            alt32=6;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1800:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1800:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1801:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1801:109: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1802:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1805:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1805:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1805:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1805:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleResource4557); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleResource4569); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getResourceAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1813:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1814:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1814:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1815:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource4586); 

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

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleResource4603); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1842:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1842:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1843:5: {...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1843:109: ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1844:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1847:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1847:7: {...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1847:16: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1847:18: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';'
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleResource4671); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getResourceAccess().getDescriptionKeyword_2_1_1_1_0());
                    	        
                    	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleResource4683); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getResourceAccess().getEqualsSignKeyword_2_1_1_1_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1855:1: ( (lv_description_11_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1856:1: (lv_description_11_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1856:1: (lv_description_11_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1857:3: lv_description_11_0= RULE_STRING
                    	    {
                    	    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource4700); 

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

                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleResource4717); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getResourceAccess().getSemicolonKeyword_2_1_1_1_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1884:4: ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1884:4: ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1885:5: {...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1885:109: ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1886:6: ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1889:6: ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1889:7: {...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1889:16: (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1889:18: otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';'
                    	    {
                    	    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleResource4785); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getResourceAccess().getDecompositionTypeKeyword_2_1_1_2_0());
                    	        
                    	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleResource4797); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getResourceAccess().getEqualsSignKeyword_2_1_1_2_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1897:1: ( (lv_decompositionType_15_0= ruleDecompositionType ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1898:1: (lv_decompositionType_15_0= ruleDecompositionType )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1898:1: (lv_decompositionType_15_0= ruleDecompositionType )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1899:3: lv_decompositionType_15_0= ruleDecompositionType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getResourceAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_1_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleResource4818);
                    	    lv_decompositionType_15_0=ruleDecompositionType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"decompositionType",
                    	            		lv_decompositionType_15_0, 
                    	            		"DecompositionType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleResource4830); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getResourceAccess().getSemicolonKeyword_2_1_1_2_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1926:4: ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1926:4: ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1927:5: {...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 3)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1927:109: ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1928:6: ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 3);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1931:6: ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1931:7: {...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1931:16: (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1931:18: otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';'
                    	    {
                    	    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleResource4898); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getResourceAccess().getImportanceKeyword_2_1_1_3_0());
                    	        
                    	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleResource4910); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getResourceAccess().getEqualsSignKeyword_2_1_1_3_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1939:1: ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) )
                    	    int alt29=2;
                    	    int LA29_0 = input.LA(1);

                    	    if ( ((LA29_0>=56 && LA29_0<=59)) ) {
                    	        alt29=1;
                    	    }
                    	    else if ( (LA29_0==RULE_QUALITATIVEVALUE) ) {
                    	        alt29=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 29, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt29) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1939:2: ( (lv_importance_19_0= ruleImportanceType ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1939:2: ( (lv_importance_19_0= ruleImportanceType ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1940:1: (lv_importance_19_0= ruleImportanceType )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1940:1: (lv_importance_19_0= ruleImportanceType )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1941:3: lv_importance_19_0= ruleImportanceType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getResourceAccess().getImportanceImportanceTypeEnumRuleCall_2_1_1_3_2_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImportanceType_in_ruleResource4932);
                    	            lv_importance_19_0=ruleImportanceType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getResourceRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"importance",
                    	                    		lv_importance_19_0, 
                    	                    		"ImportanceType");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1958:6: ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1958:6: ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1959:1: (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1959:1: (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1960:3: lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE
                    	            {
                    	            lv_importanceQuantitative_20_0=(Token)match(input,RULE_QUALITATIVEVALUE,FOLLOW_RULE_QUALITATIVEVALUE_in_ruleResource4955); 

                    	            			newLeafNode(lv_importanceQuantitative_20_0, grammarAccess.getResourceAccess().getImportanceQuantitativeQUALITATIVEVALUETerminalRuleCall_2_1_1_3_2_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getResourceRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"importanceQuantitative",
                    	                    		lv_importanceQuantitative_20_0, 
                    	                    		"QUALITATIVEVALUE");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleResource4973); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getResourceAccess().getSemicolonKeyword_2_1_1_3_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1987:4: ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1987:4: ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1988:5: {...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 4)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1988:109: ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1989:6: ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 4);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1992:6: ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+
                    	    int cnt30=0;
                    	    loop30:
                    	    do {
                    	        int alt30=2;
                    	        int LA30_0 = input.LA(1);

                    	        if ( (LA30_0==52) ) {
                    	            int LA30_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt30=1;
                    	            }


                    	        }


                    	        switch (alt30) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1992:7: {...}? => ( (lv_metaData_22_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleResource", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1992:16: ( (lv_metaData_22_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1993:1: (lv_metaData_22_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1993:1: (lv_metaData_22_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1994:3: lv_metaData_22_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getResourceAccess().getMetaDataMetadataParserRuleCall_2_1_1_4_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleResource5049);
                    	    	    lv_metaData_22_0=ruleMetadata();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"metaData",
                    	    	            		lv_metaData_22_0, 
                    	    	            		"Metadata");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt30 >= 1 ) break loop30;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(30, input);
                    	                throw eee;
                    	        }
                    	        cnt30++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2017:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2017:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2018:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 5)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2018:109: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2019:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1(), 5);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2022:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
                    	    int cnt31=0;
                    	    loop31:
                    	    do {
                    	        int alt31=2;
                    	        switch ( input.LA(1) ) {
                    	        case 32:
                    	            {
                    	            int LA31_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt31=1;
                    	            }


                    	            }
                    	            break;
                    	        case 31:
                    	            {
                    	            int LA31_3 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt31=1;
                    	            }


                    	            }
                    	            break;
                    	        case 30:
                    	            {
                    	            int LA31_4 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt31=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ID:
                    	            {
                    	            int LA31_5 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt31=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt31) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2022:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleResource", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2022:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2023:1: (lv_elementLinks_23_0= ruleInLineElementLink )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2023:1: (lv_elementLinks_23_0= ruleInLineElementLink )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2024:3: lv_elementLinks_23_0= ruleInLineElementLink
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getResourceAccess().getElementLinksInLineElementLinkParserRuleCall_2_1_1_5_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleResource5125);
                    	    	    lv_elementLinks_23_0=ruleInLineElementLink();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"elementLinks",
                    	    	            		lv_elementLinks_23_0, 
                    	    	            		"InLineElementLink");
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

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getResourceAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleResource5178); 

                        	newLeafNode(otherlv_24, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2066:1: entryRuleIndicator returns [EObject current=null] : iv_ruleIndicator= ruleIndicator EOF ;
    public final EObject entryRuleIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicator = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2067:2: (iv_ruleIndicator= ruleIndicator EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2068:2: iv_ruleIndicator= ruleIndicator EOF
            {
             newCompositeNode(grammarAccess.getIndicatorRule()); 
            pushFollow(FOLLOW_ruleIndicator_in_entryRuleIndicator5216);
            iv_ruleIndicator=ruleIndicator();

            state._fsp--;

             current =iv_ruleIndicator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndicator5226); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2075:1: ruleIndicator returns [EObject current=null] : (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) ) ;
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
        Token lv_importanceQuantitative_20_0=null;
        Token otherlv_21=null;
        Token otherlv_24=null;
        Enumerator lv_decompositionType_15_0 = null;

        Enumerator lv_importance_19_0 = null;

        EObject lv_metaData_22_0 = null;

        EObject lv_elementLinks_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2078:28: ( (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2079:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2079:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2079:3: otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleIndicator5263); 

                	newLeafNode(otherlv_0, grammarAccess.getIndicatorAccess().getIndicatorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2083:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2084:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2084:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2085:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator5280); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2101:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==17) ) {
                alt38=1;
            }
            else if ( (LA38_0==14) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2101:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleIndicator5298); 

                        	newLeafNode(otherlv_2, grammarAccess.getIndicatorAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2106:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2106:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2106:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleIndicator5317); 

                        	newLeafNode(otherlv_3, grammarAccess.getIndicatorAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2110:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2112:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2112:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2113:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2116:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2117:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2117:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
                    loop37:
                    do {
                        int alt37=7;
                        int LA37_0 = input.LA(1);

                        if ( LA37_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt37=1;
                        }
                        else if ( LA37_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt37=2;
                        }
                        else if ( LA37_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt37=3;
                        }
                        else if ( LA37_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 3) ) {
                            alt37=4;
                        }
                        else if ( LA37_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 4) ) {
                            alt37=5;
                        }
                        else if ( (LA37_0==RULE_ID|| LA37_0 >=30 && LA37_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 5) ) {
                            alt37=6;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2119:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2119:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2120:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2120:110: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2121:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2124:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2124:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2124:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2124:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5375); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getIndicatorAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5387); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2132:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2133:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2133:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2134:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator5404); 

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

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleIndicator5421); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getIndicatorAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2161:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2161:4: ({...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2162:5: {...}? => ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2162:110: ( ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2163:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2166:6: ({...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2166:7: {...}? => (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2166:16: (otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2166:18: otherlv_9= 'description' otherlv_10= '=' ( (lv_description_11_0= RULE_STRING ) ) otherlv_12= ';'
                    	    {
                    	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleIndicator5489); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getIndicatorAccess().getDescriptionKeyword_2_1_1_1_0());
                    	        
                    	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5501); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_2_1_1_1_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2174:1: ( (lv_description_11_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2175:1: (lv_description_11_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2175:1: (lv_description_11_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2176:3: lv_description_11_0= RULE_STRING
                    	    {
                    	    lv_description_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator5518); 

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

                    	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleIndicator5535); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getIndicatorAccess().getSemicolonKeyword_2_1_1_1_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2203:4: ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2203:4: ({...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2204:5: {...}? => ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2204:110: ( ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2205:6: ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2208:6: ({...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2208:7: {...}? => (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2208:16: (otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2208:18: otherlv_13= 'decompositionType' otherlv_14= '=' ( (lv_decompositionType_15_0= ruleDecompositionType ) ) otherlv_16= ';'
                    	    {
                    	    otherlv_13=(Token)match(input,23,FOLLOW_23_in_ruleIndicator5603); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getIndicatorAccess().getDecompositionTypeKeyword_2_1_1_2_0());
                    	        
                    	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5615); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_2_1_1_2_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2216:1: ( (lv_decompositionType_15_0= ruleDecompositionType ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2217:1: (lv_decompositionType_15_0= ruleDecompositionType )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2217:1: (lv_decompositionType_15_0= ruleDecompositionType )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2218:3: lv_decompositionType_15_0= ruleDecompositionType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_2_1_1_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleIndicator5636);
                    	    lv_decompositionType_15_0=ruleDecompositionType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
                    	    	        }
                    	           		set(
                    	           			current, 
                    	           			"decompositionType",
                    	            		lv_decompositionType_15_0, 
                    	            		"DecompositionType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleIndicator5648); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getIndicatorAccess().getSemicolonKeyword_2_1_1_2_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2245:4: ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2245:4: ({...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2246:5: {...}? => ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 3) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 3)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2246:110: ( ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2247:6: ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 3);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2250:6: ({...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2250:7: {...}? => (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2250:16: (otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2250:18: otherlv_17= 'importance' otherlv_18= '=' ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) ) otherlv_21= ';'
                    	    {
                    	    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleIndicator5716); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getIndicatorAccess().getImportanceKeyword_2_1_1_3_0());
                    	        
                    	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5728); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_2_1_1_3_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2258:1: ( ( (lv_importance_19_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) ) )
                    	    int alt34=2;
                    	    int LA34_0 = input.LA(1);

                    	    if ( ((LA34_0>=56 && LA34_0<=59)) ) {
                    	        alt34=1;
                    	    }
                    	    else if ( (LA34_0==RULE_QUALITATIVEVALUE) ) {
                    	        alt34=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 34, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt34) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2258:2: ( (lv_importance_19_0= ruleImportanceType ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2258:2: ( (lv_importance_19_0= ruleImportanceType ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2259:1: (lv_importance_19_0= ruleImportanceType )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2259:1: (lv_importance_19_0= ruleImportanceType )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2260:3: lv_importance_19_0= ruleImportanceType
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getIndicatorAccess().getImportanceImportanceTypeEnumRuleCall_2_1_1_3_2_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleImportanceType_in_ruleIndicator5750);
                    	            lv_importance_19_0=ruleImportanceType();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
                    	            	        }
                    	                   		set(
                    	                   			current, 
                    	                   			"importance",
                    	                    		lv_importance_19_0, 
                    	                    		"ImportanceType");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2277:6: ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2277:6: ( (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2278:1: (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2278:1: (lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2279:3: lv_importanceQuantitative_20_0= RULE_QUALITATIVEVALUE
                    	            {
                    	            lv_importanceQuantitative_20_0=(Token)match(input,RULE_QUALITATIVEVALUE,FOLLOW_RULE_QUALITATIVEVALUE_in_ruleIndicator5773); 

                    	            			newLeafNode(lv_importanceQuantitative_20_0, grammarAccess.getIndicatorAccess().getImportanceQuantitativeQUALITATIVEVALUETerminalRuleCall_2_1_1_3_2_1_0()); 
                    	            		

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getIndicatorRule());
                    	            	        }
                    	                   		setWithLastConsumed(
                    	                   			current, 
                    	                   			"importanceQuantitative",
                    	                    		lv_importanceQuantitative_20_0, 
                    	                    		"QUALITATIVEVALUE");
                    	            	    

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }

                    	    otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleIndicator5791); 

                    	        	newLeafNode(otherlv_21, grammarAccess.getIndicatorAccess().getSemicolonKeyword_2_1_1_3_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 5 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2306:4: ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2306:4: ({...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2307:5: {...}? => ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 4) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 4)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2307:110: ( ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2308:6: ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 4);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2311:6: ({...}? => ( (lv_metaData_22_0= ruleMetadata ) ) )+
                    	    int cnt35=0;
                    	    loop35:
                    	    do {
                    	        int alt35=2;
                    	        int LA35_0 = input.LA(1);

                    	        if ( (LA35_0==52) ) {
                    	            int LA35_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt35=1;
                    	            }


                    	        }


                    	        switch (alt35) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2311:7: {...}? => ( (lv_metaData_22_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2311:16: ( (lv_metaData_22_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2312:1: (lv_metaData_22_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2312:1: (lv_metaData_22_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2313:3: lv_metaData_22_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getMetaDataMetadataParserRuleCall_2_1_1_4_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleIndicator5867);
                    	    	    lv_metaData_22_0=ruleMetadata();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"metaData",
                    	    	            		lv_metaData_22_0, 
                    	    	            		"Metadata");
                    	    	    	        afterParserOrEnumRuleCall();
                    	    	    	    

                    	    	    }


                    	    	    }


                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    if ( cnt35 >= 1 ) break loop35;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(35, input);
                    	                throw eee;
                    	        }
                    	        cnt35++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 6 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2336:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2336:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2337:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 5) ) {
                    	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 5)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2337:110: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2338:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1(), 5);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2341:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
                    	    int cnt36=0;
                    	    loop36:
                    	    do {
                    	        int alt36=2;
                    	        switch ( input.LA(1) ) {
                    	        case 32:
                    	            {
                    	            int LA36_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt36=1;
                    	            }


                    	            }
                    	            break;
                    	        case 31:
                    	            {
                    	            int LA36_3 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt36=1;
                    	            }


                    	            }
                    	            break;
                    	        case 30:
                    	            {
                    	            int LA36_4 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt36=1;
                    	            }


                    	            }
                    	            break;
                    	        case RULE_ID:
                    	            {
                    	            int LA36_5 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt36=1;
                    	            }


                    	            }
                    	            break;

                    	        }

                    	        switch (alt36) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2341:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2341:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2342:1: (lv_elementLinks_23_0= ruleInLineElementLink )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2342:1: (lv_elementLinks_23_0= ruleInLineElementLink )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2343:3: lv_elementLinks_23_0= ruleInLineElementLink
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getElementLinksInLineElementLinkParserRuleCall_2_1_1_5_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleIndicator5943);
                    	    	    lv_elementLinks_23_0=ruleInLineElementLink();

                    	    	    state._fsp--;


                    	    	    	        if (current==null) {
                    	    	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
                    	    	    	        }
                    	    	           		add(
                    	    	           			current, 
                    	    	           			"elementLinks",
                    	    	            		lv_elementLinks_23_0, 
                    	    	            		"InLineElementLink");
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

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getIndicatorAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleIndicator5996); 

                        	newLeafNode(otherlv_24, grammarAccess.getIndicatorAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2385:1: entryRuleBelief returns [EObject current=null] : iv_ruleBelief= ruleBelief EOF ;
    public final EObject entryRuleBelief() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelief = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2386:2: (iv_ruleBelief= ruleBelief EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2387:2: iv_ruleBelief= ruleBelief EOF
            {
             newCompositeNode(grammarAccess.getBeliefRule()); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief6034);
            iv_ruleBelief=ruleBelief();

            state._fsp--;

             current =iv_ruleBelief; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief6044); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2394:1: ruleBelief returns [EObject current=null] : (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}' ) ) ) ;
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
        Token otherlv_11=null;
        Token lv_description_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject lv_metaData_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2397:28: ( (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2398:1: (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2398:1: (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2398:3: otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}' ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleBelief6081); 

                	newLeafNode(otherlv_0, grammarAccess.getBeliefAccess().getBeliefKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2402:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2403:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2403:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2404:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBelief6098); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2420:2: (otherlv_2= ';' | (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}' ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==17) ) {
                alt41=1;
            }
            else if ( (LA41_0==14) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2420:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleBelief6116); 

                        	newLeafNode(otherlv_2, grammarAccess.getBeliefAccess().getSemicolonKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2425:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2425:6: (otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2425:8: otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* ) ) ) otherlv_14= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleBelief6135); 

                        	newLeafNode(otherlv_3, grammarAccess.getBeliefAccess().getLeftCurlyBracketKeyword_2_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2429:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2431:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2431:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2432:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2435:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2436:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2436:3: ( ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) ) )*
                    loop40:
                    do {
                        int alt40=4;
                        int LA40_0 = input.LA(1);

                        if ( LA40_0 ==18 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 0) ) {
                            alt40=1;
                        }
                        else if ( LA40_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 1) ) {
                            alt40=2;
                        }
                        else if ( LA40_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 2) ) {
                            alt40=3;
                        }


                        switch (alt40) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2438:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2438:4: ({...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2439:5: {...}? => ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2439:107: ( ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2440:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2443:6: ({...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2443:7: {...}? => (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleBelief", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2443:16: (otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2443:18: otherlv_5= 'name' otherlv_6= '=' ( (lv_label_7_0= RULE_STRING ) ) otherlv_8= ';'
                    	    {
                    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleBelief6193); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getBeliefAccess().getNameKeyword_2_1_1_0_0());
                    	        
                    	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleBelief6205); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getBeliefAccess().getEqualsSignKeyword_2_1_1_0_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2451:1: ( (lv_label_7_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2452:1: (lv_label_7_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2452:1: (lv_label_7_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2453:3: lv_label_7_0= RULE_STRING
                    	    {
                    	    lv_label_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelief6222); 

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

                    	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleBelief6239); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getBeliefAccess().getSemicolonKeyword_2_1_1_0_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2480:4: ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2480:4: ({...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2481:5: {...}? => ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2481:107: ( ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2482:6: ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2485:6: ({...}? => ( (lv_metaData_9_0= ruleMetadata ) ) )+
                    	    int cnt39=0;
                    	    loop39:
                    	    do {
                    	        int alt39=2;
                    	        int LA39_0 = input.LA(1);

                    	        if ( (LA39_0==52) ) {
                    	            int LA39_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt39=1;
                    	            }


                    	        }


                    	        switch (alt39) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2485:7: {...}? => ( (lv_metaData_9_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleBelief", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2485:16: ( (lv_metaData_9_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2486:1: (lv_metaData_9_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2486:1: (lv_metaData_9_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2487:3: lv_metaData_9_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getBeliefAccess().getMetaDataMetadataParserRuleCall_2_1_1_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleBelief6315);
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
                    	    	    if ( cnt39 >= 1 ) break loop39;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(39, input);
                    	                throw eee;
                    	        }
                    	        cnt39++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2510:4: ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2510:4: ({...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2511:5: {...}? => ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2511:107: ( ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2512:6: ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2515:6: ({...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2515:7: {...}? => (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleBelief", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2515:16: (otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2515:18: otherlv_10= 'description' otherlv_11= '=' ( (lv_description_12_0= RULE_STRING ) ) otherlv_13= ';'
                    	    {
                    	    otherlv_10=(Token)match(input,21,FOLLOW_21_in_ruleBelief6383); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getBeliefAccess().getDescriptionKeyword_2_1_1_2_0());
                    	        
                    	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleBelief6395); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getBeliefAccess().getEqualsSignKeyword_2_1_1_2_1());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2523:1: ( (lv_description_12_0= RULE_STRING ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2524:1: (lv_description_12_0= RULE_STRING )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2524:1: (lv_description_12_0= RULE_STRING )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2525:3: lv_description_12_0= RULE_STRING
                    	    {
                    	    lv_description_12_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelief6412); 

                    	    			newLeafNode(lv_description_12_0, grammarAccess.getBeliefAccess().getDescriptionSTRINGTerminalRuleCall_2_1_1_2_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getBeliefRule());
                    	    	        }
                    	           		setWithLastConsumed(
                    	           			current, 
                    	           			"description",
                    	            		lv_description_12_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleBelief6429); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getBeliefAccess().getSemicolonKeyword_2_1_1_2_3());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop40;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getBeliefAccess().getUnorderedGroup_2_1_1());
                    	

                    }

                    otherlv_14=(Token)match(input,15,FOLLOW_15_in_ruleBelief6482); 

                        	newLeafNode(otherlv_14, grammarAccess.getBeliefAccess().getRightCurlyBracketKeyword_2_1_2());
                        

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


    // $ANTLR start "entryRuleNormalElementLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2575:1: entryRuleNormalElementLink returns [EObject current=null] : iv_ruleNormalElementLink= ruleNormalElementLink EOF ;
    public final EObject entryRuleNormalElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2576:2: (iv_ruleNormalElementLink= ruleNormalElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2577:2: iv_ruleNormalElementLink= ruleNormalElementLink EOF
            {
             newCompositeNode(grammarAccess.getNormalElementLinkRule()); 
            pushFollow(FOLLOW_ruleNormalElementLink_in_entryRuleNormalElementLink6524);
            iv_ruleNormalElementLink=ruleNormalElementLink();

            state._fsp--;

             current =iv_ruleNormalElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalElementLink6534); 

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
    // $ANTLR end "entryRuleNormalElementLink"


    // $ANTLR start "ruleNormalElementLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2584:1: ruleNormalElementLink returns [EObject current=null] : (this_NormalDecomposition_0= ruleNormalDecomposition | this_NormalContribution_1= ruleNormalContribution | this_NormalDependency_2= ruleNormalDependency | this_NormalLink_3= ruleNormalLink ) ;
    public final EObject ruleNormalElementLink() throws RecognitionException {
        EObject current = null;

        EObject this_NormalDecomposition_0 = null;

        EObject this_NormalContribution_1 = null;

        EObject this_NormalDependency_2 = null;

        EObject this_NormalLink_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2587:28: ( (this_NormalDecomposition_0= ruleNormalDecomposition | this_NormalContribution_1= ruleNormalContribution | this_NormalDependency_2= ruleNormalDependency | this_NormalLink_3= ruleNormalLink ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2588:1: (this_NormalDecomposition_0= ruleNormalDecomposition | this_NormalContribution_1= ruleNormalContribution | this_NormalDependency_2= ruleNormalDependency | this_NormalLink_3= ruleNormalLink )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2588:1: (this_NormalDecomposition_0= ruleNormalDecomposition | this_NormalContribution_1= ruleNormalContribution | this_NormalDependency_2= ruleNormalDependency | this_NormalLink_3= ruleNormalLink )
            int alt42=4;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2589:5: this_NormalDecomposition_0= ruleNormalDecomposition
                    {
                     
                            newCompositeNode(grammarAccess.getNormalElementLinkAccess().getNormalDecompositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNormalDecomposition_in_ruleNormalElementLink6581);
                    this_NormalDecomposition_0=ruleNormalDecomposition();

                    state._fsp--;

                     
                            current = this_NormalDecomposition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2599:5: this_NormalContribution_1= ruleNormalContribution
                    {
                     
                            newCompositeNode(grammarAccess.getNormalElementLinkAccess().getNormalContributionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNormalContribution_in_ruleNormalElementLink6608);
                    this_NormalContribution_1=ruleNormalContribution();

                    state._fsp--;

                     
                            current = this_NormalContribution_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2609:5: this_NormalDependency_2= ruleNormalDependency
                    {
                     
                            newCompositeNode(grammarAccess.getNormalElementLinkAccess().getNormalDependencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleNormalDependency_in_ruleNormalElementLink6635);
                    this_NormalDependency_2=ruleNormalDependency();

                    state._fsp--;

                     
                            current = this_NormalDependency_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2619:5: this_NormalLink_3= ruleNormalLink
                    {
                     
                            newCompositeNode(grammarAccess.getNormalElementLinkAccess().getNormalLinkParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleNormalLink_in_ruleNormalElementLink6662);
                    this_NormalLink_3=ruleNormalLink();

                    state._fsp--;

                     
                            current = this_NormalLink_3; 
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
    // $ANTLR end "ruleNormalElementLink"


    // $ANTLR start "entryRuleNormalLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2635:1: entryRuleNormalLink returns [EObject current=null] : iv_ruleNormalLink= ruleNormalLink EOF ;
    public final EObject entryRuleNormalLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2636:2: (iv_ruleNormalLink= ruleNormalLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2637:2: iv_ruleNormalLink= ruleNormalLink EOF
            {
             newCompositeNode(grammarAccess.getNormalLinkRule()); 
            pushFollow(FOLLOW_ruleNormalLink_in_entryRuleNormalLink6697);
            iv_ruleNormalLink=ruleNormalLink();

            state._fsp--;

             current =iv_ruleNormalLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalLink6707); 

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
    // $ANTLR end "entryRuleNormalLink"


    // $ANTLR start "ruleNormalLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2644:1: ruleNormalLink returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleNormalLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2647:28: ( ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2648:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2648:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2648:2: ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2648:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2649:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2649:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2650:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNormalLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNormalLinkAccess().getSrcGRLElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNormalLink6755);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2663:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2664:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2664:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2665:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNormalLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNormalLinkAccess().getTypeLinkTypeCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNormalLink6778);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2678:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2679:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2679:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2680:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNormalLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNormalLinkAccess().getDestGRLElementCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNormalLink6801);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2693:2: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==29) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2693:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleNormalLink6814); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNormalLinkAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2697:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2698:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2698:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2699:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getNormalLinkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getNormalLinkAccess().getDestGRLElementCrossReference_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleNormalLink6837);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleNormalLink6851); 

                	newLeafNode(otherlv_5, grammarAccess.getNormalLinkAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleNormalLink"


    // $ANTLR start "entryRuleNormalDependency"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2724:1: entryRuleNormalDependency returns [EObject current=null] : iv_ruleNormalDependency= ruleNormalDependency EOF ;
    public final EObject entryRuleNormalDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2725:2: (iv_ruleNormalDependency= ruleNormalDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2726:2: iv_ruleNormalDependency= ruleNormalDependency EOF
            {
             newCompositeNode(grammarAccess.getNormalDependencyRule()); 
            pushFollow(FOLLOW_ruleNormalDependency_in_entryRuleNormalDependency6887);
            iv_ruleNormalDependency=ruleNormalDependency();

            state._fsp--;

             current =iv_ruleNormalDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalDependency6897); 

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
    // $ANTLR end "entryRuleNormalDependency"


    // $ANTLR start "ruleNormalDependency"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2733:1: ruleNormalDependency returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependsOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleNormalDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2736:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependsOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2737:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependsOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2737:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependsOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2737:2: ( ( ruleQualifiedName ) ) otherlv_1= 'dependsOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2737:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2738:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2738:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2739:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNormalDependencyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNormalDependencyAccess().getSrcSuperIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNormalDependency6945);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleNormalDependency6957); 

                	newLeafNode(otherlv_1, grammarAccess.getNormalDependencyAccess().getDependsOnKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2756:1: ( (lv_dest_2_0= ruleDependencyEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2757:1: (lv_dest_2_0= ruleDependencyEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2757:1: (lv_dest_2_0= ruleDependencyEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2758:3: lv_dest_2_0= ruleDependencyEnd
            {
             
            	        newCompositeNode(grammarAccess.getNormalDependencyAccess().getDestDependencyEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyEnd_in_ruleNormalDependency6978);
            lv_dest_2_0=ruleDependencyEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNormalDependencyRule());
            	        }
                   		add(
                   			current, 
                   			"dest",
                    		lv_dest_2_0, 
                    		"DependencyEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2774:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==29) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2774:4: otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleNormalDependency6991); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNormalDependencyAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2778:1: ( (lv_dest_4_0= ruleDependencyEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2779:1: (lv_dest_4_0= ruleDependencyEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2779:1: (lv_dest_4_0= ruleDependencyEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2780:3: lv_dest_4_0= ruleDependencyEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNormalDependencyAccess().getDestDependencyEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyEnd_in_ruleNormalDependency7012);
            	    lv_dest_4_0=ruleDependencyEnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNormalDependencyRule());
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
            	    break loop44;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleNormalDependency7026); 

                	newLeafNode(otherlv_5, grammarAccess.getNormalDependencyAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleNormalDependency"


    // $ANTLR start "entryRuleNormalContribution"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2808:1: entryRuleNormalContribution returns [EObject current=null] : iv_ruleNormalContribution= ruleNormalContribution EOF ;
    public final EObject entryRuleNormalContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2809:2: (iv_ruleNormalContribution= ruleNormalContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2810:2: iv_ruleNormalContribution= ruleNormalContribution EOF
            {
             newCompositeNode(grammarAccess.getNormalContributionRule()); 
            pushFollow(FOLLOW_ruleNormalContribution_in_entryRuleNormalContribution7062);
            iv_ruleNormalContribution=ruleNormalContribution();

            state._fsp--;

             current =iv_ruleNormalContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalContribution7072); 

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
    // $ANTLR end "entryRuleNormalContribution"


    // $ANTLR start "ruleNormalContribution"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2817:1: ruleNormalContribution returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributesTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleNormalContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2820:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributesTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2821:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributesTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2821:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributesTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2821:2: ( ( ruleQualifiedName ) ) otherlv_1= 'contributesTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2821:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2822:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2822:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2823:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNormalContributionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNormalContributionAccess().getSrcSuperIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNormalContribution7120);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleNormalContribution7132); 

                	newLeafNode(otherlv_1, grammarAccess.getNormalContributionAccess().getContributesToKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2840:1: ( (lv_dest_2_0= ruleContributionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2841:1: (lv_dest_2_0= ruleContributionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2841:1: (lv_dest_2_0= ruleContributionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2842:3: lv_dest_2_0= ruleContributionEnd
            {
             
            	        newCompositeNode(grammarAccess.getNormalContributionAccess().getDestContributionEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleContributionEnd_in_ruleNormalContribution7153);
            lv_dest_2_0=ruleContributionEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNormalContributionRule());
            	        }
                   		add(
                   			current, 
                   			"dest",
                    		lv_dest_2_0, 
                    		"ContributionEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2858:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==29) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2858:4: otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleNormalContribution7166); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNormalContributionAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2862:1: ( (lv_dest_4_0= ruleContributionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2863:1: (lv_dest_4_0= ruleContributionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2863:1: (lv_dest_4_0= ruleContributionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2864:3: lv_dest_4_0= ruleContributionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNormalContributionAccess().getDestContributionEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionEnd_in_ruleNormalContribution7187);
            	    lv_dest_4_0=ruleContributionEnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNormalContributionRule());
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
            	    break loop45;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleNormalContribution7201); 

                	newLeafNode(otherlv_5, grammarAccess.getNormalContributionAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleNormalContribution"


    // $ANTLR start "entryRuleNormalDecomposition"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2892:1: entryRuleNormalDecomposition returns [EObject current=null] : iv_ruleNormalDecomposition= ruleNormalDecomposition EOF ;
    public final EObject entryRuleNormalDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNormalDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2893:2: (iv_ruleNormalDecomposition= ruleNormalDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2894:2: iv_ruleNormalDecomposition= ruleNormalDecomposition EOF
            {
             newCompositeNode(grammarAccess.getNormalDecompositionRule()); 
            pushFollow(FOLLOW_ruleNormalDecomposition_in_entryRuleNormalDecomposition7237);
            iv_ruleNormalDecomposition=ruleNormalDecomposition();

            state._fsp--;

             current =iv_ruleNormalDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNormalDecomposition7247); 

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
    // $ANTLR end "entryRuleNormalDecomposition"


    // $ANTLR start "ruleNormalDecomposition"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2901:1: ruleNormalDecomposition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleNormalDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2904:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2905:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2905:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2905:2: ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2905:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2906:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2906:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2907:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getNormalDecompositionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getNormalDecompositionAccess().getSrcSuperIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleNormalDecomposition7295);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleNormalDecomposition7307); 

                	newLeafNode(otherlv_1, grammarAccess.getNormalDecompositionAccess().getDecomposedByKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2924:1: ( (lv_dest_2_0= ruleDecompositionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2925:1: (lv_dest_2_0= ruleDecompositionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2925:1: (lv_dest_2_0= ruleDecompositionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2926:3: lv_dest_2_0= ruleDecompositionEnd
            {
             
            	        newCompositeNode(grammarAccess.getNormalDecompositionAccess().getDestDecompositionEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleNormalDecomposition7328);
            lv_dest_2_0=ruleDecompositionEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNormalDecompositionRule());
            	        }
                   		add(
                   			current, 
                   			"dest",
                    		lv_dest_2_0, 
                    		"DecompositionEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2942:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==29) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2942:4: otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleNormalDecomposition7341); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNormalDecompositionAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2946:1: ( (lv_dest_4_0= ruleDecompositionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2947:1: (lv_dest_4_0= ruleDecompositionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2947:1: (lv_dest_4_0= ruleDecompositionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2948:3: lv_dest_4_0= ruleDecompositionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNormalDecompositionAccess().getDestDecompositionEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleNormalDecomposition7362);
            	    lv_dest_4_0=ruleDecompositionEnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNormalDecompositionRule());
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
            	    break loop46;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleNormalDecomposition7376); 

                	newLeafNode(otherlv_5, grammarAccess.getNormalDecompositionAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleNormalDecomposition"


    // $ANTLR start "entryRuleInLineElementLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2976:1: entryRuleInLineElementLink returns [EObject current=null] : iv_ruleInLineElementLink= ruleInLineElementLink EOF ;
    public final EObject entryRuleInLineElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2977:2: (iv_ruleInLineElementLink= ruleInLineElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2978:2: iv_ruleInLineElementLink= ruleInLineElementLink EOF
            {
             newCompositeNode(grammarAccess.getInLineElementLinkRule()); 
            pushFollow(FOLLOW_ruleInLineElementLink_in_entryRuleInLineElementLink7412);
            iv_ruleInLineElementLink=ruleInLineElementLink();

            state._fsp--;

             current =iv_ruleInLineElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineElementLink7422); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2985:1: ruleInLineElementLink returns [EObject current=null] : (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency | this_InLineLink_3= ruleInLineLink ) ;
    public final EObject ruleInLineElementLink() throws RecognitionException {
        EObject current = null;

        EObject this_InLineDecomposition_0 = null;

        EObject this_InLineContribution_1 = null;

        EObject this_InLineDependency_2 = null;

        EObject this_InLineLink_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2988:28: ( (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency | this_InLineLink_3= ruleInLineLink ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2989:1: (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency | this_InLineLink_3= ruleInLineLink )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2989:1: (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency | this_InLineLink_3= ruleInLineLink )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt47=1;
                }
                break;
            case 31:
                {
                alt47=2;
                }
                break;
            case 30:
                {
                alt47=3;
                }
                break;
            case RULE_ID:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2990:5: this_InLineDecomposition_0= ruleInLineDecomposition
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineDecompositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInLineDecomposition_in_ruleInLineElementLink7469);
                    this_InLineDecomposition_0=ruleInLineDecomposition();

                    state._fsp--;

                     
                            current = this_InLineDecomposition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3000:5: this_InLineContribution_1= ruleInLineContribution
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineContributionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInLineContribution_in_ruleInLineElementLink7496);
                    this_InLineContribution_1=ruleInLineContribution();

                    state._fsp--;

                     
                            current = this_InLineContribution_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3010:5: this_InLineDependency_2= ruleInLineDependency
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineDependencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInLineDependency_in_ruleInLineElementLink7523);
                    this_InLineDependency_2=ruleInLineDependency();

                    state._fsp--;

                     
                            current = this_InLineDependency_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3020:5: this_InLineLink_3= ruleInLineLink
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineLinkParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleInLineLink_in_ruleInLineElementLink7550);
                    this_InLineLink_3=ruleInLineLink();

                    state._fsp--;

                     
                            current = this_InLineLink_3; 
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


    // $ANTLR start "entryRuleInLineLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3036:1: entryRuleInLineLink returns [EObject current=null] : iv_ruleInLineLink= ruleInLineLink EOF ;
    public final EObject entryRuleInLineLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3037:2: (iv_ruleInLineLink= ruleInLineLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3038:2: iv_ruleInLineLink= ruleInLineLink EOF
            {
             newCompositeNode(grammarAccess.getInLineLinkRule()); 
            pushFollow(FOLLOW_ruleInLineLink_in_entryRuleInLineLink7585);
            iv_ruleInLineLink=ruleInLineLink();

            state._fsp--;

             current =iv_ruleInLineLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineLink7595); 

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
    // $ANTLR end "entryRuleInLineLink"


    // $ANTLR start "ruleInLineLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3045:1: ruleInLineLink returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3048:28: ( ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3049:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3049:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3049:2: ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3049:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3050:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3050:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3051:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInLineLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInLineLinkAccess().getTypeLinkTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInLineLink7643);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3064:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3065:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3065:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3066:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInLineLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInLineLinkAccess().getDestGRLElementCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInLineLink7666);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3079:2: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==29) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3079:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleInLineLink7679); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineLinkAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3083:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3084:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3084:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3085:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInLineLinkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getInLineLinkAccess().getDestGRLElementCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleInLineLink7702);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleInLineLink7716); 

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
    // $ANTLR end "ruleInLineLink"


    // $ANTLR start "entryRuleInLineDependency"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3110:1: entryRuleInLineDependency returns [EObject current=null] : iv_ruleInLineDependency= ruleInLineDependency EOF ;
    public final EObject entryRuleInLineDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3111:2: (iv_ruleInLineDependency= ruleInLineDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3112:2: iv_ruleInLineDependency= ruleInLineDependency EOF
            {
             newCompositeNode(grammarAccess.getInLineDependencyRule()); 
            pushFollow(FOLLOW_ruleInLineDependency_in_entryRuleInLineDependency7752);
            iv_ruleInLineDependency=ruleInLineDependency();

            state._fsp--;

             current =iv_ruleInLineDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineDependency7762); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3119:1: ruleInLineDependency returns [EObject current=null] : (otherlv_0= 'dependsOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3122:28: ( (otherlv_0= 'dependsOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3123:1: (otherlv_0= 'dependsOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3123:1: (otherlv_0= 'dependsOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3123:3: otherlv_0= 'dependsOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleInLineDependency7799); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineDependencyAccess().getDependsOnKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3127:1: ( (lv_dest_1_0= ruleDependencyEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3128:1: (lv_dest_1_0= ruleDependencyEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3128:1: (lv_dest_1_0= ruleDependencyEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3129:3: lv_dest_1_0= ruleDependencyEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineDependencyAccess().getDestDependencyEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7820);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3145:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==29) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3145:4: otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleInLineDependency7833); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineDependencyAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3149:1: ( (lv_dest_3_0= ruleDependencyEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3150:1: (lv_dest_3_0= ruleDependencyEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3150:1: (lv_dest_3_0= ruleDependencyEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3151:3: lv_dest_3_0= ruleDependencyEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineDependencyAccess().getDestDependencyEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7854);
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
            	    break loop49;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleInLineDependency7868); 

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


    // $ANTLR start "entryRuleInLineContribution"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3179:1: entryRuleInLineContribution returns [EObject current=null] : iv_ruleInLineContribution= ruleInLineContribution EOF ;
    public final EObject entryRuleInLineContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3180:2: (iv_ruleInLineContribution= ruleInLineContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3181:2: iv_ruleInLineContribution= ruleInLineContribution EOF
            {
             newCompositeNode(grammarAccess.getInLineContributionRule()); 
            pushFollow(FOLLOW_ruleInLineContribution_in_entryRuleInLineContribution7904);
            iv_ruleInLineContribution=ruleInLineContribution();

            state._fsp--;

             current =iv_ruleInLineContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineContribution7914); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3188:1: ruleInLineContribution returns [EObject current=null] : (otherlv_0= 'contributesTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3191:28: ( (otherlv_0= 'contributesTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3192:1: (otherlv_0= 'contributesTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3192:1: (otherlv_0= 'contributesTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3192:3: otherlv_0= 'contributesTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleInLineContribution7951); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineContributionAccess().getContributesToKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3196:1: ( (lv_dest_1_0= ruleContributionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3197:1: (lv_dest_1_0= ruleContributionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3197:1: (lv_dest_1_0= ruleContributionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3198:3: lv_dest_1_0= ruleContributionEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineContributionAccess().getDestContributionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleContributionEnd_in_ruleInLineContribution7972);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3214:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==29) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3214:4: otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleInLineContribution7985); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineContributionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3218:1: ( (lv_dest_3_0= ruleContributionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3219:1: (lv_dest_3_0= ruleContributionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3219:1: (lv_dest_3_0= ruleContributionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3220:3: lv_dest_3_0= ruleContributionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineContributionAccess().getDestContributionEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionEnd_in_ruleInLineContribution8006);
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
            	    break loop50;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleInLineContribution8020); 

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


    // $ANTLR start "entryRuleInLineDecomposition"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3248:1: entryRuleInLineDecomposition returns [EObject current=null] : iv_ruleInLineDecomposition= ruleInLineDecomposition EOF ;
    public final EObject entryRuleInLineDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3249:2: (iv_ruleInLineDecomposition= ruleInLineDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3250:2: iv_ruleInLineDecomposition= ruleInLineDecomposition EOF
            {
             newCompositeNode(grammarAccess.getInLineDecompositionRule()); 
            pushFollow(FOLLOW_ruleInLineDecomposition_in_entryRuleInLineDecomposition8056);
            iv_ruleInLineDecomposition=ruleInLineDecomposition();

            state._fsp--;

             current =iv_ruleInLineDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineDecomposition8066); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3257:1: ruleInLineDecomposition returns [EObject current=null] : (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3260:28: ( (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3261:1: (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3261:1: (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3261:3: otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleInLineDecomposition8103); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineDecompositionAccess().getDecomposedByKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3265:1: ( (lv_dest_1_0= ruleDecompositionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3266:1: (lv_dest_1_0= ruleDecompositionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3266:1: (lv_dest_1_0= ruleDecompositionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3267:3: lv_dest_1_0= ruleDecompositionEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineDecompositionAccess().getDestDecompositionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition8124);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3283:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==29) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3283:4: otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleInLineDecomposition8137); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineDecompositionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3287:1: ( (lv_dest_3_0= ruleDecompositionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3288:1: (lv_dest_3_0= ruleDecompositionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3288:1: (lv_dest_3_0= ruleDecompositionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3289:3: lv_dest_3_0= ruleDecompositionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineDecompositionAccess().getDestDecompositionEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition8158);
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
            	    break loop51;
                }
            } while (true);

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleInLineDecomposition8172); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3317:1: entryRuleDecompositionEnd returns [EObject current=null] : iv_ruleDecompositionEnd= ruleDecompositionEnd EOF ;
    public final EObject entryRuleDecompositionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecompositionEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3318:2: (iv_ruleDecompositionEnd= ruleDecompositionEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3319:2: iv_ruleDecompositionEnd= ruleDecompositionEnd EOF
            {
             newCompositeNode(grammarAccess.getDecompositionEndRule()); 
            pushFollow(FOLLOW_ruleDecompositionEnd_in_entryRuleDecompositionEnd8208);
            iv_ruleDecompositionEnd=ruleDecompositionEnd();

            state._fsp--;

             current =iv_ruleDecompositionEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecompositionEnd8218); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3326:1: ruleDecompositionEnd returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}' )? ) ;
    public final EObject ruleDecompositionEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3329:28: ( ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3330:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3330:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3330:2: () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3330:2: ()
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3331:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDecompositionEndAccess().getDecompositionEndAction_0(),
                        current);
                

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3336:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3337:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3337:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3338:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecompositionEndAccess().getDestNameSuperIntentionalElementCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecompositionEnd8275);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3351:2: (otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==14) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3351:4: otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDecompositionEnd8288); 

                        	newLeafNode(otherlv_2, grammarAccess.getDecompositionEndAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3355:1: ( (lv_description_3_0= RULE_STRING ) )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_STRING) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3356:1: (lv_description_3_0= RULE_STRING )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3356:1: (lv_description_3_0= RULE_STRING )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3357:3: lv_description_3_0= RULE_STRING
                            {
                            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecompositionEnd8305); 

                            			newLeafNode(lv_description_3_0, grammarAccess.getDecompositionEndAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDecompositionEndRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_3_0, 
                                    		"STRING");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleDecompositionEnd8323); 

                        	newLeafNode(otherlv_4, grammarAccess.getDecompositionEndAccess().getRightCurlyBracketKeyword_2_2());
                        

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


    // $ANTLR start "entryRuleContributionEnd"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3385:1: entryRuleContributionEnd returns [EObject current=null] : iv_ruleContributionEnd= ruleContributionEnd EOF ;
    public final EObject entryRuleContributionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3386:2: (iv_ruleContributionEnd= ruleContributionEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3387:2: iv_ruleContributionEnd= ruleContributionEnd EOF
            {
             newCompositeNode(grammarAccess.getContributionEndRule()); 
            pushFollow(FOLLOW_ruleContributionEnd_in_entryRuleContributionEnd8361);
            iv_ruleContributionEnd=ruleContributionEnd();

            state._fsp--;

             current =iv_ruleContributionEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionEnd8371); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3394:1: ruleContributionEnd returns [EObject current=null] : ( () ( (lv_name_1_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_3= '{' ( ( (lv_contribution_4_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_5_0= RULE_QUALITATIVEVALUE ) ) )? otherlv_6= '}' )? ) ;
    public final EObject ruleContributionEnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token lv_quantitativeContribution_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_contribution_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3397:28: ( ( () ( (lv_name_1_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_3= '{' ( ( (lv_contribution_4_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_5_0= RULE_QUALITATIVEVALUE ) ) )? otherlv_6= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3398:1: ( () ( (lv_name_1_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_3= '{' ( ( (lv_contribution_4_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_5_0= RULE_QUALITATIVEVALUE ) ) )? otherlv_6= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3398:1: ( () ( (lv_name_1_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_3= '{' ( ( (lv_contribution_4_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_5_0= RULE_QUALITATIVEVALUE ) ) )? otherlv_6= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3398:2: () ( (lv_name_1_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_3= '{' ( ( (lv_contribution_4_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_5_0= RULE_QUALITATIVEVALUE ) ) )? otherlv_6= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3398:2: ()
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3399:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getContributionEndAccess().getContributionEndAction_0(),
                        current);
                

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3404:2: ( (lv_name_1_0= RULE_ID ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==RULE_ID) ) {
                    alt54=1;
                }
            }
            switch (alt54) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3405:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3405:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3406:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionEnd8422); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getContributionEndAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContributionEndRule());
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3422:3: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3423:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3423:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3424:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionEndAccess().getDestNameSuperIntentionalElementCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionEnd8451);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3437:2: (otherlv_3= '{' ( ( (lv_contribution_4_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_5_0= RULE_QUALITATIVEVALUE ) ) )? otherlv_6= '}' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==14) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3437:4: otherlv_3= '{' ( ( (lv_contribution_4_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_5_0= RULE_QUALITATIVEVALUE ) ) )? otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleContributionEnd8464); 

                        	newLeafNode(otherlv_3, grammarAccess.getContributionEndAccess().getLeftCurlyBracketKeyword_3_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3441:1: ( ( (lv_contribution_4_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_5_0= RULE_QUALITATIVEVALUE ) ) )?
                    int alt55=3;
                    int LA55_0 = input.LA(1);

                    if ( ((LA55_0>=63 && LA55_0<=69)) ) {
                        alt55=1;
                    }
                    else if ( (LA55_0==RULE_QUALITATIVEVALUE) ) {
                        alt55=2;
                    }
                    switch (alt55) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3441:2: ( (lv_contribution_4_0= ruleContributionType ) )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3441:2: ( (lv_contribution_4_0= ruleContributionType ) )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3442:1: (lv_contribution_4_0= ruleContributionType )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3442:1: (lv_contribution_4_0= ruleContributionType )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3443:3: lv_contribution_4_0= ruleContributionType
                            {
                             
                            	        newCompositeNode(grammarAccess.getContributionEndAccess().getContributionContributionTypeEnumRuleCall_3_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContributionType_in_ruleContributionEnd8486);
                            lv_contribution_4_0=ruleContributionType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getContributionEndRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"contribution",
                                    		lv_contribution_4_0, 
                                    		"ContributionType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3460:6: ( (lv_quantitativeContribution_5_0= RULE_QUALITATIVEVALUE ) )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3460:6: ( (lv_quantitativeContribution_5_0= RULE_QUALITATIVEVALUE ) )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3461:1: (lv_quantitativeContribution_5_0= RULE_QUALITATIVEVALUE )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3461:1: (lv_quantitativeContribution_5_0= RULE_QUALITATIVEVALUE )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3462:3: lv_quantitativeContribution_5_0= RULE_QUALITATIVEVALUE
                            {
                            lv_quantitativeContribution_5_0=(Token)match(input,RULE_QUALITATIVEVALUE,FOLLOW_RULE_QUALITATIVEVALUE_in_ruleContributionEnd8509); 

                            			newLeafNode(lv_quantitativeContribution_5_0, grammarAccess.getContributionEndAccess().getQuantitativeContributionQUALITATIVEVALUETerminalRuleCall_3_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getContributionEndRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"quantitativeContribution",
                                    		lv_quantitativeContribution_5_0, 
                                    		"QUALITATIVEVALUE");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleContributionEnd8528); 

                        	newLeafNode(otherlv_6, grammarAccess.getContributionEndAccess().getRightCurlyBracketKeyword_3_2());
                        

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


    // $ANTLR start "entryRuleDependencyEnd"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3490:1: entryRuleDependencyEnd returns [EObject current=null] : iv_ruleDependencyEnd= ruleDependencyEnd EOF ;
    public final EObject entryRuleDependencyEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3491:2: (iv_ruleDependencyEnd= ruleDependencyEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3492:2: iv_ruleDependencyEnd= ruleDependencyEnd EOF
            {
             newCompositeNode(grammarAccess.getDependencyEndRule()); 
            pushFollow(FOLLOW_ruleDependencyEnd_in_entryRuleDependencyEnd8566);
            iv_ruleDependencyEnd=ruleDependencyEnd();

            state._fsp--;

             current =iv_ruleDependencyEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyEnd8576); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3499:1: ruleDependencyEnd returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}' )? ) ;
    public final EObject ruleDependencyEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3502:28: ( ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3503:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3503:1: ( () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3503:2: () ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3503:2: ()
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3504:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDependencyEndAccess().getDependencyEndAction_0(),
                        current);
                

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3509:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3510:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3510:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3511:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyEndAccess().getDestNameSuperIntentionalElementCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependencyEnd8633);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3524:2: (otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==14) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3524:4: otherlv_2= '{' ( (lv_description_3_0= RULE_STRING ) )? otherlv_4= '}'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDependencyEnd8646); 

                        	newLeafNode(otherlv_2, grammarAccess.getDependencyEndAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3528:1: ( (lv_description_3_0= RULE_STRING ) )?
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==RULE_STRING) ) {
                        alt57=1;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3529:1: (lv_description_3_0= RULE_STRING )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3529:1: (lv_description_3_0= RULE_STRING )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3530:3: lv_description_3_0= RULE_STRING
                            {
                            lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependencyEnd8663); 

                            			newLeafNode(lv_description_3_0, grammarAccess.getDependencyEndAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getDependencyEndRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"description",
                                    		lv_description_3_0, 
                                    		"STRING");
                            	    

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleDependencyEnd8681); 

                        	newLeafNode(otherlv_4, grammarAccess.getDependencyEndAccess().getRightCurlyBracketKeyword_2_2());
                        

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


    // $ANTLR start "entryRuleLinkType"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3558:1: entryRuleLinkType returns [EObject current=null] : iv_ruleLinkType= ruleLinkType EOF ;
    public final EObject entryRuleLinkType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkType = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3559:2: (iv_ruleLinkType= ruleLinkType EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3560:2: iv_ruleLinkType= ruleLinkType EOF
            {
             newCompositeNode(grammarAccess.getLinkTypeRule()); 
            pushFollow(FOLLOW_ruleLinkType_in_entryRuleLinkType8719);
            iv_ruleLinkType=ruleLinkType();

            state._fsp--;

             current =iv_ruleLinkType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkType8729); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3567:1: ruleLinkType returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleLinkType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3570:28: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3571:1: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3571:1: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3571:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleLinkType8766); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkTypeAccess().getLinkKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3575:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3576:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3576:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3577:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkType8783); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleLinkType8800); 

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


    // $ANTLR start "entryRuleStrategyGroup"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3605:1: entryRuleStrategyGroup returns [EObject current=null] : iv_ruleStrategyGroup= ruleStrategyGroup EOF ;
    public final EObject entryRuleStrategyGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategyGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3606:2: (iv_ruleStrategyGroup= ruleStrategyGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3607:2: iv_ruleStrategyGroup= ruleStrategyGroup EOF
            {
             newCompositeNode(grammarAccess.getStrategyGroupRule()); 
            pushFollow(FOLLOW_ruleStrategyGroup_in_entryRuleStrategyGroup8836);
            iv_ruleStrategyGroup=ruleStrategyGroup();

            state._fsp--;

             current =iv_ruleStrategyGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrategyGroup8846); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3614:1: ruleStrategyGroup returns [EObject current=null] : (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' ) ;
    public final EObject ruleStrategyGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3617:28: ( (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3618:1: (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3618:1: (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3618:3: otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleStrategyGroup8883); 

                	newLeafNode(otherlv_0, grammarAccess.getStrategyGroupAccess().getStrategyGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3622:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3623:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3623:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3624:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStrategyGroup8900); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3640:2: (otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==35) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3640:4: otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleStrategyGroup8918); 

                        	newLeafNode(otherlv_2, grammarAccess.getStrategyGroupAccess().getIncludesKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3644:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3645:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3645:1: ( ruleQualifiedName )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3646:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getStrategyGroupRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getStrategyGroupAccess().getStrategiesEvaluationStrategyCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8941);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3659:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==29) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3659:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleStrategyGroup8954); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getStrategyGroupAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3663:1: ( ( ruleQualifiedName ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3664:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3664:1: ( ruleQualifiedName )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3665:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getStrategyGroupRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getStrategyGroupAccess().getStrategiesEvaluationStrategyCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8977);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleStrategyGroup8993); 

                	newLeafNode(otherlv_6, grammarAccess.getStrategyGroupAccess().getSemicolonKeyword_3());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3690:1: entryRuleEvaluationStrategy returns [EObject current=null] : iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF ;
    public final EObject entryRuleEvaluationStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationStrategy = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3691:2: (iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3692:2: iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF
            {
             newCompositeNode(grammarAccess.getEvaluationStrategyRule()); 
            pushFollow(FOLLOW_ruleEvaluationStrategy_in_entryRuleEvaluationStrategy9029);
            iv_ruleEvaluationStrategy=ruleEvaluationStrategy();

            state._fsp--;

             current =iv_ruleEvaluationStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationStrategy9039); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3699:1: ruleEvaluationStrategy returns [EObject current=null] : (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) | otherlv_11= ';' ) ) ;
    public final EObject ruleEvaluationStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_metaData_8_0 = null;

        EObject lv_evaluations_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3702:28: ( (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) | otherlv_11= ';' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3703:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) | otherlv_11= ';' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3703:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) | otherlv_11= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3703:3: otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? ( (otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) | otherlv_11= ';' )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleEvaluationStrategy9076); 

                	newLeafNode(otherlv_0, grammarAccess.getEvaluationStrategyAccess().getStrategyKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3707:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3708:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3708:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3709:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvaluationStrategy9093); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3725:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==37) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3725:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleEvaluationStrategy9111); 

                        	newLeafNode(otherlv_2, grammarAccess.getEvaluationStrategyAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3729:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3730:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3730:1: ( ruleQualifiedName )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3731:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getSuperStrategiesEvaluationStrategyCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy9134);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3744:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==29) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3744:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleEvaluationStrategy9147); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getEvaluationStrategyAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3748:1: ( ( ruleQualifiedName ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3749:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3749:1: ( ruleQualifiedName )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3750:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getSuperStrategiesEvaluationStrategyCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy9170);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3763:6: ( (otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) | otherlv_11= ';' )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==14) ) {
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3763:7: (otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3763:7: (otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3763:9: otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEvaluationStrategy9188); 

                        	newLeafNode(otherlv_6, grammarAccess.getEvaluationStrategyAccess().getLeftCurlyBracketKeyword_3_0_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3767:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3769:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3769:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3770:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_3_0_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3773:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3774:3: ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3774:3: ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )*
                    loop65:
                    do {
                        int alt65=3;
                        int LA65_0 = input.LA(1);

                        if ( LA65_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_3_0_1(), 0) ) {
                            alt65=1;
                        }
                        else if ( LA65_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_3_0_1(), 1) ) {
                            alt65=2;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3776:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3776:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3777:5: {...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_3_0_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluationStrategy", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_3_0_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3777:119: ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3778:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_3_0_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3781:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
                    	    int cnt63=0;
                    	    loop63:
                    	    do {
                    	        int alt63=2;
                    	        int LA63_0 = input.LA(1);

                    	        if ( (LA63_0==52) ) {
                    	            int LA63_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt63=1;
                    	            }


                    	        }


                    	        switch (alt63) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3781:7: {...}? => ( (lv_metaData_8_0= ruleMetadata ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleEvaluationStrategy", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3781:16: ( (lv_metaData_8_0= ruleMetadata ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3782:1: (lv_metaData_8_0= ruleMetadata )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3782:1: (lv_metaData_8_0= ruleMetadata )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3783:3: lv_metaData_8_0= ruleMetadata
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getMetaDataMetadataParserRuleCall_3_0_1_0_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleEvaluationStrategy9254);
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
                    	    	    if ( cnt63 >= 1 ) break loop63;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(63, input);
                    	                throw eee;
                    	        }
                    	        cnt63++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_3_0_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3806:4: ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3806:4: ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3807:5: {...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_3_0_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluationStrategy", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_3_0_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3807:119: ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3808:6: ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_3_0_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3811:6: ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+
                    	    int cnt64=0;
                    	    loop64:
                    	    do {
                    	        int alt64=2;
                    	        int LA64_0 = input.LA(1);

                    	        if ( (LA64_0==RULE_ID) ) {
                    	            int LA64_2 = input.LA(2);

                    	            if ( ((true)) ) {
                    	                alt64=1;
                    	            }


                    	        }


                    	        switch (alt64) {
                    	    	case 1 :
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3811:7: {...}? => ( (lv_evaluations_9_0= ruleEvaluation ) )
                    	    	    {
                    	    	    if ( !((true)) ) {
                    	    	        throw new FailedPredicateException(input, "ruleEvaluationStrategy", "true");
                    	    	    }
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3811:16: ( (lv_evaluations_9_0= ruleEvaluation ) )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3812:1: (lv_evaluations_9_0= ruleEvaluation )
                    	    	    {
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3812:1: (lv_evaluations_9_0= ruleEvaluation )
                    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3813:3: lv_evaluations_9_0= ruleEvaluation
                    	    	    {
                    	    	     
                    	    	    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getEvaluationsEvaluationParserRuleCall_3_0_1_1_0()); 
                    	    	    	    
                    	    	    pushFollow(FOLLOW_ruleEvaluation_in_ruleEvaluationStrategy9330);
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
                    	    	    if ( cnt64 >= 1 ) break loop64;
                    	                EarlyExitException eee =
                    	                    new EarlyExitException(64, input);
                    	                throw eee;
                    	        }
                    	        cnt64++;
                    	    } while (true);

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_3_0_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_3_0_1());
                    	

                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEvaluationStrategy9383); 

                        	newLeafNode(otherlv_10, grammarAccess.getEvaluationStrategyAccess().getRightCurlyBracketKeyword_3_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3848:7: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleEvaluationStrategy9402); 

                        	newLeafNode(otherlv_11, grammarAccess.getEvaluationStrategyAccess().getSemicolonKeyword_3_1());
                        

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
    // $ANTLR end "ruleEvaluationStrategy"


    // $ANTLR start "entryRuleEvaluation"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3860:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3861:2: (iv_ruleEvaluation= ruleEvaluation EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3862:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation9439);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation9449); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3869:1: ruleEvaluation returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_QUALITATIVEVALUE ) ) ) ( (otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) | otherlv_11= ';' ) ) ;
    public final EObject ruleEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_evaluation_3_0=null;
        Token otherlv_4=null;
        Token lv_exceeds_6_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_qualitativeEvaluation_2_0 = null;

        EObject lv_evalRange_8_0 = null;

        EObject lv_kpiEvalValueSet_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3872:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_QUALITATIVEVALUE ) ) ) ( (otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) | otherlv_11= ';' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3873:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_QUALITATIVEVALUE ) ) ) ( (otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) | otherlv_11= ';' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3873:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_QUALITATIVEVALUE ) ) ) ( (otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) | otherlv_11= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3873:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_QUALITATIVEVALUE ) ) ) ( (otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) | otherlv_11= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3873:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3874:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3874:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3875:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEvaluationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEvaluationAccess().getIntentionalElementSuperIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluation9497);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation9509); 

                	newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3892:1: ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_QUALITATIVEVALUE ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==56||LA67_0==66||(LA67_0>=70 && LA67_0<=74)) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_QUALITATIVEVALUE) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3892:2: ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3892:2: ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3893:1: (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3893:1: (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3894:3: lv_qualitativeEvaluation_2_0= ruleQualitativeLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvaluationAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleEvaluation9531);
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3911:6: ( (lv_evaluation_3_0= RULE_QUALITATIVEVALUE ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3911:6: ( (lv_evaluation_3_0= RULE_QUALITATIVEVALUE ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3912:1: (lv_evaluation_3_0= RULE_QUALITATIVEVALUE )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3912:1: (lv_evaluation_3_0= RULE_QUALITATIVEVALUE )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3913:3: lv_evaluation_3_0= RULE_QUALITATIVEVALUE
                    {
                    lv_evaluation_3_0=(Token)match(input,RULE_QUALITATIVEVALUE,FOLLOW_RULE_QUALITATIVEVALUE_in_ruleEvaluation9554); 

                    			newLeafNode(lv_evaluation_3_0, grammarAccess.getEvaluationAccess().getEvaluationQUALITATIVEVALUETerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvaluationRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"evaluation",
                            		lv_evaluation_3_0, 
                            		"QUALITATIVEVALUE");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3929:3: ( (otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* ) ) ) otherlv_10= '}' ) | otherlv_11= ';' )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==14) ) {
                alt69=1;
            }
            else if ( (LA69_0==17) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3929:4: (otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3929:4: (otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* ) ) ) otherlv_10= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3929:6: otherlv_4= '{' ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* ) ) ) otherlv_10= '}'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleEvaluation9574); 

                        	newLeafNode(otherlv_4, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3_0_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3933:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* ) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3935:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3935:1: ( ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3936:2: ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* )
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3939:2: ( ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )* )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3940:3: ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )*
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3940:3: ( ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) ) )*
                    loop68:
                    do {
                        int alt68=4;
                        int LA68_0 = input.LA(1);

                        if ( LA68_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1(), 0) ) {
                            alt68=1;
                        }
                        else if ( LA68_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1(), 1) ) {
                            alt68=2;
                        }
                        else if ( LA68_0 >=42 && LA68_0<=47 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1(), 2) ) {
                            alt68=3;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3942:4: ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3942:4: ({...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3943:5: {...}? => ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3943:111: ( ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3944:6: ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3947:6: ({...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3947:7: {...}? => ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3947:16: ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3947:17: ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';'
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3947:17: ( (lv_exceeds_6_0= 'exceeds' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3948:1: (lv_exceeds_6_0= 'exceeds' )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3948:1: (lv_exceeds_6_0= 'exceeds' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3949:3: lv_exceeds_6_0= 'exceeds'
                    	    {
                    	    lv_exceeds_6_0=(Token)match(input,38,FOLLOW_38_in_ruleEvaluation9638); 

                    	            newLeafNode(lv_exceeds_6_0, grammarAccess.getEvaluationAccess().getExceedsExceedsKeyword_3_0_1_0_0_0());
                    	        

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEvaluationRule());
                    	    	        }
                    	           		setWithLastConsumed(current, "exceeds", true, "exceeds");
                    	    	    

                    	    }


                    	    }

                    	    otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleEvaluation9663); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_0_1_0_1());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3973:4: ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3973:4: ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3974:5: {...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3974:111: ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3975:6: ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3978:6: ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3978:7: {...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3978:16: ( (lv_evalRange_8_0= ruleEvaluationRange ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3979:1: (lv_evalRange_8_0= ruleEvaluationRange )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3979:1: (lv_evalRange_8_0= ruleEvaluationRange )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3980:3: lv_evalRange_8_0= ruleEvaluationRange
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getEvalRangeEvaluationRangeParserRuleCall_3_0_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvaluationRange_in_ruleEvaluation9739);
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

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4003:4: ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4003:4: ({...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4004:5: {...}? => ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4004:111: ( ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4005:6: ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4008:6: ({...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4008:7: {...}? => ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4008:16: ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4009:1: (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4009:1: (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4010:3: lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getKpiEvalValueSetKPIEvalValueSetParserRuleCall_3_0_1_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation9814);
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


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }


                    }

                     
                    	  getUnorderedGroupHelper().leave(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0_1());
                    	

                    }

                    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEvaluation9866); 

                        	newLeafNode(otherlv_10, grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_3_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4045:7: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleEvaluation9885); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4057:1: entryRuleEvaluationRange returns [EObject current=null] : iv_ruleEvaluationRange= ruleEvaluationRange EOF ;
    public final EObject entryRuleEvaluationRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4058:2: (iv_ruleEvaluationRange= ruleEvaluationRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4059:2: iv_ruleEvaluationRange= ruleEvaluationRange EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRangeRule()); 
            pushFollow(FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange9922);
            iv_ruleEvaluationRange=ruleEvaluationRange();

            state._fsp--;

             current =iv_ruleEvaluationRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationRange9932); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4066:1: ruleEvaluationRange returns [EObject current=null] : ( (otherlv_0= 'start' otherlv_1= '=' ( (lv_vahdat_2_0= RULE_QUALITATIVEVALUE ) ) otherlv_3= ';' ) (otherlv_4= 'end' otherlv_5= '=' ( (lv_end_6_0= RULE_QUALITATIVEVALUE ) ) otherlv_7= ';' ) (otherlv_8= 'step' otherlv_9= '=' ( (lv_step_10_0= RULE_QUALITATIVEVALUE ) ) otherlv_11= ';' ) ) ;
    public final EObject ruleEvaluationRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_vahdat_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_end_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_step_10_0=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4069:28: ( ( (otherlv_0= 'start' otherlv_1= '=' ( (lv_vahdat_2_0= RULE_QUALITATIVEVALUE ) ) otherlv_3= ';' ) (otherlv_4= 'end' otherlv_5= '=' ( (lv_end_6_0= RULE_QUALITATIVEVALUE ) ) otherlv_7= ';' ) (otherlv_8= 'step' otherlv_9= '=' ( (lv_step_10_0= RULE_QUALITATIVEVALUE ) ) otherlv_11= ';' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4070:1: ( (otherlv_0= 'start' otherlv_1= '=' ( (lv_vahdat_2_0= RULE_QUALITATIVEVALUE ) ) otherlv_3= ';' ) (otherlv_4= 'end' otherlv_5= '=' ( (lv_end_6_0= RULE_QUALITATIVEVALUE ) ) otherlv_7= ';' ) (otherlv_8= 'step' otherlv_9= '=' ( (lv_step_10_0= RULE_QUALITATIVEVALUE ) ) otherlv_11= ';' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4070:1: ( (otherlv_0= 'start' otherlv_1= '=' ( (lv_vahdat_2_0= RULE_QUALITATIVEVALUE ) ) otherlv_3= ';' ) (otherlv_4= 'end' otherlv_5= '=' ( (lv_end_6_0= RULE_QUALITATIVEVALUE ) ) otherlv_7= ';' ) (otherlv_8= 'step' otherlv_9= '=' ( (lv_step_10_0= RULE_QUALITATIVEVALUE ) ) otherlv_11= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4070:2: (otherlv_0= 'start' otherlv_1= '=' ( (lv_vahdat_2_0= RULE_QUALITATIVEVALUE ) ) otherlv_3= ';' ) (otherlv_4= 'end' otherlv_5= '=' ( (lv_end_6_0= RULE_QUALITATIVEVALUE ) ) otherlv_7= ';' ) (otherlv_8= 'step' otherlv_9= '=' ( (lv_step_10_0= RULE_QUALITATIVEVALUE ) ) otherlv_11= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4070:2: (otherlv_0= 'start' otherlv_1= '=' ( (lv_vahdat_2_0= RULE_QUALITATIVEVALUE ) ) otherlv_3= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4070:4: otherlv_0= 'start' otherlv_1= '=' ( (lv_vahdat_2_0= RULE_QUALITATIVEVALUE ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleEvaluationRange9970); 

                	newLeafNode(otherlv_0, grammarAccess.getEvaluationRangeAccess().getStartKeyword_0_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange9982); 

                	newLeafNode(otherlv_1, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_0_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4078:1: ( (lv_vahdat_2_0= RULE_QUALITATIVEVALUE ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4079:1: (lv_vahdat_2_0= RULE_QUALITATIVEVALUE )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4079:1: (lv_vahdat_2_0= RULE_QUALITATIVEVALUE )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4080:3: lv_vahdat_2_0= RULE_QUALITATIVEVALUE
            {
            lv_vahdat_2_0=(Token)match(input,RULE_QUALITATIVEVALUE,FOLLOW_RULE_QUALITATIVEVALUE_in_ruleEvaluationRange9999); 

            			newLeafNode(lv_vahdat_2_0, grammarAccess.getEvaluationRangeAccess().getVahdatQUALITATIVEVALUETerminalRuleCall_0_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvaluationRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"vahdat",
                    		lv_vahdat_2_0, 
                    		"QUALITATIVEVALUE");
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleEvaluationRange10016); 

                	newLeafNode(otherlv_3, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_0_3());
                

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4100:2: (otherlv_4= 'end' otherlv_5= '=' ( (lv_end_6_0= RULE_QUALITATIVEVALUE ) ) otherlv_7= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4100:4: otherlv_4= 'end' otherlv_5= '=' ( (lv_end_6_0= RULE_QUALITATIVEVALUE ) ) otherlv_7= ';'
            {
            otherlv_4=(Token)match(input,40,FOLLOW_40_in_ruleEvaluationRange10030); 

                	newLeafNode(otherlv_4, grammarAccess.getEvaluationRangeAccess().getEndKeyword_1_0());
                
            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange10042); 

                	newLeafNode(otherlv_5, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_1_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4108:1: ( (lv_end_6_0= RULE_QUALITATIVEVALUE ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4109:1: (lv_end_6_0= RULE_QUALITATIVEVALUE )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4109:1: (lv_end_6_0= RULE_QUALITATIVEVALUE )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4110:3: lv_end_6_0= RULE_QUALITATIVEVALUE
            {
            lv_end_6_0=(Token)match(input,RULE_QUALITATIVEVALUE,FOLLOW_RULE_QUALITATIVEVALUE_in_ruleEvaluationRange10059); 

            			newLeafNode(lv_end_6_0, grammarAccess.getEvaluationRangeAccess().getEndQUALITATIVEVALUETerminalRuleCall_1_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvaluationRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"end",
                    		lv_end_6_0, 
                    		"QUALITATIVEVALUE");
            	    

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleEvaluationRange10076); 

                	newLeafNode(otherlv_7, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_1_3());
                

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4130:2: (otherlv_8= 'step' otherlv_9= '=' ( (lv_step_10_0= RULE_QUALITATIVEVALUE ) ) otherlv_11= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4130:4: otherlv_8= 'step' otherlv_9= '=' ( (lv_step_10_0= RULE_QUALITATIVEVALUE ) ) otherlv_11= ';'
            {
            otherlv_8=(Token)match(input,41,FOLLOW_41_in_ruleEvaluationRange10090); 

                	newLeafNode(otherlv_8, grammarAccess.getEvaluationRangeAccess().getStepKeyword_2_0());
                
            otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange10102); 

                	newLeafNode(otherlv_9, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_2_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4138:1: ( (lv_step_10_0= RULE_QUALITATIVEVALUE ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4139:1: (lv_step_10_0= RULE_QUALITATIVEVALUE )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4139:1: (lv_step_10_0= RULE_QUALITATIVEVALUE )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4140:3: lv_step_10_0= RULE_QUALITATIVEVALUE
            {
            lv_step_10_0=(Token)match(input,RULE_QUALITATIVEVALUE,FOLLOW_RULE_QUALITATIVEVALUE_in_ruleEvaluationRange10119); 

            			newLeafNode(lv_step_10_0, grammarAccess.getEvaluationRangeAccess().getStepQUALITATIVEVALUETerminalRuleCall_2_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvaluationRangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"step",
                    		lv_step_10_0, 
                    		"QUALITATIVEVALUE");
            	    

            }


            }

            otherlv_11=(Token)match(input,17,FOLLOW_17_in_ruleEvaluationRange10136); 

                	newLeafNode(otherlv_11, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_2_3());
                

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
    // $ANTLR end "ruleEvaluationRange"


    // $ANTLR start "entryRuleKPIEvalValueSet"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4168:1: entryRuleKPIEvalValueSet returns [EObject current=null] : iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF ;
    public final EObject entryRuleKPIEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4169:2: (iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4170:2: iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet10173);
            iv_ruleKPIEvalValueSet=ruleKPIEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIEvalValueSet10183); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4177:1: ruleKPIEvalValueSet returns [EObject current=null] : (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet ) ;
    public final EObject ruleKPIEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject this_KPIQuantitativeEvalValueSet_0 = null;

        EObject this_KPIQualitativeEvalValueSet_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4180:28: ( (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4181:1: (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4181:1: (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( ((LA70_0>=42 && LA70_0<=46)) ) {
                alt70=1;
            }
            else if ( (LA70_0==47) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4182:5: this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet
                    {
                     
                            newCompositeNode(grammarAccess.getKPIEvalValueSetAccess().getKPIQuantitativeEvalValueSetParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleKPIQuantitativeEvalValueSet_in_ruleKPIEvalValueSet10230);
                    this_KPIQuantitativeEvalValueSet_0=ruleKPIQuantitativeEvalValueSet();

                    state._fsp--;

                     
                            current = this_KPIQuantitativeEvalValueSet_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4192:5: this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet
                    {
                     
                            newCompositeNode(grammarAccess.getKPIEvalValueSetAccess().getKPIQualitativeEvalValueSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleKPIQualitativeEvalValueSet_in_ruleKPIEvalValueSet10257);
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4208:1: entryRuleKPIQuantitativeEvalValueSet returns [EObject current=null] : iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF ;
    public final EObject entryRuleKPIQuantitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIQuantitativeEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4209:2: (iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4210:2: iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIQuantitativeEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIQuantitativeEvalValueSet_in_entryRuleKPIQuantitativeEvalValueSet10292);
            iv_ruleKPIQuantitativeEvalValueSet=ruleKPIQuantitativeEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIQuantitativeEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIQuantitativeEvalValueSet10302); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4217:1: ruleKPIQuantitativeEvalValueSet returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4220:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4221:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4221:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4223:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4223:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4224:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4227:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4228:3: ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4228:3: ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=6;
                alt71 = dfa71.predict(input);
                switch (alt71) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4230:4: ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4230:4: ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4231:5: {...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4231:122: ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4232:6: ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4235:6: ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4235:7: {...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4235:16: (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4235:18: otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleKPIQuantitativeEvalValueSet10384); 

            	        	newLeafNode(otherlv_1, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getTargetKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10396); 

            	        	newLeafNode(otherlv_2, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4243:1: ( (lv_targetValue_3_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4244:1: (lv_targetValue_3_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4244:1: (lv_targetValue_3_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4245:3: lv_targetValue_3_0= RULE_DOUBLE
            	    {
            	    lv_targetValue_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10413); 

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

            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10430); 

            	        	newLeafNode(otherlv_4, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4272:4: ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4272:4: ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4273:5: {...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4273:122: ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4274:6: ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4277:6: ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4277:7: {...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4277:16: (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4277:18: otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,43,FOLLOW_43_in_ruleKPIQuantitativeEvalValueSet10498); 

            	        	newLeafNode(otherlv_5, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getThresholdKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10510); 

            	        	newLeafNode(otherlv_6, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4285:1: ( (lv_thresholdValue_7_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4286:1: (lv_thresholdValue_7_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4286:1: (lv_thresholdValue_7_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4287:3: lv_thresholdValue_7_0= RULE_DOUBLE
            	    {
            	    lv_thresholdValue_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10527); 

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

            	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10544); 

            	        	newLeafNode(otherlv_8, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4314:4: ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4314:4: ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4315:5: {...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4315:122: ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4316:6: ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4319:6: ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4319:7: {...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4319:16: (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4319:18: otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,44,FOLLOW_44_in_ruleKPIQuantitativeEvalValueSet10612); 

            	        	newLeafNode(otherlv_9, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getWorstKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10624); 

            	        	newLeafNode(otherlv_10, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4327:1: ( (lv_worstValue_11_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4328:1: (lv_worstValue_11_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4328:1: (lv_worstValue_11_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4329:3: lv_worstValue_11_0= RULE_DOUBLE
            	    {
            	    lv_worstValue_11_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10641); 

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

            	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10658); 

            	        	newLeafNode(otherlv_12, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4356:4: ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4356:4: ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4357:5: {...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4357:122: ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4358:6: ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4361:6: ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4361:7: {...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4361:16: (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4361:18: otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';'
            	    {
            	    otherlv_13=(Token)match(input,45,FOLLOW_45_in_ruleKPIQuantitativeEvalValueSet10726); 

            	        	newLeafNode(otherlv_13, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEvalKeyword_3_0());
            	        
            	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10738); 

            	        	newLeafNode(otherlv_14, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4369:1: ( (lv_evaluationValue_15_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4370:1: (lv_evaluationValue_15_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4370:1: (lv_evaluationValue_15_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4371:3: lv_evaluationValue_15_0= RULE_DOUBLE
            	    {
            	    lv_evaluationValue_15_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10755); 

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

            	    otherlv_16=(Token)match(input,17,FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10772); 

            	        	newLeafNode(otherlv_16, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4398:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4398:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4399:5: {...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4399:122: ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4400:6: ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4403:6: ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4403:7: {...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4403:16: (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4403:18: otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';'
            	    {
            	    otherlv_17=(Token)match(input,46,FOLLOW_46_in_ruleKPIQuantitativeEvalValueSet10840); 

            	        	newLeafNode(otherlv_17, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnitKeyword_4_0());
            	        
            	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10852); 

            	        	newLeafNode(otherlv_18, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4411:1: ( (lv_unit_19_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4412:1: (lv_unit_19_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4412:1: (lv_unit_19_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4413:3: lv_unit_19_0= RULE_STRING
            	    {
            	    lv_unit_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKPIQuantitativeEvalValueSet10869); 

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

            	    otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10886); 

            	        	newLeafNode(otherlv_20, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4456:1: entryRuleKPIQualitativeEvalValueSet returns [EObject current=null] : iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF ;
    public final EObject entryRuleKPIQualitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIQualitativeEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4457:2: (iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4458:2: iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIQualitativeEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIQualitativeEvalValueSet_in_entryRuleKPIQualitativeEvalValueSet10968);
            iv_ruleKPIQualitativeEvalValueSet=ruleKPIQualitativeEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIQualitativeEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIQualitativeEvalValueSet10978); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4465:1: ruleKPIQualitativeEvalValueSet returns [EObject current=null] : (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleKPIQualitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4468:28: ( (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4469:1: (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4469:1: (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4469:3: otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleKPIQualitativeEvalValueSet11015); 

                	newLeafNode(otherlv_0, grammarAccess.getKPIQualitativeEvalValueSetAccess().getQualevalKeyword_0());
                
            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleKPIQualitativeEvalValueSet11027); 

                	newLeafNode(otherlv_1, grammarAccess.getKPIQualitativeEvalValueSetAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4477:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4478:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4478:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4479:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getKPIQualitativeEvalValueSetRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getKPIQualitativeEvalValueSetAccess().getQualitativeEvaluationValueMappingCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleKPIQualitativeEvalValueSet11050);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleKPIQualitativeEvalValueSet11062); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4504:1: entryRuleQualitativeMapping returns [EObject current=null] : iv_ruleQualitativeMapping= ruleQualitativeMapping EOF ;
    public final EObject entryRuleQualitativeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeMapping = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4505:2: (iv_ruleQualitativeMapping= ruleQualitativeMapping EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4506:2: iv_ruleQualitativeMapping= ruleQualitativeMapping EOF
            {
             newCompositeNode(grammarAccess.getQualitativeMappingRule()); 
            pushFollow(FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping11098);
            iv_ruleQualitativeMapping=ruleQualitativeMapping();

            state._fsp--;

             current =iv_ruleQualitativeMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitativeMapping11108); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4513:1: ruleQualitativeMapping returns [EObject current=null] : (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}' ) ;
    public final EObject ruleQualitativeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        EObject lv_metaData_4_0 = null;

        EObject lv_mappings_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4516:28: ( (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4517:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4517:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4517:3: otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleQualitativeMapping11145); 

                	newLeafNode(otherlv_0, grammarAccess.getQualitativeMappingAccess().getQualitativeMappingKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4521:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4522:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4522:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4523:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeMapping11162); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleQualitativeMapping11179); 

                	newLeafNode(otherlv_2, grammarAccess.getQualitativeMappingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4543:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4545:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4545:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4546:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4549:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4550:3: ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4550:3: ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) ) )*
            loop74:
            do {
                int alt74=3;
                int LA74_0 = input.LA(1);

                if ( LA74_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0) ) {
                    alt74=1;
                }
                else if ( LA74_0 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1) ) {
                    alt74=2;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4552:4: ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4552:4: ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4553:5: {...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4553:115: ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4554:6: ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4557:6: ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+
            	    int cnt72=0;
            	    loop72:
            	    do {
            	        int alt72=2;
            	        int LA72_0 = input.LA(1);

            	        if ( (LA72_0==52) ) {
            	            int LA72_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt72=1;
            	            }


            	        }


            	        switch (alt72) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4557:7: {...}? => ( (lv_metaData_4_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4557:16: ( (lv_metaData_4_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4558:1: (lv_metaData_4_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4558:1: (lv_metaData_4_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4559:3: lv_metaData_4_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getQualitativeMappingAccess().getMetaDataMetadataParserRuleCall_3_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleQualitativeMapping11245);
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
            	    	    if ( cnt72 >= 1 ) break loop72;
            	                EarlyExitException eee =
            	                    new EarlyExitException(72, input);
            	                throw eee;
            	        }
            	        cnt72++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4582:4: ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4582:4: ({...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4583:5: {...}? => ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4583:115: ( ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4584:6: ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4587:6: ({...}? => ( (lv_mappings_5_0= ruleMapping ) ) )+
            	    int cnt73=0;
            	    loop73:
            	    do {
            	        int alt73=2;
            	        int LA73_0 = input.LA(1);

            	        if ( (LA73_0==RULE_STRING) ) {
            	            int LA73_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt73=1;
            	            }


            	        }


            	        switch (alt73) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4587:7: {...}? => ( (lv_mappings_5_0= ruleMapping ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4587:16: ( (lv_mappings_5_0= ruleMapping ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4588:1: (lv_mappings_5_0= ruleMapping )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4588:1: (lv_mappings_5_0= ruleMapping )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4589:3: lv_mappings_5_0= ruleMapping
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getQualitativeMappingAccess().getMappingsMappingParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMapping_in_ruleQualitativeMapping11321);
            	    	    lv_mappings_5_0=ruleMapping();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getQualitativeMappingRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"mappings",
            	    	            		lv_mappings_5_0, 
            	    	            		"Mapping");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt73 >= 1 ) break loop73;
            	                EarlyExitException eee =
            	                    new EarlyExitException(73, input);
            	                throw eee;
            	        }
            	        cnt73++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleQualitativeMapping11374); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4631:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4632:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4633:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping11410);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping11420); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4640:1: ruleMapping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_evaluation_2_0= RULE_QUALITATIVEVALUE ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) (otherlv_5= ',' ( (lv_exceeds_6_0= ruleBoolean ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleMapping() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_evaluation_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_qualitativeEvaluation_4_0 = null;

        Enumerator lv_exceeds_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4643:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_evaluation_2_0= RULE_QUALITATIVEVALUE ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) (otherlv_5= ',' ( (lv_exceeds_6_0= ruleBoolean ) ) )? otherlv_7= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4644:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_evaluation_2_0= RULE_QUALITATIVEVALUE ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) (otherlv_5= ',' ( (lv_exceeds_6_0= ruleBoolean ) ) )? otherlv_7= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4644:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_evaluation_2_0= RULE_QUALITATIVEVALUE ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) (otherlv_5= ',' ( (lv_exceeds_6_0= ruleBoolean ) ) )? otherlv_7= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4644:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_evaluation_2_0= RULE_QUALITATIVEVALUE ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) (otherlv_5= ',' ( (lv_exceeds_6_0= ruleBoolean ) ) )? otherlv_7= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4644:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4645:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4645:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4646:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMapping11462); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleMapping11479); 

                	newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getCommaKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4666:1: ( (lv_evaluation_2_0= RULE_QUALITATIVEVALUE ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4667:1: (lv_evaluation_2_0= RULE_QUALITATIVEVALUE )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4667:1: (lv_evaluation_2_0= RULE_QUALITATIVEVALUE )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4668:3: lv_evaluation_2_0= RULE_QUALITATIVEVALUE
            {
            lv_evaluation_2_0=(Token)match(input,RULE_QUALITATIVEVALUE,FOLLOW_RULE_QUALITATIVEVALUE_in_ruleMapping11496); 

            			newLeafNode(lv_evaluation_2_0, grammarAccess.getMappingAccess().getEvaluationQUALITATIVEVALUETerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMappingRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"evaluation",
                    		lv_evaluation_2_0, 
                    		"QUALITATIVEVALUE");
            	    

            }


            }

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleMapping11513); 

                	newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getCommaKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4688:1: ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4689:1: (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4689:1: (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4690:3: lv_qualitativeEvaluation_4_0= ruleQualitativeLabel
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleMapping11534);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4706:2: (otherlv_5= ',' ( (lv_exceeds_6_0= ruleBoolean ) ) )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==29) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4706:4: otherlv_5= ',' ( (lv_exceeds_6_0= ruleBoolean ) )
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleMapping11547); 

                        	newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getCommaKeyword_5_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4710:1: ( (lv_exceeds_6_0= ruleBoolean ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4711:1: (lv_exceeds_6_0= ruleBoolean )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4711:1: (lv_exceeds_6_0= ruleBoolean )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4712:3: lv_exceeds_6_0= ruleBoolean
                    {
                     
                    	        newCompositeNode(grammarAccess.getMappingAccess().getExceedsBooleanEnumRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBoolean_in_ruleMapping11568);
                    lv_exceeds_6_0=ruleBoolean();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMappingRule());
                    	        }
                           		set(
                           			current, 
                           			"exceeds",
                            		lv_exceeds_6_0, 
                            		"Boolean");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleMapping11582); 

                	newLeafNode(otherlv_7, grammarAccess.getMappingAccess().getSemicolonKeyword_6());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4740:1: entryRuleContributionGroup returns [EObject current=null] : iv_ruleContributionGroup= ruleContributionGroup EOF ;
    public final EObject entryRuleContributionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4741:2: (iv_ruleContributionGroup= ruleContributionGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4742:2: iv_ruleContributionGroup= ruleContributionGroup EOF
            {
             newCompositeNode(grammarAccess.getContributionGroupRule()); 
            pushFollow(FOLLOW_ruleContributionGroup_in_entryRuleContributionGroup11618);
            iv_ruleContributionGroup=ruleContributionGroup();

            state._fsp--;

             current =iv_ruleContributionGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionGroup11628); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4749:1: ruleContributionGroup returns [EObject current=null] : (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4752:28: ( (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4753:1: (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4753:1: (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4753:3: otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleContributionGroup11665); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionGroupAccess().getContributionGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4757:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4758:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4758:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4759:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup11682); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleContributionGroup11699); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionGroupAccess().getIncludesKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4779:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4780:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4780:1: (otherlv_3= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4781:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionGroupRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup11719); 

            		newLeafNode(otherlv_3, grammarAccess.getContributionGroupAccess().getContribsContributionContextCrossReference_3_0()); 
            	

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4792:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==29) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4792:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleContributionGroup11732); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4796:1: ( (otherlv_5= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4797:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4797:1: (otherlv_5= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4798:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionGroupRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup11752); 

            	    		newLeafNode(otherlv_5, grammarAccess.getContributionGroupAccess().getContribsContributionContextCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleContributionGroup11766); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4821:1: entryRuleContributionContext returns [EObject current=null] : iv_ruleContributionContext= ruleContributionContext EOF ;
    public final EObject entryRuleContributionContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionContext = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4822:2: (iv_ruleContributionContext= ruleContributionContext EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4823:2: iv_ruleContributionContext= ruleContributionContext EOF
            {
             newCompositeNode(grammarAccess.getContributionContextRule()); 
            pushFollow(FOLLOW_ruleContributionContext_in_entryRuleContributionContext11802);
            iv_ruleContributionContext=ruleContributionContext();

            state._fsp--;

             current =iv_ruleContributionContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionContext11812); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4830:1: ruleContributionContext returns [EObject current=null] : (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4833:28: ( (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4834:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4834:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4834:3: otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleContributionContext11849); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionContextAccess().getContributionKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4838:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4839:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4839:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4840:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionContext11866); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4856:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==37) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4856:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleContributionContext11884); 

                        	newLeafNode(otherlv_2, grammarAccess.getContributionContextAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4860:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4861:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4861:1: ( ruleQualifiedName )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4862:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContributionContextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContributionContextAccess().getSuperContributionContextsContributionContextCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionContext11907);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4875:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==29) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4875:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleContributionContext11920); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getContributionContextAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4879:1: ( ( ruleQualifiedName ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4880:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4880:1: ( ruleQualifiedName )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4881:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getContributionContextRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getContributionContextAccess().getSuperContributionContextsContributionContextCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionContext11943);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleContributionContext11959); 

                	newLeafNode(otherlv_6, grammarAccess.getContributionContextAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4898:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4900:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4900:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4901:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionContextAccess().getUnorderedGroup_4());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4904:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4905:3: ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4905:3: ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )*
            loop81:
            do {
                int alt81=3;
                int LA81_0 = input.LA(1);

                if ( LA81_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 0) ) {
                    alt81=1;
                }
                else if ( LA81_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 1) ) {
                    alt81=2;
                }


                switch (alt81) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4907:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4907:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4908:5: {...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContributionContext", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4908:116: ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4909:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4912:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
            	    int cnt79=0;
            	    loop79:
            	    do {
            	        int alt79=2;
            	        int LA79_0 = input.LA(1);

            	        if ( (LA79_0==52) ) {
            	            int LA79_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt79=1;
            	            }


            	        }


            	        switch (alt79) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4912:7: {...}? => ( (lv_metaData_8_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleContributionContext", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4912:16: ( (lv_metaData_8_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4913:1: (lv_metaData_8_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4913:1: (lv_metaData_8_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4914:3: lv_metaData_8_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContributionContextAccess().getMetaDataMetadataParserRuleCall_4_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleContributionContext12025);
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
            	    	    if ( cnt79 >= 1 ) break loop79;
            	                EarlyExitException eee =
            	                    new EarlyExitException(79, input);
            	                throw eee;
            	        }
            	        cnt79++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionContextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4937:4: ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4937:4: ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4938:5: {...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContributionContext", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4938:116: ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4939:6: ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4942:6: ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+
            	    int cnt80=0;
            	    loop80:
            	    do {
            	        int alt80=2;
            	        int LA80_0 = input.LA(1);

            	        if ( (LA80_0==RULE_ID) ) {
            	            int LA80_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt80=1;
            	            }


            	        }


            	        switch (alt80) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4942:7: {...}? => ( (lv_changes_9_0= ruleContributionChange ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleContributionContext", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4942:16: ( (lv_changes_9_0= ruleContributionChange ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4943:1: (lv_changes_9_0= ruleContributionChange )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4943:1: (lv_changes_9_0= ruleContributionChange )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4944:3: lv_changes_9_0= ruleContributionChange
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContributionContextAccess().getChangesContributionChangeParserRuleCall_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleContributionChange_in_ruleContributionContext12101);
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
            	    	    if ( cnt80 >= 1 ) break loop80;
            	                EarlyExitException eee =
            	                    new EarlyExitException(80, input);
            	                throw eee;
            	        }
            	        cnt80++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionContextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContributionContextAccess().getUnorderedGroup_4());
            	

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleContributionContext12154); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4986:1: entryRuleContributionChange returns [EObject current=null] : iv_ruleContributionChange= ruleContributionChange EOF ;
    public final EObject entryRuleContributionChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionChange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4987:2: (iv_ruleContributionChange= ruleContributionChange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4988:2: iv_ruleContributionChange= ruleContributionChange EOF
            {
             newCompositeNode(grammarAccess.getContributionChangeRule()); 
            pushFollow(FOLLOW_ruleContributionChange_in_entryRuleContributionChange12190);
            iv_ruleContributionChange=ruleContributionChange();

            state._fsp--;

             current =iv_ruleContributionChange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionChange12200); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4995:1: ruleContributionChange returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_QUALITATIVEVALUE ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4998:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_QUALITATIVEVALUE ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4999:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_QUALITATIVEVALUE ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4999:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_QUALITATIVEVALUE ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4999:2: ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_QUALITATIVEVALUE ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4999:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5000:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5000:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5001:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionChangeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionChangeAccess().getContributionContributionEndCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionChange12248);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleContributionChange12260); 

                	newLeafNode(otherlv_1, grammarAccess.getContributionChangeAccess().getColonKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5018:1: ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_QUALITATIVEVALUE ) ) )
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( ((LA82_0>=63 && LA82_0<=69)) ) {
                alt82=1;
            }
            else if ( (LA82_0==RULE_QUALITATIVEVALUE) ) {
                alt82=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }
            switch (alt82) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5018:2: ( (lv_newContribution_2_0= ruleContributionType ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5018:2: ( (lv_newContribution_2_0= ruleContributionType ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5019:1: (lv_newContribution_2_0= ruleContributionType )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5019:1: (lv_newContribution_2_0= ruleContributionType )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5020:3: lv_newContribution_2_0= ruleContributionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getNewContributionContributionTypeEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContributionType_in_ruleContributionChange12282);
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5037:6: ( (lv_newQuantitativeContribution_3_0= RULE_QUALITATIVEVALUE ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5037:6: ( (lv_newQuantitativeContribution_3_0= RULE_QUALITATIVEVALUE ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5038:1: (lv_newQuantitativeContribution_3_0= RULE_QUALITATIVEVALUE )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5038:1: (lv_newQuantitativeContribution_3_0= RULE_QUALITATIVEVALUE )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5039:3: lv_newQuantitativeContribution_3_0= RULE_QUALITATIVEVALUE
                    {
                    lv_newQuantitativeContribution_3_0=(Token)match(input,RULE_QUALITATIVEVALUE,FOLLOW_RULE_QUALITATIVEVALUE_in_ruleContributionChange12305); 

                    			newLeafNode(lv_newQuantitativeContribution_3_0, grammarAccess.getContributionChangeAccess().getNewQuantitativeContributionQUALITATIVEVALUETerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContributionChangeRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"newQuantitativeContribution",
                            		lv_newQuantitativeContribution_3_0, 
                            		"QUALITATIVEVALUE");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5055:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==17) ) {
                alt83=1;
            }
            else if ( (LA83_0==14) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5055:5: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleContributionChange12324); 

                        	newLeafNode(otherlv_4, grammarAccess.getContributionChangeAccess().getSemicolonKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5060:6: (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5060:6: (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5060:8: otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleContributionChange12343); 

                        	newLeafNode(otherlv_5, grammarAccess.getContributionChangeAccess().getLeftCurlyBracketKeyword_3_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5064:1: ( (lv_contribRange_6_0= ruleContributionRange ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5065:1: (lv_contribRange_6_0= ruleContributionRange )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5065:1: (lv_contribRange_6_0= ruleContributionRange )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5066:3: lv_contribRange_6_0= ruleContributionRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getContribRangeContributionRangeParserRuleCall_3_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContributionRange_in_ruleContributionChange12364);
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

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleContributionChange12376); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5094:1: entryRuleContributionRange returns [EObject current=null] : iv_ruleContributionRange= ruleContributionRange EOF ;
    public final EObject entryRuleContributionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5095:2: (iv_ruleContributionRange= ruleContributionRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5096:2: iv_ruleContributionRange= ruleContributionRange EOF
            {
             newCompositeNode(grammarAccess.getContributionRangeRule()); 
            pushFollow(FOLLOW_ruleContributionRange_in_entryRuleContributionRange12414);
            iv_ruleContributionRange=ruleContributionRange();

            state._fsp--;

             current =iv_ruleContributionRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionRange12424); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5103:1: ruleContributionRange returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5106:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5107:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5107:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5109:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5109:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5110:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5113:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5114:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5114:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+
            int cnt84=0;
            loop84:
            do {
                int alt84=4;
                int LA84_0 = input.LA(1);

                if ( LA84_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0) ) {
                    alt84=1;
                }
                else if ( LA84_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1) ) {
                    alt84=2;
                }
                else if ( LA84_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2) ) {
                    alt84=3;
                }


                switch (alt84) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5116:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5116:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5117:5: {...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5117:112: ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5118:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5121:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5121:7: {...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5121:16: (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5121:18: otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleContributionRange12506); 

            	        	newLeafNode(otherlv_1, grammarAccess.getContributionRangeAccess().getStartKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange12518); 

            	        	newLeafNode(otherlv_2, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5129:1: ( (lv_start_3_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5130:1: (lv_start_3_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5130:1: (lv_start_3_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5131:3: lv_start_3_0= RULE_INT
            	    {
            	    lv_start_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange12535); 

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

            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleContributionRange12552); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5158:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5158:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5159:5: {...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5159:112: ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5160:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5163:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5163:7: {...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5163:16: (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5163:18: otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleContributionRange12620); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContributionRangeAccess().getEndKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange12632); 

            	        	newLeafNode(otherlv_6, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5171:1: ( (lv_end_7_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5172:1: (lv_end_7_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5172:1: (lv_end_7_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5173:3: lv_end_7_0= RULE_INT
            	    {
            	    lv_end_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange12649); 

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

            	    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleContributionRange12666); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5200:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5200:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5201:5: {...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5201:112: ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5202:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5205:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5205:7: {...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5205:16: (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5205:18: otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleContributionRange12734); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContributionRangeAccess().getStepKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange12746); 

            	        	newLeafNode(otherlv_10, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5213:1: ( (lv_step_11_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5214:1: (lv_step_11_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5214:1: (lv_step_11_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5215:3: lv_step_11_0= RULE_INT
            	    {
            	    lv_step_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange12763); 

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

            	    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleContributionRange12780); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt84 >= 1 ) break loop84;
                        EarlyExitException eee =
                            new EarlyExitException(84, input);
                        throw eee;
                }
                cnt84++;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5258:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5259:2: (iv_ruleMetadata= ruleMetadata EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5260:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_ruleMetadata_in_entryRuleMetadata12862);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadata12872); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5267:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5270:28: ( (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5271:1: (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5271:1: (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5271:3: otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleMetadata12909); 

                	newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getMetadataKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5275:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5276:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5276:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5277:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetadata12926); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleMetadata12943); 

                	newLeafNode(otherlv_2, grammarAccess.getMetadataAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5297:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5298:1: (lv_value_3_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5298:1: (lv_value_3_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5299:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata12960); 

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

            otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleMetadata12977); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5327:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5328:2: (iv_ruleComment= ruleComment EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5329:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment13013);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment13023); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5336:1: ruleComment returns [EObject current=null] : (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5339:28: ( (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5340:1: (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5340:1: (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5340:3: otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleComment13060); 

                	newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getCommentKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5344:1: ( (lv_content_1_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5345:1: (lv_content_1_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5345:1: (lv_content_1_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5346:3: lv_content_1_0= RULE_STRING
            {
            lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComment13077); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleComment13094); 

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


    // $ANTLR start "entryRuleIndicatorGroup"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5374:1: entryRuleIndicatorGroup returns [EObject current=null] : iv_ruleIndicatorGroup= ruleIndicatorGroup EOF ;
    public final EObject entryRuleIndicatorGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicatorGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5375:2: (iv_ruleIndicatorGroup= ruleIndicatorGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5376:2: iv_ruleIndicatorGroup= ruleIndicatorGroup EOF
            {
             newCompositeNode(grammarAccess.getIndicatorGroupRule()); 
            pushFollow(FOLLOW_ruleIndicatorGroup_in_entryRuleIndicatorGroup13130);
            iv_ruleIndicatorGroup=ruleIndicatorGroup();

            state._fsp--;

             current =iv_ruleIndicatorGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndicatorGroup13140); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5383:1: ruleIndicatorGroup returns [EObject current=null] : (otherlv_0= 'indicatorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleIndicatorGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5386:28: ( (otherlv_0= 'indicatorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5387:1: (otherlv_0= 'indicatorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5387:1: (otherlv_0= 'indicatorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5387:3: otherlv_0= 'indicatorGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleIndicatorGroup13177); 

                	newLeafNode(otherlv_0, grammarAccess.getIndicatorGroupAccess().getIndicatorGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5391:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5392:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5392:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5393:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicatorGroup13194); 

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

            otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleIndicatorGroup13211); 

                	newLeafNode(otherlv_2, grammarAccess.getIndicatorGroupAccess().getIncludesKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5413:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5414:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5414:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5415:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getIndicatorGroupRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getIndicatorGroupAccess().getIndicatorsIndicatorCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleIndicatorGroup13234);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5428:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==29) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5428:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleIndicatorGroup13247); 

            	        	newLeafNode(otherlv_4, grammarAccess.getIndicatorGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5432:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5433:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5433:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5434:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorGroupRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getIndicatorGroupAccess().getIndicatorsIndicatorCrossReference_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleIndicatorGroup13270);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop85;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_17_in_ruleIndicatorGroup13284); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5459:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5460:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5461:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13321);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName13332); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5468:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5471:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5472:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5472:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5472:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13372); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5479:1: (kw= '.' this_ID_2= RULE_ID )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==55) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5480:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,55,FOLLOW_55_in_ruleQualifiedName13391); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13406); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop86;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5500:1: ruleImportanceType returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) ;
    public final Enumerator ruleImportanceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5502:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5503:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5503:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            int alt87=4;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt87=1;
                }
                break;
            case 57:
                {
                alt87=2;
                }
                break;
            case 58:
                {
                alt87=3;
                }
                break;
            case 59:
                {
                alt87=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5503:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5503:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5503:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_56_in_ruleImportanceType13467); 

                            current = grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5509:6: (enumLiteral_1= 'high' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5509:6: (enumLiteral_1= 'high' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5509:8: enumLiteral_1= 'high'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_57_in_ruleImportanceType13484); 

                            current = grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5515:6: (enumLiteral_2= 'medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5515:6: (enumLiteral_2= 'medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5515:8: enumLiteral_2= 'medium'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_58_in_ruleImportanceType13501); 

                            current = grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5521:6: (enumLiteral_3= 'low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5521:6: (enumLiteral_3= 'low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5521:8: enumLiteral_3= 'low'
                    {
                    enumLiteral_3=(Token)match(input,59,FOLLOW_59_in_ruleImportanceType13518); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5531:1: ruleDecompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) ;
    public final Enumerator ruleDecompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5533:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5534:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5534:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            int alt88=3;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt88=1;
                }
                break;
            case 61:
                {
                alt88=2;
                }
                break;
            case 62:
                {
                alt88=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5534:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5534:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5534:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_60_in_ruleDecompositionType13563); 

                            current = grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5540:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5540:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5540:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_61_in_ruleDecompositionType13580); 

                            current = grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5546:6: (enumLiteral_2= 'xor' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5546:6: (enumLiteral_2= 'xor' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5546:8: enumLiteral_2= 'xor'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_62_in_ruleDecompositionType13597); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5556:1: ruleContributionType returns [Enumerator current=null] : ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5558:28: ( ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5559:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5559:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            int alt89=7;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt89=1;
                }
                break;
            case 64:
                {
                alt89=2;
                }
                break;
            case 65:
                {
                alt89=3;
                }
                break;
            case 66:
                {
                alt89=4;
                }
                break;
            case 67:
                {
                alt89=5;
                }
                break;
            case 68:
                {
                alt89=6;
                }
                break;
            case 69:
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5559:2: (enumLiteral_0= 'help' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5559:2: (enumLiteral_0= 'help' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5559:4: enumLiteral_0= 'help'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_63_in_ruleContributionType13642); 

                            current = grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5565:6: (enumLiteral_1= 'make' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5565:6: (enumLiteral_1= 'make' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5565:8: enumLiteral_1= 'make'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleContributionType13659); 

                            current = grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5571:6: (enumLiteral_2= 'somePositive' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5571:6: (enumLiteral_2= 'somePositive' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5571:8: enumLiteral_2= 'somePositive'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_65_in_ruleContributionType13676); 

                            current = grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5577:6: (enumLiteral_3= 'unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5577:6: (enumLiteral_3= 'unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5577:8: enumLiteral_3= 'unknown'
                    {
                    enumLiteral_3=(Token)match(input,66,FOLLOW_66_in_ruleContributionType13693); 

                            current = grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5583:6: (enumLiteral_4= 'someNegative' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5583:6: (enumLiteral_4= 'someNegative' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5583:8: enumLiteral_4= 'someNegative'
                    {
                    enumLiteral_4=(Token)match(input,67,FOLLOW_67_in_ruleContributionType13710); 

                            current = grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5589:6: (enumLiteral_5= 'hurt' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5589:6: (enumLiteral_5= 'hurt' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5589:8: enumLiteral_5= 'hurt'
                    {
                    enumLiteral_5=(Token)match(input,68,FOLLOW_68_in_ruleContributionType13727); 

                            current = grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5595:6: (enumLiteral_6= 'break' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5595:6: (enumLiteral_6= 'break' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5595:8: enumLiteral_6= 'break'
                    {
                    enumLiteral_6=(Token)match(input,69,FOLLOW_69_in_ruleContributionType13744); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5605:1: ruleQualitativeLabel returns [Enumerator current=null] : ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5607:28: ( ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5608:1: ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5608:1: ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) )
            int alt90=7;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt90=1;
                }
                break;
            case 71:
                {
                alt90=2;
                }
                break;
            case 72:
                {
                alt90=3;
                }
                break;
            case 73:
                {
                alt90=4;
                }
                break;
            case 74:
                {
                alt90=5;
                }
                break;
            case 66:
                {
                alt90=6;
                }
                break;
            case 56:
                {
                alt90=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5608:2: (enumLiteral_0= 'denied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5608:2: (enumLiteral_0= 'denied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5608:4: enumLiteral_0= 'denied'
                    {
                    enumLiteral_0=(Token)match(input,70,FOLLOW_70_in_ruleQualitativeLabel13789); 

                            current = grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5614:6: (enumLiteral_1= 'weaklyDenied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5614:6: (enumLiteral_1= 'weaklyDenied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5614:8: enumLiteral_1= 'weaklyDenied'
                    {
                    enumLiteral_1=(Token)match(input,71,FOLLOW_71_in_ruleQualitativeLabel13806); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5620:6: (enumLiteral_2= 'weaklySatisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5620:6: (enumLiteral_2= 'weaklySatisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5620:8: enumLiteral_2= 'weaklySatisfied'
                    {
                    enumLiteral_2=(Token)match(input,72,FOLLOW_72_in_ruleQualitativeLabel13823); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5626:6: (enumLiteral_3= 'satisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5626:6: (enumLiteral_3= 'satisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5626:8: enumLiteral_3= 'satisfied'
                    {
                    enumLiteral_3=(Token)match(input,73,FOLLOW_73_in_ruleQualitativeLabel13840); 

                            current = grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5632:6: (enumLiteral_4= 'conflict' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5632:6: (enumLiteral_4= 'conflict' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5632:8: enumLiteral_4= 'conflict'
                    {
                    enumLiteral_4=(Token)match(input,74,FOLLOW_74_in_ruleQualitativeLabel13857); 

                            current = grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5638:6: (enumLiteral_5= 'unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5638:6: (enumLiteral_5= 'unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5638:8: enumLiteral_5= 'unknown'
                    {
                    enumLiteral_5=(Token)match(input,66,FOLLOW_66_in_ruleQualitativeLabel13874); 

                            current = grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5644:6: (enumLiteral_6= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5644:6: (enumLiteral_6= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5644:8: enumLiteral_6= 'none'
                    {
                    enumLiteral_6=(Token)match(input,56,FOLLOW_56_in_ruleQualitativeLabel13891); 

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


    // $ANTLR start "ruleBoolean"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5660:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5662:28: ( ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5663:1: ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5663:1: ( (enumLiteral_0= 'false' ) | (enumLiteral_1= 'true' ) )
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==75) ) {
                alt91=1;
            }
            else if ( (LA91_0==76) ) {
                alt91=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }
            switch (alt91) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5663:2: (enumLiteral_0= 'false' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5663:2: (enumLiteral_0= 'false' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5663:4: enumLiteral_0= 'false'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_75_in_ruleBoolean13942); 

                            current = grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getFalseEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5669:6: (enumLiteral_1= 'true' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5669:6: (enumLiteral_1= 'true' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5669:8: enumLiteral_1= 'true'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_76_in_ruleBoolean13959); 

                            current = grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().getTrueEnumLiteralDeclaration_1()); 
                        

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
    // $ANTLR end "ruleBoolean"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA42 dfa42 = new DFA42(this);
    protected DFA71 dfa71 = new DFA71(this);
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
            "\1\2\1\3\12\uffff\1\1\5\uffff\1\1\1\uffff\5\1\1\uffff\3\4\2"+
            "\1\1\uffff\1\1\13\uffff\3\1\1\uffff\3\1",
            "",
            "\1\6\16\uffff\1\1\12\uffff\3\1\26\uffff\1\5",
            "",
            "",
            "\1\7",
            "\1\1\14\uffff\1\4\13\uffff\1\4\31\uffff\1\10",
            "\1\6\16\uffff\1\1\12\uffff\3\1\26\uffff\1\5",
            "\1\11",
            "\1\1\14\uffff\1\4\13\uffff\1\4\31\uffff\1\10"
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
            return "122:1: (this_GRLElement_0= ruleGRLElement | this_Mapping_1= ruleMapping | this_InLineElementLink_2= ruleInLineElementLink )";
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
            "\1\2\13\uffff\1\3\5\uffff\1\1\1\uffff\5\1\4\uffff\1\14\1\4"+
            "\1\uffff\1\6\13\uffff\1\11\1\7\1\10\1\uffff\1\12\1\13\1\5",
            "",
            "\1\16\16\uffff\1\17\12\uffff\3\16\26\uffff\1\15",
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
            "\1\16\16\uffff\1\17\12\uffff\3\16\26\uffff\1\15"
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
            return "172:1: (this_SuperIntentionalElement_0= ruleSuperIntentionalElement | this_NormalElementLink_1= ruleNormalElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_IndicatorGroup_4= ruleIndicatorGroup | this_EvaluationStrategy_5= ruleEvaluationStrategy | this_Evaluation_6= ruleEvaluation | this_ContributionGroup_7= ruleContributionGroup | this_ContributionContext_8= ruleContributionContext | this_QualitativeMapping_9= ruleQualitativeMapping | this_Metadata_10= ruleMetadata | this_Comment_11= ruleComment | this_LinkType_12= ruleLinkType )";
        }
    }
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\4\1\uffff\7\0\1\uffff";
    static final String DFA11_maxS =
        "\1\64\1\uffff\7\0\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA11_specialS =
        "\2\uffff\1\0\1\1\1\5\1\2\1\6\1\3\1\4\1\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\10\12\uffff\1\1\2\uffff\1\1\1\uffff\2\1\1\2\1\uffff\1\3"+
            "\1\4\1\5\1\6\1\7\27\uffff\1\1",
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()+ loopback of 727:6: ({...}? => ( ( (lv_elemets_19_0= ruleSuperIntentionalElement ) ) | ( (lv_elemets_20_0= ruleNormalElementLink ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA42_eotS =
        "\10\uffff";
    static final String DFA42_eofS =
        "\10\uffff";
    static final String DFA42_minS =
        "\3\4\4\uffff\1\4";
    static final String DFA42_maxS =
        "\1\4\1\67\1\4\4\uffff\1\67";
    static final String DFA42_acceptS =
        "\3\uffff\1\1\1\4\1\3\1\2\1\uffff";
    static final String DFA42_specialS =
        "\10\uffff}>";
    static final String[] DFA42_transitionS = {
            "\1\1",
            "\1\4\31\uffff\1\5\1\6\1\3\26\uffff\1\2",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\4\31\uffff\1\5\1\6\1\3\26\uffff\1\2"
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "2588:1: (this_NormalDecomposition_0= ruleNormalDecomposition | this_NormalContribution_1= ruleNormalContribution | this_NormalDependency_2= ruleNormalDependency | this_NormalLink_3= ruleNormalLink )";
        }
    }
    static final String DFA71_eotS =
        "\14\uffff";
    static final String DFA71_eofS =
        "\1\1\13\uffff";
    static final String DFA71_minS =
        "\1\17\1\uffff\5\0\5\uffff";
    static final String DFA71_maxS =
        "\1\57\1\uffff\5\0\5\uffff";
    static final String DFA71_acceptS =
        "\1\uffff\1\6\5\uffff\1\1\1\2\1\3\1\4\1\5";
    static final String DFA71_specialS =
        "\2\uffff\1\0\1\1\1\2\1\3\1\4\5\uffff}>";
    static final String[] DFA71_transitionS = {
            "\1\1\26\uffff\2\1\2\uffff\1\2\1\3\1\4\1\5\1\6\1\1",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA71_eot = DFA.unpackEncodedString(DFA71_eotS);
    static final short[] DFA71_eof = DFA.unpackEncodedString(DFA71_eofS);
    static final char[] DFA71_min = DFA.unpackEncodedStringToUnsignedChars(DFA71_minS);
    static final char[] DFA71_max = DFA.unpackEncodedStringToUnsignedChars(DFA71_maxS);
    static final short[] DFA71_accept = DFA.unpackEncodedString(DFA71_acceptS);
    static final short[] DFA71_special = DFA.unpackEncodedString(DFA71_specialS);
    static final short[][] DFA71_transition;

    static {
        int numStates = DFA71_transitionS.length;
        DFA71_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA71_transition[i] = DFA.unpackEncodedString(DFA71_transitionS[i]);
        }
    }

    class DFA71 extends DFA {

        public DFA71(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 71;
            this.eot = DFA71_eot;
            this.eof = DFA71_eof;
            this.min = DFA71_min;
            this.max = DFA71_max;
            this.accept = DFA71_accept;
            this.special = DFA71_special;
            this.transition = DFA71_transition;
        }
        public String getDescription() {
            return "()+ loopback of 4228:3: ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA71_2 = input.LA(1);

                         
                        int index71_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0) ) {s = 7;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index71_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA71_3 = input.LA(1);

                         
                        int index71_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1) ) {s = 8;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index71_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA71_4 = input.LA(1);

                         
                        int index71_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2) ) {s = 9;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index71_4);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA71_5 = input.LA(1);

                         
                        int index71_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3) ) {s = 10;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index71_5);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA71_6 = input.LA(1);

                         
                        int index71_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4) ) {s = 11;}

                        else if ( getUnorderedGroupHelper().canLeave(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup()) ) {s = 1;}

                         
                        input.seek(index71_6);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 71, _s, input);
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
    public static final BitSet FOLLOW_ruleMapping_in_ruleGRLBaseElement252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleGRLBaseElement279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRLElement_in_entryRuleGRLElement314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRLElement324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSuperIntentionalElement_in_ruleGRLElement371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalElementLink_in_ruleGRLElement398 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleSuperIntentionalElement_in_entryRuleSuperIntentionalElement730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSuperIntentionalElement740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleSuperIntentionalElement787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_ruleSuperIntentionalElement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntentionalElement859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_ruleIntentionalElement906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleIntentionalElement933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleIntentionalElement960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleIntentionalElement987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicator_in_ruleIntentionalElement1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRLSpecification_in_entryRuleGRLSpecification1049 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRLSpecification1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGRLSpecification1105 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGRLSpecification1122 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGRLSpecification1140 = new BitSet(new long[]{0x007700161F418010L});
    public static final BitSet FOLLOW_ruleGRLElement_in_ruleGRLSpecification1161 = new BitSet(new long[]{0x007700161F418010L});
    public static final BitSet FOLLOW_15_in_ruleGRLSpecification1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor1210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor1220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleActor1257 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor1274 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleActor1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleActor1311 = new BitSet(new long[]{0x001000001F748010L});
    public static final BitSet FOLLOW_18_in_ruleActor1369 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1381 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1398 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleActor1415 = new BitSet(new long[]{0x001000001F748010L});
    public static final BitSet FOLLOW_20_in_ruleActor1483 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1495 = new BitSet(new long[]{0x0F00000000000040L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleActor1517 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_QUALITATIVEVALUE_in_ruleActor1540 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleActor1558 = new BitSet(new long[]{0x001000001F748010L});
    public static final BitSet FOLLOW_21_in_ruleActor1626 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1638 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1655 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleActor1672 = new BitSet(new long[]{0x001000001F748010L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleActor1748 = new BitSet(new long[]{0x001000001F748010L});
    public static final BitSet FOLLOW_ruleSuperIntentionalElement_in_ruleActor1825 = new BitSet(new long[]{0x001000001F748010L});
    public static final BitSet FOLLOW_ruleNormalElementLink_in_ruleActor1852 = new BitSet(new long[]{0x001000001F748010L});
    public static final BitSet FOLLOW_15_in_ruleActor1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal1944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal1954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSoftgoal1991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftgoal2008 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleSoftgoal2045 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2103 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2115 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal2132 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2149 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_21_in_ruleSoftgoal2217 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2229 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal2246 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2263 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_23_in_ruleSoftgoal2331 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2343 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleSoftgoal2364 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2376 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_20_in_ruleSoftgoal2444 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2456 = new BitSet(new long[]{0x0F00000000000040L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleSoftgoal2478 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_QUALITATIVEVALUE_in_ruleSoftgoal2501 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2519 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleSoftgoal2595 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleSoftgoal2671 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_15_in_ruleSoftgoal2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal2762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal2772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGoal2809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal2826 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleGoal2844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleGoal2863 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_18_in_ruleGoal2921 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal2933 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal2950 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGoal2967 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_21_in_ruleGoal3035 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3047 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3064 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGoal3081 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_23_in_ruleGoal3149 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3161 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleGoal3182 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGoal3194 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_20_in_ruleGoal3262 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3274 = new BitSet(new long[]{0x0F00000000000040L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleGoal3296 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_QUALITATIVEVALUE_in_ruleGoal3319 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGoal3337 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleGoal3413 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleGoal3489 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_15_in_ruleGoal3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask3580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTask3627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask3644 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleTask3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTask3681 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_18_in_ruleTask3739 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3751 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask3768 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTask3785 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_21_in_ruleTask3853 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask3882 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTask3899 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_23_in_ruleTask3967 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3979 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleTask4000 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTask4012 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_20_in_ruleTask4080 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4092 = new BitSet(new long[]{0x0F00000000000040L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleTask4114 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_QUALITATIVEVALUE_in_ruleTask4137 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTask4155 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleTask4231 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleTask4307 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_15_in_ruleTask4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource4398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleResource4445 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource4462 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleResource4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleResource4499 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_18_in_ruleResource4557 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4569 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource4586 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource4603 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_21_in_ruleResource4671 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4683 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource4700 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource4717 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_23_in_ruleResource4785 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4797 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleResource4818 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource4830 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_20_in_ruleResource4898 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4910 = new BitSet(new long[]{0x0F00000000000040L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleResource4932 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_QUALITATIVEVALUE_in_ruleResource4955 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleResource4973 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleResource5049 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleResource5125 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_15_in_ruleResource5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicator_in_entryRuleIndicator5216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndicator5226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleIndicator5263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator5280 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleIndicator5298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleIndicator5317 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5375 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5387 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator5404 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIndicator5421 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_21_in_ruleIndicator5489 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5501 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator5518 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIndicator5535 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_23_in_ruleIndicator5603 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5615 = new BitSet(new long[]{0x7000000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleIndicator5636 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIndicator5648 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_20_in_ruleIndicator5716 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5728 = new BitSet(new long[]{0x0F00000000000040L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleIndicator5750 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_QUALITATIVEVALUE_in_ruleIndicator5773 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIndicator5791 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleIndicator5867 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleIndicator5943 = new BitSet(new long[]{0x00100001C0B48010L});
    public static final BitSet FOLLOW_15_in_ruleIndicator5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief6034 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief6044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBelief6081 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBelief6098 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleBelief6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBelief6135 = new BitSet(new long[]{0x0010000000248000L});
    public static final BitSet FOLLOW_18_in_ruleBelief6193 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBelief6205 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelief6222 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBelief6239 = new BitSet(new long[]{0x0010000000248000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleBelief6315 = new BitSet(new long[]{0x0010000000248000L});
    public static final BitSet FOLLOW_21_in_ruleBelief6383 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBelief6395 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelief6412 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBelief6429 = new BitSet(new long[]{0x0010000000248000L});
    public static final BitSet FOLLOW_15_in_ruleBelief6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalElementLink_in_entryRuleNormalElementLink6524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalElementLink6534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalDecomposition_in_ruleNormalElementLink6581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalContribution_in_ruleNormalElementLink6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalDependency_in_ruleNormalElementLink6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalLink_in_ruleNormalElementLink6662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalLink_in_entryRuleNormalLink6697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalLink6707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNormalLink6755 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNormalLink6778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNormalLink6801 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleNormalLink6814 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNormalLink6837 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_17_in_ruleNormalLink6851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalDependency_in_entryRuleNormalDependency6887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalDependency6897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNormalDependency6945 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleNormalDependency6957 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleNormalDependency6978 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleNormalDependency6991 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleNormalDependency7012 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_17_in_ruleNormalDependency7026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalContribution_in_entryRuleNormalContribution7062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalContribution7072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNormalContribution7120 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleNormalContribution7132 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleNormalContribution7153 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleNormalContribution7166 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleNormalContribution7187 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_17_in_ruleNormalContribution7201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNormalDecomposition_in_entryRuleNormalDecomposition7237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNormalDecomposition7247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleNormalDecomposition7295 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleNormalDecomposition7307 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleNormalDecomposition7328 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleNormalDecomposition7341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleNormalDecomposition7362 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_17_in_ruleNormalDecomposition7376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_entryRuleInLineElementLink7412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineElementLink7422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDecomposition_in_ruleInLineElementLink7469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineContribution_in_ruleInLineElementLink7496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDependency_in_ruleInLineElementLink7523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineLink_in_ruleInLineElementLink7550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineLink_in_entryRuleInLineLink7585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineLink7595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInLineLink7643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInLineLink7666 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleInLineLink7679 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInLineLink7702 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_17_in_ruleInLineLink7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDependency_in_entryRuleInLineDependency7752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineDependency7762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleInLineDependency7799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7820 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleInLineDependency7833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7854 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_17_in_ruleInLineDependency7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineContribution_in_entryRuleInLineContribution7904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineContribution7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInLineContribution7951 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleInLineContribution7972 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleInLineContribution7985 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleInLineContribution8006 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_17_in_ruleInLineContribution8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDecomposition_in_entryRuleInLineDecomposition8056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineDecomposition8066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInLineDecomposition8103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition8124 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleInLineDecomposition8137 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition8158 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_17_in_ruleInLineDecomposition8172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_entryRuleDecompositionEnd8208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecompositionEnd8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecompositionEnd8275 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDecompositionEnd8288 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecompositionEnd8305 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDecompositionEnd8323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_entryRuleContributionEnd8361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionEnd8371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionEnd8422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionEnd8451 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleContributionEnd8464 = new BitSet(new long[]{0x8000000000008040L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionEnd8486 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_QUALITATIVEVALUE_in_ruleContributionEnd8509 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionEnd8528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_entryRuleDependencyEnd8566 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyEnd8576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependencyEnd8633 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDependencyEnd8646 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependencyEnd8663 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDependencyEnd8681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_entryRuleLinkType8719 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkType8729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleLinkType8766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkType8783 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleLinkType8800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategyGroup_in_entryRuleStrategyGroup8836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrategyGroup8846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStrategyGroup8883 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStrategyGroup8900 = new BitSet(new long[]{0x0000000800020000L});
    public static final BitSet FOLLOW_35_in_ruleStrategyGroup8918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8941 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleStrategyGroup8954 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8977 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_17_in_ruleStrategyGroup8993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationStrategy_in_entryRuleEvaluationStrategy9029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationStrategy9039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEvaluationStrategy9076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvaluationStrategy9093 = new BitSet(new long[]{0x0000002000024000L});
    public static final BitSet FOLLOW_37_in_ruleEvaluationStrategy9111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy9134 = new BitSet(new long[]{0x0000000020024000L});
    public static final BitSet FOLLOW_29_in_ruleEvaluationStrategy9147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy9170 = new BitSet(new long[]{0x0000000020024000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluationStrategy9188 = new BitSet(new long[]{0x0010000000008010L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleEvaluationStrategy9254 = new BitSet(new long[]{0x0010000000008010L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleEvaluationStrategy9330 = new BitSet(new long[]{0x0010000000008010L});
    public static final BitSet FOLLOW_15_in_ruleEvaluationStrategy9383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEvaluationStrategy9402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation9439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation9449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluation9497 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation9509 = new BitSet(new long[]{0x0100000000000040L,0x00000000000007C4L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleEvaluation9531 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_RULE_QUALITATIVEVALUE_in_ruleEvaluation9554 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluation9574 = new BitSet(new long[]{0x0000FCC000008000L});
    public static final BitSet FOLLOW_38_in_ruleEvaluation9638 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEvaluation9663 = new BitSet(new long[]{0x0000FCC000008000L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_ruleEvaluation9739 = new BitSet(new long[]{0x0000FCC000008000L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation9814 = new BitSet(new long[]{0x0000FCC000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvaluation9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEvaluation9885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange9922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationRange9932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEvaluationRange9970 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange9982 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_QUALITATIVEVALUE_in_ruleEvaluationRange9999 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEvaluationRange10016 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleEvaluationRange10030 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange10042 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_QUALITATIVEVALUE_in_ruleEvaluationRange10059 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEvaluationRange10076 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleEvaluationRange10090 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange10102 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_QUALITATIVEVALUE_in_ruleEvaluationRange10119 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEvaluationRange10136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet10173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIEvalValueSet10183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQuantitativeEvalValueSet_in_ruleKPIEvalValueSet10230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQualitativeEvalValueSet_in_ruleKPIEvalValueSet10257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQuantitativeEvalValueSet_in_entryRuleKPIQuantitativeEvalValueSet10292 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIQuantitativeEvalValueSet10302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleKPIQuantitativeEvalValueSet10384 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10396 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10413 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10430 = new BitSet(new long[]{0x00007C0000000002L});
    public static final BitSet FOLLOW_43_in_ruleKPIQuantitativeEvalValueSet10498 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10510 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10527 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10544 = new BitSet(new long[]{0x00007C0000000002L});
    public static final BitSet FOLLOW_44_in_ruleKPIQuantitativeEvalValueSet10612 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10624 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10641 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10658 = new BitSet(new long[]{0x00007C0000000002L});
    public static final BitSet FOLLOW_45_in_ruleKPIQuantitativeEvalValueSet10726 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10738 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10755 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10772 = new BitSet(new long[]{0x00007C0000000002L});
    public static final BitSet FOLLOW_46_in_ruleKPIQuantitativeEvalValueSet10840 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10852 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKPIQuantitativeEvalValueSet10869 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKPIQuantitativeEvalValueSet10886 = new BitSet(new long[]{0x00007C0000000002L});
    public static final BitSet FOLLOW_ruleKPIQualitativeEvalValueSet_in_entryRuleKPIQualitativeEvalValueSet10968 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIQualitativeEvalValueSet10978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleKPIQualitativeEvalValueSet11015 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQualitativeEvalValueSet11027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleKPIQualitativeEvalValueSet11050 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleKPIQualitativeEvalValueSet11062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping11098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitativeMapping11108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleQualitativeMapping11145 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeMapping11162 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualitativeMapping11179 = new BitSet(new long[]{0x0010000000008020L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleQualitativeMapping11245 = new BitSet(new long[]{0x0010000000008020L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleQualitativeMapping11321 = new BitSet(new long[]{0x0010000000008020L});
    public static final BitSet FOLLOW_15_in_ruleQualitativeMapping11374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping11410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping11420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMapping11462 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMapping11479 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_QUALITATIVEVALUE_in_ruleMapping11496 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMapping11513 = new BitSet(new long[]{0x0100000000000000L,0x00000000000007C4L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleMapping11534 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleMapping11547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleBoolean_in_ruleMapping11568 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMapping11582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionGroup_in_entryRuleContributionGroup11618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionGroup11628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleContributionGroup11665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup11682 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleContributionGroup11699 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup11719 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleContributionGroup11732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup11752 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_17_in_ruleContributionGroup11766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionContext_in_entryRuleContributionContext11802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionContext11812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleContributionContext11849 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionContext11866 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_37_in_ruleContributionContext11884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionContext11907 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_29_in_ruleContributionContext11920 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionContext11943 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionContext11959 = new BitSet(new long[]{0x0010000000008010L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleContributionContext12025 = new BitSet(new long[]{0x0010000000008010L});
    public static final BitSet FOLLOW_ruleContributionChange_in_ruleContributionContext12101 = new BitSet(new long[]{0x0010000000008010L});
    public static final BitSet FOLLOW_15_in_ruleContributionContext12154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionChange_in_entryRuleContributionChange12190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionChange12200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionChange12248 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleContributionChange12260 = new BitSet(new long[]{0x8000000000000040L,0x000000000000003FL});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionChange12282 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_RULE_QUALITATIVEVALUE_in_ruleContributionChange12305 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_17_in_ruleContributionChange12324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleContributionChange12343 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_ruleContributionRange_in_ruleContributionChange12364 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionChange12376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionRange_in_entryRuleContributionRange12414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionRange12424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleContributionRange12506 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange12518 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange12535 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleContributionRange12552 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_40_in_ruleContributionRange12620 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange12632 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange12649 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleContributionRange12666 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_41_in_ruleContributionRange12734 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange12746 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange12763 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleContributionRange12780 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_entryRuleMetadata12862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadata12872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleMetadata12909 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetadata12926 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMetadata12943 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata12960 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMetadata12977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment13013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment13023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleComment13060 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComment13077 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleComment13094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicatorGroup_in_entryRuleIndicatorGroup13130 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndicatorGroup13140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleIndicatorGroup13177 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicatorGroup13194 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleIndicatorGroup13211 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleIndicatorGroup13234 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_29_in_ruleIndicatorGroup13247 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleIndicatorGroup13270 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_17_in_ruleIndicatorGroup13284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName13332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13372 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_ruleQualifiedName13391 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13406 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_56_in_ruleImportanceType13467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleImportanceType13484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleImportanceType13501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleImportanceType13518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDecompositionType13563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDecompositionType13580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleDecompositionType13597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleContributionType13642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleContributionType13659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleContributionType13676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleContributionType13693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleContributionType13710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleContributionType13727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleContributionType13744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleQualitativeLabel13789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleQualitativeLabel13806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleQualitativeLabel13823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleQualitativeLabel13840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleQualitativeLabel13857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleQualitativeLabel13874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleQualitativeLabel13891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleBoolean13942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleBoolean13959 = new BitSet(new long[]{0x0000000000000002L});

}
