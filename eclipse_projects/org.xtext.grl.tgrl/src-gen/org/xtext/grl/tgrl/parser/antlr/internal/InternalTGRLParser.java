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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_BOOLEAN", "RULE_DOUBLE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'grl'", "'{'", "'}'", "'actor'", "'name'", "'='", "';'", "'importance'", "'importanceQuantitative'", "'description'", "'color'", "'softGoal'", "'decompositionType'", "'goal'", "'Task'", "'resource'", "'indicator'", "'refs'", "','", "'kpiModelLinksDest'", "'groups'", "'decomposition'", "'->'", "'contribution'", "'quantitativeContribution'", "'correlation'", "'changes'", "'-|->'", "'dependency'", "'-D->'", "'eval'", "'evaluation'", "'qualitativeEvaluation'", "'exceeds'", "'evalRange'", "'kpiEvalValueSet'", "'kpiNewEvalValue'", "'inElement'", "'evaluationRange'", "'start'", "'end'", "'step'", "'contributionChange'", "'newContribution'", "'newQuantitativeContribution'", "'contribRange'", "'contributionRange'", "'qualitativeMappings'", "'targetValue'", "'thresholdValue'", "'worstValue'", "'evaluationValue'", "'unit'", "'qualitativeEvaluationValue'", "'qualitativeMapping'", "'realWorldLabel'", "'kpiInformationConfig'", "'levelOfDimension'", "'valueOfDimension'", "'kpiInfoElement'", "'.'", "'None'", "'High'", "'Medium'", "'Low'", "'And'", "'Or'", "'Xor'", "'Help'", "'Make'", "'SomePositive'", "'Unknown'", "'SomeNegative'", "'Hurt'", "'Break'", "'Denied'", "'WeaklyDenied'", "'WeaklySatisfied'", "'Satisfied'", "'Conflict'", "'white'", "'black'", "'blue'", "'green'", "'cyan'", "'red'", "'purple'", "'yellow'", "'gray'", "'lightGray'", "'lightBlue'", "'lightGreen'", "'lightCray'", "'lightRed'", "'lightPurple'", "'lightYellow'"
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
    public static final int T__102=102;
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
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:77:1: ruleModel returns [EObject current=null] : ( (lv_gRLspecs_0_0= ruleGRLSpecification ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_gRLspecs_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:80:28: ( ( (lv_gRLspecs_0_0= ruleGRLSpecification ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:81:1: ( (lv_gRLspecs_0_0= ruleGRLSpecification ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:81:1: ( (lv_gRLspecs_0_0= ruleGRLSpecification ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:82:1: (lv_gRLspecs_0_0= ruleGRLSpecification )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:82:1: (lv_gRLspecs_0_0= ruleGRLSpecification )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:83:3: lv_gRLspecs_0_0= ruleGRLSpecification
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getGRLspecsGRLSpecificationParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGRLSpecification_in_ruleModel130);
            	    lv_gRLspecs_0_0=ruleGRLSpecification();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"gRLspecs",
            	            		lv_gRLspecs_0_0, 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:118:1: ruleGRLBaseElement returns [EObject current=null] : (this_GRLElement_0= ruleGRLElement | this_Connection_1= ruleConnection ) ;
    public final EObject ruleGRLBaseElement() throws RecognitionException {
        EObject current = null;

        EObject this_GRLElement_0 = null;

        EObject this_Connection_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:121:28: ( (this_GRLElement_0= ruleGRLElement | this_Connection_1= ruleConnection ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:122:1: (this_GRLElement_0= ruleGRLElement | this_Connection_1= ruleConnection )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:122:1: (this_GRLElement_0= ruleGRLElement | this_Connection_1= ruleConnection )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16||LA2_0==24||(LA2_0>=26 && LA2_0<=29)||LA2_0==34||LA2_0==36||LA2_0==41) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:133:5: this_Connection_1= ruleConnection
                    {
                     
                            newCompositeNode(grammarAccess.getGRLBaseElementAccess().getConnectionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleConnection_in_ruleGRLBaseElement252);
                    this_Connection_1=ruleConnection();

                    state._fsp--;

                     
                            current = this_Connection_1; 
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
            case 24:
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt3=1;
                }
                break;
            case 34:
            case 36:
            case 41:
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:208:1: ruleIntentionalElement returns [EObject current=null] : (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator ) ;
    public final EObject ruleIntentionalElement() throws RecognitionException {
        EObject current = null;

        EObject this_Softgoal_0 = null;

        EObject this_Goal_1 = null;

        EObject this_Task_2 = null;

        EObject this_Resource_3 = null;

        EObject this_Indicator_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:211:28: ( (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:212:1: (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:212:1: (this_Softgoal_0= ruleSoftgoal | this_Goal_1= ruleGoal | this_Task_2= ruleTask | this_Resource_3= ruleResource | this_Indicator_4= ruleIndicator )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt4=1;
                }
                break;
            case 26:
                {
                alt4=2;
                }
                break;
            case 27:
                {
                alt4=3;
                }
                break;
            case 28:
                {
                alt4=4;
                }
                break;
            case 29:
                {
                alt4=5;
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

            }


            }

             leaveRule(); 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:269:1: entryRuleElementLink returns [EObject current=null] : iv_ruleElementLink= ruleElementLink EOF ;
    public final EObject entryRuleElementLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:270:2: (iv_ruleElementLink= ruleElementLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:271:2: iv_ruleElementLink= ruleElementLink EOF
            {
             newCompositeNode(grammarAccess.getElementLinkRule()); 
            pushFollow(FOLLOW_ruleElementLink_in_entryRuleElementLink633);
            iv_ruleElementLink=ruleElementLink();

            state._fsp--;

             current =iv_ruleElementLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementLink643); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:278:1: ruleElementLink returns [EObject current=null] : (this_DecompositionLink_0= ruleDecompositionLink | this_ContributionLink_1= ruleContributionLink | this_DependencyLink_2= ruleDependencyLink ) ;
    public final EObject ruleElementLink() throws RecognitionException {
        EObject current = null;

        EObject this_DecompositionLink_0 = null;

        EObject this_ContributionLink_1 = null;

        EObject this_DependencyLink_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:281:28: ( (this_DecompositionLink_0= ruleDecompositionLink | this_ContributionLink_1= ruleContributionLink | this_DependencyLink_2= ruleDependencyLink ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:282:1: (this_DecompositionLink_0= ruleDecompositionLink | this_ContributionLink_1= ruleContributionLink | this_DependencyLink_2= ruleDependencyLink )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:282:1: (this_DecompositionLink_0= ruleDecompositionLink | this_ContributionLink_1= ruleContributionLink | this_DependencyLink_2= ruleDependencyLink )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt5=1;
                }
                break;
            case 36:
                {
                alt5=2;
                }
                break;
            case 41:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:283:5: this_DecompositionLink_0= ruleDecompositionLink
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDecompositionLinkParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecompositionLink_in_ruleElementLink690);
                    this_DecompositionLink_0=ruleDecompositionLink();

                    state._fsp--;

                     
                            current = this_DecompositionLink_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:293:5: this_ContributionLink_1= ruleContributionLink
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getContributionLinkParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContributionLink_in_ruleElementLink717);
                    this_ContributionLink_1=ruleContributionLink();

                    state._fsp--;

                     
                            current = this_ContributionLink_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:303:5: this_DependencyLink_2= ruleDependencyLink
                    {
                     
                            newCompositeNode(grammarAccess.getElementLinkAccess().getDependencyLinkParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDependencyLink_in_ruleElementLink744);
                    this_DependencyLink_2=ruleDependencyLink();

                    state._fsp--;

                     
                            current = this_DependencyLink_2; 
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


    // $ANTLR start "entryRuleGRLSpecification"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:319:1: entryRuleGRLSpecification returns [EObject current=null] : iv_ruleGRLSpecification= ruleGRLSpecification EOF ;
    public final EObject entryRuleGRLSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGRLSpecification = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:320:2: (iv_ruleGRLSpecification= ruleGRLSpecification EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:321:2: iv_ruleGRLSpecification= ruleGRLSpecification EOF
            {
             newCompositeNode(grammarAccess.getGRLSpecificationRule()); 
            pushFollow(FOLLOW_ruleGRLSpecification_in_entryRuleGRLSpecification779);
            iv_ruleGRLSpecification=ruleGRLSpecification();

            state._fsp--;

             current =iv_ruleGRLSpecification; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGRLSpecification789); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:328:1: ruleGRLSpecification returns [EObject current=null] : (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleGRLSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_grlElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:331:28: ( (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:332:1: (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:332:1: (otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:332:3: otherlv_0= 'grl' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( (lv_grlElements_3_0= ruleGRLElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleGRLSpecification826); 

                	newLeafNode(otherlv_0, grammarAccess.getGRLSpecificationAccess().getGrlKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:336:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:337:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:337:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:338:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGRLSpecification843); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGRLSpecification861); 

                	newLeafNode(otherlv_2, grammarAccess.getGRLSpecificationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:358:1: ( (lv_grlElements_3_0= ruleGRLElement ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==16||LA7_0==24||(LA7_0>=26 && LA7_0<=29)||LA7_0==34||LA7_0==36||LA7_0==41) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:359:1: (lv_grlElements_3_0= ruleGRLElement )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:359:1: (lv_grlElements_3_0= ruleGRLElement )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:360:3: lv_grlElements_3_0= ruleGRLElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGRLSpecificationAccess().getGrlElementsGRLElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleGRLElement_in_ruleGRLSpecification882);
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
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleGRLSpecification895); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:388:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:389:2: (iv_ruleActor= ruleActor EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:390:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor931);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor941); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:397:1: ruleActor returns [EObject current=null] : (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) ;
    public final EObject ruleActor() throws RecognitionException {
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_importanceQuantitative_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_description_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_26=null;
        Enumerator lv_importance_10_0 = null;

        Enumerator lv_fillColor_22_0 = null;

        EObject lv_elemets_24_0 = null;

        EObject lv_elemets_25_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:400:28: ( (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_26= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:401:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_26= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:401:1: (otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_26= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:401:3: otherlv_0= 'actor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) ) )* ) ) ) otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleActor978); 

                	newLeafNode(otherlv_0, grammarAccess.getActorAccess().getActorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:405:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:406:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:406:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:407:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActor995); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleActor1012); 

                	newLeafNode(otherlv_2, grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:427:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:429:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:429:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:430:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:433:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:434:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:434:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) ) )*
            loop10:
            do {
                int alt10=7;
                int LA10_0 = input.LA(1);

                if ( LA10_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1) ) {
                    alt10=2;
                }
                else if ( LA10_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2) ) {
                    alt10=3;
                }
                else if ( LA10_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3) ) {
                    alt10=4;
                }
                else if ( LA10_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {
                    alt10=5;
                }
                else if ( (LA10_0==24|| LA10_0 >=26 && LA10_0<=29 ||LA10_0==34||LA10_0==36||LA10_0==41) && getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5) ) {
                    alt10=6;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:436:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:436:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:437:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:437:102: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:438:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:441:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:441:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:441:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:441:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleActor1070); 

            	        	newLeafNode(otherlv_4, grammarAccess.getActorAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleActor1082); 

            	        	newLeafNode(otherlv_5, grammarAccess.getActorAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:449:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:450:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:450:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:451:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1099); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleActor1116); 

            	        	newLeafNode(otherlv_7, grammarAccess.getActorAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:478:4: ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:478:4: ({...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:479:5: {...}? => ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:479:102: ( ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:480:6: ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:483:6: ({...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:483:7: {...}? => (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:483:16: (otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:483:18: otherlv_8= 'importance' otherlv_9= '=' ( (lv_importance_10_0= ruleImportanceType ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleActor1184); 

            	        	newLeafNode(otherlv_8, grammarAccess.getActorAccess().getImportanceKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleActor1196); 

            	        	newLeafNode(otherlv_9, grammarAccess.getActorAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:491:1: ( (lv_importance_10_0= ruleImportanceType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:492:1: (lv_importance_10_0= ruleImportanceType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:492:1: (lv_importance_10_0= ruleImportanceType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:493:3: lv_importance_10_0= ruleImportanceType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActorAccess().getImportanceImportanceTypeEnumRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportanceType_in_ruleActor1217);
            	    lv_importance_10_0=ruleImportanceType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"importance",
            	            		lv_importance_10_0, 
            	            		"ImportanceType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleActor1229); 

            	        	newLeafNode(otherlv_11, grammarAccess.getActorAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:520:4: ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:520:4: ({...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:521:5: {...}? => ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:521:102: ( ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:522:6: ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:525:6: ({...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:525:7: {...}? => (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:525:16: (otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:525:18: otherlv_12= 'importanceQuantitative' otherlv_13= '=' ( (lv_importanceQuantitative_14_0= RULE_INT ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleActor1297); 

            	        	newLeafNode(otherlv_12, grammarAccess.getActorAccess().getImportanceQuantitativeKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleActor1309); 

            	        	newLeafNode(otherlv_13, grammarAccess.getActorAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:533:1: ( (lv_importanceQuantitative_14_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:534:1: (lv_importanceQuantitative_14_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:534:1: (lv_importanceQuantitative_14_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:535:3: lv_importanceQuantitative_14_0= RULE_INT
            	    {
            	    lv_importanceQuantitative_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleActor1326); 

            	    			newLeafNode(lv_importanceQuantitative_14_0, grammarAccess.getActorAccess().getImportanceQuantitativeINTTerminalRuleCall_3_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"importanceQuantitative",
            	            		lv_importanceQuantitative_14_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleActor1343); 

            	        	newLeafNode(otherlv_15, grammarAccess.getActorAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:562:4: ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:562:4: ({...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:563:5: {...}? => ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:563:102: ( ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:564:6: ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:567:6: ({...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:567:7: {...}? => (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:567:16: (otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:567:18: otherlv_16= 'description' otherlv_17= '=' ( (lv_description_18_0= RULE_STRING ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,22,FOLLOW_22_in_ruleActor1411); 

            	        	newLeafNode(otherlv_16, grammarAccess.getActorAccess().getDescriptionKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleActor1423); 

            	        	newLeafNode(otherlv_17, grammarAccess.getActorAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:575:1: ( (lv_description_18_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:576:1: (lv_description_18_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:576:1: (lv_description_18_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:577:3: lv_description_18_0= RULE_STRING
            	    {
            	    lv_description_18_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleActor1440); 

            	    			newLeafNode(lv_description_18_0, grammarAccess.getActorAccess().getDescriptionSTRINGTerminalRuleCall_3_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getActorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_18_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleActor1457); 

            	        	newLeafNode(otherlv_19, grammarAccess.getActorAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:604:4: ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:604:4: ({...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:605:5: {...}? => ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:605:102: ( ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:606:6: ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:609:6: ({...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:609:7: {...}? => (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:609:16: (otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:609:18: otherlv_20= 'color' otherlv_21= '=' ( (lv_fillColor_22_0= ruleColor ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,23,FOLLOW_23_in_ruleActor1525); 

            	        	newLeafNode(otherlv_20, grammarAccess.getActorAccess().getColorKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleActor1537); 

            	        	newLeafNode(otherlv_21, grammarAccess.getActorAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:617:1: ( (lv_fillColor_22_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:618:1: (lv_fillColor_22_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:618:1: (lv_fillColor_22_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:619:3: lv_fillColor_22_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getActorAccess().getFillColorColorEnumRuleCall_3_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleActor1558);
            	    lv_fillColor_22_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"fillColor",
            	            		lv_fillColor_22_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleActor1570); 

            	        	newLeafNode(otherlv_23, grammarAccess.getActorAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:646:4: ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:646:4: ({...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:647:5: {...}? => ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleActor", "getUnorderedGroupHelper().canSelect(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:647:102: ( ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:648:6: ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getActorAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:651:6: ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+
            	    int cnt9=0;
            	    loop9:
            	    do {
            	        int alt9=2;
            	        alt9 = dfa9.predict(input);
            	        switch (alt9) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:651:7: {...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleActor", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:651:16: ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) )
            	    	    int alt8=2;
            	    	    int LA8_0 = input.LA(1);

            	    	    if ( (LA8_0==24||(LA8_0>=26 && LA8_0<=29)) ) {
            	    	        alt8=1;
            	    	    }
            	    	    else if ( (LA8_0==34||LA8_0==36||LA8_0==41) ) {
            	    	        alt8=2;
            	    	    }
            	    	    else {
            	    	        NoViableAltException nvae =
            	    	            new NoViableAltException("", 8, 0, input);

            	    	        throw nvae;
            	    	    }
            	    	    switch (alt8) {
            	    	        case 1 :
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:651:17: ( (lv_elemets_24_0= ruleIntentionalElement ) )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:651:17: ( (lv_elemets_24_0= ruleIntentionalElement ) )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:652:1: (lv_elemets_24_0= ruleIntentionalElement )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:652:1: (lv_elemets_24_0= ruleIntentionalElement )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:653:3: lv_elemets_24_0= ruleIntentionalElement
            	    	            {
            	    	             
            	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsIntentionalElementParserRuleCall_3_5_0_0()); 
            	    	            	    
            	    	            pushFollow(FOLLOW_ruleIntentionalElement_in_ruleActor1647);
            	    	            lv_elemets_24_0=ruleIntentionalElement();

            	    	            state._fsp--;


            	    	            	        if (current==null) {
            	    	            	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	            	        }
            	    	                   		add(
            	    	                   			current, 
            	    	                   			"elemets",
            	    	                    		lv_elemets_24_0, 
            	    	                    		"IntentionalElement");
            	    	            	        afterParserOrEnumRuleCall();
            	    	            	    

            	    	            }


            	    	            }


            	    	            }
            	    	            break;
            	    	        case 2 :
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:670:6: ( (lv_elemets_25_0= ruleElementLink ) )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:670:6: ( (lv_elemets_25_0= ruleElementLink ) )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:671:1: (lv_elemets_25_0= ruleElementLink )
            	    	            {
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:671:1: (lv_elemets_25_0= ruleElementLink )
            	    	            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:672:3: lv_elemets_25_0= ruleElementLink
            	    	            {
            	    	             
            	    	            	        newCompositeNode(grammarAccess.getActorAccess().getElemetsElementLinkParserRuleCall_3_5_1_0()); 
            	    	            	    
            	    	            pushFollow(FOLLOW_ruleElementLink_in_ruleActor1674);
            	    	            lv_elemets_25_0=ruleElementLink();

            	    	            state._fsp--;


            	    	            	        if (current==null) {
            	    	            	            current = createModelElementForParent(grammarAccess.getActorRule());
            	    	            	        }
            	    	                   		add(
            	    	                   			current, 
            	    	                   			"elemets",
            	    	                    		lv_elemets_25_0, 
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
            	    	    if ( cnt9 >= 1 ) break loop9;
            	                EarlyExitException eee =
            	                    new EarlyExitException(9, input);
            	                throw eee;
            	        }
            	        cnt9++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getActorAccess().getUnorderedGroup_3());
            	

            }

            otherlv_26=(Token)match(input,15,FOLLOW_15_in_ruleActor1728); 

                	newLeafNode(otherlv_26, grammarAccess.getActorAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:714:1: entryRuleSoftgoal returns [EObject current=null] : iv_ruleSoftgoal= ruleSoftgoal EOF ;
    public final EObject entryRuleSoftgoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftgoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:715:2: (iv_ruleSoftgoal= ruleSoftgoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:716:2: iv_ruleSoftgoal= ruleSoftgoal EOF
            {
             newCompositeNode(grammarAccess.getSoftgoalRule()); 
            pushFollow(FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal1764);
            iv_ruleSoftgoal=ruleSoftgoal();

            state._fsp--;

             current =iv_ruleSoftgoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftgoal1774); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:723:1: ruleSoftgoal returns [EObject current=null] : (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' ) ;
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
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_importanceQuantitative_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_importance_18_0 = null;

        Enumerator lv_decompositionType_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:726:28: ( (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:727:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:727:1: (otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:727:3: otherlv_0= 'softGoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleSoftgoal1811); 

                	newLeafNode(otherlv_0, grammarAccess.getSoftgoalAccess().getSoftGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:731:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:732:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:732:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:733:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftgoal1828); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleSoftgoal1845); 

                	newLeafNode(otherlv_2, grammarAccess.getSoftgoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:753:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:755:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:755:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:756:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:759:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:760:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:760:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )*
            loop11:
            do {
                int alt11=7;
                int LA11_0 = input.LA(1);

                if ( LA11_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3) ) {
                    alt11=4;
                }
                else if ( LA11_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4) ) {
                    alt11=5;
                }
                else if ( LA11_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5) ) {
                    alt11=6;
                }


                switch (alt11) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:762:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:762:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:763:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:763:105: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:764:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:767:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:767:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:767:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:767:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleSoftgoal1903); 

            	        	newLeafNode(otherlv_4, grammarAccess.getSoftgoalAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal1915); 

            	        	newLeafNode(otherlv_5, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:775:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:776:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:776:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:777:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal1932); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal1949); 

            	        	newLeafNode(otherlv_7, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:804:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:804:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:805:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:805:105: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:806:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:809:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:809:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:809:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:809:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleSoftgoal2017); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSoftgoalAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2029); 

            	        	newLeafNode(otherlv_9, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:817:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:818:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:818:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:819:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftgoal2046); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2063); 

            	        	newLeafNode(otherlv_11, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:846:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:846:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:847:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:847:105: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:848:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:851:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:851:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:851:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:851:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleSoftgoal2131); 

            	        	newLeafNode(otherlv_12, grammarAccess.getSoftgoalAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2143); 

            	        	newLeafNode(otherlv_13, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:859:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:860:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:860:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:861:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleSoftgoal2164);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2176); 

            	        	newLeafNode(otherlv_15, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:888:4: ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:888:4: ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:889:5: {...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:889:105: ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:890:6: ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:893:6: ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:893:7: {...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:893:16: (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:893:18: otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,20,FOLLOW_20_in_ruleSoftgoal2244); 

            	        	newLeafNode(otherlv_16, grammarAccess.getSoftgoalAccess().getImportanceKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2256); 

            	        	newLeafNode(otherlv_17, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:901:1: ( (lv_importance_18_0= ruleImportanceType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:902:1: (lv_importance_18_0= ruleImportanceType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:902:1: (lv_importance_18_0= ruleImportanceType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:903:3: lv_importance_18_0= ruleImportanceType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getImportanceImportanceTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportanceType_in_ruleSoftgoal2277);
            	    lv_importance_18_0=ruleImportanceType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"importance",
            	            		lv_importance_18_0, 
            	            		"ImportanceType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2289); 

            	        	newLeafNode(otherlv_19, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:930:4: ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:930:4: ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:931:5: {...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:931:105: ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:932:6: ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:935:6: ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:935:7: {...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:935:16: (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:935:18: otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleSoftgoal2357); 

            	        	newLeafNode(otherlv_20, grammarAccess.getSoftgoalAccess().getDecompositionTypeKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2369); 

            	        	newLeafNode(otherlv_21, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:943:1: ( (lv_decompositionType_22_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:944:1: (lv_decompositionType_22_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:944:1: (lv_decompositionType_22_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:945:3: lv_decompositionType_22_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSoftgoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleSoftgoal2390);
            	    lv_decompositionType_22_0=ruleDecompositionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"decompositionType",
            	            		lv_decompositionType_22_0, 
            	            		"DecompositionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2402); 

            	        	newLeafNode(otherlv_23, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:972:4: ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:972:4: ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:973:5: {...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:973:105: ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:974:6: ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:977:6: ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:977:7: {...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSoftgoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:977:16: (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:977:18: otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,21,FOLLOW_21_in_ruleSoftgoal2470); 

            	        	newLeafNode(otherlv_24, grammarAccess.getSoftgoalAccess().getImportanceQuantitativeKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,18,FOLLOW_18_in_ruleSoftgoal2482); 

            	        	newLeafNode(otherlv_25, grammarAccess.getSoftgoalAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:985:1: ( (lv_importanceQuantitative_26_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:986:1: (lv_importanceQuantitative_26_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:986:1: (lv_importanceQuantitative_26_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:987:3: lv_importanceQuantitative_26_0= RULE_INT
            	    {
            	    lv_importanceQuantitative_26_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSoftgoal2499); 

            	    			newLeafNode(lv_importanceQuantitative_26_0, grammarAccess.getSoftgoalAccess().getImportanceQuantitativeINTTerminalRuleCall_3_5_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSoftgoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"importanceQuantitative",
            	            		lv_importanceQuantitative_26_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,19,FOLLOW_19_in_ruleSoftgoal2516); 

            	        	newLeafNode(otherlv_27, grammarAccess.getSoftgoalAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSoftgoalAccess().getUnorderedGroup_3());
            	

            }

            otherlv_28=(Token)match(input,15,FOLLOW_15_in_ruleSoftgoal2569); 

                	newLeafNode(otherlv_28, grammarAccess.getSoftgoalAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1033:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1034:2: (iv_ruleGoal= ruleGoal EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1035:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal2605);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal2615); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1042:1: ruleGoal returns [EObject current=null] : (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' ) ;
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
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_importanceQuantitative_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_importance_18_0 = null;

        Enumerator lv_decompositionType_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1045:28: ( (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1046:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1046:1: (otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1046:3: otherlv_0= 'goal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleGoal2652); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1050:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1051:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1051:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1052:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal2669); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGoal2686); 

                	newLeafNode(otherlv_2, grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1072:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1074:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1074:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1075:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1078:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1079:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1079:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )*
            loop12:
            do {
                int alt12=7;
                int LA12_0 = input.LA(1);

                if ( LA12_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3) ) {
                    alt12=4;
                }
                else if ( LA12_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4) ) {
                    alt12=5;
                }
                else if ( LA12_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5) ) {
                    alt12=6;
                }


                switch (alt12) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1081:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1081:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1082:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1082:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1083:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1086:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1086:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1086:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1086:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleGoal2744); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGoalAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleGoal2756); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1094:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1095:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1095:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1096:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal2773); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleGoal2790); 

            	        	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1123:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1123:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1124:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1124:101: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1125:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1128:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1128:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1128:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1128:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleGoal2858); 

            	        	newLeafNode(otherlv_8, grammarAccess.getGoalAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleGoal2870); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1136:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1137:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1137:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1138:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoal2887); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleGoal2904); 

            	        	newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1165:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1165:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1166:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1166:101: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1167:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1170:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1170:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1170:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1170:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleGoal2972); 

            	        	newLeafNode(otherlv_12, grammarAccess.getGoalAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleGoal2984); 

            	        	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1178:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1179:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1179:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1180:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleGoal3005);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleGoal3017); 

            	        	newLeafNode(otherlv_15, grammarAccess.getGoalAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1207:4: ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1207:4: ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1208:5: {...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1208:101: ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1209:6: ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1212:6: ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1212:7: {...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1212:16: (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1212:18: otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,20,FOLLOW_20_in_ruleGoal3085); 

            	        	newLeafNode(otherlv_16, grammarAccess.getGoalAccess().getImportanceKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleGoal3097); 

            	        	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1220:1: ( (lv_importance_18_0= ruleImportanceType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1221:1: (lv_importance_18_0= ruleImportanceType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1221:1: (lv_importance_18_0= ruleImportanceType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1222:3: lv_importance_18_0= ruleImportanceType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getImportanceImportanceTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportanceType_in_ruleGoal3118);
            	    lv_importance_18_0=ruleImportanceType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"importance",
            	            		lv_importance_18_0, 
            	            		"ImportanceType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleGoal3130); 

            	        	newLeafNode(otherlv_19, grammarAccess.getGoalAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1249:4: ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1249:4: ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1250:5: {...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1250:101: ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1251:6: ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1254:6: ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1254:7: {...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1254:16: (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1254:18: otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleGoal3198); 

            	        	newLeafNode(otherlv_20, grammarAccess.getGoalAccess().getDecompositionTypeKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleGoal3210); 

            	        	newLeafNode(otherlv_21, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1262:1: ( (lv_decompositionType_22_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1263:1: (lv_decompositionType_22_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1263:1: (lv_decompositionType_22_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1264:3: lv_decompositionType_22_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleGoal3231);
            	    lv_decompositionType_22_0=ruleDecompositionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"decompositionType",
            	            		lv_decompositionType_22_0, 
            	            		"DecompositionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleGoal3243); 

            	        	newLeafNode(otherlv_23, grammarAccess.getGoalAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1291:4: ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1291:4: ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1292:5: {...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1292:101: ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1293:6: ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1296:6: ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1296:7: {...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1296:16: (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1296:18: otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,21,FOLLOW_21_in_ruleGoal3311); 

            	        	newLeafNode(otherlv_24, grammarAccess.getGoalAccess().getImportanceQuantitativeKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,18,FOLLOW_18_in_ruleGoal3323); 

            	        	newLeafNode(otherlv_25, grammarAccess.getGoalAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1304:1: ( (lv_importanceQuantitative_26_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1305:1: (lv_importanceQuantitative_26_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1305:1: (lv_importanceQuantitative_26_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1306:3: lv_importanceQuantitative_26_0= RULE_INT
            	    {
            	    lv_importanceQuantitative_26_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleGoal3340); 

            	    			newLeafNode(lv_importanceQuantitative_26_0, grammarAccess.getGoalAccess().getImportanceQuantitativeINTTerminalRuleCall_3_5_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"importanceQuantitative",
            	            		lv_importanceQuantitative_26_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,19,FOLLOW_19_in_ruleGoal3357); 

            	        	newLeafNode(otherlv_27, grammarAccess.getGoalAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGoalAccess().getUnorderedGroup_3());
            	

            }

            otherlv_28=(Token)match(input,15,FOLLOW_15_in_ruleGoal3410); 

                	newLeafNode(otherlv_28, grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1352:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1353:2: (iv_ruleTask= ruleTask EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1354:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask3446);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask3456); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1361:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' ) ;
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
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_importanceQuantitative_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_importance_18_0 = null;

        Enumerator lv_decompositionType_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1364:28: ( (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1365:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1365:1: (otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1365:3: otherlv_0= 'Task' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleTask3493); 

                	newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1369:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1370:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1370:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1371:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTask3510); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTask3527); 

                	newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1391:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1393:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1393:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1394:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1397:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1398:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1398:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )*
            loop13:
            do {
                int alt13=7;
                int LA13_0 = input.LA(1);

                if ( LA13_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2) ) {
                    alt13=3;
                }
                else if ( LA13_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3) ) {
                    alt13=4;
                }
                else if ( LA13_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4) ) {
                    alt13=5;
                }
                else if ( LA13_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5) ) {
                    alt13=6;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1400:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1400:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1401:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1401:101: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1402:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1405:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1405:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1405:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1405:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleTask3585); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleTask3597); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1413:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1414:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1414:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1415:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask3614); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleTask3631); 

            	        	newLeafNode(otherlv_7, grammarAccess.getTaskAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1442:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1442:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1443:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1443:101: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1444:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1447:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1447:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1447:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1447:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleTask3699); 

            	        	newLeafNode(otherlv_8, grammarAccess.getTaskAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleTask3711); 

            	        	newLeafNode(otherlv_9, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1455:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1456:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1456:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1457:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTask3728); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleTask3745); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTaskAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1484:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1484:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1485:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1485:101: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1486:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1489:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1489:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1489:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1489:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleTask3813); 

            	        	newLeafNode(otherlv_12, grammarAccess.getTaskAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleTask3825); 

            	        	newLeafNode(otherlv_13, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1497:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1498:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1498:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1499:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaskAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleTask3846);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleTask3858); 

            	        	newLeafNode(otherlv_15, grammarAccess.getTaskAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1526:4: ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1526:4: ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1527:5: {...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1527:101: ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1528:6: ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1531:6: ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1531:7: {...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1531:16: (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1531:18: otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,20,FOLLOW_20_in_ruleTask3926); 

            	        	newLeafNode(otherlv_16, grammarAccess.getTaskAccess().getImportanceKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleTask3938); 

            	        	newLeafNode(otherlv_17, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1539:1: ( (lv_importance_18_0= ruleImportanceType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1540:1: (lv_importance_18_0= ruleImportanceType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1540:1: (lv_importance_18_0= ruleImportanceType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1541:3: lv_importance_18_0= ruleImportanceType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaskAccess().getImportanceImportanceTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportanceType_in_ruleTask3959);
            	    lv_importance_18_0=ruleImportanceType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"importance",
            	            		lv_importance_18_0, 
            	            		"ImportanceType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleTask3971); 

            	        	newLeafNode(otherlv_19, grammarAccess.getTaskAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1568:4: ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1568:4: ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1569:5: {...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1569:101: ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1570:6: ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1573:6: ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1573:7: {...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1573:16: (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1573:18: otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleTask4039); 

            	        	newLeafNode(otherlv_20, grammarAccess.getTaskAccess().getDecompositionTypeKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleTask4051); 

            	        	newLeafNode(otherlv_21, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1581:1: ( (lv_decompositionType_22_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1582:1: (lv_decompositionType_22_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1582:1: (lv_decompositionType_22_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1583:3: lv_decompositionType_22_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getTaskAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleTask4072);
            	    lv_decompositionType_22_0=ruleDecompositionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getTaskRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"decompositionType",
            	            		lv_decompositionType_22_0, 
            	            		"DecompositionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleTask4084); 

            	        	newLeafNode(otherlv_23, grammarAccess.getTaskAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1610:4: ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1610:4: ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1611:5: {...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "getUnorderedGroupHelper().canSelect(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1611:101: ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1612:6: ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTaskAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1615:6: ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1615:7: {...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTask", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1615:16: (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1615:18: otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,21,FOLLOW_21_in_ruleTask4152); 

            	        	newLeafNode(otherlv_24, grammarAccess.getTaskAccess().getImportanceQuantitativeKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,18,FOLLOW_18_in_ruleTask4164); 

            	        	newLeafNode(otherlv_25, grammarAccess.getTaskAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1623:1: ( (lv_importanceQuantitative_26_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1624:1: (lv_importanceQuantitative_26_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1624:1: (lv_importanceQuantitative_26_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1625:3: lv_importanceQuantitative_26_0= RULE_INT
            	    {
            	    lv_importanceQuantitative_26_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTask4181); 

            	    			newLeafNode(lv_importanceQuantitative_26_0, grammarAccess.getTaskAccess().getImportanceQuantitativeINTTerminalRuleCall_3_5_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTaskRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"importanceQuantitative",
            	            		lv_importanceQuantitative_26_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,19,FOLLOW_19_in_ruleTask4198); 

            	        	newLeafNode(otherlv_27, grammarAccess.getTaskAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTaskAccess().getUnorderedGroup_3());
            	

            }

            otherlv_28=(Token)match(input,15,FOLLOW_15_in_ruleTask4251); 

                	newLeafNode(otherlv_28, grammarAccess.getTaskAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1671:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1672:2: (iv_ruleResource= ruleResource EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1673:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource4287);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource4297); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1680:1: ruleResource returns [EObject current=null] : (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' ) ;
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
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_importanceQuantitative_26_0=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_importance_18_0 = null;

        Enumerator lv_decompositionType_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1683:28: ( (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1684:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1684:1: (otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1684:3: otherlv_0= 'resource' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleResource4334); 

                	newLeafNode(otherlv_0, grammarAccess.getResourceAccess().getResourceKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1688:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1689:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1689:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1690:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleResource4351); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleResource4368); 

                	newLeafNode(otherlv_2, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1710:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1712:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1712:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1713:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1716:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1717:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1717:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) )*
            loop14:
            do {
                int alt14=7;
                int LA14_0 = input.LA(1);

                if ( LA14_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0) ) {
                    alt14=1;
                }
                else if ( LA14_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1) ) {
                    alt14=2;
                }
                else if ( LA14_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2) ) {
                    alt14=3;
                }
                else if ( LA14_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3) ) {
                    alt14=4;
                }
                else if ( LA14_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4) ) {
                    alt14=5;
                }
                else if ( LA14_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5) ) {
                    alt14=6;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1719:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1719:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1720:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1720:105: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1721:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1724:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1724:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1724:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1724:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleResource4426); 

            	        	newLeafNode(otherlv_4, grammarAccess.getResourceAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleResource4438); 

            	        	newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1732:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1733:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1733:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1734:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource4455); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleResource4472); 

            	        	newLeafNode(otherlv_7, grammarAccess.getResourceAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1761:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1761:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1762:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1762:105: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1763:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1766:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1766:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1766:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1766:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleResource4540); 

            	        	newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleResource4552); 

            	        	newLeafNode(otherlv_9, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1774:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1775:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1775:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1776:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleResource4569); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleResource4586); 

            	        	newLeafNode(otherlv_11, grammarAccess.getResourceAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1803:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1803:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1804:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1804:105: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1805:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1808:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1808:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1808:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1808:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleResource4654); 

            	        	newLeafNode(otherlv_12, grammarAccess.getResourceAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleResource4666); 

            	        	newLeafNode(otherlv_13, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1816:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1817:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1817:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1818:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleResource4687);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleResource4699); 

            	        	newLeafNode(otherlv_15, grammarAccess.getResourceAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1845:4: ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1845:4: ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1846:5: {...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1846:105: ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1847:6: ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1850:6: ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1850:7: {...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1850:16: (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1850:18: otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,20,FOLLOW_20_in_ruleResource4767); 

            	        	newLeafNode(otherlv_16, grammarAccess.getResourceAccess().getImportanceKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleResource4779); 

            	        	newLeafNode(otherlv_17, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1858:1: ( (lv_importance_18_0= ruleImportanceType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1859:1: (lv_importance_18_0= ruleImportanceType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1859:1: (lv_importance_18_0= ruleImportanceType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1860:3: lv_importance_18_0= ruleImportanceType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceAccess().getImportanceImportanceTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportanceType_in_ruleResource4800);
            	    lv_importance_18_0=ruleImportanceType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"importance",
            	            		lv_importance_18_0, 
            	            		"ImportanceType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleResource4812); 

            	        	newLeafNode(otherlv_19, grammarAccess.getResourceAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1887:4: ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1887:4: ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1888:5: {...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1888:105: ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1889:6: ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1892:6: ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1892:7: {...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1892:16: (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1892:18: otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleResource4880); 

            	        	newLeafNode(otherlv_20, grammarAccess.getResourceAccess().getDecompositionTypeKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleResource4892); 

            	        	newLeafNode(otherlv_21, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1900:1: ( (lv_decompositionType_22_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1901:1: (lv_decompositionType_22_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1901:1: (lv_decompositionType_22_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1902:3: lv_decompositionType_22_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getResourceAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleResource4913);
            	    lv_decompositionType_22_0=ruleDecompositionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getResourceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"decompositionType",
            	            		lv_decompositionType_22_0, 
            	            		"DecompositionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleResource4925); 

            	        	newLeafNode(otherlv_23, grammarAccess.getResourceAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1929:4: ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1929:4: ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1930:5: {...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "getUnorderedGroupHelper().canSelect(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1930:105: ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1931:6: ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getResourceAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1934:6: ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1934:7: {...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleResource", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1934:16: (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1934:18: otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,21,FOLLOW_21_in_ruleResource4993); 

            	        	newLeafNode(otherlv_24, grammarAccess.getResourceAccess().getImportanceQuantitativeKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,18,FOLLOW_18_in_ruleResource5005); 

            	        	newLeafNode(otherlv_25, grammarAccess.getResourceAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1942:1: ( (lv_importanceQuantitative_26_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1943:1: (lv_importanceQuantitative_26_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1943:1: (lv_importanceQuantitative_26_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1944:3: lv_importanceQuantitative_26_0= RULE_INT
            	    {
            	    lv_importanceQuantitative_26_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleResource5022); 

            	    			newLeafNode(lv_importanceQuantitative_26_0, grammarAccess.getResourceAccess().getImportanceQuantitativeINTTerminalRuleCall_3_5_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getResourceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"importanceQuantitative",
            	            		lv_importanceQuantitative_26_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,19,FOLLOW_19_in_ruleResource5039); 

            	        	newLeafNode(otherlv_27, grammarAccess.getResourceAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getResourceAccess().getUnorderedGroup_3());
            	

            }

            otherlv_28=(Token)match(input,15,FOLLOW_15_in_ruleResource5092); 

                	newLeafNode(otherlv_28, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1990:1: entryRuleIndicator returns [EObject current=null] : iv_ruleIndicator= ruleIndicator EOF ;
    public final EObject entryRuleIndicator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndicator = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1991:2: (iv_ruleIndicator= ruleIndicator EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1992:2: iv_ruleIndicator= ruleIndicator EOF
            {
             newCompositeNode(grammarAccess.getIndicatorRule()); 
            pushFollow(FOLLOW_ruleIndicator_in_entryRuleIndicator5128);
            iv_ruleIndicator=ruleIndicator();

            state._fsp--;

             current =iv_ruleIndicator; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndicator5138); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:1999:1: ruleIndicator returns [EObject current=null] : (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) ) )* ) ) ) otherlv_46= '}' ) ;
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
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token lv_importanceQuantitative_26_0=null;
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
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Enumerator lv_fillColor_14_0 = null;

        Enumerator lv_importance_18_0 = null;

        Enumerator lv_decompositionType_22_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2002:28: ( (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) ) )* ) ) ) otherlv_46= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2003:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) ) )* ) ) ) otherlv_46= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2003:1: (otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) ) )* ) ) ) otherlv_46= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2003:3: otherlv_0= 'indicator' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) ) )* ) ) ) otherlv_46= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleIndicator5175); 

                	newLeafNode(otherlv_0, grammarAccess.getIndicatorAccess().getIndicatorKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2007:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2008:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2008:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2009:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator5192); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleIndicator5209); 

                	newLeafNode(otherlv_2, grammarAccess.getIndicatorAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2029:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2031:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2031:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2032:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2035:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2036:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2036:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) ) )*
            loop18:
            do {
                int alt18=10;
                alt18 = dfa18.predict(input);
                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2038:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2038:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2039:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2039:106: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2040:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2043:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2043:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2043:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2043:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleIndicator5267); 

            	        	newLeafNode(otherlv_4, grammarAccess.getIndicatorAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5279); 

            	        	newLeafNode(otherlv_5, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2051:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2052:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2052:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2053:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator5296); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5313); 

            	        	newLeafNode(otherlv_7, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2080:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2080:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2081:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2081:106: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2082:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2085:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2085:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2085:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2085:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleIndicator5381); 

            	        	newLeafNode(otherlv_8, grammarAccess.getIndicatorAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5393); 

            	        	newLeafNode(otherlv_9, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2093:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2094:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2094:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2095:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleIndicator5410); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5427); 

            	        	newLeafNode(otherlv_11, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2122:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2122:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2123:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2123:106: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2124:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2127:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2127:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2127:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2127:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleIndicator5495); 

            	        	newLeafNode(otherlv_12, grammarAccess.getIndicatorAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5507); 

            	        	newLeafNode(otherlv_13, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2135:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2136:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2136:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2137:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleIndicator5528);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5540); 

            	        	newLeafNode(otherlv_15, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2164:4: ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2164:4: ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2165:5: {...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2165:106: ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2166:6: ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2169:6: ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2169:7: {...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2169:16: (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2169:18: otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,20,FOLLOW_20_in_ruleIndicator5608); 

            	        	newLeafNode(otherlv_16, grammarAccess.getIndicatorAccess().getImportanceKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5620); 

            	        	newLeafNode(otherlv_17, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2177:1: ( (lv_importance_18_0= ruleImportanceType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2178:1: (lv_importance_18_0= ruleImportanceType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2178:1: (lv_importance_18_0= ruleImportanceType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2179:3: lv_importance_18_0= ruleImportanceType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getImportanceImportanceTypeEnumRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleImportanceType_in_ruleIndicator5641);
            	    lv_importance_18_0=ruleImportanceType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"importance",
            	            		lv_importance_18_0, 
            	            		"ImportanceType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5653); 

            	        	newLeafNode(otherlv_19, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2206:4: ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2206:4: ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2207:5: {...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2207:106: ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2208:6: ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2211:6: ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2211:7: {...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2211:16: (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2211:18: otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleIndicator5721); 

            	        	newLeafNode(otherlv_20, grammarAccess.getIndicatorAccess().getDecompositionTypeKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5733); 

            	        	newLeafNode(otherlv_21, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2219:1: ( (lv_decompositionType_22_0= ruleDecompositionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2220:1: (lv_decompositionType_22_0= ruleDecompositionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2220:1: (lv_decompositionType_22_0= ruleDecompositionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2221:3: lv_decompositionType_22_0= ruleDecompositionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getIndicatorAccess().getDecompositionTypeDecompositionTypeEnumRuleCall_3_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDecompositionType_in_ruleIndicator5754);
            	    lv_decompositionType_22_0=ruleDecompositionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getIndicatorRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"decompositionType",
            	            		lv_decompositionType_22_0, 
            	            		"DecompositionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5766); 

            	        	newLeafNode(otherlv_23, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2248:4: ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2248:4: ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2249:5: {...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2249:106: ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2250:6: ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2253:6: ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2253:7: {...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2253:16: (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2253:18: otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,21,FOLLOW_21_in_ruleIndicator5834); 

            	        	newLeafNode(otherlv_24, grammarAccess.getIndicatorAccess().getImportanceQuantitativeKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5846); 

            	        	newLeafNode(otherlv_25, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2261:1: ( (lv_importanceQuantitative_26_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2262:1: (lv_importanceQuantitative_26_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2262:1: (lv_importanceQuantitative_26_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2263:3: lv_importanceQuantitative_26_0= RULE_INT
            	    {
            	    lv_importanceQuantitative_26_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleIndicator5863); 

            	    			newLeafNode(lv_importanceQuantitative_26_0, grammarAccess.getIndicatorAccess().getImportanceQuantitativeINTTerminalRuleCall_3_5_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"importanceQuantitative",
            	            		lv_importanceQuantitative_26_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,19,FOLLOW_19_in_ruleIndicator5880); 

            	        	newLeafNode(otherlv_27, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2290:4: ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2290:4: ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2291:5: {...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2291:106: ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2292:6: ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2295:6: ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2295:7: {...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2295:16: (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2295:18: otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';'
            	    {
            	    otherlv_28=(Token)match(input,30,FOLLOW_30_in_ruleIndicator5948); 

            	        	newLeafNode(otherlv_28, grammarAccess.getIndicatorAccess().getRefsKeyword_3_6_0());
            	        
            	    otherlv_29=(Token)match(input,18,FOLLOW_18_in_ruleIndicator5960); 

            	        	newLeafNode(otherlv_29, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2303:1: ( (otherlv_30= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2304:1: (otherlv_30= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2304:1: (otherlv_30= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2305:3: otherlv_30= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	        }
            	            
            	    otherlv_30=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator5980); 

            	    		newLeafNode(otherlv_30, grammarAccess.getIndicatorAccess().getRefsIntentionalElementRefCrossReference_3_6_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2316:2: (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==31) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2316:4: otherlv_31= ',' ( (otherlv_32= RULE_ID ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,31,FOLLOW_31_in_ruleIndicator5993); 

            	    	        	newLeafNode(otherlv_31, grammarAccess.getIndicatorAccess().getCommaKeyword_3_6_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2320:1: ( (otherlv_32= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2321:1: (otherlv_32= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2321:1: (otherlv_32= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2322:3: otherlv_32= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	    	        }
            	    	            
            	    	    otherlv_32=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator6013); 

            	    	    		newLeafNode(otherlv_32, grammarAccess.getIndicatorAccess().getRefsIntentionalElementRefCrossReference_3_6_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6027); 

            	        	newLeafNode(otherlv_33, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_6_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2344:4: ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2344:4: ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2345:5: {...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2345:106: ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2346:6: ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2349:6: ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2349:7: {...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2349:16: (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2349:18: otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';'
            	    {
            	    otherlv_34=(Token)match(input,32,FOLLOW_32_in_ruleIndicator6095); 

            	        	newLeafNode(otherlv_34, grammarAccess.getIndicatorAccess().getKpiModelLinksDestKeyword_3_7_0());
            	        
            	    otherlv_35=(Token)match(input,18,FOLLOW_18_in_ruleIndicator6107); 

            	        	newLeafNode(otherlv_35, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_7_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2357:1: ( (otherlv_36= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2358:1: (otherlv_36= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2358:1: (otherlv_36= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2359:3: otherlv_36= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	        }
            	            
            	    otherlv_36=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator6127); 

            	    		newLeafNode(otherlv_36, grammarAccess.getIndicatorAccess().getKpiModelLinksDestKPIModelLinkCrossReference_3_7_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2370:2: (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==31) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2370:4: otherlv_37= ',' ( (otherlv_38= RULE_ID ) )
            	    	    {
            	    	    otherlv_37=(Token)match(input,31,FOLLOW_31_in_ruleIndicator6140); 

            	    	        	newLeafNode(otherlv_37, grammarAccess.getIndicatorAccess().getCommaKeyword_3_7_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2374:1: ( (otherlv_38= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2375:1: (otherlv_38= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2375:1: (otherlv_38= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2376:3: otherlv_38= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	    	        }
            	    	            
            	    	    otherlv_38=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator6160); 

            	    	    		newLeafNode(otherlv_38, grammarAccess.getIndicatorAccess().getKpiModelLinksDestKPIModelLinkCrossReference_3_7_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);

            	    otherlv_39=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6174); 

            	        	newLeafNode(otherlv_39, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_7_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2398:4: ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2398:4: ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2399:5: {...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2399:106: ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2400:6: ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 8);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2403:6: ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2403:7: {...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleIndicator", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2403:16: (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2403:18: otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';'
            	    {
            	    otherlv_40=(Token)match(input,33,FOLLOW_33_in_ruleIndicator6242); 

            	        	newLeafNode(otherlv_40, grammarAccess.getIndicatorAccess().getGroupsKeyword_3_8_0());
            	        
            	    otherlv_41=(Token)match(input,18,FOLLOW_18_in_ruleIndicator6254); 

            	        	newLeafNode(otherlv_41, grammarAccess.getIndicatorAccess().getEqualsSignKeyword_3_8_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2411:1: ( (otherlv_42= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2412:1: (otherlv_42= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2412:1: (otherlv_42= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2413:3: otherlv_42= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	        }
            	            
            	    otherlv_42=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator6274); 

            	    		newLeafNode(otherlv_42, grammarAccess.getIndicatorAccess().getGroupsIndicatorGroupCrossReference_3_8_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2424:2: (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==31) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2424:4: otherlv_43= ',' ( (otherlv_44= RULE_ID ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,31,FOLLOW_31_in_ruleIndicator6287); 

            	    	        	newLeafNode(otherlv_43, grammarAccess.getIndicatorAccess().getCommaKeyword_3_8_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2428:1: ( (otherlv_44= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2429:1: (otherlv_44= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2429:1: (otherlv_44= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2430:3: otherlv_44= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getIndicatorRule());
            	    	    	        }
            	    	            
            	    	    otherlv_44=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleIndicator6307); 

            	    	    		newLeafNode(otherlv_44, grammarAccess.getIndicatorAccess().getGroupsIndicatorGroupCrossReference_3_8_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);

            	    otherlv_45=(Token)match(input,19,FOLLOW_19_in_ruleIndicator6321); 

            	        	newLeafNode(otherlv_45, grammarAccess.getIndicatorAccess().getSemicolonKeyword_3_8_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getIndicatorAccess().getUnorderedGroup_3());
            	

            }

            otherlv_46=(Token)match(input,15,FOLLOW_15_in_ruleIndicator6374); 

                	newLeafNode(otherlv_46, grammarAccess.getIndicatorAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleConnection"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2471:1: entryRuleConnection returns [EObject current=null] : iv_ruleConnection= ruleConnection EOF ;
    public final EObject entryRuleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnection = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2472:2: (iv_ruleConnection= ruleConnection EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2473:2: iv_ruleConnection= ruleConnection EOF
            {
             newCompositeNode(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_ruleConnection_in_entryRuleConnection6410);
            iv_ruleConnection=ruleConnection();

            state._fsp--;

             current =iv_ruleConnection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnection6420); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2480:1: ruleConnection returns [EObject current=null] : (this_DecompositionEnds_0= ruleDecompositionEnds | this_ContributionEnds_1= ruleContributionEnds | this_DependencyEnds_2= ruleDependencyEnds ) ;
    public final EObject ruleConnection() throws RecognitionException {
        EObject current = null;

        EObject this_DecompositionEnds_0 = null;

        EObject this_ContributionEnds_1 = null;

        EObject this_DependencyEnds_2 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2483:28: ( (this_DecompositionEnds_0= ruleDecompositionEnds | this_ContributionEnds_1= ruleContributionEnds | this_DependencyEnds_2= ruleDependencyEnds ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2484:1: (this_DecompositionEnds_0= ruleDecompositionEnds | this_ContributionEnds_1= ruleContributionEnds | this_DependencyEnds_2= ruleDependencyEnds )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2484:1: (this_DecompositionEnds_0= ruleDecompositionEnds | this_ContributionEnds_1= ruleContributionEnds | this_DependencyEnds_2= ruleDependencyEnds )
            int alt19=3;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2485:5: this_DecompositionEnds_0= ruleDecompositionEnds
                    {
                     
                            newCompositeNode(grammarAccess.getConnectionAccess().getDecompositionEndsParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleDecompositionEnds_in_ruleConnection6467);
                    this_DecompositionEnds_0=ruleDecompositionEnds();

                    state._fsp--;

                     
                            current = this_DecompositionEnds_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2495:5: this_ContributionEnds_1= ruleContributionEnds
                    {
                     
                            newCompositeNode(grammarAccess.getConnectionAccess().getContributionEndsParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleContributionEnds_in_ruleConnection6494);
                    this_ContributionEnds_1=ruleContributionEnds();

                    state._fsp--;

                     
                            current = this_ContributionEnds_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2505:5: this_DependencyEnds_2= ruleDependencyEnds
                    {
                     
                            newCompositeNode(grammarAccess.getConnectionAccess().getDependencyEndsParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleDependencyEnds_in_ruleConnection6521);
                    this_DependencyEnds_2=ruleDependencyEnds();

                    state._fsp--;

                     
                            current = this_DependencyEnds_2; 
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
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleDecompositionLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2521:1: entryRuleDecompositionLink returns [EObject current=null] : iv_ruleDecompositionLink= ruleDecompositionLink EOF ;
    public final EObject entryRuleDecompositionLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecompositionLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2522:2: (iv_ruleDecompositionLink= ruleDecompositionLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2523:2: iv_ruleDecompositionLink= ruleDecompositionLink EOF
            {
             newCompositeNode(grammarAccess.getDecompositionLinkRule()); 
            pushFollow(FOLLOW_ruleDecompositionLink_in_entryRuleDecompositionLink6556);
            iv_ruleDecompositionLink=ruleDecompositionLink();

            state._fsp--;

             current =iv_ruleDecompositionLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecompositionLink6566); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecompositionLink"


    // $ANTLR start "ruleDecompositionLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2530:1: ruleDecompositionLink returns [EObject current=null] : (otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_17= '}' ) ;
    public final EObject ruleDecompositionLink() throws RecognitionException {
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
        Token otherlv_17=null;
        Enumerator lv_fillColor_14_0 = null;

        EObject lv_connections_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2533:28: ( (otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_17= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2534:1: (otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_17= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2534:1: (otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_17= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2534:3: otherlv_0= 'decomposition' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleDecompositionLink6603); 

                	newLeafNode(otherlv_0, grammarAccess.getDecompositionLinkAccess().getDecompositionKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2538:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2539:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2539:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2540:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDecompositionLink6620); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getDecompositionLinkAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDecompositionLinkRule());
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDecompositionLink6638); 

                	newLeafNode(otherlv_2, grammarAccess.getDecompositionLinkAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2560:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2562:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2562:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2563:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2566:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2567:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2567:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=5;
                int LA22_0 = input.LA(1);

                if ( LA22_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 2) ) {
                    alt22=3;
                }
                else if ( LA22_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 3) ) {
                    alt22=4;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2569:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2569:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2570:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDecompositionLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2570:114: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2571:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2574:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2574:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDecompositionLink", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2574:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2574:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDecompositionLink6696); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDecompositionLinkAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDecompositionLink6708); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDecompositionLinkAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2582:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2583:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2583:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2584:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecompositionLink6725); 

            	    			newLeafNode(lv_label_6_0, grammarAccess.getDecompositionLinkAccess().getLabelSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDecompositionLinkRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"label",
            	            		lv_label_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleDecompositionLink6742); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDecompositionLinkAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2611:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2611:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2612:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDecompositionLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2612:114: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2613:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2616:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2616:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDecompositionLink", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2616:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2616:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleDecompositionLink6810); 

            	        	newLeafNode(otherlv_8, grammarAccess.getDecompositionLinkAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleDecompositionLink6822); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDecompositionLinkAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2624:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2625:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2625:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2626:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDecompositionLink6839); 

            	    			newLeafNode(lv_description_10_0, grammarAccess.getDecompositionLinkAccess().getDescriptionSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDecompositionLinkRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleDecompositionLink6856); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDecompositionLinkAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2653:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2653:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2654:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDecompositionLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2654:114: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2655:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2658:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2658:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDecompositionLink", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2658:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2658:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleDecompositionLink6924); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDecompositionLinkAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleDecompositionLink6936); 

            	        	newLeafNode(otherlv_13, grammarAccess.getDecompositionLinkAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2666:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2667:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2667:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2668:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDecompositionLinkAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleDecompositionLink6957);
            	    lv_fillColor_14_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDecompositionLinkRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"fillColor",
            	            		lv_fillColor_14_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleDecompositionLink6969); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDecompositionLinkAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2695:4: ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2695:4: ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2696:5: {...}? => ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDecompositionLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2696:114: ( ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2697:6: ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2700:6: ({...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) ) )+
            	    int cnt21=0;
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==RULE_ID) ) {
            	            int LA21_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt21=1;
            	            }


            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2700:7: {...}? => ( (lv_connections_16_0= ruleDecompositionEnds ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDecompositionLink", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2700:16: ( (lv_connections_16_0= ruleDecompositionEnds ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2701:1: (lv_connections_16_0= ruleDecompositionEnds )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2701:1: (lv_connections_16_0= ruleDecompositionEnds )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2702:3: lv_connections_16_0= ruleDecompositionEnds
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDecompositionLinkAccess().getConnectionsDecompositionEndsParserRuleCall_3_3_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDecompositionEnds_in_ruleDecompositionLink7045);
            	    	    lv_connections_16_0=ruleDecompositionEnds();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDecompositionLinkRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"connections",
            	    	            		lv_connections_16_0, 
            	    	            		"DecompositionEnds");
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleDecompositionLink", "getUnorderedGroupHelper().canLeave(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDecompositionLinkAccess().getUnorderedGroup_3());
            	

            }

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleDecompositionLink7104); 

                	newLeafNode(otherlv_17, grammarAccess.getDecompositionLinkAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecompositionLink"


    // $ANTLR start "entryRuleDecompositionEnds"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2745:1: entryRuleDecompositionEnds returns [EObject current=null] : iv_ruleDecompositionEnds= ruleDecompositionEnds EOF ;
    public final EObject entryRuleDecompositionEnds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecompositionEnds = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2746:2: (iv_ruleDecompositionEnds= ruleDecompositionEnds EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2747:2: iv_ruleDecompositionEnds= ruleDecompositionEnds EOF
            {
             newCompositeNode(grammarAccess.getDecompositionEndsRule()); 
            pushFollow(FOLLOW_ruleDecompositionEnds_in_entryRuleDecompositionEnds7140);
            iv_ruleDecompositionEnds=ruleDecompositionEnds();

            state._fsp--;

             current =iv_ruleDecompositionEnds; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecompositionEnds7150); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecompositionEnds"


    // $ANTLR start "ruleDecompositionEnds"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2754:1: ruleDecompositionEnds returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleDecompositionEnds() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2757:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2758:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2758:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2758:2: ( ( ruleQualifiedName ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2758:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2759:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2759:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2760:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionEndsRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecompositionEndsAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecompositionEnds7198);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleDecompositionEnds7210); 

                	newLeafNode(otherlv_1, grammarAccess.getDecompositionEndsAccess().getHyphenMinusGreaterThanSignKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2777:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2778:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2778:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2779:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDecompositionEndsRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDecompositionEndsAccess().getDestIntentionalElementCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDecompositionEnds7233);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleDecompositionEnds7245); 

                	newLeafNode(otherlv_3, grammarAccess.getDecompositionEndsAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecompositionEnds"


    // $ANTLR start "entryRuleContributionLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2804:1: entryRuleContributionLink returns [EObject current=null] : iv_ruleContributionLink= ruleContributionLink EOF ;
    public final EObject entryRuleContributionLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2805:2: (iv_ruleContributionLink= ruleContributionLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2806:2: iv_ruleContributionLink= ruleContributionLink EOF
            {
             newCompositeNode(grammarAccess.getContributionLinkRule()); 
            pushFollow(FOLLOW_ruleContributionLink_in_entryRuleContributionLink7281);
            iv_ruleContributionLink=ruleContributionLink();

            state._fsp--;

             current =iv_ruleContributionLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionLink7291); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContributionLink"


    // $ANTLR start "ruleContributionLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2813:1: ruleContributionLink returns [EObject current=null] : (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_35= '}' ) ;
    public final EObject ruleContributionLink() throws RecognitionException {
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_quantitativeContribution_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_correlation_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_description_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Enumerator lv_contribution_10_0 = null;

        Enumerator lv_fillColor_26_0 = null;

        EObject lv_connections_34_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2816:28: ( (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_35= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2817:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_35= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2817:1: (otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_35= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2817:3: otherlv_0= 'contribution' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_35= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleContributionLink7328); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionLinkAccess().getContributionKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2821:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2822:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2822:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2823:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionLink7345); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getContributionLinkAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getContributionLinkRule());
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContributionLink7363); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionLinkAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2843:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2845:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2845:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2846:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2849:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2850:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2850:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=9;
                alt26 = dfa26.predict(input);
                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2852:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2852:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2853:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2853:113: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2854:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2857:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2857:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2857:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2857:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleContributionLink7421); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionLinkAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleContributionLink7433); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContributionLinkAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2865:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2866:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2866:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2867:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContributionLink7450); 

            	    			newLeafNode(lv_label_6_0, grammarAccess.getContributionLinkAccess().getLabelSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionLinkRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"label",
            	            		lv_label_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleContributionLink7467); 

            	        	newLeafNode(otherlv_7, grammarAccess.getContributionLinkAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2894:4: ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2894:4: ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2895:5: {...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2895:113: ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2896:6: ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2899:6: ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2899:7: {...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2899:16: (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2899:18: otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleContributionLink7535); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionLinkAccess().getContributionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleContributionLink7547); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContributionLinkAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2907:1: ( (lv_contribution_10_0= ruleContributionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2908:1: (lv_contribution_10_0= ruleContributionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2908:1: (lv_contribution_10_0= ruleContributionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2909:3: lv_contribution_10_0= ruleContributionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionLinkAccess().getContributionContributionTypeEnumRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionType_in_ruleContributionLink7568);
            	    lv_contribution_10_0=ruleContributionType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContributionLinkRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"contribution",
            	            		lv_contribution_10_0, 
            	            		"ContributionType");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleContributionLink7580); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContributionLinkAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2936:4: ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2936:4: ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2937:5: {...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2937:113: ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2938:6: ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2941:6: ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2941:7: {...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2941:16: (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2941:18: otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,37,FOLLOW_37_in_ruleContributionLink7648); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContributionLinkAccess().getQuantitativeContributionKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleContributionLink7660); 

            	        	newLeafNode(otherlv_13, grammarAccess.getContributionLinkAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2949:1: ( (lv_quantitativeContribution_14_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2950:1: (lv_quantitativeContribution_14_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2950:1: (lv_quantitativeContribution_14_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2951:3: lv_quantitativeContribution_14_0= RULE_INT
            	    {
            	    lv_quantitativeContribution_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionLink7677); 

            	    			newLeafNode(lv_quantitativeContribution_14_0, grammarAccess.getContributionLinkAccess().getQuantitativeContributionINTTerminalRuleCall_3_2_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionLinkRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"quantitativeContribution",
            	            		lv_quantitativeContribution_14_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleContributionLink7694); 

            	        	newLeafNode(otherlv_15, grammarAccess.getContributionLinkAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2978:4: ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2978:4: ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2979:5: {...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2979:113: ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2980:6: ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2983:6: ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2983:7: {...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2983:16: (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2983:18: otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,38,FOLLOW_38_in_ruleContributionLink7762); 

            	        	newLeafNode(otherlv_16, grammarAccess.getContributionLinkAccess().getCorrelationKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleContributionLink7774); 

            	        	newLeafNode(otherlv_17, grammarAccess.getContributionLinkAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2991:1: ( (lv_correlation_18_0= RULE_BOOLEAN ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2992:1: (lv_correlation_18_0= RULE_BOOLEAN )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2992:1: (lv_correlation_18_0= RULE_BOOLEAN )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:2993:3: lv_correlation_18_0= RULE_BOOLEAN
            	    {
            	    lv_correlation_18_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleContributionLink7791); 

            	    			newLeafNode(lv_correlation_18_0, grammarAccess.getContributionLinkAccess().getCorrelationBOOLEANTerminalRuleCall_3_3_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionLinkRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"correlation",
            	            		lv_correlation_18_0, 
            	            		"BOOLEAN");
            	    	    

            	    }


            	    }

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleContributionLink7808); 

            	        	newLeafNode(otherlv_19, grammarAccess.getContributionLinkAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3020:4: ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3020:4: ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3021:5: {...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3021:113: ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3022:6: ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3025:6: ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3025:7: {...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3025:16: (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3025:18: otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,22,FOLLOW_22_in_ruleContributionLink7876); 

            	        	newLeafNode(otherlv_20, grammarAccess.getContributionLinkAccess().getDescriptionKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleContributionLink7888); 

            	        	newLeafNode(otherlv_21, grammarAccess.getContributionLinkAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3033:1: ( (lv_description_22_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3034:1: (lv_description_22_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3034:1: (lv_description_22_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3035:3: lv_description_22_0= RULE_STRING
            	    {
            	    lv_description_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleContributionLink7905); 

            	    			newLeafNode(lv_description_22_0, grammarAccess.getContributionLinkAccess().getDescriptionSTRINGTerminalRuleCall_3_4_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionLinkRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_22_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleContributionLink7922); 

            	        	newLeafNode(otherlv_23, grammarAccess.getContributionLinkAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3062:4: ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3062:4: ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3063:5: {...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3063:113: ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3064:6: ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3067:6: ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3067:7: {...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3067:16: (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3067:18: otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,23,FOLLOW_23_in_ruleContributionLink7990); 

            	        	newLeafNode(otherlv_24, grammarAccess.getContributionLinkAccess().getColorKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,18,FOLLOW_18_in_ruleContributionLink8002); 

            	        	newLeafNode(otherlv_25, grammarAccess.getContributionLinkAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3075:1: ( (lv_fillColor_26_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3076:1: (lv_fillColor_26_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3076:1: (lv_fillColor_26_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3077:3: lv_fillColor_26_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionLinkAccess().getFillColorColorEnumRuleCall_3_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleContributionLink8023);
            	    lv_fillColor_26_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContributionLinkRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"fillColor",
            	            		lv_fillColor_26_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_27=(Token)match(input,19,FOLLOW_19_in_ruleContributionLink8035); 

            	        	newLeafNode(otherlv_27, grammarAccess.getContributionLinkAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3104:4: ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3104:4: ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3105:5: {...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3105:113: ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3106:6: ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3109:6: ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3109:7: {...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3109:16: (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3109:18: otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';'
            	    {
            	    otherlv_28=(Token)match(input,39,FOLLOW_39_in_ruleContributionLink8103); 

            	        	newLeafNode(otherlv_28, grammarAccess.getContributionLinkAccess().getChangesKeyword_3_6_0());
            	        
            	    otherlv_29=(Token)match(input,18,FOLLOW_18_in_ruleContributionLink8115); 

            	        	newLeafNode(otherlv_29, grammarAccess.getContributionLinkAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3117:1: ( (otherlv_30= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3118:1: (otherlv_30= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3118:1: (otherlv_30= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3119:3: otherlv_30= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContributionLinkRule());
            	    	        }
            	            
            	    otherlv_30=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionLink8135); 

            	    		newLeafNode(otherlv_30, grammarAccess.getContributionLinkAccess().getChangesContributionChangeCrossReference_3_6_2_0()); 
            	    	

            	    }


            	    }

            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3130:2: (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==31) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3130:4: otherlv_31= ',' ( (otherlv_32= RULE_ID ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,31,FOLLOW_31_in_ruleContributionLink8148); 

            	    	        	newLeafNode(otherlv_31, grammarAccess.getContributionLinkAccess().getCommaKeyword_3_6_3_0());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3134:1: ( (otherlv_32= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3135:1: (otherlv_32= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3135:1: (otherlv_32= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3136:3: otherlv_32= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContributionLinkRule());
            	    	    	        }
            	    	            
            	    	    otherlv_32=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionLink8168); 

            	    	    		newLeafNode(otherlv_32, grammarAccess.getContributionLinkAccess().getChangesContributionChangeCrossReference_3_6_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop24;
            	        }
            	    } while (true);

            	    otherlv_33=(Token)match(input,19,FOLLOW_19_in_ruleContributionLink8182); 

            	        	newLeafNode(otherlv_33, grammarAccess.getContributionLinkAccess().getSemicolonKeyword_3_6_4());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3158:4: ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3158:4: ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3159:5: {...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleContributionLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3159:113: ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3160:6: ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 7);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3163:6: ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+
            	    int cnt25=0;
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==RULE_ID) ) {
            	            int LA25_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt25=1;
            	            }


            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3163:7: {...}? => ( (lv_connections_34_0= ruleContributionEnds ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleContributionLink", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3163:16: ( (lv_connections_34_0= ruleContributionEnds ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3164:1: (lv_connections_34_0= ruleContributionEnds )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3164:1: (lv_connections_34_0= ruleContributionEnds )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3165:3: lv_connections_34_0= ruleContributionEnds
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContributionLinkAccess().getConnectionsContributionEndsParserRuleCall_3_7_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleContributionEnds_in_ruleContributionLink8258);
            	    	    lv_connections_34_0=ruleContributionEnds();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContributionLinkRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"connections",
            	    	            		lv_connections_34_0, 
            	    	            		"ContributionEnds");
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleContributionLink", "getUnorderedGroupHelper().canLeave(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3());
            	

            }

            otherlv_35=(Token)match(input,15,FOLLOW_15_in_ruleContributionLink8317); 

                	newLeafNode(otherlv_35, grammarAccess.getContributionLinkAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContributionLink"


    // $ANTLR start "entryRuleContributionEnds"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3208:1: entryRuleContributionEnds returns [EObject current=null] : iv_ruleContributionEnds= ruleContributionEnds EOF ;
    public final EObject entryRuleContributionEnds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionEnds = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3209:2: (iv_ruleContributionEnds= ruleContributionEnds EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3210:2: iv_ruleContributionEnds= ruleContributionEnds EOF
            {
             newCompositeNode(grammarAccess.getContributionEndsRule()); 
            pushFollow(FOLLOW_ruleContributionEnds_in_entryRuleContributionEnds8353);
            iv_ruleContributionEnds=ruleContributionEnds();

            state._fsp--;

             current =iv_ruleContributionEnds; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionEnds8363); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContributionEnds"


    // $ANTLR start "ruleContributionEnds"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3217:1: ruleContributionEnds returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '-|->' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleContributionEnds() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3220:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '-|->' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3221:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '-|->' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3221:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '-|->' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3221:2: ( ( ruleQualifiedName ) ) otherlv_1= '-|->' ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3221:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3222:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3222:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3223:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionEndsRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionEndsAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionEnds8411);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleContributionEnds8423); 

                	newLeafNode(otherlv_1, grammarAccess.getContributionEndsAccess().getHyphenMinusVerticalLineHyphenMinusGreaterThanSignKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3240:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3241:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3241:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3242:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getContributionEndsRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getContributionEndsAccess().getDestIntentionalElementCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleContributionEnds8446);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleContributionEnds8458); 

                	newLeafNode(otherlv_3, grammarAccess.getContributionEndsAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContributionEnds"


    // $ANTLR start "entryRuleDependencyLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3267:1: entryRuleDependencyLink returns [EObject current=null] : iv_ruleDependencyLink= ruleDependencyLink EOF ;
    public final EObject entryRuleDependencyLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyLink = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3268:2: (iv_ruleDependencyLink= ruleDependencyLink EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3269:2: iv_ruleDependencyLink= ruleDependencyLink EOF
            {
             newCompositeNode(grammarAccess.getDependencyLinkRule()); 
            pushFollow(FOLLOW_ruleDependencyLink_in_entryRuleDependencyLink8494);
            iv_ruleDependencyLink=ruleDependencyLink();

            state._fsp--;

             current =iv_ruleDependencyLink; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyLink8504); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependencyLink"


    // $ANTLR start "ruleDependencyLink"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3276:1: ruleDependencyLink returns [EObject current=null] : (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_17= '}' ) ;
    public final EObject ruleDependencyLink() throws RecognitionException {
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
        Token otherlv_17=null;
        Enumerator lv_fillColor_14_0 = null;

        EObject lv_connections_16_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3279:28: ( (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_17= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3280:1: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_17= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3280:1: (otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_17= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3280:3: otherlv_0= 'dependency' ( (lv_name_1_0= RULE_ID ) )? otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) ) )+ {...}?) ) ) otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleDependencyLink8541); 

                	newLeafNode(otherlv_0, grammarAccess.getDependencyLinkAccess().getDependencyKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3284:1: ( (lv_name_1_0= RULE_ID ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3285:1: (lv_name_1_0= RULE_ID )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3285:1: (lv_name_1_0= RULE_ID )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3286:3: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDependencyLink8558); 

                    			newLeafNode(lv_name_1_0, grammarAccess.getDependencyLinkAccess().getNameIDTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDependencyLinkRule());
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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDependencyLink8576); 

                	newLeafNode(otherlv_2, grammarAccess.getDependencyLinkAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3306:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3308:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3308:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3309:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3312:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3313:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3313:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) ) )+
            int cnt29=0;
            loop29:
            do {
                int alt29=5;
                int LA29_0 = input.LA(1);

                if ( LA29_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 0) ) {
                    alt29=1;
                }
                else if ( LA29_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 1) ) {
                    alt29=2;
                }
                else if ( LA29_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 2) ) {
                    alt29=3;
                }
                else if ( LA29_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 3) ) {
                    alt29=4;
                }


                switch (alt29) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3315:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3315:4: ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3316:5: {...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDependencyLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3316:111: ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3317:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3320:6: ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3320:7: {...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDependencyLink", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3320:16: (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3320:18: otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleDependencyLink8634); 

            	        	newLeafNode(otherlv_4, grammarAccess.getDependencyLinkAccess().getNameKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleDependencyLink8646); 

            	        	newLeafNode(otherlv_5, grammarAccess.getDependencyLinkAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3328:1: ( (lv_label_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3329:1: (lv_label_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3329:1: (lv_label_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3330:3: lv_label_6_0= RULE_STRING
            	    {
            	    lv_label_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependencyLink8663); 

            	    			newLeafNode(lv_label_6_0, grammarAccess.getDependencyLinkAccess().getLabelSTRINGTerminalRuleCall_3_0_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependencyLinkRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"label",
            	            		lv_label_6_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleDependencyLink8680); 

            	        	newLeafNode(otherlv_7, grammarAccess.getDependencyLinkAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3357:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3357:4: ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3358:5: {...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDependencyLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3358:111: ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3359:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3362:6: ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3362:7: {...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDependencyLink", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3362:16: (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3362:18: otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleDependencyLink8748); 

            	        	newLeafNode(otherlv_8, grammarAccess.getDependencyLinkAccess().getDescriptionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleDependencyLink8760); 

            	        	newLeafNode(otherlv_9, grammarAccess.getDependencyLinkAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3370:1: ( (lv_description_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3371:1: (lv_description_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3371:1: (lv_description_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3372:3: lv_description_10_0= RULE_STRING
            	    {
            	    lv_description_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDependencyLink8777); 

            	    			newLeafNode(lv_description_10_0, grammarAccess.getDependencyLinkAccess().getDescriptionSTRINGTerminalRuleCall_3_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getDependencyLinkRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"description",
            	            		lv_description_10_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleDependencyLink8794); 

            	        	newLeafNode(otherlv_11, grammarAccess.getDependencyLinkAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3399:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3399:4: ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3400:5: {...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDependencyLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3400:111: ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3401:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3404:6: ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3404:7: {...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleDependencyLink", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3404:16: (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3404:18: otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleDependencyLink8862); 

            	        	newLeafNode(otherlv_12, grammarAccess.getDependencyLinkAccess().getColorKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleDependencyLink8874); 

            	        	newLeafNode(otherlv_13, grammarAccess.getDependencyLinkAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3412:1: ( (lv_fillColor_14_0= ruleColor ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3413:1: (lv_fillColor_14_0= ruleColor )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3413:1: (lv_fillColor_14_0= ruleColor )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3414:3: lv_fillColor_14_0= ruleColor
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDependencyLinkAccess().getFillColorColorEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleColor_in_ruleDependencyLink8895);
            	    lv_fillColor_14_0=ruleColor();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDependencyLinkRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"fillColor",
            	            		lv_fillColor_14_0, 
            	            		"Color");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleDependencyLink8907); 

            	        	newLeafNode(otherlv_15, grammarAccess.getDependencyLinkAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3441:4: ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3441:4: ({...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3442:5: {...}? => ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDependencyLink", "getUnorderedGroupHelper().canSelect(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3442:111: ( ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3443:6: ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3446:6: ({...}? => ( (lv_connections_16_0= ruleDependencyEnds ) ) )+
            	    int cnt28=0;
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==RULE_ID) ) {
            	            int LA28_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt28=1;
            	            }


            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3446:7: {...}? => ( (lv_connections_16_0= ruleDependencyEnds ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDependencyLink", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3446:16: ( (lv_connections_16_0= ruleDependencyEnds ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3447:1: (lv_connections_16_0= ruleDependencyEnds )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3447:1: (lv_connections_16_0= ruleDependencyEnds )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3448:3: lv_connections_16_0= ruleDependencyEnds
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getDependencyLinkAccess().getConnectionsDependencyEndsParserRuleCall_3_3_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDependencyEnds_in_ruleDependencyLink8983);
            	    	    lv_connections_16_0=ruleDependencyEnds();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getDependencyLinkRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"connections",
            	    	            		lv_connections_16_0, 
            	    	            		"DependencyEnds");
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleDependencyLink", "getUnorderedGroupHelper().canLeave(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getDependencyLinkAccess().getUnorderedGroup_3());
            	

            }

            otherlv_17=(Token)match(input,15,FOLLOW_15_in_ruleDependencyLink9042); 

                	newLeafNode(otherlv_17, grammarAccess.getDependencyLinkAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependencyLink"


    // $ANTLR start "entryRuleDependencyEnds"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3491:1: entryRuleDependencyEnds returns [EObject current=null] : iv_ruleDependencyEnds= ruleDependencyEnds EOF ;
    public final EObject entryRuleDependencyEnds() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDependencyEnds = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3492:2: (iv_ruleDependencyEnds= ruleDependencyEnds EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3493:2: iv_ruleDependencyEnds= ruleDependencyEnds EOF
            {
             newCompositeNode(grammarAccess.getDependencyEndsRule()); 
            pushFollow(FOLLOW_ruleDependencyEnds_in_entryRuleDependencyEnds9078);
            iv_ruleDependencyEnds=ruleDependencyEnds();

            state._fsp--;

             current =iv_ruleDependencyEnds; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependencyEnds9088); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDependencyEnds"


    // $ANTLR start "ruleDependencyEnds"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3500:1: ruleDependencyEnds returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '-D->' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) ;
    public final EObject ruleDependencyEnds() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3503:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '-D->' ( ( ruleQualifiedName ) ) otherlv_3= ';' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3504:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '-D->' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3504:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '-D->' ( ( ruleQualifiedName ) ) otherlv_3= ';' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3504:2: ( ( ruleQualifiedName ) ) otherlv_1= '-D->' ( ( ruleQualifiedName ) ) otherlv_3= ';'
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3504:2: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3505:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3505:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3506:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyEndsRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyEndsAccess().getSrcIntentionalElementCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependencyEnds9136);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleDependencyEnds9148); 

                	newLeafNode(otherlv_1, grammarAccess.getDependencyEndsAccess().getDKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3523:1: ( ( ruleQualifiedName ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3524:1: ( ruleQualifiedName )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3524:1: ( ruleQualifiedName )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3525:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getDependencyEndsRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getDependencyEndsAccess().getDestIntentionalElementCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleDependencyEnds9171);
            ruleQualifiedName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleDependencyEnds9183); 

                	newLeafNode(otherlv_3, grammarAccess.getDependencyEndsAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDependencyEnds"


    // $ANTLR start "entryRuleEvaluation"
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3564:1: entryRuleEvaluation returns [EObject current=null] : iv_ruleEvaluation= ruleEvaluation EOF ;
    public final EObject entryRuleEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluation = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3565:2: (iv_ruleEvaluation= ruleEvaluation EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3566:2: iv_ruleEvaluation= ruleEvaluation EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRule()); 
            pushFollow(FOLLOW_ruleEvaluation_in_entryRuleEvaluation9233);
            iv_ruleEvaluation=ruleEvaluation();

            state._fsp--;

             current =iv_ruleEvaluation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluation9243); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3573:1: ruleEvaluation returns [EObject current=null] : (otherlv_0= 'eval' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3576:28: ( (otherlv_0= 'eval' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3577:1: (otherlv_0= 'eval' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3577:1: (otherlv_0= 'eval' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3577:3: otherlv_0= 'eval' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) ) ) otherlv_30= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleEvaluation9280); 

                	newLeafNode(otherlv_0, grammarAccess.getEvaluationAccess().getEvalKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3581:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3582:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3582:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3583:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvaluation9297); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleEvaluation9314); 

                	newLeafNode(otherlv_2, grammarAccess.getEvaluationAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3603:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3605:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3605:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3606:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3609:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3610:3: ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3610:3: ( ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=8;
                int LA30_0 = input.LA(1);

                if ( LA30_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 1) ) {
                    alt30=2;
                }
                else if ( LA30_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 2) ) {
                    alt30=3;
                }
                else if ( LA30_0 ==47 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 3) ) {
                    alt30=4;
                }
                else if ( LA30_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 4) ) {
                    alt30=5;
                }
                else if ( LA30_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 5) ) {
                    alt30=6;
                }
                else if ( LA30_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 6) ) {
                    alt30=7;
                }


                switch (alt30) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3612:4: ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3612:4: ({...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3613:5: {...}? => ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3613:107: ( ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3614:6: ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3617:6: ({...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3617:7: {...}? => (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3617:16: (otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3617:18: otherlv_4= 'evaluation' otherlv_5= '=' ( (lv_evaluation_6_0= RULE_INT ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,44,FOLLOW_44_in_ruleEvaluation9372); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEvaluationAccess().getEvaluationKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation9384); 

            	        	newLeafNode(otherlv_5, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3625:1: ( (lv_evaluation_6_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3626:1: (lv_evaluation_6_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3626:1: (lv_evaluation_6_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3627:3: lv_evaluation_6_0= RULE_INT
            	    {
            	    lv_evaluation_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluation9401); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation9418); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3654:4: ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3654:4: ({...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3655:5: {...}? => ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3655:107: ( ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3656:6: ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3659:6: ({...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3659:7: {...}? => (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3659:16: (otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3659:18: otherlv_8= 'qualitativeEvaluation' otherlv_9= '=' ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,45,FOLLOW_45_in_ruleEvaluation9486); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEvaluationAccess().getQualitativeEvaluationKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation9498); 

            	        	newLeafNode(otherlv_9, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3667:1: ( (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3668:1: (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3668:1: (lv_qualitativeEvaluation_10_0= ruleQualitativeLabel )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3669:3: lv_qualitativeEvaluation_10_0= ruleQualitativeLabel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_3_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleEvaluation9519);
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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation9531); 

            	        	newLeafNode(otherlv_11, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3696:4: ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3696:4: ({...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3697:5: {...}? => ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3697:107: ( ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3698:6: ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3701:6: ({...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3701:7: {...}? => (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3701:16: (otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3701:18: otherlv_12= 'exceeds' otherlv_13= '=' ( (lv_exceeds_14_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_12=(Token)match(input,46,FOLLOW_46_in_ruleEvaluation9599); 

            	        	newLeafNode(otherlv_12, grammarAccess.getEvaluationAccess().getExceedsKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation9611); 

            	        	newLeafNode(otherlv_13, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3709:1: ( (lv_exceeds_14_0= RULE_BOOLEAN ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3710:1: (lv_exceeds_14_0= RULE_BOOLEAN )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3710:1: (lv_exceeds_14_0= RULE_BOOLEAN )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3711:3: lv_exceeds_14_0= RULE_BOOLEAN
            	    {
            	    lv_exceeds_14_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleEvaluation9628); 

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
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3734:4: ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3734:4: ({...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3735:5: {...}? => ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3735:107: ( ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3736:6: ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3739:6: ({...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3739:7: {...}? => (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3739:16: (otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3739:18: otherlv_15= 'evalRange' otherlv_16= '=' ( (lv_evalRange_17_0= ruleEvaluationRange ) ) otherlv_18= ';'
            	    {
            	    otherlv_15=(Token)match(input,47,FOLLOW_47_in_ruleEvaluation9701); 

            	        	newLeafNode(otherlv_15, grammarAccess.getEvaluationAccess().getEvalRangeKeyword_3_3_0());
            	        
            	    otherlv_16=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation9713); 

            	        	newLeafNode(otherlv_16, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3747:1: ( (lv_evalRange_17_0= ruleEvaluationRange ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3748:1: (lv_evalRange_17_0= ruleEvaluationRange )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3748:1: (lv_evalRange_17_0= ruleEvaluationRange )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3749:3: lv_evalRange_17_0= ruleEvaluationRange
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getEvalRangeEvaluationRangeParserRuleCall_3_3_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleEvaluationRange_in_ruleEvaluation9734);
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

            	    otherlv_18=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation9746); 

            	        	newLeafNode(otherlv_18, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3776:4: ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3776:4: ({...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3777:5: {...}? => ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3777:107: ( ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3778:6: ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3781:6: ({...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3781:7: {...}? => (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3781:16: (otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3781:18: otherlv_19= 'kpiEvalValueSet' otherlv_20= '=' ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) ) otherlv_22= ';'
            	    {
            	    otherlv_19=(Token)match(input,48,FOLLOW_48_in_ruleEvaluation9814); 

            	        	newLeafNode(otherlv_19, grammarAccess.getEvaluationAccess().getKpiEvalValueSetKeyword_3_4_0());
            	        
            	    otherlv_20=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation9826); 

            	        	newLeafNode(otherlv_20, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3789:1: ( (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3790:1: (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3790:1: (lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3791:3: lv_kpiEvalValueSet_21_0= ruleKPIEvalValueSet
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getKpiEvalValueSetKPIEvalValueSetParserRuleCall_3_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation9847);
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

            	    otherlv_22=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation9859); 

            	        	newLeafNode(otherlv_22, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3818:4: ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3818:4: ({...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3819:5: {...}? => ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3819:107: ( ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3820:6: ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3823:6: ({...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3823:7: {...}? => (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3823:16: (otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3823:18: otherlv_23= 'kpiNewEvalValue' otherlv_24= '=' ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) )
            	    {
            	    otherlv_23=(Token)match(input,49,FOLLOW_49_in_ruleEvaluation9927); 

            	        	newLeafNode(otherlv_23, grammarAccess.getEvaluationAccess().getKpiNewEvalValueKeyword_3_5_0());
            	        
            	    otherlv_24=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation9939); 

            	        	newLeafNode(otherlv_24, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3831:1: ( (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3832:1: (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3832:1: (lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3833:3: lv_kpiNewEvalValue_25_0= ruleKPINewEvalValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getEvaluationAccess().getKpiNewEvalValueKPINewEvalValueParserRuleCall_3_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleKPINewEvalValue_in_ruleEvaluation9960);
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
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3856:4: ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3856:4: ({...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3857:5: {...}? => ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3857:107: ( ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3858:6: ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationAccess().getUnorderedGroup_3(), 6);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3861:6: ({...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3861:7: {...}? => (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluation", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3861:16: (otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3861:18: otherlv_26= 'inElement' otherlv_27= '=' ( (otherlv_28= RULE_ID ) ) otherlv_29= ';'
            	    {
            	    otherlv_26=(Token)match(input,50,FOLLOW_50_in_ruleEvaluation10028); 

            	        	newLeafNode(otherlv_26, grammarAccess.getEvaluationAccess().getInElementKeyword_3_6_0());
            	        
            	    otherlv_27=(Token)match(input,18,FOLLOW_18_in_ruleEvaluation10040); 

            	        	newLeafNode(otherlv_27, grammarAccess.getEvaluationAccess().getEqualsSignKeyword_3_6_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3869:1: ( (otherlv_28= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3870:1: (otherlv_28= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3870:1: (otherlv_28= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3871:3: otherlv_28= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getEvaluationRule());
            	    	        }
            	            
            	    otherlv_28=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvaluation10060); 

            	    		newLeafNode(otherlv_28, grammarAccess.getEvaluationAccess().getInElementIntentionalElementCrossReference_3_6_2_0()); 
            	    	

            	    }


            	    }

            	    otherlv_29=(Token)match(input,19,FOLLOW_19_in_ruleEvaluation10072); 

            	        	newLeafNode(otherlv_29, grammarAccess.getEvaluationAccess().getSemicolonKeyword_3_6_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	    	 				

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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEvaluationAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleEvaluation", "getUnorderedGroupHelper().canLeave(grammarAccess.getEvaluationAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEvaluationAccess().getUnorderedGroup_3());
            	

            }

            otherlv_30=(Token)match(input,15,FOLLOW_15_in_ruleEvaluation10131); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3913:1: entryRuleEvaluationRange returns [EObject current=null] : iv_ruleEvaluationRange= ruleEvaluationRange EOF ;
    public final EObject entryRuleEvaluationRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3914:2: (iv_ruleEvaluationRange= ruleEvaluationRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3915:2: iv_ruleEvaluationRange= ruleEvaluationRange EOF
            {
             newCompositeNode(grammarAccess.getEvaluationRangeRule()); 
            pushFollow(FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange10167);
            iv_ruleEvaluationRange=ruleEvaluationRange();

            state._fsp--;

             current =iv_ruleEvaluationRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationRange10177); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3922:1: ruleEvaluationRange returns [EObject current=null] : (otherlv_0= 'evaluationRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3925:28: ( (otherlv_0= 'evaluationRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3926:1: (otherlv_0= 'evaluationRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3926:1: (otherlv_0= 'evaluationRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3926:3: otherlv_0= 'evaluationRange' otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleEvaluationRange10214); 

                	newLeafNode(otherlv_0, grammarAccess.getEvaluationRangeAccess().getEvaluationRangeKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleEvaluationRange10226); 

                	newLeafNode(otherlv_1, grammarAccess.getEvaluationRangeAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3934:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3936:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3936:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3937:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3940:2: ( ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3941:3: ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3941:3: ( ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) ) )*
            loop31:
            do {
                int alt31=4;
                int LA31_0 = input.LA(1);

                if ( LA31_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 1) ) {
                    alt31=2;
                }
                else if ( LA31_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 2) ) {
                    alt31=3;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3943:4: ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3943:4: ({...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3944:5: {...}? => ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3944:112: ( ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3945:6: ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3948:6: ({...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3948:7: {...}? => (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3948:16: (otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3948:18: otherlv_3= 'start' otherlv_4= '=' ( (lv_start_5_0= RULE_INT ) ) otherlv_6= ';'
            	    {
            	    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleEvaluationRange10284); 

            	        	newLeafNode(otherlv_3, grammarAccess.getEvaluationRangeAccess().getStartKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange10296); 

            	        	newLeafNode(otherlv_4, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3956:1: ( (lv_start_5_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3957:1: (lv_start_5_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3957:1: (lv_start_5_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3958:3: lv_start_5_0= RULE_INT
            	    {
            	    lv_start_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange10313); 

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

            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange10330); 

            	        	newLeafNode(otherlv_6, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_2_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3985:4: ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3985:4: ({...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3986:5: {...}? => ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3986:112: ( ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3987:6: ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3990:6: ({...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3990:7: {...}? => (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3990:16: (otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3990:18: otherlv_7= 'end' otherlv_8= '=' ( (lv_end_9_0= RULE_INT ) ) otherlv_10= ';'
            	    {
            	    otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleEvaluationRange10398); 

            	        	newLeafNode(otherlv_7, grammarAccess.getEvaluationRangeAccess().getEndKeyword_2_1_0());
            	        
            	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange10410); 

            	        	newLeafNode(otherlv_8, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3998:1: ( (lv_end_9_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3999:1: (lv_end_9_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:3999:1: (lv_end_9_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4000:3: lv_end_9_0= RULE_INT
            	    {
            	    lv_end_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange10427); 

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

            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange10444); 

            	        	newLeafNode(otherlv_10, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_2_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4027:4: ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4027:4: ({...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4028:5: {...}? => ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "getUnorderedGroupHelper().canSelect(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4028:112: ( ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4029:6: ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4032:6: ({...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4032:7: {...}? => (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEvaluationRange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4032:16: (otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4032:18: otherlv_11= 'step' otherlv_12= '=' ( (lv_step_13_0= RULE_INT ) ) otherlv_14= ';'
            	    {
            	    otherlv_11=(Token)match(input,54,FOLLOW_54_in_ruleEvaluationRange10512); 

            	        	newLeafNode(otherlv_11, grammarAccess.getEvaluationRangeAccess().getStepKeyword_2_2_0());
            	        
            	    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationRange10524); 

            	        	newLeafNode(otherlv_12, grammarAccess.getEvaluationRangeAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4040:1: ( (lv_step_13_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4041:1: (lv_step_13_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4041:1: (lv_step_13_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4042:3: lv_step_13_0= RULE_INT
            	    {
            	    lv_step_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleEvaluationRange10541); 

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

            	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationRange10558); 

            	        	newLeafNode(otherlv_14, grammarAccess.getEvaluationRangeAccess().getSemicolonKeyword_2_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getEvaluationRangeAccess().getUnorderedGroup_2());
            	

            }

            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleEvaluationRange10611); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4092:1: entryRuleContributionChange returns [EObject current=null] : iv_ruleContributionChange= ruleContributionChange EOF ;
    public final EObject entryRuleContributionChange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionChange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4093:2: (iv_ruleContributionChange= ruleContributionChange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4094:2: iv_ruleContributionChange= ruleContributionChange EOF
            {
             newCompositeNode(grammarAccess.getContributionChangeRule()); 
            pushFollow(FOLLOW_ruleContributionChange_in_entryRuleContributionChange10651);
            iv_ruleContributionChange=ruleContributionChange();

            state._fsp--;

             current =iv_ruleContributionChange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionChange10661); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4101:1: ruleContributionChange returns [EObject current=null] : (otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) ) ) otherlv_16= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4104:28: ( (otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) ) ) otherlv_16= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4105:1: (otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) ) ) otherlv_16= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4105:1: (otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) ) ) otherlv_16= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4105:3: otherlv_0= 'contributionChange' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) ) ) otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleContributionChange10698); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionChangeAccess().getContributionChangeKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4109:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4110:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4110:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4111:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContributionChange10715); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleContributionChange10732); 

                	newLeafNode(otherlv_2, grammarAccess.getContributionChangeAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4131:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4133:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4133:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4134:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4137:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4138:3: ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4138:3: ( ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) ) )*
            loop32:
            do {
                int alt32=4;
                int LA32_0 = input.LA(1);

                if ( LA32_0 ==56 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 0) ) {
                    alt32=1;
                }
                else if ( LA32_0 ==57 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 1) ) {
                    alt32=2;
                }
                else if ( LA32_0 ==58 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 2) ) {
                    alt32=3;
                }


                switch (alt32) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4140:4: ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4140:4: ({...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4141:5: {...}? => ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4141:115: ( ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4142:6: ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4145:6: ({...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4145:7: {...}? => (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4145:16: (otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4145:18: otherlv_4= 'newContribution' otherlv_5= '=' ( (lv_newContribution_6_0= ruleContributionType ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,56,FOLLOW_56_in_ruleContributionChange10790); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionChangeAccess().getNewContributionKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleContributionChange10802); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContributionChangeAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4153:1: ( (lv_newContribution_6_0= ruleContributionType ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4154:1: (lv_newContribution_6_0= ruleContributionType )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4154:1: (lv_newContribution_6_0= ruleContributionType )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4155:3: lv_newContribution_6_0= ruleContributionType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getNewContributionContributionTypeEnumRuleCall_3_0_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionType_in_ruleContributionChange10823);
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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleContributionChange10835); 

            	        	newLeafNode(otherlv_7, grammarAccess.getContributionChangeAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4182:4: ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4182:4: ({...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4183:5: {...}? => ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4183:115: ( ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4184:6: ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4187:6: ({...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4187:7: {...}? => (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4187:16: (otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4187:18: otherlv_8= 'newQuantitativeContribution' otherlv_9= '=' ( (lv_newQuantitativeContribution_10_0= RULE_INT ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,57,FOLLOW_57_in_ruleContributionChange10903); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionChangeAccess().getNewQuantitativeContributionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleContributionChange10915); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContributionChangeAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4195:1: ( (lv_newQuantitativeContribution_10_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4196:1: (lv_newQuantitativeContribution_10_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4196:1: (lv_newQuantitativeContribution_10_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4197:3: lv_newQuantitativeContribution_10_0= RULE_INT
            	    {
            	    lv_newQuantitativeContribution_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionChange10932); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleContributionChange10949); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContributionChangeAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4224:4: ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4224:4: ({...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4225:5: {...}? => ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "getUnorderedGroupHelper().canSelect(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4225:115: ( ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4226:6: ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4229:6: ({...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4229:7: {...}? => (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContributionChange", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4229:16: (otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4229:18: otherlv_12= 'contribRange' otherlv_13= '=' ( (lv_contribRange_14_0= ruleContributionRange ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,58,FOLLOW_58_in_ruleContributionChange11017); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContributionChangeAccess().getContribRangeKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleContributionChange11029); 

            	        	newLeafNode(otherlv_13, grammarAccess.getContributionChangeAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4237:1: ( (lv_contribRange_14_0= ruleContributionRange ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4238:1: (lv_contribRange_14_0= ruleContributionRange )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4238:1: (lv_contribRange_14_0= ruleContributionRange )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4239:3: lv_contribRange_14_0= ruleContributionRange
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContributionChangeAccess().getContribRangeContributionRangeParserRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleContributionRange_in_ruleContributionChange11050);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleContributionChange11062); 

            	        	newLeafNode(otherlv_15, grammarAccess.getContributionChangeAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContributionChangeAccess().getUnorderedGroup_3());
            	

            }

            otherlv_16=(Token)match(input,15,FOLLOW_15_in_ruleContributionChange11115); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4285:1: entryRuleContributionRange returns [EObject current=null] : iv_ruleContributionRange= ruleContributionRange EOF ;
    public final EObject entryRuleContributionRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContributionRange = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4286:2: (iv_ruleContributionRange= ruleContributionRange EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4287:2: iv_ruleContributionRange= ruleContributionRange EOF
            {
             newCompositeNode(grammarAccess.getContributionRangeRule()); 
            pushFollow(FOLLOW_ruleContributionRange_in_entryRuleContributionRange11151);
            iv_ruleContributionRange=ruleContributionRange();

            state._fsp--;

             current =iv_ruleContributionRange; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributionRange11161); 

            }

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
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleContributionRange11198); 

                	newLeafNode(otherlv_0, grammarAccess.getContributionRangeAccess().getContributionRangeKeyword_0());
                
            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleContributionRange11210); 

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
            loop33:
            do {
                int alt33=4;
                int LA33_0 = input.LA(1);

                if ( LA33_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 ==53 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 1) ) {
                    alt33=2;
                }
                else if ( LA33_0 ==54 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2(), 2) ) {
                    alt33=3;
                }


                switch (alt33) {
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
            	    otherlv_3=(Token)match(input,52,FOLLOW_52_in_ruleContributionRange11268); 

            	        	newLeafNode(otherlv_3, grammarAccess.getContributionRangeAccess().getStartKeyword_2_0_0());
            	        
            	    otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange11280); 

            	        	newLeafNode(otherlv_4, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_2_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4328:1: ( (lv_start_5_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4329:1: (lv_start_5_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4329:1: (lv_start_5_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4330:3: lv_start_5_0= RULE_INT
            	    {
            	    lv_start_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange11297); 

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

            	    otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange11314); 

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
            	    otherlv_7=(Token)match(input,53,FOLLOW_53_in_ruleContributionRange11382); 

            	        	newLeafNode(otherlv_7, grammarAccess.getContributionRangeAccess().getEndKeyword_2_1_0());
            	        
            	    otherlv_8=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange11394); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_2_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4370:1: ( (lv_end_9_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4371:1: (lv_end_9_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4371:1: (lv_end_9_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4372:3: lv_end_9_0= RULE_INT
            	    {
            	    lv_end_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange11411); 

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

            	    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange11428); 

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
            	    otherlv_11=(Token)match(input,54,FOLLOW_54_in_ruleContributionRange11496); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContributionRangeAccess().getStepKeyword_2_2_0());
            	        
            	    otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleContributionRange11508); 

            	        	newLeafNode(otherlv_12, grammarAccess.getContributionRangeAccess().getEqualsSignKeyword_2_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4412:1: ( (lv_step_13_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4413:1: (lv_step_13_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4413:1: (lv_step_13_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4414:3: lv_step_13_0= RULE_INT
            	    {
            	    lv_step_13_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleContributionRange11525); 

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

            	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleContributionRange11542); 

            	        	newLeafNode(otherlv_14, grammarAccess.getContributionRangeAccess().getSemicolonKeyword_2_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContributionRangeAccess().getUnorderedGroup_2());
            	

            }

            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleContributionRange11595); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4460:1: entryRuleQualitativeMappings returns [EObject current=null] : iv_ruleQualitativeMappings= ruleQualitativeMappings EOF ;
    public final EObject entryRuleQualitativeMappings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeMappings = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4461:2: (iv_ruleQualitativeMappings= ruleQualitativeMappings EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4462:2: iv_ruleQualitativeMappings= ruleQualitativeMappings EOF
            {
             newCompositeNode(grammarAccess.getQualitativeMappingsRule()); 
            pushFollow(FOLLOW_ruleQualitativeMappings_in_entryRuleQualitativeMappings11631);
            iv_ruleQualitativeMappings=ruleQualitativeMappings();

            state._fsp--;

             current =iv_ruleQualitativeMappings; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitativeMappings11641); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4469:1: ruleQualitativeMappings returns [EObject current=null] : (otherlv_0= 'qualitativeMappings' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) ) ) otherlv_11= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4472:28: ( (otherlv_0= 'qualitativeMappings' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) ) ) otherlv_11= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4473:1: (otherlv_0= 'qualitativeMappings' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) ) ) otherlv_11= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4473:1: (otherlv_0= 'qualitativeMappings' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) ) ) otherlv_11= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4473:3: otherlv_0= 'qualitativeMappings' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleQualitativeMappings11678); 

                	newLeafNode(otherlv_0, grammarAccess.getQualitativeMappingsAccess().getQualitativeMappingsKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4477:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4478:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4478:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4479:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeMappings11695); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleQualitativeMappings11712); 

                	newLeafNode(otherlv_2, grammarAccess.getQualitativeMappingsAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4499:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4501:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4501:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4502:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4505:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4506:3: ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4506:3: ( ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) ) )*
            loop37:
            do {
                int alt37=3;
                int LA37_0 = input.LA(1);

                if ( LA37_0 ==48 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 ==67 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 1) ) {
                    alt37=2;
                }


                switch (alt37) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4508:4: ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4508:4: ({...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4509:5: {...}? => ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMappings", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4509:116: ( ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4510:6: ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4513:6: ({...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' ) )+
            	    int cnt35=0;
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==48) ) {
            	            int LA35_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt35=1;
            	            }


            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4513:7: {...}? => (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleQualitativeMappings", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4513:16: (otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';' )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4513:18: otherlv_4= 'kpiEvalValueSet' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )* otherlv_9= ';'
            	    	    {
            	    	    otherlv_4=(Token)match(input,48,FOLLOW_48_in_ruleQualitativeMappings11770); 

            	    	        	newLeafNode(otherlv_4, grammarAccess.getQualitativeMappingsAccess().getKpiEvalValueSetKeyword_3_0_0());
            	    	        
            	    	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleQualitativeMappings11782); 

            	    	        	newLeafNode(otherlv_5, grammarAccess.getQualitativeMappingsAccess().getEqualsSignKeyword_3_0_1());
            	    	        
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4521:1: ( (otherlv_6= RULE_ID ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4522:1: (otherlv_6= RULE_ID )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4522:1: (otherlv_6= RULE_ID )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4523:3: otherlv_6= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getQualitativeMappingsRule());
            	    	    	        }
            	    	            
            	    	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeMappings11802); 

            	    	    		newLeafNode(otherlv_6, grammarAccess.getQualitativeMappingsAccess().getKpiEvalValueSetKPIEvalValueSetCrossReference_3_0_2_0()); 
            	    	    	

            	    	    }


            	    	    }

            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4534:2: (otherlv_7= ',' ( (otherlv_8= RULE_ID ) ) )*
            	    	    loop34:
            	    	    do {
            	    	        int alt34=2;
            	    	        int LA34_0 = input.LA(1);

            	    	        if ( (LA34_0==31) ) {
            	    	            alt34=1;
            	    	        }


            	    	        switch (alt34) {
            	    	    	case 1 :
            	    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4534:4: otherlv_7= ',' ( (otherlv_8= RULE_ID ) )
            	    	    	    {
            	    	    	    otherlv_7=(Token)match(input,31,FOLLOW_31_in_ruleQualitativeMappings11815); 

            	    	    	        	newLeafNode(otherlv_7, grammarAccess.getQualitativeMappingsAccess().getCommaKeyword_3_0_3_0());
            	    	    	        
            	    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4538:1: ( (otherlv_8= RULE_ID ) )
            	    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4539:1: (otherlv_8= RULE_ID )
            	    	    	    {
            	    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4539:1: (otherlv_8= RULE_ID )
            	    	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4540:3: otherlv_8= RULE_ID
            	    	    	    {

            	    	    	    			if (current==null) {
            	    	    	    	            current = createModelElement(grammarAccess.getQualitativeMappingsRule());
            	    	    	    	        }
            	    	    	            
            	    	    	    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeMappings11835); 

            	    	    	    		newLeafNode(otherlv_8, grammarAccess.getQualitativeMappingsAccess().getKpiEvalValueSetKPIEvalValueSetCrossReference_3_0_3_1_0()); 
            	    	    	    	

            	    	    	    }


            	    	    	    }


            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop34;
            	    	        }
            	    	    } while (true);

            	    	    otherlv_9=(Token)match(input,19,FOLLOW_19_in_ruleQualitativeMappings11849); 

            	    	        	newLeafNode(otherlv_9, grammarAccess.getQualitativeMappingsAccess().getSemicolonKeyword_3_0_4());
            	    	        

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4562:4: ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4562:4: ({...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4563:5: {...}? => ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMappings", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4563:116: ( ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+ )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4564:6: ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4567:6: ({...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) ) )+
            	    int cnt36=0;
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==67) ) {
            	            int LA36_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt36=1;
            	            }


            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4567:7: {...}? => ( (lv_mappin_10_0= ruleQualitativeMapping ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleQualitativeMappings", "true");
            	    	    }
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4567:16: ( (lv_mappin_10_0= ruleQualitativeMapping ) )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4568:1: (lv_mappin_10_0= ruleQualitativeMapping )
            	    	    {
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4568:1: (lv_mappin_10_0= ruleQualitativeMapping )
            	    	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4569:3: lv_mappin_10_0= ruleQualitativeMapping
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getQualitativeMappingsAccess().getMappinQualitativeMappingParserRuleCall_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQualitativeMapping_in_ruleQualitativeMappings11926);
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
            	    	    if ( cnt36 >= 1 ) break loop36;
            	                EarlyExitException eee =
            	                    new EarlyExitException(36, input);
            	                throw eee;
            	        }
            	        cnt36++;
            	    } while (true);

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getQualitativeMappingsAccess().getUnorderedGroup_3());
            	

            }

            otherlv_11=(Token)match(input,15,FOLLOW_15_in_ruleQualitativeMappings11979); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4611:1: entryRuleKPIEvalValueSet returns [EObject current=null] : iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF ;
    public final EObject entryRuleKPIEvalValueSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIEvalValueSet = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4612:2: (iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4613:2: iv_ruleKPIEvalValueSet= ruleKPIEvalValueSet EOF
            {
             newCompositeNode(grammarAccess.getKPIEvalValueSetRule()); 
            pushFollow(FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet12015);
            iv_ruleKPIEvalValueSet=ruleKPIEvalValueSet();

            state._fsp--;

             current =iv_ruleKPIEvalValueSet; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIEvalValueSet12025); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4620:1: ruleKPIEvalValueSet returns [EObject current=null] : (otherlv_0= 'kpiEvalValueSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4623:28: ( (otherlv_0= 'kpiEvalValueSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4624:1: (otherlv_0= 'kpiEvalValueSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4624:1: (otherlv_0= 'kpiEvalValueSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4624:3: otherlv_0= 'kpiEvalValueSet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) ) ) otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleKPIEvalValueSet12062); 

                	newLeafNode(otherlv_0, grammarAccess.getKPIEvalValueSetAccess().getKpiEvalValueSetKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4628:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4629:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4629:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4630:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKPIEvalValueSet12079); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleKPIEvalValueSet12096); 

                	newLeafNode(otherlv_2, grammarAccess.getKPIEvalValueSetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4650:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4652:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4652:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4653:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4656:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4657:3: ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4657:3: ( ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) ) )*
            loop38:
            do {
                int alt38=7;
                int LA38_0 = input.LA(1);

                if ( LA38_0 ==61 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 0) ) {
                    alt38=1;
                }
                else if ( LA38_0 ==62 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 1) ) {
                    alt38=2;
                }
                else if ( LA38_0 ==63 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 2) ) {
                    alt38=3;
                }
                else if ( LA38_0 ==64 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 3) ) {
                    alt38=4;
                }
                else if ( LA38_0 ==65 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 4) ) {
                    alt38=5;
                }
                else if ( LA38_0 ==66 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 5) ) {
                    alt38=6;
                }


                switch (alt38) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4659:4: ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4659:4: ({...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4660:5: {...}? => ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4660:112: ( ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4661:6: ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4664:6: ({...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4664:7: {...}? => (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4664:16: (otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4664:18: otherlv_4= 'targetValue' otherlv_5= '=' ( (lv_targetValue_6_0= RULE_DOUBLE ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,61,FOLLOW_61_in_ruleKPIEvalValueSet12154); 

            	        	newLeafNode(otherlv_4, grammarAccess.getKPIEvalValueSetAccess().getTargetValueKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleKPIEvalValueSet12166); 

            	        	newLeafNode(otherlv_5, grammarAccess.getKPIEvalValueSetAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4672:1: ( (lv_targetValue_6_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4673:1: (lv_targetValue_6_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4673:1: (lv_targetValue_6_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4674:3: lv_targetValue_6_0= RULE_DOUBLE
            	    {
            	    lv_targetValue_6_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet12183); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleKPIEvalValueSet12200); 

            	        	newLeafNode(otherlv_7, grammarAccess.getKPIEvalValueSetAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4701:4: ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4701:4: ({...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4702:5: {...}? => ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4702:112: ( ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4703:6: ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4706:6: ({...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4706:7: {...}? => (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4706:16: (otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4706:18: otherlv_8= 'thresholdValue' otherlv_9= '=' ( (lv_thresholdValue_10_0= RULE_DOUBLE ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,62,FOLLOW_62_in_ruleKPIEvalValueSet12268); 

            	        	newLeafNode(otherlv_8, grammarAccess.getKPIEvalValueSetAccess().getThresholdValueKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleKPIEvalValueSet12280); 

            	        	newLeafNode(otherlv_9, grammarAccess.getKPIEvalValueSetAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4714:1: ( (lv_thresholdValue_10_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4715:1: (lv_thresholdValue_10_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4715:1: (lv_thresholdValue_10_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4716:3: lv_thresholdValue_10_0= RULE_DOUBLE
            	    {
            	    lv_thresholdValue_10_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet12297); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleKPIEvalValueSet12314); 

            	        	newLeafNode(otherlv_11, grammarAccess.getKPIEvalValueSetAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4743:4: ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4743:4: ({...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4744:5: {...}? => ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4744:112: ( ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4745:6: ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4748:6: ({...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4748:7: {...}? => (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4748:16: (otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4748:18: otherlv_12= 'worstValue' otherlv_13= '=' ( (lv_worstValue_14_0= RULE_DOUBLE ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,63,FOLLOW_63_in_ruleKPIEvalValueSet12382); 

            	        	newLeafNode(otherlv_12, grammarAccess.getKPIEvalValueSetAccess().getWorstValueKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleKPIEvalValueSet12394); 

            	        	newLeafNode(otherlv_13, grammarAccess.getKPIEvalValueSetAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4756:1: ( (lv_worstValue_14_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4757:1: (lv_worstValue_14_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4757:1: (lv_worstValue_14_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4758:3: lv_worstValue_14_0= RULE_DOUBLE
            	    {
            	    lv_worstValue_14_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet12411); 

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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleKPIEvalValueSet12428); 

            	        	newLeafNode(otherlv_15, grammarAccess.getKPIEvalValueSetAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4785:4: ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4785:4: ({...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4786:5: {...}? => ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4786:112: ( ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4787:6: ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4790:6: ({...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4790:7: {...}? => (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4790:16: (otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4790:18: otherlv_16= 'evaluationValue' otherlv_17= '=' ( (lv_evaluationValue_18_0= RULE_DOUBLE ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,64,FOLLOW_64_in_ruleKPIEvalValueSet12496); 

            	        	newLeafNode(otherlv_16, grammarAccess.getKPIEvalValueSetAccess().getEvaluationValueKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleKPIEvalValueSet12508); 

            	        	newLeafNode(otherlv_17, grammarAccess.getKPIEvalValueSetAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4798:1: ( (lv_evaluationValue_18_0= RULE_DOUBLE ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4799:1: (lv_evaluationValue_18_0= RULE_DOUBLE )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4799:1: (lv_evaluationValue_18_0= RULE_DOUBLE )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4800:3: lv_evaluationValue_18_0= RULE_DOUBLE
            	    {
            	    lv_evaluationValue_18_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet12525); 

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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleKPIEvalValueSet12542); 

            	        	newLeafNode(otherlv_19, grammarAccess.getKPIEvalValueSetAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4827:4: ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4827:4: ({...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4828:5: {...}? => ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4828:112: ( ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4829:6: ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 4);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4832:6: ({...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4832:7: {...}? => (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4832:16: (otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4832:18: otherlv_20= 'unit' otherlv_21= '=' ( (lv_unit_22_0= RULE_STRING ) ) otherlv_23= ';'
            	    {
            	    otherlv_20=(Token)match(input,65,FOLLOW_65_in_ruleKPIEvalValueSet12610); 

            	        	newLeafNode(otherlv_20, grammarAccess.getKPIEvalValueSetAccess().getUnitKeyword_3_4_0());
            	        
            	    otherlv_21=(Token)match(input,18,FOLLOW_18_in_ruleKPIEvalValueSet12622); 

            	        	newLeafNode(otherlv_21, grammarAccess.getKPIEvalValueSetAccess().getEqualsSignKeyword_3_4_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4840:1: ( (lv_unit_22_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4841:1: (lv_unit_22_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4841:1: (lv_unit_22_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4842:3: lv_unit_22_0= RULE_STRING
            	    {
            	    lv_unit_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKPIEvalValueSet12639); 

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

            	    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleKPIEvalValueSet12656); 

            	        	newLeafNode(otherlv_23, grammarAccess.getKPIEvalValueSetAccess().getSemicolonKeyword_3_4_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4869:4: ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4869:4: ({...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4870:5: {...}? => ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4870:112: ( ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4871:6: ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3(), 5);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4874:6: ({...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4874:7: {...}? => (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIEvalValueSet", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4874:16: (otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4874:18: otherlv_24= 'qualitativeEvaluationValue' otherlv_25= '=' ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) ) otherlv_27= ';'
            	    {
            	    otherlv_24=(Token)match(input,66,FOLLOW_66_in_ruleKPIEvalValueSet12724); 

            	        	newLeafNode(otherlv_24, grammarAccess.getKPIEvalValueSetAccess().getQualitativeEvaluationValueKeyword_3_5_0());
            	        
            	    otherlv_25=(Token)match(input,18,FOLLOW_18_in_ruleKPIEvalValueSet12736); 

            	        	newLeafNode(otherlv_25, grammarAccess.getKPIEvalValueSetAccess().getEqualsSignKeyword_3_5_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4882:1: ( (lv_qualitativeEvaluationValue_26_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4883:1: (lv_qualitativeEvaluationValue_26_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4883:1: (lv_qualitativeEvaluationValue_26_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4884:3: lv_qualitativeEvaluationValue_26_0= RULE_STRING
            	    {
            	    lv_qualitativeEvaluationValue_26_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKPIEvalValueSet12753); 

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

            	    otherlv_27=(Token)match(input,19,FOLLOW_19_in_ruleKPIEvalValueSet12770); 

            	        	newLeafNode(otherlv_27, grammarAccess.getKPIEvalValueSetAccess().getSemicolonKeyword_3_5_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getKPIEvalValueSetAccess().getUnorderedGroup_3());
            	

            }

            otherlv_28=(Token)match(input,15,FOLLOW_15_in_ruleKPIEvalValueSet12823); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4930:1: entryRuleQualitativeMapping returns [EObject current=null] : iv_ruleQualitativeMapping= ruleQualitativeMapping EOF ;
    public final EObject entryRuleQualitativeMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualitativeMapping = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4931:2: (iv_ruleQualitativeMapping= ruleQualitativeMapping EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4932:2: iv_ruleQualitativeMapping= ruleQualitativeMapping EOF
            {
             newCompositeNode(grammarAccess.getQualitativeMappingRule()); 
            pushFollow(FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping12859);
            iv_ruleQualitativeMapping=ruleQualitativeMapping();

            state._fsp--;

             current =iv_ruleQualitativeMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualitativeMapping12869); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4939:1: ruleQualitativeMapping returns [EObject current=null] : (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4942:28: ( (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4943:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4943:1: (otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4943:3: otherlv_0= 'qualitativeMapping' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleQualitativeMapping12906); 

                	newLeafNode(otherlv_0, grammarAccess.getQualitativeMappingAccess().getQualitativeMappingKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4947:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4948:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4948:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4949:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualitativeMapping12923); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleQualitativeMapping12940); 

                	newLeafNode(otherlv_2, grammarAccess.getQualitativeMappingAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4969:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4971:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4971:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4972:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4975:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4976:3: ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )*
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4976:3: ( ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) )*
            loop39:
            do {
                int alt39=5;
                int LA39_0 = input.LA(1);

                if ( LA39_0 ==68 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0) ) {
                    alt39=1;
                }
                else if ( LA39_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1) ) {
                    alt39=2;
                }
                else if ( LA39_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 2) ) {
                    alt39=3;
                }
                else if ( LA39_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 3) ) {
                    alt39=4;
                }


                switch (alt39) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4978:4: ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4978:4: ({...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4979:5: {...}? => ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4979:115: ( ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4980:6: ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4983:6: ({...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4983:7: {...}? => (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4983:16: (otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4983:18: otherlv_4= 'realWorldLabel' otherlv_5= '=' ( (lv_realWorldLabel_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleQualitativeMapping12998); 

            	        	newLeafNode(otherlv_4, grammarAccess.getQualitativeMappingAccess().getRealWorldLabelKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleQualitativeMapping13010); 

            	        	newLeafNode(otherlv_5, grammarAccess.getQualitativeMappingAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4991:1: ( (lv_realWorldLabel_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4992:1: (lv_realWorldLabel_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4992:1: (lv_realWorldLabel_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:4993:3: lv_realWorldLabel_6_0= RULE_STRING
            	    {
            	    lv_realWorldLabel_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleQualitativeMapping13027); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleQualitativeMapping13044); 

            	        	newLeafNode(otherlv_7, grammarAccess.getQualitativeMappingAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5020:4: ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5020:4: ({...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5021:5: {...}? => ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5021:115: ( ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5022:6: ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5025:6: ({...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5025:7: {...}? => (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5025:16: (otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5025:18: otherlv_8= 'evaluation' otherlv_9= '=' ( (lv_evaluation_10_0= RULE_INT ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleQualitativeMapping13112); 

            	        	newLeafNode(otherlv_8, grammarAccess.getQualitativeMappingAccess().getEvaluationKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleQualitativeMapping13124); 

            	        	newLeafNode(otherlv_9, grammarAccess.getQualitativeMappingAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5033:1: ( (lv_evaluation_10_0= RULE_INT ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5034:1: (lv_evaluation_10_0= RULE_INT )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5034:1: (lv_evaluation_10_0= RULE_INT )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5035:3: lv_evaluation_10_0= RULE_INT
            	    {
            	    lv_evaluation_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleQualitativeMapping13141); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleQualitativeMapping13158); 

            	        	newLeafNode(otherlv_11, grammarAccess.getQualitativeMappingAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5062:4: ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5062:4: ({...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5063:5: {...}? => ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5063:115: ( ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5064:6: ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5067:6: ({...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5067:7: {...}? => (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5067:16: (otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5067:18: otherlv_12= 'qualitativeEvaluation' otherlv_13= '=' ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) ) otherlv_15= ';'
            	    {
            	    otherlv_12=(Token)match(input,45,FOLLOW_45_in_ruleQualitativeMapping13226); 

            	        	newLeafNode(otherlv_12, grammarAccess.getQualitativeMappingAccess().getQualitativeEvaluationKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleQualitativeMapping13238); 

            	        	newLeafNode(otherlv_13, grammarAccess.getQualitativeMappingAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5075:1: ( (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5076:1: (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5076:1: (lv_qualitativeEvaluation_14_0= ruleQualitativeLabel )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5077:3: lv_qualitativeEvaluation_14_0= ruleQualitativeLabel
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQualitativeMappingAccess().getQualitativeEvaluationQualitativeLabelEnumRuleCall_3_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQualitativeLabel_in_ruleQualitativeMapping13259);
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

            	    otherlv_15=(Token)match(input,19,FOLLOW_19_in_ruleQualitativeMapping13271); 

            	        	newLeafNode(otherlv_15, grammarAccess.getQualitativeMappingAccess().getSemicolonKeyword_3_2_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5104:4: ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5104:4: ({...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5105:5: {...}? => ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "getUnorderedGroupHelper().canSelect(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5105:115: ( ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5106:6: ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3(), 3);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5109:6: ({...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5109:7: {...}? => (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleQualitativeMapping", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5109:16: (otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5109:18: otherlv_16= 'exceeds' otherlv_17= '=' ( (lv_exceeds_18_0= RULE_BOOLEAN ) ) otherlv_19= ';'
            	    {
            	    otherlv_16=(Token)match(input,46,FOLLOW_46_in_ruleQualitativeMapping13339); 

            	        	newLeafNode(otherlv_16, grammarAccess.getQualitativeMappingAccess().getExceedsKeyword_3_3_0());
            	        
            	    otherlv_17=(Token)match(input,18,FOLLOW_18_in_ruleQualitativeMapping13351); 

            	        	newLeafNode(otherlv_17, grammarAccess.getQualitativeMappingAccess().getEqualsSignKeyword_3_3_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5117:1: ( (lv_exceeds_18_0= RULE_BOOLEAN ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5118:1: (lv_exceeds_18_0= RULE_BOOLEAN )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5118:1: (lv_exceeds_18_0= RULE_BOOLEAN )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5119:3: lv_exceeds_18_0= RULE_BOOLEAN
            	    {
            	    lv_exceeds_18_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleQualitativeMapping13368); 

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

            	    otherlv_19=(Token)match(input,19,FOLLOW_19_in_ruleQualitativeMapping13385); 

            	        	newLeafNode(otherlv_19, grammarAccess.getQualitativeMappingAccess().getSemicolonKeyword_3_3_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getQualitativeMappingAccess().getUnorderedGroup_3());
            	

            }

            otherlv_20=(Token)match(input,15,FOLLOW_15_in_ruleQualitativeMapping13438); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5165:1: entryRuleKPINewEvalValue returns [EObject current=null] : iv_ruleKPINewEvalValue= ruleKPINewEvalValue EOF ;
    public final EObject entryRuleKPINewEvalValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPINewEvalValue = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5166:2: (iv_ruleKPINewEvalValue= ruleKPINewEvalValue EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5167:2: iv_ruleKPINewEvalValue= ruleKPINewEvalValue EOF
            {
             newCompositeNode(grammarAccess.getKPINewEvalValueRule()); 
            pushFollow(FOLLOW_ruleKPINewEvalValue_in_entryRuleKPINewEvalValue13474);
            iv_ruleKPINewEvalValue=ruleKPINewEvalValue();

            state._fsp--;

             current =iv_ruleKPINewEvalValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPINewEvalValue13484); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5174:1: ruleKPINewEvalValue returns [EObject current=null] : (otherlv_0= 'kpiNewEvalValue' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'evaluationValue' otherlv_4= '=' ( (lv_evaluationValue_5_0= RULE_DOUBLE ) ) otherlv_6= ';' otherlv_7= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5177:28: ( (otherlv_0= 'kpiNewEvalValue' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'evaluationValue' otherlv_4= '=' ( (lv_evaluationValue_5_0= RULE_DOUBLE ) ) otherlv_6= ';' otherlv_7= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5178:1: (otherlv_0= 'kpiNewEvalValue' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'evaluationValue' otherlv_4= '=' ( (lv_evaluationValue_5_0= RULE_DOUBLE ) ) otherlv_6= ';' otherlv_7= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5178:1: (otherlv_0= 'kpiNewEvalValue' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'evaluationValue' otherlv_4= '=' ( (lv_evaluationValue_5_0= RULE_DOUBLE ) ) otherlv_6= ';' otherlv_7= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5178:3: otherlv_0= 'kpiNewEvalValue' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'evaluationValue' otherlv_4= '=' ( (lv_evaluationValue_5_0= RULE_DOUBLE ) ) otherlv_6= ';' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleKPINewEvalValue13521); 

                	newLeafNode(otherlv_0, grammarAccess.getKPINewEvalValueAccess().getKpiNewEvalValueKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5182:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5183:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5183:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5184:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKPINewEvalValue13538); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleKPINewEvalValue13555); 

                	newLeafNode(otherlv_2, grammarAccess.getKPINewEvalValueAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,64,FOLLOW_64_in_ruleKPINewEvalValue13567); 

                	newLeafNode(otherlv_3, grammarAccess.getKPINewEvalValueAccess().getEvaluationValueKeyword_3());
                
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleKPINewEvalValue13579); 

                	newLeafNode(otherlv_4, grammarAccess.getKPINewEvalValueAccess().getEqualsSignKeyword_4());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5212:1: ( (lv_evaluationValue_5_0= RULE_DOUBLE ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5213:1: (lv_evaluationValue_5_0= RULE_DOUBLE )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5213:1: (lv_evaluationValue_5_0= RULE_DOUBLE )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5214:3: lv_evaluationValue_5_0= RULE_DOUBLE
            {
            lv_evaluationValue_5_0=(Token)match(input,RULE_DOUBLE,FOLLOW_RULE_DOUBLE_in_ruleKPINewEvalValue13596); 

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

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleKPINewEvalValue13613); 

                	newLeafNode(otherlv_6, grammarAccess.getKPINewEvalValueAccess().getSemicolonKeyword_6());
                
            otherlv_7=(Token)match(input,15,FOLLOW_15_in_ruleKPINewEvalValue13625); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5246:1: entryRuleKPIInformationConfig returns [EObject current=null] : iv_ruleKPIInformationConfig= ruleKPIInformationConfig EOF ;
    public final EObject entryRuleKPIInformationConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKPIInformationConfig = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5247:2: (iv_ruleKPIInformationConfig= ruleKPIInformationConfig EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5248:2: iv_ruleKPIInformationConfig= ruleKPIInformationConfig EOF
            {
             newCompositeNode(grammarAccess.getKPIInformationConfigRule()); 
            pushFollow(FOLLOW_ruleKPIInformationConfig_in_entryRuleKPIInformationConfig13661);
            iv_ruleKPIInformationConfig=ruleKPIInformationConfig();

            state._fsp--;

             current =iv_ruleKPIInformationConfig; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKPIInformationConfig13671); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5255:1: ruleKPIInformationConfig returns [EObject current=null] : (otherlv_0= 'kpiInformationConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5258:28: ( (otherlv_0= 'kpiInformationConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5259:1: (otherlv_0= 'kpiInformationConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5259:1: (otherlv_0= 'kpiInformationConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}' )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5259:3: otherlv_0= 'kpiInformationConfig' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleKPIInformationConfig13708); 

                	newLeafNode(otherlv_0, grammarAccess.getKPIInformationConfigAccess().getKpiInformationConfigKeyword_0());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5263:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5264:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5264:1: (lv_name_1_0= RULE_ID )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5265:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKPIInformationConfig13725); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleKPIInformationConfig13742); 

                	newLeafNode(otherlv_2, grammarAccess.getKPIInformationConfigAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5285:1: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5287:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5287:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5288:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3());
            	
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5291:2: ( ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?)
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5292:3: ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+ {...}?
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5292:3: ( ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=4;
                int LA40_0 = input.LA(1);

                if ( LA40_0 ==70 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 0) ) {
                    alt40=1;
                }
                else if ( LA40_0 ==71 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 1) ) {
                    alt40=2;
                }
                else if ( LA40_0 ==72 && getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 2) ) {
                    alt40=3;
                }


                switch (alt40) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5294:4: ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5294:4: ({...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5295:5: {...}? => ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleKPIInformationConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5295:117: ( ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5296:6: ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5299:6: ({...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5299:7: {...}? => (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIInformationConfig", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5299:16: (otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5299:18: otherlv_4= 'levelOfDimension' otherlv_5= '=' ( (lv_levelOfDimension_6_0= RULE_STRING ) ) otherlv_7= ';'
            	    {
            	    otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleKPIInformationConfig13800); 

            	        	newLeafNode(otherlv_4, grammarAccess.getKPIInformationConfigAccess().getLevelOfDimensionKeyword_3_0_0());
            	        
            	    otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleKPIInformationConfig13812); 

            	        	newLeafNode(otherlv_5, grammarAccess.getKPIInformationConfigAccess().getEqualsSignKeyword_3_0_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5307:1: ( (lv_levelOfDimension_6_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5308:1: (lv_levelOfDimension_6_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5308:1: (lv_levelOfDimension_6_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5309:3: lv_levelOfDimension_6_0= RULE_STRING
            	    {
            	    lv_levelOfDimension_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKPIInformationConfig13829); 

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

            	    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleKPIInformationConfig13846); 

            	        	newLeafNode(otherlv_7, grammarAccess.getKPIInformationConfigAccess().getSemicolonKeyword_3_0_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5336:4: ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5336:4: ({...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5337:5: {...}? => ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleKPIInformationConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5337:117: ( ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5338:6: ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5341:6: ({...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5341:7: {...}? => (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIInformationConfig", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5341:16: (otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';' )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5341:18: otherlv_8= 'valueOfDimension' otherlv_9= '=' ( (lv_valueOfDimension_10_0= RULE_STRING ) ) otherlv_11= ';'
            	    {
            	    otherlv_8=(Token)match(input,71,FOLLOW_71_in_ruleKPIInformationConfig13914); 

            	        	newLeafNode(otherlv_8, grammarAccess.getKPIInformationConfigAccess().getValueOfDimensionKeyword_3_1_0());
            	        
            	    otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleKPIInformationConfig13926); 

            	        	newLeafNode(otherlv_9, grammarAccess.getKPIInformationConfigAccess().getEqualsSignKeyword_3_1_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5349:1: ( (lv_valueOfDimension_10_0= RULE_STRING ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5350:1: (lv_valueOfDimension_10_0= RULE_STRING )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5350:1: (lv_valueOfDimension_10_0= RULE_STRING )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5351:3: lv_valueOfDimension_10_0= RULE_STRING
            	    {
            	    lv_valueOfDimension_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleKPIInformationConfig13943); 

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

            	    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleKPIInformationConfig13960); 

            	        	newLeafNode(otherlv_11, grammarAccess.getKPIInformationConfigAccess().getSemicolonKeyword_3_1_3());
            	        

            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5378:4: ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5378:4: ({...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5379:5: {...}? => ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleKPIInformationConfig", "getUnorderedGroupHelper().canSelect(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5379:117: ( ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5380:6: ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5383:6: ({...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5383:7: {...}? => (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleKPIInformationConfig", "true");
            	    }
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5383:16: (otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5383:18: otherlv_12= 'kpiInfoElement' otherlv_13= '=' ( (otherlv_14= RULE_ID ) )
            	    {
            	    otherlv_12=(Token)match(input,72,FOLLOW_72_in_ruleKPIInformationConfig14028); 

            	        	newLeafNode(otherlv_12, grammarAccess.getKPIInformationConfigAccess().getKpiInfoElementKeyword_3_2_0());
            	        
            	    otherlv_13=(Token)match(input,18,FOLLOW_18_in_ruleKPIInformationConfig14040); 

            	        	newLeafNode(otherlv_13, grammarAccess.getKPIInformationConfigAccess().getEqualsSignKeyword_3_2_1());
            	        
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5391:1: ( (otherlv_14= RULE_ID ) )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5392:1: (otherlv_14= RULE_ID )
            	    {
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5392:1: (otherlv_14= RULE_ID )
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5393:3: otherlv_14= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getKPIInformationConfigRule());
            	    	        }
            	            
            	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleKPIInformationConfig14060); 

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
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleKPIInformationConfig", "getUnorderedGroupHelper().canLeave(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getKPIInformationConfigAccess().getUnorderedGroup_3());
            	

            }

            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleKPIInformationConfig14119); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5439:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5440:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5441:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName14164);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName14175); 

            }

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5448:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5451:28: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5452:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5452:1: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5452:6: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName14215); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5459:1: (kw= '.' this_ID_2= RULE_ID )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==73) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5460:2: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,73,FOLLOW_73_in_ruleQualifiedName14234); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName14249); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5480:1: ruleImportanceType returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) ;
    public final Enumerator ruleImportanceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5482:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5483:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5483:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            int alt42=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt42=1;
                }
                break;
            case 75:
                {
                alt42=2;
                }
                break;
            case 76:
                {
                alt42=3;
                }
                break;
            case 77:
                {
                alt42=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5483:2: (enumLiteral_0= 'None' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5483:2: (enumLiteral_0= 'None' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5483:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleImportanceType14310); 

                            current = grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getImportanceTypeAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5489:6: (enumLiteral_1= 'High' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5489:6: (enumLiteral_1= 'High' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5489:8: enumLiteral_1= 'High'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleImportanceType14327); 

                            current = grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getImportanceTypeAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5495:6: (enumLiteral_2= 'Medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5495:6: (enumLiteral_2= 'Medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5495:8: enumLiteral_2= 'Medium'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleImportanceType14344); 

                            current = grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getImportanceTypeAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5501:6: (enumLiteral_3= 'Low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5501:6: (enumLiteral_3= 'Low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5501:8: enumLiteral_3= 'Low'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_ruleImportanceType14361); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5511:1: ruleDecompositionType returns [Enumerator current=null] : ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) | (enumLiteral_2= 'Xor' ) ) ;
    public final Enumerator ruleDecompositionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5513:28: ( ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) | (enumLiteral_2= 'Xor' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5514:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) | (enumLiteral_2= 'Xor' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5514:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) | (enumLiteral_2= 'Xor' ) )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt43=1;
                }
                break;
            case 79:
                {
                alt43=2;
                }
                break;
            case 80:
                {
                alt43=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5514:2: (enumLiteral_0= 'And' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5514:2: (enumLiteral_0= 'And' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5514:4: enumLiteral_0= 'And'
                    {
                    enumLiteral_0=(Token)match(input,78,FOLLOW_78_in_ruleDecompositionType14406); 

                            current = grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDecompositionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5520:6: (enumLiteral_1= 'Or' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5520:6: (enumLiteral_1= 'Or' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5520:8: enumLiteral_1= 'Or'
                    {
                    enumLiteral_1=(Token)match(input,79,FOLLOW_79_in_ruleDecompositionType14423); 

                            current = grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDecompositionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5526:6: (enumLiteral_2= 'Xor' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5526:6: (enumLiteral_2= 'Xor' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5526:8: enumLiteral_2= 'Xor'
                    {
                    enumLiteral_2=(Token)match(input,80,FOLLOW_80_in_ruleDecompositionType14440); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5536:1: ruleContributionType returns [Enumerator current=null] : ( (enumLiteral_0= 'Help' ) | (enumLiteral_1= 'Make' ) | (enumLiteral_2= 'SomePositive' ) | (enumLiteral_3= 'Unknown' ) | (enumLiteral_4= 'SomeNegative' ) | (enumLiteral_5= 'Hurt' ) | (enumLiteral_6= 'Break' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5538:28: ( ( (enumLiteral_0= 'Help' ) | (enumLiteral_1= 'Make' ) | (enumLiteral_2= 'SomePositive' ) | (enumLiteral_3= 'Unknown' ) | (enumLiteral_4= 'SomeNegative' ) | (enumLiteral_5= 'Hurt' ) | (enumLiteral_6= 'Break' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5539:1: ( (enumLiteral_0= 'Help' ) | (enumLiteral_1= 'Make' ) | (enumLiteral_2= 'SomePositive' ) | (enumLiteral_3= 'Unknown' ) | (enumLiteral_4= 'SomeNegative' ) | (enumLiteral_5= 'Hurt' ) | (enumLiteral_6= 'Break' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5539:1: ( (enumLiteral_0= 'Help' ) | (enumLiteral_1= 'Make' ) | (enumLiteral_2= 'SomePositive' ) | (enumLiteral_3= 'Unknown' ) | (enumLiteral_4= 'SomeNegative' ) | (enumLiteral_5= 'Hurt' ) | (enumLiteral_6= 'Break' ) )
            int alt44=7;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt44=1;
                }
                break;
            case 82:
                {
                alt44=2;
                }
                break;
            case 83:
                {
                alt44=3;
                }
                break;
            case 84:
                {
                alt44=4;
                }
                break;
            case 85:
                {
                alt44=5;
                }
                break;
            case 86:
                {
                alt44=6;
                }
                break;
            case 87:
                {
                alt44=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5539:2: (enumLiteral_0= 'Help' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5539:2: (enumLiteral_0= 'Help' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5539:4: enumLiteral_0= 'Help'
                    {
                    enumLiteral_0=(Token)match(input,81,FOLLOW_81_in_ruleContributionType14485); 

                            current = grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getContributionTypeAccess().getHelpEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5545:6: (enumLiteral_1= 'Make' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5545:6: (enumLiteral_1= 'Make' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5545:8: enumLiteral_1= 'Make'
                    {
                    enumLiteral_1=(Token)match(input,82,FOLLOW_82_in_ruleContributionType14502); 

                            current = grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getContributionTypeAccess().getMakeEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5551:6: (enumLiteral_2= 'SomePositive' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5551:6: (enumLiteral_2= 'SomePositive' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5551:8: enumLiteral_2= 'SomePositive'
                    {
                    enumLiteral_2=(Token)match(input,83,FOLLOW_83_in_ruleContributionType14519); 

                            current = grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getContributionTypeAccess().getSomePositiveEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5557:6: (enumLiteral_3= 'Unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5557:6: (enumLiteral_3= 'Unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5557:8: enumLiteral_3= 'Unknown'
                    {
                    enumLiteral_3=(Token)match(input,84,FOLLOW_84_in_ruleContributionType14536); 

                            current = grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getContributionTypeAccess().getUnknownEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5563:6: (enumLiteral_4= 'SomeNegative' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5563:6: (enumLiteral_4= 'SomeNegative' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5563:8: enumLiteral_4= 'SomeNegative'
                    {
                    enumLiteral_4=(Token)match(input,85,FOLLOW_85_in_ruleContributionType14553); 

                            current = grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getContributionTypeAccess().getSomeNegativeEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5569:6: (enumLiteral_5= 'Hurt' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5569:6: (enumLiteral_5= 'Hurt' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5569:8: enumLiteral_5= 'Hurt'
                    {
                    enumLiteral_5=(Token)match(input,86,FOLLOW_86_in_ruleContributionType14570); 

                            current = grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getContributionTypeAccess().getHurtEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5575:6: (enumLiteral_6= 'Break' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5575:6: (enumLiteral_6= 'Break' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5575:8: enumLiteral_6= 'Break'
                    {
                    enumLiteral_6=(Token)match(input,87,FOLLOW_87_in_ruleContributionType14587); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5585:1: ruleQualitativeLabel returns [Enumerator current=null] : ( (enumLiteral_0= 'Denied' ) | (enumLiteral_1= 'WeaklyDenied' ) | (enumLiteral_2= 'WeaklySatisfied' ) | (enumLiteral_3= 'Satisfied' ) | (enumLiteral_4= 'Conflict' ) | (enumLiteral_5= 'Unknown' ) | (enumLiteral_6= 'None' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5587:28: ( ( (enumLiteral_0= 'Denied' ) | (enumLiteral_1= 'WeaklyDenied' ) | (enumLiteral_2= 'WeaklySatisfied' ) | (enumLiteral_3= 'Satisfied' ) | (enumLiteral_4= 'Conflict' ) | (enumLiteral_5= 'Unknown' ) | (enumLiteral_6= 'None' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5588:1: ( (enumLiteral_0= 'Denied' ) | (enumLiteral_1= 'WeaklyDenied' ) | (enumLiteral_2= 'WeaklySatisfied' ) | (enumLiteral_3= 'Satisfied' ) | (enumLiteral_4= 'Conflict' ) | (enumLiteral_5= 'Unknown' ) | (enumLiteral_6= 'None' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5588:1: ( (enumLiteral_0= 'Denied' ) | (enumLiteral_1= 'WeaklyDenied' ) | (enumLiteral_2= 'WeaklySatisfied' ) | (enumLiteral_3= 'Satisfied' ) | (enumLiteral_4= 'Conflict' ) | (enumLiteral_5= 'Unknown' ) | (enumLiteral_6= 'None' ) )
            int alt45=7;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt45=1;
                }
                break;
            case 89:
                {
                alt45=2;
                }
                break;
            case 90:
                {
                alt45=3;
                }
                break;
            case 91:
                {
                alt45=4;
                }
                break;
            case 92:
                {
                alt45=5;
                }
                break;
            case 84:
                {
                alt45=6;
                }
                break;
            case 74:
                {
                alt45=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5588:2: (enumLiteral_0= 'Denied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5588:2: (enumLiteral_0= 'Denied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5588:4: enumLiteral_0= 'Denied'
                    {
                    enumLiteral_0=(Token)match(input,88,FOLLOW_88_in_ruleQualitativeLabel14632); 

                            current = grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getQualitativeLabelAccess().getDeniedEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5594:6: (enumLiteral_1= 'WeaklyDenied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5594:6: (enumLiteral_1= 'WeaklyDenied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5594:8: enumLiteral_1= 'WeaklyDenied'
                    {
                    enumLiteral_1=(Token)match(input,89,FOLLOW_89_in_ruleQualitativeLabel14649); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getQualitativeLabelAccess().getWeaklyDeniedEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5600:6: (enumLiteral_2= 'WeaklySatisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5600:6: (enumLiteral_2= 'WeaklySatisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5600:8: enumLiteral_2= 'WeaklySatisfied'
                    {
                    enumLiteral_2=(Token)match(input,90,FOLLOW_90_in_ruleQualitativeLabel14666); 

                            current = grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getQualitativeLabelAccess().getWeaklySatisfiedEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5606:6: (enumLiteral_3= 'Satisfied' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5606:6: (enumLiteral_3= 'Satisfied' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5606:8: enumLiteral_3= 'Satisfied'
                    {
                    enumLiteral_3=(Token)match(input,91,FOLLOW_91_in_ruleQualitativeLabel14683); 

                            current = grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getQualitativeLabelAccess().getSatisfiedEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5612:6: (enumLiteral_4= 'Conflict' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5612:6: (enumLiteral_4= 'Conflict' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5612:8: enumLiteral_4= 'Conflict'
                    {
                    enumLiteral_4=(Token)match(input,92,FOLLOW_92_in_ruleQualitativeLabel14700); 

                            current = grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getQualitativeLabelAccess().getConflictEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5618:6: (enumLiteral_5= 'Unknown' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5618:6: (enumLiteral_5= 'Unknown' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5618:8: enumLiteral_5= 'Unknown'
                    {
                    enumLiteral_5=(Token)match(input,84,FOLLOW_84_in_ruleQualitativeLabel14717); 

                            current = grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getQualitativeLabelAccess().getUnknownEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5624:6: (enumLiteral_6= 'None' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5624:6: (enumLiteral_6= 'None' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5624:8: enumLiteral_6= 'None'
                    {
                    enumLiteral_6=(Token)match(input,74,FOLLOW_74_in_ruleQualitativeLabel14734); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5634:1: ruleColor returns [Enumerator current=null] : ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) ) ;
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
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5636:28: ( ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5637:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5637:1: ( (enumLiteral_0= 'white' ) | (enumLiteral_1= 'black' ) | (enumLiteral_2= 'blue' ) | (enumLiteral_3= 'green' ) | (enumLiteral_4= 'cyan' ) | (enumLiteral_5= 'red' ) | (enumLiteral_6= 'purple' ) | (enumLiteral_7= 'yellow' ) | (enumLiteral_8= 'gray' ) | (enumLiteral_9= 'lightGray' ) | (enumLiteral_10= 'lightBlue' ) | (enumLiteral_11= 'lightGreen' ) | (enumLiteral_12= 'lightCray' ) | (enumLiteral_13= 'lightRed' ) | (enumLiteral_14= 'lightPurple' ) | (enumLiteral_15= 'lightYellow' ) )
            int alt46=16;
            switch ( input.LA(1) ) {
            case 93:
                {
                alt46=1;
                }
                break;
            case 94:
                {
                alt46=2;
                }
                break;
            case 95:
                {
                alt46=3;
                }
                break;
            case 96:
                {
                alt46=4;
                }
                break;
            case 97:
                {
                alt46=5;
                }
                break;
            case 98:
                {
                alt46=6;
                }
                break;
            case 99:
                {
                alt46=7;
                }
                break;
            case 100:
                {
                alt46=8;
                }
                break;
            case 101:
                {
                alt46=9;
                }
                break;
            case 102:
                {
                alt46=10;
                }
                break;
            case 103:
                {
                alt46=11;
                }
                break;
            case 104:
                {
                alt46=12;
                }
                break;
            case 105:
                {
                alt46=13;
                }
                break;
            case 106:
                {
                alt46=14;
                }
                break;
            case 107:
                {
                alt46=15;
                }
                break;
            case 108:
                {
                alt46=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5637:2: (enumLiteral_0= 'white' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5637:2: (enumLiteral_0= 'white' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5637:4: enumLiteral_0= 'white'
                    {
                    enumLiteral_0=(Token)match(input,93,FOLLOW_93_in_ruleColor14779); 

                            current = grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getColorAccess().getWhiteEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5643:6: (enumLiteral_1= 'black' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5643:6: (enumLiteral_1= 'black' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5643:8: enumLiteral_1= 'black'
                    {
                    enumLiteral_1=(Token)match(input,94,FOLLOW_94_in_ruleColor14796); 

                            current = grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getColorAccess().getBlackEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5649:6: (enumLiteral_2= 'blue' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5649:6: (enumLiteral_2= 'blue' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5649:8: enumLiteral_2= 'blue'
                    {
                    enumLiteral_2=(Token)match(input,95,FOLLOW_95_in_ruleColor14813); 

                            current = grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getColorAccess().getBlueEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5655:6: (enumLiteral_3= 'green' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5655:6: (enumLiteral_3= 'green' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5655:8: enumLiteral_3= 'green'
                    {
                    enumLiteral_3=(Token)match(input,96,FOLLOW_96_in_ruleColor14830); 

                            current = grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getColorAccess().getGreenEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5661:6: (enumLiteral_4= 'cyan' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5661:6: (enumLiteral_4= 'cyan' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5661:8: enumLiteral_4= 'cyan'
                    {
                    enumLiteral_4=(Token)match(input,97,FOLLOW_97_in_ruleColor14847); 

                            current = grammarAccess.getColorAccess().getCyanEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getColorAccess().getCyanEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5667:6: (enumLiteral_5= 'red' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5667:6: (enumLiteral_5= 'red' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5667:8: enumLiteral_5= 'red'
                    {
                    enumLiteral_5=(Token)match(input,98,FOLLOW_98_in_ruleColor14864); 

                            current = grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getColorAccess().getRedEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5673:6: (enumLiteral_6= 'purple' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5673:6: (enumLiteral_6= 'purple' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5673:8: enumLiteral_6= 'purple'
                    {
                    enumLiteral_6=(Token)match(input,99,FOLLOW_99_in_ruleColor14881); 

                            current = grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getColorAccess().getPurpleEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5679:6: (enumLiteral_7= 'yellow' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5679:6: (enumLiteral_7= 'yellow' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5679:8: enumLiteral_7= 'yellow'
                    {
                    enumLiteral_7=(Token)match(input,100,FOLLOW_100_in_ruleColor14898); 

                            current = grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getColorAccess().getYellowEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5685:6: (enumLiteral_8= 'gray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5685:6: (enumLiteral_8= 'gray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5685:8: enumLiteral_8= 'gray'
                    {
                    enumLiteral_8=(Token)match(input,101,FOLLOW_101_in_ruleColor14915); 

                            current = grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getColorAccess().getGrayEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5691:6: (enumLiteral_9= 'lightGray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5691:6: (enumLiteral_9= 'lightGray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5691:8: enumLiteral_9= 'lightGray'
                    {
                    enumLiteral_9=(Token)match(input,102,FOLLOW_102_in_ruleColor14932); 

                            current = grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getColorAccess().getLightGrayEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5697:6: (enumLiteral_10= 'lightBlue' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5697:6: (enumLiteral_10= 'lightBlue' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5697:8: enumLiteral_10= 'lightBlue'
                    {
                    enumLiteral_10=(Token)match(input,103,FOLLOW_103_in_ruleColor14949); 

                            current = grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getColorAccess().getLightBlueEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5703:6: (enumLiteral_11= 'lightGreen' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5703:6: (enumLiteral_11= 'lightGreen' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5703:8: enumLiteral_11= 'lightGreen'
                    {
                    enumLiteral_11=(Token)match(input,104,FOLLOW_104_in_ruleColor14966); 

                            current = grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getColorAccess().getLightGreenEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;
                case 13 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5709:6: (enumLiteral_12= 'lightCray' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5709:6: (enumLiteral_12= 'lightCray' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5709:8: enumLiteral_12= 'lightCray'
                    {
                    enumLiteral_12=(Token)match(input,105,FOLLOW_105_in_ruleColor14983); 

                            current = grammarAccess.getColorAccess().getLightCrayEnumLiteralDeclaration_12().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_12, grammarAccess.getColorAccess().getLightCrayEnumLiteralDeclaration_12()); 
                        

                    }


                    }
                    break;
                case 14 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5715:6: (enumLiteral_13= 'lightRed' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5715:6: (enumLiteral_13= 'lightRed' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5715:8: enumLiteral_13= 'lightRed'
                    {
                    enumLiteral_13=(Token)match(input,106,FOLLOW_106_in_ruleColor15000); 

                            current = grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_13().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_13, grammarAccess.getColorAccess().getLightRedEnumLiteralDeclaration_13()); 
                        

                    }


                    }
                    break;
                case 15 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5721:6: (enumLiteral_14= 'lightPurple' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5721:6: (enumLiteral_14= 'lightPurple' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5721:8: enumLiteral_14= 'lightPurple'
                    {
                    enumLiteral_14=(Token)match(input,107,FOLLOW_107_in_ruleColor15017); 

                            current = grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_14().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_14, grammarAccess.getColorAccess().getLightPurpleEnumLiteralDeclaration_14()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5727:6: (enumLiteral_15= 'lightYellow' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5727:6: (enumLiteral_15= 'lightYellow' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5727:8: enumLiteral_15= 'lightYellow'
                    {
                    enumLiteral_15=(Token)match(input,108,FOLLOW_108_in_ruleColor15034); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5737:1: ruleCriticality returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) ;
    public final Enumerator ruleCriticality() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5739:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5740:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5740:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            int alt47=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt47=1;
                }
                break;
            case 75:
                {
                alt47=2;
                }
                break;
            case 76:
                {
                alt47=3;
                }
                break;
            case 77:
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
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5740:2: (enumLiteral_0= 'None' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5740:2: (enumLiteral_0= 'None' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5740:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_ruleCriticality15079); 

                            current = grammarAccess.getCriticalityAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCriticalityAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5746:6: (enumLiteral_1= 'High' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5746:6: (enumLiteral_1= 'High' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5746:8: enumLiteral_1= 'High'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_ruleCriticality15096); 

                            current = grammarAccess.getCriticalityAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCriticalityAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5752:6: (enumLiteral_2= 'Medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5752:6: (enumLiteral_2= 'Medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5752:8: enumLiteral_2= 'Medium'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_ruleCriticality15113); 

                            current = grammarAccess.getCriticalityAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCriticalityAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5758:6: (enumLiteral_3= 'Low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5758:6: (enumLiteral_3= 'Low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5758:8: enumLiteral_3= 'Low'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_ruleCriticality15130); 

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
    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5768:1: rulePriority returns [Enumerator current=null] : ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) ;
    public final Enumerator rulePriority() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5770:28: ( ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) ) )
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5771:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            {
            // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5771:1: ( (enumLiteral_0= 'None' ) | (enumLiteral_1= 'High' ) | (enumLiteral_2= 'Medium' ) | (enumLiteral_3= 'Low' ) )
            int alt48=4;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt48=1;
                }
                break;
            case 75:
                {
                alt48=2;
                }
                break;
            case 76:
                {
                alt48=3;
                }
                break;
            case 77:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5771:2: (enumLiteral_0= 'None' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5771:2: (enumLiteral_0= 'None' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5771:4: enumLiteral_0= 'None'
                    {
                    enumLiteral_0=(Token)match(input,74,FOLLOW_74_in_rulePriority15175); 

                            current = grammarAccess.getPriorityAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPriorityAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5777:6: (enumLiteral_1= 'High' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5777:6: (enumLiteral_1= 'High' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5777:8: enumLiteral_1= 'High'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_75_in_rulePriority15192); 

                            current = grammarAccess.getPriorityAccess().getHighEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPriorityAccess().getHighEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5783:6: (enumLiteral_2= 'Medium' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5783:6: (enumLiteral_2= 'Medium' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5783:8: enumLiteral_2= 'Medium'
                    {
                    enumLiteral_2=(Token)match(input,76,FOLLOW_76_in_rulePriority15209); 

                            current = grammarAccess.getPriorityAccess().getMediumEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPriorityAccess().getMediumEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5789:6: (enumLiteral_3= 'Low' )
                    {
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5789:6: (enumLiteral_3= 'Low' )
                    // ../org.xtext.grl.tgrl/src-gen/org/xtext/grl/tgrl/parser/antlr/internal/InternalTGRL.g:5789:8: enumLiteral_3= 'Low'
                    {
                    enumLiteral_3=(Token)match(input,77,FOLLOW_77_in_rulePriority15226); 

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


    protected DFA9 dfa9 = new DFA9(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA9_eotS =
        "\13\uffff";
    static final String DFA9_eofS =
        "\13\uffff";
    static final String DFA9_minS =
        "\1\17\1\uffff\10\0\1\uffff";
    static final String DFA9_maxS =
        "\1\51\1\uffff\10\0\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\2\10\uffff\1\1";
    static final String DFA9_specialS =
        "\2\uffff\1\7\1\2\1\3\1\4\1\5\1\6\1\0\1\1\1\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\1\uffff\1\1\2\uffff\4\1\1\2\1\uffff\1\3\1\4\1\5\1\6\4"+
            "\uffff\1\7\1\uffff\1\10\4\uffff\1\11",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "()+ loopback of 651:6: ({...}? => ( ( (lv_elemets_24_0= ruleIntentionalElement ) ) | ( (lv_elemets_25_0= ruleElementLink ) ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA9_8 = input.LA(1);

                         
                        int index9_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_8);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA9_9 = input.LA(1);

                         
                        int index9_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_9);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA9_3 = input.LA(1);

                         
                        int index9_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA9_4 = input.LA(1);

                         
                        int index9_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA9_5 = input.LA(1);

                         
                        int index9_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA9_6 = input.LA(1);

                         
                        int index9_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA9_7 = input.LA(1);

                         
                        int index9_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA9_2 = input.LA(1);

                         
                        int index9_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((true)) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index9_2);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 9, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA18_eotS =
        "\13\uffff";
    static final String DFA18_eofS =
        "\13\uffff";
    static final String DFA18_minS =
        "\1\17\12\uffff";
    static final String DFA18_maxS =
        "\1\41\12\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA18_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\1\1\uffff\1\2\2\uffff\1\5\1\7\1\3\1\4\1\uffff\1\6\4\uffff"+
            "\1\10\1\uffff\1\11\1\12",
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "()* loopback of 2036:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'description' otherlv_9= '=' ( (lv_description_10_0= RULE_STRING ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'color' otherlv_13= '=' ( (lv_fillColor_14_0= ruleColor ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'importance' otherlv_17= '=' ( (lv_importance_18_0= ruleImportanceType ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'decompositionType' otherlv_21= '=' ( (lv_decompositionType_22_0= ruleDecompositionType ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'importanceQuantitative' otherlv_25= '=' ( (lv_importanceQuantitative_26_0= RULE_INT ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'refs' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_34= 'kpiModelLinksDest' otherlv_35= '=' ( (otherlv_36= RULE_ID ) ) (otherlv_37= ',' ( (otherlv_38= RULE_ID ) ) )* otherlv_39= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_40= 'groups' otherlv_41= '=' ( (otherlv_42= RULE_ID ) ) (otherlv_43= ',' ( (otherlv_44= RULE_ID ) ) )* otherlv_45= ';' ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_0 = input.LA(1);

                         
                        int index18_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA18_0==15) ) {s = 1;}

                        else if ( LA18_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA18_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA18_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA18_0 ==20 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA18_0 ==25 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA18_0 ==21 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA18_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA18_0 ==32 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA18_0 ==33 && getUnorderedGroupHelper().canSelect(grammarAccess.getIndicatorAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                         
                        input.seek(index18_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA19_eotS =
        "\7\uffff";
    static final String DFA19_eofS =
        "\7\uffff";
    static final String DFA19_minS =
        "\1\4\1\43\1\4\3\uffff\1\43";
    static final String DFA19_maxS =
        "\1\4\1\111\1\4\3\uffff\1\111";
    static final String DFA19_acceptS =
        "\3\uffff\1\3\1\2\1\1\1\uffff";
    static final String DFA19_specialS =
        "\7\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1",
            "\1\5\4\uffff\1\4\1\uffff\1\3\36\uffff\1\2",
            "\1\6",
            "",
            "",
            "",
            "\1\5\4\uffff\1\4\1\uffff\1\3\36\uffff\1\2"
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "2484:1: (this_DecompositionEnds_0= ruleDecompositionEnds | this_ContributionEnds_1= ruleContributionEnds | this_DependencyEnds_2= ruleDependencyEnds )";
        }
    }
    static final String DFA26_eotS =
        "\12\uffff";
    static final String DFA26_eofS =
        "\12\uffff";
    static final String DFA26_minS =
        "\1\4\11\uffff";
    static final String DFA26_maxS =
        "\1\47\11\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String DFA26_specialS =
        "\1\0\11\uffff}>";
    static final String[] DFA26_transitionS = {
            "\1\11\12\uffff\1\1\1\uffff\1\2\4\uffff\1\6\1\7\14\uffff\1\3"+
            "\1\4\1\5\1\10",
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

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "()+ loopback of 2850:3: ( ({...}? => ( ({...}? => (otherlv_4= 'name' otherlv_5= '=' ( (lv_label_6_0= RULE_STRING ) ) otherlv_7= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'contribution' otherlv_9= '=' ( (lv_contribution_10_0= ruleContributionType ) ) otherlv_11= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'quantitativeContribution' otherlv_13= '=' ( (lv_quantitativeContribution_14_0= RULE_INT ) ) otherlv_15= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'correlation' otherlv_17= '=' ( (lv_correlation_18_0= RULE_BOOLEAN ) ) otherlv_19= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'description' otherlv_21= '=' ( (lv_description_22_0= RULE_STRING ) ) otherlv_23= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_24= 'color' otherlv_25= '=' ( (lv_fillColor_26_0= ruleColor ) ) otherlv_27= ';' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'changes' otherlv_29= '=' ( (otherlv_30= RULE_ID ) ) (otherlv_31= ',' ( (otherlv_32= RULE_ID ) ) )* otherlv_33= ';' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_connections_34_0= ruleContributionEnds ) ) )+ ) ) )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_0 = input.LA(1);

                         
                        int index26_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA26_0==15) ) {s = 1;}

                        else if ( LA26_0 ==17 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA26_0 ==36 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA26_0 ==37 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA26_0 ==38 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA26_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA26_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA26_0 ==39 && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA26_0 ==RULE_ID && getUnorderedGroupHelper().canSelect(grammarAccess.getContributionLinkAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                         
                        input.seek(index26_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
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
    public static final BitSet FOLLOW_ruleConnection_in_ruleGRLBaseElement252 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleElementLink_in_entryRuleElementLink633 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementLink643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionLink_in_ruleElementLink690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionLink_in_ruleElementLink717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyLink_in_ruleElementLink744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGRLSpecification_in_entryRuleGRLSpecification779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGRLSpecification789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleGRLSpecification826 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGRLSpecification843 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGRLSpecification861 = new BitSet(new long[]{0x000002143D018000L});
    public static final BitSet FOLLOW_ruleGRLElement_in_ruleGRLSpecification882 = new BitSet(new long[]{0x000002143D018000L});
    public static final BitSet FOLLOW_15_in_ruleGRLSpecification895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleActor978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActor995 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActor1012 = new BitSet(new long[]{0x000002143DF28000L});
    public static final BitSet FOLLOW_17_in_ruleActor1070 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1082 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1099 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1116 = new BitSet(new long[]{0x000002143DF28000L});
    public static final BitSet FOLLOW_20_in_ruleActor1184 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleActor1217 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1229 = new BitSet(new long[]{0x000002143DF28000L});
    public static final BitSet FOLLOW_21_in_ruleActor1297 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1309 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleActor1326 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1343 = new BitSet(new long[]{0x000002143DF28000L});
    public static final BitSet FOLLOW_22_in_ruleActor1411 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1423 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleActor1440 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1457 = new BitSet(new long[]{0x000002143DF28000L});
    public static final BitSet FOLLOW_23_in_ruleActor1525 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleActor1537 = new BitSet(new long[]{0x0000000000000000L,0x00001FFFE0000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleActor1558 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleActor1570 = new BitSet(new long[]{0x000002143DF28000L});
    public static final BitSet FOLLOW_ruleIntentionalElement_in_ruleActor1647 = new BitSet(new long[]{0x000002143DF28000L});
    public static final BitSet FOLLOW_ruleElementLink_in_ruleActor1674 = new BitSet(new long[]{0x000002143DF28000L});
    public static final BitSet FOLLOW_15_in_ruleActor1728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal1764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleSoftgoal1811 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftgoal1828 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleSoftgoal1845 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_17_in_ruleSoftgoal1903 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal1915 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal1932 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal1949 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_22_in_ruleSoftgoal2017 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2029 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftgoal2046 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2063 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_23_in_ruleSoftgoal2131 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2143 = new BitSet(new long[]{0x0000000000000000L,0x00001FFFE0000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleSoftgoal2164 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2176 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_20_in_ruleSoftgoal2244 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleSoftgoal2277 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2289 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_25_in_ruleSoftgoal2357 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2369 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleSoftgoal2390 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2402 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_21_in_ruleSoftgoal2470 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftgoal2482 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSoftgoal2499 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftgoal2516 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_15_in_ruleSoftgoal2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal2605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleGoal2652 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal2669 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGoal2686 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_17_in_ruleGoal2744 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal2756 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal2773 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal2790 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_22_in_ruleGoal2858 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal2870 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoal2887 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal2904 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_23_in_ruleGoal2972 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal2984 = new BitSet(new long[]{0x0000000000000000L,0x00001FFFE0000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleGoal3005 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3017 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_20_in_ruleGoal3085 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleGoal3118 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3130 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_25_in_ruleGoal3198 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3210 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleGoal3231 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3243 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_21_in_ruleGoal3311 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoal3323 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleGoal3340 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoal3357 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_15_in_ruleGoal3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask3446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask3456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleTask3493 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTask3510 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTask3527 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_17_in_ruleTask3585 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask3597 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask3614 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3631 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_22_in_ruleTask3699 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask3711 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTask3728 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3745 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_23_in_ruleTask3813 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask3825 = new BitSet(new long[]{0x0000000000000000L,0x00001FFFE0000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleTask3846 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3858 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_20_in_ruleTask3926 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask3938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleTask3959 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask3971 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_25_in_ruleTask4039 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask4051 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleTask4072 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4084 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_21_in_ruleTask4152 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTask4164 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTask4181 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTask4198 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_15_in_ruleTask4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource4287 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource4297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleResource4334 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleResource4351 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleResource4368 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_17_in_ruleResource4426 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4438 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource4455 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4472 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_22_in_ruleResource4540 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4552 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleResource4569 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4586 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_23_in_ruleResource4654 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4666 = new BitSet(new long[]{0x0000000000000000L,0x00001FFFE0000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleResource4687 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4699 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_20_in_ruleResource4767 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4779 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleResource4800 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4812 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_25_in_ruleResource4880 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource4892 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleResource4913 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource4925 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_21_in_ruleResource4993 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleResource5005 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleResource5022 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleResource5039 = new BitSet(new long[]{0x0000000002F28000L});
    public static final BitSet FOLLOW_15_in_ruleResource5092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndicator_in_entryRuleIndicator5128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndicator5138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleIndicator5175 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator5192 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleIndicator5209 = new BitSet(new long[]{0x0000000342F28000L});
    public static final BitSet FOLLOW_17_in_ruleIndicator5267 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5279 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator5296 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5313 = new BitSet(new long[]{0x0000000342F28000L});
    public static final BitSet FOLLOW_22_in_ruleIndicator5381 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5393 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleIndicator5410 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5427 = new BitSet(new long[]{0x0000000342F28000L});
    public static final BitSet FOLLOW_23_in_ruleIndicator5495 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5507 = new BitSet(new long[]{0x0000000000000000L,0x00001FFFE0000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleIndicator5528 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5540 = new BitSet(new long[]{0x0000000342F28000L});
    public static final BitSet FOLLOW_20_in_ruleIndicator5608 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5620 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003C00L});
    public static final BitSet FOLLOW_ruleImportanceType_in_ruleIndicator5641 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5653 = new BitSet(new long[]{0x0000000342F28000L});
    public static final BitSet FOLLOW_25_in_ruleIndicator5721 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5733 = new BitSet(new long[]{0x0000000000000000L,0x000000000001C000L});
    public static final BitSet FOLLOW_ruleDecompositionType_in_ruleIndicator5754 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5766 = new BitSet(new long[]{0x0000000342F28000L});
    public static final BitSet FOLLOW_21_in_ruleIndicator5834 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5846 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleIndicator5863 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator5880 = new BitSet(new long[]{0x0000000342F28000L});
    public static final BitSet FOLLOW_30_in_ruleIndicator5948 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator5960 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator5980 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleIndicator5993 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator6013 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6027 = new BitSet(new long[]{0x0000000342F28000L});
    public static final BitSet FOLLOW_32_in_ruleIndicator6095 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator6107 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator6127 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleIndicator6140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator6160 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6174 = new BitSet(new long[]{0x0000000342F28000L});
    public static final BitSet FOLLOW_33_in_ruleIndicator6242 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIndicator6254 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator6274 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleIndicator6287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleIndicator6307 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleIndicator6321 = new BitSet(new long[]{0x0000000342F28000L});
    public static final BitSet FOLLOW_15_in_ruleIndicator6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnection_in_entryRuleConnection6410 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnection6420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionEnds_in_ruleConnection6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionEnds_in_ruleConnection6494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyEnds_in_ruleConnection6521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionLink_in_entryRuleDecompositionLink6556 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecompositionLink6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleDecompositionLink6603 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDecompositionLink6620 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDecompositionLink6638 = new BitSet(new long[]{0x0000000000C20010L});
    public static final BitSet FOLLOW_17_in_ruleDecompositionLink6696 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDecompositionLink6708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecompositionLink6725 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDecompositionLink6742 = new BitSet(new long[]{0x0000000000C28010L});
    public static final BitSet FOLLOW_22_in_ruleDecompositionLink6810 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDecompositionLink6822 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDecompositionLink6839 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDecompositionLink6856 = new BitSet(new long[]{0x0000000000C28010L});
    public static final BitSet FOLLOW_23_in_ruleDecompositionLink6924 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDecompositionLink6936 = new BitSet(new long[]{0x0000000000000000L,0x00001FFFE0000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleDecompositionLink6957 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDecompositionLink6969 = new BitSet(new long[]{0x0000000000C28010L});
    public static final BitSet FOLLOW_ruleDecompositionEnds_in_ruleDecompositionLink7045 = new BitSet(new long[]{0x0000000000C28010L});
    public static final BitSet FOLLOW_15_in_ruleDecompositionLink7104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionEnds_in_entryRuleDecompositionEnds7140 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecompositionEnds7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecompositionEnds7198 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleDecompositionEnds7210 = new BitSet(new long[]{0x0000000000C20010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDecompositionEnds7233 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDecompositionEnds7245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionLink_in_entryRuleContributionLink7281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionLink7291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleContributionLink7328 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionLink7345 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionLink7363 = new BitSet(new long[]{0x000000F000C20010L});
    public static final BitSet FOLLOW_17_in_ruleContributionLink7421 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionLink7433 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContributionLink7450 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionLink7467 = new BitSet(new long[]{0x000000F000C28010L});
    public static final BitSet FOLLOW_36_in_ruleContributionLink7535 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionLink7547 = new BitSet(new long[]{0x0000000000000000L,0x0000000000FE0000L});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionLink7568 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionLink7580 = new BitSet(new long[]{0x000000F000C28010L});
    public static final BitSet FOLLOW_37_in_ruleContributionLink7648 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionLink7660 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionLink7677 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionLink7694 = new BitSet(new long[]{0x000000F000C28010L});
    public static final BitSet FOLLOW_38_in_ruleContributionLink7762 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionLink7774 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleContributionLink7791 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionLink7808 = new BitSet(new long[]{0x000000F000C28010L});
    public static final BitSet FOLLOW_22_in_ruleContributionLink7876 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionLink7888 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleContributionLink7905 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionLink7922 = new BitSet(new long[]{0x000000F000C28010L});
    public static final BitSet FOLLOW_23_in_ruleContributionLink7990 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionLink8002 = new BitSet(new long[]{0x0000000000000000L,0x00001FFFE0000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleContributionLink8023 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionLink8035 = new BitSet(new long[]{0x000000F000C28010L});
    public static final BitSet FOLLOW_39_in_ruleContributionLink8103 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionLink8115 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionLink8135 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleContributionLink8148 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionLink8168 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionLink8182 = new BitSet(new long[]{0x000000F000C28010L});
    public static final BitSet FOLLOW_ruleContributionEnds_in_ruleContributionLink8258 = new BitSet(new long[]{0x000000F000C28010L});
    public static final BitSet FOLLOW_15_in_ruleContributionLink8317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionEnds_in_entryRuleContributionEnds8353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionEnds8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionEnds8411 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleContributionEnds8423 = new BitSet(new long[]{0x0000000000C20010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleContributionEnds8446 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionEnds8458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyLink_in_entryRuleDependencyLink8494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyLink8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleDependencyLink8541 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDependencyLink8558 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDependencyLink8576 = new BitSet(new long[]{0x0000000000C20010L});
    public static final BitSet FOLLOW_17_in_ruleDependencyLink8634 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDependencyLink8646 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependencyLink8663 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDependencyLink8680 = new BitSet(new long[]{0x0000000000C28010L});
    public static final BitSet FOLLOW_22_in_ruleDependencyLink8748 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDependencyLink8760 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDependencyLink8777 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDependencyLink8794 = new BitSet(new long[]{0x0000000000C28010L});
    public static final BitSet FOLLOW_23_in_ruleDependencyLink8862 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleDependencyLink8874 = new BitSet(new long[]{0x0000000000000000L,0x00001FFFE0000000L});
    public static final BitSet FOLLOW_ruleColor_in_ruleDependencyLink8895 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDependencyLink8907 = new BitSet(new long[]{0x0000000000C28010L});
    public static final BitSet FOLLOW_ruleDependencyEnds_in_ruleDependencyLink8983 = new BitSet(new long[]{0x0000000000C28010L});
    public static final BitSet FOLLOW_15_in_ruleDependencyLink9042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyEnds_in_entryRuleDependencyEnds9078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependencyEnds9088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependencyEnds9136 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleDependencyEnds9148 = new BitSet(new long[]{0x0000000000C20010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDependencyEnds9171 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleDependencyEnds9183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluation_in_entryRuleEvaluation9233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluation9243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleEvaluation9280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvaluation9297 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluation9314 = new BitSet(new long[]{0x0007F00000000000L});
    public static final BitSet FOLLOW_44_in_ruleEvaluation9372 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation9384 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluation9401 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation9418 = new BitSet(new long[]{0x0007F00000008000L});
    public static final BitSet FOLLOW_45_in_ruleEvaluation9486 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation9498 = new BitSet(new long[]{0x0000000000000000L,0x000000001F100400L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleEvaluation9519 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation9531 = new BitSet(new long[]{0x0007F00000008000L});
    public static final BitSet FOLLOW_46_in_ruleEvaluation9599 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation9611 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleEvaluation9628 = new BitSet(new long[]{0x0007F00000008000L});
    public static final BitSet FOLLOW_47_in_ruleEvaluation9701 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation9713 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_ruleEvaluation9734 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation9746 = new BitSet(new long[]{0x0007F00000008000L});
    public static final BitSet FOLLOW_48_in_ruleEvaluation9814 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation9826 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_ruleEvaluation9847 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation9859 = new BitSet(new long[]{0x0007F00000008000L});
    public static final BitSet FOLLOW_49_in_ruleEvaluation9927 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation9939 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleKPINewEvalValue_in_ruleEvaluation9960 = new BitSet(new long[]{0x0007F00000008000L});
    public static final BitSet FOLLOW_50_in_ruleEvaluation10028 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluation10040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvaluation10060 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluation10072 = new BitSet(new long[]{0x0007F00000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvaluation10131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationRange_in_entryRuleEvaluationRange10167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationRange10177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleEvaluationRange10214 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleEvaluationRange10226 = new BitSet(new long[]{0x0070000000008000L});
    public static final BitSet FOLLOW_52_in_ruleEvaluationRange10284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange10296 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange10313 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange10330 = new BitSet(new long[]{0x0070000000008000L});
    public static final BitSet FOLLOW_53_in_ruleEvaluationRange10398 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange10410 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange10427 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange10444 = new BitSet(new long[]{0x0070000000008000L});
    public static final BitSet FOLLOW_54_in_ruleEvaluationRange10512 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationRange10524 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleEvaluationRange10541 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationRange10558 = new BitSet(new long[]{0x0070000000008000L});
    public static final BitSet FOLLOW_15_in_ruleEvaluationRange10611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionChange_in_entryRuleContributionChange10651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionChange10661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleContributionChange10698 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContributionChange10715 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionChange10732 = new BitSet(new long[]{0x0700000000008000L});
    public static final BitSet FOLLOW_56_in_ruleContributionChange10790 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionChange10802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000FE0000L});
    public static final BitSet FOLLOW_ruleContributionType_in_ruleContributionChange10823 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionChange10835 = new BitSet(new long[]{0x0700000000008000L});
    public static final BitSet FOLLOW_57_in_ruleContributionChange10903 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionChange10915 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionChange10932 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionChange10949 = new BitSet(new long[]{0x0700000000008000L});
    public static final BitSet FOLLOW_58_in_ruleContributionChange11017 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionChange11029 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_ruleContributionRange_in_ruleContributionChange11050 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionChange11062 = new BitSet(new long[]{0x0700000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionChange11115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionRange_in_entryRuleContributionRange11151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributionRange11161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleContributionRange11198 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleContributionRange11210 = new BitSet(new long[]{0x0070000000008000L});
    public static final BitSet FOLLOW_52_in_ruleContributionRange11268 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange11280 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange11297 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange11314 = new BitSet(new long[]{0x0070000000008000L});
    public static final BitSet FOLLOW_53_in_ruleContributionRange11382 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange11394 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange11411 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange11428 = new BitSet(new long[]{0x0070000000008000L});
    public static final BitSet FOLLOW_54_in_ruleContributionRange11496 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleContributionRange11508 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleContributionRange11525 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleContributionRange11542 = new BitSet(new long[]{0x0070000000008000L});
    public static final BitSet FOLLOW_15_in_ruleContributionRange11595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeMappings_in_entryRuleQualitativeMappings11631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitativeMappings11641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleQualitativeMappings11678 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeMappings11695 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualitativeMappings11712 = new BitSet(new long[]{0x0001000000008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_48_in_ruleQualitativeMappings11770 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualitativeMappings11782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeMappings11802 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_31_in_ruleQualitativeMappings11815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeMappings11835 = new BitSet(new long[]{0x0000000080080000L});
    public static final BitSet FOLLOW_19_in_ruleQualitativeMappings11849 = new BitSet(new long[]{0x0001000000008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_ruleQualitativeMapping_in_ruleQualitativeMappings11926 = new BitSet(new long[]{0x0001000000008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_15_in_ruleQualitativeMappings11979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIEvalValueSet_in_entryRuleKPIEvalValueSet12015 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIEvalValueSet12025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleKPIEvalValueSet12062 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKPIEvalValueSet12079 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleKPIEvalValueSet12096 = new BitSet(new long[]{0xE000000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_61_in_ruleKPIEvalValueSet12154 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIEvalValueSet12166 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet12183 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIEvalValueSet12200 = new BitSet(new long[]{0xE000000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_62_in_ruleKPIEvalValueSet12268 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIEvalValueSet12280 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet12297 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIEvalValueSet12314 = new BitSet(new long[]{0xE000000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_63_in_ruleKPIEvalValueSet12382 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIEvalValueSet12394 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet12411 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIEvalValueSet12428 = new BitSet(new long[]{0xE000000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_64_in_ruleKPIEvalValueSet12496 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIEvalValueSet12508 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPIEvalValueSet12525 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIEvalValueSet12542 = new BitSet(new long[]{0xE000000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_65_in_ruleKPIEvalValueSet12610 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIEvalValueSet12622 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKPIEvalValueSet12639 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIEvalValueSet12656 = new BitSet(new long[]{0xE000000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_66_in_ruleKPIEvalValueSet12724 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIEvalValueSet12736 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKPIEvalValueSet12753 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIEvalValueSet12770 = new BitSet(new long[]{0xE000000000008000L,0x0000000000000007L});
    public static final BitSet FOLLOW_15_in_ruleKPIEvalValueSet12823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualitativeMapping_in_entryRuleQualitativeMapping12859 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualitativeMapping12869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleQualitativeMapping12906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualitativeMapping12923 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleQualitativeMapping12940 = new BitSet(new long[]{0x0000700000008000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_ruleQualitativeMapping12998 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualitativeMapping13010 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleQualitativeMapping13027 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualitativeMapping13044 = new BitSet(new long[]{0x0000700000008000L,0x0000000000000010L});
    public static final BitSet FOLLOW_44_in_ruleQualitativeMapping13112 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualitativeMapping13124 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleQualitativeMapping13141 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualitativeMapping13158 = new BitSet(new long[]{0x0000700000008000L,0x0000000000000010L});
    public static final BitSet FOLLOW_45_in_ruleQualitativeMapping13226 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualitativeMapping13238 = new BitSet(new long[]{0x0000000000000000L,0x000000001F100400L});
    public static final BitSet FOLLOW_ruleQualitativeLabel_in_ruleQualitativeMapping13259 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualitativeMapping13271 = new BitSet(new long[]{0x0000700000008000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46_in_ruleQualitativeMapping13339 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleQualitativeMapping13351 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleQualitativeMapping13368 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQualitativeMapping13385 = new BitSet(new long[]{0x0000700000008000L,0x0000000000000010L});
    public static final BitSet FOLLOW_15_in_ruleQualitativeMapping13438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPINewEvalValue_in_entryRuleKPINewEvalValue13474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPINewEvalValue13484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleKPINewEvalValue13521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKPINewEvalValue13538 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleKPINewEvalValue13555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleKPINewEvalValue13567 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPINewEvalValue13579 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_DOUBLE_in_ruleKPINewEvalValue13596 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPINewEvalValue13613 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleKPINewEvalValue13625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKPIInformationConfig_in_entryRuleKPIInformationConfig13661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKPIInformationConfig13671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleKPIInformationConfig13708 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKPIInformationConfig13725 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleKPIInformationConfig13742 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_70_in_ruleKPIInformationConfig13800 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIInformationConfig13812 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKPIInformationConfig13829 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIInformationConfig13846 = new BitSet(new long[]{0x0000000000008000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_71_in_ruleKPIInformationConfig13914 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIInformationConfig13926 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleKPIInformationConfig13943 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleKPIInformationConfig13960 = new BitSet(new long[]{0x0000000000008000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_72_in_ruleKPIInformationConfig14028 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleKPIInformationConfig14040 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleKPIInformationConfig14060 = new BitSet(new long[]{0x0000000000008000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_15_in_ruleKPIInformationConfig14119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName14164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName14175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName14215 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleQualifiedName14234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName14249 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_74_in_ruleImportanceType14310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleImportanceType14327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleImportanceType14344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleImportanceType14361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleDecompositionType14406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDecompositionType14423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleDecompositionType14440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleContributionType14485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleContributionType14502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleContributionType14519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleContributionType14536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleContributionType14553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleContributionType14570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleContributionType14587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleQualitativeLabel14632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleQualitativeLabel14649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleQualitativeLabel14666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleQualitativeLabel14683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleQualitativeLabel14700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleQualitativeLabel14717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleQualitativeLabel14734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleColor14779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleColor14796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleColor14813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleColor14830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleColor14847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleColor14864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleColor14881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleColor14898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleColor14915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleColor14932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleColor14949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleColor14966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleColor14983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleColor15000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleColor15017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleColor15034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleCriticality15079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleCriticality15096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleCriticality15113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleCriticality15130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_rulePriority15175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_rulePriority15192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_rulePriority15209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_rulePriority15226 = new BitSet(new long[]{0x0000000000000002L});

}
