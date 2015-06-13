package hu.bme.mit.inf.gomrp.simulation.traceability

import hu.bme.mit.inf.gomrp.simulation.traceability.MRPTraceability.MRPTraceabilityFactory
import java.io.IOException
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.jface.dialogs.MessageDialog

/**
 * Stores the recent Traceability model.
 */
class TraceabilityHelper {

	private var traceabilityModel = MRPTraceabilityFactory.eINSTANCE.createTraceabilityModel;
	private static val instance = new TraceabilityHelper

	private new() {
	}

	def static getInstance() {
		instance
	}

	def createSourceElement() {
		val element = MRPTraceabilityFactory.eINSTANCE.createSourceElement
		traceabilityModel.sources.add(element)
		element
	}

	def createReferredTypedElement() {
		val element = MRPTraceabilityFactory.eINSTANCE.createReferredTypedElement
		traceabilityModel.types.add(element)
		element
	}

	def createTargetPackage() {
		val element = MRPTraceabilityFactory.eINSTANCE.createTargetPackage
		traceabilityModel.targets.add(element)
		element
	}

	def createTargetClass() {
		val element = MRPTraceabilityFactory.eINSTANCE.createTargetClass
		traceabilityModel.targets.add(element)
		element
	}

	def createTargetInterace() {
		val element = MRPTraceabilityFactory.eINSTANCE.createTargetInterface
		traceabilityModel.targets.add(element)
		element
	}

	def createTargetField() {
		val element = MRPTraceabilityFactory.eINSTANCE.createTargetField
		traceabilityModel.targets.add(element)
		element
	}

	def createTargetMethod() {
		val element = MRPTraceabilityFactory.eINSTANCE.createTargetMethod
		traceabilityModel.targets.add(element)
		element
	}

	def createTargetParameter() {
		val element = MRPTraceabilityFactory.eINSTANCE.createTargetParameter
		traceabilityModel.targets.add(element)
		element
	}

	/**
	 * Helper methods for persisting the model.
	 */
	def saveModelIntoResourceSet(ResourceSet rs, String filePath) {
		registerExtension("mrptraceability")
		val resource = rs.createResource(URI.createPlatformResourceURI(filePath, true))
		resource.contents.add(traceabilityModel)
		try {
			resource.save(Collections.EMPTY_MAP)
		} catch (IOException e) {
			new MessageDialog(null, "Error during persisting the Traceability Model.", null, e.message,
				MessageDialog.ERROR,
				{
					#["Ok"]
				}, 0).open();
		}
	}

	private def registerExtension(String fileExtension) {

		// Register the XMI resource factory for the .<fileExtension> extension
		val reg = Resource.Factory.Registry.INSTANCE;
		val m = reg.getExtensionToFactoryMap();
		m.put(fileExtension, new XMIResourceFactoryImpl());
	}

}
