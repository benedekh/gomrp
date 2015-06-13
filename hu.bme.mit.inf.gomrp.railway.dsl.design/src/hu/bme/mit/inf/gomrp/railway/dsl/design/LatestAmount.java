package hu.bme.mit.inf.gomrp.railway.dsl.design;

import hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint;
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Route;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Section;
import hu.bme.mit.inf.gomrp.railway.RDM.Station;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;
import hu.bme.mit.inf.gomrp.railway.RDM.Turnout;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDesiredDirection;
import hu.bme.mit.inf.gomrp.railway.RDM.TurnoutSignal;

/**
 * Helper class for calculating the amount of objects from each type.
 */
public final class LatestAmount {

	public static int getStationAmount(RailwayDomainModel diagram) {
		int amount = 0;
		for (Section section : diagram.getSections()) {
			if (section instanceof Station) {
				amount += 1;
			}
		}
		return amount;
	}

	public static int getSignalAmount(RailwayDomainModel diagram) {
		int amount = 0;

		for (Section section : diagram.getSections()) {
			for (ConnectionPoint cp : section.getConnectsTo()) {
				if (cp.getHolds() != null) {
					amount += 1;
				}
			}
		}

		for (Turnout turnout : diagram.getTurnouts()) {
			for (ConnectionPoint cp : turnout.getConnectsTo()) {
				if (cp.getHolds() != null) {
					amount += 1;
				}
			}
		}

		return amount;
	}

	public static int getTurnoutSignalAmount(RailwayDomainModel diagram) {
		int amount = 0;

		for (Section section : diagram.getSections()) {
			for (ConnectionPoint cp : section.getConnectsTo()) {
				if (cp.getHolds() instanceof TurnoutSignal) {
					amount += 1;
				}
			}
		}
		for (Turnout turnout : diagram.getTurnouts()) {
			for (ConnectionPoint cp : turnout.getConnectsTo()) {
				if (cp.getHolds() instanceof TurnoutSignal) {
					amount += 1;
				}
			}
		}

		return amount;
	}

	public static int getRouteElementAmount(RailwayDomainModel diagram) {
		int amount = 0;

		for (Train train : diagram.getTrains()) {
			if (train.getFollows() != null) {
				amount = calculateRouteElementAmount(amount, train.getFollows()
						.getFirstElement());
			}
		}

		for (Route route : diagram.getEditorRoute()) {
			if (route.getFirstElement() != null) {
				if (route.getFirstElement().getNextElement() != null) {
					amount = calculateRouteElementAmount(amount,
							route.getFirstElement());
				}
			}
		}

		for (RouteElement re : diagram.getEditorRouteElement()) {
			amount = calculateRouteElementAmount(amount, re);
		}

		return amount;
	}

	public static int getTurnoutDesiredDirectionAmount(
			RailwayDomainModel diagram) {
		int amount = 0;

		for (Train train : diagram.getTrains()) {
			if (train.getFollows() != null) {
				if (train.getFollows().getFirstElement() != null) {
					if (train.getFollows().getFirstElement().getNextElement() != null) {
						amount = calculateTurnoutDesiredDirectionAmount(amount,
								train.getFollows().getFirstElement());
					}
				}
			}
		}

		for (Route route : diagram.getEditorRoute()) {
			if (route.getFirstElement() != null) {
				if (route.getFirstElement().getNextElement() != null) {
					amount = calculateTurnoutDesiredDirectionAmount(amount,
							route.getFirstElement());
				}
			}
		}

		for (RouteElement re : diagram.getEditorRouteElement()) {
			amount = calculateTurnoutDesiredDirectionAmount(amount, re);
		}

		for (@SuppressWarnings("unused")
		TurnoutDesiredDirection tdd : diagram.getEditorTDD()) {
			amount += 1;
		}

		return amount;
	}

	public static int getRouteAmount(RailwayDomainModel diagram) {
		int amount = 0;

		for (Train train : diagram.getTrains()) {
			if (train.getFollows() != null) {
				amount += 1;
			}
		}

		for (@SuppressWarnings("unused")
		Route route : diagram.getEditorRoute()) {
			amount += 1;
		}

		return amount;
	}

	public static int getTrainAmount(RailwayDomainModel diagram) {
		int amount = 0;

		for (@SuppressWarnings("unused")
		Train train : diagram.getTrains()) {
			amount += 1;
		}

		return amount;
	}

	public static int getConnectionPointAmount(RailwayDomainModel diagram) {
		int amount = 0;

		for (Section section : diagram.getSections()) {
			if (section.getConnectsTo() != null) {
				amount += section.getConnectsTo().size();
			}
		}
		for (Turnout turnout : diagram.getTurnouts()) {
			if (turnout.getConnectsTo() != null) {
				amount += turnout.getConnectsTo().size();
			}
		}
		for (@SuppressWarnings("unused")
		ConnectionPoint cp : diagram.getEditorCP()) {
			amount += 1;
		}

		return amount;
	}

	private static int calculateRouteElementAmount(int amount, RouteElement re) {
		RouteElement e = re;
		while (e != null) {
			amount += 1;
			e = e.getNextElement();
		}
		return amount;
	}

	private static int calculateTurnoutDesiredDirectionAmount(int amount,
			RouteElement re) {
		RouteElement e = re;
		while (e != null) {
			if (e.getDesiredDirection() != null) {
				amount += 1;
			}
			e = e.getNextElement();
		}
		return amount;
	}
}
