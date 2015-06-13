package hu.bme.mit.inf.gomrp.railway.dsl.design.actions.create;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionDirection;
import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMFactory;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Section;
import hu.bme.mit.inf.gomrp.railway.RDM.Signal;
import hu.bme.mit.inf.gomrp.railway.dsl.design.LatestAmount;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Creates a Section with two ConnectionPoints to each ends, and a Signal for
 * each ConnectionPoint.
 */
public class CreateComplexSection implements IExternalJavaAction {

	public CreateComplexSection() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {

		RailwayDomainModel diagram = (RailwayDomainModel) parameters
				.get("container");

		Section section = RDMFactory.eINSTANCE.createSection();
		section.setName("Sec" + (diagram.getSections().size() + 1));

		ConnectionPoint cp1 = RDMFactory.eINSTANCE.createConnectionPoint();
		cp1.setDirection(ConnectionDirection.STRAIGHT);
		cp1.setName("CP" + (LatestAmount.getConnectionPointAmount(diagram) + 1));

		ConnectionPoint cp2 = RDMFactory.eINSTANCE.createConnectionPoint();
		cp2.setDirection(ConnectionDirection.TOP);
		cp2.setName("CP" + (LatestAmount.getConnectionPointAmount(diagram) + 2));

		Signal s1 = RDMFactory.eINSTANCE.createSignal();
		s1.setName("Sig" + (LatestAmount.getSignalAmount(diagram) + 1));
		cp1.setHolds(s1);

		Signal s2 = RDMFactory.eINSTANCE.createSignal();
		s2.setName("Sig" + (LatestAmount.getSignalAmount(diagram) + 2));
		cp2.setHolds(s2);

		section.getConnectsTo().add(cp1);
		section.getConnectsTo().add(cp2);

		diagram.getSections().add(section);
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
