package hu.bme.mit.inf.gomrp.statemachine.dsl.text.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.services.StateMachineDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'include'", "'StateMachine'", "'for object'", "'{'", "'Actions:'", "'EndActions'", "'Guards:'", "'EndGuards'", "'Triggers:'", "'EndTriggers'", "'States:'", "'EndStates'", "'Transitions:'", "'EndTransitions'", "'}'", "'ActionExpression'", "'ChangeTrainCurrentTrackElement'", "'ChangeTurnoutDirection'", "'ChangeSignalAllowedSpeed'", "'ChangeTrainHeadingSpeed'", "'TrainHeadingSpeedChanged'", "'TrainTrackElementChanged'", "'SignalAllowedSpeedChanged'", "'TurnoutDirectionChanged'", "'TriggerExpression'", "'TrainCurrentHeadingSpeed'", "'TrainCurrentlyStandsOn'", "'TurnoutCurrentDirection'", "'SignalCurrentAllowedSpeed'", "'NextTrackElementIs'", "'TurnoutHasDesiredDirection'", "'GuardExpression'", "'is Initial'", "'is Active'", "'is Enabled'", "'is Fireable'", "'from state'", "'to'", "'execute'", "','", "'guard'", "'trigger'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalStateMachineDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g"; }



     	private StateMachineDSLGrammarAccess grammarAccess;
     	
        public InternalStateMachineDSLParser(TokenStream input, StateMachineDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "StateMachineBehavioralModel";	
       	}
       	
       	@Override
       	protected StateMachineDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleStateMachineBehavioralModel"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:67:1: entryRuleStateMachineBehavioralModel returns [EObject current=null] : iv_ruleStateMachineBehavioralModel= ruleStateMachineBehavioralModel EOF ;
    public final EObject entryRuleStateMachineBehavioralModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachineBehavioralModel = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:68:2: (iv_ruleStateMachineBehavioralModel= ruleStateMachineBehavioralModel EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:69:2: iv_ruleStateMachineBehavioralModel= ruleStateMachineBehavioralModel EOF
            {
             newCompositeNode(grammarAccess.getStateMachineBehavioralModelRule()); 
            pushFollow(FOLLOW_ruleStateMachineBehavioralModel_in_entryRuleStateMachineBehavioralModel75);
            iv_ruleStateMachineBehavioralModel=ruleStateMachineBehavioralModel();

            state._fsp--;

             current =iv_ruleStateMachineBehavioralModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateMachineBehavioralModel85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachineBehavioralModel"


    // $ANTLR start "ruleStateMachineBehavioralModel"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:76:1: ruleStateMachineBehavioralModel returns [EObject current=null] : ( () ( ( (lv_includes_1_0= ruleInclude ) )* ( (lv_statemachines_2_0= ruleStateMachine ) ) ( (lv_statemachines_3_0= ruleStateMachine ) )* ) ) ;
    public final EObject ruleStateMachineBehavioralModel() throws RecognitionException {
        EObject current = null;

        EObject lv_includes_1_0 = null;

        EObject lv_statemachines_2_0 = null;

        EObject lv_statemachines_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:79:28: ( ( () ( ( (lv_includes_1_0= ruleInclude ) )* ( (lv_statemachines_2_0= ruleStateMachine ) ) ( (lv_statemachines_3_0= ruleStateMachine ) )* ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:80:1: ( () ( ( (lv_includes_1_0= ruleInclude ) )* ( (lv_statemachines_2_0= ruleStateMachine ) ) ( (lv_statemachines_3_0= ruleStateMachine ) )* ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:80:1: ( () ( ( (lv_includes_1_0= ruleInclude ) )* ( (lv_statemachines_2_0= ruleStateMachine ) ) ( (lv_statemachines_3_0= ruleStateMachine ) )* ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:80:2: () ( ( (lv_includes_1_0= ruleInclude ) )* ( (lv_statemachines_2_0= ruleStateMachine ) ) ( (lv_statemachines_3_0= ruleStateMachine ) )* )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:80:2: ()
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStateMachineBehavioralModelAccess().getStateMachineBehavioralModelAction_0(),
                        current);
                

            }

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:86:2: ( ( (lv_includes_1_0= ruleInclude ) )* ( (lv_statemachines_2_0= ruleStateMachine ) ) ( (lv_statemachines_3_0= ruleStateMachine ) )* )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:86:3: ( (lv_includes_1_0= ruleInclude ) )* ( (lv_statemachines_2_0= ruleStateMachine ) ) ( (lv_statemachines_3_0= ruleStateMachine ) )*
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:86:3: ( (lv_includes_1_0= ruleInclude ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:87:1: (lv_includes_1_0= ruleInclude )
            	    {
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:87:1: (lv_includes_1_0= ruleInclude )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:88:3: lv_includes_1_0= ruleInclude
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineBehavioralModelAccess().getIncludesIncludeParserRuleCall_1_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInclude_in_ruleStateMachineBehavioralModel141);
            	    lv_includes_1_0=ruleInclude();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineBehavioralModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"includes",
            	            		lv_includes_1_0, 
            	            		"Include");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:104:3: ( (lv_statemachines_2_0= ruleStateMachine ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:105:1: (lv_statemachines_2_0= ruleStateMachine )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:105:1: (lv_statemachines_2_0= ruleStateMachine )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:106:3: lv_statemachines_2_0= ruleStateMachine
            {
             
            	        newCompositeNode(grammarAccess.getStateMachineBehavioralModelAccess().getStatemachinesStateMachineParserRuleCall_1_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStateMachine_in_ruleStateMachineBehavioralModel163);
            lv_statemachines_2_0=ruleStateMachine();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getStateMachineBehavioralModelRule());
            	        }
                   		add(
                   			current, 
                   			"statemachines",
                    		lv_statemachines_2_0, 
                    		"StateMachine");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:122:2: ( (lv_statemachines_3_0= ruleStateMachine ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:123:1: (lv_statemachines_3_0= ruleStateMachine )
            	    {
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:123:1: (lv_statemachines_3_0= ruleStateMachine )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:124:3: lv_statemachines_3_0= ruleStateMachine
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStateMachineBehavioralModelAccess().getStatemachinesStateMachineParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStateMachine_in_ruleStateMachineBehavioralModel184);
            	    lv_statemachines_3_0=ruleStateMachine();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStateMachineBehavioralModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statemachines",
            	            		lv_statemachines_3_0, 
            	            		"StateMachine");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleStateMachineBehavioralModel"


    // $ANTLR start "entryRuleInclude"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:148:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:149:2: (iv_ruleInclude= ruleInclude EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:150:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude222);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude232); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:157:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'include' ( (lv_filename_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_filename_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:160:28: ( (otherlv_0= 'include' ( (lv_filename_1_0= RULE_STRING ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:161:1: (otherlv_0= 'include' ( (lv_filename_1_0= RULE_STRING ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:161:1: (otherlv_0= 'include' ( (lv_filename_1_0= RULE_STRING ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:161:3: otherlv_0= 'include' ( (lv_filename_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleInclude269); 

                	newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:165:1: ( (lv_filename_1_0= RULE_STRING ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:166:1: (lv_filename_1_0= RULE_STRING )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:166:1: (lv_filename_1_0= RULE_STRING )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:167:3: lv_filename_1_0= RULE_STRING
            {
            lv_filename_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleInclude286); 

            			newLeafNode(lv_filename_1_0, grammarAccess.getIncludeAccess().getFilenameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getIncludeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"filename",
                    		lv_filename_1_0, 
                    		"STRING");
            	    

            }


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
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleStateMachine"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:191:1: entryRuleStateMachine returns [EObject current=null] : iv_ruleStateMachine= ruleStateMachine EOF ;
    public final EObject entryRuleStateMachine() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStateMachine = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:192:2: (iv_ruleStateMachine= ruleStateMachine EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:193:2: iv_ruleStateMachine= ruleStateMachine EOF
            {
             newCompositeNode(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_ruleStateMachine_in_entryRuleStateMachine327);
            iv_ruleStateMachine=ruleStateMachine();

            state._fsp--;

             current =iv_ruleStateMachine; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateMachine337); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:200:1: ruleStateMachine returns [EObject current=null] : (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for object' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Actions:' ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'EndActions' )? (otherlv_8= 'Guards:' ( (lv_guards_9_0= ruleGuard ) )* otherlv_10= 'EndGuards' )? (otherlv_11= 'Triggers:' ( (lv_triggers_12_0= ruleTrigger ) )* otherlv_13= 'EndTriggers' )? (otherlv_14= 'States:' ( (lv_states_15_0= ruleState ) )* otherlv_16= 'EndStates' )? (otherlv_17= 'Transitions:' ( (lv_transitions_18_0= ruleTransition ) )* otherlv_19= 'EndTransitions' )? otherlv_20= '}' ) ;
    public final EObject ruleStateMachine() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_actions_6_0 = null;

        EObject lv_guards_9_0 = null;

        EObject lv_triggers_12_0 = null;

        EObject lv_states_15_0 = null;

        EObject lv_transitions_18_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:203:28: ( (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for object' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Actions:' ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'EndActions' )? (otherlv_8= 'Guards:' ( (lv_guards_9_0= ruleGuard ) )* otherlv_10= 'EndGuards' )? (otherlv_11= 'Triggers:' ( (lv_triggers_12_0= ruleTrigger ) )* otherlv_13= 'EndTriggers' )? (otherlv_14= 'States:' ( (lv_states_15_0= ruleState ) )* otherlv_16= 'EndStates' )? (otherlv_17= 'Transitions:' ( (lv_transitions_18_0= ruleTransition ) )* otherlv_19= 'EndTransitions' )? otherlv_20= '}' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:204:1: (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for object' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Actions:' ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'EndActions' )? (otherlv_8= 'Guards:' ( (lv_guards_9_0= ruleGuard ) )* otherlv_10= 'EndGuards' )? (otherlv_11= 'Triggers:' ( (lv_triggers_12_0= ruleTrigger ) )* otherlv_13= 'EndTriggers' )? (otherlv_14= 'States:' ( (lv_states_15_0= ruleState ) )* otherlv_16= 'EndStates' )? (otherlv_17= 'Transitions:' ( (lv_transitions_18_0= ruleTransition ) )* otherlv_19= 'EndTransitions' )? otherlv_20= '}' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:204:1: (otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for object' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Actions:' ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'EndActions' )? (otherlv_8= 'Guards:' ( (lv_guards_9_0= ruleGuard ) )* otherlv_10= 'EndGuards' )? (otherlv_11= 'Triggers:' ( (lv_triggers_12_0= ruleTrigger ) )* otherlv_13= 'EndTriggers' )? (otherlv_14= 'States:' ( (lv_states_15_0= ruleState ) )* otherlv_16= 'EndStates' )? (otherlv_17= 'Transitions:' ( (lv_transitions_18_0= ruleTransition ) )* otherlv_19= 'EndTransitions' )? otherlv_20= '}' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:204:3: otherlv_0= 'StateMachine' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'for object' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' (otherlv_5= 'Actions:' ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'EndActions' )? (otherlv_8= 'Guards:' ( (lv_guards_9_0= ruleGuard ) )* otherlv_10= 'EndGuards' )? (otherlv_11= 'Triggers:' ( (lv_triggers_12_0= ruleTrigger ) )* otherlv_13= 'EndTriggers' )? (otherlv_14= 'States:' ( (lv_states_15_0= ruleState ) )* otherlv_16= 'EndStates' )? (otherlv_17= 'Transitions:' ( (lv_transitions_18_0= ruleTransition ) )* otherlv_19= 'EndTransitions' )? otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_12_in_ruleStateMachine374); 

                	newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStateMachineKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:208:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:209:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:209:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:210:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateMachine391); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateMachineRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleStateMachine408); 

                	newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getForObjectKeyword_2());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:230:1: ( (otherlv_3= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:231:1: (otherlv_3= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:231:1: (otherlv_3= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:232:3: otherlv_3= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getStateMachineRule());
            	        }
                    
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStateMachine428); 

            		newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getReferredObjectRDMElementCrossReference_3_0()); 
            	

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleStateMachine440); 

                	newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:247:1: (otherlv_5= 'Actions:' ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'EndActions' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:247:3: otherlv_5= 'Actions:' ( (lv_actions_6_0= ruleAction ) )* otherlv_7= 'EndActions'
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleStateMachine453); 

                        	newLeafNode(otherlv_5, grammarAccess.getStateMachineAccess().getActionsKeyword_5_0());
                        
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:251:1: ( (lv_actions_6_0= ruleAction ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=26 && LA3_0<=30)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:252:1: (lv_actions_6_0= ruleAction )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:252:1: (lv_actions_6_0= ruleAction )
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:253:3: lv_actions_6_0= ruleAction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getActionsActionParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAction_in_ruleStateMachine474);
                    	    lv_actions_6_0=ruleAction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"actions",
                    	            		lv_actions_6_0, 
                    	            		"Action");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FOLLOW_16_in_ruleStateMachine487); 

                        	newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getEndActionsKeyword_5_2());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:273:3: (otherlv_8= 'Guards:' ( (lv_guards_9_0= ruleGuard ) )* otherlv_10= 'EndGuards' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:273:5: otherlv_8= 'Guards:' ( (lv_guards_9_0= ruleGuard ) )* otherlv_10= 'EndGuards'
                    {
                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleStateMachine502); 

                        	newLeafNode(otherlv_8, grammarAccess.getStateMachineAccess().getGuardsKeyword_6_0());
                        
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:277:1: ( (lv_guards_9_0= ruleGuard ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>=36 && LA5_0<=42)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:278:1: (lv_guards_9_0= ruleGuard )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:278:1: (lv_guards_9_0= ruleGuard )
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:279:3: lv_guards_9_0= ruleGuard
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getGuardsGuardParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleGuard_in_ruleStateMachine523);
                    	    lv_guards_9_0=ruleGuard();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"guards",
                    	            		lv_guards_9_0, 
                    	            		"Guard");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,18,FOLLOW_18_in_ruleStateMachine536); 

                        	newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getEndGuardsKeyword_6_2());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:299:3: (otherlv_11= 'Triggers:' ( (lv_triggers_12_0= ruleTrigger ) )* otherlv_13= 'EndTriggers' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:299:5: otherlv_11= 'Triggers:' ( (lv_triggers_12_0= ruleTrigger ) )* otherlv_13= 'EndTriggers'
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleStateMachine551); 

                        	newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getTriggersKeyword_7_0());
                        
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:303:1: ( (lv_triggers_12_0= ruleTrigger ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=31 && LA7_0<=35)) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:304:1: (lv_triggers_12_0= ruleTrigger )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:304:1: (lv_triggers_12_0= ruleTrigger )
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:305:3: lv_triggers_12_0= ruleTrigger
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getTriggersTriggerParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTrigger_in_ruleStateMachine572);
                    	    lv_triggers_12_0=ruleTrigger();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"triggers",
                    	            		lv_triggers_12_0, 
                    	            		"Trigger");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleStateMachine585); 

                        	newLeafNode(otherlv_13, grammarAccess.getStateMachineAccess().getEndTriggersKeyword_7_2());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:325:3: (otherlv_14= 'States:' ( (lv_states_15_0= ruleState ) )* otherlv_16= 'EndStates' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:325:5: otherlv_14= 'States:' ( (lv_states_15_0= ruleState ) )* otherlv_16= 'EndStates'
                    {
                    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleStateMachine600); 

                        	newLeafNode(otherlv_14, grammarAccess.getStateMachineAccess().getStatesKeyword_8_0());
                        
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:329:1: ( (lv_states_15_0= ruleState ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:330:1: (lv_states_15_0= ruleState )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:330:1: (lv_states_15_0= ruleState )
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:331:3: lv_states_15_0= ruleState
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleState_in_ruleStateMachine621);
                    	    lv_states_15_0=ruleState();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"states",
                    	            		lv_states_15_0, 
                    	            		"State");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,22,FOLLOW_22_in_ruleStateMachine634); 

                        	newLeafNode(otherlv_16, grammarAccess.getStateMachineAccess().getEndStatesKeyword_8_2());
                        

                    }
                    break;

            }

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:351:3: (otherlv_17= 'Transitions:' ( (lv_transitions_18_0= ruleTransition ) )* otherlv_19= 'EndTransitions' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:351:5: otherlv_17= 'Transitions:' ( (lv_transitions_18_0= ruleTransition ) )* otherlv_19= 'EndTransitions'
                    {
                    otherlv_17=(Token)match(input,23,FOLLOW_23_in_ruleStateMachine649); 

                        	newLeafNode(otherlv_17, grammarAccess.getStateMachineAccess().getTransitionsKeyword_9_0());
                        
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:355:1: ( (lv_transitions_18_0= ruleTransition ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:356:1: (lv_transitions_18_0= ruleTransition )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:356:1: (lv_transitions_18_0= ruleTransition )
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:357:3: lv_transitions_18_0= ruleTransition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTransition_in_ruleStateMachine670);
                    	    lv_transitions_18_0=ruleTransition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStateMachineRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"transitions",
                    	            		lv_transitions_18_0, 
                    	            		"Transition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,24,FOLLOW_24_in_ruleStateMachine683); 

                        	newLeafNode(otherlv_19, grammarAccess.getStateMachineAccess().getEndTransitionsKeyword_9_2());
                        

                    }
                    break;

            }

            otherlv_20=(Token)match(input,25,FOLLOW_25_in_ruleStateMachine697); 

                	newLeafNode(otherlv_20, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleEString"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:389:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:390:2: (iv_ruleEString= ruleEString EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:391:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString734);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString745); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:398:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:401:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:402:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:402:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:402:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString785); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:410:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString811); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAction"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:425:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:426:2: (iv_ruleAction= ruleAction EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:427:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction856);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction866); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:434:1: ruleAction returns [EObject current=null] : (this_ChangeTrainHeadingSpeed_0= ruleChangeTrainHeadingSpeed | this_ChangeSignalAllowedSpeed_1= ruleChangeSignalAllowedSpeed | this_ChangeTurnoutDirection_2= ruleChangeTurnoutDirection | this_ChangeTrainCurrentTrackElement_3= ruleChangeTrainCurrentTrackElement | this_ActionExpression_Impl_4= ruleActionExpression_Impl ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_ChangeTrainHeadingSpeed_0 = null;

        EObject this_ChangeSignalAllowedSpeed_1 = null;

        EObject this_ChangeTurnoutDirection_2 = null;

        EObject this_ChangeTrainCurrentTrackElement_3 = null;

        EObject this_ActionExpression_Impl_4 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:437:28: ( (this_ChangeTrainHeadingSpeed_0= ruleChangeTrainHeadingSpeed | this_ChangeSignalAllowedSpeed_1= ruleChangeSignalAllowedSpeed | this_ChangeTurnoutDirection_2= ruleChangeTurnoutDirection | this_ChangeTrainCurrentTrackElement_3= ruleChangeTrainCurrentTrackElement | this_ActionExpression_Impl_4= ruleActionExpression_Impl ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:438:1: (this_ChangeTrainHeadingSpeed_0= ruleChangeTrainHeadingSpeed | this_ChangeSignalAllowedSpeed_1= ruleChangeSignalAllowedSpeed | this_ChangeTurnoutDirection_2= ruleChangeTurnoutDirection | this_ChangeTrainCurrentTrackElement_3= ruleChangeTrainCurrentTrackElement | this_ActionExpression_Impl_4= ruleActionExpression_Impl )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:438:1: (this_ChangeTrainHeadingSpeed_0= ruleChangeTrainHeadingSpeed | this_ChangeSignalAllowedSpeed_1= ruleChangeSignalAllowedSpeed | this_ChangeTurnoutDirection_2= ruleChangeTurnoutDirection | this_ChangeTrainCurrentTrackElement_3= ruleChangeTrainCurrentTrackElement | this_ActionExpression_Impl_4= ruleActionExpression_Impl )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt14=1;
                }
                break;
            case 29:
                {
                alt14=2;
                }
                break;
            case 28:
                {
                alt14=3;
                }
                break;
            case 27:
                {
                alt14=4;
                }
                break;
            case 26:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:439:5: this_ChangeTrainHeadingSpeed_0= ruleChangeTrainHeadingSpeed
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getChangeTrainHeadingSpeedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleChangeTrainHeadingSpeed_in_ruleAction913);
                    this_ChangeTrainHeadingSpeed_0=ruleChangeTrainHeadingSpeed();

                    state._fsp--;

                     
                            current = this_ChangeTrainHeadingSpeed_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:449:5: this_ChangeSignalAllowedSpeed_1= ruleChangeSignalAllowedSpeed
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getChangeSignalAllowedSpeedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleChangeSignalAllowedSpeed_in_ruleAction940);
                    this_ChangeSignalAllowedSpeed_1=ruleChangeSignalAllowedSpeed();

                    state._fsp--;

                     
                            current = this_ChangeSignalAllowedSpeed_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:459:5: this_ChangeTurnoutDirection_2= ruleChangeTurnoutDirection
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getChangeTurnoutDirectionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleChangeTurnoutDirection_in_ruleAction967);
                    this_ChangeTurnoutDirection_2=ruleChangeTurnoutDirection();

                    state._fsp--;

                     
                            current = this_ChangeTurnoutDirection_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:469:5: this_ChangeTrainCurrentTrackElement_3= ruleChangeTrainCurrentTrackElement
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getChangeTrainCurrentTrackElementParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleChangeTrainCurrentTrackElement_in_ruleAction994);
                    this_ChangeTrainCurrentTrackElement_3=ruleChangeTrainCurrentTrackElement();

                    state._fsp--;

                     
                            current = this_ChangeTrainCurrentTrackElement_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:479:5: this_ActionExpression_Impl_4= ruleActionExpression_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getActionAccess().getActionExpression_ImplParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleActionExpression_Impl_in_ruleAction1021);
                    this_ActionExpression_Impl_4=ruleActionExpression_Impl();

                    state._fsp--;

                     
                            current = this_ActionExpression_Impl_4; 
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActionExpression_Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:495:1: entryRuleActionExpression_Impl returns [EObject current=null] : iv_ruleActionExpression_Impl= ruleActionExpression_Impl EOF ;
    public final EObject entryRuleActionExpression_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActionExpression_Impl = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:496:2: (iv_ruleActionExpression_Impl= ruleActionExpression_Impl EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:497:2: iv_ruleActionExpression_Impl= ruleActionExpression_Impl EOF
            {
             newCompositeNode(grammarAccess.getActionExpression_ImplRule()); 
            pushFollow(FOLLOW_ruleActionExpression_Impl_in_entryRuleActionExpression_Impl1056);
            iv_ruleActionExpression_Impl=ruleActionExpression_Impl();

            state._fsp--;

             current =iv_ruleActionExpression_Impl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionExpression_Impl1066); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActionExpression_Impl"


    // $ANTLR start "ruleActionExpression_Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:504:1: ruleActionExpression_Impl returns [EObject current=null] : (otherlv_0= 'ActionExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleActionExpression_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:507:28: ( (otherlv_0= 'ActionExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:508:1: (otherlv_0= 'ActionExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:508:1: (otherlv_0= 'ActionExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:508:3: otherlv_0= 'ActionExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleActionExpression_Impl1103); 

                	newLeafNode(otherlv_0, grammarAccess.getActionExpression_ImplAccess().getActionExpressionKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:512:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:513:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:513:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:514:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleActionExpression_Impl1120); 

            			newLeafNode(lv_name_1_0, grammarAccess.getActionExpression_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getActionExpression_ImplRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleActionExpression_Impl1137); 

                	newLeafNode(otherlv_2, grammarAccess.getActionExpression_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:534:1: ( (lv_expression_3_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:535:1: (lv_expression_3_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:535:1: (lv_expression_3_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:536:3: lv_expression_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getActionExpression_ImplAccess().getExpressionEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleActionExpression_Impl1158);
            lv_expression_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getActionExpression_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleActionExpression_Impl1170); 

                	newLeafNode(otherlv_4, grammarAccess.getActionExpression_ImplAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActionExpression_Impl"


    // $ANTLR start "entryRuleChangeTrainCurrentTrackElement"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:564:1: entryRuleChangeTrainCurrentTrackElement returns [EObject current=null] : iv_ruleChangeTrainCurrentTrackElement= ruleChangeTrainCurrentTrackElement EOF ;
    public final EObject entryRuleChangeTrainCurrentTrackElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeTrainCurrentTrackElement = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:565:2: (iv_ruleChangeTrainCurrentTrackElement= ruleChangeTrainCurrentTrackElement EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:566:2: iv_ruleChangeTrainCurrentTrackElement= ruleChangeTrainCurrentTrackElement EOF
            {
             newCompositeNode(grammarAccess.getChangeTrainCurrentTrackElementRule()); 
            pushFollow(FOLLOW_ruleChangeTrainCurrentTrackElement_in_entryRuleChangeTrainCurrentTrackElement1206);
            iv_ruleChangeTrainCurrentTrackElement=ruleChangeTrainCurrentTrackElement();

            state._fsp--;

             current =iv_ruleChangeTrainCurrentTrackElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeTrainCurrentTrackElement1216); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeTrainCurrentTrackElement"


    // $ANTLR start "ruleChangeTrainCurrentTrackElement"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:573:1: ruleChangeTrainCurrentTrackElement returns [EObject current=null] : (otherlv_0= 'ChangeTrainCurrentTrackElement' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleChangeTrainCurrentTrackElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:576:28: ( (otherlv_0= 'ChangeTrainCurrentTrackElement' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:577:1: (otherlv_0= 'ChangeTrainCurrentTrackElement' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:577:1: (otherlv_0= 'ChangeTrainCurrentTrackElement' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:577:3: otherlv_0= 'ChangeTrainCurrentTrackElement' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleChangeTrainCurrentTrackElement1253); 

                	newLeafNode(otherlv_0, grammarAccess.getChangeTrainCurrentTrackElementAccess().getChangeTrainCurrentTrackElementKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:581:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:582:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:582:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:583:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChangeTrainCurrentTrackElementAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleChangeTrainCurrentTrackElement1274);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChangeTrainCurrentTrackElementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleChangeTrainCurrentTrackElement"


    // $ANTLR start "entryRuleChangeTurnoutDirection"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:607:1: entryRuleChangeTurnoutDirection returns [EObject current=null] : iv_ruleChangeTurnoutDirection= ruleChangeTurnoutDirection EOF ;
    public final EObject entryRuleChangeTurnoutDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeTurnoutDirection = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:608:2: (iv_ruleChangeTurnoutDirection= ruleChangeTurnoutDirection EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:609:2: iv_ruleChangeTurnoutDirection= ruleChangeTurnoutDirection EOF
            {
             newCompositeNode(grammarAccess.getChangeTurnoutDirectionRule()); 
            pushFollow(FOLLOW_ruleChangeTurnoutDirection_in_entryRuleChangeTurnoutDirection1310);
            iv_ruleChangeTurnoutDirection=ruleChangeTurnoutDirection();

            state._fsp--;

             current =iv_ruleChangeTurnoutDirection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeTurnoutDirection1320); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeTurnoutDirection"


    // $ANTLR start "ruleChangeTurnoutDirection"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:616:1: ruleChangeTurnoutDirection returns [EObject current=null] : (otherlv_0= 'ChangeTurnoutDirection' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleChangeTurnoutDirection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:619:28: ( (otherlv_0= 'ChangeTurnoutDirection' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:620:1: (otherlv_0= 'ChangeTurnoutDirection' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:620:1: (otherlv_0= 'ChangeTurnoutDirection' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:620:3: otherlv_0= 'ChangeTurnoutDirection' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleChangeTurnoutDirection1357); 

                	newLeafNode(otherlv_0, grammarAccess.getChangeTurnoutDirectionAccess().getChangeTurnoutDirectionKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:624:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:625:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:625:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:626:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChangeTurnoutDirectionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleChangeTurnoutDirection1378);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChangeTurnoutDirectionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleChangeTurnoutDirection"


    // $ANTLR start "entryRuleChangeSignalAllowedSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:650:1: entryRuleChangeSignalAllowedSpeed returns [EObject current=null] : iv_ruleChangeSignalAllowedSpeed= ruleChangeSignalAllowedSpeed EOF ;
    public final EObject entryRuleChangeSignalAllowedSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeSignalAllowedSpeed = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:651:2: (iv_ruleChangeSignalAllowedSpeed= ruleChangeSignalAllowedSpeed EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:652:2: iv_ruleChangeSignalAllowedSpeed= ruleChangeSignalAllowedSpeed EOF
            {
             newCompositeNode(grammarAccess.getChangeSignalAllowedSpeedRule()); 
            pushFollow(FOLLOW_ruleChangeSignalAllowedSpeed_in_entryRuleChangeSignalAllowedSpeed1414);
            iv_ruleChangeSignalAllowedSpeed=ruleChangeSignalAllowedSpeed();

            state._fsp--;

             current =iv_ruleChangeSignalAllowedSpeed; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeSignalAllowedSpeed1424); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeSignalAllowedSpeed"


    // $ANTLR start "ruleChangeSignalAllowedSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:659:1: ruleChangeSignalAllowedSpeed returns [EObject current=null] : (otherlv_0= 'ChangeSignalAllowedSpeed' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleChangeSignalAllowedSpeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:662:28: ( (otherlv_0= 'ChangeSignalAllowedSpeed' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:663:1: (otherlv_0= 'ChangeSignalAllowedSpeed' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:663:1: (otherlv_0= 'ChangeSignalAllowedSpeed' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:663:3: otherlv_0= 'ChangeSignalAllowedSpeed' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleChangeSignalAllowedSpeed1461); 

                	newLeafNode(otherlv_0, grammarAccess.getChangeSignalAllowedSpeedAccess().getChangeSignalAllowedSpeedKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:667:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:668:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:668:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:669:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChangeSignalAllowedSpeedAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleChangeSignalAllowedSpeed1482);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChangeSignalAllowedSpeedRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleChangeSignalAllowedSpeed"


    // $ANTLR start "entryRuleChangeTrainHeadingSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:693:1: entryRuleChangeTrainHeadingSpeed returns [EObject current=null] : iv_ruleChangeTrainHeadingSpeed= ruleChangeTrainHeadingSpeed EOF ;
    public final EObject entryRuleChangeTrainHeadingSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChangeTrainHeadingSpeed = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:694:2: (iv_ruleChangeTrainHeadingSpeed= ruleChangeTrainHeadingSpeed EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:695:2: iv_ruleChangeTrainHeadingSpeed= ruleChangeTrainHeadingSpeed EOF
            {
             newCompositeNode(grammarAccess.getChangeTrainHeadingSpeedRule()); 
            pushFollow(FOLLOW_ruleChangeTrainHeadingSpeed_in_entryRuleChangeTrainHeadingSpeed1518);
            iv_ruleChangeTrainHeadingSpeed=ruleChangeTrainHeadingSpeed();

            state._fsp--;

             current =iv_ruleChangeTrainHeadingSpeed; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeTrainHeadingSpeed1528); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChangeTrainHeadingSpeed"


    // $ANTLR start "ruleChangeTrainHeadingSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:702:1: ruleChangeTrainHeadingSpeed returns [EObject current=null] : (otherlv_0= 'ChangeTrainHeadingSpeed' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleChangeTrainHeadingSpeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:705:28: ( (otherlv_0= 'ChangeTrainHeadingSpeed' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:706:1: (otherlv_0= 'ChangeTrainHeadingSpeed' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:706:1: (otherlv_0= 'ChangeTrainHeadingSpeed' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:706:3: otherlv_0= 'ChangeTrainHeadingSpeed' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleChangeTrainHeadingSpeed1565); 

                	newLeafNode(otherlv_0, grammarAccess.getChangeTrainHeadingSpeedAccess().getChangeTrainHeadingSpeedKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:710:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:711:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:711:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:712:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getChangeTrainHeadingSpeedAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleChangeTrainHeadingSpeed1586);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getChangeTrainHeadingSpeedRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleChangeTrainHeadingSpeed"


    // $ANTLR start "entryRuleTrigger"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:736:1: entryRuleTrigger returns [EObject current=null] : iv_ruleTrigger= ruleTrigger EOF ;
    public final EObject entryRuleTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigger = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:737:2: (iv_ruleTrigger= ruleTrigger EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:738:2: iv_ruleTrigger= ruleTrigger EOF
            {
             newCompositeNode(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_ruleTrigger_in_entryRuleTrigger1622);
            iv_ruleTrigger=ruleTrigger();

            state._fsp--;

             current =iv_ruleTrigger; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrigger1632); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:745:1: ruleTrigger returns [EObject current=null] : (this_TrainHeadingSpeedChanged_0= ruleTrainHeadingSpeedChanged | this_TrainTrackElementChanged_1= ruleTrainTrackElementChanged | this_SignalAllowedSpeedChanged_2= ruleSignalAllowedSpeedChanged | this_TurnoutDirectionChanged_3= ruleTurnoutDirectionChanged | this_TriggerExpression_Impl_4= ruleTriggerExpression_Impl ) ;
    public final EObject ruleTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_TrainHeadingSpeedChanged_0 = null;

        EObject this_TrainTrackElementChanged_1 = null;

        EObject this_SignalAllowedSpeedChanged_2 = null;

        EObject this_TurnoutDirectionChanged_3 = null;

        EObject this_TriggerExpression_Impl_4 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:748:28: ( (this_TrainHeadingSpeedChanged_0= ruleTrainHeadingSpeedChanged | this_TrainTrackElementChanged_1= ruleTrainTrackElementChanged | this_SignalAllowedSpeedChanged_2= ruleSignalAllowedSpeedChanged | this_TurnoutDirectionChanged_3= ruleTurnoutDirectionChanged | this_TriggerExpression_Impl_4= ruleTriggerExpression_Impl ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:749:1: (this_TrainHeadingSpeedChanged_0= ruleTrainHeadingSpeedChanged | this_TrainTrackElementChanged_1= ruleTrainTrackElementChanged | this_SignalAllowedSpeedChanged_2= ruleSignalAllowedSpeedChanged | this_TurnoutDirectionChanged_3= ruleTurnoutDirectionChanged | this_TriggerExpression_Impl_4= ruleTriggerExpression_Impl )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:749:1: (this_TrainHeadingSpeedChanged_0= ruleTrainHeadingSpeedChanged | this_TrainTrackElementChanged_1= ruleTrainTrackElementChanged | this_SignalAllowedSpeedChanged_2= ruleSignalAllowedSpeedChanged | this_TurnoutDirectionChanged_3= ruleTurnoutDirectionChanged | this_TriggerExpression_Impl_4= ruleTriggerExpression_Impl )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt15=1;
                }
                break;
            case 32:
                {
                alt15=2;
                }
                break;
            case 33:
                {
                alt15=3;
                }
                break;
            case 34:
                {
                alt15=4;
                }
                break;
            case 35:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:750:5: this_TrainHeadingSpeedChanged_0= ruleTrainHeadingSpeedChanged
                    {
                     
                            newCompositeNode(grammarAccess.getTriggerAccess().getTrainHeadingSpeedChangedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTrainHeadingSpeedChanged_in_ruleTrigger1679);
                    this_TrainHeadingSpeedChanged_0=ruleTrainHeadingSpeedChanged();

                    state._fsp--;

                     
                            current = this_TrainHeadingSpeedChanged_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:760:5: this_TrainTrackElementChanged_1= ruleTrainTrackElementChanged
                    {
                     
                            newCompositeNode(grammarAccess.getTriggerAccess().getTrainTrackElementChangedParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTrainTrackElementChanged_in_ruleTrigger1706);
                    this_TrainTrackElementChanged_1=ruleTrainTrackElementChanged();

                    state._fsp--;

                     
                            current = this_TrainTrackElementChanged_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:770:5: this_SignalAllowedSpeedChanged_2= ruleSignalAllowedSpeedChanged
                    {
                     
                            newCompositeNode(grammarAccess.getTriggerAccess().getSignalAllowedSpeedChangedParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSignalAllowedSpeedChanged_in_ruleTrigger1733);
                    this_SignalAllowedSpeedChanged_2=ruleSignalAllowedSpeedChanged();

                    state._fsp--;

                     
                            current = this_SignalAllowedSpeedChanged_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:780:5: this_TurnoutDirectionChanged_3= ruleTurnoutDirectionChanged
                    {
                     
                            newCompositeNode(grammarAccess.getTriggerAccess().getTurnoutDirectionChangedParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleTurnoutDirectionChanged_in_ruleTrigger1760);
                    this_TurnoutDirectionChanged_3=ruleTurnoutDirectionChanged();

                    state._fsp--;

                     
                            current = this_TurnoutDirectionChanged_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:790:5: this_TriggerExpression_Impl_4= ruleTriggerExpression_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getTriggerAccess().getTriggerExpression_ImplParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleTriggerExpression_Impl_in_ruleTrigger1787);
                    this_TriggerExpression_Impl_4=ruleTriggerExpression_Impl();

                    state._fsp--;

                     
                            current = this_TriggerExpression_Impl_4; 
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
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleTrainHeadingSpeedChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:806:1: entryRuleTrainHeadingSpeedChanged returns [EObject current=null] : iv_ruleTrainHeadingSpeedChanged= ruleTrainHeadingSpeedChanged EOF ;
    public final EObject entryRuleTrainHeadingSpeedChanged() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainHeadingSpeedChanged = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:807:2: (iv_ruleTrainHeadingSpeedChanged= ruleTrainHeadingSpeedChanged EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:808:2: iv_ruleTrainHeadingSpeedChanged= ruleTrainHeadingSpeedChanged EOF
            {
             newCompositeNode(grammarAccess.getTrainHeadingSpeedChangedRule()); 
            pushFollow(FOLLOW_ruleTrainHeadingSpeedChanged_in_entryRuleTrainHeadingSpeedChanged1822);
            iv_ruleTrainHeadingSpeedChanged=ruleTrainHeadingSpeedChanged();

            state._fsp--;

             current =iv_ruleTrainHeadingSpeedChanged; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrainHeadingSpeedChanged1832); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrainHeadingSpeedChanged"


    // $ANTLR start "ruleTrainHeadingSpeedChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:815:1: ruleTrainHeadingSpeedChanged returns [EObject current=null] : (otherlv_0= 'TrainHeadingSpeedChanged' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTrainHeadingSpeedChanged() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:818:28: ( (otherlv_0= 'TrainHeadingSpeedChanged' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:819:1: (otherlv_0= 'TrainHeadingSpeedChanged' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:819:1: (otherlv_0= 'TrainHeadingSpeedChanged' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:819:3: otherlv_0= 'TrainHeadingSpeedChanged' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleTrainHeadingSpeedChanged1869); 

                	newLeafNode(otherlv_0, grammarAccess.getTrainHeadingSpeedChangedAccess().getTrainHeadingSpeedChangedKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:823:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:824:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:824:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:825:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTrainHeadingSpeedChangedAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTrainHeadingSpeedChanged1890);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTrainHeadingSpeedChangedRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleTrainHeadingSpeedChanged"


    // $ANTLR start "entryRuleTrainTrackElementChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:849:1: entryRuleTrainTrackElementChanged returns [EObject current=null] : iv_ruleTrainTrackElementChanged= ruleTrainTrackElementChanged EOF ;
    public final EObject entryRuleTrainTrackElementChanged() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainTrackElementChanged = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:850:2: (iv_ruleTrainTrackElementChanged= ruleTrainTrackElementChanged EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:851:2: iv_ruleTrainTrackElementChanged= ruleTrainTrackElementChanged EOF
            {
             newCompositeNode(grammarAccess.getTrainTrackElementChangedRule()); 
            pushFollow(FOLLOW_ruleTrainTrackElementChanged_in_entryRuleTrainTrackElementChanged1926);
            iv_ruleTrainTrackElementChanged=ruleTrainTrackElementChanged();

            state._fsp--;

             current =iv_ruleTrainTrackElementChanged; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrainTrackElementChanged1936); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrainTrackElementChanged"


    // $ANTLR start "ruleTrainTrackElementChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:858:1: ruleTrainTrackElementChanged returns [EObject current=null] : (otherlv_0= 'TrainTrackElementChanged' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTrainTrackElementChanged() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:861:28: ( (otherlv_0= 'TrainTrackElementChanged' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:862:1: (otherlv_0= 'TrainTrackElementChanged' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:862:1: (otherlv_0= 'TrainTrackElementChanged' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:862:3: otherlv_0= 'TrainTrackElementChanged' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleTrainTrackElementChanged1973); 

                	newLeafNode(otherlv_0, grammarAccess.getTrainTrackElementChangedAccess().getTrainTrackElementChangedKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:866:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:867:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:867:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:868:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTrainTrackElementChangedAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTrainTrackElementChanged1994);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTrainTrackElementChangedRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleTrainTrackElementChanged"


    // $ANTLR start "entryRuleSignalAllowedSpeedChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:892:1: entryRuleSignalAllowedSpeedChanged returns [EObject current=null] : iv_ruleSignalAllowedSpeedChanged= ruleSignalAllowedSpeedChanged EOF ;
    public final EObject entryRuleSignalAllowedSpeedChanged() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalAllowedSpeedChanged = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:893:2: (iv_ruleSignalAllowedSpeedChanged= ruleSignalAllowedSpeedChanged EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:894:2: iv_ruleSignalAllowedSpeedChanged= ruleSignalAllowedSpeedChanged EOF
            {
             newCompositeNode(grammarAccess.getSignalAllowedSpeedChangedRule()); 
            pushFollow(FOLLOW_ruleSignalAllowedSpeedChanged_in_entryRuleSignalAllowedSpeedChanged2030);
            iv_ruleSignalAllowedSpeedChanged=ruleSignalAllowedSpeedChanged();

            state._fsp--;

             current =iv_ruleSignalAllowedSpeedChanged; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalAllowedSpeedChanged2040); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignalAllowedSpeedChanged"


    // $ANTLR start "ruleSignalAllowedSpeedChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:901:1: ruleSignalAllowedSpeedChanged returns [EObject current=null] : (otherlv_0= 'SignalAllowedSpeedChanged' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleSignalAllowedSpeedChanged() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:904:28: ( (otherlv_0= 'SignalAllowedSpeedChanged' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:905:1: (otherlv_0= 'SignalAllowedSpeedChanged' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:905:1: (otherlv_0= 'SignalAllowedSpeedChanged' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:905:3: otherlv_0= 'SignalAllowedSpeedChanged' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleSignalAllowedSpeedChanged2077); 

                	newLeafNode(otherlv_0, grammarAccess.getSignalAllowedSpeedChangedAccess().getSignalAllowedSpeedChangedKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:909:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:910:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:910:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:911:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSignalAllowedSpeedChangedAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleSignalAllowedSpeedChanged2098);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignalAllowedSpeedChangedRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSignalAllowedSpeedChanged"


    // $ANTLR start "entryRuleTurnoutDirectionChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:935:1: entryRuleTurnoutDirectionChanged returns [EObject current=null] : iv_ruleTurnoutDirectionChanged= ruleTurnoutDirectionChanged EOF ;
    public final EObject entryRuleTurnoutDirectionChanged() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnoutDirectionChanged = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:936:2: (iv_ruleTurnoutDirectionChanged= ruleTurnoutDirectionChanged EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:937:2: iv_ruleTurnoutDirectionChanged= ruleTurnoutDirectionChanged EOF
            {
             newCompositeNode(grammarAccess.getTurnoutDirectionChangedRule()); 
            pushFollow(FOLLOW_ruleTurnoutDirectionChanged_in_entryRuleTurnoutDirectionChanged2134);
            iv_ruleTurnoutDirectionChanged=ruleTurnoutDirectionChanged();

            state._fsp--;

             current =iv_ruleTurnoutDirectionChanged; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnoutDirectionChanged2144); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnoutDirectionChanged"


    // $ANTLR start "ruleTurnoutDirectionChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:944:1: ruleTurnoutDirectionChanged returns [EObject current=null] : (otherlv_0= 'TurnoutDirectionChanged' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTurnoutDirectionChanged() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:947:28: ( (otherlv_0= 'TurnoutDirectionChanged' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:948:1: (otherlv_0= 'TurnoutDirectionChanged' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:948:1: (otherlv_0= 'TurnoutDirectionChanged' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:948:3: otherlv_0= 'TurnoutDirectionChanged' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleTurnoutDirectionChanged2181); 

                	newLeafNode(otherlv_0, grammarAccess.getTurnoutDirectionChangedAccess().getTurnoutDirectionChangedKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:952:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:953:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:953:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:954:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTurnoutDirectionChangedAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTurnoutDirectionChanged2202);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTurnoutDirectionChangedRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleTurnoutDirectionChanged"


    // $ANTLR start "entryRuleTriggerExpression_Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:978:1: entryRuleTriggerExpression_Impl returns [EObject current=null] : iv_ruleTriggerExpression_Impl= ruleTriggerExpression_Impl EOF ;
    public final EObject entryRuleTriggerExpression_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTriggerExpression_Impl = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:979:2: (iv_ruleTriggerExpression_Impl= ruleTriggerExpression_Impl EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:980:2: iv_ruleTriggerExpression_Impl= ruleTriggerExpression_Impl EOF
            {
             newCompositeNode(grammarAccess.getTriggerExpression_ImplRule()); 
            pushFollow(FOLLOW_ruleTriggerExpression_Impl_in_entryRuleTriggerExpression_Impl2238);
            iv_ruleTriggerExpression_Impl=ruleTriggerExpression_Impl();

            state._fsp--;

             current =iv_ruleTriggerExpression_Impl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTriggerExpression_Impl2248); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTriggerExpression_Impl"


    // $ANTLR start "ruleTriggerExpression_Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:987:1: ruleTriggerExpression_Impl returns [EObject current=null] : (otherlv_0= 'TriggerExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleTriggerExpression_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:990:28: ( (otherlv_0= 'TriggerExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:991:1: (otherlv_0= 'TriggerExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:991:1: (otherlv_0= 'TriggerExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:991:3: otherlv_0= 'TriggerExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleTriggerExpression_Impl2285); 

                	newLeafNode(otherlv_0, grammarAccess.getTriggerExpression_ImplAccess().getTriggerExpressionKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:995:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:996:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:996:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:997:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTriggerExpression_Impl2302); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTriggerExpression_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTriggerExpression_ImplRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleTriggerExpression_Impl2319); 

                	newLeafNode(otherlv_2, grammarAccess.getTriggerExpression_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1017:1: ( (lv_expression_3_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1018:1: (lv_expression_3_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1018:1: (lv_expression_3_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1019:3: lv_expression_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTriggerExpression_ImplAccess().getExpressionEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTriggerExpression_Impl2340);
            lv_expression_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTriggerExpression_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleTriggerExpression_Impl2352); 

                	newLeafNode(otherlv_4, grammarAccess.getTriggerExpression_ImplAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTriggerExpression_Impl"


    // $ANTLR start "entryRuleGuard"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1047:1: entryRuleGuard returns [EObject current=null] : iv_ruleGuard= ruleGuard EOF ;
    public final EObject entryRuleGuard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuard = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1048:2: (iv_ruleGuard= ruleGuard EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1049:2: iv_ruleGuard= ruleGuard EOF
            {
             newCompositeNode(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard2388);
            iv_ruleGuard=ruleGuard();

            state._fsp--;

             current =iv_ruleGuard; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard2398); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1056:1: ruleGuard returns [EObject current=null] : (this_TrainCurrentHeadingSpeed_0= ruleTrainCurrentHeadingSpeed | this_TrainCurrentlyStandsOn_1= ruleTrainCurrentlyStandsOn | this_TurnoutCurrentDirection_2= ruleTurnoutCurrentDirection | this_SignalCurrentAllowedSpeed_3= ruleSignalCurrentAllowedSpeed | this_NextTrackElementIs_4= ruleNextTrackElementIs | this_TurnoutHasDesiredDirection_5= ruleTurnoutHasDesiredDirection | this_GuardExpression_Impl_6= ruleGuardExpression_Impl ) ;
    public final EObject ruleGuard() throws RecognitionException {
        EObject current = null;

        EObject this_TrainCurrentHeadingSpeed_0 = null;

        EObject this_TrainCurrentlyStandsOn_1 = null;

        EObject this_TurnoutCurrentDirection_2 = null;

        EObject this_SignalCurrentAllowedSpeed_3 = null;

        EObject this_NextTrackElementIs_4 = null;

        EObject this_TurnoutHasDesiredDirection_5 = null;

        EObject this_GuardExpression_Impl_6 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1059:28: ( (this_TrainCurrentHeadingSpeed_0= ruleTrainCurrentHeadingSpeed | this_TrainCurrentlyStandsOn_1= ruleTrainCurrentlyStandsOn | this_TurnoutCurrentDirection_2= ruleTurnoutCurrentDirection | this_SignalCurrentAllowedSpeed_3= ruleSignalCurrentAllowedSpeed | this_NextTrackElementIs_4= ruleNextTrackElementIs | this_TurnoutHasDesiredDirection_5= ruleTurnoutHasDesiredDirection | this_GuardExpression_Impl_6= ruleGuardExpression_Impl ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1060:1: (this_TrainCurrentHeadingSpeed_0= ruleTrainCurrentHeadingSpeed | this_TrainCurrentlyStandsOn_1= ruleTrainCurrentlyStandsOn | this_TurnoutCurrentDirection_2= ruleTurnoutCurrentDirection | this_SignalCurrentAllowedSpeed_3= ruleSignalCurrentAllowedSpeed | this_NextTrackElementIs_4= ruleNextTrackElementIs | this_TurnoutHasDesiredDirection_5= ruleTurnoutHasDesiredDirection | this_GuardExpression_Impl_6= ruleGuardExpression_Impl )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1060:1: (this_TrainCurrentHeadingSpeed_0= ruleTrainCurrentHeadingSpeed | this_TrainCurrentlyStandsOn_1= ruleTrainCurrentlyStandsOn | this_TurnoutCurrentDirection_2= ruleTurnoutCurrentDirection | this_SignalCurrentAllowedSpeed_3= ruleSignalCurrentAllowedSpeed | this_NextTrackElementIs_4= ruleNextTrackElementIs | this_TurnoutHasDesiredDirection_5= ruleTurnoutHasDesiredDirection | this_GuardExpression_Impl_6= ruleGuardExpression_Impl )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt16=1;
                }
                break;
            case 37:
                {
                alt16=2;
                }
                break;
            case 38:
                {
                alt16=3;
                }
                break;
            case 39:
                {
                alt16=4;
                }
                break;
            case 40:
                {
                alt16=5;
                }
                break;
            case 41:
                {
                alt16=6;
                }
                break;
            case 42:
                {
                alt16=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1061:5: this_TrainCurrentHeadingSpeed_0= ruleTrainCurrentHeadingSpeed
                    {
                     
                            newCompositeNode(grammarAccess.getGuardAccess().getTrainCurrentHeadingSpeedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTrainCurrentHeadingSpeed_in_ruleGuard2445);
                    this_TrainCurrentHeadingSpeed_0=ruleTrainCurrentHeadingSpeed();

                    state._fsp--;

                     
                            current = this_TrainCurrentHeadingSpeed_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1071:5: this_TrainCurrentlyStandsOn_1= ruleTrainCurrentlyStandsOn
                    {
                     
                            newCompositeNode(grammarAccess.getGuardAccess().getTrainCurrentlyStandsOnParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTrainCurrentlyStandsOn_in_ruleGuard2472);
                    this_TrainCurrentlyStandsOn_1=ruleTrainCurrentlyStandsOn();

                    state._fsp--;

                     
                            current = this_TrainCurrentlyStandsOn_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1081:5: this_TurnoutCurrentDirection_2= ruleTurnoutCurrentDirection
                    {
                     
                            newCompositeNode(grammarAccess.getGuardAccess().getTurnoutCurrentDirectionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleTurnoutCurrentDirection_in_ruleGuard2499);
                    this_TurnoutCurrentDirection_2=ruleTurnoutCurrentDirection();

                    state._fsp--;

                     
                            current = this_TurnoutCurrentDirection_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1091:5: this_SignalCurrentAllowedSpeed_3= ruleSignalCurrentAllowedSpeed
                    {
                     
                            newCompositeNode(grammarAccess.getGuardAccess().getSignalCurrentAllowedSpeedParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleSignalCurrentAllowedSpeed_in_ruleGuard2526);
                    this_SignalCurrentAllowedSpeed_3=ruleSignalCurrentAllowedSpeed();

                    state._fsp--;

                     
                            current = this_SignalCurrentAllowedSpeed_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1101:5: this_NextTrackElementIs_4= ruleNextTrackElementIs
                    {
                     
                            newCompositeNode(grammarAccess.getGuardAccess().getNextTrackElementIsParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleNextTrackElementIs_in_ruleGuard2553);
                    this_NextTrackElementIs_4=ruleNextTrackElementIs();

                    state._fsp--;

                     
                            current = this_NextTrackElementIs_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1111:5: this_TurnoutHasDesiredDirection_5= ruleTurnoutHasDesiredDirection
                    {
                     
                            newCompositeNode(grammarAccess.getGuardAccess().getTurnoutHasDesiredDirectionParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleTurnoutHasDesiredDirection_in_ruleGuard2580);
                    this_TurnoutHasDesiredDirection_5=ruleTurnoutHasDesiredDirection();

                    state._fsp--;

                     
                            current = this_TurnoutHasDesiredDirection_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1121:5: this_GuardExpression_Impl_6= ruleGuardExpression_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getGuardAccess().getGuardExpression_ImplParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleGuardExpression_Impl_in_ruleGuard2607);
                    this_GuardExpression_Impl_6=ruleGuardExpression_Impl();

                    state._fsp--;

                     
                            current = this_GuardExpression_Impl_6; 
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
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleTrainCurrentHeadingSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1137:1: entryRuleTrainCurrentHeadingSpeed returns [EObject current=null] : iv_ruleTrainCurrentHeadingSpeed= ruleTrainCurrentHeadingSpeed EOF ;
    public final EObject entryRuleTrainCurrentHeadingSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainCurrentHeadingSpeed = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1138:2: (iv_ruleTrainCurrentHeadingSpeed= ruleTrainCurrentHeadingSpeed EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1139:2: iv_ruleTrainCurrentHeadingSpeed= ruleTrainCurrentHeadingSpeed EOF
            {
             newCompositeNode(grammarAccess.getTrainCurrentHeadingSpeedRule()); 
            pushFollow(FOLLOW_ruleTrainCurrentHeadingSpeed_in_entryRuleTrainCurrentHeadingSpeed2642);
            iv_ruleTrainCurrentHeadingSpeed=ruleTrainCurrentHeadingSpeed();

            state._fsp--;

             current =iv_ruleTrainCurrentHeadingSpeed; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrainCurrentHeadingSpeed2652); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrainCurrentHeadingSpeed"


    // $ANTLR start "ruleTrainCurrentHeadingSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1146:1: ruleTrainCurrentHeadingSpeed returns [EObject current=null] : (otherlv_0= 'TrainCurrentHeadingSpeed' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTrainCurrentHeadingSpeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1149:28: ( (otherlv_0= 'TrainCurrentHeadingSpeed' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1150:1: (otherlv_0= 'TrainCurrentHeadingSpeed' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1150:1: (otherlv_0= 'TrainCurrentHeadingSpeed' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1150:3: otherlv_0= 'TrainCurrentHeadingSpeed' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleTrainCurrentHeadingSpeed2689); 

                	newLeafNode(otherlv_0, grammarAccess.getTrainCurrentHeadingSpeedAccess().getTrainCurrentHeadingSpeedKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1154:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1155:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1155:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1156:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTrainCurrentHeadingSpeedAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTrainCurrentHeadingSpeed2710);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTrainCurrentHeadingSpeedRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleTrainCurrentHeadingSpeed"


    // $ANTLR start "entryRuleTrainCurrentlyStandsOn"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1180:1: entryRuleTrainCurrentlyStandsOn returns [EObject current=null] : iv_ruleTrainCurrentlyStandsOn= ruleTrainCurrentlyStandsOn EOF ;
    public final EObject entryRuleTrainCurrentlyStandsOn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrainCurrentlyStandsOn = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1181:2: (iv_ruleTrainCurrentlyStandsOn= ruleTrainCurrentlyStandsOn EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1182:2: iv_ruleTrainCurrentlyStandsOn= ruleTrainCurrentlyStandsOn EOF
            {
             newCompositeNode(grammarAccess.getTrainCurrentlyStandsOnRule()); 
            pushFollow(FOLLOW_ruleTrainCurrentlyStandsOn_in_entryRuleTrainCurrentlyStandsOn2746);
            iv_ruleTrainCurrentlyStandsOn=ruleTrainCurrentlyStandsOn();

            state._fsp--;

             current =iv_ruleTrainCurrentlyStandsOn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrainCurrentlyStandsOn2756); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTrainCurrentlyStandsOn"


    // $ANTLR start "ruleTrainCurrentlyStandsOn"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1189:1: ruleTrainCurrentlyStandsOn returns [EObject current=null] : (otherlv_0= 'TrainCurrentlyStandsOn' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTrainCurrentlyStandsOn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1192:28: ( (otherlv_0= 'TrainCurrentlyStandsOn' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1193:1: (otherlv_0= 'TrainCurrentlyStandsOn' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1193:1: (otherlv_0= 'TrainCurrentlyStandsOn' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1193:3: otherlv_0= 'TrainCurrentlyStandsOn' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleTrainCurrentlyStandsOn2793); 

                	newLeafNode(otherlv_0, grammarAccess.getTrainCurrentlyStandsOnAccess().getTrainCurrentlyStandsOnKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1197:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1198:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1198:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1199:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTrainCurrentlyStandsOnAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTrainCurrentlyStandsOn2814);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTrainCurrentlyStandsOnRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleTrainCurrentlyStandsOn"


    // $ANTLR start "entryRuleTurnoutCurrentDirection"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1223:1: entryRuleTurnoutCurrentDirection returns [EObject current=null] : iv_ruleTurnoutCurrentDirection= ruleTurnoutCurrentDirection EOF ;
    public final EObject entryRuleTurnoutCurrentDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnoutCurrentDirection = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1224:2: (iv_ruleTurnoutCurrentDirection= ruleTurnoutCurrentDirection EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1225:2: iv_ruleTurnoutCurrentDirection= ruleTurnoutCurrentDirection EOF
            {
             newCompositeNode(grammarAccess.getTurnoutCurrentDirectionRule()); 
            pushFollow(FOLLOW_ruleTurnoutCurrentDirection_in_entryRuleTurnoutCurrentDirection2850);
            iv_ruleTurnoutCurrentDirection=ruleTurnoutCurrentDirection();

            state._fsp--;

             current =iv_ruleTurnoutCurrentDirection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnoutCurrentDirection2860); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnoutCurrentDirection"


    // $ANTLR start "ruleTurnoutCurrentDirection"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1232:1: ruleTurnoutCurrentDirection returns [EObject current=null] : (otherlv_0= 'TurnoutCurrentDirection' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTurnoutCurrentDirection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1235:28: ( (otherlv_0= 'TurnoutCurrentDirection' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1236:1: (otherlv_0= 'TurnoutCurrentDirection' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1236:1: (otherlv_0= 'TurnoutCurrentDirection' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1236:3: otherlv_0= 'TurnoutCurrentDirection' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleTurnoutCurrentDirection2897); 

                	newLeafNode(otherlv_0, grammarAccess.getTurnoutCurrentDirectionAccess().getTurnoutCurrentDirectionKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1240:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1241:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1241:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1242:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTurnoutCurrentDirectionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTurnoutCurrentDirection2918);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTurnoutCurrentDirectionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleTurnoutCurrentDirection"


    // $ANTLR start "entryRuleSignalCurrentAllowedSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1266:1: entryRuleSignalCurrentAllowedSpeed returns [EObject current=null] : iv_ruleSignalCurrentAllowedSpeed= ruleSignalCurrentAllowedSpeed EOF ;
    public final EObject entryRuleSignalCurrentAllowedSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignalCurrentAllowedSpeed = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1267:2: (iv_ruleSignalCurrentAllowedSpeed= ruleSignalCurrentAllowedSpeed EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1268:2: iv_ruleSignalCurrentAllowedSpeed= ruleSignalCurrentAllowedSpeed EOF
            {
             newCompositeNode(grammarAccess.getSignalCurrentAllowedSpeedRule()); 
            pushFollow(FOLLOW_ruleSignalCurrentAllowedSpeed_in_entryRuleSignalCurrentAllowedSpeed2954);
            iv_ruleSignalCurrentAllowedSpeed=ruleSignalCurrentAllowedSpeed();

            state._fsp--;

             current =iv_ruleSignalCurrentAllowedSpeed; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalCurrentAllowedSpeed2964); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignalCurrentAllowedSpeed"


    // $ANTLR start "ruleSignalCurrentAllowedSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1275:1: ruleSignalCurrentAllowedSpeed returns [EObject current=null] : (otherlv_0= 'SignalCurrentAllowedSpeed' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleSignalCurrentAllowedSpeed() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1278:28: ( (otherlv_0= 'SignalCurrentAllowedSpeed' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1279:1: (otherlv_0= 'SignalCurrentAllowedSpeed' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1279:1: (otherlv_0= 'SignalCurrentAllowedSpeed' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1279:3: otherlv_0= 'SignalCurrentAllowedSpeed' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleSignalCurrentAllowedSpeed3001); 

                	newLeafNode(otherlv_0, grammarAccess.getSignalCurrentAllowedSpeedAccess().getSignalCurrentAllowedSpeedKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1283:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1284:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1284:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1285:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSignalCurrentAllowedSpeedAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleSignalCurrentAllowedSpeed3022);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignalCurrentAllowedSpeedRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleSignalCurrentAllowedSpeed"


    // $ANTLR start "entryRuleNextTrackElementIs"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1309:1: entryRuleNextTrackElementIs returns [EObject current=null] : iv_ruleNextTrackElementIs= ruleNextTrackElementIs EOF ;
    public final EObject entryRuleNextTrackElementIs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNextTrackElementIs = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1310:2: (iv_ruleNextTrackElementIs= ruleNextTrackElementIs EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1311:2: iv_ruleNextTrackElementIs= ruleNextTrackElementIs EOF
            {
             newCompositeNode(grammarAccess.getNextTrackElementIsRule()); 
            pushFollow(FOLLOW_ruleNextTrackElementIs_in_entryRuleNextTrackElementIs3058);
            iv_ruleNextTrackElementIs=ruleNextTrackElementIs();

            state._fsp--;

             current =iv_ruleNextTrackElementIs; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNextTrackElementIs3068); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNextTrackElementIs"


    // $ANTLR start "ruleNextTrackElementIs"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1318:1: ruleNextTrackElementIs returns [EObject current=null] : (otherlv_0= 'NextTrackElementIs' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleNextTrackElementIs() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1321:28: ( (otherlv_0= 'NextTrackElementIs' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1322:1: (otherlv_0= 'NextTrackElementIs' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1322:1: (otherlv_0= 'NextTrackElementIs' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1322:3: otherlv_0= 'NextTrackElementIs' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleNextTrackElementIs3105); 

                	newLeafNode(otherlv_0, grammarAccess.getNextTrackElementIsAccess().getNextTrackElementIsKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1326:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1327:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1327:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1328:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getNextTrackElementIsAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleNextTrackElementIs3126);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNextTrackElementIsRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleNextTrackElementIs"


    // $ANTLR start "entryRuleTurnoutHasDesiredDirection"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1352:1: entryRuleTurnoutHasDesiredDirection returns [EObject current=null] : iv_ruleTurnoutHasDesiredDirection= ruleTurnoutHasDesiredDirection EOF ;
    public final EObject entryRuleTurnoutHasDesiredDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnoutHasDesiredDirection = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1353:2: (iv_ruleTurnoutHasDesiredDirection= ruleTurnoutHasDesiredDirection EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1354:2: iv_ruleTurnoutHasDesiredDirection= ruleTurnoutHasDesiredDirection EOF
            {
             newCompositeNode(grammarAccess.getTurnoutHasDesiredDirectionRule()); 
            pushFollow(FOLLOW_ruleTurnoutHasDesiredDirection_in_entryRuleTurnoutHasDesiredDirection3162);
            iv_ruleTurnoutHasDesiredDirection=ruleTurnoutHasDesiredDirection();

            state._fsp--;

             current =iv_ruleTurnoutHasDesiredDirection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnoutHasDesiredDirection3172); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTurnoutHasDesiredDirection"


    // $ANTLR start "ruleTurnoutHasDesiredDirection"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1361:1: ruleTurnoutHasDesiredDirection returns [EObject current=null] : (otherlv_0= 'TurnoutHasDesiredDirection' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleTurnoutHasDesiredDirection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1364:28: ( (otherlv_0= 'TurnoutHasDesiredDirection' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1365:1: (otherlv_0= 'TurnoutHasDesiredDirection' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1365:1: (otherlv_0= 'TurnoutHasDesiredDirection' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1365:3: otherlv_0= 'TurnoutHasDesiredDirection' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleTurnoutHasDesiredDirection3209); 

                	newLeafNode(otherlv_0, grammarAccess.getTurnoutHasDesiredDirectionAccess().getTurnoutHasDesiredDirectionKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1369:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1370:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1370:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1371:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getTurnoutHasDesiredDirectionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleTurnoutHasDesiredDirection3230);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTurnoutHasDesiredDirectionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleTurnoutHasDesiredDirection"


    // $ANTLR start "entryRuleGuardExpression_Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1395:1: entryRuleGuardExpression_Impl returns [EObject current=null] : iv_ruleGuardExpression_Impl= ruleGuardExpression_Impl EOF ;
    public final EObject entryRuleGuardExpression_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuardExpression_Impl = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1396:2: (iv_ruleGuardExpression_Impl= ruleGuardExpression_Impl EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1397:2: iv_ruleGuardExpression_Impl= ruleGuardExpression_Impl EOF
            {
             newCompositeNode(grammarAccess.getGuardExpression_ImplRule()); 
            pushFollow(FOLLOW_ruleGuardExpression_Impl_in_entryRuleGuardExpression_Impl3266);
            iv_ruleGuardExpression_Impl=ruleGuardExpression_Impl();

            state._fsp--;

             current =iv_ruleGuardExpression_Impl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuardExpression_Impl3276); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGuardExpression_Impl"


    // $ANTLR start "ruleGuardExpression_Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1404:1: ruleGuardExpression_Impl returns [EObject current=null] : (otherlv_0= 'GuardExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}' ) ;
    public final EObject ruleGuardExpression_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_expression_3_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1407:28: ( (otherlv_0= 'GuardExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1408:1: (otherlv_0= 'GuardExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1408:1: (otherlv_0= 'GuardExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1408:3: otherlv_0= 'GuardExpression' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_expression_3_0= ruleEString ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleGuardExpression_Impl3313); 

                	newLeafNode(otherlv_0, grammarAccess.getGuardExpression_ImplAccess().getGuardExpressionKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1412:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1413:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1413:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1414:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGuardExpression_Impl3330); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGuardExpression_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuardExpression_ImplRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleGuardExpression_Impl3347); 

                	newLeafNode(otherlv_2, grammarAccess.getGuardExpression_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1434:1: ( (lv_expression_3_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1435:1: (lv_expression_3_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1435:1: (lv_expression_3_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1436:3: lv_expression_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getGuardExpression_ImplAccess().getExpressionEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleGuardExpression_Impl3368);
            lv_expression_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGuardExpression_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_3_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_ruleGuardExpression_Impl3380); 

                	newLeafNode(otherlv_4, grammarAccess.getGuardExpression_ImplAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGuardExpression_Impl"


    // $ANTLR start "entryRuleState"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1464:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1465:2: (iv_ruleState= ruleState EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1466:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState3416);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState3426); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1473:1: ruleState returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_isInitial_2_0=null;
        Token lv_isActive_3_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1476:28: ( ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) ) )* ) ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1477:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) ) )* ) ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1477:1: ( ( (lv_name_0_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) ) )* ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1477:2: ( (lv_name_0_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) ) )* ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1477:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1478:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1478:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1479:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleState3468); 

            			newLeafNode(lv_name_0_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStateRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1495:2: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) ) )* ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1497:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) ) )* ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1497:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) ) )* ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1498:2: ( ( ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getStateAccess().getUnorderedGroup_1());
            	
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1501:2: ( ( ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) ) )* )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1502:3: ( ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) ) )*
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1502:3: ( ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( LA17_0 ==43 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 ==44 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 1) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1504:4: ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) )
            	    {
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1504:4: ({...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1505:5: {...}? => ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleState", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1505:102: ( ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1506:6: ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_1(), 0);
            	    	 				
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1509:6: ({...}? => ( (lv_isInitial_2_0= 'is Initial' ) ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1509:7: {...}? => ( (lv_isInitial_2_0= 'is Initial' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleState", "true");
            	    }
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1509:16: ( (lv_isInitial_2_0= 'is Initial' ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1510:1: (lv_isInitial_2_0= 'is Initial' )
            	    {
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1510:1: (lv_isInitial_2_0= 'is Initial' )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1511:3: lv_isInitial_2_0= 'is Initial'
            	    {
            	    lv_isInitial_2_0=(Token)match(input,43,FOLLOW_43_in_ruleState3536); 

            	            newLeafNode(lv_isInitial_2_0, grammarAccess.getStateAccess().getIsInitialIsInitialKeyword_1_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStateRule());
            	    	        }
            	           		setWithLastConsumed(current, "isInitial", true, "is Initial");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup_1());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1531:4: ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) )
            	    {
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1531:4: ({...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1532:5: {...}? => ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleState", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1532:102: ( ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1533:6: ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_1(), 1);
            	    	 				
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1536:6: ({...}? => ( (lv_isActive_3_0= 'is Active' ) ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1536:7: {...}? => ( (lv_isActive_3_0= 'is Active' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleState", "true");
            	    }
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1536:16: ( (lv_isActive_3_0= 'is Active' ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1537:1: (lv_isActive_3_0= 'is Active' )
            	    {
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1537:1: (lv_isActive_3_0= 'is Active' )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1538:3: lv_isActive_3_0= 'is Active'
            	    {
            	    lv_isActive_3_0=(Token)match(input,44,FOLLOW_44_in_ruleState3621); 

            	            newLeafNode(lv_isActive_3_0, grammarAccess.getStateAccess().getIsActiveIsActiveKeyword_1_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getStateRule());
            	    	        }
            	           		setWithLastConsumed(current, "isActive", true, "is Active");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup_1());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getStateAccess().getUnorderedGroup_1());
            	

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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1573:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1574:2: (iv_ruleTransition= ruleTransition EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1575:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition3710);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition3720); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1582:1: ruleTransition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) ) )* ) ) ) otherlv_5= 'from state' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'execute' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'guard' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'trigger' ( (otherlv_18= RULE_ID ) ) )? otherlv_19= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_isEnabled_3_0=null;
        Token lv_isFireable_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1585:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) ) )* ) ) ) otherlv_5= 'from state' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'execute' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'guard' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'trigger' ( (otherlv_18= RULE_ID ) ) )? otherlv_19= '}' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1586:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) ) )* ) ) ) otherlv_5= 'from state' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'execute' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'guard' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'trigger' ( (otherlv_18= RULE_ID ) ) )? otherlv_19= '}' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1586:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) ) )* ) ) ) otherlv_5= 'from state' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'execute' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'guard' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'trigger' ( (otherlv_18= RULE_ID ) ) )? otherlv_19= '}' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1586:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) ) )* ) ) ) otherlv_5= 'from state' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'to' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'execute' ( (otherlv_10= RULE_ID ) ) (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )* (otherlv_13= 'guard' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'trigger' ( (otherlv_18= RULE_ID ) ) )? otherlv_19= '}'
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1586:2: ( (lv_name_0_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1587:1: (lv_name_0_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1587:1: (lv_name_0_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1588:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition3762); 

            			newLeafNode(lv_name_0_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleTransition3779); 

                	newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1608:1: ( ( ( ( ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) ) )* ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1610:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) ) )* ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1610:1: ( ( ( ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) ) )* ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1611:2: ( ( ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getTransitionAccess().getUnorderedGroup_2());
            	
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1614:2: ( ( ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) ) )* )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1615:3: ( ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) ) )*
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1615:3: ( ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) ) )*
            loop18:
            do {
                int alt18=3;
                int LA18_0 = input.LA(1);

                if ( LA18_0 ==45 && getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 0) ) {
                    alt18=1;
                }
                else if ( LA18_0 ==46 && getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 1) ) {
                    alt18=2;
                }


                switch (alt18) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1617:4: ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) )
            	    {
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1617:4: ({...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1618:5: {...}? => ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleTransition", "getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1618:107: ( ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1619:6: ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1622:6: ({...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1622:7: {...}? => ( (lv_isEnabled_3_0= 'is Enabled' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTransition", "true");
            	    }
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1622:16: ( (lv_isEnabled_3_0= 'is Enabled' ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1623:1: (lv_isEnabled_3_0= 'is Enabled' )
            	    {
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1623:1: (lv_isEnabled_3_0= 'is Enabled' )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1624:3: lv_isEnabled_3_0= 'is Enabled'
            	    {
            	    lv_isEnabled_3_0=(Token)match(input,45,FOLLOW_45_in_ruleTransition3842); 

            	            newLeafNode(lv_isEnabled_3_0, grammarAccess.getTransitionAccess().getIsEnabledIsEnabledKeyword_2_0_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTransitionRule());
            	    	        }
            	           		setWithLastConsumed(current, "isEnabled", true, "is Enabled");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTransitionAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1644:4: ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) )
            	    {
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1644:4: ({...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1645:5: {...}? => ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleTransition", "getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1645:107: ( ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1646:6: ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1649:6: ({...}? => ( (lv_isFireable_4_0= 'is Fireable' ) ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1649:7: {...}? => ( (lv_isFireable_4_0= 'is Fireable' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleTransition", "true");
            	    }
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1649:16: ( (lv_isFireable_4_0= 'is Fireable' ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1650:1: (lv_isFireable_4_0= 'is Fireable' )
            	    {
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1650:1: (lv_isFireable_4_0= 'is Fireable' )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1651:3: lv_isFireable_4_0= 'is Fireable'
            	    {
            	    lv_isFireable_4_0=(Token)match(input,46,FOLLOW_46_in_ruleTransition3927); 

            	            newLeafNode(lv_isFireable_4_0, grammarAccess.getTransitionAccess().getIsFireableIsFireableKeyword_2_1_0());
            	        

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTransitionRule());
            	    	        }
            	           		setWithLastConsumed(current, "isFireable", true, "is Fireable");
            	    	    

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTransitionAccess().getUnorderedGroup_2());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getTransitionAccess().getUnorderedGroup_2());
            	

            }

            otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleTransition3992); 

                	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getFromStateKeyword_3());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1682:1: ( (otherlv_6= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1683:1: (otherlv_6= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1683:1: (otherlv_6= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1684:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition4012); 

            		newLeafNode(otherlv_6, grammarAccess.getTransitionAccess().getSourceStateStateCrossReference_4_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,48,FOLLOW_48_in_ruleTransition4024); 

                	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getToKeyword_5());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1699:1: ( (otherlv_8= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1700:1: (otherlv_8= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1700:1: (otherlv_8= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1701:3: otherlv_8= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition4044); 

            		newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_6_0()); 
            	

            }


            }

            otherlv_9=(Token)match(input,49,FOLLOW_49_in_ruleTransition4056); 

                	newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getExecuteKeyword_7());
                
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1716:1: ( (otherlv_10= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1717:1: (otherlv_10= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1717:1: (otherlv_10= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1718:3: otherlv_10= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                    
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition4076); 

            		newLeafNode(otherlv_10, grammarAccess.getTransitionAccess().getActionActionCrossReference_8_0()); 
            	

            }


            }

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1729:2: (otherlv_11= ',' ( (otherlv_12= RULE_ID ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==50) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1729:4: otherlv_11= ',' ( (otherlv_12= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,50,FOLLOW_50_in_ruleTransition4089); 

            	        	newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getCommaKeyword_9_0());
            	        
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1733:1: ( (otherlv_12= RULE_ID ) )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1734:1: (otherlv_12= RULE_ID )
            	    {
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1734:1: (otherlv_12= RULE_ID )
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1735:3: otherlv_12= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getTransitionRule());
            	    	        }
            	            
            	    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition4109); 

            	    		newLeafNode(otherlv_12, grammarAccess.getTransitionAccess().getActionActionCrossReference_9_1_0()); 
            	    	

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1746:4: (otherlv_13= 'guard' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==51) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1746:6: otherlv_13= 'guard' ( (otherlv_14= RULE_ID ) ) (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                    {
                    otherlv_13=(Token)match(input,51,FOLLOW_51_in_ruleTransition4124); 

                        	newLeafNode(otherlv_13, grammarAccess.getTransitionAccess().getGuardKeyword_10_0());
                        
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1750:1: ( (otherlv_14= RULE_ID ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1751:1: (otherlv_14= RULE_ID )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1751:1: (otherlv_14= RULE_ID )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1752:3: otherlv_14= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition4144); 

                    		newLeafNode(otherlv_14, grammarAccess.getTransitionAccess().getGuardGuardCrossReference_10_1_0()); 
                    	

                    }


                    }

                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1763:2: (otherlv_15= ',' ( (otherlv_16= RULE_ID ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==50) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1763:4: otherlv_15= ',' ( (otherlv_16= RULE_ID ) )
                    	    {
                    	    otherlv_15=(Token)match(input,50,FOLLOW_50_in_ruleTransition4157); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getTransitionAccess().getCommaKeyword_10_2_0());
                    	        
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1767:1: ( (otherlv_16= RULE_ID ) )
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1768:1: (otherlv_16= RULE_ID )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1768:1: (otherlv_16= RULE_ID )
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1769:3: otherlv_16= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	    	        }
                    	            
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition4177); 

                    	    		newLeafNode(otherlv_16, grammarAccess.getTransitionAccess().getGuardGuardCrossReference_10_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1780:6: (otherlv_17= 'trigger' ( (otherlv_18= RULE_ID ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==52) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1780:8: otherlv_17= 'trigger' ( (otherlv_18= RULE_ID ) )
                    {
                    otherlv_17=(Token)match(input,52,FOLLOW_52_in_ruleTransition4194); 

                        	newLeafNode(otherlv_17, grammarAccess.getTransitionAccess().getTriggerKeyword_11_0());
                        
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1784:1: ( (otherlv_18= RULE_ID ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1785:1: (otherlv_18= RULE_ID )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1785:1: (otherlv_18= RULE_ID )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/parser/antlr/internal/InternalStateMachineDSL.g:1786:3: otherlv_18= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                            
                    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition4214); 

                    		newLeafNode(otherlv_18, grammarAccess.getTransitionAccess().getTriggerTriggerCrossReference_11_1_0()); 
                    	

                    }


                    }


                    }
                    break;

            }

            otherlv_19=(Token)match(input,25,FOLLOW_25_in_ruleTransition4228); 

                	newLeafNode(otherlv_19, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_12());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStateMachineBehavioralModel_in_entryRuleStateMachineBehavioralModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateMachineBehavioralModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_ruleStateMachineBehavioralModel141 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_ruleStateMachine_in_ruleStateMachineBehavioralModel163 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleStateMachine_in_ruleStateMachineBehavioralModel184 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleInclude269 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleInclude286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleStateMachine374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateMachine391 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStateMachine408 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStateMachine428 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStateMachine440 = new BitSet(new long[]{0x0000000002AA8000L});
    public static final BitSet FOLLOW_15_in_ruleStateMachine453 = new BitSet(new long[]{0x000000007C010000L});
    public static final BitSet FOLLOW_ruleAction_in_ruleStateMachine474 = new BitSet(new long[]{0x000000007C010000L});
    public static final BitSet FOLLOW_16_in_ruleStateMachine487 = new BitSet(new long[]{0x0000000002AA0000L});
    public static final BitSet FOLLOW_17_in_ruleStateMachine502 = new BitSet(new long[]{0x000007F000040000L});
    public static final BitSet FOLLOW_ruleGuard_in_ruleStateMachine523 = new BitSet(new long[]{0x000007F000040000L});
    public static final BitSet FOLLOW_18_in_ruleStateMachine536 = new BitSet(new long[]{0x0000000002A80000L});
    public static final BitSet FOLLOW_19_in_ruleStateMachine551 = new BitSet(new long[]{0x0000000F80100000L});
    public static final BitSet FOLLOW_ruleTrigger_in_ruleStateMachine572 = new BitSet(new long[]{0x0000000F80100000L});
    public static final BitSet FOLLOW_20_in_ruleStateMachine585 = new BitSet(new long[]{0x0000000002A00000L});
    public static final BitSet FOLLOW_21_in_ruleStateMachine600 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleState_in_ruleStateMachine621 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_22_in_ruleStateMachine634 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_23_in_ruleStateMachine649 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleStateMachine670 = new BitSet(new long[]{0x0000000001000020L});
    public static final BitSet FOLLOW_24_in_ruleStateMachine683 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStateMachine697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeTrainHeadingSpeed_in_ruleAction913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeSignalAllowedSpeed_in_ruleAction940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeTurnoutDirection_in_ruleAction967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeTrainCurrentTrackElement_in_ruleAction994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_Impl_in_ruleAction1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_Impl_in_entryRuleActionExpression_Impl1056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionExpression_Impl1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleActionExpression_Impl1103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleActionExpression_Impl1120 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleActionExpression_Impl1137 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleActionExpression_Impl1158 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleActionExpression_Impl1170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeTrainCurrentTrackElement_in_entryRuleChangeTrainCurrentTrackElement1206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeTrainCurrentTrackElement1216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleChangeTrainCurrentTrackElement1253 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleChangeTrainCurrentTrackElement1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeTurnoutDirection_in_entryRuleChangeTurnoutDirection1310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeTurnoutDirection1320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleChangeTurnoutDirection1357 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleChangeTurnoutDirection1378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeSignalAllowedSpeed_in_entryRuleChangeSignalAllowedSpeed1414 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeSignalAllowedSpeed1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleChangeSignalAllowedSpeed1461 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleChangeSignalAllowedSpeed1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeTrainHeadingSpeed_in_entryRuleChangeTrainHeadingSpeed1518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeTrainHeadingSpeed1528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleChangeTrainHeadingSpeed1565 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleChangeTrainHeadingSpeed1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrigger1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainHeadingSpeedChanged_in_ruleTrigger1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainTrackElementChanged_in_ruleTrigger1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalAllowedSpeedChanged_in_ruleTrigger1733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutDirectionChanged_in_ruleTrigger1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerExpression_Impl_in_ruleTrigger1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainHeadingSpeedChanged_in_entryRuleTrainHeadingSpeedChanged1822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrainHeadingSpeedChanged1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTrainHeadingSpeedChanged1869 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTrainHeadingSpeedChanged1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainTrackElementChanged_in_entryRuleTrainTrackElementChanged1926 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrainTrackElementChanged1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleTrainTrackElementChanged1973 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTrainTrackElementChanged1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalAllowedSpeedChanged_in_entryRuleSignalAllowedSpeedChanged2030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalAllowedSpeedChanged2040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSignalAllowedSpeedChanged2077 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSignalAllowedSpeedChanged2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutDirectionChanged_in_entryRuleTurnoutDirectionChanged2134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnoutDirectionChanged2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleTurnoutDirectionChanged2181 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTurnoutDirectionChanged2202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerExpression_Impl_in_entryRuleTriggerExpression_Impl2238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTriggerExpression_Impl2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleTriggerExpression_Impl2285 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTriggerExpression_Impl2302 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTriggerExpression_Impl2319 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTriggerExpression_Impl2340 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTriggerExpression_Impl2352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard2388 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainCurrentHeadingSpeed_in_ruleGuard2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainCurrentlyStandsOn_in_ruleGuard2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutCurrentDirection_in_ruleGuard2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalCurrentAllowedSpeed_in_ruleGuard2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextTrackElementIs_in_ruleGuard2553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutHasDesiredDirection_in_ruleGuard2580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuardExpression_Impl_in_ruleGuard2607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainCurrentHeadingSpeed_in_entryRuleTrainCurrentHeadingSpeed2642 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrainCurrentHeadingSpeed2652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleTrainCurrentHeadingSpeed2689 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTrainCurrentHeadingSpeed2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainCurrentlyStandsOn_in_entryRuleTrainCurrentlyStandsOn2746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrainCurrentlyStandsOn2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleTrainCurrentlyStandsOn2793 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTrainCurrentlyStandsOn2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutCurrentDirection_in_entryRuleTurnoutCurrentDirection2850 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnoutCurrentDirection2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleTurnoutCurrentDirection2897 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTurnoutCurrentDirection2918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalCurrentAllowedSpeed_in_entryRuleSignalCurrentAllowedSpeed2954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalCurrentAllowedSpeed2964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleSignalCurrentAllowedSpeed3001 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleSignalCurrentAllowedSpeed3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextTrackElementIs_in_entryRuleNextTrackElementIs3058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNextTrackElementIs3068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNextTrackElementIs3105 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleNextTrackElementIs3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutHasDesiredDirection_in_entryRuleTurnoutHasDesiredDirection3162 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnoutHasDesiredDirection3172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleTurnoutHasDesiredDirection3209 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleTurnoutHasDesiredDirection3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuardExpression_Impl_in_entryRuleGuardExpression_Impl3266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuardExpression_Impl3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleGuardExpression_Impl3313 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGuardExpression_Impl3330 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleGuardExpression_Impl3347 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleGuardExpression_Impl3368 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGuardExpression_Impl3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState3416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState3426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleState3468 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_43_in_ruleState3536 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_44_in_ruleState3621 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition3710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition3762 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleTransition3779 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_45_in_ruleTransition3842 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_46_in_ruleTransition3927 = new BitSet(new long[]{0x0000E00000000000L});
    public static final BitSet FOLLOW_47_in_ruleTransition3992 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition4012 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleTransition4024 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition4044 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleTransition4056 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition4076 = new BitSet(new long[]{0x001C000002000000L});
    public static final BitSet FOLLOW_50_in_ruleTransition4089 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition4109 = new BitSet(new long[]{0x001C000002000000L});
    public static final BitSet FOLLOW_51_in_ruleTransition4124 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition4144 = new BitSet(new long[]{0x0014000002000000L});
    public static final BitSet FOLLOW_50_in_ruleTransition4157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition4177 = new BitSet(new long[]{0x0014000002000000L});
    public static final BitSet FOLLOW_52_in_ruleTransition4194 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition4214 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTransition4228 = new BitSet(new long[]{0x0000000000000002L});

}
