package hu.bme.mit.inf.gomrp.statemachine.dsl.text.helper;

import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.Include;
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineBehavioralModel;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * Helper class for connecting the RailwayDomainModel with the Statemachine
 * model.
 */
public class ResourceHandler {
	private static ResourceHandler handler = new ResourceHandler();
	private Map<String, RailwayDomainModel> domains = new HashMap<String, RailwayDomainModel>();

	protected ResourceHandler() {

	}

	public static ResourceHandler getInstance() {
		return handler;
	}

	public Collection<RailwayDomainModel> getDomains() {
		return domains.values();
	}

	public void addDomain(String uri, RailwayDomainModel dom) {
		if (dom != null && uri != null)
			domains.put(uri, dom);
	}

	public void loadAllResources(StateMachineBehavioralModel model) {
		domains = new HashMap<String, RailwayDomainModel>();
		for (Include inc : model.getIncludes()) {
			ResourceSetImpl resourceSet = new ResourceSetImpl();
			URI path = URI.createURI(inc.getFilename());
			Resource resource = resourceSet.getResource(path, true);
			RailwayDomainModel dom = (RailwayDomainModel) resource
					.getContents().get(0);
			domains.put(inc.getFilename(), dom);
		}
	}

	public void refreshIncludes(StateMachineBehavioralModel smbm) {
		boolean find = false;
		for (String uri : domains.keySet()) {
			for (Include include : smbm.getIncludes()) {
				if (include.getFilename().equals(uri)) {
					find = true;
					break;
				}
			}
			if (!find) {
				domains.remove(uri);
			}
			find = false;
		}
	}
}
