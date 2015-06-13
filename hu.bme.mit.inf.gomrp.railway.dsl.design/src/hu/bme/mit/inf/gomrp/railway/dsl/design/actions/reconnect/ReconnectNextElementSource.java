package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.reconnect;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Reconnects the TrackElement from a ConnectionPont to another.
 */
public class ReconnectNextElementSource implements IExternalJavaAction {

	public ReconnectNextElementSource() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		ConnectionPoint source = (ConnectionPoint) parameters.get("source");
		ConnectionPoint target = (ConnectionPoint) parameters.get("target");
		target.setNextElement(source.getNextElement());
		source.setNextElement(null);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
