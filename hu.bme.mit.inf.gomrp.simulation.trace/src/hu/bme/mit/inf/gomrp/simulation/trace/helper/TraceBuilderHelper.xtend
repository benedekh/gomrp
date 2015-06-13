package hu.bme.mit.inf.gomrp.simulation.trace.helper

import hu.bme.mit.inf.gomrp.railway.RDM.RDMElement
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel
import hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.MRPTraceFactory
import hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.Trace
import hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TraceEntry
import java.util.ArrayList
import java.util.Collections
import java.util.concurrent.TimeUnit
import org.eclipse.core.resources.IFile
import org.eclipse.core.runtime.IPath
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil

/**
 * Stores the recent (DESMO-J) simulation Trace, and the latest TraceEntry stored in the Trace.
 */
class TraceBuilderHelper {

	private static Trace trace
	private static TraceEntry lastEntry

	static def void initializeTrace(String name, hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit granularity) {
		trace = MRPTraceFactory.eINSTANCE.createTrace
		trace.name = name
		trace.granularity = granularity
	}

	static def void addRDMElementToLastEntry(RDMElement element) {
		lastEntry.affectedRDMElements.add(element)
	}

	static def void createNewTraceEntry(String description, long time) {
		var newEntry = MRPTraceFactory.eINSTANCE.createTraceEntry
		newEntry.description = description
		var cause = MRPTraceFactory.eINSTANCE.createEvent
		cause.name = description
		cause.time = time

		newEntry.cause = cause
		trace.consistsOf.add(newEntry)
		if (lastEntry != null) {
			lastEntry.nextEntry = newEntry
		}
		lastEntry = newEntry
	}

	static def void keepRelevantTraceEntries(TimeUnit sGranularity, long duration, TimeUnit dGranularity) {
		if (sGranularity != TimeUnit.SECONDS) {
			var nTrace = MRPTraceFactory.eINSTANCE.createTrace
			nTrace.name = trace.name
			nTrace.granularity = convertTU(sGranularity)

			val simulationTimePoints = generateTimePoints(sGranularity, duration, dGranularity)
			if (trace.consistsOf.size > 0) {
				var entry = trace.consistsOf.get(0)
				var lastNTraceEntry = MRPTraceFactory.eINSTANCE.createTraceEntry
				while (entry != null) {
					if (simulationTimePoints.contains(entry.cause.time)) {
						var nTraceEntry = MRPTraceFactory.eINSTANCE.createTraceEntry
						nTraceEntry.description = entry.description
						nTraceEntry.cause = entry.cause

						for (element : entry.affectedRDMElements) {
							nTraceEntry.affectedRDMElements.add(new EcoreUtil.Copier().copy(element) as RDMElement)
						}

						switch (sGranularity) {
							case NANOSECONDS:
								nTraceEntry.cause.time = nTraceEntry.cause.time *
									Math.round(Math.pow(1000.0, 3.0))
							case MICROSECONDS:
								nTraceEntry.cause.time = nTraceEntry.cause.time *
									Math.round(Math.pow(1000.0, 2.0))
							case MILLISECONDS:
								nTraceEntry.cause.time = nTraceEntry.cause.time *
									Math.round(Math.pow(1000.0, 1.0))
							case MINUTES:
								nTraceEntry.cause.time = Math.round(nTraceEntry.cause.time / Math.pow(60.0, 1.0))
							case HOURS:
								nTraceEntry.cause.time = Math.round(nTraceEntry.cause.time / Math.pow(60.0, 2.0))
							case DAYS:
								nTraceEntry.cause.time = Math.round(nTraceEntry.cause.time / (Math.pow(60.0, 2.0) * 24))
							default: {
							}
						}

						nTrace.consistsOf.add(nTraceEntry)
						if (nTrace.consistsOf.size > 1) {
							lastNTraceEntry.nextEntry = nTraceEntry
						}
						lastNTraceEntry = nTraceEntry
					}
					entry = entry.nextEntry
				}
			}
			trace = nTrace
		}
	}

	static def saveTraceWithRDMToResource(IFile file, RailwayDomainModel model) {
		val lastSegment = file.fullPath.lastSegment();
		val newResSet = new ResourceSetImpl
		val newResource = newResSet.createResource(
			URI.createPlatformResourceURI(
				file.fullPath.removeLastSegments(1) + String.valueOf(IPath.SEPARATOR) +
					lastSegment.substring(0, lastSegment.indexOf(".rdm")) + "_trace.mrptrace".toString, true))
		newResource.contents.add(model)
		newResource.contents.add(trace)
		newResource.save(Collections.EMPTY_MAP)
	}

	private static def convertTU(TimeUnit granularity) {
		switch (granularity) {
			case NANOSECONDS: return hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit.NANOSECONDS
			case MICROSECONDS: return hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit.MICROSECONDS
			case MILLISECONDS: return hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit.MILLISECONDS
			case SECONDS: return hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit.SECONDS
			case MINUTES: return hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit.MINUTES
			case HOURS: return hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit.HOURS
			case DAYS: return hu.bme.mit.inf.gomrp.simulation.trace.MRPTrace.TimeUnit.DAYS
		}
	}

	private static def generateTimePoints(TimeUnit sGranularity, long duration, TimeUnit dGranularity) {
		val durationInSeconds = durationInSeconds(duration, dGranularity)
		var timePoints = new ArrayList<Long>()
		switch (sGranularity) {
			case NANOSECONDS:
				for (var i = 0; i <= durationInSeconds; i += 1) {
					timePoints.add(Long.valueOf(i))
				}
			case MICROSECONDS:
				for (var i = 0; i <= durationInSeconds; i += 1) {
					timePoints.add(Long.valueOf(i))
				}
			case MILLISECONDS:
				for (var i = 0; i <= durationInSeconds; i += 1) {
					timePoints.add(Long.valueOf(i))
				}
			case SECONDS:
				for (var i = 0; i <= durationInSeconds; i += 1) {
					timePoints.add(Long.valueOf(i))
				}
			case MINUTES:
				for (var i = 0; i <= durationInSeconds; i += 60) {
					timePoints.add(Long.valueOf(i))
				}
			case HOURS:
				for (var i = 0; i <= durationInSeconds; i += 3600) {
					timePoints.add(Long.valueOf(i))
				}
			case DAYS:
				for (var i = 0; i <= durationInSeconds; i += 86400) {
					timePoints.add(Long.valueOf(i))
				}
		}
		return timePoints
	}

	private static def durationInSeconds(long duration, TimeUnit dGranularity) {
		switch (dGranularity) {
			case NANOSECONDS: Math.round(duration / Math.pow(1000.0, 3.0))
			case MICROSECONDS: Math.round(duration / Math.pow(1000.0, 2.0))
			case MILLISECONDS: Math.round(duration / Math.pow(1000.0, 1.0))
			case SECONDS: return duration
			case MINUTES: Math.round(duration * Math.pow(60.0, 1.0))
			case HOURS: Math.round(duration * Math.pow(60.0, 2.0))
			case DAYS: Math.round(duration * (Math.pow(60.0, 2.0) * 24))
			default: 0
		}
	}

}
