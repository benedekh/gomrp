package hu.bme.mit.inf.gomrp.simulation.trace.visualizer.controller;

import hu.bme.mit.inf.gomrp.railway.RDM.RDMElement;
import hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.MRPTracePackage;
import hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Trace;
import hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.util.Pair;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

/**
 * Controller for the TraceVisualizer.
 */
public class TraceVisualizerController implements Initializable {

	public Map<ImageView, Pair<Integer, Integer>> elements = new HashMap<ImageView, Pair<Integer, Integer>>();
	public Timer timer = null;
	FileChooser fileChooser = new FileChooser();
	@FXML
	// fx:id="gridLayout"
	private GridPane gridLayout;

	@FXML
	// fx:id="openTraceModel"
	private MenuItem openTraceModel;

	@FXML
	// fx:id="treeViewer"
	private TreeView<String> treeViewer;

	@FXML
	// fx:id="traceModel"
	private TreeItem<String> traceModel;

	@FXML
	// fx:id="quitItem"
	private MenuItem quitItem;

	@FXML
	// fx:id="stepButton"
	private Button stepButton;

	@FXML
	// fx:id="runButton"
	private ToggleButton runButton;

	@FXML
	// fx:id="slider"
	private Slider slider;

	@FXML
	// fx:id="rightPane"
	private AnchorPane rightPane;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert openTraceModel != null : "fx:id=\"openTraceModel\" was not injected: check your FXML file 'TraceVizualizer.fxml'.";
		assert treeViewer != null : "fx:id=\"treeViewer\" was not injected: check your FXML file 'TraceVizualizer.fxml'.";
		assert traceModel != null : "fx:id=\"traceModel\" was not injected: check your FXML file 'TraceVizualizer.fxml'.";
		assert quitItem != null : "fx:id=\"quitItem\" was not injected: check your FXML file 'TraceVizualizer.fxml'.";
		assert stepButton != null : "fx:id=\"stepButton\" was not injected: check your FXML file 'TraceVizualizer.fxml'.";
		assert runButton != null : "fx:id=\"stepButton\" was not injected: check your FXML file 'TraceVizualizer.fxml'.";
		assert slider != null : "fx:id=\"slider\" was not injected: check your FXML file 'TraceVizualizer.fxml'.";
		assert rightPane != null : "fx:id=\"rightPane\" was not injected: check your FXML file 'TraceVizualizer.fxml'.";

		openTraceModel.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				fileChooser.setTitle("Open TraceModel");
				File file = fileChooser.showOpenDialog(null);

				MRPTracePackage.eINSTANCE.eClass();
				Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
				Map<String, Object> m = reg.getExtensionToFactoryMap();
				m.put("mrptrace", new XMIResourceFactoryImpl());

				// Obtain a new resource set
				ResourceSet resSet = new ResourceSetImpl();

				// Get the resource
				Resource resource = resSet.getResource(
						URI.createFileURI(file.getAbsolutePath()), true);

				fileChooser.setInitialDirectory(file.getParentFile());
				Trace trace = (Trace) resource.getContents().get(1);
				traceModel.setExpanded(true);
				traceModel.setValue(trace.getName() + " (Granurality: "
						+ trace.getGranularity() + ")");
				trace.getConsistsOf().forEach(
						(entry) -> traceModel.getChildren().add(
								addTraceEntry(entry)));
				treeViewer.setRoot(traceModel);
				populateModel();
			}
		});

		quitItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				Platform.exit();
			}
		});

		stepButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				treeViewer.getSelectionModel().clearAndSelect(
						treeViewer.getSelectionModel().getSelectedIndex() + 1);
				step();
			}
		});

		runButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				if (runButton.isSelected()) {
					TimerTask timerTask = new TimerTask() {
						@Override
						public void run() {
							treeViewer.getSelectionModel().clearAndSelect(
									treeViewer.getSelectionModel()
											.getSelectedIndex() + 1);
							step();
						}
					};
					timer = new Timer();
					timer.scheduleAtFixedRate(timerTask, 100,
							(long) (1500 - slider.getValue() * 100));
				} else {
					timer.cancel();
				}
			}
		});

		treeViewer.setOnMouseClicked(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (!traceModel.getChildren().isEmpty())
					step();
			}
		});

		treeViewer.setOnKeyPressed(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				if (!traceModel.getChildren().isEmpty())
					step();
			}
		});
	}

	private TreeItem<String> addTraceEntry(TraceEntry entry) {
		TreeItem<String> childItem = new TreeItem<String>(entry
				.getDescription().toString());
		entry.getAffectedRDMElements().forEach(
				(element) -> childItem.getChildren().add(
						addRDMElementEntry(element)));
		childItem.getChildren().add(
				new TreeItem<String>("At time: " + entry.getCause().getTime()));
		return childItem;
	}

	private TreeItem<String> addRDMElementEntry(RDMElement element) {
		TreeItem<String> childItem = new TreeItem<String>("RDMElement: "
				+ element.getName());
		childItem.getChildren().add(
				new TreeItem<String>("Length: " + element.getLength()));
		return childItem;
	}

	@SuppressWarnings("static-access")
	private void populateModel() {
		for (Node item : gridLayout.getChildren()) {
			elements.put((ImageView) item,
					new Pair<Integer, Integer>(gridLayout.getRowIndex(item),
							gridLayout.getColumnIndex(item)));
		}
	}

	private ImageView getElement(String string) {
		String name = string.split(" ")[1];
		for (Node item : gridLayout.getChildren()) {
			if (item.getId().contentEquals(name))
				return ((ImageView) item);
		}
		return null;
	}

	@SuppressWarnings("static-access")
	private void step() {
		if (treeViewer.getSelectionModel().getSelectedItem().getValue()
				.startsWith("Train")
				&& treeViewer.getSelectionModel().getSelectedItem()
						.getChildren().size() > 1) {
			TreeItem<String> sourceItem = treeViewer.getSelectionModel()
					.getSelectedItem().getChildren().get(0);
			TreeItem<String> targetItem = treeViewer.getSelectionModel()
					.getSelectedItem().getChildren().get(1);

			ImageView source = getElement(sourceItem.getValue());
			ImageView target = getElement(targetItem.getValue());
			if (source != null && target != null) {
				elements.put(source, elements.get(target));
				gridLayout.setRowIndex(source, elements.get(source).getKey());
				gridLayout.setColumnIndex(source, elements.get(source)
						.getValue());
			}
		}
	}

}
