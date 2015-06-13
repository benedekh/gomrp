package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.create;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection;
import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMFactory;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Signal;
import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection;
import hu.bme.mit.inf.gomrp.railway.dsl.design.LatestAmount;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Creates a Turnout with three ConnectionPoints to each ends, and a Signal for
 * each ConnectionPoint.
 */
public class CreateComplexTurnout implements IExternalJavaAction {

	public CreateComplexTurnout() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		RailwayDomainModel diagram = (RailwayDomainModel) parameters
				.get("container");

		Turnout turnout = RDMFactory.eINSTANCE.createTurnout();
		turnout.setSwitchingDirection(TurnoutDirection.LEFT);
		turnout.setCurrentDirection(TurnoutDirection.LEFT);
		turnout.setName("TO" + (diagram.getTurnouts().size() + 1));

		Signal s1 = RDMFactory.eINSTANCE.createSignal();
		s1.setName("Sig" + (LatestAmount.getSignalAmount(diagram) + 1));

		ConnectionPoint cp1 = RDMFactory.eINSTANCE.createConnectionPoint();
		cp1.setDirection(ConnectionDirection.TOP);
		cp1.setHolds(s1);
		cp1.setName("CP" + (LatestAmount.getConnectionPointAmount(diagram) + 1));

		Signal s2 = RDMFactory.eINSTANCE.createSignal();
		s2.setName("Sig" + (LatestAmount.getSignalAmount(diagram) + 2));

		ConnectionPoint cp2 = RDMFactory.eINSTANCE.createConnectionPoint();
		cp2.setDirection(ConnectionDirection.LEFT);
		cp2.setHolds(s2);
		cp2.setName("CP" + (LatestAmount.getConnectionPointAmount(diagram) + 2));

		Signal s3 = RDMFactory.eINSTANCE.createSignal();
		s3.setName("Sig" + (LatestAmount.getSignalAmount(diagram) + 3));

		ConnectionPoint cp3 = RDMFactory.eINSTANCE.createConnectionPoint();
		cp3.setDirection(ConnectionDirection.STRAIGHT);
		cp3.setHolds(s3);
		cp3.setName("CP" + (LatestAmount.getConnectionPointAmount(diagram) + 3));

		turnout.getConnectsTo().add(cp1);
		turnout.getConnectsTo().add(cp2);
		turnout.getConnectsTo().add(cp3);

		diagram.getTurnouts().add(turnout);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
