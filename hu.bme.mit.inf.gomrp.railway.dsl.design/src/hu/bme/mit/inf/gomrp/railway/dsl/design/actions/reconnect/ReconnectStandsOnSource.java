package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.reconnect;

import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.impl.DEdgeImpl;
import org.eclipse.sirius.diagram.impl.DNodeImpl;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Reconnects the TrackElement from a Train to another.
 */
public class ReconnectStandsOnSource implements IExternalJavaAction {

	public ReconnectStandsOnSource() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		Train source = (Train) parameters.get("source");
		Train target = (Train) parameters.get("target");

		DEdgeImpl edge = (DEdgeImpl) parameters.get("edge");
		DNodeImpl node = (DNodeImpl) edge.getTargetNode();
		TrackElement te = (TrackElement) node.getSemanticElements().get(0);

		source.getStandsOn().remove(te);
		target.getStandsOn().add(te);

	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
