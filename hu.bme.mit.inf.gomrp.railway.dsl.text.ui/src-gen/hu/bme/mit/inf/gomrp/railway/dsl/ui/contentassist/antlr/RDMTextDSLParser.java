/*
* generated by Xtext
*/
package hu.bme.mit.inf.gomrp.railway.dsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import hu.bme.mit.inf.gomrp.railway.dsl.services.RDMTextDSLGrammarAccess;

public class RDMTextDSLParser extends AbstractContentAssistParser {
	
	@Inject
	private RDMTextDSLGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected hu.bme.mit.inf.gomrp.railway.dsl.ui.contentassist.antlr.internal.InternalRDMTextDSLParser createParser() {
		hu.bme.mit.inf.gomrp.railway.dsl.ui.contentassist.antlr.internal.InternalRDMTextDSLParser result = new hu.bme.mit.inf.gomrp.railway.dsl.ui.contentassist.antlr.internal.InternalRDMTextDSLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getSectionAccess().getAlternatives(), "rule__Section__Alternatives");
					put(grammarAccess.getSignalAccess().getAlternatives(), "rule__Signal__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getRailwayDomainModelAccess().getGroup(), "rule__RailwayDomainModel__Group__0");
					put(grammarAccess.getRailwayDomainModelAccess().getGroup_3(), "rule__RailwayDomainModel__Group_3__0");
					put(grammarAccess.getRailwayDomainModelAccess().getGroup_4(), "rule__RailwayDomainModel__Group_4__0");
					put(grammarAccess.getRailwayDomainModelAccess().getGroup_5(), "rule__RailwayDomainModel__Group_5__0");
					put(grammarAccess.getRailwayDomainModelAccess().getGroup_6(), "rule__RailwayDomainModel__Group_6__0");
					put(grammarAccess.getRailwayDomainModelAccess().getGroup_7(), "rule__RailwayDomainModel__Group_7__0");
					put(grammarAccess.getRailwayDomainModelAccess().getGroup_8(), "rule__RailwayDomainModel__Group_8__0");
					put(grammarAccess.getRailwayDomainModelAccess().getGroup_9(), "rule__RailwayDomainModel__Group_9__0");
					put(grammarAccess.getRailwayDomainModelAccess().getGroup_10(), "rule__RailwayDomainModel__Group_10__0");
					put(grammarAccess.getTrainAccess().getGroup(), "rule__Train__Group__0");
					put(grammarAccess.getSection_ImplAccess().getGroup(), "rule__Section_Impl__Group__0");
					put(grammarAccess.getTurnoutAccess().getGroup(), "rule__Turnout__Group__0");
					put(grammarAccess.getConnectionPointAccess().getGroup(), "rule__ConnectionPoint__Group__0");
					put(grammarAccess.getSignal_ImplAccess().getGroup(), "rule__Signal_Impl__Group__0");
					put(grammarAccess.getTurnoutDesiredDirectionAccess().getGroup(), "rule__TurnoutDesiredDirection__Group__0");
					put(grammarAccess.getRouteAccess().getGroup(), "rule__Route__Group__0");
					put(grammarAccess.getRouteElementAccess().getGroup(), "rule__RouteElement__Group__0");
					put(grammarAccess.getStationAccess().getGroup(), "rule__Station__Group__0");
					put(grammarAccess.getTurnoutSignalAccess().getGroup(), "rule__TurnoutSignal__Group__0");
					put(grammarAccess.getRailwayDomainModelAccess().getTrainsAssignment_3_0(), "rule__RailwayDomainModel__TrainsAssignment_3_0");
					put(grammarAccess.getRailwayDomainModelAccess().getTrainsAssignment_3_1(), "rule__RailwayDomainModel__TrainsAssignment_3_1");
					put(grammarAccess.getRailwayDomainModelAccess().getSectionsAssignment_4_0(), "rule__RailwayDomainModel__SectionsAssignment_4_0");
					put(grammarAccess.getRailwayDomainModelAccess().getSectionsAssignment_4_1(), "rule__RailwayDomainModel__SectionsAssignment_4_1");
					put(grammarAccess.getRailwayDomainModelAccess().getTurnoutsAssignment_5_0(), "rule__RailwayDomainModel__TurnoutsAssignment_5_0");
					put(grammarAccess.getRailwayDomainModelAccess().getTurnoutsAssignment_5_1(), "rule__RailwayDomainModel__TurnoutsAssignment_5_1");
					put(grammarAccess.getRailwayDomainModelAccess().getEditorCPAssignment_6_0(), "rule__RailwayDomainModel__EditorCPAssignment_6_0");
					put(grammarAccess.getRailwayDomainModelAccess().getEditorCPAssignment_6_1(), "rule__RailwayDomainModel__EditorCPAssignment_6_1");
					put(grammarAccess.getRailwayDomainModelAccess().getEditorSignalAssignment_7_0(), "rule__RailwayDomainModel__EditorSignalAssignment_7_0");
					put(grammarAccess.getRailwayDomainModelAccess().getEditorSignalAssignment_7_1(), "rule__RailwayDomainModel__EditorSignalAssignment_7_1");
					put(grammarAccess.getRailwayDomainModelAccess().getEditorTDDAssignment_8_0(), "rule__RailwayDomainModel__EditorTDDAssignment_8_0");
					put(grammarAccess.getRailwayDomainModelAccess().getEditorTDDAssignment_8_1(), "rule__RailwayDomainModel__EditorTDDAssignment_8_1");
					put(grammarAccess.getRailwayDomainModelAccess().getEditorRouteAssignment_9_0(), "rule__RailwayDomainModel__EditorRouteAssignment_9_0");
					put(grammarAccess.getRailwayDomainModelAccess().getEditorRouteAssignment_9_1(), "rule__RailwayDomainModel__EditorRouteAssignment_9_1");
					put(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementAssignment_10_0(), "rule__RailwayDomainModel__EditorRouteElementAssignment_10_0");
					put(grammarAccess.getRailwayDomainModelAccess().getEditorRouteElementAssignment_10_1(), "rule__RailwayDomainModel__EditorRouteElementAssignment_10_1");
					put(grammarAccess.getTrainAccess().getNameAssignment_1(), "rule__Train__NameAssignment_1");
					put(grammarAccess.getSection_ImplAccess().getNameAssignment_1(), "rule__Section_Impl__NameAssignment_1");
					put(grammarAccess.getTurnoutAccess().getNameAssignment_1(), "rule__Turnout__NameAssignment_1");
					put(grammarAccess.getConnectionPointAccess().getNameAssignment_1(), "rule__ConnectionPoint__NameAssignment_1");
					put(grammarAccess.getSignal_ImplAccess().getNameAssignment_1(), "rule__Signal_Impl__NameAssignment_1");
					put(grammarAccess.getTurnoutDesiredDirectionAccess().getNameAssignment_1(), "rule__TurnoutDesiredDirection__NameAssignment_1");
					put(grammarAccess.getRouteAccess().getNameAssignment_1(), "rule__Route__NameAssignment_1");
					put(grammarAccess.getRouteElementAccess().getNameAssignment_1(), "rule__RouteElement__NameAssignment_1");
					put(grammarAccess.getStationAccess().getNameAssignment_1(), "rule__Station__NameAssignment_1");
					put(grammarAccess.getTurnoutSignalAccess().getNameAssignment_1(), "rule__TurnoutSignal__NameAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			hu.bme.mit.inf.gomrp.railway.dsl.ui.contentassist.antlr.internal.InternalRDMTextDSLParser typedParser = (hu.bme.mit.inf.gomrp.railway.dsl.ui.contentassist.antlr.internal.InternalRDMTextDSLParser) parser;
			typedParser.entryRuleRailwayDomainModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public RDMTextDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RDMTextDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}