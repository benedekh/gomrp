package hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.services.StateMachineDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'include'", "'StateMachine'", "'for object'", "'{'", "'}'", "'Actions:'", "'EndActions'", "'Guards:'", "'EndGuards'", "'Triggers:'", "'EndTriggers'", "'States:'", "'EndStates'", "'Transitions:'", "'EndTransitions'", "'ActionExpression'", "'ChangeTrainCurrentTrackElement'", "'ChangeTurnoutDirection'", "'ChangeSignalAllowedSpeed'", "'ChangeTrainHeadingSpeed'", "'TrainHeadingSpeedChanged'", "'TrainTrackElementChanged'", "'SignalAllowedSpeedChanged'", "'TurnoutDirectionChanged'", "'TriggerExpression'", "'TrainCurrentHeadingSpeed'", "'TrainCurrentlyStandsOn'", "'TurnoutCurrentDirection'", "'SignalCurrentAllowedSpeed'", "'NextTrackElementIs'", "'TurnoutHasDesiredDirection'", "'GuardExpression'", "'from state'", "'to'", "'execute'", "','", "'guard'", "'trigger'", "'is Initial'", "'is Active'", "'is Enabled'", "'is Fireable'"
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
    public String getGrammarFileName() { return "../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g"; }


     
     	private StateMachineDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(StateMachineDSLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleStateMachineBehavioralModel"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:60:1: entryRuleStateMachineBehavioralModel : ruleStateMachineBehavioralModel EOF ;
    public final void entryRuleStateMachineBehavioralModel() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:61:1: ( ruleStateMachineBehavioralModel EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:62:1: ruleStateMachineBehavioralModel EOF
            {
             before(grammarAccess.getStateMachineBehavioralModelRule()); 
            pushFollow(FOLLOW_ruleStateMachineBehavioralModel_in_entryRuleStateMachineBehavioralModel61);
            ruleStateMachineBehavioralModel();

            state._fsp--;

             after(grammarAccess.getStateMachineBehavioralModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateMachineBehavioralModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateMachineBehavioralModel"


    // $ANTLR start "ruleStateMachineBehavioralModel"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:69:1: ruleStateMachineBehavioralModel : ( ( rule__StateMachineBehavioralModel__Group__0 ) ) ;
    public final void ruleStateMachineBehavioralModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:73:2: ( ( ( rule__StateMachineBehavioralModel__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:74:1: ( ( rule__StateMachineBehavioralModel__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:74:1: ( ( rule__StateMachineBehavioralModel__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:75:1: ( rule__StateMachineBehavioralModel__Group__0 )
            {
             before(grammarAccess.getStateMachineBehavioralModelAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:76:1: ( rule__StateMachineBehavioralModel__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:76:2: rule__StateMachineBehavioralModel__Group__0
            {
            pushFollow(FOLLOW_rule__StateMachineBehavioralModel__Group__0_in_ruleStateMachineBehavioralModel94);
            rule__StateMachineBehavioralModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineBehavioralModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachineBehavioralModel"


    // $ANTLR start "entryRuleInclude"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:88:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:89:1: ( ruleInclude EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:90:1: ruleInclude EOF
            {
             before(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_ruleInclude_in_entryRuleInclude121);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getIncludeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInclude128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:97:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:101:2: ( ( ( rule__Include__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:102:1: ( ( rule__Include__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:102:1: ( ( rule__Include__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:103:1: ( rule__Include__Group__0 )
            {
             before(grammarAccess.getIncludeAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:104:1: ( rule__Include__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:104:2: rule__Include__Group__0
            {
            pushFollow(FOLLOW_rule__Include__Group__0_in_ruleInclude154);
            rule__Include__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInclude"


    // $ANTLR start "entryRuleStateMachine"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:116:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:117:1: ( ruleStateMachine EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:118:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_ruleStateMachine_in_entryRuleStateMachine181);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStateMachine188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:125:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:129:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:130:1: ( ( rule__StateMachine__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:130:1: ( ( rule__StateMachine__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:131:1: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:132:1: ( rule__StateMachine__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:132:2: rule__StateMachine__Group__0
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine214);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleEString"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:145:1: ( ruleEString EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:146:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString241);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:153:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:157:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:158:1: ( ( rule__EString__Alternatives ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:158:1: ( ( rule__EString__Alternatives ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:159:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:160:1: ( rule__EString__Alternatives )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:160:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString274);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAction"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:172:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:173:1: ( ruleAction EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:174:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction301);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:181:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:185:2: ( ( ( rule__Action__Alternatives ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:186:1: ( ( rule__Action__Alternatives ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:186:1: ( ( rule__Action__Alternatives ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:187:1: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:188:1: ( rule__Action__Alternatives )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:188:2: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_rule__Action__Alternatives_in_ruleAction334);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleActionExpression_Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:200:1: entryRuleActionExpression_Impl : ruleActionExpression_Impl EOF ;
    public final void entryRuleActionExpression_Impl() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:201:1: ( ruleActionExpression_Impl EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:202:1: ruleActionExpression_Impl EOF
            {
             before(grammarAccess.getActionExpression_ImplRule()); 
            pushFollow(FOLLOW_ruleActionExpression_Impl_in_entryRuleActionExpression_Impl361);
            ruleActionExpression_Impl();

            state._fsp--;

             after(grammarAccess.getActionExpression_ImplRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActionExpression_Impl368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionExpression_Impl"


    // $ANTLR start "ruleActionExpression_Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:209:1: ruleActionExpression_Impl : ( ( rule__ActionExpression_Impl__Group__0 ) ) ;
    public final void ruleActionExpression_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:213:2: ( ( ( rule__ActionExpression_Impl__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:214:1: ( ( rule__ActionExpression_Impl__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:214:1: ( ( rule__ActionExpression_Impl__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:215:1: ( rule__ActionExpression_Impl__Group__0 )
            {
             before(grammarAccess.getActionExpression_ImplAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:216:1: ( rule__ActionExpression_Impl__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:216:2: rule__ActionExpression_Impl__Group__0
            {
            pushFollow(FOLLOW_rule__ActionExpression_Impl__Group__0_in_ruleActionExpression_Impl394);
            rule__ActionExpression_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionExpression_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionExpression_Impl"


    // $ANTLR start "entryRuleChangeTrainCurrentTrackElement"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:228:1: entryRuleChangeTrainCurrentTrackElement : ruleChangeTrainCurrentTrackElement EOF ;
    public final void entryRuleChangeTrainCurrentTrackElement() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:229:1: ( ruleChangeTrainCurrentTrackElement EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:230:1: ruleChangeTrainCurrentTrackElement EOF
            {
             before(grammarAccess.getChangeTrainCurrentTrackElementRule()); 
            pushFollow(FOLLOW_ruleChangeTrainCurrentTrackElement_in_entryRuleChangeTrainCurrentTrackElement421);
            ruleChangeTrainCurrentTrackElement();

            state._fsp--;

             after(grammarAccess.getChangeTrainCurrentTrackElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeTrainCurrentTrackElement428); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChangeTrainCurrentTrackElement"


    // $ANTLR start "ruleChangeTrainCurrentTrackElement"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:237:1: ruleChangeTrainCurrentTrackElement : ( ( rule__ChangeTrainCurrentTrackElement__Group__0 ) ) ;
    public final void ruleChangeTrainCurrentTrackElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:241:2: ( ( ( rule__ChangeTrainCurrentTrackElement__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:242:1: ( ( rule__ChangeTrainCurrentTrackElement__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:242:1: ( ( rule__ChangeTrainCurrentTrackElement__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:243:1: ( rule__ChangeTrainCurrentTrackElement__Group__0 )
            {
             before(grammarAccess.getChangeTrainCurrentTrackElementAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:244:1: ( rule__ChangeTrainCurrentTrackElement__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:244:2: rule__ChangeTrainCurrentTrackElement__Group__0
            {
            pushFollow(FOLLOW_rule__ChangeTrainCurrentTrackElement__Group__0_in_ruleChangeTrainCurrentTrackElement454);
            rule__ChangeTrainCurrentTrackElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeTrainCurrentTrackElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChangeTrainCurrentTrackElement"


    // $ANTLR start "entryRuleChangeTurnoutDirection"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:256:1: entryRuleChangeTurnoutDirection : ruleChangeTurnoutDirection EOF ;
    public final void entryRuleChangeTurnoutDirection() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:257:1: ( ruleChangeTurnoutDirection EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:258:1: ruleChangeTurnoutDirection EOF
            {
             before(grammarAccess.getChangeTurnoutDirectionRule()); 
            pushFollow(FOLLOW_ruleChangeTurnoutDirection_in_entryRuleChangeTurnoutDirection481);
            ruleChangeTurnoutDirection();

            state._fsp--;

             after(grammarAccess.getChangeTurnoutDirectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeTurnoutDirection488); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChangeTurnoutDirection"


    // $ANTLR start "ruleChangeTurnoutDirection"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:265:1: ruleChangeTurnoutDirection : ( ( rule__ChangeTurnoutDirection__Group__0 ) ) ;
    public final void ruleChangeTurnoutDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:269:2: ( ( ( rule__ChangeTurnoutDirection__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:270:1: ( ( rule__ChangeTurnoutDirection__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:270:1: ( ( rule__ChangeTurnoutDirection__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:271:1: ( rule__ChangeTurnoutDirection__Group__0 )
            {
             before(grammarAccess.getChangeTurnoutDirectionAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:272:1: ( rule__ChangeTurnoutDirection__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:272:2: rule__ChangeTurnoutDirection__Group__0
            {
            pushFollow(FOLLOW_rule__ChangeTurnoutDirection__Group__0_in_ruleChangeTurnoutDirection514);
            rule__ChangeTurnoutDirection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeTurnoutDirectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChangeTurnoutDirection"


    // $ANTLR start "entryRuleChangeSignalAllowedSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:284:1: entryRuleChangeSignalAllowedSpeed : ruleChangeSignalAllowedSpeed EOF ;
    public final void entryRuleChangeSignalAllowedSpeed() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:285:1: ( ruleChangeSignalAllowedSpeed EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:286:1: ruleChangeSignalAllowedSpeed EOF
            {
             before(grammarAccess.getChangeSignalAllowedSpeedRule()); 
            pushFollow(FOLLOW_ruleChangeSignalAllowedSpeed_in_entryRuleChangeSignalAllowedSpeed541);
            ruleChangeSignalAllowedSpeed();

            state._fsp--;

             after(grammarAccess.getChangeSignalAllowedSpeedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeSignalAllowedSpeed548); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChangeSignalAllowedSpeed"


    // $ANTLR start "ruleChangeSignalAllowedSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:293:1: ruleChangeSignalAllowedSpeed : ( ( rule__ChangeSignalAllowedSpeed__Group__0 ) ) ;
    public final void ruleChangeSignalAllowedSpeed() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:297:2: ( ( ( rule__ChangeSignalAllowedSpeed__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:298:1: ( ( rule__ChangeSignalAllowedSpeed__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:298:1: ( ( rule__ChangeSignalAllowedSpeed__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:299:1: ( rule__ChangeSignalAllowedSpeed__Group__0 )
            {
             before(grammarAccess.getChangeSignalAllowedSpeedAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:300:1: ( rule__ChangeSignalAllowedSpeed__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:300:2: rule__ChangeSignalAllowedSpeed__Group__0
            {
            pushFollow(FOLLOW_rule__ChangeSignalAllowedSpeed__Group__0_in_ruleChangeSignalAllowedSpeed574);
            rule__ChangeSignalAllowedSpeed__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeSignalAllowedSpeedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChangeSignalAllowedSpeed"


    // $ANTLR start "entryRuleChangeTrainHeadingSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:312:1: entryRuleChangeTrainHeadingSpeed : ruleChangeTrainHeadingSpeed EOF ;
    public final void entryRuleChangeTrainHeadingSpeed() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:313:1: ( ruleChangeTrainHeadingSpeed EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:314:1: ruleChangeTrainHeadingSpeed EOF
            {
             before(grammarAccess.getChangeTrainHeadingSpeedRule()); 
            pushFollow(FOLLOW_ruleChangeTrainHeadingSpeed_in_entryRuleChangeTrainHeadingSpeed601);
            ruleChangeTrainHeadingSpeed();

            state._fsp--;

             after(grammarAccess.getChangeTrainHeadingSpeedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleChangeTrainHeadingSpeed608); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChangeTrainHeadingSpeed"


    // $ANTLR start "ruleChangeTrainHeadingSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:321:1: ruleChangeTrainHeadingSpeed : ( ( rule__ChangeTrainHeadingSpeed__Group__0 ) ) ;
    public final void ruleChangeTrainHeadingSpeed() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:325:2: ( ( ( rule__ChangeTrainHeadingSpeed__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:326:1: ( ( rule__ChangeTrainHeadingSpeed__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:326:1: ( ( rule__ChangeTrainHeadingSpeed__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:327:1: ( rule__ChangeTrainHeadingSpeed__Group__0 )
            {
             before(grammarAccess.getChangeTrainHeadingSpeedAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:328:1: ( rule__ChangeTrainHeadingSpeed__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:328:2: rule__ChangeTrainHeadingSpeed__Group__0
            {
            pushFollow(FOLLOW_rule__ChangeTrainHeadingSpeed__Group__0_in_ruleChangeTrainHeadingSpeed634);
            rule__ChangeTrainHeadingSpeed__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChangeTrainHeadingSpeedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChangeTrainHeadingSpeed"


    // $ANTLR start "entryRuleTrigger"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:340:1: entryRuleTrigger : ruleTrigger EOF ;
    public final void entryRuleTrigger() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:341:1: ( ruleTrigger EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:342:1: ruleTrigger EOF
            {
             before(grammarAccess.getTriggerRule()); 
            pushFollow(FOLLOW_ruleTrigger_in_entryRuleTrigger661);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getTriggerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrigger668); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrigger"


    // $ANTLR start "ruleTrigger"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:349:1: ruleTrigger : ( ( rule__Trigger__Alternatives ) ) ;
    public final void ruleTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:353:2: ( ( ( rule__Trigger__Alternatives ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:354:1: ( ( rule__Trigger__Alternatives ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:354:1: ( ( rule__Trigger__Alternatives ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:355:1: ( rule__Trigger__Alternatives )
            {
             before(grammarAccess.getTriggerAccess().getAlternatives()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:356:1: ( rule__Trigger__Alternatives )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:356:2: rule__Trigger__Alternatives
            {
            pushFollow(FOLLOW_rule__Trigger__Alternatives_in_ruleTrigger694);
            rule__Trigger__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTriggerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrigger"


    // $ANTLR start "entryRuleTrainHeadingSpeedChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:368:1: entryRuleTrainHeadingSpeedChanged : ruleTrainHeadingSpeedChanged EOF ;
    public final void entryRuleTrainHeadingSpeedChanged() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:369:1: ( ruleTrainHeadingSpeedChanged EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:370:1: ruleTrainHeadingSpeedChanged EOF
            {
             before(grammarAccess.getTrainHeadingSpeedChangedRule()); 
            pushFollow(FOLLOW_ruleTrainHeadingSpeedChanged_in_entryRuleTrainHeadingSpeedChanged721);
            ruleTrainHeadingSpeedChanged();

            state._fsp--;

             after(grammarAccess.getTrainHeadingSpeedChangedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrainHeadingSpeedChanged728); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrainHeadingSpeedChanged"


    // $ANTLR start "ruleTrainHeadingSpeedChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:377:1: ruleTrainHeadingSpeedChanged : ( ( rule__TrainHeadingSpeedChanged__Group__0 ) ) ;
    public final void ruleTrainHeadingSpeedChanged() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:381:2: ( ( ( rule__TrainHeadingSpeedChanged__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:382:1: ( ( rule__TrainHeadingSpeedChanged__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:382:1: ( ( rule__TrainHeadingSpeedChanged__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:383:1: ( rule__TrainHeadingSpeedChanged__Group__0 )
            {
             before(grammarAccess.getTrainHeadingSpeedChangedAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:384:1: ( rule__TrainHeadingSpeedChanged__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:384:2: rule__TrainHeadingSpeedChanged__Group__0
            {
            pushFollow(FOLLOW_rule__TrainHeadingSpeedChanged__Group__0_in_ruleTrainHeadingSpeedChanged754);
            rule__TrainHeadingSpeedChanged__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainHeadingSpeedChangedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainHeadingSpeedChanged"


    // $ANTLR start "entryRuleTrainTrackElementChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:396:1: entryRuleTrainTrackElementChanged : ruleTrainTrackElementChanged EOF ;
    public final void entryRuleTrainTrackElementChanged() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:397:1: ( ruleTrainTrackElementChanged EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:398:1: ruleTrainTrackElementChanged EOF
            {
             before(grammarAccess.getTrainTrackElementChangedRule()); 
            pushFollow(FOLLOW_ruleTrainTrackElementChanged_in_entryRuleTrainTrackElementChanged781);
            ruleTrainTrackElementChanged();

            state._fsp--;

             after(grammarAccess.getTrainTrackElementChangedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrainTrackElementChanged788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrainTrackElementChanged"


    // $ANTLR start "ruleTrainTrackElementChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:405:1: ruleTrainTrackElementChanged : ( ( rule__TrainTrackElementChanged__Group__0 ) ) ;
    public final void ruleTrainTrackElementChanged() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:409:2: ( ( ( rule__TrainTrackElementChanged__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:410:1: ( ( rule__TrainTrackElementChanged__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:410:1: ( ( rule__TrainTrackElementChanged__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:411:1: ( rule__TrainTrackElementChanged__Group__0 )
            {
             before(grammarAccess.getTrainTrackElementChangedAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:412:1: ( rule__TrainTrackElementChanged__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:412:2: rule__TrainTrackElementChanged__Group__0
            {
            pushFollow(FOLLOW_rule__TrainTrackElementChanged__Group__0_in_ruleTrainTrackElementChanged814);
            rule__TrainTrackElementChanged__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainTrackElementChangedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainTrackElementChanged"


    // $ANTLR start "entryRuleSignalAllowedSpeedChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:424:1: entryRuleSignalAllowedSpeedChanged : ruleSignalAllowedSpeedChanged EOF ;
    public final void entryRuleSignalAllowedSpeedChanged() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:425:1: ( ruleSignalAllowedSpeedChanged EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:426:1: ruleSignalAllowedSpeedChanged EOF
            {
             before(grammarAccess.getSignalAllowedSpeedChangedRule()); 
            pushFollow(FOLLOW_ruleSignalAllowedSpeedChanged_in_entryRuleSignalAllowedSpeedChanged841);
            ruleSignalAllowedSpeedChanged();

            state._fsp--;

             after(grammarAccess.getSignalAllowedSpeedChangedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalAllowedSpeedChanged848); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignalAllowedSpeedChanged"


    // $ANTLR start "ruleSignalAllowedSpeedChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:433:1: ruleSignalAllowedSpeedChanged : ( ( rule__SignalAllowedSpeedChanged__Group__0 ) ) ;
    public final void ruleSignalAllowedSpeedChanged() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:437:2: ( ( ( rule__SignalAllowedSpeedChanged__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:438:1: ( ( rule__SignalAllowedSpeedChanged__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:438:1: ( ( rule__SignalAllowedSpeedChanged__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:439:1: ( rule__SignalAllowedSpeedChanged__Group__0 )
            {
             before(grammarAccess.getSignalAllowedSpeedChangedAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:440:1: ( rule__SignalAllowedSpeedChanged__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:440:2: rule__SignalAllowedSpeedChanged__Group__0
            {
            pushFollow(FOLLOW_rule__SignalAllowedSpeedChanged__Group__0_in_ruleSignalAllowedSpeedChanged874);
            rule__SignalAllowedSpeedChanged__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignalAllowedSpeedChangedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignalAllowedSpeedChanged"


    // $ANTLR start "entryRuleTurnoutDirectionChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:452:1: entryRuleTurnoutDirectionChanged : ruleTurnoutDirectionChanged EOF ;
    public final void entryRuleTurnoutDirectionChanged() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:453:1: ( ruleTurnoutDirectionChanged EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:454:1: ruleTurnoutDirectionChanged EOF
            {
             before(grammarAccess.getTurnoutDirectionChangedRule()); 
            pushFollow(FOLLOW_ruleTurnoutDirectionChanged_in_entryRuleTurnoutDirectionChanged901);
            ruleTurnoutDirectionChanged();

            state._fsp--;

             after(grammarAccess.getTurnoutDirectionChangedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnoutDirectionChanged908); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnoutDirectionChanged"


    // $ANTLR start "ruleTurnoutDirectionChanged"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:461:1: ruleTurnoutDirectionChanged : ( ( rule__TurnoutDirectionChanged__Group__0 ) ) ;
    public final void ruleTurnoutDirectionChanged() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:465:2: ( ( ( rule__TurnoutDirectionChanged__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:466:1: ( ( rule__TurnoutDirectionChanged__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:466:1: ( ( rule__TurnoutDirectionChanged__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:467:1: ( rule__TurnoutDirectionChanged__Group__0 )
            {
             before(grammarAccess.getTurnoutDirectionChangedAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:468:1: ( rule__TurnoutDirectionChanged__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:468:2: rule__TurnoutDirectionChanged__Group__0
            {
            pushFollow(FOLLOW_rule__TurnoutDirectionChanged__Group__0_in_ruleTurnoutDirectionChanged934);
            rule__TurnoutDirectionChanged__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutDirectionChangedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnoutDirectionChanged"


    // $ANTLR start "entryRuleTriggerExpression_Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:480:1: entryRuleTriggerExpression_Impl : ruleTriggerExpression_Impl EOF ;
    public final void entryRuleTriggerExpression_Impl() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:481:1: ( ruleTriggerExpression_Impl EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:482:1: ruleTriggerExpression_Impl EOF
            {
             before(grammarAccess.getTriggerExpression_ImplRule()); 
            pushFollow(FOLLOW_ruleTriggerExpression_Impl_in_entryRuleTriggerExpression_Impl961);
            ruleTriggerExpression_Impl();

            state._fsp--;

             after(grammarAccess.getTriggerExpression_ImplRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTriggerExpression_Impl968); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTriggerExpression_Impl"


    // $ANTLR start "ruleTriggerExpression_Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:489:1: ruleTriggerExpression_Impl : ( ( rule__TriggerExpression_Impl__Group__0 ) ) ;
    public final void ruleTriggerExpression_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:493:2: ( ( ( rule__TriggerExpression_Impl__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:494:1: ( ( rule__TriggerExpression_Impl__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:494:1: ( ( rule__TriggerExpression_Impl__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:495:1: ( rule__TriggerExpression_Impl__Group__0 )
            {
             before(grammarAccess.getTriggerExpression_ImplAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:496:1: ( rule__TriggerExpression_Impl__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:496:2: rule__TriggerExpression_Impl__Group__0
            {
            pushFollow(FOLLOW_rule__TriggerExpression_Impl__Group__0_in_ruleTriggerExpression_Impl994);
            rule__TriggerExpression_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerExpression_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTriggerExpression_Impl"


    // $ANTLR start "entryRuleGuard"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:508:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:509:1: ( ruleGuard EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:510:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_ruleGuard_in_entryRuleGuard1021);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getGuardRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuard1028); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:517:1: ruleGuard : ( ( rule__Guard__Alternatives ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:521:2: ( ( ( rule__Guard__Alternatives ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:522:1: ( ( rule__Guard__Alternatives ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:522:1: ( ( rule__Guard__Alternatives ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:523:1: ( rule__Guard__Alternatives )
            {
             before(grammarAccess.getGuardAccess().getAlternatives()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:524:1: ( rule__Guard__Alternatives )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:524:2: rule__Guard__Alternatives
            {
            pushFollow(FOLLOW_rule__Guard__Alternatives_in_ruleGuard1054);
            rule__Guard__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleTrainCurrentHeadingSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:536:1: entryRuleTrainCurrentHeadingSpeed : ruleTrainCurrentHeadingSpeed EOF ;
    public final void entryRuleTrainCurrentHeadingSpeed() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:537:1: ( ruleTrainCurrentHeadingSpeed EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:538:1: ruleTrainCurrentHeadingSpeed EOF
            {
             before(grammarAccess.getTrainCurrentHeadingSpeedRule()); 
            pushFollow(FOLLOW_ruleTrainCurrentHeadingSpeed_in_entryRuleTrainCurrentHeadingSpeed1081);
            ruleTrainCurrentHeadingSpeed();

            state._fsp--;

             after(grammarAccess.getTrainCurrentHeadingSpeedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrainCurrentHeadingSpeed1088); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrainCurrentHeadingSpeed"


    // $ANTLR start "ruleTrainCurrentHeadingSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:545:1: ruleTrainCurrentHeadingSpeed : ( ( rule__TrainCurrentHeadingSpeed__Group__0 ) ) ;
    public final void ruleTrainCurrentHeadingSpeed() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:549:2: ( ( ( rule__TrainCurrentHeadingSpeed__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:550:1: ( ( rule__TrainCurrentHeadingSpeed__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:550:1: ( ( rule__TrainCurrentHeadingSpeed__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:551:1: ( rule__TrainCurrentHeadingSpeed__Group__0 )
            {
             before(grammarAccess.getTrainCurrentHeadingSpeedAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:552:1: ( rule__TrainCurrentHeadingSpeed__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:552:2: rule__TrainCurrentHeadingSpeed__Group__0
            {
            pushFollow(FOLLOW_rule__TrainCurrentHeadingSpeed__Group__0_in_ruleTrainCurrentHeadingSpeed1114);
            rule__TrainCurrentHeadingSpeed__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainCurrentHeadingSpeedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainCurrentHeadingSpeed"


    // $ANTLR start "entryRuleTrainCurrentlyStandsOn"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:564:1: entryRuleTrainCurrentlyStandsOn : ruleTrainCurrentlyStandsOn EOF ;
    public final void entryRuleTrainCurrentlyStandsOn() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:565:1: ( ruleTrainCurrentlyStandsOn EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:566:1: ruleTrainCurrentlyStandsOn EOF
            {
             before(grammarAccess.getTrainCurrentlyStandsOnRule()); 
            pushFollow(FOLLOW_ruleTrainCurrentlyStandsOn_in_entryRuleTrainCurrentlyStandsOn1141);
            ruleTrainCurrentlyStandsOn();

            state._fsp--;

             after(grammarAccess.getTrainCurrentlyStandsOnRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrainCurrentlyStandsOn1148); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrainCurrentlyStandsOn"


    // $ANTLR start "ruleTrainCurrentlyStandsOn"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:573:1: ruleTrainCurrentlyStandsOn : ( ( rule__TrainCurrentlyStandsOn__Group__0 ) ) ;
    public final void ruleTrainCurrentlyStandsOn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:577:2: ( ( ( rule__TrainCurrentlyStandsOn__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:578:1: ( ( rule__TrainCurrentlyStandsOn__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:578:1: ( ( rule__TrainCurrentlyStandsOn__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:579:1: ( rule__TrainCurrentlyStandsOn__Group__0 )
            {
             before(grammarAccess.getTrainCurrentlyStandsOnAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:580:1: ( rule__TrainCurrentlyStandsOn__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:580:2: rule__TrainCurrentlyStandsOn__Group__0
            {
            pushFollow(FOLLOW_rule__TrainCurrentlyStandsOn__Group__0_in_ruleTrainCurrentlyStandsOn1174);
            rule__TrainCurrentlyStandsOn__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainCurrentlyStandsOnAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrainCurrentlyStandsOn"


    // $ANTLR start "entryRuleTurnoutCurrentDirection"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:592:1: entryRuleTurnoutCurrentDirection : ruleTurnoutCurrentDirection EOF ;
    public final void entryRuleTurnoutCurrentDirection() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:593:1: ( ruleTurnoutCurrentDirection EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:594:1: ruleTurnoutCurrentDirection EOF
            {
             before(grammarAccess.getTurnoutCurrentDirectionRule()); 
            pushFollow(FOLLOW_ruleTurnoutCurrentDirection_in_entryRuleTurnoutCurrentDirection1201);
            ruleTurnoutCurrentDirection();

            state._fsp--;

             after(grammarAccess.getTurnoutCurrentDirectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnoutCurrentDirection1208); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnoutCurrentDirection"


    // $ANTLR start "ruleTurnoutCurrentDirection"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:601:1: ruleTurnoutCurrentDirection : ( ( rule__TurnoutCurrentDirection__Group__0 ) ) ;
    public final void ruleTurnoutCurrentDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:605:2: ( ( ( rule__TurnoutCurrentDirection__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:606:1: ( ( rule__TurnoutCurrentDirection__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:606:1: ( ( rule__TurnoutCurrentDirection__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:607:1: ( rule__TurnoutCurrentDirection__Group__0 )
            {
             before(grammarAccess.getTurnoutCurrentDirectionAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:608:1: ( rule__TurnoutCurrentDirection__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:608:2: rule__TurnoutCurrentDirection__Group__0
            {
            pushFollow(FOLLOW_rule__TurnoutCurrentDirection__Group__0_in_ruleTurnoutCurrentDirection1234);
            rule__TurnoutCurrentDirection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutCurrentDirectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnoutCurrentDirection"


    // $ANTLR start "entryRuleSignalCurrentAllowedSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:620:1: entryRuleSignalCurrentAllowedSpeed : ruleSignalCurrentAllowedSpeed EOF ;
    public final void entryRuleSignalCurrentAllowedSpeed() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:621:1: ( ruleSignalCurrentAllowedSpeed EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:622:1: ruleSignalCurrentAllowedSpeed EOF
            {
             before(grammarAccess.getSignalCurrentAllowedSpeedRule()); 
            pushFollow(FOLLOW_ruleSignalCurrentAllowedSpeed_in_entryRuleSignalCurrentAllowedSpeed1261);
            ruleSignalCurrentAllowedSpeed();

            state._fsp--;

             after(grammarAccess.getSignalCurrentAllowedSpeedRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignalCurrentAllowedSpeed1268); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSignalCurrentAllowedSpeed"


    // $ANTLR start "ruleSignalCurrentAllowedSpeed"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:629:1: ruleSignalCurrentAllowedSpeed : ( ( rule__SignalCurrentAllowedSpeed__Group__0 ) ) ;
    public final void ruleSignalCurrentAllowedSpeed() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:633:2: ( ( ( rule__SignalCurrentAllowedSpeed__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:634:1: ( ( rule__SignalCurrentAllowedSpeed__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:634:1: ( ( rule__SignalCurrentAllowedSpeed__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:635:1: ( rule__SignalCurrentAllowedSpeed__Group__0 )
            {
             before(grammarAccess.getSignalCurrentAllowedSpeedAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:636:1: ( rule__SignalCurrentAllowedSpeed__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:636:2: rule__SignalCurrentAllowedSpeed__Group__0
            {
            pushFollow(FOLLOW_rule__SignalCurrentAllowedSpeed__Group__0_in_ruleSignalCurrentAllowedSpeed1294);
            rule__SignalCurrentAllowedSpeed__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignalCurrentAllowedSpeedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSignalCurrentAllowedSpeed"


    // $ANTLR start "entryRuleNextTrackElementIs"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:648:1: entryRuleNextTrackElementIs : ruleNextTrackElementIs EOF ;
    public final void entryRuleNextTrackElementIs() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:649:1: ( ruleNextTrackElementIs EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:650:1: ruleNextTrackElementIs EOF
            {
             before(grammarAccess.getNextTrackElementIsRule()); 
            pushFollow(FOLLOW_ruleNextTrackElementIs_in_entryRuleNextTrackElementIs1321);
            ruleNextTrackElementIs();

            state._fsp--;

             after(grammarAccess.getNextTrackElementIsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNextTrackElementIs1328); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNextTrackElementIs"


    // $ANTLR start "ruleNextTrackElementIs"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:657:1: ruleNextTrackElementIs : ( ( rule__NextTrackElementIs__Group__0 ) ) ;
    public final void ruleNextTrackElementIs() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:661:2: ( ( ( rule__NextTrackElementIs__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:662:1: ( ( rule__NextTrackElementIs__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:662:1: ( ( rule__NextTrackElementIs__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:663:1: ( rule__NextTrackElementIs__Group__0 )
            {
             before(grammarAccess.getNextTrackElementIsAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:664:1: ( rule__NextTrackElementIs__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:664:2: rule__NextTrackElementIs__Group__0
            {
            pushFollow(FOLLOW_rule__NextTrackElementIs__Group__0_in_ruleNextTrackElementIs1354);
            rule__NextTrackElementIs__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNextTrackElementIsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNextTrackElementIs"


    // $ANTLR start "entryRuleTurnoutHasDesiredDirection"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:676:1: entryRuleTurnoutHasDesiredDirection : ruleTurnoutHasDesiredDirection EOF ;
    public final void entryRuleTurnoutHasDesiredDirection() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:677:1: ( ruleTurnoutHasDesiredDirection EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:678:1: ruleTurnoutHasDesiredDirection EOF
            {
             before(grammarAccess.getTurnoutHasDesiredDirectionRule()); 
            pushFollow(FOLLOW_ruleTurnoutHasDesiredDirection_in_entryRuleTurnoutHasDesiredDirection1381);
            ruleTurnoutHasDesiredDirection();

            state._fsp--;

             after(grammarAccess.getTurnoutHasDesiredDirectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnoutHasDesiredDirection1388); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTurnoutHasDesiredDirection"


    // $ANTLR start "ruleTurnoutHasDesiredDirection"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:685:1: ruleTurnoutHasDesiredDirection : ( ( rule__TurnoutHasDesiredDirection__Group__0 ) ) ;
    public final void ruleTurnoutHasDesiredDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:689:2: ( ( ( rule__TurnoutHasDesiredDirection__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:690:1: ( ( rule__TurnoutHasDesiredDirection__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:690:1: ( ( rule__TurnoutHasDesiredDirection__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:691:1: ( rule__TurnoutHasDesiredDirection__Group__0 )
            {
             before(grammarAccess.getTurnoutHasDesiredDirectionAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:692:1: ( rule__TurnoutHasDesiredDirection__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:692:2: rule__TurnoutHasDesiredDirection__Group__0
            {
            pushFollow(FOLLOW_rule__TurnoutHasDesiredDirection__Group__0_in_ruleTurnoutHasDesiredDirection1414);
            rule__TurnoutHasDesiredDirection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutHasDesiredDirectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTurnoutHasDesiredDirection"


    // $ANTLR start "entryRuleGuardExpression_Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:704:1: entryRuleGuardExpression_Impl : ruleGuardExpression_Impl EOF ;
    public final void entryRuleGuardExpression_Impl() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:705:1: ( ruleGuardExpression_Impl EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:706:1: ruleGuardExpression_Impl EOF
            {
             before(grammarAccess.getGuardExpression_ImplRule()); 
            pushFollow(FOLLOW_ruleGuardExpression_Impl_in_entryRuleGuardExpression_Impl1441);
            ruleGuardExpression_Impl();

            state._fsp--;

             after(grammarAccess.getGuardExpression_ImplRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGuardExpression_Impl1448); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuardExpression_Impl"


    // $ANTLR start "ruleGuardExpression_Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:713:1: ruleGuardExpression_Impl : ( ( rule__GuardExpression_Impl__Group__0 ) ) ;
    public final void ruleGuardExpression_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:717:2: ( ( ( rule__GuardExpression_Impl__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:718:1: ( ( rule__GuardExpression_Impl__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:718:1: ( ( rule__GuardExpression_Impl__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:719:1: ( rule__GuardExpression_Impl__Group__0 )
            {
             before(grammarAccess.getGuardExpression_ImplAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:720:1: ( rule__GuardExpression_Impl__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:720:2: rule__GuardExpression_Impl__Group__0
            {
            pushFollow(FOLLOW_rule__GuardExpression_Impl__Group__0_in_ruleGuardExpression_Impl1474);
            rule__GuardExpression_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuardExpression_ImplAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuardExpression_Impl"


    // $ANTLR start "entryRuleState"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:732:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:733:1: ( ruleState EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:734:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_ruleState_in_entryRuleState1501);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleState1508); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:741:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:745:2: ( ( ( rule__State__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:746:1: ( ( rule__State__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:746:1: ( ( rule__State__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:747:1: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:748:1: ( rule__State__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:748:2: rule__State__Group__0
            {
            pushFollow(FOLLOW_rule__State__Group__0_in_ruleState1534);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransition"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:760:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:761:1: ( ruleTransition EOF )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:762:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition1561);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition1568); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:769:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:773:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:774:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:774:1: ( ( rule__Transition__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:775:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:776:1: ( rule__Transition__Group__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:776:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition1594);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "rule__EString__Alternatives"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:788:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:792:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:793:1: ( RULE_STRING )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:793:1: ( RULE_STRING )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:794:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives1630); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:799:6: ( RULE_ID )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:799:6: ( RULE_ID )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:800:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives1647); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:810:1: rule__Action__Alternatives : ( ( ruleChangeTrainHeadingSpeed ) | ( ruleChangeSignalAllowedSpeed ) | ( ruleChangeTurnoutDirection ) | ( ruleChangeTrainCurrentTrackElement ) | ( ruleActionExpression_Impl ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:814:1: ( ( ruleChangeTrainHeadingSpeed ) | ( ruleChangeSignalAllowedSpeed ) | ( ruleChangeTurnoutDirection ) | ( ruleChangeTrainCurrentTrackElement ) | ( ruleActionExpression_Impl ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt2=1;
                }
                break;
            case 29:
                {
                alt2=2;
                }
                break;
            case 28:
                {
                alt2=3;
                }
                break;
            case 27:
                {
                alt2=4;
                }
                break;
            case 26:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:815:1: ( ruleChangeTrainHeadingSpeed )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:815:1: ( ruleChangeTrainHeadingSpeed )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:816:1: ruleChangeTrainHeadingSpeed
                    {
                     before(grammarAccess.getActionAccess().getChangeTrainHeadingSpeedParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleChangeTrainHeadingSpeed_in_rule__Action__Alternatives1679);
                    ruleChangeTrainHeadingSpeed();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getChangeTrainHeadingSpeedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:821:6: ( ruleChangeSignalAllowedSpeed )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:821:6: ( ruleChangeSignalAllowedSpeed )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:822:1: ruleChangeSignalAllowedSpeed
                    {
                     before(grammarAccess.getActionAccess().getChangeSignalAllowedSpeedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleChangeSignalAllowedSpeed_in_rule__Action__Alternatives1696);
                    ruleChangeSignalAllowedSpeed();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getChangeSignalAllowedSpeedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:827:6: ( ruleChangeTurnoutDirection )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:827:6: ( ruleChangeTurnoutDirection )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:828:1: ruleChangeTurnoutDirection
                    {
                     before(grammarAccess.getActionAccess().getChangeTurnoutDirectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleChangeTurnoutDirection_in_rule__Action__Alternatives1713);
                    ruleChangeTurnoutDirection();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getChangeTurnoutDirectionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:833:6: ( ruleChangeTrainCurrentTrackElement )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:833:6: ( ruleChangeTrainCurrentTrackElement )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:834:1: ruleChangeTrainCurrentTrackElement
                    {
                     before(grammarAccess.getActionAccess().getChangeTrainCurrentTrackElementParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleChangeTrainCurrentTrackElement_in_rule__Action__Alternatives1730);
                    ruleChangeTrainCurrentTrackElement();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getChangeTrainCurrentTrackElementParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:839:6: ( ruleActionExpression_Impl )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:839:6: ( ruleActionExpression_Impl )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:840:1: ruleActionExpression_Impl
                    {
                     before(grammarAccess.getActionAccess().getActionExpression_ImplParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleActionExpression_Impl_in_rule__Action__Alternatives1747);
                    ruleActionExpression_Impl();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getActionExpression_ImplParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__Trigger__Alternatives"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:850:1: rule__Trigger__Alternatives : ( ( ruleTrainHeadingSpeedChanged ) | ( ruleTrainTrackElementChanged ) | ( ruleSignalAllowedSpeedChanged ) | ( ruleTurnoutDirectionChanged ) | ( ruleTriggerExpression_Impl ) );
    public final void rule__Trigger__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:854:1: ( ( ruleTrainHeadingSpeedChanged ) | ( ruleTrainTrackElementChanged ) | ( ruleSignalAllowedSpeedChanged ) | ( ruleTurnoutDirectionChanged ) | ( ruleTriggerExpression_Impl ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            case 34:
                {
                alt3=4;
                }
                break;
            case 35:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:855:1: ( ruleTrainHeadingSpeedChanged )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:855:1: ( ruleTrainHeadingSpeedChanged )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:856:1: ruleTrainHeadingSpeedChanged
                    {
                     before(grammarAccess.getTriggerAccess().getTrainHeadingSpeedChangedParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTrainHeadingSpeedChanged_in_rule__Trigger__Alternatives1779);
                    ruleTrainHeadingSpeedChanged();

                    state._fsp--;

                     after(grammarAccess.getTriggerAccess().getTrainHeadingSpeedChangedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:861:6: ( ruleTrainTrackElementChanged )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:861:6: ( ruleTrainTrackElementChanged )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:862:1: ruleTrainTrackElementChanged
                    {
                     before(grammarAccess.getTriggerAccess().getTrainTrackElementChangedParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTrainTrackElementChanged_in_rule__Trigger__Alternatives1796);
                    ruleTrainTrackElementChanged();

                    state._fsp--;

                     after(grammarAccess.getTriggerAccess().getTrainTrackElementChangedParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:867:6: ( ruleSignalAllowedSpeedChanged )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:867:6: ( ruleSignalAllowedSpeedChanged )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:868:1: ruleSignalAllowedSpeedChanged
                    {
                     before(grammarAccess.getTriggerAccess().getSignalAllowedSpeedChangedParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSignalAllowedSpeedChanged_in_rule__Trigger__Alternatives1813);
                    ruleSignalAllowedSpeedChanged();

                    state._fsp--;

                     after(grammarAccess.getTriggerAccess().getSignalAllowedSpeedChangedParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:873:6: ( ruleTurnoutDirectionChanged )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:873:6: ( ruleTurnoutDirectionChanged )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:874:1: ruleTurnoutDirectionChanged
                    {
                     before(grammarAccess.getTriggerAccess().getTurnoutDirectionChangedParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTurnoutDirectionChanged_in_rule__Trigger__Alternatives1830);
                    ruleTurnoutDirectionChanged();

                    state._fsp--;

                     after(grammarAccess.getTriggerAccess().getTurnoutDirectionChangedParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:879:6: ( ruleTriggerExpression_Impl )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:879:6: ( ruleTriggerExpression_Impl )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:880:1: ruleTriggerExpression_Impl
                    {
                     before(grammarAccess.getTriggerAccess().getTriggerExpression_ImplParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleTriggerExpression_Impl_in_rule__Trigger__Alternatives1847);
                    ruleTriggerExpression_Impl();

                    state._fsp--;

                     after(grammarAccess.getTriggerAccess().getTriggerExpression_ImplParserRuleCall_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigger__Alternatives"


    // $ANTLR start "rule__Guard__Alternatives"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:890:1: rule__Guard__Alternatives : ( ( ruleTrainCurrentHeadingSpeed ) | ( ruleTrainCurrentlyStandsOn ) | ( ruleTurnoutCurrentDirection ) | ( ruleSignalCurrentAllowedSpeed ) | ( ruleNextTrackElementIs ) | ( ruleTurnoutHasDesiredDirection ) | ( ruleGuardExpression_Impl ) );
    public final void rule__Guard__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:894:1: ( ( ruleTrainCurrentHeadingSpeed ) | ( ruleTrainCurrentlyStandsOn ) | ( ruleTurnoutCurrentDirection ) | ( ruleSignalCurrentAllowedSpeed ) | ( ruleNextTrackElementIs ) | ( ruleTurnoutHasDesiredDirection ) | ( ruleGuardExpression_Impl ) )
            int alt4=7;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt4=1;
                }
                break;
            case 37:
                {
                alt4=2;
                }
                break;
            case 38:
                {
                alt4=3;
                }
                break;
            case 39:
                {
                alt4=4;
                }
                break;
            case 40:
                {
                alt4=5;
                }
                break;
            case 41:
                {
                alt4=6;
                }
                break;
            case 42:
                {
                alt4=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:895:1: ( ruleTrainCurrentHeadingSpeed )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:895:1: ( ruleTrainCurrentHeadingSpeed )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:896:1: ruleTrainCurrentHeadingSpeed
                    {
                     before(grammarAccess.getGuardAccess().getTrainCurrentHeadingSpeedParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTrainCurrentHeadingSpeed_in_rule__Guard__Alternatives1879);
                    ruleTrainCurrentHeadingSpeed();

                    state._fsp--;

                     after(grammarAccess.getGuardAccess().getTrainCurrentHeadingSpeedParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:901:6: ( ruleTrainCurrentlyStandsOn )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:901:6: ( ruleTrainCurrentlyStandsOn )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:902:1: ruleTrainCurrentlyStandsOn
                    {
                     before(grammarAccess.getGuardAccess().getTrainCurrentlyStandsOnParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTrainCurrentlyStandsOn_in_rule__Guard__Alternatives1896);
                    ruleTrainCurrentlyStandsOn();

                    state._fsp--;

                     after(grammarAccess.getGuardAccess().getTrainCurrentlyStandsOnParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:907:6: ( ruleTurnoutCurrentDirection )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:907:6: ( ruleTurnoutCurrentDirection )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:908:1: ruleTurnoutCurrentDirection
                    {
                     before(grammarAccess.getGuardAccess().getTurnoutCurrentDirectionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTurnoutCurrentDirection_in_rule__Guard__Alternatives1913);
                    ruleTurnoutCurrentDirection();

                    state._fsp--;

                     after(grammarAccess.getGuardAccess().getTurnoutCurrentDirectionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:913:6: ( ruleSignalCurrentAllowedSpeed )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:913:6: ( ruleSignalCurrentAllowedSpeed )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:914:1: ruleSignalCurrentAllowedSpeed
                    {
                     before(grammarAccess.getGuardAccess().getSignalCurrentAllowedSpeedParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleSignalCurrentAllowedSpeed_in_rule__Guard__Alternatives1930);
                    ruleSignalCurrentAllowedSpeed();

                    state._fsp--;

                     after(grammarAccess.getGuardAccess().getSignalCurrentAllowedSpeedParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:919:6: ( ruleNextTrackElementIs )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:919:6: ( ruleNextTrackElementIs )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:920:1: ruleNextTrackElementIs
                    {
                     before(grammarAccess.getGuardAccess().getNextTrackElementIsParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleNextTrackElementIs_in_rule__Guard__Alternatives1947);
                    ruleNextTrackElementIs();

                    state._fsp--;

                     after(grammarAccess.getGuardAccess().getNextTrackElementIsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:925:6: ( ruleTurnoutHasDesiredDirection )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:925:6: ( ruleTurnoutHasDesiredDirection )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:926:1: ruleTurnoutHasDesiredDirection
                    {
                     before(grammarAccess.getGuardAccess().getTurnoutHasDesiredDirectionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleTurnoutHasDesiredDirection_in_rule__Guard__Alternatives1964);
                    ruleTurnoutHasDesiredDirection();

                    state._fsp--;

                     after(grammarAccess.getGuardAccess().getTurnoutHasDesiredDirectionParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:931:6: ( ruleGuardExpression_Impl )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:931:6: ( ruleGuardExpression_Impl )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:932:1: ruleGuardExpression_Impl
                    {
                     before(grammarAccess.getGuardAccess().getGuardExpression_ImplParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleGuardExpression_Impl_in_rule__Guard__Alternatives1981);
                    ruleGuardExpression_Impl();

                    state._fsp--;

                     after(grammarAccess.getGuardAccess().getGuardExpression_ImplParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Alternatives"


    // $ANTLR start "rule__StateMachineBehavioralModel__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:944:1: rule__StateMachineBehavioralModel__Group__0 : rule__StateMachineBehavioralModel__Group__0__Impl rule__StateMachineBehavioralModel__Group__1 ;
    public final void rule__StateMachineBehavioralModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:948:1: ( rule__StateMachineBehavioralModel__Group__0__Impl rule__StateMachineBehavioralModel__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:949:2: rule__StateMachineBehavioralModel__Group__0__Impl rule__StateMachineBehavioralModel__Group__1
            {
            pushFollow(FOLLOW_rule__StateMachineBehavioralModel__Group__0__Impl_in_rule__StateMachineBehavioralModel__Group__02011);
            rule__StateMachineBehavioralModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachineBehavioralModel__Group__1_in_rule__StateMachineBehavioralModel__Group__02014);
            rule__StateMachineBehavioralModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachineBehavioralModel__Group__0"


    // $ANTLR start "rule__StateMachineBehavioralModel__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:956:1: rule__StateMachineBehavioralModel__Group__0__Impl : ( () ) ;
    public final void rule__StateMachineBehavioralModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:960:1: ( ( () ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:961:1: ( () )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:961:1: ( () )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:962:1: ()
            {
             before(grammarAccess.getStateMachineBehavioralModelAccess().getStateMachineBehavioralModelAction_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:963:1: ()
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:965:1: 
            {
            }

             after(grammarAccess.getStateMachineBehavioralModelAccess().getStateMachineBehavioralModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachineBehavioralModel__Group__0__Impl"


    // $ANTLR start "rule__StateMachineBehavioralModel__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:975:1: rule__StateMachineBehavioralModel__Group__1 : rule__StateMachineBehavioralModel__Group__1__Impl ;
    public final void rule__StateMachineBehavioralModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:979:1: ( rule__StateMachineBehavioralModel__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:980:2: rule__StateMachineBehavioralModel__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__StateMachineBehavioralModel__Group__1__Impl_in_rule__StateMachineBehavioralModel__Group__12072);
            rule__StateMachineBehavioralModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachineBehavioralModel__Group__1"


    // $ANTLR start "rule__StateMachineBehavioralModel__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:986:1: rule__StateMachineBehavioralModel__Group__1__Impl : ( ( rule__StateMachineBehavioralModel__Group_1__0 ) ) ;
    public final void rule__StateMachineBehavioralModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:990:1: ( ( ( rule__StateMachineBehavioralModel__Group_1__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:991:1: ( ( rule__StateMachineBehavioralModel__Group_1__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:991:1: ( ( rule__StateMachineBehavioralModel__Group_1__0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:992:1: ( rule__StateMachineBehavioralModel__Group_1__0 )
            {
             before(grammarAccess.getStateMachineBehavioralModelAccess().getGroup_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:993:1: ( rule__StateMachineBehavioralModel__Group_1__0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:993:2: rule__StateMachineBehavioralModel__Group_1__0
            {
            pushFollow(FOLLOW_rule__StateMachineBehavioralModel__Group_1__0_in_rule__StateMachineBehavioralModel__Group__1__Impl2099);
            rule__StateMachineBehavioralModel__Group_1__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineBehavioralModelAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachineBehavioralModel__Group__1__Impl"


    // $ANTLR start "rule__StateMachineBehavioralModel__Group_1__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1007:1: rule__StateMachineBehavioralModel__Group_1__0 : rule__StateMachineBehavioralModel__Group_1__0__Impl rule__StateMachineBehavioralModel__Group_1__1 ;
    public final void rule__StateMachineBehavioralModel__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1011:1: ( rule__StateMachineBehavioralModel__Group_1__0__Impl rule__StateMachineBehavioralModel__Group_1__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1012:2: rule__StateMachineBehavioralModel__Group_1__0__Impl rule__StateMachineBehavioralModel__Group_1__1
            {
            pushFollow(FOLLOW_rule__StateMachineBehavioralModel__Group_1__0__Impl_in_rule__StateMachineBehavioralModel__Group_1__02133);
            rule__StateMachineBehavioralModel__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachineBehavioralModel__Group_1__1_in_rule__StateMachineBehavioralModel__Group_1__02136);
            rule__StateMachineBehavioralModel__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachineBehavioralModel__Group_1__0"


    // $ANTLR start "rule__StateMachineBehavioralModel__Group_1__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1019:1: rule__StateMachineBehavioralModel__Group_1__0__Impl : ( ( rule__StateMachineBehavioralModel__IncludesAssignment_1_0 )* ) ;
    public final void rule__StateMachineBehavioralModel__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1023:1: ( ( ( rule__StateMachineBehavioralModel__IncludesAssignment_1_0 )* ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1024:1: ( ( rule__StateMachineBehavioralModel__IncludesAssignment_1_0 )* )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1024:1: ( ( rule__StateMachineBehavioralModel__IncludesAssignment_1_0 )* )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1025:1: ( rule__StateMachineBehavioralModel__IncludesAssignment_1_0 )*
            {
             before(grammarAccess.getStateMachineBehavioralModelAccess().getIncludesAssignment_1_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1026:1: ( rule__StateMachineBehavioralModel__IncludesAssignment_1_0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==11) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1026:2: rule__StateMachineBehavioralModel__IncludesAssignment_1_0
            	    {
            	    pushFollow(FOLLOW_rule__StateMachineBehavioralModel__IncludesAssignment_1_0_in_rule__StateMachineBehavioralModel__Group_1__0__Impl2163);
            	    rule__StateMachineBehavioralModel__IncludesAssignment_1_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getStateMachineBehavioralModelAccess().getIncludesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachineBehavioralModel__Group_1__0__Impl"


    // $ANTLR start "rule__StateMachineBehavioralModel__Group_1__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1036:1: rule__StateMachineBehavioralModel__Group_1__1 : rule__StateMachineBehavioralModel__Group_1__1__Impl rule__StateMachineBehavioralModel__Group_1__2 ;
    public final void rule__StateMachineBehavioralModel__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1040:1: ( rule__StateMachineBehavioralModel__Group_1__1__Impl rule__StateMachineBehavioralModel__Group_1__2 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1041:2: rule__StateMachineBehavioralModel__Group_1__1__Impl rule__StateMachineBehavioralModel__Group_1__2
            {
            pushFollow(FOLLOW_rule__StateMachineBehavioralModel__Group_1__1__Impl_in_rule__StateMachineBehavioralModel__Group_1__12194);
            rule__StateMachineBehavioralModel__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachineBehavioralModel__Group_1__2_in_rule__StateMachineBehavioralModel__Group_1__12197);
            rule__StateMachineBehavioralModel__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachineBehavioralModel__Group_1__1"


    // $ANTLR start "rule__StateMachineBehavioralModel__Group_1__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1048:1: rule__StateMachineBehavioralModel__Group_1__1__Impl : ( ( rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1 ) ) ;
    public final void rule__StateMachineBehavioralModel__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1052:1: ( ( ( rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1053:1: ( ( rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1053:1: ( ( rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1054:1: ( rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1 )
            {
             before(grammarAccess.getStateMachineBehavioralModelAccess().getStatemachinesAssignment_1_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1055:1: ( rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1055:2: rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1_in_rule__StateMachineBehavioralModel__Group_1__1__Impl2224);
            rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineBehavioralModelAccess().getStatemachinesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachineBehavioralModel__Group_1__1__Impl"


    // $ANTLR start "rule__StateMachineBehavioralModel__Group_1__2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1065:1: rule__StateMachineBehavioralModel__Group_1__2 : rule__StateMachineBehavioralModel__Group_1__2__Impl ;
    public final void rule__StateMachineBehavioralModel__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1069:1: ( rule__StateMachineBehavioralModel__Group_1__2__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1070:2: rule__StateMachineBehavioralModel__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__StateMachineBehavioralModel__Group_1__2__Impl_in_rule__StateMachineBehavioralModel__Group_1__22254);
            rule__StateMachineBehavioralModel__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachineBehavioralModel__Group_1__2"


    // $ANTLR start "rule__StateMachineBehavioralModel__Group_1__2__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1076:1: rule__StateMachineBehavioralModel__Group_1__2__Impl : ( ( rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2 )* ) ;
    public final void rule__StateMachineBehavioralModel__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1080:1: ( ( ( rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2 )* ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1081:1: ( ( rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2 )* )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1081:1: ( ( rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2 )* )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1082:1: ( rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2 )*
            {
             before(grammarAccess.getStateMachineBehavioralModelAccess().getStatemachinesAssignment_1_2()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1083:1: ( rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==12) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1083:2: rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2_in_rule__StateMachineBehavioralModel__Group_1__2__Impl2281);
            	    rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getStateMachineBehavioralModelAccess().getStatemachinesAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachineBehavioralModel__Group_1__2__Impl"


    // $ANTLR start "rule__Include__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1099:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1103:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1104:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__02318);
            rule__Include__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__02321);
            rule__Include__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0"


    // $ANTLR start "rule__Include__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1111:1: rule__Include__Group__0__Impl : ( 'include' ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1115:1: ( ( 'include' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1116:1: ( 'include' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1116:1: ( 'include' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1117:1: 'include'
            {
             before(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__Include__Group__0__Impl2349); 
             after(grammarAccess.getIncludeAccess().getIncludeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__0__Impl"


    // $ANTLR start "rule__Include__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1130:1: rule__Include__Group__1 : rule__Include__Group__1__Impl ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1134:1: ( rule__Include__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1135:2: rule__Include__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__12380);
            rule__Include__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1"


    // $ANTLR start "rule__Include__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1141:1: rule__Include__Group__1__Impl : ( ( rule__Include__FilenameAssignment_1 ) ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1145:1: ( ( ( rule__Include__FilenameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1146:1: ( ( rule__Include__FilenameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1146:1: ( ( rule__Include__FilenameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1147:1: ( rule__Include__FilenameAssignment_1 )
            {
             before(grammarAccess.getIncludeAccess().getFilenameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1148:1: ( rule__Include__FilenameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1148:2: rule__Include__FilenameAssignment_1
            {
            pushFollow(FOLLOW_rule__Include__FilenameAssignment_1_in_rule__Include__Group__1__Impl2407);
            rule__Include__FilenameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getIncludeAccess().getFilenameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1162:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1166:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1167:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__02441);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__02444);
            rule__StateMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1174:1: rule__StateMachine__Group__0__Impl : ( 'StateMachine' ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1178:1: ( ( 'StateMachine' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1179:1: ( 'StateMachine' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1179:1: ( 'StateMachine' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1180:1: 'StateMachine'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__StateMachine__Group__0__Impl2472); 
             after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1193:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1197:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1198:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__12503);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__12506);
            rule__StateMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1205:1: rule__StateMachine__Group__1__Impl : ( ( rule__StateMachine__NameAssignment_1 ) ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1209:1: ( ( ( rule__StateMachine__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1210:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1210:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1211:1: ( rule__StateMachine__NameAssignment_1 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1212:1: ( rule__StateMachine__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1212:2: rule__StateMachine__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__StateMachine__NameAssignment_1_in_rule__StateMachine__Group__1__Impl2533);
            rule__StateMachine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1222:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1226:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1227:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__22563);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__22566);
            rule__StateMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1234:1: rule__StateMachine__Group__2__Impl : ( 'for object' ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1238:1: ( ( 'for object' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1239:1: ( 'for object' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1239:1: ( 'for object' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1240:1: 'for object'
            {
             before(grammarAccess.getStateMachineAccess().getForObjectKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__StateMachine__Group__2__Impl2594); 
             after(grammarAccess.getStateMachineAccess().getForObjectKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1253:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1257:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1258:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__32625);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__32628);
            rule__StateMachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1265:1: rule__StateMachine__Group__3__Impl : ( ( rule__StateMachine__ReferredObjectAssignment_3 ) ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1269:1: ( ( ( rule__StateMachine__ReferredObjectAssignment_3 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1270:1: ( ( rule__StateMachine__ReferredObjectAssignment_3 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1270:1: ( ( rule__StateMachine__ReferredObjectAssignment_3 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1271:1: ( rule__StateMachine__ReferredObjectAssignment_3 )
            {
             before(grammarAccess.getStateMachineAccess().getReferredObjectAssignment_3()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1272:1: ( rule__StateMachine__ReferredObjectAssignment_3 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1272:2: rule__StateMachine__ReferredObjectAssignment_3
            {
            pushFollow(FOLLOW_rule__StateMachine__ReferredObjectAssignment_3_in_rule__StateMachine__Group__3__Impl2655);
            rule__StateMachine__ReferredObjectAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getReferredObjectAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group__4"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1282:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1286:1: ( rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1287:2: rule__StateMachine__Group__4__Impl rule__StateMachine__Group__5
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__42685);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__42688);
            rule__StateMachine__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4"


    // $ANTLR start "rule__StateMachine__Group__4__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1294:1: rule__StateMachine__Group__4__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1298:1: ( ( '{' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1299:1: ( '{' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1299:1: ( '{' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1300:1: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_14_in_rule__StateMachine__Group__4__Impl2716); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4__Impl"


    // $ANTLR start "rule__StateMachine__Group__5"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1313:1: rule__StateMachine__Group__5 : rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 ;
    public final void rule__StateMachine__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1317:1: ( rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1318:2: rule__StateMachine__Group__5__Impl rule__StateMachine__Group__6
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__52747);
            rule__StateMachine__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__52750);
            rule__StateMachine__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5"


    // $ANTLR start "rule__StateMachine__Group__5__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1325:1: rule__StateMachine__Group__5__Impl : ( ( rule__StateMachine__Group_5__0 )? ) ;
    public final void rule__StateMachine__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1329:1: ( ( ( rule__StateMachine__Group_5__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1330:1: ( ( rule__StateMachine__Group_5__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1330:1: ( ( rule__StateMachine__Group_5__0 )? )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1331:1: ( rule__StateMachine__Group_5__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_5()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1332:1: ( rule__StateMachine__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1332:2: rule__StateMachine__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__StateMachine__Group_5__0_in_rule__StateMachine__Group__5__Impl2777);
                    rule__StateMachine__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__5__Impl"


    // $ANTLR start "rule__StateMachine__Group__6"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1342:1: rule__StateMachine__Group__6 : rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7 ;
    public final void rule__StateMachine__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1346:1: ( rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1347:2: rule__StateMachine__Group__6__Impl rule__StateMachine__Group__7
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__62808);
            rule__StateMachine__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__7_in_rule__StateMachine__Group__62811);
            rule__StateMachine__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6"


    // $ANTLR start "rule__StateMachine__Group__6__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1354:1: rule__StateMachine__Group__6__Impl : ( ( rule__StateMachine__Group_6__0 )? ) ;
    public final void rule__StateMachine__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1358:1: ( ( ( rule__StateMachine__Group_6__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1359:1: ( ( rule__StateMachine__Group_6__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1359:1: ( ( rule__StateMachine__Group_6__0 )? )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1360:1: ( rule__StateMachine__Group_6__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_6()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1361:1: ( rule__StateMachine__Group_6__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1361:2: rule__StateMachine__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__StateMachine__Group_6__0_in_rule__StateMachine__Group__6__Impl2838);
                    rule__StateMachine__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__6__Impl"


    // $ANTLR start "rule__StateMachine__Group__7"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1371:1: rule__StateMachine__Group__7 : rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8 ;
    public final void rule__StateMachine__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1375:1: ( rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1376:2: rule__StateMachine__Group__7__Impl rule__StateMachine__Group__8
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__7__Impl_in_rule__StateMachine__Group__72869);
            rule__StateMachine__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__8_in_rule__StateMachine__Group__72872);
            rule__StateMachine__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__7"


    // $ANTLR start "rule__StateMachine__Group__7__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1383:1: rule__StateMachine__Group__7__Impl : ( ( rule__StateMachine__Group_7__0 )? ) ;
    public final void rule__StateMachine__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1387:1: ( ( ( rule__StateMachine__Group_7__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1388:1: ( ( rule__StateMachine__Group_7__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1388:1: ( ( rule__StateMachine__Group_7__0 )? )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1389:1: ( rule__StateMachine__Group_7__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_7()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1390:1: ( rule__StateMachine__Group_7__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1390:2: rule__StateMachine__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__StateMachine__Group_7__0_in_rule__StateMachine__Group__7__Impl2899);
                    rule__StateMachine__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__7__Impl"


    // $ANTLR start "rule__StateMachine__Group__8"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1400:1: rule__StateMachine__Group__8 : rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9 ;
    public final void rule__StateMachine__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1404:1: ( rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1405:2: rule__StateMachine__Group__8__Impl rule__StateMachine__Group__9
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__8__Impl_in_rule__StateMachine__Group__82930);
            rule__StateMachine__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__9_in_rule__StateMachine__Group__82933);
            rule__StateMachine__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__8"


    // $ANTLR start "rule__StateMachine__Group__8__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1412:1: rule__StateMachine__Group__8__Impl : ( ( rule__StateMachine__Group_8__0 )? ) ;
    public final void rule__StateMachine__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1416:1: ( ( ( rule__StateMachine__Group_8__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1417:1: ( ( rule__StateMachine__Group_8__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1417:1: ( ( rule__StateMachine__Group_8__0 )? )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1418:1: ( rule__StateMachine__Group_8__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_8()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1419:1: ( rule__StateMachine__Group_8__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1419:2: rule__StateMachine__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__StateMachine__Group_8__0_in_rule__StateMachine__Group__8__Impl2960);
                    rule__StateMachine__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__8__Impl"


    // $ANTLR start "rule__StateMachine__Group__9"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1429:1: rule__StateMachine__Group__9 : rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10 ;
    public final void rule__StateMachine__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1433:1: ( rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1434:2: rule__StateMachine__Group__9__Impl rule__StateMachine__Group__10
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__9__Impl_in_rule__StateMachine__Group__92991);
            rule__StateMachine__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group__10_in_rule__StateMachine__Group__92994);
            rule__StateMachine__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__9"


    // $ANTLR start "rule__StateMachine__Group__9__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1441:1: rule__StateMachine__Group__9__Impl : ( ( rule__StateMachine__Group_9__0 )? ) ;
    public final void rule__StateMachine__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1445:1: ( ( ( rule__StateMachine__Group_9__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1446:1: ( ( rule__StateMachine__Group_9__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1446:1: ( ( rule__StateMachine__Group_9__0 )? )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1447:1: ( rule__StateMachine__Group_9__0 )?
            {
             before(grammarAccess.getStateMachineAccess().getGroup_9()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1448:1: ( rule__StateMachine__Group_9__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1448:2: rule__StateMachine__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__StateMachine__Group_9__0_in_rule__StateMachine__Group__9__Impl3021);
                    rule__StateMachine__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateMachineAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__9__Impl"


    // $ANTLR start "rule__StateMachine__Group__10"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1458:1: rule__StateMachine__Group__10 : rule__StateMachine__Group__10__Impl ;
    public final void rule__StateMachine__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1462:1: ( rule__StateMachine__Group__10__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1463:2: rule__StateMachine__Group__10__Impl
            {
            pushFollow(FOLLOW_rule__StateMachine__Group__10__Impl_in_rule__StateMachine__Group__103052);
            rule__StateMachine__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__10"


    // $ANTLR start "rule__StateMachine__Group__10__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1469:1: rule__StateMachine__Group__10__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1473:1: ( ( '}' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1474:1: ( '}' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1474:1: ( '}' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1475:1: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10()); 
            match(input,15,FOLLOW_15_in_rule__StateMachine__Group__10__Impl3080); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__10__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1510:1: rule__StateMachine__Group_5__0 : rule__StateMachine__Group_5__0__Impl rule__StateMachine__Group_5__1 ;
    public final void rule__StateMachine__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1514:1: ( rule__StateMachine__Group_5__0__Impl rule__StateMachine__Group_5__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1515:2: rule__StateMachine__Group_5__0__Impl rule__StateMachine__Group_5__1
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_5__0__Impl_in_rule__StateMachine__Group_5__03133);
            rule__StateMachine__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group_5__1_in_rule__StateMachine__Group_5__03136);
            rule__StateMachine__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__0"


    // $ANTLR start "rule__StateMachine__Group_5__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1522:1: rule__StateMachine__Group_5__0__Impl : ( 'Actions:' ) ;
    public final void rule__StateMachine__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1526:1: ( ( 'Actions:' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1527:1: ( 'Actions:' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1527:1: ( 'Actions:' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1528:1: 'Actions:'
            {
             before(grammarAccess.getStateMachineAccess().getActionsKeyword_5_0()); 
            match(input,16,FOLLOW_16_in_rule__StateMachine__Group_5__0__Impl3164); 
             after(grammarAccess.getStateMachineAccess().getActionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1541:1: rule__StateMachine__Group_5__1 : rule__StateMachine__Group_5__1__Impl rule__StateMachine__Group_5__2 ;
    public final void rule__StateMachine__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1545:1: ( rule__StateMachine__Group_5__1__Impl rule__StateMachine__Group_5__2 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1546:2: rule__StateMachine__Group_5__1__Impl rule__StateMachine__Group_5__2
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_5__1__Impl_in_rule__StateMachine__Group_5__13195);
            rule__StateMachine__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group_5__2_in_rule__StateMachine__Group_5__13198);
            rule__StateMachine__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__1"


    // $ANTLR start "rule__StateMachine__Group_5__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1553:1: rule__StateMachine__Group_5__1__Impl : ( ( rule__StateMachine__ActionsAssignment_5_1 )* ) ;
    public final void rule__StateMachine__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1557:1: ( ( ( rule__StateMachine__ActionsAssignment_5_1 )* ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1558:1: ( ( rule__StateMachine__ActionsAssignment_5_1 )* )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1558:1: ( ( rule__StateMachine__ActionsAssignment_5_1 )* )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1559:1: ( rule__StateMachine__ActionsAssignment_5_1 )*
            {
             before(grammarAccess.getStateMachineAccess().getActionsAssignment_5_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1560:1: ( rule__StateMachine__ActionsAssignment_5_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=26 && LA12_0<=30)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1560:2: rule__StateMachine__ActionsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__ActionsAssignment_5_1_in_rule__StateMachine__Group_5__1__Impl3225);
            	    rule__StateMachine__ActionsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getActionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_5__2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1570:1: rule__StateMachine__Group_5__2 : rule__StateMachine__Group_5__2__Impl ;
    public final void rule__StateMachine__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1574:1: ( rule__StateMachine__Group_5__2__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1575:2: rule__StateMachine__Group_5__2__Impl
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_5__2__Impl_in_rule__StateMachine__Group_5__23256);
            rule__StateMachine__Group_5__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__2"


    // $ANTLR start "rule__StateMachine__Group_5__2__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1581:1: rule__StateMachine__Group_5__2__Impl : ( 'EndActions' ) ;
    public final void rule__StateMachine__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1585:1: ( ( 'EndActions' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1586:1: ( 'EndActions' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1586:1: ( 'EndActions' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1587:1: 'EndActions'
            {
             before(grammarAccess.getStateMachineAccess().getEndActionsKeyword_5_2()); 
            match(input,17,FOLLOW_17_in_rule__StateMachine__Group_5__2__Impl3284); 
             after(grammarAccess.getStateMachineAccess().getEndActionsKeyword_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_5__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_6__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1606:1: rule__StateMachine__Group_6__0 : rule__StateMachine__Group_6__0__Impl rule__StateMachine__Group_6__1 ;
    public final void rule__StateMachine__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1610:1: ( rule__StateMachine__Group_6__0__Impl rule__StateMachine__Group_6__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1611:2: rule__StateMachine__Group_6__0__Impl rule__StateMachine__Group_6__1
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_6__0__Impl_in_rule__StateMachine__Group_6__03321);
            rule__StateMachine__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group_6__1_in_rule__StateMachine__Group_6__03324);
            rule__StateMachine__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_6__0"


    // $ANTLR start "rule__StateMachine__Group_6__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1618:1: rule__StateMachine__Group_6__0__Impl : ( 'Guards:' ) ;
    public final void rule__StateMachine__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1622:1: ( ( 'Guards:' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1623:1: ( 'Guards:' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1623:1: ( 'Guards:' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1624:1: 'Guards:'
            {
             before(grammarAccess.getStateMachineAccess().getGuardsKeyword_6_0()); 
            match(input,18,FOLLOW_18_in_rule__StateMachine__Group_6__0__Impl3352); 
             after(grammarAccess.getStateMachineAccess().getGuardsKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_6__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_6__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1637:1: rule__StateMachine__Group_6__1 : rule__StateMachine__Group_6__1__Impl rule__StateMachine__Group_6__2 ;
    public final void rule__StateMachine__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1641:1: ( rule__StateMachine__Group_6__1__Impl rule__StateMachine__Group_6__2 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1642:2: rule__StateMachine__Group_6__1__Impl rule__StateMachine__Group_6__2
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_6__1__Impl_in_rule__StateMachine__Group_6__13383);
            rule__StateMachine__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group_6__2_in_rule__StateMachine__Group_6__13386);
            rule__StateMachine__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_6__1"


    // $ANTLR start "rule__StateMachine__Group_6__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1649:1: rule__StateMachine__Group_6__1__Impl : ( ( rule__StateMachine__GuardsAssignment_6_1 )* ) ;
    public final void rule__StateMachine__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1653:1: ( ( ( rule__StateMachine__GuardsAssignment_6_1 )* ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1654:1: ( ( rule__StateMachine__GuardsAssignment_6_1 )* )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1654:1: ( ( rule__StateMachine__GuardsAssignment_6_1 )* )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1655:1: ( rule__StateMachine__GuardsAssignment_6_1 )*
            {
             before(grammarAccess.getStateMachineAccess().getGuardsAssignment_6_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1656:1: ( rule__StateMachine__GuardsAssignment_6_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=36 && LA13_0<=42)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1656:2: rule__StateMachine__GuardsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__GuardsAssignment_6_1_in_rule__StateMachine__Group_6__1__Impl3413);
            	    rule__StateMachine__GuardsAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getGuardsAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_6__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_6__2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1666:1: rule__StateMachine__Group_6__2 : rule__StateMachine__Group_6__2__Impl ;
    public final void rule__StateMachine__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1670:1: ( rule__StateMachine__Group_6__2__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1671:2: rule__StateMachine__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_6__2__Impl_in_rule__StateMachine__Group_6__23444);
            rule__StateMachine__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_6__2"


    // $ANTLR start "rule__StateMachine__Group_6__2__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1677:1: rule__StateMachine__Group_6__2__Impl : ( 'EndGuards' ) ;
    public final void rule__StateMachine__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1681:1: ( ( 'EndGuards' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1682:1: ( 'EndGuards' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1682:1: ( 'EndGuards' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1683:1: 'EndGuards'
            {
             before(grammarAccess.getStateMachineAccess().getEndGuardsKeyword_6_2()); 
            match(input,19,FOLLOW_19_in_rule__StateMachine__Group_6__2__Impl3472); 
             after(grammarAccess.getStateMachineAccess().getEndGuardsKeyword_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_6__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_7__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1702:1: rule__StateMachine__Group_7__0 : rule__StateMachine__Group_7__0__Impl rule__StateMachine__Group_7__1 ;
    public final void rule__StateMachine__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1706:1: ( rule__StateMachine__Group_7__0__Impl rule__StateMachine__Group_7__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1707:2: rule__StateMachine__Group_7__0__Impl rule__StateMachine__Group_7__1
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_7__0__Impl_in_rule__StateMachine__Group_7__03509);
            rule__StateMachine__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group_7__1_in_rule__StateMachine__Group_7__03512);
            rule__StateMachine__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_7__0"


    // $ANTLR start "rule__StateMachine__Group_7__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1714:1: rule__StateMachine__Group_7__0__Impl : ( 'Triggers:' ) ;
    public final void rule__StateMachine__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1718:1: ( ( 'Triggers:' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1719:1: ( 'Triggers:' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1719:1: ( 'Triggers:' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1720:1: 'Triggers:'
            {
             before(grammarAccess.getStateMachineAccess().getTriggersKeyword_7_0()); 
            match(input,20,FOLLOW_20_in_rule__StateMachine__Group_7__0__Impl3540); 
             after(grammarAccess.getStateMachineAccess().getTriggersKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_7__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_7__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1733:1: rule__StateMachine__Group_7__1 : rule__StateMachine__Group_7__1__Impl rule__StateMachine__Group_7__2 ;
    public final void rule__StateMachine__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1737:1: ( rule__StateMachine__Group_7__1__Impl rule__StateMachine__Group_7__2 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1738:2: rule__StateMachine__Group_7__1__Impl rule__StateMachine__Group_7__2
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_7__1__Impl_in_rule__StateMachine__Group_7__13571);
            rule__StateMachine__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group_7__2_in_rule__StateMachine__Group_7__13574);
            rule__StateMachine__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_7__1"


    // $ANTLR start "rule__StateMachine__Group_7__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1745:1: rule__StateMachine__Group_7__1__Impl : ( ( rule__StateMachine__TriggersAssignment_7_1 )* ) ;
    public final void rule__StateMachine__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1749:1: ( ( ( rule__StateMachine__TriggersAssignment_7_1 )* ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1750:1: ( ( rule__StateMachine__TriggersAssignment_7_1 )* )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1750:1: ( ( rule__StateMachine__TriggersAssignment_7_1 )* )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1751:1: ( rule__StateMachine__TriggersAssignment_7_1 )*
            {
             before(grammarAccess.getStateMachineAccess().getTriggersAssignment_7_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1752:1: ( rule__StateMachine__TriggersAssignment_7_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=31 && LA14_0<=35)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1752:2: rule__StateMachine__TriggersAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__TriggersAssignment_7_1_in_rule__StateMachine__Group_7__1__Impl3601);
            	    rule__StateMachine__TriggersAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getTriggersAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_7__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_7__2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1762:1: rule__StateMachine__Group_7__2 : rule__StateMachine__Group_7__2__Impl ;
    public final void rule__StateMachine__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1766:1: ( rule__StateMachine__Group_7__2__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1767:2: rule__StateMachine__Group_7__2__Impl
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_7__2__Impl_in_rule__StateMachine__Group_7__23632);
            rule__StateMachine__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_7__2"


    // $ANTLR start "rule__StateMachine__Group_7__2__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1773:1: rule__StateMachine__Group_7__2__Impl : ( 'EndTriggers' ) ;
    public final void rule__StateMachine__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1777:1: ( ( 'EndTriggers' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1778:1: ( 'EndTriggers' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1778:1: ( 'EndTriggers' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1779:1: 'EndTriggers'
            {
             before(grammarAccess.getStateMachineAccess().getEndTriggersKeyword_7_2()); 
            match(input,21,FOLLOW_21_in_rule__StateMachine__Group_7__2__Impl3660); 
             after(grammarAccess.getStateMachineAccess().getEndTriggersKeyword_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_7__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_8__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1798:1: rule__StateMachine__Group_8__0 : rule__StateMachine__Group_8__0__Impl rule__StateMachine__Group_8__1 ;
    public final void rule__StateMachine__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1802:1: ( rule__StateMachine__Group_8__0__Impl rule__StateMachine__Group_8__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1803:2: rule__StateMachine__Group_8__0__Impl rule__StateMachine__Group_8__1
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_8__0__Impl_in_rule__StateMachine__Group_8__03697);
            rule__StateMachine__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group_8__1_in_rule__StateMachine__Group_8__03700);
            rule__StateMachine__Group_8__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__0"


    // $ANTLR start "rule__StateMachine__Group_8__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1810:1: rule__StateMachine__Group_8__0__Impl : ( 'States:' ) ;
    public final void rule__StateMachine__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1814:1: ( ( 'States:' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1815:1: ( 'States:' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1815:1: ( 'States:' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1816:1: 'States:'
            {
             before(grammarAccess.getStateMachineAccess().getStatesKeyword_8_0()); 
            match(input,22,FOLLOW_22_in_rule__StateMachine__Group_8__0__Impl3728); 
             after(grammarAccess.getStateMachineAccess().getStatesKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_8__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1829:1: rule__StateMachine__Group_8__1 : rule__StateMachine__Group_8__1__Impl rule__StateMachine__Group_8__2 ;
    public final void rule__StateMachine__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1833:1: ( rule__StateMachine__Group_8__1__Impl rule__StateMachine__Group_8__2 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1834:2: rule__StateMachine__Group_8__1__Impl rule__StateMachine__Group_8__2
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_8__1__Impl_in_rule__StateMachine__Group_8__13759);
            rule__StateMachine__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group_8__2_in_rule__StateMachine__Group_8__13762);
            rule__StateMachine__Group_8__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__1"


    // $ANTLR start "rule__StateMachine__Group_8__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1841:1: rule__StateMachine__Group_8__1__Impl : ( ( rule__StateMachine__StatesAssignment_8_1 )* ) ;
    public final void rule__StateMachine__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1845:1: ( ( ( rule__StateMachine__StatesAssignment_8_1 )* ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1846:1: ( ( rule__StateMachine__StatesAssignment_8_1 )* )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1846:1: ( ( rule__StateMachine__StatesAssignment_8_1 )* )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1847:1: ( rule__StateMachine__StatesAssignment_8_1 )*
            {
             before(grammarAccess.getStateMachineAccess().getStatesAssignment_8_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1848:1: ( rule__StateMachine__StatesAssignment_8_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1848:2: rule__StateMachine__StatesAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__StatesAssignment_8_1_in_rule__StateMachine__Group_8__1__Impl3789);
            	    rule__StateMachine__StatesAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getStatesAssignment_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_8__2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1858:1: rule__StateMachine__Group_8__2 : rule__StateMachine__Group_8__2__Impl ;
    public final void rule__StateMachine__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1862:1: ( rule__StateMachine__Group_8__2__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1863:2: rule__StateMachine__Group_8__2__Impl
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_8__2__Impl_in_rule__StateMachine__Group_8__23820);
            rule__StateMachine__Group_8__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__2"


    // $ANTLR start "rule__StateMachine__Group_8__2__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1869:1: rule__StateMachine__Group_8__2__Impl : ( 'EndStates' ) ;
    public final void rule__StateMachine__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1873:1: ( ( 'EndStates' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1874:1: ( 'EndStates' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1874:1: ( 'EndStates' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1875:1: 'EndStates'
            {
             before(grammarAccess.getStateMachineAccess().getEndStatesKeyword_8_2()); 
            match(input,23,FOLLOW_23_in_rule__StateMachine__Group_8__2__Impl3848); 
             after(grammarAccess.getStateMachineAccess().getEndStatesKeyword_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_8__2__Impl"


    // $ANTLR start "rule__StateMachine__Group_9__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1894:1: rule__StateMachine__Group_9__0 : rule__StateMachine__Group_9__0__Impl rule__StateMachine__Group_9__1 ;
    public final void rule__StateMachine__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1898:1: ( rule__StateMachine__Group_9__0__Impl rule__StateMachine__Group_9__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1899:2: rule__StateMachine__Group_9__0__Impl rule__StateMachine__Group_9__1
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_9__0__Impl_in_rule__StateMachine__Group_9__03885);
            rule__StateMachine__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group_9__1_in_rule__StateMachine__Group_9__03888);
            rule__StateMachine__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_9__0"


    // $ANTLR start "rule__StateMachine__Group_9__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1906:1: rule__StateMachine__Group_9__0__Impl : ( 'Transitions:' ) ;
    public final void rule__StateMachine__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1910:1: ( ( 'Transitions:' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1911:1: ( 'Transitions:' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1911:1: ( 'Transitions:' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1912:1: 'Transitions:'
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsKeyword_9_0()); 
            match(input,24,FOLLOW_24_in_rule__StateMachine__Group_9__0__Impl3916); 
             after(grammarAccess.getStateMachineAccess().getTransitionsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_9__0__Impl"


    // $ANTLR start "rule__StateMachine__Group_9__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1925:1: rule__StateMachine__Group_9__1 : rule__StateMachine__Group_9__1__Impl rule__StateMachine__Group_9__2 ;
    public final void rule__StateMachine__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1929:1: ( rule__StateMachine__Group_9__1__Impl rule__StateMachine__Group_9__2 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1930:2: rule__StateMachine__Group_9__1__Impl rule__StateMachine__Group_9__2
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_9__1__Impl_in_rule__StateMachine__Group_9__13947);
            rule__StateMachine__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__StateMachine__Group_9__2_in_rule__StateMachine__Group_9__13950);
            rule__StateMachine__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_9__1"


    // $ANTLR start "rule__StateMachine__Group_9__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1937:1: rule__StateMachine__Group_9__1__Impl : ( ( rule__StateMachine__TransitionsAssignment_9_1 )* ) ;
    public final void rule__StateMachine__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1941:1: ( ( ( rule__StateMachine__TransitionsAssignment_9_1 )* ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1942:1: ( ( rule__StateMachine__TransitionsAssignment_9_1 )* )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1942:1: ( ( rule__StateMachine__TransitionsAssignment_9_1 )* )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1943:1: ( rule__StateMachine__TransitionsAssignment_9_1 )*
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsAssignment_9_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1944:1: ( rule__StateMachine__TransitionsAssignment_9_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1944:2: rule__StateMachine__TransitionsAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_rule__StateMachine__TransitionsAssignment_9_1_in_rule__StateMachine__Group_9__1__Impl3977);
            	    rule__StateMachine__TransitionsAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getTransitionsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_9__1__Impl"


    // $ANTLR start "rule__StateMachine__Group_9__2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1954:1: rule__StateMachine__Group_9__2 : rule__StateMachine__Group_9__2__Impl ;
    public final void rule__StateMachine__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1958:1: ( rule__StateMachine__Group_9__2__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1959:2: rule__StateMachine__Group_9__2__Impl
            {
            pushFollow(FOLLOW_rule__StateMachine__Group_9__2__Impl_in_rule__StateMachine__Group_9__24008);
            rule__StateMachine__Group_9__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_9__2"


    // $ANTLR start "rule__StateMachine__Group_9__2__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1965:1: rule__StateMachine__Group_9__2__Impl : ( 'EndTransitions' ) ;
    public final void rule__StateMachine__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1969:1: ( ( 'EndTransitions' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1970:1: ( 'EndTransitions' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1970:1: ( 'EndTransitions' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1971:1: 'EndTransitions'
            {
             before(grammarAccess.getStateMachineAccess().getEndTransitionsKeyword_9_2()); 
            match(input,25,FOLLOW_25_in_rule__StateMachine__Group_9__2__Impl4036); 
             after(grammarAccess.getStateMachineAccess().getEndTransitionsKeyword_9_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group_9__2__Impl"


    // $ANTLR start "rule__ActionExpression_Impl__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1990:1: rule__ActionExpression_Impl__Group__0 : rule__ActionExpression_Impl__Group__0__Impl rule__ActionExpression_Impl__Group__1 ;
    public final void rule__ActionExpression_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1994:1: ( rule__ActionExpression_Impl__Group__0__Impl rule__ActionExpression_Impl__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1995:2: rule__ActionExpression_Impl__Group__0__Impl rule__ActionExpression_Impl__Group__1
            {
            pushFollow(FOLLOW_rule__ActionExpression_Impl__Group__0__Impl_in_rule__ActionExpression_Impl__Group__04073);
            rule__ActionExpression_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionExpression_Impl__Group__1_in_rule__ActionExpression_Impl__Group__04076);
            rule__ActionExpression_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression_Impl__Group__0"


    // $ANTLR start "rule__ActionExpression_Impl__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2002:1: rule__ActionExpression_Impl__Group__0__Impl : ( 'ActionExpression' ) ;
    public final void rule__ActionExpression_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2006:1: ( ( 'ActionExpression' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2007:1: ( 'ActionExpression' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2007:1: ( 'ActionExpression' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2008:1: 'ActionExpression'
            {
             before(grammarAccess.getActionExpression_ImplAccess().getActionExpressionKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__ActionExpression_Impl__Group__0__Impl4104); 
             after(grammarAccess.getActionExpression_ImplAccess().getActionExpressionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression_Impl__Group__0__Impl"


    // $ANTLR start "rule__ActionExpression_Impl__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2021:1: rule__ActionExpression_Impl__Group__1 : rule__ActionExpression_Impl__Group__1__Impl rule__ActionExpression_Impl__Group__2 ;
    public final void rule__ActionExpression_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2025:1: ( rule__ActionExpression_Impl__Group__1__Impl rule__ActionExpression_Impl__Group__2 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2026:2: rule__ActionExpression_Impl__Group__1__Impl rule__ActionExpression_Impl__Group__2
            {
            pushFollow(FOLLOW_rule__ActionExpression_Impl__Group__1__Impl_in_rule__ActionExpression_Impl__Group__14135);
            rule__ActionExpression_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionExpression_Impl__Group__2_in_rule__ActionExpression_Impl__Group__14138);
            rule__ActionExpression_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression_Impl__Group__1"


    // $ANTLR start "rule__ActionExpression_Impl__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2033:1: rule__ActionExpression_Impl__Group__1__Impl : ( ( rule__ActionExpression_Impl__NameAssignment_1 ) ) ;
    public final void rule__ActionExpression_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2037:1: ( ( ( rule__ActionExpression_Impl__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2038:1: ( ( rule__ActionExpression_Impl__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2038:1: ( ( rule__ActionExpression_Impl__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2039:1: ( rule__ActionExpression_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getActionExpression_ImplAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2040:1: ( rule__ActionExpression_Impl__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2040:2: rule__ActionExpression_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ActionExpression_Impl__NameAssignment_1_in_rule__ActionExpression_Impl__Group__1__Impl4165);
            rule__ActionExpression_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionExpression_ImplAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression_Impl__Group__1__Impl"


    // $ANTLR start "rule__ActionExpression_Impl__Group__2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2050:1: rule__ActionExpression_Impl__Group__2 : rule__ActionExpression_Impl__Group__2__Impl rule__ActionExpression_Impl__Group__3 ;
    public final void rule__ActionExpression_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2054:1: ( rule__ActionExpression_Impl__Group__2__Impl rule__ActionExpression_Impl__Group__3 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2055:2: rule__ActionExpression_Impl__Group__2__Impl rule__ActionExpression_Impl__Group__3
            {
            pushFollow(FOLLOW_rule__ActionExpression_Impl__Group__2__Impl_in_rule__ActionExpression_Impl__Group__24195);
            rule__ActionExpression_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionExpression_Impl__Group__3_in_rule__ActionExpression_Impl__Group__24198);
            rule__ActionExpression_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression_Impl__Group__2"


    // $ANTLR start "rule__ActionExpression_Impl__Group__2__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2062:1: rule__ActionExpression_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__ActionExpression_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2066:1: ( ( '{' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2067:1: ( '{' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2067:1: ( '{' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2068:1: '{'
            {
             before(grammarAccess.getActionExpression_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__ActionExpression_Impl__Group__2__Impl4226); 
             after(grammarAccess.getActionExpression_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression_Impl__Group__2__Impl"


    // $ANTLR start "rule__ActionExpression_Impl__Group__3"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2081:1: rule__ActionExpression_Impl__Group__3 : rule__ActionExpression_Impl__Group__3__Impl rule__ActionExpression_Impl__Group__4 ;
    public final void rule__ActionExpression_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2085:1: ( rule__ActionExpression_Impl__Group__3__Impl rule__ActionExpression_Impl__Group__4 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2086:2: rule__ActionExpression_Impl__Group__3__Impl rule__ActionExpression_Impl__Group__4
            {
            pushFollow(FOLLOW_rule__ActionExpression_Impl__Group__3__Impl_in_rule__ActionExpression_Impl__Group__34257);
            rule__ActionExpression_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ActionExpression_Impl__Group__4_in_rule__ActionExpression_Impl__Group__34260);
            rule__ActionExpression_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression_Impl__Group__3"


    // $ANTLR start "rule__ActionExpression_Impl__Group__3__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2093:1: rule__ActionExpression_Impl__Group__3__Impl : ( ( rule__ActionExpression_Impl__ExpressionAssignment_3 ) ) ;
    public final void rule__ActionExpression_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2097:1: ( ( ( rule__ActionExpression_Impl__ExpressionAssignment_3 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2098:1: ( ( rule__ActionExpression_Impl__ExpressionAssignment_3 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2098:1: ( ( rule__ActionExpression_Impl__ExpressionAssignment_3 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2099:1: ( rule__ActionExpression_Impl__ExpressionAssignment_3 )
            {
             before(grammarAccess.getActionExpression_ImplAccess().getExpressionAssignment_3()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2100:1: ( rule__ActionExpression_Impl__ExpressionAssignment_3 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2100:2: rule__ActionExpression_Impl__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_rule__ActionExpression_Impl__ExpressionAssignment_3_in_rule__ActionExpression_Impl__Group__3__Impl4287);
            rule__ActionExpression_Impl__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActionExpression_ImplAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression_Impl__Group__3__Impl"


    // $ANTLR start "rule__ActionExpression_Impl__Group__4"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2110:1: rule__ActionExpression_Impl__Group__4 : rule__ActionExpression_Impl__Group__4__Impl ;
    public final void rule__ActionExpression_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2114:1: ( rule__ActionExpression_Impl__Group__4__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2115:2: rule__ActionExpression_Impl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ActionExpression_Impl__Group__4__Impl_in_rule__ActionExpression_Impl__Group__44317);
            rule__ActionExpression_Impl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression_Impl__Group__4"


    // $ANTLR start "rule__ActionExpression_Impl__Group__4__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2121:1: rule__ActionExpression_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__ActionExpression_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2125:1: ( ( '}' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2126:1: ( '}' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2126:1: ( '}' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2127:1: '}'
            {
             before(grammarAccess.getActionExpression_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__ActionExpression_Impl__Group__4__Impl4345); 
             after(grammarAccess.getActionExpression_ImplAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression_Impl__Group__4__Impl"


    // $ANTLR start "rule__ChangeTrainCurrentTrackElement__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2150:1: rule__ChangeTrainCurrentTrackElement__Group__0 : rule__ChangeTrainCurrentTrackElement__Group__0__Impl rule__ChangeTrainCurrentTrackElement__Group__1 ;
    public final void rule__ChangeTrainCurrentTrackElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2154:1: ( rule__ChangeTrainCurrentTrackElement__Group__0__Impl rule__ChangeTrainCurrentTrackElement__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2155:2: rule__ChangeTrainCurrentTrackElement__Group__0__Impl rule__ChangeTrainCurrentTrackElement__Group__1
            {
            pushFollow(FOLLOW_rule__ChangeTrainCurrentTrackElement__Group__0__Impl_in_rule__ChangeTrainCurrentTrackElement__Group__04386);
            rule__ChangeTrainCurrentTrackElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChangeTrainCurrentTrackElement__Group__1_in_rule__ChangeTrainCurrentTrackElement__Group__04389);
            rule__ChangeTrainCurrentTrackElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTrainCurrentTrackElement__Group__0"


    // $ANTLR start "rule__ChangeTrainCurrentTrackElement__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2162:1: rule__ChangeTrainCurrentTrackElement__Group__0__Impl : ( 'ChangeTrainCurrentTrackElement' ) ;
    public final void rule__ChangeTrainCurrentTrackElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2166:1: ( ( 'ChangeTrainCurrentTrackElement' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2167:1: ( 'ChangeTrainCurrentTrackElement' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2167:1: ( 'ChangeTrainCurrentTrackElement' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2168:1: 'ChangeTrainCurrentTrackElement'
            {
             before(grammarAccess.getChangeTrainCurrentTrackElementAccess().getChangeTrainCurrentTrackElementKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__ChangeTrainCurrentTrackElement__Group__0__Impl4417); 
             after(grammarAccess.getChangeTrainCurrentTrackElementAccess().getChangeTrainCurrentTrackElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTrainCurrentTrackElement__Group__0__Impl"


    // $ANTLR start "rule__ChangeTrainCurrentTrackElement__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2181:1: rule__ChangeTrainCurrentTrackElement__Group__1 : rule__ChangeTrainCurrentTrackElement__Group__1__Impl ;
    public final void rule__ChangeTrainCurrentTrackElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2185:1: ( rule__ChangeTrainCurrentTrackElement__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2186:2: rule__ChangeTrainCurrentTrackElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ChangeTrainCurrentTrackElement__Group__1__Impl_in_rule__ChangeTrainCurrentTrackElement__Group__14448);
            rule__ChangeTrainCurrentTrackElement__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTrainCurrentTrackElement__Group__1"


    // $ANTLR start "rule__ChangeTrainCurrentTrackElement__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2192:1: rule__ChangeTrainCurrentTrackElement__Group__1__Impl : ( ( rule__ChangeTrainCurrentTrackElement__NameAssignment_1 ) ) ;
    public final void rule__ChangeTrainCurrentTrackElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2196:1: ( ( ( rule__ChangeTrainCurrentTrackElement__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2197:1: ( ( rule__ChangeTrainCurrentTrackElement__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2197:1: ( ( rule__ChangeTrainCurrentTrackElement__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2198:1: ( rule__ChangeTrainCurrentTrackElement__NameAssignment_1 )
            {
             before(grammarAccess.getChangeTrainCurrentTrackElementAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2199:1: ( rule__ChangeTrainCurrentTrackElement__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2199:2: rule__ChangeTrainCurrentTrackElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ChangeTrainCurrentTrackElement__NameAssignment_1_in_rule__ChangeTrainCurrentTrackElement__Group__1__Impl4475);
            rule__ChangeTrainCurrentTrackElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChangeTrainCurrentTrackElementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTrainCurrentTrackElement__Group__1__Impl"


    // $ANTLR start "rule__ChangeTurnoutDirection__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2213:1: rule__ChangeTurnoutDirection__Group__0 : rule__ChangeTurnoutDirection__Group__0__Impl rule__ChangeTurnoutDirection__Group__1 ;
    public final void rule__ChangeTurnoutDirection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2217:1: ( rule__ChangeTurnoutDirection__Group__0__Impl rule__ChangeTurnoutDirection__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2218:2: rule__ChangeTurnoutDirection__Group__0__Impl rule__ChangeTurnoutDirection__Group__1
            {
            pushFollow(FOLLOW_rule__ChangeTurnoutDirection__Group__0__Impl_in_rule__ChangeTurnoutDirection__Group__04509);
            rule__ChangeTurnoutDirection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChangeTurnoutDirection__Group__1_in_rule__ChangeTurnoutDirection__Group__04512);
            rule__ChangeTurnoutDirection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTurnoutDirection__Group__0"


    // $ANTLR start "rule__ChangeTurnoutDirection__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2225:1: rule__ChangeTurnoutDirection__Group__0__Impl : ( 'ChangeTurnoutDirection' ) ;
    public final void rule__ChangeTurnoutDirection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2229:1: ( ( 'ChangeTurnoutDirection' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2230:1: ( 'ChangeTurnoutDirection' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2230:1: ( 'ChangeTurnoutDirection' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2231:1: 'ChangeTurnoutDirection'
            {
             before(grammarAccess.getChangeTurnoutDirectionAccess().getChangeTurnoutDirectionKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ChangeTurnoutDirection__Group__0__Impl4540); 
             after(grammarAccess.getChangeTurnoutDirectionAccess().getChangeTurnoutDirectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTurnoutDirection__Group__0__Impl"


    // $ANTLR start "rule__ChangeTurnoutDirection__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2244:1: rule__ChangeTurnoutDirection__Group__1 : rule__ChangeTurnoutDirection__Group__1__Impl ;
    public final void rule__ChangeTurnoutDirection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2248:1: ( rule__ChangeTurnoutDirection__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2249:2: rule__ChangeTurnoutDirection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ChangeTurnoutDirection__Group__1__Impl_in_rule__ChangeTurnoutDirection__Group__14571);
            rule__ChangeTurnoutDirection__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTurnoutDirection__Group__1"


    // $ANTLR start "rule__ChangeTurnoutDirection__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2255:1: rule__ChangeTurnoutDirection__Group__1__Impl : ( ( rule__ChangeTurnoutDirection__NameAssignment_1 ) ) ;
    public final void rule__ChangeTurnoutDirection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2259:1: ( ( ( rule__ChangeTurnoutDirection__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2260:1: ( ( rule__ChangeTurnoutDirection__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2260:1: ( ( rule__ChangeTurnoutDirection__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2261:1: ( rule__ChangeTurnoutDirection__NameAssignment_1 )
            {
             before(grammarAccess.getChangeTurnoutDirectionAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2262:1: ( rule__ChangeTurnoutDirection__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2262:2: rule__ChangeTurnoutDirection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ChangeTurnoutDirection__NameAssignment_1_in_rule__ChangeTurnoutDirection__Group__1__Impl4598);
            rule__ChangeTurnoutDirection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChangeTurnoutDirectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTurnoutDirection__Group__1__Impl"


    // $ANTLR start "rule__ChangeSignalAllowedSpeed__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2276:1: rule__ChangeSignalAllowedSpeed__Group__0 : rule__ChangeSignalAllowedSpeed__Group__0__Impl rule__ChangeSignalAllowedSpeed__Group__1 ;
    public final void rule__ChangeSignalAllowedSpeed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2280:1: ( rule__ChangeSignalAllowedSpeed__Group__0__Impl rule__ChangeSignalAllowedSpeed__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2281:2: rule__ChangeSignalAllowedSpeed__Group__0__Impl rule__ChangeSignalAllowedSpeed__Group__1
            {
            pushFollow(FOLLOW_rule__ChangeSignalAllowedSpeed__Group__0__Impl_in_rule__ChangeSignalAllowedSpeed__Group__04632);
            rule__ChangeSignalAllowedSpeed__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChangeSignalAllowedSpeed__Group__1_in_rule__ChangeSignalAllowedSpeed__Group__04635);
            rule__ChangeSignalAllowedSpeed__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSignalAllowedSpeed__Group__0"


    // $ANTLR start "rule__ChangeSignalAllowedSpeed__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2288:1: rule__ChangeSignalAllowedSpeed__Group__0__Impl : ( 'ChangeSignalAllowedSpeed' ) ;
    public final void rule__ChangeSignalAllowedSpeed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2292:1: ( ( 'ChangeSignalAllowedSpeed' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2293:1: ( 'ChangeSignalAllowedSpeed' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2293:1: ( 'ChangeSignalAllowedSpeed' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2294:1: 'ChangeSignalAllowedSpeed'
            {
             before(grammarAccess.getChangeSignalAllowedSpeedAccess().getChangeSignalAllowedSpeedKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__ChangeSignalAllowedSpeed__Group__0__Impl4663); 
             after(grammarAccess.getChangeSignalAllowedSpeedAccess().getChangeSignalAllowedSpeedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSignalAllowedSpeed__Group__0__Impl"


    // $ANTLR start "rule__ChangeSignalAllowedSpeed__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2307:1: rule__ChangeSignalAllowedSpeed__Group__1 : rule__ChangeSignalAllowedSpeed__Group__1__Impl ;
    public final void rule__ChangeSignalAllowedSpeed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2311:1: ( rule__ChangeSignalAllowedSpeed__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2312:2: rule__ChangeSignalAllowedSpeed__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ChangeSignalAllowedSpeed__Group__1__Impl_in_rule__ChangeSignalAllowedSpeed__Group__14694);
            rule__ChangeSignalAllowedSpeed__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSignalAllowedSpeed__Group__1"


    // $ANTLR start "rule__ChangeSignalAllowedSpeed__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2318:1: rule__ChangeSignalAllowedSpeed__Group__1__Impl : ( ( rule__ChangeSignalAllowedSpeed__NameAssignment_1 ) ) ;
    public final void rule__ChangeSignalAllowedSpeed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2322:1: ( ( ( rule__ChangeSignalAllowedSpeed__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2323:1: ( ( rule__ChangeSignalAllowedSpeed__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2323:1: ( ( rule__ChangeSignalAllowedSpeed__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2324:1: ( rule__ChangeSignalAllowedSpeed__NameAssignment_1 )
            {
             before(grammarAccess.getChangeSignalAllowedSpeedAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2325:1: ( rule__ChangeSignalAllowedSpeed__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2325:2: rule__ChangeSignalAllowedSpeed__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ChangeSignalAllowedSpeed__NameAssignment_1_in_rule__ChangeSignalAllowedSpeed__Group__1__Impl4721);
            rule__ChangeSignalAllowedSpeed__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChangeSignalAllowedSpeedAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSignalAllowedSpeed__Group__1__Impl"


    // $ANTLR start "rule__ChangeTrainHeadingSpeed__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2339:1: rule__ChangeTrainHeadingSpeed__Group__0 : rule__ChangeTrainHeadingSpeed__Group__0__Impl rule__ChangeTrainHeadingSpeed__Group__1 ;
    public final void rule__ChangeTrainHeadingSpeed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2343:1: ( rule__ChangeTrainHeadingSpeed__Group__0__Impl rule__ChangeTrainHeadingSpeed__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2344:2: rule__ChangeTrainHeadingSpeed__Group__0__Impl rule__ChangeTrainHeadingSpeed__Group__1
            {
            pushFollow(FOLLOW_rule__ChangeTrainHeadingSpeed__Group__0__Impl_in_rule__ChangeTrainHeadingSpeed__Group__04755);
            rule__ChangeTrainHeadingSpeed__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ChangeTrainHeadingSpeed__Group__1_in_rule__ChangeTrainHeadingSpeed__Group__04758);
            rule__ChangeTrainHeadingSpeed__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTrainHeadingSpeed__Group__0"


    // $ANTLR start "rule__ChangeTrainHeadingSpeed__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2351:1: rule__ChangeTrainHeadingSpeed__Group__0__Impl : ( 'ChangeTrainHeadingSpeed' ) ;
    public final void rule__ChangeTrainHeadingSpeed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2355:1: ( ( 'ChangeTrainHeadingSpeed' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2356:1: ( 'ChangeTrainHeadingSpeed' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2356:1: ( 'ChangeTrainHeadingSpeed' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2357:1: 'ChangeTrainHeadingSpeed'
            {
             before(grammarAccess.getChangeTrainHeadingSpeedAccess().getChangeTrainHeadingSpeedKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__ChangeTrainHeadingSpeed__Group__0__Impl4786); 
             after(grammarAccess.getChangeTrainHeadingSpeedAccess().getChangeTrainHeadingSpeedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTrainHeadingSpeed__Group__0__Impl"


    // $ANTLR start "rule__ChangeTrainHeadingSpeed__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2370:1: rule__ChangeTrainHeadingSpeed__Group__1 : rule__ChangeTrainHeadingSpeed__Group__1__Impl ;
    public final void rule__ChangeTrainHeadingSpeed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2374:1: ( rule__ChangeTrainHeadingSpeed__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2375:2: rule__ChangeTrainHeadingSpeed__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ChangeTrainHeadingSpeed__Group__1__Impl_in_rule__ChangeTrainHeadingSpeed__Group__14817);
            rule__ChangeTrainHeadingSpeed__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTrainHeadingSpeed__Group__1"


    // $ANTLR start "rule__ChangeTrainHeadingSpeed__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2381:1: rule__ChangeTrainHeadingSpeed__Group__1__Impl : ( ( rule__ChangeTrainHeadingSpeed__NameAssignment_1 ) ) ;
    public final void rule__ChangeTrainHeadingSpeed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2385:1: ( ( ( rule__ChangeTrainHeadingSpeed__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2386:1: ( ( rule__ChangeTrainHeadingSpeed__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2386:1: ( ( rule__ChangeTrainHeadingSpeed__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2387:1: ( rule__ChangeTrainHeadingSpeed__NameAssignment_1 )
            {
             before(grammarAccess.getChangeTrainHeadingSpeedAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2388:1: ( rule__ChangeTrainHeadingSpeed__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2388:2: rule__ChangeTrainHeadingSpeed__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ChangeTrainHeadingSpeed__NameAssignment_1_in_rule__ChangeTrainHeadingSpeed__Group__1__Impl4844);
            rule__ChangeTrainHeadingSpeed__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChangeTrainHeadingSpeedAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTrainHeadingSpeed__Group__1__Impl"


    // $ANTLR start "rule__TrainHeadingSpeedChanged__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2402:1: rule__TrainHeadingSpeedChanged__Group__0 : rule__TrainHeadingSpeedChanged__Group__0__Impl rule__TrainHeadingSpeedChanged__Group__1 ;
    public final void rule__TrainHeadingSpeedChanged__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2406:1: ( rule__TrainHeadingSpeedChanged__Group__0__Impl rule__TrainHeadingSpeedChanged__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2407:2: rule__TrainHeadingSpeedChanged__Group__0__Impl rule__TrainHeadingSpeedChanged__Group__1
            {
            pushFollow(FOLLOW_rule__TrainHeadingSpeedChanged__Group__0__Impl_in_rule__TrainHeadingSpeedChanged__Group__04878);
            rule__TrainHeadingSpeedChanged__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrainHeadingSpeedChanged__Group__1_in_rule__TrainHeadingSpeedChanged__Group__04881);
            rule__TrainHeadingSpeedChanged__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainHeadingSpeedChanged__Group__0"


    // $ANTLR start "rule__TrainHeadingSpeedChanged__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2414:1: rule__TrainHeadingSpeedChanged__Group__0__Impl : ( 'TrainHeadingSpeedChanged' ) ;
    public final void rule__TrainHeadingSpeedChanged__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2418:1: ( ( 'TrainHeadingSpeedChanged' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2419:1: ( 'TrainHeadingSpeedChanged' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2419:1: ( 'TrainHeadingSpeedChanged' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2420:1: 'TrainHeadingSpeedChanged'
            {
             before(grammarAccess.getTrainHeadingSpeedChangedAccess().getTrainHeadingSpeedChangedKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__TrainHeadingSpeedChanged__Group__0__Impl4909); 
             after(grammarAccess.getTrainHeadingSpeedChangedAccess().getTrainHeadingSpeedChangedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainHeadingSpeedChanged__Group__0__Impl"


    // $ANTLR start "rule__TrainHeadingSpeedChanged__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2433:1: rule__TrainHeadingSpeedChanged__Group__1 : rule__TrainHeadingSpeedChanged__Group__1__Impl ;
    public final void rule__TrainHeadingSpeedChanged__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2437:1: ( rule__TrainHeadingSpeedChanged__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2438:2: rule__TrainHeadingSpeedChanged__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TrainHeadingSpeedChanged__Group__1__Impl_in_rule__TrainHeadingSpeedChanged__Group__14940);
            rule__TrainHeadingSpeedChanged__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainHeadingSpeedChanged__Group__1"


    // $ANTLR start "rule__TrainHeadingSpeedChanged__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2444:1: rule__TrainHeadingSpeedChanged__Group__1__Impl : ( ( rule__TrainHeadingSpeedChanged__NameAssignment_1 ) ) ;
    public final void rule__TrainHeadingSpeedChanged__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2448:1: ( ( ( rule__TrainHeadingSpeedChanged__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2449:1: ( ( rule__TrainHeadingSpeedChanged__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2449:1: ( ( rule__TrainHeadingSpeedChanged__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2450:1: ( rule__TrainHeadingSpeedChanged__NameAssignment_1 )
            {
             before(grammarAccess.getTrainHeadingSpeedChangedAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2451:1: ( rule__TrainHeadingSpeedChanged__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2451:2: rule__TrainHeadingSpeedChanged__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TrainHeadingSpeedChanged__NameAssignment_1_in_rule__TrainHeadingSpeedChanged__Group__1__Impl4967);
            rule__TrainHeadingSpeedChanged__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainHeadingSpeedChangedAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainHeadingSpeedChanged__Group__1__Impl"


    // $ANTLR start "rule__TrainTrackElementChanged__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2465:1: rule__TrainTrackElementChanged__Group__0 : rule__TrainTrackElementChanged__Group__0__Impl rule__TrainTrackElementChanged__Group__1 ;
    public final void rule__TrainTrackElementChanged__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2469:1: ( rule__TrainTrackElementChanged__Group__0__Impl rule__TrainTrackElementChanged__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2470:2: rule__TrainTrackElementChanged__Group__0__Impl rule__TrainTrackElementChanged__Group__1
            {
            pushFollow(FOLLOW_rule__TrainTrackElementChanged__Group__0__Impl_in_rule__TrainTrackElementChanged__Group__05001);
            rule__TrainTrackElementChanged__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrainTrackElementChanged__Group__1_in_rule__TrainTrackElementChanged__Group__05004);
            rule__TrainTrackElementChanged__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainTrackElementChanged__Group__0"


    // $ANTLR start "rule__TrainTrackElementChanged__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2477:1: rule__TrainTrackElementChanged__Group__0__Impl : ( 'TrainTrackElementChanged' ) ;
    public final void rule__TrainTrackElementChanged__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2481:1: ( ( 'TrainTrackElementChanged' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2482:1: ( 'TrainTrackElementChanged' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2482:1: ( 'TrainTrackElementChanged' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2483:1: 'TrainTrackElementChanged'
            {
             before(grammarAccess.getTrainTrackElementChangedAccess().getTrainTrackElementChangedKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__TrainTrackElementChanged__Group__0__Impl5032); 
             after(grammarAccess.getTrainTrackElementChangedAccess().getTrainTrackElementChangedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainTrackElementChanged__Group__0__Impl"


    // $ANTLR start "rule__TrainTrackElementChanged__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2496:1: rule__TrainTrackElementChanged__Group__1 : rule__TrainTrackElementChanged__Group__1__Impl ;
    public final void rule__TrainTrackElementChanged__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2500:1: ( rule__TrainTrackElementChanged__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2501:2: rule__TrainTrackElementChanged__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TrainTrackElementChanged__Group__1__Impl_in_rule__TrainTrackElementChanged__Group__15063);
            rule__TrainTrackElementChanged__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainTrackElementChanged__Group__1"


    // $ANTLR start "rule__TrainTrackElementChanged__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2507:1: rule__TrainTrackElementChanged__Group__1__Impl : ( ( rule__TrainTrackElementChanged__NameAssignment_1 ) ) ;
    public final void rule__TrainTrackElementChanged__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2511:1: ( ( ( rule__TrainTrackElementChanged__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2512:1: ( ( rule__TrainTrackElementChanged__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2512:1: ( ( rule__TrainTrackElementChanged__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2513:1: ( rule__TrainTrackElementChanged__NameAssignment_1 )
            {
             before(grammarAccess.getTrainTrackElementChangedAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2514:1: ( rule__TrainTrackElementChanged__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2514:2: rule__TrainTrackElementChanged__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TrainTrackElementChanged__NameAssignment_1_in_rule__TrainTrackElementChanged__Group__1__Impl5090);
            rule__TrainTrackElementChanged__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainTrackElementChangedAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainTrackElementChanged__Group__1__Impl"


    // $ANTLR start "rule__SignalAllowedSpeedChanged__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2528:1: rule__SignalAllowedSpeedChanged__Group__0 : rule__SignalAllowedSpeedChanged__Group__0__Impl rule__SignalAllowedSpeedChanged__Group__1 ;
    public final void rule__SignalAllowedSpeedChanged__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2532:1: ( rule__SignalAllowedSpeedChanged__Group__0__Impl rule__SignalAllowedSpeedChanged__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2533:2: rule__SignalAllowedSpeedChanged__Group__0__Impl rule__SignalAllowedSpeedChanged__Group__1
            {
            pushFollow(FOLLOW_rule__SignalAllowedSpeedChanged__Group__0__Impl_in_rule__SignalAllowedSpeedChanged__Group__05124);
            rule__SignalAllowedSpeedChanged__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignalAllowedSpeedChanged__Group__1_in_rule__SignalAllowedSpeedChanged__Group__05127);
            rule__SignalAllowedSpeedChanged__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalAllowedSpeedChanged__Group__0"


    // $ANTLR start "rule__SignalAllowedSpeedChanged__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2540:1: rule__SignalAllowedSpeedChanged__Group__0__Impl : ( 'SignalAllowedSpeedChanged' ) ;
    public final void rule__SignalAllowedSpeedChanged__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2544:1: ( ( 'SignalAllowedSpeedChanged' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2545:1: ( 'SignalAllowedSpeedChanged' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2545:1: ( 'SignalAllowedSpeedChanged' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2546:1: 'SignalAllowedSpeedChanged'
            {
             before(grammarAccess.getSignalAllowedSpeedChangedAccess().getSignalAllowedSpeedChangedKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__SignalAllowedSpeedChanged__Group__0__Impl5155); 
             after(grammarAccess.getSignalAllowedSpeedChangedAccess().getSignalAllowedSpeedChangedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalAllowedSpeedChanged__Group__0__Impl"


    // $ANTLR start "rule__SignalAllowedSpeedChanged__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2559:1: rule__SignalAllowedSpeedChanged__Group__1 : rule__SignalAllowedSpeedChanged__Group__1__Impl ;
    public final void rule__SignalAllowedSpeedChanged__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2563:1: ( rule__SignalAllowedSpeedChanged__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2564:2: rule__SignalAllowedSpeedChanged__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignalAllowedSpeedChanged__Group__1__Impl_in_rule__SignalAllowedSpeedChanged__Group__15186);
            rule__SignalAllowedSpeedChanged__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalAllowedSpeedChanged__Group__1"


    // $ANTLR start "rule__SignalAllowedSpeedChanged__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2570:1: rule__SignalAllowedSpeedChanged__Group__1__Impl : ( ( rule__SignalAllowedSpeedChanged__NameAssignment_1 ) ) ;
    public final void rule__SignalAllowedSpeedChanged__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2574:1: ( ( ( rule__SignalAllowedSpeedChanged__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2575:1: ( ( rule__SignalAllowedSpeedChanged__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2575:1: ( ( rule__SignalAllowedSpeedChanged__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2576:1: ( rule__SignalAllowedSpeedChanged__NameAssignment_1 )
            {
             before(grammarAccess.getSignalAllowedSpeedChangedAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2577:1: ( rule__SignalAllowedSpeedChanged__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2577:2: rule__SignalAllowedSpeedChanged__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SignalAllowedSpeedChanged__NameAssignment_1_in_rule__SignalAllowedSpeedChanged__Group__1__Impl5213);
            rule__SignalAllowedSpeedChanged__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignalAllowedSpeedChangedAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalAllowedSpeedChanged__Group__1__Impl"


    // $ANTLR start "rule__TurnoutDirectionChanged__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2591:1: rule__TurnoutDirectionChanged__Group__0 : rule__TurnoutDirectionChanged__Group__0__Impl rule__TurnoutDirectionChanged__Group__1 ;
    public final void rule__TurnoutDirectionChanged__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2595:1: ( rule__TurnoutDirectionChanged__Group__0__Impl rule__TurnoutDirectionChanged__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2596:2: rule__TurnoutDirectionChanged__Group__0__Impl rule__TurnoutDirectionChanged__Group__1
            {
            pushFollow(FOLLOW_rule__TurnoutDirectionChanged__Group__0__Impl_in_rule__TurnoutDirectionChanged__Group__05247);
            rule__TurnoutDirectionChanged__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TurnoutDirectionChanged__Group__1_in_rule__TurnoutDirectionChanged__Group__05250);
            rule__TurnoutDirectionChanged__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutDirectionChanged__Group__0"


    // $ANTLR start "rule__TurnoutDirectionChanged__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2603:1: rule__TurnoutDirectionChanged__Group__0__Impl : ( 'TurnoutDirectionChanged' ) ;
    public final void rule__TurnoutDirectionChanged__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2607:1: ( ( 'TurnoutDirectionChanged' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2608:1: ( 'TurnoutDirectionChanged' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2608:1: ( 'TurnoutDirectionChanged' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2609:1: 'TurnoutDirectionChanged'
            {
             before(grammarAccess.getTurnoutDirectionChangedAccess().getTurnoutDirectionChangedKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__TurnoutDirectionChanged__Group__0__Impl5278); 
             after(grammarAccess.getTurnoutDirectionChangedAccess().getTurnoutDirectionChangedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutDirectionChanged__Group__0__Impl"


    // $ANTLR start "rule__TurnoutDirectionChanged__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2622:1: rule__TurnoutDirectionChanged__Group__1 : rule__TurnoutDirectionChanged__Group__1__Impl ;
    public final void rule__TurnoutDirectionChanged__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2626:1: ( rule__TurnoutDirectionChanged__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2627:2: rule__TurnoutDirectionChanged__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TurnoutDirectionChanged__Group__1__Impl_in_rule__TurnoutDirectionChanged__Group__15309);
            rule__TurnoutDirectionChanged__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutDirectionChanged__Group__1"


    // $ANTLR start "rule__TurnoutDirectionChanged__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2633:1: rule__TurnoutDirectionChanged__Group__1__Impl : ( ( rule__TurnoutDirectionChanged__NameAssignment_1 ) ) ;
    public final void rule__TurnoutDirectionChanged__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2637:1: ( ( ( rule__TurnoutDirectionChanged__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2638:1: ( ( rule__TurnoutDirectionChanged__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2638:1: ( ( rule__TurnoutDirectionChanged__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2639:1: ( rule__TurnoutDirectionChanged__NameAssignment_1 )
            {
             before(grammarAccess.getTurnoutDirectionChangedAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2640:1: ( rule__TurnoutDirectionChanged__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2640:2: rule__TurnoutDirectionChanged__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TurnoutDirectionChanged__NameAssignment_1_in_rule__TurnoutDirectionChanged__Group__1__Impl5336);
            rule__TurnoutDirectionChanged__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutDirectionChangedAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutDirectionChanged__Group__1__Impl"


    // $ANTLR start "rule__TriggerExpression_Impl__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2654:1: rule__TriggerExpression_Impl__Group__0 : rule__TriggerExpression_Impl__Group__0__Impl rule__TriggerExpression_Impl__Group__1 ;
    public final void rule__TriggerExpression_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2658:1: ( rule__TriggerExpression_Impl__Group__0__Impl rule__TriggerExpression_Impl__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2659:2: rule__TriggerExpression_Impl__Group__0__Impl rule__TriggerExpression_Impl__Group__1
            {
            pushFollow(FOLLOW_rule__TriggerExpression_Impl__Group__0__Impl_in_rule__TriggerExpression_Impl__Group__05370);
            rule__TriggerExpression_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TriggerExpression_Impl__Group__1_in_rule__TriggerExpression_Impl__Group__05373);
            rule__TriggerExpression_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerExpression_Impl__Group__0"


    // $ANTLR start "rule__TriggerExpression_Impl__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2666:1: rule__TriggerExpression_Impl__Group__0__Impl : ( 'TriggerExpression' ) ;
    public final void rule__TriggerExpression_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2670:1: ( ( 'TriggerExpression' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2671:1: ( 'TriggerExpression' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2671:1: ( 'TriggerExpression' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2672:1: 'TriggerExpression'
            {
             before(grammarAccess.getTriggerExpression_ImplAccess().getTriggerExpressionKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__TriggerExpression_Impl__Group__0__Impl5401); 
             after(grammarAccess.getTriggerExpression_ImplAccess().getTriggerExpressionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerExpression_Impl__Group__0__Impl"


    // $ANTLR start "rule__TriggerExpression_Impl__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2685:1: rule__TriggerExpression_Impl__Group__1 : rule__TriggerExpression_Impl__Group__1__Impl rule__TriggerExpression_Impl__Group__2 ;
    public final void rule__TriggerExpression_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2689:1: ( rule__TriggerExpression_Impl__Group__1__Impl rule__TriggerExpression_Impl__Group__2 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2690:2: rule__TriggerExpression_Impl__Group__1__Impl rule__TriggerExpression_Impl__Group__2
            {
            pushFollow(FOLLOW_rule__TriggerExpression_Impl__Group__1__Impl_in_rule__TriggerExpression_Impl__Group__15432);
            rule__TriggerExpression_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TriggerExpression_Impl__Group__2_in_rule__TriggerExpression_Impl__Group__15435);
            rule__TriggerExpression_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerExpression_Impl__Group__1"


    // $ANTLR start "rule__TriggerExpression_Impl__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2697:1: rule__TriggerExpression_Impl__Group__1__Impl : ( ( rule__TriggerExpression_Impl__NameAssignment_1 ) ) ;
    public final void rule__TriggerExpression_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2701:1: ( ( ( rule__TriggerExpression_Impl__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2702:1: ( ( rule__TriggerExpression_Impl__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2702:1: ( ( rule__TriggerExpression_Impl__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2703:1: ( rule__TriggerExpression_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getTriggerExpression_ImplAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2704:1: ( rule__TriggerExpression_Impl__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2704:2: rule__TriggerExpression_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TriggerExpression_Impl__NameAssignment_1_in_rule__TriggerExpression_Impl__Group__1__Impl5462);
            rule__TriggerExpression_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTriggerExpression_ImplAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerExpression_Impl__Group__1__Impl"


    // $ANTLR start "rule__TriggerExpression_Impl__Group__2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2714:1: rule__TriggerExpression_Impl__Group__2 : rule__TriggerExpression_Impl__Group__2__Impl rule__TriggerExpression_Impl__Group__3 ;
    public final void rule__TriggerExpression_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2718:1: ( rule__TriggerExpression_Impl__Group__2__Impl rule__TriggerExpression_Impl__Group__3 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2719:2: rule__TriggerExpression_Impl__Group__2__Impl rule__TriggerExpression_Impl__Group__3
            {
            pushFollow(FOLLOW_rule__TriggerExpression_Impl__Group__2__Impl_in_rule__TriggerExpression_Impl__Group__25492);
            rule__TriggerExpression_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TriggerExpression_Impl__Group__3_in_rule__TriggerExpression_Impl__Group__25495);
            rule__TriggerExpression_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerExpression_Impl__Group__2"


    // $ANTLR start "rule__TriggerExpression_Impl__Group__2__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2726:1: rule__TriggerExpression_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__TriggerExpression_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2730:1: ( ( '{' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2731:1: ( '{' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2731:1: ( '{' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2732:1: '{'
            {
             before(grammarAccess.getTriggerExpression_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__TriggerExpression_Impl__Group__2__Impl5523); 
             after(grammarAccess.getTriggerExpression_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerExpression_Impl__Group__2__Impl"


    // $ANTLR start "rule__TriggerExpression_Impl__Group__3"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2745:1: rule__TriggerExpression_Impl__Group__3 : rule__TriggerExpression_Impl__Group__3__Impl rule__TriggerExpression_Impl__Group__4 ;
    public final void rule__TriggerExpression_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2749:1: ( rule__TriggerExpression_Impl__Group__3__Impl rule__TriggerExpression_Impl__Group__4 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2750:2: rule__TriggerExpression_Impl__Group__3__Impl rule__TriggerExpression_Impl__Group__4
            {
            pushFollow(FOLLOW_rule__TriggerExpression_Impl__Group__3__Impl_in_rule__TriggerExpression_Impl__Group__35554);
            rule__TriggerExpression_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TriggerExpression_Impl__Group__4_in_rule__TriggerExpression_Impl__Group__35557);
            rule__TriggerExpression_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerExpression_Impl__Group__3"


    // $ANTLR start "rule__TriggerExpression_Impl__Group__3__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2757:1: rule__TriggerExpression_Impl__Group__3__Impl : ( ( rule__TriggerExpression_Impl__ExpressionAssignment_3 ) ) ;
    public final void rule__TriggerExpression_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2761:1: ( ( ( rule__TriggerExpression_Impl__ExpressionAssignment_3 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2762:1: ( ( rule__TriggerExpression_Impl__ExpressionAssignment_3 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2762:1: ( ( rule__TriggerExpression_Impl__ExpressionAssignment_3 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2763:1: ( rule__TriggerExpression_Impl__ExpressionAssignment_3 )
            {
             before(grammarAccess.getTriggerExpression_ImplAccess().getExpressionAssignment_3()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2764:1: ( rule__TriggerExpression_Impl__ExpressionAssignment_3 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2764:2: rule__TriggerExpression_Impl__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_rule__TriggerExpression_Impl__ExpressionAssignment_3_in_rule__TriggerExpression_Impl__Group__3__Impl5584);
            rule__TriggerExpression_Impl__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTriggerExpression_ImplAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerExpression_Impl__Group__3__Impl"


    // $ANTLR start "rule__TriggerExpression_Impl__Group__4"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2774:1: rule__TriggerExpression_Impl__Group__4 : rule__TriggerExpression_Impl__Group__4__Impl ;
    public final void rule__TriggerExpression_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2778:1: ( rule__TriggerExpression_Impl__Group__4__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2779:2: rule__TriggerExpression_Impl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__TriggerExpression_Impl__Group__4__Impl_in_rule__TriggerExpression_Impl__Group__45614);
            rule__TriggerExpression_Impl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerExpression_Impl__Group__4"


    // $ANTLR start "rule__TriggerExpression_Impl__Group__4__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2785:1: rule__TriggerExpression_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__TriggerExpression_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2789:1: ( ( '}' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2790:1: ( '}' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2790:1: ( '}' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2791:1: '}'
            {
             before(grammarAccess.getTriggerExpression_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__TriggerExpression_Impl__Group__4__Impl5642); 
             after(grammarAccess.getTriggerExpression_ImplAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerExpression_Impl__Group__4__Impl"


    // $ANTLR start "rule__TrainCurrentHeadingSpeed__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2814:1: rule__TrainCurrentHeadingSpeed__Group__0 : rule__TrainCurrentHeadingSpeed__Group__0__Impl rule__TrainCurrentHeadingSpeed__Group__1 ;
    public final void rule__TrainCurrentHeadingSpeed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2818:1: ( rule__TrainCurrentHeadingSpeed__Group__0__Impl rule__TrainCurrentHeadingSpeed__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2819:2: rule__TrainCurrentHeadingSpeed__Group__0__Impl rule__TrainCurrentHeadingSpeed__Group__1
            {
            pushFollow(FOLLOW_rule__TrainCurrentHeadingSpeed__Group__0__Impl_in_rule__TrainCurrentHeadingSpeed__Group__05683);
            rule__TrainCurrentHeadingSpeed__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrainCurrentHeadingSpeed__Group__1_in_rule__TrainCurrentHeadingSpeed__Group__05686);
            rule__TrainCurrentHeadingSpeed__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainCurrentHeadingSpeed__Group__0"


    // $ANTLR start "rule__TrainCurrentHeadingSpeed__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2826:1: rule__TrainCurrentHeadingSpeed__Group__0__Impl : ( 'TrainCurrentHeadingSpeed' ) ;
    public final void rule__TrainCurrentHeadingSpeed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2830:1: ( ( 'TrainCurrentHeadingSpeed' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2831:1: ( 'TrainCurrentHeadingSpeed' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2831:1: ( 'TrainCurrentHeadingSpeed' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2832:1: 'TrainCurrentHeadingSpeed'
            {
             before(grammarAccess.getTrainCurrentHeadingSpeedAccess().getTrainCurrentHeadingSpeedKeyword_0()); 
            match(input,36,FOLLOW_36_in_rule__TrainCurrentHeadingSpeed__Group__0__Impl5714); 
             after(grammarAccess.getTrainCurrentHeadingSpeedAccess().getTrainCurrentHeadingSpeedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainCurrentHeadingSpeed__Group__0__Impl"


    // $ANTLR start "rule__TrainCurrentHeadingSpeed__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2845:1: rule__TrainCurrentHeadingSpeed__Group__1 : rule__TrainCurrentHeadingSpeed__Group__1__Impl ;
    public final void rule__TrainCurrentHeadingSpeed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2849:1: ( rule__TrainCurrentHeadingSpeed__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2850:2: rule__TrainCurrentHeadingSpeed__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TrainCurrentHeadingSpeed__Group__1__Impl_in_rule__TrainCurrentHeadingSpeed__Group__15745);
            rule__TrainCurrentHeadingSpeed__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainCurrentHeadingSpeed__Group__1"


    // $ANTLR start "rule__TrainCurrentHeadingSpeed__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2856:1: rule__TrainCurrentHeadingSpeed__Group__1__Impl : ( ( rule__TrainCurrentHeadingSpeed__NameAssignment_1 ) ) ;
    public final void rule__TrainCurrentHeadingSpeed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2860:1: ( ( ( rule__TrainCurrentHeadingSpeed__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2861:1: ( ( rule__TrainCurrentHeadingSpeed__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2861:1: ( ( rule__TrainCurrentHeadingSpeed__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2862:1: ( rule__TrainCurrentHeadingSpeed__NameAssignment_1 )
            {
             before(grammarAccess.getTrainCurrentHeadingSpeedAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2863:1: ( rule__TrainCurrentHeadingSpeed__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2863:2: rule__TrainCurrentHeadingSpeed__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TrainCurrentHeadingSpeed__NameAssignment_1_in_rule__TrainCurrentHeadingSpeed__Group__1__Impl5772);
            rule__TrainCurrentHeadingSpeed__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainCurrentHeadingSpeedAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainCurrentHeadingSpeed__Group__1__Impl"


    // $ANTLR start "rule__TrainCurrentlyStandsOn__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2877:1: rule__TrainCurrentlyStandsOn__Group__0 : rule__TrainCurrentlyStandsOn__Group__0__Impl rule__TrainCurrentlyStandsOn__Group__1 ;
    public final void rule__TrainCurrentlyStandsOn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2881:1: ( rule__TrainCurrentlyStandsOn__Group__0__Impl rule__TrainCurrentlyStandsOn__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2882:2: rule__TrainCurrentlyStandsOn__Group__0__Impl rule__TrainCurrentlyStandsOn__Group__1
            {
            pushFollow(FOLLOW_rule__TrainCurrentlyStandsOn__Group__0__Impl_in_rule__TrainCurrentlyStandsOn__Group__05806);
            rule__TrainCurrentlyStandsOn__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TrainCurrentlyStandsOn__Group__1_in_rule__TrainCurrentlyStandsOn__Group__05809);
            rule__TrainCurrentlyStandsOn__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainCurrentlyStandsOn__Group__0"


    // $ANTLR start "rule__TrainCurrentlyStandsOn__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2889:1: rule__TrainCurrentlyStandsOn__Group__0__Impl : ( 'TrainCurrentlyStandsOn' ) ;
    public final void rule__TrainCurrentlyStandsOn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2893:1: ( ( 'TrainCurrentlyStandsOn' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2894:1: ( 'TrainCurrentlyStandsOn' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2894:1: ( 'TrainCurrentlyStandsOn' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2895:1: 'TrainCurrentlyStandsOn'
            {
             before(grammarAccess.getTrainCurrentlyStandsOnAccess().getTrainCurrentlyStandsOnKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__TrainCurrentlyStandsOn__Group__0__Impl5837); 
             after(grammarAccess.getTrainCurrentlyStandsOnAccess().getTrainCurrentlyStandsOnKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainCurrentlyStandsOn__Group__0__Impl"


    // $ANTLR start "rule__TrainCurrentlyStandsOn__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2908:1: rule__TrainCurrentlyStandsOn__Group__1 : rule__TrainCurrentlyStandsOn__Group__1__Impl ;
    public final void rule__TrainCurrentlyStandsOn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2912:1: ( rule__TrainCurrentlyStandsOn__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2913:2: rule__TrainCurrentlyStandsOn__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TrainCurrentlyStandsOn__Group__1__Impl_in_rule__TrainCurrentlyStandsOn__Group__15868);
            rule__TrainCurrentlyStandsOn__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainCurrentlyStandsOn__Group__1"


    // $ANTLR start "rule__TrainCurrentlyStandsOn__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2919:1: rule__TrainCurrentlyStandsOn__Group__1__Impl : ( ( rule__TrainCurrentlyStandsOn__NameAssignment_1 ) ) ;
    public final void rule__TrainCurrentlyStandsOn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2923:1: ( ( ( rule__TrainCurrentlyStandsOn__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2924:1: ( ( rule__TrainCurrentlyStandsOn__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2924:1: ( ( rule__TrainCurrentlyStandsOn__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2925:1: ( rule__TrainCurrentlyStandsOn__NameAssignment_1 )
            {
             before(grammarAccess.getTrainCurrentlyStandsOnAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2926:1: ( rule__TrainCurrentlyStandsOn__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2926:2: rule__TrainCurrentlyStandsOn__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TrainCurrentlyStandsOn__NameAssignment_1_in_rule__TrainCurrentlyStandsOn__Group__1__Impl5895);
            rule__TrainCurrentlyStandsOn__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainCurrentlyStandsOnAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainCurrentlyStandsOn__Group__1__Impl"


    // $ANTLR start "rule__TurnoutCurrentDirection__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2940:1: rule__TurnoutCurrentDirection__Group__0 : rule__TurnoutCurrentDirection__Group__0__Impl rule__TurnoutCurrentDirection__Group__1 ;
    public final void rule__TurnoutCurrentDirection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2944:1: ( rule__TurnoutCurrentDirection__Group__0__Impl rule__TurnoutCurrentDirection__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2945:2: rule__TurnoutCurrentDirection__Group__0__Impl rule__TurnoutCurrentDirection__Group__1
            {
            pushFollow(FOLLOW_rule__TurnoutCurrentDirection__Group__0__Impl_in_rule__TurnoutCurrentDirection__Group__05929);
            rule__TurnoutCurrentDirection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TurnoutCurrentDirection__Group__1_in_rule__TurnoutCurrentDirection__Group__05932);
            rule__TurnoutCurrentDirection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutCurrentDirection__Group__0"


    // $ANTLR start "rule__TurnoutCurrentDirection__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2952:1: rule__TurnoutCurrentDirection__Group__0__Impl : ( 'TurnoutCurrentDirection' ) ;
    public final void rule__TurnoutCurrentDirection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2956:1: ( ( 'TurnoutCurrentDirection' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2957:1: ( 'TurnoutCurrentDirection' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2957:1: ( 'TurnoutCurrentDirection' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2958:1: 'TurnoutCurrentDirection'
            {
             before(grammarAccess.getTurnoutCurrentDirectionAccess().getTurnoutCurrentDirectionKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__TurnoutCurrentDirection__Group__0__Impl5960); 
             after(grammarAccess.getTurnoutCurrentDirectionAccess().getTurnoutCurrentDirectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutCurrentDirection__Group__0__Impl"


    // $ANTLR start "rule__TurnoutCurrentDirection__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2971:1: rule__TurnoutCurrentDirection__Group__1 : rule__TurnoutCurrentDirection__Group__1__Impl ;
    public final void rule__TurnoutCurrentDirection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2975:1: ( rule__TurnoutCurrentDirection__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2976:2: rule__TurnoutCurrentDirection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TurnoutCurrentDirection__Group__1__Impl_in_rule__TurnoutCurrentDirection__Group__15991);
            rule__TurnoutCurrentDirection__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutCurrentDirection__Group__1"


    // $ANTLR start "rule__TurnoutCurrentDirection__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2982:1: rule__TurnoutCurrentDirection__Group__1__Impl : ( ( rule__TurnoutCurrentDirection__NameAssignment_1 ) ) ;
    public final void rule__TurnoutCurrentDirection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2986:1: ( ( ( rule__TurnoutCurrentDirection__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2987:1: ( ( rule__TurnoutCurrentDirection__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2987:1: ( ( rule__TurnoutCurrentDirection__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2988:1: ( rule__TurnoutCurrentDirection__NameAssignment_1 )
            {
             before(grammarAccess.getTurnoutCurrentDirectionAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2989:1: ( rule__TurnoutCurrentDirection__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:2989:2: rule__TurnoutCurrentDirection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TurnoutCurrentDirection__NameAssignment_1_in_rule__TurnoutCurrentDirection__Group__1__Impl6018);
            rule__TurnoutCurrentDirection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutCurrentDirectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutCurrentDirection__Group__1__Impl"


    // $ANTLR start "rule__SignalCurrentAllowedSpeed__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3003:1: rule__SignalCurrentAllowedSpeed__Group__0 : rule__SignalCurrentAllowedSpeed__Group__0__Impl rule__SignalCurrentAllowedSpeed__Group__1 ;
    public final void rule__SignalCurrentAllowedSpeed__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3007:1: ( rule__SignalCurrentAllowedSpeed__Group__0__Impl rule__SignalCurrentAllowedSpeed__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3008:2: rule__SignalCurrentAllowedSpeed__Group__0__Impl rule__SignalCurrentAllowedSpeed__Group__1
            {
            pushFollow(FOLLOW_rule__SignalCurrentAllowedSpeed__Group__0__Impl_in_rule__SignalCurrentAllowedSpeed__Group__06052);
            rule__SignalCurrentAllowedSpeed__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SignalCurrentAllowedSpeed__Group__1_in_rule__SignalCurrentAllowedSpeed__Group__06055);
            rule__SignalCurrentAllowedSpeed__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalCurrentAllowedSpeed__Group__0"


    // $ANTLR start "rule__SignalCurrentAllowedSpeed__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3015:1: rule__SignalCurrentAllowedSpeed__Group__0__Impl : ( 'SignalCurrentAllowedSpeed' ) ;
    public final void rule__SignalCurrentAllowedSpeed__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3019:1: ( ( 'SignalCurrentAllowedSpeed' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3020:1: ( 'SignalCurrentAllowedSpeed' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3020:1: ( 'SignalCurrentAllowedSpeed' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3021:1: 'SignalCurrentAllowedSpeed'
            {
             before(grammarAccess.getSignalCurrentAllowedSpeedAccess().getSignalCurrentAllowedSpeedKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__SignalCurrentAllowedSpeed__Group__0__Impl6083); 
             after(grammarAccess.getSignalCurrentAllowedSpeedAccess().getSignalCurrentAllowedSpeedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalCurrentAllowedSpeed__Group__0__Impl"


    // $ANTLR start "rule__SignalCurrentAllowedSpeed__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3034:1: rule__SignalCurrentAllowedSpeed__Group__1 : rule__SignalCurrentAllowedSpeed__Group__1__Impl ;
    public final void rule__SignalCurrentAllowedSpeed__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3038:1: ( rule__SignalCurrentAllowedSpeed__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3039:2: rule__SignalCurrentAllowedSpeed__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SignalCurrentAllowedSpeed__Group__1__Impl_in_rule__SignalCurrentAllowedSpeed__Group__16114);
            rule__SignalCurrentAllowedSpeed__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalCurrentAllowedSpeed__Group__1"


    // $ANTLR start "rule__SignalCurrentAllowedSpeed__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3045:1: rule__SignalCurrentAllowedSpeed__Group__1__Impl : ( ( rule__SignalCurrentAllowedSpeed__NameAssignment_1 ) ) ;
    public final void rule__SignalCurrentAllowedSpeed__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3049:1: ( ( ( rule__SignalCurrentAllowedSpeed__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3050:1: ( ( rule__SignalCurrentAllowedSpeed__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3050:1: ( ( rule__SignalCurrentAllowedSpeed__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3051:1: ( rule__SignalCurrentAllowedSpeed__NameAssignment_1 )
            {
             before(grammarAccess.getSignalCurrentAllowedSpeedAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3052:1: ( rule__SignalCurrentAllowedSpeed__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3052:2: rule__SignalCurrentAllowedSpeed__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SignalCurrentAllowedSpeed__NameAssignment_1_in_rule__SignalCurrentAllowedSpeed__Group__1__Impl6141);
            rule__SignalCurrentAllowedSpeed__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignalCurrentAllowedSpeedAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalCurrentAllowedSpeed__Group__1__Impl"


    // $ANTLR start "rule__NextTrackElementIs__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3066:1: rule__NextTrackElementIs__Group__0 : rule__NextTrackElementIs__Group__0__Impl rule__NextTrackElementIs__Group__1 ;
    public final void rule__NextTrackElementIs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3070:1: ( rule__NextTrackElementIs__Group__0__Impl rule__NextTrackElementIs__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3071:2: rule__NextTrackElementIs__Group__0__Impl rule__NextTrackElementIs__Group__1
            {
            pushFollow(FOLLOW_rule__NextTrackElementIs__Group__0__Impl_in_rule__NextTrackElementIs__Group__06175);
            rule__NextTrackElementIs__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__NextTrackElementIs__Group__1_in_rule__NextTrackElementIs__Group__06178);
            rule__NextTrackElementIs__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NextTrackElementIs__Group__0"


    // $ANTLR start "rule__NextTrackElementIs__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3078:1: rule__NextTrackElementIs__Group__0__Impl : ( 'NextTrackElementIs' ) ;
    public final void rule__NextTrackElementIs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3082:1: ( ( 'NextTrackElementIs' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3083:1: ( 'NextTrackElementIs' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3083:1: ( 'NextTrackElementIs' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3084:1: 'NextTrackElementIs'
            {
             before(grammarAccess.getNextTrackElementIsAccess().getNextTrackElementIsKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__NextTrackElementIs__Group__0__Impl6206); 
             after(grammarAccess.getNextTrackElementIsAccess().getNextTrackElementIsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NextTrackElementIs__Group__0__Impl"


    // $ANTLR start "rule__NextTrackElementIs__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3097:1: rule__NextTrackElementIs__Group__1 : rule__NextTrackElementIs__Group__1__Impl ;
    public final void rule__NextTrackElementIs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3101:1: ( rule__NextTrackElementIs__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3102:2: rule__NextTrackElementIs__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NextTrackElementIs__Group__1__Impl_in_rule__NextTrackElementIs__Group__16237);
            rule__NextTrackElementIs__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NextTrackElementIs__Group__1"


    // $ANTLR start "rule__NextTrackElementIs__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3108:1: rule__NextTrackElementIs__Group__1__Impl : ( ( rule__NextTrackElementIs__NameAssignment_1 ) ) ;
    public final void rule__NextTrackElementIs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3112:1: ( ( ( rule__NextTrackElementIs__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3113:1: ( ( rule__NextTrackElementIs__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3113:1: ( ( rule__NextTrackElementIs__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3114:1: ( rule__NextTrackElementIs__NameAssignment_1 )
            {
             before(grammarAccess.getNextTrackElementIsAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3115:1: ( rule__NextTrackElementIs__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3115:2: rule__NextTrackElementIs__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NextTrackElementIs__NameAssignment_1_in_rule__NextTrackElementIs__Group__1__Impl6264);
            rule__NextTrackElementIs__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNextTrackElementIsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NextTrackElementIs__Group__1__Impl"


    // $ANTLR start "rule__TurnoutHasDesiredDirection__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3129:1: rule__TurnoutHasDesiredDirection__Group__0 : rule__TurnoutHasDesiredDirection__Group__0__Impl rule__TurnoutHasDesiredDirection__Group__1 ;
    public final void rule__TurnoutHasDesiredDirection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3133:1: ( rule__TurnoutHasDesiredDirection__Group__0__Impl rule__TurnoutHasDesiredDirection__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3134:2: rule__TurnoutHasDesiredDirection__Group__0__Impl rule__TurnoutHasDesiredDirection__Group__1
            {
            pushFollow(FOLLOW_rule__TurnoutHasDesiredDirection__Group__0__Impl_in_rule__TurnoutHasDesiredDirection__Group__06298);
            rule__TurnoutHasDesiredDirection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TurnoutHasDesiredDirection__Group__1_in_rule__TurnoutHasDesiredDirection__Group__06301);
            rule__TurnoutHasDesiredDirection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutHasDesiredDirection__Group__0"


    // $ANTLR start "rule__TurnoutHasDesiredDirection__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3141:1: rule__TurnoutHasDesiredDirection__Group__0__Impl : ( 'TurnoutHasDesiredDirection' ) ;
    public final void rule__TurnoutHasDesiredDirection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3145:1: ( ( 'TurnoutHasDesiredDirection' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3146:1: ( 'TurnoutHasDesiredDirection' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3146:1: ( 'TurnoutHasDesiredDirection' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3147:1: 'TurnoutHasDesiredDirection'
            {
             before(grammarAccess.getTurnoutHasDesiredDirectionAccess().getTurnoutHasDesiredDirectionKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__TurnoutHasDesiredDirection__Group__0__Impl6329); 
             after(grammarAccess.getTurnoutHasDesiredDirectionAccess().getTurnoutHasDesiredDirectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutHasDesiredDirection__Group__0__Impl"


    // $ANTLR start "rule__TurnoutHasDesiredDirection__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3160:1: rule__TurnoutHasDesiredDirection__Group__1 : rule__TurnoutHasDesiredDirection__Group__1__Impl ;
    public final void rule__TurnoutHasDesiredDirection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3164:1: ( rule__TurnoutHasDesiredDirection__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3165:2: rule__TurnoutHasDesiredDirection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TurnoutHasDesiredDirection__Group__1__Impl_in_rule__TurnoutHasDesiredDirection__Group__16360);
            rule__TurnoutHasDesiredDirection__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutHasDesiredDirection__Group__1"


    // $ANTLR start "rule__TurnoutHasDesiredDirection__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3171:1: rule__TurnoutHasDesiredDirection__Group__1__Impl : ( ( rule__TurnoutHasDesiredDirection__NameAssignment_1 ) ) ;
    public final void rule__TurnoutHasDesiredDirection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3175:1: ( ( ( rule__TurnoutHasDesiredDirection__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3176:1: ( ( rule__TurnoutHasDesiredDirection__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3176:1: ( ( rule__TurnoutHasDesiredDirection__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3177:1: ( rule__TurnoutHasDesiredDirection__NameAssignment_1 )
            {
             before(grammarAccess.getTurnoutHasDesiredDirectionAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3178:1: ( rule__TurnoutHasDesiredDirection__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3178:2: rule__TurnoutHasDesiredDirection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TurnoutHasDesiredDirection__NameAssignment_1_in_rule__TurnoutHasDesiredDirection__Group__1__Impl6387);
            rule__TurnoutHasDesiredDirection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutHasDesiredDirectionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutHasDesiredDirection__Group__1__Impl"


    // $ANTLR start "rule__GuardExpression_Impl__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3192:1: rule__GuardExpression_Impl__Group__0 : rule__GuardExpression_Impl__Group__0__Impl rule__GuardExpression_Impl__Group__1 ;
    public final void rule__GuardExpression_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3196:1: ( rule__GuardExpression_Impl__Group__0__Impl rule__GuardExpression_Impl__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3197:2: rule__GuardExpression_Impl__Group__0__Impl rule__GuardExpression_Impl__Group__1
            {
            pushFollow(FOLLOW_rule__GuardExpression_Impl__Group__0__Impl_in_rule__GuardExpression_Impl__Group__06421);
            rule__GuardExpression_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuardExpression_Impl__Group__1_in_rule__GuardExpression_Impl__Group__06424);
            rule__GuardExpression_Impl__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardExpression_Impl__Group__0"


    // $ANTLR start "rule__GuardExpression_Impl__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3204:1: rule__GuardExpression_Impl__Group__0__Impl : ( 'GuardExpression' ) ;
    public final void rule__GuardExpression_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3208:1: ( ( 'GuardExpression' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3209:1: ( 'GuardExpression' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3209:1: ( 'GuardExpression' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3210:1: 'GuardExpression'
            {
             before(grammarAccess.getGuardExpression_ImplAccess().getGuardExpressionKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__GuardExpression_Impl__Group__0__Impl6452); 
             after(grammarAccess.getGuardExpression_ImplAccess().getGuardExpressionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardExpression_Impl__Group__0__Impl"


    // $ANTLR start "rule__GuardExpression_Impl__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3223:1: rule__GuardExpression_Impl__Group__1 : rule__GuardExpression_Impl__Group__1__Impl rule__GuardExpression_Impl__Group__2 ;
    public final void rule__GuardExpression_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3227:1: ( rule__GuardExpression_Impl__Group__1__Impl rule__GuardExpression_Impl__Group__2 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3228:2: rule__GuardExpression_Impl__Group__1__Impl rule__GuardExpression_Impl__Group__2
            {
            pushFollow(FOLLOW_rule__GuardExpression_Impl__Group__1__Impl_in_rule__GuardExpression_Impl__Group__16483);
            rule__GuardExpression_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuardExpression_Impl__Group__2_in_rule__GuardExpression_Impl__Group__16486);
            rule__GuardExpression_Impl__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardExpression_Impl__Group__1"


    // $ANTLR start "rule__GuardExpression_Impl__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3235:1: rule__GuardExpression_Impl__Group__1__Impl : ( ( rule__GuardExpression_Impl__NameAssignment_1 ) ) ;
    public final void rule__GuardExpression_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3239:1: ( ( ( rule__GuardExpression_Impl__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3240:1: ( ( rule__GuardExpression_Impl__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3240:1: ( ( rule__GuardExpression_Impl__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3241:1: ( rule__GuardExpression_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getGuardExpression_ImplAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3242:1: ( rule__GuardExpression_Impl__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3242:2: rule__GuardExpression_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__GuardExpression_Impl__NameAssignment_1_in_rule__GuardExpression_Impl__Group__1__Impl6513);
            rule__GuardExpression_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuardExpression_ImplAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardExpression_Impl__Group__1__Impl"


    // $ANTLR start "rule__GuardExpression_Impl__Group__2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3252:1: rule__GuardExpression_Impl__Group__2 : rule__GuardExpression_Impl__Group__2__Impl rule__GuardExpression_Impl__Group__3 ;
    public final void rule__GuardExpression_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3256:1: ( rule__GuardExpression_Impl__Group__2__Impl rule__GuardExpression_Impl__Group__3 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3257:2: rule__GuardExpression_Impl__Group__2__Impl rule__GuardExpression_Impl__Group__3
            {
            pushFollow(FOLLOW_rule__GuardExpression_Impl__Group__2__Impl_in_rule__GuardExpression_Impl__Group__26543);
            rule__GuardExpression_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuardExpression_Impl__Group__3_in_rule__GuardExpression_Impl__Group__26546);
            rule__GuardExpression_Impl__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardExpression_Impl__Group__2"


    // $ANTLR start "rule__GuardExpression_Impl__Group__2__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3264:1: rule__GuardExpression_Impl__Group__2__Impl : ( '{' ) ;
    public final void rule__GuardExpression_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3268:1: ( ( '{' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3269:1: ( '{' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3269:1: ( '{' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3270:1: '{'
            {
             before(grammarAccess.getGuardExpression_ImplAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__GuardExpression_Impl__Group__2__Impl6574); 
             after(grammarAccess.getGuardExpression_ImplAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardExpression_Impl__Group__2__Impl"


    // $ANTLR start "rule__GuardExpression_Impl__Group__3"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3283:1: rule__GuardExpression_Impl__Group__3 : rule__GuardExpression_Impl__Group__3__Impl rule__GuardExpression_Impl__Group__4 ;
    public final void rule__GuardExpression_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3287:1: ( rule__GuardExpression_Impl__Group__3__Impl rule__GuardExpression_Impl__Group__4 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3288:2: rule__GuardExpression_Impl__Group__3__Impl rule__GuardExpression_Impl__Group__4
            {
            pushFollow(FOLLOW_rule__GuardExpression_Impl__Group__3__Impl_in_rule__GuardExpression_Impl__Group__36605);
            rule__GuardExpression_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GuardExpression_Impl__Group__4_in_rule__GuardExpression_Impl__Group__36608);
            rule__GuardExpression_Impl__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardExpression_Impl__Group__3"


    // $ANTLR start "rule__GuardExpression_Impl__Group__3__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3295:1: rule__GuardExpression_Impl__Group__3__Impl : ( ( rule__GuardExpression_Impl__ExpressionAssignment_3 ) ) ;
    public final void rule__GuardExpression_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3299:1: ( ( ( rule__GuardExpression_Impl__ExpressionAssignment_3 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3300:1: ( ( rule__GuardExpression_Impl__ExpressionAssignment_3 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3300:1: ( ( rule__GuardExpression_Impl__ExpressionAssignment_3 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3301:1: ( rule__GuardExpression_Impl__ExpressionAssignment_3 )
            {
             before(grammarAccess.getGuardExpression_ImplAccess().getExpressionAssignment_3()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3302:1: ( rule__GuardExpression_Impl__ExpressionAssignment_3 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3302:2: rule__GuardExpression_Impl__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_rule__GuardExpression_Impl__ExpressionAssignment_3_in_rule__GuardExpression_Impl__Group__3__Impl6635);
            rule__GuardExpression_Impl__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGuardExpression_ImplAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardExpression_Impl__Group__3__Impl"


    // $ANTLR start "rule__GuardExpression_Impl__Group__4"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3312:1: rule__GuardExpression_Impl__Group__4 : rule__GuardExpression_Impl__Group__4__Impl ;
    public final void rule__GuardExpression_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3316:1: ( rule__GuardExpression_Impl__Group__4__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3317:2: rule__GuardExpression_Impl__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__GuardExpression_Impl__Group__4__Impl_in_rule__GuardExpression_Impl__Group__46665);
            rule__GuardExpression_Impl__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardExpression_Impl__Group__4"


    // $ANTLR start "rule__GuardExpression_Impl__Group__4__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3323:1: rule__GuardExpression_Impl__Group__4__Impl : ( '}' ) ;
    public final void rule__GuardExpression_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3327:1: ( ( '}' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3328:1: ( '}' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3328:1: ( '}' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3329:1: '}'
            {
             before(grammarAccess.getGuardExpression_ImplAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_15_in_rule__GuardExpression_Impl__Group__4__Impl6693); 
             after(grammarAccess.getGuardExpression_ImplAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardExpression_Impl__Group__4__Impl"


    // $ANTLR start "rule__State__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3352:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3356:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3357:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__06734);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__State__Group__1_in_rule__State__Group__06737);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3364:1: rule__State__Group__0__Impl : ( ( rule__State__NameAssignment_0 ) ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3368:1: ( ( ( rule__State__NameAssignment_0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3369:1: ( ( rule__State__NameAssignment_0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3369:1: ( ( rule__State__NameAssignment_0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3370:1: ( rule__State__NameAssignment_0 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3371:1: ( rule__State__NameAssignment_0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3371:2: rule__State__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__0__Impl6764);
            rule__State__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3381:1: rule__State__Group__1 : rule__State__Group__1__Impl ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3385:1: ( rule__State__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3386:2: rule__State__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__16794);
            rule__State__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3392:1: rule__State__Group__1__Impl : ( ( rule__State__UnorderedGroup_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3396:1: ( ( ( rule__State__UnorderedGroup_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3397:1: ( ( rule__State__UnorderedGroup_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3397:1: ( ( rule__State__UnorderedGroup_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3398:1: ( rule__State__UnorderedGroup_1 )
            {
             before(grammarAccess.getStateAccess().getUnorderedGroup_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3399:1: ( rule__State__UnorderedGroup_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3399:2: rule__State__UnorderedGroup_1
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup_1_in_rule__State__Group__1__Impl6821);
            rule__State__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3413:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3417:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3418:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__06855);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__06858);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3425:1: rule__Transition__Group__0__Impl : ( ( rule__Transition__NameAssignment_0 ) ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3429:1: ( ( ( rule__Transition__NameAssignment_0 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3430:1: ( ( rule__Transition__NameAssignment_0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3430:1: ( ( rule__Transition__NameAssignment_0 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3431:1: ( rule__Transition__NameAssignment_0 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3432:1: ( rule__Transition__NameAssignment_0 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3432:2: rule__Transition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl6885);
            rule__Transition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3442:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3446:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3447:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__16915);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__16918);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3454:1: rule__Transition__Group__1__Impl : ( '{' ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3458:1: ( ( '{' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3459:1: ( '{' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3459:1: ( '{' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3460:1: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Transition__Group__1__Impl6946); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3473:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3477:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3478:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__26977);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__26980);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3485:1: rule__Transition__Group__2__Impl : ( ( rule__Transition__UnorderedGroup_2 ) ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3489:1: ( ( ( rule__Transition__UnorderedGroup_2 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3490:1: ( ( rule__Transition__UnorderedGroup_2 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3490:1: ( ( rule__Transition__UnorderedGroup_2 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3491:1: ( rule__Transition__UnorderedGroup_2 )
            {
             before(grammarAccess.getTransitionAccess().getUnorderedGroup_2()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3492:1: ( rule__Transition__UnorderedGroup_2 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3492:2: rule__Transition__UnorderedGroup_2
            {
            pushFollow(FOLLOW_rule__Transition__UnorderedGroup_2_in_rule__Transition__Group__2__Impl7007);
            rule__Transition__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3502:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3506:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3507:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__37037);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__37040);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3514:1: rule__Transition__Group__3__Impl : ( 'from state' ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3518:1: ( ( 'from state' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3519:1: ( 'from state' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3519:1: ( 'from state' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3520:1: 'from state'
            {
             before(grammarAccess.getTransitionAccess().getFromStateKeyword_3()); 
            match(input,43,FOLLOW_43_in_rule__Transition__Group__3__Impl7068); 
             after(grammarAccess.getTransitionAccess().getFromStateKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3533:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3537:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3538:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__47099);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__47102);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3545:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__SourceStateAssignment_4 ) ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3549:1: ( ( ( rule__Transition__SourceStateAssignment_4 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3550:1: ( ( rule__Transition__SourceStateAssignment_4 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3550:1: ( ( rule__Transition__SourceStateAssignment_4 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3551:1: ( rule__Transition__SourceStateAssignment_4 )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateAssignment_4()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3552:1: ( rule__Transition__SourceStateAssignment_4 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3552:2: rule__Transition__SourceStateAssignment_4
            {
            pushFollow(FOLLOW_rule__Transition__SourceStateAssignment_4_in_rule__Transition__Group__4__Impl7129);
            rule__Transition__SourceStateAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getSourceStateAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3562:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl rule__Transition__Group__6 ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3566:1: ( rule__Transition__Group__5__Impl rule__Transition__Group__6 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3567:2: rule__Transition__Group__5__Impl rule__Transition__Group__6
            {
            pushFollow(FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__57159);
            rule__Transition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__57162);
            rule__Transition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3574:1: rule__Transition__Group__5__Impl : ( 'to' ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3578:1: ( ( 'to' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3579:1: ( 'to' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3579:1: ( 'to' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3580:1: 'to'
            {
             before(grammarAccess.getTransitionAccess().getToKeyword_5()); 
            match(input,44,FOLLOW_44_in_rule__Transition__Group__5__Impl7190); 
             after(grammarAccess.getTransitionAccess().getToKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group__6"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3593:1: rule__Transition__Group__6 : rule__Transition__Group__6__Impl rule__Transition__Group__7 ;
    public final void rule__Transition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3597:1: ( rule__Transition__Group__6__Impl rule__Transition__Group__7 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3598:2: rule__Transition__Group__6__Impl rule__Transition__Group__7
            {
            pushFollow(FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__67221);
            rule__Transition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__7_in_rule__Transition__Group__67224);
            rule__Transition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6"


    // $ANTLR start "rule__Transition__Group__6__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3605:1: rule__Transition__Group__6__Impl : ( ( rule__Transition__TargetStateAssignment_6 ) ) ;
    public final void rule__Transition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3609:1: ( ( ( rule__Transition__TargetStateAssignment_6 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3610:1: ( ( rule__Transition__TargetStateAssignment_6 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3610:1: ( ( rule__Transition__TargetStateAssignment_6 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3611:1: ( rule__Transition__TargetStateAssignment_6 )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateAssignment_6()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3612:1: ( rule__Transition__TargetStateAssignment_6 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3612:2: rule__Transition__TargetStateAssignment_6
            {
            pushFollow(FOLLOW_rule__Transition__TargetStateAssignment_6_in_rule__Transition__Group__6__Impl7251);
            rule__Transition__TargetStateAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTargetStateAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__6__Impl"


    // $ANTLR start "rule__Transition__Group__7"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3622:1: rule__Transition__Group__7 : rule__Transition__Group__7__Impl rule__Transition__Group__8 ;
    public final void rule__Transition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3626:1: ( rule__Transition__Group__7__Impl rule__Transition__Group__8 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3627:2: rule__Transition__Group__7__Impl rule__Transition__Group__8
            {
            pushFollow(FOLLOW_rule__Transition__Group__7__Impl_in_rule__Transition__Group__77281);
            rule__Transition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__8_in_rule__Transition__Group__77284);
            rule__Transition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7"


    // $ANTLR start "rule__Transition__Group__7__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3634:1: rule__Transition__Group__7__Impl : ( 'execute' ) ;
    public final void rule__Transition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3638:1: ( ( 'execute' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3639:1: ( 'execute' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3639:1: ( 'execute' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3640:1: 'execute'
            {
             before(grammarAccess.getTransitionAccess().getExecuteKeyword_7()); 
            match(input,45,FOLLOW_45_in_rule__Transition__Group__7__Impl7312); 
             after(grammarAccess.getTransitionAccess().getExecuteKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__7__Impl"


    // $ANTLR start "rule__Transition__Group__8"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3653:1: rule__Transition__Group__8 : rule__Transition__Group__8__Impl rule__Transition__Group__9 ;
    public final void rule__Transition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3657:1: ( rule__Transition__Group__8__Impl rule__Transition__Group__9 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3658:2: rule__Transition__Group__8__Impl rule__Transition__Group__9
            {
            pushFollow(FOLLOW_rule__Transition__Group__8__Impl_in_rule__Transition__Group__87343);
            rule__Transition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__9_in_rule__Transition__Group__87346);
            rule__Transition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8"


    // $ANTLR start "rule__Transition__Group__8__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3665:1: rule__Transition__Group__8__Impl : ( ( rule__Transition__ActionAssignment_8 ) ) ;
    public final void rule__Transition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3669:1: ( ( ( rule__Transition__ActionAssignment_8 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3670:1: ( ( rule__Transition__ActionAssignment_8 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3670:1: ( ( rule__Transition__ActionAssignment_8 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3671:1: ( rule__Transition__ActionAssignment_8 )
            {
             before(grammarAccess.getTransitionAccess().getActionAssignment_8()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3672:1: ( rule__Transition__ActionAssignment_8 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3672:2: rule__Transition__ActionAssignment_8
            {
            pushFollow(FOLLOW_rule__Transition__ActionAssignment_8_in_rule__Transition__Group__8__Impl7373);
            rule__Transition__ActionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getActionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__8__Impl"


    // $ANTLR start "rule__Transition__Group__9"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3682:1: rule__Transition__Group__9 : rule__Transition__Group__9__Impl rule__Transition__Group__10 ;
    public final void rule__Transition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3686:1: ( rule__Transition__Group__9__Impl rule__Transition__Group__10 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3687:2: rule__Transition__Group__9__Impl rule__Transition__Group__10
            {
            pushFollow(FOLLOW_rule__Transition__Group__9__Impl_in_rule__Transition__Group__97403);
            rule__Transition__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__10_in_rule__Transition__Group__97406);
            rule__Transition__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__9"


    // $ANTLR start "rule__Transition__Group__9__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3694:1: rule__Transition__Group__9__Impl : ( ( rule__Transition__Group_9__0 )* ) ;
    public final void rule__Transition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3698:1: ( ( ( rule__Transition__Group_9__0 )* ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3699:1: ( ( rule__Transition__Group_9__0 )* )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3699:1: ( ( rule__Transition__Group_9__0 )* )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3700:1: ( rule__Transition__Group_9__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_9()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3701:1: ( rule__Transition__Group_9__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==46) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3701:2: rule__Transition__Group_9__0
            	    {
            	    pushFollow(FOLLOW_rule__Transition__Group_9__0_in_rule__Transition__Group__9__Impl7433);
            	    rule__Transition__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__9__Impl"


    // $ANTLR start "rule__Transition__Group__10"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3711:1: rule__Transition__Group__10 : rule__Transition__Group__10__Impl rule__Transition__Group__11 ;
    public final void rule__Transition__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3715:1: ( rule__Transition__Group__10__Impl rule__Transition__Group__11 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3716:2: rule__Transition__Group__10__Impl rule__Transition__Group__11
            {
            pushFollow(FOLLOW_rule__Transition__Group__10__Impl_in_rule__Transition__Group__107464);
            rule__Transition__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__11_in_rule__Transition__Group__107467);
            rule__Transition__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__10"


    // $ANTLR start "rule__Transition__Group__10__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3723:1: rule__Transition__Group__10__Impl : ( ( rule__Transition__Group_10__0 )? ) ;
    public final void rule__Transition__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3727:1: ( ( ( rule__Transition__Group_10__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3728:1: ( ( rule__Transition__Group_10__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3728:1: ( ( rule__Transition__Group_10__0 )? )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3729:1: ( rule__Transition__Group_10__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_10()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3730:1: ( rule__Transition__Group_10__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==47) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3730:2: rule__Transition__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_10__0_in_rule__Transition__Group__10__Impl7494);
                    rule__Transition__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__10__Impl"


    // $ANTLR start "rule__Transition__Group__11"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3740:1: rule__Transition__Group__11 : rule__Transition__Group__11__Impl rule__Transition__Group__12 ;
    public final void rule__Transition__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3744:1: ( rule__Transition__Group__11__Impl rule__Transition__Group__12 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3745:2: rule__Transition__Group__11__Impl rule__Transition__Group__12
            {
            pushFollow(FOLLOW_rule__Transition__Group__11__Impl_in_rule__Transition__Group__117525);
            rule__Transition__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__12_in_rule__Transition__Group__117528);
            rule__Transition__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__11"


    // $ANTLR start "rule__Transition__Group__11__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3752:1: rule__Transition__Group__11__Impl : ( ( rule__Transition__Group_11__0 )? ) ;
    public final void rule__Transition__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3756:1: ( ( ( rule__Transition__Group_11__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3757:1: ( ( rule__Transition__Group_11__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3757:1: ( ( rule__Transition__Group_11__0 )? )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3758:1: ( rule__Transition__Group_11__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_11()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3759:1: ( rule__Transition__Group_11__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==48) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3759:2: rule__Transition__Group_11__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_11__0_in_rule__Transition__Group__11__Impl7555);
                    rule__Transition__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__11__Impl"


    // $ANTLR start "rule__Transition__Group__12"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3769:1: rule__Transition__Group__12 : rule__Transition__Group__12__Impl ;
    public final void rule__Transition__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3773:1: ( rule__Transition__Group__12__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3774:2: rule__Transition__Group__12__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__12__Impl_in_rule__Transition__Group__127586);
            rule__Transition__Group__12__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__12"


    // $ANTLR start "rule__Transition__Group__12__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3780:1: rule__Transition__Group__12__Impl : ( '}' ) ;
    public final void rule__Transition__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3784:1: ( ( '}' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3785:1: ( '}' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3785:1: ( '}' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3786:1: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_12()); 
            match(input,15,FOLLOW_15_in_rule__Transition__Group__12__Impl7614); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__12__Impl"


    // $ANTLR start "rule__Transition__Group_9__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3825:1: rule__Transition__Group_9__0 : rule__Transition__Group_9__0__Impl rule__Transition__Group_9__1 ;
    public final void rule__Transition__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3829:1: ( rule__Transition__Group_9__0__Impl rule__Transition__Group_9__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3830:2: rule__Transition__Group_9__0__Impl rule__Transition__Group_9__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_9__0__Impl_in_rule__Transition__Group_9__07671);
            rule__Transition__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_9__1_in_rule__Transition__Group_9__07674);
            rule__Transition__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__0"


    // $ANTLR start "rule__Transition__Group_9__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3837:1: rule__Transition__Group_9__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3841:1: ( ( ',' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3842:1: ( ',' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3842:1: ( ',' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3843:1: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_9_0()); 
            match(input,46,FOLLOW_46_in_rule__Transition__Group_9__0__Impl7702); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__0__Impl"


    // $ANTLR start "rule__Transition__Group_9__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3856:1: rule__Transition__Group_9__1 : rule__Transition__Group_9__1__Impl ;
    public final void rule__Transition__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3860:1: ( rule__Transition__Group_9__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3861:2: rule__Transition__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_9__1__Impl_in_rule__Transition__Group_9__17733);
            rule__Transition__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__1"


    // $ANTLR start "rule__Transition__Group_9__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3867:1: rule__Transition__Group_9__1__Impl : ( ( rule__Transition__ActionAssignment_9_1 ) ) ;
    public final void rule__Transition__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3871:1: ( ( ( rule__Transition__ActionAssignment_9_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3872:1: ( ( rule__Transition__ActionAssignment_9_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3872:1: ( ( rule__Transition__ActionAssignment_9_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3873:1: ( rule__Transition__ActionAssignment_9_1 )
            {
             before(grammarAccess.getTransitionAccess().getActionAssignment_9_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3874:1: ( rule__Transition__ActionAssignment_9_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3874:2: rule__Transition__ActionAssignment_9_1
            {
            pushFollow(FOLLOW_rule__Transition__ActionAssignment_9_1_in_rule__Transition__Group_9__1__Impl7760);
            rule__Transition__ActionAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getActionAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_9__1__Impl"


    // $ANTLR start "rule__Transition__Group_10__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3888:1: rule__Transition__Group_10__0 : rule__Transition__Group_10__0__Impl rule__Transition__Group_10__1 ;
    public final void rule__Transition__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3892:1: ( rule__Transition__Group_10__0__Impl rule__Transition__Group_10__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3893:2: rule__Transition__Group_10__0__Impl rule__Transition__Group_10__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_10__0__Impl_in_rule__Transition__Group_10__07794);
            rule__Transition__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_10__1_in_rule__Transition__Group_10__07797);
            rule__Transition__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__0"


    // $ANTLR start "rule__Transition__Group_10__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3900:1: rule__Transition__Group_10__0__Impl : ( 'guard' ) ;
    public final void rule__Transition__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3904:1: ( ( 'guard' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3905:1: ( 'guard' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3905:1: ( 'guard' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3906:1: 'guard'
            {
             before(grammarAccess.getTransitionAccess().getGuardKeyword_10_0()); 
            match(input,47,FOLLOW_47_in_rule__Transition__Group_10__0__Impl7825); 
             after(grammarAccess.getTransitionAccess().getGuardKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__0__Impl"


    // $ANTLR start "rule__Transition__Group_10__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3919:1: rule__Transition__Group_10__1 : rule__Transition__Group_10__1__Impl rule__Transition__Group_10__2 ;
    public final void rule__Transition__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3923:1: ( rule__Transition__Group_10__1__Impl rule__Transition__Group_10__2 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3924:2: rule__Transition__Group_10__1__Impl rule__Transition__Group_10__2
            {
            pushFollow(FOLLOW_rule__Transition__Group_10__1__Impl_in_rule__Transition__Group_10__17856);
            rule__Transition__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_10__2_in_rule__Transition__Group_10__17859);
            rule__Transition__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__1"


    // $ANTLR start "rule__Transition__Group_10__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3931:1: rule__Transition__Group_10__1__Impl : ( ( rule__Transition__GuardAssignment_10_1 ) ) ;
    public final void rule__Transition__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3935:1: ( ( ( rule__Transition__GuardAssignment_10_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3936:1: ( ( rule__Transition__GuardAssignment_10_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3936:1: ( ( rule__Transition__GuardAssignment_10_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3937:1: ( rule__Transition__GuardAssignment_10_1 )
            {
             before(grammarAccess.getTransitionAccess().getGuardAssignment_10_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3938:1: ( rule__Transition__GuardAssignment_10_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3938:2: rule__Transition__GuardAssignment_10_1
            {
            pushFollow(FOLLOW_rule__Transition__GuardAssignment_10_1_in_rule__Transition__Group_10__1__Impl7886);
            rule__Transition__GuardAssignment_10_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGuardAssignment_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__1__Impl"


    // $ANTLR start "rule__Transition__Group_10__2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3948:1: rule__Transition__Group_10__2 : rule__Transition__Group_10__2__Impl ;
    public final void rule__Transition__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3952:1: ( rule__Transition__Group_10__2__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3953:2: rule__Transition__Group_10__2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_10__2__Impl_in_rule__Transition__Group_10__27916);
            rule__Transition__Group_10__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__2"


    // $ANTLR start "rule__Transition__Group_10__2__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3959:1: rule__Transition__Group_10__2__Impl : ( ( rule__Transition__Group_10_2__0 )* ) ;
    public final void rule__Transition__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3963:1: ( ( ( rule__Transition__Group_10_2__0 )* ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3964:1: ( ( rule__Transition__Group_10_2__0 )* )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3964:1: ( ( rule__Transition__Group_10_2__0 )* )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3965:1: ( rule__Transition__Group_10_2__0 )*
            {
             before(grammarAccess.getTransitionAccess().getGroup_10_2()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3966:1: ( rule__Transition__Group_10_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==46) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3966:2: rule__Transition__Group_10_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Transition__Group_10_2__0_in_rule__Transition__Group_10__2__Impl7943);
            	    rule__Transition__Group_10_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getTransitionAccess().getGroup_10_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10__2__Impl"


    // $ANTLR start "rule__Transition__Group_10_2__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3982:1: rule__Transition__Group_10_2__0 : rule__Transition__Group_10_2__0__Impl rule__Transition__Group_10_2__1 ;
    public final void rule__Transition__Group_10_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3986:1: ( rule__Transition__Group_10_2__0__Impl rule__Transition__Group_10_2__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3987:2: rule__Transition__Group_10_2__0__Impl rule__Transition__Group_10_2__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_10_2__0__Impl_in_rule__Transition__Group_10_2__07980);
            rule__Transition__Group_10_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_10_2__1_in_rule__Transition__Group_10_2__07983);
            rule__Transition__Group_10_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10_2__0"


    // $ANTLR start "rule__Transition__Group_10_2__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3994:1: rule__Transition__Group_10_2__0__Impl : ( ',' ) ;
    public final void rule__Transition__Group_10_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3998:1: ( ( ',' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3999:1: ( ',' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:3999:1: ( ',' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4000:1: ','
            {
             before(grammarAccess.getTransitionAccess().getCommaKeyword_10_2_0()); 
            match(input,46,FOLLOW_46_in_rule__Transition__Group_10_2__0__Impl8011); 
             after(grammarAccess.getTransitionAccess().getCommaKeyword_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10_2__0__Impl"


    // $ANTLR start "rule__Transition__Group_10_2__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4013:1: rule__Transition__Group_10_2__1 : rule__Transition__Group_10_2__1__Impl ;
    public final void rule__Transition__Group_10_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4017:1: ( rule__Transition__Group_10_2__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4018:2: rule__Transition__Group_10_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_10_2__1__Impl_in_rule__Transition__Group_10_2__18042);
            rule__Transition__Group_10_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10_2__1"


    // $ANTLR start "rule__Transition__Group_10_2__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4024:1: rule__Transition__Group_10_2__1__Impl : ( ( rule__Transition__GuardAssignment_10_2_1 ) ) ;
    public final void rule__Transition__Group_10_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4028:1: ( ( ( rule__Transition__GuardAssignment_10_2_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4029:1: ( ( rule__Transition__GuardAssignment_10_2_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4029:1: ( ( rule__Transition__GuardAssignment_10_2_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4030:1: ( rule__Transition__GuardAssignment_10_2_1 )
            {
             before(grammarAccess.getTransitionAccess().getGuardAssignment_10_2_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4031:1: ( rule__Transition__GuardAssignment_10_2_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4031:2: rule__Transition__GuardAssignment_10_2_1
            {
            pushFollow(FOLLOW_rule__Transition__GuardAssignment_10_2_1_in_rule__Transition__Group_10_2__1__Impl8069);
            rule__Transition__GuardAssignment_10_2_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGuardAssignment_10_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_10_2__1__Impl"


    // $ANTLR start "rule__Transition__Group_11__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4045:1: rule__Transition__Group_11__0 : rule__Transition__Group_11__0__Impl rule__Transition__Group_11__1 ;
    public final void rule__Transition__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4049:1: ( rule__Transition__Group_11__0__Impl rule__Transition__Group_11__1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4050:2: rule__Transition__Group_11__0__Impl rule__Transition__Group_11__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_11__0__Impl_in_rule__Transition__Group_11__08103);
            rule__Transition__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_11__1_in_rule__Transition__Group_11__08106);
            rule__Transition__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_11__0"


    // $ANTLR start "rule__Transition__Group_11__0__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4057:1: rule__Transition__Group_11__0__Impl : ( 'trigger' ) ;
    public final void rule__Transition__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4061:1: ( ( 'trigger' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4062:1: ( 'trigger' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4062:1: ( 'trigger' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4063:1: 'trigger'
            {
             before(grammarAccess.getTransitionAccess().getTriggerKeyword_11_0()); 
            match(input,48,FOLLOW_48_in_rule__Transition__Group_11__0__Impl8134); 
             after(grammarAccess.getTransitionAccess().getTriggerKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_11__0__Impl"


    // $ANTLR start "rule__Transition__Group_11__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4076:1: rule__Transition__Group_11__1 : rule__Transition__Group_11__1__Impl ;
    public final void rule__Transition__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4080:1: ( rule__Transition__Group_11__1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4081:2: rule__Transition__Group_11__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_11__1__Impl_in_rule__Transition__Group_11__18165);
            rule__Transition__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_11__1"


    // $ANTLR start "rule__Transition__Group_11__1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4087:1: rule__Transition__Group_11__1__Impl : ( ( rule__Transition__TriggerAssignment_11_1 ) ) ;
    public final void rule__Transition__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4091:1: ( ( ( rule__Transition__TriggerAssignment_11_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4092:1: ( ( rule__Transition__TriggerAssignment_11_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4092:1: ( ( rule__Transition__TriggerAssignment_11_1 ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4093:1: ( rule__Transition__TriggerAssignment_11_1 )
            {
             before(grammarAccess.getTransitionAccess().getTriggerAssignment_11_1()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4094:1: ( rule__Transition__TriggerAssignment_11_1 )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4094:2: rule__Transition__TriggerAssignment_11_1
            {
            pushFollow(FOLLOW_rule__Transition__TriggerAssignment_11_1_in_rule__Transition__Group_11__1__Impl8192);
            rule__Transition__TriggerAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getTriggerAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_11__1__Impl"


    // $ANTLR start "rule__State__UnorderedGroup_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4109:1: rule__State__UnorderedGroup_1 : ( rule__State__UnorderedGroup_1__0 )? ;
    public final void rule__State__UnorderedGroup_1() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getStateAccess().getUnorderedGroup_1());
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4114:1: ( ( rule__State__UnorderedGroup_1__0 )? )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4115:2: ( rule__State__UnorderedGroup_1__0 )?
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4115:2: ( rule__State__UnorderedGroup_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 1) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4115:2: rule__State__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_rule__State__UnorderedGroup_1__0_in_rule__State__UnorderedGroup_18227);
                    rule__State__UnorderedGroup_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getStateAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__UnorderedGroup_1"


    // $ANTLR start "rule__State__UnorderedGroup_1__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4125:1: rule__State__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__State__IsInitialAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__State__IsActiveAssignment_1_1 ) ) ) ) ) ;
    public final void rule__State__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4130:1: ( ( ({...}? => ( ( ( rule__State__IsInitialAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__State__IsActiveAssignment_1_1 ) ) ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4131:3: ( ({...}? => ( ( ( rule__State__IsInitialAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__State__IsActiveAssignment_1_1 ) ) ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4131:3: ( ({...}? => ( ( ( rule__State__IsInitialAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__State__IsActiveAssignment_1_1 ) ) ) ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 1) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4133:4: ({...}? => ( ( ( rule__State__IsInitialAssignment_1_0 ) ) ) )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4133:4: ({...}? => ( ( ( rule__State__IsInitialAssignment_1_0 ) ) ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4134:5: {...}? => ( ( ( rule__State__IsInitialAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__State__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 0)");
                    }
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4134:102: ( ( ( rule__State__IsInitialAssignment_1_0 ) ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4135:6: ( ( rule__State__IsInitialAssignment_1_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_1(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4141:6: ( ( rule__State__IsInitialAssignment_1_0 ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4143:7: ( rule__State__IsInitialAssignment_1_0 )
                    {
                     before(grammarAccess.getStateAccess().getIsInitialAssignment_1_0()); 
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4144:7: ( rule__State__IsInitialAssignment_1_0 )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4144:8: rule__State__IsInitialAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__State__IsInitialAssignment_1_0_in_rule__State__UnorderedGroup_1__Impl8314);
                    rule__State__IsInitialAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateAccess().getIsInitialAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4150:4: ({...}? => ( ( ( rule__State__IsActiveAssignment_1_1 ) ) ) )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4150:4: ({...}? => ( ( ( rule__State__IsActiveAssignment_1_1 ) ) ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4151:5: {...}? => ( ( ( rule__State__IsActiveAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__State__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 1)");
                    }
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4151:102: ( ( ( rule__State__IsActiveAssignment_1_1 ) ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4152:6: ( ( rule__State__IsActiveAssignment_1_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_1(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4158:6: ( ( rule__State__IsActiveAssignment_1_1 ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4160:7: ( rule__State__IsActiveAssignment_1_1 )
                    {
                     before(grammarAccess.getStateAccess().getIsActiveAssignment_1_1()); 
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4161:7: ( rule__State__IsActiveAssignment_1_1 )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4161:8: rule__State__IsActiveAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__State__IsActiveAssignment_1_1_in_rule__State__UnorderedGroup_1__Impl8405);
                    rule__State__IsActiveAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getStateAccess().getIsActiveAssignment_1_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__State__UnorderedGroup_1__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4176:1: rule__State__UnorderedGroup_1__0 : rule__State__UnorderedGroup_1__Impl ( rule__State__UnorderedGroup_1__1 )? ;
    public final void rule__State__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4180:1: ( rule__State__UnorderedGroup_1__Impl ( rule__State__UnorderedGroup_1__1 )? )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4181:2: rule__State__UnorderedGroup_1__Impl ( rule__State__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup_1__Impl_in_rule__State__UnorderedGroup_1__08464);
            rule__State__UnorderedGroup_1__Impl();

            state._fsp--;

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4182:2: ( rule__State__UnorderedGroup_1__1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 ==49 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 ==50 && getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_1(), 1) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4182:2: rule__State__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_rule__State__UnorderedGroup_1__1_in_rule__State__UnorderedGroup_1__08467);
                    rule__State__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__UnorderedGroup_1__0"


    // $ANTLR start "rule__State__UnorderedGroup_1__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4189:1: rule__State__UnorderedGroup_1__1 : rule__State__UnorderedGroup_1__Impl ;
    public final void rule__State__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4193:1: ( rule__State__UnorderedGroup_1__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4194:2: rule__State__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_rule__State__UnorderedGroup_1__Impl_in_rule__State__UnorderedGroup_1__18492);
            rule__State__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__UnorderedGroup_1__1"


    // $ANTLR start "rule__Transition__UnorderedGroup_2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4205:1: rule__Transition__UnorderedGroup_2 : ( rule__Transition__UnorderedGroup_2__0 )? ;
    public final void rule__Transition__UnorderedGroup_2() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getTransitionAccess().getUnorderedGroup_2());
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4210:1: ( ( rule__Transition__UnorderedGroup_2__0 )? )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4211:2: ( rule__Transition__UnorderedGroup_2__0 )?
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4211:2: ( rule__Transition__UnorderedGroup_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 1) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4211:2: rule__Transition__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_rule__Transition__UnorderedGroup_2__0_in_rule__Transition__UnorderedGroup_28520);
                    rule__Transition__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getTransitionAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__UnorderedGroup_2"


    // $ANTLR start "rule__Transition__UnorderedGroup_2__Impl"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4221:1: rule__Transition__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Transition__IsEnabledAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Transition__IsFireableAssignment_2_1 ) ) ) ) ) ;
    public final void rule__Transition__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4226:1: ( ( ({...}? => ( ( ( rule__Transition__IsEnabledAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Transition__IsFireableAssignment_2_1 ) ) ) ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4227:3: ( ({...}? => ( ( ( rule__Transition__IsEnabledAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Transition__IsFireableAssignment_2_1 ) ) ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4227:3: ( ({...}? => ( ( ( rule__Transition__IsEnabledAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__Transition__IsFireableAssignment_2_1 ) ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 1) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4229:4: ({...}? => ( ( ( rule__Transition__IsEnabledAssignment_2_0 ) ) ) )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4229:4: ({...}? => ( ( ( rule__Transition__IsEnabledAssignment_2_0 ) ) ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4230:5: {...}? => ( ( ( rule__Transition__IsEnabledAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Transition__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 0)");
                    }
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4230:107: ( ( ( rule__Transition__IsEnabledAssignment_2_0 ) ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4231:6: ( ( rule__Transition__IsEnabledAssignment_2_0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4237:6: ( ( rule__Transition__IsEnabledAssignment_2_0 ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4239:7: ( rule__Transition__IsEnabledAssignment_2_0 )
                    {
                     before(grammarAccess.getTransitionAccess().getIsEnabledAssignment_2_0()); 
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4240:7: ( rule__Transition__IsEnabledAssignment_2_0 )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4240:8: rule__Transition__IsEnabledAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Transition__IsEnabledAssignment_2_0_in_rule__Transition__UnorderedGroup_2__Impl8607);
                    rule__Transition__IsEnabledAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getIsEnabledAssignment_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4246:4: ({...}? => ( ( ( rule__Transition__IsFireableAssignment_2_1 ) ) ) )
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4246:4: ({...}? => ( ( ( rule__Transition__IsFireableAssignment_2_1 ) ) ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4247:5: {...}? => ( ( ( rule__Transition__IsFireableAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Transition__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 1)");
                    }
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4247:107: ( ( ( rule__Transition__IsFireableAssignment_2_1 ) ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4248:6: ( ( rule__Transition__IsFireableAssignment_2_1 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4254:6: ( ( rule__Transition__IsFireableAssignment_2_1 ) )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4256:7: ( rule__Transition__IsFireableAssignment_2_1 )
                    {
                     before(grammarAccess.getTransitionAccess().getIsFireableAssignment_2_1()); 
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4257:7: ( rule__Transition__IsFireableAssignment_2_1 )
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4257:8: rule__Transition__IsFireableAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Transition__IsFireableAssignment_2_1_in_rule__Transition__UnorderedGroup_2__Impl8698);
                    rule__Transition__IsFireableAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getTransitionAccess().getIsFireableAssignment_2_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getTransitionAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Transition__UnorderedGroup_2__0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4272:1: rule__Transition__UnorderedGroup_2__0 : rule__Transition__UnorderedGroup_2__Impl ( rule__Transition__UnorderedGroup_2__1 )? ;
    public final void rule__Transition__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4276:1: ( rule__Transition__UnorderedGroup_2__Impl ( rule__Transition__UnorderedGroup_2__1 )? )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4277:2: rule__Transition__UnorderedGroup_2__Impl ( rule__Transition__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_rule__Transition__UnorderedGroup_2__Impl_in_rule__Transition__UnorderedGroup_2__08757);
            rule__Transition__UnorderedGroup_2__Impl();

            state._fsp--;

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4278:2: ( rule__Transition__UnorderedGroup_2__1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 ==51 && getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 ==52 && getUnorderedGroupHelper().canSelect(grammarAccess.getTransitionAccess().getUnorderedGroup_2(), 1) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4278:2: rule__Transition__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_rule__Transition__UnorderedGroup_2__1_in_rule__Transition__UnorderedGroup_2__08760);
                    rule__Transition__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__UnorderedGroup_2__0"


    // $ANTLR start "rule__Transition__UnorderedGroup_2__1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4285:1: rule__Transition__UnorderedGroup_2__1 : rule__Transition__UnorderedGroup_2__Impl ;
    public final void rule__Transition__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4289:1: ( rule__Transition__UnorderedGroup_2__Impl )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4290:2: rule__Transition__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_rule__Transition__UnorderedGroup_2__Impl_in_rule__Transition__UnorderedGroup_2__18785);
            rule__Transition__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__UnorderedGroup_2__1"


    // $ANTLR start "rule__StateMachineBehavioralModel__IncludesAssignment_1_0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4301:1: rule__StateMachineBehavioralModel__IncludesAssignment_1_0 : ( ruleInclude ) ;
    public final void rule__StateMachineBehavioralModel__IncludesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4305:1: ( ( ruleInclude ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4306:1: ( ruleInclude )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4306:1: ( ruleInclude )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4307:1: ruleInclude
            {
             before(grammarAccess.getStateMachineBehavioralModelAccess().getIncludesIncludeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleInclude_in_rule__StateMachineBehavioralModel__IncludesAssignment_1_08817);
            ruleInclude();

            state._fsp--;

             after(grammarAccess.getStateMachineBehavioralModelAccess().getIncludesIncludeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachineBehavioralModel__IncludesAssignment_1_0"


    // $ANTLR start "rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4316:1: rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1 : ( ruleStateMachine ) ;
    public final void rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4320:1: ( ( ruleStateMachine ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4321:1: ( ruleStateMachine )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4321:1: ( ruleStateMachine )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4322:1: ruleStateMachine
            {
             before(grammarAccess.getStateMachineBehavioralModelAccess().getStatemachinesStateMachineParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleStateMachine_in_rule__StateMachineBehavioralModel__StatemachinesAssignment_1_18848);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineBehavioralModelAccess().getStatemachinesStateMachineParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1"


    // $ANTLR start "rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4331:1: rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2 : ( ruleStateMachine ) ;
    public final void rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4335:1: ( ( ruleStateMachine ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4336:1: ( ruleStateMachine )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4336:1: ( ruleStateMachine )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4337:1: ruleStateMachine
            {
             before(grammarAccess.getStateMachineBehavioralModelAccess().getStatemachinesStateMachineParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleStateMachine_in_rule__StateMachineBehavioralModel__StatemachinesAssignment_1_28879);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineBehavioralModelAccess().getStatemachinesStateMachineParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2"


    // $ANTLR start "rule__Include__FilenameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4346:1: rule__Include__FilenameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Include__FilenameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4350:1: ( ( RULE_STRING ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4351:1: ( RULE_STRING )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4351:1: ( RULE_STRING )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4352:1: RULE_STRING
            {
             before(grammarAccess.getIncludeAccess().getFilenameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Include__FilenameAssignment_18910); 
             after(grammarAccess.getIncludeAccess().getFilenameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Include__FilenameAssignment_1"


    // $ANTLR start "rule__StateMachine__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4361:1: rule__StateMachine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StateMachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4365:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4366:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4366:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4367:1: RULE_ID
            {
             before(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateMachine__NameAssignment_18941); 
             after(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NameAssignment_1"


    // $ANTLR start "rule__StateMachine__ReferredObjectAssignment_3"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4376:1: rule__StateMachine__ReferredObjectAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__StateMachine__ReferredObjectAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4380:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4381:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4381:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4382:1: ( RULE_ID )
            {
             before(grammarAccess.getStateMachineAccess().getReferredObjectRDMElementCrossReference_3_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4383:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4384:1: RULE_ID
            {
             before(grammarAccess.getStateMachineAccess().getReferredObjectRDMElementIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__StateMachine__ReferredObjectAssignment_38976); 
             after(grammarAccess.getStateMachineAccess().getReferredObjectRDMElementIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getStateMachineAccess().getReferredObjectRDMElementCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__ReferredObjectAssignment_3"


    // $ANTLR start "rule__StateMachine__ActionsAssignment_5_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4395:1: rule__StateMachine__ActionsAssignment_5_1 : ( ruleAction ) ;
    public final void rule__StateMachine__ActionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4399:1: ( ( ruleAction ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4400:1: ( ruleAction )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4400:1: ( ruleAction )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4401:1: ruleAction
            {
             before(grammarAccess.getStateMachineAccess().getActionsActionParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__StateMachine__ActionsAssignment_5_19011);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getActionsActionParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__ActionsAssignment_5_1"


    // $ANTLR start "rule__StateMachine__GuardsAssignment_6_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4410:1: rule__StateMachine__GuardsAssignment_6_1 : ( ruleGuard ) ;
    public final void rule__StateMachine__GuardsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4414:1: ( ( ruleGuard ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4415:1: ( ruleGuard )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4415:1: ( ruleGuard )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4416:1: ruleGuard
            {
             before(grammarAccess.getStateMachineAccess().getGuardsGuardParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleGuard_in_rule__StateMachine__GuardsAssignment_6_19042);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getGuardsGuardParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__GuardsAssignment_6_1"


    // $ANTLR start "rule__StateMachine__TriggersAssignment_7_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4425:1: rule__StateMachine__TriggersAssignment_7_1 : ( ruleTrigger ) ;
    public final void rule__StateMachine__TriggersAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4429:1: ( ( ruleTrigger ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4430:1: ( ruleTrigger )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4430:1: ( ruleTrigger )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4431:1: ruleTrigger
            {
             before(grammarAccess.getStateMachineAccess().getTriggersTriggerParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleTrigger_in_rule__StateMachine__TriggersAssignment_7_19073);
            ruleTrigger();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTriggersTriggerParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TriggersAssignment_7_1"


    // $ANTLR start "rule__StateMachine__StatesAssignment_8_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4440:1: rule__StateMachine__StatesAssignment_8_1 : ( ruleState ) ;
    public final void rule__StateMachine__StatesAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4444:1: ( ( ruleState ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4445:1: ( ruleState )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4445:1: ( ruleState )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4446:1: ruleState
            {
             before(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_ruleState_in_rule__StateMachine__StatesAssignment_8_19104);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getStatesStateParserRuleCall_8_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__StatesAssignment_8_1"


    // $ANTLR start "rule__StateMachine__TransitionsAssignment_9_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4455:1: rule__StateMachine__TransitionsAssignment_9_1 : ( ruleTransition ) ;
    public final void rule__StateMachine__TransitionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4459:1: ( ( ruleTransition ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4460:1: ( ruleTransition )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4460:1: ( ruleTransition )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4461:1: ruleTransition
            {
             before(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_9_19135);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getTransitionsTransitionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__TransitionsAssignment_9_1"


    // $ANTLR start "rule__ActionExpression_Impl__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4470:1: rule__ActionExpression_Impl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ActionExpression_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4474:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4475:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4475:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4476:1: RULE_ID
            {
             before(grammarAccess.getActionExpression_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ActionExpression_Impl__NameAssignment_19166); 
             after(grammarAccess.getActionExpression_ImplAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression_Impl__NameAssignment_1"


    // $ANTLR start "rule__ActionExpression_Impl__ExpressionAssignment_3"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4485:1: rule__ActionExpression_Impl__ExpressionAssignment_3 : ( ruleEString ) ;
    public final void rule__ActionExpression_Impl__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4489:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4490:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4490:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4491:1: ruleEString
            {
             before(grammarAccess.getActionExpression_ImplAccess().getExpressionEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ActionExpression_Impl__ExpressionAssignment_39197);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getActionExpression_ImplAccess().getExpressionEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionExpression_Impl__ExpressionAssignment_3"


    // $ANTLR start "rule__ChangeTrainCurrentTrackElement__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4500:1: rule__ChangeTrainCurrentTrackElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ChangeTrainCurrentTrackElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4504:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4505:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4505:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4506:1: ruleEString
            {
             before(grammarAccess.getChangeTrainCurrentTrackElementAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ChangeTrainCurrentTrackElement__NameAssignment_19228);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChangeTrainCurrentTrackElementAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTrainCurrentTrackElement__NameAssignment_1"


    // $ANTLR start "rule__ChangeTurnoutDirection__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4515:1: rule__ChangeTurnoutDirection__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ChangeTurnoutDirection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4519:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4520:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4520:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4521:1: ruleEString
            {
             before(grammarAccess.getChangeTurnoutDirectionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ChangeTurnoutDirection__NameAssignment_19259);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChangeTurnoutDirectionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTurnoutDirection__NameAssignment_1"


    // $ANTLR start "rule__ChangeSignalAllowedSpeed__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4530:1: rule__ChangeSignalAllowedSpeed__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ChangeSignalAllowedSpeed__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4534:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4535:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4535:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4536:1: ruleEString
            {
             before(grammarAccess.getChangeSignalAllowedSpeedAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ChangeSignalAllowedSpeed__NameAssignment_19290);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChangeSignalAllowedSpeedAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeSignalAllowedSpeed__NameAssignment_1"


    // $ANTLR start "rule__ChangeTrainHeadingSpeed__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4545:1: rule__ChangeTrainHeadingSpeed__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ChangeTrainHeadingSpeed__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4549:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4550:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4550:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4551:1: ruleEString
            {
             before(grammarAccess.getChangeTrainHeadingSpeedAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__ChangeTrainHeadingSpeed__NameAssignment_19321);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getChangeTrainHeadingSpeedAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChangeTrainHeadingSpeed__NameAssignment_1"


    // $ANTLR start "rule__TrainHeadingSpeedChanged__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4560:1: rule__TrainHeadingSpeedChanged__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TrainHeadingSpeedChanged__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4564:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4565:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4565:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4566:1: ruleEString
            {
             before(grammarAccess.getTrainHeadingSpeedChangedAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__TrainHeadingSpeedChanged__NameAssignment_19352);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTrainHeadingSpeedChangedAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainHeadingSpeedChanged__NameAssignment_1"


    // $ANTLR start "rule__TrainTrackElementChanged__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4575:1: rule__TrainTrackElementChanged__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TrainTrackElementChanged__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4579:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4580:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4580:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4581:1: ruleEString
            {
             before(grammarAccess.getTrainTrackElementChangedAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__TrainTrackElementChanged__NameAssignment_19383);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTrainTrackElementChangedAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainTrackElementChanged__NameAssignment_1"


    // $ANTLR start "rule__SignalAllowedSpeedChanged__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4590:1: rule__SignalAllowedSpeedChanged__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SignalAllowedSpeedChanged__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4594:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4595:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4595:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4596:1: ruleEString
            {
             before(grammarAccess.getSignalAllowedSpeedChangedAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__SignalAllowedSpeedChanged__NameAssignment_19414);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignalAllowedSpeedChangedAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalAllowedSpeedChanged__NameAssignment_1"


    // $ANTLR start "rule__TurnoutDirectionChanged__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4605:1: rule__TurnoutDirectionChanged__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TurnoutDirectionChanged__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4609:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4610:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4610:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4611:1: ruleEString
            {
             before(grammarAccess.getTurnoutDirectionChangedAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__TurnoutDirectionChanged__NameAssignment_19445);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTurnoutDirectionChangedAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutDirectionChanged__NameAssignment_1"


    // $ANTLR start "rule__TriggerExpression_Impl__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4620:1: rule__TriggerExpression_Impl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TriggerExpression_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4624:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4625:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4625:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4626:1: RULE_ID
            {
             before(grammarAccess.getTriggerExpression_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TriggerExpression_Impl__NameAssignment_19476); 
             after(grammarAccess.getTriggerExpression_ImplAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerExpression_Impl__NameAssignment_1"


    // $ANTLR start "rule__TriggerExpression_Impl__ExpressionAssignment_3"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4635:1: rule__TriggerExpression_Impl__ExpressionAssignment_3 : ( ruleEString ) ;
    public final void rule__TriggerExpression_Impl__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4639:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4640:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4640:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4641:1: ruleEString
            {
             before(grammarAccess.getTriggerExpression_ImplAccess().getExpressionEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__TriggerExpression_Impl__ExpressionAssignment_39507);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTriggerExpression_ImplAccess().getExpressionEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerExpression_Impl__ExpressionAssignment_3"


    // $ANTLR start "rule__TrainCurrentHeadingSpeed__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4650:1: rule__TrainCurrentHeadingSpeed__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TrainCurrentHeadingSpeed__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4654:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4655:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4655:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4656:1: ruleEString
            {
             before(grammarAccess.getTrainCurrentHeadingSpeedAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__TrainCurrentHeadingSpeed__NameAssignment_19538);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTrainCurrentHeadingSpeedAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainCurrentHeadingSpeed__NameAssignment_1"


    // $ANTLR start "rule__TrainCurrentlyStandsOn__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4665:1: rule__TrainCurrentlyStandsOn__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TrainCurrentlyStandsOn__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4669:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4670:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4670:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4671:1: ruleEString
            {
             before(grammarAccess.getTrainCurrentlyStandsOnAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__TrainCurrentlyStandsOn__NameAssignment_19569);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTrainCurrentlyStandsOnAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrainCurrentlyStandsOn__NameAssignment_1"


    // $ANTLR start "rule__TurnoutCurrentDirection__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4680:1: rule__TurnoutCurrentDirection__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TurnoutCurrentDirection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4684:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4685:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4685:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4686:1: ruleEString
            {
             before(grammarAccess.getTurnoutCurrentDirectionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__TurnoutCurrentDirection__NameAssignment_19600);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTurnoutCurrentDirectionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutCurrentDirection__NameAssignment_1"


    // $ANTLR start "rule__SignalCurrentAllowedSpeed__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4695:1: rule__SignalCurrentAllowedSpeed__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__SignalCurrentAllowedSpeed__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4699:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4700:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4700:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4701:1: ruleEString
            {
             before(grammarAccess.getSignalCurrentAllowedSpeedAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__SignalCurrentAllowedSpeed__NameAssignment_19631);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSignalCurrentAllowedSpeedAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SignalCurrentAllowedSpeed__NameAssignment_1"


    // $ANTLR start "rule__NextTrackElementIs__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4710:1: rule__NextTrackElementIs__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__NextTrackElementIs__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4714:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4715:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4715:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4716:1: ruleEString
            {
             before(grammarAccess.getNextTrackElementIsAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__NextTrackElementIs__NameAssignment_19662);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNextTrackElementIsAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NextTrackElementIs__NameAssignment_1"


    // $ANTLR start "rule__TurnoutHasDesiredDirection__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4725:1: rule__TurnoutHasDesiredDirection__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__TurnoutHasDesiredDirection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4729:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4730:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4730:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4731:1: ruleEString
            {
             before(grammarAccess.getTurnoutHasDesiredDirectionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__TurnoutHasDesiredDirection__NameAssignment_19693);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTurnoutHasDesiredDirectionAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TurnoutHasDesiredDirection__NameAssignment_1"


    // $ANTLR start "rule__GuardExpression_Impl__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4740:1: rule__GuardExpression_Impl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__GuardExpression_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4744:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4745:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4745:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4746:1: RULE_ID
            {
             before(grammarAccess.getGuardExpression_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__GuardExpression_Impl__NameAssignment_19724); 
             after(grammarAccess.getGuardExpression_ImplAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardExpression_Impl__NameAssignment_1"


    // $ANTLR start "rule__GuardExpression_Impl__ExpressionAssignment_3"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4755:1: rule__GuardExpression_Impl__ExpressionAssignment_3 : ( ruleEString ) ;
    public final void rule__GuardExpression_Impl__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4759:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4760:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4760:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4761:1: ruleEString
            {
             before(grammarAccess.getGuardExpression_ImplAccess().getExpressionEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__GuardExpression_Impl__ExpressionAssignment_39755);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getGuardExpression_ImplAccess().getExpressionEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GuardExpression_Impl__ExpressionAssignment_3"


    // $ANTLR start "rule__State__NameAssignment_0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4770:1: rule__State__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4774:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4775:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4775:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4776:1: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__State__NameAssignment_09786); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_0"


    // $ANTLR start "rule__State__IsInitialAssignment_1_0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4785:1: rule__State__IsInitialAssignment_1_0 : ( ( 'is Initial' ) ) ;
    public final void rule__State__IsInitialAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4789:1: ( ( ( 'is Initial' ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4790:1: ( ( 'is Initial' ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4790:1: ( ( 'is Initial' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4791:1: ( 'is Initial' )
            {
             before(grammarAccess.getStateAccess().getIsInitialIsInitialKeyword_1_0_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4792:1: ( 'is Initial' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4793:1: 'is Initial'
            {
             before(grammarAccess.getStateAccess().getIsInitialIsInitialKeyword_1_0_0()); 
            match(input,49,FOLLOW_49_in_rule__State__IsInitialAssignment_1_09822); 
             after(grammarAccess.getStateAccess().getIsInitialIsInitialKeyword_1_0_0()); 

            }

             after(grammarAccess.getStateAccess().getIsInitialIsInitialKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__IsInitialAssignment_1_0"


    // $ANTLR start "rule__State__IsActiveAssignment_1_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4808:1: rule__State__IsActiveAssignment_1_1 : ( ( 'is Active' ) ) ;
    public final void rule__State__IsActiveAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4812:1: ( ( ( 'is Active' ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4813:1: ( ( 'is Active' ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4813:1: ( ( 'is Active' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4814:1: ( 'is Active' )
            {
             before(grammarAccess.getStateAccess().getIsActiveIsActiveKeyword_1_1_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4815:1: ( 'is Active' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4816:1: 'is Active'
            {
             before(grammarAccess.getStateAccess().getIsActiveIsActiveKeyword_1_1_0()); 
            match(input,50,FOLLOW_50_in_rule__State__IsActiveAssignment_1_19866); 
             after(grammarAccess.getStateAccess().getIsActiveIsActiveKeyword_1_1_0()); 

            }

             after(grammarAccess.getStateAccess().getIsActiveIsActiveKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__IsActiveAssignment_1_1"


    // $ANTLR start "rule__Transition__NameAssignment_0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4831:1: rule__Transition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4835:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4836:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4836:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4837:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__NameAssignment_09905); 
             after(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_0"


    // $ANTLR start "rule__Transition__IsEnabledAssignment_2_0"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4846:1: rule__Transition__IsEnabledAssignment_2_0 : ( ( 'is Enabled' ) ) ;
    public final void rule__Transition__IsEnabledAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4850:1: ( ( ( 'is Enabled' ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4851:1: ( ( 'is Enabled' ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4851:1: ( ( 'is Enabled' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4852:1: ( 'is Enabled' )
            {
             before(grammarAccess.getTransitionAccess().getIsEnabledIsEnabledKeyword_2_0_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4853:1: ( 'is Enabled' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4854:1: 'is Enabled'
            {
             before(grammarAccess.getTransitionAccess().getIsEnabledIsEnabledKeyword_2_0_0()); 
            match(input,51,FOLLOW_51_in_rule__Transition__IsEnabledAssignment_2_09941); 
             after(grammarAccess.getTransitionAccess().getIsEnabledIsEnabledKeyword_2_0_0()); 

            }

             after(grammarAccess.getTransitionAccess().getIsEnabledIsEnabledKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__IsEnabledAssignment_2_0"


    // $ANTLR start "rule__Transition__IsFireableAssignment_2_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4869:1: rule__Transition__IsFireableAssignment_2_1 : ( ( 'is Fireable' ) ) ;
    public final void rule__Transition__IsFireableAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4873:1: ( ( ( 'is Fireable' ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4874:1: ( ( 'is Fireable' ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4874:1: ( ( 'is Fireable' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4875:1: ( 'is Fireable' )
            {
             before(grammarAccess.getTransitionAccess().getIsFireableIsFireableKeyword_2_1_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4876:1: ( 'is Fireable' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4877:1: 'is Fireable'
            {
             before(grammarAccess.getTransitionAccess().getIsFireableIsFireableKeyword_2_1_0()); 
            match(input,52,FOLLOW_52_in_rule__Transition__IsFireableAssignment_2_19985); 
             after(grammarAccess.getTransitionAccess().getIsFireableIsFireableKeyword_2_1_0()); 

            }

             after(grammarAccess.getTransitionAccess().getIsFireableIsFireableKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__IsFireableAssignment_2_1"


    // $ANTLR start "rule__Transition__SourceStateAssignment_4"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4892:1: rule__Transition__SourceStateAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__SourceStateAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4896:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4897:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4897:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4898:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getSourceStateStateCrossReference_4_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4899:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4900:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getSourceStateStateIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__SourceStateAssignment_410028); 
             after(grammarAccess.getTransitionAccess().getSourceStateStateIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getSourceStateStateCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__SourceStateAssignment_4"


    // $ANTLR start "rule__Transition__TargetStateAssignment_6"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4911:1: rule__Transition__TargetStateAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TargetStateAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4915:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4916:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4916:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4917:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_6_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4918:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4919:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTargetStateStateIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__TargetStateAssignment_610067); 
             after(grammarAccess.getTransitionAccess().getTargetStateStateIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTargetStateStateCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TargetStateAssignment_6"


    // $ANTLR start "rule__Transition__ActionAssignment_8"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4930:1: rule__Transition__ActionAssignment_8 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__ActionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4934:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4935:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4935:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4936:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getActionActionCrossReference_8_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4937:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4938:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getActionActionIDTerminalRuleCall_8_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__ActionAssignment_810106); 
             after(grammarAccess.getTransitionAccess().getActionActionIDTerminalRuleCall_8_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getActionActionCrossReference_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ActionAssignment_8"


    // $ANTLR start "rule__Transition__ActionAssignment_9_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4949:1: rule__Transition__ActionAssignment_9_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__ActionAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4953:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4954:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4954:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4955:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getActionActionCrossReference_9_1_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4956:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4957:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getActionActionIDTerminalRuleCall_9_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__ActionAssignment_9_110145); 
             after(grammarAccess.getTransitionAccess().getActionActionIDTerminalRuleCall_9_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getActionActionCrossReference_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__ActionAssignment_9_1"


    // $ANTLR start "rule__Transition__GuardAssignment_10_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4968:1: rule__Transition__GuardAssignment_10_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__GuardAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4972:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4973:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4973:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4974:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getGuardGuardCrossReference_10_1_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4975:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4976:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getGuardGuardIDTerminalRuleCall_10_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__GuardAssignment_10_110184); 
             after(grammarAccess.getTransitionAccess().getGuardGuardIDTerminalRuleCall_10_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getGuardGuardCrossReference_10_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__GuardAssignment_10_1"


    // $ANTLR start "rule__Transition__GuardAssignment_10_2_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4987:1: rule__Transition__GuardAssignment_10_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__GuardAssignment_10_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4991:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4992:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4992:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4993:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getGuardGuardCrossReference_10_2_1_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4994:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:4995:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getGuardGuardIDTerminalRuleCall_10_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__GuardAssignment_10_2_110223); 
             after(grammarAccess.getTransitionAccess().getGuardGuardIDTerminalRuleCall_10_2_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getGuardGuardCrossReference_10_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__GuardAssignment_10_2_1"


    // $ANTLR start "rule__Transition__TriggerAssignment_11_1"
    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5006:1: rule__Transition__TriggerAssignment_11_1 : ( ( RULE_ID ) ) ;
    public final void rule__Transition__TriggerAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5010:1: ( ( ( RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5011:1: ( ( RULE_ID ) )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5011:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5012:1: ( RULE_ID )
            {
             before(grammarAccess.getTransitionAccess().getTriggerTriggerCrossReference_11_1_0()); 
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5013:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5014:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getTriggerTriggerIDTerminalRuleCall_11_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__TriggerAssignment_11_110262); 
             after(grammarAccess.getTransitionAccess().getTriggerTriggerIDTerminalRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getTransitionAccess().getTriggerTriggerCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__TriggerAssignment_11_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleStateMachineBehavioralModel_in_entryRuleStateMachineBehavioralModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateMachineBehavioralModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachineBehavioralModel__Group__0_in_ruleStateMachineBehavioralModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_entryRuleInclude121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInclude128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0_in_ruleInclude154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateMachine_in_entryRuleStateMachine181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStateMachine188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__0_in_ruleStateMachine214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Alternatives_in_ruleAction334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_Impl_in_entryRuleActionExpression_Impl361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActionExpression_Impl368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionExpression_Impl__Group__0_in_ruleActionExpression_Impl394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeTrainCurrentTrackElement_in_entryRuleChangeTrainCurrentTrackElement421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeTrainCurrentTrackElement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeTrainCurrentTrackElement__Group__0_in_ruleChangeTrainCurrentTrackElement454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeTurnoutDirection_in_entryRuleChangeTurnoutDirection481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeTurnoutDirection488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeTurnoutDirection__Group__0_in_ruleChangeTurnoutDirection514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeSignalAllowedSpeed_in_entryRuleChangeSignalAllowedSpeed541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeSignalAllowedSpeed548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeSignalAllowedSpeed__Group__0_in_ruleChangeSignalAllowedSpeed574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeTrainHeadingSpeed_in_entryRuleChangeTrainHeadingSpeed601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleChangeTrainHeadingSpeed608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeTrainHeadingSpeed__Group__0_in_ruleChangeTrainHeadingSpeed634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_entryRuleTrigger661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrigger668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trigger__Alternatives_in_ruleTrigger694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainHeadingSpeedChanged_in_entryRuleTrainHeadingSpeedChanged721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrainHeadingSpeedChanged728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainHeadingSpeedChanged__Group__0_in_ruleTrainHeadingSpeedChanged754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainTrackElementChanged_in_entryRuleTrainTrackElementChanged781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrainTrackElementChanged788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainTrackElementChanged__Group__0_in_ruleTrainTrackElementChanged814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalAllowedSpeedChanged_in_entryRuleSignalAllowedSpeedChanged841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalAllowedSpeedChanged848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalAllowedSpeedChanged__Group__0_in_ruleSignalAllowedSpeedChanged874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutDirectionChanged_in_entryRuleTurnoutDirectionChanged901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnoutDirectionChanged908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutDirectionChanged__Group__0_in_ruleTurnoutDirectionChanged934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerExpression_Impl_in_entryRuleTriggerExpression_Impl961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTriggerExpression_Impl968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TriggerExpression_Impl__Group__0_in_ruleTriggerExpression_Impl994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_entryRuleGuard1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuard1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Guard__Alternatives_in_ruleGuard1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainCurrentHeadingSpeed_in_entryRuleTrainCurrentHeadingSpeed1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrainCurrentHeadingSpeed1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainCurrentHeadingSpeed__Group__0_in_ruleTrainCurrentHeadingSpeed1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainCurrentlyStandsOn_in_entryRuleTrainCurrentlyStandsOn1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrainCurrentlyStandsOn1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainCurrentlyStandsOn__Group__0_in_ruleTrainCurrentlyStandsOn1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutCurrentDirection_in_entryRuleTurnoutCurrentDirection1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnoutCurrentDirection1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutCurrentDirection__Group__0_in_ruleTurnoutCurrentDirection1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalCurrentAllowedSpeed_in_entryRuleSignalCurrentAllowedSpeed1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignalCurrentAllowedSpeed1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalCurrentAllowedSpeed__Group__0_in_ruleSignalCurrentAllowedSpeed1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextTrackElementIs_in_entryRuleNextTrackElementIs1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNextTrackElementIs1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextTrackElementIs__Group__0_in_ruleNextTrackElementIs1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutHasDesiredDirection_in_entryRuleTurnoutHasDesiredDirection1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnoutHasDesiredDirection1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutHasDesiredDirection__Group__0_in_ruleTurnoutHasDesiredDirection1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuardExpression_Impl_in_entryRuleGuardExpression_Impl1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGuardExpression_Impl1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuardExpression_Impl__Group__0_in_ruleGuardExpression_Impl1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_entryRuleState1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleState1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0_in_ruleState1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeTrainHeadingSpeed_in_rule__Action__Alternatives1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeSignalAllowedSpeed_in_rule__Action__Alternatives1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeTurnoutDirection_in_rule__Action__Alternatives1713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleChangeTrainCurrentTrackElement_in_rule__Action__Alternatives1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActionExpression_Impl_in_rule__Action__Alternatives1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainHeadingSpeedChanged_in_rule__Trigger__Alternatives1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainTrackElementChanged_in_rule__Trigger__Alternatives1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalAllowedSpeedChanged_in_rule__Trigger__Alternatives1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutDirectionChanged_in_rule__Trigger__Alternatives1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTriggerExpression_Impl_in_rule__Trigger__Alternatives1847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainCurrentHeadingSpeed_in_rule__Guard__Alternatives1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrainCurrentlyStandsOn_in_rule__Guard__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutCurrentDirection_in_rule__Guard__Alternatives1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignalCurrentAllowedSpeed_in_rule__Guard__Alternatives1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNextTrackElementIs_in_rule__Guard__Alternatives1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutHasDesiredDirection_in_rule__Guard__Alternatives1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuardExpression_Impl_in_rule__Guard__Alternatives1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachineBehavioralModel__Group__0__Impl_in_rule__StateMachineBehavioralModel__Group__02011 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__StateMachineBehavioralModel__Group__1_in_rule__StateMachineBehavioralModel__Group__02014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachineBehavioralModel__Group__1__Impl_in_rule__StateMachineBehavioralModel__Group__12072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachineBehavioralModel__Group_1__0_in_rule__StateMachineBehavioralModel__Group__1__Impl2099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachineBehavioralModel__Group_1__0__Impl_in_rule__StateMachineBehavioralModel__Group_1__02133 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__StateMachineBehavioralModel__Group_1__1_in_rule__StateMachineBehavioralModel__Group_1__02136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachineBehavioralModel__IncludesAssignment_1_0_in_rule__StateMachineBehavioralModel__Group_1__0__Impl2163 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__StateMachineBehavioralModel__Group_1__1__Impl_in_rule__StateMachineBehavioralModel__Group_1__12194 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__StateMachineBehavioralModel__Group_1__2_in_rule__StateMachineBehavioralModel__Group_1__12197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachineBehavioralModel__StatemachinesAssignment_1_1_in_rule__StateMachineBehavioralModel__Group_1__1__Impl2224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachineBehavioralModel__Group_1__2__Impl_in_rule__StateMachineBehavioralModel__Group_1__22254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachineBehavioralModel__StatemachinesAssignment_1_2_in_rule__StateMachineBehavioralModel__Group_1__2__Impl2281 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__02318 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__02321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Include__Group__0__Impl2349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__12380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__FilenameAssignment_1_in_rule__Include__Group__1__Impl2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__0__Impl_in_rule__StateMachine__Group__02441 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__1_in_rule__StateMachine__Group__02444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__StateMachine__Group__0__Impl2472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__1__Impl_in_rule__StateMachine__Group__12503 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__2_in_rule__StateMachine__Group__12506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__NameAssignment_1_in_rule__StateMachine__Group__1__Impl2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__2__Impl_in_rule__StateMachine__Group__22563 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__3_in_rule__StateMachine__Group__22566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__StateMachine__Group__2__Impl2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__3__Impl_in_rule__StateMachine__Group__32625 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__4_in_rule__StateMachine__Group__32628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__ReferredObjectAssignment_3_in_rule__StateMachine__Group__3__Impl2655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__4__Impl_in_rule__StateMachine__Group__42685 = new BitSet(new long[]{0x0000000001558000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__5_in_rule__StateMachine__Group__42688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__StateMachine__Group__4__Impl2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__5__Impl_in_rule__StateMachine__Group__52747 = new BitSet(new long[]{0x0000000001558000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__6_in_rule__StateMachine__Group__52750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_5__0_in_rule__StateMachine__Group__5__Impl2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__6__Impl_in_rule__StateMachine__Group__62808 = new BitSet(new long[]{0x0000000001558000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__7_in_rule__StateMachine__Group__62811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_6__0_in_rule__StateMachine__Group__6__Impl2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__7__Impl_in_rule__StateMachine__Group__72869 = new BitSet(new long[]{0x0000000001558000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__8_in_rule__StateMachine__Group__72872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_7__0_in_rule__StateMachine__Group__7__Impl2899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__8__Impl_in_rule__StateMachine__Group__82930 = new BitSet(new long[]{0x0000000001558000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__9_in_rule__StateMachine__Group__82933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_8__0_in_rule__StateMachine__Group__8__Impl2960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__9__Impl_in_rule__StateMachine__Group__92991 = new BitSet(new long[]{0x0000000001558000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__10_in_rule__StateMachine__Group__92994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_9__0_in_rule__StateMachine__Group__9__Impl3021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group__10__Impl_in_rule__StateMachine__Group__103052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__StateMachine__Group__10__Impl3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_5__0__Impl_in_rule__StateMachine__Group_5__03133 = new BitSet(new long[]{0x000000007C020000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_5__1_in_rule__StateMachine__Group_5__03136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__StateMachine__Group_5__0__Impl3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_5__1__Impl_in_rule__StateMachine__Group_5__13195 = new BitSet(new long[]{0x000000007C020000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_5__2_in_rule__StateMachine__Group_5__13198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__ActionsAssignment_5_1_in_rule__StateMachine__Group_5__1__Impl3225 = new BitSet(new long[]{0x000000007C000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_5__2__Impl_in_rule__StateMachine__Group_5__23256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__StateMachine__Group_5__2__Impl3284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_6__0__Impl_in_rule__StateMachine__Group_6__03321 = new BitSet(new long[]{0x000007F000080000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_6__1_in_rule__StateMachine__Group_6__03324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__StateMachine__Group_6__0__Impl3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_6__1__Impl_in_rule__StateMachine__Group_6__13383 = new BitSet(new long[]{0x000007F000080000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_6__2_in_rule__StateMachine__Group_6__13386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__GuardsAssignment_6_1_in_rule__StateMachine__Group_6__1__Impl3413 = new BitSet(new long[]{0x000007F000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_6__2__Impl_in_rule__StateMachine__Group_6__23444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__StateMachine__Group_6__2__Impl3472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_7__0__Impl_in_rule__StateMachine__Group_7__03509 = new BitSet(new long[]{0x0000000F80200000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_7__1_in_rule__StateMachine__Group_7__03512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__StateMachine__Group_7__0__Impl3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_7__1__Impl_in_rule__StateMachine__Group_7__13571 = new BitSet(new long[]{0x0000000F80200000L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_7__2_in_rule__StateMachine__Group_7__13574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__TriggersAssignment_7_1_in_rule__StateMachine__Group_7__1__Impl3601 = new BitSet(new long[]{0x0000000F80000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_7__2__Impl_in_rule__StateMachine__Group_7__23632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__StateMachine__Group_7__2__Impl3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_8__0__Impl_in_rule__StateMachine__Group_8__03697 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_8__1_in_rule__StateMachine__Group_8__03700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__StateMachine__Group_8__0__Impl3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_8__1__Impl_in_rule__StateMachine__Group_8__13759 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_8__2_in_rule__StateMachine__Group_8__13762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__StatesAssignment_8_1_in_rule__StateMachine__Group_8__1__Impl3789 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_8__2__Impl_in_rule__StateMachine__Group_8__23820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__StateMachine__Group_8__2__Impl3848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_9__0__Impl_in_rule__StateMachine__Group_9__03885 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_9__1_in_rule__StateMachine__Group_9__03888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__StateMachine__Group_9__0__Impl3916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_9__1__Impl_in_rule__StateMachine__Group_9__13947 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_9__2_in_rule__StateMachine__Group_9__13950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StateMachine__TransitionsAssignment_9_1_in_rule__StateMachine__Group_9__1__Impl3977 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__StateMachine__Group_9__2__Impl_in_rule__StateMachine__Group_9__24008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__StateMachine__Group_9__2__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionExpression_Impl__Group__0__Impl_in_rule__ActionExpression_Impl__Group__04073 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ActionExpression_Impl__Group__1_in_rule__ActionExpression_Impl__Group__04076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ActionExpression_Impl__Group__0__Impl4104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionExpression_Impl__Group__1__Impl_in_rule__ActionExpression_Impl__Group__14135 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__ActionExpression_Impl__Group__2_in_rule__ActionExpression_Impl__Group__14138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionExpression_Impl__NameAssignment_1_in_rule__ActionExpression_Impl__Group__1__Impl4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionExpression_Impl__Group__2__Impl_in_rule__ActionExpression_Impl__Group__24195 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ActionExpression_Impl__Group__3_in_rule__ActionExpression_Impl__Group__24198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ActionExpression_Impl__Group__2__Impl4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionExpression_Impl__Group__3__Impl_in_rule__ActionExpression_Impl__Group__34257 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__ActionExpression_Impl__Group__4_in_rule__ActionExpression_Impl__Group__34260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionExpression_Impl__ExpressionAssignment_3_in_rule__ActionExpression_Impl__Group__3__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ActionExpression_Impl__Group__4__Impl_in_rule__ActionExpression_Impl__Group__44317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ActionExpression_Impl__Group__4__Impl4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeTrainCurrentTrackElement__Group__0__Impl_in_rule__ChangeTrainCurrentTrackElement__Group__04386 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ChangeTrainCurrentTrackElement__Group__1_in_rule__ChangeTrainCurrentTrackElement__Group__04389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ChangeTrainCurrentTrackElement__Group__0__Impl4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeTrainCurrentTrackElement__Group__1__Impl_in_rule__ChangeTrainCurrentTrackElement__Group__14448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeTrainCurrentTrackElement__NameAssignment_1_in_rule__ChangeTrainCurrentTrackElement__Group__1__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeTurnoutDirection__Group__0__Impl_in_rule__ChangeTurnoutDirection__Group__04509 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ChangeTurnoutDirection__Group__1_in_rule__ChangeTurnoutDirection__Group__04512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ChangeTurnoutDirection__Group__0__Impl4540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeTurnoutDirection__Group__1__Impl_in_rule__ChangeTurnoutDirection__Group__14571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeTurnoutDirection__NameAssignment_1_in_rule__ChangeTurnoutDirection__Group__1__Impl4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeSignalAllowedSpeed__Group__0__Impl_in_rule__ChangeSignalAllowedSpeed__Group__04632 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ChangeSignalAllowedSpeed__Group__1_in_rule__ChangeSignalAllowedSpeed__Group__04635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ChangeSignalAllowedSpeed__Group__0__Impl4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeSignalAllowedSpeed__Group__1__Impl_in_rule__ChangeSignalAllowedSpeed__Group__14694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeSignalAllowedSpeed__NameAssignment_1_in_rule__ChangeSignalAllowedSpeed__Group__1__Impl4721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeTrainHeadingSpeed__Group__0__Impl_in_rule__ChangeTrainHeadingSpeed__Group__04755 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__ChangeTrainHeadingSpeed__Group__1_in_rule__ChangeTrainHeadingSpeed__Group__04758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ChangeTrainHeadingSpeed__Group__0__Impl4786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeTrainHeadingSpeed__Group__1__Impl_in_rule__ChangeTrainHeadingSpeed__Group__14817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ChangeTrainHeadingSpeed__NameAssignment_1_in_rule__ChangeTrainHeadingSpeed__Group__1__Impl4844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainHeadingSpeedChanged__Group__0__Impl_in_rule__TrainHeadingSpeedChanged__Group__04878 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TrainHeadingSpeedChanged__Group__1_in_rule__TrainHeadingSpeedChanged__Group__04881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__TrainHeadingSpeedChanged__Group__0__Impl4909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainHeadingSpeedChanged__Group__1__Impl_in_rule__TrainHeadingSpeedChanged__Group__14940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainHeadingSpeedChanged__NameAssignment_1_in_rule__TrainHeadingSpeedChanged__Group__1__Impl4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainTrackElementChanged__Group__0__Impl_in_rule__TrainTrackElementChanged__Group__05001 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TrainTrackElementChanged__Group__1_in_rule__TrainTrackElementChanged__Group__05004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__TrainTrackElementChanged__Group__0__Impl5032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainTrackElementChanged__Group__1__Impl_in_rule__TrainTrackElementChanged__Group__15063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainTrackElementChanged__NameAssignment_1_in_rule__TrainTrackElementChanged__Group__1__Impl5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalAllowedSpeedChanged__Group__0__Impl_in_rule__SignalAllowedSpeedChanged__Group__05124 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__SignalAllowedSpeedChanged__Group__1_in_rule__SignalAllowedSpeedChanged__Group__05127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SignalAllowedSpeedChanged__Group__0__Impl5155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalAllowedSpeedChanged__Group__1__Impl_in_rule__SignalAllowedSpeedChanged__Group__15186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalAllowedSpeedChanged__NameAssignment_1_in_rule__SignalAllowedSpeedChanged__Group__1__Impl5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutDirectionChanged__Group__0__Impl_in_rule__TurnoutDirectionChanged__Group__05247 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TurnoutDirectionChanged__Group__1_in_rule__TurnoutDirectionChanged__Group__05250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__TurnoutDirectionChanged__Group__0__Impl5278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutDirectionChanged__Group__1__Impl_in_rule__TurnoutDirectionChanged__Group__15309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutDirectionChanged__NameAssignment_1_in_rule__TurnoutDirectionChanged__Group__1__Impl5336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TriggerExpression_Impl__Group__0__Impl_in_rule__TriggerExpression_Impl__Group__05370 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TriggerExpression_Impl__Group__1_in_rule__TriggerExpression_Impl__Group__05373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__TriggerExpression_Impl__Group__0__Impl5401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TriggerExpression_Impl__Group__1__Impl_in_rule__TriggerExpression_Impl__Group__15432 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__TriggerExpression_Impl__Group__2_in_rule__TriggerExpression_Impl__Group__15435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TriggerExpression_Impl__NameAssignment_1_in_rule__TriggerExpression_Impl__Group__1__Impl5462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TriggerExpression_Impl__Group__2__Impl_in_rule__TriggerExpression_Impl__Group__25492 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TriggerExpression_Impl__Group__3_in_rule__TriggerExpression_Impl__Group__25495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__TriggerExpression_Impl__Group__2__Impl5523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TriggerExpression_Impl__Group__3__Impl_in_rule__TriggerExpression_Impl__Group__35554 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__TriggerExpression_Impl__Group__4_in_rule__TriggerExpression_Impl__Group__35557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TriggerExpression_Impl__ExpressionAssignment_3_in_rule__TriggerExpression_Impl__Group__3__Impl5584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TriggerExpression_Impl__Group__4__Impl_in_rule__TriggerExpression_Impl__Group__45614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__TriggerExpression_Impl__Group__4__Impl5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainCurrentHeadingSpeed__Group__0__Impl_in_rule__TrainCurrentHeadingSpeed__Group__05683 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TrainCurrentHeadingSpeed__Group__1_in_rule__TrainCurrentHeadingSpeed__Group__05686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TrainCurrentHeadingSpeed__Group__0__Impl5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainCurrentHeadingSpeed__Group__1__Impl_in_rule__TrainCurrentHeadingSpeed__Group__15745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainCurrentHeadingSpeed__NameAssignment_1_in_rule__TrainCurrentHeadingSpeed__Group__1__Impl5772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainCurrentlyStandsOn__Group__0__Impl_in_rule__TrainCurrentlyStandsOn__Group__05806 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TrainCurrentlyStandsOn__Group__1_in_rule__TrainCurrentlyStandsOn__Group__05809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TrainCurrentlyStandsOn__Group__0__Impl5837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainCurrentlyStandsOn__Group__1__Impl_in_rule__TrainCurrentlyStandsOn__Group__15868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TrainCurrentlyStandsOn__NameAssignment_1_in_rule__TrainCurrentlyStandsOn__Group__1__Impl5895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutCurrentDirection__Group__0__Impl_in_rule__TurnoutCurrentDirection__Group__05929 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TurnoutCurrentDirection__Group__1_in_rule__TurnoutCurrentDirection__Group__05932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__TurnoutCurrentDirection__Group__0__Impl5960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutCurrentDirection__Group__1__Impl_in_rule__TurnoutCurrentDirection__Group__15991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutCurrentDirection__NameAssignment_1_in_rule__TurnoutCurrentDirection__Group__1__Impl6018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalCurrentAllowedSpeed__Group__0__Impl_in_rule__SignalCurrentAllowedSpeed__Group__06052 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__SignalCurrentAllowedSpeed__Group__1_in_rule__SignalCurrentAllowedSpeed__Group__06055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__SignalCurrentAllowedSpeed__Group__0__Impl6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalCurrentAllowedSpeed__Group__1__Impl_in_rule__SignalCurrentAllowedSpeed__Group__16114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SignalCurrentAllowedSpeed__NameAssignment_1_in_rule__SignalCurrentAllowedSpeed__Group__1__Impl6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextTrackElementIs__Group__0__Impl_in_rule__NextTrackElementIs__Group__06175 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__NextTrackElementIs__Group__1_in_rule__NextTrackElementIs__Group__06178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__NextTrackElementIs__Group__0__Impl6206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextTrackElementIs__Group__1__Impl_in_rule__NextTrackElementIs__Group__16237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NextTrackElementIs__NameAssignment_1_in_rule__NextTrackElementIs__Group__1__Impl6264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutHasDesiredDirection__Group__0__Impl_in_rule__TurnoutHasDesiredDirection__Group__06298 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TurnoutHasDesiredDirection__Group__1_in_rule__TurnoutHasDesiredDirection__Group__06301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__TurnoutHasDesiredDirection__Group__0__Impl6329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutHasDesiredDirection__Group__1__Impl_in_rule__TurnoutHasDesiredDirection__Group__16360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutHasDesiredDirection__NameAssignment_1_in_rule__TurnoutHasDesiredDirection__Group__1__Impl6387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuardExpression_Impl__Group__0__Impl_in_rule__GuardExpression_Impl__Group__06421 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__GuardExpression_Impl__Group__1_in_rule__GuardExpression_Impl__Group__06424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__GuardExpression_Impl__Group__0__Impl6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuardExpression_Impl__Group__1__Impl_in_rule__GuardExpression_Impl__Group__16483 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__GuardExpression_Impl__Group__2_in_rule__GuardExpression_Impl__Group__16486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuardExpression_Impl__NameAssignment_1_in_rule__GuardExpression_Impl__Group__1__Impl6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuardExpression_Impl__Group__2__Impl_in_rule__GuardExpression_Impl__Group__26543 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__GuardExpression_Impl__Group__3_in_rule__GuardExpression_Impl__Group__26546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__GuardExpression_Impl__Group__2__Impl6574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuardExpression_Impl__Group__3__Impl_in_rule__GuardExpression_Impl__Group__36605 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__GuardExpression_Impl__Group__4_in_rule__GuardExpression_Impl__Group__36608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuardExpression_Impl__ExpressionAssignment_3_in_rule__GuardExpression_Impl__Group__3__Impl6635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GuardExpression_Impl__Group__4__Impl_in_rule__GuardExpression_Impl__Group__46665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__GuardExpression_Impl__Group__4__Impl6693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__0__Impl_in_rule__State__Group__06734 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_rule__State__Group__1_in_rule__State__Group__06737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__NameAssignment_0_in_rule__State__Group__0__Impl6764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__Group__1__Impl_in_rule__State__Group__16794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup_1_in_rule__State__Group__1__Impl6821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__06855 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__06858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__NameAssignment_0_in_rule__Transition__Group__0__Impl6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__16915 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__16918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Transition__Group__1__Impl6946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__26977 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__26980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__UnorderedGroup_2_in_rule__Transition__Group__2__Impl7007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__37037 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__37040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Transition__Group__3__Impl7068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__47099 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__47102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__SourceStateAssignment_4_in_rule__Transition__Group__4__Impl7129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__57159 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transition__Group__6_in_rule__Transition__Group__57162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Transition__Group__5__Impl7190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__6__Impl_in_rule__Transition__Group__67221 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group__7_in_rule__Transition__Group__67224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TargetStateAssignment_6_in_rule__Transition__Group__6__Impl7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__7__Impl_in_rule__Transition__Group__77281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transition__Group__8_in_rule__Transition__Group__77284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Transition__Group__7__Impl7312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__8__Impl_in_rule__Transition__Group__87343 = new BitSet(new long[]{0x0001C00000008000L});
    public static final BitSet FOLLOW_rule__Transition__Group__9_in_rule__Transition__Group__87346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__ActionAssignment_8_in_rule__Transition__Group__8__Impl7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__9__Impl_in_rule__Transition__Group__97403 = new BitSet(new long[]{0x0001C00000008000L});
    public static final BitSet FOLLOW_rule__Transition__Group__10_in_rule__Transition__Group__97406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_9__0_in_rule__Transition__Group__9__Impl7433 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__10__Impl_in_rule__Transition__Group__107464 = new BitSet(new long[]{0x0001C00000008000L});
    public static final BitSet FOLLOW_rule__Transition__Group__11_in_rule__Transition__Group__107467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_10__0_in_rule__Transition__Group__10__Impl7494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__11__Impl_in_rule__Transition__Group__117525 = new BitSet(new long[]{0x0001C00000008000L});
    public static final BitSet FOLLOW_rule__Transition__Group__12_in_rule__Transition__Group__117528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_11__0_in_rule__Transition__Group__11__Impl7555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__12__Impl_in_rule__Transition__Group__127586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Transition__Group__12__Impl7614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_9__0__Impl_in_rule__Transition__Group_9__07671 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transition__Group_9__1_in_rule__Transition__Group_9__07674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Transition__Group_9__0__Impl7702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_9__1__Impl_in_rule__Transition__Group_9__17733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__ActionAssignment_9_1_in_rule__Transition__Group_9__1__Impl7760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_10__0__Impl_in_rule__Transition__Group_10__07794 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transition__Group_10__1_in_rule__Transition__Group_10__07797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Transition__Group_10__0__Impl7825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_10__1__Impl_in_rule__Transition__Group_10__17856 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Transition__Group_10__2_in_rule__Transition__Group_10__17859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__GuardAssignment_10_1_in_rule__Transition__Group_10__1__Impl7886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_10__2__Impl_in_rule__Transition__Group_10__27916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_10_2__0_in_rule__Transition__Group_10__2__Impl7943 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_10_2__0__Impl_in_rule__Transition__Group_10_2__07980 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transition__Group_10_2__1_in_rule__Transition__Group_10_2__07983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Transition__Group_10_2__0__Impl8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_10_2__1__Impl_in_rule__Transition__Group_10_2__18042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__GuardAssignment_10_2_1_in_rule__Transition__Group_10_2__1__Impl8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_11__0__Impl_in_rule__Transition__Group_11__08103 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transition__Group_11__1_in_rule__Transition__Group_11__08106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Transition__Group_11__0__Impl8134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_11__1__Impl_in_rule__Transition__Group_11__18165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__TriggerAssignment_11_1_in_rule__Transition__Group_11__1__Impl8192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup_1__0_in_rule__State__UnorderedGroup_18227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsInitialAssignment_1_0_in_rule__State__UnorderedGroup_1__Impl8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__IsActiveAssignment_1_1_in_rule__State__UnorderedGroup_1__Impl8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup_1__Impl_in_rule__State__UnorderedGroup_1__08464 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup_1__1_in_rule__State__UnorderedGroup_1__08467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__State__UnorderedGroup_1__Impl_in_rule__State__UnorderedGroup_1__18492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__UnorderedGroup_2__0_in_rule__Transition__UnorderedGroup_28520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__IsEnabledAssignment_2_0_in_rule__Transition__UnorderedGroup_2__Impl8607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__IsFireableAssignment_2_1_in_rule__Transition__UnorderedGroup_2__Impl8698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__UnorderedGroup_2__Impl_in_rule__Transition__UnorderedGroup_2__08757 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_rule__Transition__UnorderedGroup_2__1_in_rule__Transition__UnorderedGroup_2__08760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__UnorderedGroup_2__Impl_in_rule__Transition__UnorderedGroup_2__18785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__StateMachineBehavioralModel__IncludesAssignment_1_08817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateMachine_in_rule__StateMachineBehavioralModel__StatemachinesAssignment_1_18848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStateMachine_in_rule__StateMachineBehavioralModel__StatemachinesAssignment_1_28879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Include__FilenameAssignment_18910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateMachine__NameAssignment_18941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__StateMachine__ReferredObjectAssignment_38976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__StateMachine__ActionsAssignment_5_19011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGuard_in_rule__StateMachine__GuardsAssignment_6_19042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrigger_in_rule__StateMachine__TriggersAssignment_7_19073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleState_in_rule__StateMachine__StatesAssignment_8_19104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__StateMachine__TransitionsAssignment_9_19135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ActionExpression_Impl__NameAssignment_19166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ActionExpression_Impl__ExpressionAssignment_39197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ChangeTrainCurrentTrackElement__NameAssignment_19228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ChangeTurnoutDirection__NameAssignment_19259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ChangeSignalAllowedSpeed__NameAssignment_19290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__ChangeTrainHeadingSpeed__NameAssignment_19321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TrainHeadingSpeedChanged__NameAssignment_19352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TrainTrackElementChanged__NameAssignment_19383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__SignalAllowedSpeedChanged__NameAssignment_19414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TurnoutDirectionChanged__NameAssignment_19445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TriggerExpression_Impl__NameAssignment_19476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TriggerExpression_Impl__ExpressionAssignment_39507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TrainCurrentHeadingSpeed__NameAssignment_19538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TrainCurrentlyStandsOn__NameAssignment_19569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TurnoutCurrentDirection__NameAssignment_19600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__SignalCurrentAllowedSpeed__NameAssignment_19631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__NextTrackElementIs__NameAssignment_19662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TurnoutHasDesiredDirection__NameAssignment_19693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__GuardExpression_Impl__NameAssignment_19724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__GuardExpression_Impl__ExpressionAssignment_39755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__State__NameAssignment_09786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__State__IsInitialAssignment_1_09822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__State__IsActiveAssignment_1_19866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__NameAssignment_09905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Transition__IsEnabledAssignment_2_09941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Transition__IsFireableAssignment_2_19985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__SourceStateAssignment_410028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__TargetStateAssignment_610067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__ActionAssignment_810106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__ActionAssignment_9_110145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__GuardAssignment_10_110184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__GuardAssignment_10_2_110223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__TriggerAssignment_11_110262 = new BitSet(new long[]{0x0000000000000002L});

}
