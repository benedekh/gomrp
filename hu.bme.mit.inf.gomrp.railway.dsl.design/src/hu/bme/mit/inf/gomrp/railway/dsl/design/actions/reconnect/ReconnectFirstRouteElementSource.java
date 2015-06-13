package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.reconnect;

import hu.bme.mit.inf.gomrp.railway.RDM.Route;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Reconnects the RouteElement from a Route to another.
 */
public class ReconnectFirstRouteElementSource implements IExternalJavaAction {

	public ReconnectFirstRouteElementSource() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		Route source = (Route) parameters.get("source");
		Route target = (Route) parameters.get("target");

		target.setFirstElement(source.getFirstElement());
		source.setFirstElement(null);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
