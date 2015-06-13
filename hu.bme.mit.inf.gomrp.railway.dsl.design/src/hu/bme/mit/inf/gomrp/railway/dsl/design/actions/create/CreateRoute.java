package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.create;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMFactory;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Route;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection;
import hu.bme.mit.inf.gomrp.railway.dsl.design.LatestAmount;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Crates RouteElements and connects them according to the selected
 * TrackElement's order. Besides, it creates a Route, and connects the first
 * RouteElement to the Route.
 */
public class CreateRoute implements IExternalJavaAction {

	@SuppressWarnings("unchecked")
	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		Collection<DNode> list = (Collection<DNode>) parameters.get("views");
		Route route = RDMFactory.eINSTANCE.createRoute();
		RailwayDomainModel model = null;

		int re_count = 0;
		int tdd_count = 0;
		RouteElement prev = null;
		for (DNode node : list) {
			RouteElement elem = RDMFactory.eINSTANCE.createRouteElement();
			TrackElement item = (TrackElement) node.getTarget();
			model = (RailwayDomainModel) item.eContainer();
			route.setName("R" + (LatestAmount.getRouteAmount(model) + 1));
			if (prev == null) {
				re_count = LatestAmount.getRouteElementAmount(model) + 1;
				tdd_count = LatestAmount
						.getTurnoutDesiredDirectionAmount(model) + 1;
				elem.setBelongsTo(route);
				route.setFirstElement(elem);
			} else {
				prev.setNextElement(elem);
			}
			if (item instanceof Turnout) {
				TurnoutDesiredDirection tdd = RDMFactory.eINSTANCE
						.createTurnoutDesiredDirection();
				tdd.setName("TDD" + tdd_count++);
				tdd.setRouteElement(elem);
				elem.setDesiredDirection(tdd);
			}
			elem.setName("RE" + re_count++);
			elem.setReferredElement(item);
			elem.setLength(item.getLength());
			prev = elem;
		}
		model.getEditorRoute().add(route);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		for (EObject obj : selections) {
			if (!(obj instanceof TrackElement)) {
				return false;
			}
		}
		return true;
	}

}
