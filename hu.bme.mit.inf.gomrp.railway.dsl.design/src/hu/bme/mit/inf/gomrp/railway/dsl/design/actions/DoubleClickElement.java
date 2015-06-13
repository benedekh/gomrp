package hu.bme.mit.inf.gomrp.railway.dsl.design.actions;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RDMElement;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Route;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Section;
import hu.bme.mit.inf.gomrp.railway.RDM.Signal;
import hu.bme.mit.inf.gomrp.railway.RDM.Station;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;
import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal;
import hu.bme.mit.inf.gomrp.railway.dsl.design.Activator;
import hu.bme.mit.inf.gomrp.railway.dsl.design.LatestAmount;
import hu.bme.mit.inf.gomrp.railway.incquery.NamesMustBeUniqueMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.Queries;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Handler class for dobule click events on an element, in the Sirius editor's
 * canvas. Saves the selected object clicked upon, and changes its name, if it
 * was not unique.
 */
public class DoubleClickElement implements IExternalJavaAction {

	private static IncQueryEngine engine = null;

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		EObject selected = (EObject) parameters.get("element");
		Activator.setSelectedObject(selected);

		if (selected instanceof RDMElement) {
			generateID((RDMElement) selected);
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

	private void generateID(RDMElement selected) {
		EObject container = selected.eContainer();
		while (!(container instanceof RailwayDomainModel)) {
			container = container.eContainer();
		}

		RailwayDomainModel model = (RailwayDomainModel) container;
		initializeIncQueryEngine(model);

		if (selected instanceof ConnectionPoint) {
			generateID(selected, "CP",
					LatestAmount.getConnectionPointAmount(model));
		} else if ((selected instanceof Section)
				&& !(selected instanceof Station)) {
			generateID(selected, "Sec", model.getSections().size());
		} else if (selected instanceof Station) {
			generateID(selected, "ST", LatestAmount.getStationAmount(model));
		} else if (selected instanceof Turnout) {
			generateID(selected, "TO", model.getTurnouts().size());
		} else if ((selected instanceof Signal)
				&& !(selected instanceof TurnoutSignal)) {
			generateID(selected, "Sig", LatestAmount.getSignalAmount(model));
		} else if (selected instanceof TurnoutSignal) {
			generateID(selected, "TSig",
					LatestAmount.getTurnoutSignalAmount(model));
		} else if (selected instanceof Train) {
			generateID(selected, "T", LatestAmount.getTrainAmount(model));
		} else if (selected instanceof Route) {
			generateID(selected, "R", LatestAmount.getRouteAmount(model));
		} else if (selected instanceof RouteElement) {
			generateID(selected, "RE",
					LatestAmount.getRouteElementAmount(model));
		} else if (selected instanceof TurnoutDesiredDirection) {
			generateID(selected, "TDD",
					LatestAmount.getTurnoutDesiredDirectionAmount(model));
		}

	}

	private static void generateID(RDMElement element, String prefix, int offset) {
		while (!nameIsUnique(element)) {
			element.setName(prefix + (offset++));
		}
	}

	private static void initializeIncQueryEngine(RailwayDomainModel model) {
		if (engine == null) {
			try {
				engine = IncQueryEngine.on(new EMFScope(model));
				Queries.instance().prepare(engine);
			} catch (IncQueryException e) {

			}
		}
	}

	private static boolean nameIsUnique(RDMElement element) {
		try {
			if (NamesMustBeUniqueMatcher.on(engine).getOneArbitraryMatch(
					element, null, null) == null) {
				return true;
			}
		} catch (IncQueryException e) {

		}
		return false;
	}

}
