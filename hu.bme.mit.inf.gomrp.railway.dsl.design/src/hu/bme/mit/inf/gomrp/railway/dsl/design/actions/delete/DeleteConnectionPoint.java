package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.delete;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Section;
import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Removes the ConnectionPoint.
 */
public class DeleteConnectionPoint implements IExternalJavaAction {

	public DeleteConnectionPoint() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		ConnectionPoint cp = (ConnectionPoint) parameters.get("element");
		cp.setHolds(null);

		DSemanticDiagram diagram = (DSemanticDiagram) parameters
				.get("container");
		RailwayDomainModel model = (RailwayDomainModel) diagram.getTarget();

		if (model.getEditorCP().remove(cp)) {
			return;
		}
		for (Section section : model.getSections()) {
			if (section.getConnectsTo().remove(cp)) {
				return;
			}
		}
		for (Turnout turnout : model.getTurnouts()) {
			if (turnout.getConnectsTo().remove(cp)) {
				return;
			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
