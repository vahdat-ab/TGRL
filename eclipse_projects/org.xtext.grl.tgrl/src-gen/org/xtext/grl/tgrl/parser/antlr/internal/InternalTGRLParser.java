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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:577:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) ;
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
        Token otherlv_21=null;
        Enumerator lv_importance_8_0 = null;

        Enumerator lv_fillColor_17_0 = null;

        EObject lv_elemets_19_0 = null;

        EObject lv_elemets_20_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:580:28: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:581:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:581:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:581:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}'
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
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:607:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:609:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:609:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:610:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:614:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:614:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )*
            loop12:
            do {
                int alt12=6;
                int LA12_0 = input.LA(1);

                if ( LA12_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0) ) {
                    alt12=1;
                }
                else if ( (LA12_0==RULE_INT|| LA12_0 >=55 && LA12_0<=58) && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3) ) {
                    alt12=4;
                }
                else if ( (LA12_0==RULE_ID||LA12_0==22|| LA12_0 >=24 && LA12_0<=28) && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {
                    alt12=5;
                }


                switch (alt12) {
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
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:795:4: ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:795:4: ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:796:5: {...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:796:102: ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:797:6: ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:800:6: ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+
            	    int cnt11=0;
            	    loop11:
            	    do {
            	        int alt11=2;
            	        alt11 = dfa11.predict(input);
            	        switch (alt11) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:800:7: {...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:800:16: ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) )
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
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:800:17: ( (lv_elemets_19_0= ruleIntentionalElement ) )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:800:17: ( (lv_elemets_19_0= ruleIntentionalElement ) )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:801:1: (lv_elemets_19_0= ruleIntentionalElement )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:801:1: (lv_elemets_19_0= ruleIntentionalElement )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:802:3: lv_elemets_19_0= ruleIntentionalElement
            	    	            {
            	    	             
            	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsIntentionalElementParserRuleCall_3_4_0_0()); 
            	    	            	    
            	    	            pushFollow(FOLLOW_ruleIntentionalElement_in_ruleActor2036);
            	    	            lv_elemets_19_0=ruleIntentionalElement();

            	    	            state._fsp--;


            	    	            	        if (current==null) {
            	    	            	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	            	        }
            	    	                   		add(
            	    	                   			current, 
            	    	                   			"elemets",
            	    	                    		lv_elemets_19_0, 
            	    	                    		"IntentionalElement");
            	    	            	        afterParserOrEnumRuleCall();
            	    	            	    

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:819:6: ( (lv_elemets_20_0= ruleElementLink ) )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:819:6: ( (lv_elemets_20_0= ruleElementLink ) )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:820:1: (lv_elemets_20_0= ruleElementLink )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:820:1: (lv_elemets_20_0= ruleElementLink )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:821:3: lv_elemets_20_0= ruleElementLink
            	    	            {
            	    	             
            	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsElementLinkParserRuleCall_3_4_1_0()); 
            	    	            	    
            	    	            pushFollow(FOLLOW_ruleElementLink_in_ruleActor2063);
            	    	            lv_elemets_20_0=ruleElementLink();

            	    	            state._fsp--;


            	    	            	        if (current==null) {
            	    	            	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	            	        }
            	    	                   		add(
            	    	                   			current, 
            	    	                   			"elemets",
            	    	                    		lv_elemets_20_0, 
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
            	    	    if ( cnt11 >= 1 ) break loop11;
            	                EarlyExitException eee =
            	                    new EarlyExitException(11, input);
            	                throw eee;
            	        }
            	        cnt11++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	

            }

            otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleActor2117); 

                	newLeafNode(otherlv_21, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:863:1: entryRuleSoftgoal returns [EObject current=null] : iv_ruleSoftgoal= ruleSoftgoal EOF ;
    public final EObject entryRuleSoftgoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftgoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:864:2: (iv_ruleSoftgoal= ruleSoftgoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:865:2: iv_ruleSoftgoal= ruleSoftgoal EOF
            {
             newCompositeNode(grammarAccess.getSoftgoalRule()); 
            pushFollow(FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal2153);
            iv_ruleSoftgoal=ruleSoftgoal();

            state._fsp--;

             current =iv_ruleSoftgoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftgoal2163); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:872:1: ruleSoftgoal returns [EObject current=null] : (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ;
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
        Token otherlv_24=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_decompositionType_18_0 = null;

        Enumerator lv_importance_20_0 = null;

        EObject lv_elementLinks_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:875:28: ( (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:876:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:876:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:876:3: otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleSoftgoal2200); 

                	newLeafNode(otherlv_0, grammarAccess.getSoftgoalAccess().getSoftGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:880:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:881:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:881:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:882:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftgoal2217); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSoftgoal2234); 

                	newLeafNode(otherlv_2, grammarAccess.getSoftgoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:902:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:904:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:904:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:905:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:908:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:909:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:909:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            loop15:
            do {
                int alt15=7;
                int LA15_0 = input.LA(1);

                if ( LA15_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2) ) {
                    alt15=3;
                }
                else if ( LA15_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3) ) {
                    alt15=4;
                }
                else if ( (LA15_0==RULE_INT|| LA15_0 >=55 && LA15_0<=58) && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4) ) {
                    alt15=5;
                }
                else if ( (LA15_0==RULE_ID||LA15_0==29|| LA15_0 >=31 && LA15_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5) ) {
                    alt15=6;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:911:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:911:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:912:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:912:105: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:913:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:916:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:916:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:916:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:916:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2292); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSoftgoalAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2304); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:924:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:925:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:925:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:926:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal2321); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2338); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:953:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:953:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:954:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:954:105: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:955:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:958:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:958:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:958:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:958:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleSoftgoal2406); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSoftgoalAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2418); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:966:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:967:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:967:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:968:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal2435); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2452); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:995:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:995:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:996:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:996:105: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:997:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1000:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1000:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1000:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1000:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleSoftgoal2520); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSoftgoalAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2532); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1008:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1009:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1009:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1010:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleSoftgoal2553);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2565); 

            	        	newLeafNode(otherlv_15, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1037:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1037:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1038:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1038:105: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1039:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1042:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1042:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1042:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1042:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleSoftgoal2633); 

            	        	newLeafNode(otherlv_16, grammarAccess.getSoftgoalAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2645); 

            	        	newLeafNode(otherlv_17, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1050:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1051:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1051:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1052:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleSoftgoal2666);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2678); 

            	        	newLeafNode(otherlv_19, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1079:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1079:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1080:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1080:105: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1081:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1084:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1084:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1084:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1084:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1084:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( ((LA13_0>=55 && LA13_0<=58)) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==RULE_INT) ) {
            	        alt13=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1084:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1084:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1085:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1085:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1086:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSoftgoalAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleSoftgoal2756);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1103:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1103:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1104:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1104:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1105:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSoftgoal2779); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2797); 

            	        	newLeafNode(otherlv_22, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1132:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1132:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1133:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1133:105: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1134:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1137:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=2;
            	        switch ( input.LA(1) ) {
            	        case 29:
            	            {
            	            int LA14_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt14=1;
            	            }


            	            }
            	            break;
            	        case 31:
            	            {
            	            int LA14_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt14=1;
            	            }


            	            }
            	            break;
            	        case 32:
            	            {
            	            int LA14_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt14=1;
            	            }


            	            }
            	            break;
            	        case RULE_ID:
            	            {
            	            int LA14_5 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt14=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt14) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1137:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1137:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1138:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1138:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1139:3: lv_elementLinks_23_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getElementLinksInLineElementLinkParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleSoftgoal2873);
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
            	    	    if ( cnt14 >= 1 ) break loop14;
            	                EarlyExitException eee =
            	                    new EarlyExitException(14, input);
            	                throw eee;
            	        }
            	        cnt14++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	

            }

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleSoftgoal2926); 

                	newLeafNode(otherlv_24, grammarAccess.getSoftgoalAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1181:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1182:2: (iv_ruleGoal= ruleGoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1183:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal2962);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal2972); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1190:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ;
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
        Token otherlv_24=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_decompositionType_18_0 = null;

        Enumerator lv_importance_20_0 = null;

        EObject lv_elementLinks_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1193:28: ( (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1194:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1194:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1194:3: otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGoal3009); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1198:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1199:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1199:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1200:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal3026); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGoal3043); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1220:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1222:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1222:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1223:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1226:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1227:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1227:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            loop18:
            do {
                int alt18=7;
                int LA18_0 = input.LA(1);

                if ( LA18_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1) ) {
                    alt18=2;
                }
                else if ( LA18_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2) ) {
                    alt18=3;
                }
                else if ( LA18_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3) ) {
                    alt18=4;
                }
                else if ( (LA18_0==RULE_INT|| LA18_0 >=55 && LA18_0<=58) && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4) ) {
                    alt18=5;
                }
                else if ( (LA18_0==RULE_ID||LA18_0==29|| LA18_0 >=31 && LA18_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5) ) {
                    alt18=6;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1229:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1229:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1230:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1230:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1231:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1234:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1234:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1234:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1234:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleGoal3101); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGoalAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleGoal3113); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1242:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1243:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1243:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1244:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3130); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleGoal3147); 

            	        	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1271:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1271:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1272:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1272:101: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1273:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1276:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1276:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1276:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1276:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleGoal3215); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleGoal3227); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1284:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1285:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1285:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1286:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3244); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleGoal3261); 

            	        	newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1313:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1313:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1314:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1314:101: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1315:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1318:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1318:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1318:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1318:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleGoal3329); 

            	        	newLeafNode(otherlv_12, grammarAccess.getGoalAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleGoal3341); 

            	        	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1326:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1327:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1327:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1328:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleGoal3362);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleGoal3374); 

            	        	newLeafNode(otherlv_15, grammarAccess.getGoalAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1355:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1355:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1356:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1356:101: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1357:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1360:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1360:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1360:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1360:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleGoal3442); 

            	        	newLeafNode(otherlv_16, grammarAccess.getGoalAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleGoal3454); 

            	        	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1368:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1369:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1369:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1370:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleGoal3475);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleGoal3487); 

            	        	newLeafNode(otherlv_19, grammarAccess.getGoalAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1397:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1397:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1398:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1398:101: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1399:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1402:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1402:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1402:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1402:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1402:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>=55 && LA16_0<=58)) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==RULE_INT) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1402:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1402:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1403:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1403:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1404:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGoalAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleGoal3565);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1421:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1421:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1422:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1422:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1423:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGoal3588); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleGoal3606); 

            	        	newLeafNode(otherlv_22, grammarAccess.getGoalAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1450:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1450:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1451:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1451:101: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1452:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1455:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
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
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1455:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1455:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1456:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1456:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1457:3: lv_elementLinks_23_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getElementLinksInLineElementLinkParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleGoal3682);
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
            	    	    if ( cnt17 >= 1 ) break loop17;
            	                EarlyExitException eee =
            	                    new EarlyExitException(17, input);
            	                throw eee;
            	        }
            	        cnt17++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	

            }

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleGoal3735); 

                	newLeafNode(otherlv_24, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1499:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1500:2: (iv_ruleTask= ruleTask EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1501:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask3771);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask3781); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1508:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ;
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
        Token otherlv_24=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_decompositionType_18_0 = null;

        Enumerator lv_importance_20_0 = null;

        EObject lv_elementLinks_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1511:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1512:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1512:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1512:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTask3818); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1516:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1517:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1517:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1518:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask3835); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTask3852); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1538:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1540:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1540:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1541:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1544:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1545:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1545:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            loop21:
            do {
                int alt21=7;
                int LA21_0 = input.LA(1);

                if ( LA21_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0) ) {
                    alt21=1;
                }
                else if ( LA21_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1) ) {
                    alt21=2;
                }
                else if ( LA21_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2) ) {
                    alt21=3;
                }
                else if ( LA21_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3) ) {
                    alt21=4;
                }
                else if ( (LA21_0==RULE_INT|| LA21_0 >=55 && LA21_0<=58) && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4) ) {
                    alt21=5;
                }
                else if ( (LA21_0==RULE_ID||LA21_0==29|| LA21_0 >=31 && LA21_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5) ) {
                    alt21=6;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1547:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1547:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1548:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1548:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1549:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1552:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1552:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1552:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1552:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleTask3910); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleTask3922); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1560:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1561:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1561:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1562:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask3939); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleTask3956); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1589:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1589:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1590:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1590:101: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1591:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1594:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1594:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1594:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1594:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleTask4024); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleTask4036); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1602:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1603:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1603:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1604:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask4053); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleTask4070); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1631:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1631:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1632:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1632:101: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1633:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1636:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1636:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1636:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1636:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleTask4138); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleTask4150); 

            	        	newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1644:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1645:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1645:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1646:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaskAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleTask4171);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleTask4183); 

            	        	newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1673:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1673:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1674:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1674:101: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1675:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1678:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1678:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1678:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1678:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleTask4251); 

            	        	newLeafNode(otherlv_16, grammarAccess.getTaskAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleTask4263); 

            	        	newLeafNode(otherlv_17, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1686:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1687:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1687:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1688:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaskAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleTask4284);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleTask4296); 

            	        	newLeafNode(otherlv_19, grammarAccess.getTaskAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1715:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1715:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1716:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1716:101: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1717:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1720:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1720:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1720:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1720:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1720:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( ((LA19_0>=55 && LA19_0<=58)) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==RULE_INT) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1720:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1720:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1721:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1721:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1722:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTaskAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleTask4374);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1739:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1739:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1740:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1740:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1741:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTask4397); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleTask4415); 

            	        	newLeafNode(otherlv_22, grammarAccess.getTaskAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1768:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1768:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1769:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1769:101: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1770:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1773:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
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
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1773:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1773:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1774:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1774:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1775:3: lv_elementLinks_23_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTaskAccess().getElementLinksInLineElementLinkParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleTask4491);
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
            	    	    if ( cnt20 >= 1 ) break loop20;
            	                EarlyExitException eee =
            	                    new EarlyExitException(20, input);
            	                throw eee;
            	        }
            	        cnt20++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	

            }

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleTask4544); 

                	newLeafNode(otherlv_24, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1817:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1818:2: (iv_ruleResource= ruleResource EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1819:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource4580);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource4590); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1826:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ;
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
        Token otherlv_24=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_decompositionType_18_0 = null;

        Enumerator lv_importance_20_0 = null;

        EObject lv_elementLinks_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1829:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1830:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1830:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1830:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleResource4627); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1834:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1835:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1835:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1836:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource4644); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleResource4661); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1856:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1858:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1858:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1859:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1862:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1863:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1863:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            loop24:
            do {
                int alt24=7;
                int LA24_0 = input.LA(1);

                if ( LA24_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1) ) {
                    alt24=2;
                }
                else if ( LA24_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2) ) {
                    alt24=3;
                }
                else if ( LA24_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3) ) {
                    alt24=4;
                }
                else if ( (LA24_0==RULE_INT|| LA24_0 >=55 && LA24_0<=58) && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4) ) {
                    alt24=5;
                }
                else if ( (LA24_0==RULE_ID||LA24_0==29|| LA24_0 >=31 && LA24_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5) ) {
                    alt24=6;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1865:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1865:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1866:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1866:105: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1867:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1870:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1870:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1870:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1870:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleResource4719); 

            	        	newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleResource4731); 

            	        	newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1878:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1879:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1879:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1880:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource4748); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleResource4765); 

            	        	newLeafNode(otherlv_7, grammarAccess.getResourceAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1907:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1907:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1908:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1908:105: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1909:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1912:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1912:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1912:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1912:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleResource4833); 

            	        	newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleResource4845); 

            	        	newLeafNode(otherlv_9, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1920:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1921:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1921:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1922:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource4862); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleResource4879); 

            	        	newLeafNode(otherlv_11, grammarAccess.getResourceAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1949:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1949:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1950:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1950:105: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1951:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1954:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1954:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1954:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1954:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleResource4947); 

            	        	newLeafNode(otherlv_12, grammarAccess.getResourceAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleResource4959); 

            	        	newLeafNode(otherlv_13, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1962:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1963:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1963:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1964:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleResource4980);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleResource4992); 

            	        	newLeafNode(otherlv_15, grammarAccess.getResourceAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1991:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1991:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1992:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1992:105: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1993:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1996:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1996:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1996:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1996:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleResource5060); 

            	        	newLeafNode(otherlv_16, grammarAccess.getResourceAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleResource5072); 

            	        	newLeafNode(otherlv_17, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2004:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2005:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2005:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2006:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleResource5093);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleResource5105); 

            	        	newLeafNode(otherlv_19, grammarAccess.getResourceAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2033:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2033:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2034:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2034:105: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2035:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2038:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2038:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2038:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2038:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2038:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2038:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2038:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2039:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2039:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2040:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getResourceAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleResource5183);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2057:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2057:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2058:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2058:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2059:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResource5206); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleResource5224); 

            	        	newLeafNode(otherlv_22, grammarAccess.getResourceAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2086:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2086:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2087:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2087:105: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2088:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2091:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    int cnt23=0;
            	    loop23:
            	    do {
            	        int alt23=2;
            	        switch ( input.LA(1) ) {
            	        case 29:
            	            {
            	            int LA23_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	            }
            	            break;
            	        case 31:
            	            {
            	            int LA23_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	            }
            	            break;
            	        case 32:
            	            {
            	            int LA23_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	            }
            	            break;
            	        case RULE_ID:
            	            {
            	            int LA23_5 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt23) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2091:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2091:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2092:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2092:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2093:3: lv_elementLinks_23_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getResourceAccess().getElementLinksInLineElementLinkParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleResource5300);
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
            	    	    if ( cnt23 >= 1 ) break loop23;
            	                EarlyExitException eee =
            	                    new EarlyExitException(23, input);
            	                throw eee;
            	        }
            	        cnt23++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	

            }

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleResource5353); 

                	newLeafNode(otherlv_24, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2135:1: entryRuleIndicator returns [EObject current=null] : iv_ruleIndicator= ruleIndicator EOF ;
    public final EObject entryRuleIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicator = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2136:2: (iv_ruleIndicator= ruleIndicator EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2137:2: iv_ruleIndicator= ruleIndicator EOF
            {
             newCompositeNode(grammarAccess.getIndicatorRule()); 
            pushFollow(FOLLOW_ruleIndicator_in_entryRuleIndicator5389);
            iv_ruleIndicator=ruleIndicator();

            state._fsp--;

             current =iv_ruleIndicator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndicator5399); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2144:1: ruleIndicator returns [EObject current=null] : (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ;
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
        Token otherlv_24=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_decompositionType_18_0 = null;

        Enumerator lv_importance_20_0 = null;

        EObject lv_elementLinks_23_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2147:28: ( (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2148:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2148:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2148:3: otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleIndicator5436); 

                	newLeafNode(otherlv_0, grammarAccess.getIndicatorAccess().getIndicatorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2152:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2153:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2153:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2154:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator5453); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleIndicator5470); 

                	newLeafNode(otherlv_2, grammarAccess.getIndicatorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2174:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2176:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2176:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2177:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2180:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2181:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2181:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            loop27:
            do {
                int alt27=7;
                int LA27_0 = input.LA(1);

                if ( LA27_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0) ) {
                    alt27=1;
                }
                else if ( LA27_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1) ) {
                    alt27=2;
                }
                else if ( LA27_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2) ) {
                    alt27=3;
                }
                else if ( LA27_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3) ) {
                    alt27=4;
                }
                else if ( (LA27_0==RULE_INT|| LA27_0 >=55 && LA27_0<=58) && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4) ) {
                    alt27=5;
                }
                else if ( (LA27_0==RULE_ID||LA27_0==29|| LA27_0 >=31 && LA27_0<=32) && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5) ) {
                    alt27=6;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2183:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2183:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2184:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2184:106: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2185:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2188:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2188:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2188:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2188:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleIndicator5528); 

            	        	newLeafNode(otherlv_4, grammarAccess.getIndicatorAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5540); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2196:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2197:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2197:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2198:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator5557); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5574); 

            	        	newLeafNode(otherlv_7, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2225:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2225:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2226:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2226:106: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2227:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2230:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2230:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2230:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2230:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleIndicator5642); 

            	        	newLeafNode(otherlv_8, grammarAccess.getIndicatorAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5654); 

            	        	newLeafNode(otherlv_9, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2238:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2239:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2239:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2240:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator5671); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5688); 

            	        	newLeafNode(otherlv_11, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2267:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2267:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2268:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2268:106: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2269:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2272:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2272:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2272:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2272:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleIndicator5756); 

            	        	newLeafNode(otherlv_12, grammarAccess.getIndicatorAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5768); 

            	        	newLeafNode(otherlv_13, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2280:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2281:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2281:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2282:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleIndicator5789);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5801); 

            	        	newLeafNode(otherlv_15, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2309:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2309:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2310:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2310:106: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2311:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2314:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2314:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2314:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2314:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleIndicator5869); 

            	        	newLeafNode(otherlv_16, grammarAccess.getIndicatorAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5881); 

            	        	newLeafNode(otherlv_17, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2322:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2323:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2323:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2324:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleIndicator5902);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5914); 

            	        	newLeafNode(otherlv_19, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2351:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2351:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2352:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2352:106: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2353:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2356:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2356:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2356:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2356:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2356:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( ((LA25_0>=55 && LA25_0<=58)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2356:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2356:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2357:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2357:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2358:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getIndicatorAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleIndicator5992);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2375:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2375:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2376:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2376:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2377:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIndicator6015); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6033); 

            	        	newLeafNode(otherlv_22, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2404:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2404:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2405:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2405:106: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2406:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2409:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    int cnt26=0;
            	    loop26:
            	    do {
            	        int alt26=2;
            	        switch ( input.LA(1) ) {
            	        case 29:
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
            	        case 32:
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
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2409:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2409:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2410:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2410:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2411:3: lv_elementLinks_23_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getElementLinksInLineElementLinkParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleIndicator6109);
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
            	    	    if ( cnt26 >= 1 ) break loop26;
            	                EarlyExitException eee =
            	                    new EarlyExitException(26, input);
            	                throw eee;
            	        }
            	        cnt26++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	

            }

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleIndicator6162); 

                	newLeafNode(otherlv_24, grammarAccess.getIndicatorAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2453:1: entryRuleBelief returns [EObject current=null] : iv_ruleBelief= ruleBelief EOF ;
    public final EObject entryRuleBelief() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelief = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2454:2: (iv_ruleBelief= ruleBelief EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2455:2: iv_ruleBelief= ruleBelief EOF
            {
             newCompositeNode(grammarAccess.getBeliefRule()); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief6198);
            iv_ruleBelief=ruleBelief();

            state._fsp--;

             current =iv_ruleBelief; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief6208); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2462:1: ruleBelief returns [EObject current=null] : (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleBelief() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_label_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_description_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2465:28: ( (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2466:1: (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2466:1: (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2466:3: otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleBelief6245); 

                	newLeafNode(otherlv_0, grammarAccess.getBeliefAccess().getBeliefKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2470:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2471:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2471:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2472:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBelief6262); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBelief6279); 

                	newLeafNode(otherlv_2, grammarAccess.getBeliefAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2492:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2494:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2494:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2495:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2498:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2499:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2499:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( LA28_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0) ) {
                    alt28=1;
                }
                else if ( LA28_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1) ) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2501:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2501:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2502:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2502:103: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2503:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2506:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleBelief6337); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBeliefAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleBelief6349); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBeliefAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2514:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2515:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2515:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2516:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelief6366); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleBelief6383); 

            	        	newLeafNode(otherlv_7, grammarAccess.getBeliefAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2543:4: ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2543:4: ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2544:5: {...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2544:103: ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2545:6: ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2548:6: ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2548:7: {...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2548:16: (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2548:18: otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleBelief6451); 

            	        	newLeafNode(otherlv_8, grammarAccess.getBeliefAccess().getDescriptionKeyword_3_1_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2552:1: ( (lv_description_9_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2553:1: (lv_description_9_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2553:1: (lv_description_9_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2554:3: lv_description_9_0= RULE_STRING
            	    {
            	    lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelief6468); 

            	    			newLeafNode(lv_description_9_0, grammarAccess.getBeliefAccess().getDescriptionSTRINGTerminalRuleCall_3_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getBeliefRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_9_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleBelief6485); 

            	        	newLeafNode(otherlv_10, grammarAccess.getBeliefAccess().getSemicolonKeyword_3_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	

            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleBelief6538); 

                	newLeafNode(otherlv_11, grammarAccess.getBeliefAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2600:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2601:2: (iv_ruleDecomposition= ruleDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2602:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             newCompositeNode(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition6574);
            iv_ruleDecomposition=ruleDecomposition();

            state._fsp--;

             current =iv_ruleDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition6584); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2609:1: ruleDecomposition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2612:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2613:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2613:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2613:2: ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2613:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2614:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2614:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2615:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecompositionAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecomposition6632);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleDecomposition6644); 

                	newLeafNode(otherlv_1, grammarAccess.getDecompositionAccess().getDecomposedByKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2632:1: ( (lv_dest_2_0= ruleDecompositionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2633:1: (lv_dest_2_0= ruleDecompositionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2633:1: (lv_dest_2_0= ruleDecompositionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2634:3: lv_dest_2_0= ruleDecompositionEnd
            {
             
            	        newCompositeNode(grammarAccess.getDecompositionAccess().getDestDecompositionEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleDecomposition6665);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2650:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==30) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2650:4: otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDecomposition6678); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDecompositionAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2654:1: ( (lv_dest_4_0= ruleDecompositionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2655:1: (lv_dest_4_0= ruleDecompositionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2655:1: (lv_dest_4_0= ruleDecompositionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2656:3: lv_dest_4_0= ruleDecompositionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDecompositionAccess().getDestDecompositionEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleDecomposition6699);
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
            	    break loop29;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDecomposition6713); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2684:1: entryRuleInLineDecomposition returns [EObject current=null] : iv_ruleInLineDecomposition= ruleInLineDecomposition EOF ;
    public final EObject entryRuleInLineDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2685:2: (iv_ruleInLineDecomposition= ruleInLineDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2686:2: iv_ruleInLineDecomposition= ruleInLineDecomposition EOF
            {
             newCompositeNode(grammarAccess.getInLineDecompositionRule()); 
            pushFollow(FOLLOW_ruleInLineDecomposition_in_entryRuleInLineDecomposition6749);
            iv_ruleInLineDecomposition=ruleInLineDecomposition();

            state._fsp--;

             current =iv_ruleInLineDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineDecomposition6759); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2693:1: ruleInLineDecomposition returns [EObject current=null] : (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2696:28: ( (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2697:1: (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2697:1: (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2697:3: otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleInLineDecomposition6796); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineDecompositionAccess().getDecomposedByKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2701:1: ( (lv_dest_1_0= ruleDecompositionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2702:1: (lv_dest_1_0= ruleDecompositionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2702:1: (lv_dest_1_0= ruleDecompositionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2703:3: lv_dest_1_0= ruleDecompositionEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineDecompositionAccess().getDestDecompositionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition6817);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2719:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==30) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2719:4: otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleInLineDecomposition6830); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineDecompositionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2723:1: ( (lv_dest_3_0= ruleDecompositionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2724:1: (lv_dest_3_0= ruleDecompositionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2724:1: (lv_dest_3_0= ruleDecompositionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2725:3: lv_dest_3_0= ruleDecompositionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineDecompositionAccess().getDestDecompositionEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition6851);
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
            	    break loop30;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleInLineDecomposition6865); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2753:1: entryRuleDecompositionEnd returns [EObject current=null] : iv_ruleDecompositionEnd= ruleDecompositionEnd EOF ;
    public final EObject entryRuleDecompositionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecompositionEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2754:2: (iv_ruleDecompositionEnd= ruleDecompositionEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2755:2: iv_ruleDecompositionEnd= ruleDecompositionEnd EOF
            {
             newCompositeNode(grammarAccess.getDecompositionEndRule()); 
            pushFollow(FOLLOW_ruleDecompositionEnd_in_entryRuleDecompositionEnd6901);
            iv_ruleDecompositionEnd=ruleDecompositionEnd();

            state._fsp--;

             current =iv_ruleDecompositionEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecompositionEnd6911); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2762:1: ruleDecompositionEnd returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) ;
    public final EObject ruleDecompositionEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2765:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2766:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2766:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2766:2: ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2766:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2767:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2767:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2768:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecompositionEndAccess().getNameIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecompositionEnd6959);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2781:2: (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==14) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2781:4: otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDecompositionEnd6972); 

                        	newLeafNode(otherlv_1, grammarAccess.getDecompositionEndAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2785:1: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_STRING) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2786:1: (lv_description_2_0= RULE_STRING )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2786:1: (lv_description_2_0= RULE_STRING )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2787:3: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecompositionEnd6989); 

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

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDecompositionEnd7007); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2815:1: entryRuleContribution returns [EObject current=null] : iv_ruleContribution= ruleContribution EOF ;
    public final EObject entryRuleContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2816:2: (iv_ruleContribution= ruleContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2817:2: iv_ruleContribution= ruleContribution EOF
            {
             newCompositeNode(grammarAccess.getContributionRule()); 
            pushFollow(FOLLOW_ruleContribution_in_entryRuleContribution7045);
            iv_ruleContribution=ruleContribution();

            state._fsp--;

             current =iv_ruleContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContribution7055); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2824:1: ruleContribution returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2827:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2828:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2828:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2828:2: ( ( ruleQualifiedName ) ) otherlv_1= 'contributeTo' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2828:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2829:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2829:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2830:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContribution7103);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleContribution7115); 

                	newLeafNode(otherlv_1, grammarAccess.getContributionAccess().getContributeToKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2847:1: ( (lv_dest_2_0= ruleContributionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2848:1: (lv_dest_2_0= ruleContributionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2848:1: (lv_dest_2_0= ruleContributionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2849:3: lv_dest_2_0= ruleContributionEnd
            {
             
            	        newCompositeNode(grammarAccess.getContributionAccess().getDestContributionEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleContributionEnd_in_ruleContribution7136);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2865:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==30) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2865:4: otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleContribution7149); 

            	        	newLeafNode(otherlv_3, grammarAccess.getContributionAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2869:1: ( (lv_dest_4_0= ruleContributionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2870:1: (lv_dest_4_0= ruleContributionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2870:1: (lv_dest_4_0= ruleContributionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2871:3: lv_dest_4_0= ruleContributionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionAccess().getDestContributionEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionEnd_in_ruleContribution7170);
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
            	    break loop33;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleContribution7184); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2899:1: entryRuleInLineContribution returns [EObject current=null] : iv_ruleInLineContribution= ruleInLineContribution EOF ;
    public final EObject entryRuleInLineContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2900:2: (iv_ruleInLineContribution= ruleInLineContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2901:2: iv_ruleInLineContribution= ruleInLineContribution EOF
            {
             newCompositeNode(grammarAccess.getInLineContributionRule()); 
            pushFollow(FOLLOW_ruleInLineContribution_in_entryRuleInLineContribution7220);
            iv_ruleInLineContribution=ruleInLineContribution();

            state._fsp--;

             current =iv_ruleInLineContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineContribution7230); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2908:1: ruleInLineContribution returns [EObject current=null] : (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2911:28: ( (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2912:1: (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2912:1: (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2912:3: otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleInLineContribution7267); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineContributionAccess().getContributeToKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2916:1: ( (lv_dest_1_0= ruleContributionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2917:1: (lv_dest_1_0= ruleContributionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2917:1: (lv_dest_1_0= ruleContributionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2918:3: lv_dest_1_0= ruleContributionEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineContributionAccess().getDestContributionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleContributionEnd_in_ruleInLineContribution7288);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2934:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==30) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2934:4: otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleInLineContribution7301); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineContributionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2938:1: ( (lv_dest_3_0= ruleContributionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2939:1: (lv_dest_3_0= ruleContributionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2939:1: (lv_dest_3_0= ruleContributionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2940:3: lv_dest_3_0= ruleContributionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineContributionAccess().getDestContributionEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionEnd_in_ruleInLineContribution7322);
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
            	    break loop34;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleInLineContribution7336); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2968:1: entryRuleContributionEnd returns [EObject current=null] : iv_ruleContributionEnd= ruleContributionEnd EOF ;
    public final EObject entryRuleContributionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2969:2: (iv_ruleContributionEnd= ruleContributionEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2970:2: iv_ruleContributionEnd= ruleContributionEnd EOF
            {
             newCompositeNode(grammarAccess.getContributionEndRule()); 
            pushFollow(FOLLOW_ruleContributionEnd_in_entryRuleContributionEnd7372);
            iv_ruleContributionEnd=ruleContributionEnd();

            state._fsp--;

             current =iv_ruleContributionEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionEnd7382); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2977:1: ruleContributionEnd returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ) ;
    public final EObject ruleContributionEnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_quantitativeContribution_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_contribution_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2980:28: ( ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2981:1: ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2981:1: ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2981:2: ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2981:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ID) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==RULE_ID) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2982:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2982:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2983:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionEnd7424); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2999:3: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3000:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3000:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3001:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionEndAccess().getDesnameIntentionalElementCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionEnd7453);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3014:2: (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==14) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3014:4: otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContributionEnd7466); 

                        	newLeafNode(otherlv_2, grammarAccess.getContributionEndAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3018:1: ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )?
                    int alt36=3;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=62 && LA36_0<=68)) ) {
                        alt36=1;
                    }
                    else if ( (LA36_0==RULE_INT) ) {
                        alt36=2;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3018:2: ( (lv_contribution_3_0= ruleContributionType ) )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3018:2: ( (lv_contribution_3_0= ruleContributionType ) )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3019:1: (lv_contribution_3_0= ruleContributionType )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3019:1: (lv_contribution_3_0= ruleContributionType )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3020:3: lv_contribution_3_0= ruleContributionType
                            {
                             
                            	        newCompositeNode(grammarAccess.getContributionEndAccess().getContributionContributionTypeEnumRuleCall_2_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContributionType_in_ruleContributionEnd7488);
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
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3037:6: ( (lv_quantitativeContribution_4_0= RULE_INT ) )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3037:6: ( (lv_quantitativeContribution_4_0= RULE_INT ) )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3038:1: (lv_quantitativeContribution_4_0= RULE_INT )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3038:1: (lv_quantitativeContribution_4_0= RULE_INT )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3039:3: lv_quantitativeContribution_4_0= RULE_INT
                            {
                            lv_quantitativeContribution_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionEnd7511); 

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

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleContributionEnd7530); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3067:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3068:2: (iv_ruleDependency= ruleDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3069:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency7568);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency7578); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3076:1: ruleDependency returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3079:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3080:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3080:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3080:2: ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3080:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3081:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3081:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3082:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependency7626);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleDependency7638); 

                	newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getDependOnKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3099:1: ( (lv_dest_2_0= ruleDependencyEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3100:1: (lv_dest_2_0= ruleDependencyEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3100:1: (lv_dest_2_0= ruleDependencyEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3101:3: lv_dest_2_0= ruleDependencyEnd
            {
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getDestDependencyEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyEnd_in_ruleDependency7659);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3117:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==30) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3117:4: otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleDependency7672); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3121:1: ( (lv_dest_4_0= ruleDependencyEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3122:1: (lv_dest_4_0= ruleDependencyEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3122:1: (lv_dest_4_0= ruleDependencyEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3123:3: lv_dest_4_0= ruleDependencyEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependencyAccess().getDestDependencyEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyEnd_in_ruleDependency7693);
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
            	    break loop38;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDependency7707); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3151:1: entryRuleInLineDependency returns [EObject current=null] : iv_ruleInLineDependency= ruleInLineDependency EOF ;
    public final EObject entryRuleInLineDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3152:2: (iv_ruleInLineDependency= ruleInLineDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3153:2: iv_ruleInLineDependency= ruleInLineDependency EOF
            {
             newCompositeNode(grammarAccess.getInLineDependencyRule()); 
            pushFollow(FOLLOW_ruleInLineDependency_in_entryRuleInLineDependency7743);
            iv_ruleInLineDependency=ruleInLineDependency();

            state._fsp--;

             current =iv_ruleInLineDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineDependency7753); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3160:1: ruleInLineDependency returns [EObject current=null] : (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3163:28: ( (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3164:1: (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3164:1: (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3164:3: otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleInLineDependency7790); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineDependencyAccess().getDependOnKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3168:1: ( (lv_dest_1_0= ruleDependencyEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3169:1: (lv_dest_1_0= ruleDependencyEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3169:1: (lv_dest_1_0= ruleDependencyEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3170:3: lv_dest_1_0= ruleDependencyEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineDependencyAccess().getDestDependencyEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7811);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3186:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==30) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3186:4: otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleInLineDependency7824); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineDependencyAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3190:1: ( (lv_dest_3_0= ruleDependencyEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3191:1: (lv_dest_3_0= ruleDependencyEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3191:1: (lv_dest_3_0= ruleDependencyEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3192:3: lv_dest_3_0= ruleDependencyEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineDependencyAccess().getDestDependencyEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7845);
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
            	    break loop39;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleInLineDependency7859); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3220:1: entryRuleDependencyEnd returns [EObject current=null] : iv_ruleDependencyEnd= ruleDependencyEnd EOF ;
    public final EObject entryRuleDependencyEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3221:2: (iv_ruleDependencyEnd= ruleDependencyEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3222:2: iv_ruleDependencyEnd= ruleDependencyEnd EOF
            {
             newCompositeNode(grammarAccess.getDependencyEndRule()); 
            pushFollow(FOLLOW_ruleDependencyEnd_in_entryRuleDependencyEnd7895);
            iv_ruleDependencyEnd=ruleDependencyEnd();

            state._fsp--;

             current =iv_ruleDependencyEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyEnd7905); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3229:1: ruleDependencyEnd returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) ;
    public final EObject ruleDependencyEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3232:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3233:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3233:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3233:2: ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3233:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3234:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3234:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3235:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyEndAccess().getNameIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependencyEnd7953);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3248:2: (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==14) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3248:4: otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDependencyEnd7966); 

                        	newLeafNode(otherlv_1, grammarAccess.getDependencyEndAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3252:1: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_STRING) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3253:1: (lv_description_2_0= RULE_STRING )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3253:1: (lv_description_2_0= RULE_STRING )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3254:3: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependencyEnd7983); 

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

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDependencyEnd8001); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3282:1: entryRuleStrategyGroup returns [EObject current=null] : iv_ruleStrategyGroup= ruleStrategyGroup EOF ;
    public final EObject entryRuleStrategyGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategyGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3283:2: (iv_ruleStrategyGroup= ruleStrategyGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3284:2: iv_ruleStrategyGroup= ruleStrategyGroup EOF
            {
             newCompositeNode(grammarAccess.getStrategyGroupRule()); 
            pushFollow(FOLLOW_ruleStrategyGroup_in_entryRuleStrategyGroup8039);
            iv_ruleStrategyGroup=ruleStrategyGroup();

            state._fsp--;

             current =iv_ruleStrategyGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrategyGroup8049); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3291:1: ruleStrategyGroup returns [EObject current=null] : (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleStrategyGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3294:28: ( (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3295:1: (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3295:1: (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3295:3: otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleStrategyGroup8086); 

                	newLeafNode(otherlv_0, grammarAccess.getStrategyGroupAccess().getStrategyGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3299:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3300:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3300:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3301:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStrategyGroup8103); 

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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleStrategyGroup8120); 

                	newLeafNode(otherlv_2, grammarAccess.getStrategyGroupAccess().getIncludesKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3321:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3322:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3322:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3323:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStrategyGroupRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStrategyGroupAccess().getStrategiesEvaluationStrategyCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8143);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3336:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==30) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3336:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleStrategyGroup8156); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStrategyGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3340:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3341:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3341:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3342:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStrategyGroupRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getStrategyGroupAccess().getStrategiesEvaluationStrategyCrossReference_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8179);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleStrategyGroup8193); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3367:1: entryRuleEvaluationStrategy returns [EObject current=null] : iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF ;
    public final EObject entryRuleEvaluationStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationStrategy = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3368:2: (iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3369:2: iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF
            {
             newCompositeNode(grammarAccess.getEvaluationStrategyRule()); 
            pushFollow(FOLLOW_ruleEvaluationStrategy_in_entryRuleEvaluationStrategy8229);
            iv_ruleEvaluationStrategy=ruleEvaluationStrategy();

            state._fsp--;

             current =iv_ruleEvaluationStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationStrategy8239); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3376:1: ruleEvaluationStrategy returns [EObject current=null] : (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_evaluations_7_0= ruleEvaluation ) )* otherlv_8= '}' ) ;
    public final EObject ruleEvaluationStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_evaluations_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3379:28: ( (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_evaluations_7_0= ruleEvaluation ) )* otherlv_8= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3380:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_evaluations_7_0= ruleEvaluation ) )* otherlv_8= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3380:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_evaluations_7_0= ruleEvaluation ) )* otherlv_8= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3380:3: otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_evaluations_7_0= ruleEvaluation ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleEvaluationStrategy8276); 

                	newLeafNode(otherlv_0, grammarAccess.getEvaluationStrategyAccess().getStrategyKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3384:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3385:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3385:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3386:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvaluationStrategy8293); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3402:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==36) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3402:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleEvaluationStrategy8311); 

                        	newLeafNode(otherlv_2, grammarAccess.getEvaluationStrategyAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3406:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3407:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3407:1: ( ruleQualifiedName )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3408:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getSuperStrategiesEvaluationStrategyCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy8334);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3421:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==30) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3421:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleEvaluationStrategy8347); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getEvaluationStrategyAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3425:1: ( ( ruleQualifiedName ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3426:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3426:1: ( ruleQualifiedName )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3427:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getSuperStrategiesEvaluationStrategyCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy8370);
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


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEvaluationStrategy8386); 

                	newLeafNode(otherlv_6, grammarAccess.getEvaluationStrategyAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3444:1: ( (lv_evaluations_7_0= ruleEvaluation ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==RULE_ID) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3445:1: (lv_evaluations_7_0= ruleEvaluation )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3445:1: (lv_evaluations_7_0= ruleEvaluation )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3446:3: lv_evaluations_7_0= ruleEvaluation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getEvaluationsEvaluationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvaluation_in_ruleEvaluationStrategy8407);
            	    lv_evaluations_7_0=ruleEvaluation();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEvaluationStrategyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"evaluations",
            	            		lv_evaluations_7_0, 
            	            		"Evaluation");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEvaluationStrategy8420); 

                	newLeafNode(otherlv_8, grammarAccess.getEvaluationStrategyAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3474:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3475:2: (iv_ruleEvaluation= ruleEvaluation EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3476:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation8456);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation8466); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3483:1: ruleEvaluation returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3486:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3487:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3487:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3487:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3487:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3488:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3488:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3489:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEvaluationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEvaluationAccess().getIntentionalElementIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluation8514);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation8526); 

                	newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3506:1: ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==55||LA46_0==65||(LA46_0>=69 && LA46_0<=73)) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_INT) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3506:2: ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3506:2: ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3507:1: (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3507:1: (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3508:3: lv_qualitativeEvaluation_2_0= ruleQualitativeLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvaluationAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleEvaluation8548);
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3525:6: ( (lv_evaluation_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3525:6: ( (lv_evaluation_3_0= RULE_INT ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3526:1: (lv_evaluation_3_0= RULE_INT )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3526:1: (lv_evaluation_3_0= RULE_INT )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3527:3: lv_evaluation_3_0= RULE_INT
                    {
                    lv_evaluation_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluation8571); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3543:3: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=14 && LA50_0<=15)||(LA50_0>=38 && LA50_0<=46)) ) {
                alt50=1;
            }
            else if ( (LA50_0==19) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3543:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3543:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3545:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3545:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3546:2: ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?)
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3549:2: ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?)
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3550:3: ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3550:3: ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=4;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==15) ) {
                            int LA49_2 = input.LA(2);

                            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2) ) {
                                alt49=3;
                            }


                        }
                        else if ( LA49_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0) ) {
                            alt49=1;
                        }
                        else if ( LA49_0 >=38 && LA49_0<=40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1) ) {
                            alt49=2;
                        }
                        else if ( LA49_0 >=41 && LA49_0<=46 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2) ) {
                            alt49=3;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3552:4: ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3552:4: ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3553:5: {...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3553:109: ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3554:6: ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3557:6: ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3557:7: {...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3557:16: (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3557:18: otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )?
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEvaluation8636); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3_0_0_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3561:1: ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )?
                    	    int alt47=2;
                    	    int LA47_0 = input.LA(1);

                    	    if ( (LA47_0==37) ) {
                    	        alt47=1;
                    	    }
                    	    switch (alt47) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3561:2: ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';'
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3561:2: ( (lv_exceeds_6_0= 'exceeds' ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3562:1: (lv_exceeds_6_0= 'exceeds' )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3562:1: (lv_exceeds_6_0= 'exceeds' )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3563:3: lv_exceeds_6_0= 'exceeds'
                    	            {
                    	            lv_exceeds_6_0=(Token)match(input,37,FOLLOW_37_in_ruleEvaluation8655); 

                    	                    newLeafNode(lv_exceeds_6_0, grammarAccess.getEvaluationAccess().getExceedsExceedsKeyword_3_0_0_1_0_0());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getEvaluationRule());
                    	            	        }
                    	                   		setWithLastConsumed(current, "exceeds", true, "exceeds");
                    	            	    

                    	            }


                    	            }

                    	            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation8680); 

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
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3587:4: ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3587:4: ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3588:5: {...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3588:109: ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3589:6: ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3592:6: ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3592:7: {...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3592:16: ( (lv_evalRange_8_0= ruleEvaluationRange ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3593:1: (lv_evalRange_8_0= ruleEvaluationRange )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3593:1: (lv_evalRange_8_0= ruleEvaluationRange )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3594:3: lv_evalRange_8_0= ruleEvaluationRange
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getEvalRangeEvaluationRangeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvaluationRange_in_ruleEvaluation8758);
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
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3617:4: ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3617:4: ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3618:5: {...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3618:109: ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3619:6: ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3622:6: ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3622:7: {...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3622:16: ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3622:17: ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}'
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3622:17: ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )?
                    	    int alt48=2;
                    	    int LA48_0 = input.LA(1);

                    	    if ( ((LA48_0>=41 && LA48_0<=46)) ) {
                    	        alt48=1;
                    	    }
                    	    switch (alt48) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3623:1: (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3623:1: (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3624:3: lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getEvaluationAccess().getKpiEvalValueSetKPIEvalValueSetParserRuleCall_3_0_2_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation8834);
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

                    	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEvaluation8847); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_3_0_2_1());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0());
                    	    	 				

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt49 >= 1 ) break loop49;
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3660:7: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation8912); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3672:1: entryRuleEvaluationRange returns [EObject current=null] : iv_ruleEvaluationRange= ruleEvaluationRange EOF ;
    public final EObject entryRuleEvaluationRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3673:2: (iv_ruleEvaluationRange= ruleEvaluationRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3674:2: iv_ruleEvaluationRange= ruleEvaluationRange EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRangeRule()); 
            pushFollow(FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange8949);
            iv_ruleEvaluationRange=ruleEvaluationRange();

            state._fsp--;

             current =iv_ruleEvaluationRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationRange8959); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3681:1: ruleEvaluationRange returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3684:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3685:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3685:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3687:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3687:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3688:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3691:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3692:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3692:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=4;
                switch ( input.LA(1) ) {
                case 38:
                    {
                    int LA51_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0) ) {
                        alt51=1;
                    }


                    }
                    break;
                case 39:
                    {
                    int LA51_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1) ) {
                        alt51=2;
                    }


                    }
                    break;
                case 40:
                    {
                    int LA51_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2) ) {
                        alt51=3;
                    }


                    }
                    break;

                }

                switch (alt51) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3694:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3694:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3695:5: {...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3695:110: ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3696:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3699:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3699:7: {...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3699:16: (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3699:18: otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleEvaluationRange9041); 

            	        	newLeafNode(otherlv_1, grammarAccess.getEvaluationRangeAccess().getStartKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange9053); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3707:1: ( (lv_start_3_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3708:1: (lv_start_3_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3708:1: (lv_start_3_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3709:3: lv_start_3_0= RULE_INT
            	    {
            	    lv_start_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange9070); 

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

            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange9087); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3736:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3736:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3737:5: {...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3737:110: ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3738:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3741:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3741:7: {...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3741:16: (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3741:18: otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleEvaluationRange9155); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEvaluationRangeAccess().getEndKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange9167); 

            	        	newLeafNode(otherlv_6, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3749:1: ( (lv_end_7_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3750:1: (lv_end_7_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3750:1: (lv_end_7_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3751:3: lv_end_7_0= RULE_INT
            	    {
            	    lv_end_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange9184); 

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

            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange9201); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3778:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3778:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3779:5: {...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3779:110: ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3780:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3783:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3783:7: {...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3783:16: (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3783:18: otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleEvaluationRange9269); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEvaluationRangeAccess().getStepKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange9281); 

            	        	newLeafNode(otherlv_10, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3791:1: ( (lv_step_11_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3792:1: (lv_step_11_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3792:1: (lv_step_11_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3793:3: lv_step_11_0= RULE_INT
            	    {
            	    lv_step_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange9298); 

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

            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange9315); 

            	        	newLeafNode(otherlv_12, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3836:1: entryRuleKPIEvalValueSet returns [EObject current=null] : iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF ;
    public final EObject entryRuleKPIEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3837:2: (iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3838:2: iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet9397);
            iv_ruleKPIEvalValueSet=ruleKPIEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIEvalValueSet9407); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3845:1: ruleKPIEvalValueSet returns [EObject current=null] : (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet ) ;
    public final EObject ruleKPIEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject this_KPIQuantitativeEvalValueSet_0 = null;

        EObject this_KPIQualitativeEvalValueSet_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3848:28: ( (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3849:1: (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3849:1: (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=41 && LA52_0<=45)) ) {
                alt52=1;
            }
            else if ( (LA52_0==46) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3850:5: this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet
                    {
                     
                            newCompositeNode(grammarAccess.getKPIEvalValueSetAccess().getKPIQuantitativeEvalValueSetParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleKPIQuantitativeEvalValueSet_in_ruleKPIEvalValueSet9454);
                    this_KPIQuantitativeEvalValueSet_0=ruleKPIQuantitativeEvalValueSet();

                    state._fsp--;

                     
                            current = this_KPIQuantitativeEvalValueSet_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3860:5: this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet
                    {
                     
                            newCompositeNode(grammarAccess.getKPIEvalValueSetAccess().getKPIQualitativeEvalValueSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleKPIQualitativeEvalValueSet_in_ruleKPIEvalValueSet9481);
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3876:1: entryRuleKPIQuantitativeEvalValueSet returns [EObject current=null] : iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF ;
    public final EObject entryRuleKPIQuantitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIQuantitativeEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3877:2: (iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3878:2: iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIQuantitativeEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIQuantitativeEvalValueSet_in_entryRuleKPIQuantitativeEvalValueSet9516);
            iv_ruleKPIQuantitativeEvalValueSet=ruleKPIQuantitativeEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIQuantitativeEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIQuantitativeEvalValueSet9526); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3885:1: ruleKPIQuantitativeEvalValueSet returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3888:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3889:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3889:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3891:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3891:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3892:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3895:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3896:3: ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3896:3: ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=6;
                int LA53_0 = input.LA(1);

                if ( LA53_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0) ) {
                    alt53=1;
                }
                else if ( LA53_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1) ) {
                    alt53=2;
                }
                else if ( LA53_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2) ) {
                    alt53=3;
                }
                else if ( LA53_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3) ) {
                    alt53=4;
                }
                else if ( LA53_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4) ) {
                    alt53=5;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3898:4: ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3898:4: ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3899:5: {...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3899:122: ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3900:6: ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3903:6: ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3903:7: {...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3903:16: (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3903:18: otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleKPIQuantitativeEvalValueSet9608); 

            	        	newLeafNode(otherlv_1, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getTargetKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet9620); 

            	        	newLeafNode(otherlv_2, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3911:1: ( (lv_targetValue_3_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3912:1: (lv_targetValue_3_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3912:1: (lv_targetValue_3_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3913:3: lv_targetValue_3_0= RULE_DOUBLE
            	    {
            	    lv_targetValue_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet9637); 

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

            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet9654); 

            	        	newLeafNode(otherlv_4, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3940:4: ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3940:4: ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3941:5: {...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3941:122: ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3942:6: ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3945:6: ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3945:7: {...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3945:16: (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3945:18: otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleKPIQuantitativeEvalValueSet9722); 

            	        	newLeafNode(otherlv_5, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getThresholdKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet9734); 

            	        	newLeafNode(otherlv_6, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3953:1: ( (lv_thresholdValue_7_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3954:1: (lv_thresholdValue_7_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3954:1: (lv_thresholdValue_7_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3955:3: lv_thresholdValue_7_0= RULE_DOUBLE
            	    {
            	    lv_thresholdValue_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet9751); 

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

            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet9768); 

            	        	newLeafNode(otherlv_8, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3982:4: ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3982:4: ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3983:5: {...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3983:122: ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3984:6: ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3987:6: ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3987:7: {...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3987:16: (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3987:18: otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,43,FOLLOW_43_in_ruleKPIQuantitativeEvalValueSet9836); 

            	        	newLeafNode(otherlv_9, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getWorstKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet9848); 

            	        	newLeafNode(otherlv_10, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3995:1: ( (lv_worstValue_11_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3996:1: (lv_worstValue_11_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3996:1: (lv_worstValue_11_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3997:3: lv_worstValue_11_0= RULE_DOUBLE
            	    {
            	    lv_worstValue_11_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet9865); 

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

            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet9882); 

            	        	newLeafNode(otherlv_12, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4024:4: ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4024:4: ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4025:5: {...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4025:122: ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4026:6: ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4029:6: ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4029:7: {...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4029:16: (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4029:18: otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';'
            	    {
            	    otherlv_13=(Token)match(input,44,FOLLOW_44_in_ruleKPIQuantitativeEvalValueSet9950); 

            	        	newLeafNode(otherlv_13, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEvalKeyword_3_0());
            	        
            	    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet9962); 

            	        	newLeafNode(otherlv_14, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4037:1: ( (lv_evaluationValue_15_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4038:1: (lv_evaluationValue_15_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4038:1: (lv_evaluationValue_15_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4039:3: lv_evaluationValue_15_0= RULE_DOUBLE
            	    {
            	    lv_evaluationValue_15_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet9979); 

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

            	    otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet9996); 

            	        	newLeafNode(otherlv_16, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4066:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4066:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4067:5: {...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4067:122: ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4068:6: ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4071:6: ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4071:7: {...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4071:16: (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4071:18: otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';'
            	    {
            	    otherlv_17=(Token)match(input,45,FOLLOW_45_in_ruleKPIQuantitativeEvalValueSet10064); 

            	        	newLeafNode(otherlv_17, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnitKeyword_4_0());
            	        
            	    otherlv_18=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet10076); 

            	        	newLeafNode(otherlv_18, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4079:1: ( (lv_unit_19_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4080:1: (lv_unit_19_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4080:1: (lv_unit_19_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4081:3: lv_unit_19_0= RULE_STRING
            	    {
            	    lv_unit_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKPIQuantitativeEvalValueSet10093); 

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

            	    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10110); 

            	        	newLeafNode(otherlv_20, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4124:1: entryRuleKPIQualitativeEvalValueSet returns [EObject current=null] : iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF ;
    public final EObject entryRuleKPIQualitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIQualitativeEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4125:2: (iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4126:2: iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIQualitativeEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIQualitativeEvalValueSet_in_entryRuleKPIQualitativeEvalValueSet10192);
            iv_ruleKPIQualitativeEvalValueSet=ruleKPIQualitativeEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIQualitativeEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIQualitativeEvalValueSet10202); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4133:1: ruleKPIQualitativeEvalValueSet returns [EObject current=null] : (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleKPIQualitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4136:28: ( (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4137:1: (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4137:1: (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4137:3: otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleKPIQualitativeEvalValueSet10239); 

                	newLeafNode(otherlv_0, grammarAccess.getKPIQualitativeEvalValueSetAccess().getQualevalKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleKPIQualitativeEvalValueSet10251); 

                	newLeafNode(otherlv_1, grammarAccess.getKPIQualitativeEvalValueSetAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4145:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4146:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4146:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4147:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getKPIQualitativeEvalValueSetRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getKPIQualitativeEvalValueSetAccess().getQualitativeEvaluationValueMappingCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleKPIQualitativeEvalValueSet10274);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleKPIQualitativeEvalValueSet10286); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4172:1: entryRuleQualitativeMapping returns [EObject current=null] : iv_ruleQualitativeMapping= ruleQualitativeMapping EOF ;
    public final EObject entryRuleQualitativeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeMapping = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4173:2: (iv_ruleQualitativeMapping= ruleQualitativeMapping EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4174:2: iv_ruleQualitativeMapping= ruleQualitativeMapping EOF
            {
             newCompositeNode(grammarAccess.getQualitativeMappingRule()); 
            pushFollow(FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping10322);
            iv_ruleQualitativeMapping=ruleQualitativeMapping();

            state._fsp--;

             current =iv_ruleQualitativeMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitativeMapping10332); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4181:1: ruleQualitativeMapping returns [EObject current=null] : (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappin_3_0= ruleMapping ) )* otherlv_4= '}' ) ;
    public final EObject ruleQualitativeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mappin_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4184:28: ( (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappin_3_0= ruleMapping ) )* otherlv_4= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4185:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappin_3_0= ruleMapping ) )* otherlv_4= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4185:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappin_3_0= ruleMapping ) )* otherlv_4= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4185:3: otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappin_3_0= ruleMapping ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleQualitativeMapping10369); 

                	newLeafNode(otherlv_0, grammarAccess.getQualitativeMappingAccess().getQualitativeMappingKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4189:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4190:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4190:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4191:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeMapping10386); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleQualitativeMapping10403); 

                	newLeafNode(otherlv_2, grammarAccess.getQualitativeMappingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4211:1: ( (lv_mappin_3_0= ruleMapping ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_STRING) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4212:1: (lv_mappin_3_0= ruleMapping )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4212:1: (lv_mappin_3_0= ruleMapping )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4213:3: lv_mappin_3_0= ruleMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQualitativeMappingAccess().getMappinMappingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMapping_in_ruleQualitativeMapping10424);
            	    lv_mappin_3_0=ruleMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQualitativeMappingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mappin",
            	            		lv_mappin_3_0, 
            	            		"Mapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleQualitativeMapping10437); 

                	newLeafNode(otherlv_4, grammarAccess.getQualitativeMappingAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4241:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4242:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4243:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping10473);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping10483); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4250:1: ruleMapping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4253:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4254:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4254:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4254:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4254:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4255:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4255:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4256:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMapping10525); 

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

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMapping10542); 

                	newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getCommaKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4276:1: ( (lv_valuation_2_0= RULE_INT ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4277:1: (lv_valuation_2_0= RULE_INT )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4277:1: (lv_valuation_2_0= RULE_INT )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4278:3: lv_valuation_2_0= RULE_INT
            {
            lv_valuation_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMapping10559); 

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

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleMapping10576); 

                	newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getCommaKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4298:1: ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4299:1: (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4299:1: (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4300:3: lv_qualitativeEvaluation_4_0= ruleQualitativeLabel
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleMapping10597);
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

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleMapping10609); 

                	newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getCommaKeyword_5());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4320:1: ( (lv_exceeds_6_0= RULE_BOOLEAN ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4321:1: (lv_exceeds_6_0= RULE_BOOLEAN )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4321:1: (lv_exceeds_6_0= RULE_BOOLEAN )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4322:3: lv_exceeds_6_0= RULE_BOOLEAN
            {
            lv_exceeds_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleMapping10626); 

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

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleMapping10643); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4350:1: entryRuleContributionGroup returns [EObject current=null] : iv_ruleContributionGroup= ruleContributionGroup EOF ;
    public final EObject entryRuleContributionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4351:2: (iv_ruleContributionGroup= ruleContributionGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4352:2: iv_ruleContributionGroup= ruleContributionGroup EOF
            {
             newCompositeNode(grammarAccess.getContributionGroupRule()); 
            pushFollow(FOLLOW_ruleContributionGroup_in_entryRuleContributionGroup10679);
            iv_ruleContributionGroup=ruleContributionGroup();

            state._fsp--;

             current =iv_ruleContributionGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionGroup10689); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4359:1: ruleContributionGroup returns [EObject current=null] : (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4362:28: ( (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4363:1: (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4363:1: (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4363:3: otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleContributionGroup10726); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionGroupAccess().getContributionGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4367:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4368:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4368:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4369:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup10743); 

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

            otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleContributionGroup10760); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionGroupAccess().getIncludesKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4389:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4390:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4390:1: (otherlv_3= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4391:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionGroupRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup10780); 

            		newLeafNode(otherlv_3, grammarAccess.getContributionGroupAccess().getContribsContributionContextCrossReference_3_0()); 
            	

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4402:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==30) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4402:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleContributionGroup10793); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4406:1: ( (otherlv_5= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4407:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4407:1: (otherlv_5= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4408:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionGroupRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup10813); 

            	    		newLeafNode(otherlv_5, grammarAccess.getContributionGroupAccess().getContribsContributionContextCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleContributionGroup10827); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4431:1: entryRuleContributionContext returns [EObject current=null] : iv_ruleContributionContext= ruleContributionContext EOF ;
    public final EObject entryRuleContributionContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionContext = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4432:2: (iv_ruleContributionContext= ruleContributionContext EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4433:2: iv_ruleContributionContext= ruleContributionContext EOF
            {
             newCompositeNode(grammarAccess.getContributionContextRule()); 
            pushFollow(FOLLOW_ruleContributionContext_in_entryRuleContributionContext10863);
            iv_ruleContributionContext=ruleContributionContext();

            state._fsp--;

             current =iv_ruleContributionContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionContext10873); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4440:1: ruleContributionContext returns [EObject current=null] : (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_changes_7_0= ruleContributionChange ) )* otherlv_8= '}' ) ;
    public final EObject ruleContributionContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_changes_7_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4443:28: ( (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_changes_7_0= ruleContributionChange ) )* otherlv_8= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4444:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_changes_7_0= ruleContributionChange ) )* otherlv_8= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4444:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_changes_7_0= ruleContributionChange ) )* otherlv_8= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4444:3: otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_changes_7_0= ruleContributionChange ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleContributionContext10910); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionContextAccess().getContributionKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4448:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4449:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4449:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4450:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionContext10927); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4466:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==36) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4466:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleContributionContext10945); 

                        	newLeafNode(otherlv_2, grammarAccess.getContributionContextAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4470:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4471:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4471:1: ( ruleQualifiedName )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4472:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContributionContextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContributionContextAccess().getSuperContributionContextsContributionContextCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionContext10968);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4485:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==30) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4485:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleContributionContext10981); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getContributionContextAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4489:1: ( ( ruleQualifiedName ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4490:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4490:1: ( ruleQualifiedName )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4491:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getContributionContextRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getContributionContextAccess().getSuperContributionContextsContributionContextCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionContext11004);
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


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleContributionContext11020); 

                	newLeafNode(otherlv_6, grammarAccess.getContributionContextAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4508:1: ( (lv_changes_7_0= ruleContributionChange ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==RULE_ID) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4509:1: (lv_changes_7_0= ruleContributionChange )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4509:1: (lv_changes_7_0= ruleContributionChange )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4510:3: lv_changes_7_0= ruleContributionChange
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionContextAccess().getChangesContributionChangeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionChange_in_ruleContributionContext11041);
            	    lv_changes_7_0=ruleContributionChange();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContributionContextRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"changes",
            	            		lv_changes_7_0, 
            	            		"ContributionChange");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleContributionContext11054); 

                	newLeafNode(otherlv_8, grammarAccess.getContributionContextAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4538:1: entryRuleContributionChange returns [EObject current=null] : iv_ruleContributionChange= ruleContributionChange EOF ;
    public final EObject entryRuleContributionChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionChange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4539:2: (iv_ruleContributionChange= ruleContributionChange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4540:2: iv_ruleContributionChange= ruleContributionChange EOF
            {
             newCompositeNode(grammarAccess.getContributionChangeRule()); 
            pushFollow(FOLLOW_ruleContributionChange_in_entryRuleContributionChange11090);
            iv_ruleContributionChange=ruleContributionChange();

            state._fsp--;

             current =iv_ruleContributionChange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionChange11100); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4547:1: ruleContributionChange returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4550:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4551:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4551:1: ( ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4551:2: ( ( ruleQualifiedName ) ) otherlv_1= ':' ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) ) (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4551:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4552:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4552:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4553:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionChangeRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionChangeAccess().getContributionContributionEndCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionChange11148);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleContributionChange11160); 

                	newLeafNode(otherlv_1, grammarAccess.getContributionChangeAccess().getColonKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4570:1: ( ( (lv_newContribution_2_0= ruleContributionType ) ) | ( (lv_newQuantitativeContribution_3_0= RULE_INT ) ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=62 && LA59_0<=68)) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_INT) ) {
                alt59=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4570:2: ( (lv_newContribution_2_0= ruleContributionType ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4570:2: ( (lv_newContribution_2_0= ruleContributionType ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4571:1: (lv_newContribution_2_0= ruleContributionType )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4571:1: (lv_newContribution_2_0= ruleContributionType )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4572:3: lv_newContribution_2_0= ruleContributionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getNewContributionContributionTypeEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContributionType_in_ruleContributionChange11182);
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4589:6: ( (lv_newQuantitativeContribution_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4589:6: ( (lv_newQuantitativeContribution_3_0= RULE_INT ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4590:1: (lv_newQuantitativeContribution_3_0= RULE_INT )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4590:1: (lv_newQuantitativeContribution_3_0= RULE_INT )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4591:3: lv_newQuantitativeContribution_3_0= RULE_INT
                    {
                    lv_newQuantitativeContribution_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionChange11205); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4607:3: (otherlv_4= ';' | (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==19) ) {
                alt60=1;
            }
            else if ( (LA60_0==14) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4607:5: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleContributionChange11224); 

                        	newLeafNode(otherlv_4, grammarAccess.getContributionChangeAccess().getSemicolonKeyword_3_0());
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4612:6: (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4612:6: (otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4612:8: otherlv_5= '{' ( (lv_contribRange_6_0= ruleContributionRange ) ) otherlv_7= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleContributionChange11243); 

                        	newLeafNode(otherlv_5, grammarAccess.getContributionChangeAccess().getLeftCurlyBracketKeyword_3_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4616:1: ( (lv_contribRange_6_0= ruleContributionRange ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4617:1: (lv_contribRange_6_0= ruleContributionRange )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4617:1: (lv_contribRange_6_0= ruleContributionRange )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4618:3: lv_contribRange_6_0= ruleContributionRange
                    {
                     
                    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getContribRangeContributionRangeParserRuleCall_3_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleContributionRange_in_ruleContributionChange11264);
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

                    otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleContributionChange11276); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4646:1: entryRuleContributionRange returns [EObject current=null] : iv_ruleContributionRange= ruleContributionRange EOF ;
    public final EObject entryRuleContributionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4647:2: (iv_ruleContributionRange= ruleContributionRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4648:2: iv_ruleContributionRange= ruleContributionRange EOF
            {
             newCompositeNode(grammarAccess.getContributionRangeRule()); 
            pushFollow(FOLLOW_ruleContributionRange_in_entryRuleContributionRange11314);
            iv_ruleContributionRange=ruleContributionRange();

            state._fsp--;

             current =iv_ruleContributionRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionRange11324); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4655:1: ruleContributionRange returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4658:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4659:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4659:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4661:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4661:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4662:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4665:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4666:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4666:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=4;
                int LA61_0 = input.LA(1);

                if ( LA61_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0) ) {
                    alt61=1;
                }
                else if ( LA61_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1) ) {
                    alt61=2;
                }
                else if ( LA61_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2) ) {
                    alt61=3;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4668:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4668:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4669:5: {...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4669:112: ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4670:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4673:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4673:7: {...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4673:16: (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4673:18: otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,38,FOLLOW_38_in_ruleContributionRange11406); 

            	        	newLeafNode(otherlv_1, grammarAccess.getContributionRangeAccess().getStartKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange11418); 

            	        	newLeafNode(otherlv_2, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4681:1: ( (lv_start_3_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4682:1: (lv_start_3_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4682:1: (lv_start_3_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4683:3: lv_start_3_0= RULE_INT
            	    {
            	    lv_start_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange11435); 

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

            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange11452); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4710:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4710:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4711:5: {...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4711:112: ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4712:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4715:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4715:7: {...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4715:16: (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4715:18: otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleContributionRange11520); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContributionRangeAccess().getEndKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange11532); 

            	        	newLeafNode(otherlv_6, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4723:1: ( (lv_end_7_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4724:1: (lv_end_7_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4724:1: (lv_end_7_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4725:3: lv_end_7_0= RULE_INT
            	    {
            	    lv_end_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange11549); 

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

            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange11566); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4752:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4752:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4753:5: {...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4753:112: ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4754:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4757:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4757:7: {...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4757:16: (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4757:18: otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleContributionRange11634); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContributionRangeAccess().getStepKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange11646); 

            	        	newLeafNode(otherlv_10, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4765:1: ( (lv_step_11_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4766:1: (lv_step_11_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4766:1: (lv_step_11_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4767:3: lv_step_11_0= RULE_INT
            	    {
            	    lv_step_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange11663); 

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

            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange11680); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4810:1: entryRuleMetadata returns [EObject current=null] : iv_ruleMetadata= ruleMetadata EOF ;
    public final EObject entryRuleMetadata() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadata = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4811:2: (iv_ruleMetadata= ruleMetadata EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4812:2: iv_ruleMetadata= ruleMetadata EOF
            {
             newCompositeNode(grammarAccess.getMetadataRule()); 
            pushFollow(FOLLOW_ruleMetadata_in_entryRuleMetadata11762);
            iv_ruleMetadata=ruleMetadata();

            state._fsp--;

             current =iv_ruleMetadata; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadata11772); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4819:1: ruleMetadata returns [EObject current=null] : (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) ;
    public final EObject ruleMetadata() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4822:28: ( (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4823:1: (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4823:1: (otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4823:3: otherlv_0= 'metadata' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleMetadata11809); 

                	newLeafNode(otherlv_0, grammarAccess.getMetadataAccess().getMetadataKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4827:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4828:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4828:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4829:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleMetadata11826); 

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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleMetadata11843); 

                	newLeafNode(otherlv_2, grammarAccess.getMetadataAccess().getEqualsSignKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4849:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4850:1: (lv_value_3_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4850:1: (lv_value_3_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4851:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadata11860); 

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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleMetadata11877); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4879:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4880:2: (iv_ruleComment= ruleComment EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4881:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_ruleComment_in_entryRuleComment11913);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleComment11923); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4888:1: ruleComment returns [EObject current=null] : (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_content_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4891:28: ( (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4892:1: (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4892:1: (otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4892:3: otherlv_0= 'comment' ( (lv_content_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleComment11960); 

                	newLeafNode(otherlv_0, grammarAccess.getCommentAccess().getCommentKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4896:1: ( (lv_content_1_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4897:1: (lv_content_1_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4897:1: (lv_content_1_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4898:3: lv_content_1_0= RULE_STRING
            {
            lv_content_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleComment11977); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleComment11994); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4926:1: entryRuleLinkType returns [EObject current=null] : iv_ruleLinkType= ruleLinkType EOF ;
    public final EObject entryRuleLinkType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkType = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4927:2: (iv_ruleLinkType= ruleLinkType EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4928:2: iv_ruleLinkType= ruleLinkType EOF
            {
             newCompositeNode(grammarAccess.getLinkTypeRule()); 
            pushFollow(FOLLOW_ruleLinkType_in_entryRuleLinkType12030);
            iv_ruleLinkType=ruleLinkType();

            state._fsp--;

             current =iv_ruleLinkType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkType12040); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4935:1: ruleLinkType returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) ;
    public final EObject ruleLinkType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4938:28: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4939:1: (otherlv_0= 'link' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4939:1: (otherlv_0= 'link' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4939:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleLinkType12077); 

                	newLeafNode(otherlv_0, grammarAccess.getLinkTypeAccess().getLinkKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4943:1: ( (lv_name_1_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4944:1: (lv_name_1_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4944:1: (lv_name_1_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4945:3: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLinkType12094); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLinkTypeAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"STRING");
            	    

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleLinkType12111); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4973:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4974:2: (iv_ruleLink= ruleLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4975:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink12147);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink12157); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4982:1: ruleLink returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4985:28: ( ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4986:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4986:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4986:2: ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_3= ',' ( ( ruleQualifiedName ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4986:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4987:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4987:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4988:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getSrcGRLElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink12205);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5001:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5002:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5002:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5003:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getTypeLinkTypeCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink12228);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5016:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5017:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5017:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5018:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getLinkAccess().getDesGRLElementCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink12251);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5031:2: (otherlv_3= ',' ( ( ruleQualifiedName ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==30) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5031:4: otherlv_3= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleLink12264); 

            	        	newLeafNode(otherlv_3, grammarAccess.getLinkAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5035:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5036:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5036:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5037:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getLinkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getLinkAccess().getDesGRLElementCrossReference_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleLink12287);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleLink12301); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5062:1: entryRuleinLineLink returns [EObject current=null] : iv_ruleinLineLink= ruleinLineLink EOF ;
    public final EObject entryRuleinLineLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleinLineLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5063:2: (iv_ruleinLineLink= ruleinLineLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5064:2: iv_ruleinLineLink= ruleinLineLink EOF
            {
             newCompositeNode(grammarAccess.getInLineLinkRule()); 
            pushFollow(FOLLOW_ruleinLineLink_in_entryRuleinLineLink12337);
            iv_ruleinLineLink=ruleinLineLink();

            state._fsp--;

             current =iv_ruleinLineLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleinLineLink12347); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5071:1: ruleinLineLink returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleinLineLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5074:28: ( ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5075:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5075:1: ( ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5075:2: ( ( ruleQualifiedName ) ) ( ( ruleQualifiedName ) ) (otherlv_2= ',' ( ( ruleQualifiedName ) ) )* otherlv_4= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5075:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5076:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5076:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5077:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInLineLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInLineLinkAccess().getTypeLinkTypeCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleinLineLink12395);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5090:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5091:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5091:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5092:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInLineLinkRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInLineLinkAccess().getDesGRLElementCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleinLineLink12418);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5105:2: (otherlv_2= ',' ( ( ruleQualifiedName ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==30) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5105:4: otherlv_2= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleinLineLink12431); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineLinkAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5109:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5110:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5110:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5111:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInLineLinkRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getInLineLinkAccess().getDesGRLElementCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleinLineLink12454);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleinLineLink12468); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5136:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5137:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5138:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12505);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName12516); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5145:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5148:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5149:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5149:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5149:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12556); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5156:1: (kw= '.' this_ID_2= RULE_ID )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==54) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5157:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,54,FOLLOW_54_in_ruleQualifiedName12575); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12590); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop64;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5177:1: ruleImportanceType returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) ;
    public final Enumerator ruleImportanceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5179:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5180:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5180:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            int alt65=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt65=1;
                }
                break;
            case 56:
                {
                alt65=2;
                }
                break;
            case 57:
                {
                alt65=3;
                }
                break;
            case 58:
                {
                alt65=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5180:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5180:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5180:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_55_in_ruleImportanceType12651); 

                            current = grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5186:6: (enumLiteral_1= 'high' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5186:6: (enumLiteral_1= 'high' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5186:8: enumLiteral_1= 'high'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_56_in_ruleImportanceType12668); 

                            current = grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5192:6: (enumLiteral_2= 'medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5192:6: (enumLiteral_2= 'medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5192:8: enumLiteral_2= 'medium'
                    {
                    enumLiteral_2=(Token)match(input,57,FOLLOW_57_in_ruleImportanceType12685); 

                            current = grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5198:6: (enumLiteral_3= 'low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5198:6: (enumLiteral_3= 'low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5198:8: enumLiteral_3= 'low'
                    {
                    enumLiteral_3=(Token)match(input,58,FOLLOW_58_in_ruleImportanceType12702); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5208:1: ruleDecompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) ;
    public final Enumerator ruleDecompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5210:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5211:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5211:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt66=1;
                }
                break;
            case 60:
                {
                alt66=2;
                }
                break;
            case 61:
                {
                alt66=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5211:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5211:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5211:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleDecompositionType12747); 

                            current = grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5217:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5217:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5217:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleDecompositionType12764); 

                            current = grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5223:6: (enumLiteral_2= 'xor' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5223:6: (enumLiteral_2= 'xor' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5223:8: enumLiteral_2= 'xor'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_61_in_ruleDecompositionType12781); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5233:1: ruleContributionType returns [Enumerator current=null] : ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5235:28: ( ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5236:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5236:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            int alt67=7;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt67=1;
                }
                break;
            case 63:
                {
                alt67=2;
                }
                break;
            case 64:
                {
                alt67=3;
                }
                break;
            case 65:
                {
                alt67=4;
                }
                break;
            case 66:
                {
                alt67=5;
                }
                break;
            case 67:
                {
                alt67=6;
                }
                break;
            case 68:
                {
                alt67=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5236:2: (enumLiteral_0= 'help' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5236:2: (enumLiteral_0= 'help' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5236:4: enumLiteral_0= 'help'
                    {
                    enumLiteral_0=(Token)match(input,62,FOLLOW_62_in_ruleContributionType12826); 

                            current = grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5242:6: (enumLiteral_1= 'make' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5242:6: (enumLiteral_1= 'make' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5242:8: enumLiteral_1= 'make'
                    {
                    enumLiteral_1=(Token)match(input,63,FOLLOW_63_in_ruleContributionType12843); 

                            current = grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5248:6: (enumLiteral_2= 'somePositive' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5248:6: (enumLiteral_2= 'somePositive' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5248:8: enumLiteral_2= 'somePositive'
                    {
                    enumLiteral_2=(Token)match(input,64,FOLLOW_64_in_ruleContributionType12860); 

                            current = grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5254:6: (enumLiteral_3= 'unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5254:6: (enumLiteral_3= 'unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5254:8: enumLiteral_3= 'unknown'
                    {
                    enumLiteral_3=(Token)match(input,65,FOLLOW_65_in_ruleContributionType12877); 

                            current = grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5260:6: (enumLiteral_4= 'someNegative' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5260:6: (enumLiteral_4= 'someNegative' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5260:8: enumLiteral_4= 'someNegative'
                    {
                    enumLiteral_4=(Token)match(input,66,FOLLOW_66_in_ruleContributionType12894); 

                            current = grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5266:6: (enumLiteral_5= 'hurt' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5266:6: (enumLiteral_5= 'hurt' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5266:8: enumLiteral_5= 'hurt'
                    {
                    enumLiteral_5=(Token)match(input,67,FOLLOW_67_in_ruleContributionType12911); 

                            current = grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5272:6: (enumLiteral_6= 'break' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5272:6: (enumLiteral_6= 'break' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5272:8: enumLiteral_6= 'break'
                    {
                    enumLiteral_6=(Token)match(input,68,FOLLOW_68_in_ruleContributionType12928); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5282:1: ruleQualitativeLabel returns [Enumerator current=null] : ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5284:28: ( ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5285:1: ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5285:1: ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) )
            int alt68=7;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt68=1;
                }
                break;
            case 70:
                {
                alt68=2;
                }
                break;
            case 71:
                {
                alt68=3;
                }
                break;
            case 72:
                {
                alt68=4;
                }
                break;
            case 73:
                {
                alt68=5;
                }
                break;
            case 65:
                {
                alt68=6;
                }
                break;
            case 55:
                {
                alt68=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5285:2: (enumLiteral_0= 'denied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5285:2: (enumLiteral_0= 'denied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5285:4: enumLiteral_0= 'denied'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_69_in_ruleQualitativeLabel12973); 

                            current = grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5291:6: (enumLiteral_1= 'weaklyDenied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5291:6: (enumLiteral_1= 'weaklyDenied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5291:8: enumLiteral_1= 'weaklyDenied'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_70_in_ruleQualitativeLabel12990); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5297:6: (enumLiteral_2= 'weaklySatisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5297:6: (enumLiteral_2= 'weaklySatisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5297:8: enumLiteral_2= 'weaklySatisfied'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_71_in_ruleQualitativeLabel13007); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5303:6: (enumLiteral_3= 'satisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5303:6: (enumLiteral_3= 'satisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5303:8: enumLiteral_3= 'satisfied'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_72_in_ruleQualitativeLabel13024); 

                            current = grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5309:6: (enumLiteral_4= 'conflict' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5309:6: (enumLiteral_4= 'conflict' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5309:8: enumLiteral_4= 'conflict'
                    {
                    enumLiteral_4=(Token)match(input,73,FOLLOW_73_in_ruleQualitativeLabel13041); 

                            current = grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5315:6: (enumLiteral_5= 'unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5315:6: (enumLiteral_5= 'unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5315:8: enumLiteral_5= 'unknown'
                    {
                    enumLiteral_5=(Token)match(input,65,FOLLOW_65_in_ruleQualitativeLabel13058); 

                            current = grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5321:6: (enumLiteral_6= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5321:6: (enumLiteral_6= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5321:8: enumLiteral_6= 'none'
                    {
                    enumLiteral_6=(Token)match(input,55,FOLLOW_55_in_ruleQualitativeLabel13075); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5331:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5333:28: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5334:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5334:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) )
            int alt69=16;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt69=1;
                }
                break;
            case 75:
                {
                alt69=2;
                }
                break;
            case 76:
                {
                alt69=3;
                }
                break;
            case 77:
                {
                alt69=4;
                }
                break;
            case 78:
                {
                alt69=5;
                }
                break;
            case 79:
                {
                alt69=6;
                }
                break;
            case 80:
                {
                alt69=7;
                }
                break;
            case 81:
                {
                alt69=8;
                }
                break;
            case 82:
                {
                alt69=9;
                }
                break;
            case 83:
                {
                alt69=10;
                }
                break;
            case 84:
                {
                alt69=11;
                }
                break;
            case 85:
                {
                alt69=12;
                }
                break;
            case 86:
                {
                alt69=13;
                }
                break;
            case 87:
                {
                alt69=14;
                }
                break;
            case 88:
                {
                alt69=15;
                }
                break;
            case 89:
                {
                alt69=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5334:2: (enumLiteral_0= 'white' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5334:2: (enumLiteral_0= 'white' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5334:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleColor13120); 

                            current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5340:6: (enumLiteral_1= 'black' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5340:6: (enumLiteral_1= 'black' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5340:8: enumLiteral_1= 'black'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleColor13137); 

                            current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5346:6: (enumLiteral_2= 'blue' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5346:6: (enumLiteral_2= 'blue' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5346:8: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleColor13154); 

                            current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5352:6: (enumLiteral_3= 'green' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5352:6: (enumLiteral_3= 'green' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5352:8: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_ruleColor13171); 

                            current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5358:6: (enumLiteral_4= 'cyan' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5358:6: (enumLiteral_4= 'cyan' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5358:8: enumLiteral_4= 'cyan'
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_78_in_ruleColor13188); 

                            current = grammarAccess.getColorAccess().getCyanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getCyanEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5364:6: (enumLiteral_5= 'red' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5364:6: (enumLiteral_5= 'red' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5364:8: enumLiteral_5= 'red'
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_79_in_ruleColor13205); 

                            current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5370:6: (enumLiteral_6= 'purple' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5370:6: (enumLiteral_6= 'purple' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5370:8: enumLiteral_6= 'purple'
                    {
                    enumLiteral_6=(Token)match(input,80,FOLLOW_80_in_ruleColor13222); 

                            current = grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5376:6: (enumLiteral_7= 'yellow' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5376:6: (enumLiteral_7= 'yellow' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5376:8: enumLiteral_7= 'yellow'
                    {
                    enumLiteral_7=(Token)match(input,81,FOLLOW_81_in_ruleColor13239); 

                            current = grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5382:6: (enumLiteral_8= 'gray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5382:6: (enumLiteral_8= 'gray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5382:8: enumLiteral_8= 'gray'
                    {
                    enumLiteral_8=(Token)match(input,82,FOLLOW_82_in_ruleColor13256); 

                            current = grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5388:6: (enumLiteral_9= 'lightGray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5388:6: (enumLiteral_9= 'lightGray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5388:8: enumLiteral_9= 'lightGray'
                    {
                    enumLiteral_9=(Token)match(input,83,FOLLOW_83_in_ruleColor13273); 

                            current = grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5394:6: (enumLiteral_10= 'lightBlue' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5394:6: (enumLiteral_10= 'lightBlue' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5394:8: enumLiteral_10= 'lightBlue'
                    {
                    enumLiteral_10=(Token)match(input,84,FOLLOW_84_in_ruleColor13290); 

                            current = grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5400:6: (enumLiteral_11= 'lightGreen' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5400:6: (enumLiteral_11= 'lightGreen' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5400:8: enumLiteral_11= 'lightGreen'
                    {
                    enumLiteral_11=(Token)match(input,85,FOLLOW_85_in_ruleColor13307); 

                            current = grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5406:6: (enumLiteral_12= 'lightCray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5406:6: (enumLiteral_12= 'lightCray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5406:8: enumLiteral_12= 'lightCray'
                    {
                    enumLiteral_12=(Token)match(input,86,FOLLOW_86_in_ruleColor13324); 

                            current = grammarAccess.getColorAccess().getLightCrayEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getColorAccess().getLightCrayEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5412:6: (enumLiteral_13= 'lightRed' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5412:6: (enumLiteral_13= 'lightRed' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5412:8: enumLiteral_13= 'lightRed'
                    {
                    enumLiteral_13=(Token)match(input,87,FOLLOW_87_in_ruleColor13341); 

                            current = grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5418:6: (enumLiteral_14= 'lightPurple' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5418:6: (enumLiteral_14= 'lightPurple' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5418:8: enumLiteral_14= 'lightPurple'
                    {
                    enumLiteral_14=(Token)match(input,88,FOLLOW_88_in_ruleColor13358); 

                            current = grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5424:6: (enumLiteral_15= 'lightYellow' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5424:6: (enumLiteral_15= 'lightYellow' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5424:8: enumLiteral_15= 'lightYellow'
                    {
                    enumLiteral_15=(Token)match(input,89,FOLLOW_89_in_ruleColor13375); 

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
    protected DFA11 dfa11 = new DFA11(this);
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
        "\uffff\1\6\1\2\1\uffff";
    static final String DFA3_specialS =
        "\20\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\13\uffff\1\3\5\uffff\1\1\1\uffff\5\1\4\uffff\1\4\1\uffff"+
            "\1\5\13\uffff\1\10\1\6\1\7\1\uffff\1\11\1\12\1\13",
            "",
            "\1\16\15\uffff\1\15\12\uffff\1\16\1\uffff\2\16\25\uffff\1"+
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
            "\1\16\15\uffff\1\15\12\uffff\1\16\1\uffff\2\16\25\uffff\1"+
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
        "\3\uffff\1\3\1\2\1\1\1\4\1\uffff";
    static final String DFA5_specialS =
        "\10\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\6\30\uffff\1\5\1\uffff\1\4\1\3\25\uffff\1\2",
            "\1\7",
            "",
            "",
            "",
            "",
            "\1\6\30\uffff\1\5\1\uffff\1\4\1\3\25\uffff\1\2"
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
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\4\1\uffff\7\0\1\uffff";
    static final String DFA11_maxS =
        "\1\72\1\uffff\7\0\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA11_specialS =
        "\2\uffff\1\1\1\2\1\5\1\6\1\0\1\3\1\4\1\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\10\1\uffff\1\1\10\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\2"+
            "\1\uffff\1\3\1\4\1\5\1\6\1\7\32\uffff\4\1",
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
            return "()+ loopback of 800:6: ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_3);
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
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
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
    public static final BitSet FOLLOW_14_in_ruleActor1509 = new BitSet(new long[]{0x078000001F728050L});
    public static final BitSet FOLLOW_17_in_ruleActor1567 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1579 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1596 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1613 = new BitSet(new long[]{0x078000001F728050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleActor1691 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActor1714 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1732 = new BitSet(new long[]{0x078000001F728050L});
    public static final BitSet FOLLOW_20_in_ruleActor1800 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1812 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1829 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1846 = new BitSet(new long[]{0x078000001F728050L});
    public static final BitSet FOLLOW_21_in_ruleActor1914 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1926 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleActor1947 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1959 = new BitSet(new long[]{0x078000001F728050L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleActor2036 = new BitSet(new long[]{0x078000001F728050L});
    public static final BitSet FOLLOW_ruleElementLink_in_ruleActor2063 = new BitSet(new long[]{0x078000001F728050L});
    public static final BitSet FOLLOW_15_in_ruleActor2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal2153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal2163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSoftgoal2200 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftgoal2217 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSoftgoal2234 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2292 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2304 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal2321 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2338 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_20_in_ruleSoftgoal2406 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2418 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal2435 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2452 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_21_in_ruleSoftgoal2520 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2532 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleSoftgoal2553 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2565 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_23_in_ruleSoftgoal2633 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2645 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleSoftgoal2666 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2678 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleSoftgoal2756 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSoftgoal2779 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2797 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleSoftgoal2873 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_15_in_ruleSoftgoal2926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal2962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGoal3009 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal3026 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGoal3043 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_17_in_ruleGoal3101 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3113 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3130 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3147 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_20_in_ruleGoal3215 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3227 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3244 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3261 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_21_in_ruleGoal3329 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3341 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleGoal3362 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3374 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_23_in_ruleGoal3442 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3454 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleGoal3475 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3487 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleGoal3565 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGoal3588 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3606 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleGoal3682 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_15_in_ruleGoal3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask3771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTask3818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask3835 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTask3852 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_17_in_ruleTask3910 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask3922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask3939 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3956 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_20_in_ruleTask4024 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask4036 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask4053 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4070 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_21_in_ruleTask4138 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask4150 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleTask4171 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4183 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_23_in_ruleTask4251 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask4263 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleTask4284 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4296 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleTask4374 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTask4397 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4415 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleTask4491 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_15_in_ruleTask4544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource4580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleResource4627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource4644 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleResource4661 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_17_in_ruleResource4719 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource4748 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4765 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_20_in_ruleResource4833 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4845 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource4862 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4879 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_21_in_ruleResource4947 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4959 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleResource4980 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4992 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_23_in_ruleResource5060 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource5072 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleResource5093 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource5105 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleResource5183 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResource5206 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource5224 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleResource5300 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_15_in_ruleResource5353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicator_in_entryRuleIndicator5389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndicator5399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleIndicator5436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator5453 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIndicator5470 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_17_in_ruleIndicator5528 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5540 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator5557 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5574 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_20_in_ruleIndicator5642 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5654 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator5671 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5688 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_21_in_ruleIndicator5756 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5768 = new BitSet(new long[]{0x0000000000000000L,0x0000000003FFFC00L});
    public static final BitSet FOLLOW_ruleColor_in_ruleIndicator5789 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5801 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_23_in_ruleIndicator5869 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5881 = new BitSet(new long[]{0x3800000000000000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleIndicator5902 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5914 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleIndicator5992 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIndicator6015 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6033 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleIndicator6109 = new BitSet(new long[]{0x07800001A0B28050L});
    public static final BitSet FOLLOW_15_in_ruleIndicator6162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief6198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief6208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleBelief6245 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBelief6262 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBelief6279 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_17_in_ruleBelief6337 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBelief6349 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelief6366 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBelief6383 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_20_in_ruleBelief6451 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelief6468 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBelief6485 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_15_in_ruleBelief6538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition6574 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecomposition6632 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleDecomposition6644 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleDecomposition6665 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleDecomposition6678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleDecomposition6699 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleDecomposition6713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDecomposition_in_entryRuleInLineDecomposition6749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineDecomposition6759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleInLineDecomposition6796 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition6817 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleInLineDecomposition6830 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition6851 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleInLineDecomposition6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_entryRuleDecompositionEnd6901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecompositionEnd6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecompositionEnd6959 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDecompositionEnd6972 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecompositionEnd6989 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDecompositionEnd7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution7045 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContribution7055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContribution7103 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleContribution7115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleContribution7136 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleContribution7149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleContribution7170 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleContribution7184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineContribution_in_entryRuleInLineContribution7220 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineContribution7230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleInLineContribution7267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleInLineContribution7288 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleInLineContribution7301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleInLineContribution7322 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleInLineContribution7336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_entryRuleContributionEnd7372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionEnd7382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionEnd7424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionEnd7453 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleContributionEnd7466 = new BitSet(new long[]{0xC000000000008040L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionEnd7488 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionEnd7511 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionEnd7530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency7568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency7578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependency7626 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDependency7638 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleDependency7659 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleDependency7672 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleDependency7693 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleDependency7707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDependency_in_entryRuleInLineDependency7743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineDependency7753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInLineDependency7790 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7811 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleInLineDependency7824 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7845 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleInLineDependency7859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_entryRuleDependencyEnd7895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyEnd7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependencyEnd7953 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDependencyEnd7966 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependencyEnd7983 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDependencyEnd8001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategyGroup_in_entryRuleStrategyGroup8039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrategyGroup8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStrategyGroup8086 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStrategyGroup8103 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleStrategyGroup8120 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8143 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleStrategyGroup8156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8179 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleStrategyGroup8193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationStrategy_in_entryRuleEvaluationStrategy8229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationStrategy8239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleEvaluationStrategy8276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvaluationStrategy8293 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_36_in_ruleEvaluationStrategy8311 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy8334 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_ruleEvaluationStrategy8347 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy8370 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluationStrategy8386 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleEvaluationStrategy8407 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleEvaluationStrategy8420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation8456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluation8514 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation8526 = new BitSet(new long[]{0x0080000000000040L,0x00000000000003E2L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleEvaluation8548 = new BitSet(new long[]{0x00007FC00008C000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluation8571 = new BitSet(new long[]{0x00007FC00008C000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluation8636 = new BitSet(new long[]{0x00007FE00000C002L});
    public static final BitSet FOLLOW_37_in_ruleEvaluation8655 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation8680 = new BitSet(new long[]{0x00007FC00000C002L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_ruleEvaluation8758 = new BitSet(new long[]{0x00007FC00000C002L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation8834 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvaluation8847 = new BitSet(new long[]{0x00007FC00000C002L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation8912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange8949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationRange8959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleEvaluationRange9041 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange9053 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange9070 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange9087 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_39_in_ruleEvaluationRange9155 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange9167 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange9184 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange9201 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_40_in_ruleEvaluationRange9269 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange9281 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange9298 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange9315 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet9397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIEvalValueSet9407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQuantitativeEvalValueSet_in_ruleKPIEvalValueSet9454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQualitativeEvalValueSet_in_ruleKPIEvalValueSet9481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQuantitativeEvalValueSet_in_entryRuleKPIQuantitativeEvalValueSet9516 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIQuantitativeEvalValueSet9526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleKPIQuantitativeEvalValueSet9608 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet9620 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet9637 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet9654 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_42_in_ruleKPIQuantitativeEvalValueSet9722 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet9734 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet9751 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet9768 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_43_in_ruleKPIQuantitativeEvalValueSet9836 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet9848 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet9865 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet9882 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_44_in_ruleKPIQuantitativeEvalValueSet9950 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet9962 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet9979 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet9996 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_45_in_ruleKPIQuantitativeEvalValueSet10064 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet10076 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKPIQuantitativeEvalValueSet10093 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet10110 = new BitSet(new long[]{0x00003E0000000002L});
    public static final BitSet FOLLOW_ruleKPIQualitativeEvalValueSet_in_entryRuleKPIQualitativeEvalValueSet10192 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIQualitativeEvalValueSet10202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleKPIQualitativeEvalValueSet10239 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQualitativeEvalValueSet10251 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleKPIQualitativeEvalValueSet10274 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQualitativeEvalValueSet10286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping10322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitativeMapping10332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleQualitativeMapping10369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeMapping10386 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualitativeMapping10403 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleQualitativeMapping10424 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleQualitativeMapping10437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping10473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping10483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMapping10525 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMapping10542 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMapping10559 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMapping10576 = new BitSet(new long[]{0x0080000000000000L,0x00000000000003E2L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleMapping10597 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleMapping10609 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleMapping10626 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMapping10643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionGroup_in_entryRuleContributionGroup10679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionGroup10689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleContributionGroup10726 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup10743 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleContributionGroup10760 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup10780 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleContributionGroup10793 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup10813 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionGroup10827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionContext_in_entryRuleContributionContext10863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionContext10873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleContributionContext10910 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionContext10927 = new BitSet(new long[]{0x0000001000004000L});
    public static final BitSet FOLLOW_36_in_ruleContributionContext10945 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionContext10968 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_30_in_ruleContributionContext10981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionContext11004 = new BitSet(new long[]{0x0000000040004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionContext11020 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleContributionChange_in_ruleContributionContext11041 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleContributionContext11054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionChange_in_entryRuleContributionChange11090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionChange11100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionChange11148 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleContributionChange11160 = new BitSet(new long[]{0xC000000000000040L,0x000000000000001FL});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionChange11182 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionChange11205 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_ruleContributionChange11224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleContributionChange11243 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_ruleContributionRange_in_ruleContributionChange11264 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionChange11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionRange_in_entryRuleContributionRange11314 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionRange11324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleContributionRange11406 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange11418 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange11435 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange11452 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_39_in_ruleContributionRange11520 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange11532 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange11549 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange11566 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_40_in_ruleContributionRange11634 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange11646 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange11663 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange11680 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_ruleMetadata_in_entryRuleMetadata11762 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadata11772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleMetadata11809 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleMetadata11826 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMetadata11843 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadata11860 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMetadata11877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComment_in_entryRuleComment11913 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComment11923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleComment11960 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleComment11977 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleComment11994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_entryRuleLinkType12030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkType12040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleLinkType12077 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLinkType12094 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleLinkType12111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink12147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink12157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink12205 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink12228 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink12251 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleLink12264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleLink12287 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleLink12301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleinLineLink_in_entryRuleinLineLink12337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleinLineLink12347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleinLineLink12395 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleinLineLink12418 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_30_in_ruleinLineLink12431 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleinLineLink12454 = new BitSet(new long[]{0x0000000040080000L});
    public static final BitSet FOLLOW_19_in_ruleinLineLink12468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12556 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleQualifiedName12575 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12590 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_55_in_ruleImportanceType12651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleImportanceType12668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleImportanceType12685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleImportanceType12702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleDecompositionType12747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleDecompositionType12764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleDecompositionType12781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleContributionType12826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleContributionType12843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleContributionType12860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleContributionType12877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleContributionType12894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleContributionType12911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleContributionType12928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleQualitativeLabel12973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleQualitativeLabel12990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleQualitativeLabel13007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleQualitativeLabel13024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleQualitativeLabel13041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleQualitativeLabel13058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleQualitativeLabel13075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleColor13120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleColor13137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleColor13154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleColor13171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleColor13188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleColor13205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleColor13222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleColor13239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleColor13256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleColor13273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleColor13290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleColor13307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleColor13324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleColor13341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleColor13358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleColor13375 = new BitSet(new long[]{0x0000000000000002L});

}
