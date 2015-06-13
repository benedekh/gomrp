package hu.bme.mit.inf.gomrp.railway.dsl.design.actions;

import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.RDM.Route;
import hu.bme.mit.inf.gomrp.railway.RDM.RouteElement;
import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.railway.incquery.Queries;
import hu.bme.mit.inf.gomrp.railway.incquery.RouteElementMatch;
import hu.bme.mit.inf.gomrp.railway.incquery.RouteElementMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.RouteWithRouteElementMatch;
import hu.bme.mit.inf.gomrp.railway.incquery.RouteWithRouteElementMatcher;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.api.IMatchUpdateListener;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

/**
 * Enables the RouteElements and Routes to inherit its referred TrackElements,
 * and RouteElements (respectively) length. The length is always inherited, if
 * the referred object changes (through EMF Notification).
 */
public class TrackElementLengthInheriter implements IExternalJavaAction {

	private List<RouteElement> observedRouteElements = new ArrayList<RouteElement>();
	private Map<Route, List<RouteElement>> observedRoutes = new HashMap<Route, List<RouteElement>>();

	private static AdvancedIncQueryEngine engine;

	private final class RouteElementListener implements
			IMatchUpdateListener<RouteElementMatch> {

		@Override
		public void notifyAppearance(RouteElementMatch match) {
			try {
				final RouteElement element = match.getElement();
				boolean found = false;
				for (RouteElement re : observedRouteElements) {
					if (EcoreUtil.equals(re, element)) {
						found = true;
						break;
					}
				}
				if (!found) {
					observedRouteElements.add(element);
					if (element.getReferredElement() != null) {
						element.setLength(element.getReferredElement()
								.getLength());
					}
					element.eAdapters().add(new EContentAdapter() {

						@Override
						public void notifyChanged(Notification notification) {
							try {
								super.notifyChanged(notification);
								if (notification.getFeature() instanceof EAttribute) {
									EAttribute attribute = (EAttribute) notification
											.getFeature();
									if (!"length".equals(attribute.getName())) {
										TrackElement referredElement = element
												.getReferredElement();
										if (referredElement != null) {
											element.setLength(referredElement
													.getLength());
										}
									}
								}
							} catch (Exception e) {

							}
						}
					});
				}
			} catch (Exception e) {

			}
		}

		@Override
		public void notifyDisappearance(RouteElementMatch match) {
			try {
				observedRouteElements.remove(match.getElement());
			} catch (Exception e) {

			}
		}
	}

	private final class RouteWithRouteElementListener implements
			IMatchUpdateListener<RouteWithRouteElementMatch> {

		@Override
		public void notifyAppearance(RouteWithRouteElementMatch match) {
			try {
				final Route route = match.getRoute();
				RouteElement routeElement = match.getRouteElement();

				if (!observedRoutes.containsKey(route)) {
					observedRoutes.put(route, new ArrayList<RouteElement>());
					route.setLength(0);
					route.eAdapters().add(new EContentAdapter() {

						@Override
						public void notifyChanged(Notification notification) {
							try {
								Object notifier = notification.getNotifier();
								if (notifier instanceof RouteElement) {
									route.setLength(0);
									for (RouteElement element : observedRoutes
											.get(route)) {
										route.setLength(route.getLength()
												+ element.getLength());
									}
								}
								super.notifyChanged(notification);
							} catch (Exception e) {

							}
						}
					});
				}
				observedRoutes.get(route).add(routeElement);
				route.setLength(route.getLength() + routeElement.getLength());
			} catch (Exception e) {

			}
		}

		@Override
		public void notifyDisappearance(RouteWithRouteElementMatch match) {
			try {
				Route route = match.getRoute();
				RouteElement routeElement = match.getRouteElement();
				route.setLength(route.getLength() - routeElement.getLength());
				observedRoutes.get(route).remove(routeElement);
			} catch (Exception e) {

			}
		}

	}

	public TrackElementLengthInheriter() {

	}

	@Override
	public void execute(Collection<? extends EObject> selections,
			Map<String, Object> parameters) {
		RailwayDomainModel model = (RailwayDomainModel) ((DSemanticDiagram) parameters
				.get("param")).getTarget();
		if (engine == null) {
			try {
				engine = (AdvancedIncQueryEngine) AdvancedIncQueryEngine
						.on(new EMFScope(model));
				Queries.instance().prepare(engine);

				engine.addMatchUpdateListener(RouteElementMatcher.on(engine),
						new RouteElementListener(), true);
				engine.addMatchUpdateListener(
						RouteWithRouteElementMatcher.on(engine),
						new RouteWithRouteElementListener(), true);
			} catch (IncQueryException e) {

			}
		}
	}

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		return true;
	}

}
