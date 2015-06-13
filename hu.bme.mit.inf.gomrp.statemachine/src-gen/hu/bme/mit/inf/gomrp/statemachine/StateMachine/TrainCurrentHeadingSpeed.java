/**
 */
package hu.bme.mit.inf.gomrp.statemachine.StateMachine;

import hu.bme.mit.inf.gomrp.railway.RDM.Speed;
import hu.bme.mit.inf.gomrp.railway.RDM.Train;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train Current Heading Speed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentHeadingSpeed#getTrain <em>Train</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentHeadingSpeed#getCurrentHeadingSpeed <em>Current Heading Speed</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getTrainCurrentHeadingSpeed()
 * @model
 * @generated
 */
public interface TrainCurrentHeadingSpeed extends GuardExpression {
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
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getTrainCurrentHeadingSpeed_Train()
	 * @model
	 * @generated
	 */
	Train getTrain();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentHeadingSpeed#getTrain <em>Train</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train</em>' reference.
	 * @see #getTrain()
	 * @generated
	 */
	void setTrain(Train value);

	/**
	 * Returns the value of the '<em><b>Current Heading Speed</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.railway.RDM.Speed}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Heading Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Heading Speed</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Speed
	 * @see #setCurrentHeadingSpeed(Speed)
	 * @see hu.bme.mit.inf.gomrp.statemachine.StateMachine.StateMachinePackage#getTrainCurrentHeadingSpeed_CurrentHeadingSpeed()
	 * @model
	 * @generated
	 */
	Speed getCurrentHeadingSpeed();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.statemachine.StateMachine.TrainCurrentHeadingSpeed#getCurrentHeadingSpeed <em>Current Heading Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Heading Speed</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Speed
	 * @see #getCurrentHeadingSpeed()
	 * @generated
	 */
	void setCurrentHeadingSpeed(Speed value);

} // TrainCurrentHeadingSpeed
