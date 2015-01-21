/**
 */
package asd.util;

import asd.ASDelement;
import asd.ASDiagram;
import asd.ASDlayout;
import asd.ASDmodelElement;
import asd.ASDspec;
import asd.ASNetwork;
import asd.AsdPackage;
import asd.Community;
import asd.DivisionOfLabour;
import asd.MediatedElement;
import asd.MediatingElement;
import asd.Mediation;
import asd.Motivation;
import asd.Outcome;
import asd.Rule;
import asd.Subject;
import asd.Tool;

import core.CORENamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import urncore.IURNDiagram;
import urncore.URNmodelElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see asd.AsdPackage
 * @generated
 */
public class AsdSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AsdPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsdSwitch() {
		if (modelPackage == null) {
			modelPackage = AsdPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AsdPackage.AS_DSPEC: {
				ASDspec asDspec = (ASDspec)theEObject;
				T result = caseASDspec(asDspec);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.AS_DELEMENT: {
				ASDelement asDelement = (ASDelement)theEObject;
				T result = caseASDelement(asDelement);
				if (result == null) result = caseASDmodelElement(asDelement);
				if (result == null) result = caseURNmodelElement(asDelement);
				if (result == null) result = caseCORENamedElement(asDelement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.AS_DIAGRAM: {
				ASDiagram asDiagram = (ASDiagram)theEObject;
				T result = caseASDiagram(asDiagram);
				if (result == null) result = caseASDmodelElement(asDiagram);
				if (result == null) result = caseIURNDiagram(asDiagram);
				if (result == null) result = caseURNmodelElement(asDiagram);
				if (result == null) result = caseCORENamedElement(asDiagram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.MEDIATING_ELEMENT: {
				MediatingElement mediatingElement = (MediatingElement)theEObject;
				T result = caseMediatingElement(mediatingElement);
				if (result == null) result = caseASDelement(mediatingElement);
				if (result == null) result = caseASDmodelElement(mediatingElement);
				if (result == null) result = caseURNmodelElement(mediatingElement);
				if (result == null) result = caseCORENamedElement(mediatingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.MEDIATION: {
				Mediation mediation = (Mediation)theEObject;
				T result = caseMediation(mediation);
				if (result == null) result = caseASDmodelElement(mediation);
				if (result == null) result = caseURNmodelElement(mediation);
				if (result == null) result = caseCORENamedElement(mediation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.MEDIATED_ELEMENT: {
				MediatedElement mediatedElement = (MediatedElement)theEObject;
				T result = caseMediatedElement(mediatedElement);
				if (result == null) result = caseASDelement(mediatedElement);
				if (result == null) result = caseASDmodelElement(mediatedElement);
				if (result == null) result = caseURNmodelElement(mediatedElement);
				if (result == null) result = caseCORENamedElement(mediatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.AS_DMODEL_ELEMENT: {
				ASDmodelElement asDmodelElement = (ASDmodelElement)theEObject;
				T result = caseASDmodelElement(asDmodelElement);
				if (result == null) result = caseURNmodelElement(asDmodelElement);
				if (result == null) result = caseCORENamedElement(asDmodelElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.AS_NETWORK: {
				ASNetwork asNetwork = (ASNetwork)theEObject;
				T result = caseASNetwork(asNetwork);
				if (result == null) result = caseIURNDiagram(asNetwork);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.AS_DLAYOUT: {
				ASDlayout asDlayout = (ASDlayout)theEObject;
				T result = caseASDlayout(asDlayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.TOOL: {
				Tool tool = (Tool)theEObject;
				T result = caseTool(tool);
				if (result == null) result = caseMediatingElement(tool);
				if (result == null) result = caseASDelement(tool);
				if (result == null) result = caseASDmodelElement(tool);
				if (result == null) result = caseURNmodelElement(tool);
				if (result == null) result = caseCORENamedElement(tool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseMediatingElement(rule);
				if (result == null) result = caseASDelement(rule);
				if (result == null) result = caseASDmodelElement(rule);
				if (result == null) result = caseURNmodelElement(rule);
				if (result == null) result = caseCORENamedElement(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.DIVISION_OF_LABOUR: {
				DivisionOfLabour divisionOfLabour = (DivisionOfLabour)theEObject;
				T result = caseDivisionOfLabour(divisionOfLabour);
				if (result == null) result = caseMediatingElement(divisionOfLabour);
				if (result == null) result = caseASDelement(divisionOfLabour);
				if (result == null) result = caseASDmodelElement(divisionOfLabour);
				if (result == null) result = caseURNmodelElement(divisionOfLabour);
				if (result == null) result = caseCORENamedElement(divisionOfLabour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.COMMUNITY: {
				Community community = (Community)theEObject;
				T result = caseCommunity(community);
				if (result == null) result = caseMediatedElement(community);
				if (result == null) result = caseASDelement(community);
				if (result == null) result = caseASDmodelElement(community);
				if (result == null) result = caseURNmodelElement(community);
				if (result == null) result = caseCORENamedElement(community);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.SUBJECT: {
				Subject subject = (Subject)theEObject;
				T result = caseSubject(subject);
				if (result == null) result = caseMediatedElement(subject);
				if (result == null) result = caseASDelement(subject);
				if (result == null) result = caseASDmodelElement(subject);
				if (result == null) result = caseURNmodelElement(subject);
				if (result == null) result = caseCORENamedElement(subject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.OBJECT: {
				asd.Object object = (asd.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = caseMediatedElement(object);
				if (result == null) result = caseASDelement(object);
				if (result == null) result = caseASDmodelElement(object);
				if (result == null) result = caseURNmodelElement(object);
				if (result == null) result = caseCORENamedElement(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.MOTIVATION: {
				Motivation motivation = (Motivation)theEObject;
				T result = caseMotivation(motivation);
				if (result == null) result = caseASDelement(motivation);
				if (result == null) result = caseASDmodelElement(motivation);
				if (result == null) result = caseURNmodelElement(motivation);
				if (result == null) result = caseCORENamedElement(motivation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AsdPackage.OUTCOME: {
				Outcome outcome = (Outcome)theEObject;
				T result = caseOutcome(outcome);
				if (result == null) result = caseASDelement(outcome);
				if (result == null) result = caseASDmodelElement(outcome);
				if (result == null) result = caseURNmodelElement(outcome);
				if (result == null) result = caseCORENamedElement(outcome);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AS Dspec</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AS Dspec</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASDspec(ASDspec object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AS Delement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AS Delement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASDelement(ASDelement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AS Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AS Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASDiagram(ASDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mediating Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mediating Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediatingElement(MediatingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mediation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mediation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediation(Mediation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mediated Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mediated Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediatedElement(MediatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AS Dmodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AS Dmodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASDmodelElement(ASDmodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AS Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AS Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASNetwork(ASNetwork object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AS Dlayout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AS Dlayout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASDlayout(ASDlayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTool(Tool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Division Of Labour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Division Of Labour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivisionOfLabour(DivisionOfLabour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Community</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Community</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunity(Community object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubject(Subject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(asd.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Motivation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Motivation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMotivation(Motivation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outcome</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outcome</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutcome(Outcome object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CORE Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CORE Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCORENamedElement(CORENamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UR Nmodel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UR Nmodel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseURNmodelElement(URNmodelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IURN Diagram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IURN Diagram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIURNDiagram(IURNDiagram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AsdSwitch
