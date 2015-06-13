/*
 * generated by Xtext
 */
package hu.bme.mit.inf.gomrp.statemachine.dsl.text.scoping

import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachine
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.emf.ecore.EReference
import hu.bme.mit.inf.gomrp.railway.RDM.RailwayDomainModel
import hu.bme.mit.inf.gomrp.railway.RDM.RDMElement
import java.util.List
import hu.bme.mit.inf.gomrp.statemachine.dsl.text.helper.ResourceHandler
import java.util.Collection

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
class StateMachineDSLScopeProvider extends AbstractDeclarativeScopeProvider {
		
	def getRDMElements(Collection<RailwayDomainModel> domains) {
		val List<RDMElement> list = newArrayList 
		for (rdm : domains) {
			val items = rdm.eAllContents().filter[x | x instanceof RDMElement].toList
			for (i : items) {
				list.add(i as RDMElement)
			}
		}
		return list
	} 
	
	def scope_StateMachine_referredObject(StateMachine ctx, EReference ref) {
		var domains = ResourceHandler.getInstance.domains
    	Scopes::scopeFor(getRDMElements(domains))
    }
}
