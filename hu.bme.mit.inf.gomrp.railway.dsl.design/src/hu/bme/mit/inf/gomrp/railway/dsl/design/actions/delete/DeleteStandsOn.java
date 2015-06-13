package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.delete;

import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DEdge;
import org.eclipse.sirius.diagram.DNode;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Disconnects the Train from the TrackElement.
 */
public class DeleteStandsOn implements IExternalJavaAction {

	public DeleteStandsOn() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		Train source = (Train) parameters.get("source");
		DEdge edge = (DEdge) parameters.get("edge");
		DNode node = (DNode) edge.getTargetNode();
		TrackElement te = (TrackElement) node.getSemanticElements().get(0);
		source.getStandsOn().remove(te);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
