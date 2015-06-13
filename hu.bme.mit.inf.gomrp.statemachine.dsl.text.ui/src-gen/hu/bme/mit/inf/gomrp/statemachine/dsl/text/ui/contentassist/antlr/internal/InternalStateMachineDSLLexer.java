package hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineDSLLexer extends Lexer {
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__51=51;
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
    public static final int T__32=32;
    public static final int RULE_STRING=4;
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

    public InternalStateMachineDSLLexer() {;} 
    public InternalStateMachineDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalStateMachineDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:11:7: ( 'include' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:11:9: 'include'
            {
            match("include"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:12:7: ( 'StateMachine' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:12:9: 'StateMachine'
            {
            match("StateMachine"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:13:7: ( 'for object' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:13:9: 'for object'
            {
            match("for object"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:14:7: ( '{' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:15:7: ( '}' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:15:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:16:7: ( 'Actions:' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:16:9: 'Actions:'
            {
            match("Actions:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:17:7: ( 'EndActions' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:17:9: 'EndActions'
            {
            match("EndActions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:18:7: ( 'Guards:' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:18:9: 'Guards:'
            {
            match("Guards:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:19:7: ( 'EndGuards' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:19:9: 'EndGuards'
            {
            match("EndGuards"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:20:7: ( 'Triggers:' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:20:9: 'Triggers:'
            {
            match("Triggers:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:21:7: ( 'EndTriggers' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:21:9: 'EndTriggers'
            {
            match("EndTriggers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:22:7: ( 'States:' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:22:9: 'States:'
            {
            match("States:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:23:7: ( 'EndStates' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:23:9: 'EndStates'
            {
            match("EndStates"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:24:7: ( 'Transitions:' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:24:9: 'Transitions:'
            {
            match("Transitions:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:25:7: ( 'EndTransitions' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:25:9: 'EndTransitions'
            {
            match("EndTransitions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:26:7: ( 'ActionExpression' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:26:9: 'ActionExpression'
            {
            match("ActionExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:27:7: ( 'ChangeTrainCurrentTrackElement' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:27:9: 'ChangeTrainCurrentTrackElement'
            {
            match("ChangeTrainCurrentTrackElement"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:28:7: ( 'ChangeTurnoutDirection' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:28:9: 'ChangeTurnoutDirection'
            {
            match("ChangeTurnoutDirection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:29:7: ( 'ChangeSignalAllowedSpeed' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:29:9: 'ChangeSignalAllowedSpeed'
            {
            match("ChangeSignalAllowedSpeed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:30:7: ( 'ChangeTrainHeadingSpeed' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:30:9: 'ChangeTrainHeadingSpeed'
            {
            match("ChangeTrainHeadingSpeed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:31:7: ( 'TrainHeadingSpeedChanged' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:31:9: 'TrainHeadingSpeedChanged'
            {
            match("TrainHeadingSpeedChanged"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:32:7: ( 'TrainTrackElementChanged' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:32:9: 'TrainTrackElementChanged'
            {
            match("TrainTrackElementChanged"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:33:7: ( 'SignalAllowedSpeedChanged' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:33:9: 'SignalAllowedSpeedChanged'
            {
            match("SignalAllowedSpeedChanged"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:34:7: ( 'TurnoutDirectionChanged' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:34:9: 'TurnoutDirectionChanged'
            {
            match("TurnoutDirectionChanged"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:35:7: ( 'TriggerExpression' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:35:9: 'TriggerExpression'
            {
            match("TriggerExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:36:7: ( 'TrainCurrentHeadingSpeed' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:36:9: 'TrainCurrentHeadingSpeed'
            {
            match("TrainCurrentHeadingSpeed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:37:7: ( 'TrainCurrentlyStandsOn' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:37:9: 'TrainCurrentlyStandsOn'
            {
            match("TrainCurrentlyStandsOn"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:38:7: ( 'TurnoutCurrentDirection' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:38:9: 'TurnoutCurrentDirection'
            {
            match("TurnoutCurrentDirection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:39:7: ( 'SignalCurrentAllowedSpeed' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:39:9: 'SignalCurrentAllowedSpeed'
            {
            match("SignalCurrentAllowedSpeed"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:40:7: ( 'NextTrackElementIs' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:40:9: 'NextTrackElementIs'
            {
            match("NextTrackElementIs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:41:7: ( 'TurnoutHasDesiredDirection' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:41:9: 'TurnoutHasDesiredDirection'
            {
            match("TurnoutHasDesiredDirection"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:42:7: ( 'GuardExpression' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:42:9: 'GuardExpression'
            {
            match("GuardExpression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:43:7: ( 'from state' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:43:9: 'from state'
            {
            match("from state"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:44:7: ( 'to' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:44:9: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:45:7: ( 'execute' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:45:9: 'execute'
            {
            match("execute"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:46:7: ( ',' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:46:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:47:7: ( 'guard' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:47:9: 'guard'
            {
            match("guard"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:48:7: ( 'trigger' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:48:9: 'trigger'
            {
            match("trigger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:49:7: ( 'is Initial' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:49:9: 'is Initial'
            {
            match("is Initial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:50:7: ( 'is Active' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:50:9: 'is Active'
            {
            match("is Active"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:51:7: ( 'is Enabled' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:51:9: 'is Enabled'
            {
            match("is Enabled"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:52:7: ( 'is Fireable' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:52:9: 'is Fireable'
            {
            match("is Fireable"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5026:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5026:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5026:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5026:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5026:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5028:10: ( ( '0' .. '9' )+ )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5028:12: ( '0' .. '9' )+
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5028:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5028:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5030:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5030:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5030:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5030:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5030:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5030:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5030:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5030:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5030:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5030:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5030:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5032:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5032:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5032:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5032:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5034:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5034:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5034:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5034:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5034:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5034:41: ( '\\r' )? '\\n'
                    {
                    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5034:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5034:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5036:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5036:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5036:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5038:16: ( . )
            // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:5038:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=49;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:196: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:202: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:208: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:214: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:220: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:226: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:232: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:238: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:244: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:250: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:256: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:262: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 44 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:270: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 45 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:279: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 46 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:291: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 47 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:307: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 48 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:323: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 49 :
                // ../hu.bme.mit.inf.gomrp.statemachine.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/statemachine/dsl/text/ui/contentassist/antlr/internal/InternalStateMachineDSL.g:1:331: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\3\32\2\uffff\10\32\1\uffff\1\32\1\27\2\uffff\3\27\2\uffff"+
        "\2\32\1\uffff\4\32\2\uffff\7\32\1\100\2\32\1\uffff\1\32\5\uffff"+
        "\1\32\1\uffff\14\32\1\uffff\4\32\4\uffff\2\32\1\uffff\23\32\1\uffff"+
        "\16\32\1\u0085\26\32\1\uffff\1\u009f\1\32\1\uffff\11\32\1\uffff"+
        "\12\32\1\u00b8\1\u00b9\1\uffff\3\32\1\uffff\24\32\2\uffff\5\32\1"+
        "\u00d6\2\32\1\u00d9\1\32\1\uffff\20\32\1\u00eb\1\uffff\2\32\1\uffff"+
        "\21\32\1\uffff\1\u00ff\16\32\1\u010f\3\32\1\uffff\3\32\1\uffff\13"+
        "\32\1\uffff\25\32\1\u0137\21\32\1\uffff\1\u0149\17\32\1\u0159\1"+
        "\uffff\17\32\1\uffff\1\u0169\16\32\1\uffff\13\32\1\u0183\15\32\1"+
        "\uffff\37\32\1\u01b0\5\32\1\u01b6\6\32\1\uffff\1\u01bd\1\u01be\2"+
        "\32\1\u01c1\1\uffff\3\32\1\u01c5\1\u01c6\1\u01c7\2\uffff\2\32\1"+
        "\uffff\1\u01ca\1\u01cb\1\u01cc\3\uffff\2\32\3\uffff\1\u01cf\1\32"+
        "\1\uffff\3\32\1\u01d4\1\uffff";
    static final String DFA12_eofS =
        "\u01d5\uffff";
    static final String DFA12_minS =
        "\1\0\1\156\1\151\1\157\2\uffff\1\143\1\156\1\165\1\162\1\150\1"+
        "\145\1\157\1\170\1\uffff\1\165\1\101\2\uffff\2\0\1\52\2\uffff\1"+
        "\143\1\40\1\uffff\1\141\1\147\1\162\1\157\2\uffff\1\164\1\144\2"+
        "\141\1\162\1\141\1\170\1\60\1\151\1\145\1\uffff\1\141\5\uffff\1"+
        "\154\1\101\1\164\1\156\1\40\1\155\1\151\1\101\1\162\1\147\1\151"+
        "\2\156\1\164\1\uffff\1\147\1\143\1\162\1\165\4\uffff\1\145\1\141"+
        "\1\uffff\1\40\1\157\1\143\1\165\1\162\1\164\1\144\1\147\1\163\1"+
        "\156\1\157\1\147\1\124\1\147\1\165\2\144\1\115\1\154\1\uffff\1\156"+
        "\1\164\3\141\1\105\1\145\1\151\1\103\1\165\1\145\1\162\1\145\1\164"+
        "\1\60\1\145\1\141\1\72\1\101\1\105\1\151\1\162\1\147\1\156\1\164"+
        "\1\72\1\170\1\162\1\164\1\145\1\162\1\165\1\164\1\123\1\141\1\162"+
        "\1\145\1\uffff\1\60\1\143\1\uffff\1\154\1\165\1\72\1\170\1\157\1"+
        "\144\1\147\1\163\1\145\1\uffff\1\160\1\105\1\151\2\141\1\162\1\103"+
        "\1\162\1\151\1\143\2\60\1\uffff\1\150\1\154\1\162\1\uffff\1\160"+
        "\1\156\1\163\1\145\1\151\1\163\1\162\1\72\1\170\1\157\1\144\1\143"+
        "\1\162\1\151\1\165\2\141\1\162\1\147\1\153\2\uffff\1\151\1\157\2"+
        "\162\1\163\1\60\1\162\1\164\1\60\1\145\1\uffff\1\160\1\156\1\151"+
        "\1\153\1\145\2\162\1\163\1\151\2\156\1\105\1\156\1\167\2\145\1\60"+
        "\1\uffff\1\163\1\151\1\uffff\1\163\1\162\1\163\1\156\1\105\1\156"+
        "\1\145\1\162\1\104\1\156\1\157\1\141\1\154\2\145\1\156\1\163\1\uffff"+
        "\1\60\1\157\1\163\1\145\1\72\1\147\1\154\1\164\1\143\2\145\1\103"+
        "\1\165\1\154\1\145\1\60\1\144\1\164\1\163\1\uffff\1\156\1\151\1"+
        "\163\1\uffff\1\123\1\145\1\110\1\164\1\156\1\163\1\165\1\145\1\164"+
        "\1\101\1\155\1\uffff\1\123\1\101\1\151\1\163\1\157\1\163\1\160\1"+
        "\155\1\145\1\171\1\151\1\164\1\151\1\162\1\141\1\104\1\154\1\145"+
        "\1\160\1\154\1\157\1\60\1\156\1\151\2\145\1\141\1\123\1\157\1\104"+
        "\2\162\1\144\1\151\1\154\1\156\1\145\1\154\1\156\1\uffff\1\60\1"+
        "\157\1\145\1\156\1\144\1\164\1\156\1\151\2\145\1\151\1\162\1\157"+
        "\1\164\1\145\1\157\1\60\1\uffff\1\156\1\144\1\164\1\151\1\141\1"+
        "\103\1\162\1\144\2\156\1\145\1\167\1\111\1\144\1\167\1\uffff\1\60"+
        "\2\103\2\156\1\150\1\145\1\104\1\164\1\147\1\143\1\145\1\163\1\103"+
        "\1\145\1\uffff\2\150\1\147\1\144\1\141\1\143\1\151\1\124\1\123\1"+
        "\164\1\144\1\60\1\150\1\144\2\141\1\123\1\163\1\156\1\164\2\162"+
        "\1\160\1\151\1\123\1\uffff\1\141\1\123\2\156\1\160\1\117\1\147\1"+
        "\151\1\145\1\141\1\145\1\157\1\160\1\156\1\160\2\147\1\145\1\156"+
        "\1\145\1\157\2\143\1\145\1\156\1\145\1\147\4\145\1\60\1\144\1\156"+
        "\1\164\1\153\1\144\1\60\3\145\3\144\1\uffff\2\60\1\151\1\105\1\60"+
        "\1\uffff\3\144\3\60\2\uffff\1\157\1\154\1\uffff\3\60\3\uffff\1\156"+
        "\1\145\3\uffff\1\60\1\155\1\uffff\1\145\1\156\1\164\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\163\1\164\1\162\2\uffff\1\143\1\156\2\165\1\150\1\145"+
        "\1\162\1\170\1\uffff\1\165\1\172\2\uffff\2\uffff\1\57\2\uffff\1"+
        "\143\1\40\1\uffff\1\141\1\147\1\162\1\157\2\uffff\1\164\1\144\1"+
        "\141\1\151\1\162\1\141\1\170\1\172\1\151\1\145\1\uffff\1\141\5\uffff"+
        "\1\154\1\111\1\164\1\156\1\40\1\155\1\151\1\124\1\162\1\147\3\156"+
        "\1\164\1\uffff\1\147\1\143\1\162\1\165\4\uffff\1\145\1\141\1\uffff"+
        "\1\40\1\157\1\143\1\165\1\162\1\164\1\144\1\147\1\163\1\156\1\157"+
        "\1\147\1\124\1\147\1\165\2\144\1\163\1\154\1\uffff\1\156\1\164\1"+
        "\141\1\151\1\141\1\163\1\145\1\151\1\124\1\165\1\145\1\162\1\145"+
        "\1\164\1\172\1\145\1\141\1\72\1\103\1\163\1\151\1\162\1\147\1\156"+
        "\1\164\1\72\1\170\1\162\1\164\1\145\1\162\1\165\1\164\1\124\1\141"+
        "\1\162\1\145\1\uffff\1\172\1\143\1\uffff\1\154\1\165\1\72\1\170"+
        "\1\157\1\144\1\147\1\163\1\145\1\uffff\1\160\1\163\1\151\2\141\1"+
        "\162\1\110\1\165\1\151\1\143\2\172\1\uffff\1\150\1\154\1\162\1\uffff"+
        "\1\160\1\156\1\163\1\145\1\151\1\163\1\162\1\72\1\170\1\157\1\144"+
        "\1\143\1\162\1\151\1\165\2\141\1\162\1\147\1\153\2\uffff\1\151\1"+
        "\157\2\162\1\163\1\172\1\162\1\164\1\172\1\145\1\uffff\1\160\1\156"+
        "\1\151\1\153\1\145\2\162\1\163\1\151\2\156\1\105\1\156\1\167\2\145"+
        "\1\172\1\uffff\1\163\1\151\1\uffff\1\163\1\162\1\163\1\156\1\105"+
        "\1\156\1\145\1\162\1\104\1\156\1\157\1\141\1\154\2\145\1\156\1\163"+
        "\1\uffff\1\172\1\157\1\163\1\145\1\72\1\147\1\154\1\164\1\143\2"+
        "\145\1\110\1\165\1\154\1\145\1\172\1\144\1\164\1\163\1\uffff\1\156"+
        "\1\151\1\163\1\uffff\1\123\1\145\1\154\1\164\1\156\1\163\1\165\1"+
        "\145\1\164\1\101\1\155\1\uffff\1\123\1\101\1\151\1\163\1\157\1\163"+
        "\1\160\1\155\1\145\1\171\1\151\1\164\1\151\1\162\1\141\1\104\1\154"+
        "\1\145\1\160\1\154\1\157\1\172\1\156\1\151\2\145\1\141\1\123\1\157"+
        "\1\104\2\162\1\144\1\151\1\154\1\156\1\145\1\154\1\156\1\uffff\1"+
        "\172\1\157\1\145\1\156\1\144\1\164\1\156\1\151\2\145\1\151\1\162"+
        "\1\157\1\164\1\145\1\157\1\172\1\uffff\1\156\1\144\1\164\1\151\1"+
        "\141\1\103\1\162\1\144\2\156\1\145\1\167\1\111\1\144\1\167\1\uffff"+
        "\1\172\2\103\2\156\1\150\1\145\1\104\1\164\1\147\1\143\1\145\1\163"+
        "\1\103\1\145\1\uffff\2\150\1\147\1\144\1\141\1\143\1\151\1\124\1"+
        "\123\1\164\1\144\1\172\1\150\1\144\2\141\1\123\1\163\1\156\1\164"+
        "\2\162\1\160\1\151\1\123\1\uffff\1\141\1\123\2\156\1\160\1\117\1"+
        "\147\1\151\1\145\1\141\1\145\1\157\1\160\1\156\1\160\2\147\1\145"+
        "\1\156\1\145\1\157\2\143\1\145\1\156\1\145\1\147\4\145\1\172\1\144"+
        "\1\156\1\164\1\153\1\144\1\172\3\145\3\144\1\uffff\2\172\1\151\1"+
        "\105\1\172\1\uffff\3\144\3\172\2\uffff\1\157\1\154\1\uffff\3\172"+
        "\3\uffff\1\156\1\145\3\uffff\1\172\1\155\1\uffff\1\145\1\156\1\164"+
        "\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\4\1\5\10\uffff\1\44\2\uffff\1\53\1\54\3\uffff\1\60\1"+
        "\61\2\uffff\1\53\4\uffff\1\4\1\5\12\uffff\1\44\1\uffff\1\54\1\55"+
        "\1\56\1\57\1\60\16\uffff\1\42\4\uffff\1\47\1\50\1\51\1\52\2\uffff"+
        "\1\3\23\uffff\1\41\45\uffff\1\45\2\uffff\1\14\11\uffff\1\10\14\uffff"+
        "\1\1\3\uffff\1\6\24\uffff\1\46\1\43\12\uffff\1\12\21\uffff\1\11"+
        "\2\uffff\1\15\21\uffff\1\7\23\uffff\1\13\3\uffff\1\16\13\uffff\1"+
        "\2\47\uffff\1\17\21\uffff\1\40\17\uffff\1\20\17\uffff\1\31\31\uffff"+
        "\1\36\54\uffff\1\33\5\uffff\1\22\6\uffff\1\30\1\34\2\uffff\1\24"+
        "\3\uffff\1\25\1\26\1\32\2\uffff\1\23\1\27\1\35\2\uffff\1\37\4\uffff"+
        "\1\21";
    static final String DFA12_specialS =
        "\1\0\22\uffff\1\1\1\2\u01c0\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\27\2\26\2\27\1\26\22\27\1\26\1\27\1\23\4\27\1\24\4\27\1"+
            "\16\2\27\1\25\12\22\7\27\1\6\1\21\1\12\1\21\1\7\1\21\1\10\6"+
            "\21\1\13\4\21\1\2\1\11\6\21\3\27\1\20\1\21\1\27\4\21\1\15\1"+
            "\3\1\17\1\21\1\1\12\21\1\14\6\21\1\4\1\27\1\5\uff82\27",
            "\1\30\4\uffff\1\31",
            "\1\34\12\uffff\1\33",
            "\1\35\2\uffff\1\36",
            "",
            "",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44\2\uffff\1\45",
            "\1\46",
            "\1\47",
            "\1\50\2\uffff\1\51",
            "\1\52",
            "",
            "\1\54",
            "\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\0\56",
            "\0\56",
            "\1\57\4\uffff\1\60",
            "",
            "",
            "\1\62",
            "\1\63",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\74\7\uffff\1\73",
            "\1\75",
            "\1\76",
            "\1\77",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\101",
            "\1\102",
            "",
            "\1\103",
            "",
            "",
            "",
            "",
            "",
            "\1\104",
            "\1\106\3\uffff\1\107\1\110\2\uffff\1\105",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116\5\uffff\1\117\13\uffff\1\121\1\120",
            "\1\122",
            "\1\123",
            "\1\125\4\uffff\1\124",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160\45\uffff\1\161",
            "\1\162",
            "",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\167\7\uffff\1\166",
            "\1\170",
            "\1\172\55\uffff\1\171",
            "\1\173",
            "\1\174",
            "\1\177\4\uffff\1\175\13\uffff\1\176",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089\1\uffff\1\u008a",
            "\1\u008c\55\uffff\1\u008b",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009b\1\u009a",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00a0",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "\1\u00aa",
            "\1\u00ac\55\uffff\1\u00ab",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b2\1\u00b1\3\uffff\1\u00b3",
            "\1\u00b4\2\uffff\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00d7",
            "\1\u00d8",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a\4\uffff\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118\43\uffff\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0138",
            "\1\u0139",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "\1\u0144",
            "\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\u0150",
            "\1\u0151",
            "\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016d",
            "\1\u016e",
            "\1\u016f",
            "\1\u0170",
            "\1\u0171",
            "\1\u0172",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\1\u0176",
            "\1\u0177",
            "",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "\1\u0198",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\u01a9",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u01b1",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u01bf",
            "\1\u01c0",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\1\u01c8",
            "\1\u01c9",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "\1\u01cd",
            "\1\u01ce",
            "",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u01d0",
            "",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
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
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='i') ) {s = 1;}

                        else if ( (LA12_0=='S') ) {s = 2;}

                        else if ( (LA12_0=='f') ) {s = 3;}

                        else if ( (LA12_0=='{') ) {s = 4;}

                        else if ( (LA12_0=='}') ) {s = 5;}

                        else if ( (LA12_0=='A') ) {s = 6;}

                        else if ( (LA12_0=='E') ) {s = 7;}

                        else if ( (LA12_0=='G') ) {s = 8;}

                        else if ( (LA12_0=='T') ) {s = 9;}

                        else if ( (LA12_0=='C') ) {s = 10;}

                        else if ( (LA12_0=='N') ) {s = 11;}

                        else if ( (LA12_0=='t') ) {s = 12;}

                        else if ( (LA12_0=='e') ) {s = 13;}

                        else if ( (LA12_0==',') ) {s = 14;}

                        else if ( (LA12_0=='g') ) {s = 15;}

                        else if ( (LA12_0=='^') ) {s = 16;}

                        else if ( (LA12_0=='B'||LA12_0=='D'||LA12_0=='F'||(LA12_0>='H' && LA12_0<='M')||(LA12_0>='O' && LA12_0<='R')||(LA12_0>='U' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='d')||LA12_0=='h'||(LA12_0>='j' && LA12_0<='s')||(LA12_0>='u' && LA12_0<='z')) ) {s = 17;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 18;}

                        else if ( (LA12_0=='\"') ) {s = 19;}

                        else if ( (LA12_0=='\'') ) {s = 20;}

                        else if ( (LA12_0=='/') ) {s = 21;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 22;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='+')||(LA12_0>='-' && LA12_0<='.')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 23;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_19 = input.LA(1);

                        s = -1;
                        if ( ((LA12_19>='\u0000' && LA12_19<='\uFFFF')) ) {s = 46;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_20 = input.LA(1);

                        s = -1;
                        if ( ((LA12_20>='\u0000' && LA12_20<='\uFFFF')) ) {s = 46;}

                        else s = 23;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}