package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.delete;

import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Removes the Train from the model.
 */
public class DeleteTrain implements IExternalJavaAction {

	public DeleteTrain() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		Train train = (Train) parameters.get("element");
		train.setFollows(null);

		DSemanticDiagram diagram = (DSemanticDiagram) parameters
				.get("container");
		RailwayDomainModel model = (RailwayDomainModel) diagram.getTarget();

		model.getTrains().remove(train);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
