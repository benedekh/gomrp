package hu.bme.mit.inf.gomrp.railway.dsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import hu.bme.mit.inf.gomrp.railway.dsl.services.RDMTextDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRDMTextDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RailwayDomainModel'", "'{'", "'}'", "'Train'", "'Section'", "'Turnout'", "'ConnectionPoint'", "'Signal'", "'TurnoutDesiredDirection'", "'Route'", "'RouteElement'", "'Station'", "'TurnoutSignal'"
    };
    public static final int RULE_STRING=5;
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
    public static final int RULE_ID=4;
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
    public String getGrammarFileName() { return "../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g"; }



     	private RDMTextDSLGrammarAccess grammarAccess;
     	
        public InternalRDMTextDSLParser(TokenStream input, RDMTextDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RailwayDomainModel";	
       	}
       	
       	@Override
       	protected RDMTextDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRailwayDomainModel"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:67:1: entryRuleRailwayDomainModel returns [EObject current=null] : iv_ruleRailwayDomainModel= ruleRailwayDomainModel EOF ;
    public final EObject entryRuleRailwayDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRailwayDomainModel = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:68:2: (iv_ruleRailwayDomainModel= ruleRailwayDomainModel EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:69:2: iv_ruleRailwayDomainModel= ruleRailwayDomainModel EOF
            {
             newCompositeNode(grammarAccess.getRailwayDomainModelRule()); 
            pushFollow(FOLLOW_ruleRailwayDomainModel_in_entryRuleRailwayDomainModel75);
            iv_ruleRailwayDomainModel=ruleRailwayDomainModel();

            state._fsp--;

             current =iv_ruleRailwayDomainModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRailwayDomainModel85); 

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
    // $ANTLR end "entryRuleRailwayDomainModel"


    // $ANTLR start "ruleRailwayDomainModel"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:76:1: ruleRailwayDomainModel returns [EObject current=null] : ( () otherlv_1= 'RailwayDomainModel' otherlv_2= '{' ( ( (lv_trains_3_0= ruleTrain ) ) ( (lv_trains_4_0= ruleTrain ) )* )? ( ( (lv_sections_5_0= ruleSection ) ) ( (lv_sections_6_0= ruleSection ) )* )? ( ( (lv_turnouts_7_0= ruleTurnout ) ) ( (lv_turnouts_8_0= ruleTurnout ) )* )? ( ( (lv_editorCP_9_0= ruleConnectionPoint ) ) ( (lv_editorCP_10_0= ruleConnectionPoint ) )* )? ( ( (lv_editorSignal_11_0= ruleSignal ) ) ( (lv_editorSignal_12_0= ruleSignal ) )* )? ( ( (lv_editorTDD_13_0= ruleTurnoutDesiredDirection ) ) ( (lv_editorTDD_14_0= ruleTurnoutDesiredDirection ) )* )? ( ( (lv_editorRoute_15_0= ruleRoute ) ) ( (lv_editorRoute_16_0= ruleRoute ) )* )? ( ( (lv_editorRouteElement_17_0= ruleRouteElement ) ) ( (lv_editorRouteElement_18_0= ruleRouteElement ) )* )? otherlv_19= '}' ) ;
    public final EObject ruleRailwayDomainModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_19=null;
        EObject lv_trains_3_0 = null;

        EObject lv_trains_4_0 = null;

        EObject lv_sections_5_0 = null;

        EObject lv_sections_6_0 = null;

        EObject lv_turnouts_7_0 = null;

        EObject lv_turnouts_8_0 = null;

        EObject lv_editorCP_9_0 = null;

        EObject lv_editorCP_10_0 = null;

        EObject lv_editorSignal_11_0 = null;

        EObject lv_editorSignal_12_0 = null;

        EObject lv_editorTDD_13_0 = null;

        EObject lv_editorTDD_14_0 = null;

        EObject lv_editorRoute_15_0 = null;

        EObject lv_editorRoute_16_0 = null;

        EObject lv_editorRouteElement_17_0 = null;

        EObject lv_editorRouteElement_18_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:79:28: ( ( () otherlv_1= 'RailwayDomainModel' otherlv_2= '{' ( ( (lv_trains_3_0= ruleTrain ) ) ( (lv_trains_4_0= ruleTrain ) )* )? ( ( (lv_sections_5_0= ruleSection ) ) ( (lv_sections_6_0= ruleSection ) )* )? ( ( (lv_turnouts_7_0= ruleTurnout ) ) ( (lv_turnouts_8_0= ruleTurnout ) )* )? ( ( (lv_editorCP_9_0= ruleConnectionPoint ) ) ( (lv_editorCP_10_0= ruleConnectionPoint ) )* )? ( ( (lv_editorSignal_11_0= ruleSignal ) ) ( (lv_editorSignal_12_0= ruleSignal ) )* )? ( ( (lv_editorTDD_13_0= ruleTurnoutDesiredDirection ) ) ( (lv_editorTDD_14_0= ruleTurnoutDesiredDirection ) )* )? ( ( (lv_editorRoute_15_0= ruleRoute ) ) ( (lv_editorRoute_16_0= ruleRoute ) )* )? ( ( (lv_editorRouteElement_17_0= ruleRouteElement ) ) ( (lv_editorRouteElement_18_0= ruleRouteElement ) )* )? otherlv_19= '}' ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:80:1: ( () otherlv_1= 'RailwayDomainModel' otherlv_2= '{' ( ( (lv_trains_3_0= ruleTrain ) ) ( (lv_trains_4_0= ruleTrain ) )* )? ( ( (lv_sections_5_0= ruleSection ) ) ( (lv_sections_6_0= ruleSection ) )* )? ( ( (lv_turnouts_7_0= ruleTurnout ) ) ( (lv_turnouts_8_0= ruleTurnout ) )* )? ( ( (lv_editorCP_9_0= ruleConnectionPoint ) ) ( (lv_editorCP_10_0= ruleConnectionPoint ) )* )? ( ( (lv_editorSignal_11_0= ruleSignal ) ) ( (lv_editorSignal_12_0= ruleSignal ) )* )? ( ( (lv_editorTDD_13_0= ruleTurnoutDesiredDirection ) ) ( (lv_editorTDD_14_0= ruleTurnoutDesiredDirection ) )* )? ( ( (lv_editorRoute_15_0= ruleRoute ) ) ( (lv_editorRoute_16_0= ruleRoute ) )* )? ( ( (lv_editorRouteElement_17_0= ruleRouteElement ) ) ( (lv_editorRouteElement_18_0= ruleRouteElement ) )* )? otherlv_19= '}' )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:80:1: ( () otherlv_1= 'RailwayDomainModel' otherlv_2= '{' ( ( (lv_trains_3_0= ruleTrain ) ) ( (lv_trains_4_0= ruleTrain ) )* )? ( ( (lv_sections_5_0= ruleSection ) ) ( (lv_sections_6_0= ruleSection ) )* )? ( ( (lv_turnouts_7_0= ruleTurnout ) ) ( (lv_turnouts_8_0= ruleTurnout ) )* )? ( ( (lv_editorCP_9_0= ruleConnectionPoint ) ) ( (lv_editorCP_10_0= ruleConnectionPoint ) )* )? ( ( (lv_editorSignal_11_0= ruleSignal ) ) ( (lv_editorSignal_12_0= ruleSignal ) )* )? ( ( (lv_editorTDD_13_0= ruleTurnoutDesiredDirection ) ) ( (lv_editorTDD_14_0= ruleTurnoutDesiredDirection ) )* )? ( ( (lv_editorRoute_15_0= ruleRoute ) ) ( (lv_editorRoute_16_0= ruleRoute ) )* )? ( ( (lv_editorRouteElement_17_0= ruleRouteElement ) ) ( (lv_editorRouteElement_18_0= ruleRouteElement ) )* )? otherlv_19= '}' )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:80:2: () otherlv_1= 'RailwayDomainModel' otherlv_2= '{' ( ( (lv_trains_3_0= ruleTrain ) ) ( (lv_trains_4_0= ruleTrain ) )* )? ( ( (lv_sections_5_0= ruleSection ) ) ( (lv_sections_6_0= ruleSection ) )* )? ( ( (lv_turnouts_7_0= ruleTurnout ) ) ( (lv_turnouts_8_0= ruleTurnout ) )* )? ( ( (lv_editorCP_9_0= ruleConnectionPoint ) ) ( (lv_editorCP_10_0= ruleConnectionPoint ) )* )? ( ( (lv_editorSignal_11_0= ruleSignal ) ) ( (lv_editorSignal_12_0= ruleSignal ) )* )? ( ( (lv_editorTDD_13_0= ruleTurnoutDesiredDirection ) ) ( (lv_editorTDD_14_0= ruleTurnoutDesiredDirection ) )* )? ( ( (lv_editorRoute_15_0= ruleRoute ) ) ( (lv_editorRoute_16_0= ruleRoute ) )* )? ( ( (lv_editorRouteElement_17_0= ruleRouteElement ) ) ( (lv_editorRouteElement_18_0= ruleRouteElement ) )* )? otherlv_19= '}'
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:80:2: ()
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRailwayDomainModelAccess().getRailwayDomainModelAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FOLLOW_11_in_ruleRailwayDomainModel131); 

                	newLeafNode(otherlv_1, grammarAccess.getRailwayDomainModelAccess().getRailwayDomainModelKeyword_1());
                
            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRailwayDomainModel143); 

                	newLeafNode(otherlv_2, grammarAccess.getRailwayDomainModelAccess().getLeftCurlyBracketKeyword_2());
                
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:94:1: ( ( (lv_trains_3_0= ruleTrain ) ) ( (lv_trains_4_0= ruleTrain ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:94:2: ( (lv_trains_3_0= ruleTrain ) ) ( (lv_trains_4_0= ruleTrain ) )*
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:94:2: ( (lv_trains_3_0= ruleTrain ) )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:95:1: (lv_trains_3_0= ruleTrain )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:95:1: (lv_trains_3_0= ruleTrain )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:96:3: lv_trains_3_0= ruleTrain
                    {
                     
                    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getTrainsTrainParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTrain_in_ruleRailwayDomainModel165);
                    lv_trains_3_0=ruleTrain();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	        }
                           		add(
                           			current, 
                           			"trains",
                            		lv_trains_3_0, 
                            		"Train");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:112:2: ( (lv_trains_4_0= ruleTrain ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:113:1: (lv_trains_4_0= ruleTrain )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:113:1: (lv_trains_4_0= ruleTrain )
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:114:3: lv_trains_4_0= ruleTrain
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getTrainsTrainParserRuleCall_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTrain_in_ruleRailwayDomainModel186);
                    	    lv_trains_4_0=ruleTrain();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"trains",
                    	            		lv_trains_4_0, 
                    	            		"Train");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:130:5: ( ( (lv_sections_5_0= ruleSection ) ) ( (lv_sections_6_0= ruleSection ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15||LA4_0==22) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:130:6: ( (lv_sections_5_0= ruleSection ) ) ( (lv_sections_6_0= ruleSection ) )*
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:130:6: ( (lv_sections_5_0= ruleSection ) )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:131:1: (lv_sections_5_0= ruleSection )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:131:1: (lv_sections_5_0= ruleSection )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:132:3: lv_sections_5_0= ruleSection
                    {
                     
                    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getSectionsSectionParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSection_in_ruleRailwayDomainModel211);
                    lv_sections_5_0=ruleSection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	        }
                           		add(
                           			current, 
                           			"sections",
                            		lv_sections_5_0, 
                            		"Section");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:148:2: ( (lv_sections_6_0= ruleSection ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15||LA3_0==22) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:149:1: (lv_sections_6_0= ruleSection )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:149:1: (lv_sections_6_0= ruleSection )
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:150:3: lv_sections_6_0= ruleSection
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getSectionsSectionParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSection_in_ruleRailwayDomainModel232);
                    	    lv_sections_6_0=ruleSection();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"sections",
                    	            		lv_sections_6_0, 
                    	            		"Section");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:166:5: ( ( (lv_turnouts_7_0= ruleTurnout ) ) ( (lv_turnouts_8_0= ruleTurnout ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:166:6: ( (lv_turnouts_7_0= ruleTurnout ) ) ( (lv_turnouts_8_0= ruleTurnout ) )*
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:166:6: ( (lv_turnouts_7_0= ruleTurnout ) )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:167:1: (lv_turnouts_7_0= ruleTurnout )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:167:1: (lv_turnouts_7_0= ruleTurnout )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:168:3: lv_turnouts_7_0= ruleTurnout
                    {
                     
                    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getTurnoutsTurnoutParserRuleCall_5_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTurnout_in_ruleRailwayDomainModel257);
                    lv_turnouts_7_0=ruleTurnout();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	        }
                           		add(
                           			current, 
                           			"turnouts",
                            		lv_turnouts_7_0, 
                            		"Turnout");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:184:2: ( (lv_turnouts_8_0= ruleTurnout ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:185:1: (lv_turnouts_8_0= ruleTurnout )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:185:1: (lv_turnouts_8_0= ruleTurnout )
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:186:3: lv_turnouts_8_0= ruleTurnout
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getTurnoutsTurnoutParserRuleCall_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTurnout_in_ruleRailwayDomainModel278);
                    	    lv_turnouts_8_0=ruleTurnout();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"turnouts",
                    	            		lv_turnouts_8_0, 
                    	            		"Turnout");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:202:5: ( ( (lv_editorCP_9_0= ruleConnectionPoint ) ) ( (lv_editorCP_10_0= ruleConnectionPoint ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:202:6: ( (lv_editorCP_9_0= ruleConnectionPoint ) ) ( (lv_editorCP_10_0= ruleConnectionPoint ) )*
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:202:6: ( (lv_editorCP_9_0= ruleConnectionPoint ) )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:203:1: (lv_editorCP_9_0= ruleConnectionPoint )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:203:1: (lv_editorCP_9_0= ruleConnectionPoint )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:204:3: lv_editorCP_9_0= ruleConnectionPoint
                    {
                     
                    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorCPConnectionPointParserRuleCall_6_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConnectionPoint_in_ruleRailwayDomainModel303);
                    lv_editorCP_9_0=ruleConnectionPoint();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	        }
                           		add(
                           			current, 
                           			"editorCP",
                            		lv_editorCP_9_0, 
                            		"ConnectionPoint");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:220:2: ( (lv_editorCP_10_0= ruleConnectionPoint ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==17) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:221:1: (lv_editorCP_10_0= ruleConnectionPoint )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:221:1: (lv_editorCP_10_0= ruleConnectionPoint )
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:222:3: lv_editorCP_10_0= ruleConnectionPoint
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorCPConnectionPointParserRuleCall_6_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleConnectionPoint_in_ruleRailwayDomainModel324);
                    	    lv_editorCP_10_0=ruleConnectionPoint();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"editorCP",
                    	            		lv_editorCP_10_0, 
                    	            		"ConnectionPoint");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:238:5: ( ( (lv_editorSignal_11_0= ruleSignal ) ) ( (lv_editorSignal_12_0= ruleSignal ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==18||LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:238:6: ( (lv_editorSignal_11_0= ruleSignal ) ) ( (lv_editorSignal_12_0= ruleSignal ) )*
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:238:6: ( (lv_editorSignal_11_0= ruleSignal ) )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:239:1: (lv_editorSignal_11_0= ruleSignal )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:239:1: (lv_editorSignal_11_0= ruleSignal )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:240:3: lv_editorSignal_11_0= ruleSignal
                    {
                     
                    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorSignalSignalParserRuleCall_7_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSignal_in_ruleRailwayDomainModel349);
                    lv_editorSignal_11_0=ruleSignal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	        }
                           		add(
                           			current, 
                           			"editorSignal",
                            		lv_editorSignal_11_0, 
                            		"Signal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:256:2: ( (lv_editorSignal_12_0= ruleSignal ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==18||LA9_0==23) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:257:1: (lv_editorSignal_12_0= ruleSignal )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:257:1: (lv_editorSignal_12_0= ruleSignal )
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:258:3: lv_editorSignal_12_0= ruleSignal
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorSignalSignalParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSignal_in_ruleRailwayDomainModel370);
                    	    lv_editorSignal_12_0=ruleSignal();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"editorSignal",
                    	            		lv_editorSignal_12_0, 
                    	            		"Signal");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:274:5: ( ( (lv_editorTDD_13_0= ruleTurnoutDesiredDirection ) ) ( (lv_editorTDD_14_0= ruleTurnoutDesiredDirection ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:274:6: ( (lv_editorTDD_13_0= ruleTurnoutDesiredDirection ) ) ( (lv_editorTDD_14_0= ruleTurnoutDesiredDirection ) )*
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:274:6: ( (lv_editorTDD_13_0= ruleTurnoutDesiredDirection ) )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:275:1: (lv_editorTDD_13_0= ruleTurnoutDesiredDirection )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:275:1: (lv_editorTDD_13_0= ruleTurnoutDesiredDirection )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:276:3: lv_editorTDD_13_0= ruleTurnoutDesiredDirection
                    {
                     
                    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorTDDTurnoutDesiredDirectionParserRuleCall_8_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTurnoutDesiredDirection_in_ruleRailwayDomainModel395);
                    lv_editorTDD_13_0=ruleTurnoutDesiredDirection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	        }
                           		add(
                           			current, 
                           			"editorTDD",
                            		lv_editorTDD_13_0, 
                            		"TurnoutDesiredDirection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:292:2: ( (lv_editorTDD_14_0= ruleTurnoutDesiredDirection ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==19) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:293:1: (lv_editorTDD_14_0= ruleTurnoutDesiredDirection )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:293:1: (lv_editorTDD_14_0= ruleTurnoutDesiredDirection )
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:294:3: lv_editorTDD_14_0= ruleTurnoutDesiredDirection
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorTDDTurnoutDesiredDirectionParserRuleCall_8_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTurnoutDesiredDirection_in_ruleRailwayDomainModel416);
                    	    lv_editorTDD_14_0=ruleTurnoutDesiredDirection();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"editorTDD",
                    	            		lv_editorTDD_14_0, 
                    	            		"TurnoutDesiredDirection");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:310:5: ( ( (lv_editorRoute_15_0= ruleRoute ) ) ( (lv_editorRoute_16_0= ruleRoute ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:310:6: ( (lv_editorRoute_15_0= ruleRoute ) ) ( (lv_editorRoute_16_0= ruleRoute ) )*
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:310:6: ( (lv_editorRoute_15_0= ruleRoute ) )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:311:1: (lv_editorRoute_15_0= ruleRoute )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:311:1: (lv_editorRoute_15_0= ruleRoute )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:312:3: lv_editorRoute_15_0= ruleRoute
                    {
                     
                    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorRouteRouteParserRuleCall_9_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRoute_in_ruleRailwayDomainModel441);
                    lv_editorRoute_15_0=ruleRoute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	        }
                           		add(
                           			current, 
                           			"editorRoute",
                            		lv_editorRoute_15_0, 
                            		"Route");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:328:2: ( (lv_editorRoute_16_0= ruleRoute ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==20) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:329:1: (lv_editorRoute_16_0= ruleRoute )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:329:1: (lv_editorRoute_16_0= ruleRoute )
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:330:3: lv_editorRoute_16_0= ruleRoute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorRouteRouteParserRuleCall_9_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRoute_in_ruleRailwayDomainModel462);
                    	    lv_editorRoute_16_0=ruleRoute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"editorRoute",
                    	            		lv_editorRoute_16_0, 
                    	            		"Route");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:346:5: ( ( (lv_editorRouteElement_17_0= ruleRouteElement ) ) ( (lv_editorRouteElement_18_0= ruleRouteElement ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:346:6: ( (lv_editorRouteElement_17_0= ruleRouteElement ) ) ( (lv_editorRouteElement_18_0= ruleRouteElement ) )*
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:346:6: ( (lv_editorRouteElement_17_0= ruleRouteElement ) )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:347:1: (lv_editorRouteElement_17_0= ruleRouteElement )
                    {
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:347:1: (lv_editorRouteElement_17_0= ruleRouteElement )
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:348:3: lv_editorRouteElement_17_0= ruleRouteElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementRouteElementParserRuleCall_10_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRouteElement_in_ruleRailwayDomainModel487);
                    lv_editorRouteElement_17_0=ruleRouteElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	        }
                           		add(
                           			current, 
                           			"editorRouteElement",
                            		lv_editorRouteElement_17_0, 
                            		"RouteElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:364:2: ( (lv_editorRouteElement_18_0= ruleRouteElement ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:365:1: (lv_editorRouteElement_18_0= ruleRouteElement )
                    	    {
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:365:1: (lv_editorRouteElement_18_0= ruleRouteElement )
                    	    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:366:3: lv_editorRouteElement_18_0= ruleRouteElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementRouteElementParserRuleCall_10_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRouteElement_in_ruleRailwayDomainModel508);
                    	    lv_editorRouteElement_18_0=ruleRouteElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"editorRouteElement",
                    	            		lv_editorRouteElement_18_0, 
                    	            		"RouteElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_19=(Token)match(input,13,FOLLOW_13_in_ruleRailwayDomainModel523); 

                	newLeafNode(otherlv_19, grammarAccess.getRailwayDomainModelAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRailwayDomainModel"


    // $ANTLR start "entryRuleSection"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:394:1: entryRuleSection returns [EObject current=null] : iv_ruleSection= ruleSection EOF ;
    public final EObject entryRuleSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:395:2: (iv_ruleSection= ruleSection EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:396:2: iv_ruleSection= ruleSection EOF
            {
             newCompositeNode(grammarAccess.getSectionRule()); 
            pushFollow(FOLLOW_ruleSection_in_entryRuleSection559);
            iv_ruleSection=ruleSection();

            state._fsp--;

             current =iv_ruleSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection569); 

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
    // $ANTLR end "entryRuleSection"


    // $ANTLR start "ruleSection"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:403:1: ruleSection returns [EObject current=null] : (this_Section_Impl_0= ruleSection_Impl | this_Station_1= ruleStation ) ;
    public final EObject ruleSection() throws RecognitionException {
        EObject current = null;

        EObject this_Section_Impl_0 = null;

        EObject this_Station_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:406:28: ( (this_Section_Impl_0= ruleSection_Impl | this_Station_1= ruleStation ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:407:1: (this_Section_Impl_0= ruleSection_Impl | this_Station_1= ruleStation )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:407:1: (this_Section_Impl_0= ruleSection_Impl | this_Station_1= ruleStation )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==15) ) {
                alt17=1;
            }
            else if ( (LA17_0==22) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:408:5: this_Section_Impl_0= ruleSection_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getSectionAccess().getSection_ImplParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSection_Impl_in_ruleSection616);
                    this_Section_Impl_0=ruleSection_Impl();

                    state._fsp--;

                     
                            current = this_Section_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:418:5: this_Station_1= ruleStation
                    {
                     
                            newCompositeNode(grammarAccess.getSectionAccess().getStationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStation_in_ruleSection643);
                    this_Station_1=ruleStation();

                    state._fsp--;

                     
                            current = this_Station_1; 
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
    // $ANTLR end "ruleSection"


    // $ANTLR start "entryRuleSignal"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:434:1: entryRuleSignal returns [EObject current=null] : iv_ruleSignal= ruleSignal EOF ;
    public final EObject entryRuleSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:435:2: (iv_ruleSignal= ruleSignal EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:436:2: iv_ruleSignal= ruleSignal EOF
            {
             newCompositeNode(grammarAccess.getSignalRule()); 
            pushFollow(FOLLOW_ruleSignal_in_entryRuleSignal678);
            iv_ruleSignal=ruleSignal();

            state._fsp--;

             current =iv_ruleSignal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal688); 

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
    // $ANTLR end "entryRuleSignal"


    // $ANTLR start "ruleSignal"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:443:1: ruleSignal returns [EObject current=null] : (this_Signal_Impl_0= ruleSignal_Impl | this_TurnoutSignal_1= ruleTurnoutSignal ) ;
    public final EObject ruleSignal() throws RecognitionException {
        EObject current = null;

        EObject this_Signal_Impl_0 = null;

        EObject this_TurnoutSignal_1 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:446:28: ( (this_Signal_Impl_0= ruleSignal_Impl | this_TurnoutSignal_1= ruleTurnoutSignal ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:447:1: (this_Signal_Impl_0= ruleSignal_Impl | this_TurnoutSignal_1= ruleTurnoutSignal )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:447:1: (this_Signal_Impl_0= ruleSignal_Impl | this_TurnoutSignal_1= ruleTurnoutSignal )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==18) ) {
                alt18=1;
            }
            else if ( (LA18_0==23) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:448:5: this_Signal_Impl_0= ruleSignal_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getSignalAccess().getSignal_ImplParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSignal_Impl_in_ruleSignal735);
                    this_Signal_Impl_0=ruleSignal_Impl();

                    state._fsp--;

                     
                            current = this_Signal_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:458:5: this_TurnoutSignal_1= ruleTurnoutSignal
                    {
                     
                            newCompositeNode(grammarAccess.getSignalAccess().getTurnoutSignalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleTurnoutSignal_in_ruleSignal762);
                    this_TurnoutSignal_1=ruleTurnoutSignal();

                    state._fsp--;

                     
                            current = this_TurnoutSignal_1; 
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
    // $ANTLR end "ruleSignal"


    // $ANTLR start "entryRuleTrain"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:474:1: entryRuleTrain returns [EObject current=null] : iv_ruleTrain= ruleTrain EOF ;
    public final EObject entryRuleTrain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrain = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:475:2: (iv_ruleTrain= ruleTrain EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:476:2: iv_ruleTrain= ruleTrain EOF
            {
             newCompositeNode(grammarAccess.getTrainRule()); 
            pushFollow(FOLLOW_ruleTrain_in_entryRuleTrain797);
            iv_ruleTrain=ruleTrain();

            state._fsp--;

             current =iv_ruleTrain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrain807); 

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
    // $ANTLR end "entryRuleTrain"


    // $ANTLR start "ruleTrain"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:483:1: ruleTrain returns [EObject current=null] : (otherlv_0= 'Train' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTrain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:486:28: ( (otherlv_0= 'Train' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:487:1: (otherlv_0= 'Train' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:487:1: (otherlv_0= 'Train' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:487:3: otherlv_0= 'Train' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleTrain844); 

                	newLeafNode(otherlv_0, grammarAccess.getTrainAccess().getTrainKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:491:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:492:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:492:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:493:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTrain861); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTrainAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTrainRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleTrain"


    // $ANTLR start "entryRuleSection_Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:517:1: entryRuleSection_Impl returns [EObject current=null] : iv_ruleSection_Impl= ruleSection_Impl EOF ;
    public final EObject entryRuleSection_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSection_Impl = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:518:2: (iv_ruleSection_Impl= ruleSection_Impl EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:519:2: iv_ruleSection_Impl= ruleSection_Impl EOF
            {
             newCompositeNode(grammarAccess.getSection_ImplRule()); 
            pushFollow(FOLLOW_ruleSection_Impl_in_entryRuleSection_Impl902);
            iv_ruleSection_Impl=ruleSection_Impl();

            state._fsp--;

             current =iv_ruleSection_Impl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSection_Impl912); 

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
    // $ANTLR end "entryRuleSection_Impl"


    // $ANTLR start "ruleSection_Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:526:1: ruleSection_Impl returns [EObject current=null] : (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSection_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:529:28: ( (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:530:1: (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:530:1: (otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:530:3: otherlv_0= 'Section' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSection_Impl949); 

                	newLeafNode(otherlv_0, grammarAccess.getSection_ImplAccess().getSectionKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:534:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:535:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:535:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:536:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSection_Impl966); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSection_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSection_ImplRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleSection_Impl"


    // $ANTLR start "entryRuleTurnout"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:560:1: entryRuleTurnout returns [EObject current=null] : iv_ruleTurnout= ruleTurnout EOF ;
    public final EObject entryRuleTurnout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnout = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:561:2: (iv_ruleTurnout= ruleTurnout EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:562:2: iv_ruleTurnout= ruleTurnout EOF
            {
             newCompositeNode(grammarAccess.getTurnoutRule()); 
            pushFollow(FOLLOW_ruleTurnout_in_entryRuleTurnout1007);
            iv_ruleTurnout=ruleTurnout();

            state._fsp--;

             current =iv_ruleTurnout; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnout1017); 

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
    // $ANTLR end "entryRuleTurnout"


    // $ANTLR start "ruleTurnout"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:569:1: ruleTurnout returns [EObject current=null] : (otherlv_0= 'Turnout' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTurnout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:572:28: ( (otherlv_0= 'Turnout' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:573:1: (otherlv_0= 'Turnout' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:573:1: (otherlv_0= 'Turnout' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:573:3: otherlv_0= 'Turnout' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleTurnout1054); 

                	newLeafNode(otherlv_0, grammarAccess.getTurnoutAccess().getTurnoutKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:577:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:578:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:578:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:579:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTurnout1071); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTurnoutAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTurnoutRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleTurnout"


    // $ANTLR start "entryRuleConnectionPoint"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:603:1: entryRuleConnectionPoint returns [EObject current=null] : iv_ruleConnectionPoint= ruleConnectionPoint EOF ;
    public final EObject entryRuleConnectionPoint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConnectionPoint = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:604:2: (iv_ruleConnectionPoint= ruleConnectionPoint EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:605:2: iv_ruleConnectionPoint= ruleConnectionPoint EOF
            {
             newCompositeNode(grammarAccess.getConnectionPointRule()); 
            pushFollow(FOLLOW_ruleConnectionPoint_in_entryRuleConnectionPoint1112);
            iv_ruleConnectionPoint=ruleConnectionPoint();

            state._fsp--;

             current =iv_ruleConnectionPoint; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConnectionPoint1122); 

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
    // $ANTLR end "entryRuleConnectionPoint"


    // $ANTLR start "ruleConnectionPoint"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:612:1: ruleConnectionPoint returns [EObject current=null] : (otherlv_0= 'ConnectionPoint' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleConnectionPoint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:615:28: ( (otherlv_0= 'ConnectionPoint' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:616:1: (otherlv_0= 'ConnectionPoint' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:616:1: (otherlv_0= 'ConnectionPoint' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:616:3: otherlv_0= 'ConnectionPoint' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleConnectionPoint1159); 

                	newLeafNode(otherlv_0, grammarAccess.getConnectionPointAccess().getConnectionPointKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:620:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:621:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:621:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:622:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleConnectionPoint1176); 

            			newLeafNode(lv_name_1_0, grammarAccess.getConnectionPointAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConnectionPointRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleConnectionPoint"


    // $ANTLR start "entryRuleSignal_Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:646:1: entryRuleSignal_Impl returns [EObject current=null] : iv_ruleSignal_Impl= ruleSignal_Impl EOF ;
    public final EObject entryRuleSignal_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignal_Impl = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:647:2: (iv_ruleSignal_Impl= ruleSignal_Impl EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:648:2: iv_ruleSignal_Impl= ruleSignal_Impl EOF
            {
             newCompositeNode(grammarAccess.getSignal_ImplRule()); 
            pushFollow(FOLLOW_ruleSignal_Impl_in_entryRuleSignal_Impl1217);
            iv_ruleSignal_Impl=ruleSignal_Impl();

            state._fsp--;

             current =iv_ruleSignal_Impl; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSignal_Impl1227); 

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
    // $ANTLR end "entryRuleSignal_Impl"


    // $ANTLR start "ruleSignal_Impl"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:655:1: ruleSignal_Impl returns [EObject current=null] : (otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSignal_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:658:28: ( (otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:659:1: (otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:659:1: (otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:659:3: otherlv_0= 'Signal' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleSignal_Impl1264); 

                	newLeafNode(otherlv_0, grammarAccess.getSignal_ImplAccess().getSignalKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:663:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:664:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:664:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:665:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSignal_Impl1281); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSignal_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSignal_ImplRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleSignal_Impl"


    // $ANTLR start "entryRuleTurnoutDesiredDirection"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:689:1: entryRuleTurnoutDesiredDirection returns [EObject current=null] : iv_ruleTurnoutDesiredDirection= ruleTurnoutDesiredDirection EOF ;
    public final EObject entryRuleTurnoutDesiredDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnoutDesiredDirection = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:690:2: (iv_ruleTurnoutDesiredDirection= ruleTurnoutDesiredDirection EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:691:2: iv_ruleTurnoutDesiredDirection= ruleTurnoutDesiredDirection EOF
            {
             newCompositeNode(grammarAccess.getTurnoutDesiredDirectionRule()); 
            pushFollow(FOLLOW_ruleTurnoutDesiredDirection_in_entryRuleTurnoutDesiredDirection1322);
            iv_ruleTurnoutDesiredDirection=ruleTurnoutDesiredDirection();

            state._fsp--;

             current =iv_ruleTurnoutDesiredDirection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnoutDesiredDirection1332); 

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
    // $ANTLR end "entryRuleTurnoutDesiredDirection"


    // $ANTLR start "ruleTurnoutDesiredDirection"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:698:1: ruleTurnoutDesiredDirection returns [EObject current=null] : (otherlv_0= 'TurnoutDesiredDirection' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTurnoutDesiredDirection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:701:28: ( (otherlv_0= 'TurnoutDesiredDirection' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:702:1: (otherlv_0= 'TurnoutDesiredDirection' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:702:1: (otherlv_0= 'TurnoutDesiredDirection' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:702:3: otherlv_0= 'TurnoutDesiredDirection' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTurnoutDesiredDirection1369); 

                	newLeafNode(otherlv_0, grammarAccess.getTurnoutDesiredDirectionAccess().getTurnoutDesiredDirectionKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:706:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:707:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:707:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:708:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTurnoutDesiredDirection1386); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTurnoutDesiredDirectionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTurnoutDesiredDirectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleTurnoutDesiredDirection"


    // $ANTLR start "entryRuleRoute"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:732:1: entryRuleRoute returns [EObject current=null] : iv_ruleRoute= ruleRoute EOF ;
    public final EObject entryRuleRoute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoute = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:733:2: (iv_ruleRoute= ruleRoute EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:734:2: iv_ruleRoute= ruleRoute EOF
            {
             newCompositeNode(grammarAccess.getRouteRule()); 
            pushFollow(FOLLOW_ruleRoute_in_entryRuleRoute1427);
            iv_ruleRoute=ruleRoute();

            state._fsp--;

             current =iv_ruleRoute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRoute1437); 

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
    // $ANTLR end "entryRuleRoute"


    // $ANTLR start "ruleRoute"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:741:1: ruleRoute returns [EObject current=null] : (otherlv_0= 'Route' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleRoute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:744:28: ( (otherlv_0= 'Route' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:745:1: (otherlv_0= 'Route' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:745:1: (otherlv_0= 'Route' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:745:3: otherlv_0= 'Route' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleRoute1474); 

                	newLeafNode(otherlv_0, grammarAccess.getRouteAccess().getRouteKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:749:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:750:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:750:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:751:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRoute1491); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRouteAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRouteRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleRoute"


    // $ANTLR start "entryRuleRouteElement"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:775:1: entryRuleRouteElement returns [EObject current=null] : iv_ruleRouteElement= ruleRouteElement EOF ;
    public final EObject entryRuleRouteElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRouteElement = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:776:2: (iv_ruleRouteElement= ruleRouteElement EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:777:2: iv_ruleRouteElement= ruleRouteElement EOF
            {
             newCompositeNode(grammarAccess.getRouteElementRule()); 
            pushFollow(FOLLOW_ruleRouteElement_in_entryRuleRouteElement1532);
            iv_ruleRouteElement=ruleRouteElement();

            state._fsp--;

             current =iv_ruleRouteElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRouteElement1542); 

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
    // $ANTLR end "entryRuleRouteElement"


    // $ANTLR start "ruleRouteElement"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:784:1: ruleRouteElement returns [EObject current=null] : (otherlv_0= 'RouteElement' ( (lv_name_1_0= ruleEString ) ) ) ;
    public final EObject ruleRouteElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:787:28: ( (otherlv_0= 'RouteElement' ( (lv_name_1_0= ruleEString ) ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:788:1: (otherlv_0= 'RouteElement' ( (lv_name_1_0= ruleEString ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:788:1: (otherlv_0= 'RouteElement' ( (lv_name_1_0= ruleEString ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:788:3: otherlv_0= 'RouteElement' ( (lv_name_1_0= ruleEString ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleRouteElement1579); 

                	newLeafNode(otherlv_0, grammarAccess.getRouteElementAccess().getRouteElementKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:792:1: ( (lv_name_1_0= ruleEString ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:793:1: (lv_name_1_0= ruleEString )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:793:1: (lv_name_1_0= ruleEString )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:794:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRouteElementAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleEString_in_ruleRouteElement1600);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRouteElementRule());
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
    // $ANTLR end "ruleRouteElement"


    // $ANTLR start "entryRuleEString"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:818:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:819:2: (iv_ruleEString= ruleEString EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:820:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1637);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1648); 

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
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:827:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:830:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:831:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:831:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:831:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEString1688); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:839:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEString1714); 

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


    // $ANTLR start "entryRuleStation"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:854:1: entryRuleStation returns [EObject current=null] : iv_ruleStation= ruleStation EOF ;
    public final EObject entryRuleStation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStation = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:855:2: (iv_ruleStation= ruleStation EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:856:2: iv_ruleStation= ruleStation EOF
            {
             newCompositeNode(grammarAccess.getStationRule()); 
            pushFollow(FOLLOW_ruleStation_in_entryRuleStation1759);
            iv_ruleStation=ruleStation();

            state._fsp--;

             current =iv_ruleStation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStation1769); 

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
    // $ANTLR end "entryRuleStation"


    // $ANTLR start "ruleStation"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:863:1: ruleStation returns [EObject current=null] : (otherlv_0= 'Station' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleStation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:866:28: ( (otherlv_0= 'Station' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:867:1: (otherlv_0= 'Station' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:867:1: (otherlv_0= 'Station' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:867:3: otherlv_0= 'Station' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleStation1806); 

                	newLeafNode(otherlv_0, grammarAccess.getStationAccess().getStationKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:871:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:872:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:872:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:873:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStation1823); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleStation"


    // $ANTLR start "entryRuleTurnoutSignal"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:897:1: entryRuleTurnoutSignal returns [EObject current=null] : iv_ruleTurnoutSignal= ruleTurnoutSignal EOF ;
    public final EObject entryRuleTurnoutSignal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTurnoutSignal = null;


        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:898:2: (iv_ruleTurnoutSignal= ruleTurnoutSignal EOF )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:899:2: iv_ruleTurnoutSignal= ruleTurnoutSignal EOF
            {
             newCompositeNode(grammarAccess.getTurnoutSignalRule()); 
            pushFollow(FOLLOW_ruleTurnoutSignal_in_entryRuleTurnoutSignal1864);
            iv_ruleTurnoutSignal=ruleTurnoutSignal();

            state._fsp--;

             current =iv_ruleTurnoutSignal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTurnoutSignal1874); 

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
    // $ANTLR end "entryRuleTurnoutSignal"


    // $ANTLR start "ruleTurnoutSignal"
    // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:906:1: ruleTurnoutSignal returns [EObject current=null] : (otherlv_0= 'TurnoutSignal' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleTurnoutSignal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:909:28: ( (otherlv_0= 'TurnoutSignal' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:910:1: (otherlv_0= 'TurnoutSignal' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:910:1: (otherlv_0= 'TurnoutSignal' ( (lv_name_1_0= RULE_ID ) ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:910:3: otherlv_0= 'TurnoutSignal' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleTurnoutSignal1911); 

                	newLeafNode(otherlv_0, grammarAccess.getTurnoutSignalAccess().getTurnoutSignalKeyword_0());
                
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:914:1: ( (lv_name_1_0= RULE_ID ) )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:915:1: (lv_name_1_0= RULE_ID )
            {
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:915:1: (lv_name_1_0= RULE_ID )
            // ../hu.bme.mit.inf.gomrp.railway.dsl.text/src-gen/hu/bme/mit/inf/gomrp/railway/dsl/parser/antlr/internal/InternalRDMTextDSL.g:916:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTurnoutSignal1928); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTurnoutSignalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTurnoutSignalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleTurnoutSignal"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleRailwayDomainModel_in_entryRuleRailwayDomainModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRailwayDomainModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRailwayDomainModel131 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRailwayDomainModel143 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_ruleTrain_in_ruleRailwayDomainModel165 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_ruleTrain_in_ruleRailwayDomainModel186 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleRailwayDomainModel211 = new BitSet(new long[]{0x0000000000FFA000L});
    public static final BitSet FOLLOW_ruleSection_in_ruleRailwayDomainModel232 = new BitSet(new long[]{0x0000000000FFA000L});
    public static final BitSet FOLLOW_ruleTurnout_in_ruleRailwayDomainModel257 = new BitSet(new long[]{0x0000000000BF2000L});
    public static final BitSet FOLLOW_ruleTurnout_in_ruleRailwayDomainModel278 = new BitSet(new long[]{0x0000000000BF2000L});
    public static final BitSet FOLLOW_ruleConnectionPoint_in_ruleRailwayDomainModel303 = new BitSet(new long[]{0x0000000000BE2000L});
    public static final BitSet FOLLOW_ruleConnectionPoint_in_ruleRailwayDomainModel324 = new BitSet(new long[]{0x0000000000BE2000L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRailwayDomainModel349 = new BitSet(new long[]{0x0000000000BC2000L});
    public static final BitSet FOLLOW_ruleSignal_in_ruleRailwayDomainModel370 = new BitSet(new long[]{0x0000000000BC2000L});
    public static final BitSet FOLLOW_ruleTurnoutDesiredDirection_in_ruleRailwayDomainModel395 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_ruleTurnoutDesiredDirection_in_ruleRailwayDomainModel416 = new BitSet(new long[]{0x0000000000382000L});
    public static final BitSet FOLLOW_ruleRoute_in_ruleRailwayDomainModel441 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_ruleRoute_in_ruleRailwayDomainModel462 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_ruleRouteElement_in_ruleRailwayDomainModel487 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_ruleRouteElement_in_ruleRailwayDomainModel508 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_13_in_ruleRailwayDomainModel523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_in_entryRuleSection559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_Impl_in_ruleSection616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStation_in_ruleSection643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_in_entryRuleSignal678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_Impl_in_ruleSignal735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutSignal_in_ruleSignal762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrain_in_entryRuleTrain797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrain807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleTrain844 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTrain861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSection_Impl_in_entryRuleSection_Impl902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSection_Impl912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSection_Impl949 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSection_Impl966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnout_in_entryRuleTurnout1007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnout1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTurnout1054 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTurnout1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectionPoint_in_entryRuleConnectionPoint1112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConnectionPoint1122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleConnectionPoint1159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleConnectionPoint1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSignal_Impl_in_entryRuleSignal_Impl1217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSignal_Impl1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleSignal_Impl1264 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSignal_Impl1281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutDesiredDirection_in_entryRuleTurnoutDesiredDirection1322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnoutDesiredDirection1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTurnoutDesiredDirection1369 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTurnoutDesiredDirection1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoute_in_entryRuleRoute1427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRoute1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleRoute1474 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRoute1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRouteElement_in_entryRuleRouteElement1532 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRouteElement1542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleRouteElement1579 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_ruleEString_in_ruleRouteElement1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1637 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEString1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStation_in_entryRuleStation1759 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStation1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleStation1806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStation1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTurnoutSignal_in_entryRuleTurnoutSignal1864 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTurnoutSignal1874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleTurnoutSignal1911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTurnoutSignal1928 = new BitSet(new long[]{0x0000000000000002L});

}