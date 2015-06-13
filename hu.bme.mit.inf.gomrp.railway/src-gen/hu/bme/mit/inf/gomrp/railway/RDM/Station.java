/**
 */
package hu.bme.mit.inf.gomrp.railway.RDM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Station</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.inf.gomrp.railway.RDM.Station#getControls <em>Controls</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getStation()
 * @model
 * @generated
 */
public interface Station extends Section {
	/**
	 * Returns the value of the '<em><b>Controls</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.mit.inf.gomrp.railway.RDM.Signal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controls</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controls</em>' reference list.
	 * @see hu.bme.mit.inf.gomrp.railway.RDM.RDMPackage#getStation_Controls()
	 * @model required="true" upper="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="org.eclipse.incquery.querybasedfeature patternFQN='hu.bme.mit.inf.gomrp.railway.incquery.controls'"
	 * @generated
	 */
	EList<Signal> getControls();

} // Station
