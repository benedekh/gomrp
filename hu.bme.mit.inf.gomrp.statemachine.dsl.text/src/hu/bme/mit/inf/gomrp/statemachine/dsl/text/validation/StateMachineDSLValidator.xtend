/*
 * generated by Xtext
 */
package hu.bme.mit.inf.gomrp.statemachine.dsl.text.validation

import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.StateMachineBehavioralModel
import org.eclipse.xtext.validation.Check
import java.util.HashSet
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel
import org.eclipse.emf.common.util.URI
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.stateMachineDSL.Include
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.helper.ResourceHandler

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class StateMachineDSLValidator extends AbstractStateMachineDSLValidator {

	public static val NOT_UNIQUE = "NAME_NOT_UNIQUE"

	@Check
	def checkStateMachineReferredObjectIsUnique(StateMachineBehavioralModel model) {
		val smSet = model.statemachines.toSet
		val refObjSet = new HashSet
		refObjSet.clear
		for (sm : model.statemachines) {
			refObjSet.add(sm.referredObject)
		}
		if (smSet.size != refObjSet.size) {
			error("Multiple state machines refer to same RDM Element",
				StateMachinePackage.Literals.STATE_MACHINE_BEHAVIORAL_MODEL__STATEMACHINES, NOT_UNIQUE)
			return
		}
	}
	
	public static val MULTIPLE_ACTIVE = "MULTIPLE_ACTIVE"
	
	@Check
	def checkIfOnlyOneStateIsActive(StateMachine sm) {
		if (sm.states.filter[x | x.isIsActive].size > 1) {
			error("State machine can have only one active state at a time!", sm.states.findLast[x | x.isIsActive], StateMachinePackage.Literals.STATE__IS_ACTIVE, MULTIPLE_ACTIVE)
			return
		} 	
	}
	
	
	public static val MULTIPLE_INITIAL = "MULTIPLE_INITIAL"
	
	@Check
	def checkIfOnlyOneStateIsInitial(StateMachine sm) {
		if (sm.states.filter[x | x.isIsInitial].size > 1) {
			error("State machine can have only one initial state!", sm.states.findLast[x | x.isIsInitial], StateMachinePackage.Literals.STATE__IS_ACTIVE, MULTIPLE_INITIAL)
			return
		} 	
	}
	
	public static val INVALID_INCLUDE = "INVALID_INCLUDE"
	
	@Check
	def checkIncludeIsValid(Include include) {
		try {
			if (include.filename != null) {
				ResourceHandler.getInstance.refreshIncludes(include.eContainer() as StateMachineBehavioralModel)
				val resourceSet = new ResourceSetImpl
				val path = URI.createURI(include.filename)
				val resource = resourceSet.getResource(path, true)
    			val domain = resource.contents.get(0) as RailwayDomainModel
    			ResourceHandler.getInstance.addDomain(include.filename, domain);
    		}
    	} catch (Exception e) {
    		error(e.message, include.eContainer(), include.eContainingFeature, INVALID_INCLUDE)
    	} 
	}
}
