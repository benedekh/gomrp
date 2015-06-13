package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.reconnect;

import hu.bme.mit.inf.gomrp.railway.RDM.Train;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Reconnects the Route from a Train to another.
 */
public class ReconnectRouteSource implements IExternalJavaAction {

	public ReconnectRouteSource() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		Train source = (Train) parameters.get("source");
		Train target = (Train) parameters.get("target");
		target.setFollows(source.getFollows());
		source.setFollows(null);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
