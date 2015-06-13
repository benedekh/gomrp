package hu.bme.mit.inf.gomrp.railway.dsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Route;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Section;
import hu.bme.mit.inf.gomrp.railway.RDM.Signal;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;
import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal;
import hu.bme.mit.inf.gomrp.railway.dsl.services.RDMTextDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class RDMTextDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RDMTextDSLGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RDMPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RDMPackage.CONNECTION_POINT:
				if(context == grammarAccess.getConnectionPointRule()) {
					sequence_ConnectionPoint(context, (ConnectionPoint) semanticObject); 
					return; 
				}
				else break;
			case RDMPackage.RAILWAY_DOMAIN_MODEL:
				if(context == grammarAccess.getRailwayDomainModelRule()) {
					sequence_RailwayDomainModel(context, (RailwayDomainModel) semanticObject); 
					return; 
				}
				else break;
			case RDMPackage.ROUTE:
				if(context == grammarAccess.getRouteRule()) {
					sequence_Route(context, (Route) semanticObject); 
					return; 
				}
				else break;
			case RDMPackage.ROUTE_ELEMENT:
				if(context == grammarAccess.getRouteElementRule()) {
					sequence_RouteElement(context, (RouteElement) semanticObject); 
					return; 
				}
				else break;
			case RDMPackage.SECTION:
				if(context == grammarAccess.getSection_ImplRule()) {
					sequence_Section_Impl(context, (Section) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSectionRule()) {
					sequence_Section_Section_Impl_Station(context, (Section) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStationRule()) {
					sequence_Station(context, (Section) semanticObject); 
					return; 
				}
				else break;
			case RDMPackage.SIGNAL:
				if(context == grammarAccess.getSignalRule() ||
				   context == grammarAccess.getSignal_ImplRule()) {
					sequence_Signal_Impl(context, (Signal) semanticObject); 
					return; 
				}
				else break;
			case RDMPackage.TRAIN:
				if(context == grammarAccess.getTrainRule()) {
					sequence_Train(context, (Train) semanticObject); 
					return; 
				}
				else break;
			case RDMPackage.TURNOUT:
				if(context == grammarAccess.getTurnoutRule()) {
					sequence_Turnout(context, (Turnout) semanticObject); 
					return; 
				}
				else break;
			case RDMPackage.TURNOUT_DESIRED_DIRECTION:
				if(context == grammarAccess.getTurnoutDesiredDirectionRule()) {
					sequence_TurnoutDesiredDirection(context, (TurnoutDesiredDirection) semanticObject); 
					return; 
				}
				else break;
			case RDMPackage.TURNOUT_SIGNAL:
				if(context == grammarAccess.getSignalRule() ||
				   context == grammarAccess.getTurnoutSignalRule()) {
					sequence_TurnoutSignal(context, (TurnoutSignal) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_ConnectionPoint(EObject context, ConnectionPoint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (trains+=Train trains+=Train*)? 
	 *         (sections+=Section sections+=Section*)? 
	 *         (turnouts+=Turnout turnouts+=Turnout*)? 
	 *         (editorCP+=ConnectionPoint editorCP+=ConnectionPoint*)? 
	 *         (editorSignal+=Signal editorSignal+=Signal*)? 
	 *         (editorTDD+=TurnoutDesiredDirection editorTDD+=TurnoutDesiredDirection*)? 
	 *         (editorRoute+=Route editorRoute+=Route*)? 
	 *         (editorRouteElement+=RouteElement editorRouteElement+=RouteElement*)?
	 *     )
	 */
	protected void sequence_RailwayDomainModel(EObject context, RailwayDomainModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_RouteElement(EObject context, RouteElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Route(EObject context, Route semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Section_Impl(EObject context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID | name=ID)
	 */
	protected void sequence_Section_Section_Impl_Station(EObject context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Signal_Impl(EObject context, Signal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Station(EObject context, Section semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Train(EObject context, Train semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TurnoutDesiredDirection(EObject context, TurnoutDesiredDirection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_TurnoutSignal(EObject context, TurnoutSignal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Turnout(EObject context, Turnout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
