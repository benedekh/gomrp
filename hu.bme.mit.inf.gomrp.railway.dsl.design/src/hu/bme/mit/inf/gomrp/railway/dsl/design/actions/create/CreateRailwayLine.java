package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.create;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection;
import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMFactory;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Section;
import hu.bme.mit.inf.gomrp.railway.RDM.Signal;
import hu.bme.mit.inf.gomrp.railway.dsl.design.Activator;
import hu.bme.mit.inf.gomrp.railway.dsl.design.LatestAmount;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Constructs a railway line, starting with either a Section or a
 * ConnectionPoint, and then creating and connecting either a ConnectionPoint or
 * a Section respectively.
 */
public class CreateRailwayLine implements IExternalJavaAction {
	private RailwayDomainModel model;

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		DSemanticDiagram diagram = (DSemanticDiagram) parameters
				.get("containerView");
		model = (RailwayDomainModel) diagram.getTarget();
		EObject selected = Activator.getSelectedObject();
		if (selected instanceof Section) {
			Section sec = (Section) selected;
			newConnectionPoint(sec);
		}
		if (selected instanceof ConnectionPoint) {
			ConnectionPoint cpoint = (ConnectionPoint) selected;
			newSection(cpoint);
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return Activator.getSelectedObject() != null;
	}

	private void newConnectionPoint(Section selected) {
		ConnectionPoint newcp = RDMFactory.eINSTANCE.createConnectionPoint();
		newcp.setDirection(ConnectionDirection.STRAIGHT);
		newcp.setName("CP" + (LatestAmount.getConnectionPointAmount(model) + 1));

		Signal sig = RDMFactory.eINSTANCE.createSignal();
		sig.setName("Sig" + (LatestAmount.getSignalAmount(model) + 1));
		newcp.setHolds(sig);

		selected.getConnectsTo().add(newcp);
		Activator.setSelectedObject(newcp);
	}

	private void newSection(ConnectionPoint selected) {
		Section section = RDMFactory.eINSTANCE.createSection();
		section.setName("Sec" + (model.getSections().size() + 1));

		selected.setNextElement(section);
		Activator.setSelectedObject(section);
		model.getSections().add(section);
	}

}
