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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grl'", "'{'", "'}'", "'actor'", "'name'", "'='", "';'", "'description'", "'color'", "'softGoal'", "'decompositionType'", "'goal'", "'Task'", "'resource'", "'indicator'", "'kpiModelLinksDest'", "','", "'groups'", "'belief'", "'decomposedBy'", "'contributeTo'", "'dependOn'", "'strategyGroup'", "'includes'", "'strategy'", "'extends'", "'exceeds'", "'start'", "'end'", "'step'", "'contributionGroup'", "'contribution'", "'changes'", "'contributionChange'", "'newContribution'", "'newQuantitativeContribution'", "'contribRange'", "'contributionRange'", "'target'", "'threshold'", "'worst'", "'eval'", "'unit'", "'qualeval'", "'qualitativeMapping'", "'.'", "'none'", "'high'", "'medium'", "'low'", "'and'", "'or'", "'xor'", "'help'", "'make'", "'somePositive'", "'unknown'", "'someNegative'", "'hurt'", "'break'", "'denied'", "'weaklyDenied'", "'weaklySatisfied'", "'satisfied'", "'conflict'", "'white'", "'black'", "'blue'", "'green'", "'cyan'", "'red'", "'purple'", "'yellow'", "'gray'", "'lightGray'", "'lightBlue'", "'lightGreen'", "'lightCray'", "'lightRed'", "'lightPurple'", "'lightYellow'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int RULE_INT=6;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int RULE_DOUBLE=7;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
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
            switch ( input.LA(1) ) {
            case RULE_ID:
            case 16:
            case 22:
            case 24:
            case 25:
            case 26:
            case 27:
            case 31:
            case 35:
            case 37:
            case 43:
            case 44:
            case 57:
                {
                alt2=1;
                }
                break;
            case 32:
            case 33:
            case 34:
                {
                alt2=2;
                }
                break;
            case RULE_STRING:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:168:1: ruleGRLElement returns [EObject current=null] : (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_EvaluationStrategy_4= ruleEvaluationStrategy | this_Evaluation_5= ruleEvaluation | this_ContributionGroup_6= ruleContributionGroup | this_ContributionContext_7= ruleContributionContext | this_QualitativeMapping_8= ruleQualitativeMapping ) ;
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


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:171:28: ( (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_EvaluationStrategy_4= ruleEvaluationStrategy | this_Evaluation_5= ruleEvaluation | this_ContributionGroup_6= ruleContributionGroup | this_ContributionContext_7= ruleContributionContext | this_QualitativeMapping_8= ruleQualitativeMapping ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:172:1: (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_EvaluationStrategy_4= ruleEvaluationStrategy | this_Evaluation_5= ruleEvaluation | this_ContributionGroup_6= ruleContributionGroup | this_ContributionContext_7= ruleContributionContext | this_QualitativeMapping_8= ruleQualitativeMapping )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:172:1: (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_EvaluationStrategy_4= ruleEvaluationStrategy | this_Evaluation_5= ruleEvaluation | this_ContributionGroup_6= ruleContributionGroup | this_ContributionContext_7= ruleContributionContext | this_QualitativeMapping_8= ruleQualitativeMapping )
            int alt3=9;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:269:1: entryRuleIntentionalElement returns [EObject current=null] : iv_ruleIntentionalElement= ruleIntentionalElement EOF ;
    public final EObject entryRuleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentionalElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:270:2: (iv_ruleIntentionalElement= ruleIntentionalElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:271:2: iv_ruleIntentionalElement= ruleIntentionalElement EOF
            {
             newCompositeNode(grammarAccess.getIntentionalElementRule()); 
            pushFollow(FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement622);
            iv_ruleIntentionalElement=ruleIntentionalElement();

            state._fsp--;

             current =iv_ruleIntentionalElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntentionalElement632); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:278:1: ruleIntentionalElement returns [EObject current=null] : (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:281:28: ( (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:282:1: (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:282:1: (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief )
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
            case 31:
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:283:5: this_Softgoal_0= ruleSoftgoal
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getSoftgoalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSoftgoal_in_ruleIntentionalElement679);
                    this_Softgoal_0=ruleSoftgoal();

                    state._fsp--;

                     
                            current = this_Softgoal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:293:5: this_Goal_1= ruleGoal
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getGoalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGoal_in_ruleIntentionalElement706);
                    this_Goal_1=ruleGoal();

                    state._fsp--;

                     
                            current = this_Goal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:303:5: this_Task_2= ruleTask
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getTaskParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTask_in_ruleIntentionalElement733);
                    this_Task_2=ruleTask();

                    state._fsp--;

                     
                            current = this_Task_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:313:5: this_Resource_3= ruleResource
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getResourceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleIntentionalElement760);
                    this_Resource_3=ruleResource();

                    state._fsp--;

                     
                            current = this_Resource_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:323:5: this_Indicator_4= ruleIndicator
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getIndicatorParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIndicator_in_ruleIntentionalElement787);
                    this_Indicator_4=ruleIndicator();

                    state._fsp--;

                     
                            current = this_Indicator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:333:5: this_Belief_5= ruleBelief
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getBeliefParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleBelief_in_ruleIntentionalElement814);
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:349:1: entryRuleElementLink returns [EObject current=null] : iv_ruleElementLink= ruleElementLink EOF ;
    public final EObject entryRuleElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:350:2: (iv_ruleElementLink= ruleElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:351:2: iv_ruleElementLink= ruleElementLink EOF
            {
             newCompositeNode(grammarAccess.getElementLinkRule()); 
            pushFollow(FOLLOW_ruleElementLink_in_entryRuleElementLink849);
            iv_ruleElementLink=ruleElementLink();

            state._fsp--;

             current =iv_ruleElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLink859); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:358:1: ruleElementLink returns [EObject current=null] : (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency ) ;
    public final EObject ruleElementLink() throws RecognitionException {
        EObject current = null;

        EObject this_Decomposition_0 = null;

        EObject this_Contribution_1 = null;

        EObject this_Dependency_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:361:28: ( (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:362:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:362:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:363:5: this_Decomposition_0= ruleDecomposition
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDecompositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecomposition_in_ruleElementLink906);
                    this_Decomposition_0=ruleDecomposition();

                    state._fsp--;

                     
                            current = this_Decomposition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:373:5: this_Contribution_1= ruleContribution
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getContributionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContribution_in_ruleElementLink933);
                    this_Contribution_1=ruleContribution();

                    state._fsp--;

                     
                            current = this_Contribution_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:383:5: this_Dependency_2= ruleDependency
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDependencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDependency_in_ruleElementLink960);
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


    // $ANTLR start "entryRuleInLineElementLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:399:1: entryRuleInLineElementLink returns [EObject current=null] : iv_ruleInLineElementLink= ruleInLineElementLink EOF ;
    public final EObject entryRuleInLineElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:400:2: (iv_ruleInLineElementLink= ruleInLineElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:401:2: iv_ruleInLineElementLink= ruleInLineElementLink EOF
            {
             newCompositeNode(grammarAccess.getInLineElementLinkRule()); 
            pushFollow(FOLLOW_ruleInLineElementLink_in_entryRuleInLineElementLink995);
            iv_ruleInLineElementLink=ruleInLineElementLink();

            state._fsp--;

             current =iv_ruleInLineElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineElementLink1005); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:408:1: ruleInLineElementLink returns [EObject current=null] : (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency ) ;
    public final EObject ruleInLineElementLink() throws RecognitionException {
        EObject current = null;

        EObject this_InLineDecomposition_0 = null;

        EObject this_InLineContribution_1 = null;

        EObject this_InLineDependency_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:411:28: ( (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:412:1: (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:412:1: (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt6=1;
                }
                break;
            case 33:
                {
                alt6=2;
                }
                break;
            case 34:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:413:5: this_InLineDecomposition_0= ruleInLineDecomposition
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineDecompositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInLineDecomposition_in_ruleInLineElementLink1052);
                    this_InLineDecomposition_0=ruleInLineDecomposition();

                    state._fsp--;

                     
                            current = this_InLineDecomposition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:423:5: this_InLineContribution_1= ruleInLineContribution
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineContributionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInLineContribution_in_ruleInLineElementLink1079);
                    this_InLineContribution_1=ruleInLineContribution();

                    state._fsp--;

                     
                            current = this_InLineContribution_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:433:5: this_InLineDependency_2= ruleInLineDependency
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineDependencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInLineDependency_in_ruleInLineElementLink1106);
                    this_InLineDependency_2=ruleInLineDependency();

                    state._fsp--;

                     
                            current = this_InLineDependency_2; 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:449:1: entryRuleGRLSpecification returns [EObject current=null] : iv_ruleGRLSpecification= ruleGRLSpecification EOF ;
    public final EObject entryRuleGRLSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRLSpecification = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:450:2: (iv_ruleGRLSpecification= ruleGRLSpecification EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:451:2: iv_ruleGRLSpecification= ruleGRLSpecification EOF
            {
             newCompositeNode(grammarAccess.getGRLSpecificationRule()); 
            pushFollow(FOLLOW_ruleGRLSpecification_in_entryRuleGRLSpecification1141);
            iv_ruleGRLSpecification=ruleGRLSpecification();

            state._fsp--;

             current =iv_ruleGRLSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRLSpecification1151); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:458:1: ruleGRLSpecification returns [EObject current=null] : (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleGRLSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_grlElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:461:28: ( (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:462:1: (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:462:1: (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:462:3: otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGRLSpecification1188); 

                	newLeafNode(otherlv_0, grammarAccess.getGRLSpecificationAccess().getGrlKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:466:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:467:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:467:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:468:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGRLSpecification1205); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGRLSpecification1223); 

                	newLeafNode(otherlv_2, grammarAccess.getGRLSpecificationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:488:1: ( (lv_grlElements_3_0= ruleGRLElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==16||LA8_0==22||(LA8_0>=24 && LA8_0<=27)||LA8_0==31||LA8_0==35||LA8_0==37||(LA8_0>=43 && LA8_0<=44)||LA8_0==57) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:489:1: (lv_grlElements_3_0= ruleGRLElement )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:489:1: (lv_grlElements_3_0= ruleGRLElement )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:490:3: lv_grlElements_3_0= ruleGRLElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLSpecificationAccess().getGrlElementsGRLElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGRLElement_in_ruleGRLSpecification1244);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleGRLSpecification1257); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:518:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:519:2: (iv_ruleActor= ruleActor EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:520:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor1293);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor1303); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:527:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:530:28: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:531:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:531:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:531:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleActor1340); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:535:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:536:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:536:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:537:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1357); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleActor1374); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:557:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:559:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:559:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:560:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:563:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:564:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:564:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )*
            loop12:
            do {
                int alt12=6;
                int LA12_0 = input.LA(1);

                if ( LA12_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0) ) {
                    alt12=1;
                }
                else if ( (LA12_0==RULE_INT|| LA12_0 >=59 && LA12_0<=62) && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3) ) {
                    alt12=4;
                }
                else if ( (LA12_0==RULE_ID||LA12_0==22|| LA12_0 >=24 && LA12_0<=27 ||LA12_0==31) && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {
                    alt12=5;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:566:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:566:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:567:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:567:102: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:568:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:571:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:571:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:571:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:571:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleActor1432); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActorAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleActor1444); 

            	        	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:579:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:580:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:580:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:581:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1461); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleActor1478); 

            	        	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:608:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:608:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:609:5: {...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:609:102: ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:610:6: ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:6: ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:7: {...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:16: ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:17: ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:17: ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0>=59 && LA9_0<=62)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:18: ( (lv_importance_8_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:613:18: ( (lv_importance_8_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:614:1: (lv_importance_8_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:614:1: (lv_importance_8_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:615:3: lv_importance_8_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getActorAccess().getImportanceImportanceTypeEnumRuleCall_3_1_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleActor1556);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:632:6: ( (lv_importanceQuantitative_9_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:632:6: ( (lv_importanceQuantitative_9_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:633:1: (lv_importanceQuantitative_9_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:633:1: (lv_importanceQuantitative_9_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:634:3: lv_importanceQuantitative_9_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActor1579); 

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

            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleActor1597); 

            	        	newLeafNode(otherlv_10, grammarAccess.getActorAccess().getSemicolonKeyword_3_1_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:661:4: ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:661:4: ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:662:5: {...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:662:102: ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:663:6: ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:666:6: ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:666:7: {...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:666:16: (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:666:18: otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';'
            	    {
            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleActor1665); 

            	        	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getDescriptionKeyword_3_2_0());
            	        
            	    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleActor1677); 

            	        	newLeafNode(otherlv_12, grammarAccess.getActorAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:674:1: ( (lv_description_13_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:675:1: (lv_description_13_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:675:1: (lv_description_13_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:676:3: lv_description_13_0= RULE_STRING
            	    {
            	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1694); 

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

            	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleActor1711); 

            	        	newLeafNode(otherlv_14, grammarAccess.getActorAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:703:4: ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:703:4: ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:704:5: {...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:704:102: ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:705:6: ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:708:6: ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:708:7: {...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:708:16: (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:708:18: otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';'
            	    {
            	    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleActor1779); 

            	        	newLeafNode(otherlv_15, grammarAccess.getActorAccess().getColorKeyword_3_3_0());
            	        
            	    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleActor1791); 

            	        	newLeafNode(otherlv_16, grammarAccess.getActorAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:716:1: ( (lv_fillColor_17_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:717:1: (lv_fillColor_17_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:717:1: (lv_fillColor_17_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:718:3: lv_fillColor_17_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActorAccess().getFillColorColorEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleActor1812);
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

            	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleActor1824); 

            	        	newLeafNode(otherlv_18, grammarAccess.getActorAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:745:4: ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:745:4: ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:746:5: {...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:746:102: ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:747:6: ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:750:6: ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+
            	    int cnt11=0;
            	    loop11:
            	    do {
            	        int alt11=2;
            	        alt11 = dfa11.predict(input);
            	        switch (alt11) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:750:7: {...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:750:16: ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) )
            	    	    int alt10=2;
            	    	    int LA10_0 = input.LA(1);

            	    	    if ( (LA10_0==22||(LA10_0>=24 && LA10_0<=27)||LA10_0==31) ) {
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
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:750:17: ( (lv_elemets_19_0= ruleIntentionalElement ) )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:750:17: ( (lv_elemets_19_0= ruleIntentionalElement ) )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:751:1: (lv_elemets_19_0= ruleIntentionalElement )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:751:1: (lv_elemets_19_0= ruleIntentionalElement )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:752:3: lv_elemets_19_0= ruleIntentionalElement
            	    	            {
            	    	             
            	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsIntentionalElementParserRuleCall_3_4_0_0()); 
            	    	            	    
            	    	            pushFollow(FOLLOW_ruleIntentionalElement_in_ruleActor1901);
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
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:769:6: ( (lv_elemets_20_0= ruleElementLink ) )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:769:6: ( (lv_elemets_20_0= ruleElementLink ) )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:770:1: (lv_elemets_20_0= ruleElementLink )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:770:1: (lv_elemets_20_0= ruleElementLink )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:771:3: lv_elemets_20_0= ruleElementLink
            	    	            {
            	    	             
            	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsElementLinkParserRuleCall_3_4_1_0()); 
            	    	            	    
            	    	            pushFollow(FOLLOW_ruleElementLink_in_ruleActor1928);
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

            otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleActor1982); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:813:1: entryRuleSoftgoal returns [EObject current=null] : iv_ruleSoftgoal= ruleSoftgoal EOF ;
    public final EObject entryRuleSoftgoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftgoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:814:2: (iv_ruleSoftgoal= ruleSoftgoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:815:2: iv_ruleSoftgoal= ruleSoftgoal EOF
            {
             newCompositeNode(grammarAccess.getSoftgoalRule()); 
            pushFollow(FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal2018);
            iv_ruleSoftgoal=ruleSoftgoal();

            state._fsp--;

             current =iv_ruleSoftgoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftgoal2028); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:822:1: ruleSoftgoal returns [EObject current=null] : (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:825:28: ( (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:826:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:826:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:826:3: otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleSoftgoal2065); 

                	newLeafNode(otherlv_0, grammarAccess.getSoftgoalAccess().getSoftGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:830:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:831:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:831:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:832:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftgoal2082); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSoftgoal2099); 

                	newLeafNode(otherlv_2, grammarAccess.getSoftgoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:852:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:854:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:854:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:855:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:858:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:859:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:859:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
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
                else if ( (LA15_0==RULE_INT|| LA15_0 >=59 && LA15_0<=62) && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4) ) {
                    alt15=5;
                }
                else if ( LA15_0 >=32 && LA15_0<=34 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5) ) {
                    alt15=6;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:861:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:861:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:862:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:862:105: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:863:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:866:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:866:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:866:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:866:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal2157); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSoftgoalAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2169); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:874:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:875:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:875:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:876:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal2186); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2203); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:903:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:903:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:904:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:904:105: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:905:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:908:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:908:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:908:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:908:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleSoftgoal2271); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSoftgoalAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2283); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:916:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:917:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:917:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:918:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal2300); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2317); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:945:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:945:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:946:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:946:105: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:947:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:950:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:950:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:950:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:950:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleSoftgoal2385); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSoftgoalAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2397); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:958:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:959:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:959:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:960:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleSoftgoal2418);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2430); 

            	        	newLeafNode(otherlv_15, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:987:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:987:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:988:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:988:105: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:989:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:992:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:992:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:992:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:992:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleSoftgoal2498); 

            	        	newLeafNode(otherlv_16, grammarAccess.getSoftgoalAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2510); 

            	        	newLeafNode(otherlv_17, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1000:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1001:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1001:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1002:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleSoftgoal2531);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2543); 

            	        	newLeafNode(otherlv_19, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1029:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1029:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1030:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1030:105: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1031:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1034:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1034:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1034:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1034:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1034:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( ((LA13_0>=59 && LA13_0<=62)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1034:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1034:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1035:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1035:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1036:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSoftgoalAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleSoftgoal2621);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1053:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1053:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1054:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1054:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1055:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSoftgoal2644); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2662); 

            	        	newLeafNode(otherlv_22, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1082:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1082:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1083:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1083:105: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1084:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1087:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=2;
            	        switch ( input.LA(1) ) {
            	        case 32:
            	            {
            	            int LA14_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt14=1;
            	            }


            	            }
            	            break;
            	        case 33:
            	            {
            	            int LA14_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt14=1;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA14_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt14=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt14) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1087:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1087:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1088:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1088:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1089:3: lv_elementLinks_23_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getElementLinksInLineElementLinkParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleSoftgoal2738);
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

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleSoftgoal2791); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1131:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1132:2: (iv_ruleGoal= ruleGoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1133:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal2827);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal2837); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1140:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1143:28: ( (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1144:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1144:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1144:3: otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGoal2874); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1148:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1149:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1149:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1150:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal2891); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGoal2908); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1170:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1172:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1172:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1173:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1176:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1177:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1177:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
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
                else if ( (LA18_0==RULE_INT|| LA18_0 >=59 && LA18_0<=62) && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4) ) {
                    alt18=5;
                }
                else if ( LA18_0 >=32 && LA18_0<=34 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5) ) {
                    alt18=6;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1179:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1179:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1180:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1180:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1181:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1184:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1184:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1184:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1184:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleGoal2966); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGoalAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleGoal2978); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1192:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1193:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1193:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1194:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal2995); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleGoal3012); 

            	        	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1221:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1221:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1222:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1222:101: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1223:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1226:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1226:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1226:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1226:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleGoal3080); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleGoal3092); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1234:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1235:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1235:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1236:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal3109); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleGoal3126); 

            	        	newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1263:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1263:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1264:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1264:101: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1265:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1268:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1268:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1268:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1268:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleGoal3194); 

            	        	newLeafNode(otherlv_12, grammarAccess.getGoalAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleGoal3206); 

            	        	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1276:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1277:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1277:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1278:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleGoal3227);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleGoal3239); 

            	        	newLeafNode(otherlv_15, grammarAccess.getGoalAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1305:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1305:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1306:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1306:101: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1307:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1310:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1310:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1310:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1310:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleGoal3307); 

            	        	newLeafNode(otherlv_16, grammarAccess.getGoalAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleGoal3319); 

            	        	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1318:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1319:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1319:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1320:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleGoal3340);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleGoal3352); 

            	        	newLeafNode(otherlv_19, grammarAccess.getGoalAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1347:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1347:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1348:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1348:101: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1349:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1352:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1352:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1352:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1352:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1352:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>=59 && LA16_0<=62)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1352:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1352:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1353:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1353:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1354:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGoalAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleGoal3430);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1371:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1371:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1372:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1372:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1373:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGoal3453); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleGoal3471); 

            	        	newLeafNode(otherlv_22, grammarAccess.getGoalAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1400:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1400:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1401:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1401:101: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1402:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1405:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        switch ( input.LA(1) ) {
            	        case 32:
            	            {
            	            int LA17_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt17=1;
            	            }


            	            }
            	            break;
            	        case 33:
            	            {
            	            int LA17_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt17=1;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA17_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt17=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1405:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1405:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1406:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1406:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1407:3: lv_elementLinks_23_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getElementLinksInLineElementLinkParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleGoal3547);
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

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleGoal3600); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1449:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1450:2: (iv_ruleTask= ruleTask EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1451:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask3636);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask3646); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1458:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1461:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1462:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1462:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1462:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTask3683); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1466:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1467:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1467:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1468:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask3700); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTask3717); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1488:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1490:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1490:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1491:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1494:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1495:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1495:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
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
                else if ( (LA21_0==RULE_INT|| LA21_0 >=59 && LA21_0<=62) && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4) ) {
                    alt21=5;
                }
                else if ( LA21_0 >=32 && LA21_0<=34 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5) ) {
                    alt21=6;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1497:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1497:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1498:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1498:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1499:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1502:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1502:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1502:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1502:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleTask3775); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleTask3787); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1510:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1511:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1511:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1512:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask3804); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleTask3821); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1539:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1539:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1540:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1540:101: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1541:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1544:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1544:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1544:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1544:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleTask3889); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleTask3901); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1552:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1553:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1553:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1554:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask3918); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleTask3935); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1581:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1581:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1582:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1582:101: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1583:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1586:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1586:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1586:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1586:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleTask4003); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleTask4015); 

            	        	newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1594:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1595:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1595:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1596:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaskAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleTask4036);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleTask4048); 

            	        	newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1623:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1623:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1624:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1624:101: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1625:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1628:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1628:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1628:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1628:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleTask4116); 

            	        	newLeafNode(otherlv_16, grammarAccess.getTaskAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleTask4128); 

            	        	newLeafNode(otherlv_17, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1636:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1637:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1637:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1638:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaskAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleTask4149);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleTask4161); 

            	        	newLeafNode(otherlv_19, grammarAccess.getTaskAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1665:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1665:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1666:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1666:101: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1667:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1670:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1670:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1670:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1670:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1670:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( ((LA19_0>=59 && LA19_0<=62)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1670:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1670:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1671:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1671:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1672:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTaskAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleTask4239);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1689:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1689:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1690:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1690:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1691:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTask4262); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleTask4280); 

            	        	newLeafNode(otherlv_22, grammarAccess.getTaskAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1718:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1718:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1719:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1719:101: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1720:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1723:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    int cnt20=0;
            	    loop20:
            	    do {
            	        int alt20=2;
            	        switch ( input.LA(1) ) {
            	        case 32:
            	            {
            	            int LA20_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt20=1;
            	            }


            	            }
            	            break;
            	        case 33:
            	            {
            	            int LA20_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt20=1;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA20_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt20=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt20) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1723:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1723:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1724:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1724:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1725:3: lv_elementLinks_23_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTaskAccess().getElementLinksInLineElementLinkParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleTask4356);
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

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleTask4409); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1767:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1768:2: (iv_ruleResource= ruleResource EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1769:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource4445);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource4455); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1776:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1779:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1780:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1780:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1780:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleResource4492); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1784:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1785:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1785:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1786:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource4509); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleResource4526); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1806:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1808:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1808:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1809:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1812:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1813:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1813:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
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
                else if ( (LA24_0==RULE_INT|| LA24_0 >=59 && LA24_0<=62) && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4) ) {
                    alt24=5;
                }
                else if ( LA24_0 >=32 && LA24_0<=34 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5) ) {
                    alt24=6;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1815:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1815:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1816:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1816:105: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1817:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1820:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1820:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1820:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1820:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleResource4584); 

            	        	newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleResource4596); 

            	        	newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1828:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1829:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1829:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1830:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource4613); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleResource4630); 

            	        	newLeafNode(otherlv_7, grammarAccess.getResourceAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1857:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1857:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1858:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1858:105: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1859:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1862:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1862:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1862:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1862:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleResource4698); 

            	        	newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleResource4710); 

            	        	newLeafNode(otherlv_9, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1870:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1871:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1871:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1872:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource4727); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleResource4744); 

            	        	newLeafNode(otherlv_11, grammarAccess.getResourceAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1899:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1899:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1900:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1900:105: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1901:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1904:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1904:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1904:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1904:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleResource4812); 

            	        	newLeafNode(otherlv_12, grammarAccess.getResourceAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleResource4824); 

            	        	newLeafNode(otherlv_13, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1912:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1913:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1913:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1914:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleResource4845);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleResource4857); 

            	        	newLeafNode(otherlv_15, grammarAccess.getResourceAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1941:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1941:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1942:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1942:105: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1943:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1946:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1946:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1946:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1946:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleResource4925); 

            	        	newLeafNode(otherlv_16, grammarAccess.getResourceAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleResource4937); 

            	        	newLeafNode(otherlv_17, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1954:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1955:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1955:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1956:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleResource4958);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleResource4970); 

            	        	newLeafNode(otherlv_19, grammarAccess.getResourceAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1983:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1983:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1984:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1984:105: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1985:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1988:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1988:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1988:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1988:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1988:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( ((LA22_0>=59 && LA22_0<=62)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1988:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1988:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1989:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1989:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1990:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getResourceAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleResource5048);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2007:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2007:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2008:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2008:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2009:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResource5071); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleResource5089); 

            	        	newLeafNode(otherlv_22, grammarAccess.getResourceAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2036:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2036:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2037:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2037:105: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2038:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2041:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    int cnt23=0;
            	    loop23:
            	    do {
            	        int alt23=2;
            	        switch ( input.LA(1) ) {
            	        case 32:
            	            {
            	            int LA23_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	            }
            	            break;
            	        case 33:
            	            {
            	            int LA23_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA23_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt23) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2041:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2041:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2042:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2042:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2043:3: lv_elementLinks_23_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getResourceAccess().getElementLinksInLineElementLinkParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleResource5165);
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

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleResource5218); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2085:1: entryRuleIndicator returns [EObject current=null] : iv_ruleIndicator= ruleIndicator EOF ;
    public final EObject entryRuleIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicator = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2086:2: (iv_ruleIndicator= ruleIndicator EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2087:2: iv_ruleIndicator= ruleIndicator EOF
            {
             newCompositeNode(grammarAccess.getIndicatorRule()); 
            pushFollow(FOLLOW_ruleIndicator_in_entryRuleIndicator5254);
            iv_ruleIndicator=ruleIndicator();

            state._fsp--;

             current =iv_ruleIndicator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndicator5264); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2094:1: ruleIndicator returns [EObject current=null] : (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_36= '}' ) ;
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
        Token otherlv_36=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_decompositionType_18_0 = null;

        Enumerator lv_importance_20_0 = null;

        EObject lv_elementLinks_35_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2097:28: ( (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_36= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2098:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_36= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2098:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_36= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2098:3: otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_36= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleIndicator5301); 

                	newLeafNode(otherlv_0, grammarAccess.getIndicatorAccess().getIndicatorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2102:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2103:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2103:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2104:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator5318); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleIndicator5335); 

                	newLeafNode(otherlv_2, grammarAccess.getIndicatorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2124:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2126:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2126:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2127:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2130:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2131:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2131:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) ) )*
            loop29:
            do {
                int alt29=9;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2133:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2133:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2134:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2134:106: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2135:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2138:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2138:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2138:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2138:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleIndicator5393); 

            	        	newLeafNode(otherlv_4, grammarAccess.getIndicatorAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5405); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2146:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2147:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2147:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2148:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator5422); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5439); 

            	        	newLeafNode(otherlv_7, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2175:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2175:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2176:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2176:106: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2177:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2180:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2180:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2180:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2180:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleIndicator5507); 

            	        	newLeafNode(otherlv_8, grammarAccess.getIndicatorAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5519); 

            	        	newLeafNode(otherlv_9, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2188:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2189:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2189:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2190:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator5536); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5553); 

            	        	newLeafNode(otherlv_11, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2217:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2217:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2218:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2218:106: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2219:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2222:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2222:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2222:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2222:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleIndicator5621); 

            	        	newLeafNode(otherlv_12, grammarAccess.getIndicatorAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5633); 

            	        	newLeafNode(otherlv_13, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2230:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2231:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2231:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2232:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleIndicator5654);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5666); 

            	        	newLeafNode(otherlv_15, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2259:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2259:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2260:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2260:106: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2261:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2264:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2264:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2264:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2264:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleIndicator5734); 

            	        	newLeafNode(otherlv_16, grammarAccess.getIndicatorAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5746); 

            	        	newLeafNode(otherlv_17, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2272:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2273:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2273:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2274:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleIndicator5767);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5779); 

            	        	newLeafNode(otherlv_19, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2301:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2301:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2302:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2302:106: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2303:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2306:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2306:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2306:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2306:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2306:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( ((LA25_0>=59 && LA25_0<=62)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2306:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2306:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2307:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2307:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2308:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getIndicatorAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleIndicator5857);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2325:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2325:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2326:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2326:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2327:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIndicator5880); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5898); 

            	        	newLeafNode(otherlv_22, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2354:4: ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2354:4: ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2355:5: {...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2355:106: ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2356:6: ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2359:6: ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2359:7: {...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2359:16: (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2359:18: otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';'
            	    {
            	    otherlv_23=(Token)match(input,28,FOLLOW_28_in_ruleIndicator5966); 

            	        	newLeafNode(otherlv_23, grammarAccess.getIndicatorAccess().getKpiModelLinksDestKeyword_3_5_0());
            	        
            	    otherlv_24=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5978); 

            	        	newLeafNode(otherlv_24, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2367:1: ( (otherlv_25= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2368:1: (otherlv_25= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2368:1: (otherlv_25= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2369:3: otherlv_25= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	        }
            	            
            	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator5998); 

            	    		newLeafNode(otherlv_25, grammarAccess.getIndicatorAccess().getKpiModelLinksDestKPIModelLinkCrossReference_3_5_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2380:2: (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==29) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2380:4: otherlv_26= ',' ( (otherlv_27= RULE_ID ) )
            	    	    {
            	    	    otherlv_26=(Token)match(input,29,FOLLOW_29_in_ruleIndicator6011); 

            	    	        	newLeafNode(otherlv_26, grammarAccess.getIndicatorAccess().getCommaKeyword_3_5_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2384:1: ( (otherlv_27= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2385:1: (otherlv_27= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2385:1: (otherlv_27= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2386:3: otherlv_27= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	    	        }
            	    	            
            	    	    otherlv_27=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator6031); 

            	    	    		newLeafNode(otherlv_27, grammarAccess.getIndicatorAccess().getKpiModelLinksDestKPIModelLinkCrossReference_3_5_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop26;
            	        }
            	    } while (true);

            	    otherlv_28=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6045); 

            	        	newLeafNode(otherlv_28, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_5_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2408:4: ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2408:4: ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2409:5: {...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2409:106: ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2410:6: ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2413:6: ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2413:7: {...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2413:16: (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2413:18: otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';'
            	    {
            	    otherlv_29=(Token)match(input,30,FOLLOW_30_in_ruleIndicator6113); 

            	        	newLeafNode(otherlv_29, grammarAccess.getIndicatorAccess().getGroupsKeyword_3_6_0());
            	        
            	    otherlv_30=(Token)match(input,18,FOLLOW_18_in_ruleIndicator6125); 

            	        	newLeafNode(otherlv_30, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2421:1: ( (otherlv_31= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2422:1: (otherlv_31= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2422:1: (otherlv_31= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2423:3: otherlv_31= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	        }
            	            
            	    otherlv_31=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator6145); 

            	    		newLeafNode(otherlv_31, grammarAccess.getIndicatorAccess().getGroupsIndicatorGroupCrossReference_3_6_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2434:2: (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==29) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2434:4: otherlv_32= ',' ( (otherlv_33= RULE_ID ) )
            	    	    {
            	    	    otherlv_32=(Token)match(input,29,FOLLOW_29_in_ruleIndicator6158); 

            	    	        	newLeafNode(otherlv_32, grammarAccess.getIndicatorAccess().getCommaKeyword_3_6_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2438:1: ( (otherlv_33= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2439:1: (otherlv_33= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2439:1: (otherlv_33= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2440:3: otherlv_33= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	    	        }
            	    	            
            	    	    otherlv_33=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator6178); 

            	    	    		newLeafNode(otherlv_33, grammarAccess.getIndicatorAccess().getGroupsIndicatorGroupCrossReference_3_6_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);

            	    otherlv_34=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6192); 

            	        	newLeafNode(otherlv_34, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_6_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2462:4: ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2462:4: ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2463:5: {...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2463:106: ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2464:6: ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2467:6: ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+
            	    int cnt28=0;
            	    loop28:
            	    do {
            	        int alt28=2;
            	        switch ( input.LA(1) ) {
            	        case 32:
            	            {
            	            int LA28_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt28=1;
            	            }


            	            }
            	            break;
            	        case 33:
            	            {
            	            int LA28_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt28=1;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA28_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt28=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt28) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2467:7: {...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2467:16: ( (lv_elementLinks_35_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2468:1: (lv_elementLinks_35_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2468:1: (lv_elementLinks_35_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2469:3: lv_elementLinks_35_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getElementLinksInLineElementLinkParserRuleCall_3_7_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleIndicator6268);
            	    	    lv_elementLinks_35_0=ruleInLineElementLink();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"elementLinks",
            	    	            		lv_elementLinks_35_0, 
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	

            }

            otherlv_36=(Token)match(input,15,FOLLOW_15_in_ruleIndicator6321); 

                	newLeafNode(otherlv_36, grammarAccess.getIndicatorAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2511:1: entryRuleBelief returns [EObject current=null] : iv_ruleBelief= ruleBelief EOF ;
    public final EObject entryRuleBelief() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelief = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2512:2: (iv_ruleBelief= ruleBelief EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2513:2: iv_ruleBelief= ruleBelief EOF
            {
             newCompositeNode(grammarAccess.getBeliefRule()); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief6357);
            iv_ruleBelief=ruleBelief();

            state._fsp--;

             current =iv_ruleBelief; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief6367); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2520:1: ruleBelief returns [EObject current=null] : (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2523:28: ( (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2524:1: (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2524:1: (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2524:3: otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleBelief6404); 

                	newLeafNode(otherlv_0, grammarAccess.getBeliefAccess().getBeliefKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2528:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2529:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2529:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2530:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBelief6421); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBelief6438); 

                	newLeafNode(otherlv_2, grammarAccess.getBeliefAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2550:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2552:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2552:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2553:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2556:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2557:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2557:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( LA30_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2559:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2559:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2560:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2560:103: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2561:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2564:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2564:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2564:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2564:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleBelief6496); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBeliefAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleBelief6508); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBeliefAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2572:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2573:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2573:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2574:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelief6525); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleBelief6542); 

            	        	newLeafNode(otherlv_7, grammarAccess.getBeliefAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2601:4: ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2601:4: ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2602:5: {...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2602:103: ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2603:6: ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2606:6: ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2606:7: {...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2606:16: (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2606:18: otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleBelief6610); 

            	        	newLeafNode(otherlv_8, grammarAccess.getBeliefAccess().getDescriptionKeyword_3_1_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2610:1: ( (lv_description_9_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2611:1: (lv_description_9_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2611:1: (lv_description_9_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2612:3: lv_description_9_0= RULE_STRING
            	    {
            	    lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelief6627); 

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

            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleBelief6644); 

            	        	newLeafNode(otherlv_10, grammarAccess.getBeliefAccess().getSemicolonKeyword_3_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	

            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleBelief6697); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2658:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2659:2: (iv_ruleDecomposition= ruleDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2660:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             newCompositeNode(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition6733);
            iv_ruleDecomposition=ruleDecomposition();

            state._fsp--;

             current =iv_ruleDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition6743); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2667:1: ruleDecomposition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2670:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2671:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2671:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2671:2: ( ( ruleQualifiedName ) ) otherlv_1= 'decomposedBy' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2671:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2672:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2672:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2673:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecompositionAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecomposition6791);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleDecomposition6803); 

                	newLeafNode(otherlv_1, grammarAccess.getDecompositionAccess().getDecomposedByKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2690:1: ( (lv_dest_2_0= ruleDecompositionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2691:1: (lv_dest_2_0= ruleDecompositionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2691:1: (lv_dest_2_0= ruleDecompositionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2692:3: lv_dest_2_0= ruleDecompositionEnd
            {
             
            	        newCompositeNode(grammarAccess.getDecompositionAccess().getDestDecompositionEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleDecomposition6824);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2708:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==29) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2708:4: otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleDecomposition6837); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDecompositionAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2712:1: ( (lv_dest_4_0= ruleDecompositionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2713:1: (lv_dest_4_0= ruleDecompositionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2713:1: (lv_dest_4_0= ruleDecompositionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2714:3: lv_dest_4_0= ruleDecompositionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDecompositionAccess().getDestDecompositionEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleDecomposition6858);
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
            	    break loop31;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDecomposition6872); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2742:1: entryRuleInLineDecomposition returns [EObject current=null] : iv_ruleInLineDecomposition= ruleInLineDecomposition EOF ;
    public final EObject entryRuleInLineDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2743:2: (iv_ruleInLineDecomposition= ruleInLineDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2744:2: iv_ruleInLineDecomposition= ruleInLineDecomposition EOF
            {
             newCompositeNode(grammarAccess.getInLineDecompositionRule()); 
            pushFollow(FOLLOW_ruleInLineDecomposition_in_entryRuleInLineDecomposition6908);
            iv_ruleInLineDecomposition=ruleInLineDecomposition();

            state._fsp--;

             current =iv_ruleInLineDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineDecomposition6918); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2751:1: ruleInLineDecomposition returns [EObject current=null] : (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2754:28: ( (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2755:1: (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2755:1: (otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2755:3: otherlv_0= 'decomposedBy' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleInLineDecomposition6955); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineDecompositionAccess().getDecomposedByKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2759:1: ( (lv_dest_1_0= ruleDecompositionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2760:1: (lv_dest_1_0= ruleDecompositionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2760:1: (lv_dest_1_0= ruleDecompositionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2761:3: lv_dest_1_0= ruleDecompositionEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineDecompositionAccess().getDestDecompositionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition6976);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2777:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==29) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2777:4: otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleInLineDecomposition6989); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineDecompositionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2781:1: ( (lv_dest_3_0= ruleDecompositionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2782:1: (lv_dest_3_0= ruleDecompositionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2782:1: (lv_dest_3_0= ruleDecompositionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2783:3: lv_dest_3_0= ruleDecompositionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineDecompositionAccess().getDestDecompositionEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition7010);
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
            	    break loop32;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleInLineDecomposition7024); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2811:1: entryRuleDecompositionEnd returns [EObject current=null] : iv_ruleDecompositionEnd= ruleDecompositionEnd EOF ;
    public final EObject entryRuleDecompositionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecompositionEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2812:2: (iv_ruleDecompositionEnd= ruleDecompositionEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2813:2: iv_ruleDecompositionEnd= ruleDecompositionEnd EOF
            {
             newCompositeNode(grammarAccess.getDecompositionEndRule()); 
            pushFollow(FOLLOW_ruleDecompositionEnd_in_entryRuleDecompositionEnd7060);
            iv_ruleDecompositionEnd=ruleDecompositionEnd();

            state._fsp--;

             current =iv_ruleDecompositionEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecompositionEnd7070); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2820:1: ruleDecompositionEnd returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) ;
    public final EObject ruleDecompositionEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2823:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2824:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2824:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2824:2: ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2824:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2825:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2825:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2826:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecompositionEndAccess().getNameIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecompositionEnd7118);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2839:2: (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==14) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2839:4: otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDecompositionEnd7131); 

                        	newLeafNode(otherlv_1, grammarAccess.getDecompositionEndAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2843:1: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_STRING) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2844:1: (lv_description_2_0= RULE_STRING )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2844:1: (lv_description_2_0= RULE_STRING )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2845:3: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecompositionEnd7148); 

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

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDecompositionEnd7166); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2873:1: entryRuleContribution returns [EObject current=null] : iv_ruleContribution= ruleContribution EOF ;
    public final EObject entryRuleContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2874:2: (iv_ruleContribution= ruleContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2875:2: iv_ruleContribution= ruleContribution EOF
            {
             newCompositeNode(grammarAccess.getContributionRule()); 
            pushFollow(FOLLOW_ruleContribution_in_entryRuleContribution7204);
            iv_ruleContribution=ruleContribution();

            state._fsp--;

             current =iv_ruleContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContribution7214); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2882:1: ruleContribution returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2885:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2886:1: ( ( ( ruleQualifiedName ) ) ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2886:1: ( ( ( ruleQualifiedName ) ) ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2886:2: ( ( ruleQualifiedName ) ) ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2886:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2887:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2887:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2888:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContribution7262);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2901:2: ( (lv_dest_1_0= ruleContributionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2902:1: (lv_dest_1_0= ruleContributionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2902:1: (lv_dest_1_0= ruleContributionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2903:3: lv_dest_1_0= ruleContributionEnd
            {
             
            	        newCompositeNode(grammarAccess.getContributionAccess().getDestContributionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleContributionEnd_in_ruleContribution7283);
            lv_dest_1_0=ruleContributionEnd();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContributionRule());
            	        }
                   		add(
                   			current, 
                   			"dest",
                    		lv_dest_1_0, 
                    		"ContributionEnd");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2919:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==29) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2919:4: otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleContribution7296); 

            	        	newLeafNode(otherlv_2, grammarAccess.getContributionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2923:1: ( (lv_dest_3_0= ruleContributionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2924:1: (lv_dest_3_0= ruleContributionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2924:1: (lv_dest_3_0= ruleContributionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2925:3: lv_dest_3_0= ruleContributionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionAccess().getDestContributionEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionEnd_in_ruleContribution7317);
            	    lv_dest_3_0=ruleContributionEnd();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContributionRule());
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
            	    break loop35;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleContribution7331); 

                	newLeafNode(otherlv_4, grammarAccess.getContributionAccess().getSemicolonKeyword_3());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2953:1: entryRuleInLineContribution returns [EObject current=null] : iv_ruleInLineContribution= ruleInLineContribution EOF ;
    public final EObject entryRuleInLineContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2954:2: (iv_ruleInLineContribution= ruleInLineContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2955:2: iv_ruleInLineContribution= ruleInLineContribution EOF
            {
             newCompositeNode(grammarAccess.getInLineContributionRule()); 
            pushFollow(FOLLOW_ruleInLineContribution_in_entryRuleInLineContribution7367);
            iv_ruleInLineContribution=ruleInLineContribution();

            state._fsp--;

             current =iv_ruleInLineContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineContribution7377); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2962:1: ruleInLineContribution returns [EObject current=null] : (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2965:28: ( (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2966:1: (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2966:1: (otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2966:3: otherlv_0= 'contributeTo' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleInLineContribution7414); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineContributionAccess().getContributeToKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2970:1: ( (lv_dest_1_0= ruleContributionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2971:1: (lv_dest_1_0= ruleContributionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2971:1: (lv_dest_1_0= ruleContributionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2972:3: lv_dest_1_0= ruleContributionEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineContributionAccess().getDestContributionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleContributionEnd_in_ruleInLineContribution7435);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2988:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==29) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2988:4: otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleInLineContribution7448); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineContributionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2992:1: ( (lv_dest_3_0= ruleContributionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2993:1: (lv_dest_3_0= ruleContributionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2993:1: (lv_dest_3_0= ruleContributionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2994:3: lv_dest_3_0= ruleContributionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineContributionAccess().getDestContributionEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionEnd_in_ruleInLineContribution7469);
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
            	    break loop36;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleInLineContribution7483); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3022:1: entryRuleContributionEnd returns [EObject current=null] : iv_ruleContributionEnd= ruleContributionEnd EOF ;
    public final EObject entryRuleContributionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3023:2: (iv_ruleContributionEnd= ruleContributionEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3024:2: iv_ruleContributionEnd= ruleContributionEnd EOF
            {
             newCompositeNode(grammarAccess.getContributionEndRule()); 
            pushFollow(FOLLOW_ruleContributionEnd_in_entryRuleContributionEnd7519);
            iv_ruleContributionEnd=ruleContributionEnd();

            state._fsp--;

             current =iv_ruleContributionEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionEnd7529); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3031:1: ruleContributionEnd returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ) ;
    public final EObject ruleContributionEnd() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_2=null;
        Token lv_quantitativeContribution_4_0=null;
        Token otherlv_5=null;
        Enumerator lv_contribution_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3034:28: ( ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3035:1: ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3035:1: ( ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3035:2: ( (lv_name_0_0= RULE_ID ) )? ( ( ruleQualifiedName ) ) (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3035:2: ( (lv_name_0_0= RULE_ID ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_ID) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3036:1: (lv_name_0_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3036:1: (lv_name_0_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3037:3: lv_name_0_0= RULE_ID
                    {
                    lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionEnd7571); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3053:3: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3054:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3054:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3055:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionEndAccess().getDesnameIntentionalElementCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionEnd7600);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3068:2: (otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==14) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3068:4: otherlv_2= '{' ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )? otherlv_5= '}'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContributionEnd7613); 

                        	newLeafNode(otherlv_2, grammarAccess.getContributionEndAccess().getLeftCurlyBracketKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3072:1: ( ( (lv_contribution_3_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_4_0= RULE_INT ) ) )?
                    int alt38=3;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=66 && LA38_0<=72)) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==RULE_INT) ) {
                        alt38=2;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3072:2: ( (lv_contribution_3_0= ruleContributionType ) )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3072:2: ( (lv_contribution_3_0= ruleContributionType ) )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3073:1: (lv_contribution_3_0= ruleContributionType )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3073:1: (lv_contribution_3_0= ruleContributionType )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3074:3: lv_contribution_3_0= ruleContributionType
                            {
                             
                            	        newCompositeNode(grammarAccess.getContributionEndAccess().getContributionContributionTypeEnumRuleCall_2_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContributionType_in_ruleContributionEnd7635);
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
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3091:6: ( (lv_quantitativeContribution_4_0= RULE_INT ) )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3091:6: ( (lv_quantitativeContribution_4_0= RULE_INT ) )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3092:1: (lv_quantitativeContribution_4_0= RULE_INT )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3092:1: (lv_quantitativeContribution_4_0= RULE_INT )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3093:3: lv_quantitativeContribution_4_0= RULE_INT
                            {
                            lv_quantitativeContribution_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionEnd7658); 

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

                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleContributionEnd7677); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3121:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3122:2: (iv_ruleDependency= ruleDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3123:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency7715);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency7725); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3130:1: ruleDependency returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3133:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3134:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3134:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3134:2: ( ( ruleQualifiedName ) ) otherlv_1= 'dependOn' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3134:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3135:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3135:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3136:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependency7773);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleDependency7785); 

                	newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getDependOnKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3153:1: ( (lv_dest_2_0= ruleDependencyEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3154:1: (lv_dest_2_0= ruleDependencyEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3154:1: (lv_dest_2_0= ruleDependencyEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3155:3: lv_dest_2_0= ruleDependencyEnd
            {
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getDestDependencyEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyEnd_in_ruleDependency7806);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3171:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==29) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3171:4: otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleDependency7819); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3175:1: ( (lv_dest_4_0= ruleDependencyEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3176:1: (lv_dest_4_0= ruleDependencyEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3176:1: (lv_dest_4_0= ruleDependencyEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3177:3: lv_dest_4_0= ruleDependencyEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependencyAccess().getDestDependencyEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyEnd_in_ruleDependency7840);
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
            	    break loop40;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDependency7854); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3205:1: entryRuleInLineDependency returns [EObject current=null] : iv_ruleInLineDependency= ruleInLineDependency EOF ;
    public final EObject entryRuleInLineDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3206:2: (iv_ruleInLineDependency= ruleInLineDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3207:2: iv_ruleInLineDependency= ruleInLineDependency EOF
            {
             newCompositeNode(grammarAccess.getInLineDependencyRule()); 
            pushFollow(FOLLOW_ruleInLineDependency_in_entryRuleInLineDependency7890);
            iv_ruleInLineDependency=ruleInLineDependency();

            state._fsp--;

             current =iv_ruleInLineDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineDependency7900); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3214:1: ruleInLineDependency returns [EObject current=null] : (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3217:28: ( (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3218:1: (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3218:1: (otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3218:3: otherlv_0= 'dependOn' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleInLineDependency7937); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineDependencyAccess().getDependOnKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3222:1: ( (lv_dest_1_0= ruleDependencyEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3223:1: (lv_dest_1_0= ruleDependencyEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3223:1: (lv_dest_1_0= ruleDependencyEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3224:3: lv_dest_1_0= ruleDependencyEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineDependencyAccess().getDestDependencyEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7958);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3240:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==29) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3240:4: otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleInLineDependency7971); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineDependencyAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3244:1: ( (lv_dest_3_0= ruleDependencyEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3245:1: (lv_dest_3_0= ruleDependencyEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3245:1: (lv_dest_3_0= ruleDependencyEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3246:3: lv_dest_3_0= ruleDependencyEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineDependencyAccess().getDestDependencyEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7992);
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
            	    break loop41;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleInLineDependency8006); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3274:1: entryRuleDependencyEnd returns [EObject current=null] : iv_ruleDependencyEnd= ruleDependencyEnd EOF ;
    public final EObject entryRuleDependencyEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3275:2: (iv_ruleDependencyEnd= ruleDependencyEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3276:2: iv_ruleDependencyEnd= ruleDependencyEnd EOF
            {
             newCompositeNode(grammarAccess.getDependencyEndRule()); 
            pushFollow(FOLLOW_ruleDependencyEnd_in_entryRuleDependencyEnd8042);
            iv_ruleDependencyEnd=ruleDependencyEnd();

            state._fsp--;

             current =iv_ruleDependencyEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyEnd8052); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3283:1: ruleDependencyEnd returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) ;
    public final EObject ruleDependencyEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3286:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3287:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3287:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3287:2: ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3287:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3288:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3288:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3289:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyEndAccess().getNameIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependencyEnd8100);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3302:2: (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==14) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3302:4: otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDependencyEnd8113); 

                        	newLeafNode(otherlv_1, grammarAccess.getDependencyEndAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3306:1: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_STRING) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3307:1: (lv_description_2_0= RULE_STRING )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3307:1: (lv_description_2_0= RULE_STRING )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3308:3: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependencyEnd8130); 

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

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDependencyEnd8148); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3336:1: entryRuleStrategyGroup returns [EObject current=null] : iv_ruleStrategyGroup= ruleStrategyGroup EOF ;
    public final EObject entryRuleStrategyGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStrategyGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3337:2: (iv_ruleStrategyGroup= ruleStrategyGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3338:2: iv_ruleStrategyGroup= ruleStrategyGroup EOF
            {
             newCompositeNode(grammarAccess.getStrategyGroupRule()); 
            pushFollow(FOLLOW_ruleStrategyGroup_in_entryRuleStrategyGroup8186);
            iv_ruleStrategyGroup=ruleStrategyGroup();

            state._fsp--;

             current =iv_ruleStrategyGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStrategyGroup8196); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3345:1: ruleStrategyGroup returns [EObject current=null] : (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' ) ;
    public final EObject ruleStrategyGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3348:28: ( (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3349:1: (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3349:1: (otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3349:3: otherlv_0= 'strategyGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleStrategyGroup8233); 

                	newLeafNode(otherlv_0, grammarAccess.getStrategyGroupAccess().getStrategyGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3353:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3354:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3354:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3355:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStrategyGroup8250); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleStrategyGroup8267); 

                	newLeafNode(otherlv_2, grammarAccess.getStrategyGroupAccess().getIncludesKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3375:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3376:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3376:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3377:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStrategyGroupRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getStrategyGroupAccess().getStrategiesEvaluationStrategyCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8290);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3390:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==29) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3390:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleStrategyGroup8303); 

            	        	newLeafNode(otherlv_4, grammarAccess.getStrategyGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3394:1: ( ( ruleQualifiedName ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3395:1: ( ruleQualifiedName )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3395:1: ( ruleQualifiedName )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3396:3: ruleQualifiedName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStrategyGroupRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getStrategyGroupAccess().getStrategiesEvaluationStrategyCrossReference_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8326);
            	    ruleQualifiedName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleStrategyGroup8340); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3421:1: entryRuleEvaluationStrategy returns [EObject current=null] : iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF ;
    public final EObject entryRuleEvaluationStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationStrategy = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3422:2: (iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3423:2: iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF
            {
             newCompositeNode(grammarAccess.getEvaluationStrategyRule()); 
            pushFollow(FOLLOW_ruleEvaluationStrategy_in_entryRuleEvaluationStrategy8376);
            iv_ruleEvaluationStrategy=ruleEvaluationStrategy();

            state._fsp--;

             current =iv_ruleEvaluationStrategy; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationStrategy8386); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3430:1: ruleEvaluationStrategy returns [EObject current=null] : (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_evaluations_7_0= ruleEvaluation ) )* otherlv_8= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3433:28: ( (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_evaluations_7_0= ruleEvaluation ) )* otherlv_8= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3434:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_evaluations_7_0= ruleEvaluation ) )* otherlv_8= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3434:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_evaluations_7_0= ruleEvaluation ) )* otherlv_8= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3434:3: otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' ( (lv_evaluations_7_0= ruleEvaluation ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleEvaluationStrategy8423); 

                	newLeafNode(otherlv_0, grammarAccess.getEvaluationStrategyAccess().getStrategyKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3438:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3439:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3439:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3440:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvaluationStrategy8440); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3456:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==38) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3456:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleEvaluationStrategy8458); 

                        	newLeafNode(otherlv_2, grammarAccess.getEvaluationStrategyAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3460:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3461:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3461:1: ( ruleQualifiedName )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3462:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getSuperStrategiesEvaluationStrategyCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy8481);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3475:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==29) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3475:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleEvaluationStrategy8494); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getEvaluationStrategyAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3479:1: ( ( ruleQualifiedName ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3480:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3480:1: ( ruleQualifiedName )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3481:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getSuperStrategiesEvaluationStrategyCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy8517);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleEvaluationStrategy8533); 

                	newLeafNode(otherlv_6, grammarAccess.getEvaluationStrategyAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3498:1: ( (lv_evaluations_7_0= ruleEvaluation ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==RULE_ID) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3499:1: (lv_evaluations_7_0= ruleEvaluation )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3499:1: (lv_evaluations_7_0= ruleEvaluation )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3500:3: lv_evaluations_7_0= ruleEvaluation
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getEvaluationsEvaluationParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvaluation_in_ruleEvaluationStrategy8554);
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
            	    break loop47;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleEvaluationStrategy8567); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3528:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3529:2: (iv_ruleEvaluation= ruleEvaluation EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3530:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation8603);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation8613); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3537:1: ruleEvaluation returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3540:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3541:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3541:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3541:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) ) ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3541:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3542:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3542:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3543:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getEvaluationRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getEvaluationAccess().getIntentionalElementIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluation8661);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation8673); 

                	newLeafNode(otherlv_1, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3560:1: ( ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) ) | ( (lv_evaluation_3_0= RULE_INT ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==59||LA48_0==69||(LA48_0>=73 && LA48_0<=77)) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_INT) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3560:2: ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3560:2: ( (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3561:1: (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3561:1: (lv_qualitativeEvaluation_2_0= ruleQualitativeLabel )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3562:3: lv_qualitativeEvaluation_2_0= ruleQualitativeLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getEvaluationAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleEvaluation8695);
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3579:6: ( (lv_evaluation_3_0= RULE_INT ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3579:6: ( (lv_evaluation_3_0= RULE_INT ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3580:1: (lv_evaluation_3_0= RULE_INT )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3580:1: (lv_evaluation_3_0= RULE_INT )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3581:3: lv_evaluation_3_0= RULE_INT
                    {
                    lv_evaluation_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluation8718); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3597:3: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) ) | otherlv_11= ';' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=14 && LA52_0<=15)||(LA52_0>=40 && LA52_0<=42)||(LA52_0>=51 && LA52_0<=56)) ) {
                alt52=1;
            }
            else if ( (LA52_0==19) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3597:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3597:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3599:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3599:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3600:2: ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?)
                    {
                     
                    	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0());
                    	
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3603:2: ( ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?)
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3604:3: ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+ {...}?
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3604:3: ( ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) ) | ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) ) )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=4;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==15) ) {
                            int LA51_2 = input.LA(2);

                            if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2) ) {
                                alt51=3;
                            }


                        }
                        else if ( LA51_0 ==14 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0) ) {
                            alt51=1;
                        }
                        else if ( LA51_0 >=40 && LA51_0<=42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1) ) {
                            alt51=2;
                        }
                        else if ( LA51_0 >=51 && LA51_0<=56 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2) ) {
                            alt51=3;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3606:4: ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3606:4: ({...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3607:5: {...}? => ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3607:109: ( ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3608:6: ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 0);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3611:6: ({...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3611:7: {...}? => (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3611:16: (otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )? )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3611:18: otherlv_5= '{' ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )?
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleEvaluation8783); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_3_0_0_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3615:1: ( ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';' )?
                    	    int alt49=2;
                    	    int LA49_0 = input.LA(1);

                    	    if ( (LA49_0==39) ) {
                    	        alt49=1;
                    	    }
                    	    switch (alt49) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3615:2: ( (lv_exceeds_6_0= 'exceeds' ) ) otherlv_7= ';'
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3615:2: ( (lv_exceeds_6_0= 'exceeds' ) )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3616:1: (lv_exceeds_6_0= 'exceeds' )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3616:1: (lv_exceeds_6_0= 'exceeds' )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3617:3: lv_exceeds_6_0= 'exceeds'
                    	            {
                    	            lv_exceeds_6_0=(Token)match(input,39,FOLLOW_39_in_ruleEvaluation8802); 

                    	                    newLeafNode(lv_exceeds_6_0, grammarAccess.getEvaluationAccess().getExceedsExceedsKeyword_3_0_0_1_0_0());
                    	                

                    	            	        if (current==null) {
                    	            	            current = createModelElement(grammarAccess.getEvaluationRule());
                    	            	        }
                    	                   		setWithLastConsumed(current, "exceeds", true, "exceeds");
                    	            	    

                    	            }


                    	            }

                    	            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation8827); 

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
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3641:4: ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3641:4: ({...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3642:5: {...}? => ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3642:109: ( ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3643:6: ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 1);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3646:6: ({...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3646:7: {...}? => ( (lv_evalRange_8_0= ruleEvaluationRange ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3646:16: ( (lv_evalRange_8_0= ruleEvaluationRange ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3647:1: (lv_evalRange_8_0= ruleEvaluationRange )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3647:1: (lv_evalRange_8_0= ruleEvaluationRange )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3648:3: lv_evalRange_8_0= ruleEvaluationRange
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getEvalRangeEvaluationRangeParserRuleCall_3_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleEvaluationRange_in_ruleEvaluation8905);
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
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3671:4: ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3671:4: ({...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3672:5: {...}? => ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2)");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3672:109: ( ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3673:6: ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) )
                    	    {
                    	     
                    	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0(), 2);
                    	    	 				
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3676:6: ({...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3676:7: {...}? => ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
                    	    }
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3676:16: ( ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}' )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3676:17: ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )? otherlv_10= '}'
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3676:17: ( (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet ) )?
                    	    int alt50=2;
                    	    int LA50_0 = input.LA(1);

                    	    if ( ((LA50_0>=51 && LA50_0<=56)) ) {
                    	        alt50=1;
                    	    }
                    	    switch (alt50) {
                    	        case 1 :
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3677:1: (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet )
                    	            {
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3677:1: (lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet )
                    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3678:3: lv_kpiEvalValueSet_9_0= ruleKPIEvalValueSet
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getEvaluationAccess().getKpiEvalValueSetKPIEvalValueSetParserRuleCall_3_0_2_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation8981);
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

                    	    otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleEvaluation8994); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_3_0_2_1());
                    	        

                    	    }


                    	    }

                    	     
                    	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3_0());
                    	    	 				

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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3714:7: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation9059); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3726:1: entryRuleEvaluationRange returns [EObject current=null] : iv_ruleEvaluationRange= ruleEvaluationRange EOF ;
    public final EObject entryRuleEvaluationRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3727:2: (iv_ruleEvaluationRange= ruleEvaluationRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3728:2: iv_ruleEvaluationRange= ruleEvaluationRange EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRangeRule()); 
            pushFollow(FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange9096);
            iv_ruleEvaluationRange=ruleEvaluationRange();

            state._fsp--;

             current =iv_ruleEvaluationRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationRange9106); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3735:1: ruleEvaluationRange returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3738:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3739:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3739:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3741:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3741:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3742:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3745:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3746:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3746:3: ( ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) )+
            int cnt53=0;
            loop53:
            do {
                int alt53=4;
                switch ( input.LA(1) ) {
                case 40:
                    {
                    int LA53_2 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0) ) {
                        alt53=1;
                    }


                    }
                    break;
                case 41:
                    {
                    int LA53_3 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1) ) {
                        alt53=2;
                    }


                    }
                    break;
                case 42:
                    {
                    int LA53_4 = input.LA(2);

                    if ( getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2) ) {
                        alt53=3;
                    }


                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3748:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3748:4: ({...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3749:5: {...}? => ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3749:110: ( ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3750:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3753:6: ({...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3753:7: {...}? => (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3753:16: (otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3753:18: otherlv_1= 'start' otherlv_2= '=' ( (lv_start_3_0= RULE_INT ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleEvaluationRange9188); 

            	        	newLeafNode(otherlv_1, grammarAccess.getEvaluationRangeAccess().getStartKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange9200); 

            	        	newLeafNode(otherlv_2, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3761:1: ( (lv_start_3_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3762:1: (lv_start_3_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3762:1: (lv_start_3_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3763:3: lv_start_3_0= RULE_INT
            	    {
            	    lv_start_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange9217); 

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

            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange9234); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3790:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3790:4: ({...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3791:5: {...}? => ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3791:110: ( ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3792:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3795:6: ({...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3795:7: {...}? => (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3795:16: (otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3795:18: otherlv_5= 'end' otherlv_6= '=' ( (lv_end_7_0= RULE_INT ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleEvaluationRange9302); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEvaluationRangeAccess().getEndKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange9314); 

            	        	newLeafNode(otherlv_6, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3803:1: ( (lv_end_7_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3804:1: (lv_end_7_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3804:1: (lv_end_7_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3805:3: lv_end_7_0= RULE_INT
            	    {
            	    lv_end_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange9331); 

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

            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange9348); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3832:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3832:4: ({...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3833:5: {...}? => ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3833:110: ( ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3834:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3837:6: ({...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3837:7: {...}? => (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3837:16: (otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3837:18: otherlv_9= 'step' otherlv_10= '=' ( (lv_step_11_0= RULE_INT ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleEvaluationRange9416); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEvaluationRangeAccess().getStepKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange9428); 

            	        	newLeafNode(otherlv_10, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3845:1: ( (lv_step_11_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3846:1: (lv_step_11_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3846:1: (lv_step_11_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3847:3: lv_step_11_0= RULE_INT
            	    {
            	    lv_step_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange9445); 

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

            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange9462); 

            	        	newLeafNode(otherlv_12, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup());
            	    	 				

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


    // $ANTLR start "entryRuleContributionGroup"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3892:1: entryRuleContributionGroup returns [EObject current=null] : iv_ruleContributionGroup= ruleContributionGroup EOF ;
    public final EObject entryRuleContributionGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionGroup = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3893:2: (iv_ruleContributionGroup= ruleContributionGroup EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3894:2: iv_ruleContributionGroup= ruleContributionGroup EOF
            {
             newCompositeNode(grammarAccess.getContributionGroupRule()); 
            pushFollow(FOLLOW_ruleContributionGroup_in_entryRuleContributionGroup9546);
            iv_ruleContributionGroup=ruleContributionGroup();

            state._fsp--;

             current =iv_ruleContributionGroup; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionGroup9556); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3901:1: ruleContributionGroup returns [EObject current=null] : (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3904:28: ( (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3905:1: (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3905:1: (otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3905:3: otherlv_0= 'contributionGroup' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'includes' ( (otherlv_3= RULE_ID ) ) (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleContributionGroup9593); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionGroupAccess().getContributionGroupKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3909:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3910:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3910:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3911:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup9610); 

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

            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleContributionGroup9627); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionGroupAccess().getIncludesKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3931:1: ( (otherlv_3= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3932:1: (otherlv_3= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3932:1: (otherlv_3= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3933:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionGroupRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup9647); 

            		newLeafNode(otherlv_3, grammarAccess.getContributionGroupAccess().getContribsContributionContextCrossReference_3_0()); 
            	

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3944:2: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==29) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3944:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleContributionGroup9660); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionGroupAccess().getCommaKeyword_4_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3948:1: ( (otherlv_5= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3949:1: (otherlv_5= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3949:1: (otherlv_5= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3950:3: otherlv_5= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionGroupRule());
            	    	        }
            	            
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionGroup9680); 

            	    		newLeafNode(otherlv_5, grammarAccess.getContributionGroupAccess().getContribsContributionContextCrossReference_4_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleContributionGroup9694); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3973:1: entryRuleContributionContext returns [EObject current=null] : iv_ruleContributionContext= ruleContributionContext EOF ;
    public final EObject entryRuleContributionContext() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionContext = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3974:2: (iv_ruleContributionContext= ruleContributionContext EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3975:2: iv_ruleContributionContext= ruleContributionContext EOF
            {
             newCompositeNode(grammarAccess.getContributionContextRule()); 
            pushFollow(FOLLOW_ruleContributionContext_in_entryRuleContributionContext9730);
            iv_ruleContributionContext=ruleContributionContext();

            state._fsp--;

             current =iv_ruleContributionContext; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionContext9740); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3982:1: ruleContributionContext returns [EObject current=null] : (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'changes' otherlv_8= '=' ( (lv_changes_9_0= ruleContributionChange ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleContributionContext() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_changes_9_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3985:28: ( (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'changes' otherlv_8= '=' ( (lv_changes_9_0= ruleContributionChange ) ) )* otherlv_10= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3986:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'changes' otherlv_8= '=' ( (lv_changes_9_0= ruleContributionChange ) ) )* otherlv_10= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3986:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'changes' otherlv_8= '=' ( (lv_changes_9_0= ruleContributionChange ) ) )* otherlv_10= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3986:3: otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_6= '{' (otherlv_7= 'changes' otherlv_8= '=' ( (lv_changes_9_0= ruleContributionChange ) ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleContributionContext9777); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionContextAccess().getContributionKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3990:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3991:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3991:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3992:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionContext9794); 

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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4008:2: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==38) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4008:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) ) (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleContributionContext9812); 

                        	newLeafNode(otherlv_2, grammarAccess.getContributionContextAccess().getExtendsKeyword_2_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4012:1: ( ( ruleQualifiedName ) )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4013:1: ( ruleQualifiedName )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4013:1: ( ruleQualifiedName )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4014:3: ruleQualifiedName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getContributionContextRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getContributionContextAccess().getSuperContributionContextsContributionContextCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionContext9835);
                    ruleQualifiedName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4027:2: (otherlv_4= ',' ( ( ruleQualifiedName ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==29) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4027:4: otherlv_4= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleContributionContext9848); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getContributionContextAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4031:1: ( ( ruleQualifiedName ) )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4032:1: ( ruleQualifiedName )
                    	    {
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4032:1: ( ruleQualifiedName )
                    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4033:3: ruleQualifiedName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getContributionContextRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getContributionContextAccess().getSuperContributionContextsContributionContextCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionContext9871);
                    	    ruleQualifiedName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleContributionContext9887); 

                	newLeafNode(otherlv_6, grammarAccess.getContributionContextAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4050:1: (otherlv_7= 'changes' otherlv_8= '=' ( (lv_changes_9_0= ruleContributionChange ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==45) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4050:3: otherlv_7= 'changes' otherlv_8= '=' ( (lv_changes_9_0= ruleContributionChange ) )
            	    {
            	    otherlv_7=(Token)match(input,45,FOLLOW_45_in_ruleContributionContext9900); 

            	        	newLeafNode(otherlv_7, grammarAccess.getContributionContextAccess().getChangesKeyword_4_0());
            	        
            	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleContributionContext9912); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionContextAccess().getEqualsSignKeyword_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4058:1: ( (lv_changes_9_0= ruleContributionChange ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4059:1: (lv_changes_9_0= ruleContributionChange )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4059:1: (lv_changes_9_0= ruleContributionChange )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4060:3: lv_changes_9_0= ruleContributionChange
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionContextAccess().getChangesContributionChangeParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionChange_in_ruleContributionContext9933);
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
            	    break loop57;
                }
            } while (true);

            otherlv_10=(Token)match(input,15,FOLLOW_15_in_ruleContributionContext9947); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4088:1: entryRuleContributionChange returns [EObject current=null] : iv_ruleContributionChange= ruleContributionChange EOF ;
    public final EObject entryRuleContributionChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionChange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4089:2: (iv_ruleContributionChange= ruleContributionChange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4090:2: iv_ruleContributionChange= ruleContributionChange EOF
            {
             newCompositeNode(grammarAccess.getContributionChangeRule()); 
            pushFollow(FOLLOW_ruleContributionChange_in_entryRuleContributionChange9983);
            iv_ruleContributionChange=ruleContributionChange();

            state._fsp--;

             current =iv_ruleContributionChange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionChange9993); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4097:1: ruleContributionChange returns [EObject current=null] : (otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' ) ;
    public final EObject ruleContributionChange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_newQuantitativeContribution_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Enumerator lv_newContribution_7_0 = null;

        EObject lv_contribRange_15_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4100:28: ( (otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4101:1: (otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4101:1: (otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4101:3: otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'extends' otherlv_3= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) ) )* ) ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleContributionChange10030); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionChangeAccess().getContributionChangeKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4105:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4106:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4106:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4107:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionChange10047); 

            			newLeafNode(lv_name_1_0, grammarAccess.getContributionChangeAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionChangeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleContributionChange10064); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionChangeAccess().getExtendsKeyword_2());
                
            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleContributionChange10076); 

                	newLeafNode(otherlv_3, grammarAccess.getContributionChangeAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4131:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4133:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4133:1: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4134:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4137:2: ( ( ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4138:3: ( ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4138:3: ( ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) ) )*
            loop58:
            do {
                int alt58=4;
                int LA58_0 = input.LA(1);

                if ( LA58_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4(), 0) ) {
                    alt58=1;
                }
                else if ( LA58_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4(), 1) ) {
                    alt58=2;
                }
                else if ( LA58_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4(), 2) ) {
                    alt58=3;
                }


                switch (alt58) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4140:4: ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4140:4: ({...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4141:5: {...}? => ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4141:115: ( ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4142:6: ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4145:6: ({...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4145:7: {...}? => (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4145:16: (otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4145:18: otherlv_5= 'newContribution' otherlv_6= '=' ( (lv_newContribution_7_0= ruleContributionType ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleContributionChange10134); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContributionChangeAccess().getNewContributionKeyword_4_0_0());
            	        
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleContributionChange10146); 

            	        	newLeafNode(otherlv_6, grammarAccess.getContributionChangeAccess().getEqualsSignKeyword_4_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4153:1: ( (lv_newContribution_7_0= ruleContributionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4154:1: (lv_newContribution_7_0= ruleContributionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4154:1: (lv_newContribution_7_0= ruleContributionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4155:3: lv_newContribution_7_0= ruleContributionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getNewContributionContributionTypeEnumRuleCall_4_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionType_in_ruleContributionChange10167);
            	    lv_newContribution_7_0=ruleContributionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContributionChangeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"newContribution",
            	            		lv_newContribution_7_0, 
            	            		"ContributionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleContributionChange10179); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionChangeAccess().getSemicolonKeyword_4_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4182:4: ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4182:4: ({...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4183:5: {...}? => ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4183:115: ( ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4184:6: ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4187:6: ({...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4187:7: {...}? => (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4187:16: (otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4187:18: otherlv_9= 'newQuantitativeContribution' otherlv_10= '=' ( (lv_newQuantitativeContribution_11_0= RULE_INT ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleContributionChange10247); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContributionChangeAccess().getNewQuantitativeContributionKeyword_4_1_0());
            	        
            	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleContributionChange10259); 

            	        	newLeafNode(otherlv_10, grammarAccess.getContributionChangeAccess().getEqualsSignKeyword_4_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4195:1: ( (lv_newQuantitativeContribution_11_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4196:1: (lv_newQuantitativeContribution_11_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4196:1: (lv_newQuantitativeContribution_11_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4197:3: lv_newQuantitativeContribution_11_0= RULE_INT
            	    {
            	    lv_newQuantitativeContribution_11_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionChange10276); 

            	    			newLeafNode(lv_newQuantitativeContribution_11_0, grammarAccess.getContributionChangeAccess().getNewQuantitativeContributionINTTerminalRuleCall_4_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionChangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"newQuantitativeContribution",
            	            		lv_newQuantitativeContribution_11_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleContributionChange10293); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContributionChangeAccess().getSemicolonKeyword_4_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4224:4: ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4224:4: ({...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4225:5: {...}? => ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4225:115: ( ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4226:6: ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4229:6: ({...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4229:7: {...}? => (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4229:16: (otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4229:18: otherlv_13= 'contribRange' otherlv_14= '=' ( (lv_contribRange_15_0= ruleContributionRange ) ) otherlv_16= ';'
            	    {
            	    otherlv_13=(Token)match(input,49,FOLLOW_49_in_ruleContributionChange10361); 

            	        	newLeafNode(otherlv_13, grammarAccess.getContributionChangeAccess().getContribRangeKeyword_4_2_0());
            	        
            	    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleContributionChange10373); 

            	        	newLeafNode(otherlv_14, grammarAccess.getContributionChangeAccess().getEqualsSignKeyword_4_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4237:1: ( (lv_contribRange_15_0= ruleContributionRange ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4238:1: (lv_contribRange_15_0= ruleContributionRange )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4238:1: (lv_contribRange_15_0= ruleContributionRange )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4239:3: lv_contribRange_15_0= ruleContributionRange
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getContribRangeContributionRangeParserRuleCall_4_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionRange_in_ruleContributionChange10394);
            	    lv_contribRange_15_0=ruleContributionRange();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContributionChangeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"contribRange",
            	            		lv_contribRange_15_0, 
            	            		"ContributionRange");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleContributionChange10406); 

            	        	newLeafNode(otherlv_16, grammarAccess.getContributionChangeAccess().getSemicolonKeyword_4_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContributionChangeAccess().getUnorderedGroup_4());
            	

            }

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleContributionChange10459); 

                	newLeafNode(otherlv_17, grammarAccess.getContributionChangeAccess().getRightCurlyBracketKeyword_5());
                

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4285:1: entryRuleContributionRange returns [EObject current=null] : iv_ruleContributionRange= ruleContributionRange EOF ;
    public final EObject entryRuleContributionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4286:2: (iv_ruleContributionRange= ruleContributionRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4287:2: iv_ruleContributionRange= ruleContributionRange EOF
            {
             newCompositeNode(grammarAccess.getContributionRangeRule()); 
            pushFollow(FOLLOW_ruleContributionRange_in_entryRuleContributionRange10495);
            iv_ruleContributionRange=ruleContributionRange();

            state._fsp--;

             current =iv_ruleContributionRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionRange10505); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4294:1: ruleContributionRange returns [EObject current=null] : (otherlv_0= 'contributionRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleContributionRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_start_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_end_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_step_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4297:28: ( (otherlv_0= 'contributionRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4298:1: (otherlv_0= 'contributionRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4298:1: (otherlv_0= 'contributionRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4298:3: otherlv_0= 'contributionRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleContributionRange10542); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionRangeAccess().getContributionRangeKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleContributionRange10554); 

                	newLeafNode(otherlv_1, grammarAccess.getContributionRangeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4306:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4308:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4308:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4309:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4312:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4313:3: ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4313:3: ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )*
            loop59:
            do {
                int alt59=4;
                int LA59_0 = input.LA(1);

                if ( LA59_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 0) ) {
                    alt59=1;
                }
                else if ( LA59_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 1) ) {
                    alt59=2;
                }
                else if ( LA59_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 2) ) {
                    alt59=3;
                }


                switch (alt59) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4315:4: ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4315:4: ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4316:5: {...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4316:114: ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4317:6: ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4320:6: ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4320:7: {...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4320:16: (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4320:18: otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';'
            	    {
            	    otherlv_3=(Token)match(input,40,FOLLOW_40_in_ruleContributionRange10612); 

            	        	newLeafNode(otherlv_3, grammarAccess.getContributionRangeAccess().getStartKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange10624); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4328:1: ( (lv_start_5_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4329:1: (lv_start_5_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4329:1: (lv_start_5_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4330:3: lv_start_5_0= RULE_INT
            	    {
            	    lv_start_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange10641); 

            	    			newLeafNode(lv_start_5_0, grammarAccess.getContributionRangeAccess().getStartINTTerminalRuleCall_2_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"start",
            	            		lv_start_5_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange10658); 

            	        	newLeafNode(otherlv_6, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_2_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4357:4: ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4357:4: ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4358:5: {...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4358:114: ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4359:6: ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4362:6: ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4362:7: {...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4362:16: (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4362:18: otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleContributionRange10726); 

            	        	newLeafNode(otherlv_7, grammarAccess.getContributionRangeAccess().getEndKeyword_2_1_0());
            	        
            	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange10738); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4370:1: ( (lv_end_9_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4371:1: (lv_end_9_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4371:1: (lv_end_9_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4372:3: lv_end_9_0= RULE_INT
            	    {
            	    lv_end_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange10755); 

            	    			newLeafNode(lv_end_9_0, grammarAccess.getContributionRangeAccess().getEndINTTerminalRuleCall_2_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"end",
            	            		lv_end_9_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange10772); 

            	        	newLeafNode(otherlv_10, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_2_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4399:4: ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4399:4: ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4400:5: {...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4400:114: ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4401:6: ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4404:6: ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4404:7: {...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4404:16: (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4404:18: otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';'
            	    {
            	    otherlv_11=(Token)match(input,42,FOLLOW_42_in_ruleContributionRange10840); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContributionRangeAccess().getStepKeyword_2_2_0());
            	        
            	    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange10852); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4412:1: ( (lv_step_13_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4413:1: (lv_step_13_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4413:1: (lv_step_13_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4414:3: lv_step_13_0= RULE_INT
            	    {
            	    lv_step_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange10869); 

            	    			newLeafNode(lv_step_13_0, grammarAccess.getContributionRangeAccess().getStepINTTerminalRuleCall_2_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionRangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"step",
            	            		lv_step_13_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange10886); 

            	        	newLeafNode(otherlv_14, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_2_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2());
            	

            }

            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleContributionRange10939); 

                	newLeafNode(otherlv_15, grammarAccess.getContributionRangeAccess().getRightCurlyBracketKeyword_3());
                

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


    // $ANTLR start "entryRuleKPIEvalValueSet"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4460:1: entryRuleKPIEvalValueSet returns [EObject current=null] : iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF ;
    public final EObject entryRuleKPIEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4461:2: (iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4462:2: iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet10975);
            iv_ruleKPIEvalValueSet=ruleKPIEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIEvalValueSet10985); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4469:1: ruleKPIEvalValueSet returns [EObject current=null] : (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet ) ;
    public final EObject ruleKPIEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject this_KPIQuantitativeEvalValueSet_0 = null;

        EObject this_KPIQualitativeEvalValueSet_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4472:28: ( (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4473:1: (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4473:1: (this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet | this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=51 && LA60_0<=55)) ) {
                alt60=1;
            }
            else if ( (LA60_0==56) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4474:5: this_KPIQuantitativeEvalValueSet_0= ruleKPIQuantitativeEvalValueSet
                    {
                     
                            newCompositeNode(grammarAccess.getKPIEvalValueSetAccess().getKPIQuantitativeEvalValueSetParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleKPIQuantitativeEvalValueSet_in_ruleKPIEvalValueSet11032);
                    this_KPIQuantitativeEvalValueSet_0=ruleKPIQuantitativeEvalValueSet();

                    state._fsp--;

                     
                            current = this_KPIQuantitativeEvalValueSet_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4484:5: this_KPIQualitativeEvalValueSet_1= ruleKPIQualitativeEvalValueSet
                    {
                     
                            newCompositeNode(grammarAccess.getKPIEvalValueSetAccess().getKPIQualitativeEvalValueSetParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleKPIQualitativeEvalValueSet_in_ruleKPIEvalValueSet11059);
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4500:1: entryRuleKPIQuantitativeEvalValueSet returns [EObject current=null] : iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF ;
    public final EObject entryRuleKPIQuantitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIQuantitativeEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4501:2: (iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4502:2: iv_ruleKPIQuantitativeEvalValueSet= ruleKPIQuantitativeEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIQuantitativeEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIQuantitativeEvalValueSet_in_entryRuleKPIQuantitativeEvalValueSet11094);
            iv_ruleKPIQuantitativeEvalValueSet=ruleKPIQuantitativeEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIQuantitativeEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIQuantitativeEvalValueSet11104); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4509:1: ruleKPIQuantitativeEvalValueSet returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4512:28: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4513:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4513:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4515:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4515:1: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4516:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4519:2: ( ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4520:3: ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4520:3: ( ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) ) )+
            int cnt61=0;
            loop61:
            do {
                int alt61=6;
                int LA61_0 = input.LA(1);

                if ( LA61_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0) ) {
                    alt61=1;
                }
                else if ( LA61_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1) ) {
                    alt61=2;
                }
                else if ( LA61_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2) ) {
                    alt61=3;
                }
                else if ( LA61_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3) ) {
                    alt61=4;
                }
                else if ( LA61_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4) ) {
                    alt61=5;
                }


                switch (alt61) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4522:4: ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4522:4: ({...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4523:5: {...}? => ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4523:122: ( ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4524:6: ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4527:6: ({...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4527:7: {...}? => (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4527:16: (otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4527:18: otherlv_1= 'target' otherlv_2= '=' ( (lv_targetValue_3_0= RULE_DOUBLE ) ) otherlv_4= ';'
            	    {
            	    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleKPIQuantitativeEvalValueSet11186); 

            	        	newLeafNode(otherlv_1, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getTargetKeyword_0_0());
            	        
            	    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet11198); 

            	        	newLeafNode(otherlv_2, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4535:1: ( (lv_targetValue_3_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4536:1: (lv_targetValue_3_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4536:1: (lv_targetValue_3_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4537:3: lv_targetValue_3_0= RULE_DOUBLE
            	    {
            	    lv_targetValue_3_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet11215); 

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

            	    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet11232); 

            	        	newLeafNode(otherlv_4, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4564:4: ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4564:4: ({...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4565:5: {...}? => ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4565:122: ( ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4566:6: ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4569:6: ({...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4569:7: {...}? => (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4569:16: (otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4569:18: otherlv_5= 'threshold' otherlv_6= '=' ( (lv_thresholdValue_7_0= RULE_DOUBLE ) ) otherlv_8= ';'
            	    {
            	    otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleKPIQuantitativeEvalValueSet11300); 

            	        	newLeafNode(otherlv_5, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getThresholdKeyword_1_0());
            	        
            	    otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet11312); 

            	        	newLeafNode(otherlv_6, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4577:1: ( (lv_thresholdValue_7_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4578:1: (lv_thresholdValue_7_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4578:1: (lv_thresholdValue_7_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4579:3: lv_thresholdValue_7_0= RULE_DOUBLE
            	    {
            	    lv_thresholdValue_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet11329); 

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

            	    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet11346); 

            	        	newLeafNode(otherlv_8, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4606:4: ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4606:4: ({...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4607:5: {...}? => ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4607:122: ( ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4608:6: ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4611:6: ({...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4611:7: {...}? => (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4611:16: (otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4611:18: otherlv_9= 'worst' otherlv_10= '=' ( (lv_worstValue_11_0= RULE_DOUBLE ) ) otherlv_12= ';'
            	    {
            	    otherlv_9=(Token)match(input,53,FOLLOW_53_in_ruleKPIQuantitativeEvalValueSet11414); 

            	        	newLeafNode(otherlv_9, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getWorstKeyword_2_0());
            	        
            	    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet11426); 

            	        	newLeafNode(otherlv_10, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4619:1: ( (lv_worstValue_11_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4620:1: (lv_worstValue_11_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4620:1: (lv_worstValue_11_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4621:3: lv_worstValue_11_0= RULE_DOUBLE
            	    {
            	    lv_worstValue_11_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet11443); 

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

            	    otherlv_12=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet11460); 

            	        	newLeafNode(otherlv_12, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4648:4: ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4648:4: ({...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4649:5: {...}? => ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4649:122: ( ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4650:6: ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4653:6: ({...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4653:7: {...}? => (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4653:16: (otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4653:18: otherlv_13= 'eval' otherlv_14= '=' ( (lv_evaluationValue_15_0= RULE_DOUBLE ) ) otherlv_16= ';'
            	    {
            	    otherlv_13=(Token)match(input,54,FOLLOW_54_in_ruleKPIQuantitativeEvalValueSet11528); 

            	        	newLeafNode(otherlv_13, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEvalKeyword_3_0());
            	        
            	    otherlv_14=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet11540); 

            	        	newLeafNode(otherlv_14, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4661:1: ( (lv_evaluationValue_15_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4662:1: (lv_evaluationValue_15_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4662:1: (lv_evaluationValue_15_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4663:3: lv_evaluationValue_15_0= RULE_DOUBLE
            	    {
            	    lv_evaluationValue_15_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet11557); 

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

            	    otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet11574); 

            	        	newLeafNode(otherlv_16, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4690:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4690:4: ({...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4691:5: {...}? => ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4691:122: ( ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4692:6: ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4695:6: ({...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4695:7: {...}? => (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIQuantitativeEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4695:16: (otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4695:18: otherlv_17= 'unit' otherlv_18= '=' ( (lv_unit_19_0= RULE_STRING ) ) otherlv_20= ';'
            	    {
            	    otherlv_17=(Token)match(input,55,FOLLOW_55_in_ruleKPIQuantitativeEvalValueSet11642); 

            	        	newLeafNode(otherlv_17, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnitKeyword_4_0());
            	        
            	    otherlv_18=(Token)match(input,18,FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet11654); 

            	        	newLeafNode(otherlv_18, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getEqualsSignKeyword_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4703:1: ( (lv_unit_19_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4704:1: (lv_unit_19_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4704:1: (lv_unit_19_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4705:3: lv_unit_19_0= RULE_STRING
            	    {
            	    lv_unit_19_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKPIQuantitativeEvalValueSet11671); 

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

            	    otherlv_20=(Token)match(input,19,FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet11688); 

            	        	newLeafNode(otherlv_20, grammarAccess.getKPIQuantitativeEvalValueSetAccess().getSemicolonKeyword_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIQuantitativeEvalValueSetAccess().getUnorderedGroup());
            	    	 				

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4748:1: entryRuleKPIQualitativeEvalValueSet returns [EObject current=null] : iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF ;
    public final EObject entryRuleKPIQualitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIQualitativeEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4749:2: (iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4750:2: iv_ruleKPIQualitativeEvalValueSet= ruleKPIQualitativeEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIQualitativeEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIQualitativeEvalValueSet_in_entryRuleKPIQualitativeEvalValueSet11770);
            iv_ruleKPIQualitativeEvalValueSet=ruleKPIQualitativeEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIQualitativeEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIQualitativeEvalValueSet11780); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4757:1: ruleKPIQualitativeEvalValueSet returns [EObject current=null] : (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleKPIQualitativeEvalValueSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4760:28: ( (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4761:1: (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4761:1: (otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4761:3: otherlv_0= 'qualeval' otherlv_1= '=' ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleKPIQualitativeEvalValueSet11817); 

                	newLeafNode(otherlv_0, grammarAccess.getKPIQualitativeEvalValueSetAccess().getQualevalKeyword_0());
                
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleKPIQualitativeEvalValueSet11829); 

                	newLeafNode(otherlv_1, grammarAccess.getKPIQualitativeEvalValueSetAccess().getEqualsSignKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4769:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4770:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4770:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4771:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getKPIQualitativeEvalValueSetRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getKPIQualitativeEvalValueSetAccess().getQualitativeEvaluationValueMappingCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleKPIQualitativeEvalValueSet11852);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleKPIQualitativeEvalValueSet11864); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4796:1: entryRuleQualitativeMapping returns [EObject current=null] : iv_ruleQualitativeMapping= ruleQualitativeMapping EOF ;
    public final EObject entryRuleQualitativeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeMapping = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4797:2: (iv_ruleQualitativeMapping= ruleQualitativeMapping EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4798:2: iv_ruleQualitativeMapping= ruleQualitativeMapping EOF
            {
             newCompositeNode(grammarAccess.getQualitativeMappingRule()); 
            pushFollow(FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping11900);
            iv_ruleQualitativeMapping=ruleQualitativeMapping();

            state._fsp--;

             current =iv_ruleQualitativeMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitativeMapping11910); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4805:1: ruleQualitativeMapping returns [EObject current=null] : (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappin_3_0= ruleMapping ) )* otherlv_4= '}' ) ;
    public final EObject ruleQualitativeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_mappin_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4808:28: ( (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappin_3_0= ruleMapping ) )* otherlv_4= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4809:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappin_3_0= ruleMapping ) )* otherlv_4= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4809:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappin_3_0= ruleMapping ) )* otherlv_4= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4809:3: otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_mappin_3_0= ruleMapping ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleQualitativeMapping11947); 

                	newLeafNode(otherlv_0, grammarAccess.getQualitativeMappingAccess().getQualitativeMappingKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4813:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4814:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4814:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4815:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeMapping11964); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleQualitativeMapping11981); 

                	newLeafNode(otherlv_2, grammarAccess.getQualitativeMappingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4835:1: ( (lv_mappin_3_0= ruleMapping ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_STRING) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4836:1: (lv_mappin_3_0= ruleMapping )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4836:1: (lv_mappin_3_0= ruleMapping )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4837:3: lv_mappin_3_0= ruleMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQualitativeMappingAccess().getMappinMappingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMapping_in_ruleQualitativeMapping12002);
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
            	    break loop62;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleQualitativeMapping12015); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4865:1: entryRuleMapping returns [EObject current=null] : iv_ruleMapping= ruleMapping EOF ;
    public final EObject entryRuleMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapping = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4866:2: (iv_ruleMapping= ruleMapping EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4867:2: iv_ruleMapping= ruleMapping EOF
            {
             newCompositeNode(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_ruleMapping_in_entryRuleMapping12051);
            iv_ruleMapping=ruleMapping();

            state._fsp--;

             current =iv_ruleMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMapping12061); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4874:1: ruleMapping returns [EObject current=null] : ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4877:28: ( ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4878:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4878:1: ( ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4878:2: ( (lv_name_0_0= RULE_STRING ) ) otherlv_1= ',' ( (lv_valuation_2_0= RULE_INT ) ) otherlv_3= ',' ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) ) otherlv_5= ',' ( (lv_exceeds_6_0= RULE_BOOLEAN ) ) otherlv_7= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4878:2: ( (lv_name_0_0= RULE_STRING ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4879:1: (lv_name_0_0= RULE_STRING )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4879:1: (lv_name_0_0= RULE_STRING )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4880:3: lv_name_0_0= RULE_STRING
            {
            lv_name_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMapping12103); 

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

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleMapping12120); 

                	newLeafNode(otherlv_1, grammarAccess.getMappingAccess().getCommaKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4900:1: ( (lv_valuation_2_0= RULE_INT ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4901:1: (lv_valuation_2_0= RULE_INT )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4901:1: (lv_valuation_2_0= RULE_INT )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4902:3: lv_valuation_2_0= RULE_INT
            {
            lv_valuation_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMapping12137); 

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

            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleMapping12154); 

                	newLeafNode(otherlv_3, grammarAccess.getMappingAccess().getCommaKeyword_3());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4922:1: ( (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4923:1: (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4923:1: (lv_qualitativeEvaluation_4_0= ruleQualitativeLabel )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4924:3: lv_qualitativeEvaluation_4_0= ruleQualitativeLabel
            {
             
            	        newCompositeNode(grammarAccess.getMappingAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleMapping12175);
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

            otherlv_5=(Token)match(input,29,FOLLOW_29_in_ruleMapping12187); 

                	newLeafNode(otherlv_5, grammarAccess.getMappingAccess().getCommaKeyword_5());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4944:1: ( (lv_exceeds_6_0= RULE_BOOLEAN ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4945:1: (lv_exceeds_6_0= RULE_BOOLEAN )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4945:1: (lv_exceeds_6_0= RULE_BOOLEAN )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4946:3: lv_exceeds_6_0= RULE_BOOLEAN
            {
            lv_exceeds_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleMapping12204); 

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

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleMapping12221); 

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


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4986:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4987:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4988:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12270);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName12281); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4995:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4998:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4999:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4999:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4999:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12321); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5006:1: (kw= '.' this_ID_2= RULE_ID )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==58) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5007:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,58,FOLLOW_58_in_ruleQualifiedName12340); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12355); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop63;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5027:1: ruleImportanceType returns [Enumerator current=null] : ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) ;
    public final Enumerator ruleImportanceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5029:28: ( ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5030:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5030:1: ( (enumLiteral_0= 'none' ) | (enumLiteral_1= 'high' ) | (enumLiteral_2= 'medium' ) | (enumLiteral_3= 'low' ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt64=1;
                }
                break;
            case 60:
                {
                alt64=2;
                }
                break;
            case 61:
                {
                alt64=3;
                }
                break;
            case 62:
                {
                alt64=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5030:2: (enumLiteral_0= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5030:2: (enumLiteral_0= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5030:4: enumLiteral_0= 'none'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_59_in_ruleImportanceType12416); 

                            current = grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5036:6: (enumLiteral_1= 'high' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5036:6: (enumLiteral_1= 'high' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5036:8: enumLiteral_1= 'high'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_60_in_ruleImportanceType12433); 

                            current = grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5042:6: (enumLiteral_2= 'medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5042:6: (enumLiteral_2= 'medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5042:8: enumLiteral_2= 'medium'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_61_in_ruleImportanceType12450); 

                            current = grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5048:6: (enumLiteral_3= 'low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5048:6: (enumLiteral_3= 'low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5048:8: enumLiteral_3= 'low'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_62_in_ruleImportanceType12467); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5058:1: ruleDecompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) ;
    public final Enumerator ruleDecompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5060:28: ( ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5061:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5061:1: ( (enumLiteral_0= 'and' ) | (enumLiteral_1= 'or' ) | (enumLiteral_2= 'xor' ) )
            int alt65=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt65=1;
                }
                break;
            case 64:
                {
                alt65=2;
                }
                break;
            case 65:
                {
                alt65=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5061:2: (enumLiteral_0= 'and' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5061:2: (enumLiteral_0= 'and' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5061:4: enumLiteral_0= 'and'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_63_in_ruleDecompositionType12512); 

                            current = grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5067:6: (enumLiteral_1= 'or' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5067:6: (enumLiteral_1= 'or' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5067:8: enumLiteral_1= 'or'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleDecompositionType12529); 

                            current = grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5073:6: (enumLiteral_2= 'xor' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5073:6: (enumLiteral_2= 'xor' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5073:8: enumLiteral_2= 'xor'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_65_in_ruleDecompositionType12546); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5083:1: ruleContributionType returns [Enumerator current=null] : ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5085:28: ( ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5086:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5086:1: ( (enumLiteral_0= 'help' ) | (enumLiteral_1= 'make' ) | (enumLiteral_2= 'somePositive' ) | (enumLiteral_3= 'unknown' ) | (enumLiteral_4= 'someNegative' ) | (enumLiteral_5= 'hurt' ) | (enumLiteral_6= 'break' ) )
            int alt66=7;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt66=1;
                }
                break;
            case 67:
                {
                alt66=2;
                }
                break;
            case 68:
                {
                alt66=3;
                }
                break;
            case 69:
                {
                alt66=4;
                }
                break;
            case 70:
                {
                alt66=5;
                }
                break;
            case 71:
                {
                alt66=6;
                }
                break;
            case 72:
                {
                alt66=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5086:2: (enumLiteral_0= 'help' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5086:2: (enumLiteral_0= 'help' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5086:4: enumLiteral_0= 'help'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_66_in_ruleContributionType12591); 

                            current = grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5092:6: (enumLiteral_1= 'make' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5092:6: (enumLiteral_1= 'make' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5092:8: enumLiteral_1= 'make'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_67_in_ruleContributionType12608); 

                            current = grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5098:6: (enumLiteral_2= 'somePositive' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5098:6: (enumLiteral_2= 'somePositive' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5098:8: enumLiteral_2= 'somePositive'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_68_in_ruleContributionType12625); 

                            current = grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5104:6: (enumLiteral_3= 'unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5104:6: (enumLiteral_3= 'unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5104:8: enumLiteral_3= 'unknown'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_69_in_ruleContributionType12642); 

                            current = grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5110:6: (enumLiteral_4= 'someNegative' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5110:6: (enumLiteral_4= 'someNegative' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5110:8: enumLiteral_4= 'someNegative'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_70_in_ruleContributionType12659); 

                            current = grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5116:6: (enumLiteral_5= 'hurt' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5116:6: (enumLiteral_5= 'hurt' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5116:8: enumLiteral_5= 'hurt'
                    {
                    enumLiteral_5=(Token)match(input,71,FOLLOW_71_in_ruleContributionType12676); 

                            current = grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5122:6: (enumLiteral_6= 'break' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5122:6: (enumLiteral_6= 'break' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5122:8: enumLiteral_6= 'break'
                    {
                    enumLiteral_6=(Token)match(input,72,FOLLOW_72_in_ruleContributionType12693); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5132:1: ruleQualitativeLabel returns [Enumerator current=null] : ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5134:28: ( ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5135:1: ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5135:1: ( (enumLiteral_0= 'denied' ) | (enumLiteral_1= 'weaklyDenied' ) | (enumLiteral_2= 'weaklySatisfied' ) | (enumLiteral_3= 'satisfied' ) | (enumLiteral_4= 'conflict' ) | (enumLiteral_5= 'unknown' ) | (enumLiteral_6= 'none' ) )
            int alt67=7;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt67=1;
                }
                break;
            case 74:
                {
                alt67=2;
                }
                break;
            case 75:
                {
                alt67=3;
                }
                break;
            case 76:
                {
                alt67=4;
                }
                break;
            case 77:
                {
                alt67=5;
                }
                break;
            case 69:
                {
                alt67=6;
                }
                break;
            case 59:
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5135:2: (enumLiteral_0= 'denied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5135:2: (enumLiteral_0= 'denied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5135:4: enumLiteral_0= 'denied'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_73_in_ruleQualitativeLabel12738); 

                            current = grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5141:6: (enumLiteral_1= 'weaklyDenied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5141:6: (enumLiteral_1= 'weaklyDenied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5141:8: enumLiteral_1= 'weaklyDenied'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_74_in_ruleQualitativeLabel12755); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5147:6: (enumLiteral_2= 'weaklySatisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5147:6: (enumLiteral_2= 'weaklySatisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5147:8: enumLiteral_2= 'weaklySatisfied'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_75_in_ruleQualitativeLabel12772); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5153:6: (enumLiteral_3= 'satisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5153:6: (enumLiteral_3= 'satisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5153:8: enumLiteral_3= 'satisfied'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_76_in_ruleQualitativeLabel12789); 

                            current = grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5159:6: (enumLiteral_4= 'conflict' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5159:6: (enumLiteral_4= 'conflict' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5159:8: enumLiteral_4= 'conflict'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_77_in_ruleQualitativeLabel12806); 

                            current = grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5165:6: (enumLiteral_5= 'unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5165:6: (enumLiteral_5= 'unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5165:8: enumLiteral_5= 'unknown'
                    {
                    enumLiteral_5=(Token)match(input,69,FOLLOW_69_in_ruleQualitativeLabel12823); 

                            current = grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5171:6: (enumLiteral_6= 'none' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5171:6: (enumLiteral_6= 'none' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5171:8: enumLiteral_6= 'none'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_59_in_ruleQualitativeLabel12840); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5181:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5183:28: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5184:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5184:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) )
            int alt68=16;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt68=1;
                }
                break;
            case 79:
                {
                alt68=2;
                }
                break;
            case 80:
                {
                alt68=3;
                }
                break;
            case 81:
                {
                alt68=4;
                }
                break;
            case 82:
                {
                alt68=5;
                }
                break;
            case 83:
                {
                alt68=6;
                }
                break;
            case 84:
                {
                alt68=7;
                }
                break;
            case 85:
                {
                alt68=8;
                }
                break;
            case 86:
                {
                alt68=9;
                }
                break;
            case 87:
                {
                alt68=10;
                }
                break;
            case 88:
                {
                alt68=11;
                }
                break;
            case 89:
                {
                alt68=12;
                }
                break;
            case 90:
                {
                alt68=13;
                }
                break;
            case 91:
                {
                alt68=14;
                }
                break;
            case 92:
                {
                alt68=15;
                }
                break;
            case 93:
                {
                alt68=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5184:2: (enumLiteral_0= 'white' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5184:2: (enumLiteral_0= 'white' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5184:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_78_in_ruleColor12885); 

                            current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5190:6: (enumLiteral_1= 'black' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5190:6: (enumLiteral_1= 'black' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5190:8: enumLiteral_1= 'black'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_79_in_ruleColor12902); 

                            current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5196:6: (enumLiteral_2= 'blue' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5196:6: (enumLiteral_2= 'blue' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5196:8: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_80_in_ruleColor12919); 

                            current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5202:6: (enumLiteral_3= 'green' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5202:6: (enumLiteral_3= 'green' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5202:8: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,81,FOLLOW_81_in_ruleColor12936); 

                            current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5208:6: (enumLiteral_4= 'cyan' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5208:6: (enumLiteral_4= 'cyan' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5208:8: enumLiteral_4= 'cyan'
                    {
                    enumLiteral_4=(Token)match(input,82,FOLLOW_82_in_ruleColor12953); 

                            current = grammarAccess.getColorAccess().getCyanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getCyanEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5214:6: (enumLiteral_5= 'red' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5214:6: (enumLiteral_5= 'red' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5214:8: enumLiteral_5= 'red'
                    {
                    enumLiteral_5=(Token)match(input,83,FOLLOW_83_in_ruleColor12970); 

                            current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5220:6: (enumLiteral_6= 'purple' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5220:6: (enumLiteral_6= 'purple' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5220:8: enumLiteral_6= 'purple'
                    {
                    enumLiteral_6=(Token)match(input,84,FOLLOW_84_in_ruleColor12987); 

                            current = grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5226:6: (enumLiteral_7= 'yellow' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5226:6: (enumLiteral_7= 'yellow' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5226:8: enumLiteral_7= 'yellow'
                    {
                    enumLiteral_7=(Token)match(input,85,FOLLOW_85_in_ruleColor13004); 

                            current = grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5232:6: (enumLiteral_8= 'gray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5232:6: (enumLiteral_8= 'gray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5232:8: enumLiteral_8= 'gray'
                    {
                    enumLiteral_8=(Token)match(input,86,FOLLOW_86_in_ruleColor13021); 

                            current = grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5238:6: (enumLiteral_9= 'lightGray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5238:6: (enumLiteral_9= 'lightGray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5238:8: enumLiteral_9= 'lightGray'
                    {
                    enumLiteral_9=(Token)match(input,87,FOLLOW_87_in_ruleColor13038); 

                            current = grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5244:6: (enumLiteral_10= 'lightBlue' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5244:6: (enumLiteral_10= 'lightBlue' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5244:8: enumLiteral_10= 'lightBlue'
                    {
                    enumLiteral_10=(Token)match(input,88,FOLLOW_88_in_ruleColor13055); 

                            current = grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5250:6: (enumLiteral_11= 'lightGreen' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5250:6: (enumLiteral_11= 'lightGreen' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5250:8: enumLiteral_11= 'lightGreen'
                    {
                    enumLiteral_11=(Token)match(input,89,FOLLOW_89_in_ruleColor13072); 

                            current = grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5256:6: (enumLiteral_12= 'lightCray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5256:6: (enumLiteral_12= 'lightCray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5256:8: enumLiteral_12= 'lightCray'
                    {
                    enumLiteral_12=(Token)match(input,90,FOLLOW_90_in_ruleColor13089); 

                            current = grammarAccess.getColorAccess().getLightCrayEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getColorAccess().getLightCrayEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5262:6: (enumLiteral_13= 'lightRed' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5262:6: (enumLiteral_13= 'lightRed' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5262:8: enumLiteral_13= 'lightRed'
                    {
                    enumLiteral_13=(Token)match(input,91,FOLLOW_91_in_ruleColor13106); 

                            current = grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5268:6: (enumLiteral_14= 'lightPurple' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5268:6: (enumLiteral_14= 'lightPurple' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5268:8: enumLiteral_14= 'lightPurple'
                    {
                    enumLiteral_14=(Token)match(input,92,FOLLOW_92_in_ruleColor13123); 

                            current = grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5274:6: (enumLiteral_15= 'lightYellow' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5274:6: (enumLiteral_15= 'lightYellow' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5274:8: enumLiteral_15= 'lightYellow'
                    {
                    enumLiteral_15=(Token)match(input,93,FOLLOW_93_in_ruleColor13140); 

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


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA3_eotS =
        "\15\uffff";
    static final String DFA3_eofS =
        "\15\uffff";
    static final String DFA3_minS =
        "\1\4\1\uffff\1\4\6\uffff\1\4\2\uffff\1\4";
    static final String DFA3_maxS =
        "\1\71\1\uffff\1\72\6\uffff\1\4\2\uffff\1\72";
    static final String DFA3_acceptS =
        "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\7\1\10\1\11\1\uffff\1\6\1\2"+
        "\1\uffff";
    static final String DFA3_specialS =
        "\15\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\13\uffff\1\3\5\uffff\1\1\1\uffff\4\1\3\uffff\1\1\3\uffff"+
            "\1\4\1\uffff\1\5\5\uffff\1\6\1\7\14\uffff\1\10",
            "",
            "\1\13\15\uffff\1\12\15\uffff\1\13\1\uffff\1\13\27\uffff\1"+
            "\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\14",
            "",
            "",
            "\1\13\15\uffff\1\12\15\uffff\1\13\1\uffff\1\13\27\uffff\1"+
            "\11"
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
            return "172:1: (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor | this_StrategyGroup_3= ruleStrategyGroup | this_EvaluationStrategy_4= ruleEvaluationStrategy | this_Evaluation_5= ruleEvaluation | this_ContributionGroup_6= ruleContributionGroup | this_ContributionContext_7= ruleContributionContext | this_QualitativeMapping_8= ruleQualitativeMapping )";
        }
    }
    static final String DFA5_eotS =
        "\7\uffff";
    static final String DFA5_eofS =
        "\7\uffff";
    static final String DFA5_minS =
        "\3\4\3\uffff\1\4";
    static final String DFA5_maxS =
        "\1\4\1\72\1\4\3\uffff\1\72";
    static final String DFA5_acceptS =
        "\3\uffff\1\2\1\1\1\3\1\uffff";
    static final String DFA5_specialS =
        "\7\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\3\33\uffff\1\4\1\uffff\1\5\27\uffff\1\2",
            "\1\6",
            "",
            "",
            "",
            "\1\3\33\uffff\1\4\1\uffff\1\5\27\uffff\1\2"
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
            return "362:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency )";
        }
    }
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\4\1\uffff\7\0\1\uffff";
    static final String DFA11_maxS =
        "\1\76\1\uffff\7\0\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA11_specialS =
        "\2\uffff\1\4\1\5\1\6\1\1\1\3\1\2\1\0\1\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\10\1\uffff\1\1\10\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\2"+
            "\1\uffff\1\3\1\4\1\5\1\6\3\uffff\1\7\33\uffff\4\1",
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
            return "()+ loopback of 750:6: ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_5 = input.LA(1);

                         
                        int index11_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_5);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_6 = input.LA(1);

                         
                        int index11_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_6);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA29_eotS =
        "\12\uffff";
    static final String DFA29_eofS =
        "\12\uffff";
    static final String DFA29_minS =
        "\1\6\11\uffff";
    static final String DFA29_maxS =
        "\1\76\11\uffff";
    static final String DFA29_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA29_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\6\10\uffff\1\1\1\uffff\1\2\2\uffff\1\3\1\4\1\uffff\1\5\4"+
            "\uffff\1\7\1\uffff\1\10\1\uffff\3\11\30\uffff\4\6",
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

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "()* loopback of 2131:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiModelLinksDest' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'groups' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_35_0= ruleInLineElementLink ) ) )+ ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA29_0 = input.LA(1);

                         
                        int index29_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA29_0==15) ) {s = 1;}

                        else if ( LA29_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA29_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA29_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA29_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( (LA29_0==RULE_INT|| LA29_0 >=59 && LA29_0<=62) && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA29_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA29_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA29_0 >=32 && LA29_0<=34 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                         
                        input.seek(index29_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 29, _s, input);
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
    public static final BitSet FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntentionalElement632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_ruleIntentionalElement679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleIntentionalElement706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleIntentionalElement733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleIntentionalElement760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicator_in_ruleIntentionalElement787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_ruleIntentionalElement814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLink_in_entryRuleElementLink849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLink859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_ruleElementLink906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_ruleElementLink933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleElementLink960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_entryRuleInLineElementLink995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineElementLink1005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDecomposition_in_ruleInLineElementLink1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineContribution_in_ruleInLineElementLink1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDependency_in_ruleInLineElementLink1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRLSpecification_in_entryRuleGRLSpecification1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRLSpecification1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGRLSpecification1188 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGRLSpecification1205 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGRLSpecification1223 = new BitSet(new long[]{0x020018288F418010L});
    public static final BitSet FOLLOW_ruleGRLElement_in_ruleGRLSpecification1244 = new BitSet(new long[]{0x020018288F418010L});
    public static final BitSet FOLLOW_15_in_ruleGRLSpecification1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor1293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleActor1340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor1357 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActor1374 = new BitSet(new long[]{0x780000008F728050L});
    public static final BitSet FOLLOW_17_in_ruleActor1432 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1444 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1461 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1478 = new BitSet(new long[]{0x780000008F728050L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleActor1556 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActor1579 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1597 = new BitSet(new long[]{0x780000008F728050L});
    public static final BitSet FOLLOW_20_in_ruleActor1665 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1677 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1694 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1711 = new BitSet(new long[]{0x780000008F728050L});
    public static final BitSet FOLLOW_21_in_ruleActor1779 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1791 = new BitSet(new long[]{0x0000000000000000L,0x000000003FFFC000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleActor1812 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1824 = new BitSet(new long[]{0x780000008F728050L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleActor1901 = new BitSet(new long[]{0x780000008F728050L});
    public static final BitSet FOLLOW_ruleElementLink_in_ruleActor1928 = new BitSet(new long[]{0x780000008F728050L});
    public static final BitSet FOLLOW_15_in_ruleActor1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal2018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal2028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSoftgoal2065 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftgoal2082 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSoftgoal2099 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal2157 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2169 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal2186 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2203 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_20_in_ruleSoftgoal2271 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal2300 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2317 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_21_in_ruleSoftgoal2385 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2397 = new BitSet(new long[]{0x0000000000000000L,0x000000003FFFC000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleSoftgoal2418 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2430 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_23_in_ruleSoftgoal2498 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2510 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleSoftgoal2531 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2543 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleSoftgoal2621 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSoftgoal2644 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2662 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleSoftgoal2738 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_15_in_ruleSoftgoal2791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal2827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGoal2874 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal2891 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGoal2908 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_17_in_ruleGoal2966 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal2978 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal2995 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3012 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_20_in_ruleGoal3080 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3092 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal3109 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3126 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_21_in_ruleGoal3194 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3206 = new BitSet(new long[]{0x0000000000000000L,0x000000003FFFC000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleGoal3227 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3239 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_23_in_ruleGoal3307 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3319 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleGoal3340 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3352 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleGoal3430 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGoal3453 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3471 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleGoal3547 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_15_in_ruleGoal3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask3636 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask3646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTask3683 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask3700 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTask3717 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_17_in_ruleTask3775 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask3787 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask3804 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3821 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_20_in_ruleTask3889 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask3901 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask3918 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3935 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_21_in_ruleTask4003 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask4015 = new BitSet(new long[]{0x0000000000000000L,0x000000003FFFC000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleTask4036 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4048 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_23_in_ruleTask4116 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask4128 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleTask4149 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4161 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleTask4239 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTask4262 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4280 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleTask4356 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_15_in_ruleTask4409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource4445 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource4455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleResource4492 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource4509 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleResource4526 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_17_in_ruleResource4584 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4596 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource4613 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4630 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_20_in_ruleResource4698 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4710 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource4727 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4744 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_21_in_ruleResource4812 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4824 = new BitSet(new long[]{0x0000000000000000L,0x000000003FFFC000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleResource4845 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4857 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_23_in_ruleResource4925 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4937 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleResource4958 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4970 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleResource5048 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResource5071 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource5089 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleResource5165 = new BitSet(new long[]{0x7800000700B28040L});
    public static final BitSet FOLLOW_15_in_ruleResource5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicator_in_entryRuleIndicator5254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndicator5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleIndicator5301 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator5318 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIndicator5335 = new BitSet(new long[]{0x7800000750B28040L});
    public static final BitSet FOLLOW_17_in_ruleIndicator5393 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator5422 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5439 = new BitSet(new long[]{0x7800000750B28040L});
    public static final BitSet FOLLOW_20_in_ruleIndicator5507 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5519 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator5536 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5553 = new BitSet(new long[]{0x7800000750B28040L});
    public static final BitSet FOLLOW_21_in_ruleIndicator5621 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5633 = new BitSet(new long[]{0x0000000000000000L,0x000000003FFFC000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleIndicator5654 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5666 = new BitSet(new long[]{0x7800000750B28040L});
    public static final BitSet FOLLOW_23_in_ruleIndicator5734 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5746 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleIndicator5767 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5779 = new BitSet(new long[]{0x7800000750B28040L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleIndicator5857 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIndicator5880 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5898 = new BitSet(new long[]{0x7800000750B28040L});
    public static final BitSet FOLLOW_28_in_ruleIndicator5966 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator5998 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleIndicator6011 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator6031 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6045 = new BitSet(new long[]{0x7800000750B28040L});
    public static final BitSet FOLLOW_30_in_ruleIndicator6113 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator6125 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator6145 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleIndicator6158 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator6178 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6192 = new BitSet(new long[]{0x7800000750B28040L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleIndicator6268 = new BitSet(new long[]{0x7800000750B28040L});
    public static final BitSet FOLLOW_15_in_ruleIndicator6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief6357 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleBelief6404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBelief6421 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBelief6438 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_17_in_ruleBelief6496 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBelief6508 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelief6525 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBelief6542 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_20_in_ruleBelief6610 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelief6627 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBelief6644 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_15_in_ruleBelief6697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition6733 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition6743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecomposition6791 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleDecomposition6803 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleDecomposition6824 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleDecomposition6837 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleDecomposition6858 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleDecomposition6872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDecomposition_in_entryRuleInLineDecomposition6908 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineDecomposition6918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleInLineDecomposition6955 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition6976 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleInLineDecomposition6989 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition7010 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleInLineDecomposition7024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_entryRuleDecompositionEnd7060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecompositionEnd7070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecompositionEnd7118 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDecompositionEnd7131 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecompositionEnd7148 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDecompositionEnd7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution7204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContribution7214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContribution7262 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleContribution7283 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleContribution7296 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleContribution7317 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleContribution7331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineContribution_in_entryRuleInLineContribution7367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineContribution7377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleInLineContribution7414 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleInLineContribution7435 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleInLineContribution7448 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleInLineContribution7469 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleInLineContribution7483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_entryRuleContributionEnd7519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionEnd7529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionEnd7571 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionEnd7600 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleContributionEnd7613 = new BitSet(new long[]{0x0000000000008040L,0x00000000000001FCL});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionEnd7635 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionEnd7658 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionEnd7677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency7715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency7725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependency7773 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleDependency7785 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleDependency7806 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleDependency7819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleDependency7840 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleDependency7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDependency_in_entryRuleInLineDependency7890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineDependency7900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleInLineDependency7937 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7958 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleInLineDependency7971 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7992 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleInLineDependency8006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_entryRuleDependencyEnd8042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyEnd8052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependencyEnd8100 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDependencyEnd8113 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependencyEnd8130 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDependencyEnd8148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStrategyGroup_in_entryRuleStrategyGroup8186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStrategyGroup8196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleStrategyGroup8233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStrategyGroup8250 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleStrategyGroup8267 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8290 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleStrategyGroup8303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleStrategyGroup8326 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleStrategyGroup8340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationStrategy_in_entryRuleEvaluationStrategy8376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationStrategy8386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleEvaluationStrategy8423 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvaluationStrategy8440 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_38_in_ruleEvaluationStrategy8458 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy8481 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_29_in_ruleEvaluationStrategy8494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy8517 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluationStrategy8533 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_ruleEvaluation_in_ruleEvaluationStrategy8554 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_15_in_ruleEvaluationStrategy8567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation8603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation8613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluation8661 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation8673 = new BitSet(new long[]{0x0800000000000040L,0x0000000000003E20L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleEvaluation8695 = new BitSet(new long[]{0x01F807000008C000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluation8718 = new BitSet(new long[]{0x01F807000008C000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluation8783 = new BitSet(new long[]{0x01F807800000C002L});
    public static final BitSet FOLLOW_39_in_ruleEvaluation8802 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation8827 = new BitSet(new long[]{0x01F807000000C002L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_ruleEvaluation8905 = new BitSet(new long[]{0x01F807000000C002L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation8981 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvaluation8994 = new BitSet(new long[]{0x01F807000000C002L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation9059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange9096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationRange9106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleEvaluationRange9188 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange9200 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange9217 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange9234 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_41_in_ruleEvaluationRange9302 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange9314 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange9331 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange9348 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_42_in_ruleEvaluationRange9416 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange9428 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange9445 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange9462 = new BitSet(new long[]{0x0000070000000002L});
    public static final BitSet FOLLOW_ruleContributionGroup_in_entryRuleContributionGroup9546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionGroup9556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleContributionGroup9593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup9610 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleContributionGroup9627 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup9647 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleContributionGroup9660 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionGroup9680 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionGroup9694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionContext_in_entryRuleContributionContext9730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionContext9740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleContributionContext9777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionContext9794 = new BitSet(new long[]{0x0000004000004000L});
    public static final BitSet FOLLOW_38_in_ruleContributionContext9812 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionContext9835 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_29_in_ruleContributionContext9848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionContext9871 = new BitSet(new long[]{0x0000000020004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionContext9887 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_45_in_ruleContributionContext9900 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionContext9912 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_ruleContributionChange_in_ruleContributionContext9933 = new BitSet(new long[]{0x0000200000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionContext9947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionChange_in_entryRuleContributionChange9983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionChange9993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleContributionChange10030 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionChange10047 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleContributionChange10064 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionChange10076 = new BitSet(new long[]{0x0003800000008000L});
    public static final BitSet FOLLOW_47_in_ruleContributionChange10134 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionChange10146 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001FCL});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionChange10167 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionChange10179 = new BitSet(new long[]{0x0003800000008000L});
    public static final BitSet FOLLOW_48_in_ruleContributionChange10247 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionChange10259 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionChange10276 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionChange10293 = new BitSet(new long[]{0x0003800000008000L});
    public static final BitSet FOLLOW_49_in_ruleContributionChange10361 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionChange10373 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_ruleContributionRange_in_ruleContributionChange10394 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionChange10406 = new BitSet(new long[]{0x0003800000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionChange10459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionRange_in_entryRuleContributionRange10495 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionRange10505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleContributionRange10542 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionRange10554 = new BitSet(new long[]{0x0000070000008000L});
    public static final BitSet FOLLOW_40_in_ruleContributionRange10612 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange10624 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange10641 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange10658 = new BitSet(new long[]{0x0000070000008000L});
    public static final BitSet FOLLOW_41_in_ruleContributionRange10726 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange10738 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange10755 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange10772 = new BitSet(new long[]{0x0000070000008000L});
    public static final BitSet FOLLOW_42_in_ruleContributionRange10840 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange10852 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange10869 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange10886 = new BitSet(new long[]{0x0000070000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionRange10939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet10975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIEvalValueSet10985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQuantitativeEvalValueSet_in_ruleKPIEvalValueSet11032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQualitativeEvalValueSet_in_ruleKPIEvalValueSet11059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIQuantitativeEvalValueSet_in_entryRuleKPIQuantitativeEvalValueSet11094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIQuantitativeEvalValueSet11104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleKPIQuantitativeEvalValueSet11186 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet11198 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet11215 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet11232 = new BitSet(new long[]{0x00F8000000000002L});
    public static final BitSet FOLLOW_52_in_ruleKPIQuantitativeEvalValueSet11300 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet11312 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet11329 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet11346 = new BitSet(new long[]{0x00F8000000000002L});
    public static final BitSet FOLLOW_53_in_ruleKPIQuantitativeEvalValueSet11414 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet11426 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet11443 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet11460 = new BitSet(new long[]{0x00F8000000000002L});
    public static final BitSet FOLLOW_54_in_ruleKPIQuantitativeEvalValueSet11528 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet11540 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIQuantitativeEvalValueSet11557 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet11574 = new BitSet(new long[]{0x00F8000000000002L});
    public static final BitSet FOLLOW_55_in_ruleKPIQuantitativeEvalValueSet11642 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQuantitativeEvalValueSet11654 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKPIQuantitativeEvalValueSet11671 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQuantitativeEvalValueSet11688 = new BitSet(new long[]{0x00F8000000000002L});
    public static final BitSet FOLLOW_ruleKPIQualitativeEvalValueSet_in_entryRuleKPIQualitativeEvalValueSet11770 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIQualitativeEvalValueSet11780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleKPIQualitativeEvalValueSet11817 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIQualitativeEvalValueSet11829 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleKPIQualitativeEvalValueSet11852 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIQualitativeEvalValueSet11864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping11900 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitativeMapping11910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleQualitativeMapping11947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeMapping11964 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualitativeMapping11981 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_ruleMapping_in_ruleQualitativeMapping12002 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_15_in_ruleQualitativeMapping12015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMapping_in_entryRuleMapping12051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMapping12061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMapping12103 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMapping12120 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMapping12137 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMapping12154 = new BitSet(new long[]{0x0800000000000000L,0x0000000000003E20L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleMapping12175 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMapping12187 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleMapping12204 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMapping12221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12321 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_58_in_ruleQualifiedName12340 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12355 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_59_in_ruleImportanceType12416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleImportanceType12433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleImportanceType12450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleImportanceType12467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleDecompositionType12512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleDecompositionType12529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleDecompositionType12546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleContributionType12591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleContributionType12608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleContributionType12625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleContributionType12642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleContributionType12659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleContributionType12676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleContributionType12693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleQualitativeLabel12738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleQualitativeLabel12755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleQualitativeLabel12772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleQualitativeLabel12789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleQualitativeLabel12806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleQualitativeLabel12823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleQualitativeLabel12840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleColor12885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleColor12902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleColor12919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleColor12936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleColor12953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleColor12970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleColor12987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleColor13004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleColor13021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleColor13038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleColor13055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleColor13072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleColor13089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleColor13106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleColor13123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleColor13140 = new BitSet(new long[]{0x0000000000000002L});

}
