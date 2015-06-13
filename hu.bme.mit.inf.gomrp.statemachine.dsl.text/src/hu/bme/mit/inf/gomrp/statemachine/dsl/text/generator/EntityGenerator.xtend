package hu.bme.mit.inf.gomrp.statemachine.dsl.text.generator

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.Resource
import hu.bme.mit.inf.gomrp.railway.RDM.RDMElement

/**
 * Helper class to generate a Java class for a DESMO-J Entity.
 */
class EntityGenerator {

	String entitiesPackageName
	Resource resource

	new(Resource res, String packagename) {
		resource = res
		entitiesPackageName = packagename
	}

	def create(RDMElement object) {
		CodeGeneratorHelper.createJavaFile(resource, entitiesPackageName, object.eClass.name,
			createEntityFromEClass(entitiesPackageName, object.eClass))
	}

	def createEntityFromEClass(String entitiesPackageName, EClass eclass) '''
		package «entitiesPackageName»;
		
		import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
		import hu.bme.mit.inf.gomrp.simulation.auto.core.RailwaySimulationModel;
		
		import org.eclipse.emf.common.util.EList;
		
		import desmoj.core.simulator.Entity;
		import desmoj.core.simulator.Model;
		
		public class «eclass.name.toFirstUpper» extends «getAncestor(eclass.name.toFirstUpper)» {
			private «eclass.instanceTypeName» _«eclass.name.toFirstLower»;
			
			«IF eclass.name == 'Signal'»
				protected RailwaySimulationModel model;
			«ENDIF»
			
			public «eclass.name.toFirstUpper»(Model owner, String name, boolean showInTrace, «eclass.instanceTypeName» obj) {
				«getSuper(eclass.name.toFirstUpper)»
				this._«eclass.name.toFirstLower» = obj;
				«IF eclass.name == 'Signal'»
					this.model = (RailwaySimulationModel)owner;
			«ENDIF»
			}
		
			«FOR attr : eclass.EAllAttributes» 
			public «attr.EAttributeType.instanceClassName» get«attr.name.toFirstUpper»() {
				return _«eclass.name.toFirstLower».get«attr.name.toFirstUpper»();
			}
			public void set«attr.name.toFirstUpper»(«attr.EAttributeType.instanceClassName» value) {
				_«eclass.name.toFirstLower».set«attr.name.toFirstUpper»(value);
			}
			«ENDFOR»
			«FOR ref : eclass.EAllReferences» 
			«IF ref.upperBound > 1»
				public EList<«ref.EReferenceType.instanceTypeName»> get«ref.name.toFirstUpper»() {
					return _«eclass.name.toFirstLower».get«ref.name.toFirstUpper»();
				}
			«ELSE»
				public «ref.EReferenceType.instanceTypeName» get«ref.name.toFirstUpper»() {
					return _«eclass.name.toFirstLower».get«ref.name.toFirstUpper»();
				}
			«ENDIF»
			
			«IF ref.changeable == true && ref.EOpposite == null && ref.containment == false»
				«IF ref.upperBound > 1»
					public void set«ref.name.toFirstUpper»(EList<«ref.EReferenceType.instanceTypeName»> value) {
						_«eclass.name.toFirstLower».set«ref.name.toFirstUpper»(value);
					}
				«ELSE»
					public void set«ref.name.toFirstUpper»(«ref.EReferenceType.instanceClassName» value) {
						_«eclass.name.toFirstLower».set«ref.name.toFirstUpper»(value);
					}
				«ENDIF»
			«ENDIF»
		   	«ENDFOR»
		   	«IF eclass.name == 'Train'»
			«amendTrain»
		   	«ELSEIF eclass.name == 'Turnout'»
			«amendTurnout»
		   	«ELSEIF eclass.name == 'TurnoutSignal'»
			«amendTurnoutSignal(eclass)»
		   	«ELSEIF eclass.name == 'Signal'»
			«amendSignal(eclass)»
		   	«ENDIF»
		
			public void addToTraceEntry() {
				TraceBuilderHelper.addRDMElementToLastEntry(_«eclass.name.toFirstLower»);
			}
		}
	'''

	def amendTrain() '''
		public boolean isStandingOn(hu.bme.mit.inf.gomrp.railway.RDM.TrackElement trackElement) {
			return getStandsOn().contains(trackElement);
		}
		
		private hu.bme.mit.inf.gomrp.railway.RDM.RouteElement lastRouteElement;
		
		public hu.bme.mit.inf.gomrp.railway.RDM.RouteElement getLastRouteElement() {
			return lastRouteElement;
		}
		
		public void setLastRouteElement(hu.bme.mit.inf.gomrp.railway.RDM.RouteElement lastRouteElement) {
			this.lastRouteElement = lastRouteElement;
		}
		
	'''

	def amendTurnout() '''
		public String getActiveStateName() {
			return (getSwitchingDirection() == getCurrentDirection()) ? "DIVERGENT" : "STRAIGHT";
		}
		public void changeTurnoutDirection(boolean pred) {
			if (pred) {
				setCurrentDirection(hu.bme.mit.inf.gomrp.railway.RDM.TurnoutDirection.STRAIGHT);
				} else {
					setCurrentDirection(getSwitchingDirection());
				}
		}
	'''

	def amendSignal(EClass eclass) '''
		
		public boolean isHeadingAllowed(Train train) {
			hu.bme.mit.inf.gomrp.railway.RDM.TrackElement trackElement = this._«eclass.name.toFirstLower».getObserves();
			return isHeadingAllowed(trackElement != null,
					trackElementFreeOrOccupiedByTrain(trackElement, train), this._«eclass.name.toFirstLower»);
		}
		
		public final boolean refersToTheSame(
				hu.bme.mit.inf.gomrp.railway.RDM.Signal signal) {
			return this._«eclass.name.toFirstLower» == signal;
		}
		
		protected final boolean trackElementFreeOrOccupiedByTrain(
				hu.bme.mit.inf.gomrp.railway.RDM.TrackElement trackElement, Train train) {
			return trackElement.getOccupiedBy() == null
					|| train.isStandingOn(trackElement);
		}
		
		protected final boolean isHeadingAllowed(boolean firstCondition,
				boolean secondCondition,
				hu.bme.mit.inf.gomrp.railway.RDM.Signal signal) {
			if (firstCondition) {
				if (secondCondition) {
					hu.bme.mit.inf.gomrp.railway.RDM.Speed nextSpeed;
					switch (model.drawSignalAllowedSpeed()) {
					case 1:
						nextSpeed = hu.bme.mit.inf.gomrp.railway.RDM.Speed.TWENTY;
						break;
					case 2:
						nextSpeed = hu.bme.mit.inf.gomrp.railway.RDM.Speed.FOURTY;
						break;
					case 3:
						nextSpeed = hu.bme.mit.inf.gomrp.railway.RDM.Speed.SIXTY;
						break;
					default:
						nextSpeed = hu.bme.mit.inf.gomrp.railway.RDM.Speed.ZERO;
					}
					signal.setAllowedSpeed(nextSpeed);
					return true;
				}
			}
			signal.setAllowedSpeed(hu.bme.mit.inf.gomrp.railway.RDM.Speed.ZERO);
			return false;
		}
	'''

	def amendTurnoutSignal(EClass eclass) '''
		public boolean isHeadingAllowed(Train train) {
		
			hu.bme.mit.inf.gomrp.railway.RDM.Turnout turnout = this._«eclass.name.toFirstLower».getTurnout();
		
			return isHeadingAllowed(
				turnout != null,
				trackElementFreeOrOccupiedByTrain(turnout, train)
						&& (turnout.getCurrentDirection() == train
								.getLastRouteElement().getNextElement()
								.getDesiredDirection().getDesiredDirection()),
				_«eclass.name.toFirstLower»);
		}
	'''

	def createTrackElement() {
		CodeGeneratorHelper.createJavaFile(resource, entitiesPackageName, "TrackElement", generateTrackElement)
	}

	def generateTrackElement() '''
		package «entitiesPackageName»;
		
		import org.eclipse.emf.common.util.EList;
		import desmoj.core.simulator.Entity;
		import desmoj.core.simulator.Model;
		
		import hu.bme.mit.inf.gomrp.simulation.trace.helper.TraceBuilderHelper;
		
		public abstract class TrackElement extends Entity {
			private hu.bme.mit.inf.gomrp.railway.RDM.TrackElement trackElement;
		
			public TrackElement(Model owner, String name, boolean showInTrace,
				hu.bme.mit.inf.gomrp.railway.RDM.TrackElement trackElement) {
				super(owner, name, showInTrace);
				this.trackElement = trackElement;
			}
		
			public boolean isOccupied() {
				return getOccupiedBy() != null;
			}
		
			public boolean refersToTheSame(
					hu.bme.mit.inf.gomrp.railway.RDM.TrackElement trackElement) {
				return this.trackElement == trackElement;
			}
		
			public hu.bme.mit.inf.gomrp.railway.RDM.Train getOccupiedBy() {
				return trackElement.getOccupiedBy();
			}
		
			public int getLength() {
				return trackElement.getLength();
			}
		
			public EList<hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint> getConnectsTo() {
				return trackElement.getConnectsTo();
			}
		
			public void setOccupiedBy(hu.bme.mit.inf.gomrp.railway.RDM.Train train) {
				trackElement.setOccupiedBy(train);
			}
			
			public void addToTraceEntry() {
				TraceBuilderHelper.addRDMElementToLastEntry(trackElement);
			}
		}
	'''

	def getAncestor(String name) {
		if (#["Turnout", "Station", "Section"].contains(name)) {
			return "TrackElement"
		} else if (name == "TurnoutSignal") {
			return "Signal"
		} else
			return "Entity"
	}

	def getSuper(String name) {
		if (#["Turnout", "Station", "Section", "TurnoutSignal"].contains(name))
			return "super(owner, name, showInTrace, obj);"
		else
			return "super(owner, name, showInTrace);"
	}
}
