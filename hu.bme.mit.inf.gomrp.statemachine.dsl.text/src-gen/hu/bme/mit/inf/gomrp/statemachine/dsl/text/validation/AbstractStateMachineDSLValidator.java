/*
 * generated by Xtext
 */
package hu.bme.mit.inf.gomrp.statemachine.dsl.text.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractStateMachineDSLValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineDSLPackage.eINSTANCE);
	    result.add(EPackage.Registry.INSTANCE.getEPackage("hu.bme.mit.inf.gomrp.statemachine"));
		return result;
	}
}
