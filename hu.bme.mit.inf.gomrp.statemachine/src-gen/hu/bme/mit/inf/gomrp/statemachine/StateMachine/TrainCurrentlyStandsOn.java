/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine;

import hu.bme.mit.inf.gomrp.railway.RDM.TrackElement;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train Currently Stands On</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentlyStandsOn#getTrain <em>Train</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentlyStandsOn#getTrackElements <em>Track Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getTrainCurrentlyStandsOn()
 * @model
 * @generated
 */
public interface TrainCurrentlyStandsOn extends GuardExpression {
	/**
	 * Returns the value of the '<em><b>Train</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Train</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Train</em>' reference.
	 * @see #setTrain(Train)
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getTrainCurrentlyStandsOn_Train()
	 * @model
	 * @generated
	 */
	Train getTrain();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentlyStandsOn#getTrain <em>Train</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train</em>' reference.
	 * @see #getTrain()
	 * @generated
	 */
	void setTrain(Train value);

	/**
	 * Returns the value of the '<em><b>Track Elements</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.TrackElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Track Elements</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Track Elements</em>' reference list.
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getTrainCurrentlyStandsOn_TrackElements()
	 * @model upper="2"
	 * @generated
	 */
	EList<TrackElement> getTrackElements();

} // TrainCurrentlyStandsOn
