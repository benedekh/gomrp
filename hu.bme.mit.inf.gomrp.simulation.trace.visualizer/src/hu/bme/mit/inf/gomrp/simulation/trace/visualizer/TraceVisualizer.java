package hu.bme.mit.inf.gomrp.simulation.trace.visualizer;

import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Visualizes a Trace in a JavaFX window.
 */
public class TraceVisualizer extends Application {

	public static void main(String[] args) {
		Application.launch(TraceVisualizer.class, (java.lang.String[]) null);
	}

	public void start(Stage primaryStage) {
		try {
			VBox page = (VBox) FXMLLoader.load(TraceVisualizer.class
					.getResource("TraceVisualizer.fxml"));
			Scene scene = new Scene(page);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Trace Vizualizer");
			primaryStage.show();
		} catch (Exception ex) {
			Logger.getLogger(TraceVisualizer.class.getName()).log(Level.SEVERE,
					null, ex);
		}
	}

}
