package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.delete;

import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Route;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Removes the RouteElement from the model.
 */
public class DeleteRouteElement implements IExternalJavaAction {

	public DeleteRouteElement() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		RouteElement routeElement = (RouteElement) parameters.get("element");

		DSemanticDiagram diagram = (DSemanticDiagram) parameters
				.get("container");
		RailwayDomainModel model = (RailwayDomainModel) diagram.getTarget();

		routeElement.setDesiredDirection(null);
		routeElement.setNextElement(null);

		if (model.getEditorRouteElement().remove(routeElement)) {
			return;
		}

		if (routeElement.getBelongsTo() != null) {
			routeElement.getBelongsTo().setFirstElement(null);
			return;
		}

		RouteElement previous = null;
		for (RouteElement re : model.getEditorRouteElement()) {
			previous = re;
			if (re.getNextElement() != null) {
				RouteElement element = re.getNextElement();
				if (element == routeElement) {
					previous.setNextElement(null);
					return;
				}
				if (removeRouteElementInClosure(routeElement, previous, element)) {
					return;
				}
			}
		}

		for (Route route : model.getEditorRoute()) {
			if (removeRouteElement(routeElement, route)) {
				return;
			}
		}

		for (Train train : model.getTrains()) {
			if (train.getFollows() != null) {
				if (removeRouteElement(routeElement, train.getFollows())) {
					return;
				}
			}
		}

	}

	private boolean removeRouteElementInClosure(RouteElement routeElement,
			RouteElement previous, RouteElement element) {
		while (element != routeElement && element != null) {
			previous = element;
			element = element.getNextElement();
		}
		if (element == routeElement) {
			previous.setNextElement(null);
			return true;
		}
		return false;
	}

	private boolean removeRouteElement(RouteElement routeElement, Route route) {
		RouteElement element = route.getFirstElement();
		if (element == routeElement) {
			route.setFirstElement(null);
			return true;
		} else {
			RouteElement previous = element;
			if (removeRouteElementInClosure(routeElement, previous, element)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
