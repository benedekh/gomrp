/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.TrackElement#getConnectsTo <em>Connects To</em>}</li>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.TrackElement#getOccupiedBy <em>Occupied By</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTrackElement()
 * @model abstract="true"
 * @generated
 */
public interface TrackElement extends RDMElement {
	/**
	 * Returns the value of the '<em><b>Connects To</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.ConnectionPoint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connects To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connects To</em>' containment reference list.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTrackElement_ConnectsTo()
	 * @model containment="true" required="true" upper="3"
	 * @generated
	 */
	EList<ConnectionPoint> getConnectsTo();

	/**
	 * Returns the value of the '<em><b>Occupied By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.mit.inf.gomrp.railway.RDM.Train#getStandsOn <em>Stands On</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occupied By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occupied By</em>' reference.
	 * @see #setOccupiedBy(Train)
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getTrackElement_OccupiedBy()
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.Train#getStandsOn
	 * @model opposite="standsOn" ordered="false"
	 * @generated
	 */
	Train getOccupiedBy();

	/**
	 * Sets the value of the '{@link hu.bme.mit.inf.gomrp.railway.RDM.TrackElement#getOccupiedBy <em>Occupied By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occupied By</em>' reference.
	 * @see #getOccupiedBy()
	 * @generated
	 */
	void setOccupiedBy(Train value);

} // TrackElement
