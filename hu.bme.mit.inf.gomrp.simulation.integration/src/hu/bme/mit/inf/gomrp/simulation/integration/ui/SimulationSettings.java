package hu.bme.mit.inf.gomrp.simulation.integration.ui;

import hu.bme.mit.inf.gomrp.simulation.integration.SimulateModel;

import java.util.concurrent.TimeUnit;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.part.ViewPart;

/**
 * Simple Settings View for the DESMO-J simulation.
 */
public class SimulationSettings extends ViewPart {

	private static int sGranularityDefault;
	private static int dGranularityDefault;
	private static String txtDurationDefault = new String();

	@Override
	public void createPartControl(Composite parent) {
		Group grpSettings = new Group(parent, SWT.NONE);
		grpSettings.setText("Settings");
		grpSettings.setLayout(new GridLayout(2, false));

		Label lblGranularity = new Label(grpSettings, SWT.NONE);
		lblGranularity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblGranularity.setText("Simulation granularity");

		String granularities[] = { "Nanoseconds", "Microseconds",
				"Milliseconds", "Seconds", "Minutes", "Hours", "Days" };

		Combo sGranularity = new Combo(grpSettings, SWT.NONE);
		sGranularity.setItems(granularities);
		sGranularity.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		sGranularity.select(sGranularityDefault);

		Label lblDuration = new Label(grpSettings, SWT.NONE);
		lblDuration.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		lblDuration.setText("Simulation duration");

		Text txtDuration = new Text(grpSettings, SWT.BORDER);
		txtDuration.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		txtDuration.setText(txtDurationDefault);

		Label lblDGranularity = new Label(grpSettings, SWT.NONE);
		lblDGranularity.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER,
				false, false, 1, 1));
		lblDGranularity.setText("Duration granularity");

		Combo dGranularity = new Combo(grpSettings, SWT.NONE);
		dGranularity.setItems(granularities);
		dGranularity.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		dGranularity.select(dGranularityDefault);

		Button buttonSave = new Button(grpSettings, SWT.PUSH);
		buttonSave.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false,
				false, 0, 0));
		buttonSave.setText("Save");
		buttonSave.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent event) {
				try {
					long duration = Long
							.parseLong(txtDuration.getText().trim());
					TimeUnit sGranularityTU = getTimeUnit(sGranularity
							.getItem(sGranularity.getSelectionIndex()));
					TimeUnit dGranularityTU = getTimeUnit(dGranularity
							.getItem(dGranularity.getSelectionIndex()));

					SimulateModel.setSimulationGranularity(sGranularityTU);
					SimulateModel.setSimulationDuration(duration);
					SimulateModel.setDurationGranularity(dGranularityTU);

					sGranularityDefault = sGranularity.getSelectionIndex();
					dGranularityDefault = dGranularity.getSelectionIndex();
					txtDurationDefault = txtDuration.getText();

					new MessageDialog(null, "Simulation Settings", null,
							"Settings saved.", MessageDialog.OK,
							new String[] { "Ok" }, 0).open();

				} catch (NumberFormatException e) {
					new MessageDialog(
							null,
							"Error saving Simulation Settings",
							null,
							"Only integers can be entered in the Simulation duration field!",
							MessageDialog.ERROR, new String[] { "Ok" }, 0)
							.open();
				} catch (IllegalArgumentException e) {
					new MessageDialog(null, "Error saving Simulation Settings",
							null, "Both granularities should be selected!",
							MessageDialog.ERROR, new String[] { "Ok" }, 0)
							.open();
				}
			}

			public void widgetDefaultSelected(SelectionEvent event) {

			}

			private TimeUnit getTimeUnit(String unit) {
				switch (unit) {
				case "Nanoseconds":
					return TimeUnit.NANOSECONDS;
				case "Microseconds":
					return TimeUnit.MICROSECONDS;
				case "Milliseconds":
					return TimeUnit.MILLISECONDS;
				case "Seconds":
					return TimeUnit.SECONDS;
				case "Minutes":
					return TimeUnit.MINUTES;
				case "Hours":
					return TimeUnit.HOURS;
				case "Days":
					return TimeUnit.DAYS;
				default:
					return null;
				}
			}
		});
	}

	@Override
	public void setFocus() {

	}

}
