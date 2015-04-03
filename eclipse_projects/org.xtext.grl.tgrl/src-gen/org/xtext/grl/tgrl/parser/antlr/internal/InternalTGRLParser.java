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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grl'", "'{'", "'}'", "'actor'", "'name'", "'='", "';'", "'description'", "'color'", "'softGoal'", "'decompositionType'", "'goal'", "'Task'", "'resource'", "'indicator'", "'belief'", "'decomposedBy'", "','", "'contributeTo'", "'dependOn'", "'strategyGroup'", "'includes'", "'strategy'", "'extends'", "'exceeds'", "'start'", "'end'", "'step'", "'target'", "'threshold'", "'worst'", "'eval'", "'unit'", "'qualeval'", "'qualitativeMapping'", "'contributionGroup'", "'contribution'", "':'", "'metadata'", "'comment'", "'link'", "'.'", "'none'", "'high'", "'medium'", "'low'", "'and'", "'or'", "'xor'", "'help'", "'make'", "'somePositive'", "'unknown'", "'someNegative'", "'hurt'", "'break'", "'denied'", "'weaklyDenied'", "'weaklySatisfied'", "'satisfied'", "'conflict'", "'white'", "'black'", "'blue'", "'green'", "'cyan'", "'red'", "'purple'", "'yellow'", "'gray'", "'lightGray'", "'lightBlue'", "'lightGreen'", "'lightCray'", "'lightRed'", "'lightPurple'", "'lightYellow'"
    };
    public static final int T__50=50;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:168:1: ruleGRLElement returns [EObject current=null] : (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_EvaluationStrategy_4= ruleEvaluationStrategy | this_Evaluation_5= ruleEvaluation | this_ContributionGroup_6= ruleContributionGroup | this_ContributionContext_7= ruleContributionContext | this_QualitativeMapping_8= ruleQualitativeMapping | this_Metadata_9= ruleMetadata | this_Comment_10= ruleComment | this_LinkType_11= ruleLinkType ) ;
    public final EObject ruleGRLElement() throws RecognitionException {
        EObject current = null;

        EObject this_IntentionalElement_0 = null;

        EObject this_ElementLink_1 = null;

        EObject this_Actor_2 = null;

        EObject this_StrategyGroup_3 = null;

        EObject this_EvaluationStrategy_4 = null;

        EObject this_Evaluation_5 = null;

        EObject this_ContributionGroup_6 = null;

        EObject this_ContributionContext_7 = null;

        EObject this_QualitativeMapping_8 = null;

        EObject this_Metadata_9 = null;

        EObject this_Comment_10 = null;

        EObject this_LinkType_11 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:171:28: ( (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_EvaluationStrategy_4= ruleEvaluationStrategy | this_Evaluation_5= ruleEvaluation | this_ContributionGroup_6= ruleContributionGroup | this_ContributionContext_7= ruleContributionContext | this_QualitativeMapping_8= ruleQualitativeMapping | this_Metadata_9= ruleMetadata | this_Comment_10= ruleComment | this_LinkType_11= ruleLinkType ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:172:1: (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_EvaluationStrategy_4= ruleEvaluationStrategy | this_Evaluation_5= ruleEvaluation | this_ContributionGroup_6= ruleContributionGroup | this_ContributionContext_7= ruleContributionContext | this_QualitativeMapping_8= ruleQualitativeMapping | this_Metadata_9= ruleMetadata | this_Comment_10= ruleComment | this_LinkType_11= ruleLinkType )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:172:1: (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_EvaluationStrategy_4= ruleEvaluationStrategy | this_Evaluation_5= ruleEvaluation | this_ContributionGroup_6= ruleContributionGroup | this_ContributionContext_7= ruleContributionContext | this_QualitativeMapping_8= ruleQualitativeMapping | this_Metadata_9= ruleMetadata | this_Comment_10= ruleComment | this_LinkType_11= ruleLinkType )
            int alt3=12;
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:213:5: this_EvaluationStrategy_4= ruleEvaluationStrategy
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getEvaluationStrategyParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleEvaluationStrategy_in_ruleGRLElement479);
                    this_EvaluationStrategy_4=ruleEvaluationStrategy();

                    state._fsp--;

                     
                            current = this_EvaluationStrategy_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:223:5: this_Evaluation_5= ruleEvaluation
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getEvaluationParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleEvaluation_in_ruleGRLElement506);
                    this_Evaluation_5=ruleEvaluation();

                    state._fsp--;

                     
                            current = this_Evaluation_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:233:5: this_ContributionGroup_6= ruleContributionGroup
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getContributionGroupParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleContributionGroup_in_ruleGRLElement533);
                    this_ContributionGroup_6=ruleContributionGroup();

                    state._fsp--;

                     
                            current = this_ContributionGroup_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:243:5: this_ContributionContext_7= ruleContributionContext
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getContributionContextParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleContributionContext_in_ruleGRLElement560);
                    this_ContributionContext_7=ruleContributionContext();

                    state._fsp--;

                     
                            current = this_ContributionContext_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:253:5: this_QualitativeMapping_8= ruleQualitativeMapping
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getQualitativeMappingParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleQualitativeMapping_in_ruleGRLElement587);
                    this_QualitativeMapping_8=ruleQualitativeMapping();

                    state._fsp--;

                     
                            current = this_QualitativeMapping_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:263:5: this_Metadata_9= ruleMetadata
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getMetadataParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleMetadata_in_ruleGRLElement614);
                    this_Metadata_9=ruleMetadata();

                    state._fsp--;

                     
                            current = this_Metadata_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:273:5: this_Comment_10= ruleComment
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getCommentParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleComment_in_ruleGRLElement641);
                    this_Comment_10=ruleComment();

                    state._fsp--;

                     
                            current = this_Comment_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:283:5: this_LinkType_11= ruleLinkType
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getLinkTypeParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleLinkType_in_ruleGRLElement668);
                    this_LinkType_11=ruleLinkType();

                    state._fsp--;

                     
                            current = this_LinkType_11; 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:299:1: entryRuleIntentionalElement returns [EObject current=null] : iv_ruleIntentionalElement= ruleIntentionalElement EOF ;
    public final EObject entryRuleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentionalElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:300:2: (iv_ruleIntentionalElement= ruleIntentionalElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:301:2: iv_ruleIntentionalElement= ruleIntentionalElement EOF
            {
             newCompositeNode(grammarAccess.getIntentionalElementRule()); 
            pushFollow(FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement703);
            iv_ruleIntentionalElement=ruleIntentionalElement();

            state._fsp--;

             current =iv_ruleIntentionalElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntentionalElement713); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:308:1: ruleIntentionalElement returns [EObject current=null] : (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:311:28: ( (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:312:1: (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:312:1: (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief )
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:313:5: this_Softgoal_0= ruleSoftgoal
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getSoftgoalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSoftgoal_in_ruleIntentionalElement760);
                    this_Softgoal_0=ruleSoftgoal();

                    state._fsp--;

                     
                            current = this_Softgoal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:323:5: this_Goal_1= ruleGoal
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getGoalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGoal_in_ruleIntentionalElement787);
                    this_Goal_1=ruleGoal();

                    state._fsp--;

                     
                            current = this_Goal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:333:5: this_Task_2= ruleTask
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getTaskParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTask_in_ruleIntentionalElement814);
                    this_Task_2=ruleTask();

                    state._fsp--;

                     
                            current = this_Task_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:343:5: this_Resource_3= ruleResource
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getResourceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleIntentionalElement841);
                    this_Resource_3=ruleResource();

                    state._fsp--;

                     
                            current = this_Resource_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:353:5: this_Indicator_4= ruleIndicator
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getIndicatorParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIndicator_in_ruleIntentionalElement868);
                    this_Indicator_4=ruleIndicator();

                    state._fsp--;

                     
                            current = this_Indicator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:363:5: this_Belief_5= ruleBelief
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getBeliefParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleBelief_in_ruleIntentionalElement895);
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:379:1: entryRuleElementLink returns [EObject current=null] : iv_ruleElementLink= ruleElementLink EOF ;
    public final EObject entryRuleElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:380:2: (iv_ruleElementLink= ruleElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:381:2: iv_ruleElementLink= ruleElementLink EOF
            {
             newCompositeNode(grammarAccess.getElementLinkRule()); 
            pushFollow(FOLLOW_ruleElementLink_in_entryRuleElementLink930);
            iv_ruleElementLink=ruleElementLink();

            state._fsp--;

             current =iv_ruleElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLink940); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:388:1: ruleElementLink returns [EObject current=null] : (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency | this_Link_3= ruleLink ) ;
    public final EObject ruleElementLink() throws RecognitionException {
        EObject current = null;

        EObject this_Decomposition_0 = null;

        EObject this_Contribution_1 = null;

        EObject this_Dependency_2 = null;

        EObject this_Link_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:391:28: ( (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency | this_Link_3= ruleLink ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:392:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency | this_Link_3= ruleLink )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:392:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency | this_Link_3= ruleLink )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:393:5: this_Decomposition_0= ruleDecomposition
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDecompositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecomposition_in_ruleElementLink987);
                    this_Decomposition_0=ruleDecomposition();

                    state._fsp--;

                     
                            current = this_Decomposition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:403:5: this_Contribution_1= ruleContribution
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getContributionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContribution_in_ruleElementLink1014);
                    this_Contribution_1=ruleContribution();

                    state._fsp--;

                     
                            current = this_Contribution_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:413:5: this_Dependency_2= ruleDependency
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDependencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDependency_in_ruleElementLink1041);
                    this_Dependency_2=ruleDependency();

                    state._fsp--;

                     
                            current = this_Dependency_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:423:5: this_Link_3= ruleLink
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getLinkParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleLink_in_ruleElementLink1068);
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:439:1: entryRuleInLineElementLink returns [EObject current=null] : iv_ruleInLineElementLink= ruleInLineElementLink EOF ;
    public final EObject entryRuleInLineElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:440:2: (iv_ruleInLineElementLink= ruleInLineElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:441:2: iv_ruleInLineElementLink= ruleInLineElementLink EOF
            {
             newCompositeNode(grammarAccess.getInLineElementLinkRule()); 
            pushFollow(FOLLOW_ruleInLineElementLink_in_entryRuleInLineElementLink1103);
            iv_ruleInLineElementLink=ruleInLineElementLink();

            state._fsp--;

             current =iv_ruleInLineElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineElementLink1113); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:448:1: ruleInLineElementLink returns [EObject current=null] : (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency | this_inLineLink_3= ruleinLineLink ) ;
    public final EObject ruleInLineElementLink() throws RecognitionException {
        EObject current = null;

        EObject this_InLineDecomposition_0 = null;

        EObject this_InLineContribution_1 = null;

        EObject this_InLineDependency_2 = null;

        EObject this_inLineLink_3 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:451:28: ( (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency | this_inLineLink_3= ruleinLineLink ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:452:1: (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency | this_inLineLink_3= ruleinLineLink )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:452:1: (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency | this_inLineLink_3= ruleinLineLink )
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:453:5: this_InLineDecomposition_0= ruleInLineDecomposition
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineDecompositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInLineDecomposition_in_ruleInLineElementLink1160);
                    this_InLineDecomposition_0=ruleInLineDecomposition();

                    state._fsp--;

                     
                            current = this_InLineDecomposition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:463:5: this_InLineContribution_1= ruleInLineContribution
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineContributionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInLineContribution_in_ruleInLineElementLink1187);
                    this_InLineContribution_1=ruleInLineContribution();

                    state._fsp--;

                     
                            current = this_InLineContribution_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:473:5: this_InLineDependency_2= ruleInLineDependency
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineDependencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInLineDependency_in_ruleInLineElementLink1214);
                    this_InLineDependency_2=ruleInLineDependency();

                    state._fsp--;

                     
                            current = this_InLineDependency_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:483:5: this_inLineLink_3= ruleinLineLink
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineLinkParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleinLineLink_in_ruleInLineElementLink1241);
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:499:1: entryRuleGRLSpecification returns [EObject current=null] : iv_ruleGRLSpecification= ruleGRLSpecification EOF ;
    public final EObject entryRuleGRLSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRLSpecification = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:500:2: (iv_ruleGRLSpecification= ruleGRLSpecification EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:501:2: iv_ruleGRLSpecification= ruleGRLSpecification EOF
            {
             newCompositeNode(grammarAccess.getGRLSpecificationRule()); 
            pushFollow(FOLLOW_ruleGRLSpecification_in_entryRuleGRLSpecification1276);
            iv_ruleGRLSpecification=ruleGRLSpecification();

            state._fsp--;

             current =iv_ruleGRLSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRLSpecification1286); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:508:1: ruleGRLSpecification returns [EObject current=null] : (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleGRLSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_grlElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:511:28: ( (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:512:1: (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:512:1: (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:512:3: otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGRLSpecification1323); 

                	newLeafNode(otherlv_0, grammarAccess.getGRLSpecificationAccess().getGrlKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:516:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:517:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:517:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:518:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGRLSpecification1340); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGRLSpecification1358); 

                	newLeafNode(otherlv_2, grammarAccess.getGRLSpecificationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:538:1: ( (lv_grlElements_3_0= ruleGRLElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==16||LA8_0==22||(LA8_0>=24 && LA8_0<=28)||LA8_0==33||LA8_0==35||(LA8_0>=47 && LA8_0<=49)||(LA8_0>=51 && LA8_0<=53)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:539:1: (lv_grlElements_3_0= ruleGRLElement )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:539:1: (lv_grlElements_3_0= ruleGRLElement )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:540:3: lv_grlElements_3_0= ruleGRLElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLSpecificationAccess().getGrlElementsGRLElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGRLElement_in_ruleGRLSpecification1379);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleGRLSpecification1392); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:568:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:569:2: (iv_ruleActor= ruleActor EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:570:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor1428);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor1438); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:577:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_22= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token lv_importanceQuantitative_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_description_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_22=null;
        Enumerator lv_importance_8_0 = null;

        Enumerator lv_fillColor_17_0 = null;

        EObject lv_metaData_19_0 = null;

        EObject lv_elemets_20_0 = null;

        EObject lv_elemets_21_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:580:28: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_22= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:581:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_22= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:581:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_22= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:581:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleActor1475); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:585:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:586:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:586:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:587:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1492); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleActor1509); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:607:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:609:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:609:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:610:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:614:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:614:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) ) )*
            loop13:
            do {
                int alt13=7;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0) ) {
                    alt13=1;
                }
                else if ( (LA13_0==RULE_INT|| LA13_0 >=55 && LA13_0<=58) && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2) ) {
                    alt13=3;
                }
                else if ( LA13_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3) ) {
                    alt13=4;
                }
                else if ( LA13_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {
                    alt13=5;
                }
                else if ( (LA13_0==RULE_ID||LA13_0==22|| LA13_0 >=24 && LA13_0<=28) && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5) ) {
                    alt13=6;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:616:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:616:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:617:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:617:102: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:618:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:621:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:621:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:621:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:621:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleActor1567); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActorAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleActor1579); 

            	        	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:629:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:630:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:630:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:631:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1596); 

            	    			newLeafNode(lv_label_6_0, grammarAccess.getActorAccess().getLabelSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"label",
            	            		lv_label_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleActor1613); 

            	        	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:658:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:658:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:659:5: {...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:659:102: ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:660:6: ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:663:6: ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:663:7: {...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:663:16: ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:663:17: ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:663:17: ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0>=55 && LA9_0<=58)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:663:18: ( (lv_importance_8_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:663:18: ( (lv_importance_8_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:664:1: (lv_importance_8_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:664:1: (lv_importance_8_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:665:3: lv_importance_8_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getActorAccess().getImportanceImportanceTypeEnumRuleCall_3_1_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleActor1691);
            	            lv_importance_8_0=ruleImportanceType();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getActorRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"importance",
            	                    		lv_importance_8_0, 
            	                    		"ImportanceType");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:682:6: ( (lv_importanceQuantitative_9_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:682:6: ( (lv_importanceQuantitative_9_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:683:1: (lv_importanceQuantitative_9_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:683:1: (lv_importanceQuantitative_9_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:684:3: lv_importanceQuantitative_9_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActor1714); 

            	            			newLeafNode(lv_importanceQuantitative_9_0, grammarAccess.getActorAccess().getImportanceQuantitativeINTTerminalRuleCall_3_1_0_1_0()); 
            	            		

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


            	            }
            	            break;

            	    }

            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleActor1732); 

            	        	newLeafNode(otherlv_10, grammarAccess.getActorAccess().getSemicolonKeyword_3_1_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:711:4: ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:711:4: ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:712:5: {...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:712:102: ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:713:6: ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:716:6: ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:716:7: {...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:716:16: (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:716:18: otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';'
            	    {
            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleActor1800); 

            	        	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getDescriptionKeyword_3_2_0());
            	        
            	    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleActor1812); 

            	        	newLeafNode(otherlv_12, grammarAccess.getActorAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:724:1: ( (lv_description_13_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:725:1: (lv_description_13_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:725:1: (lv_description_13_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:726:3: lv_description_13_0= RULE_STRING
            	    {
            	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1829); 

            	    			newLeafNode(lv_description_13_0, grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_3_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_13_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleActor1846); 

            	        	newLeafNode(otherlv_14, grammarAccess.getActorAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:753:4: ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:753:4: ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:754:5: {...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:754:102: ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:755:6: ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:758:6: ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:758:7: {...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:758:16: (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:758:18: otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';'
            	    {
            	    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleActor1914); 

            	        	newLeafNode(otherlv_15, grammarAccess.getActorAccess().getColorKeyword_3_3_0());
            	        
            	    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleActor1926); 

            	        	newLeafNode(otherlv_16, grammarAccess.getActorAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:766:1: ( (lv_fillColor_17_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:767:1: (lv_fillColor_17_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:767:1: (lv_fillColor_17_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:768:3: lv_fillColor_17_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActorAccess().getFillColorColorEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleActor1947);
            	    lv_fillColor_17_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"fillColor",
            	            		lv_fillColor_17_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleActor1959); 

            	        	newLeafNode(otherlv_18, grammarAccess.getActorAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:795:4: ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:795:4: ({...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:796:5: {...}? => ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:796:102: ( ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:797:6: ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:800:6: ({...}? => ( (lv_metaData_19_0= ruleMetadata ) ) )+
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
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:800:7: {...}? => ( (lv_metaData_19_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:800:16: ( (lv_metaData_19_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:801:1: (lv_metaData_19_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:801:1: (lv_metaData_19_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:802:3: lv_metaData_19_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getActorAccess().getMetaDataMetadataParserRuleCall_3_4_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleActor2035);
            	    	    lv_metaData_19_0=ruleMetadata();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"metaData",
            	    	            		lv_metaData_19_0, 
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:825:4: ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:825:4: ({...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:826:5: {...}? => ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:826:102: ( ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:827:6: ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:830:6: ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+
            	    int cnt12=0;
            	    loop12:
            	    do {
            	        int alt12=2;
            	        alt12 = dfa12.predict(input);
            	        switch (alt12) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:830:7: {...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:830:16: ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) )
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
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:830:17: ( (lv_elemets_20_0= ruleIntentionalElement ) )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:830:17: ( (lv_elemets_20_0= ruleIntentionalElement ) )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:831:1: (lv_elemets_20_0= ruleIntentionalElement )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:831:1: (lv_elemets_20_0= ruleIntentionalElement )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:832:3: lv_elemets_20_0= ruleIntentionalElement
            	    	            {
            	    	             
            	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsIntentionalElementParserRuleCall_3_5_0_0()); 
            	    	            	    
            	    	            pushFollow(FOLLOW_ruleIntentionalElement_in_ruleActor2112);
            	    	            lv_elemets_20_0=ruleIntentionalElement();

            	    	            state._fsp--;


            	    	            	        if (current==null) {
            	    	            	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	            	        }
            	    	                   		add(
            	    	                   			current, 
            	    	                   			"elemets",
            	    	                    		lv_elemets_20_0, 
            	    	                    		"IntentionalElement");
            	    	            	        afterParserOrEnumRuleCall();
            	    	            	    

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:849:6: ( (lv_elemets_21_0= ruleElementLink ) )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:849:6: ( (lv_elemets_21_0= ruleElementLink ) )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:850:1: (lv_elemets_21_0= ruleElementLink )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:850:1: (lv_elemets_21_0= ruleElementLink )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:851:3: lv_elemets_21_0= ruleElementLink
            	    	            {
            	    	             
            	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsElementLinkParserRuleCall_3_5_1_0()); 
            	    	            	    
            	    	            pushFollow(FOLLOW_ruleElementLink_in_ruleActor2139);
            	    	            lv_elemets_21_0=ruleElementLink();

            	    	            state._fsp--;


            	    	            	        if (current==null) {
            	    	            	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	            	        }
            	    	                   		add(
            	    	                   			current, 
            	    	                   			"elemets",
            	    	                    		lv_elemets_21_0, 
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	

            }

            otherlv_22=(Token)match(input,15,FOLLOW_15_in_ruleActor2193); 

                	newLeafNode(otherlv_22, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:893:1: entryRuleSoftgoal returns [EObject current=null] : iv_ruleSoftgoal= ruleSoftgoal EOF ;
    public final EObject entryRuleSoftgoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftgoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:894:2: (iv_ruleSoftgoal= ruleSoftgoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:895:2: iv_ruleSoftgoal= ruleSoftgoal EOF
            {
             newCompositeNode(grammarAccess.getSoftgoalRule()); 
            pushFollow(FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal2229);
            iv_ruleSoftgoal=ruleSoftgoal();

            state._fsp--;

             current =iv_ruleSoftgoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftgoal2239); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:902:1: ruleSoftgoal returns [EObject current=null] : (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' ) ;
    public final EObject ruleSoftgoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_importanceQuantitative_21_0=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_decompositionType_18_0 = null;

        Enumerator lv_importance_20_0 = null;

        EObject lv_metaData_23_0 = null;

        EObject lv_elementLinks_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:905:28: ( (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:906:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:906:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:906:3: otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleSoftgoal2276); 

                	newLeafNode(otherlv_0, grammarAccess.getSoftgoalAccess().getSoftGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:910:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:911:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:911:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:912:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftgoal2293); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSoftgoal2310); 

                	newLeafNode(otherlv_2, grammarAccess.getSoftgoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:932:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:934:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:934:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:935:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:938:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:939:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:939:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )*
            loop17:
            do {
                int alt17=8;
                int LA17_0 = input.LA(1);

                if ( LA17_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2) ) {
                    alt17=3;
                }
                else if ( LA17_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3) ) {
                    alt17=4;
                }
                else if ( (LA17_0==RULE_INT|| LA17_0 >=55 && LA17_0<=58) && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4) ) {
                    alt17=5;
                }
                else if ( LA17_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5) ) {
                    alt17=6;
                }
                else if ( (LA17_0==RULE_ID||LA17_0==29|| LA17_0 >=31 && LA17_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 6) ) {
                    alt17=7;
                }


                switch (alt17) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:941:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:941:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:942:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:942:105: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:943:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:946:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:946:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:946:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:946:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2368); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSoftgoalAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2380); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:954:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:955:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:955:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:956:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal2397); 

            	    			newLeafNode(lv_label_6_0, grammarAccess.getSoftgoalAccess().getLabelSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"label",
            	            		lv_label_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2414); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:983:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:983:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:984:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:984:105: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:985:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:988:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:988:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:988:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:988:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleSoftgoal2482); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSoftgoalAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2494); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:996:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:997:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:997:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:998:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal2511); 

            	    			newLeafNode(lv_description_10_0, grammarAccess.getSoftgoalAccess().getDescriptionSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2528); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1025:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1025:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1026:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1026:105: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1027:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1030:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1030:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1030:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1030:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleSoftgoal2596); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSoftgoalAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2608); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1038:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1039:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1039:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1040:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleSoftgoal2629);
            	    lv_fillColor_14_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"fillColor",
            	            		lv_fillColor_14_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2641); 

            	        	newLeafNode(otherlv_15, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1067:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1067:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1068:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1068:105: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1069:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1072:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1072:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1072:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1072:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleSoftgoal2709); 

            	        	newLeafNode(otherlv_16, grammarAccess.getSoftgoalAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2721); 

            	        	newLeafNode(otherlv_17, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1080:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1081:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1081:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1082:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleSoftgoal2742);
            	    lv_decompositionType_18_0=ruleDecompositionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"decompositionType",
            	            		lv_decompositionType_18_0, 
            	            		"DecompositionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2754); 

            	        	newLeafNode(otherlv_19, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1109:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1109:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1110:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1110:105: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1111:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1114:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1114:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1114:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1114:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1114:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( ((LA14_0>=55 && LA14_0<=58)) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==RULE_INT) ) {
            	        alt14=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1114:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1114:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1115:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1115:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1116:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSoftgoalAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleSoftgoal2832);
            	            lv_importance_20_0=ruleImportanceType();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"importance",
            	                    		lv_importance_20_0, 
            	                    		"ImportanceType");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1133:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1133:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1134:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1134:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1135:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSoftgoal2855); 

            	            			newLeafNode(lv_importanceQuantitative_21_0, grammarAccess.getSoftgoalAccess().getImportanceQuantitativeINTTerminalRuleCall_3_4_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getSoftgoalRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"importanceQuantitative",
            	                    		lv_importanceQuantitative_21_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2873); 

            	        	newLeafNode(otherlv_22, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1162:4: ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1162:4: ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1163:5: {...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1163:105: ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1164:6: ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1167:6: ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+
            	    int cnt15=0;
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==51) ) {
            	            int LA15_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt15=1;
            	            }


            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1167:7: {...}? => ( (lv_metaData_23_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1167:16: ( (lv_metaData_23_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1168:1: (lv_metaData_23_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1168:1: (lv_metaData_23_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1169:3: lv_metaData_23_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getMetaDataMetadataParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleSoftgoal2949);
            	    	    lv_metaData_23_0=ruleMetadata();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"metaData",
            	    	            		lv_metaData_23_0, 
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1192:4: ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1192:4: ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1193:5: {...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1193:105: ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1194:6: ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1197:6: ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+
            	    int cnt16=0;
            	    loop16:
            	    do {
            	        int alt16=2;
            	        switch ( input.LA(1) ) {
            	        case 29:
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
            	        case 32:
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
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1197:7: {...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1197:16: ( (lv_elementLinks_24_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1198:1: (lv_elementLinks_24_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1198:1: (lv_elementLinks_24_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1199:3: lv_elementLinks_24_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getElementLinksInLineElementLinkParserRuleCall_3_6_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleSoftgoal3025);
            	    	    lv_elementLinks_24_0=ruleInLineElementLink();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"elementLinks",
            	    	            		lv_elementLinks_24_0, 
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	

            }

            otherlv_25=(Token)match(input,15,FOLLOW_15_in_ruleSoftgoal3078); 

                	newLeafNode(otherlv_25, grammarAccess.getSoftgoalAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1241:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1242:2: (iv_ruleGoal= ruleGoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1243:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal3114);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal3124); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1250:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_importanceQuantitative_21_0=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_decompositionType_18_0 = null;

        Enumerator lv_importance_20_0 = null;

        EObject lv_metaData_23_0 = null;

        EObject lv_elementLinks_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1253:28: ( (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1254:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1254:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1254:3: otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGoal3161); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1258:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1259:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1259:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1260:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal3178); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGoal3195); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1280:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1282:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1282:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1283:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1286:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1287:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1287:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )*
            loop21:
            do {
                int alt21=8;
                int LA21_0 = input.LA(1);

                if ( LA21_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1) ) {
                    alt21=2;
                }
                else if ( LA21_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2) ) {
                    alt21=3;
                }
                else if ( LA21_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3) ) {
                    alt21=4;
                }
                else if ( (LA21_0==RULE_INT|| LA21_0 >=55 && LA21_0<=58) && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4) ) {
                    alt21=5;
                }
                else if ( LA21_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5) ) {
                    alt21=6;
                }
                else if ( (LA21_0==RULE_ID||LA21_0==29|| LA21_0 >=31 && LA21_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 6) ) {
                    alt21=7;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1289:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1289:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1290:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1290:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1291:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1294:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1294:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1294:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1294:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleGoal3253); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGoalAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleGoal3265); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1302:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1303:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1303:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1304:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3282); 

            	    			newLeafNode(lv_label_6_0, grammarAccess.getGoalAccess().getLabelSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"label",
            	            		lv_label_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleGoal3299); 

            	        	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1331:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1331:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1332:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1332:101: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1333:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1336:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1336:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1336:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1336:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleGoal3367); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleGoal3379); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1344:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1345:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1345:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1346:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3396); 

            	    			newLeafNode(lv_description_10_0, grammarAccess.getGoalAccess().getDescriptionSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleGoal3413); 

            	        	newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1373:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1373:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1374:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1374:101: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1375:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1378:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1378:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1378:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1378:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleGoal3481); 

            	        	newLeafNode(otherlv_12, grammarAccess.getGoalAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleGoal3493); 

            	        	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1386:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1387:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1387:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1388:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleGoal3514);
            	    lv_fillColor_14_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"fillColor",
            	            		lv_fillColor_14_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleGoal3526); 

            	        	newLeafNode(otherlv_15, grammarAccess.getGoalAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1415:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1415:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1416:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1416:101: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1417:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1420:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1420:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1420:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1420:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleGoal3594); 

            	        	newLeafNode(otherlv_16, grammarAccess.getGoalAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleGoal3606); 

            	        	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1428:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1429:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1429:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1430:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleGoal3627);
            	    lv_decompositionType_18_0=ruleDecompositionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"decompositionType",
            	            		lv_decompositionType_18_0, 
            	            		"DecompositionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleGoal3639); 

            	        	newLeafNode(otherlv_19, grammarAccess.getGoalAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1457:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1457:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1458:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1458:101: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1459:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1462:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1462:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1462:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1462:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1462:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt18=2;
            	    int LA18_0 = input.LA(1);

            	    if ( ((LA18_0>=55 && LA18_0<=58)) ) {
            	        alt18=1;
            	    }
            	    else if ( (LA18_0==RULE_INT) ) {
            	        alt18=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt18) {
            	        case 1 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1462:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1462:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1463:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1463:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1464:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGoalAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleGoal3717);
            	            lv_importance_20_0=ruleImportanceType();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"importance",
            	                    		lv_importance_20_0, 
            	                    		"ImportanceType");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1481:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1481:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1482:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1482:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1483:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGoal3740); 

            	            			newLeafNode(lv_importanceQuantitative_21_0, grammarAccess.getGoalAccess().getImportanceQuantitativeINTTerminalRuleCall_3_4_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getGoalRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"importanceQuantitative",
            	                    		lv_importanceQuantitative_21_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleGoal3758); 

            	        	newLeafNode(otherlv_22, grammarAccess.getGoalAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1510:4: ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1510:4: ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1511:5: {...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1511:101: ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1512:6: ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1515:6: ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+
            	    int cnt19=0;
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==51) ) {
            	            int LA19_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt19=1;
            	            }


            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1515:7: {...}? => ( (lv_metaData_23_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1515:16: ( (lv_metaData_23_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1516:1: (lv_metaData_23_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1516:1: (lv_metaData_23_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1517:3: lv_metaData_23_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getMetaDataMetadataParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleGoal3834);
            	    	    lv_metaData_23_0=ruleMetadata();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"metaData",
            	    	            		lv_metaData_23_0, 
            	    	            		"Metadata");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt19 >= 1 ) break loop19;
            	                EarlyExitException eee =
            	                    new EarlyExitException(19, input);
            	                throw eee;
            	        }
            	        cnt19++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1540:4: ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1540:4: ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1541:5: {...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1541:101: ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1542:6: ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1545:6: ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+
            	    int cnt20=0;
            	    loop20:
            	    do {
            	        int alt20=2;
            	        switch ( input.LA(1) ) {
            	        case 29:
            	            {
            	            int LA20_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt20=1;
            	            }


            	            }
            	            break;
            	        case 31:
            	            {
            	            int LA20_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt20=1;
            	            }


            	            }
            	            break;
            	        case 32:
            	            {
            	            int LA20_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt20=1;
            	            }


            	            }
            	            break;
            	        case RULE_ID:
            	            {
            	            int LA20_5 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt20=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt20) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1545:7: {...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1545:16: ( (lv_elementLinks_24_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1546:1: (lv_elementLinks_24_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1546:1: (lv_elementLinks_24_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1547:3: lv_elementLinks_24_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getElementLinksInLineElementLinkParserRuleCall_3_6_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleGoal3910);
            	    	    lv_elementLinks_24_0=ruleInLineElementLink();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"elementLinks",
            	    	            		lv_elementLinks_24_0, 
            	    	            		"InLineElementLink");
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	

            }

            otherlv_25=(Token)match(input,15,FOLLOW_15_in_ruleGoal3963); 

                	newLeafNode(otherlv_25, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1589:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1590:2: (iv_ruleTask= ruleTask EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1591:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask3999);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask4009); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1598:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_importanceQuantitative_21_0=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_decompositionType_18_0 = null;

        Enumerator lv_importance_20_0 = null;

        EObject lv_metaData_23_0 = null;

        EObject lv_elementLinks_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1601:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1602:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1602:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1602:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTask4046); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1606:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1607:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1607:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1608:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask4063); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTask4080); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1628:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1630:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1630:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1631:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1634:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1635:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1635:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )*
            loop25:
            do {
                int alt25=8;
                int LA25_0 = input.LA(1);

                if ( LA25_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1) ) {
                    alt25=2;
                }
                else if ( LA25_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2) ) {
                    alt25=3;
                }
                else if ( LA25_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3) ) {
                    alt25=4;
                }
                else if ( (LA25_0==RULE_INT|| LA25_0 >=55 && LA25_0<=58) && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4) ) {
                    alt25=5;
                }
                else if ( LA25_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5) ) {
                    alt25=6;
                }
                else if ( (LA25_0==RULE_ID||LA25_0==29|| LA25_0 >=31 && LA25_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 6) ) {
                    alt25=7;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1637:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1637:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1638:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1638:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1639:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1642:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1642:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1642:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1642:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleTask4138); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleTask4150); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1650:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1651:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1651:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1652:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask4167); 

            	    			newLeafNode(lv_label_6_0, grammarAccess.getTaskAccess().getLabelSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTaskRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"label",
            	            		lv_label_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleTask4184); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1679:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1679:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1680:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1680:101: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1681:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1684:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1684:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1684:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1684:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleTask4252); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleTask4264); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1692:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1693:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1693:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1694:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask4281); 

            	    			newLeafNode(lv_description_10_0, grammarAccess.getTaskAccess().getDescriptionSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTaskRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleTask4298); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1721:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1721:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1722:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1722:101: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1723:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1726:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1726:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1726:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1726:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleTask4366); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleTask4378); 

            	        	newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1734:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1735:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1735:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1736:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaskAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleTask4399);
            	    lv_fillColor_14_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"fillColor",
            	            		lv_fillColor_14_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleTask4411); 

            	        	newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1763:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1763:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1764:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1764:101: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1765:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1768:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1768:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1768:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1768:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleTask4479); 

            	        	newLeafNode(otherlv_16, grammarAccess.getTaskAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleTask4491); 

            	        	newLeafNode(otherlv_17, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1776:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1777:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1777:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1778:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaskAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleTask4512);
            	    lv_decompositionType_18_0=ruleDecompositionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"decompositionType",
            	            		lv_decompositionType_18_0, 
            	            		"DecompositionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleTask4524); 

            	        	newLeafNode(otherlv_19, grammarAccess.getTaskAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1805:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1805:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1806:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1806:101: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1807:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1810:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1810:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1810:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1810:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1810:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( ((LA22_0>=55 && LA22_0<=58)) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==RULE_INT) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1810:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1810:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1811:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1811:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1812:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTaskAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleTask4602);
            	            lv_importance_20_0=ruleImportanceType();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getTaskRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"importance",
            	                    		lv_importance_20_0, 
            	                    		"ImportanceType");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1829:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1829:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1830:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1830:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1831:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTask4625); 

            	            			newLeafNode(lv_importanceQuantitative_21_0, grammarAccess.getTaskAccess().getImportanceQuantitativeINTTerminalRuleCall_3_4_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getTaskRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"importanceQuantitative",
            	                    		lv_importanceQuantitative_21_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleTask4643); 

            	        	newLeafNode(otherlv_22, grammarAccess.getTaskAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1858:4: ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1858:4: ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1859:5: {...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1859:101: ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1860:6: ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1863:6: ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+
            	    int cnt23=0;
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==51) ) {
            	            int LA23_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1863:7: {...}? => ( (lv_metaData_23_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1863:16: ( (lv_metaData_23_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1864:1: (lv_metaData_23_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1864:1: (lv_metaData_23_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1865:3: lv_metaData_23_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTaskAccess().getMetaDataMetadataParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleTask4719);
            	    	    lv_metaData_23_0=ruleMetadata();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"metaData",
            	    	            		lv_metaData_23_0, 
            	    	            		"Metadata");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1888:4: ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1888:4: ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1889:5: {...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1889:101: ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1890:6: ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1893:6: ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+
            	    int cnt24=0;
            	    loop24:
            	    do {
            	        int alt24=2;
            	        switch ( input.LA(1) ) {
            	        case 29:
            	            {
            	            int LA24_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt24=1;
            	            }


            	            }
            	            break;
            	        case 31:
            	            {
            	            int LA24_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt24=1;
            	            }


            	            }
            	            break;
            	        case 32:
            	            {
            	            int LA24_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt24=1;
            	            }


            	            }
            	            break;
            	        case RULE_ID:
            	            {
            	            int LA24_5 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt24=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt24) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1893:7: {...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1893:16: ( (lv_elementLinks_24_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1894:1: (lv_elementLinks_24_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1894:1: (lv_elementLinks_24_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1895:3: lv_elementLinks_24_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTaskAccess().getElementLinksInLineElementLinkParserRuleCall_3_6_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleTask4795);
            	    	    lv_elementLinks_24_0=ruleInLineElementLink();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"elementLinks",
            	    	            		lv_elementLinks_24_0, 
            	    	            		"InLineElementLink");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt24 >= 1 ) break loop24;
            	                EarlyExitException eee =
            	                    new EarlyExitException(24, input);
            	                throw eee;
            	        }
            	        cnt24++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	

            }

            otherlv_25=(Token)match(input,15,FOLLOW_15_in_ruleTask4848); 

                	newLeafNode(otherlv_25, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1937:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1938:2: (iv_ruleResource= ruleResource EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1939:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource4884);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource4894); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1946:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_importanceQuantitative_21_0=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_decompositionType_18_0 = null;

        Enumerator lv_importance_20_0 = null;

        EObject lv_metaData_23_0 = null;

        EObject lv_elementLinks_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1949:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1950:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1950:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1950:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleResource4931); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1954:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1955:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1955:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1956:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource4948); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleResource4965); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1976:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1978:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1978:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1979:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1982:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1983:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1983:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )*
            loop29:
            do {
                int alt29=8;
                int LA29_0 = input.LA(1);

                if ( LA29_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0) ) {
                    alt29=1;
                }
                else if ( LA29_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1) ) {
                    alt29=2;
                }
                else if ( LA29_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2) ) {
                    alt29=3;
                }
                else if ( LA29_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3) ) {
                    alt29=4;
                }
                else if ( (LA29_0==RULE_INT|| LA29_0 >=55 && LA29_0<=58) && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4) ) {
                    alt29=5;
                }
                else if ( LA29_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5) ) {
                    alt29=6;
                }
                else if ( (LA29_0==RULE_ID||LA29_0==29|| LA29_0 >=31 && LA29_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 6) ) {
                    alt29=7;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1985:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1985:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1986:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1986:105: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1987:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1990:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1990:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1990:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1990:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleResource5023); 

            	        	newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleResource5035); 

            	        	newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1998:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1999:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1999:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2000:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource5052); 

            	    			newLeafNode(lv_label_6_0, grammarAccess.getResourceAccess().getLabelSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getResourceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"label",
            	            		lv_label_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleResource5069); 

            	        	newLeafNode(otherlv_7, grammarAccess.getResourceAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2027:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2027:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2028:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2028:105: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2029:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2032:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2032:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2032:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2032:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleResource5137); 

            	        	newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleResource5149); 

            	        	newLeafNode(otherlv_9, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2040:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2041:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2041:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2042:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource5166); 

            	    			newLeafNode(lv_description_10_0, grammarAccess.getResourceAccess().getDescriptionSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getResourceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleResource5183); 

            	        	newLeafNode(otherlv_11, grammarAccess.getResourceAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2069:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2069:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2070:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2070:105: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2071:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2074:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2074:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2074:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2074:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleResource5251); 

            	        	newLeafNode(otherlv_12, grammarAccess.getResourceAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleResource5263); 

            	        	newLeafNode(otherlv_13, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2082:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2083:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2083:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2084:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleResource5284);
            	    lv_fillColor_14_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"fillColor",
            	            		lv_fillColor_14_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleResource5296); 

            	        	newLeafNode(otherlv_15, grammarAccess.getResourceAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2111:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2111:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2112:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2112:105: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2113:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2116:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2116:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2116:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2116:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleResource5364); 

            	        	newLeafNode(otherlv_16, grammarAccess.getResourceAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleResource5376); 

            	        	newLeafNode(otherlv_17, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2124:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2125:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2125:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2126:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleResource5397);
            	    lv_decompositionType_18_0=ruleDecompositionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"decompositionType",
            	            		lv_decompositionType_18_0, 
            	            		"DecompositionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleResource5409); 

            	        	newLeafNode(otherlv_19, grammarAccess.getResourceAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2153:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2153:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2154:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2154:105: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2155:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2158:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2158:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2158:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2158:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2158:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( ((LA26_0>=55 && LA26_0<=58)) ) {
            	        alt26=1;
            	    }
            	    else if ( (LA26_0==RULE_INT) ) {
            	        alt26=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 26, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt26) {
            	        case 1 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2158:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2158:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2159:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2159:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2160:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getResourceAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleResource5487);
            	            lv_importance_20_0=ruleImportanceType();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"importance",
            	                    		lv_importance_20_0, 
            	                    		"ImportanceType");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2177:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2177:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2178:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2178:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2179:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResource5510); 

            	            			newLeafNode(lv_importanceQuantitative_21_0, grammarAccess.getResourceAccess().getImportanceQuantitativeINTTerminalRuleCall_3_4_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getResourceRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"importanceQuantitative",
            	                    		lv_importanceQuantitative_21_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleResource5528); 

            	        	newLeafNode(otherlv_22, grammarAccess.getResourceAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2206:4: ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2206:4: ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2207:5: {...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2207:105: ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2208:6: ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2211:6: ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+
            	    int cnt27=0;
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==51) ) {
            	            int LA27_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt27=1;
            	            }


            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2211:7: {...}? => ( (lv_metaData_23_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2211:16: ( (lv_metaData_23_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2212:1: (lv_metaData_23_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2212:1: (lv_metaData_23_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2213:3: lv_metaData_23_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getResourceAccess().getMetaDataMetadataParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleResource5604);
            	    	    lv_metaData_23_0=ruleMetadata();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"metaData",
            	    	            		lv_metaData_23_0, 
            	    	            		"Metadata");
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2236:4: ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2236:4: ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2237:5: {...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2237:105: ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2238:6: ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2241:6: ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+
            	    int cnt28=0;
            	    loop28:
            	    do {
            	        int alt28=2;
            	        switch ( input.LA(1) ) {
            	        case 29:
            	            {
            	            int LA28_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt28=1;
            	            }


            	            }
            	            break;
            	        case 31:
            	            {
            	            int LA28_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt28=1;
            	            }


            	            }
            	            break;
            	        case 32:
            	            {
            	            int LA28_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt28=1;
            	            }


            	            }
            	            break;
            	        case RULE_ID:
            	            {
            	            int LA28_5 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt28=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt28) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2241:7: {...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2241:16: ( (lv_elementLinks_24_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2242:1: (lv_elementLinks_24_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2242:1: (lv_elementLinks_24_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2243:3: lv_elementLinks_24_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getResourceAccess().getElementLinksInLineElementLinkParserRuleCall_3_6_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleResource5680);
            	    	    lv_elementLinks_24_0=ruleInLineElementLink();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"elementLinks",
            	    	            		lv_elementLinks_24_0, 
            	    	            		"InLineElementLink");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt28 >= 1 ) break loop28;
            	                EarlyExitException eee =
            	                    new EarlyExitException(28, input);
            	                throw eee;
            	        }
            	        cnt28++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	

            }

            otherlv_25=(Token)match(input,15,FOLLOW_15_in_ruleResource5733); 

                	newLeafNode(otherlv_25, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2285:1: entryRuleIndicator returns [EObject current=null] : iv_ruleIndicator= ruleIndicator EOF ;
    public final EObject entryRuleIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicator = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2286:2: (iv_ruleIndicator= ruleIndicator EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2287:2: iv_ruleIndicator= ruleIndicator EOF
            {
             newCompositeNode(grammarAccess.getIndicatorRule()); 
            pushFollow(FOLLOW_ruleIndicator_in_entryRuleIndicator5769);
            iv_ruleIndicator=ruleIndicator();

            state._fsp--;

             current =iv_ruleIndicator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndicator5779); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2294:1: ruleIndicator returns [EObject current=null] : (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' ) ;
    public final EObject ruleIndicator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_importanceQuantitative_21_0=null;
        Token otherlv_22=null;
        Token otherlv_25=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_decompositionType_18_0 = null;

        Enumerator lv_importance_20_0 = null;

        EObject lv_metaData_23_0 = null;

        EObject lv_elementLinks_24_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2297:28: ( (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2298:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2298:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2298:3: otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleIndicator5816); 

                	newLeafNode(otherlv_0, grammarAccess.getIndicatorAccess().getIndicatorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2302:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2303:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2303:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2304:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator5833); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleIndicator5850); 

                	newLeafNode(otherlv_2, grammarAccess.getIndicatorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2324:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2326:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2326:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2327:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2330:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2331:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2331:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) ) )*
            loop33:
            do {
                int alt33=8;
                int LA33_0 = input.LA(1);

                if ( LA33_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1) ) {
                    alt33=2;
                }
                else if ( LA33_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2) ) {
                    alt33=3;
                }
                else if ( LA33_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3) ) {
                    alt33=4;
                }
                else if ( (LA33_0==RULE_INT|| LA33_0 >=55 && LA33_0<=58) && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4) ) {
                    alt33=5;
                }
                else if ( LA33_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5) ) {
                    alt33=6;
                }
                else if ( (LA33_0==RULE_ID||LA33_0==29|| LA33_0 >=31 && LA33_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6) ) {
                    alt33=7;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2333:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2333:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2334:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2334:106: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2335:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2338:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2338:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2338:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2338:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleIndicator5908); 

            	        	newLeafNode(otherlv_4, grammarAccess.getIndicatorAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5920); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2346:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2347:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2347:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2348:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator5937); 

            	    			newLeafNode(lv_label_6_0, grammarAccess.getIndicatorAccess().getLabelSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"label",
            	            		lv_label_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5954); 

            	        	newLeafNode(otherlv_7, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2375:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2375:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2376:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2376:106: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2377:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2380:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2380:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2380:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2380:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleIndicator6022); 

            	        	newLeafNode(otherlv_8, grammarAccess.getIndicatorAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleIndicator6034); 

            	        	newLeafNode(otherlv_9, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2388:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2389:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2389:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2390:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator6051); 

            	    			newLeafNode(lv_description_10_0, grammarAccess.getIndicatorAccess().getDescriptionSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6068); 

            	        	newLeafNode(otherlv_11, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2417:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2417:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2418:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2418:106: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2419:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2422:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2422:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2422:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2422:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleIndicator6136); 

            	        	newLeafNode(otherlv_12, grammarAccess.getIndicatorAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleIndicator6148); 

            	        	newLeafNode(otherlv_13, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2430:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2431:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2431:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2432:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleIndicator6169);
            	    lv_fillColor_14_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"fillColor",
            	            		lv_fillColor_14_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6181); 

            	        	newLeafNode(otherlv_15, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2459:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2459:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2460:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2460:106: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2461:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2464:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2464:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2464:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2464:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleIndicator6249); 

            	        	newLeafNode(otherlv_16, grammarAccess.getIndicatorAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleIndicator6261); 

            	        	newLeafNode(otherlv_17, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2472:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2473:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2473:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2474:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleIndicator6282);
            	    lv_decompositionType_18_0=ruleDecompositionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"decompositionType",
            	            		lv_decompositionType_18_0, 
            	            		"DecompositionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6294); 

            	        	newLeafNode(otherlv_19, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2501:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2501:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2502:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2502:106: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2503:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt30=2;
            	    int LA30_0 = input.LA(1);

            	    if ( ((LA30_0>=55 && LA30_0<=58)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2507:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2507:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2508:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getIndicatorAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleIndicator6372);
            	            lv_importance_20_0=ruleImportanceType();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
            	            	        }
            	                   		set(
            	                   			current, 
            	                   			"importance",
            	                    		lv_importance_20_0, 
            	                    		"ImportanceType");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2525:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2525:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2526:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2526:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2527:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIndicator6395); 

            	            			newLeafNode(lv_importanceQuantitative_21_0, grammarAccess.getIndicatorAccess().getImportanceQuantitativeINTTerminalRuleCall_3_4_0_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getIndicatorRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"importanceQuantitative",
            	                    		lv_importanceQuantitative_21_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6413); 

            	        	newLeafNode(otherlv_22, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2554:4: ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2554:4: ({...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2555:5: {...}? => ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2555:106: ( ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2556:6: ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2559:6: ({...}? => ( (lv_metaData_23_0= ruleMetadata ) ) )+
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
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2559:7: {...}? => ( (lv_metaData_23_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2559:16: ( (lv_metaData_23_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2560:1: (lv_metaData_23_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2560:1: (lv_metaData_23_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2561:3: lv_metaData_23_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getMetaDataMetadataParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleIndicator6489);
            	    	    lv_metaData_23_0=ruleMetadata();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"metaData",
            	    	            		lv_metaData_23_0, 
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2584:4: ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2584:4: ({...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2585:5: {...}? => ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2585:106: ( ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2586:6: ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2589:6: ({...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) ) )+
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
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2589:7: {...}? => ( (lv_elementLinks_24_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2589:16: ( (lv_elementLinks_24_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2590:1: (lv_elementLinks_24_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2590:1: (lv_elementLinks_24_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2591:3: lv_elementLinks_24_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getElementLinksInLineElementLinkParserRuleCall_3_6_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleIndicator6565);
            	    	    lv_elementLinks_24_0=ruleInLineElementLink();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"elementLinks",
            	    	            		lv_elementLinks_24_0, 
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	

            }

            otherlv_25=(Token)match(input,15,FOLLOW_15_in_ruleIndicator6618); 

                	newLeafNode(otherlv_25, grammarAccess.getIndicatorAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2633:1: entryRuleBelief returns [EObject current=null] : iv_ruleBelief= ruleBelief EOF ;
    public final EObject entryRuleBelief() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelief = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2634:2: (iv_ruleBelief= ruleBelief EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2635:2: iv_ruleBelief= ruleBelief EOF
            {
             newCompositeNode(grammarAccess.getBeliefRule()); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief6654);
            iv_ruleBelief=ruleBelief();

            state._fsp--;

             current =iv_ruleBelief; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief6664); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2642:1: ruleBelief returns [EObject current=null] : (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) )* ) ) ) otherlv_12= '}' ) ;
    public final EObject ruleBelief() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_description_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_metaData_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2645:28: ( (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) )* ) ) ) otherlv_12= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2646:1: (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) )* ) ) ) otherlv_12= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2646:1: (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) )* ) ) ) otherlv_12= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2646:3: otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) )* ) ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleBelief6701); 

                	newLeafNode(otherlv_0, grammarAccess.getBeliefAccess().getBeliefKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2650:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2651:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2651:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2652:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBelief6718); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBelief6735); 

                	newLeafNode(otherlv_2, grammarAccess.getBeliefAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2672:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2674:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2674:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2675:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2678:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2679:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2679:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) )*
            loop35:
            do {
                int alt35=4;
                int LA35_0 = input.LA(1);

                if ( LA35_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0) ) {
                    alt35=1;
                }
                else if ( LA35_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1) ) {
                    alt35=2;
                }
                else if ( LA35_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 2) ) {
                    alt35=3;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2681:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2681:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2682:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2682:103: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2683:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2686:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2686:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2686:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2686:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleBelief6793); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBeliefAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleBelief6805); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBeliefAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2694:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2695:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2695:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2696:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelief6822); 

            	    			newLeafNode(lv_label_6_0, grammarAccess.getBeliefAccess().getLabelSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBeliefRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"label",
            	            		lv_label_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleBelief6839); 

            	        	newLeafNode(otherlv_7, grammarAccess.getBeliefAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2723:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2723:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2724:5: {...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2724:103: ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2725:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2728:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
            	    int cnt34=0;
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==51) ) {
            	            int LA34_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt34=1;
            	            }


            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2728:7: {...}? => ( (lv_metaData_8_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleBelief", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2728:16: ( (lv_metaData_8_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2729:1: (lv_metaData_8_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2729:1: (lv_metaData_8_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2730:3: lv_metaData_8_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getBeliefAccess().getMetaDataMetadataParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleBelief6915);
            	    	    lv_metaData_8_0=ruleMetadata();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getBeliefRule());
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
            	    	    if ( cnt34 >= 1 ) break loop34;
            	                EarlyExitException eee =
            	                    new EarlyExitException(34, input);
            	                throw eee;
            	        }
            	        cnt34++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2753:4: ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2753:4: ({...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2754:5: {...}? => ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2754:103: ( ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2755:6: ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2758:6: ({...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2758:7: {...}? => (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2758:16: (otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2758:18: otherlv_9= 'description' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleBelief6983); 

            	        	newLeafNode(otherlv_9, grammarAccess.getBeliefAccess().getDescriptionKeyword_3_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2762:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2763:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2763:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2764:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelief7000); 

            	    			newLeafNode(lv_description_10_0, grammarAccess.getBeliefAccess().getDescriptionSTRINGTerminalRuleCall_3_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBeliefRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleBelief7017); 

            	        	newLeafNode(otherlv_11, grammarAccess.getBeliefAccess().getSemicolonKeyword_3_2_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	

            }

            otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleBelief7070); 

                	newLeafNode(otherlv_12, grammarAccess.getBeliefAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2810:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2811:2: (iv_ruleDecomposition= ruleDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2812:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             newCompositeNode(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition7106);
            iv_ruleDecomposition=ruleDecomposition();

            state._fsp--;

             current =iv_ruleDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition7116); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2819:1: ruleDecomposition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2822:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2823:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2823:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2823:2: ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2823:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2824:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2824:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2825:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecompositionAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecomposition7164);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleDecomposition7176); 

                	newLeafNode(otherlv_1, grammarAccess.getDecompositionAccess().getDecomposedByKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2842:1: ( (lv_dest_2_0= ruleDecompositionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2843:1: (lv_dest_2_0= ruleDecompositionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2843:1: (lv_dest_2_0= ruleDecompositionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2844:3: lv_dest_2_0= ruleDecompositionEnd
            {
             
            	        newCompositeNode(grammarAccess.getDecompositionAccess().getDestDecompositionEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleDecomposition7197);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2860:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2860:4: otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDecomposition7210); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDecompositionAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2864:1: ( (lv_dest_4_0= ruleDecompositionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2865:1: (lv_dest_4_0= ruleDecompositionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2865:1: (lv_dest_4_0= ruleDecompositionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2866:3: lv_dest_4_0= ruleDecompositionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDecompositionAccess().getDestDecompositionEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleDecomposition7231);
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
            	    break loop36;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDecomposition7245); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2894:1: entryRuleInLineDecomposition returns [EObject current=null] : iv_ruleInLineDecomposition= ruleInLineDecomposition EOF ;
    public final EObject entryRuleInLineDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2895:2: (iv_ruleInLineDecomposition= ruleInLineDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2896:2: iv_ruleInLineDecomposition= ruleInLineDecomposition EOF
            {
             newCompositeNode(grammarAccess.getInLineDecompositionRule()); 
            pushFollow(FOLLOW_ruleInLineDecomposition_in_entryRuleInLineDecomposition7281);
            iv_ruleInLineDecomposition=ruleInLineDecomposition();

            state._fsp--;

             current =iv_ruleInLineDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineDecomposition7291); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2903:1: ruleInLineDecomposition returns [EObject current=null] : (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2906:28: ( (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2907:1: (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2907:1: (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2907:3: otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleInLineDecomposition7328); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineDecompositionAccess().getDecomposedByKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2911:1: ( (lv_dest_1_0= ruleDecompositionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2912:1: (lv_dest_1_0= ruleDecompositionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2912:1: (lv_dest_1_0= ruleDecompositionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2913:3: lv_dest_1_0= ruleDecompositionEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineDecompositionAccess().getDestDecompositionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition7349);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2929:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==30) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2929:4: otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleInLineDecomposition7362); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineDecompositionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2933:1: ( (lv_dest_3_0= ruleDecompositionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2934:1: (lv_dest_3_0= ruleDecompositionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2934:1: (lv_dest_3_0= ruleDecompositionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2935:3: lv_dest_3_0= ruleDecompositionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineDecompositionAccess().getDestDecompositionEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition7383);
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
            	    break loop37;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleInLineDecomposition7397); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2963:1: entryRuleDecompositionEnd returns [EObject current=null] : iv_ruleDecompositionEnd= ruleDecompositionEnd EOF ;
    public final EObject entryRuleDecompositionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecompositionEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2964:2: (iv_ruleDecompositionEnd= ruleDecompositionEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2965:2: iv_ruleDecompositionEnd= ruleDecompositionEnd EOF
            {
             newCompositeNode(grammarAccess.getDecompositionEndRule()); 
            pushFollow(FOLLOW_ruleDecompositionEnd_in_entryRuleDecompositionEnd7433);
            iv_ruleDecompositionEnd=ruleDecompositionEnd();

            state._fsp--;

             current =iv_ruleDecompositionEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecompositionEnd7443); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2972:1: ruleDecompositionEnd returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) ;
    public final EObject ruleDecompositionEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2975:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2976:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2976:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2976:2: ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2976:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2977:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2977:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2978:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecompositionEndAccess().getNameIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecompositionEnd7491);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2991:2: (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==14) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2991:4: otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDecompositionEnd7504); 

                        	newLeafNode(otherlv_1, grammarAccess.getDecompositionEndAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2995:1: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==RULE_STRING) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2996:1: (lv_description_2_0= RULE_STRING )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2996:1: (lv_description_2_0= RULE_STRING )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2997:3: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecompositionEnd7521); 

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

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDecompositionEnd7539); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3025:1: entryRuleContribution returns [EObject current=null] : iv_ruleContribution= ruleContribution EOF ;
    public final EObject entryRuleContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3026:2: (iv_ruleContribution= ruleContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3027:2: iv_ruleContribution= ruleContribution EOF
            {
             newCompositeNode(grammarAccess.getContributionRule()); 
            pushFollow(FOLLOW_ruleContribution_in_entryRuleContribution7577);
            iv_ruleContribution=ruleContribution();

            state._fsp--;

             current =iv_ruleContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContribution7587); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3034:1: ruleContribution returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3037:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3038:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3038:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3038:2: ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3038:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3039:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3039:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3040:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContribution7635);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleContribution7647); 

                	newLeafNode(otherlv_1, grammarAccess.getContributionAccess().getContributeToKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3057:1: ( (lv_dest_2_0= ruleContributionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3058:1: (lv_dest_2_0= ruleContributionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3058:1: (lv_dest_2_0= ruleContributionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3059:3: lv_dest_2_0= ruleContributionEnd
            {
             
            	        newCompositeNode(grammarAccess.getContributionAccess().getDestContributionEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleContributionEnd_in_ruleContribution7668);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3075:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==30) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3075:4: otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleContribution7681); 

            	        	newLeafNode(otherlv_3, grammarAccess.getContributionAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3079:1: ( (lv_dest_4_0= ruleContributionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3080:1: (lv_dest_4_0= ruleContributionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3080:1: (lv_dest_4_0= ruleContributionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3081:3: lv_dest_4_0= ruleContributionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionAccess().getDestContributionEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionEnd_in_ruleContribution7702);
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
            	    break loop40;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleContribution7716); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3109:1: entryRuleInLineContribution returns [EObject current=null] : iv_ruleInLineContribution= ruleInLineContribution EOF ;
    public final EObject entryRuleInLineContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3110:2: (iv_ruleInLineContribution= ruleInLineContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3111:2: iv_ruleInLineContribution= ruleInLineContribution EOF
            {
             newCompositeNode(grammarAccess.getInLineContributionRule()); 
            pushFollow(FOLLOW_ruleInLineContribution_in_entryRuleInLineContribution7752);
            iv_ruleInLineContribution=ruleInLineContribution();

            state._fsp--;

             current =iv_ruleInLineContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineContribution7762); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3118:1: ruleInLineContribution returns [EObject current=null] : (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3121:28: ( (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3122:1: (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3122:1: (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3122:3: otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleInLineContribution7799); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineContributionAccess().getContributeToKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3126:1: ( (lv_dest_1_0= ruleContributionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3127:1: (lv_dest_1_0= ruleContributionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3127:1: (lv_dest_1_0= ruleContributionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3128:3: lv_dest_1_0= ruleContributionEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineContributionAccess().getDestContributionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleContributionEnd_in_ruleInLineContribution7820);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3144:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==30) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3144:4: otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleInLineContribution7833); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineContributionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3148:1: ( (lv_dest_3_0= ruleContributionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3149:1: (lv_dest_3_0= ruleContributionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3149:1: (lv_dest_3_0= ruleContributionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3150:3: lv_dest_3_0= ruleContributionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineContributionAccess().getDestContributionEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionEnd_in_ruleInLineContribution7854);
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
            	    break loop41;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleInLineContribution7868); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3178:1: entryRuleContributionEnd returns [EObject current=null] : iv_ruleContributionEnd= ruleContributionEnd EOF ;
    public final EObject entryRuleContributionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3179:2: (iv_ruleContributionEnd= ruleContributionEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3180:2: iv_ruleContributionEnd= ruleContributionEnd EOF
            {
             newCompositeNode(grammarAccess.getContributionEndRule()); 
            pushFollow(FOLLOW_ruleContributionEnd_in_entryRuleContributionEnd7904);
            iv_ruleContributionEnd=ruleContributionEnd();

            state._fsp--;

             current =iv_ruleContributionEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionEnd7914); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3187:1: ruleContributionEnd returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ) ;
    public final EObject ruleContributionEnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_quantitativeContribution_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_contribution_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3190:28: ( ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3191:1: ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3191:1: ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3191:2: ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3191:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==RULE_ID) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3192:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3192:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3193:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionEnd7956); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3209:3: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3210:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3210:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3211:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionEndAccess().getDesnameIntentionalElementCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionEnd7985);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3224:2: (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==14) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3224:4: otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContributionEnd7998); 

                        	newLeafNode(otherlv_2, grammarAccess.getContributionEndAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3228:1: ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )?
                    int alt43=3;
                    int LA43_0 = input.LA(1);

                    if ( ((LA43_0>=62 && LA43_0<=68)) ) {
                        alt43=1;
                    }
                    else if ( (LA43_0==RULE_INT) ) {
                        alt43=2;
                    }
                    switch (alt43) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3228:2: ( (lv_contribution_3_0= ruleContributionType ) )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3228:2: ( (lv_contribution_3_0= ruleContributionType ) )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3229:1: (lv_contribution_3_0= ruleContributionType )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3229:1: (lv_contribution_3_0= ruleContributionType )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3230:3: lv_contribution_3_0= ruleContributionType
                            {
                             
                            	        newCompositeNode(grammarAccess.getContributionEndAccess().getContributionContributionTypeEnumRuleCall_2_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContributionType_in_ruleContributionEnd8020);
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
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3247:6: ( (lv_quantitativeContribution_4_0= RULE_INT ) )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3247:6: ( (lv_quantitativeContribution_4_0= RULE_INT ) )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3248:1: (lv_quantitativeContribution_4_0= RULE_INT )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3248:1: (lv_quantitativeContribution_4_0= RULE_INT )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3249:3: lv_quantitativeContribution_4_0= RULE_INT
                            {
                            lv_quantitativeContribution_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionEnd8043); 

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

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleContributionEnd8062); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3277:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3278:2: (iv_ruleDependency= ruleDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3279:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency8100);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency8110); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3286:1: ruleDependency returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3289:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3290:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3290:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3290:2: ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3290:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3291:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3291:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3292:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependency8158);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleDependency8170); 

                	newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getDependOnKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3309:1: ( (lv_dest_2_0= ruleDependencyEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3310:1: (lv_dest_2_0= ruleDependencyEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3310:1: (lv_dest_2_0= ruleDependencyEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3311:3: lv_dest_2_0= ruleDependencyEnd
            {
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getDestDependencyEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyEnd_in_ruleDependency8191);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3327:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==30) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3327:4: otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDependency8204); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3331:1: ( (lv_dest_4_0= ruleDependencyEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3332:1: (lv_dest_4_0= ruleDependencyEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3332:1: (lv_dest_4_0= ruleDependencyEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3333:3: lv_dest_4_0= ruleDependencyEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependencyAccess().getDestDependencyEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyEnd_in_ruleDependency8225);
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
            	    break loop45;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDependency8239); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3361:1: entryRuleInLineDependency returns [EObject current=null] : iv_ruleInLineDependency= ruleInLineDependency EOF ;
    public final EObject entryRuleInLineDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3362:2: (iv_ruleInLineDependency= ruleInLineDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3363:2: iv_ruleInLineDependency= ruleInLineDependency EOF
            {
             newCompositeNode(grammarAccess.getInLineDependencyRule()); 
            pushFollow(FOLLOW_ruleInLineDependency_in_entryRuleInLineDependency8275);
            iv_ruleInLineDependency=ruleInLineDependency();

            state._fsp--;

             current =iv_ruleInLineDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineDependency8285); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3370:1: ruleInLineDependency returns [EObject current=null] : (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3373:28: ( (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3374:1: (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3374:1: (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3374:3: otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleInLineDependency8322); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineDependencyAccess().getDependOnKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3378:1: ( (lv_dest_1_0= ruleDependencyEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3379:1: (lv_dest_1_0= ruleDependencyEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3379:1: (lv_dest_1_0= ruleDependencyEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3380:3: lv_dest_1_0= ruleDependencyEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineDependencyAccess().getDestDependencyEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyEnd_in_ruleInLineDependency8343);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3396:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==30) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3396:4: otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleInLineDependency8356); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineDependencyAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3400:1: ( (lv_dest_3_0= ruleDependencyEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3401:1: (lv_dest_3_0= ruleDependencyEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3401:1: (lv_dest_3_0= ruleDependencyEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3402:3: lv_dest_3_0= ruleDependencyEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineDependencyAccess().getDestDependencyEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyEnd_in_ruleInLineDependency8377);
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
            	    break loop46;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleInLineDependency8391); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3430:1: entryRuleDependencyEnd returns [EObject current=null] : iv_ruleDependencyEnd= ruleDependencyEnd EOF ;
    public final EObject entryRuleDependencyEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3431:2: (iv_ruleDependencyEnd= ruleDependencyEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3432:2: iv_ruleDependencyEnd= ruleDependencyEnd EOF
            {
             newCompositeNode(grammarAccess.getDependencyEndRule()); 
            pushFollow(FOLLOW_ruleDependencyEnd_in_entryRuleDependencyEnd8427);
            iv_ruleDependencyEnd=ruleDependencyEnd();

            state._fsp--;

             current =iv_ruleDependencyEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyEnd8437); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3439:1: ruleDependencyEnd returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) ;
    public final EObject ruleDependencyEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3442:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3443:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3443:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3443:2: ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3443:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3444:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3444:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3445:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyEndAccess().getNameIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependencyEnd8485);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3458:2: (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==14) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3458:4: otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDependencyEnd8498); 

                        	newLeafNode(otherlv_1, grammarAccess.getDependencyEndAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3462:1: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_STRING) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3463:1: (lv_description_2_0= RULE_STRING )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3463:1: (lv_description_2_0= RULE_STRING )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3464:3: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependencyEnd8515); 

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

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDependencyEnd8533); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3492:1: entryRuleStrategyGroup returns [EObject current=null] : iv_ruleStrategyGroup= ruleStrategyGroup EOF ;
    public final EObject entryRuleStrategyGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategyGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3493:2: (iv_ruleStrategyGroup= ruleStrategyGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3494:2: iv_ruleStrategyGroup= ruleStrategyGroup EOF
            {
             newCompositeNode(grammarAccess.getStrategyGroupRule()); 
            pushFollow(FOLLOW_ruleStrategyGroup_in_entryRuleStrategyGroup8571);
            iv_ruleStrategyGroup=ruleStrategyGroup();

            state._fsp--;

             current =iv_ruleStrategyGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrategyGroup8581); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3501:1: ruleStrategyGroup returns [EObject current=null] : (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleStrategyGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3504:28: ( (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3505:1: (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3505:1: (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3505:3: otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleStrategyGroup8618); 

                	newLeafNode(otherlv_0, grammarAccess.getStrategyGroupAccess().getStrategyGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3509:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3510:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3510:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3511:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStrategyGroup8635); 

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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleStrategyGroup8652); 

                	newLeafNode(otherlv_2, grammarAccess.getStrategyGroupAccess().getIncludesKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3531:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3532:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3532:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3533:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStrategyGroupRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStrategyGroupAccess().getStrategiesEvaluationStrategyCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8675);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3546:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==30) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3546:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleStrategyGroup8688); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStrategyGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3550:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3551:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3551:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3552:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStrategyGroupRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getStrategyGroupAccess().getStrategiesEvaluationStrategyCrossReference_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8711);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleStrategyGroup8725); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3577:1: entryRuleEvaluationStrategy returns [EObject current=null] : iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF ;
    public final EObject entryRuleEvaluationStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationStrategy = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3578:2: (iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3579:2: iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF
            {
             newCompositeNode(grammarAccess.getEvaluationStrategyRule()); 
            pushFollow(FOLLOW_ruleEvaluationStrategy_in_entryRuleEvaluationStrategy8761);
            iv_ruleEvaluationStrategy=ruleEvaluationStrategy();

            state._fsp--;

             current =iv_ruleEvaluationStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationStrategy8771); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3586:1: ruleEvaluationStrategy returns [EObject current=null] : (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3589:28: ( (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3590:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3590:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3590:3: otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleEvaluationStrategy8808); 

                	newLeafNode(otherlv_0, grammarAccess.getEvaluationStrategyAccess().getStrategyKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3594:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3595:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3595:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3596:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvaluationStrategy8825); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3612:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==36) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3612:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleEvaluationStrategy8843); 

                        	newLeafNode(otherlv_2, grammarAccess.getEvaluationStrategyAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3616:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3617:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3617:1: ( ruleQualifiedName )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3618:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getSuperStrategiesEvaluationStrategyCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy8866);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3631:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==30) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3631:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleEvaluationStrategy8879); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getEvaluationStrategyAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3635:1: ( ( ruleQualifiedName ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3636:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3636:1: ( ruleQualifiedName )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3637:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getSuperStrategiesEvaluationStrategyCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy8902);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEvaluationStrategy8918); 

                	newLeafNode(otherlv_6, grammarAccess.getEvaluationStrategyAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3654:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3656:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3656:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3657:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3660:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3661:3: ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3661:3: ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) ) )*
            loop54:
            do {
                int alt54=3;
                int LA54_0 = input.LA(1);

                if ( LA54_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 0) ) {
                    alt54=1;
                }
                else if ( LA54_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 1) ) {
                    alt54=2;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3663:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3663:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3664:5: {...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationStrategy", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3664:115: ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3665:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3668:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
            	    int cnt52=0;
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( (LA52_0==51) ) {
            	            int LA52_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt52=1;
            	            }


            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3668:7: {...}? => ( (lv_metaData_8_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleEvaluationStrategy", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3668:16: ( (lv_metaData_8_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3669:1: (lv_metaData_8_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3669:1: (lv_metaData_8_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3670:3: lv_metaData_8_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getMetaDataMetadataParserRuleCall_4_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleEvaluationStrategy8984);
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
            	    	    if ( cnt52 >= 1 ) break loop52;
            	                EarlyExitException eee =
            	                    new EarlyExitException(52, input);
            	                throw eee;
            	        }
            	        cnt52++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3693:4: ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3693:4: ({...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3694:5: {...}? => ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationStrategy", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3694:115: ( ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3695:6: ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3698:6: ({...}? => ( (lv_evaluations_9_0= ruleEvaluation ) ) )+
            	    int cnt53=0;
            	    loop53:
            	    do {
            	        int alt53=2;
            	        int LA53_0 = input.LA(1);

            	        if ( (LA53_0==RULE_ID) ) {
            	            int LA53_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt53=1;
            	            }


            	        }


            	        switch (alt53) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3698:7: {...}? => ( (lv_evaluations_9_0= ruleEvaluation ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleEvaluationStrategy", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3698:16: ( (lv_evaluations_9_0= ruleEvaluation ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3699:1: (lv_evaluations_9_0= ruleEvaluation )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3699:1: (lv_evaluations_9_0= ruleEvaluation )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3700:3: lv_evaluations_9_0= ruleEvaluation
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getEvaluationsEvaluationParserRuleCall_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleEvaluation_in_ruleEvaluationStrategy9060);
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
            	    	    if ( cnt53 >= 1 ) break loop53;
            	                EarlyExitException eee =
            	                    new EarlyExitException(53, input);
            	                throw eee;
            	        }
            	        cnt53++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEvaluationStrategyAccess().getUnorderedGroup_4());
            	

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEvaluationStrategy9113); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3742:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3743:2: (iv_ruleEvaluation= ruleEvaluation EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3744:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation9149);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation9159); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3751:1: ruleEvaluation returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3754:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3755:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3755:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3755:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3755:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3756:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3756:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3757:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEvaluationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEvaluationAccess().getIntentionalElementIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluation9207);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation9219); 

                	newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3774:1: ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==55||LA55_0==65||(LA55_0>=69 && LA55_0<=73)) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_INT) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3774:2: ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3774:2: ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3775:1: (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3775:1: (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3776:3: lv_qualitativeEvaluation_2_0= ruleQualitativeLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvaluationAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleEvaluation9241);
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3793:6: ( (lv_evaluation_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3793:6: ( (lv_evaluation_3_0= RULE_INT ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3794:1: (lv_evaluation_3_0= RULE_INT )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3794:1: (lv_evaluation_3_0= RULE_INT )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3795:3: lv_evaluation_3_0= RULE_INT
                    {
                    lv_evaluation_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluation9264); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3811:3: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=14 && LA59_0<=15)||(LA59_0>=38 && LA59_0<=46)) ) {
                alt59=1;
            }
            else if ( (LA59_0==19) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3811:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3811:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3813:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3813:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3814:2: ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?)
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3817:2: ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?)
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3818:3: ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3818:3: ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=4;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==15) ) {
                            int LA58_2 = input.LA(2);

                            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2) ) {
                                alt58=3;
                            }


                        }
                        else if ( LA58_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0) ) {
                            alt58=1;
                        }
                        else if ( LA58_0 >=38 && LA58_0<=40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1) ) {
                            alt58=2;
                        }
                        else if ( LA58_0 >=41 && LA58_0<=46 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2) ) {
                            alt58=3;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3820:4: ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3820:4: ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3821:5: {...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3821:109: ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3822:6: ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3825:6: ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3825:7: {...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3825:16: (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3825:18: otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )?
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEvaluation9329); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3_0_0_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3829:1: ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )?
                    	    int alt56=2;
                    	    int LA56_0 = input.LA(1);

                    	    if ( (LA56_0==37) ) {
                    	        alt56=1;
                    	    }
                    	    switch (alt56) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3829:2: ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';'
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3829:2: ( (lv_exceeds_6_0= 'exceeds' ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3830:1: (lv_exceeds_6_0= 'exceeds' )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3830:1: (lv_exceeds_6_0= 'exceeds' )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3831:3: lv_exceeds_6_0= 'exceeds'
                    	            {
                    	            lv_exceeds_6_0=(Token)match(input,37,FOLLOW_37_in_ruleEvaluation9348); 

                    	                    newLeafNode(lv_exceeds_6_0, grammarAccess.getEvaluationAccess().getExceedsExceedsKeyword_3_0_0_1_0_0());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getEvaluationRule());
                    	            	        }
                    	                   		setWithLastConsumed(current, "exceeds", true, "exceeds");
                    	            	    

                    	            }


                    	            }

                    	            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation9373); 

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
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3855:4: ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3855:4: ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3856:5: {...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3856:109: ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3857:6: ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3860:6: ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3860:7: {...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3860:16: ( (lv_evalRange_8_0= ruleEvaluationRange ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3861:1: (lv_evalRange_8_0= ruleEvaluationRange )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3861:1: (lv_evalRange_8_0= ruleEvaluationRange )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3862:3: lv_evalRange_8_0= ruleEvaluationRange
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getEvalRangeEvaluationRangeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvaluationRange_in_ruleEvaluation9451);
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
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3885:4: ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3885:4: ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3886:5: {...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3886:109: ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3887:6: ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3890:6: ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3890:7: {...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3890:16: ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3890:17: ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}'
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3890:17: ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )?
                    	    int alt57=2;
                    	    int LA57_0 = input.LA(1);

                    	    if ( ((LA57_0>=41 && LA57_0<=46)) ) {
                    	        alt57=1;
                    	    }
                    	    switch (alt57) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3891:1: (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3891:1: (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3892:3: lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getEvaluationAccess().getKpiEvalValueSetKPIEvalValueSetParserRuleCall_3_0_2_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation9527);
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

                    	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEvaluation9540); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_3_0_2_1());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3928:7: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation9605); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3940:1: entryRuleEvaluationRange returns [EObject current=null] : iv_ruleEvaluationRange= ruleEvaluationRange EOF ;
    public final EObject entryRuleEvaluationRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3941:2: (iv_ruleEvaluationRange= ruleEvaluationRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3942:2: iv_ruleEvaluationRange= ruleEvaluationRange EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRangeRule()); 
            pushFollow(FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange9642);
            iv_ruleEvaluationRange=ruleEvaluationRange();

            state._fsp--;

             current =iv_ruleEvaluationRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationRange9652); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3949:1: ruleEvaluationRange returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3952:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3953:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3953:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3955:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3955:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3956:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3959:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3960:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3960:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+
            int cnt60=0;
            loop60:
            do {
                int alt60=4;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA60_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0) ) {
                        alt60=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA60_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1) ) {
                        alt60=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA60_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2) ) {
                        alt60=3;
                    }


                    }
                    break;

                }

                switch (alt60) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3962:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3962:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3963:5: {...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3963:110: ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3964:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3967:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3967:7: {...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3967:16: (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3967:18: otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleEvaluationRange9734); 

            	        	newLeafNode(otherlv_1, grammarAccess.getEvaluationRangeAccess().getStartKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange9746); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3975:1: ( (lv_start_3_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3976:1: (lv_start_3_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3976:1: (lv_start_3_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3977:3: lv_start_3_0= RULE_INT
            	    {
            	    lv_start_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange9763); 

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

            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange9780); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4004:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4004:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4005:5: {...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4005:110: ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4006:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4009:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4009:7: {...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4009:16: (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4009:18: otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleEvaluationRange9848); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEvaluationRangeAccess().getEndKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange9860); 

            	        	newLeafNode(otherlv_6, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4017:1: ( (lv_end_7_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4018:1: (lv_end_7_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4018:1: (lv_end_7_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4019:3: lv_end_7_0= RULE_INT
            	    {
            	    lv_end_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange9877); 

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

            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange9894); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4046:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4046:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4047:5: {...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4047:110: ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4048:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4051:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4051:7: {...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4051:16: (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4051:18: otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleEvaluationRange9962); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEvaluationRangeAccess().getStepKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange9974); 

            	        	newLeafNode(otherlv_10, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4059:1: ( (lv_step_11_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4060:1: (lv_step_11_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4060:1: (lv_step_11_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4061:3: lv_step_11_0= RULE_INT
            	    {
            	    lv_step_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange9991); 

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

            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange10008); 

            	        	newLeafNode(otherlv_12, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	    	 				

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4104:1: entryRuleKPIEvalValueSet returns [EObject current=null] : iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF ;
    public final EObject entryRuleKPIEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4105:2: (iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4106:2: iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet10090);
            iv_ruleKPIEvalValueSet=ruleKPIEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIEvalValueSet10100); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4113:1: ruleKPIEvalValueSet returns [EObject current=null] : (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet ) ;
    public final EObject ruleKPIEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject this_KPIQuantitativeEvalValueSet_0 = null;

        EObject this_KPIQualitativeEvalValueSet_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4116:28: ( (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4117:1: (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4117:1: (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( ((LA61_0>=41 && LA61_0<=45)) ) {
                alt61=1;
            }
            else if ( (LA61_0==46) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4118:5: this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet
                    {
                     
                            newCompositeNode(grammarAccess.getKPIEvalValueSetAccess().getKPIQuantitativeEvalValueSetParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleKPIQuantitativeEvalValueSet_in_ruleKPIEvalValueSet10147);
                    this_KPIQuantitativeEvalValueSet_0=ruleKPIQuantitativeEvalValueSet();

                    state._fsp--;

                     
                            current = this_KPIQuantitativeEvalValueSet_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4128:5: this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet
                    {
                     
                            newCompositeNode(grammarAccess.getKPIEvalValueSetAccess().getKPIQualitativeEvalValueSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleKPIQualitativeEvalValueSet_in_ruleKPIEvalValueSet10174);
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4144:1: entryRuleKPIQuantitativeEvalValueSet returns [EObject current=null] : iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF ;
    public final EObject entryRuleKPIQuantitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIQuantitativeEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4145:2: (iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4146:2: iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIQuantitativeEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIQuantitativeEvalValueSet_in_entryRuleKPIQuantitativeEvalValueSet10209);
            iv_ruleKPIQuantitativeEvalValueSet=ruleKPIQuantitativeEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIQuantitativeEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIQuantitativeEvalValueSet10219); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4153:1: ruleKPIQuantitativeEvalValueSet returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4156:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4157:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4157:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4159:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4159:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4160:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4163:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4164:3: ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4164:3: ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+
            int cnt62=0;
            loop62:
            do {
                int alt62=6;
                int LA62_0 = input.LA(1);

                if ( LA62_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0) ) {
                    alt62=1;
                }
                else if ( LA62_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1) ) {
                    alt62=2;
                }
                else if ( LA62_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2) ) {
                    alt62=3;
                }
                else if ( LA62_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3) ) {
                    alt62=4;
                }
                else if ( LA62_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4) ) {
                    alt62=5;
                }


                switch (alt62) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4166:4: ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4166:4: ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4167:5: {...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4167:122: ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4168:6: ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4171:6: ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4171:7: {...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4171:16: (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4171:18: otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleKPIQuantitativeEvalValueSet10301); 

            	        	newLeafNode(otherlv_1, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getTargetKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet10313); 

            	        	newLeafNode(otherlv_2, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4179:1: ( (lv_targetValue_3_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4180:1: (lv_targetValue_3_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4180:1: (lv_targetValue_3_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4181:3: lv_targetValue_3_0= RULE_DOUBLE
            	    {
            	    lv_targetValue_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10330); 

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

            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10347); 

            	        	newLeafNode(otherlv_4, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4208:4: ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4208:4: ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4209:5: {...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4209:122: ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4210:6: ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4213:6: ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4213:7: {...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4213:16: (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4213:18: otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleKPIQuantitativeEvalValueSet10415); 

            	        	newLeafNode(otherlv_5, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getThresholdKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet10427); 

            	        	newLeafNode(otherlv_6, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4221:1: ( (lv_thresholdValue_7_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4222:1: (lv_thresholdValue_7_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4222:1: (lv_thresholdValue_7_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4223:3: lv_thresholdValue_7_0= RULE_DOUBLE
            	    {
            	    lv_thresholdValue_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10444); 

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

            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10461); 

            	        	newLeafNode(otherlv_8, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4250:4: ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4250:4: ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4251:5: {...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4251:122: ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4252:6: ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4255:6: ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4255:7: {...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4255:16: (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4255:18: otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,43,FOLLOW_43_in_ruleKPIQuantitativeEvalValueSet10529); 

            	        	newLeafNode(otherlv_9, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getWorstKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet10541); 

            	        	newLeafNode(otherlv_10, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4263:1: ( (lv_worstValue_11_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4264:1: (lv_worstValue_11_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4264:1: (lv_worstValue_11_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4265:3: lv_worstValue_11_0= RULE_DOUBLE
            	    {
            	    lv_worstValue_11_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10558); 

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

            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10575); 

            	        	newLeafNode(otherlv_12, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4292:4: ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4292:4: ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4293:5: {...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4293:122: ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4294:6: ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4297:6: ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4297:7: {...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4297:16: (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4297:18: otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';'
            	    {
            	    otherlv_13=(Token)match(input,44,FOLLOW_44_in_ruleKPIQuantitativeEvalValueSet10643); 

            	        	newLeafNode(otherlv_13, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEvalKeyword_3_0());
            	        
            	    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet10655); 

            	        	newLeafNode(otherlv_14, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4305:1: ( (lv_evaluationValue_15_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4306:1: (lv_evaluationValue_15_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4306:1: (lv_evaluationValue_15_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4307:3: lv_evaluationValue_15_0= RULE_DOUBLE
            	    {
            	    lv_evaluationValue_15_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10672); 

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

            	    otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10689); 

            	        	newLeafNode(otherlv_16, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4334:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4334:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4335:5: {...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4335:122: ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4336:6: ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4339:6: ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4339:7: {...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4339:16: (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4339:18: otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';'
            	    {
            	    otherlv_17=(Token)match(input,45,FOLLOW_45_in_ruleKPIQuantitativeEvalValueSet10757); 

            	        	newLeafNode(otherlv_17, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnitKeyword_4_0());
            	        
            	    otherlv_18=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet10769); 

            	        	newLeafNode(otherlv_18, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4347:1: ( (lv_unit_19_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4348:1: (lv_unit_19_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4348:1: (lv_unit_19_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4349:3: lv_unit_19_0= RULE_STRING
            	    {
            	    lv_unit_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKPIQuantitativeEvalValueSet10786); 

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

            	    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10803); 

            	        	newLeafNode(otherlv_20, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt62 >= 1 ) break loop62;
                        EarlyExitException eee =
                            new EarlyExitException(62, input);
                        throw eee;
                }
                cnt62++;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4392:1: entryRuleKPIQualitativeEvalValueSet returns [EObject current=null] : iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF ;
    public final EObject entryRuleKPIQualitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIQualitativeEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4393:2: (iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4394:2: iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIQualitativeEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIQualitativeEvalValueSet_in_entryRuleKPIQualitativeEvalValueSet10885);
            iv_ruleKPIQualitativeEvalValueSet=ruleKPIQualitativeEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIQualitativeEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIQualitativeEvalValueSet10895); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4401:1: ruleKPIQualitativeEvalValueSet returns [EObject current=null] : (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleKPIQualitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4404:28: ( (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4405:1: (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4405:1: (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4405:3: otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleKPIQualitativeEvalValueSet10932); 

                	newLeafNode(otherlv_0, grammarAccess.getKPIQualitativeEvalValueSetAccess().getQualevalKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleKPIQualitativeEvalValueSet10944); 

                	newLeafNode(otherlv_1, grammarAccess.getKPIQualitativeEvalValueSetAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4413:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4414:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4414:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4415:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getKPIQualitativeEvalValueSetRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getKPIQualitativeEvalValueSetAccess().getQualitativeEvaluationValueMappingCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleKPIQualitativeEvalValueSet10967);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleKPIQualitativeEvalValueSet10979); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4440:1: entryRuleQualitativeMapping returns [EObject current=null] : iv_ruleQualitativeMapping= ruleQualitativeMapping EOF ;
    public final EObject entryRuleQualitativeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeMapping = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4441:2: (iv_ruleQualitativeMapping= ruleQualitativeMapping EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4442:2: iv_ruleQualitativeMapping= ruleQualitativeMapping EOF
            {
             newCompositeNode(grammarAccess.getQualitativeMappingRule()); 
            pushFollow(FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping11015);
            iv_ruleQualitativeMapping=ruleQualitativeMapping();

            state._fsp--;

             current =iv_ruleQualitativeMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitativeMapping11025); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4449:1: ruleQualitativeMapping returns [EObject current=null] : (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4452:28: ( (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4453:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4453:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4453:3: otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleQualitativeMapping11062); 

                	newLeafNode(otherlv_0, grammarAccess.getQualitativeMappingAccess().getQualitativeMappingKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4457:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4458:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4458:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4459:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeMapping11079); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleQualitativeMapping11096); 

                	newLeafNode(otherlv_2, grammarAccess.getQualitativeMappingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4479:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4481:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4481:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4482:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4485:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4486:3: ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4486:3: ( ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) ) )*
            loop65:
            do {
                int alt65=3;
                int LA65_0 = input.LA(1);

                if ( LA65_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0) ) {
                    alt65=1;
                }
                else if ( LA65_0 ==RULE_STRING && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1) ) {
                    alt65=2;
                }


                switch (alt65) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4488:4: ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4488:4: ({...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4489:5: {...}? => ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4489:115: ( ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4490:6: ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4493:6: ({...}? => ( (lv_metaData_4_0= ruleMetadata ) ) )+
            	    int cnt63=0;
            	    loop63:
            	    do {
            	        int alt63=2;
            	        int LA63_0 = input.LA(1);

            	        if ( (LA63_0==51) ) {
            	            int LA63_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt63=1;
            	            }


            	        }


            	        switch (alt63) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4493:7: {...}? => ( (lv_metaData_4_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4493:16: ( (lv_metaData_4_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4494:1: (lv_metaData_4_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4494:1: (lv_metaData_4_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4495:3: lv_metaData_4_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getQualitativeMappingAccess().getMetaDataMetadataParserRuleCall_3_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleQualitativeMapping11162);
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
            	    	    if ( cnt63 >= 1 ) break loop63;
            	                EarlyExitException eee =
            	                    new EarlyExitException(63, input);
            	                throw eee;
            	        }
            	        cnt63++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4518:4: ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4518:4: ({...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4519:5: {...}? => ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4519:115: ( ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4520:6: ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4523:6: ({...}? => ( (lv_mappin_5_0= ruleMapping ) ) )+
            	    int cnt64=0;
            	    loop64:
            	    do {
            	        int alt64=2;
            	        int LA64_0 = input.LA(1);

            	        if ( (LA64_0==RULE_STRING) ) {
            	            int LA64_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt64=1;
            	            }


            	        }


            	        switch (alt64) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4523:7: {...}? => ( (lv_mappin_5_0= ruleMapping ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4523:16: ( (lv_mappin_5_0= ruleMapping ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4524:1: (lv_mappin_5_0= ruleMapping )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4524:1: (lv_mappin_5_0= ruleMapping )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4525:3: lv_mappin_5_0= ruleMapping
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getQualitativeMappingAccess().getMappinMappingParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMapping_in_ruleQualitativeMapping11238);
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
            	    	    if ( cnt64 >= 1 ) break loop64;
            	                EarlyExitException eee =
            	                    new EarlyExitException(64, input);
            	                throw eee;
            	        }
            	        cnt64++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	

            }

            otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleQualitativeMapping11291); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4567:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4568:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4569:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping11327);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping11337); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4576:1: ruleMapping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4579:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4580:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4580:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4580:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4580:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4581:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4581:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4582:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMapping11379); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMapping11396); 

                	newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getCommaKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4602:1: ( (lv_valuation_2_0= RULE_INT ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4603:1: (lv_valuation_2_0= RULE_INT )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4603:1: (lv_valuation_2_0= RULE_INT )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4604:3: lv_valuation_2_0= RULE_INT
            {
            lv_valuation_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMapping11413); 

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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleMapping11430); 

                	newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getCommaKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4624:1: ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4625:1: (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4625:1: (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4626:3: lv_qualitativeEvaluation_4_0= ruleQualitativeLabel
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleMapping11451);
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

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleMapping11463); 

                	newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getCommaKeyword_5());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4646:1: ( (lv_exceeds_6_0= RULE_BOOLEAN ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4647:1: (lv_exceeds_6_0= RULE_BOOLEAN )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4647:1: (lv_exceeds_6_0= RULE_BOOLEAN )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4648:3: lv_exceeds_6_0= RULE_BOOLEAN
            {
            lv_exceeds_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleMapping11480); 

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

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleMapping11497); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4676:1: entryRuleContributionGroup returns [EObject current=null] : iv_ruleContributionGroup= ruleContributionGroup EOF ;
    public final EObject entryRuleContributionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4677:2: (iv_ruleContributionGroup= ruleContributionGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4678:2: iv_ruleContributionGroup= ruleContributionGroup EOF
            {
             newCompositeNode(grammarAccess.getContributionGroupRule()); 
            pushFollow(FOLLOW_ruleContributionGroup_in_entryRuleContributionGroup11533);
            iv_ruleContributionGroup=ruleContributionGroup();

            state._fsp--;

             current =iv_ruleContributionGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionGroup11543); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4685:1: ruleContributionGroup returns [EObject current=null] : (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4688:28: ( (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4689:1: (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4689:1: (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4689:3: otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleContributionGroup11580); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionGroupAccess().getContributionGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4693:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4694:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4694:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4695:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup11597); 

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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleContributionGroup11614); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionGroupAccess().getIncludesKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4715:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4716:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4716:1: (otherlv_3= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4717:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionGroupRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup11634); 

            		newLeafNode(otherlv_3, grammarAccess.getContributionGroupAccess().getContribsContributionContextCrossReference_3_0()); 
            	

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4728:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==30) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4728:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleContributionGroup11647); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4732:1: ( (otherlv_5= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4733:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4733:1: (otherlv_5= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4734:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionGroupRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup11667); 

            	    		newLeafNode(otherlv_5, grammarAccess.getContributionGroupAccess().getContribsContributionContextCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleContributionGroup11681); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4757:1: entryRuleContributionContext returns [EObject current=null] : iv_ruleContributionContext= ruleContributionContext EOF ;
    public final EObject entryRuleContributionContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionContext = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4758:2: (iv_ruleContributionContext= ruleContributionContext EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4759:2: iv_ruleContributionContext= ruleContributionContext EOF
            {
             newCompositeNode(grammarAccess.getContributionContextRule()); 
            pushFollow(FOLLOW_ruleContributionContext_in_entryRuleContributionContext11717);
            iv_ruleContributionContext=ruleContributionContext();

            state._fsp--;

             current =iv_ruleContributionContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionContext11727); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4766:1: ruleContributionContext returns [EObject current=null] : (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4769:28: ( (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4770:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4770:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4770:3: otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleContributionContext11764); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionContextAccess().getContributionKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4774:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4775:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4775:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4776:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionContext11781); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4792:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==36) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4792:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleContributionContext11799); 

                        	newLeafNode(otherlv_2, grammarAccess.getContributionContextAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4796:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4797:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4797:1: ( ruleQualifiedName )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4798:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContributionContextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContributionContextAccess().getSuperContributionContextsContributionContextCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionContext11822);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4811:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop67:
                    do {
                        int alt67=2;
                        int LA67_0 = input.LA(1);

                        if ( (LA67_0==30) ) {
                            alt67=1;
                        }


                        switch (alt67) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4811:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleContributionContext11835); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getContributionContextAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4815:1: ( ( ruleQualifiedName ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4816:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4816:1: ( ruleQualifiedName )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4817:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getContributionContextRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getContributionContextAccess().getSuperContributionContextsContributionContextCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionContext11858);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop67;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleContributionContext11874); 

                	newLeafNode(otherlv_6, grammarAccess.getContributionContextAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4834:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4836:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4836:1: ( ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4837:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionContextAccess().getUnorderedGroup_4());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4840:2: ( ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4841:3: ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4841:3: ( ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) ) )*
            loop71:
            do {
                int alt71=3;
                int LA71_0 = input.LA(1);

                if ( LA71_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 0) ) {
                    alt71=1;
                }
                else if ( LA71_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 1) ) {
                    alt71=2;
                }


                switch (alt71) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4843:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4843:4: ({...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4844:5: {...}? => ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContributionContext", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4844:116: ( ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4845:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4848:6: ({...}? => ( (lv_metaData_8_0= ruleMetadata ) ) )+
            	    int cnt69=0;
            	    loop69:
            	    do {
            	        int alt69=2;
            	        int LA69_0 = input.LA(1);

            	        if ( (LA69_0==51) ) {
            	            int LA69_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt69=1;
            	            }


            	        }


            	        switch (alt69) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4848:7: {...}? => ( (lv_metaData_8_0= ruleMetadata ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleContributionContext", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4848:16: ( (lv_metaData_8_0= ruleMetadata ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4849:1: (lv_metaData_8_0= ruleMetadata )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4849:1: (lv_metaData_8_0= ruleMetadata )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4850:3: lv_metaData_8_0= ruleMetadata
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContributionContextAccess().getMetaDataMetadataParserRuleCall_4_0_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleMetadata_in_ruleContributionContext11940);
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
            	    	    if ( cnt69 >= 1 ) break loop69;
            	                EarlyExitException eee =
            	                    new EarlyExitException(69, input);
            	                throw eee;
            	        }
            	        cnt69++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionContextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4873:4: ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4873:4: ({...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4874:5: {...}? => ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContributionContext", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4874:116: ( ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4875:6: ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionContextAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4878:6: ({...}? => ( (lv_changes_9_0= ruleContributionChange ) ) )+
            	    int cnt70=0;
            	    loop70:
            	    do {
            	        int alt70=2;
            	        int LA70_0 = input.LA(1);

            	        if ( (LA70_0==RULE_ID) ) {
            	            int LA70_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt70=1;
            	            }


            	        }


            	        switch (alt70) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4878:7: {...}? => ( (lv_changes_9_0= ruleContributionChange ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleContributionContext", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4878:16: ( (lv_changes_9_0= ruleContributionChange ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4879:1: (lv_changes_9_0= ruleContributionChange )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4879:1: (lv_changes_9_0= ruleContributionChange )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4880:3: lv_changes_9_0= ruleContributionChange
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContributionContextAccess().getChangesContributionChangeParserRuleCall_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleContributionChange_in_ruleContributionContext12016);
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
            	    	    if ( cnt70 >= 1 ) break loop70;
            	                EarlyExitException eee =
            	                    new EarlyExitException(70, input);
            	                throw eee;
            	        }
            	        cnt70++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionContextAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContributionContextAccess().getUnorderedGroup_4());
            	

            }

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleContributionContext12069); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4922:1: entryRuleContributionChange returns [EObject current=null] : iv_ruleContributionChange= ruleContributionChange EOF ;
    public final EObject entryRuleContributionChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionChange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4923:2: (iv_ruleContributionChange= ruleContributionChange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4924:2: iv_ruleContributionChange= ruleContributionChange EOF
            {
             newCompositeNode(grammarAccess.getContributionChangeRule()); 
            pushFollow(FOLLOW_ruleContributionChange_in_entryRuleContributionChange12105);
            iv_ruleContributionChange=ruleContributionChange();

            state._fsp--;

             current =iv_ruleContributionChange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionChange12115); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4931:1: ruleContributionChange returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4934:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4935:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4935:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4935:2: ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4935:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4936:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4936:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4937:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionChangeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionChangeAccess().getContributionContributionEndCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionChange12163);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleContributionChange12175); 

                	newLeafNode(otherlv_1, grammarAccess.getContributionChangeAccess().getColonKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4954:1: ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( ((LA72_0>=62 && LA72_0<=68)) ) {
                alt72=1;
            }
            else if ( (LA72_0==RULE_INT) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4954:2: ( (lv_newContribution_2_0= ruleContributionType ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4954:2: ( (lv_newContribution_2_0= ruleContributionType ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4955:1: (lv_newContribution_2_0= ruleContributionType )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4955:1: (lv_newContribution_2_0= ruleContributionType )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4956:3: lv_newContribution_2_0= ruleContributionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getNewContributionContributionTypeEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContributionType_in_ruleContributionChange12197);
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4973:6: ( (lv_newQuantitativeContribution_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4973:6: ( (lv_newQuantitativeContribution_3_0= RULE_INT ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4974:1: (lv_newQuantitativeContribution_3_0= RULE_INT )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4974:1: (lv_newQuantitativeContribution_3_0= RULE_INT )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4975:3: lv_newQuantitativeContribution_3_0= RULE_INT
                    {
                    lv_newQuantitativeContribution_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionChange12220); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4991:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==19) ) {
                alt73=1;
            }
            else if ( (LA73_0==14) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4991:5: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleContributionChange12239); 

                        	newLeafNode(otherlv_4, grammarAccess.getContributionChangeAccess().getSemicolonKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4996:6: (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4996:6: (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4996:8: otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleContributionChange12258); 

                        	newLeafNode(otherlv_5, grammarAccess.getContributionChangeAccess().getLeftCurlyBracketKeyword_3_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5000:1: ( (lv_contribRange_6_0= ruleContributionRange ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5001:1: (lv_contribRange_6_0= ruleContributionRange )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5001:1: (lv_contribRange_6_0= ruleContributionRange )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5002:3: lv_contribRange_6_0= ruleContributionRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getContribRangeContributionRangeParserRuleCall_3_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContributionRange_in_ruleContributionChange12279);
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

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleContributionChange12291); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5030:1: entryRuleContributionRange returns [EObject current=null] : iv_ruleContributionRange= ruleContributionRange EOF ;
    public final EObject entryRuleContributionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5031:2: (iv_ruleContributionRange= ruleContributionRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5032:2: iv_ruleContributionRange= ruleContributionRange EOF
            {
             newCompositeNode(grammarAccess.getContributionRangeRule()); 
            pushFollow(FOLLOW_ruleContributionRange_in_entryRuleContributionRange12329);
            iv_ruleContributionRange=ruleContributionRange();

            state._fsp--;

             current =iv_ruleContributionRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionRange12339); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5039:1: ruleContributionRange returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5042:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5043:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5043:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5045:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5045:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5046:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5049:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5050:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5050:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+
            int cnt74=0;
            loop74:
            do {
                int alt74=4;
                int LA74_0 = input.LA(1);

                if ( LA74_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0) ) {
                    alt74=1;
                }
                else if ( LA74_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1) ) {
                    alt74=2;
                }
                else if ( LA74_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2) ) {
                    alt74=3;
                }


                switch (alt74) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5052:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5052:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5053:5: {...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5053:112: ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5054:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5057:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5057:7: {...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5057:16: (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5057:18: otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleContributionRange12421); 

            	        	newLeafNode(otherlv_1, grammarAccess.getContributionRangeAccess().getStartKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange12433); 

            	        	newLeafNode(otherlv_2, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5065:1: ( (lv_start_3_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5066:1: (lv_start_3_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5066:1: (lv_start_3_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5067:3: lv_start_3_0= RULE_INT
            	    {
            	    lv_start_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange12450); 

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

            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange12467); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5094:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5094:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5095:5: {...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5095:112: ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5096:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5099:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5099:7: {...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5099:16: (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5099:18: otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleContributionRange12535); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContributionRangeAccess().getEndKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange12547); 

            	        	newLeafNode(otherlv_6, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5107:1: ( (lv_end_7_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5108:1: (lv_end_7_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5108:1: (lv_end_7_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5109:3: lv_end_7_0= RULE_INT
            	    {
            	    lv_end_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange12564); 

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

            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange12581); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5136:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5136:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5137:5: {...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5137:112: ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5138:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5141:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5141:7: {...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5141:16: (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5141:18: otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleContributionRange12649); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContributionRangeAccess().getStepKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange12661); 

            	        	newLeafNode(otherlv_10, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5149:1: ( (lv_step_11_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5150:1: (lv_step_11_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5150:1: (lv_step_11_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5151:3: lv_step_11_0= RULE_INT
            	    {
            	    lv_step_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange12678); 

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

            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange12695); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5194:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5195:2: (iv_ruleMetadata= ruleMetadata EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5196:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_ruleMetadata_in_entryRuleMetadata12777);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadata12787); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5203:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5206:28: ( (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5207:1: (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5207:1: (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5207:3: otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleMetadata12824); 

                	newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getMetadataKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5211:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5212:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5212:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5213:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetadata12841); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMetadata12858); 

                	newLeafNode(otherlv_2, grammarAccess.getMetadataAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5233:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5234:1: (lv_value_3_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5234:1: (lv_value_3_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5235:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata12875); 

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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleMetadata12892); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5263:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5264:2: (iv_ruleComment= ruleComment EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5265:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment12928);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment12938); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5272:1: ruleComment returns [EObject current=null] : (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5275:28: ( (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5276:1: (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5276:1: (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5276:3: otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleComment12975); 

                	newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getCommentKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5280:1: ( (lv_content_1_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5281:1: (lv_content_1_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5281:1: (lv_content_1_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5282:3: lv_content_1_0= RULE_STRING
            {
            lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComment12992); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleComment13009); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5310:1: entryRuleLinkType returns [EObject current=null] : iv_ruleLinkType= ruleLinkType EOF ;
    public final EObject entryRuleLinkType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkType = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5311:2: (iv_ruleLinkType= ruleLinkType EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5312:2: iv_ruleLinkType= ruleLinkType EOF
            {
             newCompositeNode(grammarAccess.getLinkTypeRule()); 
            pushFollow(FOLLOW_ruleLinkType_in_entryRuleLinkType13045);
            iv_ruleLinkType=ruleLinkType();

            state._fsp--;

             current =iv_ruleLinkType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkType13055); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5319:1: ruleLinkType returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) ;
    public final EObject ruleLinkType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5322:28: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5323:1: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5323:1: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5323:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleLinkType13092); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkTypeAccess().getLinkKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5327:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5328:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5328:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5329:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLinkType13109); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleLinkType13126); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5357:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5358:2: (iv_ruleLink= ruleLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5359:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink13162);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink13172); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5366:1: ruleLink returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5369:28: ( ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5370:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5370:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5370:2: ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5370:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5371:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5371:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5372:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getSrcGRLElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink13220);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5385:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5386:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5386:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5387:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getTypeLinkTypeCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink13243);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5400:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5401:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5401:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5402:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getDesGRLElementCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink13266);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5415:2: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==30) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5415:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleLink13279); 

            	        	newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5419:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5420:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5420:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5421:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLinkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getDesGRLElementCrossReference_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink13302);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleLink13316); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5446:1: entryRuleinLineLink returns [EObject current=null] : iv_ruleinLineLink= ruleinLineLink EOF ;
    public final EObject entryRuleinLineLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinLineLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5447:2: (iv_ruleinLineLink= ruleinLineLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5448:2: iv_ruleinLineLink= ruleinLineLink EOF
            {
             newCompositeNode(grammarAccess.getInLineLinkRule()); 
            pushFollow(FOLLOW_ruleinLineLink_in_entryRuleinLineLink13352);
            iv_ruleinLineLink=ruleinLineLink();

            state._fsp--;

             current =iv_ruleinLineLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinLineLink13362); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5455:1: ruleinLineLink returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleinLineLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5458:28: ( ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5459:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5459:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5459:2: ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5459:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5460:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5460:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5461:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInLineLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInLineLinkAccess().getTypeLinkTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleinLineLink13410);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5474:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5475:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5475:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5476:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInLineLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInLineLinkAccess().getDesGRLElementCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleinLineLink13433);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5489:2: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==30) ) {
                    alt76=1;
                }


                switch (alt76) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5489:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleinLineLink13446); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineLinkAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5493:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5494:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5494:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5495:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInLineLinkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getInLineLinkAccess().getDesGRLElementCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleinLineLink13469);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleinLineLink13483); 

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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5520:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5521:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5522:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13520);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName13531); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5529:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5532:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5533:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5533:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5533:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13571); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5540:1: (kw= '.' this_ID_2= RULE_ID )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==54) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5541:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,54,FOLLOW_54_in_ruleQualifiedName13590); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13605); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop77;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5561:1: ruleImportanceType returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) ;
    public final Enumerator ruleImportanceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5563:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5564:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5564:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            int alt78=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt78=1;
                }
                break;
            case 56:
                {
                alt78=2;
                }
                break;
            case 57:
                {
                alt78=3;
                }
                break;
            case 58:
                {
                alt78=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5564:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5564:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5564:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleImportanceType13666); 

                            current = grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5570:6: (enumLiteral_1= 'high' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5570:6: (enumLiteral_1= 'high' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5570:8: enumLiteral_1= 'high'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleImportanceType13683); 

                            current = grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5576:6: (enumLiteral_2= 'medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5576:6: (enumLiteral_2= 'medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5576:8: enumLiteral_2= 'medium'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_57_in_ruleImportanceType13700); 

                            current = grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5582:6: (enumLiteral_3= 'low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5582:6: (enumLiteral_3= 'low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5582:8: enumLiteral_3= 'low'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_58_in_ruleImportanceType13717); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5592:1: ruleDecompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) ;
    public final Enumerator ruleDecompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5594:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5595:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5595:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            int alt79=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt79=1;
                }
                break;
            case 60:
                {
                alt79=2;
                }
                break;
            case 61:
                {
                alt79=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5595:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5595:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5595:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleDecompositionType13762); 

                            current = grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5601:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5601:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5601:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleDecompositionType13779); 

                            current = grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5607:6: (enumLiteral_2= 'xor' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5607:6: (enumLiteral_2= 'xor' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5607:8: enumLiteral_2= 'xor'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_61_in_ruleDecompositionType13796); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5617:1: ruleContributionType returns [Enumerator current=null] : ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5619:28: ( ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5620:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5620:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            int alt80=7;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt80=1;
                }
                break;
            case 63:
                {
                alt80=2;
                }
                break;
            case 64:
                {
                alt80=3;
                }
                break;
            case 65:
                {
                alt80=4;
                }
                break;
            case 66:
                {
                alt80=5;
                }
                break;
            case 67:
                {
                alt80=6;
                }
                break;
            case 68:
                {
                alt80=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5620:2: (enumLiteral_0= 'help' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5620:2: (enumLiteral_0= 'help' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5620:4: enumLiteral_0= 'help'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleContributionType13841); 

                            current = grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5626:6: (enumLiteral_1= 'make' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5626:6: (enumLiteral_1= 'make' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5626:8: enumLiteral_1= 'make'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_ruleContributionType13858); 

                            current = grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5632:6: (enumLiteral_2= 'somePositive' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5632:6: (enumLiteral_2= 'somePositive' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5632:8: enumLiteral_2= 'somePositive'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_64_in_ruleContributionType13875); 

                            current = grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5638:6: (enumLiteral_3= 'unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5638:6: (enumLiteral_3= 'unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5638:8: enumLiteral_3= 'unknown'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_65_in_ruleContributionType13892); 

                            current = grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5644:6: (enumLiteral_4= 'someNegative' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5644:6: (enumLiteral_4= 'someNegative' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5644:8: enumLiteral_4= 'someNegative'
                    {
                    enumLiteral_4=(Token)match(input,66,FOLLOW_66_in_ruleContributionType13909); 

                            current = grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5650:6: (enumLiteral_5= 'hurt' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5650:6: (enumLiteral_5= 'hurt' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5650:8: enumLiteral_5= 'hurt'
                    {
                    enumLiteral_5=(Token)match(input,67,FOLLOW_67_in_ruleContributionType13926); 

                            current = grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5656:6: (enumLiteral_6= 'break' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5656:6: (enumLiteral_6= 'break' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5656:8: enumLiteral_6= 'break'
                    {
                    enumLiteral_6=(Token)match(input,68,FOLLOW_68_in_ruleContributionType13943); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5666:1: ruleQualitativeLabel returns [Enumerator current=null] : ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5668:28: ( ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5669:1: ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5669:1: ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) )
            int alt81=7;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt81=1;
                }
                break;
            case 70:
                {
                alt81=2;
                }
                break;
            case 71:
                {
                alt81=3;
                }
                break;
            case 72:
                {
                alt81=4;
                }
                break;
            case 73:
                {
                alt81=5;
                }
                break;
            case 65:
                {
                alt81=6;
                }
                break;
            case 55:
                {
                alt81=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5669:2: (enumLiteral_0= 'denied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5669:2: (enumLiteral_0= 'denied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5669:4: enumLiteral_0= 'denied'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_69_in_ruleQualitativeLabel13988); 

                            current = grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5675:6: (enumLiteral_1= 'weaklyDenied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5675:6: (enumLiteral_1= 'weaklyDenied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5675:8: enumLiteral_1= 'weaklyDenied'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_70_in_ruleQualitativeLabel14005); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5681:6: (enumLiteral_2= 'weaklySatisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5681:6: (enumLiteral_2= 'weaklySatisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5681:8: enumLiteral_2= 'weaklySatisfied'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_71_in_ruleQualitativeLabel14022); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5687:6: (enumLiteral_3= 'satisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5687:6: (enumLiteral_3= 'satisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5687:8: enumLiteral_3= 'satisfied'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_72_in_ruleQualitativeLabel14039); 

                            current = grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5693:6: (enumLiteral_4= 'conflict' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5693:6: (enumLiteral_4= 'conflict' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5693:8: enumLiteral_4= 'conflict'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_73_in_ruleQualitativeLabel14056); 

                            current = grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5699:6: (enumLiteral_5= 'unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5699:6: (enumLiteral_5= 'unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5699:8: enumLiteral_5= 'unknown'
                    {
                    enumLiteral_5=(Token)match(input,65,FOLLOW_65_in_ruleQualitativeLabel14073); 

                            current = grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5705:6: (enumLiteral_6= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5705:6: (enumLiteral_6= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5705:8: enumLiteral_6= 'none'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_55_in_ruleQualitativeLabel14090); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5715:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5717:28: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5718:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5718:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) )
            int alt82=16;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt82=1;
                }
                break;
            case 75:
                {
                alt82=2;
                }
                break;
            case 76:
                {
                alt82=3;
                }
                break;
            case 77:
                {
                alt82=4;
                }
                break;
            case 78:
                {
                alt82=5;
                }
                break;
            case 79:
                {
                alt82=6;
                }
                break;
            case 80:
                {
                alt82=7;
                }
                break;
            case 81:
                {
                alt82=8;
                }
                break;
            case 82:
                {
                alt82=9;
                }
                break;
            case 83:
                {
                alt82=10;
                }
                break;
            case 84:
                {
                alt82=11;
                }
                break;
            case 85:
                {
                alt82=12;
                }
                break;
            case 86:
                {
                alt82=13;
                }
                break;
            case 87:
                {
                alt82=14;
                }
                break;
            case 88:
                {
                alt82=15;
                }
                break;
            case 89:
                {
                alt82=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5718:2: (enumLiteral_0= 'white' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5718:2: (enumLiteral_0= 'white' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5718:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleColor14135); 

                            current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5724:6: (enumLiteral_1= 'black' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5724:6: (enumLiteral_1= 'black' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5724:8: enumLiteral_1= 'black'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleColor14152); 

                            current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5730:6: (enumLiteral_2= 'blue' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5730:6: (enumLiteral_2= 'blue' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5730:8: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleColor14169); 

                            current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5736:6: (enumLiteral_3= 'green' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5736:6: (enumLiteral_3= 'green' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5736:8: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_ruleColor14186); 

                            current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5742:6: (enumLiteral_4= 'cyan' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5742:6: (enumLiteral_4= 'cyan' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5742:8: enumLiteral_4= 'cyan'
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_78_in_ruleColor14203); 

                            current = grammarAccess.getColorAccess().getCyanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getCyanEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5748:6: (enumLiteral_5= 'red' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5748:6: (enumLiteral_5= 'red' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5748:8: enumLiteral_5= 'red'
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_79_in_ruleColor14220); 

                            current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5754:6: (enumLiteral_6= 'purple' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5754:6: (enumLiteral_6= 'purple' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5754:8: enumLiteral_6= 'purple'
                    {
                    enumLiteral_6=(Token)match(input,80,FOLLOW_80_in_ruleColor14237); 

                            current = grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5760:6: (enumLiteral_7= 'yellow' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5760:6: (enumLiteral_7= 'yellow' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5760:8: enumLiteral_7= 'yellow'
                    {
                    enumLiteral_7=(Token)match(input,81,FOLLOW_81_in_ruleColor14254); 

                            current = grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5766:6: (enumLiteral_8= 'gray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5766:6: (enumLiteral_8= 'gray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5766:8: enumLiteral_8= 'gray'
                    {
                    enumLiteral_8=(Token)match(input,82,FOLLOW_82_in_ruleColor14271); 

                            current = grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5772:6: (enumLiteral_9= 'lightGray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5772:6: (enumLiteral_9= 'lightGray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5772:8: enumLiteral_9= 'lightGray'
                    {
                    enumLiteral_9=(Token)match(input,83,FOLLOW_83_in_ruleColor14288); 

                            current = grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5778:6: (enumLiteral_10= 'lightBlue' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5778:6: (enumLiteral_10= 'lightBlue' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5778:8: enumLiteral_10= 'lightBlue'
                    {
                    enumLiteral_10=(Token)match(input,84,FOLLOW_84_in_ruleColor14305); 

                            current = grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5784:6: (enumLiteral_11= 'lightGreen' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5784:6: (enumLiteral_11= 'lightGreen' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5784:8: enumLiteral_11= 'lightGreen'
                    {
                    enumLiteral_11=(Token)match(input,85,FOLLOW_85_in_ruleColor14322); 

                            current = grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5790:6: (enumLiteral_12= 'lightCray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5790:6: (enumLiteral_12= 'lightCray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5790:8: enumLiteral_12= 'lightCray'
                    {
                    enumLiteral_12=(Token)match(input,86,FOLLOW_86_in_ruleColor14339); 

                            current = grammarAccess.getColorAccess().getLightCrayEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getColorAccess().getLightCrayEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5796:6: (enumLiteral_13= 'lightRed' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5796:6: (enumLiteral_13= 'lightRed' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5796:8: enumLiteral_13= 'lightRed'
                    {
                    enumLiteral_13=(Token)match(input,87,FOLLOW_87_in_ruleColor14356); 

                            current = grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5802:6: (enumLiteral_14= 'lightPurple' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5802:6: (enumLiteral_14= 'lightPurple' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5802:8: enumLiteral_14= 'lightPurple'
                    {
                    enumLiteral_14=(Token)match(input,88,FOLLOW_88_in_ruleColor14373); 

                            current = grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5808:6: (enumLiteral_15= 'lightYellow' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5808:6: (enumLiteral_15= 'lightYellow' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5808:8: enumLiteral_15= 'lightYellow'
                    {
                    enumLiteral_15=(Token)match(input,89,FOLLOW_89_in_ruleColor14390); 

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
        "\1\65\1\uffff\1\66\2\uffff\1\4\2\66\1\4\1\66";
    static final String DFA2_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\1\3\5\uffff";
    static final String DFA2_specialS =
        "\12\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\1\4\12\uffff\1\1\5\uffff\1\1\1\uffff\5\1\1\3\1\uffff\2"+
            "\3\1\1\1\uffff\1\1\13\uffff\3\1\1\uffff\3\1",
            "",
            "\1\6\15\uffff\1\1\12\uffff\1\1\1\uffff\2\1\25\uffff\1\5",
            "",
            "",
            "\1\7",
            "\1\1\16\uffff\1\3\12\uffff\1\3\27\uffff\1\10",
            "\1\6\15\uffff\1\1\12\uffff\1\1\1\uffff\2\1\25\uffff\1\5",
            "\1\11",
            "\1\1\16\uffff\1\3\12\uffff\1\3\27\uffff\1\10"
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
        "\20\uffff";
    static final String DFA3_eofS =
        "\20\uffff";
    static final String DFA3_minS =
        "\1\4\1\uffff\1\4\11\uffff\1\4\2\uffff\1\4";
    static final String DFA3_maxS =
        "\1\65\1\uffff\1\66\11\uffff\1\4\2\uffff\1\66";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\uffff\1\2\1\6\1\uffff";
    static final String DFA3_specialS =
        "\20\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\13\uffff\1\3\5\uffff\1\1\1\uffff\5\1\4\uffff\1\4\1\uffff"+
            "\1\5\13\uffff\1\10\1\6\1\7\1\uffff\1\11\1\12\1\13",
            "",
            "\1\15\15\uffff\1\16\12\uffff\1\15\1\uffff\2\15\25\uffff\1"+
            "\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\17",
            "",
            "",
            "\1\15\15\uffff\1\16\12\uffff\1\15\1\uffff\2\15\25\uffff\1"+
            "\14"
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
            return "172:1: (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_EvaluationStrategy_4= ruleEvaluationStrategy | this_Evaluation_5= ruleEvaluation | this_ContributionGroup_6= ruleContributionGroup | this_ContributionContext_7= ruleContributionContext | this_QualitativeMapping_8= ruleQualitativeMapping | this_Metadata_9= ruleMetadata | this_Comment_10= ruleComment | this_LinkType_11= ruleLinkType )";
        }
    }
    static final String DFA5_eotS =
        "\10\uffff";
    static final String DFA5_eofS =
        "\10\uffff";
    static final String DFA5_minS =
        "\3\4\4\uffff\1\4";
    static final String DFA5_maxS =
        "\1\4\1\66\1\4\4\uffff\1\66";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\3\1\2\1\4\1\uffff";
    static final String DFA5_specialS =
        "\10\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\6\30\uffff\1\3\1\uffff\1\5\1\4\25\uffff\1\2",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\6\30\uffff\1\3\1\uffff\1\5\1\4\25\uffff\1\2"
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
            return "392:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency | this_Link_3= ruleLink )";
        }
    }
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\12\uffff";
    static final String DFA12_minS =
        "\1\4\1\uffff\7\0\1\uffff";
    static final String DFA12_maxS =
        "\1\72\1\uffff\7\0\1\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA12_specialS =
        "\2\uffff\1\0\1\2\1\3\1\4\1\5\1\6\1\1\1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\10\1\uffff\1\1\10\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\2"+
            "\1\uffff\1\3\1\4\1\5\1\6\1\7\26\uffff\1\1\3\uffff\4\1",
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
            return "()+ loopback of 830:6: ({...}? => ( ( (lv_elemets_20_0= ruleIntentionalElement ) ) | ( (lv_elemets_21_0= ruleElementLink ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_2 = input.LA(1);

                         
                        int index12_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_2);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_8 = input.LA(1);

                         
                        int index12_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_3 = input.LA(1);

                         
                        int index12_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA12_4 = input.LA(1);

                         
                        int index12_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA12_5 = input.LA(1);

                         
                        int index12_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA12_6 = input.LA(1);

                         
                        int index12_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA12_7 = input.LA(1);

                         
                        int index12_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index12_7);
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
    public static final BitSet FOLLOW_ruleEvaluationStrategy_in_ruleGRLElement479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleGRLElement506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionGroup_in_ruleGRLElement533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionContext_in_ruleGRLElement560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeMapping_in_ruleGRLElement587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleGRLElement614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_ruleGRLElement641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_ruleGRLElement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntentionalElement713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_ruleIntentionalElement760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleIntentionalElement787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleIntentionalElement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleIntentionalElement841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicator_in_ruleIntentionalElement868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_ruleIntentionalElement895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLink_in_entryRuleElementLink930 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLink940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_ruleElementLink987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_ruleElementLink1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleElementLink1041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_ruleElementLink1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_entryRuleInLineElementLink1103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineElementLink1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDecomposition_in_ruleInLineElementLink1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineContribution_in_ruleInLineElementLink1187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDependency_in_ruleInLineElementLink1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinLineLink_in_ruleInLineElementLink1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRLSpecification_in_entryRuleGRLSpecification1276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRLSpecification1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGRLSpecification1323 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGRLSpecification1340 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGRLSpecification1358 = new BitSet(new long[]{0x003B800A1F418010L});
    public static final BitSet FOLLOW_ruleGRLElement_in_ruleGRLSpecification1379 = new BitSet(new long[]{0x003B800A1F418010L});
    public static final BitSet FOLLOW_15_in_ruleGRLSpecification1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor1428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleActor1475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor1492 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActor1509 = new BitSet(new long[]{0x078800001F728050L});
    public static final BitSet FOLLOW_17_in_ruleActor1567 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1579 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1596 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1613 = new BitSet(new long[]{0x078800001F728050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleActor1691 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActor1714 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1732 = new BitSet(new long[]{0x078800001F728050L});
    public static final BitSet FOLLOW_20_in_ruleActor1800 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1812 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1829 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1846 = new BitSet(new long[]{0x078800001F728050L});
    public static final BitSet FOLLOW_21_in_ruleActor1914 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1926 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleActor1947 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1959 = new BitSet(new long[]{0x078800001F728050L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleActor2035 = new BitSet(new long[]{0x078800001F728050L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleActor2112 = new BitSet(new long[]{0x078800001F728050L});
    public static final BitSet FOLLOW_ruleElementLink_in_ruleActor2139 = new BitSet(new long[]{0x078800001F728050L});
    public static final BitSet FOLLOW_15_in_ruleActor2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal2229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSoftgoal2276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftgoal2293 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSoftgoal2310 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2368 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2380 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal2397 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2414 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_20_in_ruleSoftgoal2482 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2494 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal2511 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2528 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_21_in_ruleSoftgoal2596 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2608 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleSoftgoal2629 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2641 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_23_in_ruleSoftgoal2709 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2721 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleSoftgoal2742 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2754 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleSoftgoal2832 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSoftgoal2855 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2873 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleSoftgoal2949 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleSoftgoal3025 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_15_in_ruleSoftgoal3078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal3114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGoal3161 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal3178 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGoal3195 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_17_in_ruleGoal3253 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3265 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3282 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3299 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_20_in_ruleGoal3367 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3379 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3396 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3413 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_21_in_ruleGoal3481 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3493 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleGoal3514 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3526 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_23_in_ruleGoal3594 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3606 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleGoal3627 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3639 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleGoal3717 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGoal3740 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3758 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleGoal3834 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleGoal3910 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_15_in_ruleGoal3963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask3999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask4009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTask4046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask4063 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTask4080 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_17_in_ruleTask4138 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask4150 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask4167 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4184 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_20_in_ruleTask4252 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask4264 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask4281 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4298 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_21_in_ruleTask4366 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask4378 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleTask4399 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4411 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_23_in_ruleTask4479 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask4491 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleTask4512 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4524 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleTask4602 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTask4625 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4643 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleTask4719 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleTask4795 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_15_in_ruleTask4848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource4884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleResource4931 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource4948 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleResource4965 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_17_in_ruleResource5023 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource5035 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource5052 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource5069 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_20_in_ruleResource5137 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource5149 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource5166 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource5183 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_21_in_ruleResource5251 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource5263 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleResource5284 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource5296 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_23_in_ruleResource5364 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource5376 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleResource5397 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource5409 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleResource5487 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResource5510 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource5528 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleResource5604 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleResource5680 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_15_in_ruleResource5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicator_in_entryRuleIndicator5769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndicator5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleIndicator5816 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator5833 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIndicator5850 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_17_in_ruleIndicator5908 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5920 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator5937 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5954 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_20_in_ruleIndicator6022 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator6034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator6051 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6068 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_21_in_ruleIndicator6136 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator6148 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleIndicator6169 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6181 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_23_in_ruleIndicator6249 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator6261 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleIndicator6282 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6294 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleIndicator6372 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIndicator6395 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6413 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleIndicator6489 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleIndicator6565 = new BitSet(new long[]{0x07880001A0B28050L});
    public static final BitSet FOLLOW_15_in_ruleIndicator6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief6654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBelief6701 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBelief6718 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBelief6735 = new BitSet(new long[]{0x0008000000128000L});
    public static final BitSet FOLLOW_17_in_ruleBelief6793 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBelief6805 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelief6822 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBelief6839 = new BitSet(new long[]{0x0008000000128000L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleBelief6915 = new BitSet(new long[]{0x0008000000128000L});
    public static final BitSet FOLLOW_20_in_ruleBelief6983 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelief7000 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBelief7017 = new BitSet(new long[]{0x0008000000128000L});
    public static final BitSet FOLLOW_15_in_ruleBelief7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition7106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition7116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecomposition7164 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDecomposition7176 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleDecomposition7197 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleDecomposition7210 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleDecomposition7231 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleDecomposition7245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDecomposition_in_entryRuleInLineDecomposition7281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineDecomposition7291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleInLineDecomposition7328 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition7349 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleInLineDecomposition7362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition7383 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleInLineDecomposition7397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_entryRuleDecompositionEnd7433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecompositionEnd7443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecompositionEnd7491 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDecompositionEnd7504 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecompositionEnd7521 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDecompositionEnd7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution7577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContribution7587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContribution7635 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleContribution7647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleContribution7668 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleContribution7681 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleContribution7702 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleContribution7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineContribution_in_entryRuleInLineContribution7752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineContribution7762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInLineContribution7799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleInLineContribution7820 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleInLineContribution7833 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleInLineContribution7854 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleInLineContribution7868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_entryRuleContributionEnd7904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionEnd7914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionEnd7956 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionEnd7985 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleContributionEnd7998 = new BitSet(new long[]{0xC000000000008040L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionEnd8020 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionEnd8043 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionEnd8062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency8100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency8110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependency8158 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDependency8170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleDependency8191 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleDependency8204 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleDependency8225 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleDependency8239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDependency_in_entryRuleInLineDependency8275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineDependency8285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInLineDependency8322 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleInLineDependency8343 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleInLineDependency8356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleInLineDependency8377 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleInLineDependency8391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_entryRuleDependencyEnd8427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyEnd8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependencyEnd8485 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDependencyEnd8498 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependencyEnd8515 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDependencyEnd8533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategyGroup_in_entryRuleStrategyGroup8571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrategyGroup8581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStrategyGroup8618 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStrategyGroup8635 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleStrategyGroup8652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8675 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleStrategyGroup8688 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8711 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleStrategyGroup8725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationStrategy_in_entryRuleEvaluationStrategy8761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationStrategy8771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEvaluationStrategy8808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvaluationStrategy8825 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_36_in_ruleEvaluationStrategy8843 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy8866 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_ruleEvaluationStrategy8879 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy8902 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluationStrategy8918 = new BitSet(new long[]{0x0008000000008010L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleEvaluationStrategy8984 = new BitSet(new long[]{0x0008000000008010L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleEvaluationStrategy9060 = new BitSet(new long[]{0x0008000000008010L});
    public static final BitSet FOLLOW_15_in_ruleEvaluationStrategy9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation9149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation9159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluation9207 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation9219 = new BitSet(new long[]{0x0080000000000040L,0x00000000000003E2L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleEvaluation9241 = new BitSet(new long[]{0x00007FC00008C000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluation9264 = new BitSet(new long[]{0x00007FC00008C000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluation9329 = new BitSet(new long[]{0x00007FE00000C002L});
    public static final BitSet FOLLOW_37_in_ruleEvaluation9348 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation9373 = new BitSet(new long[]{0x00007FC00000C002L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_ruleEvaluation9451 = new BitSet(new long[]{0x00007FC00000C002L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation9527 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvaluation9540 = new BitSet(new long[]{0x00007FC00000C002L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation9605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange9642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationRange9652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEvaluationRange9734 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange9746 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange9763 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange9780 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_39_in_ruleEvaluationRange9848 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange9860 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange9877 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange9894 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_40_in_ruleEvaluationRange9962 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange9974 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange9991 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange10008 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet10090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIEvalValueSet10100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQuantitativeEvalValueSet_in_ruleKPIEvalValueSet10147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQualitativeEvalValueSet_in_ruleKPIEvalValueSet10174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQuantitativeEvalValueSet_in_entryRuleKPIQuantitativeEvalValueSet10209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIQuantitativeEvalValueSet10219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleKPIQuantitativeEvalValueSet10301 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet10313 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10330 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10347 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_42_in_ruleKPIQuantitativeEvalValueSet10415 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet10427 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10444 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10461 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_43_in_ruleKPIQuantitativeEvalValueSet10529 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet10541 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10558 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10575 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_44_in_ruleKPIQuantitativeEvalValueSet10643 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet10655 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet10672 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10689 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_45_in_ruleKPIQuantitativeEvalValueSet10757 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet10769 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKPIQuantitativeEvalValueSet10786 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10803 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_ruleKPIQualitativeEvalValueSet_in_entryRuleKPIQualitativeEvalValueSet10885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIQualitativeEvalValueSet10895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleKPIQualitativeEvalValueSet10932 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQualitativeEvalValueSet10944 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleKPIQualitativeEvalValueSet10967 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQualitativeEvalValueSet10979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping11015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitativeMapping11025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleQualitativeMapping11062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeMapping11079 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualitativeMapping11096 = new BitSet(new long[]{0x0008000000008020L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleQualitativeMapping11162 = new BitSet(new long[]{0x0008000000008020L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleQualitativeMapping11238 = new BitSet(new long[]{0x0008000000008020L});
    public static final BitSet FOLLOW_15_in_ruleQualitativeMapping11291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping11327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping11337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMapping11379 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMapping11396 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMapping11413 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMapping11430 = new BitSet(new long[]{0x0080000000000000L,0x00000000000003E2L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleMapping11451 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMapping11463 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleMapping11480 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMapping11497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionGroup_in_entryRuleContributionGroup11533 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionGroup11543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleContributionGroup11580 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup11597 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleContributionGroup11614 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup11634 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleContributionGroup11647 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup11667 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionGroup11681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionContext_in_entryRuleContributionContext11717 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionContext11727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleContributionContext11764 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionContext11781 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_36_in_ruleContributionContext11799 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionContext11822 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_ruleContributionContext11835 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionContext11858 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionContext11874 = new BitSet(new long[]{0x0008000000008010L});
    public static final BitSet FOLLOW_ruleMetadata_in_ruleContributionContext11940 = new BitSet(new long[]{0x0008000000008010L});
    public static final BitSet FOLLOW_ruleContributionChange_in_ruleContributionContext12016 = new BitSet(new long[]{0x0008000000008010L});
    public static final BitSet FOLLOW_15_in_ruleContributionContext12069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionChange_in_entryRuleContributionChange12105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionChange12115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionChange12163 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleContributionChange12175 = new BitSet(new long[]{0xC000000000000040L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionChange12197 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionChange12220 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_ruleContributionChange12239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleContributionChange12258 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_ruleContributionRange_in_ruleContributionChange12279 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionChange12291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionRange_in_entryRuleContributionRange12329 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionRange12339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleContributionRange12421 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange12433 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange12450 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange12467 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_39_in_ruleContributionRange12535 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange12547 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange12564 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange12581 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_40_in_ruleContributionRange12649 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange12661 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange12678 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange12695 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_entryRuleMetadata12777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadata12787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleMetadata12824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetadata12841 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMetadata12858 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata12875 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMetadata12892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment12928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment12938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleComment12975 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComment12992 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleComment13009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_entryRuleLinkType13045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkType13055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLinkType13092 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLinkType13109 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLinkType13126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink13162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink13172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink13220 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink13243 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink13266 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleLink13279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink13302 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleLink13316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinLineLink_in_entryRuleinLineLink13352 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinLineLink13362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleinLineLink13410 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleinLineLink13433 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleinLineLink13446 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleinLineLink13469 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleinLineLink13483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName13531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13571 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleQualifiedName13590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13605 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_55_in_ruleImportanceType13666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleImportanceType13683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleImportanceType13700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleImportanceType13717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleDecompositionType13762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDecompositionType13779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDecompositionType13796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleContributionType13841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleContributionType13858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleContributionType13875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleContributionType13892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleContributionType13909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleContributionType13926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleContributionType13943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleQualitativeLabel13988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleQualitativeLabel14005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleQualitativeLabel14022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleQualitativeLabel14039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleQualitativeLabel14056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleQualitativeLabel14073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleQualitativeLabel14090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleColor14135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleColor14152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleColor14169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleColor14186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleColor14203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleColor14220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleColor14237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleColor14254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleColor14271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleColor14288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleColor14305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleColor14322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleColor14339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleColor14356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleColor14373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleColor14390 = new BitSet(new long[]{0x0000000000000002L});

}
