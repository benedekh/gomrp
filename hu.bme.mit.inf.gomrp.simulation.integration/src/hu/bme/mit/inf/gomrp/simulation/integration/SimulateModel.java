package hu.bme.mit.inf.gomrp.simulation.integration;

import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.railway.incquery.AdjacentRouteElementsMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.ElementWithoutNameMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.NamesMustBeUniqueMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.Queries;
import hu.bme.mit.inf.gomrp.railway.incquery.ReversedRouteElementsMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.RouteElementNotSameLengthAsTrackElementMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.RouteFirstElementMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.RouteNotContainingArrivalOrDepartureStationMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.SectionConnectsToMultiplicityMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TrackElementsMustBeLongerThanTrainsMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TrackNotClosedMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TrainNotOnTrackElementMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TrainOnAtMostTwoTrackElementsMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TrainWithoutArrivalOrDepartureStationMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TrainWithoutRouteMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TrainsOnSameTrackElementMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TurnoutConnectsToMultiplicityMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TurnoutCurrentDirectionMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TurnoutDesiredDirectionMatcher;
import hu.bme.mit.inf.gomrp.railway.incquery.TurnoutSwitchingDirectionMatcher;
import hu.bme.mit.inf.gomrp.simulation.demo.RailwaySimulationModel;
import hu.bme.mit.inf.gomrp.simulation.demo.SimulationRunner;
import hu.bme.mit.inf.gomrp.simulation.demo.helpers.RSMFactory;
import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
import hu.bme.mit.inf.gomrp.simulation.trace.visualizer.TraceVisualizer;

import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.IncQueryMatcher;
import org.eclipse.incquery.runtime.emf.EMFScope;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Integration with Eclipse: the right-click event handler on a
 * RailwayDomainModel model in the Project Explorer. Loads the selected model,
 * and runs the simulation in DESMO-J.
 */
public class SimulateModel extends AbstractHandler {

	private static TimeUnit sGranularity = null;
	private static long duration;
	private static TimeUnit dGranularity = null;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection sel = HandlerUtil.getActiveMenuSelection(event);
		try {
			if (sel instanceof IStructuredSelection) {
				IStructuredSelection selection = (IStructuredSelection) sel;
				if (selection.getFirstElement() != null) {
					if (selection.getFirstElement() instanceof IFile) {
						IFile file = (IFile) selection.getFirstElement();
						ResourceSet resSet = new ResourceSetImpl();
						URI fileURI = URI.createPlatformResourceURI(file
								.getFullPath().toString(), true);
						Resource resource = resSet.getResource(fileURI, true);
						if (resource.getContents() != null) {
							if (resource.getContents().get(0) instanceof RailwayDomainModel) {

								if (sGranularity == null
										|| dGranularity == null) {
									throw new Exception(
											"Set the Simulation Settings at Show View/MRP Simulation/Simulation Settings.");
								}

								RailwayDomainModel rdm = (RailwayDomainModel) resource
										.getContents().get(0);
								validateResource(resource);

								Job job = new Job("Simulate RDM Model") {
									@Override
									protected IStatus run(
											IProgressMonitor monitor) {

										RailwaySimulationModel model = RSMFactory
												.createRSMFromRDM(rdm);

										if (model == null) {
											return Status.CANCEL_STATUS;
										}

										TimeUnit ccSGranularity = sGranularity;
										TimeUnit ccDGranularity = dGranularity;
										long ccDuration = duration;

										SimulationRunner.simulateModel(model,
												ccDuration, ccDGranularity);

										TraceBuilderHelper
												.keepRelevantTraceEntries(
														ccSGranularity,
														ccDuration,
														ccDGranularity);

										saveToNewResource(resource
												.getContents().get(0),
												file.getFullPath());

										TraceBuilderHelper
												.saveTraceWithRDMToResource(
														file, rdm);
										return Status.OK_STATUS;
									}
								};
								job.setUser(true);
								job.schedule();
								UIManager.setLookAndFeel(UIManager
										.getSystemLookAndFeelClassName());
								int result = JOptionPane
										.showConfirmDialog(
												null,
												"Simulation finished. Do you want to start TraceVisualizer for more details?",
												"DesmoJ Simulation",
												JOptionPane.YES_NO_OPTION);
								if (result == JOptionPane.OK_OPTION) {
									Job job2 = new Job("Simulate RDM Model") {
										@Override
										protected IStatus run(
												IProgressMonitor monitor) {
											TraceVisualizer traceVisualizer = new TraceVisualizer();
											traceVisualizer.main(null);
											return Status.OK_STATUS;
										}
									};
									job2.setUser(true);
									job2.schedule();
								}
							} else {
								showErrorMessage("The selected element isn't the instance of "
										+ RailwayDomainModel.class
												.getCanonicalName()
										+ "\n(Got: "
										+ resource.getContents().get(0)
												.getClass().getCanonicalName()
										+ ")");
							}
						}
					}
				}
			}
		} catch (Exception e) {
			showErrorMessage(e.getMessage());
		}
		return null;
	}

	public static void setSimulationGranularity(TimeUnit simulationGranularity) {
		SimulateModel.sGranularity = simulationGranularity;
	}

	public static void setSimulationDuration(long simulationDuration) {
		SimulateModel.duration = simulationDuration;
	}

	public static void setDurationGranularity(TimeUnit durationGranularity) {
		SimulateModel.dGranularity = durationGranularity;
	}

	private void validateResource(Resource resource) throws Exception {
		if (resource.getErrors().size() != 0
				|| resource.getWarnings().size() != 0
				|| Diagnostician.INSTANCE.validate(
						resource.getContents().get(0)).getSeverity() != Diagnostic.OK) {
			throw new Exception("The input RailwayDomainModel is invalid.");
		}

		IncQueryEngine engine = IncQueryEngine.on(new EMFScope(resource
				.getContents().get(0)));
		Queries.instance().prepare(engine);

		ElementWithoutNameMatcher.on(engine);
		NamesMustBeUniqueMatcher.on(engine);
		TrackNotClosedMatcher.on(engine);
		TrainNotOnTrackElementMatcher.on(engine);
		TrainOnAtMostTwoTrackElementsMatcher.on(engine);
		TrainsOnSameTrackElementMatcher.on(engine);
		TurnoutSwitchingDirectionMatcher.on(engine);
		TurnoutCurrentDirectionMatcher.on(engine);
		TurnoutDesiredDirectionMatcher.on(engine);
		AdjacentRouteElementsMatcher.on(engine);
		RouteNotContainingArrivalOrDepartureStationMatcher.on(engine);
		TrainWithoutRouteMatcher.on(engine);
		TrainWithoutArrivalOrDepartureStationMatcher.on(engine);
		TrackElementsMustBeLongerThanTrainsMatcher.on(engine);
		SectionConnectsToMultiplicityMatcher.on(engine);
		TurnoutConnectsToMultiplicityMatcher.on(engine);
		ReversedRouteElementsMatcher.on(engine);
		RouteFirstElementMatcher.on(engine);
		RouteElementNotSameLengthAsTrackElementMatcher.on(engine);

		for (IncQueryMatcher<? extends IPatternMatch> incQueryMatcher : engine
				.getCurrentMatchers()) {
			if (incQueryMatcher.countMatches() > 0) {
				throw new Exception("The input RailwayDomainModel is invalid.");
			}
		}
	}

	private void saveToNewResource(EObject model, IPath fullPath) {
		try {
			ResourceSet newResSet = new ResourceSetImpl();
			Resource newResource = newResSet.createResource(URI
					.createPlatformResourceURI(createNewFilePath(fullPath),
							true));
			newResource.getContents().add(model);
			newResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			showErrorMessage(e.getMessage());
		}
	}

	private String createNewFilePath(IPath fullPath) {
		String lastSegment = fullPath.lastSegment();
		return fullPath.removeLastSegments(1) + String.valueOf(IPath.SEPARATOR)
				+ lastSegment.substring(0, lastSegment.indexOf(".rdm"))
				+ "_simulated." + fullPath.getFileExtension();
	}

	private void showErrorMessage(String errorMessage) {
		new MessageDialog(null, "Error during Model Simulation", null,
				errorMessage, MessageDialog.ERROR, new String[] { "Ok" }, 0)
				.open();
	}
}
