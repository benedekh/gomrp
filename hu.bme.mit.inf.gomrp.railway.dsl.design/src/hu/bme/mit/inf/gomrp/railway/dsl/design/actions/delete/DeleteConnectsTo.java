package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.delete;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Disconnects the ConnectionPoint from the TrackElement.
 */
public class DeleteConnectsTo implements IExternalJavaAction {

	public DeleteConnectsTo() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		TrackElement source = (TrackElement) parameters.get("source");
		DEdge edge = (DEdge) parameters.get("edge");
		DNode node = (DNode) edge.getTargetNode();
		ConnectionPoint cp = (ConnectionPoint) node.getSemanticElements()
				.get(0);
		source.getConnectsTo().remove(cp);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
