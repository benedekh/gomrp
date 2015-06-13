package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.reconnect;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.impl.DEdgeImpl;
import org.eclipse.sirius.diagram.impl.DNodeImpl;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Reconnects the ConnectionPoint from one TrackElement to another.
 */
public class ReconnectConnectsToSource implements IExternalJavaAction {

	public ReconnectConnectsToSource() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		TrackElement source = (TrackElement) parameters.get("source");
		TrackElement target = (TrackElement) parameters.get("target");

		DEdgeImpl edge = (DEdgeImpl) parameters.get("edge");
		DNodeImpl node = (DNodeImpl) edge.getTargetNode();
		ConnectionPoint cp = (ConnectionPoint) node.getSemanticElements()
				.get(0);

		source.getConnectsTo().remove(cp);
		target.getConnectsTo().add(cp);

	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
