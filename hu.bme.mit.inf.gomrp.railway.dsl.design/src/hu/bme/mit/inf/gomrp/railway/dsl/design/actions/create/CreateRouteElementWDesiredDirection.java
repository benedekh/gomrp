package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.create;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMFactory;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection;
import hu.bme.mit.inf.gomrp.railway.dsl.design.LatestAmount;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Creates a RouteElement with TurnoutDesiredDirection.
 */
public class CreateRouteElementWDesiredDirection implements IExternalJavaAction {

	public CreateRouteElementWDesiredDirection() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		RailwayDomainModel diagram = (RailwayDomainModel) parameters
				.get("container");

		RouteElement routeElement = RDMFactory.eINSTANCE.createRouteElement();
		routeElement.setName("RE"
				+ (LatestAmount.getRouteElementAmount(diagram) + 1));

		TurnoutDesiredDirection tdd = RDMFactory.eINSTANCE
				.createTurnoutDesiredDirection();
		tdd.setName("TDD"
				+ (LatestAmount.getTurnoutDesiredDirectionAmount(diagram) + 1));

		routeElement.setDesiredDirection(tdd);
		diagram.getEditorRouteElement().add(routeElement);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
