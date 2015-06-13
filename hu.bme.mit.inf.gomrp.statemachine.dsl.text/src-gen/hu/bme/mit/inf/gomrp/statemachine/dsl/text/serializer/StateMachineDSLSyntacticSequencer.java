package hu.bme.mit.inf.gomrp.statemachine.dsl.text.serializer;

import com.google.inject.Inject;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.services.StateMachineDSLGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class StateMachineDSLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected StateMachineDSLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_StateMachine___ActionsKeyword_5_0_EndActionsKeyword_5_2__q;
	protected AbstractElementAlias match_StateMachine___GuardsKeyword_6_0_EndGuardsKeyword_6_2__q;
	protected AbstractElementAlias match_StateMachine___StatesKeyword_8_0_EndStatesKeyword_8_2__q;
	protected AbstractElementAlias match_StateMachine___TransitionsKeyword_9_0_EndTransitionsKeyword_9_2__q;
	protected AbstractElementAlias match_StateMachine___TriggersKeyword_7_0_EndTriggersKeyword_7_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (StateMachineDSLGrammarAccess) access;
		match_StateMachine___ActionsKeyword_5_0_EndActionsKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStateMachineAccess().getActionsKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getStateMachineAccess().getEndActionsKeyword_5_2()));
		match_StateMachine___GuardsKeyword_6_0_EndGuardsKeyword_6_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStateMachineAccess().getGuardsKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getStateMachineAccess().getEndGuardsKeyword_6_2()));
		match_StateMachine___StatesKeyword_8_0_EndStatesKeyword_8_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStateMachineAccess().getStatesKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getStateMachineAccess().getEndStatesKeyword_8_2()));
		match_StateMachine___TransitionsKeyword_9_0_EndTransitionsKeyword_9_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStateMachineAccess().getTransitionsKeyword_9_0()), new TokenAlias(false, false, grammarAccess.getStateMachineAccess().getEndTransitionsKeyword_9_2()));
		match_StateMachine___TriggersKeyword_7_0_EndTriggersKeyword_7_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStateMachineAccess().getTriggersKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getStateMachineAccess().getEndTriggersKeyword_7_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_StateMachine___ActionsKeyword_5_0_EndActionsKeyword_5_2__q.equals(syntax))
				emit_StateMachine___ActionsKeyword_5_0_EndActionsKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StateMachine___GuardsKeyword_6_0_EndGuardsKeyword_6_2__q.equals(syntax))
				emit_StateMachine___GuardsKeyword_6_0_EndGuardsKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StateMachine___StatesKeyword_8_0_EndStatesKeyword_8_2__q.equals(syntax))
				emit_StateMachine___StatesKeyword_8_0_EndStatesKeyword_8_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StateMachine___TransitionsKeyword_9_0_EndTransitionsKeyword_9_2__q.equals(syntax))
				emit_StateMachine___TransitionsKeyword_9_0_EndTransitionsKeyword_9_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_StateMachine___TriggersKeyword_7_0_EndTriggersKeyword_7_2__q.equals(syntax))
				emit_StateMachine___TriggersKeyword_7_0_EndTriggersKeyword_7_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('Actions:' 'EndActions')?
	 */
	protected void emit_StateMachine___ActionsKeyword_5_0_EndActionsKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Guards:' 'EndGuards')?
	 */
	protected void emit_StateMachine___GuardsKeyword_6_0_EndGuardsKeyword_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('States:' 'EndStates')?
	 */
	protected void emit_StateMachine___StatesKeyword_8_0_EndStatesKeyword_8_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Transitions:' 'EndTransitions')?
	 */
	protected void emit_StateMachine___TransitionsKeyword_9_0_EndTransitionsKeyword_9_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('Triggers:' 'EndTriggers')?
	 */
	protected void emit_StateMachine___TriggersKeyword_7_0_EndTriggersKeyword_7_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
