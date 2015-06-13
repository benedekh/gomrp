package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.create;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection;
import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMFactory;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Signal;
import hu.bme.mit.inf.gomrp.railway.RDM.Station;
import hu.bme.mit.inf.gomrp.railway.dsl.design.LatestAmount;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Creates a Station with two ConnectionPoints to each ends, and a Signal for
 * each ConnectionPoint.
 */
public class CreateComplexStation implements IExternalJavaAction {

	public CreateComplexStation() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		RailwayDomainModel diagram = (RailwayDomainModel) parameters
				.get("container");

		Station station = RDMFactory.eINSTANCE.createStation();
		station.setName("ST" + (LatestAmount.getStationAmount(diagram) + 1));

		ConnectionPoint cp1 = RDMFactory.eINSTANCE.createConnectionPoint();
		cp1.setDirection(ConnectionDirection.STRAIGHT);
		cp1.setName("CP" + (LatestAmount.getConnectionPointAmount(diagram) + 1));

		ConnectionPoint cp2 = RDMFactory.eINSTANCE.createConnectionPoint();
		cp2.setDirection(ConnectionDirection.TOP);
		cp2.setName("CP" + (LatestAmount.getConnectionPointAmount(diagram) + 2));

		Signal s1 = RDMFactory.eINSTANCE.createSignal();
		s1.setName("Sig" + (LatestAmount.getSignalAmount(diagram) + 1));
		cp1.setHolds(s1);

		Signal s2 = RDMFactory.eINSTANCE.createSignal();
		s2.setName("Sig" + (LatestAmount.getSignalAmount(diagram) + 2));
		cp2.setHolds(s2);

		station.getConnectsTo().add(cp1);
		station.getConnectsTo().add(cp2);

		diagram.getSections().add(station);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
