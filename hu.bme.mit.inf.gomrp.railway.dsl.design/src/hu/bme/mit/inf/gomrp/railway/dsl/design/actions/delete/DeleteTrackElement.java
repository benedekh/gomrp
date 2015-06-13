package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.delete;

import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Removes the TrackElement from the model.
 */
public class DeleteTrackElement implements IExternalJavaAction {

	public DeleteTrackElement() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		TrackElement element = (TrackElement) parameters.get("element");
		element.getConnectsTo().clear();

		DSemanticDiagram diagram = (DSemanticDiagram) parameters
				.get("container");
		RailwayDomainModel model = (RailwayDomainModel) diagram.getTarget();

		model.getSections().remove(element);
		model.getTurnouts().remove(element);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
