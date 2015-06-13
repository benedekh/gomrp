package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.create;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMFactory;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Route;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;
import hu.bme.mit.inf.gomrp.railway.dsl.design.LatestAmount;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Creates a Train with a Route and an empty RouteElement.
 */
public class CreateTrainWRoute implements IExternalJavaAction {

	public CreateTrainWRoute() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		RailwayDomainModel diagram = (RailwayDomainModel) parameters
				.get("container");

		Train train = RDMFactory.eINSTANCE.createTrain();
		train.setName("T" + (LatestAmount.getTrainAmount(diagram) + 1));

		Route route = RDMFactory.eINSTANCE.createRoute();
		route.setName("R" + (LatestAmount.getRouteAmount(diagram) + 1));

		RouteElement routeElement = RDMFactory.eINSTANCE.createRouteElement();
		routeElement.setName("RE"
				+ (LatestAmount.getRouteElementAmount(diagram) + 1));

		route.setFirstElement(routeElement);
		train.setFollows(route);

		diagram.getTrains().add(train);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
