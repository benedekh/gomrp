package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.delete;

import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Route;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Removes the Route from the model.
 */
public class DeleteRoute implements IExternalJavaAction {

	public DeleteRoute() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		Route route = (Route) parameters.get("element");

		DSemanticDiagram diagram = (DSemanticDiagram) parameters
				.get("container");
		RailwayDomainModel model = (RailwayDomainModel) diagram.getTarget();

		if (model.getEditorRoute().remove(route)) {
			return;
		}
		for (Train train : model.getTrains()) {
			if (train.getFollows() == route) {
				train.setFollows(null);
				return;
			}
		}

	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
