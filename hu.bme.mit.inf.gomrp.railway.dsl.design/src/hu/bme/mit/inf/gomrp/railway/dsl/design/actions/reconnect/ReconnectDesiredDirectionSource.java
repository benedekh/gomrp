package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.reconnect;

import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Reconnects the TurnoutDesiredDirection from one RouteElement to another.
 */
public class ReconnectDesiredDirectionSource implements IExternalJavaAction {

	public ReconnectDesiredDirectionSource() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		RouteElement source = (RouteElement) parameters.get("source");
		RouteElement target = (RouteElement) parameters.get("target");

		TurnoutDesiredDirection direction = source.getDesiredDirection();
		target.setDesiredDirection(direction);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
