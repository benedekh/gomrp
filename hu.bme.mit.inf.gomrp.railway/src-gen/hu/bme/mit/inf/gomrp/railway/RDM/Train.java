/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getHeadingSpeed <em>Heading Speed</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getMaxSpeed <em>Max Speed</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getArrivesTo <em>Arrives To</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getDeparturesFrom <em>Departures From</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getFollows <em>Follows</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getStandsOn <em>Stands On</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTrain()
 * @model
 * @generated
 */
public interface Train extends RDMElement {
	/**
	 * Returns the value of the '<em><b>Heading Speed</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.railway.RDM.Speed}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heading Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading Speed</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Speed
	 * @see #setHeadingSpeed(Speed)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTrain_HeadingSpeed()
	 * @model required="true"
	 * @generated
	 */
	Speed getHeadingSpeed();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getHeadingSpeed <em>Heading Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading Speed</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Speed
	 * @see #getHeadingSpeed()
	 * @generated
	 */
	void setHeadingSpeed(Speed value);

	/**
	 * Returns the value of the '<em><b>Max Speed</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.mit.inf.gomrp.railway.RDM.Speed}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Speed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Speed</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Speed
	 * @see #setMaxSpeed(Speed)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTrain_MaxSpeed()
	 * @model required="true"
	 * @generated
	 */
	Speed getMaxSpeed();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getMaxSpeed <em>Max Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Speed</em>' attribute.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Speed
	 * @see #getMaxSpeed()
	 * @generated
	 */
	void setMaxSpeed(Speed value);

	/**
	 * Returns the value of the '<em><b>Arrives To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arrives To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arrives To</em>' reference.
	 * @see #setArrivesTo(Station)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTrain_ArrivesTo()
	 * @model required="true"
	 * @generated
	 */
	Station getArrivesTo();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getArrivesTo <em>Arrives To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arrives To</em>' reference.
	 * @see #getArrivesTo()
	 * @generated
	 */
	void setArrivesTo(Station value);

	/**
	 * Returns the value of the '<em><b>Departures From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Departures From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Departures From</em>' reference.
	 * @see #setDeparturesFrom(Station)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTrain_DeparturesFrom()
	 * @model required="true"
	 * @generated
	 */
	Station getDeparturesFrom();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getDeparturesFrom <em>Departures From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Departures From</em>' reference.
	 * @see #getDeparturesFrom()
	 * @generated
	 */
	void setDeparturesFrom(Station value);

	/**
	 * Returns the value of the '<em><b>Follows</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Follows</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Follows</em>' containment reference.
	 * @see #setFollows(Route)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTrain_Follows()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Route getFollows();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getFollows <em>Follows</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Follows</em>' containment reference.
	 * @see #getFollows()
	 * @generated
	 */
	void setFollows(Route value);

	/**
	 * Returns the value of the '<em><b>Stands On</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.TrackElement}.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.gomrp.railway.RDM.TrackElement#getOccupiedBy <em>Occupied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stands On</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stands On</em>' reference list.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTrain_StandsOn()
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.TrackElement#getOccupiedBy
	 * @model opposite="occupiedBy" required="true" upper="2"
	 * @generated
	 */
	EList<TrackElement> getStandsOn();

} // Train
