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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grl'", "'{'", "'}'", "'actor'", "'name'", "'='", "';'", "'description'", "'color'", "'softGoal'", "'decompositionType'", "'goal'", "'Task'", "'resource'", "'indicator'", "'refs'", "','", "'kpiModelLinksDest'", "'groups'", "'belief'", "'decomposes'", "'contributes'", "'depends'", "'eval'", "'evaluation'", "'qualitativeEvaluation'", "'exceeds'", "'evalRange'", "'kpiEvalValueSet'", "'kpiNewEvalValue'", "'inElement'", "'evaluationRange'", "'start'", "'end'", "'step'", "'contributionChange'", "'newContribution'", "'newQuantitativeContribution'", "'contribRange'", "'contributionRange'", "'qualitativeMappings'", "'targetValue'", "'thresholdValue'", "'worstValue'", "'evaluationValue'", "'unit'", "'qualitativeEvaluationValue'", "'qualitativeMapping'", "'realWorldLabel'", "'kpiInformationConfig'", "'levelOfDimension'", "'valueOfDimension'", "'kpiInfoElement'", "'.'", "'None'", "'High'", "'Medium'", "'Low'", "'And'", "'Or'", "'Xor'", "'Help'", "'Make'", "'SomePositive'", "'Unknown'", "'SomeNegative'", "'Hurt'", "'Break'", "'Denied'", "'WeaklyDenied'", "'WeaklySatisfied'", "'Satisfied'", "'Conflict'", "'white'", "'black'", "'blue'", "'green'", "'cyan'", "'red'", "'purple'", "'yellow'", "'gray'", "'lightGray'", "'lightBlue'", "'lightGreen'", "'lightCray'", "'lightRed'", "'lightPurple'", "'lightYellow'"
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
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
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
    public static final int RULE_DOUBLE=8;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:118:1: ruleGRLBaseElement returns [EObject current=null] : (this_GRLElement_0= ruleGRLElement | this_InLineElementLink_1= ruleInLineElementLink ) ;
    public final EObject ruleGRLBaseElement() throws RecognitionException {
        EObject current = null;

        EObject this_GRLElement_0 = null;

        EObject this_InLineElementLink_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:121:28: ( (this_GRLElement_0= ruleGRLElement | this_InLineElementLink_1= ruleInLineElementLink ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:122:1: (this_GRLElement_0= ruleGRLElement | this_InLineElementLink_1= ruleInLineElementLink )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:122:1: (this_GRLElement_0= ruleGRLElement | this_InLineElementLink_1= ruleInLineElementLink )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||LA2_0==16||LA2_0==22||(LA2_0>=24 && LA2_0<=27)||LA2_0==32) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=33 && LA2_0<=35)) ) {
                alt2=2;
            }
            else {
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

            }


            }

             leaveRule(); 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:149:1: entryRuleGRLElement returns [EObject current=null] : iv_ruleGRLElement= ruleGRLElement EOF ;
    public final EObject entryRuleGRLElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRLElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:150:2: (iv_ruleGRLElement= ruleGRLElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:151:2: iv_ruleGRLElement= ruleGRLElement EOF
            {
             newCompositeNode(grammarAccess.getGRLElementRule()); 
            pushFollow(FOLLOW_ruleGRLElement_in_entryRuleGRLElement287);
            iv_ruleGRLElement=ruleGRLElement();

            state._fsp--;

             current =iv_ruleGRLElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRLElement297); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:158:1: ruleGRLElement returns [EObject current=null] : (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor ) ;
    public final EObject ruleGRLElement() throws RecognitionException {
        EObject current = null;

        EObject this_IntentionalElement_0 = null;

        EObject this_ElementLink_1 = null;

        EObject this_Actor_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:161:28: ( (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:162:1: (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:162:1: (this_IntentionalElement_0= ruleIntentionalElement | this_ElementLink_1= ruleElementLink | this_Actor_2= ruleActor )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 22:
            case 24:
            case 25:
            case 26:
            case 27:
            case 32:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:163:5: this_IntentionalElement_0= ruleIntentionalElement
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getIntentionalElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleIntentionalElement_in_ruleGRLElement344);
                    this_IntentionalElement_0=ruleIntentionalElement();

                    state._fsp--;

                     
                            current = this_IntentionalElement_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:173:5: this_ElementLink_1= ruleElementLink
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getElementLinkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleElementLink_in_ruleGRLElement371);
                    this_ElementLink_1=ruleElementLink();

                    state._fsp--;

                     
                            current = this_ElementLink_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:183:5: this_Actor_2= ruleActor
                    {
                     
                            newCompositeNode(grammarAccess.getGRLElementAccess().getActorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleActor_in_ruleGRLElement398);
                    this_Actor_2=ruleActor();

                    state._fsp--;

                     
                            current = this_Actor_2; 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:199:1: entryRuleIntentionalElement returns [EObject current=null] : iv_ruleIntentionalElement= ruleIntentionalElement EOF ;
    public final EObject entryRuleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntentionalElement = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:200:2: (iv_ruleIntentionalElement= ruleIntentionalElement EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:201:2: iv_ruleIntentionalElement= ruleIntentionalElement EOF
            {
             newCompositeNode(grammarAccess.getIntentionalElementRule()); 
            pushFollow(FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement433);
            iv_ruleIntentionalElement=ruleIntentionalElement();

            state._fsp--;

             current =iv_ruleIntentionalElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntentionalElement443); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:208:1: ruleIntentionalElement returns [EObject current=null] : (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:211:28: ( (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:212:1: (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:212:1: (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator | this_Belief_5= ruleBelief )
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
            case 32:
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:213:5: this_Softgoal_0= ruleSoftgoal
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getSoftgoalParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSoftgoal_in_ruleIntentionalElement490);
                    this_Softgoal_0=ruleSoftgoal();

                    state._fsp--;

                     
                            current = this_Softgoal_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:223:5: this_Goal_1= ruleGoal
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getGoalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGoal_in_ruleIntentionalElement517);
                    this_Goal_1=ruleGoal();

                    state._fsp--;

                     
                            current = this_Goal_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:233:5: this_Task_2= ruleTask
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getTaskParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTask_in_ruleIntentionalElement544);
                    this_Task_2=ruleTask();

                    state._fsp--;

                     
                            current = this_Task_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:243:5: this_Resource_3= ruleResource
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getResourceParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleResource_in_ruleIntentionalElement571);
                    this_Resource_3=ruleResource();

                    state._fsp--;

                     
                            current = this_Resource_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:253:5: this_Indicator_4= ruleIndicator
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getIndicatorParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleIndicator_in_ruleIntentionalElement598);
                    this_Indicator_4=ruleIndicator();

                    state._fsp--;

                     
                            current = this_Indicator_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:263:5: this_Belief_5= ruleBelief
                    {
                     
                            newCompositeNode(grammarAccess.getIntentionalElementAccess().getBeliefParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleBelief_in_ruleIntentionalElement625);
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:279:1: entryRuleElementLink returns [EObject current=null] : iv_ruleElementLink= ruleElementLink EOF ;
    public final EObject entryRuleElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:280:2: (iv_ruleElementLink= ruleElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:281:2: iv_ruleElementLink= ruleElementLink EOF
            {
             newCompositeNode(grammarAccess.getElementLinkRule()); 
            pushFollow(FOLLOW_ruleElementLink_in_entryRuleElementLink660);
            iv_ruleElementLink=ruleElementLink();

            state._fsp--;

             current =iv_ruleElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLink670); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:288:1: ruleElementLink returns [EObject current=null] : (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency ) ;
    public final EObject ruleElementLink() throws RecognitionException {
        EObject current = null;

        EObject this_Decomposition_0 = null;

        EObject this_Contribution_1 = null;

        EObject this_Dependency_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:291:28: ( (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:292:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:292:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:293:5: this_Decomposition_0= ruleDecomposition
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDecompositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecomposition_in_ruleElementLink717);
                    this_Decomposition_0=ruleDecomposition();

                    state._fsp--;

                     
                            current = this_Decomposition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:303:5: this_Contribution_1= ruleContribution
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getContributionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContribution_in_ruleElementLink744);
                    this_Contribution_1=ruleContribution();

                    state._fsp--;

                     
                            current = this_Contribution_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:313:5: this_Dependency_2= ruleDependency
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDependencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDependency_in_ruleElementLink771);
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:329:1: entryRuleInLineElementLink returns [EObject current=null] : iv_ruleInLineElementLink= ruleInLineElementLink EOF ;
    public final EObject entryRuleInLineElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:330:2: (iv_ruleInLineElementLink= ruleInLineElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:331:2: iv_ruleInLineElementLink= ruleInLineElementLink EOF
            {
             newCompositeNode(grammarAccess.getInLineElementLinkRule()); 
            pushFollow(FOLLOW_ruleInLineElementLink_in_entryRuleInLineElementLink806);
            iv_ruleInLineElementLink=ruleInLineElementLink();

            state._fsp--;

             current =iv_ruleInLineElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineElementLink816); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:338:1: ruleInLineElementLink returns [EObject current=null] : (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency ) ;
    public final EObject ruleInLineElementLink() throws RecognitionException {
        EObject current = null;

        EObject this_InLineDecomposition_0 = null;

        EObject this_InLineContribution_1 = null;

        EObject this_InLineDependency_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:341:28: ( (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:342:1: (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:342:1: (this_InLineDecomposition_0= ruleInLineDecomposition | this_InLineContribution_1= ruleInLineContribution | this_InLineDependency_2= ruleInLineDependency )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                alt6=2;
                }
                break;
            case 35:
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:343:5: this_InLineDecomposition_0= ruleInLineDecomposition
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineDecompositionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleInLineDecomposition_in_ruleInLineElementLink863);
                    this_InLineDecomposition_0=ruleInLineDecomposition();

                    state._fsp--;

                     
                            current = this_InLineDecomposition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:353:5: this_InLineContribution_1= ruleInLineContribution
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineContributionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleInLineContribution_in_ruleInLineElementLink890);
                    this_InLineContribution_1=ruleInLineContribution();

                    state._fsp--;

                     
                            current = this_InLineContribution_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:363:5: this_InLineDependency_2= ruleInLineDependency
                    {
                     
                            newCompositeNode(grammarAccess.getInLineElementLinkAccess().getInLineDependencyParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleInLineDependency_in_ruleInLineElementLink917);
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:379:1: entryRuleGRLSpecification returns [EObject current=null] : iv_ruleGRLSpecification= ruleGRLSpecification EOF ;
    public final EObject entryRuleGRLSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRLSpecification = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:380:2: (iv_ruleGRLSpecification= ruleGRLSpecification EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:381:2: iv_ruleGRLSpecification= ruleGRLSpecification EOF
            {
             newCompositeNode(grammarAccess.getGRLSpecificationRule()); 
            pushFollow(FOLLOW_ruleGRLSpecification_in_entryRuleGRLSpecification952);
            iv_ruleGRLSpecification=ruleGRLSpecification();

            state._fsp--;

             current =iv_ruleGRLSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRLSpecification962); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:388:1: ruleGRLSpecification returns [EObject current=null] : (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleGRLSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_grlElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:391:28: ( (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:392:1: (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:392:1: (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:392:3: otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGRLSpecification999); 

                	newLeafNode(otherlv_0, grammarAccess.getGRLSpecificationAccess().getGrlKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:396:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:397:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:397:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:398:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGRLSpecification1016); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGRLSpecification1034); 

                	newLeafNode(otherlv_2, grammarAccess.getGRLSpecificationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:418:1: ( (lv_grlElements_3_0= ruleGRLElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==16||LA8_0==22||(LA8_0>=24 && LA8_0<=27)||LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:419:1: (lv_grlElements_3_0= ruleGRLElement )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:419:1: (lv_grlElements_3_0= ruleGRLElement )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:420:3: lv_grlElements_3_0= ruleGRLElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLSpecificationAccess().getGrlElementsGRLElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGRLElement_in_ruleGRLSpecification1055);
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

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleGRLSpecification1068); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:448:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:449:2: (iv_ruleActor= ruleActor EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:450:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor1104);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor1114); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:457:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:460:28: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:461:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:461:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:461:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleActor1151); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:465:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:466:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:466:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:467:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor1168); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleActor1185); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:487:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:489:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:489:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:490:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:493:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:494:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:494:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) ) )*
            loop12:
            do {
                int alt12=6;
                int LA12_0 = input.LA(1);

                if ( LA12_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0) ) {
                    alt12=1;
                }
                else if ( (LA12_0==RULE_INT|| LA12_0 >=67 && LA12_0<=70) && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3) ) {
                    alt12=4;
                }
                else if ( (LA12_0==RULE_ID||LA12_0==22|| LA12_0 >=24 && LA12_0<=27 ||LA12_0==32) && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {
                    alt12=5;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:496:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:496:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:497:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:497:102: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:498:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:501:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:501:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:501:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:501:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleActor1243); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActorAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleActor1255); 

            	        	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:509:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:510:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:510:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:511:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1272); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleActor1289); 

            	        	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:538:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:538:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:539:5: {...}? => ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:539:102: ( ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:540:6: ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:543:6: ({...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:543:7: {...}? => ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:543:16: ( ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:543:17: ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) ) otherlv_10= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:543:17: ( ( (lv_importance_8_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_9_0= RULE_INT ) ) )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( ((LA9_0>=67 && LA9_0<=70)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:543:18: ( (lv_importance_8_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:543:18: ( (lv_importance_8_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:544:1: (lv_importance_8_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:544:1: (lv_importance_8_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:545:3: lv_importance_8_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getActorAccess().getImportanceImportanceTypeEnumRuleCall_3_1_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleActor1367);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:562:6: ( (lv_importanceQuantitative_9_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:562:6: ( (lv_importanceQuantitative_9_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:563:1: (lv_importanceQuantitative_9_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:563:1: (lv_importanceQuantitative_9_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:564:3: lv_importanceQuantitative_9_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActor1390); 

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

            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleActor1408); 

            	        	newLeafNode(otherlv_10, grammarAccess.getActorAccess().getSemicolonKeyword_3_1_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:591:4: ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:591:4: ({...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:592:5: {...}? => ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:592:102: ( ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:593:6: ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:596:6: ({...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:596:7: {...}? => (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:596:16: (otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:596:18: otherlv_11= 'description' otherlv_12= '=' ( (lv_description_13_0= RULE_STRING ) ) otherlv_14= ';'
            	    {
            	    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleActor1476); 

            	        	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getDescriptionKeyword_3_2_0());
            	        
            	    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleActor1488); 

            	        	newLeafNode(otherlv_12, grammarAccess.getActorAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:604:1: ( (lv_description_13_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:605:1: (lv_description_13_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:605:1: (lv_description_13_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:606:3: lv_description_13_0= RULE_STRING
            	    {
            	    lv_description_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1505); 

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

            	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleActor1522); 

            	        	newLeafNode(otherlv_14, grammarAccess.getActorAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:633:4: ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:633:4: ({...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:634:5: {...}? => ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:634:102: ( ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:635:6: ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:638:6: ({...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:638:7: {...}? => (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:638:16: (otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:638:18: otherlv_15= 'color' otherlv_16= '=' ( (lv_fillColor_17_0= ruleColor ) ) otherlv_18= ';'
            	    {
            	    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleActor1590); 

            	        	newLeafNode(otherlv_15, grammarAccess.getActorAccess().getColorKeyword_3_3_0());
            	        
            	    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleActor1602); 

            	        	newLeafNode(otherlv_16, grammarAccess.getActorAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:646:1: ( (lv_fillColor_17_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:647:1: (lv_fillColor_17_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:647:1: (lv_fillColor_17_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:648:3: lv_fillColor_17_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActorAccess().getFillColorColorEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleActor1623);
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

            	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleActor1635); 

            	        	newLeafNode(otherlv_18, grammarAccess.getActorAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:675:4: ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:675:4: ({...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:676:5: {...}? => ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:676:102: ( ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:677:6: ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:680:6: ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+
            	    int cnt11=0;
            	    loop11:
            	    do {
            	        int alt11=2;
            	        alt11 = dfa11.predict(input);
            	        switch (alt11) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:680:7: {...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:680:16: ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) )
            	    	    int alt10=2;
            	    	    int LA10_0 = input.LA(1);

            	    	    if ( (LA10_0==22||(LA10_0>=24 && LA10_0<=27)||LA10_0==32) ) {
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
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:680:17: ( (lv_elemets_19_0= ruleIntentionalElement ) )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:680:17: ( (lv_elemets_19_0= ruleIntentionalElement ) )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:681:1: (lv_elemets_19_0= ruleIntentionalElement )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:681:1: (lv_elemets_19_0= ruleIntentionalElement )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:682:3: lv_elemets_19_0= ruleIntentionalElement
            	    	            {
            	    	             
            	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsIntentionalElementParserRuleCall_3_4_0_0()); 
            	    	            	    
            	    	            pushFollow(FOLLOW_ruleIntentionalElement_in_ruleActor1712);
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
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:699:6: ( (lv_elemets_20_0= ruleElementLink ) )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:699:6: ( (lv_elemets_20_0= ruleElementLink ) )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:700:1: (lv_elemets_20_0= ruleElementLink )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:700:1: (lv_elemets_20_0= ruleElementLink )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:701:3: lv_elemets_20_0= ruleElementLink
            	    	            {
            	    	             
            	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsElementLinkParserRuleCall_3_4_1_0()); 
            	    	            	    
            	    	            pushFollow(FOLLOW_ruleElementLink_in_ruleActor1739);
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

            otherlv_21=(Token)match(input,15,FOLLOW_15_in_ruleActor1793); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:743:1: entryRuleSoftgoal returns [EObject current=null] : iv_ruleSoftgoal= ruleSoftgoal EOF ;
    public final EObject entryRuleSoftgoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftgoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:744:2: (iv_ruleSoftgoal= ruleSoftgoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:745:2: iv_ruleSoftgoal= ruleSoftgoal EOF
            {
             newCompositeNode(grammarAccess.getSoftgoalRule()); 
            pushFollow(FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal1829);
            iv_ruleSoftgoal=ruleSoftgoal();

            state._fsp--;

             current =iv_ruleSoftgoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftgoal1839); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:752:1: ruleSoftgoal returns [EObject current=null] : (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:755:28: ( (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:756:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:756:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:756:3: otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleSoftgoal1876); 

                	newLeafNode(otherlv_0, grammarAccess.getSoftgoalAccess().getSoftGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:760:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:761:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:761:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:762:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftgoal1893); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSoftgoal1910); 

                	newLeafNode(otherlv_2, grammarAccess.getSoftgoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:782:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:784:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:784:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:785:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:788:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:789:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:789:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
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
                else if ( (LA15_0==RULE_INT|| LA15_0 >=67 && LA15_0<=70) && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4) ) {
                    alt15=5;
                }
                else if ( LA15_0 >=33 && LA15_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5) ) {
                    alt15=6;
                }


                switch (alt15) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:791:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:791:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:792:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:792:105: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:793:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:796:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:796:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:796:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:796:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal1968); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSoftgoalAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal1980); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:804:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:805:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:805:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:806:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal1997); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2014); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:833:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:833:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:834:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:834:105: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:835:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:838:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:838:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:838:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:838:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleSoftgoal2082); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSoftgoalAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2094); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:846:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:847:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:847:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:848:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal2111); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2128); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:875:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:875:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:876:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:876:105: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:877:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:880:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:880:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:880:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:880:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleSoftgoal2196); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSoftgoalAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2208); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:888:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:889:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:889:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:890:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleSoftgoal2229);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2241); 

            	        	newLeafNode(otherlv_15, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:917:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:917:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:918:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:918:105: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:919:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:922:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:922:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:922:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:922:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleSoftgoal2309); 

            	        	newLeafNode(otherlv_16, grammarAccess.getSoftgoalAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2321); 

            	        	newLeafNode(otherlv_17, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:930:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:931:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:931:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:932:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleSoftgoal2342);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2354); 

            	        	newLeafNode(otherlv_19, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:959:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:959:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:960:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:960:105: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:961:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:964:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:964:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:964:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:964:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:964:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( ((LA13_0>=67 && LA13_0<=70)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:964:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:964:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:965:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:965:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:966:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getSoftgoalAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleSoftgoal2432);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:983:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:983:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:984:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:984:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:985:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSoftgoal2455); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2473); 

            	        	newLeafNode(otherlv_22, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1012:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1012:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1013:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1013:105: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1014:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1017:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    int cnt14=0;
            	    loop14:
            	    do {
            	        int alt14=2;
            	        switch ( input.LA(1) ) {
            	        case 33:
            	            {
            	            int LA14_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt14=1;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA14_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt14=1;
            	            }


            	            }
            	            break;
            	        case 35:
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
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1017:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1017:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1018:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1018:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1019:3: lv_elementLinks_23_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getElementLinksInLineElementLinkParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleSoftgoal2549);
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

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleSoftgoal2602); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1061:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1062:2: (iv_ruleGoal= ruleGoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1063:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal2638);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal2648); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1070:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1073:28: ( (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1074:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1074:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1074:3: otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGoal2685); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1078:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1079:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1079:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1080:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal2702); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGoal2719); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1100:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1102:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1102:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1103:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1106:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1107:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1107:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
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
                else if ( (LA18_0==RULE_INT|| LA18_0 >=67 && LA18_0<=70) && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4) ) {
                    alt18=5;
                }
                else if ( LA18_0 >=33 && LA18_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5) ) {
                    alt18=6;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1109:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1109:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1110:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1110:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1111:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1114:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1114:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1114:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1114:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleGoal2777); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGoalAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleGoal2789); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1122:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1123:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1123:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1124:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal2806); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleGoal2823); 

            	        	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1151:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1151:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1152:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1152:101: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1153:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1156:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1156:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1156:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1156:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleGoal2891); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleGoal2903); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1164:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1165:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1165:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1166:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal2920); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleGoal2937); 

            	        	newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1193:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1193:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1194:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1194:101: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1195:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1198:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1198:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1198:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1198:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleGoal3005); 

            	        	newLeafNode(otherlv_12, grammarAccess.getGoalAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleGoal3017); 

            	        	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1206:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1207:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1207:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1208:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleGoal3038);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleGoal3050); 

            	        	newLeafNode(otherlv_15, grammarAccess.getGoalAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1235:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1235:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1236:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1236:101: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1237:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1240:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1240:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1240:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1240:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleGoal3118); 

            	        	newLeafNode(otherlv_16, grammarAccess.getGoalAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleGoal3130); 

            	        	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1248:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1249:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1249:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1250:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleGoal3151);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleGoal3163); 

            	        	newLeafNode(otherlv_19, grammarAccess.getGoalAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1277:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1277:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1278:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1278:101: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1279:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1282:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1282:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1282:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1282:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1282:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( ((LA16_0>=67 && LA16_0<=70)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1282:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1282:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1283:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1283:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1284:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getGoalAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleGoal3241);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1301:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1301:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1302:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1302:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1303:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGoal3264); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleGoal3282); 

            	        	newLeafNode(otherlv_22, grammarAccess.getGoalAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1330:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1330:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1331:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1331:101: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1332:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1335:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    int cnt17=0;
            	    loop17:
            	    do {
            	        int alt17=2;
            	        switch ( input.LA(1) ) {
            	        case 33:
            	            {
            	            int LA17_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt17=1;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA17_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt17=1;
            	            }


            	            }
            	            break;
            	        case 35:
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
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1335:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1335:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1336:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1336:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1337:3: lv_elementLinks_23_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getElementLinksInLineElementLinkParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleGoal3358);
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

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleGoal3411); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1379:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1380:2: (iv_ruleTask= ruleTask EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1381:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask3447);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask3457); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1388:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1391:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1392:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1392:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1392:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTask3494); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1396:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1397:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1397:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1398:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask3511); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTask3528); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1418:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1420:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1420:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1421:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1424:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1425:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1425:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
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
                else if ( (LA21_0==RULE_INT|| LA21_0 >=67 && LA21_0<=70) && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4) ) {
                    alt21=5;
                }
                else if ( LA21_0 >=33 && LA21_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5) ) {
                    alt21=6;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1427:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1427:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1428:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1428:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1429:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1432:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1432:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1432:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1432:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleTask3586); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleTask3598); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1440:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1441:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1441:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1442:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask3615); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleTask3632); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1469:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1469:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1470:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1470:101: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1471:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1474:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1474:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1474:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1474:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleTask3700); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleTask3712); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1482:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1483:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1483:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1484:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask3729); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleTask3746); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1511:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1511:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1512:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1512:101: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1513:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1516:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1516:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1516:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1516:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleTask3814); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleTask3826); 

            	        	newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1524:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1525:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1525:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1526:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaskAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleTask3847);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleTask3859); 

            	        	newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1553:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1553:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1554:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1554:101: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1555:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1558:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1558:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1558:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1558:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleTask3927); 

            	        	newLeafNode(otherlv_16, grammarAccess.getTaskAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleTask3939); 

            	        	newLeafNode(otherlv_17, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1566:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1567:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1567:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1568:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaskAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleTask3960);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleTask3972); 

            	        	newLeafNode(otherlv_19, grammarAccess.getTaskAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1595:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1595:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1596:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1596:101: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1597:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1600:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1600:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1600:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1600:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1600:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( ((LA19_0>=67 && LA19_0<=70)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1600:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1600:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1601:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1601:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1602:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getTaskAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleTask4050);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1619:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1619:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1620:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1620:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1621:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTask4073); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleTask4091); 

            	        	newLeafNode(otherlv_22, grammarAccess.getTaskAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1648:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1648:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1649:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1649:101: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1650:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1653:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    int cnt20=0;
            	    loop20:
            	    do {
            	        int alt20=2;
            	        switch ( input.LA(1) ) {
            	        case 33:
            	            {
            	            int LA20_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt20=1;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA20_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt20=1;
            	            }


            	            }
            	            break;
            	        case 35:
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
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1653:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1653:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1654:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1654:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1655:3: lv_elementLinks_23_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getTaskAccess().getElementLinksInLineElementLinkParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleTask4167);
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

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleTask4220); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1697:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1698:2: (iv_ruleResource= ruleResource EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1699:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource4256);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource4266); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1706:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1709:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1710:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1710:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1710:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleResource4303); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1714:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1715:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1715:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1716:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource4320); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleResource4337); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1736:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1738:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1738:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1739:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1742:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1743:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1743:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) ) )*
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
                else if ( (LA24_0==RULE_INT|| LA24_0 >=67 && LA24_0<=70) && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4) ) {
                    alt24=5;
                }
                else if ( LA24_0 >=33 && LA24_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5) ) {
                    alt24=6;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1745:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1745:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1746:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1746:105: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1747:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1750:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1750:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1750:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1750:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleResource4395); 

            	        	newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleResource4407); 

            	        	newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1758:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1759:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1759:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1760:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource4424); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleResource4441); 

            	        	newLeafNode(otherlv_7, grammarAccess.getResourceAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1787:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1787:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1788:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1788:105: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1789:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1792:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1792:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1792:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1792:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleResource4509); 

            	        	newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleResource4521); 

            	        	newLeafNode(otherlv_9, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1800:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1801:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1801:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1802:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource4538); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleResource4555); 

            	        	newLeafNode(otherlv_11, grammarAccess.getResourceAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1829:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1829:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1830:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1830:105: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1831:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1834:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1834:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1834:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1834:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleResource4623); 

            	        	newLeafNode(otherlv_12, grammarAccess.getResourceAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleResource4635); 

            	        	newLeafNode(otherlv_13, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1842:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1843:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1843:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1844:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleResource4656);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleResource4668); 

            	        	newLeafNode(otherlv_15, grammarAccess.getResourceAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1871:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1871:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1872:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1872:105: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1873:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1876:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1876:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1876:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1876:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleResource4736); 

            	        	newLeafNode(otherlv_16, grammarAccess.getResourceAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleResource4748); 

            	        	newLeafNode(otherlv_17, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1884:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1885:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1885:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1886:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleResource4769);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleResource4781); 

            	        	newLeafNode(otherlv_19, grammarAccess.getResourceAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1913:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1913:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1914:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1914:105: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1915:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1918:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1918:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1918:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1918:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1918:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( ((LA22_0>=67 && LA22_0<=70)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1918:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1918:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1919:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1919:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1920:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getResourceAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleResource4859);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1937:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1937:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1938:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1938:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1939:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResource4882); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleResource4900); 

            	        	newLeafNode(otherlv_22, grammarAccess.getResourceAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1966:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1966:4: ({...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1967:5: {...}? => ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1967:105: ( ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1968:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1971:6: ({...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) ) )+
            	    int cnt23=0;
            	    loop23:
            	    do {
            	        int alt23=2;
            	        switch ( input.LA(1) ) {
            	        case 33:
            	            {
            	            int LA23_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA23_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt23=1;
            	            }


            	            }
            	            break;
            	        case 35:
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
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1971:7: {...}? => ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1971:16: ( (lv_elementLinks_23_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1972:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1972:1: (lv_elementLinks_23_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1973:3: lv_elementLinks_23_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getResourceAccess().getElementLinksInLineElementLinkParserRuleCall_3_5_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleResource4976);
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

            otherlv_24=(Token)match(input,15,FOLLOW_15_in_ruleResource5029); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2015:1: entryRuleIndicator returns [EObject current=null] : iv_ruleIndicator= ruleIndicator EOF ;
    public final EObject entryRuleIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicator = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2016:2: (iv_ruleIndicator= ruleIndicator EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2017:2: iv_ruleIndicator= ruleIndicator EOF
            {
             newCompositeNode(grammarAccess.getIndicatorRule()); 
            pushFollow(FOLLOW_ruleIndicator_in_entryRuleIndicator5065);
            iv_ruleIndicator=ruleIndicator();

            state._fsp--;

             current =iv_ruleIndicator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndicator5075); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2024:1: ruleIndicator returns [EObject current=null] : (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_42= '}' ) ;
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
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_38=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        Token otherlv_42=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_decompositionType_18_0 = null;

        Enumerator lv_importance_20_0 = null;

        EObject lv_elementLinks_41_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2027:28: ( (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_42= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2028:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_42= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2028:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_42= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2028:3: otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) ) otherlv_42= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleIndicator5112); 

                	newLeafNode(otherlv_0, grammarAccess.getIndicatorAccess().getIndicatorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2032:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2033:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2033:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2034:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator5129); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleIndicator5146); 

                	newLeafNode(otherlv_2, grammarAccess.getIndicatorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2054:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2056:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2056:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2057:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2060:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2061:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2061:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) ) )*
            loop30:
            do {
                int alt30=10;
                alt30 = dfa30.predict(input);
                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2063:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2063:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2064:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2064:106: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2065:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2068:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2068:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2068:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2068:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleIndicator5204); 

            	        	newLeafNode(otherlv_4, grammarAccess.getIndicatorAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5216); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2076:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2077:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2077:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2078:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator5233); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5250); 

            	        	newLeafNode(otherlv_7, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2105:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2105:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2106:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2106:106: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2107:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2110:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2110:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2110:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2110:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleIndicator5318); 

            	        	newLeafNode(otherlv_8, grammarAccess.getIndicatorAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5330); 

            	        	newLeafNode(otherlv_9, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2118:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2119:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2119:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2120:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator5347); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5364); 

            	        	newLeafNode(otherlv_11, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2147:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2147:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2148:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2148:106: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2149:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2152:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2152:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2152:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2152:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleIndicator5432); 

            	        	newLeafNode(otherlv_12, grammarAccess.getIndicatorAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5444); 

            	        	newLeafNode(otherlv_13, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2160:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2161:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2161:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2162:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleIndicator5465);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5477); 

            	        	newLeafNode(otherlv_15, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2189:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2189:4: ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2190:5: {...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2190:106: ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2191:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2194:6: ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2194:7: {...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2194:16: (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2194:18: otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleIndicator5545); 

            	        	newLeafNode(otherlv_16, grammarAccess.getIndicatorAccess().getDecompositionTypeKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5557); 

            	        	newLeafNode(otherlv_17, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2202:1: ( (lv_decompositionType_18_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2203:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2203:1: (lv_decompositionType_18_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2204:3: lv_decompositionType_18_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleIndicator5578);
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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5590); 

            	        	newLeafNode(otherlv_19, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2231:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2231:4: ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2232:5: {...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2232:106: ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2233:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2236:6: ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2236:7: {...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2236:16: ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2236:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';'
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2236:17: ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( ((LA25_0>=67 && LA25_0<=70)) ) {
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2236:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2236:18: ( (lv_importance_20_0= ruleImportanceType ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2237:1: (lv_importance_20_0= ruleImportanceType )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2237:1: (lv_importance_20_0= ruleImportanceType )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2238:3: lv_importance_20_0= ruleImportanceType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getIndicatorAccess().getImportanceImportanceTypeEnumRuleCall_3_4_0_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleImportanceType_in_ruleIndicator5668);
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
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2255:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2255:6: ( (lv_importanceQuantitative_21_0= RULE_INT ) )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2256:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            {
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2256:1: (lv_importanceQuantitative_21_0= RULE_INT )
            	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2257:3: lv_importanceQuantitative_21_0= RULE_INT
            	            {
            	            lv_importanceQuantitative_21_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIndicator5691); 

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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5709); 

            	        	newLeafNode(otherlv_22, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_4_1());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2284:4: ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2284:4: ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2285:5: {...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2285:106: ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2286:6: ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2289:6: ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2289:7: {...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2289:16: (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2289:18: otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';'
            	    {
            	    otherlv_23=(Token)match(input,28,FOLLOW_28_in_ruleIndicator5777); 

            	        	newLeafNode(otherlv_23, grammarAccess.getIndicatorAccess().getRefsKeyword_3_5_0());
            	        
            	    otherlv_24=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5789); 

            	        	newLeafNode(otherlv_24, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2297:1: ( (otherlv_25= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2298:1: (otherlv_25= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2298:1: (otherlv_25= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2299:3: otherlv_25= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	        }
            	            
            	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator5809); 

            	    		newLeafNode(otherlv_25, grammarAccess.getIndicatorAccess().getRefsIntentionalElementRefCrossReference_3_5_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2310:2: (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==29) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2310:4: otherlv_26= ',' ( (otherlv_27= RULE_ID ) )
            	    	    {
            	    	    otherlv_26=(Token)match(input,29,FOLLOW_29_in_ruleIndicator5822); 

            	    	        	newLeafNode(otherlv_26, grammarAccess.getIndicatorAccess().getCommaKeyword_3_5_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2314:1: ( (otherlv_27= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2315:1: (otherlv_27= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2315:1: (otherlv_27= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2316:3: otherlv_27= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	    	        }
            	    	            
            	    	    otherlv_27=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator5842); 

            	    	    		newLeafNode(otherlv_27, grammarAccess.getIndicatorAccess().getRefsIntentionalElementRefCrossReference_3_5_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop26;
            	        }
            	    } while (true);

            	    otherlv_28=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5856); 

            	        	newLeafNode(otherlv_28, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_5_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2338:4: ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2338:4: ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2339:5: {...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2339:106: ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2340:6: ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2343:6: ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2343:7: {...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2343:16: (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2343:18: otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';'
            	    {
            	    otherlv_29=(Token)match(input,30,FOLLOW_30_in_ruleIndicator5924); 

            	        	newLeafNode(otherlv_29, grammarAccess.getIndicatorAccess().getKpiModelLinksDestKeyword_3_6_0());
            	        
            	    otherlv_30=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5936); 

            	        	newLeafNode(otherlv_30, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2351:1: ( (otherlv_31= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2352:1: (otherlv_31= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2352:1: (otherlv_31= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2353:3: otherlv_31= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	        }
            	            
            	    otherlv_31=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator5956); 

            	    		newLeafNode(otherlv_31, grammarAccess.getIndicatorAccess().getKpiModelLinksDestKPIModelLinkCrossReference_3_6_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2364:2: (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==29) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2364:4: otherlv_32= ',' ( (otherlv_33= RULE_ID ) )
            	    	    {
            	    	    otherlv_32=(Token)match(input,29,FOLLOW_29_in_ruleIndicator5969); 

            	    	        	newLeafNode(otherlv_32, grammarAccess.getIndicatorAccess().getCommaKeyword_3_6_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2368:1: ( (otherlv_33= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2369:1: (otherlv_33= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2369:1: (otherlv_33= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2370:3: otherlv_33= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	    	        }
            	    	            
            	    	    otherlv_33=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator5989); 

            	    	    		newLeafNode(otherlv_33, grammarAccess.getIndicatorAccess().getKpiModelLinksDestKPIModelLinkCrossReference_3_6_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);

            	    otherlv_34=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6003); 

            	        	newLeafNode(otherlv_34, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_6_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2392:4: ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2392:4: ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2393:5: {...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2393:106: ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2394:6: ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2397:6: ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2397:7: {...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2397:16: (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2397:18: otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';'
            	    {
            	    otherlv_35=(Token)match(input,31,FOLLOW_31_in_ruleIndicator6071); 

            	        	newLeafNode(otherlv_35, grammarAccess.getIndicatorAccess().getGroupsKeyword_3_7_0());
            	        
            	    otherlv_36=(Token)match(input,18,FOLLOW_18_in_ruleIndicator6083); 

            	        	newLeafNode(otherlv_36, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_7_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2405:1: ( (otherlv_37= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2406:1: (otherlv_37= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2406:1: (otherlv_37= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2407:3: otherlv_37= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	        }
            	            
            	    otherlv_37=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator6103); 

            	    		newLeafNode(otherlv_37, grammarAccess.getIndicatorAccess().getGroupsIndicatorGroupCrossReference_3_7_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2418:2: (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==29) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2418:4: otherlv_38= ',' ( (otherlv_39= RULE_ID ) )
            	    	    {
            	    	    otherlv_38=(Token)match(input,29,FOLLOW_29_in_ruleIndicator6116); 

            	    	        	newLeafNode(otherlv_38, grammarAccess.getIndicatorAccess().getCommaKeyword_3_7_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2422:1: ( (otherlv_39= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2423:1: (otherlv_39= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2423:1: (otherlv_39= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2424:3: otherlv_39= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	    	        }
            	    	            
            	    	    otherlv_39=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator6136); 

            	    	    		newLeafNode(otherlv_39, grammarAccess.getIndicatorAccess().getGroupsIndicatorGroupCrossReference_3_7_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);

            	    otherlv_40=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6150); 

            	        	newLeafNode(otherlv_40, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_7_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2446:4: ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2446:4: ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2447:5: {...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2447:106: ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2448:6: ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2451:6: ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+
            	    int cnt29=0;
            	    loop29:
            	    do {
            	        int alt29=2;
            	        switch ( input.LA(1) ) {
            	        case 33:
            	            {
            	            int LA29_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt29=1;
            	            }


            	            }
            	            break;
            	        case 34:
            	            {
            	            int LA29_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt29=1;
            	            }


            	            }
            	            break;
            	        case 35:
            	            {
            	            int LA29_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt29=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt29) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2451:7: {...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2451:16: ( (lv_elementLinks_41_0= ruleInLineElementLink ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2452:1: (lv_elementLinks_41_0= ruleInLineElementLink )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2452:1: (lv_elementLinks_41_0= ruleInLineElementLink )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2453:3: lv_elementLinks_41_0= ruleInLineElementLink
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getElementLinksInLineElementLinkParserRuleCall_3_8_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleInLineElementLink_in_ruleIndicator6226);
            	    	    lv_elementLinks_41_0=ruleInLineElementLink();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"elementLinks",
            	    	            		lv_elementLinks_41_0, 
            	    	            		"InLineElementLink");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt29 >= 1 ) break loop29;
            	                EarlyExitException eee =
            	                    new EarlyExitException(29, input);
            	                throw eee;
            	        }
            	        cnt29++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	

            }

            otherlv_42=(Token)match(input,15,FOLLOW_15_in_ruleIndicator6279); 

                	newLeafNode(otherlv_42, grammarAccess.getIndicatorAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2495:1: entryRuleBelief returns [EObject current=null] : iv_ruleBelief= ruleBelief EOF ;
    public final EObject entryRuleBelief() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBelief = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2496:2: (iv_ruleBelief= ruleBelief EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2497:2: iv_ruleBelief= ruleBelief EOF
            {
             newCompositeNode(grammarAccess.getBeliefRule()); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief6315);
            iv_ruleBelief=ruleBelief();

            state._fsp--;

             current =iv_ruleBelief; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief6325); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2504:1: ruleBelief returns [EObject current=null] : (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2507:28: ( (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2508:1: (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2508:1: (otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2508:3: otherlv_0= 'belief' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleBelief6362); 

                	newLeafNode(otherlv_0, grammarAccess.getBeliefAccess().getBeliefKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2512:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2513:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2513:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2514:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBelief6379); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleBelief6396); 

                	newLeafNode(otherlv_2, grammarAccess.getBeliefAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2534:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2536:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2536:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2537:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2540:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2541:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2541:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) ) )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( LA31_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2543:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2543:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2544:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2544:103: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2545:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2548:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2548:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2548:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2548:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleBelief6454); 

            	        	newLeafNode(otherlv_4, grammarAccess.getBeliefAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleBelief6466); 

            	        	newLeafNode(otherlv_5, grammarAccess.getBeliefAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2556:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2557:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2557:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2558:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelief6483); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleBelief6500); 

            	        	newLeafNode(otherlv_7, grammarAccess.getBeliefAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2585:4: ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2585:4: ({...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2586:5: {...}? => ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2586:103: ( ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2587:6: ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getBeliefAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2590:6: ({...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2590:7: {...}? => (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBelief", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2590:16: (otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2590:18: otherlv_8= 'description' ( (lv_description_9_0= RULE_STRING ) ) otherlv_10= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleBelief6568); 

            	        	newLeafNode(otherlv_8, grammarAccess.getBeliefAccess().getDescriptionKeyword_3_1_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2594:1: ( (lv_description_9_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2595:1: (lv_description_9_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2595:1: (lv_description_9_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2596:3: lv_description_9_0= RULE_STRING
            	    {
            	    lv_description_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBelief6585); 

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

            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleBelief6602); 

            	        	newLeafNode(otherlv_10, grammarAccess.getBeliefAccess().getSemicolonKeyword_3_1_2());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getBeliefAccess().getUnorderedGroup_3());
            	

            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleBelief6655); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2642:1: entryRuleDecomposition returns [EObject current=null] : iv_ruleDecomposition= ruleDecomposition EOF ;
    public final EObject entryRuleDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2643:2: (iv_ruleDecomposition= ruleDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2644:2: iv_ruleDecomposition= ruleDecomposition EOF
            {
             newCompositeNode(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition6691);
            iv_ruleDecomposition=ruleDecomposition();

            state._fsp--;

             current =iv_ruleDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition6701); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2651:1: ruleDecomposition returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposes' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2654:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposes' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2655:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposes' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2655:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'decomposes' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2655:2: ( ( ruleQualifiedName ) ) otherlv_1= 'decomposes' ( (lv_dest_2_0= ruleDecompositionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2655:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2656:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2656:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2657:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecompositionAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecomposition6749);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleDecomposition6761); 

                	newLeafNode(otherlv_1, grammarAccess.getDecompositionAccess().getDecomposesKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2674:1: ( (lv_dest_2_0= ruleDecompositionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2675:1: (lv_dest_2_0= ruleDecompositionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2675:1: (lv_dest_2_0= ruleDecompositionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2676:3: lv_dest_2_0= ruleDecompositionEnd
            {
             
            	        newCompositeNode(grammarAccess.getDecompositionAccess().getDestDecompositionEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleDecomposition6782);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2692:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==29) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2692:4: otherlv_3= ',' ( (lv_dest_4_0= ruleDecompositionEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleDecomposition6795); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDecompositionAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2696:1: ( (lv_dest_4_0= ruleDecompositionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2697:1: (lv_dest_4_0= ruleDecompositionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2697:1: (lv_dest_4_0= ruleDecompositionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2698:3: lv_dest_4_0= ruleDecompositionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDecompositionAccess().getDestDecompositionEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleDecomposition6816);
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
            	    break loop32;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDecomposition6830); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2726:1: entryRuleInLineDecomposition returns [EObject current=null] : iv_ruleInLineDecomposition= ruleInLineDecomposition EOF ;
    public final EObject entryRuleInLineDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineDecomposition = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2727:2: (iv_ruleInLineDecomposition= ruleInLineDecomposition EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2728:2: iv_ruleInLineDecomposition= ruleInLineDecomposition EOF
            {
             newCompositeNode(grammarAccess.getInLineDecompositionRule()); 
            pushFollow(FOLLOW_ruleInLineDecomposition_in_entryRuleInLineDecomposition6866);
            iv_ruleInLineDecomposition=ruleInLineDecomposition();

            state._fsp--;

             current =iv_ruleInLineDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineDecomposition6876); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2735:1: ruleInLineDecomposition returns [EObject current=null] : (otherlv_0= 'decomposes' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2738:28: ( (otherlv_0= 'decomposes' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2739:1: (otherlv_0= 'decomposes' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2739:1: (otherlv_0= 'decomposes' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2739:3: otherlv_0= 'decomposes' ( (lv_dest_1_0= ruleDecompositionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleInLineDecomposition6913); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineDecompositionAccess().getDecomposesKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2743:1: ( (lv_dest_1_0= ruleDecompositionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2744:1: (lv_dest_1_0= ruleDecompositionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2744:1: (lv_dest_1_0= ruleDecompositionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2745:3: lv_dest_1_0= ruleDecompositionEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineDecompositionAccess().getDestDecompositionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition6934);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2761:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==29) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2761:4: otherlv_2= ',' ( (lv_dest_3_0= ruleDecompositionEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleInLineDecomposition6947); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineDecompositionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2765:1: ( (lv_dest_3_0= ruleDecompositionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2766:1: (lv_dest_3_0= ruleDecompositionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2766:1: (lv_dest_3_0= ruleDecompositionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2767:3: lv_dest_3_0= ruleDecompositionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineDecompositionAccess().getDestDecompositionEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition6968);
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
            	    break loop33;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleInLineDecomposition6982); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2795:1: entryRuleDecompositionEnd returns [EObject current=null] : iv_ruleDecompositionEnd= ruleDecompositionEnd EOF ;
    public final EObject entryRuleDecompositionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecompositionEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2796:2: (iv_ruleDecompositionEnd= ruleDecompositionEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2797:2: iv_ruleDecompositionEnd= ruleDecompositionEnd EOF
            {
             newCompositeNode(grammarAccess.getDecompositionEndRule()); 
            pushFollow(FOLLOW_ruleDecompositionEnd_in_entryRuleDecompositionEnd7018);
            iv_ruleDecompositionEnd=ruleDecompositionEnd();

            state._fsp--;

             current =iv_ruleDecompositionEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecompositionEnd7028); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2804:1: ruleDecompositionEnd returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) ;
    public final EObject ruleDecompositionEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2807:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2808:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2808:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2808:2: ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2808:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2809:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2809:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2810:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecompositionEndAccess().getNameIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecompositionEnd7076);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2823:2: (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==14) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2823:4: otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDecompositionEnd7089); 

                        	newLeafNode(otherlv_1, grammarAccess.getDecompositionEndAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2827:1: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==RULE_STRING) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2828:1: (lv_description_2_0= RULE_STRING )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2828:1: (lv_description_2_0= RULE_STRING )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2829:3: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecompositionEnd7106); 

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

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDecompositionEnd7124); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2857:1: entryRuleContribution returns [EObject current=null] : iv_ruleContribution= ruleContribution EOF ;
    public final EObject entryRuleContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2858:2: (iv_ruleContribution= ruleContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2859:2: iv_ruleContribution= ruleContribution EOF
            {
             newCompositeNode(grammarAccess.getContributionRule()); 
            pushFollow(FOLLOW_ruleContribution_in_entryRuleContribution7162);
            iv_ruleContribution=ruleContribution();

            state._fsp--;

             current =iv_ruleContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContribution7172); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2866:1: ruleContribution returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributes' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2869:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributes' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2870:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributes' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2870:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'contributes' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2870:2: ( ( ruleQualifiedName ) ) otherlv_1= 'contributes' ( (lv_dest_2_0= ruleContributionEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2870:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2871:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2871:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2872:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContribution7220);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleContribution7232); 

                	newLeafNode(otherlv_1, grammarAccess.getContributionAccess().getContributesKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2889:1: ( (lv_dest_2_0= ruleContributionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2890:1: (lv_dest_2_0= ruleContributionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2890:1: (lv_dest_2_0= ruleContributionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2891:3: lv_dest_2_0= ruleContributionEnd
            {
             
            	        newCompositeNode(grammarAccess.getContributionAccess().getDestContributionEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleContributionEnd_in_ruleContribution7253);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2907:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==29) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2907:4: otherlv_3= ',' ( (lv_dest_4_0= ruleContributionEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleContribution7266); 

            	        	newLeafNode(otherlv_3, grammarAccess.getContributionAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2911:1: ( (lv_dest_4_0= ruleContributionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2912:1: (lv_dest_4_0= ruleContributionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2912:1: (lv_dest_4_0= ruleContributionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2913:3: lv_dest_4_0= ruleContributionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionAccess().getDestContributionEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionEnd_in_ruleContribution7287);
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
            	    break loop36;
                }
            } while (true);

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleContribution7301); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2941:1: entryRuleInLineContribution returns [EObject current=null] : iv_ruleInLineContribution= ruleInLineContribution EOF ;
    public final EObject entryRuleInLineContribution() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineContribution = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2942:2: (iv_ruleInLineContribution= ruleInLineContribution EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2943:2: iv_ruleInLineContribution= ruleInLineContribution EOF
            {
             newCompositeNode(grammarAccess.getInLineContributionRule()); 
            pushFollow(FOLLOW_ruleInLineContribution_in_entryRuleInLineContribution7337);
            iv_ruleInLineContribution=ruleInLineContribution();

            state._fsp--;

             current =iv_ruleInLineContribution; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineContribution7347); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2950:1: ruleInLineContribution returns [EObject current=null] : (otherlv_0= 'contributes' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineContribution() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2953:28: ( (otherlv_0= 'contributes' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2954:1: (otherlv_0= 'contributes' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2954:1: (otherlv_0= 'contributes' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2954:3: otherlv_0= 'contributes' ( (lv_dest_1_0= ruleContributionEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleInLineContribution7384); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineContributionAccess().getContributesKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2958:1: ( (lv_dest_1_0= ruleContributionEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2959:1: (lv_dest_1_0= ruleContributionEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2959:1: (lv_dest_1_0= ruleContributionEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2960:3: lv_dest_1_0= ruleContributionEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineContributionAccess().getDestContributionEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleContributionEnd_in_ruleInLineContribution7405);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2976:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==29) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2976:4: otherlv_2= ',' ( (lv_dest_3_0= ruleContributionEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleInLineContribution7418); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineContributionAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2980:1: ( (lv_dest_3_0= ruleContributionEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2981:1: (lv_dest_3_0= ruleContributionEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2981:1: (lv_dest_3_0= ruleContributionEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2982:3: lv_dest_3_0= ruleContributionEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineContributionAccess().getDestContributionEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionEnd_in_ruleInLineContribution7439);
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
            	    break loop37;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleInLineContribution7453); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3010:1: entryRuleContributionEnd returns [EObject current=null] : iv_ruleContributionEnd= ruleContributionEnd EOF ;
    public final EObject entryRuleContributionEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3011:2: (iv_ruleContributionEnd= ruleContributionEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3012:2: iv_ruleContributionEnd= ruleContributionEnd EOF
            {
             newCompositeNode(grammarAccess.getContributionEndRule()); 
            pushFollow(FOLLOW_ruleContributionEnd_in_entryRuleContributionEnd7489);
            iv_ruleContributionEnd=ruleContributionEnd();

            state._fsp--;

             current =iv_ruleContributionEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionEnd7499); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3019:1: ruleContributionEnd returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( ( (lv_contribution_2_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_3_0= RULE_INT ) ) )? otherlv_4= '}' )? ) ;
    public final EObject ruleContributionEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_quantitativeContribution_3_0=null;
        Token otherlv_4=null;
        Enumerator lv_contribution_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3022:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( ( (lv_contribution_2_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_3_0= RULE_INT ) ) )? otherlv_4= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3023:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( ( (lv_contribution_2_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_3_0= RULE_INT ) ) )? otherlv_4= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3023:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( ( (lv_contribution_2_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_3_0= RULE_INT ) ) )? otherlv_4= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3023:2: ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( ( (lv_contribution_2_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_3_0= RULE_INT ) ) )? otherlv_4= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3023:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3024:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3024:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3025:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionEndAccess().getNameIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionEnd7547);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3038:2: (otherlv_1= '{' ( ( (lv_contribution_2_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_3_0= RULE_INT ) ) )? otherlv_4= '}' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==14) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3038:4: otherlv_1= '{' ( ( (lv_contribution_2_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_3_0= RULE_INT ) ) )? otherlv_4= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleContributionEnd7560); 

                        	newLeafNode(otherlv_1, grammarAccess.getContributionEndAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3042:1: ( ( (lv_contribution_2_0= ruleContributionType ) ) | ( (lv_quantitativeContribution_3_0= RULE_INT ) ) )?
                    int alt38=3;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=74 && LA38_0<=80)) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==RULE_INT) ) {
                        alt38=2;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3042:2: ( (lv_contribution_2_0= ruleContributionType ) )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3042:2: ( (lv_contribution_2_0= ruleContributionType ) )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3043:1: (lv_contribution_2_0= ruleContributionType )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3043:1: (lv_contribution_2_0= ruleContributionType )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3044:3: lv_contribution_2_0= ruleContributionType
                            {
                             
                            	        newCompositeNode(grammarAccess.getContributionEndAccess().getContributionContributionTypeEnumRuleCall_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleContributionType_in_ruleContributionEnd7582);
                            lv_contribution_2_0=ruleContributionType();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getContributionEndRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"contribution",
                                    		lv_contribution_2_0, 
                                    		"ContributionType");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3061:6: ( (lv_quantitativeContribution_3_0= RULE_INT ) )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3061:6: ( (lv_quantitativeContribution_3_0= RULE_INT ) )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3062:1: (lv_quantitativeContribution_3_0= RULE_INT )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3062:1: (lv_quantitativeContribution_3_0= RULE_INT )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3063:3: lv_quantitativeContribution_3_0= RULE_INT
                            {
                            lv_quantitativeContribution_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionEnd7605); 

                            			newLeafNode(lv_quantitativeContribution_3_0, grammarAccess.getContributionEndAccess().getQuantitativeContributionINTTerminalRuleCall_1_1_1_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getContributionEndRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"quantitativeContribution",
                                    		lv_quantitativeContribution_3_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleContributionEnd7624); 

                        	newLeafNode(otherlv_4, grammarAccess.getContributionEndAccess().getRightCurlyBracketKeyword_1_2());
                        

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3091:1: entryRuleDependency returns [EObject current=null] : iv_ruleDependency= ruleDependency EOF ;
    public final EObject entryRuleDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3092:2: (iv_ruleDependency= ruleDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3093:2: iv_ruleDependency= ruleDependency EOF
            {
             newCompositeNode(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency7662);
            iv_ruleDependency=ruleDependency();

            state._fsp--;

             current =iv_ruleDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency7672); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3100:1: ruleDependency returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= 'depends' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_dest_2_0 = null;

        EObject lv_dest_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3103:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= 'depends' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3104:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'depends' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3104:1: ( ( ( ruleQualifiedName ) ) otherlv_1= 'depends' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3104:2: ( ( ruleQualifiedName ) ) otherlv_1= 'depends' ( (lv_dest_2_0= ruleDependencyEnd ) ) (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )* otherlv_5= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3104:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3105:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3105:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3106:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependency7720);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleDependency7732); 

                	newLeafNode(otherlv_1, grammarAccess.getDependencyAccess().getDependsKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3123:1: ( (lv_dest_2_0= ruleDependencyEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3124:1: (lv_dest_2_0= ruleDependencyEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3124:1: (lv_dest_2_0= ruleDependencyEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3125:3: lv_dest_2_0= ruleDependencyEnd
            {
             
            	        newCompositeNode(grammarAccess.getDependencyAccess().getDestDependencyEndParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyEnd_in_ruleDependency7753);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3141:2: (otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==29) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3141:4: otherlv_3= ',' ( (lv_dest_4_0= ruleDependencyEnd ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleDependency7766); 

            	        	newLeafNode(otherlv_3, grammarAccess.getDependencyAccess().getCommaKeyword_3_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3145:1: ( (lv_dest_4_0= ruleDependencyEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3146:1: (lv_dest_4_0= ruleDependencyEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3146:1: (lv_dest_4_0= ruleDependencyEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3147:3: lv_dest_4_0= ruleDependencyEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependencyAccess().getDestDependencyEndParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyEnd_in_ruleDependency7787);
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

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleDependency7801); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3175:1: entryRuleInLineDependency returns [EObject current=null] : iv_ruleInLineDependency= ruleInLineDependency EOF ;
    public final EObject entryRuleInLineDependency() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInLineDependency = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3176:2: (iv_ruleInLineDependency= ruleInLineDependency EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3177:2: iv_ruleInLineDependency= ruleInLineDependency EOF
            {
             newCompositeNode(grammarAccess.getInLineDependencyRule()); 
            pushFollow(FOLLOW_ruleInLineDependency_in_entryRuleInLineDependency7837);
            iv_ruleInLineDependency=ruleInLineDependency();

            state._fsp--;

             current =iv_ruleInLineDependency; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInLineDependency7847); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3184:1: ruleInLineDependency returns [EObject current=null] : (otherlv_0= 'depends' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' ) ;
    public final EObject ruleInLineDependency() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_dest_1_0 = null;

        EObject lv_dest_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3187:28: ( (otherlv_0= 'depends' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3188:1: (otherlv_0= 'depends' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3188:1: (otherlv_0= 'depends' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3188:3: otherlv_0= 'depends' ( (lv_dest_1_0= ruleDependencyEnd ) ) (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )* otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleInLineDependency7884); 

                	newLeafNode(otherlv_0, grammarAccess.getInLineDependencyAccess().getDependsKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3192:1: ( (lv_dest_1_0= ruleDependencyEnd ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3193:1: (lv_dest_1_0= ruleDependencyEnd )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3193:1: (lv_dest_1_0= ruleDependencyEnd )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3194:3: lv_dest_1_0= ruleDependencyEnd
            {
             
            	        newCompositeNode(grammarAccess.getInLineDependencyAccess().getDestDependencyEndParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7905);
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

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3210:2: (otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==29) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3210:4: otherlv_2= ',' ( (lv_dest_3_0= ruleDependencyEnd ) )
            	    {
            	    otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleInLineDependency7918); 

            	        	newLeafNode(otherlv_2, grammarAccess.getInLineDependencyAccess().getCommaKeyword_2_0());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3214:1: ( (lv_dest_3_0= ruleDependencyEnd ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3215:1: (lv_dest_3_0= ruleDependencyEnd )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3215:1: (lv_dest_3_0= ruleDependencyEnd )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3216:3: lv_dest_3_0= ruleDependencyEnd
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInLineDependencyAccess().getDestDependencyEndParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7939);
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

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleInLineDependency7953); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3244:1: entryRuleDependencyEnd returns [EObject current=null] : iv_ruleDependencyEnd= ruleDependencyEnd EOF ;
    public final EObject entryRuleDependencyEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyEnd = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3245:2: (iv_ruleDependencyEnd= ruleDependencyEnd EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3246:2: iv_ruleDependencyEnd= ruleDependencyEnd EOF
            {
             newCompositeNode(grammarAccess.getDependencyEndRule()); 
            pushFollow(FOLLOW_ruleDependencyEnd_in_entryRuleDependencyEnd7989);
            iv_ruleDependencyEnd=ruleDependencyEnd();

            state._fsp--;

             current =iv_ruleDependencyEnd; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyEnd7999); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3253:1: ruleDependencyEnd returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) ;
    public final EObject ruleDependencyEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_description_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3256:28: ( ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3257:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3257:1: ( ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )? )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3257:2: ( ( ruleQualifiedName ) ) (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3257:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3258:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3258:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3259:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyEndRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyEndAccess().getNameIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependencyEnd8047);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3272:2: (otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==14) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3272:4: otherlv_1= '{' ( (lv_description_2_0= RULE_STRING ) )? otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleDependencyEnd8060); 

                        	newLeafNode(otherlv_1, grammarAccess.getDependencyEndAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3276:1: ( (lv_description_2_0= RULE_STRING ) )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==RULE_STRING) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3277:1: (lv_description_2_0= RULE_STRING )
                            {
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3277:1: (lv_description_2_0= RULE_STRING )
                            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3278:3: lv_description_2_0= RULE_STRING
                            {
                            lv_description_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependencyEnd8077); 

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

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleDependencyEnd8095); 

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


    // $ANTLR start "entryRuleEvaluation"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3318:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3319:2: (iv_ruleEvaluation= ruleEvaluation EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3320:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation8145);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation8155); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3327:1: ruleEvaluation returns [EObject current=null] : (otherlv_0= 'eval' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' ) ;
    public final EObject ruleEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_evaluation_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_exceeds_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Enumerator lv_qualitativeEvaluation_10_0 = null;

        EObject lv_evalRange_17_0 = null;

        EObject lv_kpiEvalValueSet_21_0 = null;

        EObject lv_kpiNewEvalValue_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3330:28: ( (otherlv_0= 'eval' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3331:1: (otherlv_0= 'eval' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3331:1: (otherlv_0= 'eval' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3331:3: otherlv_0= 'eval' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleEvaluation8192); 

                	newLeafNode(otherlv_0, grammarAccess.getEvaluationAccess().getEvalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3335:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3336:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3336:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3337:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvaluation8209); 

            			newLeafNode(lv_name_1_0, grammarAccess.getEvaluationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getEvaluationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEvaluation8226); 

                	newLeafNode(otherlv_2, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3357:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3359:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3359:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3360:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3363:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3364:3: ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3364:3: ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+
            int cnt44=0;
            loop44:
            do {
                int alt44=8;
                int LA44_0 = input.LA(1);

                if ( LA44_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 0) ) {
                    alt44=1;
                }
                else if ( LA44_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 1) ) {
                    alt44=2;
                }
                else if ( LA44_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 2) ) {
                    alt44=3;
                }
                else if ( LA44_0 ==40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 3) ) {
                    alt44=4;
                }
                else if ( LA44_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 4) ) {
                    alt44=5;
                }
                else if ( LA44_0 ==42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 5) ) {
                    alt44=6;
                }
                else if ( LA44_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 6) ) {
                    alt44=7;
                }


                switch (alt44) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3366:4: ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3366:4: ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3367:5: {...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3367:107: ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3368:6: ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3371:6: ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3371:7: {...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3371:16: (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3371:18: otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,37,FOLLOW_37_in_ruleEvaluation8284); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEvaluationAccess().getEvaluationKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation8296); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3379:1: ( (lv_evaluation_6_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3380:1: (lv_evaluation_6_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3380:1: (lv_evaluation_6_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3381:3: lv_evaluation_6_0= RULE_INT
            	    {
            	    lv_evaluation_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluation8313); 

            	    			newLeafNode(lv_evaluation_6_0, grammarAccess.getEvaluationAccess().getEvaluationINTTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEvaluationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"evaluation",
            	            		lv_evaluation_6_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation8330); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3408:4: ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3408:4: ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3409:5: {...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3409:107: ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3410:6: ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3413:6: ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3413:7: {...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3413:16: (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3413:18: otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,38,FOLLOW_38_in_ruleEvaluation8398); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEvaluationAccess().getQualitativeEvaluationKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation8410); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3421:1: ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3422:1: (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3422:1: (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3423:3: lv_qualitativeEvaluation_10_0= ruleQualitativeLabel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleEvaluation8431);
            	    lv_qualitativeEvaluation_10_0=ruleQualitativeLabel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEvaluationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"qualitativeEvaluation",
            	            		lv_qualitativeEvaluation_10_0, 
            	            		"QualitativeLabel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation8443); 

            	        	newLeafNode(otherlv_11, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3450:4: ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3450:4: ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3451:5: {...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3451:107: ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3452:6: ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3455:6: ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3455:7: {...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3455:16: (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3455:18: otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_12=(Token)match(input,39,FOLLOW_39_in_ruleEvaluation8511); 

            	        	newLeafNode(otherlv_12, grammarAccess.getEvaluationAccess().getExceedsKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation8523); 

            	        	newLeafNode(otherlv_13, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3463:1: ( (lv_exceeds_14_0= RULE_BOOLEAN ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3464:1: (lv_exceeds_14_0= RULE_BOOLEAN )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3464:1: (lv_exceeds_14_0= RULE_BOOLEAN )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3465:3: lv_exceeds_14_0= RULE_BOOLEAN
            	    {
            	    lv_exceeds_14_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleEvaluation8540); 

            	    			newLeafNode(lv_exceeds_14_0, grammarAccess.getEvaluationAccess().getExceedsBOOLEANTerminalRuleCall_3_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEvaluationRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"exceeds",
            	            		lv_exceeds_14_0, 
            	            		"BOOLEAN");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3488:4: ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3488:4: ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3489:5: {...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3489:107: ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3490:6: ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3493:6: ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3493:7: {...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3493:16: (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3493:18: otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';'
            	    {
            	    otherlv_15=(Token)match(input,40,FOLLOW_40_in_ruleEvaluation8613); 

            	        	newLeafNode(otherlv_15, grammarAccess.getEvaluationAccess().getEvalRangeKeyword_3_3_0());
            	        
            	    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation8625); 

            	        	newLeafNode(otherlv_16, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3501:1: ( (lv_evalRange_17_0= ruleEvaluationRange ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3502:1: (lv_evalRange_17_0= ruleEvaluationRange )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3502:1: (lv_evalRange_17_0= ruleEvaluationRange )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3503:3: lv_evalRange_17_0= ruleEvaluationRange
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getEvalRangeEvaluationRangeParserRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvaluationRange_in_ruleEvaluation8646);
            	    lv_evalRange_17_0=ruleEvaluationRange();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEvaluationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"evalRange",
            	            		lv_evalRange_17_0, 
            	            		"EvaluationRange");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation8658); 

            	        	newLeafNode(otherlv_18, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3530:4: ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3530:4: ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3531:5: {...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3531:107: ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3532:6: ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3535:6: ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3535:7: {...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3535:16: (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3535:18: otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';'
            	    {
            	    otherlv_19=(Token)match(input,41,FOLLOW_41_in_ruleEvaluation8726); 

            	        	newLeafNode(otherlv_19, grammarAccess.getEvaluationAccess().getKpiEvalValueSetKeyword_3_4_0());
            	        
            	    otherlv_20=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation8738); 

            	        	newLeafNode(otherlv_20, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3543:1: ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3544:1: (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3544:1: (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3545:3: lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getKpiEvalValueSetKPIEvalValueSetParserRuleCall_3_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation8759);
            	    lv_kpiEvalValueSet_21_0=ruleKPIEvalValueSet();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEvaluationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"kpiEvalValueSet",
            	            		lv_kpiEvalValueSet_21_0, 
            	            		"KPIEvalValueSet");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation8771); 

            	        	newLeafNode(otherlv_22, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3572:4: ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3572:4: ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3573:5: {...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3573:107: ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3574:6: ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3577:6: ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3577:7: {...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3577:16: (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3577:18: otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) )
            	    {
            	    otherlv_23=(Token)match(input,42,FOLLOW_42_in_ruleEvaluation8839); 

            	        	newLeafNode(otherlv_23, grammarAccess.getEvaluationAccess().getKpiNewEvalValueKeyword_3_5_0());
            	        
            	    otherlv_24=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation8851); 

            	        	newLeafNode(otherlv_24, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3585:1: ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3586:1: (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3586:1: (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3587:3: lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getKpiNewEvalValueKPINewEvalValueParserRuleCall_3_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKPINewEvalValue_in_ruleEvaluation8872);
            	    lv_kpiNewEvalValue_25_0=ruleKPINewEvalValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getEvaluationRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"kpiNewEvalValue",
            	            		lv_kpiNewEvalValue_25_0, 
            	            		"KPINewEvalValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3610:4: ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3610:4: ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3611:5: {...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3611:107: ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3612:6: ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3615:6: ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3615:7: {...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3615:16: (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3615:18: otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';'
            	    {
            	    otherlv_26=(Token)match(input,43,FOLLOW_43_in_ruleEvaluation8940); 

            	        	newLeafNode(otherlv_26, grammarAccess.getEvaluationAccess().getInElementKeyword_3_6_0());
            	        
            	    otherlv_27=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation8952); 

            	        	newLeafNode(otherlv_27, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3623:1: ( (otherlv_28= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3624:1: (otherlv_28= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3624:1: (otherlv_28= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3625:3: otherlv_28= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEvaluationRule());
            	    	        }
            	            
            	    otherlv_28=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvaluation8972); 

            	    		newLeafNode(otherlv_28, grammarAccess.getEvaluationAccess().getInElementIntentionalElementCrossReference_3_6_2_0()); 
            	    	

            	    }


            	    }

            	    otherlv_29=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation8984); 

            	        	newLeafNode(otherlv_29, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt44 >= 1 ) break loop44;
                        EarlyExitException eee =
                            new EarlyExitException(44, input);
                        throw eee;
                }
                cnt44++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEvaluationAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canLeave(grammarAccess.getEvaluationAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	

            }

            otherlv_30=(Token)match(input,15,FOLLOW_15_in_ruleEvaluation9043); 

                	newLeafNode(otherlv_30, grammarAccess.getEvaluationAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3667:1: entryRuleEvaluationRange returns [EObject current=null] : iv_ruleEvaluationRange= ruleEvaluationRange EOF ;
    public final EObject entryRuleEvaluationRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3668:2: (iv_ruleEvaluationRange= ruleEvaluationRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3669:2: iv_ruleEvaluationRange= ruleEvaluationRange EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRangeRule()); 
            pushFollow(FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange9079);
            iv_ruleEvaluationRange=ruleEvaluationRange();

            state._fsp--;

             current =iv_ruleEvaluationRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationRange9089); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3676:1: ruleEvaluationRange returns [EObject current=null] : (otherlv_0= 'evaluationRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
    public final EObject ruleEvaluationRange() throws RecognitionException {
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3679:28: ( (otherlv_0= 'evaluationRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3680:1: (otherlv_0= 'evaluationRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3680:1: (otherlv_0= 'evaluationRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3680:3: otherlv_0= 'evaluationRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleEvaluationRange9126); 

                	newLeafNode(otherlv_0, grammarAccess.getEvaluationRangeAccess().getEvaluationRangeKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleEvaluationRange9138); 

                	newLeafNode(otherlv_1, grammarAccess.getEvaluationRangeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3688:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3690:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3690:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3691:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3694:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3695:3: ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3695:3: ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )*
            loop45:
            do {
                int alt45=4;
                int LA45_0 = input.LA(1);

                if ( LA45_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 0) ) {
                    alt45=1;
                }
                else if ( LA45_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 1) ) {
                    alt45=2;
                }
                else if ( LA45_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 2) ) {
                    alt45=3;
                }


                switch (alt45) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3697:4: ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3697:4: ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3698:5: {...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3698:112: ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3699:6: ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3702:6: ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3702:7: {...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3702:16: (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3702:18: otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';'
            	    {
            	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleEvaluationRange9196); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEvaluationRangeAccess().getStartKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange9208); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3710:1: ( (lv_start_5_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3711:1: (lv_start_5_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3711:1: (lv_start_5_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3712:3: lv_start_5_0= RULE_INT
            	    {
            	    lv_start_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange9225); 

            	    			newLeafNode(lv_start_5_0, grammarAccess.getEvaluationRangeAccess().getStartINTTerminalRuleCall_2_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEvaluationRangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"start",
            	            		lv_start_5_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange9242); 

            	        	newLeafNode(otherlv_6, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_2_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3739:4: ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3739:4: ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3740:5: {...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3740:112: ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3741:6: ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3744:6: ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3744:7: {...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3744:16: (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3744:18: otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleEvaluationRange9310); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEvaluationRangeAccess().getEndKeyword_2_1_0());
            	        
            	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange9322); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3752:1: ( (lv_end_9_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3753:1: (lv_end_9_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3753:1: (lv_end_9_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3754:3: lv_end_9_0= RULE_INT
            	    {
            	    lv_end_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange9339); 

            	    			newLeafNode(lv_end_9_0, grammarAccess.getEvaluationRangeAccess().getEndINTTerminalRuleCall_2_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEvaluationRangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"end",
            	            		lv_end_9_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange9356); 

            	        	newLeafNode(otherlv_10, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_2_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3781:4: ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3781:4: ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3782:5: {...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3782:112: ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3783:6: ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3786:6: ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3786:7: {...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3786:16: (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3786:18: otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';'
            	    {
            	    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleEvaluationRange9424); 

            	        	newLeafNode(otherlv_11, grammarAccess.getEvaluationRangeAccess().getStepKeyword_2_2_0());
            	        
            	    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange9436); 

            	        	newLeafNode(otherlv_12, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3794:1: ( (lv_step_13_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3795:1: (lv_step_13_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3795:1: (lv_step_13_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3796:3: lv_step_13_0= RULE_INT
            	    {
            	    lv_step_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange9453); 

            	    			newLeafNode(lv_step_13_0, grammarAccess.getEvaluationRangeAccess().getStepINTTerminalRuleCall_2_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEvaluationRangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"step",
            	            		lv_step_13_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange9470); 

            	        	newLeafNode(otherlv_14, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_2_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2());
            	

            }

            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleEvaluationRange9523); 

                	newLeafNode(otherlv_15, grammarAccess.getEvaluationRangeAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleContributionChange"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3846:1: entryRuleContributionChange returns [EObject current=null] : iv_ruleContributionChange= ruleContributionChange EOF ;
    public final EObject entryRuleContributionChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionChange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3847:2: (iv_ruleContributionChange= ruleContributionChange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3848:2: iv_ruleContributionChange= ruleContributionChange EOF
            {
             newCompositeNode(grammarAccess.getContributionChangeRule()); 
            pushFollow(FOLLOW_ruleContributionChange_in_entryRuleContributionChange9563);
            iv_ruleContributionChange=ruleContributionChange();

            state._fsp--;

             current =iv_ruleContributionChange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionChange9573); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3855:1: ruleContributionChange returns [EObject current=null] : (otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) ) ) otherlv_16= '}' ) ;
    public final EObject ruleContributionChange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_newQuantitativeContribution_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Enumerator lv_newContribution_6_0 = null;

        EObject lv_contribRange_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3858:28: ( (otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) ) ) otherlv_16= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3859:1: (otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) ) ) otherlv_16= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3859:1: (otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) ) ) otherlv_16= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3859:3: otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleContributionChange9610); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionChangeAccess().getContributionChangeKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3863:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3864:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3864:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3865:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionChange9627); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContributionChange9644); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionChangeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3885:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3887:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3887:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3888:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3891:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3892:3: ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3892:3: ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )*
            loop46:
            do {
                int alt46=4;
                int LA46_0 = input.LA(1);

                if ( LA46_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 1) ) {
                    alt46=2;
                }
                else if ( LA46_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 2) ) {
                    alt46=3;
                }


                switch (alt46) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3894:4: ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3894:4: ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3895:5: {...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3895:115: ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3896:6: ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3899:6: ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3899:7: {...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3899:16: (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3899:18: otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,49,FOLLOW_49_in_ruleContributionChange9702); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionChangeAccess().getNewContributionKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleContributionChange9714); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContributionChangeAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3907:1: ( (lv_newContribution_6_0= ruleContributionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3908:1: (lv_newContribution_6_0= ruleContributionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3908:1: (lv_newContribution_6_0= ruleContributionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3909:3: lv_newContribution_6_0= ruleContributionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getNewContributionContributionTypeEnumRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionType_in_ruleContributionChange9735);
            	    lv_newContribution_6_0=ruleContributionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContributionChangeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"newContribution",
            	            		lv_newContribution_6_0, 
            	            		"ContributionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleContributionChange9747); 

            	        	newLeafNode(otherlv_7, grammarAccess.getContributionChangeAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3936:4: ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3936:4: ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3937:5: {...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3937:115: ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3938:6: ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3941:6: ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3941:7: {...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3941:16: (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3941:18: otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleContributionChange9815); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionChangeAccess().getNewQuantitativeContributionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleContributionChange9827); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContributionChangeAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3949:1: ( (lv_newQuantitativeContribution_10_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3950:1: (lv_newQuantitativeContribution_10_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3950:1: (lv_newQuantitativeContribution_10_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3951:3: lv_newQuantitativeContribution_10_0= RULE_INT
            	    {
            	    lv_newQuantitativeContribution_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionChange9844); 

            	    			newLeafNode(lv_newQuantitativeContribution_10_0, grammarAccess.getContributionChangeAccess().getNewQuantitativeContributionINTTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionChangeRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"newQuantitativeContribution",
            	            		lv_newQuantitativeContribution_10_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleContributionChange9861); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContributionChangeAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3978:4: ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3978:4: ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3979:5: {...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3979:115: ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3980:6: ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3983:6: ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3983:7: {...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3983:16: (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3983:18: otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,51,FOLLOW_51_in_ruleContributionChange9929); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContributionChangeAccess().getContribRangeKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleContributionChange9941); 

            	        	newLeafNode(otherlv_13, grammarAccess.getContributionChangeAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3991:1: ( (lv_contribRange_14_0= ruleContributionRange ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3992:1: (lv_contribRange_14_0= ruleContributionRange )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3992:1: (lv_contribRange_14_0= ruleContributionRange )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3993:3: lv_contribRange_14_0= ruleContributionRange
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getContribRangeContributionRangeParserRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionRange_in_ruleContributionChange9962);
            	    lv_contribRange_14_0=ruleContributionRange();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContributionChangeRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"contribRange",
            	            		lv_contribRange_14_0, 
            	            		"ContributionRange");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleContributionChange9974); 

            	        	newLeafNode(otherlv_15, grammarAccess.getContributionChangeAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3());
            	

            }

            otherlv_16=(Token)match(input,15,FOLLOW_15_in_ruleContributionChange10027); 

                	newLeafNode(otherlv_16, grammarAccess.getContributionChangeAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4039:1: entryRuleContributionRange returns [EObject current=null] : iv_ruleContributionRange= ruleContributionRange EOF ;
    public final EObject entryRuleContributionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4040:2: (iv_ruleContributionRange= ruleContributionRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4041:2: iv_ruleContributionRange= ruleContributionRange EOF
            {
             newCompositeNode(grammarAccess.getContributionRangeRule()); 
            pushFollow(FOLLOW_ruleContributionRange_in_entryRuleContributionRange10063);
            iv_ruleContributionRange=ruleContributionRange();

            state._fsp--;

             current =iv_ruleContributionRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionRange10073); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4048:1: ruleContributionRange returns [EObject current=null] : (otherlv_0= 'contributionRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4051:28: ( (otherlv_0= 'contributionRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4052:1: (otherlv_0= 'contributionRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4052:1: (otherlv_0= 'contributionRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4052:3: otherlv_0= 'contributionRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleContributionRange10110); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionRangeAccess().getContributionRangeKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleContributionRange10122); 

                	newLeafNode(otherlv_1, grammarAccess.getContributionRangeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4060:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4062:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4062:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4063:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4066:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4067:3: ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4067:3: ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )*
            loop47:
            do {
                int alt47=4;
                int LA47_0 = input.LA(1);

                if ( LA47_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 0) ) {
                    alt47=1;
                }
                else if ( LA47_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 1) ) {
                    alt47=2;
                }
                else if ( LA47_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 2) ) {
                    alt47=3;
                }


                switch (alt47) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4069:4: ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4069:4: ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4070:5: {...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4070:114: ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4071:6: ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4074:6: ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4074:7: {...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4074:16: (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4074:18: otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';'
            	    {
            	    otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleContributionRange10180); 

            	        	newLeafNode(otherlv_3, grammarAccess.getContributionRangeAccess().getStartKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange10192); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4082:1: ( (lv_start_5_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4083:1: (lv_start_5_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4083:1: (lv_start_5_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4084:3: lv_start_5_0= RULE_INT
            	    {
            	    lv_start_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange10209); 

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

            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange10226); 

            	        	newLeafNode(otherlv_6, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_2_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4111:4: ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4111:4: ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4112:5: {...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4112:114: ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4113:6: ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4116:6: ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4116:7: {...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4116:16: (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4116:18: otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,46,FOLLOW_46_in_ruleContributionRange10294); 

            	        	newLeafNode(otherlv_7, grammarAccess.getContributionRangeAccess().getEndKeyword_2_1_0());
            	        
            	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange10306); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4124:1: ( (lv_end_9_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4125:1: (lv_end_9_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4125:1: (lv_end_9_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4126:3: lv_end_9_0= RULE_INT
            	    {
            	    lv_end_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange10323); 

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

            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange10340); 

            	        	newLeafNode(otherlv_10, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_2_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4153:4: ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4153:4: ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4154:5: {...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4154:114: ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4155:6: ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4158:6: ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4158:7: {...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4158:16: (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4158:18: otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';'
            	    {
            	    otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleContributionRange10408); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContributionRangeAccess().getStepKeyword_2_2_0());
            	        
            	    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange10420); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4166:1: ( (lv_step_13_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4167:1: (lv_step_13_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4167:1: (lv_step_13_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4168:3: lv_step_13_0= RULE_INT
            	    {
            	    lv_step_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange10437); 

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

            	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange10454); 

            	        	newLeafNode(otherlv_14, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_2_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2());
            	

            }

            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleContributionRange10507); 

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


    // $ANTLR start "entryRuleQualitativeMappings"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4214:1: entryRuleQualitativeMappings returns [EObject current=null] : iv_ruleQualitativeMappings= ruleQualitativeMappings EOF ;
    public final EObject entryRuleQualitativeMappings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeMappings = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4215:2: (iv_ruleQualitativeMappings= ruleQualitativeMappings EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4216:2: iv_ruleQualitativeMappings= ruleQualitativeMappings EOF
            {
             newCompositeNode(grammarAccess.getQualitativeMappingsRule()); 
            pushFollow(FOLLOW_ruleQualitativeMappings_in_entryRuleQualitativeMappings10543);
            iv_ruleQualitativeMappings=ruleQualitativeMappings();

            state._fsp--;

             current =iv_ruleQualitativeMappings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitativeMappings10553); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualitativeMappings"


    // $ANTLR start "ruleQualitativeMappings"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4223:1: ruleQualitativeMappings returns [EObject current=null] : (otherlv_0= 'qualitativeMappings' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) ) ) otherlv_11= '}' ) ;
    public final EObject ruleQualitativeMappings() throws RecognitionException {
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
        Token otherlv_11=null;
        EObject lv_mappin_10_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4226:28: ( (otherlv_0= 'qualitativeMappings' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) ) ) otherlv_11= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4227:1: (otherlv_0= 'qualitativeMappings' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) ) ) otherlv_11= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4227:1: (otherlv_0= 'qualitativeMappings' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) ) ) otherlv_11= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4227:3: otherlv_0= 'qualitativeMappings' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleQualitativeMappings10590); 

                	newLeafNode(otherlv_0, grammarAccess.getQualitativeMappingsAccess().getQualitativeMappingsKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4231:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4232:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4232:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4233:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeMappings10607); 

            			newLeafNode(lv_name_1_0, grammarAccess.getQualitativeMappingsAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getQualitativeMappingsRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleQualitativeMappings10624); 

                	newLeafNode(otherlv_2, grammarAccess.getQualitativeMappingsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4253:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4255:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4255:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4256:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4259:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4260:3: ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4260:3: ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )*
            loop51:
            do {
                int alt51=3;
                int LA51_0 = input.LA(1);

                if ( LA51_0 ==41 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 0) ) {
                    alt51=1;
                }
                else if ( LA51_0 ==60 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 1) ) {
                    alt51=2;
                }


                switch (alt51) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4262:4: ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4262:4: ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4263:5: {...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMappings", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4263:116: ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4264:6: ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4267:6: ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+
            	    int cnt49=0;
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( (LA49_0==41) ) {
            	            int LA49_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt49=1;
            	            }


            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4267:7: {...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleQualitativeMappings", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4267:16: (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4267:18: otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';'
            	    	    {
            	    	    otherlv_4=(Token)match(input,41,FOLLOW_41_in_ruleQualitativeMappings10682); 

            	    	        	newLeafNode(otherlv_4, grammarAccess.getQualitativeMappingsAccess().getKpiEvalValueSetKeyword_3_0_0());
            	    	        
            	    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleQualitativeMappings10694); 

            	    	        	newLeafNode(otherlv_5, grammarAccess.getQualitativeMappingsAccess().getEqualsSignKeyword_3_0_1());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4275:1: ( (otherlv_6= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4276:1: (otherlv_6= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4276:1: (otherlv_6= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4277:3: otherlv_6= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getQualitativeMappingsRule());
            	    	    	        }
            	    	            
            	    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeMappings10714); 

            	    	    		newLeafNode(otherlv_6, grammarAccess.getQualitativeMappingsAccess().getKpiEvalValueSetKPIEvalValueSetCrossReference_3_0_2_0()); 
            	    	    	

            	    	    }


            	    	    }

            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4288:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            	    	    loop48:
            	    	    do {
            	    	        int alt48=2;
            	    	        int LA48_0 = input.LA(1);

            	    	        if ( (LA48_0==29) ) {
            	    	            alt48=1;
            	    	        }


            	    	        switch (alt48) {
            	    	    	case 1 :
            	    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4288:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    	    	    {
            	    	    	    otherlv_7=(Token)match(input,29,FOLLOW_29_in_ruleQualitativeMappings10727); 

            	    	    	        	newLeafNode(otherlv_7, grammarAccess.getQualitativeMappingsAccess().getCommaKeyword_3_0_3_0());
            	    	    	        
            	    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4292:1: ( (otherlv_8= RULE_ID ) )
            	    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4293:1: (otherlv_8= RULE_ID )
            	    	    	    {
            	    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4293:1: (otherlv_8= RULE_ID )
            	    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4294:3: otherlv_8= RULE_ID
            	    	    	    {

            	    	    	    			if (current==null) {
            	    	    	    	            current = createModelElement(grammarAccess.getQualitativeMappingsRule());
            	    	    	    	        }
            	    	    	            
            	    	    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeMappings10747); 

            	    	    	    		newLeafNode(otherlv_8, grammarAccess.getQualitativeMappingsAccess().getKpiEvalValueSetKPIEvalValueSetCrossReference_3_0_3_1_0()); 
            	    	    	    	

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop48;
            	    	        }
            	    	    } while (true);

            	    	    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleQualitativeMappings10761); 

            	    	        	newLeafNode(otherlv_9, grammarAccess.getQualitativeMappingsAccess().getSemicolonKeyword_3_0_4());
            	    	        

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4316:4: ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4316:4: ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4317:5: {...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMappings", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4317:116: ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4318:6: ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4321:6: ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+
            	    int cnt50=0;
            	    loop50:
            	    do {
            	        int alt50=2;
            	        int LA50_0 = input.LA(1);

            	        if ( (LA50_0==60) ) {
            	            int LA50_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt50=1;
            	            }


            	        }


            	        switch (alt50) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4321:7: {...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleQualitativeMappings", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4321:16: ( (lv_mappin_10_0= ruleQualitativeMapping ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4322:1: (lv_mappin_10_0= ruleQualitativeMapping )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4322:1: (lv_mappin_10_0= ruleQualitativeMapping )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4323:3: lv_mappin_10_0= ruleQualitativeMapping
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getQualitativeMappingsAccess().getMappinQualitativeMappingParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualitativeMapping_in_ruleQualitativeMappings10838);
            	    	    lv_mappin_10_0=ruleQualitativeMapping();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getQualitativeMappingsRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"mappin",
            	    	            		lv_mappin_10_0, 
            	    	            		"QualitativeMapping");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt50 >= 1 ) break loop50;
            	                EarlyExitException eee =
            	                    new EarlyExitException(50, input);
            	                throw eee;
            	        }
            	        cnt50++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3());
            	

            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleQualitativeMappings10891); 

                	newLeafNode(otherlv_11, grammarAccess.getQualitativeMappingsAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualitativeMappings"


    // $ANTLR start "entryRuleKPIEvalValueSet"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4365:1: entryRuleKPIEvalValueSet returns [EObject current=null] : iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF ;
    public final EObject entryRuleKPIEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4366:2: (iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4367:2: iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet10927);
            iv_ruleKPIEvalValueSet=ruleKPIEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIEvalValueSet10937); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4374:1: ruleKPIEvalValueSet returns [EObject current=null] : (otherlv_0= 'kpiEvalValueSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' ) ;
    public final EObject ruleKPIEvalValueSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_targetValue_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_thresholdValue_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_worstValue_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_evaluationValue_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_unit_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_qualitativeEvaluationValue_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4377:28: ( (otherlv_0= 'kpiEvalValueSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4378:1: (otherlv_0= 'kpiEvalValueSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4378:1: (otherlv_0= 'kpiEvalValueSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4378:3: otherlv_0= 'kpiEvalValueSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleKPIEvalValueSet10974); 

                	newLeafNode(otherlv_0, grammarAccess.getKPIEvalValueSetAccess().getKpiEvalValueSetKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4382:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4383:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4383:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4384:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKPIEvalValueSet10991); 

            			newLeafNode(lv_name_1_0, grammarAccess.getKPIEvalValueSetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKPIEvalValueSetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleKPIEvalValueSet11008); 

                	newLeafNode(otherlv_2, grammarAccess.getKPIEvalValueSetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4404:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4406:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4406:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4407:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4410:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4411:3: ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4411:3: ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )*
            loop52:
            do {
                int alt52=7;
                int LA52_0 = input.LA(1);

                if ( LA52_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 0) ) {
                    alt52=1;
                }
                else if ( LA52_0 ==55 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 1) ) {
                    alt52=2;
                }
                else if ( LA52_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 2) ) {
                    alt52=3;
                }
                else if ( LA52_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 3) ) {
                    alt52=4;
                }
                else if ( LA52_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 4) ) {
                    alt52=5;
                }
                else if ( LA52_0 ==59 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 5) ) {
                    alt52=6;
                }


                switch (alt52) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4413:4: ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4413:4: ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4414:5: {...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4414:112: ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4415:6: ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4418:6: ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4418:7: {...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4418:16: (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4418:18: otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleKPIEvalValueSet11066); 

            	        	newLeafNode(otherlv_4, grammarAccess.getKPIEvalValueSetAccess().getTargetValueKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleKPIEvalValueSet11078); 

            	        	newLeafNode(otherlv_5, grammarAccess.getKPIEvalValueSetAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4426:1: ( (lv_targetValue_6_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4427:1: (lv_targetValue_6_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4427:1: (lv_targetValue_6_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4428:3: lv_targetValue_6_0= RULE_DOUBLE
            	    {
            	    lv_targetValue_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet11095); 

            	    			newLeafNode(lv_targetValue_6_0, grammarAccess.getKPIEvalValueSetAccess().getTargetValueDOUBLETerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIEvalValueSetRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"targetValue",
            	            		lv_targetValue_6_0, 
            	            		"DOUBLE");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleKPIEvalValueSet11112); 

            	        	newLeafNode(otherlv_7, grammarAccess.getKPIEvalValueSetAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4455:4: ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4455:4: ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4456:5: {...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4456:112: ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4457:6: ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4460:6: ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4460:7: {...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4460:16: (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4460:18: otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,55,FOLLOW_55_in_ruleKPIEvalValueSet11180); 

            	        	newLeafNode(otherlv_8, grammarAccess.getKPIEvalValueSetAccess().getThresholdValueKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleKPIEvalValueSet11192); 

            	        	newLeafNode(otherlv_9, grammarAccess.getKPIEvalValueSetAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4468:1: ( (lv_thresholdValue_10_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4469:1: (lv_thresholdValue_10_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4469:1: (lv_thresholdValue_10_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4470:3: lv_thresholdValue_10_0= RULE_DOUBLE
            	    {
            	    lv_thresholdValue_10_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet11209); 

            	    			newLeafNode(lv_thresholdValue_10_0, grammarAccess.getKPIEvalValueSetAccess().getThresholdValueDOUBLETerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIEvalValueSetRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"thresholdValue",
            	            		lv_thresholdValue_10_0, 
            	            		"DOUBLE");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleKPIEvalValueSet11226); 

            	        	newLeafNode(otherlv_11, grammarAccess.getKPIEvalValueSetAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4497:4: ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4497:4: ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4498:5: {...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4498:112: ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4499:6: ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4502:6: ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4502:7: {...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4502:16: (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4502:18: otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,56,FOLLOW_56_in_ruleKPIEvalValueSet11294); 

            	        	newLeafNode(otherlv_12, grammarAccess.getKPIEvalValueSetAccess().getWorstValueKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleKPIEvalValueSet11306); 

            	        	newLeafNode(otherlv_13, grammarAccess.getKPIEvalValueSetAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4510:1: ( (lv_worstValue_14_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4511:1: (lv_worstValue_14_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4511:1: (lv_worstValue_14_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4512:3: lv_worstValue_14_0= RULE_DOUBLE
            	    {
            	    lv_worstValue_14_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet11323); 

            	    			newLeafNode(lv_worstValue_14_0, grammarAccess.getKPIEvalValueSetAccess().getWorstValueDOUBLETerminalRuleCall_3_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIEvalValueSetRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"worstValue",
            	            		lv_worstValue_14_0, 
            	            		"DOUBLE");
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleKPIEvalValueSet11340); 

            	        	newLeafNode(otherlv_15, grammarAccess.getKPIEvalValueSetAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4539:4: ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4539:4: ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4540:5: {...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4540:112: ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4541:6: ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4544:6: ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4544:7: {...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4544:16: (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4544:18: otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,57,FOLLOW_57_in_ruleKPIEvalValueSet11408); 

            	        	newLeafNode(otherlv_16, grammarAccess.getKPIEvalValueSetAccess().getEvaluationValueKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleKPIEvalValueSet11420); 

            	        	newLeafNode(otherlv_17, grammarAccess.getKPIEvalValueSetAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4552:1: ( (lv_evaluationValue_18_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4553:1: (lv_evaluationValue_18_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4553:1: (lv_evaluationValue_18_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4554:3: lv_evaluationValue_18_0= RULE_DOUBLE
            	    {
            	    lv_evaluationValue_18_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet11437); 

            	    			newLeafNode(lv_evaluationValue_18_0, grammarAccess.getKPIEvalValueSetAccess().getEvaluationValueDOUBLETerminalRuleCall_3_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIEvalValueSetRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"evaluationValue",
            	            		lv_evaluationValue_18_0, 
            	            		"DOUBLE");
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleKPIEvalValueSet11454); 

            	        	newLeafNode(otherlv_19, grammarAccess.getKPIEvalValueSetAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4581:4: ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4581:4: ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4582:5: {...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4582:112: ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4583:6: ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4586:6: ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4586:7: {...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4586:16: (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4586:18: otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,58,FOLLOW_58_in_ruleKPIEvalValueSet11522); 

            	        	newLeafNode(otherlv_20, grammarAccess.getKPIEvalValueSetAccess().getUnitKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleKPIEvalValueSet11534); 

            	        	newLeafNode(otherlv_21, grammarAccess.getKPIEvalValueSetAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4594:1: ( (lv_unit_22_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4595:1: (lv_unit_22_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4595:1: (lv_unit_22_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4596:3: lv_unit_22_0= RULE_STRING
            	    {
            	    lv_unit_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKPIEvalValueSet11551); 

            	    			newLeafNode(lv_unit_22_0, grammarAccess.getKPIEvalValueSetAccess().getUnitSTRINGTerminalRuleCall_3_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIEvalValueSetRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"unit",
            	            		lv_unit_22_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleKPIEvalValueSet11568); 

            	        	newLeafNode(otherlv_23, grammarAccess.getKPIEvalValueSetAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4623:4: ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4623:4: ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4624:5: {...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4624:112: ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4625:6: ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4628:6: ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4628:7: {...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4628:16: (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4628:18: otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,59,FOLLOW_59_in_ruleKPIEvalValueSet11636); 

            	        	newLeafNode(otherlv_24, grammarAccess.getKPIEvalValueSetAccess().getQualitativeEvaluationValueKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,18,FOLLOW_18_in_ruleKPIEvalValueSet11648); 

            	        	newLeafNode(otherlv_25, grammarAccess.getKPIEvalValueSetAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4636:1: ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4637:1: (lv_qualitativeEvaluationValue_26_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4637:1: (lv_qualitativeEvaluationValue_26_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4638:3: lv_qualitativeEvaluationValue_26_0= RULE_STRING
            	    {
            	    lv_qualitativeEvaluationValue_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKPIEvalValueSet11665); 

            	    			newLeafNode(lv_qualitativeEvaluationValue_26_0, grammarAccess.getKPIEvalValueSetAccess().getQualitativeEvaluationValueSTRINGTerminalRuleCall_3_5_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIEvalValueSetRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"qualitativeEvaluationValue",
            	            		lv_qualitativeEvaluationValue_26_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,19,FOLLOW_19_in_ruleKPIEvalValueSet11682); 

            	        	newLeafNode(otherlv_27, grammarAccess.getKPIEvalValueSetAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	

            }

            otherlv_28=(Token)match(input,15,FOLLOW_15_in_ruleKPIEvalValueSet11735); 

                	newLeafNode(otherlv_28, grammarAccess.getKPIEvalValueSetAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleQualitativeMapping"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4684:1: entryRuleQualitativeMapping returns [EObject current=null] : iv_ruleQualitativeMapping= ruleQualitativeMapping EOF ;
    public final EObject entryRuleQualitativeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeMapping = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4685:2: (iv_ruleQualitativeMapping= ruleQualitativeMapping EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4686:2: iv_ruleQualitativeMapping= ruleQualitativeMapping EOF
            {
             newCompositeNode(grammarAccess.getQualitativeMappingRule()); 
            pushFollow(FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping11771);
            iv_ruleQualitativeMapping=ruleQualitativeMapping();

            state._fsp--;

             current =iv_ruleQualitativeMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitativeMapping11781); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4693:1: ruleQualitativeMapping returns [EObject current=null] : (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= '}' ) ;
    public final EObject ruleQualitativeMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_realWorldLabel_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_evaluation_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_exceeds_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Enumerator lv_qualitativeEvaluation_14_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4696:28: ( (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4697:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4697:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4697:3: otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleQualitativeMapping11818); 

                	newLeafNode(otherlv_0, grammarAccess.getQualitativeMappingAccess().getQualitativeMappingKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4701:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4702:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4702:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4703:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeMapping11835); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleQualitativeMapping11852); 

                	newLeafNode(otherlv_2, grammarAccess.getQualitativeMappingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4723:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4725:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4725:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4726:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4729:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4730:3: ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4730:3: ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )*
            loop53:
            do {
                int alt53=5;
                int LA53_0 = input.LA(1);

                if ( LA53_0 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0) ) {
                    alt53=1;
                }
                else if ( LA53_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1) ) {
                    alt53=2;
                }
                else if ( LA53_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 2) ) {
                    alt53=3;
                }
                else if ( LA53_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 3) ) {
                    alt53=4;
                }


                switch (alt53) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4732:4: ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4732:4: ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4733:5: {...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4733:115: ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4734:6: ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4737:6: ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4737:7: {...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4737:16: (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4737:18: otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,61,FOLLOW_61_in_ruleQualitativeMapping11910); 

            	        	newLeafNode(otherlv_4, grammarAccess.getQualitativeMappingAccess().getRealWorldLabelKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleQualitativeMapping11922); 

            	        	newLeafNode(otherlv_5, grammarAccess.getQualitativeMappingAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4745:1: ( (lv_realWorldLabel_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4746:1: (lv_realWorldLabel_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4746:1: (lv_realWorldLabel_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4747:3: lv_realWorldLabel_6_0= RULE_STRING
            	    {
            	    lv_realWorldLabel_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQualitativeMapping11939); 

            	    			newLeafNode(lv_realWorldLabel_6_0, grammarAccess.getQualitativeMappingAccess().getRealWorldLabelSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQualitativeMappingRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"realWorldLabel",
            	            		lv_realWorldLabel_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleQualitativeMapping11956); 

            	        	newLeafNode(otherlv_7, grammarAccess.getQualitativeMappingAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4774:4: ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4774:4: ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4775:5: {...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4775:115: ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4776:6: ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4779:6: ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4779:7: {...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4779:16: (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4779:18: otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,37,FOLLOW_37_in_ruleQualitativeMapping12024); 

            	        	newLeafNode(otherlv_8, grammarAccess.getQualitativeMappingAccess().getEvaluationKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleQualitativeMapping12036); 

            	        	newLeafNode(otherlv_9, grammarAccess.getQualitativeMappingAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4787:1: ( (lv_evaluation_10_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4788:1: (lv_evaluation_10_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4788:1: (lv_evaluation_10_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4789:3: lv_evaluation_10_0= RULE_INT
            	    {
            	    lv_evaluation_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQualitativeMapping12053); 

            	    			newLeafNode(lv_evaluation_10_0, grammarAccess.getQualitativeMappingAccess().getEvaluationINTTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQualitativeMappingRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"evaluation",
            	            		lv_evaluation_10_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleQualitativeMapping12070); 

            	        	newLeafNode(otherlv_11, grammarAccess.getQualitativeMappingAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4816:4: ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4816:4: ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4817:5: {...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4817:115: ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4818:6: ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4821:6: ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4821:7: {...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4821:16: (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4821:18: otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,38,FOLLOW_38_in_ruleQualitativeMapping12138); 

            	        	newLeafNode(otherlv_12, grammarAccess.getQualitativeMappingAccess().getQualitativeEvaluationKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleQualitativeMapping12150); 

            	        	newLeafNode(otherlv_13, grammarAccess.getQualitativeMappingAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4829:1: ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4830:1: (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4830:1: (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4831:3: lv_qualitativeEvaluation_14_0= ruleQualitativeLabel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQualitativeMappingAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleQualitativeMapping12171);
            	    lv_qualitativeEvaluation_14_0=ruleQualitativeLabel();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQualitativeMappingRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"qualitativeEvaluation",
            	            		lv_qualitativeEvaluation_14_0, 
            	            		"QualitativeLabel");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleQualitativeMapping12183); 

            	        	newLeafNode(otherlv_15, grammarAccess.getQualitativeMappingAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4858:4: ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4858:4: ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4859:5: {...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4859:115: ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4860:6: ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4863:6: ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4863:7: {...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4863:16: (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4863:18: otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,39,FOLLOW_39_in_ruleQualitativeMapping12251); 

            	        	newLeafNode(otherlv_16, grammarAccess.getQualitativeMappingAccess().getExceedsKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleQualitativeMapping12263); 

            	        	newLeafNode(otherlv_17, grammarAccess.getQualitativeMappingAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4871:1: ( (lv_exceeds_18_0= RULE_BOOLEAN ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4872:1: (lv_exceeds_18_0= RULE_BOOLEAN )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4872:1: (lv_exceeds_18_0= RULE_BOOLEAN )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4873:3: lv_exceeds_18_0= RULE_BOOLEAN
            	    {
            	    lv_exceeds_18_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleQualitativeMapping12280); 

            	    			newLeafNode(lv_exceeds_18_0, grammarAccess.getQualitativeMappingAccess().getExceedsBOOLEANTerminalRuleCall_3_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getQualitativeMappingRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"exceeds",
            	            		lv_exceeds_18_0, 
            	            		"BOOLEAN");
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleQualitativeMapping12297); 

            	        	newLeafNode(otherlv_19, grammarAccess.getQualitativeMappingAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	

            }

            otherlv_20=(Token)match(input,15,FOLLOW_15_in_ruleQualitativeMapping12350); 

                	newLeafNode(otherlv_20, grammarAccess.getQualitativeMappingAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleKPINewEvalValue"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4919:1: entryRuleKPINewEvalValue returns [EObject current=null] : iv_ruleKPINewEvalValue= ruleKPINewEvalValue EOF ;
    public final EObject entryRuleKPINewEvalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPINewEvalValue = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4920:2: (iv_ruleKPINewEvalValue= ruleKPINewEvalValue EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4921:2: iv_ruleKPINewEvalValue= ruleKPINewEvalValue EOF
            {
             newCompositeNode(grammarAccess.getKPINewEvalValueRule()); 
            pushFollow(FOLLOW_ruleKPINewEvalValue_in_entryRuleKPINewEvalValue12386);
            iv_ruleKPINewEvalValue=ruleKPINewEvalValue();

            state._fsp--;

             current =iv_ruleKPINewEvalValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPINewEvalValue12396); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKPINewEvalValue"


    // $ANTLR start "ruleKPINewEvalValue"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4928:1: ruleKPINewEvalValue returns [EObject current=null] : (otherlv_0= 'kpiNewEvalValue' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'evaluationValue' otherlv_4= '=' ( (lv_evaluationValue_5_0= RULE_DOUBLE ) ) otherlv_6= ';' otherlv_7= '}' ) ;
    public final EObject ruleKPINewEvalValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_evaluationValue_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4931:28: ( (otherlv_0= 'kpiNewEvalValue' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'evaluationValue' otherlv_4= '=' ( (lv_evaluationValue_5_0= RULE_DOUBLE ) ) otherlv_6= ';' otherlv_7= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4932:1: (otherlv_0= 'kpiNewEvalValue' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'evaluationValue' otherlv_4= '=' ( (lv_evaluationValue_5_0= RULE_DOUBLE ) ) otherlv_6= ';' otherlv_7= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4932:1: (otherlv_0= 'kpiNewEvalValue' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'evaluationValue' otherlv_4= '=' ( (lv_evaluationValue_5_0= RULE_DOUBLE ) ) otherlv_6= ';' otherlv_7= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4932:3: otherlv_0= 'kpiNewEvalValue' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'evaluationValue' otherlv_4= '=' ( (lv_evaluationValue_5_0= RULE_DOUBLE ) ) otherlv_6= ';' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleKPINewEvalValue12433); 

                	newLeafNode(otherlv_0, grammarAccess.getKPINewEvalValueAccess().getKpiNewEvalValueKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4936:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4937:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4937:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4938:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKPINewEvalValue12450); 

            			newLeafNode(lv_name_1_0, grammarAccess.getKPINewEvalValueAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKPINewEvalValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleKPINewEvalValue12467); 

                	newLeafNode(otherlv_2, grammarAccess.getKPINewEvalValueAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleKPINewEvalValue12479); 

                	newLeafNode(otherlv_3, grammarAccess.getKPINewEvalValueAccess().getEvaluationValueKeyword_3());
                
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleKPINewEvalValue12491); 

                	newLeafNode(otherlv_4, grammarAccess.getKPINewEvalValueAccess().getEqualsSignKeyword_4());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4966:1: ( (lv_evaluationValue_5_0= RULE_DOUBLE ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4967:1: (lv_evaluationValue_5_0= RULE_DOUBLE )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4967:1: (lv_evaluationValue_5_0= RULE_DOUBLE )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4968:3: lv_evaluationValue_5_0= RULE_DOUBLE
            {
            lv_evaluationValue_5_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPINewEvalValue12508); 

            			newLeafNode(lv_evaluationValue_5_0, grammarAccess.getKPINewEvalValueAccess().getEvaluationValueDOUBLETerminalRuleCall_5_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKPINewEvalValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"evaluationValue",
                    		lv_evaluationValue_5_0, 
                    		"DOUBLE");
            	    

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleKPINewEvalValue12525); 

                	newLeafNode(otherlv_6, grammarAccess.getKPINewEvalValueAccess().getSemicolonKeyword_6());
                
            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleKPINewEvalValue12537); 

                	newLeafNode(otherlv_7, grammarAccess.getKPINewEvalValueAccess().getRightCurlyBracketKeyword_7());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKPINewEvalValue"


    // $ANTLR start "entryRuleKPIInformationConfig"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5000:1: entryRuleKPIInformationConfig returns [EObject current=null] : iv_ruleKPIInformationConfig= ruleKPIInformationConfig EOF ;
    public final EObject entryRuleKPIInformationConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIInformationConfig = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5001:2: (iv_ruleKPIInformationConfig= ruleKPIInformationConfig EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5002:2: iv_ruleKPIInformationConfig= ruleKPIInformationConfig EOF
            {
             newCompositeNode(grammarAccess.getKPIInformationConfigRule()); 
            pushFollow(FOLLOW_ruleKPIInformationConfig_in_entryRuleKPIInformationConfig12573);
            iv_ruleKPIInformationConfig=ruleKPIInformationConfig();

            state._fsp--;

             current =iv_ruleKPIInformationConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIInformationConfig12583); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKPIInformationConfig"


    // $ANTLR start "ruleKPIInformationConfig"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5009:1: ruleKPIInformationConfig returns [EObject current=null] : (otherlv_0= 'kpiInformationConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' ) ;
    public final EObject ruleKPIInformationConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_levelOfDimension_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_valueOfDimension_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5012:28: ( (otherlv_0= 'kpiInformationConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5013:1: (otherlv_0= 'kpiInformationConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5013:1: (otherlv_0= 'kpiInformationConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5013:3: otherlv_0= 'kpiInformationConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleKPIInformationConfig12620); 

                	newLeafNode(otherlv_0, grammarAccess.getKPIInformationConfigAccess().getKpiInformationConfigKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5017:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5018:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5018:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5019:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKPIInformationConfig12637); 

            			newLeafNode(lv_name_1_0, grammarAccess.getKPIInformationConfigAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getKPIInformationConfigRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleKPIInformationConfig12654); 

                	newLeafNode(otherlv_2, grammarAccess.getKPIInformationConfigAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5039:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5041:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5041:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5042:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5045:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5046:3: ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5046:3: ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+
            int cnt54=0;
            loop54:
            do {
                int alt54=4;
                int LA54_0 = input.LA(1);

                if ( LA54_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 0) ) {
                    alt54=1;
                }
                else if ( LA54_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 1) ) {
                    alt54=2;
                }
                else if ( LA54_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 2) ) {
                    alt54=3;
                }


                switch (alt54) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5048:4: ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5048:4: ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5049:5: {...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleKPIInformationConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5049:117: ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5050:6: ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5053:6: ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5053:7: {...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIInformationConfig", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5053:16: (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5053:18: otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,63,FOLLOW_63_in_ruleKPIInformationConfig12712); 

            	        	newLeafNode(otherlv_4, grammarAccess.getKPIInformationConfigAccess().getLevelOfDimensionKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleKPIInformationConfig12724); 

            	        	newLeafNode(otherlv_5, grammarAccess.getKPIInformationConfigAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5061:1: ( (lv_levelOfDimension_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5062:1: (lv_levelOfDimension_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5062:1: (lv_levelOfDimension_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5063:3: lv_levelOfDimension_6_0= RULE_STRING
            	    {
            	    lv_levelOfDimension_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKPIInformationConfig12741); 

            	    			newLeafNode(lv_levelOfDimension_6_0, grammarAccess.getKPIInformationConfigAccess().getLevelOfDimensionSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIInformationConfigRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"levelOfDimension",
            	            		lv_levelOfDimension_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleKPIInformationConfig12758); 

            	        	newLeafNode(otherlv_7, grammarAccess.getKPIInformationConfigAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5090:4: ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5090:4: ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5091:5: {...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleKPIInformationConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5091:117: ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5092:6: ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5095:6: ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5095:7: {...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIInformationConfig", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5095:16: (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5095:18: otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,64,FOLLOW_64_in_ruleKPIInformationConfig12826); 

            	        	newLeafNode(otherlv_8, grammarAccess.getKPIInformationConfigAccess().getValueOfDimensionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleKPIInformationConfig12838); 

            	        	newLeafNode(otherlv_9, grammarAccess.getKPIInformationConfigAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5103:1: ( (lv_valueOfDimension_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5104:1: (lv_valueOfDimension_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5104:1: (lv_valueOfDimension_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5105:3: lv_valueOfDimension_10_0= RULE_STRING
            	    {
            	    lv_valueOfDimension_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKPIInformationConfig12855); 

            	    			newLeafNode(lv_valueOfDimension_10_0, grammarAccess.getKPIInformationConfigAccess().getValueOfDimensionSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIInformationConfigRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"valueOfDimension",
            	            		lv_valueOfDimension_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleKPIInformationConfig12872); 

            	        	newLeafNode(otherlv_11, grammarAccess.getKPIInformationConfigAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5132:4: ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5132:4: ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5133:5: {...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleKPIInformationConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5133:117: ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5134:6: ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5137:6: ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5137:7: {...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIInformationConfig", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5137:16: (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5137:18: otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,65,FOLLOW_65_in_ruleKPIInformationConfig12940); 

            	        	newLeafNode(otherlv_12, grammarAccess.getKPIInformationConfigAccess().getKpiInfoElementKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleKPIInformationConfig12952); 

            	        	newLeafNode(otherlv_13, grammarAccess.getKPIInformationConfigAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5145:1: ( (otherlv_14= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5146:1: (otherlv_14= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5146:1: (otherlv_14= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5147:3: otherlv_14= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIInformationConfigRule());
            	    	        }
            	            
            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKPIInformationConfig12972); 

            	    		newLeafNode(otherlv_14, grammarAccess.getKPIInformationConfigAccess().getKpiInfoElementKPIInformationElementCrossReference_3_2_2_0()); 
            	    	

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt54 >= 1 ) break loop54;
                        EarlyExitException eee =
                            new EarlyExitException(54, input);
                        throw eee;
                }
                cnt54++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleKPIInformationConfig", "getUnorderedGroupHelper().canLeave(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3());
            	

            }

            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleKPIInformationConfig13031); 

                	newLeafNode(otherlv_15, grammarAccess.getKPIInformationConfigAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKPIInformationConfig"


    // $ANTLR start "entryRuleQualifiedName"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5193:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5194:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5195:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13076);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName13087); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5202:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5205:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5206:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5206:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5206:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13127); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5213:1: (kw= '.' this_ID_2= RULE_ID )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==66) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5214:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,66,FOLLOW_66_in_ruleQualifiedName13146); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName13161); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5234:1: ruleImportanceType returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) ;
    public final Enumerator ruleImportanceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5236:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5237:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5237:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            int alt56=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt56=1;
                }
                break;
            case 68:
                {
                alt56=2;
                }
                break;
            case 69:
                {
                alt56=3;
                }
                break;
            case 70:
                {
                alt56=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5237:2: (enumLiteral_0= 'None' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5237:2: (enumLiteral_0= 'None' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5237:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleImportanceType13222); 

                            current = grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5243:6: (enumLiteral_1= 'High' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5243:6: (enumLiteral_1= 'High' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5243:8: enumLiteral_1= 'High'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_ruleImportanceType13239); 

                            current = grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5249:6: (enumLiteral_2= 'Medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5249:6: (enumLiteral_2= 'Medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5249:8: enumLiteral_2= 'Medium'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_69_in_ruleImportanceType13256); 

                            current = grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5255:6: (enumLiteral_3= 'Low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5255:6: (enumLiteral_3= 'Low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5255:8: enumLiteral_3= 'Low'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_70_in_ruleImportanceType13273); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5265:1: ruleDecompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) | (enumLiteral_2= 'Xor' ) ) ;
    public final Enumerator ruleDecompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5267:28: ( ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) | (enumLiteral_2= 'Xor' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5268:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) | (enumLiteral_2= 'Xor' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5268:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) | (enumLiteral_2= 'Xor' ) )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt57=1;
                }
                break;
            case 72:
                {
                alt57=2;
                }
                break;
            case 73:
                {
                alt57=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5268:2: (enumLiteral_0= 'And' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5268:2: (enumLiteral_0= 'And' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5268:4: enumLiteral_0= 'And'
                    {
                    enumLiteral_0=(Token)match(input,71,FOLLOW_71_in_ruleDecompositionType13318); 

                            current = grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5274:6: (enumLiteral_1= 'Or' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5274:6: (enumLiteral_1= 'Or' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5274:8: enumLiteral_1= 'Or'
                    {
                    enumLiteral_1=(Token)match(input,72,FOLLOW_72_in_ruleDecompositionType13335); 

                            current = grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5280:6: (enumLiteral_2= 'Xor' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5280:6: (enumLiteral_2= 'Xor' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5280:8: enumLiteral_2= 'Xor'
                    {
                    enumLiteral_2=(Token)match(input,73,FOLLOW_73_in_ruleDecompositionType13352); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5290:1: ruleContributionType returns [Enumerator current=null] : ( (enumLiteral_0= 'Help' ) | (enumLiteral_1= 'Make' ) | (enumLiteral_2= 'SomePositive' ) | (enumLiteral_3= 'Unknown' ) | (enumLiteral_4= 'SomeNegative' ) | (enumLiteral_5= 'Hurt' ) | (enumLiteral_6= 'Break' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5292:28: ( ( (enumLiteral_0= 'Help' ) | (enumLiteral_1= 'Make' ) | (enumLiteral_2= 'SomePositive' ) | (enumLiteral_3= 'Unknown' ) | (enumLiteral_4= 'SomeNegative' ) | (enumLiteral_5= 'Hurt' ) | (enumLiteral_6= 'Break' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5293:1: ( (enumLiteral_0= 'Help' ) | (enumLiteral_1= 'Make' ) | (enumLiteral_2= 'SomePositive' ) | (enumLiteral_3= 'Unknown' ) | (enumLiteral_4= 'SomeNegative' ) | (enumLiteral_5= 'Hurt' ) | (enumLiteral_6= 'Break' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5293:1: ( (enumLiteral_0= 'Help' ) | (enumLiteral_1= 'Make' ) | (enumLiteral_2= 'SomePositive' ) | (enumLiteral_3= 'Unknown' ) | (enumLiteral_4= 'SomeNegative' ) | (enumLiteral_5= 'Hurt' ) | (enumLiteral_6= 'Break' ) )
            int alt58=7;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt58=1;
                }
                break;
            case 75:
                {
                alt58=2;
                }
                break;
            case 76:
                {
                alt58=3;
                }
                break;
            case 77:
                {
                alt58=4;
                }
                break;
            case 78:
                {
                alt58=5;
                }
                break;
            case 79:
                {
                alt58=6;
                }
                break;
            case 80:
                {
                alt58=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5293:2: (enumLiteral_0= 'Help' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5293:2: (enumLiteral_0= 'Help' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5293:4: enumLiteral_0= 'Help'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleContributionType13397); 

                            current = grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5299:6: (enumLiteral_1= 'Make' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5299:6: (enumLiteral_1= 'Make' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5299:8: enumLiteral_1= 'Make'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleContributionType13414); 

                            current = grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5305:6: (enumLiteral_2= 'SomePositive' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5305:6: (enumLiteral_2= 'SomePositive' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5305:8: enumLiteral_2= 'SomePositive'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleContributionType13431); 

                            current = grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5311:6: (enumLiteral_3= 'Unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5311:6: (enumLiteral_3= 'Unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5311:8: enumLiteral_3= 'Unknown'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_ruleContributionType13448); 

                            current = grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5317:6: (enumLiteral_4= 'SomeNegative' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5317:6: (enumLiteral_4= 'SomeNegative' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5317:8: enumLiteral_4= 'SomeNegative'
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_78_in_ruleContributionType13465); 

                            current = grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5323:6: (enumLiteral_5= 'Hurt' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5323:6: (enumLiteral_5= 'Hurt' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5323:8: enumLiteral_5= 'Hurt'
                    {
                    enumLiteral_5=(Token)match(input,79,FOLLOW_79_in_ruleContributionType13482); 

                            current = grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5329:6: (enumLiteral_6= 'Break' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5329:6: (enumLiteral_6= 'Break' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5329:8: enumLiteral_6= 'Break'
                    {
                    enumLiteral_6=(Token)match(input,80,FOLLOW_80_in_ruleContributionType13499); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5339:1: ruleQualitativeLabel returns [Enumerator current=null] : ( (enumLiteral_0= 'Denied' ) | (enumLiteral_1= 'WeaklyDenied' ) | (enumLiteral_2= 'WeaklySatisfied' ) | (enumLiteral_3= 'Satisfied' ) | (enumLiteral_4= 'Conflict' ) | (enumLiteral_5= 'Unknown' ) | (enumLiteral_6= 'None' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5341:28: ( ( (enumLiteral_0= 'Denied' ) | (enumLiteral_1= 'WeaklyDenied' ) | (enumLiteral_2= 'WeaklySatisfied' ) | (enumLiteral_3= 'Satisfied' ) | (enumLiteral_4= 'Conflict' ) | (enumLiteral_5= 'Unknown' ) | (enumLiteral_6= 'None' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5342:1: ( (enumLiteral_0= 'Denied' ) | (enumLiteral_1= 'WeaklyDenied' ) | (enumLiteral_2= 'WeaklySatisfied' ) | (enumLiteral_3= 'Satisfied' ) | (enumLiteral_4= 'Conflict' ) | (enumLiteral_5= 'Unknown' ) | (enumLiteral_6= 'None' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5342:1: ( (enumLiteral_0= 'Denied' ) | (enumLiteral_1= 'WeaklyDenied' ) | (enumLiteral_2= 'WeaklySatisfied' ) | (enumLiteral_3= 'Satisfied' ) | (enumLiteral_4= 'Conflict' ) | (enumLiteral_5= 'Unknown' ) | (enumLiteral_6= 'None' ) )
            int alt59=7;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt59=1;
                }
                break;
            case 82:
                {
                alt59=2;
                }
                break;
            case 83:
                {
                alt59=3;
                }
                break;
            case 84:
                {
                alt59=4;
                }
                break;
            case 85:
                {
                alt59=5;
                }
                break;
            case 77:
                {
                alt59=6;
                }
                break;
            case 67:
                {
                alt59=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5342:2: (enumLiteral_0= 'Denied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5342:2: (enumLiteral_0= 'Denied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5342:4: enumLiteral_0= 'Denied'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_81_in_ruleQualitativeLabel13544); 

                            current = grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5348:6: (enumLiteral_1= 'WeaklyDenied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5348:6: (enumLiteral_1= 'WeaklyDenied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5348:8: enumLiteral_1= 'WeaklyDenied'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_82_in_ruleQualitativeLabel13561); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5354:6: (enumLiteral_2= 'WeaklySatisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5354:6: (enumLiteral_2= 'WeaklySatisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5354:8: enumLiteral_2= 'WeaklySatisfied'
                    {
                    enumLiteral_2=(Token)match(input,83,FOLLOW_83_in_ruleQualitativeLabel13578); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5360:6: (enumLiteral_3= 'Satisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5360:6: (enumLiteral_3= 'Satisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5360:8: enumLiteral_3= 'Satisfied'
                    {
                    enumLiteral_3=(Token)match(input,84,FOLLOW_84_in_ruleQualitativeLabel13595); 

                            current = grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5366:6: (enumLiteral_4= 'Conflict' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5366:6: (enumLiteral_4= 'Conflict' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5366:8: enumLiteral_4= 'Conflict'
                    {
                    enumLiteral_4=(Token)match(input,85,FOLLOW_85_in_ruleQualitativeLabel13612); 

                            current = grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5372:6: (enumLiteral_5= 'Unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5372:6: (enumLiteral_5= 'Unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5372:8: enumLiteral_5= 'Unknown'
                    {
                    enumLiteral_5=(Token)match(input,77,FOLLOW_77_in_ruleQualitativeLabel13629); 

                            current = grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5378:6: (enumLiteral_6= 'None' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5378:6: (enumLiteral_6= 'None' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5378:8: enumLiteral_6= 'None'
                    {
                    enumLiteral_6=(Token)match(input,67,FOLLOW_67_in_ruleQualitativeLabel13646); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5388:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5390:28: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5391:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5391:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) )
            int alt60=16;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt60=1;
                }
                break;
            case 87:
                {
                alt60=2;
                }
                break;
            case 88:
                {
                alt60=3;
                }
                break;
            case 89:
                {
                alt60=4;
                }
                break;
            case 90:
                {
                alt60=5;
                }
                break;
            case 91:
                {
                alt60=6;
                }
                break;
            case 92:
                {
                alt60=7;
                }
                break;
            case 93:
                {
                alt60=8;
                }
                break;
            case 94:
                {
                alt60=9;
                }
                break;
            case 95:
                {
                alt60=10;
                }
                break;
            case 96:
                {
                alt60=11;
                }
                break;
            case 97:
                {
                alt60=12;
                }
                break;
            case 98:
                {
                alt60=13;
                }
                break;
            case 99:
                {
                alt60=14;
                }
                break;
            case 100:
                {
                alt60=15;
                }
                break;
            case 101:
                {
                alt60=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5391:2: (enumLiteral_0= 'white' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5391:2: (enumLiteral_0= 'white' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5391:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,86,FOLLOW_86_in_ruleColor13691); 

                            current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5397:6: (enumLiteral_1= 'black' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5397:6: (enumLiteral_1= 'black' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5397:8: enumLiteral_1= 'black'
                    {
                    enumLiteral_1=(Token)match(input,87,FOLLOW_87_in_ruleColor13708); 

                            current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5403:6: (enumLiteral_2= 'blue' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5403:6: (enumLiteral_2= 'blue' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5403:8: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,88,FOLLOW_88_in_ruleColor13725); 

                            current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5409:6: (enumLiteral_3= 'green' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5409:6: (enumLiteral_3= 'green' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5409:8: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,89,FOLLOW_89_in_ruleColor13742); 

                            current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5415:6: (enumLiteral_4= 'cyan' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5415:6: (enumLiteral_4= 'cyan' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5415:8: enumLiteral_4= 'cyan'
                    {
                    enumLiteral_4=(Token)match(input,90,FOLLOW_90_in_ruleColor13759); 

                            current = grammarAccess.getColorAccess().getCyanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getCyanEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5421:6: (enumLiteral_5= 'red' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5421:6: (enumLiteral_5= 'red' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5421:8: enumLiteral_5= 'red'
                    {
                    enumLiteral_5=(Token)match(input,91,FOLLOW_91_in_ruleColor13776); 

                            current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5427:6: (enumLiteral_6= 'purple' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5427:6: (enumLiteral_6= 'purple' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5427:8: enumLiteral_6= 'purple'
                    {
                    enumLiteral_6=(Token)match(input,92,FOLLOW_92_in_ruleColor13793); 

                            current = grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5433:6: (enumLiteral_7= 'yellow' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5433:6: (enumLiteral_7= 'yellow' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5433:8: enumLiteral_7= 'yellow'
                    {
                    enumLiteral_7=(Token)match(input,93,FOLLOW_93_in_ruleColor13810); 

                            current = grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5439:6: (enumLiteral_8= 'gray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5439:6: (enumLiteral_8= 'gray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5439:8: enumLiteral_8= 'gray'
                    {
                    enumLiteral_8=(Token)match(input,94,FOLLOW_94_in_ruleColor13827); 

                            current = grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5445:6: (enumLiteral_9= 'lightGray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5445:6: (enumLiteral_9= 'lightGray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5445:8: enumLiteral_9= 'lightGray'
                    {
                    enumLiteral_9=(Token)match(input,95,FOLLOW_95_in_ruleColor13844); 

                            current = grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5451:6: (enumLiteral_10= 'lightBlue' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5451:6: (enumLiteral_10= 'lightBlue' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5451:8: enumLiteral_10= 'lightBlue'
                    {
                    enumLiteral_10=(Token)match(input,96,FOLLOW_96_in_ruleColor13861); 

                            current = grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5457:6: (enumLiteral_11= 'lightGreen' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5457:6: (enumLiteral_11= 'lightGreen' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5457:8: enumLiteral_11= 'lightGreen'
                    {
                    enumLiteral_11=(Token)match(input,97,FOLLOW_97_in_ruleColor13878); 

                            current = grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5463:6: (enumLiteral_12= 'lightCray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5463:6: (enumLiteral_12= 'lightCray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5463:8: enumLiteral_12= 'lightCray'
                    {
                    enumLiteral_12=(Token)match(input,98,FOLLOW_98_in_ruleColor13895); 

                            current = grammarAccess.getColorAccess().getLightCrayEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getColorAccess().getLightCrayEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5469:6: (enumLiteral_13= 'lightRed' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5469:6: (enumLiteral_13= 'lightRed' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5469:8: enumLiteral_13= 'lightRed'
                    {
                    enumLiteral_13=(Token)match(input,99,FOLLOW_99_in_ruleColor13912); 

                            current = grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5475:6: (enumLiteral_14= 'lightPurple' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5475:6: (enumLiteral_14= 'lightPurple' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5475:8: enumLiteral_14= 'lightPurple'
                    {
                    enumLiteral_14=(Token)match(input,100,FOLLOW_100_in_ruleColor13929); 

                            current = grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5481:6: (enumLiteral_15= 'lightYellow' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5481:6: (enumLiteral_15= 'lightYellow' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5481:8: enumLiteral_15= 'lightYellow'
                    {
                    enumLiteral_15=(Token)match(input,101,FOLLOW_101_in_ruleColor13946); 

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


    // $ANTLR start "ruleCriticality"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5491:1: ruleCriticality returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) ;
    public final Enumerator ruleCriticality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5493:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5494:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5494:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            int alt61=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt61=1;
                }
                break;
            case 68:
                {
                alt61=2;
                }
                break;
            case 69:
                {
                alt61=3;
                }
                break;
            case 70:
                {
                alt61=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5494:2: (enumLiteral_0= 'None' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5494:2: (enumLiteral_0= 'None' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5494:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_ruleCriticality13991); 

                            current = grammarAccess.getCriticalityAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCriticalityAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5500:6: (enumLiteral_1= 'High' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5500:6: (enumLiteral_1= 'High' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5500:8: enumLiteral_1= 'High'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_ruleCriticality14008); 

                            current = grammarAccess.getCriticalityAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCriticalityAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5506:6: (enumLiteral_2= 'Medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5506:6: (enumLiteral_2= 'Medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5506:8: enumLiteral_2= 'Medium'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_69_in_ruleCriticality14025); 

                            current = grammarAccess.getCriticalityAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCriticalityAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5512:6: (enumLiteral_3= 'Low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5512:6: (enumLiteral_3= 'Low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5512:8: enumLiteral_3= 'Low'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_70_in_ruleCriticality14042); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5522:1: rulePriority returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) ;
    public final Enumerator rulePriority() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5524:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5525:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5525:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            int alt62=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt62=1;
                }
                break;
            case 68:
                {
                alt62=2;
                }
                break;
            case 69:
                {
                alt62=3;
                }
                break;
            case 70:
                {
                alt62=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5525:2: (enumLiteral_0= 'None' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5525:2: (enumLiteral_0= 'None' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5525:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_67_in_rulePriority14087); 

                            current = grammarAccess.getPriorityAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPriorityAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5531:6: (enumLiteral_1= 'High' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5531:6: (enumLiteral_1= 'High' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5531:8: enumLiteral_1= 'High'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_68_in_rulePriority14104); 

                            current = grammarAccess.getPriorityAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPriorityAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5537:6: (enumLiteral_2= 'Medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5537:6: (enumLiteral_2= 'Medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5537:8: enumLiteral_2= 'Medium'
                    {
                    enumLiteral_2=(Token)match(input,69,FOLLOW_69_in_rulePriority14121); 

                            current = grammarAccess.getPriorityAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPriorityAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5543:6: (enumLiteral_3= 'Low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5543:6: (enumLiteral_3= 'Low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5543:8: enumLiteral_3= 'Low'
                    {
                    enumLiteral_3=(Token)match(input,70,FOLLOW_70_in_rulePriority14138); 

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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA30 dfa30 = new DFA30(this);
    static final String DFA5_eotS =
        "\7\uffff";
    static final String DFA5_eofS =
        "\7\uffff";
    static final String DFA5_minS =
        "\1\4\1\41\1\4\3\uffff\1\41";
    static final String DFA5_maxS =
        "\1\4\1\102\1\4\3\uffff\1\102";
    static final String DFA5_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\uffff";
    static final String DFA5_specialS =
        "\7\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\1",
            "\1\3\1\4\1\5\36\uffff\1\2",
            "\1\6",
            "",
            "",
            "",
            "\1\3\1\4\1\5\36\uffff\1\2"
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
            return "292:1: (this_Decomposition_0= ruleDecomposition | this_Contribution_1= ruleContribution | this_Dependency_2= ruleDependency )";
        }
    }
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\4\1\uffff\7\0\1\uffff";
    static final String DFA11_maxS =
        "\1\106\1\uffff\7\0\1\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\2\7\uffff\1\1";
    static final String DFA11_specialS =
        "\2\uffff\1\2\1\3\1\4\1\6\1\0\1\1\1\5\1\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\10\1\uffff\1\1\10\uffff\1\1\1\uffff\1\1\2\uffff\2\1\1\2"+
            "\1\uffff\1\3\1\4\1\5\1\6\4\uffff\1\7\42\uffff\4\1",
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
            return "()+ loopback of 680:6: ({...}? => ( ( (lv_elemets_19_0= ruleIntentionalElement ) ) | ( (lv_elemets_20_0= ruleElementLink ) ) ) )+";
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
                        int LA11_7 = input.LA(1);

                         
                        int index11_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_2 = input.LA(1);

                         
                        int index11_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_2);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_3 = input.LA(1);

                         
                        int index11_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_3);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_4 = input.LA(1);

                         
                        int index11_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_4);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_8 = input.LA(1);

                         
                        int index11_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index11_8);
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
    static final String DFA30_eotS =
        "\13\uffff";
    static final String DFA30_eofS =
        "\13\uffff";
    static final String DFA30_minS =
        "\1\6\12\uffff";
    static final String DFA30_maxS =
        "\1\106\12\uffff";
    static final String DFA30_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA30_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\6\10\uffff\1\1\1\uffff\1\2\2\uffff\1\3\1\4\1\uffff\1\5\4"+
            "\uffff\1\7\1\uffff\1\10\1\11\1\uffff\3\12\37\uffff\4\6",
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

    static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
    static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
    static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
    static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
    static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
    static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
    static final short[][] DFA30_transition;

    static {
        int numStates = DFA30_transitionS.length;
        DFA30_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
        }
    }

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = DFA30_eot;
            this.eof = DFA30_eof;
            this.min = DFA30_min;
            this.max = DFA30_max;
            this.accept = DFA30_accept;
            this.special = DFA30_special;
            this.transition = DFA30_transition;
        }
        public String getDescription() {
            return "()* loopback of 2061:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'decompositionType' otherlv_17= '=' ( (lv_decompositionType_18_0= ruleDecompositionType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_importance_20_0= ruleImportanceType ) ) | ( (lv_importanceQuantitative_21_0= RULE_INT ) ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'refs' otherlv_24= '=' ( (otherlv_25= RULE_ID ) ) (otherlv_26= ',' ( (otherlv_27= RULE_ID ) ) )* otherlv_28= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= 'kpiModelLinksDest' otherlv_30= '=' ( (otherlv_31= RULE_ID ) ) (otherlv_32= ',' ( (otherlv_33= RULE_ID ) ) )* otherlv_34= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= 'groups' otherlv_36= '=' ( (otherlv_37= RULE_ID ) ) (otherlv_38= ',' ( (otherlv_39= RULE_ID ) ) )* otherlv_40= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_elementLinks_41_0= ruleInLineElementLink ) ) )+ ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_0 = input.LA(1);

                         
                        int index30_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA30_0==15) ) {s = 1;}

                        else if ( LA30_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA30_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA30_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA30_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( (LA30_0==RULE_INT|| LA30_0 >=67 && LA30_0<=70) && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA30_0 ==28 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA30_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA30_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA30_0 >=33 && LA30_0<=35 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                         
                        input.seek(index30_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
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
    public static final BitSet FOLLOW_ruleGRLElement_in_entryRuleGRLElement287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRLElement297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleGRLElement344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLink_in_ruleGRLElement371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_ruleGRLElement398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_entryRuleIntentionalElement433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntentionalElement443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_ruleIntentionalElement490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleIntentionalElement517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_ruleIntentionalElement544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_ruleIntentionalElement571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicator_in_ruleIntentionalElement598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_ruleIntentionalElement625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementLink_in_entryRuleElementLink660 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLink670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_ruleElementLink717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_ruleElementLink744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_ruleElementLink771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_entryRuleInLineElementLink806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineElementLink816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDecomposition_in_ruleInLineElementLink863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineContribution_in_ruleInLineElementLink890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDependency_in_ruleInLineElementLink917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRLSpecification_in_entryRuleGRLSpecification952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRLSpecification962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGRLSpecification999 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGRLSpecification1016 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGRLSpecification1034 = new BitSet(new long[]{0x000000010F418010L});
    public static final BitSet FOLLOW_ruleGRLElement_in_ruleGRLSpecification1055 = new BitSet(new long[]{0x000000010F418010L});
    public static final BitSet FOLLOW_15_in_ruleGRLSpecification1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor1104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleActor1151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor1168 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActor1185 = new BitSet(new long[]{0x000000010F728050L,0x0000000000000078L});
    public static final BitSet FOLLOW_17_in_ruleActor1243 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1255 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1272 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1289 = new BitSet(new long[]{0x000000010F728050L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleActor1367 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActor1390 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1408 = new BitSet(new long[]{0x000000010F728050L,0x0000000000000078L});
    public static final BitSet FOLLOW_20_in_ruleActor1476 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1488 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1505 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1522 = new BitSet(new long[]{0x000000010F728050L,0x0000000000000078L});
    public static final BitSet FOLLOW_21_in_ruleActor1590 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1602 = new BitSet(new long[]{0x0000000000000000L,0x0000003FFFC00000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleActor1623 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1635 = new BitSet(new long[]{0x000000010F728050L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleActor1712 = new BitSet(new long[]{0x000000010F728050L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleElementLink_in_ruleActor1739 = new BitSet(new long[]{0x000000010F728050L,0x0000000000000078L});
    public static final BitSet FOLLOW_15_in_ruleActor1793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal1829 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleSoftgoal1876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftgoal1893 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSoftgoal1910 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal1968 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal1980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal1997 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2014 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_20_in_ruleSoftgoal2082 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2094 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal2111 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2128 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_21_in_ruleSoftgoal2196 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2208 = new BitSet(new long[]{0x0000000000000000L,0x0000003FFFC00000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleSoftgoal2229 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2241 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_23_in_ruleSoftgoal2309 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleSoftgoal2342 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2354 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleSoftgoal2432 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSoftgoal2455 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2473 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleSoftgoal2549 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_15_in_ruleSoftgoal2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal2638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGoal2685 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal2702 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGoal2719 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_17_in_ruleGoal2777 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal2789 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal2806 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal2823 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_20_in_ruleGoal2891 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal2903 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal2920 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal2937 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_21_in_ruleGoal3005 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3017 = new BitSet(new long[]{0x0000000000000000L,0x0000003FFFC00000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleGoal3038 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3050 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_23_in_ruleGoal3118 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleGoal3151 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3163 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleGoal3241 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGoal3264 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3282 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleGoal3358 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_15_in_ruleGoal3411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask3447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTask3494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask3511 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTask3528 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_17_in_ruleTask3586 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask3598 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask3615 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3632 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_20_in_ruleTask3700 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask3712 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask3729 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3746 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_21_in_ruleTask3814 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask3826 = new BitSet(new long[]{0x0000000000000000L,0x0000003FFFC00000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleTask3847 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3859 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_23_in_ruleTask3927 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask3939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleTask3960 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3972 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleTask4050 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTask4073 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4091 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleTask4167 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_15_in_ruleTask4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource4256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleResource4303 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource4320 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleResource4337 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_17_in_ruleResource4395 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4407 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource4424 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4441 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_20_in_ruleResource4509 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource4538 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4555 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_21_in_ruleResource4623 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4635 = new BitSet(new long[]{0x0000000000000000L,0x0000003FFFC00000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleResource4656 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4668 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_23_in_ruleResource4736 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleResource4769 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4781 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleResource4859 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResource4882 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4900 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleResource4976 = new BitSet(new long[]{0x0000000E00B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_15_in_ruleResource5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicator_in_entryRuleIndicator5065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndicator5075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleIndicator5112 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator5129 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIndicator5146 = new BitSet(new long[]{0x0000000ED0B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_17_in_ruleIndicator5204 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5216 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator5233 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5250 = new BitSet(new long[]{0x0000000ED0B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_20_in_ruleIndicator5318 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator5347 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5364 = new BitSet(new long[]{0x0000000ED0B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_21_in_ruleIndicator5432 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5444 = new BitSet(new long[]{0x0000000000000000L,0x0000003FFFC00000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleIndicator5465 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5477 = new BitSet(new long[]{0x0000000ED0B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_23_in_ruleIndicator5545 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleIndicator5578 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5590 = new BitSet(new long[]{0x0000000ED0B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleIndicator5668 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIndicator5691 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5709 = new BitSet(new long[]{0x0000000ED0B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_28_in_ruleIndicator5777 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5789 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator5809 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleIndicator5822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator5842 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5856 = new BitSet(new long[]{0x0000000ED0B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_30_in_ruleIndicator5924 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5936 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator5956 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleIndicator5969 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator5989 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6003 = new BitSet(new long[]{0x0000000ED0B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_31_in_ruleIndicator6071 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator6083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator6103 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleIndicator6116 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator6136 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6150 = new BitSet(new long[]{0x0000000ED0B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_ruleInLineElementLink_in_ruleIndicator6226 = new BitSet(new long[]{0x0000000ED0B28040L,0x0000000000000078L});
    public static final BitSet FOLLOW_15_in_ruleIndicator6279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief6315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief6325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleBelief6362 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBelief6379 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleBelief6396 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_17_in_ruleBelief6454 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBelief6466 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelief6483 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBelief6500 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_20_in_ruleBelief6568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBelief6585 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBelief6602 = new BitSet(new long[]{0x0000000000128000L});
    public static final BitSet FOLLOW_15_in_ruleBelief6655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition6691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition6701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecomposition6749 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleDecomposition6761 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleDecomposition6782 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleDecomposition6795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleDecomposition6816 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleDecomposition6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDecomposition_in_entryRuleInLineDecomposition6866 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineDecomposition6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleInLineDecomposition6913 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition6934 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleInLineDecomposition6947 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_ruleInLineDecomposition6968 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleInLineDecomposition6982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionEnd_in_entryRuleDecompositionEnd7018 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecompositionEnd7028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecompositionEnd7076 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDecompositionEnd7089 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecompositionEnd7106 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDecompositionEnd7124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution7162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContribution7172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContribution7220 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleContribution7232 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleContribution7253 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleContribution7266 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleContribution7287 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleContribution7301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineContribution_in_entryRuleInLineContribution7337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineContribution7347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleInLineContribution7384 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleInLineContribution7405 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleInLineContribution7418 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_ruleInLineContribution7439 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleInLineContribution7453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionEnd_in_entryRuleContributionEnd7489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionEnd7499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionEnd7547 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleContributionEnd7560 = new BitSet(new long[]{0x0000000000008040L,0x000000000001FC00L});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionEnd7582 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionEnd7605 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionEnd7624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency7662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependency7720 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDependency7732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleDependency7753 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleDependency7766 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleDependency7787 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleDependency7801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInLineDependency_in_entryRuleInLineDependency7837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInLineDependency7847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleInLineDependency7884 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7905 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleInLineDependency7918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_ruleInLineDependency7939 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleInLineDependency7953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyEnd_in_entryRuleDependencyEnd7989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyEnd7999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependencyEnd8047 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleDependencyEnd8060 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependencyEnd8077 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleDependencyEnd8095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation8145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation8155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleEvaluation8192 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvaluation8209 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluation8226 = new BitSet(new long[]{0x00000FE000000000L});
    public static final BitSet FOLLOW_37_in_ruleEvaluation8284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation8296 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluation8313 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation8330 = new BitSet(new long[]{0x00000FE000008000L});
    public static final BitSet FOLLOW_38_in_ruleEvaluation8398 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation8410 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E2008L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleEvaluation8431 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation8443 = new BitSet(new long[]{0x00000FE000008000L});
    public static final BitSet FOLLOW_39_in_ruleEvaluation8511 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation8523 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleEvaluation8540 = new BitSet(new long[]{0x00000FE000008000L});
    public static final BitSet FOLLOW_40_in_ruleEvaluation8613 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation8625 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_ruleEvaluation8646 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation8658 = new BitSet(new long[]{0x00000FE000008000L});
    public static final BitSet FOLLOW_41_in_ruleEvaluation8726 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation8738 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation8759 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation8771 = new BitSet(new long[]{0x00000FE000008000L});
    public static final BitSet FOLLOW_42_in_ruleEvaluation8839 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation8851 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleKPINewEvalValue_in_ruleEvaluation8872 = new BitSet(new long[]{0x00000FE000008000L});
    public static final BitSet FOLLOW_43_in_ruleEvaluation8940 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation8952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvaluation8972 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation8984 = new BitSet(new long[]{0x00000FE000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvaluation9043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange9079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationRange9089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleEvaluationRange9126 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluationRange9138 = new BitSet(new long[]{0x0000E00000008000L});
    public static final BitSet FOLLOW_45_in_ruleEvaluationRange9196 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange9208 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange9225 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange9242 = new BitSet(new long[]{0x0000E00000008000L});
    public static final BitSet FOLLOW_46_in_ruleEvaluationRange9310 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange9322 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange9339 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange9356 = new BitSet(new long[]{0x0000E00000008000L});
    public static final BitSet FOLLOW_47_in_ruleEvaluationRange9424 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange9436 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange9453 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange9470 = new BitSet(new long[]{0x0000E00000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvaluationRange9523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionChange_in_entryRuleContributionChange9563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionChange9573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleContributionChange9610 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionChange9627 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionChange9644 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_49_in_ruleContributionChange9702 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionChange9714 = new BitSet(new long[]{0x0000000000000000L,0x000000000001FC00L});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionChange9735 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionChange9747 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_50_in_ruleContributionChange9815 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionChange9827 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionChange9844 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionChange9861 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_51_in_ruleContributionChange9929 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionChange9941 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleContributionRange_in_ruleContributionChange9962 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionChange9974 = new BitSet(new long[]{0x000E000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionChange10027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionRange_in_entryRuleContributionRange10063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionRange10073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleContributionRange10110 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionRange10122 = new BitSet(new long[]{0x0000E00000008000L});
    public static final BitSet FOLLOW_45_in_ruleContributionRange10180 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange10192 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange10209 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange10226 = new BitSet(new long[]{0x0000E00000008000L});
    public static final BitSet FOLLOW_46_in_ruleContributionRange10294 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange10306 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange10323 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange10340 = new BitSet(new long[]{0x0000E00000008000L});
    public static final BitSet FOLLOW_47_in_ruleContributionRange10408 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange10420 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange10437 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange10454 = new BitSet(new long[]{0x0000E00000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionRange10507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeMappings_in_entryRuleQualitativeMappings10543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitativeMappings10553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleQualitativeMappings10590 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeMappings10607 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualitativeMappings10624 = new BitSet(new long[]{0x1000020000008000L});
    public static final BitSet FOLLOW_41_in_ruleQualitativeMappings10682 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualitativeMappings10694 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeMappings10714 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_29_in_ruleQualitativeMappings10727 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeMappings10747 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_19_in_ruleQualitativeMappings10761 = new BitSet(new long[]{0x1000020000008000L});
    public static final BitSet FOLLOW_ruleQualitativeMapping_in_ruleQualitativeMappings10838 = new BitSet(new long[]{0x1000020000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualitativeMappings10891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet10927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIEvalValueSet10937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleKPIEvalValueSet10974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKPIEvalValueSet10991 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleKPIEvalValueSet11008 = new BitSet(new long[]{0x0FC0000000008000L});
    public static final BitSet FOLLOW_54_in_ruleKPIEvalValueSet11066 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIEvalValueSet11078 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet11095 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIEvalValueSet11112 = new BitSet(new long[]{0x0FC0000000008000L});
    public static final BitSet FOLLOW_55_in_ruleKPIEvalValueSet11180 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIEvalValueSet11192 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet11209 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIEvalValueSet11226 = new BitSet(new long[]{0x0FC0000000008000L});
    public static final BitSet FOLLOW_56_in_ruleKPIEvalValueSet11294 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIEvalValueSet11306 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet11323 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIEvalValueSet11340 = new BitSet(new long[]{0x0FC0000000008000L});
    public static final BitSet FOLLOW_57_in_ruleKPIEvalValueSet11408 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIEvalValueSet11420 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet11437 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIEvalValueSet11454 = new BitSet(new long[]{0x0FC0000000008000L});
    public static final BitSet FOLLOW_58_in_ruleKPIEvalValueSet11522 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIEvalValueSet11534 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKPIEvalValueSet11551 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIEvalValueSet11568 = new BitSet(new long[]{0x0FC0000000008000L});
    public static final BitSet FOLLOW_59_in_ruleKPIEvalValueSet11636 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIEvalValueSet11648 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKPIEvalValueSet11665 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIEvalValueSet11682 = new BitSet(new long[]{0x0FC0000000008000L});
    public static final BitSet FOLLOW_15_in_ruleKPIEvalValueSet11735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping11771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitativeMapping11781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleQualitativeMapping11818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeMapping11835 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualitativeMapping11852 = new BitSet(new long[]{0x200000E000008000L});
    public static final BitSet FOLLOW_61_in_ruleQualitativeMapping11910 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualitativeMapping11922 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQualitativeMapping11939 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualitativeMapping11956 = new BitSet(new long[]{0x200000E000008000L});
    public static final BitSet FOLLOW_37_in_ruleQualitativeMapping12024 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualitativeMapping12036 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQualitativeMapping12053 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualitativeMapping12070 = new BitSet(new long[]{0x200000E000008000L});
    public static final BitSet FOLLOW_38_in_ruleQualitativeMapping12138 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualitativeMapping12150 = new BitSet(new long[]{0x0000000000000000L,0x00000000003E2008L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleQualitativeMapping12171 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualitativeMapping12183 = new BitSet(new long[]{0x200000E000008000L});
    public static final BitSet FOLLOW_39_in_ruleQualitativeMapping12251 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualitativeMapping12263 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleQualitativeMapping12280 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualitativeMapping12297 = new BitSet(new long[]{0x200000E000008000L});
    public static final BitSet FOLLOW_15_in_ruleQualitativeMapping12350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPINewEvalValue_in_entryRuleKPINewEvalValue12386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPINewEvalValue12396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleKPINewEvalValue12433 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKPINewEvalValue12450 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleKPINewEvalValue12467 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleKPINewEvalValue12479 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPINewEvalValue12491 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPINewEvalValue12508 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPINewEvalValue12525 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleKPINewEvalValue12537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIInformationConfig_in_entryRuleKPIInformationConfig12573 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIInformationConfig12583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleKPIInformationConfig12620 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKPIInformationConfig12637 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleKPIInformationConfig12654 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_63_in_ruleKPIInformationConfig12712 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIInformationConfig12724 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKPIInformationConfig12741 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIInformationConfig12758 = new BitSet(new long[]{0x8000000000008000L,0x0000000000000003L});
    public static final BitSet FOLLOW_64_in_ruleKPIInformationConfig12826 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIInformationConfig12838 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKPIInformationConfig12855 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIInformationConfig12872 = new BitSet(new long[]{0x8000000000008000L,0x0000000000000003L});
    public static final BitSet FOLLOW_65_in_ruleKPIInformationConfig12940 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIInformationConfig12952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKPIInformationConfig12972 = new BitSet(new long[]{0x8000000000008000L,0x0000000000000003L});
    public static final BitSet FOLLOW_15_in_ruleKPIInformationConfig13031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName13076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName13087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13127 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleQualifiedName13146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName13161 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_67_in_ruleImportanceType13222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleImportanceType13239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleImportanceType13256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleImportanceType13273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleDecompositionType13318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleDecompositionType13335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleDecompositionType13352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleContributionType13397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleContributionType13414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleContributionType13431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleContributionType13448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleContributionType13465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleContributionType13482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleContributionType13499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleQualitativeLabel13544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleQualitativeLabel13561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleQualitativeLabel13578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleQualitativeLabel13595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleQualitativeLabel13612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleQualitativeLabel13629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleQualitativeLabel13646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleColor13691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleColor13708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleColor13725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleColor13742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleColor13759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleColor13776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleColor13793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleColor13810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleColor13827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleColor13844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleColor13861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleColor13878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleColor13895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleColor13912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleColor13929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleColor13946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCriticality13991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCriticality14008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCriticality14025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCriticality14042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_rulePriority14087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_rulePriority14104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_rulePriority14121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_rulePriority14138 = new BitSet(new long[]{0x0000000000000002L});

}
