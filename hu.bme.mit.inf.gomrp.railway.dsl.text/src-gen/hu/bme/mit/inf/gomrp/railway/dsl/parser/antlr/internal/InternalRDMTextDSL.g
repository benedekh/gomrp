/*
* generated by Xtext
*/
grammar InternalRDMTextDSL;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package hu.bme.mit.inf.gomrp.railway.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleRailwayDomainModel
entryRuleRailwayDomainModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRailwayDomainModelRule()); }
	 iv_ruleRailwayDomainModel=ruleRailwayDomainModel 
	 { $current=$iv_ruleRailwayDomainModel.current; } 
	 EOF 
;

// Rule RailwayDomainModel
ruleRailwayDomainModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getRailwayDomainModelAccess().getRailwayDomainModelAction_0(),
            $current);
    }
)	otherlv_1='RailwayDomainModel' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getRailwayDomainModelAccess().getRailwayDomainModelKeyword_1());
    }
	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRailwayDomainModelAccess().getLeftCurlyBracketKeyword_2());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getTrainsTrainParserRuleCall_3_0_0()); 
	    }
		lv_trains_3_0=ruleTrain		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"trains",
        		lv_trains_3_0, 
        		"Train");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getTrainsTrainParserRuleCall_3_1_0()); 
	    }
		lv_trains_4_0=ruleTrain		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"trains",
        		lv_trains_4_0, 
        		"Train");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?((
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getSectionsSectionParserRuleCall_4_0_0()); 
	    }
		lv_sections_5_0=ruleSection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"sections",
        		lv_sections_5_0, 
        		"Section");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getSectionsSectionParserRuleCall_4_1_0()); 
	    }
		lv_sections_6_0=ruleSection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"sections",
        		lv_sections_6_0, 
        		"Section");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?((
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getTurnoutsTurnoutParserRuleCall_5_0_0()); 
	    }
		lv_turnouts_7_0=ruleTurnout		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"turnouts",
        		lv_turnouts_7_0, 
        		"Turnout");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getTurnoutsTurnoutParserRuleCall_5_1_0()); 
	    }
		lv_turnouts_8_0=ruleTurnout		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"turnouts",
        		lv_turnouts_8_0, 
        		"Turnout");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?((
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorCPConnectionPointParserRuleCall_6_0_0()); 
	    }
		lv_editorCP_9_0=ruleConnectionPoint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"editorCP",
        		lv_editorCP_9_0, 
        		"ConnectionPoint");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorCPConnectionPointParserRuleCall_6_1_0()); 
	    }
		lv_editorCP_10_0=ruleConnectionPoint		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"editorCP",
        		lv_editorCP_10_0, 
        		"ConnectionPoint");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?((
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorSignalSignalParserRuleCall_7_0_0()); 
	    }
		lv_editorSignal_11_0=ruleSignal		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"editorSignal",
        		lv_editorSignal_11_0, 
        		"Signal");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorSignalSignalParserRuleCall_7_1_0()); 
	    }
		lv_editorSignal_12_0=ruleSignal		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"editorSignal",
        		lv_editorSignal_12_0, 
        		"Signal");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?((
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorTDDTurnoutDesiredDirectionParserRuleCall_8_0_0()); 
	    }
		lv_editorTDD_13_0=ruleTurnoutDesiredDirection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"editorTDD",
        		lv_editorTDD_13_0, 
        		"TurnoutDesiredDirection");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorTDDTurnoutDesiredDirectionParserRuleCall_8_1_0()); 
	    }
		lv_editorTDD_14_0=ruleTurnoutDesiredDirection		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"editorTDD",
        		lv_editorTDD_14_0, 
        		"TurnoutDesiredDirection");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?((
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorRouteRouteParserRuleCall_9_0_0()); 
	    }
		lv_editorRoute_15_0=ruleRoute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"editorRoute",
        		lv_editorRoute_15_0, 
        		"Route");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorRouteRouteParserRuleCall_9_1_0()); 
	    }
		lv_editorRoute_16_0=ruleRoute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"editorRoute",
        		lv_editorRoute_16_0, 
        		"Route");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?((
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementRouteElementParserRuleCall_10_0_0()); 
	    }
		lv_editorRouteElement_17_0=ruleRouteElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"editorRouteElement",
        		lv_editorRouteElement_17_0, 
        		"RouteElement");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementRouteElementParserRuleCall_10_1_0()); 
	    }
		lv_editorRouteElement_18_0=ruleRouteElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRailwayDomainModelRule());
	        }
       		add(
       			$current, 
       			"editorRouteElement",
        		lv_editorRouteElement_18_0, 
        		"RouteElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*)?	otherlv_19='}' 
    {
    	newLeafNode(otherlv_19, grammarAccess.getRailwayDomainModelAccess().getRightCurlyBracketKeyword_11());
    }
)
;





// Entry rule entryRuleSection
entryRuleSection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSectionRule()); }
	 iv_ruleSection=ruleSection 
	 { $current=$iv_ruleSection.current; } 
	 EOF 
;

// Rule Section
ruleSection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSectionAccess().getSection_ImplParserRuleCall_0()); 
    }
    this_Section_Impl_0=ruleSection_Impl
    { 
        $current = $this_Section_Impl_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSectionAccess().getStationParserRuleCall_1()); 
    }
    this_Station_1=ruleStation
    { 
        $current = $this_Station_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleSignal
entryRuleSignal returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSignalRule()); }
	 iv_ruleSignal=ruleSignal 
	 { $current=$iv_ruleSignal.current; } 
	 EOF 
;

// Rule Signal
ruleSignal returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getSignalAccess().getSignal_ImplParserRuleCall_0()); 
    }
    this_Signal_Impl_0=ruleSignal_Impl
    { 
        $current = $this_Signal_Impl_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getSignalAccess().getTurnoutSignalParserRuleCall_1()); 
    }
    this_TurnoutSignal_1=ruleTurnoutSignal
    { 
        $current = $this_TurnoutSignal_1.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleTrain
entryRuleTrain returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTrainRule()); }
	 iv_ruleTrain=ruleTrain 
	 { $current=$iv_ruleTrain.current; } 
	 EOF 
;

// Rule Train
ruleTrain returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Train' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTrainAccess().getTrainKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTrainAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTrainRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleSection_Impl
entryRuleSection_Impl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSection_ImplRule()); }
	 iv_ruleSection_Impl=ruleSection_Impl 
	 { $current=$iv_ruleSection_Impl.current; } 
	 EOF 
;

// Rule Section_Impl
ruleSection_Impl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Section' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSection_ImplAccess().getSectionKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSection_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSection_ImplRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleTurnout
entryRuleTurnout returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTurnoutRule()); }
	 iv_ruleTurnout=ruleTurnout 
	 { $current=$iv_ruleTurnout.current; } 
	 EOF 
;

// Rule Turnout
ruleTurnout returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Turnout' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTurnoutAccess().getTurnoutKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTurnoutAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTurnoutRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleConnectionPoint
entryRuleConnectionPoint returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConnectionPointRule()); }
	 iv_ruleConnectionPoint=ruleConnectionPoint 
	 { $current=$iv_ruleConnectionPoint.current; } 
	 EOF 
;

// Rule ConnectionPoint
ruleConnectionPoint returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='ConnectionPoint' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getConnectionPointAccess().getConnectionPointKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getConnectionPointAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getConnectionPointRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleSignal_Impl
entryRuleSignal_Impl returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSignal_ImplRule()); }
	 iv_ruleSignal_Impl=ruleSignal_Impl 
	 { $current=$iv_ruleSignal_Impl.current; } 
	 EOF 
;

// Rule Signal_Impl
ruleSignal_Impl returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Signal' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSignal_ImplAccess().getSignalKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getSignal_ImplAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSignal_ImplRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleTurnoutDesiredDirection
entryRuleTurnoutDesiredDirection returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTurnoutDesiredDirectionRule()); }
	 iv_ruleTurnoutDesiredDirection=ruleTurnoutDesiredDirection 
	 { $current=$iv_ruleTurnoutDesiredDirection.current; } 
	 EOF 
;

// Rule TurnoutDesiredDirection
ruleTurnoutDesiredDirection returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='TurnoutDesiredDirection' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTurnoutDesiredDirectionAccess().getTurnoutDesiredDirectionKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTurnoutDesiredDirectionAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTurnoutDesiredDirectionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleRoute
entryRuleRoute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRouteRule()); }
	 iv_ruleRoute=ruleRoute 
	 { $current=$iv_ruleRoute.current; } 
	 EOF 
;

// Rule Route
ruleRoute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Route' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRouteAccess().getRouteKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getRouteAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getRouteRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleRouteElement
entryRuleRouteElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRouteElementRule()); }
	 iv_ruleRouteElement=ruleRouteElement 
	 { $current=$iv_ruleRouteElement.current; } 
	 EOF 
;

// Rule RouteElement
ruleRouteElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='RouteElement' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRouteElementAccess().getRouteElementKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRouteElementAccess().getNameEStringParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleEString		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRouteElementRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"EString");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleEString
entryRuleEString returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getEStringRule()); } 
	 iv_ruleEString=ruleEString 
	 { $current=$iv_ruleEString.current.getText(); }  
	 EOF 
;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |    this_ID_1=RULE_ID    {
		$current.merge(this_ID_1);
    }

    { 
    newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
    }
)
    ;





// Entry rule entryRuleStation
entryRuleStation returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getStationRule()); }
	 iv_ruleStation=ruleStation 
	 { $current=$iv_ruleStation.current; } 
	 EOF 
;

// Rule Station
ruleStation returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Station' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getStationAccess().getStationKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getStationAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getStationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleTurnoutSignal
entryRuleTurnoutSignal returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTurnoutSignalRule()); }
	 iv_ruleTurnoutSignal=ruleTurnoutSignal 
	 { $current=$iv_ruleTurnoutSignal.current; } 
	 EOF 
;

// Rule TurnoutSignal
ruleTurnoutSignal returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='TurnoutSignal' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTurnoutSignalAccess().getTurnoutSignalKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getTurnoutSignalAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getTurnoutSignalRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


