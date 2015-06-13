package hu.bme.mit.inf.gomrp.railway.dsl.ui.contentassist.antlr.internal; 

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
import hu.bme.mit.inf.gomrp.railway.dsl.services.RDMTextDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRDMTextDSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RailwayDomainModel'", "'{'", "'}'", "'Train'", "'Section'", "'Turnout'", "'ConnectionPoint'", "'Signal'", "'TurnoutDesiredDirection'", "'Route'", "'RouteElement'", "'Station'", "'TurnoutSignal'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRDMTextDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRDMTextDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRDMTextDSLParser.tokenNames; }
    public String getGrammarFileName() { return "../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g"; }


     
     	private RDMTextDSLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(RDMTextDSLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleRailwayDomainModel"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:60:1: entryRuleRailwayDomainModel : ruleRailwayDomainModel EOF ;
    public final void entryRuleRailwayDomainModel() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:61:1: ( ruleRailwayDomainModel EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:62:1: ruleRailwayDomainModel EOF
            {
             before(grammarAccess.getRailwayDomainModelRule()); 
            pushFollow(FOLLOW_ruleRailwayDomainModel_in_entryRuleRailwayDomainModel61);
            ruleRailwayDomainModel();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRailwayDomainModel68); 

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
    // $ANTLR end "entryRuleRailwayDomainModel"


    // $ANTLR start "ruleRailwayDomainModel"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:69:1: ruleRailwayDomainModel : ( ( rule__RailwayDomainModel__Group__0 ) ) ;
    public final void ruleRailwayDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:73:2: ( ( ( rule__RailwayDomainModel__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:74:1: ( ( rule__RailwayDomainModel__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:74:1: ( ( rule__RailwayDomainModel__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:75:1: ( rule__RailwayDomainModel__Group__0 )
            {
             before(grammarAccess.getRailwayDomainModelAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:76:1: ( rule__RailwayDomainModel__Group__0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:76:2: rule__RailwayDomainModel__Group__0
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__0_in_ruleRailwayDomainModel94);
            rule__RailwayDomainModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRailwayDomainModelAccess().getGroup()); 

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
    // $ANTLR end "ruleRailwayDomainModel"


    // $ANTLR start "entryRuleSection"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:88:1: entryRuleSection : ruleSection EOF ;
    public final void entryRuleSection() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:89:1: ( ruleSection EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:90:1: ruleSection EOF
            {
             before(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection121);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getSectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection128); 

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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:97:1: ruleSection : ( ( rule__Section__Alternatives ) ) ;
    public final void ruleSection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:101:2: ( ( ( rule__Section__Alternatives ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:102:1: ( ( rule__Section__Alternatives ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:102:1: ( ( rule__Section__Alternatives ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:103:1: ( rule__Section__Alternatives )
            {
             before(grammarAccess.getSectionAccess().getAlternatives()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:104:1: ( rule__Section__Alternatives )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:104:2: rule__Section__Alternatives
            {
            pushFollow(FOLLOW_rule__Section__Alternatives_in_ruleSection154);
            rule__Section__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSectionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSignal"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:116:1: entryRuleSignal : ruleSignal EOF ;
    public final void entryRuleSignal() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:117:1: ( ruleSignal EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:118:1: ruleSignal EOF
            {
             before(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal181);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getSignalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal188); 

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
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:125:1: ruleSignal : ( ( rule__Signal__Alternatives ) ) ;
    public final void ruleSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:129:2: ( ( ( rule__Signal__Alternatives ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:130:1: ( ( rule__Signal__Alternatives ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:130:1: ( ( rule__Signal__Alternatives ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:131:1: ( rule__Signal__Alternatives )
            {
             before(grammarAccess.getSignalAccess().getAlternatives()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:132:1: ( rule__Signal__Alternatives )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:132:2: rule__Signal__Alternatives
            {
            pushFollow(FOLLOW_rule__Signal__Alternatives_in_ruleSignal214);
            rule__Signal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSignalAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleTrain"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:144:1: entryRuleTrain : ruleTrain EOF ;
    public final void entryRuleTrain() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:145:1: ( ruleTrain EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:146:1: ruleTrain EOF
            {
             before(grammarAccess.getTrainRule()); 
            pushFollow(FOLLOW_ruleTrain_in_entryRuleTrain241);
            ruleTrain();

            state._fsp--;

             after(grammarAccess.getTrainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrain248); 

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
    // $ANTLR end "entryRuleTrain"


    // $ANTLR start "ruleTrain"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:153:1: ruleTrain : ( ( rule__Train__Group__0 ) ) ;
    public final void ruleTrain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:157:2: ( ( ( rule__Train__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:158:1: ( ( rule__Train__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:158:1: ( ( rule__Train__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:159:1: ( rule__Train__Group__0 )
            {
             before(grammarAccess.getTrainAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:160:1: ( rule__Train__Group__0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:160:2: rule__Train__Group__0
            {
            pushFollow(FOLLOW_rule__Train__Group__0_in_ruleTrain274);
            rule__Train__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrainAccess().getGroup()); 

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
    // $ANTLR end "ruleTrain"


    // $ANTLR start "entryRuleSection_Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:172:1: entryRuleSection_Impl : ruleSection_Impl EOF ;
    public final void entryRuleSection_Impl() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:173:1: ( ruleSection_Impl EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:174:1: ruleSection_Impl EOF
            {
             before(grammarAccess.getSection_ImplRule()); 
            pushFollow(FOLLOW_ruleSection_Impl_in_entryRuleSection_Impl301);
            ruleSection_Impl();

            state._fsp--;

             after(grammarAccess.getSection_ImplRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection_Impl308); 

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
    // $ANTLR end "entryRuleSection_Impl"


    // $ANTLR start "ruleSection_Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:181:1: ruleSection_Impl : ( ( rule__Section_Impl__Group__0 ) ) ;
    public final void ruleSection_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:185:2: ( ( ( rule__Section_Impl__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:186:1: ( ( rule__Section_Impl__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:186:1: ( ( rule__Section_Impl__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:187:1: ( rule__Section_Impl__Group__0 )
            {
             before(grammarAccess.getSection_ImplAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:188:1: ( rule__Section_Impl__Group__0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:188:2: rule__Section_Impl__Group__0
            {
            pushFollow(FOLLOW_rule__Section_Impl__Group__0_in_ruleSection_Impl334);
            rule__Section_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSection_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleSection_Impl"


    // $ANTLR start "entryRuleTurnout"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:200:1: entryRuleTurnout : ruleTurnout EOF ;
    public final void entryRuleTurnout() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:201:1: ( ruleTurnout EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:202:1: ruleTurnout EOF
            {
             before(grammarAccess.getTurnoutRule()); 
            pushFollow(FOLLOW_ruleTurnout_in_entryRuleTurnout361);
            ruleTurnout();

            state._fsp--;

             after(grammarAccess.getTurnoutRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnout368); 

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
    // $ANTLR end "entryRuleTurnout"


    // $ANTLR start "ruleTurnout"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:209:1: ruleTurnout : ( ( rule__Turnout__Group__0 ) ) ;
    public final void ruleTurnout() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:213:2: ( ( ( rule__Turnout__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:214:1: ( ( rule__Turnout__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:214:1: ( ( rule__Turnout__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:215:1: ( rule__Turnout__Group__0 )
            {
             before(grammarAccess.getTurnoutAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:216:1: ( rule__Turnout__Group__0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:216:2: rule__Turnout__Group__0
            {
            pushFollow(FOLLOW_rule__Turnout__Group__0_in_ruleTurnout394);
            rule__Turnout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutAccess().getGroup()); 

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
    // $ANTLR end "ruleTurnout"


    // $ANTLR start "entryRuleConnectionPoint"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:228:1: entryRuleConnectionPoint : ruleConnectionPoint EOF ;
    public final void entryRuleConnectionPoint() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:229:1: ( ruleConnectionPoint EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:230:1: ruleConnectionPoint EOF
            {
             before(grammarAccess.getConnectionPointRule()); 
            pushFollow(FOLLOW_ruleConnectionPoint_in_entryRuleConnectionPoint421);
            ruleConnectionPoint();

            state._fsp--;

             after(grammarAccess.getConnectionPointRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectionPoint428); 

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
    // $ANTLR end "entryRuleConnectionPoint"


    // $ANTLR start "ruleConnectionPoint"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:237:1: ruleConnectionPoint : ( ( rule__ConnectionPoint__Group__0 ) ) ;
    public final void ruleConnectionPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:241:2: ( ( ( rule__ConnectionPoint__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:242:1: ( ( rule__ConnectionPoint__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:242:1: ( ( rule__ConnectionPoint__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:243:1: ( rule__ConnectionPoint__Group__0 )
            {
             before(grammarAccess.getConnectionPointAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:244:1: ( rule__ConnectionPoint__Group__0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:244:2: rule__ConnectionPoint__Group__0
            {
            pushFollow(FOLLOW_rule__ConnectionPoint__Group__0_in_ruleConnectionPoint454);
            rule__ConnectionPoint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPointAccess().getGroup()); 

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
    // $ANTLR end "ruleConnectionPoint"


    // $ANTLR start "entryRuleSignal_Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:256:1: entryRuleSignal_Impl : ruleSignal_Impl EOF ;
    public final void entryRuleSignal_Impl() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:257:1: ( ruleSignal_Impl EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:258:1: ruleSignal_Impl EOF
            {
             before(grammarAccess.getSignal_ImplRule()); 
            pushFollow(FOLLOW_ruleSignal_Impl_in_entryRuleSignal_Impl481);
            ruleSignal_Impl();

            state._fsp--;

             after(grammarAccess.getSignal_ImplRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal_Impl488); 

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
    // $ANTLR end "entryRuleSignal_Impl"


    // $ANTLR start "ruleSignal_Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:265:1: ruleSignal_Impl : ( ( rule__Signal_Impl__Group__0 ) ) ;
    public final void ruleSignal_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:269:2: ( ( ( rule__Signal_Impl__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:270:1: ( ( rule__Signal_Impl__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:270:1: ( ( rule__Signal_Impl__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:271:1: ( rule__Signal_Impl__Group__0 )
            {
             before(grammarAccess.getSignal_ImplAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:272:1: ( rule__Signal_Impl__Group__0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:272:2: rule__Signal_Impl__Group__0
            {
            pushFollow(FOLLOW_rule__Signal_Impl__Group__0_in_ruleSignal_Impl514);
            rule__Signal_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSignal_ImplAccess().getGroup()); 

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
    // $ANTLR end "ruleSignal_Impl"


    // $ANTLR start "entryRuleTurnoutDesiredDirection"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:284:1: entryRuleTurnoutDesiredDirection : ruleTurnoutDesiredDirection EOF ;
    public final void entryRuleTurnoutDesiredDirection() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:285:1: ( ruleTurnoutDesiredDirection EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:286:1: ruleTurnoutDesiredDirection EOF
            {
             before(grammarAccess.getTurnoutDesiredDirectionRule()); 
            pushFollow(FOLLOW_ruleTurnoutDesiredDirection_in_entryRuleTurnoutDesiredDirection541);
            ruleTurnoutDesiredDirection();

            state._fsp--;

             after(grammarAccess.getTurnoutDesiredDirectionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnoutDesiredDirection548); 

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
    // $ANTLR end "entryRuleTurnoutDesiredDirection"


    // $ANTLR start "ruleTurnoutDesiredDirection"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:293:1: ruleTurnoutDesiredDirection : ( ( rule__TurnoutDesiredDirection__Group__0 ) ) ;
    public final void ruleTurnoutDesiredDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:297:2: ( ( ( rule__TurnoutDesiredDirection__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:298:1: ( ( rule__TurnoutDesiredDirection__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:298:1: ( ( rule__TurnoutDesiredDirection__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:299:1: ( rule__TurnoutDesiredDirection__Group__0 )
            {
             before(grammarAccess.getTurnoutDesiredDirectionAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:300:1: ( rule__TurnoutDesiredDirection__Group__0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:300:2: rule__TurnoutDesiredDirection__Group__0
            {
            pushFollow(FOLLOW_rule__TurnoutDesiredDirection__Group__0_in_ruleTurnoutDesiredDirection574);
            rule__TurnoutDesiredDirection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutDesiredDirectionAccess().getGroup()); 

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
    // $ANTLR end "ruleTurnoutDesiredDirection"


    // $ANTLR start "entryRuleRoute"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:312:1: entryRuleRoute : ruleRoute EOF ;
    public final void entryRuleRoute() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:313:1: ( ruleRoute EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:314:1: ruleRoute EOF
            {
             before(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_ruleRoute_in_entryRuleRoute601);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRouteRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoute608); 

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
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:321:1: ruleRoute : ( ( rule__Route__Group__0 ) ) ;
    public final void ruleRoute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:325:2: ( ( ( rule__Route__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:326:1: ( ( rule__Route__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:326:1: ( ( rule__Route__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:327:1: ( rule__Route__Group__0 )
            {
             before(grammarAccess.getRouteAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:328:1: ( rule__Route__Group__0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:328:2: rule__Route__Group__0
            {
            pushFollow(FOLLOW_rule__Route__Group__0_in_ruleRoute634);
            rule__Route__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getGroup()); 

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
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleRouteElement"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:340:1: entryRuleRouteElement : ruleRouteElement EOF ;
    public final void entryRuleRouteElement() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:341:1: ( ruleRouteElement EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:342:1: ruleRouteElement EOF
            {
             before(grammarAccess.getRouteElementRule()); 
            pushFollow(FOLLOW_ruleRouteElement_in_entryRuleRouteElement661);
            ruleRouteElement();

            state._fsp--;

             after(grammarAccess.getRouteElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRouteElement668); 

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
    // $ANTLR end "entryRuleRouteElement"


    // $ANTLR start "ruleRouteElement"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:349:1: ruleRouteElement : ( ( rule__RouteElement__Group__0 ) ) ;
    public final void ruleRouteElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:353:2: ( ( ( rule__RouteElement__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:354:1: ( ( rule__RouteElement__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:354:1: ( ( rule__RouteElement__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:355:1: ( rule__RouteElement__Group__0 )
            {
             before(grammarAccess.getRouteElementAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:356:1: ( rule__RouteElement__Group__0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:356:2: rule__RouteElement__Group__0
            {
            pushFollow(FOLLOW_rule__RouteElement__Group__0_in_ruleRouteElement694);
            rule__RouteElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRouteElementAccess().getGroup()); 

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
    // $ANTLR end "ruleRouteElement"


    // $ANTLR start "entryRuleEString"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:368:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:369:1: ( ruleEString EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:370:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString721);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString728); 

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
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:377:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:381:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:382:1: ( ( rule__EString__Alternatives ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:382:1: ( ( rule__EString__Alternatives ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:383:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:384:1: ( rule__EString__Alternatives )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:384:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString754);
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


    // $ANTLR start "entryRuleStation"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:396:1: entryRuleStation : ruleStation EOF ;
    public final void entryRuleStation() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:397:1: ( ruleStation EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:398:1: ruleStation EOF
            {
             before(grammarAccess.getStationRule()); 
            pushFollow(FOLLOW_ruleStation_in_entryRuleStation781);
            ruleStation();

            state._fsp--;

             after(grammarAccess.getStationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStation788); 

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
    // $ANTLR end "entryRuleStation"


    // $ANTLR start "ruleStation"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:405:1: ruleStation : ( ( rule__Station__Group__0 ) ) ;
    public final void ruleStation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:409:2: ( ( ( rule__Station__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:410:1: ( ( rule__Station__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:410:1: ( ( rule__Station__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:411:1: ( rule__Station__Group__0 )
            {
             before(grammarAccess.getStationAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:412:1: ( rule__Station__Group__0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:412:2: rule__Station__Group__0
            {
            pushFollow(FOLLOW_rule__Station__Group__0_in_ruleStation814);
            rule__Station__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getGroup()); 

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
    // $ANTLR end "ruleStation"


    // $ANTLR start "entryRuleTurnoutSignal"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:424:1: entryRuleTurnoutSignal : ruleTurnoutSignal EOF ;
    public final void entryRuleTurnoutSignal() throws RecognitionException {
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:425:1: ( ruleTurnoutSignal EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:426:1: ruleTurnoutSignal EOF
            {
             before(grammarAccess.getTurnoutSignalRule()); 
            pushFollow(FOLLOW_ruleTurnoutSignal_in_entryRuleTurnoutSignal841);
            ruleTurnoutSignal();

            state._fsp--;

             after(grammarAccess.getTurnoutSignalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnoutSignal848); 

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
    // $ANTLR end "entryRuleTurnoutSignal"


    // $ANTLR start "ruleTurnoutSignal"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:433:1: ruleTurnoutSignal : ( ( rule__TurnoutSignal__Group__0 ) ) ;
    public final void ruleTurnoutSignal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:437:2: ( ( ( rule__TurnoutSignal__Group__0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:438:1: ( ( rule__TurnoutSignal__Group__0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:438:1: ( ( rule__TurnoutSignal__Group__0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:439:1: ( rule__TurnoutSignal__Group__0 )
            {
             before(grammarAccess.getTurnoutSignalAccess().getGroup()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:440:1: ( rule__TurnoutSignal__Group__0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:440:2: rule__TurnoutSignal__Group__0
            {
            pushFollow(FOLLOW_rule__TurnoutSignal__Group__0_in_ruleTurnoutSignal874);
            rule__TurnoutSignal__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutSignalAccess().getGroup()); 

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
    // $ANTLR end "ruleTurnoutSignal"


    // $ANTLR start "rule__Section__Alternatives"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:452:1: rule__Section__Alternatives : ( ( ruleSection_Impl ) | ( ruleStation ) );
    public final void rule__Section__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:456:1: ( ( ruleSection_Impl ) | ( ruleStation ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            else if ( (LA1_0==22) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:457:1: ( ruleSection_Impl )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:457:1: ( ruleSection_Impl )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:458:1: ruleSection_Impl
                    {
                     before(grammarAccess.getSectionAccess().getSection_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSection_Impl_in_rule__Section__Alternatives910);
                    ruleSection_Impl();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getSection_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:463:6: ( ruleStation )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:463:6: ( ruleStation )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:464:1: ruleStation
                    {
                     before(grammarAccess.getSectionAccess().getStationParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleStation_in_rule__Section__Alternatives927);
                    ruleStation();

                    state._fsp--;

                     after(grammarAccess.getSectionAccess().getStationParserRuleCall_1()); 

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
    // $ANTLR end "rule__Section__Alternatives"


    // $ANTLR start "rule__Signal__Alternatives"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:474:1: rule__Signal__Alternatives : ( ( ruleSignal_Impl ) | ( ruleTurnoutSignal ) );
    public final void rule__Signal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:478:1: ( ( ruleSignal_Impl ) | ( ruleTurnoutSignal ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==18) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:479:1: ( ruleSignal_Impl )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:479:1: ( ruleSignal_Impl )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:480:1: ruleSignal_Impl
                    {
                     before(grammarAccess.getSignalAccess().getSignal_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSignal_Impl_in_rule__Signal__Alternatives959);
                    ruleSignal_Impl();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getSignal_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:485:6: ( ruleTurnoutSignal )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:485:6: ( ruleTurnoutSignal )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:486:1: ruleTurnoutSignal
                    {
                     before(grammarAccess.getSignalAccess().getTurnoutSignalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleTurnoutSignal_in_rule__Signal__Alternatives976);
                    ruleTurnoutSignal();

                    state._fsp--;

                     after(grammarAccess.getSignalAccess().getTurnoutSignalParserRuleCall_1()); 

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
    // $ANTLR end "rule__Signal__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:496:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:500:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:501:1: ( RULE_STRING )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:501:1: ( RULE_STRING )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:502:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives1008); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:507:6: ( RULE_ID )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:507:6: ( RULE_ID )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:508:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives1025); 
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


    // $ANTLR start "rule__RailwayDomainModel__Group__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:520:1: rule__RailwayDomainModel__Group__0 : rule__RailwayDomainModel__Group__0__Impl rule__RailwayDomainModel__Group__1 ;
    public final void rule__RailwayDomainModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:524:1: ( rule__RailwayDomainModel__Group__0__Impl rule__RailwayDomainModel__Group__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:525:2: rule__RailwayDomainModel__Group__0__Impl rule__RailwayDomainModel__Group__1
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__0__Impl_in_rule__RailwayDomainModel__Group__01055);
            rule__RailwayDomainModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__1_in_rule__RailwayDomainModel__Group__01058);
            rule__RailwayDomainModel__Group__1();

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
    // $ANTLR end "rule__RailwayDomainModel__Group__0"


    // $ANTLR start "rule__RailwayDomainModel__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:532:1: rule__RailwayDomainModel__Group__0__Impl : ( () ) ;
    public final void rule__RailwayDomainModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:536:1: ( ( () ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:537:1: ( () )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:537:1: ( () )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:538:1: ()
            {
             before(grammarAccess.getRailwayDomainModelAccess().getRailwayDomainModelAction_0()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:539:1: ()
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:541:1: 
            {
            }

             after(grammarAccess.getRailwayDomainModelAccess().getRailwayDomainModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RailwayDomainModel__Group__0__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:551:1: rule__RailwayDomainModel__Group__1 : rule__RailwayDomainModel__Group__1__Impl rule__RailwayDomainModel__Group__2 ;
    public final void rule__RailwayDomainModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:555:1: ( rule__RailwayDomainModel__Group__1__Impl rule__RailwayDomainModel__Group__2 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:556:2: rule__RailwayDomainModel__Group__1__Impl rule__RailwayDomainModel__Group__2
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__1__Impl_in_rule__RailwayDomainModel__Group__11116);
            rule__RailwayDomainModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__2_in_rule__RailwayDomainModel__Group__11119);
            rule__RailwayDomainModel__Group__2();

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
    // $ANTLR end "rule__RailwayDomainModel__Group__1"


    // $ANTLR start "rule__RailwayDomainModel__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:563:1: rule__RailwayDomainModel__Group__1__Impl : ( 'RailwayDomainModel' ) ;
    public final void rule__RailwayDomainModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:567:1: ( ( 'RailwayDomainModel' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:568:1: ( 'RailwayDomainModel' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:568:1: ( 'RailwayDomainModel' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:569:1: 'RailwayDomainModel'
            {
             before(grammarAccess.getRailwayDomainModelAccess().getRailwayDomainModelKeyword_1()); 
            match(input,11,FOLLOW_11_in_rule__RailwayDomainModel__Group__1__Impl1147); 
             after(grammarAccess.getRailwayDomainModelAccess().getRailwayDomainModelKeyword_1()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group__1__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group__2"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:582:1: rule__RailwayDomainModel__Group__2 : rule__RailwayDomainModel__Group__2__Impl rule__RailwayDomainModel__Group__3 ;
    public final void rule__RailwayDomainModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:586:1: ( rule__RailwayDomainModel__Group__2__Impl rule__RailwayDomainModel__Group__3 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:587:2: rule__RailwayDomainModel__Group__2__Impl rule__RailwayDomainModel__Group__3
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__2__Impl_in_rule__RailwayDomainModel__Group__21178);
            rule__RailwayDomainModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__3_in_rule__RailwayDomainModel__Group__21181);
            rule__RailwayDomainModel__Group__3();

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
    // $ANTLR end "rule__RailwayDomainModel__Group__2"


    // $ANTLR start "rule__RailwayDomainModel__Group__2__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:594:1: rule__RailwayDomainModel__Group__2__Impl : ( '{' ) ;
    public final void rule__RailwayDomainModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:598:1: ( ( '{' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:599:1: ( '{' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:599:1: ( '{' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:600:1: '{'
            {
             before(grammarAccess.getRailwayDomainModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_12_in_rule__RailwayDomainModel__Group__2__Impl1209); 
             after(grammarAccess.getRailwayDomainModelAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group__2__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group__3"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:613:1: rule__RailwayDomainModel__Group__3 : rule__RailwayDomainModel__Group__3__Impl rule__RailwayDomainModel__Group__4 ;
    public final void rule__RailwayDomainModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:617:1: ( rule__RailwayDomainModel__Group__3__Impl rule__RailwayDomainModel__Group__4 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:618:2: rule__RailwayDomainModel__Group__3__Impl rule__RailwayDomainModel__Group__4
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__3__Impl_in_rule__RailwayDomainModel__Group__31240);
            rule__RailwayDomainModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__4_in_rule__RailwayDomainModel__Group__31243);
            rule__RailwayDomainModel__Group__4();

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
    // $ANTLR end "rule__RailwayDomainModel__Group__3"


    // $ANTLR start "rule__RailwayDomainModel__Group__3__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:625:1: rule__RailwayDomainModel__Group__3__Impl : ( ( rule__RailwayDomainModel__Group_3__0 )? ) ;
    public final void rule__RailwayDomainModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:629:1: ( ( ( rule__RailwayDomainModel__Group_3__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:630:1: ( ( rule__RailwayDomainModel__Group_3__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:630:1: ( ( rule__RailwayDomainModel__Group_3__0 )? )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:631:1: ( rule__RailwayDomainModel__Group_3__0 )?
            {
             before(grammarAccess.getRailwayDomainModelAccess().getGroup_3()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:632:1: ( rule__RailwayDomainModel__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:632:2: rule__RailwayDomainModel__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__RailwayDomainModel__Group_3__0_in_rule__RailwayDomainModel__Group__3__Impl1270);
                    rule__RailwayDomainModel__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRailwayDomainModelAccess().getGroup_3()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group__3__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group__4"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:642:1: rule__RailwayDomainModel__Group__4 : rule__RailwayDomainModel__Group__4__Impl rule__RailwayDomainModel__Group__5 ;
    public final void rule__RailwayDomainModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:646:1: ( rule__RailwayDomainModel__Group__4__Impl rule__RailwayDomainModel__Group__5 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:647:2: rule__RailwayDomainModel__Group__4__Impl rule__RailwayDomainModel__Group__5
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__4__Impl_in_rule__RailwayDomainModel__Group__41301);
            rule__RailwayDomainModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__5_in_rule__RailwayDomainModel__Group__41304);
            rule__RailwayDomainModel__Group__5();

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
    // $ANTLR end "rule__RailwayDomainModel__Group__4"


    // $ANTLR start "rule__RailwayDomainModel__Group__4__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:654:1: rule__RailwayDomainModel__Group__4__Impl : ( ( rule__RailwayDomainModel__Group_4__0 )? ) ;
    public final void rule__RailwayDomainModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:658:1: ( ( ( rule__RailwayDomainModel__Group_4__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:659:1: ( ( rule__RailwayDomainModel__Group_4__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:659:1: ( ( rule__RailwayDomainModel__Group_4__0 )? )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:660:1: ( rule__RailwayDomainModel__Group_4__0 )?
            {
             before(grammarAccess.getRailwayDomainModelAccess().getGroup_4()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:661:1: ( rule__RailwayDomainModel__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15||LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:661:2: rule__RailwayDomainModel__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__RailwayDomainModel__Group_4__0_in_rule__RailwayDomainModel__Group__4__Impl1331);
                    rule__RailwayDomainModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRailwayDomainModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group__4__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group__5"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:671:1: rule__RailwayDomainModel__Group__5 : rule__RailwayDomainModel__Group__5__Impl rule__RailwayDomainModel__Group__6 ;
    public final void rule__RailwayDomainModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:675:1: ( rule__RailwayDomainModel__Group__5__Impl rule__RailwayDomainModel__Group__6 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:676:2: rule__RailwayDomainModel__Group__5__Impl rule__RailwayDomainModel__Group__6
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__5__Impl_in_rule__RailwayDomainModel__Group__51362);
            rule__RailwayDomainModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__6_in_rule__RailwayDomainModel__Group__51365);
            rule__RailwayDomainModel__Group__6();

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
    // $ANTLR end "rule__RailwayDomainModel__Group__5"


    // $ANTLR start "rule__RailwayDomainModel__Group__5__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:683:1: rule__RailwayDomainModel__Group__5__Impl : ( ( rule__RailwayDomainModel__Group_5__0 )? ) ;
    public final void rule__RailwayDomainModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:687:1: ( ( ( rule__RailwayDomainModel__Group_5__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:688:1: ( ( rule__RailwayDomainModel__Group_5__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:688:1: ( ( rule__RailwayDomainModel__Group_5__0 )? )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:689:1: ( rule__RailwayDomainModel__Group_5__0 )?
            {
             before(grammarAccess.getRailwayDomainModelAccess().getGroup_5()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:690:1: ( rule__RailwayDomainModel__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:690:2: rule__RailwayDomainModel__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__RailwayDomainModel__Group_5__0_in_rule__RailwayDomainModel__Group__5__Impl1392);
                    rule__RailwayDomainModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRailwayDomainModelAccess().getGroup_5()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group__5__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group__6"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:700:1: rule__RailwayDomainModel__Group__6 : rule__RailwayDomainModel__Group__6__Impl rule__RailwayDomainModel__Group__7 ;
    public final void rule__RailwayDomainModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:704:1: ( rule__RailwayDomainModel__Group__6__Impl rule__RailwayDomainModel__Group__7 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:705:2: rule__RailwayDomainModel__Group__6__Impl rule__RailwayDomainModel__Group__7
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__6__Impl_in_rule__RailwayDomainModel__Group__61423);
            rule__RailwayDomainModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__7_in_rule__RailwayDomainModel__Group__61426);
            rule__RailwayDomainModel__Group__7();

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
    // $ANTLR end "rule__RailwayDomainModel__Group__6"


    // $ANTLR start "rule__RailwayDomainModel__Group__6__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:712:1: rule__RailwayDomainModel__Group__6__Impl : ( ( rule__RailwayDomainModel__Group_6__0 )? ) ;
    public final void rule__RailwayDomainModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:716:1: ( ( ( rule__RailwayDomainModel__Group_6__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:717:1: ( ( rule__RailwayDomainModel__Group_6__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:717:1: ( ( rule__RailwayDomainModel__Group_6__0 )? )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:718:1: ( rule__RailwayDomainModel__Group_6__0 )?
            {
             before(grammarAccess.getRailwayDomainModelAccess().getGroup_6()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:719:1: ( rule__RailwayDomainModel__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:719:2: rule__RailwayDomainModel__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__RailwayDomainModel__Group_6__0_in_rule__RailwayDomainModel__Group__6__Impl1453);
                    rule__RailwayDomainModel__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRailwayDomainModelAccess().getGroup_6()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group__6__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group__7"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:729:1: rule__RailwayDomainModel__Group__7 : rule__RailwayDomainModel__Group__7__Impl rule__RailwayDomainModel__Group__8 ;
    public final void rule__RailwayDomainModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:733:1: ( rule__RailwayDomainModel__Group__7__Impl rule__RailwayDomainModel__Group__8 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:734:2: rule__RailwayDomainModel__Group__7__Impl rule__RailwayDomainModel__Group__8
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__7__Impl_in_rule__RailwayDomainModel__Group__71484);
            rule__RailwayDomainModel__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__8_in_rule__RailwayDomainModel__Group__71487);
            rule__RailwayDomainModel__Group__8();

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
    // $ANTLR end "rule__RailwayDomainModel__Group__7"


    // $ANTLR start "rule__RailwayDomainModel__Group__7__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:741:1: rule__RailwayDomainModel__Group__7__Impl : ( ( rule__RailwayDomainModel__Group_7__0 )? ) ;
    public final void rule__RailwayDomainModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:745:1: ( ( ( rule__RailwayDomainModel__Group_7__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:746:1: ( ( rule__RailwayDomainModel__Group_7__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:746:1: ( ( rule__RailwayDomainModel__Group_7__0 )? )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:747:1: ( rule__RailwayDomainModel__Group_7__0 )?
            {
             before(grammarAccess.getRailwayDomainModelAccess().getGroup_7()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:748:1: ( rule__RailwayDomainModel__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18||LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:748:2: rule__RailwayDomainModel__Group_7__0
                    {
                    pushFollow(FOLLOW_rule__RailwayDomainModel__Group_7__0_in_rule__RailwayDomainModel__Group__7__Impl1514);
                    rule__RailwayDomainModel__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRailwayDomainModelAccess().getGroup_7()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group__7__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group__8"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:758:1: rule__RailwayDomainModel__Group__8 : rule__RailwayDomainModel__Group__8__Impl rule__RailwayDomainModel__Group__9 ;
    public final void rule__RailwayDomainModel__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:762:1: ( rule__RailwayDomainModel__Group__8__Impl rule__RailwayDomainModel__Group__9 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:763:2: rule__RailwayDomainModel__Group__8__Impl rule__RailwayDomainModel__Group__9
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__8__Impl_in_rule__RailwayDomainModel__Group__81545);
            rule__RailwayDomainModel__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__9_in_rule__RailwayDomainModel__Group__81548);
            rule__RailwayDomainModel__Group__9();

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
    // $ANTLR end "rule__RailwayDomainModel__Group__8"


    // $ANTLR start "rule__RailwayDomainModel__Group__8__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:770:1: rule__RailwayDomainModel__Group__8__Impl : ( ( rule__RailwayDomainModel__Group_8__0 )? ) ;
    public final void rule__RailwayDomainModel__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:774:1: ( ( ( rule__RailwayDomainModel__Group_8__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:775:1: ( ( rule__RailwayDomainModel__Group_8__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:775:1: ( ( rule__RailwayDomainModel__Group_8__0 )? )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:776:1: ( rule__RailwayDomainModel__Group_8__0 )?
            {
             before(grammarAccess.getRailwayDomainModelAccess().getGroup_8()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:777:1: ( rule__RailwayDomainModel__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:777:2: rule__RailwayDomainModel__Group_8__0
                    {
                    pushFollow(FOLLOW_rule__RailwayDomainModel__Group_8__0_in_rule__RailwayDomainModel__Group__8__Impl1575);
                    rule__RailwayDomainModel__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRailwayDomainModelAccess().getGroup_8()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group__8__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group__9"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:787:1: rule__RailwayDomainModel__Group__9 : rule__RailwayDomainModel__Group__9__Impl rule__RailwayDomainModel__Group__10 ;
    public final void rule__RailwayDomainModel__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:791:1: ( rule__RailwayDomainModel__Group__9__Impl rule__RailwayDomainModel__Group__10 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:792:2: rule__RailwayDomainModel__Group__9__Impl rule__RailwayDomainModel__Group__10
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__9__Impl_in_rule__RailwayDomainModel__Group__91606);
            rule__RailwayDomainModel__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__10_in_rule__RailwayDomainModel__Group__91609);
            rule__RailwayDomainModel__Group__10();

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
    // $ANTLR end "rule__RailwayDomainModel__Group__9"


    // $ANTLR start "rule__RailwayDomainModel__Group__9__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:799:1: rule__RailwayDomainModel__Group__9__Impl : ( ( rule__RailwayDomainModel__Group_9__0 )? ) ;
    public final void rule__RailwayDomainModel__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:803:1: ( ( ( rule__RailwayDomainModel__Group_9__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:804:1: ( ( rule__RailwayDomainModel__Group_9__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:804:1: ( ( rule__RailwayDomainModel__Group_9__0 )? )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:805:1: ( rule__RailwayDomainModel__Group_9__0 )?
            {
             before(grammarAccess.getRailwayDomainModelAccess().getGroup_9()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:806:1: ( rule__RailwayDomainModel__Group_9__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:806:2: rule__RailwayDomainModel__Group_9__0
                    {
                    pushFollow(FOLLOW_rule__RailwayDomainModel__Group_9__0_in_rule__RailwayDomainModel__Group__9__Impl1636);
                    rule__RailwayDomainModel__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRailwayDomainModelAccess().getGroup_9()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group__9__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group__10"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:816:1: rule__RailwayDomainModel__Group__10 : rule__RailwayDomainModel__Group__10__Impl rule__RailwayDomainModel__Group__11 ;
    public final void rule__RailwayDomainModel__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:820:1: ( rule__RailwayDomainModel__Group__10__Impl rule__RailwayDomainModel__Group__11 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:821:2: rule__RailwayDomainModel__Group__10__Impl rule__RailwayDomainModel__Group__11
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__10__Impl_in_rule__RailwayDomainModel__Group__101667);
            rule__RailwayDomainModel__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__11_in_rule__RailwayDomainModel__Group__101670);
            rule__RailwayDomainModel__Group__11();

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
    // $ANTLR end "rule__RailwayDomainModel__Group__10"


    // $ANTLR start "rule__RailwayDomainModel__Group__10__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:828:1: rule__RailwayDomainModel__Group__10__Impl : ( ( rule__RailwayDomainModel__Group_10__0 )? ) ;
    public final void rule__RailwayDomainModel__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:832:1: ( ( ( rule__RailwayDomainModel__Group_10__0 )? ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:833:1: ( ( rule__RailwayDomainModel__Group_10__0 )? )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:833:1: ( ( rule__RailwayDomainModel__Group_10__0 )? )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:834:1: ( rule__RailwayDomainModel__Group_10__0 )?
            {
             before(grammarAccess.getRailwayDomainModelAccess().getGroup_10()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:835:1: ( rule__RailwayDomainModel__Group_10__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:835:2: rule__RailwayDomainModel__Group_10__0
                    {
                    pushFollow(FOLLOW_rule__RailwayDomainModel__Group_10__0_in_rule__RailwayDomainModel__Group__10__Impl1697);
                    rule__RailwayDomainModel__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRailwayDomainModelAccess().getGroup_10()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group__10__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group__11"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:845:1: rule__RailwayDomainModel__Group__11 : rule__RailwayDomainModel__Group__11__Impl ;
    public final void rule__RailwayDomainModel__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:849:1: ( rule__RailwayDomainModel__Group__11__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:850:2: rule__RailwayDomainModel__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group__11__Impl_in_rule__RailwayDomainModel__Group__111728);
            rule__RailwayDomainModel__Group__11__Impl();

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
    // $ANTLR end "rule__RailwayDomainModel__Group__11"


    // $ANTLR start "rule__RailwayDomainModel__Group__11__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:856:1: rule__RailwayDomainModel__Group__11__Impl : ( '}' ) ;
    public final void rule__RailwayDomainModel__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:860:1: ( ( '}' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:861:1: ( '}' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:861:1: ( '}' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:862:1: '}'
            {
             before(grammarAccess.getRailwayDomainModelAccess().getRightCurlyBracketKeyword_11()); 
            match(input,13,FOLLOW_13_in_rule__RailwayDomainModel__Group__11__Impl1756); 
             after(grammarAccess.getRailwayDomainModelAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group__11__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_3__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:899:1: rule__RailwayDomainModel__Group_3__0 : rule__RailwayDomainModel__Group_3__0__Impl rule__RailwayDomainModel__Group_3__1 ;
    public final void rule__RailwayDomainModel__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:903:1: ( rule__RailwayDomainModel__Group_3__0__Impl rule__RailwayDomainModel__Group_3__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:904:2: rule__RailwayDomainModel__Group_3__0__Impl rule__RailwayDomainModel__Group_3__1
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_3__0__Impl_in_rule__RailwayDomainModel__Group_3__01811);
            rule__RailwayDomainModel__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_3__1_in_rule__RailwayDomainModel__Group_3__01814);
            rule__RailwayDomainModel__Group_3__1();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_3__0"


    // $ANTLR start "rule__RailwayDomainModel__Group_3__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:911:1: rule__RailwayDomainModel__Group_3__0__Impl : ( ( rule__RailwayDomainModel__TrainsAssignment_3_0 ) ) ;
    public final void rule__RailwayDomainModel__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:915:1: ( ( ( rule__RailwayDomainModel__TrainsAssignment_3_0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:916:1: ( ( rule__RailwayDomainModel__TrainsAssignment_3_0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:916:1: ( ( rule__RailwayDomainModel__TrainsAssignment_3_0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:917:1: ( rule__RailwayDomainModel__TrainsAssignment_3_0 )
            {
             before(grammarAccess.getRailwayDomainModelAccess().getTrainsAssignment_3_0()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:918:1: ( rule__RailwayDomainModel__TrainsAssignment_3_0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:918:2: rule__RailwayDomainModel__TrainsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__TrainsAssignment_3_0_in_rule__RailwayDomainModel__Group_3__0__Impl1841);
            rule__RailwayDomainModel__TrainsAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getRailwayDomainModelAccess().getTrainsAssignment_3_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_3__0__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_3__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:928:1: rule__RailwayDomainModel__Group_3__1 : rule__RailwayDomainModel__Group_3__1__Impl ;
    public final void rule__RailwayDomainModel__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:932:1: ( rule__RailwayDomainModel__Group_3__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:933:2: rule__RailwayDomainModel__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_3__1__Impl_in_rule__RailwayDomainModel__Group_3__11871);
            rule__RailwayDomainModel__Group_3__1__Impl();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_3__1"


    // $ANTLR start "rule__RailwayDomainModel__Group_3__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:939:1: rule__RailwayDomainModel__Group_3__1__Impl : ( ( rule__RailwayDomainModel__TrainsAssignment_3_1 )* ) ;
    public final void rule__RailwayDomainModel__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:943:1: ( ( ( rule__RailwayDomainModel__TrainsAssignment_3_1 )* ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:944:1: ( ( rule__RailwayDomainModel__TrainsAssignment_3_1 )* )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:944:1: ( ( rule__RailwayDomainModel__TrainsAssignment_3_1 )* )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:945:1: ( rule__RailwayDomainModel__TrainsAssignment_3_1 )*
            {
             before(grammarAccess.getRailwayDomainModelAccess().getTrainsAssignment_3_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:946:1: ( rule__RailwayDomainModel__TrainsAssignment_3_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:946:2: rule__RailwayDomainModel__TrainsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__RailwayDomainModel__TrainsAssignment_3_1_in_rule__RailwayDomainModel__Group_3__1__Impl1898);
            	    rule__RailwayDomainModel__TrainsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRailwayDomainModelAccess().getTrainsAssignment_3_1()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_3__1__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_4__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:960:1: rule__RailwayDomainModel__Group_4__0 : rule__RailwayDomainModel__Group_4__0__Impl rule__RailwayDomainModel__Group_4__1 ;
    public final void rule__RailwayDomainModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:964:1: ( rule__RailwayDomainModel__Group_4__0__Impl rule__RailwayDomainModel__Group_4__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:965:2: rule__RailwayDomainModel__Group_4__0__Impl rule__RailwayDomainModel__Group_4__1
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_4__0__Impl_in_rule__RailwayDomainModel__Group_4__01933);
            rule__RailwayDomainModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_4__1_in_rule__RailwayDomainModel__Group_4__01936);
            rule__RailwayDomainModel__Group_4__1();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_4__0"


    // $ANTLR start "rule__RailwayDomainModel__Group_4__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:972:1: rule__RailwayDomainModel__Group_4__0__Impl : ( ( rule__RailwayDomainModel__SectionsAssignment_4_0 ) ) ;
    public final void rule__RailwayDomainModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:976:1: ( ( ( rule__RailwayDomainModel__SectionsAssignment_4_0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:977:1: ( ( rule__RailwayDomainModel__SectionsAssignment_4_0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:977:1: ( ( rule__RailwayDomainModel__SectionsAssignment_4_0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:978:1: ( rule__RailwayDomainModel__SectionsAssignment_4_0 )
            {
             before(grammarAccess.getRailwayDomainModelAccess().getSectionsAssignment_4_0()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:979:1: ( rule__RailwayDomainModel__SectionsAssignment_4_0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:979:2: rule__RailwayDomainModel__SectionsAssignment_4_0
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__SectionsAssignment_4_0_in_rule__RailwayDomainModel__Group_4__0__Impl1963);
            rule__RailwayDomainModel__SectionsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getRailwayDomainModelAccess().getSectionsAssignment_4_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_4__0__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_4__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:989:1: rule__RailwayDomainModel__Group_4__1 : rule__RailwayDomainModel__Group_4__1__Impl ;
    public final void rule__RailwayDomainModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:993:1: ( rule__RailwayDomainModel__Group_4__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:994:2: rule__RailwayDomainModel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_4__1__Impl_in_rule__RailwayDomainModel__Group_4__11993);
            rule__RailwayDomainModel__Group_4__1__Impl();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_4__1"


    // $ANTLR start "rule__RailwayDomainModel__Group_4__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1000:1: rule__RailwayDomainModel__Group_4__1__Impl : ( ( rule__RailwayDomainModel__SectionsAssignment_4_1 )* ) ;
    public final void rule__RailwayDomainModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1004:1: ( ( ( rule__RailwayDomainModel__SectionsAssignment_4_1 )* ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1005:1: ( ( rule__RailwayDomainModel__SectionsAssignment_4_1 )* )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1005:1: ( ( rule__RailwayDomainModel__SectionsAssignment_4_1 )* )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1006:1: ( rule__RailwayDomainModel__SectionsAssignment_4_1 )*
            {
             before(grammarAccess.getRailwayDomainModelAccess().getSectionsAssignment_4_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1007:1: ( rule__RailwayDomainModel__SectionsAssignment_4_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15||LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1007:2: rule__RailwayDomainModel__SectionsAssignment_4_1
            	    {
            	    pushFollow(FOLLOW_rule__RailwayDomainModel__SectionsAssignment_4_1_in_rule__RailwayDomainModel__Group_4__1__Impl2020);
            	    rule__RailwayDomainModel__SectionsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRailwayDomainModelAccess().getSectionsAssignment_4_1()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_4__1__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_5__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1021:1: rule__RailwayDomainModel__Group_5__0 : rule__RailwayDomainModel__Group_5__0__Impl rule__RailwayDomainModel__Group_5__1 ;
    public final void rule__RailwayDomainModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1025:1: ( rule__RailwayDomainModel__Group_5__0__Impl rule__RailwayDomainModel__Group_5__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1026:2: rule__RailwayDomainModel__Group_5__0__Impl rule__RailwayDomainModel__Group_5__1
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_5__0__Impl_in_rule__RailwayDomainModel__Group_5__02055);
            rule__RailwayDomainModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_5__1_in_rule__RailwayDomainModel__Group_5__02058);
            rule__RailwayDomainModel__Group_5__1();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_5__0"


    // $ANTLR start "rule__RailwayDomainModel__Group_5__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1033:1: rule__RailwayDomainModel__Group_5__0__Impl : ( ( rule__RailwayDomainModel__TurnoutsAssignment_5_0 ) ) ;
    public final void rule__RailwayDomainModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1037:1: ( ( ( rule__RailwayDomainModel__TurnoutsAssignment_5_0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1038:1: ( ( rule__RailwayDomainModel__TurnoutsAssignment_5_0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1038:1: ( ( rule__RailwayDomainModel__TurnoutsAssignment_5_0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1039:1: ( rule__RailwayDomainModel__TurnoutsAssignment_5_0 )
            {
             before(grammarAccess.getRailwayDomainModelAccess().getTurnoutsAssignment_5_0()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1040:1: ( rule__RailwayDomainModel__TurnoutsAssignment_5_0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1040:2: rule__RailwayDomainModel__TurnoutsAssignment_5_0
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__TurnoutsAssignment_5_0_in_rule__RailwayDomainModel__Group_5__0__Impl2085);
            rule__RailwayDomainModel__TurnoutsAssignment_5_0();

            state._fsp--;


            }

             after(grammarAccess.getRailwayDomainModelAccess().getTurnoutsAssignment_5_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_5__0__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_5__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1050:1: rule__RailwayDomainModel__Group_5__1 : rule__RailwayDomainModel__Group_5__1__Impl ;
    public final void rule__RailwayDomainModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1054:1: ( rule__RailwayDomainModel__Group_5__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1055:2: rule__RailwayDomainModel__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_5__1__Impl_in_rule__RailwayDomainModel__Group_5__12115);
            rule__RailwayDomainModel__Group_5__1__Impl();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_5__1"


    // $ANTLR start "rule__RailwayDomainModel__Group_5__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1061:1: rule__RailwayDomainModel__Group_5__1__Impl : ( ( rule__RailwayDomainModel__TurnoutsAssignment_5_1 )* ) ;
    public final void rule__RailwayDomainModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1065:1: ( ( ( rule__RailwayDomainModel__TurnoutsAssignment_5_1 )* ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1066:1: ( ( rule__RailwayDomainModel__TurnoutsAssignment_5_1 )* )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1066:1: ( ( rule__RailwayDomainModel__TurnoutsAssignment_5_1 )* )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1067:1: ( rule__RailwayDomainModel__TurnoutsAssignment_5_1 )*
            {
             before(grammarAccess.getRailwayDomainModelAccess().getTurnoutsAssignment_5_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1068:1: ( rule__RailwayDomainModel__TurnoutsAssignment_5_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1068:2: rule__RailwayDomainModel__TurnoutsAssignment_5_1
            	    {
            	    pushFollow(FOLLOW_rule__RailwayDomainModel__TurnoutsAssignment_5_1_in_rule__RailwayDomainModel__Group_5__1__Impl2142);
            	    rule__RailwayDomainModel__TurnoutsAssignment_5_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getRailwayDomainModelAccess().getTurnoutsAssignment_5_1()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_5__1__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_6__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1082:1: rule__RailwayDomainModel__Group_6__0 : rule__RailwayDomainModel__Group_6__0__Impl rule__RailwayDomainModel__Group_6__1 ;
    public final void rule__RailwayDomainModel__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1086:1: ( rule__RailwayDomainModel__Group_6__0__Impl rule__RailwayDomainModel__Group_6__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1087:2: rule__RailwayDomainModel__Group_6__0__Impl rule__RailwayDomainModel__Group_6__1
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_6__0__Impl_in_rule__RailwayDomainModel__Group_6__02177);
            rule__RailwayDomainModel__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_6__1_in_rule__RailwayDomainModel__Group_6__02180);
            rule__RailwayDomainModel__Group_6__1();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_6__0"


    // $ANTLR start "rule__RailwayDomainModel__Group_6__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1094:1: rule__RailwayDomainModel__Group_6__0__Impl : ( ( rule__RailwayDomainModel__EditorCPAssignment_6_0 ) ) ;
    public final void rule__RailwayDomainModel__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1098:1: ( ( ( rule__RailwayDomainModel__EditorCPAssignment_6_0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1099:1: ( ( rule__RailwayDomainModel__EditorCPAssignment_6_0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1099:1: ( ( rule__RailwayDomainModel__EditorCPAssignment_6_0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1100:1: ( rule__RailwayDomainModel__EditorCPAssignment_6_0 )
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorCPAssignment_6_0()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1101:1: ( rule__RailwayDomainModel__EditorCPAssignment_6_0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1101:2: rule__RailwayDomainModel__EditorCPAssignment_6_0
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__EditorCPAssignment_6_0_in_rule__RailwayDomainModel__Group_6__0__Impl2207);
            rule__RailwayDomainModel__EditorCPAssignment_6_0();

            state._fsp--;


            }

             after(grammarAccess.getRailwayDomainModelAccess().getEditorCPAssignment_6_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_6__0__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_6__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1111:1: rule__RailwayDomainModel__Group_6__1 : rule__RailwayDomainModel__Group_6__1__Impl ;
    public final void rule__RailwayDomainModel__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1115:1: ( rule__RailwayDomainModel__Group_6__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1116:2: rule__RailwayDomainModel__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_6__1__Impl_in_rule__RailwayDomainModel__Group_6__12237);
            rule__RailwayDomainModel__Group_6__1__Impl();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_6__1"


    // $ANTLR start "rule__RailwayDomainModel__Group_6__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1122:1: rule__RailwayDomainModel__Group_6__1__Impl : ( ( rule__RailwayDomainModel__EditorCPAssignment_6_1 )* ) ;
    public final void rule__RailwayDomainModel__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1126:1: ( ( ( rule__RailwayDomainModel__EditorCPAssignment_6_1 )* ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1127:1: ( ( rule__RailwayDomainModel__EditorCPAssignment_6_1 )* )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1127:1: ( ( rule__RailwayDomainModel__EditorCPAssignment_6_1 )* )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1128:1: ( rule__RailwayDomainModel__EditorCPAssignment_6_1 )*
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorCPAssignment_6_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1129:1: ( rule__RailwayDomainModel__EditorCPAssignment_6_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==17) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1129:2: rule__RailwayDomainModel__EditorCPAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__RailwayDomainModel__EditorCPAssignment_6_1_in_rule__RailwayDomainModel__Group_6__1__Impl2264);
            	    rule__RailwayDomainModel__EditorCPAssignment_6_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRailwayDomainModelAccess().getEditorCPAssignment_6_1()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_6__1__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_7__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1143:1: rule__RailwayDomainModel__Group_7__0 : rule__RailwayDomainModel__Group_7__0__Impl rule__RailwayDomainModel__Group_7__1 ;
    public final void rule__RailwayDomainModel__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1147:1: ( rule__RailwayDomainModel__Group_7__0__Impl rule__RailwayDomainModel__Group_7__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1148:2: rule__RailwayDomainModel__Group_7__0__Impl rule__RailwayDomainModel__Group_7__1
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_7__0__Impl_in_rule__RailwayDomainModel__Group_7__02299);
            rule__RailwayDomainModel__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_7__1_in_rule__RailwayDomainModel__Group_7__02302);
            rule__RailwayDomainModel__Group_7__1();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_7__0"


    // $ANTLR start "rule__RailwayDomainModel__Group_7__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1155:1: rule__RailwayDomainModel__Group_7__0__Impl : ( ( rule__RailwayDomainModel__EditorSignalAssignment_7_0 ) ) ;
    public final void rule__RailwayDomainModel__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1159:1: ( ( ( rule__RailwayDomainModel__EditorSignalAssignment_7_0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1160:1: ( ( rule__RailwayDomainModel__EditorSignalAssignment_7_0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1160:1: ( ( rule__RailwayDomainModel__EditorSignalAssignment_7_0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1161:1: ( rule__RailwayDomainModel__EditorSignalAssignment_7_0 )
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorSignalAssignment_7_0()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1162:1: ( rule__RailwayDomainModel__EditorSignalAssignment_7_0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1162:2: rule__RailwayDomainModel__EditorSignalAssignment_7_0
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__EditorSignalAssignment_7_0_in_rule__RailwayDomainModel__Group_7__0__Impl2329);
            rule__RailwayDomainModel__EditorSignalAssignment_7_0();

            state._fsp--;


            }

             after(grammarAccess.getRailwayDomainModelAccess().getEditorSignalAssignment_7_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_7__0__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_7__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1172:1: rule__RailwayDomainModel__Group_7__1 : rule__RailwayDomainModel__Group_7__1__Impl ;
    public final void rule__RailwayDomainModel__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1176:1: ( rule__RailwayDomainModel__Group_7__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1177:2: rule__RailwayDomainModel__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_7__1__Impl_in_rule__RailwayDomainModel__Group_7__12359);
            rule__RailwayDomainModel__Group_7__1__Impl();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_7__1"


    // $ANTLR start "rule__RailwayDomainModel__Group_7__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1183:1: rule__RailwayDomainModel__Group_7__1__Impl : ( ( rule__RailwayDomainModel__EditorSignalAssignment_7_1 )* ) ;
    public final void rule__RailwayDomainModel__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1187:1: ( ( ( rule__RailwayDomainModel__EditorSignalAssignment_7_1 )* ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1188:1: ( ( rule__RailwayDomainModel__EditorSignalAssignment_7_1 )* )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1188:1: ( ( rule__RailwayDomainModel__EditorSignalAssignment_7_1 )* )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1189:1: ( rule__RailwayDomainModel__EditorSignalAssignment_7_1 )*
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorSignalAssignment_7_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1190:1: ( rule__RailwayDomainModel__EditorSignalAssignment_7_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==18||LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1190:2: rule__RailwayDomainModel__EditorSignalAssignment_7_1
            	    {
            	    pushFollow(FOLLOW_rule__RailwayDomainModel__EditorSignalAssignment_7_1_in_rule__RailwayDomainModel__Group_7__1__Impl2386);
            	    rule__RailwayDomainModel__EditorSignalAssignment_7_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getRailwayDomainModelAccess().getEditorSignalAssignment_7_1()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_7__1__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_8__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1204:1: rule__RailwayDomainModel__Group_8__0 : rule__RailwayDomainModel__Group_8__0__Impl rule__RailwayDomainModel__Group_8__1 ;
    public final void rule__RailwayDomainModel__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1208:1: ( rule__RailwayDomainModel__Group_8__0__Impl rule__RailwayDomainModel__Group_8__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1209:2: rule__RailwayDomainModel__Group_8__0__Impl rule__RailwayDomainModel__Group_8__1
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_8__0__Impl_in_rule__RailwayDomainModel__Group_8__02421);
            rule__RailwayDomainModel__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_8__1_in_rule__RailwayDomainModel__Group_8__02424);
            rule__RailwayDomainModel__Group_8__1();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_8__0"


    // $ANTLR start "rule__RailwayDomainModel__Group_8__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1216:1: rule__RailwayDomainModel__Group_8__0__Impl : ( ( rule__RailwayDomainModel__EditorTDDAssignment_8_0 ) ) ;
    public final void rule__RailwayDomainModel__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1220:1: ( ( ( rule__RailwayDomainModel__EditorTDDAssignment_8_0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1221:1: ( ( rule__RailwayDomainModel__EditorTDDAssignment_8_0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1221:1: ( ( rule__RailwayDomainModel__EditorTDDAssignment_8_0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1222:1: ( rule__RailwayDomainModel__EditorTDDAssignment_8_0 )
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorTDDAssignment_8_0()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1223:1: ( rule__RailwayDomainModel__EditorTDDAssignment_8_0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1223:2: rule__RailwayDomainModel__EditorTDDAssignment_8_0
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__EditorTDDAssignment_8_0_in_rule__RailwayDomainModel__Group_8__0__Impl2451);
            rule__RailwayDomainModel__EditorTDDAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getRailwayDomainModelAccess().getEditorTDDAssignment_8_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_8__0__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_8__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1233:1: rule__RailwayDomainModel__Group_8__1 : rule__RailwayDomainModel__Group_8__1__Impl ;
    public final void rule__RailwayDomainModel__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1237:1: ( rule__RailwayDomainModel__Group_8__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1238:2: rule__RailwayDomainModel__Group_8__1__Impl
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_8__1__Impl_in_rule__RailwayDomainModel__Group_8__12481);
            rule__RailwayDomainModel__Group_8__1__Impl();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_8__1"


    // $ANTLR start "rule__RailwayDomainModel__Group_8__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1244:1: rule__RailwayDomainModel__Group_8__1__Impl : ( ( rule__RailwayDomainModel__EditorTDDAssignment_8_1 )* ) ;
    public final void rule__RailwayDomainModel__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1248:1: ( ( ( rule__RailwayDomainModel__EditorTDDAssignment_8_1 )* ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1249:1: ( ( rule__RailwayDomainModel__EditorTDDAssignment_8_1 )* )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1249:1: ( ( rule__RailwayDomainModel__EditorTDDAssignment_8_1 )* )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1250:1: ( rule__RailwayDomainModel__EditorTDDAssignment_8_1 )*
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorTDDAssignment_8_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1251:1: ( rule__RailwayDomainModel__EditorTDDAssignment_8_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==19) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1251:2: rule__RailwayDomainModel__EditorTDDAssignment_8_1
            	    {
            	    pushFollow(FOLLOW_rule__RailwayDomainModel__EditorTDDAssignment_8_1_in_rule__RailwayDomainModel__Group_8__1__Impl2508);
            	    rule__RailwayDomainModel__EditorTDDAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getRailwayDomainModelAccess().getEditorTDDAssignment_8_1()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_8__1__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_9__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1265:1: rule__RailwayDomainModel__Group_9__0 : rule__RailwayDomainModel__Group_9__0__Impl rule__RailwayDomainModel__Group_9__1 ;
    public final void rule__RailwayDomainModel__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1269:1: ( rule__RailwayDomainModel__Group_9__0__Impl rule__RailwayDomainModel__Group_9__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1270:2: rule__RailwayDomainModel__Group_9__0__Impl rule__RailwayDomainModel__Group_9__1
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_9__0__Impl_in_rule__RailwayDomainModel__Group_9__02543);
            rule__RailwayDomainModel__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_9__1_in_rule__RailwayDomainModel__Group_9__02546);
            rule__RailwayDomainModel__Group_9__1();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_9__0"


    // $ANTLR start "rule__RailwayDomainModel__Group_9__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1277:1: rule__RailwayDomainModel__Group_9__0__Impl : ( ( rule__RailwayDomainModel__EditorRouteAssignment_9_0 ) ) ;
    public final void rule__RailwayDomainModel__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1281:1: ( ( ( rule__RailwayDomainModel__EditorRouteAssignment_9_0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1282:1: ( ( rule__RailwayDomainModel__EditorRouteAssignment_9_0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1282:1: ( ( rule__RailwayDomainModel__EditorRouteAssignment_9_0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1283:1: ( rule__RailwayDomainModel__EditorRouteAssignment_9_0 )
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorRouteAssignment_9_0()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1284:1: ( rule__RailwayDomainModel__EditorRouteAssignment_9_0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1284:2: rule__RailwayDomainModel__EditorRouteAssignment_9_0
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__EditorRouteAssignment_9_0_in_rule__RailwayDomainModel__Group_9__0__Impl2573);
            rule__RailwayDomainModel__EditorRouteAssignment_9_0();

            state._fsp--;


            }

             after(grammarAccess.getRailwayDomainModelAccess().getEditorRouteAssignment_9_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_9__0__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_9__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1294:1: rule__RailwayDomainModel__Group_9__1 : rule__RailwayDomainModel__Group_9__1__Impl ;
    public final void rule__RailwayDomainModel__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1298:1: ( rule__RailwayDomainModel__Group_9__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1299:2: rule__RailwayDomainModel__Group_9__1__Impl
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_9__1__Impl_in_rule__RailwayDomainModel__Group_9__12603);
            rule__RailwayDomainModel__Group_9__1__Impl();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_9__1"


    // $ANTLR start "rule__RailwayDomainModel__Group_9__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1305:1: rule__RailwayDomainModel__Group_9__1__Impl : ( ( rule__RailwayDomainModel__EditorRouteAssignment_9_1 )* ) ;
    public final void rule__RailwayDomainModel__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1309:1: ( ( ( rule__RailwayDomainModel__EditorRouteAssignment_9_1 )* ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1310:1: ( ( rule__RailwayDomainModel__EditorRouteAssignment_9_1 )* )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1310:1: ( ( rule__RailwayDomainModel__EditorRouteAssignment_9_1 )* )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1311:1: ( rule__RailwayDomainModel__EditorRouteAssignment_9_1 )*
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorRouteAssignment_9_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1312:1: ( rule__RailwayDomainModel__EditorRouteAssignment_9_1 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1312:2: rule__RailwayDomainModel__EditorRouteAssignment_9_1
            	    {
            	    pushFollow(FOLLOW_rule__RailwayDomainModel__EditorRouteAssignment_9_1_in_rule__RailwayDomainModel__Group_9__1__Impl2630);
            	    rule__RailwayDomainModel__EditorRouteAssignment_9_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRailwayDomainModelAccess().getEditorRouteAssignment_9_1()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_9__1__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_10__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1326:1: rule__RailwayDomainModel__Group_10__0 : rule__RailwayDomainModel__Group_10__0__Impl rule__RailwayDomainModel__Group_10__1 ;
    public final void rule__RailwayDomainModel__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1330:1: ( rule__RailwayDomainModel__Group_10__0__Impl rule__RailwayDomainModel__Group_10__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1331:2: rule__RailwayDomainModel__Group_10__0__Impl rule__RailwayDomainModel__Group_10__1
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_10__0__Impl_in_rule__RailwayDomainModel__Group_10__02665);
            rule__RailwayDomainModel__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_10__1_in_rule__RailwayDomainModel__Group_10__02668);
            rule__RailwayDomainModel__Group_10__1();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_10__0"


    // $ANTLR start "rule__RailwayDomainModel__Group_10__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1338:1: rule__RailwayDomainModel__Group_10__0__Impl : ( ( rule__RailwayDomainModel__EditorRouteElementAssignment_10_0 ) ) ;
    public final void rule__RailwayDomainModel__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1342:1: ( ( ( rule__RailwayDomainModel__EditorRouteElementAssignment_10_0 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1343:1: ( ( rule__RailwayDomainModel__EditorRouteElementAssignment_10_0 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1343:1: ( ( rule__RailwayDomainModel__EditorRouteElementAssignment_10_0 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1344:1: ( rule__RailwayDomainModel__EditorRouteElementAssignment_10_0 )
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementAssignment_10_0()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1345:1: ( rule__RailwayDomainModel__EditorRouteElementAssignment_10_0 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1345:2: rule__RailwayDomainModel__EditorRouteElementAssignment_10_0
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__EditorRouteElementAssignment_10_0_in_rule__RailwayDomainModel__Group_10__0__Impl2695);
            rule__RailwayDomainModel__EditorRouteElementAssignment_10_0();

            state._fsp--;


            }

             after(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementAssignment_10_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_10__0__Impl"


    // $ANTLR start "rule__RailwayDomainModel__Group_10__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1355:1: rule__RailwayDomainModel__Group_10__1 : rule__RailwayDomainModel__Group_10__1__Impl ;
    public final void rule__RailwayDomainModel__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1359:1: ( rule__RailwayDomainModel__Group_10__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1360:2: rule__RailwayDomainModel__Group_10__1__Impl
            {
            pushFollow(FOLLOW_rule__RailwayDomainModel__Group_10__1__Impl_in_rule__RailwayDomainModel__Group_10__12725);
            rule__RailwayDomainModel__Group_10__1__Impl();

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
    // $ANTLR end "rule__RailwayDomainModel__Group_10__1"


    // $ANTLR start "rule__RailwayDomainModel__Group_10__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1366:1: rule__RailwayDomainModel__Group_10__1__Impl : ( ( rule__RailwayDomainModel__EditorRouteElementAssignment_10_1 )* ) ;
    public final void rule__RailwayDomainModel__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1370:1: ( ( ( rule__RailwayDomainModel__EditorRouteElementAssignment_10_1 )* ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1371:1: ( ( rule__RailwayDomainModel__EditorRouteElementAssignment_10_1 )* )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1371:1: ( ( rule__RailwayDomainModel__EditorRouteElementAssignment_10_1 )* )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1372:1: ( rule__RailwayDomainModel__EditorRouteElementAssignment_10_1 )*
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementAssignment_10_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1373:1: ( rule__RailwayDomainModel__EditorRouteElementAssignment_10_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1373:2: rule__RailwayDomainModel__EditorRouteElementAssignment_10_1
            	    {
            	    pushFollow(FOLLOW_rule__RailwayDomainModel__EditorRouteElementAssignment_10_1_in_rule__RailwayDomainModel__Group_10__1__Impl2752);
            	    rule__RailwayDomainModel__EditorRouteElementAssignment_10_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementAssignment_10_1()); 

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
    // $ANTLR end "rule__RailwayDomainModel__Group_10__1__Impl"


    // $ANTLR start "rule__Train__Group__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1387:1: rule__Train__Group__0 : rule__Train__Group__0__Impl rule__Train__Group__1 ;
    public final void rule__Train__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1391:1: ( rule__Train__Group__0__Impl rule__Train__Group__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1392:2: rule__Train__Group__0__Impl rule__Train__Group__1
            {
            pushFollow(FOLLOW_rule__Train__Group__0__Impl_in_rule__Train__Group__02787);
            rule__Train__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Train__Group__1_in_rule__Train__Group__02790);
            rule__Train__Group__1();

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
    // $ANTLR end "rule__Train__Group__0"


    // $ANTLR start "rule__Train__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1399:1: rule__Train__Group__0__Impl : ( 'Train' ) ;
    public final void rule__Train__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1403:1: ( ( 'Train' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1404:1: ( 'Train' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1404:1: ( 'Train' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1405:1: 'Train'
            {
             before(grammarAccess.getTrainAccess().getTrainKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__Train__Group__0__Impl2818); 
             after(grammarAccess.getTrainAccess().getTrainKeyword_0()); 

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
    // $ANTLR end "rule__Train__Group__0__Impl"


    // $ANTLR start "rule__Train__Group__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1418:1: rule__Train__Group__1 : rule__Train__Group__1__Impl ;
    public final void rule__Train__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1422:1: ( rule__Train__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1423:2: rule__Train__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Train__Group__1__Impl_in_rule__Train__Group__12849);
            rule__Train__Group__1__Impl();

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
    // $ANTLR end "rule__Train__Group__1"


    // $ANTLR start "rule__Train__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1429:1: rule__Train__Group__1__Impl : ( ( rule__Train__NameAssignment_1 ) ) ;
    public final void rule__Train__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1433:1: ( ( ( rule__Train__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1434:1: ( ( rule__Train__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1434:1: ( ( rule__Train__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1435:1: ( rule__Train__NameAssignment_1 )
            {
             before(grammarAccess.getTrainAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1436:1: ( rule__Train__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1436:2: rule__Train__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Train__NameAssignment_1_in_rule__Train__Group__1__Impl2876);
            rule__Train__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTrainAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Train__Group__1__Impl"


    // $ANTLR start "rule__Section_Impl__Group__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1450:1: rule__Section_Impl__Group__0 : rule__Section_Impl__Group__0__Impl rule__Section_Impl__Group__1 ;
    public final void rule__Section_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1454:1: ( rule__Section_Impl__Group__0__Impl rule__Section_Impl__Group__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1455:2: rule__Section_Impl__Group__0__Impl rule__Section_Impl__Group__1
            {
            pushFollow(FOLLOW_rule__Section_Impl__Group__0__Impl_in_rule__Section_Impl__Group__02910);
            rule__Section_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Section_Impl__Group__1_in_rule__Section_Impl__Group__02913);
            rule__Section_Impl__Group__1();

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
    // $ANTLR end "rule__Section_Impl__Group__0"


    // $ANTLR start "rule__Section_Impl__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1462:1: rule__Section_Impl__Group__0__Impl : ( 'Section' ) ;
    public final void rule__Section_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1466:1: ( ( 'Section' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1467:1: ( 'Section' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1467:1: ( 'Section' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1468:1: 'Section'
            {
             before(grammarAccess.getSection_ImplAccess().getSectionKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__Section_Impl__Group__0__Impl2941); 
             after(grammarAccess.getSection_ImplAccess().getSectionKeyword_0()); 

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
    // $ANTLR end "rule__Section_Impl__Group__0__Impl"


    // $ANTLR start "rule__Section_Impl__Group__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1481:1: rule__Section_Impl__Group__1 : rule__Section_Impl__Group__1__Impl ;
    public final void rule__Section_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1485:1: ( rule__Section_Impl__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1486:2: rule__Section_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Section_Impl__Group__1__Impl_in_rule__Section_Impl__Group__12972);
            rule__Section_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__Section_Impl__Group__1"


    // $ANTLR start "rule__Section_Impl__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1492:1: rule__Section_Impl__Group__1__Impl : ( ( rule__Section_Impl__NameAssignment_1 ) ) ;
    public final void rule__Section_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1496:1: ( ( ( rule__Section_Impl__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1497:1: ( ( rule__Section_Impl__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1497:1: ( ( rule__Section_Impl__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1498:1: ( rule__Section_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getSection_ImplAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1499:1: ( rule__Section_Impl__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1499:2: rule__Section_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Section_Impl__NameAssignment_1_in_rule__Section_Impl__Group__1__Impl2999);
            rule__Section_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSection_ImplAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Section_Impl__Group__1__Impl"


    // $ANTLR start "rule__Turnout__Group__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1513:1: rule__Turnout__Group__0 : rule__Turnout__Group__0__Impl rule__Turnout__Group__1 ;
    public final void rule__Turnout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1517:1: ( rule__Turnout__Group__0__Impl rule__Turnout__Group__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1518:2: rule__Turnout__Group__0__Impl rule__Turnout__Group__1
            {
            pushFollow(FOLLOW_rule__Turnout__Group__0__Impl_in_rule__Turnout__Group__03033);
            rule__Turnout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Turnout__Group__1_in_rule__Turnout__Group__03036);
            rule__Turnout__Group__1();

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
    // $ANTLR end "rule__Turnout__Group__0"


    // $ANTLR start "rule__Turnout__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1525:1: rule__Turnout__Group__0__Impl : ( 'Turnout' ) ;
    public final void rule__Turnout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1529:1: ( ( 'Turnout' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1530:1: ( 'Turnout' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1530:1: ( 'Turnout' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1531:1: 'Turnout'
            {
             before(grammarAccess.getTurnoutAccess().getTurnoutKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Turnout__Group__0__Impl3064); 
             after(grammarAccess.getTurnoutAccess().getTurnoutKeyword_0()); 

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
    // $ANTLR end "rule__Turnout__Group__0__Impl"


    // $ANTLR start "rule__Turnout__Group__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1544:1: rule__Turnout__Group__1 : rule__Turnout__Group__1__Impl ;
    public final void rule__Turnout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1548:1: ( rule__Turnout__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1549:2: rule__Turnout__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Turnout__Group__1__Impl_in_rule__Turnout__Group__13095);
            rule__Turnout__Group__1__Impl();

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
    // $ANTLR end "rule__Turnout__Group__1"


    // $ANTLR start "rule__Turnout__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1555:1: rule__Turnout__Group__1__Impl : ( ( rule__Turnout__NameAssignment_1 ) ) ;
    public final void rule__Turnout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1559:1: ( ( ( rule__Turnout__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1560:1: ( ( rule__Turnout__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1560:1: ( ( rule__Turnout__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1561:1: ( rule__Turnout__NameAssignment_1 )
            {
             before(grammarAccess.getTurnoutAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1562:1: ( rule__Turnout__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1562:2: rule__Turnout__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Turnout__NameAssignment_1_in_rule__Turnout__Group__1__Impl3122);
            rule__Turnout__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Turnout__Group__1__Impl"


    // $ANTLR start "rule__ConnectionPoint__Group__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1576:1: rule__ConnectionPoint__Group__0 : rule__ConnectionPoint__Group__0__Impl rule__ConnectionPoint__Group__1 ;
    public final void rule__ConnectionPoint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1580:1: ( rule__ConnectionPoint__Group__0__Impl rule__ConnectionPoint__Group__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1581:2: rule__ConnectionPoint__Group__0__Impl rule__ConnectionPoint__Group__1
            {
            pushFollow(FOLLOW_rule__ConnectionPoint__Group__0__Impl_in_rule__ConnectionPoint__Group__03156);
            rule__ConnectionPoint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ConnectionPoint__Group__1_in_rule__ConnectionPoint__Group__03159);
            rule__ConnectionPoint__Group__1();

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
    // $ANTLR end "rule__ConnectionPoint__Group__0"


    // $ANTLR start "rule__ConnectionPoint__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1588:1: rule__ConnectionPoint__Group__0__Impl : ( 'ConnectionPoint' ) ;
    public final void rule__ConnectionPoint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1592:1: ( ( 'ConnectionPoint' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1593:1: ( 'ConnectionPoint' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1593:1: ( 'ConnectionPoint' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1594:1: 'ConnectionPoint'
            {
             before(grammarAccess.getConnectionPointAccess().getConnectionPointKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__ConnectionPoint__Group__0__Impl3187); 
             after(grammarAccess.getConnectionPointAccess().getConnectionPointKeyword_0()); 

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
    // $ANTLR end "rule__ConnectionPoint__Group__0__Impl"


    // $ANTLR start "rule__ConnectionPoint__Group__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1607:1: rule__ConnectionPoint__Group__1 : rule__ConnectionPoint__Group__1__Impl ;
    public final void rule__ConnectionPoint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1611:1: ( rule__ConnectionPoint__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1612:2: rule__ConnectionPoint__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ConnectionPoint__Group__1__Impl_in_rule__ConnectionPoint__Group__13218);
            rule__ConnectionPoint__Group__1__Impl();

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
    // $ANTLR end "rule__ConnectionPoint__Group__1"


    // $ANTLR start "rule__ConnectionPoint__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1618:1: rule__ConnectionPoint__Group__1__Impl : ( ( rule__ConnectionPoint__NameAssignment_1 ) ) ;
    public final void rule__ConnectionPoint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1622:1: ( ( ( rule__ConnectionPoint__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1623:1: ( ( rule__ConnectionPoint__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1623:1: ( ( rule__ConnectionPoint__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1624:1: ( rule__ConnectionPoint__NameAssignment_1 )
            {
             before(grammarAccess.getConnectionPointAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1625:1: ( rule__ConnectionPoint__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1625:2: rule__ConnectionPoint__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ConnectionPoint__NameAssignment_1_in_rule__ConnectionPoint__Group__1__Impl3245);
            rule__ConnectionPoint__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionPointAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__ConnectionPoint__Group__1__Impl"


    // $ANTLR start "rule__Signal_Impl__Group__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1639:1: rule__Signal_Impl__Group__0 : rule__Signal_Impl__Group__0__Impl rule__Signal_Impl__Group__1 ;
    public final void rule__Signal_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1643:1: ( rule__Signal_Impl__Group__0__Impl rule__Signal_Impl__Group__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1644:2: rule__Signal_Impl__Group__0__Impl rule__Signal_Impl__Group__1
            {
            pushFollow(FOLLOW_rule__Signal_Impl__Group__0__Impl_in_rule__Signal_Impl__Group__03279);
            rule__Signal_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Signal_Impl__Group__1_in_rule__Signal_Impl__Group__03282);
            rule__Signal_Impl__Group__1();

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
    // $ANTLR end "rule__Signal_Impl__Group__0"


    // $ANTLR start "rule__Signal_Impl__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1651:1: rule__Signal_Impl__Group__0__Impl : ( 'Signal' ) ;
    public final void rule__Signal_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1655:1: ( ( 'Signal' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1656:1: ( 'Signal' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1656:1: ( 'Signal' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1657:1: 'Signal'
            {
             before(grammarAccess.getSignal_ImplAccess().getSignalKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Signal_Impl__Group__0__Impl3310); 
             after(grammarAccess.getSignal_ImplAccess().getSignalKeyword_0()); 

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
    // $ANTLR end "rule__Signal_Impl__Group__0__Impl"


    // $ANTLR start "rule__Signal_Impl__Group__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1670:1: rule__Signal_Impl__Group__1 : rule__Signal_Impl__Group__1__Impl ;
    public final void rule__Signal_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1674:1: ( rule__Signal_Impl__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1675:2: rule__Signal_Impl__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Signal_Impl__Group__1__Impl_in_rule__Signal_Impl__Group__13341);
            rule__Signal_Impl__Group__1__Impl();

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
    // $ANTLR end "rule__Signal_Impl__Group__1"


    // $ANTLR start "rule__Signal_Impl__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1681:1: rule__Signal_Impl__Group__1__Impl : ( ( rule__Signal_Impl__NameAssignment_1 ) ) ;
    public final void rule__Signal_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1685:1: ( ( ( rule__Signal_Impl__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1686:1: ( ( rule__Signal_Impl__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1686:1: ( ( rule__Signal_Impl__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1687:1: ( rule__Signal_Impl__NameAssignment_1 )
            {
             before(grammarAccess.getSignal_ImplAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1688:1: ( rule__Signal_Impl__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1688:2: rule__Signal_Impl__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Signal_Impl__NameAssignment_1_in_rule__Signal_Impl__Group__1__Impl3368);
            rule__Signal_Impl__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSignal_ImplAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Signal_Impl__Group__1__Impl"


    // $ANTLR start "rule__TurnoutDesiredDirection__Group__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1702:1: rule__TurnoutDesiredDirection__Group__0 : rule__TurnoutDesiredDirection__Group__0__Impl rule__TurnoutDesiredDirection__Group__1 ;
    public final void rule__TurnoutDesiredDirection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1706:1: ( rule__TurnoutDesiredDirection__Group__0__Impl rule__TurnoutDesiredDirection__Group__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1707:2: rule__TurnoutDesiredDirection__Group__0__Impl rule__TurnoutDesiredDirection__Group__1
            {
            pushFollow(FOLLOW_rule__TurnoutDesiredDirection__Group__0__Impl_in_rule__TurnoutDesiredDirection__Group__03402);
            rule__TurnoutDesiredDirection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TurnoutDesiredDirection__Group__1_in_rule__TurnoutDesiredDirection__Group__03405);
            rule__TurnoutDesiredDirection__Group__1();

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
    // $ANTLR end "rule__TurnoutDesiredDirection__Group__0"


    // $ANTLR start "rule__TurnoutDesiredDirection__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1714:1: rule__TurnoutDesiredDirection__Group__0__Impl : ( 'TurnoutDesiredDirection' ) ;
    public final void rule__TurnoutDesiredDirection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1718:1: ( ( 'TurnoutDesiredDirection' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1719:1: ( 'TurnoutDesiredDirection' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1719:1: ( 'TurnoutDesiredDirection' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1720:1: 'TurnoutDesiredDirection'
            {
             before(grammarAccess.getTurnoutDesiredDirectionAccess().getTurnoutDesiredDirectionKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__TurnoutDesiredDirection__Group__0__Impl3433); 
             after(grammarAccess.getTurnoutDesiredDirectionAccess().getTurnoutDesiredDirectionKeyword_0()); 

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
    // $ANTLR end "rule__TurnoutDesiredDirection__Group__0__Impl"


    // $ANTLR start "rule__TurnoutDesiredDirection__Group__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1733:1: rule__TurnoutDesiredDirection__Group__1 : rule__TurnoutDesiredDirection__Group__1__Impl ;
    public final void rule__TurnoutDesiredDirection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1737:1: ( rule__TurnoutDesiredDirection__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1738:2: rule__TurnoutDesiredDirection__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TurnoutDesiredDirection__Group__1__Impl_in_rule__TurnoutDesiredDirection__Group__13464);
            rule__TurnoutDesiredDirection__Group__1__Impl();

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
    // $ANTLR end "rule__TurnoutDesiredDirection__Group__1"


    // $ANTLR start "rule__TurnoutDesiredDirection__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1744:1: rule__TurnoutDesiredDirection__Group__1__Impl : ( ( rule__TurnoutDesiredDirection__NameAssignment_1 ) ) ;
    public final void rule__TurnoutDesiredDirection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1748:1: ( ( ( rule__TurnoutDesiredDirection__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1749:1: ( ( rule__TurnoutDesiredDirection__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1749:1: ( ( rule__TurnoutDesiredDirection__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1750:1: ( rule__TurnoutDesiredDirection__NameAssignment_1 )
            {
             before(grammarAccess.getTurnoutDesiredDirectionAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1751:1: ( rule__TurnoutDesiredDirection__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1751:2: rule__TurnoutDesiredDirection__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TurnoutDesiredDirection__NameAssignment_1_in_rule__TurnoutDesiredDirection__Group__1__Impl3491);
            rule__TurnoutDesiredDirection__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutDesiredDirectionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TurnoutDesiredDirection__Group__1__Impl"


    // $ANTLR start "rule__Route__Group__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1765:1: rule__Route__Group__0 : rule__Route__Group__0__Impl rule__Route__Group__1 ;
    public final void rule__Route__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1769:1: ( rule__Route__Group__0__Impl rule__Route__Group__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1770:2: rule__Route__Group__0__Impl rule__Route__Group__1
            {
            pushFollow(FOLLOW_rule__Route__Group__0__Impl_in_rule__Route__Group__03525);
            rule__Route__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Route__Group__1_in_rule__Route__Group__03528);
            rule__Route__Group__1();

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
    // $ANTLR end "rule__Route__Group__0"


    // $ANTLR start "rule__Route__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1777:1: rule__Route__Group__0__Impl : ( 'Route' ) ;
    public final void rule__Route__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1781:1: ( ( 'Route' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1782:1: ( 'Route' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1782:1: ( 'Route' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1783:1: 'Route'
            {
             before(grammarAccess.getRouteAccess().getRouteKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__Route__Group__0__Impl3556); 
             after(grammarAccess.getRouteAccess().getRouteKeyword_0()); 

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
    // $ANTLR end "rule__Route__Group__0__Impl"


    // $ANTLR start "rule__Route__Group__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1796:1: rule__Route__Group__1 : rule__Route__Group__1__Impl ;
    public final void rule__Route__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1800:1: ( rule__Route__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1801:2: rule__Route__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Route__Group__1__Impl_in_rule__Route__Group__13587);
            rule__Route__Group__1__Impl();

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
    // $ANTLR end "rule__Route__Group__1"


    // $ANTLR start "rule__Route__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1807:1: rule__Route__Group__1__Impl : ( ( rule__Route__NameAssignment_1 ) ) ;
    public final void rule__Route__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1811:1: ( ( ( rule__Route__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1812:1: ( ( rule__Route__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1812:1: ( ( rule__Route__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1813:1: ( rule__Route__NameAssignment_1 )
            {
             before(grammarAccess.getRouteAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1814:1: ( rule__Route__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1814:2: rule__Route__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Route__NameAssignment_1_in_rule__Route__Group__1__Impl3614);
            rule__Route__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRouteAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Route__Group__1__Impl"


    // $ANTLR start "rule__RouteElement__Group__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1828:1: rule__RouteElement__Group__0 : rule__RouteElement__Group__0__Impl rule__RouteElement__Group__1 ;
    public final void rule__RouteElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1832:1: ( rule__RouteElement__Group__0__Impl rule__RouteElement__Group__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1833:2: rule__RouteElement__Group__0__Impl rule__RouteElement__Group__1
            {
            pushFollow(FOLLOW_rule__RouteElement__Group__0__Impl_in_rule__RouteElement__Group__03648);
            rule__RouteElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RouteElement__Group__1_in_rule__RouteElement__Group__03651);
            rule__RouteElement__Group__1();

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
    // $ANTLR end "rule__RouteElement__Group__0"


    // $ANTLR start "rule__RouteElement__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1840:1: rule__RouteElement__Group__0__Impl : ( 'RouteElement' ) ;
    public final void rule__RouteElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1844:1: ( ( 'RouteElement' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1845:1: ( 'RouteElement' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1845:1: ( 'RouteElement' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1846:1: 'RouteElement'
            {
             before(grammarAccess.getRouteElementAccess().getRouteElementKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__RouteElement__Group__0__Impl3679); 
             after(grammarAccess.getRouteElementAccess().getRouteElementKeyword_0()); 

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
    // $ANTLR end "rule__RouteElement__Group__0__Impl"


    // $ANTLR start "rule__RouteElement__Group__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1859:1: rule__RouteElement__Group__1 : rule__RouteElement__Group__1__Impl ;
    public final void rule__RouteElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1863:1: ( rule__RouteElement__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1864:2: rule__RouteElement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RouteElement__Group__1__Impl_in_rule__RouteElement__Group__13710);
            rule__RouteElement__Group__1__Impl();

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
    // $ANTLR end "rule__RouteElement__Group__1"


    // $ANTLR start "rule__RouteElement__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1870:1: rule__RouteElement__Group__1__Impl : ( ( rule__RouteElement__NameAssignment_1 ) ) ;
    public final void rule__RouteElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1874:1: ( ( ( rule__RouteElement__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1875:1: ( ( rule__RouteElement__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1875:1: ( ( rule__RouteElement__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1876:1: ( rule__RouteElement__NameAssignment_1 )
            {
             before(grammarAccess.getRouteElementAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1877:1: ( rule__RouteElement__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1877:2: rule__RouteElement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__RouteElement__NameAssignment_1_in_rule__RouteElement__Group__1__Impl3737);
            rule__RouteElement__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRouteElementAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RouteElement__Group__1__Impl"


    // $ANTLR start "rule__Station__Group__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1891:1: rule__Station__Group__0 : rule__Station__Group__0__Impl rule__Station__Group__1 ;
    public final void rule__Station__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1895:1: ( rule__Station__Group__0__Impl rule__Station__Group__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1896:2: rule__Station__Group__0__Impl rule__Station__Group__1
            {
            pushFollow(FOLLOW_rule__Station__Group__0__Impl_in_rule__Station__Group__03771);
            rule__Station__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Station__Group__1_in_rule__Station__Group__03774);
            rule__Station__Group__1();

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
    // $ANTLR end "rule__Station__Group__0"


    // $ANTLR start "rule__Station__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1903:1: rule__Station__Group__0__Impl : ( 'Station' ) ;
    public final void rule__Station__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1907:1: ( ( 'Station' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1908:1: ( 'Station' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1908:1: ( 'Station' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1909:1: 'Station'
            {
             before(grammarAccess.getStationAccess().getStationKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__Station__Group__0__Impl3802); 
             after(grammarAccess.getStationAccess().getStationKeyword_0()); 

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
    // $ANTLR end "rule__Station__Group__0__Impl"


    // $ANTLR start "rule__Station__Group__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1922:1: rule__Station__Group__1 : rule__Station__Group__1__Impl ;
    public final void rule__Station__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1926:1: ( rule__Station__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1927:2: rule__Station__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Station__Group__1__Impl_in_rule__Station__Group__13833);
            rule__Station__Group__1__Impl();

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
    // $ANTLR end "rule__Station__Group__1"


    // $ANTLR start "rule__Station__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1933:1: rule__Station__Group__1__Impl : ( ( rule__Station__NameAssignment_1 ) ) ;
    public final void rule__Station__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1937:1: ( ( ( rule__Station__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1938:1: ( ( rule__Station__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1938:1: ( ( rule__Station__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1939:1: ( rule__Station__NameAssignment_1 )
            {
             before(grammarAccess.getStationAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1940:1: ( rule__Station__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1940:2: rule__Station__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Station__NameAssignment_1_in_rule__Station__Group__1__Impl3860);
            rule__Station__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Station__Group__1__Impl"


    // $ANTLR start "rule__TurnoutSignal__Group__0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1954:1: rule__TurnoutSignal__Group__0 : rule__TurnoutSignal__Group__0__Impl rule__TurnoutSignal__Group__1 ;
    public final void rule__TurnoutSignal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1958:1: ( rule__TurnoutSignal__Group__0__Impl rule__TurnoutSignal__Group__1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1959:2: rule__TurnoutSignal__Group__0__Impl rule__TurnoutSignal__Group__1
            {
            pushFollow(FOLLOW_rule__TurnoutSignal__Group__0__Impl_in_rule__TurnoutSignal__Group__03894);
            rule__TurnoutSignal__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TurnoutSignal__Group__1_in_rule__TurnoutSignal__Group__03897);
            rule__TurnoutSignal__Group__1();

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
    // $ANTLR end "rule__TurnoutSignal__Group__0"


    // $ANTLR start "rule__TurnoutSignal__Group__0__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1966:1: rule__TurnoutSignal__Group__0__Impl : ( 'TurnoutSignal' ) ;
    public final void rule__TurnoutSignal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1970:1: ( ( 'TurnoutSignal' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1971:1: ( 'TurnoutSignal' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1971:1: ( 'TurnoutSignal' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1972:1: 'TurnoutSignal'
            {
             before(grammarAccess.getTurnoutSignalAccess().getTurnoutSignalKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__TurnoutSignal__Group__0__Impl3925); 
             after(grammarAccess.getTurnoutSignalAccess().getTurnoutSignalKeyword_0()); 

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
    // $ANTLR end "rule__TurnoutSignal__Group__0__Impl"


    // $ANTLR start "rule__TurnoutSignal__Group__1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1985:1: rule__TurnoutSignal__Group__1 : rule__TurnoutSignal__Group__1__Impl ;
    public final void rule__TurnoutSignal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1989:1: ( rule__TurnoutSignal__Group__1__Impl )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1990:2: rule__TurnoutSignal__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TurnoutSignal__Group__1__Impl_in_rule__TurnoutSignal__Group__13956);
            rule__TurnoutSignal__Group__1__Impl();

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
    // $ANTLR end "rule__TurnoutSignal__Group__1"


    // $ANTLR start "rule__TurnoutSignal__Group__1__Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:1996:1: rule__TurnoutSignal__Group__1__Impl : ( ( rule__TurnoutSignal__NameAssignment_1 ) ) ;
    public final void rule__TurnoutSignal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2000:1: ( ( ( rule__TurnoutSignal__NameAssignment_1 ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2001:1: ( ( rule__TurnoutSignal__NameAssignment_1 ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2001:1: ( ( rule__TurnoutSignal__NameAssignment_1 ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2002:1: ( rule__TurnoutSignal__NameAssignment_1 )
            {
             before(grammarAccess.getTurnoutSignalAccess().getNameAssignment_1()); 
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2003:1: ( rule__TurnoutSignal__NameAssignment_1 )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2003:2: rule__TurnoutSignal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TurnoutSignal__NameAssignment_1_in_rule__TurnoutSignal__Group__1__Impl3983);
            rule__TurnoutSignal__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTurnoutSignalAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TurnoutSignal__Group__1__Impl"


    // $ANTLR start "rule__RailwayDomainModel__TrainsAssignment_3_0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2018:1: rule__RailwayDomainModel__TrainsAssignment_3_0 : ( ruleTrain ) ;
    public final void rule__RailwayDomainModel__TrainsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2022:1: ( ( ruleTrain ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2023:1: ( ruleTrain )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2023:1: ( ruleTrain )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2024:1: ruleTrain
            {
             before(grammarAccess.getRailwayDomainModelAccess().getTrainsTrainParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleTrain_in_rule__RailwayDomainModel__TrainsAssignment_3_04022);
            ruleTrain();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getTrainsTrainParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__TrainsAssignment_3_0"


    // $ANTLR start "rule__RailwayDomainModel__TrainsAssignment_3_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2033:1: rule__RailwayDomainModel__TrainsAssignment_3_1 : ( ruleTrain ) ;
    public final void rule__RailwayDomainModel__TrainsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2037:1: ( ( ruleTrain ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2038:1: ( ruleTrain )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2038:1: ( ruleTrain )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2039:1: ruleTrain
            {
             before(grammarAccess.getRailwayDomainModelAccess().getTrainsTrainParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleTrain_in_rule__RailwayDomainModel__TrainsAssignment_3_14053);
            ruleTrain();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getTrainsTrainParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__TrainsAssignment_3_1"


    // $ANTLR start "rule__RailwayDomainModel__SectionsAssignment_4_0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2048:1: rule__RailwayDomainModel__SectionsAssignment_4_0 : ( ruleSection ) ;
    public final void rule__RailwayDomainModel__SectionsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2052:1: ( ( ruleSection ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2053:1: ( ruleSection )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2053:1: ( ruleSection )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2054:1: ruleSection
            {
             before(grammarAccess.getRailwayDomainModelAccess().getSectionsSectionParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__RailwayDomainModel__SectionsAssignment_4_04084);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getSectionsSectionParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__SectionsAssignment_4_0"


    // $ANTLR start "rule__RailwayDomainModel__SectionsAssignment_4_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2063:1: rule__RailwayDomainModel__SectionsAssignment_4_1 : ( ruleSection ) ;
    public final void rule__RailwayDomainModel__SectionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2067:1: ( ( ruleSection ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2068:1: ( ruleSection )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2068:1: ( ruleSection )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2069:1: ruleSection
            {
             before(grammarAccess.getRailwayDomainModelAccess().getSectionsSectionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_ruleSection_in_rule__RailwayDomainModel__SectionsAssignment_4_14115);
            ruleSection();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getSectionsSectionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__SectionsAssignment_4_1"


    // $ANTLR start "rule__RailwayDomainModel__TurnoutsAssignment_5_0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2078:1: rule__RailwayDomainModel__TurnoutsAssignment_5_0 : ( ruleTurnout ) ;
    public final void rule__RailwayDomainModel__TurnoutsAssignment_5_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2082:1: ( ( ruleTurnout ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2083:1: ( ruleTurnout )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2083:1: ( ruleTurnout )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2084:1: ruleTurnout
            {
             before(grammarAccess.getRailwayDomainModelAccess().getTurnoutsTurnoutParserRuleCall_5_0_0()); 
            pushFollow(FOLLOW_ruleTurnout_in_rule__RailwayDomainModel__TurnoutsAssignment_5_04146);
            ruleTurnout();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getTurnoutsTurnoutParserRuleCall_5_0_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__TurnoutsAssignment_5_0"


    // $ANTLR start "rule__RailwayDomainModel__TurnoutsAssignment_5_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2093:1: rule__RailwayDomainModel__TurnoutsAssignment_5_1 : ( ruleTurnout ) ;
    public final void rule__RailwayDomainModel__TurnoutsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2097:1: ( ( ruleTurnout ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2098:1: ( ruleTurnout )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2098:1: ( ruleTurnout )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2099:1: ruleTurnout
            {
             before(grammarAccess.getRailwayDomainModelAccess().getTurnoutsTurnoutParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_ruleTurnout_in_rule__RailwayDomainModel__TurnoutsAssignment_5_14177);
            ruleTurnout();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getTurnoutsTurnoutParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__TurnoutsAssignment_5_1"


    // $ANTLR start "rule__RailwayDomainModel__EditorCPAssignment_6_0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2108:1: rule__RailwayDomainModel__EditorCPAssignment_6_0 : ( ruleConnectionPoint ) ;
    public final void rule__RailwayDomainModel__EditorCPAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2112:1: ( ( ruleConnectionPoint ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2113:1: ( ruleConnectionPoint )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2113:1: ( ruleConnectionPoint )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2114:1: ruleConnectionPoint
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorCPConnectionPointParserRuleCall_6_0_0()); 
            pushFollow(FOLLOW_ruleConnectionPoint_in_rule__RailwayDomainModel__EditorCPAssignment_6_04208);
            ruleConnectionPoint();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getEditorCPConnectionPointParserRuleCall_6_0_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__EditorCPAssignment_6_0"


    // $ANTLR start "rule__RailwayDomainModel__EditorCPAssignment_6_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2123:1: rule__RailwayDomainModel__EditorCPAssignment_6_1 : ( ruleConnectionPoint ) ;
    public final void rule__RailwayDomainModel__EditorCPAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2127:1: ( ( ruleConnectionPoint ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2128:1: ( ruleConnectionPoint )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2128:1: ( ruleConnectionPoint )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2129:1: ruleConnectionPoint
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorCPConnectionPointParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleConnectionPoint_in_rule__RailwayDomainModel__EditorCPAssignment_6_14239);
            ruleConnectionPoint();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getEditorCPConnectionPointParserRuleCall_6_1_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__EditorCPAssignment_6_1"


    // $ANTLR start "rule__RailwayDomainModel__EditorSignalAssignment_7_0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2138:1: rule__RailwayDomainModel__EditorSignalAssignment_7_0 : ( ruleSignal ) ;
    public final void rule__RailwayDomainModel__EditorSignalAssignment_7_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2142:1: ( ( ruleSignal ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2143:1: ( ruleSignal )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2143:1: ( ruleSignal )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2144:1: ruleSignal
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorSignalSignalParserRuleCall_7_0_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__RailwayDomainModel__EditorSignalAssignment_7_04270);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getEditorSignalSignalParserRuleCall_7_0_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__EditorSignalAssignment_7_0"


    // $ANTLR start "rule__RailwayDomainModel__EditorSignalAssignment_7_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2153:1: rule__RailwayDomainModel__EditorSignalAssignment_7_1 : ( ruleSignal ) ;
    public final void rule__RailwayDomainModel__EditorSignalAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2157:1: ( ( ruleSignal ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2158:1: ( ruleSignal )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2158:1: ( ruleSignal )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2159:1: ruleSignal
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorSignalSignalParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleSignal_in_rule__RailwayDomainModel__EditorSignalAssignment_7_14301);
            ruleSignal();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getEditorSignalSignalParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__EditorSignalAssignment_7_1"


    // $ANTLR start "rule__RailwayDomainModel__EditorTDDAssignment_8_0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2168:1: rule__RailwayDomainModel__EditorTDDAssignment_8_0 : ( ruleTurnoutDesiredDirection ) ;
    public final void rule__RailwayDomainModel__EditorTDDAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2172:1: ( ( ruleTurnoutDesiredDirection ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2173:1: ( ruleTurnoutDesiredDirection )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2173:1: ( ruleTurnoutDesiredDirection )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2174:1: ruleTurnoutDesiredDirection
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorTDDTurnoutDesiredDirectionParserRuleCall_8_0_0()); 
            pushFollow(FOLLOW_ruleTurnoutDesiredDirection_in_rule__RailwayDomainModel__EditorTDDAssignment_8_04332);
            ruleTurnoutDesiredDirection();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getEditorTDDTurnoutDesiredDirectionParserRuleCall_8_0_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__EditorTDDAssignment_8_0"


    // $ANTLR start "rule__RailwayDomainModel__EditorTDDAssignment_8_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2183:1: rule__RailwayDomainModel__EditorTDDAssignment_8_1 : ( ruleTurnoutDesiredDirection ) ;
    public final void rule__RailwayDomainModel__EditorTDDAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2187:1: ( ( ruleTurnoutDesiredDirection ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2188:1: ( ruleTurnoutDesiredDirection )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2188:1: ( ruleTurnoutDesiredDirection )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2189:1: ruleTurnoutDesiredDirection
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorTDDTurnoutDesiredDirectionParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_ruleTurnoutDesiredDirection_in_rule__RailwayDomainModel__EditorTDDAssignment_8_14363);
            ruleTurnoutDesiredDirection();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getEditorTDDTurnoutDesiredDirectionParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__EditorTDDAssignment_8_1"


    // $ANTLR start "rule__RailwayDomainModel__EditorRouteAssignment_9_0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2198:1: rule__RailwayDomainModel__EditorRouteAssignment_9_0 : ( ruleRoute ) ;
    public final void rule__RailwayDomainModel__EditorRouteAssignment_9_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2202:1: ( ( ruleRoute ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2203:1: ( ruleRoute )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2203:1: ( ruleRoute )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2204:1: ruleRoute
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorRouteRouteParserRuleCall_9_0_0()); 
            pushFollow(FOLLOW_ruleRoute_in_rule__RailwayDomainModel__EditorRouteAssignment_9_04394);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getEditorRouteRouteParserRuleCall_9_0_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__EditorRouteAssignment_9_0"


    // $ANTLR start "rule__RailwayDomainModel__EditorRouteAssignment_9_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2213:1: rule__RailwayDomainModel__EditorRouteAssignment_9_1 : ( ruleRoute ) ;
    public final void rule__RailwayDomainModel__EditorRouteAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2217:1: ( ( ruleRoute ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2218:1: ( ruleRoute )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2218:1: ( ruleRoute )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2219:1: ruleRoute
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorRouteRouteParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_ruleRoute_in_rule__RailwayDomainModel__EditorRouteAssignment_9_14425);
            ruleRoute();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getEditorRouteRouteParserRuleCall_9_1_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__EditorRouteAssignment_9_1"


    // $ANTLR start "rule__RailwayDomainModel__EditorRouteElementAssignment_10_0"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2228:1: rule__RailwayDomainModel__EditorRouteElementAssignment_10_0 : ( ruleRouteElement ) ;
    public final void rule__RailwayDomainModel__EditorRouteElementAssignment_10_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2232:1: ( ( ruleRouteElement ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2233:1: ( ruleRouteElement )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2233:1: ( ruleRouteElement )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2234:1: ruleRouteElement
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementRouteElementParserRuleCall_10_0_0()); 
            pushFollow(FOLLOW_ruleRouteElement_in_rule__RailwayDomainModel__EditorRouteElementAssignment_10_04456);
            ruleRouteElement();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementRouteElementParserRuleCall_10_0_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__EditorRouteElementAssignment_10_0"


    // $ANTLR start "rule__RailwayDomainModel__EditorRouteElementAssignment_10_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2243:1: rule__RailwayDomainModel__EditorRouteElementAssignment_10_1 : ( ruleRouteElement ) ;
    public final void rule__RailwayDomainModel__EditorRouteElementAssignment_10_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2247:1: ( ( ruleRouteElement ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2248:1: ( ruleRouteElement )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2248:1: ( ruleRouteElement )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2249:1: ruleRouteElement
            {
             before(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementRouteElementParserRuleCall_10_1_0()); 
            pushFollow(FOLLOW_ruleRouteElement_in_rule__RailwayDomainModel__EditorRouteElementAssignment_10_14487);
            ruleRouteElement();

            state._fsp--;

             after(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementRouteElementParserRuleCall_10_1_0()); 

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
    // $ANTLR end "rule__RailwayDomainModel__EditorRouteElementAssignment_10_1"


    // $ANTLR start "rule__Train__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2258:1: rule__Train__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Train__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2262:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2263:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2263:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2264:1: RULE_ID
            {
             before(grammarAccess.getTrainAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Train__NameAssignment_14518); 
             after(grammarAccess.getTrainAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Train__NameAssignment_1"


    // $ANTLR start "rule__Section_Impl__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2273:1: rule__Section_Impl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Section_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2277:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2278:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2278:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2279:1: RULE_ID
            {
             before(grammarAccess.getSection_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Section_Impl__NameAssignment_14549); 
             after(grammarAccess.getSection_ImplAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Section_Impl__NameAssignment_1"


    // $ANTLR start "rule__Turnout__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2288:1: rule__Turnout__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Turnout__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2292:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2293:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2293:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2294:1: RULE_ID
            {
             before(grammarAccess.getTurnoutAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Turnout__NameAssignment_14580); 
             after(grammarAccess.getTurnoutAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Turnout__NameAssignment_1"


    // $ANTLR start "rule__ConnectionPoint__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2303:1: rule__ConnectionPoint__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ConnectionPoint__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2307:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2308:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2308:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2309:1: RULE_ID
            {
             before(grammarAccess.getConnectionPointAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ConnectionPoint__NameAssignment_14611); 
             after(grammarAccess.getConnectionPointAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__ConnectionPoint__NameAssignment_1"


    // $ANTLR start "rule__Signal_Impl__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2318:1: rule__Signal_Impl__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Signal_Impl__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2322:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2323:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2323:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2324:1: RULE_ID
            {
             before(grammarAccess.getSignal_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Signal_Impl__NameAssignment_14642); 
             after(grammarAccess.getSignal_ImplAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Signal_Impl__NameAssignment_1"


    // $ANTLR start "rule__TurnoutDesiredDirection__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2333:1: rule__TurnoutDesiredDirection__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TurnoutDesiredDirection__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2337:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2338:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2338:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2339:1: RULE_ID
            {
             before(grammarAccess.getTurnoutDesiredDirectionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TurnoutDesiredDirection__NameAssignment_14673); 
             after(grammarAccess.getTurnoutDesiredDirectionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TurnoutDesiredDirection__NameAssignment_1"


    // $ANTLR start "rule__Route__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2348:1: rule__Route__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Route__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2352:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2353:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2353:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2354:1: RULE_ID
            {
             before(grammarAccess.getRouteAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Route__NameAssignment_14704); 
             after(grammarAccess.getRouteAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Route__NameAssignment_1"


    // $ANTLR start "rule__RouteElement__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2363:1: rule__RouteElement__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RouteElement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2367:1: ( ( ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2368:1: ( ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2368:1: ( ruleEString )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2369:1: ruleEString
            {
             before(grammarAccess.getRouteElementAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEString_in_rule__RouteElement__NameAssignment_14735);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRouteElementAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RouteElement__NameAssignment_1"


    // $ANTLR start "rule__Station__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2378:1: rule__Station__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Station__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2382:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2383:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2383:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2384:1: RULE_ID
            {
             before(grammarAccess.getStationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Station__NameAssignment_14766); 
             after(grammarAccess.getStationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Station__NameAssignment_1"


    // $ANTLR start "rule__TurnoutSignal__NameAssignment_1"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2393:1: rule__TurnoutSignal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TurnoutSignal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2397:1: ( ( RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2398:1: ( RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2398:1: ( RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text.ui/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/ui/contentassist/antlr/internal/InternalRDMTextDSL.g:2399:1: RULE_ID
            {
             before(grammarAccess.getTurnoutSignalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__TurnoutSignal__NameAssignment_14797); 
             after(grammarAccess.getTurnoutSignalAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TurnoutSignal__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRailwayDomainModel_in_entryRuleRailwayDomainModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRailwayDomainModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__0_in_ruleRailwayDomainModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section__Alternatives_in_ruleSection154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal__Alternatives_in_ruleSignal214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrain_in_entryRuleTrain241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrain248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Train__Group__0_in_ruleTrain274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_Impl_in_entryRuleSection_Impl301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection_Impl308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section_Impl__Group__0_in_ruleSection_Impl334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnout_in_entryRuleTurnout361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnout368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Turnout__Group__0_in_ruleTurnout394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionPoint_in_entryRuleConnectionPoint421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectionPoint428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionPoint__Group__0_in_ruleConnectionPoint454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_Impl_in_entryRuleSignal_Impl481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal_Impl488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal_Impl__Group__0_in_ruleSignal_Impl514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutDesiredDirection_in_entryRuleTurnoutDesiredDirection541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnoutDesiredDirection548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutDesiredDirection__Group__0_in_ruleTurnoutDesiredDirection574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoute_in_entryRuleRoute601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoute608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Route__Group__0_in_ruleRoute634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRouteElement_in_entryRuleRouteElement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRouteElement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RouteElement__Group__0_in_ruleRouteElement694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStation_in_entryRuleStation781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStation788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Station__Group__0_in_ruleStation814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutSignal_in_entryRuleTurnoutSignal841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnoutSignal848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutSignal__Group__0_in_ruleTurnoutSignal874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_Impl_in_rule__Section__Alternatives910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStation_in_rule__Section__Alternatives927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_Impl_in_rule__Signal__Alternatives959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutSignal_in_rule__Signal__Alternatives976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__0__Impl_in_rule__RailwayDomainModel__Group__01055 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__1_in_rule__RailwayDomainModel__Group__01058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__1__Impl_in_rule__RailwayDomainModel__Group__11116 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__2_in_rule__RailwayDomainModel__Group__11119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RailwayDomainModel__Group__1__Impl1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__2__Impl_in_rule__RailwayDomainModel__Group__21178 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__3_in_rule__RailwayDomainModel__Group__21181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RailwayDomainModel__Group__2__Impl1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__3__Impl_in_rule__RailwayDomainModel__Group__31240 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__4_in_rule__RailwayDomainModel__Group__31243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_3__0_in_rule__RailwayDomainModel__Group__3__Impl1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__4__Impl_in_rule__RailwayDomainModel__Group__41301 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__5_in_rule__RailwayDomainModel__Group__41304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_4__0_in_rule__RailwayDomainModel__Group__4__Impl1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__5__Impl_in_rule__RailwayDomainModel__Group__51362 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__6_in_rule__RailwayDomainModel__Group__51365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_5__0_in_rule__RailwayDomainModel__Group__5__Impl1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__6__Impl_in_rule__RailwayDomainModel__Group__61423 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__7_in_rule__RailwayDomainModel__Group__61426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_6__0_in_rule__RailwayDomainModel__Group__6__Impl1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__7__Impl_in_rule__RailwayDomainModel__Group__71484 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__8_in_rule__RailwayDomainModel__Group__71487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_7__0_in_rule__RailwayDomainModel__Group__7__Impl1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__8__Impl_in_rule__RailwayDomainModel__Group__81545 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__9_in_rule__RailwayDomainModel__Group__81548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_8__0_in_rule__RailwayDomainModel__Group__8__Impl1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__9__Impl_in_rule__RailwayDomainModel__Group__91606 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__10_in_rule__RailwayDomainModel__Group__91609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_9__0_in_rule__RailwayDomainModel__Group__9__Impl1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__10__Impl_in_rule__RailwayDomainModel__Group__101667 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__11_in_rule__RailwayDomainModel__Group__101670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_10__0_in_rule__RailwayDomainModel__Group__10__Impl1697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group__11__Impl_in_rule__RailwayDomainModel__Group__111728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RailwayDomainModel__Group__11__Impl1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_3__0__Impl_in_rule__RailwayDomainModel__Group_3__01811 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_3__1_in_rule__RailwayDomainModel__Group_3__01814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__TrainsAssignment_3_0_in_rule__RailwayDomainModel__Group_3__0__Impl1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_3__1__Impl_in_rule__RailwayDomainModel__Group_3__11871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__TrainsAssignment_3_1_in_rule__RailwayDomainModel__Group_3__1__Impl1898 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_4__0__Impl_in_rule__RailwayDomainModel__Group_4__01933 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_4__1_in_rule__RailwayDomainModel__Group_4__01936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__SectionsAssignment_4_0_in_rule__RailwayDomainModel__Group_4__0__Impl1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_4__1__Impl_in_rule__RailwayDomainModel__Group_4__11993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__SectionsAssignment_4_1_in_rule__RailwayDomainModel__Group_4__1__Impl2020 = new BitSet(new long[]{0x0000000000408002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_5__0__Impl_in_rule__RailwayDomainModel__Group_5__02055 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_5__1_in_rule__RailwayDomainModel__Group_5__02058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__TurnoutsAssignment_5_0_in_rule__RailwayDomainModel__Group_5__0__Impl2085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_5__1__Impl_in_rule__RailwayDomainModel__Group_5__12115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__TurnoutsAssignment_5_1_in_rule__RailwayDomainModel__Group_5__1__Impl2142 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_6__0__Impl_in_rule__RailwayDomainModel__Group_6__02177 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_6__1_in_rule__RailwayDomainModel__Group_6__02180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__EditorCPAssignment_6_0_in_rule__RailwayDomainModel__Group_6__0__Impl2207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_6__1__Impl_in_rule__RailwayDomainModel__Group_6__12237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__EditorCPAssignment_6_1_in_rule__RailwayDomainModel__Group_6__1__Impl2264 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_7__0__Impl_in_rule__RailwayDomainModel__Group_7__02299 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_7__1_in_rule__RailwayDomainModel__Group_7__02302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__EditorSignalAssignment_7_0_in_rule__RailwayDomainModel__Group_7__0__Impl2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_7__1__Impl_in_rule__RailwayDomainModel__Group_7__12359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__EditorSignalAssignment_7_1_in_rule__RailwayDomainModel__Group_7__1__Impl2386 = new BitSet(new long[]{0x0000000000840002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_8__0__Impl_in_rule__RailwayDomainModel__Group_8__02421 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_8__1_in_rule__RailwayDomainModel__Group_8__02424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__EditorTDDAssignment_8_0_in_rule__RailwayDomainModel__Group_8__0__Impl2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_8__1__Impl_in_rule__RailwayDomainModel__Group_8__12481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__EditorTDDAssignment_8_1_in_rule__RailwayDomainModel__Group_8__1__Impl2508 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_9__0__Impl_in_rule__RailwayDomainModel__Group_9__02543 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_9__1_in_rule__RailwayDomainModel__Group_9__02546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__EditorRouteAssignment_9_0_in_rule__RailwayDomainModel__Group_9__0__Impl2573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_9__1__Impl_in_rule__RailwayDomainModel__Group_9__12603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__EditorRouteAssignment_9_1_in_rule__RailwayDomainModel__Group_9__1__Impl2630 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_10__0__Impl_in_rule__RailwayDomainModel__Group_10__02665 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_10__1_in_rule__RailwayDomainModel__Group_10__02668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__EditorRouteElementAssignment_10_0_in_rule__RailwayDomainModel__Group_10__0__Impl2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__Group_10__1__Impl_in_rule__RailwayDomainModel__Group_10__12725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RailwayDomainModel__EditorRouteElementAssignment_10_1_in_rule__RailwayDomainModel__Group_10__1__Impl2752 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Train__Group__0__Impl_in_rule__Train__Group__02787 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Train__Group__1_in_rule__Train__Group__02790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Train__Group__0__Impl2818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Train__Group__1__Impl_in_rule__Train__Group__12849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Train__NameAssignment_1_in_rule__Train__Group__1__Impl2876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section_Impl__Group__0__Impl_in_rule__Section_Impl__Group__02910 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Section_Impl__Group__1_in_rule__Section_Impl__Group__02913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Section_Impl__Group__0__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section_Impl__Group__1__Impl_in_rule__Section_Impl__Group__12972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Section_Impl__NameAssignment_1_in_rule__Section_Impl__Group__1__Impl2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Turnout__Group__0__Impl_in_rule__Turnout__Group__03033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Turnout__Group__1_in_rule__Turnout__Group__03036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Turnout__Group__0__Impl3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Turnout__Group__1__Impl_in_rule__Turnout__Group__13095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Turnout__NameAssignment_1_in_rule__Turnout__Group__1__Impl3122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionPoint__Group__0__Impl_in_rule__ConnectionPoint__Group__03156 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ConnectionPoint__Group__1_in_rule__ConnectionPoint__Group__03159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ConnectionPoint__Group__0__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionPoint__Group__1__Impl_in_rule__ConnectionPoint__Group__13218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectionPoint__NameAssignment_1_in_rule__ConnectionPoint__Group__1__Impl3245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal_Impl__Group__0__Impl_in_rule__Signal_Impl__Group__03279 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Signal_Impl__Group__1_in_rule__Signal_Impl__Group__03282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Signal_Impl__Group__0__Impl3310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal_Impl__Group__1__Impl_in_rule__Signal_Impl__Group__13341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Signal_Impl__NameAssignment_1_in_rule__Signal_Impl__Group__1__Impl3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutDesiredDirection__Group__0__Impl_in_rule__TurnoutDesiredDirection__Group__03402 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TurnoutDesiredDirection__Group__1_in_rule__TurnoutDesiredDirection__Group__03405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__TurnoutDesiredDirection__Group__0__Impl3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutDesiredDirection__Group__1__Impl_in_rule__TurnoutDesiredDirection__Group__13464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutDesiredDirection__NameAssignment_1_in_rule__TurnoutDesiredDirection__Group__1__Impl3491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Route__Group__0__Impl_in_rule__Route__Group__03525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Route__Group__1_in_rule__Route__Group__03528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Route__Group__0__Impl3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Route__Group__1__Impl_in_rule__Route__Group__13587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Route__NameAssignment_1_in_rule__Route__Group__1__Impl3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RouteElement__Group__0__Impl_in_rule__RouteElement__Group__03648 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__RouteElement__Group__1_in_rule__RouteElement__Group__03651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RouteElement__Group__0__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RouteElement__Group__1__Impl_in_rule__RouteElement__Group__13710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RouteElement__NameAssignment_1_in_rule__RouteElement__Group__1__Impl3737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Station__Group__0__Impl_in_rule__Station__Group__03771 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Station__Group__1_in_rule__Station__Group__03774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Station__Group__0__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Station__Group__1__Impl_in_rule__Station__Group__13833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Station__NameAssignment_1_in_rule__Station__Group__1__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutSignal__Group__0__Impl_in_rule__TurnoutSignal__Group__03894 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TurnoutSignal__Group__1_in_rule__TurnoutSignal__Group__03897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__TurnoutSignal__Group__0__Impl3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutSignal__Group__1__Impl_in_rule__TurnoutSignal__Group__13956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TurnoutSignal__NameAssignment_1_in_rule__TurnoutSignal__Group__1__Impl3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrain_in_rule__RailwayDomainModel__TrainsAssignment_3_04022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrain_in_rule__RailwayDomainModel__TrainsAssignment_3_14053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__RailwayDomainModel__SectionsAssignment_4_04084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_rule__RailwayDomainModel__SectionsAssignment_4_14115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnout_in_rule__RailwayDomainModel__TurnoutsAssignment_5_04146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnout_in_rule__RailwayDomainModel__TurnoutsAssignment_5_14177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionPoint_in_rule__RailwayDomainModel__EditorCPAssignment_6_04208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionPoint_in_rule__RailwayDomainModel__EditorCPAssignment_6_14239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__RailwayDomainModel__EditorSignalAssignment_7_04270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_rule__RailwayDomainModel__EditorSignalAssignment_7_14301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutDesiredDirection_in_rule__RailwayDomainModel__EditorTDDAssignment_8_04332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutDesiredDirection_in_rule__RailwayDomainModel__EditorTDDAssignment_8_14363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoute_in_rule__RailwayDomainModel__EditorRouteAssignment_9_04394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoute_in_rule__RailwayDomainModel__EditorRouteAssignment_9_14425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRouteElement_in_rule__RailwayDomainModel__EditorRouteElementAssignment_10_04456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRouteElement_in_rule__RailwayDomainModel__EditorRouteElementAssignment_10_14487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Train__NameAssignment_14518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Section_Impl__NameAssignment_14549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Turnout__NameAssignment_14580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ConnectionPoint__NameAssignment_14611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Signal_Impl__NameAssignment_14642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TurnoutDesiredDirection__NameAssignment_14673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Route__NameAssignment_14704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__RouteElement__NameAssignment_14735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Station__NameAssignment_14766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__TurnoutSignal__NameAssignment_14797 = new BitSet(new long[]{0x0000000000000002L});

}