/*
* generated by Xtext
*/
package hu.bme.mit.inf.gomrp.railway.dsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class RDMTextDSLStandaloneSetup extends RDMTextDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new RDMTextDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

