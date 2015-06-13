package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.reconnect;

import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Reconnects the RouteElement from a RouteElement to another.
 */
public class ReconnectNextRouteElementSource implements IExternalJavaAction {

	public ReconnectNextRouteElementSource() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		RouteElement source = (RouteElement) parameters.get("source");
		RouteElement target = (RouteElement) parameters.get("target");

		RouteElement nextElement = source.getNextElement();
		target.setNextElement(nextElement);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
